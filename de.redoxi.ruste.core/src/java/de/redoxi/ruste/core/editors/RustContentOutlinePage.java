/*
 * Copyright 2013 Hayden Smith
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under 
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package de.redoxi.ruste.core.editors;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import de.redoxi.ruste.core.Plugin;
import de.redoxi.ruste.core.model.ast.ASTNode;
import de.redoxi.ruste.core.model.ast.Arg;
import de.redoxi.ruste.core.model.ast.Crate;
import de.redoxi.ruste.core.model.ast.EnumVariant;
import de.redoxi.ruste.core.model.ast.Enumeration;
import de.redoxi.ruste.core.model.ast.Function;
import de.redoxi.ruste.core.model.ast.Identifiable;
import de.redoxi.ruste.core.model.ast.Implementation;
import de.redoxi.ruste.core.model.ast.ImplementationMethod;
import de.redoxi.ruste.core.model.ast.Item;
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.NamedArg;
import de.redoxi.ruste.core.model.ast.SelfArg;
import de.redoxi.ruste.core.model.ast.Structure;
import de.redoxi.ruste.core.model.ast.Trait;
import de.redoxi.ruste.core.model.ast.TraitMethod;
import de.redoxi.ruste.core.model.ast.Visible;
import de.redoxi.ruste.core.parser.IRustParser;
import de.redoxi.ruste.core.parser.NativeParser;
import de.redoxi.ruste.core.ui.ASTIcon;

/**
 * Parses a Rust source file to provide an overview of the source file in the
 * Outline view
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class RustContentOutlinePage extends ContentOutlinePage {

    private IDocumentProvider documentProvider;
    private ITextEditor editor;
    private IEditorInput input;
    
    private ImageRegistry imageRegistry;

    public RustContentOutlinePage(IDocumentProvider documentProvider,
	    ITextEditor editor) {
	super();
	this.documentProvider = documentProvider;
	this.editor = editor;
	this.imageRegistry = Plugin.getInstance().getImageRegistry();
    }

    @Override
    public void createControl(Composite parent) {

	super.createControl(parent);

	TreeViewer viewer = getTreeViewer();
	viewer.setLabelProvider(new LabelProvider());
	viewer.setContentProvider(new ContentProvider());
	viewer.addSelectionChangedListener(this);

	if (input != null)
	    viewer.setInput(input);
    }

    @Override
    public void selectionChanged(SelectionChangedEvent event) {
	super.selectionChanged(event);

	final IStructuredSelection selection = (IStructuredSelection) event
		.getSelection();
	final ASTNode selectedItem = (ASTNode) selection.getFirstElement();

	if (selectedItem == null) {
	    return;
	}

	IDocument document = documentProvider.getDocument(input);

	editor.resetHighlightRange();

	try {
	    int offset = document
		    .getLineOffset(selectedItem.getStartLine() - 1)
		    + selectedItem.getStartPos();
	    int length = document.getLineOffset(selectedItem.getEndLine() - 1)
		    + selectedItem.getEndPos() - offset;

	    editor.setHighlightRange(offset, length, true);
	} catch (BadLocationException ex) {

	}
    }

    /**
     * Sets the input of the outline page
     * 
     * @param input
     *            the input of this outline page
     */
    public void setInput(IEditorInput input) {
	this.input = input;
	update();
    }

    /**
     * Updates the outline page.
     */
    public void update() {
	TreeViewer viewer = getTreeViewer();

	if (viewer != null) {
	    Control control = viewer.getControl();
	    if (control != null && !control.isDisposed()) {
		control.setRedraw(false);
		viewer.setInput(input);
		viewer.expandAll();
		control.setRedraw(true);
	    }
	}
    }

    /**
     * Styles nodes in the Rust outline
     */
    class LabelProvider extends StyledCellLabelProvider {

	@Override
	public void update(ViewerCell cell) {
	    ASTNode item = (ASTNode) cell.getElement();

	    Image icon = null;

	    StyledString label = new StyledString();

	    // Default icon based on visibility
	    if (item instanceof Visible) {
		switch (((Visible) item).getVisibility()) {
		case PRIVATE:
		    icon = imageRegistry.get(ASTIcon.PRIVATE.getId());
		default:
		    icon = imageRegistry.get(ASTIcon.PUBLIC.getId());
		}
	    }
	    
	    if (item instanceof Identifiable
		    && ((Identifiable) item).getIdentifier() != null
		    && !((Identifiable) item).getIdentifier().isEmpty()) {
		label.append(((Identifiable) item).getIdentifier());
	    }

	    if (item instanceof Crate) {
		icon = imageRegistry.get(ASTIcon.CRATE.getId());
	    } else if (item instanceof Module) {
		icon = imageRegistry.get(ASTIcon.MODULE.getId());
	    } else if (item instanceof Function) {
		label.append(" (");
		appendArgsToLabel((Function) item, label);
		label.append(") ");
		appendReturnTypeToLabel((Function) item, label);
	    } else if (item instanceof Structure) {
		icon = imageRegistry.get(ASTIcon.STRUCT.getId());
	    } else if (item instanceof Enumeration) {
		icon = imageRegistry.get(ASTIcon.ENUM.getId());
	    } /*
	       * else if (item instanceof Static) { icon = STATIC_ICON;
	       * label.append(" : ", StyledString.DECORATIONS_STYLER);
	       * label.append(((Static) item).getType(),
	       * StyledString.DECORATIONS_STYLER); }
	       */
	    else if (item instanceof Trait) {
		icon = imageRegistry.get(ASTIcon.TRAIT.getId());
	    } else if (item instanceof Implementation) {
		icon = imageRegistry.get(ASTIcon.IMPL.getId());
	    } else if (item instanceof EnumVariant) {
		icon = imageRegistry.get(ASTIcon.ENUM_VARIANT.getId());
	    } else if (item instanceof TraitMethod) {
		label.append(" (");
		appendMethodArgsToLabel((TraitMethod) item, label);
		label.append(") ");
		appendReturnTypeToLabel((TraitMethod) item, label);
	    } else if (item instanceof ImplementationMethod) {
		label.append(" (");
		appendMethodArgsToLabel((ImplementationMethod) item, label);
		label.append(") ");
		appendReturnTypeToLabel((ImplementationMethod) item, label);
	    }

	    cell.setText(label.toString());

	    if (icon != null) {
		cell.setImage(icon);
	    }

	    super.update(cell);
	}

	protected void appendArgsToLabel(Function fn, StyledString label) {
	    for (int i = 0; i < fn.getArgs().size(); ++i) {
		final NamedArg arg = fn.getArgs().get(i);
		final String name = arg.getIdentifier();
		final String type = arg.getType();

		label.append(name);
		label.append(" : ");
		label.append(type);

		if (i < fn.getArgs().size() - 1) {
		    label.append(", ");
		}
	    }
	}

	protected void appendMethodArgsToLabel(TraitMethod method,
		StyledString label) {
	    for (int i = 0; i < method.getArgs().size(); ++i) {
		final Arg arg = method.getArgs().get(i);

		if (arg instanceof SelfArg) {
		    label.append(arg.getType());
		} else {

		    final String name = ((NamedArg) arg).getIdentifier();
		    final String type = arg.getType();

		    label.append(name);
		    label.append(" : ");
		    label.append(type);
		}
		if (i < method.getArgs().size() - 1) {
		    label.append(", ");
		}
	    }
	}

	protected void appendMethodArgsToLabel(ImplementationMethod method,
		StyledString label) {
	    for (int i = 0; i < method.getArgumentNames().size(); ++i) {
		final String name = method.getArgumentNames().get(i);
		final String type = method.getArgumentTypes().get(i);

		label.append(name);
		label.append(" : ");
		label.append(type);

		if (i < method.getArgumentNames().size() - 1) {
		    label.append(", ");
		}
	    }
	}

	protected void appendReturnTypeToLabel(Function fn, StyledString label) {
	    if (fn.getReturnType() != null) {
		label.append(" -> ", StyledString.DECORATIONS_STYLER);
		label.append(fn.getReturnType(),
			StyledString.DECORATIONS_STYLER);
	    }
	}

	protected void appendReturnTypeToLabel(TraitMethod fn,
		StyledString label) {
	    if (fn.getReturnType() != null) {
		label.append(" -> ", StyledString.DECORATIONS_STYLER);
		label.append(fn.getReturnType(),
			StyledString.DECORATIONS_STYLER);
	    }
	}

	protected void appendReturnTypeToLabel(ImplementationMethod fn,
		StyledString label) {
	    if (fn.getReturnType() != null) {
		label.append(" -> ", StyledString.DECORATIONS_STYLER);
		label.append(fn.getReturnType(),
			StyledString.DECORATIONS_STYLER);
	    }
	}
    }

    /**
     * Provide nodes for the parse tree of the given editor input
     * 
     * TODO Move this to a source document parser class
     */
    public class ContentProvider implements ITreeContentProvider {

	private Crate crate;

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	    if (newInput != null) {
		IDocument document = documentProvider.getDocument(newInput);
		if (document != null) {
		    parse(document);
		}
	    }
	}

	protected void parse(IDocument document) {
	    final String crateIdentifier = input.getName().substring(0,
		    input.getName().lastIndexOf('.'));

	    final IRustParser parser = new NativeParser();
	    parser.setSource(document);
	    parser.parse();

	    crate = (Crate) parser.getRoot();
	    crate.setIdentifier(crateIdentifier);
	}

	@Override
	public Object[] getChildren(Object object) {
	    if (object instanceof Crate) {
		return ((Crate) object).getItems().toArray();
	    } else if (object instanceof Module) {
		return ((Item) object).getItems().toArray();
	    } else if (object instanceof Trait) {
		return ((Trait) object).getMethods().toArray();
	    } else if (object instanceof Implementation) {
		return ((Implementation) object).getMethods().toArray();
	    } else if (object instanceof Enumeration) {
		return ((Enumeration) object).getVariants().toArray();
	    } else if (object instanceof Implementation) {
		return ((Implementation) object).getMethods().toArray();
	    }

	    return null;
	}

	@Override
	public Object[] getElements(Object arg0) {
	    return new Object[] { crate };
	}

	@Override
	public Object getParent(Object object) {
	    if (object instanceof ASTNode) {
		return ((ASTNode) object).getParent();
	    }

	    return null;
	}

	@Override
	public boolean hasChildren(Object object) {
	    if (object instanceof ASTNode) {
		return ((ASTNode) object).hasChildren();
	    }

	    return false;
	}

	@Override
	public void dispose() {
	    crate = null;
	}

    }

    /*
     * TODO Type definitions
     * 
     * @see http://static.rust-lang.org/doc/master/rust.html#type-definitions
     */

}
