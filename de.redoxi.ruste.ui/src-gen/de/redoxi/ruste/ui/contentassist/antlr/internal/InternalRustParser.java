package de.redoxi.ruste.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.redoxi.ruste.services.RustGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRustParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_NON_SINGLE_QUOTE", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "';'", "'\\\\'", "'n'", "'r'", "'t'", "'0'", "'_'", "'E'", "'e'", "'+'", "'i'", "'32'", "'64'", "'8'", "'16'", "'#['", "']'", "','", "'('", "')'", "'='", "'mod'", "'{'", "'}'", "'\\''", "'x'", "'u'", "'U'", "'.'", "'f'", "'-'"
    };
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_DEC_DIGIT=7;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_HEX_DIGIT=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_XID_START=8;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int RULE_IDENT=4;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_NON_SINGLE_QUOTE=5;
    public static final int T__10=10;
    public static final int RULE_XID_CONTINUE=9;

    // delegates
    // delegators


        public InternalRustParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRustParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRustParser.tokenNames; }
    public String getGrammarFileName() { return "../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g"; }


     
     	private RustGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RustGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleCrate"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:60:1: entryRuleCrate : ruleCrate EOF ;
    public final void entryRuleCrate() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:61:1: ( ruleCrate EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:62:1: ruleCrate EOF
            {
             before(grammarAccess.getCrateRule()); 
            pushFollow(FOLLOW_ruleCrate_in_entryRuleCrate61);
            ruleCrate();

            state._fsp--;

             after(grammarAccess.getCrateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrate68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrate"


    // $ANTLR start "ruleCrate"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:69:1: ruleCrate : ( ( rule__Crate__ItemsAssignment )* ) ;
    public final void ruleCrate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:73:2: ( ( ( rule__Crate__ItemsAssignment )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:74:1: ( ( rule__Crate__ItemsAssignment )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:74:1: ( ( rule__Crate__ItemsAssignment )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:75:1: ( rule__Crate__ItemsAssignment )*
            {
             before(grammarAccess.getCrateAccess().getItemsAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:76:1: ( rule__Crate__ItemsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:76:2: rule__Crate__ItemsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Crate__ItemsAssignment_in_ruleCrate94);
            	    rule__Crate__ItemsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCrateAccess().getItemsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrate"


    // $ANTLR start "entryRuleItemAttr"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:88:1: entryRuleItemAttr : ruleItemAttr EOF ;
    public final void entryRuleItemAttr() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:89:1: ( ruleItemAttr EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:90:1: ruleItemAttr EOF
            {
             before(grammarAccess.getItemAttrRule()); 
            pushFollow(FOLLOW_ruleItemAttr_in_entryRuleItemAttr122);
            ruleItemAttr();

            state._fsp--;

             after(grammarAccess.getItemAttrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemAttr129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemAttr"


    // $ANTLR start "ruleItemAttr"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:97:1: ruleItemAttr : ( ( rule__ItemAttr__Group__0 ) ) ;
    public final void ruleItemAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:101:2: ( ( ( rule__ItemAttr__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:102:1: ( ( rule__ItemAttr__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:102:1: ( ( rule__ItemAttr__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:103:1: ( rule__ItemAttr__Group__0 )
            {
             before(grammarAccess.getItemAttrAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:104:1: ( rule__ItemAttr__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:104:2: rule__ItemAttr__Group__0
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__0_in_ruleItemAttr155);
            rule__ItemAttr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAttrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemAttr"


    // $ANTLR start "entryRuleAttr"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:116:1: entryRuleAttr : ruleAttr EOF ;
    public final void entryRuleAttr() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:117:1: ( ruleAttr EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:118:1: ruleAttr EOF
            {
             before(grammarAccess.getAttrRule()); 
            pushFollow(FOLLOW_ruleAttr_in_entryRuleAttr182);
            ruleAttr();

            state._fsp--;

             after(grammarAccess.getAttrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttr189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttr"


    // $ANTLR start "ruleAttr"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:125:1: ruleAttr : ( ( rule__Attr__Alternatives ) ) ;
    public final void ruleAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:129:2: ( ( ( rule__Attr__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:130:1: ( ( rule__Attr__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:130:1: ( ( rule__Attr__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:131:1: ( rule__Attr__Alternatives )
            {
             before(grammarAccess.getAttrAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:132:1: ( rule__Attr__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:132:2: rule__Attr__Alternatives
            {
            pushFollow(FOLLOW_rule__Attr__Alternatives_in_ruleAttr215);
            rule__Attr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttrAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttr"


    // $ANTLR start "entryRuleAttrWithList"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:144:1: entryRuleAttrWithList : ruleAttrWithList EOF ;
    public final void entryRuleAttrWithList() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:145:1: ( ruleAttrWithList EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:146:1: ruleAttrWithList EOF
            {
             before(grammarAccess.getAttrWithListRule()); 
            pushFollow(FOLLOW_ruleAttrWithList_in_entryRuleAttrWithList242);
            ruleAttrWithList();

            state._fsp--;

             after(grammarAccess.getAttrWithListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrWithList249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttrWithList"


    // $ANTLR start "ruleAttrWithList"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:153:1: ruleAttrWithList : ( ( rule__AttrWithList__Group__0 ) ) ;
    public final void ruleAttrWithList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:157:2: ( ( ( rule__AttrWithList__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:158:1: ( ( rule__AttrWithList__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:158:1: ( ( rule__AttrWithList__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:159:1: ( rule__AttrWithList__Group__0 )
            {
             before(grammarAccess.getAttrWithListAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:160:1: ( rule__AttrWithList__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:160:2: rule__AttrWithList__Group__0
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__0_in_ruleAttrWithList275);
            rule__AttrWithList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrWithListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttrWithList"


    // $ANTLR start "entryRuleLiteralAttr"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:172:1: entryRuleLiteralAttr : ruleLiteralAttr EOF ;
    public final void entryRuleLiteralAttr() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:173:1: ( ruleLiteralAttr EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:174:1: ruleLiteralAttr EOF
            {
             before(grammarAccess.getLiteralAttrRule()); 
            pushFollow(FOLLOW_ruleLiteralAttr_in_entryRuleLiteralAttr302);
            ruleLiteralAttr();

            state._fsp--;

             after(grammarAccess.getLiteralAttrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAttr309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralAttr"


    // $ANTLR start "ruleLiteralAttr"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:181:1: ruleLiteralAttr : ( ( rule__LiteralAttr__Group__0 ) ) ;
    public final void ruleLiteralAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:185:2: ( ( ( rule__LiteralAttr__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:186:1: ( ( rule__LiteralAttr__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:186:1: ( ( rule__LiteralAttr__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:187:1: ( rule__LiteralAttr__Group__0 )
            {
             before(grammarAccess.getLiteralAttrAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:188:1: ( rule__LiteralAttr__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:188:2: rule__LiteralAttr__Group__0
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__0_in_ruleLiteralAttr335);
            rule__LiteralAttr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAttrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralAttr"


    // $ANTLR start "entryRuleItemAndAttrs"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:200:1: entryRuleItemAndAttrs : ruleItemAndAttrs EOF ;
    public final void entryRuleItemAndAttrs() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:201:1: ( ruleItemAndAttrs EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:202:1: ruleItemAndAttrs EOF
            {
             before(grammarAccess.getItemAndAttrsRule()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_entryRuleItemAndAttrs362);
            ruleItemAndAttrs();

            state._fsp--;

             after(grammarAccess.getItemAndAttrsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemAndAttrs369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemAndAttrs"


    // $ANTLR start "ruleItemAndAttrs"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:209:1: ruleItemAndAttrs : ( ( rule__ItemAndAttrs__Group__0 ) ) ;
    public final void ruleItemAndAttrs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:213:2: ( ( ( rule__ItemAndAttrs__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:214:1: ( ( rule__ItemAndAttrs__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:214:1: ( ( rule__ItemAndAttrs__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:215:1: ( rule__ItemAndAttrs__Group__0 )
            {
             before(grammarAccess.getItemAndAttrsAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:216:1: ( rule__ItemAndAttrs__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:216:2: rule__ItemAndAttrs__Group__0
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__0_in_ruleItemAndAttrs395);
            rule__ItemAndAttrs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAndAttrsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemAndAttrs"


    // $ANTLR start "entryRuleItem"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:228:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:229:1: ( ruleItem EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:230:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem422);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:237:1: ruleItem : ( ruleModItem ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:241:2: ( ( ruleModItem ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:242:1: ( ruleModItem )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:242:1: ( ruleModItem )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:243:1: ruleModItem
            {
             before(grammarAccess.getItemAccess().getModItemParserRuleCall()); 
            pushFollow(FOLLOW_ruleModItem_in_ruleItem455);
            ruleModItem();

            state._fsp--;

             after(grammarAccess.getItemAccess().getModItemParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleModItem"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:256:1: entryRuleModItem : ruleModItem EOF ;
    public final void entryRuleModItem() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:257:1: ( ruleModItem EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:258:1: ruleModItem EOF
            {
             before(grammarAccess.getModItemRule()); 
            pushFollow(FOLLOW_ruleModItem_in_entryRuleModItem481);
            ruleModItem();

            state._fsp--;

             after(grammarAccess.getModItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModItem488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModItem"


    // $ANTLR start "ruleModItem"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:265:1: ruleModItem : ( ( rule__ModItem__Group__0 ) ) ;
    public final void ruleModItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:269:2: ( ( ( rule__ModItem__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:270:1: ( ( rule__ModItem__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:270:1: ( ( rule__ModItem__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:271:1: ( rule__ModItem__Group__0 )
            {
             before(grammarAccess.getModItemAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:272:1: ( rule__ModItem__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:272:2: rule__ModItem__Group__0
            {
            pushFollow(FOLLOW_rule__ModItem__Group__0_in_ruleModItem514);
            rule__ModItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModItem"


    // $ANTLR start "entryRuleLiteral"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:284:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:285:1: ( ruleLiteral EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:286:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral541);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:293:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:297:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:298:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:298:1: ( ( rule__Literal__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:299:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:300:1: ( rule__Literal__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:300:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral574);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleCharLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:312:1: entryRuleCharLit : ruleCharLit EOF ;
    public final void entryRuleCharLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:313:1: ( ruleCharLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:314:1: ruleCharLit EOF
            {
             before(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit601);
            ruleCharLit();

            state._fsp--;

             after(grammarAccess.getCharLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharLit"


    // $ANTLR start "ruleCharLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:321:1: ruleCharLit : ( ( rule__CharLit__Group__0 ) ) ;
    public final void ruleCharLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:325:2: ( ( ( rule__CharLit__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:326:1: ( ( rule__CharLit__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:326:1: ( ( rule__CharLit__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:327:1: ( rule__CharLit__Group__0 )
            {
             before(grammarAccess.getCharLitAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:328:1: ( rule__CharLit__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:328:2: rule__CharLit__Group__0
            {
            pushFollow(FOLLOW_rule__CharLit__Group__0_in_ruleCharLit634);
            rule__CharLit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharLitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharLit"


    // $ANTLR start "entryRuleEscapedChar"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:340:1: entryRuleEscapedChar : ruleEscapedChar EOF ;
    public final void entryRuleEscapedChar() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:341:1: ( ruleEscapedChar EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:342:1: ruleEscapedChar EOF
            {
             before(grammarAccess.getEscapedCharRule()); 
            pushFollow(FOLLOW_ruleEscapedChar_in_entryRuleEscapedChar661);
            ruleEscapedChar();

            state._fsp--;

             after(grammarAccess.getEscapedCharRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedChar668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEscapedChar"


    // $ANTLR start "ruleEscapedChar"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:349:1: ruleEscapedChar : ( ( rule__EscapedChar__Alternatives ) ) ;
    public final void ruleEscapedChar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:353:2: ( ( ( rule__EscapedChar__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:354:1: ( ( rule__EscapedChar__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:354:1: ( ( rule__EscapedChar__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:355:1: ( rule__EscapedChar__Alternatives )
            {
             before(grammarAccess.getEscapedCharAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:356:1: ( rule__EscapedChar__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:356:2: rule__EscapedChar__Alternatives
            {
            pushFollow(FOLLOW_rule__EscapedChar__Alternatives_in_ruleEscapedChar694);
            rule__EscapedChar__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEscapedChar"


    // $ANTLR start "entryRuleNumberLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:368:1: entryRuleNumberLit : ruleNumberLit EOF ;
    public final void entryRuleNumberLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:369:1: ( ruleNumberLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:370:1: ruleNumberLit EOF
            {
             before(grammarAccess.getNumberLitRule()); 
            pushFollow(FOLLOW_ruleNumberLit_in_entryRuleNumberLit721);
            ruleNumberLit();

            state._fsp--;

             after(grammarAccess.getNumberLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLit728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLit"


    // $ANTLR start "ruleNumberLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:377:1: ruleNumberLit : ( ( rule__NumberLit__Alternatives ) ) ;
    public final void ruleNumberLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:381:2: ( ( ( rule__NumberLit__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:382:1: ( ( rule__NumberLit__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:382:1: ( ( rule__NumberLit__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:383:1: ( rule__NumberLit__Alternatives )
            {
             before(grammarAccess.getNumberLitAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:384:1: ( rule__NumberLit__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:384:2: rule__NumberLit__Alternatives
            {
            pushFollow(FOLLOW_rule__NumberLit__Alternatives_in_ruleNumberLit754);
            rule__NumberLit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberLitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLit"


    // $ANTLR start "entryRuleFloatLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:396:1: entryRuleFloatLit : ruleFloatLit EOF ;
    public final void entryRuleFloatLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:397:1: ( ruleFloatLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:398:1: ruleFloatLit EOF
            {
             before(grammarAccess.getFloatLitRule()); 
            pushFollow(FOLLOW_ruleFloatLit_in_entryRuleFloatLit781);
            ruleFloatLit();

            state._fsp--;

             after(grammarAccess.getFloatLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLit788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatLit"


    // $ANTLR start "ruleFloatLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:405:1: ruleFloatLit : ( ( rule__FloatLit__Group__0 ) ) ;
    public final void ruleFloatLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:409:2: ( ( ( rule__FloatLit__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:410:1: ( ( rule__FloatLit__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:410:1: ( ( rule__FloatLit__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:411:1: ( rule__FloatLit__Group__0 )
            {
             before(grammarAccess.getFloatLitAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:412:1: ( rule__FloatLit__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:412:2: rule__FloatLit__Group__0
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__0_in_ruleFloatLit814);
            rule__FloatLit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatLit"


    // $ANTLR start "entryRuleIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:424:1: entryRuleIntLit : ruleIntLit EOF ;
    public final void entryRuleIntLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:425:1: ( ruleIntLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:426:1: ruleIntLit EOF
            {
             before(grammarAccess.getIntLitRule()); 
            pushFollow(FOLLOW_ruleIntLit_in_entryRuleIntLit841);
            ruleIntLit();

            state._fsp--;

             after(grammarAccess.getIntLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLit848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLit"


    // $ANTLR start "ruleIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:433:1: ruleIntLit : ( ruleDecIntLit ) ;
    public final void ruleIntLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:437:2: ( ( ruleDecIntLit ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:438:1: ( ruleDecIntLit )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:438:1: ( ruleDecIntLit )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:439:1: ruleDecIntLit
            {
             before(grammarAccess.getIntLitAccess().getDecIntLitParserRuleCall()); 
            pushFollow(FOLLOW_ruleDecIntLit_in_ruleIntLit874);
            ruleDecIntLit();

            state._fsp--;

             after(grammarAccess.getIntLitAccess().getDecIntLitParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLit"


    // $ANTLR start "entryRuleDecIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:452:1: entryRuleDecIntLit : ruleDecIntLit EOF ;
    public final void entryRuleDecIntLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:453:1: ( ruleDecIntLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:454:1: ruleDecIntLit EOF
            {
             before(grammarAccess.getDecIntLitRule()); 
            pushFollow(FOLLOW_ruleDecIntLit_in_entryRuleDecIntLit900);
            ruleDecIntLit();

            state._fsp--;

             after(grammarAccess.getDecIntLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecIntLit907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecIntLit"


    // $ANTLR start "ruleDecIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:461:1: ruleDecIntLit : ( ( rule__DecIntLit__Group__0 ) ) ;
    public final void ruleDecIntLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:465:2: ( ( ( rule__DecIntLit__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:466:1: ( ( rule__DecIntLit__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:466:1: ( ( rule__DecIntLit__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:467:1: ( rule__DecIntLit__Group__0 )
            {
             before(grammarAccess.getDecIntLitAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:468:1: ( rule__DecIntLit__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:468:2: rule__DecIntLit__Group__0
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__0_in_ruleDecIntLit933);
            rule__DecIntLit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecIntLitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecIntLit"


    // $ANTLR start "ruleFloatSize"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:481:1: ruleFloatSize : ( ( rule__FloatSize__Alternatives ) ) ;
    public final void ruleFloatSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:485:1: ( ( ( rule__FloatSize__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:486:1: ( ( rule__FloatSize__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:486:1: ( ( rule__FloatSize__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:487:1: ( rule__FloatSize__Alternatives )
            {
             before(grammarAccess.getFloatSizeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:488:1: ( rule__FloatSize__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:488:2: rule__FloatSize__Alternatives
            {
            pushFollow(FOLLOW_rule__FloatSize__Alternatives_in_ruleFloatSize970);
            rule__FloatSize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatSizeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatSize"


    // $ANTLR start "ruleIntSize"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:500:1: ruleIntSize : ( ( rule__IntSize__Alternatives ) ) ;
    public final void ruleIntSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:504:1: ( ( ( rule__IntSize__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:505:1: ( ( rule__IntSize__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:505:1: ( ( rule__IntSize__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:506:1: ( rule__IntSize__Alternatives )
            {
             before(grammarAccess.getIntSizeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:507:1: ( rule__IntSize__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:507:2: rule__IntSize__Alternatives
            {
            pushFollow(FOLLOW_rule__IntSize__Alternatives_in_ruleIntSize1006);
            rule__IntSize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntSizeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntSize"


    // $ANTLR start "rule__Attr__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:518:1: rule__Attr__Alternatives : ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) );
    public final void rule__Attr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:522:1: ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==30) ) {
                    alt2=1;
                }
                else if ( (LA2_1==28) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:523:1: ( ruleLiteralAttr )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:523:1: ( ruleLiteralAttr )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:524:1: ruleLiteralAttr
                    {
                     before(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1041);
                    ruleLiteralAttr();

                    state._fsp--;

                     after(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:529:6: ( ruleAttrWithList )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:529:6: ( ruleAttrWithList )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:530:1: ruleAttrWithList
                    {
                     before(grammarAccess.getAttrAccess().getAttrWithListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1058);
                    ruleAttrWithList();

                    state._fsp--;

                     after(grammarAccess.getAttrAccess().getAttrWithListParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Alternatives"


    // $ANTLR start "rule__ModItem__Alternatives_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:540:1: rule__ModItem__Alternatives_2 : ( ( ';' ) | ( ( rule__ModItem__Group_2_1__0 ) ) );
    public final void rule__ModItem__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:544:1: ( ( ';' ) | ( ( rule__ModItem__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:545:1: ( ';' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:545:1: ( ';' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:546:1: ';'
                    {
                     before(grammarAccess.getModItemAccess().getSemicolonKeyword_2_0()); 
                    match(input,10,FOLLOW_10_in_rule__ModItem__Alternatives_21091); 
                     after(grammarAccess.getModItemAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:553:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:553:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:554:1: ( rule__ModItem__Group_2_1__0 )
                    {
                     before(grammarAccess.getModItemAccess().getGroup_2_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:555:1: ( rule__ModItem__Group_2_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:555:2: rule__ModItem__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_21110);
                    rule__ModItem__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModItemAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Alternatives_2"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:564:1: rule__Literal__Alternatives : ( ( ruleCharLit ) | ( ruleNumberLit ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:568:1: ( ( ruleCharLit ) | ( ruleNumberLit ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_DEC_DIGIT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:569:1: ( ruleCharLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:569:1: ( ruleCharLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:570:1: ruleCharLit
                    {
                     before(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCharLit_in_rule__Literal__Alternatives1143);
                    ruleCharLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:575:6: ( ruleNumberLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:575:6: ( ruleNumberLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:576:1: ruleNumberLit
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives1160);
                    ruleNumberLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__CharLit__Alternatives_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:586:1: rule__CharLit__Alternatives_1 : ( ( ( rule__CharLit__CharAssignment_1_0 ) ) | ( ( rule__CharLit__Group_1_1__0 ) ) );
    public final void rule__CharLit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:590:1: ( ( ( rule__CharLit__CharAssignment_1_0 ) ) | ( ( rule__CharLit__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NON_SINGLE_QUOTE) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:591:1: ( ( rule__CharLit__CharAssignment_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:591:1: ( ( rule__CharLit__CharAssignment_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:592:1: ( rule__CharLit__CharAssignment_1_0 )
                    {
                     before(grammarAccess.getCharLitAccess().getCharAssignment_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:593:1: ( rule__CharLit__CharAssignment_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:593:2: rule__CharLit__CharAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__CharLit__CharAssignment_1_0_in_rule__CharLit__Alternatives_11192);
                    rule__CharLit__CharAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getCharAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:597:6: ( ( rule__CharLit__Group_1_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:597:6: ( ( rule__CharLit__Group_1_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:598:1: ( rule__CharLit__Group_1_1__0 )
                    {
                     before(grammarAccess.getCharLitAccess().getGroup_1_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:599:1: ( rule__CharLit__Group_1_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:599:2: rule__CharLit__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__CharLit__Group_1_1__0_in_rule__CharLit__Alternatives_11210);
                    rule__CharLit__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Alternatives_1"


    // $ANTLR start "rule__CharLit__Alternatives_1_1_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:1: rule__CharLit__Alternatives_1_1_1 : ( ( ( rule__CharLit__CharAssignment_1_1_1_0 ) ) | ( ( rule__CharLit__EscapedCharAssignment_1_1_1_1 ) ) );
    public final void rule__CharLit__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:612:1: ( ( ( rule__CharLit__CharAssignment_1_1_1_0 ) ) | ( ( rule__CharLit__EscapedCharAssignment_1_1_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=11 && LA6_0<=15)||(LA6_0>=35 && LA6_0<=37)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:613:1: ( ( rule__CharLit__CharAssignment_1_1_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:613:1: ( ( rule__CharLit__CharAssignment_1_1_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:614:1: ( rule__CharLit__CharAssignment_1_1_1_0 )
                    {
                     before(grammarAccess.getCharLitAccess().getCharAssignment_1_1_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:615:1: ( rule__CharLit__CharAssignment_1_1_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:615:2: rule__CharLit__CharAssignment_1_1_1_0
                    {
                    pushFollow(FOLLOW_rule__CharLit__CharAssignment_1_1_1_0_in_rule__CharLit__Alternatives_1_1_11243);
                    rule__CharLit__CharAssignment_1_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getCharAssignment_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:619:6: ( ( rule__CharLit__EscapedCharAssignment_1_1_1_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:619:6: ( ( rule__CharLit__EscapedCharAssignment_1_1_1_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:620:1: ( rule__CharLit__EscapedCharAssignment_1_1_1_1 )
                    {
                     before(grammarAccess.getCharLitAccess().getEscapedCharAssignment_1_1_1_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:621:1: ( rule__CharLit__EscapedCharAssignment_1_1_1_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:621:2: rule__CharLit__EscapedCharAssignment_1_1_1_1
                    {
                    pushFollow(FOLLOW_rule__CharLit__EscapedCharAssignment_1_1_1_1_in_rule__CharLit__Alternatives_1_1_11261);
                    rule__CharLit__EscapedCharAssignment_1_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getEscapedCharAssignment_1_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Alternatives_1_1_1"


    // $ANTLR start "rule__EscapedChar__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:630:1: rule__EscapedChar__Alternatives : ( ( ( rule__EscapedChar__Group_0__0 ) ) | ( ( rule__EscapedChar__Group_1__0 ) ) | ( ( rule__EscapedChar__Group_2__0 ) ) | ( ( rule__EscapedChar__Group_3__0 ) ) );
    public final void rule__EscapedChar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:634:1: ( ( ( rule__EscapedChar__Group_0__0 ) ) | ( ( rule__EscapedChar__Group_1__0 ) ) | ( ( rule__EscapedChar__Group_2__0 ) ) | ( ( rule__EscapedChar__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            case 37:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:635:1: ( ( rule__EscapedChar__Group_0__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:635:1: ( ( rule__EscapedChar__Group_0__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:636:1: ( rule__EscapedChar__Group_0__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:637:1: ( rule__EscapedChar__Group_0__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:637:2: rule__EscapedChar__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_0__0_in_rule__EscapedChar__Alternatives1294);
                    rule__EscapedChar__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:641:6: ( ( rule__EscapedChar__Group_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:641:6: ( ( rule__EscapedChar__Group_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:642:1: ( rule__EscapedChar__Group_1__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:643:1: ( rule__EscapedChar__Group_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:643:2: rule__EscapedChar__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_1__0_in_rule__EscapedChar__Alternatives1312);
                    rule__EscapedChar__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:647:6: ( ( rule__EscapedChar__Group_2__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:647:6: ( ( rule__EscapedChar__Group_2__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:648:1: ( rule__EscapedChar__Group_2__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:649:1: ( rule__EscapedChar__Group_2__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:649:2: rule__EscapedChar__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_2__0_in_rule__EscapedChar__Alternatives1330);
                    rule__EscapedChar__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:653:6: ( ( rule__EscapedChar__Group_3__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:653:6: ( ( rule__EscapedChar__Group_3__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:654:1: ( rule__EscapedChar__Group_3__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:655:1: ( rule__EscapedChar__Group_3__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:655:2: rule__EscapedChar__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_3__0_in_rule__EscapedChar__Alternatives1348);
                    rule__EscapedChar__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Alternatives"


    // $ANTLR start "rule__EscapedChar__CharAlternatives_0_1_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:664:1: rule__EscapedChar__CharAlternatives_0_1_0 : ( ( '\\\\' ) | ( 'n' ) | ( 'r' ) | ( 't' ) | ( '0' ) );
    public final void rule__EscapedChar__CharAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:668:1: ( ( '\\\\' ) | ( 'n' ) | ( 'r' ) | ( 't' ) | ( '0' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:669:1: ( '\\\\' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:669:1: ( '\\\\' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:670:1: '\\\\'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharReverseSolidusKeyword_0_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__EscapedChar__CharAlternatives_0_1_01382); 
                     after(grammarAccess.getEscapedCharAccess().getCharReverseSolidusKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:677:6: ( 'n' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:677:6: ( 'n' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:678:1: 'n'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharNKeyword_0_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__EscapedChar__CharAlternatives_0_1_01402); 
                     after(grammarAccess.getEscapedCharAccess().getCharNKeyword_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:685:6: ( 'r' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:685:6: ( 'r' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:686:1: 'r'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharRKeyword_0_1_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__EscapedChar__CharAlternatives_0_1_01422); 
                     after(grammarAccess.getEscapedCharAccess().getCharRKeyword_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:693:6: ( 't' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:693:6: ( 't' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:694:1: 't'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharTKeyword_0_1_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__EscapedChar__CharAlternatives_0_1_01442); 
                     after(grammarAccess.getEscapedCharAccess().getCharTKeyword_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:701:6: ( '0' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:701:6: ( '0' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:702:1: '0'
                    {
                     before(grammarAccess.getEscapedCharAccess().getChar0Keyword_0_1_0_4()); 
                    match(input,15,FOLLOW_15_in_rule__EscapedChar__CharAlternatives_0_1_01462); 
                     after(grammarAccess.getEscapedCharAccess().getChar0Keyword_0_1_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__CharAlternatives_0_1_0"


    // $ANTLR start "rule__NumberLit__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:714:1: rule__NumberLit__Alternatives : ( ( ruleFloatLit ) | ( ruleIntLit ) );
    public final void rule__NumberLit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:718:1: ( ( ruleFloatLit ) | ( ruleIntLit ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:719:1: ( ruleFloatLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:719:1: ( ruleFloatLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:720:1: ruleFloatLit
                    {
                     before(grammarAccess.getNumberLitAccess().getFloatLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFloatLit_in_rule__NumberLit__Alternatives1496);
                    ruleFloatLit();

                    state._fsp--;

                     after(grammarAccess.getNumberLitAccess().getFloatLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:725:6: ( ruleIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:725:6: ( ruleIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:726:1: ruleIntLit
                    {
                     before(grammarAccess.getNumberLitAccess().getIntLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntLit_in_rule__NumberLit__Alternatives1513);
                    ruleIntLit();

                    state._fsp--;

                     after(grammarAccess.getNumberLitAccess().getIntLitParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLit__Alternatives"


    // $ANTLR start "rule__FloatLit__Alternatives_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:736:1: rule__FloatLit__Alternatives_1 : ( ( ( rule__FloatLit__DigitsAssignment_1_0 ) ) | ( '_' ) );
    public final void rule__FloatLit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:740:1: ( ( ( rule__FloatLit__DigitsAssignment_1_0 ) ) | ( '_' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DEC_DIGIT) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:741:1: ( ( rule__FloatLit__DigitsAssignment_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:741:1: ( ( rule__FloatLit__DigitsAssignment_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:742:1: ( rule__FloatLit__DigitsAssignment_1_0 )
                    {
                     before(grammarAccess.getFloatLitAccess().getDigitsAssignment_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:743:1: ( rule__FloatLit__DigitsAssignment_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:743:2: rule__FloatLit__DigitsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_1_0_in_rule__FloatLit__Alternatives_11545);
                    rule__FloatLit__DigitsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getDigitsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:747:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:747:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:748:1: '_'
                    {
                     before(grammarAccess.getFloatLitAccess().get_Keyword_1_1()); 
                    match(input,16,FOLLOW_16_in_rule__FloatLit__Alternatives_11564); 
                     after(grammarAccess.getFloatLitAccess().get_Keyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Alternatives_1"


    // $ANTLR start "rule__FloatLit__Alternatives_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:760:1: rule__FloatLit__Alternatives_2_1 : ( ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) ) | ( '_' ) );
    public final void rule__FloatLit__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:764:1: ( ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) ) | ( '_' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DEC_DIGIT) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:765:1: ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:765:1: ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:766:1: ( rule__FloatLit__DigitsAssignment_2_1_0 )
                    {
                     before(grammarAccess.getFloatLitAccess().getDigitsAssignment_2_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:767:1: ( rule__FloatLit__DigitsAssignment_2_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:767:2: rule__FloatLit__DigitsAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_2_1_0_in_rule__FloatLit__Alternatives_2_11598);
                    rule__FloatLit__DigitsAssignment_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getDigitsAssignment_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:771:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:771:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:772:1: '_'
                    {
                     before(grammarAccess.getFloatLitAccess().get_Keyword_2_1_1()); 
                    match(input,16,FOLLOW_16_in_rule__FloatLit__Alternatives_2_11617); 
                     after(grammarAccess.getFloatLitAccess().get_Keyword_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Alternatives_2_1"


    // $ANTLR start "rule__FloatLit__Alternatives_3_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:784:1: rule__FloatLit__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__FloatLit__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:788:1: ( ( 'E' ) | ( 'e' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:789:1: ( 'E' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:789:1: ( 'E' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:790:1: 'E'
                    {
                     before(grammarAccess.getFloatLitAccess().getEKeyword_3_0_0()); 
                    match(input,17,FOLLOW_17_in_rule__FloatLit__Alternatives_3_01652); 
                     after(grammarAccess.getFloatLitAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:797:6: ( 'e' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:797:6: ( 'e' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:798:1: 'e'
                    {
                     before(grammarAccess.getFloatLitAccess().getEKeyword_3_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__FloatLit__Alternatives_3_01672); 
                     after(grammarAccess.getFloatLitAccess().getEKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Alternatives_3_0"


    // $ANTLR start "rule__FloatLit__Alternatives_3_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:810:1: rule__FloatLit__Alternatives_3_1 : ( ( '+' ) | ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) ) );
    public final void rule__FloatLit__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:814:1: ( ( '+' ) | ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            else if ( (LA13_0==40) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:815:1: ( '+' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:815:1: ( '+' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:816:1: '+'
                    {
                     before(grammarAccess.getFloatLitAccess().getPlusSignKeyword_3_1_0()); 
                    match(input,19,FOLLOW_19_in_rule__FloatLit__Alternatives_3_11707); 
                     after(grammarAccess.getFloatLitAccess().getPlusSignKeyword_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:823:6: ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:823:6: ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:824:1: ( rule__FloatLit__NegativeExpAssignment_3_1_1 )
                    {
                     before(grammarAccess.getFloatLitAccess().getNegativeExpAssignment_3_1_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:825:1: ( rule__FloatLit__NegativeExpAssignment_3_1_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:825:2: rule__FloatLit__NegativeExpAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__FloatLit__NegativeExpAssignment_3_1_1_in_rule__FloatLit__Alternatives_3_11726);
                    rule__FloatLit__NegativeExpAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getNegativeExpAssignment_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Alternatives_3_1"


    // $ANTLR start "rule__FloatLit__Alternatives_3_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:834:1: rule__FloatLit__Alternatives_3_2 : ( ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) ) | ( '_' ) );
    public final void rule__FloatLit__Alternatives_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:838:1: ( ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) ) | ( '_' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DEC_DIGIT) ) {
                alt14=1;
            }
            else if ( (LA14_0==16) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:839:1: ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:839:1: ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:840:1: ( rule__FloatLit__DigitsAssignment_3_2_0 )
                    {
                     before(grammarAccess.getFloatLitAccess().getDigitsAssignment_3_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:841:1: ( rule__FloatLit__DigitsAssignment_3_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:841:2: rule__FloatLit__DigitsAssignment_3_2_0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_3_2_0_in_rule__FloatLit__Alternatives_3_21759);
                    rule__FloatLit__DigitsAssignment_3_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getDigitsAssignment_3_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:845:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:845:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:846:1: '_'
                    {
                     before(grammarAccess.getFloatLitAccess().get_Keyword_3_2_1()); 
                    match(input,16,FOLLOW_16_in_rule__FloatLit__Alternatives_3_21778); 
                     after(grammarAccess.getFloatLitAccess().get_Keyword_3_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Alternatives_3_2"


    // $ANTLR start "rule__DecIntLit__Alternatives_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:858:1: rule__DecIntLit__Alternatives_1 : ( ( ( rule__DecIntLit__DigitsAssignment_1_0 ) ) | ( '_' ) );
    public final void rule__DecIntLit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:862:1: ( ( ( rule__DecIntLit__DigitsAssignment_1_0 ) ) | ( '_' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DEC_DIGIT) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:863:1: ( ( rule__DecIntLit__DigitsAssignment_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:863:1: ( ( rule__DecIntLit__DigitsAssignment_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:864:1: ( rule__DecIntLit__DigitsAssignment_1_0 )
                    {
                     before(grammarAccess.getDecIntLitAccess().getDigitsAssignment_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:865:1: ( rule__DecIntLit__DigitsAssignment_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:865:2: rule__DecIntLit__DigitsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__DecIntLit__DigitsAssignment_1_0_in_rule__DecIntLit__Alternatives_11812);
                    rule__DecIntLit__DigitsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDecIntLitAccess().getDigitsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:869:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:869:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:870:1: '_'
                    {
                     before(grammarAccess.getDecIntLitAccess().get_Keyword_1_1()); 
                    match(input,16,FOLLOW_16_in_rule__DecIntLit__Alternatives_11831); 
                     after(grammarAccess.getDecIntLitAccess().get_Keyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Alternatives_1"


    // $ANTLR start "rule__DecIntLit__Alternatives_2_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:882:1: rule__DecIntLit__Alternatives_2_0 : ( ( 'i' ) | ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) ) );
    public final void rule__DecIntLit__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:886:1: ( ( 'i' ) | ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            else if ( (LA16_0==36) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:887:1: ( 'i' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:887:1: ( 'i' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:888:1: 'i'
                    {
                     before(grammarAccess.getDecIntLitAccess().getIKeyword_2_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__DecIntLit__Alternatives_2_01866); 
                     after(grammarAccess.getDecIntLitAccess().getIKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:895:6: ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:895:6: ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:896:1: ( rule__DecIntLit__UnsignedAssignment_2_0_1 )
                    {
                     before(grammarAccess.getDecIntLitAccess().getUnsignedAssignment_2_0_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:897:1: ( rule__DecIntLit__UnsignedAssignment_2_0_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:897:2: rule__DecIntLit__UnsignedAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__DecIntLit__UnsignedAssignment_2_0_1_in_rule__DecIntLit__Alternatives_2_01885);
                    rule__DecIntLit__UnsignedAssignment_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDecIntLitAccess().getUnsignedAssignment_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Alternatives_2_0"


    // $ANTLR start "rule__FloatSize__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:906:1: rule__FloatSize__Alternatives : ( ( ( '32' ) ) | ( ( '64' ) ) );
    public final void rule__FloatSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:910:1: ( ( ( '32' ) ) | ( ( '64' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            else if ( (LA17_0==22) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:911:1: ( ( '32' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:911:1: ( ( '32' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:912:1: ( '32' )
                    {
                     before(grammarAccess.getFloatSizeAccess().getFLOATEnumLiteralDeclaration_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:913:1: ( '32' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:913:3: '32'
                    {
                    match(input,21,FOLLOW_21_in_rule__FloatSize__Alternatives1919); 

                    }

                     after(grammarAccess.getFloatSizeAccess().getFLOATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:918:6: ( ( '64' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:918:6: ( ( '64' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:919:1: ( '64' )
                    {
                     before(grammarAccess.getFloatSizeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:920:1: ( '64' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:920:3: '64'
                    {
                    match(input,22,FOLLOW_22_in_rule__FloatSize__Alternatives1940); 

                    }

                     after(grammarAccess.getFloatSizeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatSize__Alternatives"


    // $ANTLR start "rule__IntSize__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:930:1: rule__IntSize__Alternatives : ( ( ( '8' ) ) | ( ( '16' ) ) | ( ( '32' ) ) | ( ( '64' ) ) );
    public final void rule__IntSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:934:1: ( ( ( '8' ) ) | ( ( '16' ) ) | ( ( '32' ) ) | ( ( '64' ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt18=1;
                }
                break;
            case 24:
                {
                alt18=2;
                }
                break;
            case 21:
                {
                alt18=3;
                }
                break;
            case 22:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:935:1: ( ( '8' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:935:1: ( ( '8' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:936:1: ( '8' )
                    {
                     before(grammarAccess.getIntSizeAccess().getBYTEEnumLiteralDeclaration_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:937:1: ( '8' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:937:3: '8'
                    {
                    match(input,23,FOLLOW_23_in_rule__IntSize__Alternatives1976); 

                    }

                     after(grammarAccess.getIntSizeAccess().getBYTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:942:6: ( ( '16' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:942:6: ( ( '16' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:943:1: ( '16' )
                    {
                     before(grammarAccess.getIntSizeAccess().getSHORTEnumLiteralDeclaration_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:944:1: ( '16' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:944:3: '16'
                    {
                    match(input,24,FOLLOW_24_in_rule__IntSize__Alternatives1997); 

                    }

                     after(grammarAccess.getIntSizeAccess().getSHORTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:949:6: ( ( '32' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:949:6: ( ( '32' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:950:1: ( '32' )
                    {
                     before(grammarAccess.getIntSizeAccess().getINTEnumLiteralDeclaration_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:951:1: ( '32' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:951:3: '32'
                    {
                    match(input,21,FOLLOW_21_in_rule__IntSize__Alternatives2018); 

                    }

                     after(grammarAccess.getIntSizeAccess().getINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:956:6: ( ( '64' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:956:6: ( ( '64' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:957:1: ( '64' )
                    {
                     before(grammarAccess.getIntSizeAccess().getLONGEnumLiteralDeclaration_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:958:1: ( '64' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:958:3: '64'
                    {
                    match(input,22,FOLLOW_22_in_rule__IntSize__Alternatives2039); 

                    }

                     after(grammarAccess.getIntSizeAccess().getLONGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntSize__Alternatives"


    // $ANTLR start "rule__ItemAttr__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:970:1: rule__ItemAttr__Group__0 : rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 ;
    public final void rule__ItemAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:974:1: ( rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:975:2: rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02072);
            rule__ItemAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02075);
            rule__ItemAttr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group__0"


    // $ANTLR start "rule__ItemAttr__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:982:1: rule__ItemAttr__Group__0__Impl : ( '#[' ) ;
    public final void rule__ItemAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:986:1: ( ( '#[' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:987:1: ( '#[' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:987:1: ( '#[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:988:1: '#['
            {
             before(grammarAccess.getItemAttrAccess().getNumberSignLeftSquareBracketKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ItemAttr__Group__0__Impl2103); 
             after(grammarAccess.getItemAttrAccess().getNumberSignLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group__0__Impl"


    // $ANTLR start "rule__ItemAttr__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1001:1: rule__ItemAttr__Group__1 : rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 ;
    public final void rule__ItemAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1005:1: ( rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1006:2: rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12134);
            rule__ItemAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12137);
            rule__ItemAttr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group__1"


    // $ANTLR start "rule__ItemAttr__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1013:1: rule__ItemAttr__Group__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_1 ) ) ;
    public final void rule__ItemAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1017:1: ( ( ( rule__ItemAttr__AttrsAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1018:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1018:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1019:1: ( rule__ItemAttr__AttrsAssignment_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1020:1: ( rule__ItemAttr__AttrsAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1020:2: rule__ItemAttr__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl2164);
            rule__ItemAttr__AttrsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAttrAccess().getAttrsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group__1__Impl"


    // $ANTLR start "rule__ItemAttr__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1030:1: rule__ItemAttr__Group__2 : rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 ;
    public final void rule__ItemAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1034:1: ( rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1035:2: rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__22194);
            rule__ItemAttr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__22197);
            rule__ItemAttr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group__2"


    // $ANTLR start "rule__ItemAttr__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1042:1: rule__ItemAttr__Group__2__Impl : ( ( rule__ItemAttr__Group_2__0 )* ) ;
    public final void rule__ItemAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1046:1: ( ( ( rule__ItemAttr__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1047:1: ( ( rule__ItemAttr__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1047:1: ( ( rule__ItemAttr__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1048:1: ( rule__ItemAttr__Group_2__0 )*
            {
             before(grammarAccess.getItemAttrAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1049:1: ( rule__ItemAttr__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1049:2: rule__ItemAttr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl2224);
            	    rule__ItemAttr__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getItemAttrAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group__2__Impl"


    // $ANTLR start "rule__ItemAttr__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1059:1: rule__ItemAttr__Group__3 : rule__ItemAttr__Group__3__Impl ;
    public final void rule__ItemAttr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1063:1: ( rule__ItemAttr__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1064:2: rule__ItemAttr__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__32255);
            rule__ItemAttr__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group__3"


    // $ANTLR start "rule__ItemAttr__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1070:1: rule__ItemAttr__Group__3__Impl : ( ']' ) ;
    public final void rule__ItemAttr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1074:1: ( ( ']' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1075:1: ( ']' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1075:1: ( ']' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1076:1: ']'
            {
             before(grammarAccess.getItemAttrAccess().getRightSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__ItemAttr__Group__3__Impl2283); 
             after(grammarAccess.getItemAttrAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group__3__Impl"


    // $ANTLR start "rule__ItemAttr__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1097:1: rule__ItemAttr__Group_2__0 : rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 ;
    public final void rule__ItemAttr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1101:1: ( rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1102:2: rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__02322);
            rule__ItemAttr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__02325);
            rule__ItemAttr__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group_2__0"


    // $ANTLR start "rule__ItemAttr__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1109:1: rule__ItemAttr__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ItemAttr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1113:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1114:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1114:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1115:1: ','
            {
             before(grammarAccess.getItemAttrAccess().getCommaKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__ItemAttr__Group_2__0__Impl2353); 
             after(grammarAccess.getItemAttrAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group_2__0__Impl"


    // $ANTLR start "rule__ItemAttr__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1128:1: rule__ItemAttr__Group_2__1 : rule__ItemAttr__Group_2__1__Impl ;
    public final void rule__ItemAttr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1132:1: ( rule__ItemAttr__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1133:2: rule__ItemAttr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__12384);
            rule__ItemAttr__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group_2__1"


    // $ANTLR start "rule__ItemAttr__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1139:1: rule__ItemAttr__Group_2__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) ;
    public final void rule__ItemAttr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1143:1: ( ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1144:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1144:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1145:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1146:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1146:2: rule__ItemAttr__AttrsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl2411);
            rule__ItemAttr__AttrsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAttrAccess().getAttrsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__Group_2__1__Impl"


    // $ANTLR start "rule__AttrWithList__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1160:1: rule__AttrWithList__Group__0 : rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 ;
    public final void rule__AttrWithList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1164:1: ( rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1165:2: rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__02445);
            rule__AttrWithList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__02448);
            rule__AttrWithList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__0"


    // $ANTLR start "rule__AttrWithList__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1172:1: rule__AttrWithList__Group__0__Impl : ( ( rule__AttrWithList__IdentAssignment_0 ) ) ;
    public final void rule__AttrWithList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1176:1: ( ( ( rule__AttrWithList__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1177:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1177:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1178:1: ( rule__AttrWithList__IdentAssignment_0 )
            {
             before(grammarAccess.getAttrWithListAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1179:1: ( rule__AttrWithList__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1179:2: rule__AttrWithList__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl2475);
            rule__AttrWithList__IdentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttrWithListAccess().getIdentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__0__Impl"


    // $ANTLR start "rule__AttrWithList__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1189:1: rule__AttrWithList__Group__1 : rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 ;
    public final void rule__AttrWithList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1193:1: ( rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1194:2: rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__12505);
            rule__AttrWithList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__12508);
            rule__AttrWithList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__1"


    // $ANTLR start "rule__AttrWithList__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1201:1: rule__AttrWithList__Group__1__Impl : ( '(' ) ;
    public final void rule__AttrWithList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1205:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1206:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1206:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1207:1: '('
            {
             before(grammarAccess.getAttrWithListAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__AttrWithList__Group__1__Impl2536); 
             after(grammarAccess.getAttrWithListAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__1__Impl"


    // $ANTLR start "rule__AttrWithList__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1220:1: rule__AttrWithList__Group__2 : rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 ;
    public final void rule__AttrWithList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1224:1: ( rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1225:2: rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__22567);
            rule__AttrWithList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__22570);
            rule__AttrWithList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__2"


    // $ANTLR start "rule__AttrWithList__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1232:1: rule__AttrWithList__Group__2__Impl : ( ( rule__AttrWithList__AttrsAssignment_2 ) ) ;
    public final void rule__AttrWithList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1236:1: ( ( ( rule__AttrWithList__AttrsAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1237:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1237:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1238:1: ( rule__AttrWithList__AttrsAssignment_2 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1239:1: ( rule__AttrWithList__AttrsAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1239:2: rule__AttrWithList__AttrsAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl2597);
            rule__AttrWithList__AttrsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttrWithListAccess().getAttrsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__2__Impl"


    // $ANTLR start "rule__AttrWithList__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1249:1: rule__AttrWithList__Group__3 : rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 ;
    public final void rule__AttrWithList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1253:1: ( rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1254:2: rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__32627);
            rule__AttrWithList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__32630);
            rule__AttrWithList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__3"


    // $ANTLR start "rule__AttrWithList__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1261:1: rule__AttrWithList__Group__3__Impl : ( ( rule__AttrWithList__Group_3__0 )* ) ;
    public final void rule__AttrWithList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1265:1: ( ( ( rule__AttrWithList__Group_3__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1266:1: ( ( rule__AttrWithList__Group_3__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1266:1: ( ( rule__AttrWithList__Group_3__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1267:1: ( rule__AttrWithList__Group_3__0 )*
            {
             before(grammarAccess.getAttrWithListAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1268:1: ( rule__AttrWithList__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1268:2: rule__AttrWithList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl2657);
            	    rule__AttrWithList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAttrWithListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__3__Impl"


    // $ANTLR start "rule__AttrWithList__Group__4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1278:1: rule__AttrWithList__Group__4 : rule__AttrWithList__Group__4__Impl ;
    public final void rule__AttrWithList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1282:1: ( rule__AttrWithList__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1283:2: rule__AttrWithList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__42688);
            rule__AttrWithList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__4"


    // $ANTLR start "rule__AttrWithList__Group__4__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1289:1: rule__AttrWithList__Group__4__Impl : ( ')' ) ;
    public final void rule__AttrWithList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1293:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1294:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1294:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1295:1: ')'
            {
             before(grammarAccess.getAttrWithListAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__AttrWithList__Group__4__Impl2716); 
             after(grammarAccess.getAttrWithListAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group__4__Impl"


    // $ANTLR start "rule__AttrWithList__Group_3__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1318:1: rule__AttrWithList__Group_3__0 : rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 ;
    public final void rule__AttrWithList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1322:1: ( rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1323:2: rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__02757);
            rule__AttrWithList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__02760);
            rule__AttrWithList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group_3__0"


    // $ANTLR start "rule__AttrWithList__Group_3__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1330:1: rule__AttrWithList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AttrWithList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1334:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1335:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1335:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1336:1: ','
            {
             before(grammarAccess.getAttrWithListAccess().getCommaKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__AttrWithList__Group_3__0__Impl2788); 
             after(grammarAccess.getAttrWithListAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group_3__0__Impl"


    // $ANTLR start "rule__AttrWithList__Group_3__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1349:1: rule__AttrWithList__Group_3__1 : rule__AttrWithList__Group_3__1__Impl ;
    public final void rule__AttrWithList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1353:1: ( rule__AttrWithList__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1354:2: rule__AttrWithList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__12819);
            rule__AttrWithList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group_3__1"


    // $ANTLR start "rule__AttrWithList__Group_3__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1360:1: rule__AttrWithList__Group_3__1__Impl : ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) ;
    public final void rule__AttrWithList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1364:1: ( ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1365:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1365:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1366:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1367:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1367:2: rule__AttrWithList__AttrsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl2846);
            rule__AttrWithList__AttrsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrWithListAccess().getAttrsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__Group_3__1__Impl"


    // $ANTLR start "rule__LiteralAttr__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1381:1: rule__LiteralAttr__Group__0 : rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 ;
    public final void rule__LiteralAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1385:1: ( rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1386:2: rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__02880);
            rule__LiteralAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__02883);
            rule__LiteralAttr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralAttr__Group__0"


    // $ANTLR start "rule__LiteralAttr__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1393:1: rule__LiteralAttr__Group__0__Impl : ( ( rule__LiteralAttr__IdentAssignment_0 ) ) ;
    public final void rule__LiteralAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1397:1: ( ( ( rule__LiteralAttr__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1398:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1398:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1399:1: ( rule__LiteralAttr__IdentAssignment_0 )
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1400:1: ( rule__LiteralAttr__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1400:2: rule__LiteralAttr__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl2910);
            rule__LiteralAttr__IdentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAttrAccess().getIdentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralAttr__Group__0__Impl"


    // $ANTLR start "rule__LiteralAttr__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1410:1: rule__LiteralAttr__Group__1 : rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 ;
    public final void rule__LiteralAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1414:1: ( rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1415:2: rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__12940);
            rule__LiteralAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__12943);
            rule__LiteralAttr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralAttr__Group__1"


    // $ANTLR start "rule__LiteralAttr__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1422:1: rule__LiteralAttr__Group__1__Impl : ( '=' ) ;
    public final void rule__LiteralAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1426:1: ( ( '=' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1427:1: ( '=' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1427:1: ( '=' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1428:1: '='
            {
             before(grammarAccess.getLiteralAttrAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__LiteralAttr__Group__1__Impl2971); 
             after(grammarAccess.getLiteralAttrAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralAttr__Group__1__Impl"


    // $ANTLR start "rule__LiteralAttr__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1441:1: rule__LiteralAttr__Group__2 : rule__LiteralAttr__Group__2__Impl ;
    public final void rule__LiteralAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1445:1: ( rule__LiteralAttr__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1446:2: rule__LiteralAttr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23002);
            rule__LiteralAttr__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralAttr__Group__2"


    // $ANTLR start "rule__LiteralAttr__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1452:1: rule__LiteralAttr__Group__2__Impl : ( ( rule__LiteralAttr__ValueAssignment_2 ) ) ;
    public final void rule__LiteralAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1456:1: ( ( ( rule__LiteralAttr__ValueAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1457:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1457:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1458:1: ( rule__LiteralAttr__ValueAssignment_2 )
            {
             before(grammarAccess.getLiteralAttrAccess().getValueAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1459:1: ( rule__LiteralAttr__ValueAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1459:2: rule__LiteralAttr__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3029);
            rule__LiteralAttr__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAttrAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralAttr__Group__2__Impl"


    // $ANTLR start "rule__ItemAndAttrs__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1475:1: rule__ItemAndAttrs__Group__0 : rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 ;
    public final void rule__ItemAndAttrs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1479:1: ( rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1480:2: rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03065);
            rule__ItemAndAttrs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03068);
            rule__ItemAndAttrs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAndAttrs__Group__0"


    // $ANTLR start "rule__ItemAndAttrs__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1487:1: rule__ItemAndAttrs__Group__0__Impl : ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) ;
    public final void rule__ItemAndAttrs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1491:1: ( ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1492:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1492:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1493:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1494:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1494:2: rule__ItemAndAttrs__AttrsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3095);
            	    rule__ItemAndAttrs__AttrsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getItemAndAttrsAccess().getAttrsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAndAttrs__Group__0__Impl"


    // $ANTLR start "rule__ItemAndAttrs__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1504:1: rule__ItemAndAttrs__Group__1 : rule__ItemAndAttrs__Group__1__Impl ;
    public final void rule__ItemAndAttrs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1508:1: ( rule__ItemAndAttrs__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1509:2: rule__ItemAndAttrs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13126);
            rule__ItemAndAttrs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAndAttrs__Group__1"


    // $ANTLR start "rule__ItemAndAttrs__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1515:1: rule__ItemAndAttrs__Group__1__Impl : ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) ;
    public final void rule__ItemAndAttrs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1519:1: ( ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1520:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1520:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1521:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1522:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1522:2: rule__ItemAndAttrs__ItemAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3153);
            rule__ItemAndAttrs__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAndAttrsAccess().getItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAndAttrs__Group__1__Impl"


    // $ANTLR start "rule__ModItem__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1536:1: rule__ModItem__Group__0 : rule__ModItem__Group__0__Impl rule__ModItem__Group__1 ;
    public final void rule__ModItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1540:1: ( rule__ModItem__Group__0__Impl rule__ModItem__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1541:2: rule__ModItem__Group__0__Impl rule__ModItem__Group__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__03187);
            rule__ModItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__03190);
            rule__ModItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group__0"


    // $ANTLR start "rule__ModItem__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1548:1: rule__ModItem__Group__0__Impl : ( 'mod' ) ;
    public final void rule__ModItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1552:1: ( ( 'mod' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1553:1: ( 'mod' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1553:1: ( 'mod' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1554:1: 'mod'
            {
             before(grammarAccess.getModItemAccess().getModKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ModItem__Group__0__Impl3218); 
             after(grammarAccess.getModItemAccess().getModKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group__0__Impl"


    // $ANTLR start "rule__ModItem__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1567:1: rule__ModItem__Group__1 : rule__ModItem__Group__1__Impl rule__ModItem__Group__2 ;
    public final void rule__ModItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1571:1: ( rule__ModItem__Group__1__Impl rule__ModItem__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1572:2: rule__ModItem__Group__1__Impl rule__ModItem__Group__2
            {
            pushFollow(FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__13249);
            rule__ModItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__13252);
            rule__ModItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group__1"


    // $ANTLR start "rule__ModItem__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1579:1: rule__ModItem__Group__1__Impl : ( ( rule__ModItem__IdentAssignment_1 ) ) ;
    public final void rule__ModItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1583:1: ( ( ( rule__ModItem__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1584:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1584:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1585:1: ( rule__ModItem__IdentAssignment_1 )
            {
             before(grammarAccess.getModItemAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1586:1: ( rule__ModItem__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1586:2: rule__ModItem__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl3279);
            rule__ModItem__IdentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModItemAccess().getIdentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group__1__Impl"


    // $ANTLR start "rule__ModItem__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1596:1: rule__ModItem__Group__2 : rule__ModItem__Group__2__Impl ;
    public final void rule__ModItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1600:1: ( rule__ModItem__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1601:2: rule__ModItem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__23309);
            rule__ModItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group__2"


    // $ANTLR start "rule__ModItem__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1607:1: rule__ModItem__Group__2__Impl : ( ( rule__ModItem__Alternatives_2 ) ) ;
    public final void rule__ModItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1611:1: ( ( ( rule__ModItem__Alternatives_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1612:1: ( ( rule__ModItem__Alternatives_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1612:1: ( ( rule__ModItem__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1613:1: ( rule__ModItem__Alternatives_2 )
            {
             before(grammarAccess.getModItemAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1614:1: ( rule__ModItem__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1614:2: rule__ModItem__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl3336);
            rule__ModItem__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getModItemAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group__2__Impl"


    // $ANTLR start "rule__ModItem__Group_2_1__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1630:1: rule__ModItem__Group_2_1__0 : rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 ;
    public final void rule__ModItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1634:1: ( rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1635:2: rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__03372);
            rule__ModItem__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__03375);
            rule__ModItem__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group_2_1__0"


    // $ANTLR start "rule__ModItem__Group_2_1__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1642:1: rule__ModItem__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__ModItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1646:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1647:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1647:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1648:1: '{'
            {
             before(grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,32,FOLLOW_32_in_rule__ModItem__Group_2_1__0__Impl3403); 
             after(grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group_2_1__0__Impl"


    // $ANTLR start "rule__ModItem__Group_2_1__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1661:1: rule__ModItem__Group_2_1__1 : rule__ModItem__Group_2_1__1__Impl ;
    public final void rule__ModItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1665:1: ( rule__ModItem__Group_2_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1666:2: rule__ModItem__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__13434);
            rule__ModItem__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group_2_1__1"


    // $ANTLR start "rule__ModItem__Group_2_1__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1672:1: rule__ModItem__Group_2_1__1__Impl : ( '}' ) ;
    public final void rule__ModItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1676:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1677:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1677:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1678:1: '}'
            {
             before(grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_1()); 
            match(input,33,FOLLOW_33_in_rule__ModItem__Group_2_1__1__Impl3462); 
             after(grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group_2_1__1__Impl"


    // $ANTLR start "rule__CharLit__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1695:1: rule__CharLit__Group__0 : rule__CharLit__Group__0__Impl rule__CharLit__Group__1 ;
    public final void rule__CharLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1699:1: ( rule__CharLit__Group__0__Impl rule__CharLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1700:2: rule__CharLit__Group__0__Impl rule__CharLit__Group__1
            {
            pushFollow(FOLLOW_rule__CharLit__Group__0__Impl_in_rule__CharLit__Group__03497);
            rule__CharLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharLit__Group__1_in_rule__CharLit__Group__03500);
            rule__CharLit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group__0"


    // $ANTLR start "rule__CharLit__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1707:1: rule__CharLit__Group__0__Impl : ( '\\'' ) ;
    public final void rule__CharLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1711:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1712:1: ( '\\'' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1712:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1713:1: '\\''
            {
             before(grammarAccess.getCharLitAccess().getApostropheKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__CharLit__Group__0__Impl3528); 
             after(grammarAccess.getCharLitAccess().getApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group__0__Impl"


    // $ANTLR start "rule__CharLit__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1726:1: rule__CharLit__Group__1 : rule__CharLit__Group__1__Impl rule__CharLit__Group__2 ;
    public final void rule__CharLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1730:1: ( rule__CharLit__Group__1__Impl rule__CharLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1731:2: rule__CharLit__Group__1__Impl rule__CharLit__Group__2
            {
            pushFollow(FOLLOW_rule__CharLit__Group__1__Impl_in_rule__CharLit__Group__13559);
            rule__CharLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharLit__Group__2_in_rule__CharLit__Group__13562);
            rule__CharLit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group__1"


    // $ANTLR start "rule__CharLit__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1738:1: rule__CharLit__Group__1__Impl : ( ( rule__CharLit__Alternatives_1 ) ) ;
    public final void rule__CharLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1742:1: ( ( ( rule__CharLit__Alternatives_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1743:1: ( ( rule__CharLit__Alternatives_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1743:1: ( ( rule__CharLit__Alternatives_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1744:1: ( rule__CharLit__Alternatives_1 )
            {
             before(grammarAccess.getCharLitAccess().getAlternatives_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1745:1: ( rule__CharLit__Alternatives_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1745:2: rule__CharLit__Alternatives_1
            {
            pushFollow(FOLLOW_rule__CharLit__Alternatives_1_in_rule__CharLit__Group__1__Impl3589);
            rule__CharLit__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCharLitAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group__1__Impl"


    // $ANTLR start "rule__CharLit__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1755:1: rule__CharLit__Group__2 : rule__CharLit__Group__2__Impl ;
    public final void rule__CharLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1759:1: ( rule__CharLit__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1760:2: rule__CharLit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CharLit__Group__2__Impl_in_rule__CharLit__Group__23619);
            rule__CharLit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group__2"


    // $ANTLR start "rule__CharLit__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1766:1: rule__CharLit__Group__2__Impl : ( '\\'' ) ;
    public final void rule__CharLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1770:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1771:1: ( '\\'' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1771:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1772:1: '\\''
            {
             before(grammarAccess.getCharLitAccess().getApostropheKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__CharLit__Group__2__Impl3647); 
             after(grammarAccess.getCharLitAccess().getApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group__2__Impl"


    // $ANTLR start "rule__CharLit__Group_1_1__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1791:1: rule__CharLit__Group_1_1__0 : rule__CharLit__Group_1_1__0__Impl rule__CharLit__Group_1_1__1 ;
    public final void rule__CharLit__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1795:1: ( rule__CharLit__Group_1_1__0__Impl rule__CharLit__Group_1_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1796:2: rule__CharLit__Group_1_1__0__Impl rule__CharLit__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CharLit__Group_1_1__0__Impl_in_rule__CharLit__Group_1_1__03684);
            rule__CharLit__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharLit__Group_1_1__1_in_rule__CharLit__Group_1_1__03687);
            rule__CharLit__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group_1_1__0"


    // $ANTLR start "rule__CharLit__Group_1_1__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1803:1: rule__CharLit__Group_1_1__0__Impl : ( '\\\\' ) ;
    public final void rule__CharLit__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1807:1: ( ( '\\\\' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1808:1: ( '\\\\' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1808:1: ( '\\\\' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1809:1: '\\\\'
            {
             before(grammarAccess.getCharLitAccess().getReverseSolidusKeyword_1_1_0()); 
            match(input,11,FOLLOW_11_in_rule__CharLit__Group_1_1__0__Impl3715); 
             after(grammarAccess.getCharLitAccess().getReverseSolidusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group_1_1__0__Impl"


    // $ANTLR start "rule__CharLit__Group_1_1__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1822:1: rule__CharLit__Group_1_1__1 : rule__CharLit__Group_1_1__1__Impl ;
    public final void rule__CharLit__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1826:1: ( rule__CharLit__Group_1_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1827:2: rule__CharLit__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CharLit__Group_1_1__1__Impl_in_rule__CharLit__Group_1_1__13746);
            rule__CharLit__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group_1_1__1"


    // $ANTLR start "rule__CharLit__Group_1_1__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1833:1: rule__CharLit__Group_1_1__1__Impl : ( ( rule__CharLit__Alternatives_1_1_1 ) ) ;
    public final void rule__CharLit__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1837:1: ( ( ( rule__CharLit__Alternatives_1_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1838:1: ( ( rule__CharLit__Alternatives_1_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1838:1: ( ( rule__CharLit__Alternatives_1_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1839:1: ( rule__CharLit__Alternatives_1_1_1 )
            {
             before(grammarAccess.getCharLitAccess().getAlternatives_1_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1840:1: ( rule__CharLit__Alternatives_1_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1840:2: rule__CharLit__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_rule__CharLit__Alternatives_1_1_1_in_rule__CharLit__Group_1_1__1__Impl3773);
            rule__CharLit__Alternatives_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCharLitAccess().getAlternatives_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group_1_1__1__Impl"


    // $ANTLR start "rule__EscapedChar__Group_0__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1854:1: rule__EscapedChar__Group_0__0 : rule__EscapedChar__Group_0__0__Impl rule__EscapedChar__Group_0__1 ;
    public final void rule__EscapedChar__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1858:1: ( rule__EscapedChar__Group_0__0__Impl rule__EscapedChar__Group_0__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1859:2: rule__EscapedChar__Group_0__0__Impl rule__EscapedChar__Group_0__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_0__0__Impl_in_rule__EscapedChar__Group_0__03807);
            rule__EscapedChar__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_0__1_in_rule__EscapedChar__Group_0__03810);
            rule__EscapedChar__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_0__0"


    // $ANTLR start "rule__EscapedChar__Group_0__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1866:1: rule__EscapedChar__Group_0__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1870:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1871:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1871:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1872:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getEscapedCharAction_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1873:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1875:1: 
            {
            }

             after(grammarAccess.getEscapedCharAccess().getEscapedCharAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_0__0__Impl"


    // $ANTLR start "rule__EscapedChar__Group_0__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1885:1: rule__EscapedChar__Group_0__1 : rule__EscapedChar__Group_0__1__Impl ;
    public final void rule__EscapedChar__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1889:1: ( rule__EscapedChar__Group_0__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1890:2: rule__EscapedChar__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_0__1__Impl_in_rule__EscapedChar__Group_0__13868);
            rule__EscapedChar__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_0__1"


    // $ANTLR start "rule__EscapedChar__Group_0__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1896:1: rule__EscapedChar__Group_0__1__Impl : ( ( rule__EscapedChar__CharAssignment_0_1 ) ) ;
    public final void rule__EscapedChar__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1900:1: ( ( ( rule__EscapedChar__CharAssignment_0_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1901:1: ( ( rule__EscapedChar__CharAssignment_0_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1901:1: ( ( rule__EscapedChar__CharAssignment_0_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1902:1: ( rule__EscapedChar__CharAssignment_0_1 )
            {
             before(grammarAccess.getEscapedCharAccess().getCharAssignment_0_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1903:1: ( rule__EscapedChar__CharAssignment_0_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1903:2: rule__EscapedChar__CharAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EscapedChar__CharAssignment_0_1_in_rule__EscapedChar__Group_0__1__Impl3895);
            rule__EscapedChar__CharAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getCharAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_0__1__Impl"


    // $ANTLR start "rule__EscapedChar__Group_1__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1917:1: rule__EscapedChar__Group_1__0 : rule__EscapedChar__Group_1__0__Impl rule__EscapedChar__Group_1__1 ;
    public final void rule__EscapedChar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1921:1: ( rule__EscapedChar__Group_1__0__Impl rule__EscapedChar__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1922:2: rule__EscapedChar__Group_1__0__Impl rule__EscapedChar__Group_1__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__0__Impl_in_rule__EscapedChar__Group_1__03929);
            rule__EscapedChar__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_1__1_in_rule__EscapedChar__Group_1__03932);
            rule__EscapedChar__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_1__0"


    // $ANTLR start "rule__EscapedChar__Group_1__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1929:1: rule__EscapedChar__Group_1__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1933:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1934:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1934:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1935:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1936:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1938:1: 
            {
            }

             after(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_1__0__Impl"


    // $ANTLR start "rule__EscapedChar__Group_1__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1948:1: rule__EscapedChar__Group_1__1 : rule__EscapedChar__Group_1__1__Impl rule__EscapedChar__Group_1__2 ;
    public final void rule__EscapedChar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1952:1: ( rule__EscapedChar__Group_1__1__Impl rule__EscapedChar__Group_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1953:2: rule__EscapedChar__Group_1__1__Impl rule__EscapedChar__Group_1__2
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__1__Impl_in_rule__EscapedChar__Group_1__13990);
            rule__EscapedChar__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_1__2_in_rule__EscapedChar__Group_1__13993);
            rule__EscapedChar__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_1__1"


    // $ANTLR start "rule__EscapedChar__Group_1__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1960:1: rule__EscapedChar__Group_1__1__Impl : ( 'x' ) ;
    public final void rule__EscapedChar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1964:1: ( ( 'x' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1965:1: ( 'x' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1965:1: ( 'x' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1966:1: 'x'
            {
             before(grammarAccess.getEscapedCharAccess().getXKeyword_1_1()); 
            match(input,35,FOLLOW_35_in_rule__EscapedChar__Group_1__1__Impl4021); 
             after(grammarAccess.getEscapedCharAccess().getXKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_1__1__Impl"


    // $ANTLR start "rule__EscapedChar__Group_1__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1979:1: rule__EscapedChar__Group_1__2 : rule__EscapedChar__Group_1__2__Impl rule__EscapedChar__Group_1__3 ;
    public final void rule__EscapedChar__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1983:1: ( rule__EscapedChar__Group_1__2__Impl rule__EscapedChar__Group_1__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1984:2: rule__EscapedChar__Group_1__2__Impl rule__EscapedChar__Group_1__3
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__2__Impl_in_rule__EscapedChar__Group_1__24052);
            rule__EscapedChar__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_1__3_in_rule__EscapedChar__Group_1__24055);
            rule__EscapedChar__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_1__2"


    // $ANTLR start "rule__EscapedChar__Group_1__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1991:1: rule__EscapedChar__Group_1__2__Impl : ( ( rule__EscapedChar__DigitsAssignment_1_2 ) ) ;
    public final void rule__EscapedChar__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1995:1: ( ( ( rule__EscapedChar__DigitsAssignment_1_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1996:1: ( ( rule__EscapedChar__DigitsAssignment_1_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1996:1: ( ( rule__EscapedChar__DigitsAssignment_1_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1997:1: ( rule__EscapedChar__DigitsAssignment_1_2 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1998:1: ( rule__EscapedChar__DigitsAssignment_1_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1998:2: rule__EscapedChar__DigitsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_1_2_in_rule__EscapedChar__Group_1__2__Impl4082);
            rule__EscapedChar__DigitsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_1__2__Impl"


    // $ANTLR start "rule__EscapedChar__Group_1__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2008:1: rule__EscapedChar__Group_1__3 : rule__EscapedChar__Group_1__3__Impl ;
    public final void rule__EscapedChar__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2012:1: ( rule__EscapedChar__Group_1__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2013:2: rule__EscapedChar__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__3__Impl_in_rule__EscapedChar__Group_1__34112);
            rule__EscapedChar__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_1__3"


    // $ANTLR start "rule__EscapedChar__Group_1__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2019:1: rule__EscapedChar__Group_1__3__Impl : ( ( rule__EscapedChar__DigitsAssignment_1_3 ) ) ;
    public final void rule__EscapedChar__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2023:1: ( ( ( rule__EscapedChar__DigitsAssignment_1_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2024:1: ( ( rule__EscapedChar__DigitsAssignment_1_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2024:1: ( ( rule__EscapedChar__DigitsAssignment_1_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2025:1: ( rule__EscapedChar__DigitsAssignment_1_3 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2026:1: ( rule__EscapedChar__DigitsAssignment_1_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2026:2: rule__EscapedChar__DigitsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_1_3_in_rule__EscapedChar__Group_1__3__Impl4139);
            rule__EscapedChar__DigitsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_1__3__Impl"


    // $ANTLR start "rule__EscapedChar__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2044:1: rule__EscapedChar__Group_2__0 : rule__EscapedChar__Group_2__0__Impl rule__EscapedChar__Group_2__1 ;
    public final void rule__EscapedChar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2048:1: ( rule__EscapedChar__Group_2__0__Impl rule__EscapedChar__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2049:2: rule__EscapedChar__Group_2__0__Impl rule__EscapedChar__Group_2__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__0__Impl_in_rule__EscapedChar__Group_2__04177);
            rule__EscapedChar__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__1_in_rule__EscapedChar__Group_2__04180);
            rule__EscapedChar__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__0"


    // $ANTLR start "rule__EscapedChar__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2056:1: rule__EscapedChar__Group_2__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2060:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2061:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2061:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2062:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_2_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2063:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2065:1: 
            {
            }

             after(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__0__Impl"


    // $ANTLR start "rule__EscapedChar__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2075:1: rule__EscapedChar__Group_2__1 : rule__EscapedChar__Group_2__1__Impl rule__EscapedChar__Group_2__2 ;
    public final void rule__EscapedChar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2079:1: ( rule__EscapedChar__Group_2__1__Impl rule__EscapedChar__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2080:2: rule__EscapedChar__Group_2__1__Impl rule__EscapedChar__Group_2__2
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__1__Impl_in_rule__EscapedChar__Group_2__14238);
            rule__EscapedChar__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__2_in_rule__EscapedChar__Group_2__14241);
            rule__EscapedChar__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__1"


    // $ANTLR start "rule__EscapedChar__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2087:1: rule__EscapedChar__Group_2__1__Impl : ( 'u' ) ;
    public final void rule__EscapedChar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2091:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2092:1: ( 'u' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2092:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2093:1: 'u'
            {
             before(grammarAccess.getEscapedCharAccess().getUKeyword_2_1()); 
            match(input,36,FOLLOW_36_in_rule__EscapedChar__Group_2__1__Impl4269); 
             after(grammarAccess.getEscapedCharAccess().getUKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__1__Impl"


    // $ANTLR start "rule__EscapedChar__Group_2__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2106:1: rule__EscapedChar__Group_2__2 : rule__EscapedChar__Group_2__2__Impl rule__EscapedChar__Group_2__3 ;
    public final void rule__EscapedChar__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2110:1: ( rule__EscapedChar__Group_2__2__Impl rule__EscapedChar__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2111:2: rule__EscapedChar__Group_2__2__Impl rule__EscapedChar__Group_2__3
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__2__Impl_in_rule__EscapedChar__Group_2__24300);
            rule__EscapedChar__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__3_in_rule__EscapedChar__Group_2__24303);
            rule__EscapedChar__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__2"


    // $ANTLR start "rule__EscapedChar__Group_2__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2118:1: rule__EscapedChar__Group_2__2__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_2 ) ) ;
    public final void rule__EscapedChar__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2122:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2123:1: ( ( rule__EscapedChar__DigitsAssignment_2_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2123:1: ( ( rule__EscapedChar__DigitsAssignment_2_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2124:1: ( rule__EscapedChar__DigitsAssignment_2_2 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2125:1: ( rule__EscapedChar__DigitsAssignment_2_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2125:2: rule__EscapedChar__DigitsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_2_in_rule__EscapedChar__Group_2__2__Impl4330);
            rule__EscapedChar__DigitsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__2__Impl"


    // $ANTLR start "rule__EscapedChar__Group_2__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2135:1: rule__EscapedChar__Group_2__3 : rule__EscapedChar__Group_2__3__Impl rule__EscapedChar__Group_2__4 ;
    public final void rule__EscapedChar__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2139:1: ( rule__EscapedChar__Group_2__3__Impl rule__EscapedChar__Group_2__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2140:2: rule__EscapedChar__Group_2__3__Impl rule__EscapedChar__Group_2__4
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__3__Impl_in_rule__EscapedChar__Group_2__34360);
            rule__EscapedChar__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__4_in_rule__EscapedChar__Group_2__34363);
            rule__EscapedChar__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__3"


    // $ANTLR start "rule__EscapedChar__Group_2__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2147:1: rule__EscapedChar__Group_2__3__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_3 ) ) ;
    public final void rule__EscapedChar__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2151:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2152:1: ( ( rule__EscapedChar__DigitsAssignment_2_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2152:1: ( ( rule__EscapedChar__DigitsAssignment_2_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2153:1: ( rule__EscapedChar__DigitsAssignment_2_3 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2154:1: ( rule__EscapedChar__DigitsAssignment_2_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2154:2: rule__EscapedChar__DigitsAssignment_2_3
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_3_in_rule__EscapedChar__Group_2__3__Impl4390);
            rule__EscapedChar__DigitsAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__3__Impl"


    // $ANTLR start "rule__EscapedChar__Group_2__4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2164:1: rule__EscapedChar__Group_2__4 : rule__EscapedChar__Group_2__4__Impl rule__EscapedChar__Group_2__5 ;
    public final void rule__EscapedChar__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2168:1: ( rule__EscapedChar__Group_2__4__Impl rule__EscapedChar__Group_2__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2169:2: rule__EscapedChar__Group_2__4__Impl rule__EscapedChar__Group_2__5
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__4__Impl_in_rule__EscapedChar__Group_2__44420);
            rule__EscapedChar__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__5_in_rule__EscapedChar__Group_2__44423);
            rule__EscapedChar__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__4"


    // $ANTLR start "rule__EscapedChar__Group_2__4__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2176:1: rule__EscapedChar__Group_2__4__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_4 ) ) ;
    public final void rule__EscapedChar__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2180:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2181:1: ( ( rule__EscapedChar__DigitsAssignment_2_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2181:1: ( ( rule__EscapedChar__DigitsAssignment_2_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2182:1: ( rule__EscapedChar__DigitsAssignment_2_4 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2183:1: ( rule__EscapedChar__DigitsAssignment_2_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2183:2: rule__EscapedChar__DigitsAssignment_2_4
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_4_in_rule__EscapedChar__Group_2__4__Impl4450);
            rule__EscapedChar__DigitsAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__4__Impl"


    // $ANTLR start "rule__EscapedChar__Group_2__5"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2193:1: rule__EscapedChar__Group_2__5 : rule__EscapedChar__Group_2__5__Impl ;
    public final void rule__EscapedChar__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2197:1: ( rule__EscapedChar__Group_2__5__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2198:2: rule__EscapedChar__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__5__Impl_in_rule__EscapedChar__Group_2__54480);
            rule__EscapedChar__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__5"


    // $ANTLR start "rule__EscapedChar__Group_2__5__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2204:1: rule__EscapedChar__Group_2__5__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_5 ) ) ;
    public final void rule__EscapedChar__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2208:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_5 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2209:1: ( ( rule__EscapedChar__DigitsAssignment_2_5 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2209:1: ( ( rule__EscapedChar__DigitsAssignment_2_5 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2210:1: ( rule__EscapedChar__DigitsAssignment_2_5 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2211:1: ( rule__EscapedChar__DigitsAssignment_2_5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2211:2: rule__EscapedChar__DigitsAssignment_2_5
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_5_in_rule__EscapedChar__Group_2__5__Impl4507);
            rule__EscapedChar__DigitsAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_2__5__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2233:1: rule__EscapedChar__Group_3__0 : rule__EscapedChar__Group_3__0__Impl rule__EscapedChar__Group_3__1 ;
    public final void rule__EscapedChar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2237:1: ( rule__EscapedChar__Group_3__0__Impl rule__EscapedChar__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2238:2: rule__EscapedChar__Group_3__0__Impl rule__EscapedChar__Group_3__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__0__Impl_in_rule__EscapedChar__Group_3__04549);
            rule__EscapedChar__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__1_in_rule__EscapedChar__Group_3__04552);
            rule__EscapedChar__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__0"


    // $ANTLR start "rule__EscapedChar__Group_3__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2245:1: rule__EscapedChar__Group_3__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2249:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2250:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2250:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2251:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2252:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2254:1: 
            {
            }

             after(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__0__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2264:1: rule__EscapedChar__Group_3__1 : rule__EscapedChar__Group_3__1__Impl rule__EscapedChar__Group_3__2 ;
    public final void rule__EscapedChar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2268:1: ( rule__EscapedChar__Group_3__1__Impl rule__EscapedChar__Group_3__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2269:2: rule__EscapedChar__Group_3__1__Impl rule__EscapedChar__Group_3__2
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__1__Impl_in_rule__EscapedChar__Group_3__14610);
            rule__EscapedChar__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__2_in_rule__EscapedChar__Group_3__14613);
            rule__EscapedChar__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__1"


    // $ANTLR start "rule__EscapedChar__Group_3__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2276:1: rule__EscapedChar__Group_3__1__Impl : ( 'U' ) ;
    public final void rule__EscapedChar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2280:1: ( ( 'U' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2281:1: ( 'U' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2281:1: ( 'U' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2282:1: 'U'
            {
             before(grammarAccess.getEscapedCharAccess().getUKeyword_3_1()); 
            match(input,37,FOLLOW_37_in_rule__EscapedChar__Group_3__1__Impl4641); 
             after(grammarAccess.getEscapedCharAccess().getUKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__1__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2295:1: rule__EscapedChar__Group_3__2 : rule__EscapedChar__Group_3__2__Impl rule__EscapedChar__Group_3__3 ;
    public final void rule__EscapedChar__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2299:1: ( rule__EscapedChar__Group_3__2__Impl rule__EscapedChar__Group_3__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2300:2: rule__EscapedChar__Group_3__2__Impl rule__EscapedChar__Group_3__3
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__2__Impl_in_rule__EscapedChar__Group_3__24672);
            rule__EscapedChar__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__3_in_rule__EscapedChar__Group_3__24675);
            rule__EscapedChar__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__2"


    // $ANTLR start "rule__EscapedChar__Group_3__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2307:1: rule__EscapedChar__Group_3__2__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_2 ) ) ;
    public final void rule__EscapedChar__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2311:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2312:1: ( ( rule__EscapedChar__DigitsAssignment_3_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2312:1: ( ( rule__EscapedChar__DigitsAssignment_3_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2313:1: ( rule__EscapedChar__DigitsAssignment_3_2 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2314:1: ( rule__EscapedChar__DigitsAssignment_3_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2314:2: rule__EscapedChar__DigitsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_2_in_rule__EscapedChar__Group_3__2__Impl4702);
            rule__EscapedChar__DigitsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__2__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2324:1: rule__EscapedChar__Group_3__3 : rule__EscapedChar__Group_3__3__Impl rule__EscapedChar__Group_3__4 ;
    public final void rule__EscapedChar__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2328:1: ( rule__EscapedChar__Group_3__3__Impl rule__EscapedChar__Group_3__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2329:2: rule__EscapedChar__Group_3__3__Impl rule__EscapedChar__Group_3__4
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__3__Impl_in_rule__EscapedChar__Group_3__34732);
            rule__EscapedChar__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__4_in_rule__EscapedChar__Group_3__34735);
            rule__EscapedChar__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__3"


    // $ANTLR start "rule__EscapedChar__Group_3__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2336:1: rule__EscapedChar__Group_3__3__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_3 ) ) ;
    public final void rule__EscapedChar__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2340:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2341:1: ( ( rule__EscapedChar__DigitsAssignment_3_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2341:1: ( ( rule__EscapedChar__DigitsAssignment_3_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2342:1: ( rule__EscapedChar__DigitsAssignment_3_3 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2343:1: ( rule__EscapedChar__DigitsAssignment_3_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2343:2: rule__EscapedChar__DigitsAssignment_3_3
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_3_in_rule__EscapedChar__Group_3__3__Impl4762);
            rule__EscapedChar__DigitsAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__3__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2353:1: rule__EscapedChar__Group_3__4 : rule__EscapedChar__Group_3__4__Impl rule__EscapedChar__Group_3__5 ;
    public final void rule__EscapedChar__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2357:1: ( rule__EscapedChar__Group_3__4__Impl rule__EscapedChar__Group_3__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2358:2: rule__EscapedChar__Group_3__4__Impl rule__EscapedChar__Group_3__5
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__4__Impl_in_rule__EscapedChar__Group_3__44792);
            rule__EscapedChar__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__5_in_rule__EscapedChar__Group_3__44795);
            rule__EscapedChar__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__4"


    // $ANTLR start "rule__EscapedChar__Group_3__4__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2365:1: rule__EscapedChar__Group_3__4__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_4 ) ) ;
    public final void rule__EscapedChar__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2369:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2370:1: ( ( rule__EscapedChar__DigitsAssignment_3_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2370:1: ( ( rule__EscapedChar__DigitsAssignment_3_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2371:1: ( rule__EscapedChar__DigitsAssignment_3_4 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2372:1: ( rule__EscapedChar__DigitsAssignment_3_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2372:2: rule__EscapedChar__DigitsAssignment_3_4
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_4_in_rule__EscapedChar__Group_3__4__Impl4822);
            rule__EscapedChar__DigitsAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__4__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__5"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2382:1: rule__EscapedChar__Group_3__5 : rule__EscapedChar__Group_3__5__Impl rule__EscapedChar__Group_3__6 ;
    public final void rule__EscapedChar__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2386:1: ( rule__EscapedChar__Group_3__5__Impl rule__EscapedChar__Group_3__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2387:2: rule__EscapedChar__Group_3__5__Impl rule__EscapedChar__Group_3__6
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__5__Impl_in_rule__EscapedChar__Group_3__54852);
            rule__EscapedChar__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__6_in_rule__EscapedChar__Group_3__54855);
            rule__EscapedChar__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__5"


    // $ANTLR start "rule__EscapedChar__Group_3__5__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2394:1: rule__EscapedChar__Group_3__5__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_5 ) ) ;
    public final void rule__EscapedChar__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2398:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_5 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2399:1: ( ( rule__EscapedChar__DigitsAssignment_3_5 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2399:1: ( ( rule__EscapedChar__DigitsAssignment_3_5 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2400:1: ( rule__EscapedChar__DigitsAssignment_3_5 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2401:1: ( rule__EscapedChar__DigitsAssignment_3_5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2401:2: rule__EscapedChar__DigitsAssignment_3_5
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_5_in_rule__EscapedChar__Group_3__5__Impl4882);
            rule__EscapedChar__DigitsAssignment_3_5();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__5__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__6"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2411:1: rule__EscapedChar__Group_3__6 : rule__EscapedChar__Group_3__6__Impl rule__EscapedChar__Group_3__7 ;
    public final void rule__EscapedChar__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2415:1: ( rule__EscapedChar__Group_3__6__Impl rule__EscapedChar__Group_3__7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2416:2: rule__EscapedChar__Group_3__6__Impl rule__EscapedChar__Group_3__7
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__6__Impl_in_rule__EscapedChar__Group_3__64912);
            rule__EscapedChar__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__7_in_rule__EscapedChar__Group_3__64915);
            rule__EscapedChar__Group_3__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__6"


    // $ANTLR start "rule__EscapedChar__Group_3__6__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2423:1: rule__EscapedChar__Group_3__6__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_6 ) ) ;
    public final void rule__EscapedChar__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2427:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_6 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2428:1: ( ( rule__EscapedChar__DigitsAssignment_3_6 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2428:1: ( ( rule__EscapedChar__DigitsAssignment_3_6 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2429:1: ( rule__EscapedChar__DigitsAssignment_3_6 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_6()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2430:1: ( rule__EscapedChar__DigitsAssignment_3_6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2430:2: rule__EscapedChar__DigitsAssignment_3_6
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_6_in_rule__EscapedChar__Group_3__6__Impl4942);
            rule__EscapedChar__DigitsAssignment_3_6();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__6__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__7"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2440:1: rule__EscapedChar__Group_3__7 : rule__EscapedChar__Group_3__7__Impl rule__EscapedChar__Group_3__8 ;
    public final void rule__EscapedChar__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2444:1: ( rule__EscapedChar__Group_3__7__Impl rule__EscapedChar__Group_3__8 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2445:2: rule__EscapedChar__Group_3__7__Impl rule__EscapedChar__Group_3__8
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__7__Impl_in_rule__EscapedChar__Group_3__74972);
            rule__EscapedChar__Group_3__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__8_in_rule__EscapedChar__Group_3__74975);
            rule__EscapedChar__Group_3__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__7"


    // $ANTLR start "rule__EscapedChar__Group_3__7__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2452:1: rule__EscapedChar__Group_3__7__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_7 ) ) ;
    public final void rule__EscapedChar__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2456:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_7 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2457:1: ( ( rule__EscapedChar__DigitsAssignment_3_7 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2457:1: ( ( rule__EscapedChar__DigitsAssignment_3_7 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2458:1: ( rule__EscapedChar__DigitsAssignment_3_7 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_7()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2459:1: ( rule__EscapedChar__DigitsAssignment_3_7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2459:2: rule__EscapedChar__DigitsAssignment_3_7
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_7_in_rule__EscapedChar__Group_3__7__Impl5002);
            rule__EscapedChar__DigitsAssignment_3_7();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__7__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__8"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2469:1: rule__EscapedChar__Group_3__8 : rule__EscapedChar__Group_3__8__Impl rule__EscapedChar__Group_3__9 ;
    public final void rule__EscapedChar__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2473:1: ( rule__EscapedChar__Group_3__8__Impl rule__EscapedChar__Group_3__9 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2474:2: rule__EscapedChar__Group_3__8__Impl rule__EscapedChar__Group_3__9
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__8__Impl_in_rule__EscapedChar__Group_3__85032);
            rule__EscapedChar__Group_3__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__9_in_rule__EscapedChar__Group_3__85035);
            rule__EscapedChar__Group_3__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__8"


    // $ANTLR start "rule__EscapedChar__Group_3__8__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2481:1: rule__EscapedChar__Group_3__8__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_8 ) ) ;
    public final void rule__EscapedChar__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2485:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_8 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2486:1: ( ( rule__EscapedChar__DigitsAssignment_3_8 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2486:1: ( ( rule__EscapedChar__DigitsAssignment_3_8 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2487:1: ( rule__EscapedChar__DigitsAssignment_3_8 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_8()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2488:1: ( rule__EscapedChar__DigitsAssignment_3_8 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2488:2: rule__EscapedChar__DigitsAssignment_3_8
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_8_in_rule__EscapedChar__Group_3__8__Impl5062);
            rule__EscapedChar__DigitsAssignment_3_8();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__8__Impl"


    // $ANTLR start "rule__EscapedChar__Group_3__9"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2498:1: rule__EscapedChar__Group_3__9 : rule__EscapedChar__Group_3__9__Impl ;
    public final void rule__EscapedChar__Group_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2502:1: ( rule__EscapedChar__Group_3__9__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2503:2: rule__EscapedChar__Group_3__9__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__9__Impl_in_rule__EscapedChar__Group_3__95092);
            rule__EscapedChar__Group_3__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__9"


    // $ANTLR start "rule__EscapedChar__Group_3__9__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2509:1: rule__EscapedChar__Group_3__9__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_9 ) ) ;
    public final void rule__EscapedChar__Group_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2513:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_9 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2514:1: ( ( rule__EscapedChar__DigitsAssignment_3_9 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2514:1: ( ( rule__EscapedChar__DigitsAssignment_3_9 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2515:1: ( rule__EscapedChar__DigitsAssignment_3_9 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_9()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2516:1: ( rule__EscapedChar__DigitsAssignment_3_9 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2516:2: rule__EscapedChar__DigitsAssignment_3_9
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_9_in_rule__EscapedChar__Group_3__9__Impl5119);
            rule__EscapedChar__DigitsAssignment_3_9();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__Group_3__9__Impl"


    // $ANTLR start "rule__FloatLit__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2546:1: rule__FloatLit__Group__0 : rule__FloatLit__Group__0__Impl rule__FloatLit__Group__1 ;
    public final void rule__FloatLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2550:1: ( rule__FloatLit__Group__0__Impl rule__FloatLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2551:2: rule__FloatLit__Group__0__Impl rule__FloatLit__Group__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__0__Impl_in_rule__FloatLit__Group__05169);
            rule__FloatLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__1_in_rule__FloatLit__Group__05172);
            rule__FloatLit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__0"


    // $ANTLR start "rule__FloatLit__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2558:1: rule__FloatLit__Group__0__Impl : ( ( rule__FloatLit__DigitsAssignment_0 ) ) ;
    public final void rule__FloatLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2562:1: ( ( ( rule__FloatLit__DigitsAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2563:1: ( ( rule__FloatLit__DigitsAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2563:1: ( ( rule__FloatLit__DigitsAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2564:1: ( rule__FloatLit__DigitsAssignment_0 )
            {
             before(grammarAccess.getFloatLitAccess().getDigitsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2565:1: ( rule__FloatLit__DigitsAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2565:2: rule__FloatLit__DigitsAssignment_0
            {
            pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_0_in_rule__FloatLit__Group__0__Impl5199);
            rule__FloatLit__DigitsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getDigitsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__0__Impl"


    // $ANTLR start "rule__FloatLit__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2575:1: rule__FloatLit__Group__1 : rule__FloatLit__Group__1__Impl rule__FloatLit__Group__2 ;
    public final void rule__FloatLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2579:1: ( rule__FloatLit__Group__1__Impl rule__FloatLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2580:2: rule__FloatLit__Group__1__Impl rule__FloatLit__Group__2
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__1__Impl_in_rule__FloatLit__Group__15229);
            rule__FloatLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__2_in_rule__FloatLit__Group__15232);
            rule__FloatLit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__1"


    // $ANTLR start "rule__FloatLit__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2587:1: rule__FloatLit__Group__1__Impl : ( ( rule__FloatLit__Alternatives_1 )* ) ;
    public final void rule__FloatLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2591:1: ( ( ( rule__FloatLit__Alternatives_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2592:1: ( ( rule__FloatLit__Alternatives_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2592:1: ( ( rule__FloatLit__Alternatives_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2593:1: ( rule__FloatLit__Alternatives_1 )*
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2594:1: ( rule__FloatLit__Alternatives_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DEC_DIGIT||LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2594:2: rule__FloatLit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__FloatLit__Alternatives_1_in_rule__FloatLit__Group__1__Impl5259);
            	    rule__FloatLit__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getFloatLitAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__1__Impl"


    // $ANTLR start "rule__FloatLit__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2604:1: rule__FloatLit__Group__2 : rule__FloatLit__Group__2__Impl rule__FloatLit__Group__3 ;
    public final void rule__FloatLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2608:1: ( rule__FloatLit__Group__2__Impl rule__FloatLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2609:2: rule__FloatLit__Group__2__Impl rule__FloatLit__Group__3
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__2__Impl_in_rule__FloatLit__Group__25290);
            rule__FloatLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__3_in_rule__FloatLit__Group__25293);
            rule__FloatLit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__2"


    // $ANTLR start "rule__FloatLit__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2616:1: rule__FloatLit__Group__2__Impl : ( ( rule__FloatLit__Group_2__0 ) ) ;
    public final void rule__FloatLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2620:1: ( ( ( rule__FloatLit__Group_2__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2621:1: ( ( rule__FloatLit__Group_2__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2621:1: ( ( rule__FloatLit__Group_2__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2622:1: ( rule__FloatLit__Group_2__0 )
            {
             before(grammarAccess.getFloatLitAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2623:1: ( rule__FloatLit__Group_2__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2623:2: rule__FloatLit__Group_2__0
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_2__0_in_rule__FloatLit__Group__2__Impl5320);
            rule__FloatLit__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__2__Impl"


    // $ANTLR start "rule__FloatLit__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2633:1: rule__FloatLit__Group__3 : rule__FloatLit__Group__3__Impl rule__FloatLit__Group__4 ;
    public final void rule__FloatLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2637:1: ( rule__FloatLit__Group__3__Impl rule__FloatLit__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2638:2: rule__FloatLit__Group__3__Impl rule__FloatLit__Group__4
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__3__Impl_in_rule__FloatLit__Group__35350);
            rule__FloatLit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__4_in_rule__FloatLit__Group__35353);
            rule__FloatLit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__3"


    // $ANTLR start "rule__FloatLit__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2645:1: rule__FloatLit__Group__3__Impl : ( ( rule__FloatLit__Group_3__0 )? ) ;
    public final void rule__FloatLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2649:1: ( ( ( rule__FloatLit__Group_3__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2650:1: ( ( rule__FloatLit__Group_3__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2650:1: ( ( rule__FloatLit__Group_3__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2651:1: ( rule__FloatLit__Group_3__0 )?
            {
             before(grammarAccess.getFloatLitAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2652:1: ( rule__FloatLit__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=17 && LA23_0<=18)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2652:2: rule__FloatLit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__Group_3__0_in_rule__FloatLit__Group__3__Impl5380);
                    rule__FloatLit__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatLitAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__3__Impl"


    // $ANTLR start "rule__FloatLit__Group__4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2662:1: rule__FloatLit__Group__4 : rule__FloatLit__Group__4__Impl ;
    public final void rule__FloatLit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2666:1: ( rule__FloatLit__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2667:2: rule__FloatLit__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__4__Impl_in_rule__FloatLit__Group__45411);
            rule__FloatLit__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__4"


    // $ANTLR start "rule__FloatLit__Group__4__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2673:1: rule__FloatLit__Group__4__Impl : ( ( rule__FloatLit__Group_4__0 )? ) ;
    public final void rule__FloatLit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2677:1: ( ( ( rule__FloatLit__Group_4__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2678:1: ( ( rule__FloatLit__Group_4__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2678:1: ( ( rule__FloatLit__Group_4__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2679:1: ( rule__FloatLit__Group_4__0 )?
            {
             before(grammarAccess.getFloatLitAccess().getGroup_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2680:1: ( rule__FloatLit__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2680:2: rule__FloatLit__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__Group_4__0_in_rule__FloatLit__Group__4__Impl5438);
                    rule__FloatLit__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatLitAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group__4__Impl"


    // $ANTLR start "rule__FloatLit__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2700:1: rule__FloatLit__Group_2__0 : rule__FloatLit__Group_2__0__Impl rule__FloatLit__Group_2__1 ;
    public final void rule__FloatLit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2704:1: ( rule__FloatLit__Group_2__0__Impl rule__FloatLit__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2705:2: rule__FloatLit__Group_2__0__Impl rule__FloatLit__Group_2__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_2__0__Impl_in_rule__FloatLit__Group_2__05479);
            rule__FloatLit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_2__1_in_rule__FloatLit__Group_2__05482);
            rule__FloatLit__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_2__0"


    // $ANTLR start "rule__FloatLit__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2712:1: rule__FloatLit__Group_2__0__Impl : ( '.' ) ;
    public final void rule__FloatLit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2716:1: ( ( '.' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2717:1: ( '.' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2717:1: ( '.' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2718:1: '.'
            {
             before(grammarAccess.getFloatLitAccess().getFullStopKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__FloatLit__Group_2__0__Impl5510); 
             after(grammarAccess.getFloatLitAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_2__0__Impl"


    // $ANTLR start "rule__FloatLit__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2731:1: rule__FloatLit__Group_2__1 : rule__FloatLit__Group_2__1__Impl ;
    public final void rule__FloatLit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2735:1: ( rule__FloatLit__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2736:2: rule__FloatLit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_2__1__Impl_in_rule__FloatLit__Group_2__15541);
            rule__FloatLit__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_2__1"


    // $ANTLR start "rule__FloatLit__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2742:1: rule__FloatLit__Group_2__1__Impl : ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) ) ;
    public final void rule__FloatLit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2746:1: ( ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2747:1: ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2747:1: ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2748:1: ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2748:1: ( ( rule__FloatLit__Alternatives_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2749:1: ( rule__FloatLit__Alternatives_2_1 )
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2750:1: ( rule__FloatLit__Alternatives_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2750:2: rule__FloatLit__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl5570);
            rule__FloatLit__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2753:1: ( ( rule__FloatLit__Alternatives_2_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2754:1: ( rule__FloatLit__Alternatives_2_1 )*
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2755:1: ( rule__FloatLit__Alternatives_2_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DEC_DIGIT||LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2755:2: rule__FloatLit__Alternatives_2_1
            	    {
            	    pushFollow(FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl5582);
            	    rule__FloatLit__Alternatives_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_2__1__Impl"


    // $ANTLR start "rule__FloatLit__Group_3__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2770:1: rule__FloatLit__Group_3__0 : rule__FloatLit__Group_3__0__Impl rule__FloatLit__Group_3__1 ;
    public final void rule__FloatLit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2774:1: ( rule__FloatLit__Group_3__0__Impl rule__FloatLit__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2775:2: rule__FloatLit__Group_3__0__Impl rule__FloatLit__Group_3__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_3__0__Impl_in_rule__FloatLit__Group_3__05619);
            rule__FloatLit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_3__1_in_rule__FloatLit__Group_3__05622);
            rule__FloatLit__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_3__0"


    // $ANTLR start "rule__FloatLit__Group_3__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2782:1: rule__FloatLit__Group_3__0__Impl : ( ( rule__FloatLit__Alternatives_3_0 ) ) ;
    public final void rule__FloatLit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2786:1: ( ( ( rule__FloatLit__Alternatives_3_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2787:1: ( ( rule__FloatLit__Alternatives_3_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2787:1: ( ( rule__FloatLit__Alternatives_3_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2788:1: ( rule__FloatLit__Alternatives_3_0 )
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2789:1: ( rule__FloatLit__Alternatives_3_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2789:2: rule__FloatLit__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_0_in_rule__FloatLit__Group_3__0__Impl5649);
            rule__FloatLit__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_3__0__Impl"


    // $ANTLR start "rule__FloatLit__Group_3__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2799:1: rule__FloatLit__Group_3__1 : rule__FloatLit__Group_3__1__Impl rule__FloatLit__Group_3__2 ;
    public final void rule__FloatLit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2803:1: ( rule__FloatLit__Group_3__1__Impl rule__FloatLit__Group_3__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2804:2: rule__FloatLit__Group_3__1__Impl rule__FloatLit__Group_3__2
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_3__1__Impl_in_rule__FloatLit__Group_3__15679);
            rule__FloatLit__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_3__2_in_rule__FloatLit__Group_3__15682);
            rule__FloatLit__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_3__1"


    // $ANTLR start "rule__FloatLit__Group_3__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2811:1: rule__FloatLit__Group_3__1__Impl : ( ( rule__FloatLit__Alternatives_3_1 )? ) ;
    public final void rule__FloatLit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2815:1: ( ( ( rule__FloatLit__Alternatives_3_1 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2816:1: ( ( rule__FloatLit__Alternatives_3_1 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2816:1: ( ( rule__FloatLit__Alternatives_3_1 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2817:1: ( rule__FloatLit__Alternatives_3_1 )?
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2818:1: ( rule__FloatLit__Alternatives_3_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19||LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2818:2: rule__FloatLit__Alternatives_3_1
                    {
                    pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_1_in_rule__FloatLit__Group_3__1__Impl5709);
                    rule__FloatLit__Alternatives_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatLitAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_3__1__Impl"


    // $ANTLR start "rule__FloatLit__Group_3__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2828:1: rule__FloatLit__Group_3__2 : rule__FloatLit__Group_3__2__Impl ;
    public final void rule__FloatLit__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2832:1: ( rule__FloatLit__Group_3__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2833:2: rule__FloatLit__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_3__2__Impl_in_rule__FloatLit__Group_3__25740);
            rule__FloatLit__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_3__2"


    // $ANTLR start "rule__FloatLit__Group_3__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2839:1: rule__FloatLit__Group_3__2__Impl : ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) ) ;
    public final void rule__FloatLit__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2843:1: ( ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2844:1: ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2844:1: ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2845:1: ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2845:1: ( ( rule__FloatLit__Alternatives_3_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2846:1: ( rule__FloatLit__Alternatives_3_2 )
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2847:1: ( rule__FloatLit__Alternatives_3_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2847:2: rule__FloatLit__Alternatives_3_2
            {
            pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl5769);
            rule__FloatLit__Alternatives_3_2();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2850:1: ( ( rule__FloatLit__Alternatives_3_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2851:1: ( rule__FloatLit__Alternatives_3_2 )*
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2852:1: ( rule__FloatLit__Alternatives_3_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DEC_DIGIT||LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2852:2: rule__FloatLit__Alternatives_3_2
            	    {
            	    pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl5781);
            	    rule__FloatLit__Alternatives_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_3__2__Impl"


    // $ANTLR start "rule__FloatLit__Group_4__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2869:1: rule__FloatLit__Group_4__0 : rule__FloatLit__Group_4__0__Impl rule__FloatLit__Group_4__1 ;
    public final void rule__FloatLit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2873:1: ( rule__FloatLit__Group_4__0__Impl rule__FloatLit__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2874:2: rule__FloatLit__Group_4__0__Impl rule__FloatLit__Group_4__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_4__0__Impl_in_rule__FloatLit__Group_4__05820);
            rule__FloatLit__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_4__1_in_rule__FloatLit__Group_4__05823);
            rule__FloatLit__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_4__0"


    // $ANTLR start "rule__FloatLit__Group_4__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2881:1: rule__FloatLit__Group_4__0__Impl : ( 'f' ) ;
    public final void rule__FloatLit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2885:1: ( ( 'f' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2886:1: ( 'f' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2886:1: ( 'f' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2887:1: 'f'
            {
             before(grammarAccess.getFloatLitAccess().getFKeyword_4_0()); 
            match(input,39,FOLLOW_39_in_rule__FloatLit__Group_4__0__Impl5851); 
             after(grammarAccess.getFloatLitAccess().getFKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_4__0__Impl"


    // $ANTLR start "rule__FloatLit__Group_4__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2900:1: rule__FloatLit__Group_4__1 : rule__FloatLit__Group_4__1__Impl ;
    public final void rule__FloatLit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2904:1: ( rule__FloatLit__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2905:2: rule__FloatLit__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_4__1__Impl_in_rule__FloatLit__Group_4__15882);
            rule__FloatLit__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_4__1"


    // $ANTLR start "rule__FloatLit__Group_4__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2911:1: rule__FloatLit__Group_4__1__Impl : ( ( rule__FloatLit__SizeAssignment_4_1 ) ) ;
    public final void rule__FloatLit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2915:1: ( ( ( rule__FloatLit__SizeAssignment_4_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2916:1: ( ( rule__FloatLit__SizeAssignment_4_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2916:1: ( ( rule__FloatLit__SizeAssignment_4_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2917:1: ( rule__FloatLit__SizeAssignment_4_1 )
            {
             before(grammarAccess.getFloatLitAccess().getSizeAssignment_4_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2918:1: ( rule__FloatLit__SizeAssignment_4_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2918:2: rule__FloatLit__SizeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FloatLit__SizeAssignment_4_1_in_rule__FloatLit__Group_4__1__Impl5909);
            rule__FloatLit__SizeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getSizeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__Group_4__1__Impl"


    // $ANTLR start "rule__DecIntLit__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2932:1: rule__DecIntLit__Group__0 : rule__DecIntLit__Group__0__Impl rule__DecIntLit__Group__1 ;
    public final void rule__DecIntLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2936:1: ( rule__DecIntLit__Group__0__Impl rule__DecIntLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2937:2: rule__DecIntLit__Group__0__Impl rule__DecIntLit__Group__1
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__0__Impl_in_rule__DecIntLit__Group__05943);
            rule__DecIntLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecIntLit__Group__1_in_rule__DecIntLit__Group__05946);
            rule__DecIntLit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group__0"


    // $ANTLR start "rule__DecIntLit__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2944:1: rule__DecIntLit__Group__0__Impl : ( ( rule__DecIntLit__DigitsAssignment_0 ) ) ;
    public final void rule__DecIntLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2948:1: ( ( ( rule__DecIntLit__DigitsAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2949:1: ( ( rule__DecIntLit__DigitsAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2949:1: ( ( rule__DecIntLit__DigitsAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2950:1: ( rule__DecIntLit__DigitsAssignment_0 )
            {
             before(grammarAccess.getDecIntLitAccess().getDigitsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2951:1: ( rule__DecIntLit__DigitsAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2951:2: rule__DecIntLit__DigitsAssignment_0
            {
            pushFollow(FOLLOW_rule__DecIntLit__DigitsAssignment_0_in_rule__DecIntLit__Group__0__Impl5973);
            rule__DecIntLit__DigitsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDecIntLitAccess().getDigitsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group__0__Impl"


    // $ANTLR start "rule__DecIntLit__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2961:1: rule__DecIntLit__Group__1 : rule__DecIntLit__Group__1__Impl rule__DecIntLit__Group__2 ;
    public final void rule__DecIntLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2965:1: ( rule__DecIntLit__Group__1__Impl rule__DecIntLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2966:2: rule__DecIntLit__Group__1__Impl rule__DecIntLit__Group__2
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__1__Impl_in_rule__DecIntLit__Group__16003);
            rule__DecIntLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecIntLit__Group__2_in_rule__DecIntLit__Group__16006);
            rule__DecIntLit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group__1"


    // $ANTLR start "rule__DecIntLit__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2973:1: rule__DecIntLit__Group__1__Impl : ( ( rule__DecIntLit__Alternatives_1 )* ) ;
    public final void rule__DecIntLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2977:1: ( ( ( rule__DecIntLit__Alternatives_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2978:1: ( ( rule__DecIntLit__Alternatives_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2978:1: ( ( rule__DecIntLit__Alternatives_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2979:1: ( rule__DecIntLit__Alternatives_1 )*
            {
             before(grammarAccess.getDecIntLitAccess().getAlternatives_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2980:1: ( rule__DecIntLit__Alternatives_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DEC_DIGIT||LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2980:2: rule__DecIntLit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__DecIntLit__Alternatives_1_in_rule__DecIntLit__Group__1__Impl6033);
            	    rule__DecIntLit__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDecIntLitAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group__1__Impl"


    // $ANTLR start "rule__DecIntLit__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2990:1: rule__DecIntLit__Group__2 : rule__DecIntLit__Group__2__Impl ;
    public final void rule__DecIntLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2994:1: ( rule__DecIntLit__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2995:2: rule__DecIntLit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__2__Impl_in_rule__DecIntLit__Group__26064);
            rule__DecIntLit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group__2"


    // $ANTLR start "rule__DecIntLit__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3001:1: rule__DecIntLit__Group__2__Impl : ( ( rule__DecIntLit__Group_2__0 )? ) ;
    public final void rule__DecIntLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3005:1: ( ( ( rule__DecIntLit__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3006:1: ( ( rule__DecIntLit__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3006:1: ( ( rule__DecIntLit__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3007:1: ( rule__DecIntLit__Group_2__0 )?
            {
             before(grammarAccess.getDecIntLitAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3008:1: ( rule__DecIntLit__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20||LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3008:2: rule__DecIntLit__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DecIntLit__Group_2__0_in_rule__DecIntLit__Group__2__Impl6091);
                    rule__DecIntLit__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecIntLitAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group__2__Impl"


    // $ANTLR start "rule__DecIntLit__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3024:1: rule__DecIntLit__Group_2__0 : rule__DecIntLit__Group_2__0__Impl rule__DecIntLit__Group_2__1 ;
    public final void rule__DecIntLit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3028:1: ( rule__DecIntLit__Group_2__0__Impl rule__DecIntLit__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3029:2: rule__DecIntLit__Group_2__0__Impl rule__DecIntLit__Group_2__1
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group_2__0__Impl_in_rule__DecIntLit__Group_2__06128);
            rule__DecIntLit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecIntLit__Group_2__1_in_rule__DecIntLit__Group_2__06131);
            rule__DecIntLit__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group_2__0"


    // $ANTLR start "rule__DecIntLit__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3036:1: rule__DecIntLit__Group_2__0__Impl : ( ( rule__DecIntLit__Alternatives_2_0 ) ) ;
    public final void rule__DecIntLit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3040:1: ( ( ( rule__DecIntLit__Alternatives_2_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3041:1: ( ( rule__DecIntLit__Alternatives_2_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3041:1: ( ( rule__DecIntLit__Alternatives_2_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3042:1: ( rule__DecIntLit__Alternatives_2_0 )
            {
             before(grammarAccess.getDecIntLitAccess().getAlternatives_2_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3043:1: ( rule__DecIntLit__Alternatives_2_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3043:2: rule__DecIntLit__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__DecIntLit__Alternatives_2_0_in_rule__DecIntLit__Group_2__0__Impl6158);
            rule__DecIntLit__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDecIntLitAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group_2__0__Impl"


    // $ANTLR start "rule__DecIntLit__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3053:1: rule__DecIntLit__Group_2__1 : rule__DecIntLit__Group_2__1__Impl ;
    public final void rule__DecIntLit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3057:1: ( rule__DecIntLit__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3058:2: rule__DecIntLit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group_2__1__Impl_in_rule__DecIntLit__Group_2__16188);
            rule__DecIntLit__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group_2__1"


    // $ANTLR start "rule__DecIntLit__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3064:1: rule__DecIntLit__Group_2__1__Impl : ( ( rule__DecIntLit__SizeAssignment_2_1 ) ) ;
    public final void rule__DecIntLit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3068:1: ( ( ( rule__DecIntLit__SizeAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3069:1: ( ( rule__DecIntLit__SizeAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3069:1: ( ( rule__DecIntLit__SizeAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3070:1: ( rule__DecIntLit__SizeAssignment_2_1 )
            {
             before(grammarAccess.getDecIntLitAccess().getSizeAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3071:1: ( rule__DecIntLit__SizeAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3071:2: rule__DecIntLit__SizeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DecIntLit__SizeAssignment_2_1_in_rule__DecIntLit__Group_2__1__Impl6215);
            rule__DecIntLit__SizeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDecIntLitAccess().getSizeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__Group_2__1__Impl"


    // $ANTLR start "rule__Crate__ItemsAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3086:1: rule__Crate__ItemsAssignment : ( ruleItemAndAttrs ) ;
    public final void rule__Crate__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3090:1: ( ( ruleItemAndAttrs ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3091:1: ( ruleItemAndAttrs )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3091:1: ( ruleItemAndAttrs )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3092:1: ruleItemAndAttrs
            {
             before(grammarAccess.getCrateAccess().getItemsItemAndAttrsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment6254);
            ruleItemAndAttrs();

            state._fsp--;

             after(grammarAccess.getCrateAccess().getItemsItemAndAttrsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crate__ItemsAssignment"


    // $ANTLR start "rule__ItemAttr__AttrsAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3101:1: rule__ItemAttr__AttrsAssignment_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3105:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3106:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3106:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3107:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_16285);
            ruleAttr();

            state._fsp--;

             after(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__AttrsAssignment_1"


    // $ANTLR start "rule__ItemAttr__AttrsAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3116:1: rule__ItemAttr__AttrsAssignment_2_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3120:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3121:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3121:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3122:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_16316);
            ruleAttr();

            state._fsp--;

             after(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAttr__AttrsAssignment_2_1"


    // $ANTLR start "rule__AttrWithList__IdentAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3131:1: rule__AttrWithList__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__AttrWithList__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3135:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3136:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3136:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3137:1: RULE_IDENT
            {
             before(grammarAccess.getAttrWithListAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_06347); 
             after(grammarAccess.getAttrWithListAccess().getIdentIDENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__IdentAssignment_0"


    // $ANTLR start "rule__AttrWithList__AttrsAssignment_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3146:1: rule__AttrWithList__AttrsAssignment_2 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3150:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3151:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3151:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3152:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_26378);
            ruleAttr();

            state._fsp--;

             after(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__AttrsAssignment_2"


    // $ANTLR start "rule__AttrWithList__AttrsAssignment_3_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3161:1: rule__AttrWithList__AttrsAssignment_3_1 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3165:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3166:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3166:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3167:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_16409);
            ruleAttr();

            state._fsp--;

             after(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrWithList__AttrsAssignment_3_1"


    // $ANTLR start "rule__LiteralAttr__IdentAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3176:1: rule__LiteralAttr__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__LiteralAttr__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3180:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3181:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3181:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3182:1: RULE_IDENT
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_06440); 
             after(grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralAttr__IdentAssignment_0"


    // $ANTLR start "rule__LiteralAttr__ValueAssignment_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3191:1: rule__LiteralAttr__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__LiteralAttr__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3195:1: ( ( ruleLiteral ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3196:1: ( ruleLiteral )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3196:1: ( ruleLiteral )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3197:1: ruleLiteral
            {
             before(grammarAccess.getLiteralAttrAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_26471);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralAttrAccess().getValueLiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralAttr__ValueAssignment_2"


    // $ANTLR start "rule__ItemAndAttrs__AttrsAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3206:1: rule__ItemAndAttrs__AttrsAssignment_0 : ( ruleItemAttr ) ;
    public final void rule__ItemAndAttrs__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3210:1: ( ( ruleItemAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3211:1: ( ruleItemAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3211:1: ( ruleItemAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3212:1: ruleItemAttr
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsItemAttrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_06502);
            ruleItemAttr();

            state._fsp--;

             after(grammarAccess.getItemAndAttrsAccess().getAttrsItemAttrParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAndAttrs__AttrsAssignment_0"


    // $ANTLR start "rule__ItemAndAttrs__ItemAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3221:1: rule__ItemAndAttrs__ItemAssignment_1 : ( ruleItem ) ;
    public final void rule__ItemAndAttrs__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3225:1: ( ( ruleItem ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3226:1: ( ruleItem )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3226:1: ( ruleItem )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3227:1: ruleItem
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_16533);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemAndAttrsAccess().getItemItemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAndAttrs__ItemAssignment_1"


    // $ANTLR start "rule__ModItem__IdentAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3236:1: rule__ModItem__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__ModItem__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3240:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3241:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3241:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3242:1: RULE_IDENT
            {
             before(grammarAccess.getModItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_16564); 
             after(grammarAccess.getModItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__IdentAssignment_1"


    // $ANTLR start "rule__CharLit__CharAssignment_1_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3251:1: rule__CharLit__CharAssignment_1_0 : ( RULE_NON_SINGLE_QUOTE ) ;
    public final void rule__CharLit__CharAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3255:1: ( ( RULE_NON_SINGLE_QUOTE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3256:1: ( RULE_NON_SINGLE_QUOTE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3256:1: ( RULE_NON_SINGLE_QUOTE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3257:1: RULE_NON_SINGLE_QUOTE
            {
             before(grammarAccess.getCharLitAccess().getCharNON_SINGLE_QUOTETerminalRuleCall_1_0_0()); 
            match(input,RULE_NON_SINGLE_QUOTE,FOLLOW_RULE_NON_SINGLE_QUOTE_in_rule__CharLit__CharAssignment_1_06595); 
             after(grammarAccess.getCharLitAccess().getCharNON_SINGLE_QUOTETerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__CharAssignment_1_0"


    // $ANTLR start "rule__CharLit__CharAssignment_1_1_1_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3266:1: rule__CharLit__CharAssignment_1_1_1_0 : ( ( '\\'' ) ) ;
    public final void rule__CharLit__CharAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3270:1: ( ( ( '\\'' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3271:1: ( ( '\\'' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3271:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3272:1: ( '\\'' )
            {
             before(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_1_1_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3273:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3274:1: '\\''
            {
             before(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_1_1_0_0()); 
            match(input,34,FOLLOW_34_in_rule__CharLit__CharAssignment_1_1_1_06631); 
             after(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_1_1_0_0()); 

            }

             after(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__CharAssignment_1_1_1_0"


    // $ANTLR start "rule__CharLit__EscapedCharAssignment_1_1_1_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3289:1: rule__CharLit__EscapedCharAssignment_1_1_1_1 : ( ruleEscapedChar ) ;
    public final void rule__CharLit__EscapedCharAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3293:1: ( ( ruleEscapedChar ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3294:1: ( ruleEscapedChar )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3294:1: ( ruleEscapedChar )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3295:1: ruleEscapedChar
            {
             before(grammarAccess.getCharLitAccess().getEscapedCharEscapedCharParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleEscapedChar_in_rule__CharLit__EscapedCharAssignment_1_1_1_16670);
            ruleEscapedChar();

            state._fsp--;

             after(grammarAccess.getCharLitAccess().getEscapedCharEscapedCharParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__EscapedCharAssignment_1_1_1_1"


    // $ANTLR start "rule__EscapedChar__CharAssignment_0_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3304:1: rule__EscapedChar__CharAssignment_0_1 : ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) ) ;
    public final void rule__EscapedChar__CharAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3308:1: ( ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3309:1: ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3309:1: ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3310:1: ( rule__EscapedChar__CharAlternatives_0_1_0 )
            {
             before(grammarAccess.getEscapedCharAccess().getCharAlternatives_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3311:1: ( rule__EscapedChar__CharAlternatives_0_1_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3311:2: rule__EscapedChar__CharAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__EscapedChar__CharAlternatives_0_1_0_in_rule__EscapedChar__CharAssignment_0_16701);
            rule__EscapedChar__CharAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEscapedCharAccess().getCharAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__CharAssignment_0_1"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_1_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3320:1: rule__EscapedChar__DigitsAssignment_1_2 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3324:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3325:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3325:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3326:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_2_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_26734); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_1_2"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_1_3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3335:1: rule__EscapedChar__DigitsAssignment_1_3 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3339:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3340:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3340:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3341:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_3_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_36765); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_1_3"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_2_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3350:1: rule__EscapedChar__DigitsAssignment_2_2 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3354:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3355:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3355:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3356:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_2_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_26796); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_2_2"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_2_3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3365:1: rule__EscapedChar__DigitsAssignment_2_3 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3369:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3370:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3370:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3371:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_3_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_36827); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_2_3"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_2_4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3380:1: rule__EscapedChar__DigitsAssignment_2_4 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3384:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3385:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3385:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3386:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_4_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_46858); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_2_4"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_2_5"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3395:1: rule__EscapedChar__DigitsAssignment_2_5 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3399:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3400:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3400:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3401:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_5_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_56889); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_2_5"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_3_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3410:1: rule__EscapedChar__DigitsAssignment_3_2 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3414:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3415:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3415:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3416:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_2_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_26920); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_3_2"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_3_3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3425:1: rule__EscapedChar__DigitsAssignment_3_3 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3429:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3430:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3430:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3431:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_3_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_36951); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_3_3"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_3_4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3440:1: rule__EscapedChar__DigitsAssignment_3_4 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3444:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3445:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3445:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3446:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_4_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_46982); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_3_4"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_3_5"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3455:1: rule__EscapedChar__DigitsAssignment_3_5 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3459:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3460:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3460:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3461:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_5_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_57013); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_3_5"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_3_6"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3470:1: rule__EscapedChar__DigitsAssignment_3_6 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3474:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3475:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3475:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3476:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_6_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_67044); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_3_6"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_3_7"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3485:1: rule__EscapedChar__DigitsAssignment_3_7 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3489:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3490:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3490:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3491:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_7_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_77075); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_3_7"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_3_8"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3500:1: rule__EscapedChar__DigitsAssignment_3_8 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3504:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3505:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3505:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3506:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_8_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_87106); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_3_8"


    // $ANTLR start "rule__EscapedChar__DigitsAssignment_3_9"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3515:1: rule__EscapedChar__DigitsAssignment_3_9 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3519:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3520:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3520:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3521:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_9_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_97137); 
             after(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscapedChar__DigitsAssignment_3_9"


    // $ANTLR start "rule__FloatLit__DigitsAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3530:1: rule__FloatLit__DigitsAssignment_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3534:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3535:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3535:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3536:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_07168); 
             after(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__DigitsAssignment_0"


    // $ANTLR start "rule__FloatLit__DigitsAssignment_1_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3545:1: rule__FloatLit__DigitsAssignment_1_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3549:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3550:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3550:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3551:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_1_07199); 
             after(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__DigitsAssignment_1_0"


    // $ANTLR start "rule__FloatLit__DigitsAssignment_2_1_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3560:1: rule__FloatLit__DigitsAssignment_2_1_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3564:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3565:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3565:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3566:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_2_1_07230); 
             after(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__DigitsAssignment_2_1_0"


    // $ANTLR start "rule__FloatLit__NegativeExpAssignment_3_1_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3575:1: rule__FloatLit__NegativeExpAssignment_3_1_1 : ( ( '-' ) ) ;
    public final void rule__FloatLit__NegativeExpAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3579:1: ( ( ( '-' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3580:1: ( ( '-' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3580:1: ( ( '-' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3581:1: ( '-' )
            {
             before(grammarAccess.getFloatLitAccess().getNegativeExpHyphenMinusKeyword_3_1_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3582:1: ( '-' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3583:1: '-'
            {
             before(grammarAccess.getFloatLitAccess().getNegativeExpHyphenMinusKeyword_3_1_1_0()); 
            match(input,40,FOLLOW_40_in_rule__FloatLit__NegativeExpAssignment_3_1_17266); 
             after(grammarAccess.getFloatLitAccess().getNegativeExpHyphenMinusKeyword_3_1_1_0()); 

            }

             after(grammarAccess.getFloatLitAccess().getNegativeExpHyphenMinusKeyword_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__NegativeExpAssignment_3_1_1"


    // $ANTLR start "rule__FloatLit__DigitsAssignment_3_2_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3598:1: rule__FloatLit__DigitsAssignment_3_2_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3602:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3603:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3603:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3604:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_3_2_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_3_2_07305); 
             after(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__DigitsAssignment_3_2_0"


    // $ANTLR start "rule__FloatLit__SizeAssignment_4_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3613:1: rule__FloatLit__SizeAssignment_4_1 : ( ruleFloatSize ) ;
    public final void rule__FloatLit__SizeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3617:1: ( ( ruleFloatSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3618:1: ( ruleFloatSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3618:1: ( ruleFloatSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3619:1: ruleFloatSize
            {
             before(grammarAccess.getFloatLitAccess().getSizeFloatSizeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleFloatSize_in_rule__FloatLit__SizeAssignment_4_17336);
            ruleFloatSize();

            state._fsp--;

             after(grammarAccess.getFloatLitAccess().getSizeFloatSizeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLit__SizeAssignment_4_1"


    // $ANTLR start "rule__DecIntLit__DigitsAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3628:1: rule__DecIntLit__DigitsAssignment_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__DecIntLit__DigitsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3632:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3633:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3633:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3634:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_07367); 
             after(grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__DigitsAssignment_0"


    // $ANTLR start "rule__DecIntLit__DigitsAssignment_1_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3643:1: rule__DecIntLit__DigitsAssignment_1_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__DecIntLit__DigitsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3647:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3648:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3648:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3649:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_1_07398); 
             after(grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__DigitsAssignment_1_0"


    // $ANTLR start "rule__DecIntLit__UnsignedAssignment_2_0_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3658:1: rule__DecIntLit__UnsignedAssignment_2_0_1 : ( ( 'u' ) ) ;
    public final void rule__DecIntLit__UnsignedAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3662:1: ( ( ( 'u' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3663:1: ( ( 'u' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3663:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3664:1: ( 'u' )
            {
             before(grammarAccess.getDecIntLitAccess().getUnsignedUKeyword_2_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3665:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3666:1: 'u'
            {
             before(grammarAccess.getDecIntLitAccess().getUnsignedUKeyword_2_0_1_0()); 
            match(input,36,FOLLOW_36_in_rule__DecIntLit__UnsignedAssignment_2_0_17434); 
             after(grammarAccess.getDecIntLitAccess().getUnsignedUKeyword_2_0_1_0()); 

            }

             after(grammarAccess.getDecIntLitAccess().getUnsignedUKeyword_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__UnsignedAssignment_2_0_1"


    // $ANTLR start "rule__DecIntLit__SizeAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3681:1: rule__DecIntLit__SizeAssignment_2_1 : ( ruleIntSize ) ;
    public final void rule__DecIntLit__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3685:1: ( ( ruleIntSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3686:1: ( ruleIntSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3686:1: ( ruleIntSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3687:1: ruleIntSize
            {
             before(grammarAccess.getDecIntLitAccess().getSizeIntSizeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntSize_in_rule__DecIntLit__SizeAssignment_2_17473);
            ruleIntSize();

            state._fsp--;

             after(grammarAccess.getDecIntLitAccess().getSizeIntSizeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecIntLit__SizeAssignment_2_1"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\6\uffff";
    static final String DFA9_eofS =
        "\1\uffff\3\4\2\uffff";
    static final String DFA9_minS =
        "\4\7\2\uffff";
    static final String DFA9_maxS =
        "\1\7\3\46\2\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\2\10\uffff\1\3\3\uffff\1\4\5\uffff\2\4\1\uffff\1\4\6\uffff"+
            "\1\4\1\uffff\1\5",
            "\1\2\10\uffff\1\3\3\uffff\1\4\5\uffff\2\4\1\uffff\1\4\6\uffff"+
            "\1\4\1\uffff\1\5",
            "\1\2\10\uffff\1\3\3\uffff\1\4\5\uffff\2\4\1\uffff\1\4\6\uffff"+
            "\1\4\1\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "714:1: rule__NumberLit__Alternatives : ( ( ruleFloatLit ) | ( ruleIntLit ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleCrate_in_entryRuleCrate61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrate68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crate__ItemsAssignment_in_ruleCrate94 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_entryRuleItemAttr122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemAttr129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__0_in_ruleItemAttr155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_entryRuleAttr182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttr189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr__Alternatives_in_ruleAttr215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_entryRuleAttrWithList242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrWithList249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__0_in_ruleAttrWithList275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_entryRuleLiteralAttr302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAttr309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__0_in_ruleLiteralAttr335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_entryRuleItemAndAttrs362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemAndAttrs369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__0_in_ruleItemAndAttrs395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_ruleItem455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_entryRuleModItem481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModItem488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__0_in_ruleModItem514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__0_in_ruleCharLit634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedChar_in_entryRuleEscapedChar661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedChar668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Alternatives_in_ruleEscapedChar694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_entryRuleNumberLit721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLit728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLit__Alternatives_in_ruleNumberLit754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLit_in_entryRuleFloatLit781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLit788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__0_in_ruleFloatLit814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLit_in_entryRuleIntLit841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLit848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecIntLit_in_ruleIntLit874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecIntLit_in_entryRuleDecIntLit900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecIntLit907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__0_in_ruleDecIntLit933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatSize__Alternatives_in_ruleFloatSize970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntSize__Alternatives_in_ruleIntSize1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ModItem__Alternatives_21091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_21110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rule__Literal__Alternatives1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__CharAssignment_1_0_in_rule__CharLit__Alternatives_11192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_1__0_in_rule__CharLit__Alternatives_11210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__CharAssignment_1_1_1_0_in_rule__CharLit__Alternatives_1_1_11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__EscapedCharAssignment_1_1_1_1_in_rule__CharLit__Alternatives_1_1_11261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__0_in_rule__EscapedChar__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__0_in_rule__EscapedChar__Alternatives1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__0_in_rule__EscapedChar__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__0_in_rule__EscapedChar__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EscapedChar__CharAlternatives_0_1_01382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EscapedChar__CharAlternatives_0_1_01402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EscapedChar__CharAlternatives_0_1_01422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EscapedChar__CharAlternatives_0_1_01442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EscapedChar__CharAlternatives_0_1_01462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLit_in_rule__NumberLit__Alternatives1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLit_in_rule__NumberLit__Alternatives1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_1_0_in_rule__FloatLit__Alternatives_11545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FloatLit__Alternatives_11564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_2_1_0_in_rule__FloatLit__Alternatives_2_11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FloatLit__Alternatives_2_11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FloatLit__Alternatives_3_01652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FloatLit__Alternatives_3_01672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FloatLit__Alternatives_3_11707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__NegativeExpAssignment_3_1_1_in_rule__FloatLit__Alternatives_3_11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_3_2_0_in_rule__FloatLit__Alternatives_3_21759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FloatLit__Alternatives_3_21778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__DigitsAssignment_1_0_in_rule__DecIntLit__Alternatives_11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DecIntLit__Alternatives_11831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DecIntLit__Alternatives_2_01866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__UnsignedAssignment_2_0_1_in_rule__DecIntLit__Alternatives_2_01885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FloatSize__Alternatives1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FloatSize__Alternatives1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IntSize__Alternatives1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IntSize__Alternatives1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IntSize__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IntSize__Alternatives2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ItemAttr__Group__0__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12134 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__22194 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__22197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl2224 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__32255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ItemAttr__Group__3__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__02322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__02325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ItemAttr__Group_2__0__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__02445 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__02448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__12505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__12508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AttrWithList__Group__1__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__22567 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__22570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__32627 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__32630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl2657 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__42688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AttrWithList__Group__4__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__02757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__02760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AttrWithList__Group_3__0__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__12819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__02880 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__02883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__12940 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__12943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LiteralAttr__Group__1__Impl2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03065 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3095 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__03187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__03190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ModItem__Group__0__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__13249 = new BitSet(new long[]{0x0000000100000400L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__13252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__23309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__03372 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__03375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModItem__Group_2_1__0__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__13434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModItem__Group_2_1__1__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__0__Impl_in_rule__CharLit__Group__03497 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_rule__CharLit__Group__1_in_rule__CharLit__Group__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CharLit__Group__0__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__1__Impl_in_rule__CharLit__Group__13559 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CharLit__Group__2_in_rule__CharLit__Group__13562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Alternatives_1_in_rule__CharLit__Group__1__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__2__Impl_in_rule__CharLit__Group__23619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CharLit__Group__2__Impl3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_1__0__Impl_in_rule__CharLit__Group_1_1__03684 = new BitSet(new long[]{0x0000003C0000F800L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_1__1_in_rule__CharLit__Group_1_1__03687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CharLit__Group_1_1__0__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_1__1__Impl_in_rule__CharLit__Group_1_1__13746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Alternatives_1_1_1_in_rule__CharLit__Group_1_1__1__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__0__Impl_in_rule__EscapedChar__Group_0__03807 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__1_in_rule__EscapedChar__Group_0__03810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__1__Impl_in_rule__EscapedChar__Group_0__13868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__CharAssignment_0_1_in_rule__EscapedChar__Group_0__1__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__0__Impl_in_rule__EscapedChar__Group_1__03929 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__1_in_rule__EscapedChar__Group_1__03932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__1__Impl_in_rule__EscapedChar__Group_1__13990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__2_in_rule__EscapedChar__Group_1__13993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EscapedChar__Group_1__1__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__2__Impl_in_rule__EscapedChar__Group_1__24052 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__3_in_rule__EscapedChar__Group_1__24055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_1_2_in_rule__EscapedChar__Group_1__2__Impl4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__3__Impl_in_rule__EscapedChar__Group_1__34112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_1_3_in_rule__EscapedChar__Group_1__3__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__0__Impl_in_rule__EscapedChar__Group_2__04177 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__1_in_rule__EscapedChar__Group_2__04180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__1__Impl_in_rule__EscapedChar__Group_2__14238 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__2_in_rule__EscapedChar__Group_2__14241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EscapedChar__Group_2__1__Impl4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__2__Impl_in_rule__EscapedChar__Group_2__24300 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__3_in_rule__EscapedChar__Group_2__24303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_2_in_rule__EscapedChar__Group_2__2__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__3__Impl_in_rule__EscapedChar__Group_2__34360 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__4_in_rule__EscapedChar__Group_2__34363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_3_in_rule__EscapedChar__Group_2__3__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__4__Impl_in_rule__EscapedChar__Group_2__44420 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__5_in_rule__EscapedChar__Group_2__44423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_4_in_rule__EscapedChar__Group_2__4__Impl4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__5__Impl_in_rule__EscapedChar__Group_2__54480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_5_in_rule__EscapedChar__Group_2__5__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__0__Impl_in_rule__EscapedChar__Group_3__04549 = new BitSet(new long[]{0x0000003C0000F800L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__1_in_rule__EscapedChar__Group_3__04552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__1__Impl_in_rule__EscapedChar__Group_3__14610 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__2_in_rule__EscapedChar__Group_3__14613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EscapedChar__Group_3__1__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__2__Impl_in_rule__EscapedChar__Group_3__24672 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__3_in_rule__EscapedChar__Group_3__24675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_2_in_rule__EscapedChar__Group_3__2__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__3__Impl_in_rule__EscapedChar__Group_3__34732 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__4_in_rule__EscapedChar__Group_3__34735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_3_in_rule__EscapedChar__Group_3__3__Impl4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__4__Impl_in_rule__EscapedChar__Group_3__44792 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__5_in_rule__EscapedChar__Group_3__44795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_4_in_rule__EscapedChar__Group_3__4__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__5__Impl_in_rule__EscapedChar__Group_3__54852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__6_in_rule__EscapedChar__Group_3__54855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_5_in_rule__EscapedChar__Group_3__5__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__6__Impl_in_rule__EscapedChar__Group_3__64912 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__7_in_rule__EscapedChar__Group_3__64915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_6_in_rule__EscapedChar__Group_3__6__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__7__Impl_in_rule__EscapedChar__Group_3__74972 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__8_in_rule__EscapedChar__Group_3__74975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_7_in_rule__EscapedChar__Group_3__7__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__8__Impl_in_rule__EscapedChar__Group_3__85032 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__9_in_rule__EscapedChar__Group_3__85035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_8_in_rule__EscapedChar__Group_3__8__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__9__Impl_in_rule__EscapedChar__Group_3__95092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_9_in_rule__EscapedChar__Group_3__9__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__0__Impl_in_rule__FloatLit__Group__05169 = new BitSet(new long[]{0x0000004000010080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__1_in_rule__FloatLit__Group__05172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_0_in_rule__FloatLit__Group__0__Impl5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__1__Impl_in_rule__FloatLit__Group__15229 = new BitSet(new long[]{0x0000004000010080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__2_in_rule__FloatLit__Group__15232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_1_in_rule__FloatLit__Group__1__Impl5259 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__2__Impl_in_rule__FloatLit__Group__25290 = new BitSet(new long[]{0x0000008000060000L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__3_in_rule__FloatLit__Group__25293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__0_in_rule__FloatLit__Group__2__Impl5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__3__Impl_in_rule__FloatLit__Group__35350 = new BitSet(new long[]{0x0000008000060000L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__4_in_rule__FloatLit__Group__35353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__0_in_rule__FloatLit__Group__3__Impl5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__4__Impl_in_rule__FloatLit__Group__45411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__0_in_rule__FloatLit__Group__4__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__0__Impl_in_rule__FloatLit__Group_2__05479 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__1_in_rule__FloatLit__Group_2__05482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FloatLit__Group_2__0__Impl5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__1__Impl_in_rule__FloatLit__Group_2__15541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl5570 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl5582 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__0__Impl_in_rule__FloatLit__Group_3__05619 = new BitSet(new long[]{0x0000010000090080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__1_in_rule__FloatLit__Group_3__05622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_0_in_rule__FloatLit__Group_3__0__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__1__Impl_in_rule__FloatLit__Group_3__15679 = new BitSet(new long[]{0x0000010000090080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__2_in_rule__FloatLit__Group_3__15682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_1_in_rule__FloatLit__Group_3__1__Impl5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__2__Impl_in_rule__FloatLit__Group_3__25740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl5769 = new BitSet(new long[]{0x0000010000090082L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl5781 = new BitSet(new long[]{0x0000010000090082L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__0__Impl_in_rule__FloatLit__Group_4__05820 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__1_in_rule__FloatLit__Group_4__05823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FloatLit__Group_4__0__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__1__Impl_in_rule__FloatLit__Group_4__15882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__SizeAssignment_4_1_in_rule__FloatLit__Group_4__1__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__0__Impl_in_rule__DecIntLit__Group__05943 = new BitSet(new long[]{0x0000001000110080L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__1_in_rule__DecIntLit__Group__05946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__DigitsAssignment_0_in_rule__DecIntLit__Group__0__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__1__Impl_in_rule__DecIntLit__Group__16003 = new BitSet(new long[]{0x0000001000110080L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__2_in_rule__DecIntLit__Group__16006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Alternatives_1_in_rule__DecIntLit__Group__1__Impl6033 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__2__Impl_in_rule__DecIntLit__Group__26064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__0_in_rule__DecIntLit__Group__2__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__0__Impl_in_rule__DecIntLit__Group_2__06128 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__1_in_rule__DecIntLit__Group_2__06131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Alternatives_2_0_in_rule__DecIntLit__Group_2__0__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__1__Impl_in_rule__DecIntLit__Group_2__16188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__SizeAssignment_2_1_in_rule__DecIntLit__Group_2__1__Impl6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_16285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_16316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_06347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_26378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_16409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_06440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_26471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_06502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_16533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_16564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NON_SINGLE_QUOTE_in_rule__CharLit__CharAssignment_1_06595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CharLit__CharAssignment_1_1_1_06631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedChar_in_rule__CharLit__EscapedCharAssignment_1_1_1_16670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__CharAlternatives_0_1_0_in_rule__EscapedChar__CharAssignment_0_16701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_26734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_36765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_26796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_36827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_46858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_56889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_26920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_36951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_46982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_57013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_67044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_77075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_87106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_97137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_07168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_1_07199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_2_1_07230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FloatLit__NegativeExpAssignment_3_1_17266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_3_2_07305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatSize_in_rule__FloatLit__SizeAssignment_4_17336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_07367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_1_07398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DecIntLit__UnsignedAssignment_2_0_17434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntSize_in_rule__DecIntLit__SizeAssignment_2_17473 = new BitSet(new long[]{0x0000000000000002L});

}