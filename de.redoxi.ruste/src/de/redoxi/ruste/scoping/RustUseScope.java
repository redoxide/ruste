package de.redoxi.ruste.scoping;

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class RustUseScope implements IScope {

	protected QualifiedName prefix;
	protected IScope delegate;
	protected IScope parent;
	protected boolean ignoreCase;

	public RustUseScope(IScope delegate, IScope parent, QualifiedName prefix, boolean ignoreCase) {
		this.prefix = prefix;
		this.delegate = delegate;
		this.parent = parent;
		this.ignoreCase = ignoreCase;
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		IEObjectDescription description = wrapEObjectDescription(delegate.getSingleElement(stripPrefix(name)));
		if (description != null) {
			return description;
		}
		return parent.getSingleElement(name);
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		ArrayList<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription description : wrapEObjectDescriptions(delegate.getElements(stripPrefix(name)))) {
			elements.add(description);
		}
		for (IEObjectDescription description : parent.getElements(name)) {
			elements.add(description);
		}
		return elements;
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {
		IEObjectDescription description = wrapEObjectDescription(delegate.getSingleElement(object));
		if (description != null) {
			return description;
		}
		return parent.getSingleElement(object);
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {
		ArrayList<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription description : wrapEObjectDescriptions(delegate.getElements(object))) {
			elements.add(description);
		}
		for (IEObjectDescription description : parent.getElements(object)) {
			elements.add(description);
		}
		return elements;
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		ArrayList<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription description : wrapEObjectDescriptions(delegate.getAllElements())) {
			elements.add(description);
		}
		for (IEObjectDescription description : parent.getAllElements()) {
			elements.add(description);
		}
		return elements;
	}

	private IEObjectDescription wrapEObjectDescription(IEObjectDescription description) {
		if (description != null) {
			return new EObjectDescriptionProxy(description);
		}

		return null;
	}

	private Iterable<IEObjectDescription> wrapEObjectDescriptions(Iterable<IEObjectDescription> descriptions) {
		ArrayList<IEObjectDescription> proxies = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription description : descriptions) {
			proxies.add(new EObjectDescriptionProxy(description));
		}
		return proxies;
	}

	private QualifiedName stripPrefix(QualifiedName qn) {
		if (!qn.isEmpty() && (ignoreCase && qn.startsWithIgnoreCase(prefix)) || (!ignoreCase && qn.startsWith(prefix))) {
			return qn.skipFirst(prefix.getSegmentCount() - 1);
		}

		return qn;
	}

	public class EObjectDescriptionProxy implements IEObjectDescription {

		private IEObjectDescription objectDescriptionDelegate;

		public EObjectDescriptionProxy(IEObjectDescription objectDescriptionDelegate) {
			this.objectDescriptionDelegate = objectDescriptionDelegate;
		}

		@Override
		public QualifiedName getName() {
			return prefix.skipLast(1).append(objectDescriptionDelegate.getName());
		}

		@Override
		public QualifiedName getQualifiedName() {
			return prefix.skipLast(1).append(objectDescriptionDelegate.getQualifiedName());
		}

		@Override
		public EObject getEObjectOrProxy() {
			return objectDescriptionDelegate.getEObjectOrProxy();
		}

		@Override
		public URI getEObjectURI() {
			return objectDescriptionDelegate.getEObjectURI();
		}

		@Override
		public EClass getEClass() {
			return objectDescriptionDelegate.getEClass();
		}

		@Override
		public String getUserData(String key) {
			return objectDescriptionDelegate.getUserData(key);
		}

		@Override
		public String[] getUserDataKeys() {
			return objectDescriptionDelegate.getUserDataKeys();
		}
	}
}
