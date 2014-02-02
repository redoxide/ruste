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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_NON_SINGLE_QUOTE", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "';'", "'\\\\'", "'n'", "'r'", "'t'", "'0'", "'_'", "'E'", "'e'", "'+'", "'i'", "'32'", "'64'", "'8'", "'16'", "'#['", "']'", "','", "'('", "')'", "'='", "'mod'", "'{'", "'}'", "'\\''", "'x'", "'u'", "'U'", "'.'", "'f'", "'0b'", "'0o'", "'0x'", "'-'", "'1'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_XID_CONTINUE=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_DEC_DIGIT=7;
    public static final int RULE_OCT_DIGIT=8;
    public static final int RULE_HEX_DIGIT=6;
    public static final int T__30=30;
    public static final int RULE_XID_START=9;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=4;
    public static final int T__39=39;
    public static final int RULE_NON_SINGLE_QUOTE=5;

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

                if ( (LA1_0==26||LA1_0==32) ) {
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:433:1: ruleIntLit : ( ( rule__IntLit__Alternatives ) ) ;
    public final void ruleIntLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:437:2: ( ( ( rule__IntLit__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:438:1: ( ( rule__IntLit__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:438:1: ( ( rule__IntLit__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:439:1: ( rule__IntLit__Alternatives )
            {
             before(grammarAccess.getIntLitAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:440:1: ( rule__IntLit__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:440:2: rule__IntLit__Alternatives
            {
            pushFollow(FOLLOW_rule__IntLit__Alternatives_in_ruleIntLit874);
            rule__IntLit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntLitAccess().getAlternatives()); 

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
            pushFollow(FOLLOW_ruleDecIntLit_in_entryRuleDecIntLit901);
            ruleDecIntLit();

            state._fsp--;

             after(grammarAccess.getDecIntLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecIntLit908); 

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
            pushFollow(FOLLOW_rule__DecIntLit__Group__0_in_ruleDecIntLit934);
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


    // $ANTLR start "entryRuleBinIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:480:1: entryRuleBinIntLit : ruleBinIntLit EOF ;
    public final void entryRuleBinIntLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:481:1: ( ruleBinIntLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:482:1: ruleBinIntLit EOF
            {
             before(grammarAccess.getBinIntLitRule()); 
            pushFollow(FOLLOW_ruleBinIntLit_in_entryRuleBinIntLit961);
            ruleBinIntLit();

            state._fsp--;

             after(grammarAccess.getBinIntLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinIntLit968); 

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
    // $ANTLR end "entryRuleBinIntLit"


    // $ANTLR start "ruleBinIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:489:1: ruleBinIntLit : ( ( rule__BinIntLit__Group__0 ) ) ;
    public final void ruleBinIntLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:493:2: ( ( ( rule__BinIntLit__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:494:1: ( ( rule__BinIntLit__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:494:1: ( ( rule__BinIntLit__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:495:1: ( rule__BinIntLit__Group__0 )
            {
             before(grammarAccess.getBinIntLitAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:496:1: ( rule__BinIntLit__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:496:2: rule__BinIntLit__Group__0
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group__0_in_ruleBinIntLit994);
            rule__BinIntLit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinIntLitAccess().getGroup()); 

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
    // $ANTLR end "ruleBinIntLit"


    // $ANTLR start "entryRuleOctIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:508:1: entryRuleOctIntLit : ruleOctIntLit EOF ;
    public final void entryRuleOctIntLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:509:1: ( ruleOctIntLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:510:1: ruleOctIntLit EOF
            {
             before(grammarAccess.getOctIntLitRule()); 
            pushFollow(FOLLOW_ruleOctIntLit_in_entryRuleOctIntLit1021);
            ruleOctIntLit();

            state._fsp--;

             after(grammarAccess.getOctIntLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOctIntLit1028); 

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
    // $ANTLR end "entryRuleOctIntLit"


    // $ANTLR start "ruleOctIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:517:1: ruleOctIntLit : ( ( rule__OctIntLit__Group__0 ) ) ;
    public final void ruleOctIntLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:521:2: ( ( ( rule__OctIntLit__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:522:1: ( ( rule__OctIntLit__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:522:1: ( ( rule__OctIntLit__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:523:1: ( rule__OctIntLit__Group__0 )
            {
             before(grammarAccess.getOctIntLitAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:524:1: ( rule__OctIntLit__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:524:2: rule__OctIntLit__Group__0
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group__0_in_ruleOctIntLit1054);
            rule__OctIntLit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOctIntLitAccess().getGroup()); 

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
    // $ANTLR end "ruleOctIntLit"


    // $ANTLR start "entryRuleHexIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:536:1: entryRuleHexIntLit : ruleHexIntLit EOF ;
    public final void entryRuleHexIntLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:537:1: ( ruleHexIntLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:538:1: ruleHexIntLit EOF
            {
             before(grammarAccess.getHexIntLitRule()); 
            pushFollow(FOLLOW_ruleHexIntLit_in_entryRuleHexIntLit1081);
            ruleHexIntLit();

            state._fsp--;

             after(grammarAccess.getHexIntLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexIntLit1088); 

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
    // $ANTLR end "entryRuleHexIntLit"


    // $ANTLR start "ruleHexIntLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:545:1: ruleHexIntLit : ( ( rule__HexIntLit__Group__0 ) ) ;
    public final void ruleHexIntLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:549:2: ( ( ( rule__HexIntLit__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:550:1: ( ( rule__HexIntLit__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:550:1: ( ( rule__HexIntLit__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:551:1: ( rule__HexIntLit__Group__0 )
            {
             before(grammarAccess.getHexIntLitAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:552:1: ( rule__HexIntLit__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:552:2: rule__HexIntLit__Group__0
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group__0_in_ruleHexIntLit1114);
            rule__HexIntLit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHexIntLitAccess().getGroup()); 

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
    // $ANTLR end "ruleHexIntLit"


    // $ANTLR start "ruleFloatSize"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:565:1: ruleFloatSize : ( ( rule__FloatSize__Alternatives ) ) ;
    public final void ruleFloatSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:569:1: ( ( ( rule__FloatSize__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:570:1: ( ( rule__FloatSize__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:570:1: ( ( rule__FloatSize__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:571:1: ( rule__FloatSize__Alternatives )
            {
             before(grammarAccess.getFloatSizeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:572:1: ( rule__FloatSize__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:572:2: rule__FloatSize__Alternatives
            {
            pushFollow(FOLLOW_rule__FloatSize__Alternatives_in_ruleFloatSize1151);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:584:1: ruleIntSize : ( ( rule__IntSize__Alternatives ) ) ;
    public final void ruleIntSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:588:1: ( ( ( rule__IntSize__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:589:1: ( ( rule__IntSize__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:589:1: ( ( rule__IntSize__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:590:1: ( rule__IntSize__Alternatives )
            {
             before(grammarAccess.getIntSizeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:591:1: ( rule__IntSize__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:591:2: rule__IntSize__Alternatives
            {
            pushFollow(FOLLOW_rule__IntSize__Alternatives_in_ruleIntSize1187);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:602:1: rule__Attr__Alternatives : ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) );
    public final void rule__Attr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:606:1: ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==29) ) {
                    alt2=2;
                }
                else if ( (LA2_1==31) ) {
                    alt2=1;
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:607:1: ( ruleLiteralAttr )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:607:1: ( ruleLiteralAttr )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:1: ruleLiteralAttr
                    {
                     before(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1222);
                    ruleLiteralAttr();

                    state._fsp--;

                     after(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:613:6: ( ruleAttrWithList )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:613:6: ( ruleAttrWithList )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:614:1: ruleAttrWithList
                    {
                     before(grammarAccess.getAttrAccess().getAttrWithListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1239);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:624:1: rule__ModItem__Alternatives_2 : ( ( ';' ) | ( ( rule__ModItem__Group_2_1__0 ) ) );
    public final void rule__ModItem__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:628:1: ( ( ';' ) | ( ( rule__ModItem__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:629:1: ( ';' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:629:1: ( ';' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:630:1: ';'
                    {
                     before(grammarAccess.getModItemAccess().getSemicolonKeyword_2_0()); 
                    match(input,11,FOLLOW_11_in_rule__ModItem__Alternatives_21272); 
                     after(grammarAccess.getModItemAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:637:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:637:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:638:1: ( rule__ModItem__Group_2_1__0 )
                    {
                     before(grammarAccess.getModItemAccess().getGroup_2_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:639:1: ( rule__ModItem__Group_2_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:639:2: rule__ModItem__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_21291);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:648:1: rule__Literal__Alternatives : ( ( ruleCharLit ) | ( ruleNumberLit ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:652:1: ( ( ruleCharLit ) | ( ruleNumberLit ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_DEC_DIGIT||(LA4_0>=41 && LA4_0<=43)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:653:1: ( ruleCharLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:653:1: ( ruleCharLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:654:1: ruleCharLit
                    {
                     before(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCharLit_in_rule__Literal__Alternatives1324);
                    ruleCharLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:659:6: ( ruleNumberLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:659:6: ( ruleNumberLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:660:1: ruleNumberLit
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives1341);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:670:1: rule__CharLit__Alternatives_1 : ( ( ( rule__CharLit__CharAssignment_1_0 ) ) | ( ( rule__CharLit__Group_1_1__0 ) ) );
    public final void rule__CharLit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:674:1: ( ( ( rule__CharLit__CharAssignment_1_0 ) ) | ( ( rule__CharLit__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NON_SINGLE_QUOTE) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:675:1: ( ( rule__CharLit__CharAssignment_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:675:1: ( ( rule__CharLit__CharAssignment_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:676:1: ( rule__CharLit__CharAssignment_1_0 )
                    {
                     before(grammarAccess.getCharLitAccess().getCharAssignment_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:677:1: ( rule__CharLit__CharAssignment_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:677:2: rule__CharLit__CharAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__CharLit__CharAssignment_1_0_in_rule__CharLit__Alternatives_11373);
                    rule__CharLit__CharAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getCharAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:681:6: ( ( rule__CharLit__Group_1_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:681:6: ( ( rule__CharLit__Group_1_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:682:1: ( rule__CharLit__Group_1_1__0 )
                    {
                     before(grammarAccess.getCharLitAccess().getGroup_1_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:683:1: ( rule__CharLit__Group_1_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:683:2: rule__CharLit__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__CharLit__Group_1_1__0_in_rule__CharLit__Alternatives_11391);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:692:1: rule__CharLit__Alternatives_1_1_1 : ( ( ( rule__CharLit__CharAssignment_1_1_1_0 ) ) | ( ( rule__CharLit__EscapedCharAssignment_1_1_1_1 ) ) );
    public final void rule__CharLit__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:696:1: ( ( ( rule__CharLit__CharAssignment_1_1_1_0 ) ) | ( ( rule__CharLit__EscapedCharAssignment_1_1_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=12 && LA6_0<=16)||(LA6_0>=36 && LA6_0<=38)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:697:1: ( ( rule__CharLit__CharAssignment_1_1_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:697:1: ( ( rule__CharLit__CharAssignment_1_1_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:698:1: ( rule__CharLit__CharAssignment_1_1_1_0 )
                    {
                     before(grammarAccess.getCharLitAccess().getCharAssignment_1_1_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:699:1: ( rule__CharLit__CharAssignment_1_1_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:699:2: rule__CharLit__CharAssignment_1_1_1_0
                    {
                    pushFollow(FOLLOW_rule__CharLit__CharAssignment_1_1_1_0_in_rule__CharLit__Alternatives_1_1_11424);
                    rule__CharLit__CharAssignment_1_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getCharAssignment_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:703:6: ( ( rule__CharLit__EscapedCharAssignment_1_1_1_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:703:6: ( ( rule__CharLit__EscapedCharAssignment_1_1_1_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:704:1: ( rule__CharLit__EscapedCharAssignment_1_1_1_1 )
                    {
                     before(grammarAccess.getCharLitAccess().getEscapedCharAssignment_1_1_1_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:705:1: ( rule__CharLit__EscapedCharAssignment_1_1_1_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:705:2: rule__CharLit__EscapedCharAssignment_1_1_1_1
                    {
                    pushFollow(FOLLOW_rule__CharLit__EscapedCharAssignment_1_1_1_1_in_rule__CharLit__Alternatives_1_1_11442);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:714:1: rule__EscapedChar__Alternatives : ( ( ( rule__EscapedChar__Group_0__0 ) ) | ( ( rule__EscapedChar__Group_1__0 ) ) | ( ( rule__EscapedChar__Group_2__0 ) ) | ( ( rule__EscapedChar__Group_3__0 ) ) );
    public final void rule__EscapedChar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:718:1: ( ( ( rule__EscapedChar__Group_0__0 ) ) | ( ( rule__EscapedChar__Group_1__0 ) ) | ( ( rule__EscapedChar__Group_2__0 ) ) | ( ( rule__EscapedChar__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 38:
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:719:1: ( ( rule__EscapedChar__Group_0__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:719:1: ( ( rule__EscapedChar__Group_0__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:720:1: ( rule__EscapedChar__Group_0__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:721:1: ( rule__EscapedChar__Group_0__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:721:2: rule__EscapedChar__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_0__0_in_rule__EscapedChar__Alternatives1475);
                    rule__EscapedChar__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:725:6: ( ( rule__EscapedChar__Group_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:725:6: ( ( rule__EscapedChar__Group_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:726:1: ( rule__EscapedChar__Group_1__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:727:1: ( rule__EscapedChar__Group_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:727:2: rule__EscapedChar__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_1__0_in_rule__EscapedChar__Alternatives1493);
                    rule__EscapedChar__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:731:6: ( ( rule__EscapedChar__Group_2__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:731:6: ( ( rule__EscapedChar__Group_2__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:732:1: ( rule__EscapedChar__Group_2__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:733:1: ( rule__EscapedChar__Group_2__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:733:2: rule__EscapedChar__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_2__0_in_rule__EscapedChar__Alternatives1511);
                    rule__EscapedChar__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:737:6: ( ( rule__EscapedChar__Group_3__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:737:6: ( ( rule__EscapedChar__Group_3__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:738:1: ( rule__EscapedChar__Group_3__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:739:1: ( rule__EscapedChar__Group_3__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:739:2: rule__EscapedChar__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_3__0_in_rule__EscapedChar__Alternatives1529);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:748:1: rule__EscapedChar__CharAlternatives_0_1_0 : ( ( '\\\\' ) | ( 'n' ) | ( 'r' ) | ( 't' ) | ( '0' ) );
    public final void rule__EscapedChar__CharAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:752:1: ( ( '\\\\' ) | ( 'n' ) | ( 'r' ) | ( 't' ) | ( '0' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:753:1: ( '\\\\' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:753:1: ( '\\\\' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:754:1: '\\\\'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharReverseSolidusKeyword_0_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__EscapedChar__CharAlternatives_0_1_01563); 
                     after(grammarAccess.getEscapedCharAccess().getCharReverseSolidusKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:761:6: ( 'n' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:761:6: ( 'n' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:762:1: 'n'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharNKeyword_0_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__EscapedChar__CharAlternatives_0_1_01583); 
                     after(grammarAccess.getEscapedCharAccess().getCharNKeyword_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:769:6: ( 'r' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:769:6: ( 'r' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:770:1: 'r'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharRKeyword_0_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__EscapedChar__CharAlternatives_0_1_01603); 
                     after(grammarAccess.getEscapedCharAccess().getCharRKeyword_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:777:6: ( 't' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:777:6: ( 't' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:778:1: 't'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharTKeyword_0_1_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__EscapedChar__CharAlternatives_0_1_01623); 
                     after(grammarAccess.getEscapedCharAccess().getCharTKeyword_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:785:6: ( '0' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:785:6: ( '0' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:786:1: '0'
                    {
                     before(grammarAccess.getEscapedCharAccess().getChar0Keyword_0_1_0_4()); 
                    match(input,16,FOLLOW_16_in_rule__EscapedChar__CharAlternatives_0_1_01643); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:798:1: rule__NumberLit__Alternatives : ( ( ruleFloatLit ) | ( ruleIntLit ) );
    public final void rule__NumberLit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:802:1: ( ( ruleFloatLit ) | ( ruleIntLit ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:803:1: ( ruleFloatLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:803:1: ( ruleFloatLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:804:1: ruleFloatLit
                    {
                     before(grammarAccess.getNumberLitAccess().getFloatLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFloatLit_in_rule__NumberLit__Alternatives1677);
                    ruleFloatLit();

                    state._fsp--;

                     after(grammarAccess.getNumberLitAccess().getFloatLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:809:6: ( ruleIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:809:6: ( ruleIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:810:1: ruleIntLit
                    {
                     before(grammarAccess.getNumberLitAccess().getIntLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntLit_in_rule__NumberLit__Alternatives1694);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:820:1: rule__FloatLit__Alternatives_1 : ( ( ( rule__FloatLit__DigitsAssignment_1_0 ) ) | ( '_' ) );
    public final void rule__FloatLit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:824:1: ( ( ( rule__FloatLit__DigitsAssignment_1_0 ) ) | ( '_' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DEC_DIGIT) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:825:1: ( ( rule__FloatLit__DigitsAssignment_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:825:1: ( ( rule__FloatLit__DigitsAssignment_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:826:1: ( rule__FloatLit__DigitsAssignment_1_0 )
                    {
                     before(grammarAccess.getFloatLitAccess().getDigitsAssignment_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:827:1: ( rule__FloatLit__DigitsAssignment_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:827:2: rule__FloatLit__DigitsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_1_0_in_rule__FloatLit__Alternatives_11726);
                    rule__FloatLit__DigitsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getDigitsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:831:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:831:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:832:1: '_'
                    {
                     before(grammarAccess.getFloatLitAccess().get_Keyword_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__FloatLit__Alternatives_11745); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:844:1: rule__FloatLit__Alternatives_2_1 : ( ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) ) | ( '_' ) );
    public final void rule__FloatLit__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:848:1: ( ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) ) | ( '_' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DEC_DIGIT) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:849:1: ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:849:1: ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:850:1: ( rule__FloatLit__DigitsAssignment_2_1_0 )
                    {
                     before(grammarAccess.getFloatLitAccess().getDigitsAssignment_2_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:851:1: ( rule__FloatLit__DigitsAssignment_2_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:851:2: rule__FloatLit__DigitsAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_2_1_0_in_rule__FloatLit__Alternatives_2_11779);
                    rule__FloatLit__DigitsAssignment_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getDigitsAssignment_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:855:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:855:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:856:1: '_'
                    {
                     before(grammarAccess.getFloatLitAccess().get_Keyword_2_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__FloatLit__Alternatives_2_11798); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:868:1: rule__FloatLit__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__FloatLit__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:872:1: ( ( 'E' ) | ( 'e' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:873:1: ( 'E' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:873:1: ( 'E' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:874:1: 'E'
                    {
                     before(grammarAccess.getFloatLitAccess().getEKeyword_3_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__FloatLit__Alternatives_3_01833); 
                     after(grammarAccess.getFloatLitAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:881:6: ( 'e' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:881:6: ( 'e' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:882:1: 'e'
                    {
                     before(grammarAccess.getFloatLitAccess().getEKeyword_3_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__FloatLit__Alternatives_3_01853); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:894:1: rule__FloatLit__Alternatives_3_1 : ( ( '+' ) | ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) ) );
    public final void rule__FloatLit__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:898:1: ( ( '+' ) | ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==44) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:899:1: ( '+' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:899:1: ( '+' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:900:1: '+'
                    {
                     before(grammarAccess.getFloatLitAccess().getPlusSignKeyword_3_1_0()); 
                    match(input,20,FOLLOW_20_in_rule__FloatLit__Alternatives_3_11888); 
                     after(grammarAccess.getFloatLitAccess().getPlusSignKeyword_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:907:6: ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:907:6: ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:908:1: ( rule__FloatLit__NegativeExpAssignment_3_1_1 )
                    {
                     before(grammarAccess.getFloatLitAccess().getNegativeExpAssignment_3_1_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:909:1: ( rule__FloatLit__NegativeExpAssignment_3_1_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:909:2: rule__FloatLit__NegativeExpAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__FloatLit__NegativeExpAssignment_3_1_1_in_rule__FloatLit__Alternatives_3_11907);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:918:1: rule__FloatLit__Alternatives_3_2 : ( ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) ) | ( '_' ) );
    public final void rule__FloatLit__Alternatives_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:922:1: ( ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) ) | ( '_' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DEC_DIGIT) ) {
                alt14=1;
            }
            else if ( (LA14_0==17) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:923:1: ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:923:1: ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:924:1: ( rule__FloatLit__DigitsAssignment_3_2_0 )
                    {
                     before(grammarAccess.getFloatLitAccess().getDigitsAssignment_3_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:925:1: ( rule__FloatLit__DigitsAssignment_3_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:925:2: rule__FloatLit__DigitsAssignment_3_2_0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_3_2_0_in_rule__FloatLit__Alternatives_3_21940);
                    rule__FloatLit__DigitsAssignment_3_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getDigitsAssignment_3_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:929:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:929:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:930:1: '_'
                    {
                     before(grammarAccess.getFloatLitAccess().get_Keyword_3_2_1()); 
                    match(input,17,FOLLOW_17_in_rule__FloatLit__Alternatives_3_21959); 
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


    // $ANTLR start "rule__IntLit__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:942:1: rule__IntLit__Alternatives : ( ( ruleDecIntLit ) | ( ruleBinIntLit ) | ( ruleOctIntLit ) | ( ruleHexIntLit ) );
    public final void rule__IntLit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:946:1: ( ( ruleDecIntLit ) | ( ruleBinIntLit ) | ( ruleOctIntLit ) | ( ruleHexIntLit ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_DEC_DIGIT:
                {
                alt15=1;
                }
                break;
            case 41:
                {
                alt15=2;
                }
                break;
            case 42:
                {
                alt15=3;
                }
                break;
            case 43:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:947:1: ( ruleDecIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:947:1: ( ruleDecIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:948:1: ruleDecIntLit
                    {
                     before(grammarAccess.getIntLitAccess().getDecIntLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDecIntLit_in_rule__IntLit__Alternatives1993);
                    ruleDecIntLit();

                    state._fsp--;

                     after(grammarAccess.getIntLitAccess().getDecIntLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:953:6: ( ruleBinIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:953:6: ( ruleBinIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:954:1: ruleBinIntLit
                    {
                     before(grammarAccess.getIntLitAccess().getBinIntLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBinIntLit_in_rule__IntLit__Alternatives2010);
                    ruleBinIntLit();

                    state._fsp--;

                     after(grammarAccess.getIntLitAccess().getBinIntLitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:959:6: ( ruleOctIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:959:6: ( ruleOctIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:960:1: ruleOctIntLit
                    {
                     before(grammarAccess.getIntLitAccess().getOctIntLitParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleOctIntLit_in_rule__IntLit__Alternatives2027);
                    ruleOctIntLit();

                    state._fsp--;

                     after(grammarAccess.getIntLitAccess().getOctIntLitParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:965:6: ( ruleHexIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:965:6: ( ruleHexIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:966:1: ruleHexIntLit
                    {
                     before(grammarAccess.getIntLitAccess().getHexIntLitParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHexIntLit_in_rule__IntLit__Alternatives2044);
                    ruleHexIntLit();

                    state._fsp--;

                     after(grammarAccess.getIntLitAccess().getHexIntLitParserRuleCall_3()); 

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
    // $ANTLR end "rule__IntLit__Alternatives"


    // $ANTLR start "rule__DecIntLit__Alternatives_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:976:1: rule__DecIntLit__Alternatives_1 : ( ( ( rule__DecIntLit__DigitsAssignment_1_0 ) ) | ( '_' ) );
    public final void rule__DecIntLit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:980:1: ( ( ( rule__DecIntLit__DigitsAssignment_1_0 ) ) | ( '_' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DEC_DIGIT) ) {
                alt16=1;
            }
            else if ( (LA16_0==17) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:981:1: ( ( rule__DecIntLit__DigitsAssignment_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:981:1: ( ( rule__DecIntLit__DigitsAssignment_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:982:1: ( rule__DecIntLit__DigitsAssignment_1_0 )
                    {
                     before(grammarAccess.getDecIntLitAccess().getDigitsAssignment_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:983:1: ( rule__DecIntLit__DigitsAssignment_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:983:2: rule__DecIntLit__DigitsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__DecIntLit__DigitsAssignment_1_0_in_rule__DecIntLit__Alternatives_12076);
                    rule__DecIntLit__DigitsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDecIntLitAccess().getDigitsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:987:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:987:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:988:1: '_'
                    {
                     before(grammarAccess.getDecIntLitAccess().get_Keyword_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__DecIntLit__Alternatives_12095); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1000:1: rule__DecIntLit__Alternatives_2_0 : ( ( 'i' ) | ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) ) );
    public final void rule__DecIntLit__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1004:1: ( ( 'i' ) | ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1005:1: ( 'i' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1005:1: ( 'i' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1006:1: 'i'
                    {
                     before(grammarAccess.getDecIntLitAccess().getIKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__DecIntLit__Alternatives_2_02130); 
                     after(grammarAccess.getDecIntLitAccess().getIKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1013:6: ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1013:6: ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1014:1: ( rule__DecIntLit__UnsignedAssignment_2_0_1 )
                    {
                     before(grammarAccess.getDecIntLitAccess().getUnsignedAssignment_2_0_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1015:1: ( rule__DecIntLit__UnsignedAssignment_2_0_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1015:2: rule__DecIntLit__UnsignedAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__DecIntLit__UnsignedAssignment_2_0_1_in_rule__DecIntLit__Alternatives_2_02149);
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


    // $ANTLR start "rule__BinIntLit__Alternatives_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1024:1: rule__BinIntLit__Alternatives_2 : ( ( ( rule__BinIntLit__DigitsAssignment_2_0 ) ) | ( ( rule__BinIntLit__DigitsAssignment_2_1 ) ) | ( '_' ) );
    public final void rule__BinIntLit__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1028:1: ( ( ( rule__BinIntLit__DigitsAssignment_2_0 ) ) | ( ( rule__BinIntLit__DigitsAssignment_2_1 ) ) | ( '_' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt18=1;
                }
                break;
            case 45:
                {
                alt18=2;
                }
                break;
            case 17:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1029:1: ( ( rule__BinIntLit__DigitsAssignment_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1029:1: ( ( rule__BinIntLit__DigitsAssignment_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1030:1: ( rule__BinIntLit__DigitsAssignment_2_0 )
                    {
                     before(grammarAccess.getBinIntLitAccess().getDigitsAssignment_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1031:1: ( rule__BinIntLit__DigitsAssignment_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1031:2: rule__BinIntLit__DigitsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BinIntLit__DigitsAssignment_2_0_in_rule__BinIntLit__Alternatives_22182);
                    rule__BinIntLit__DigitsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinIntLitAccess().getDigitsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1035:6: ( ( rule__BinIntLit__DigitsAssignment_2_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1035:6: ( ( rule__BinIntLit__DigitsAssignment_2_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1036:1: ( rule__BinIntLit__DigitsAssignment_2_1 )
                    {
                     before(grammarAccess.getBinIntLitAccess().getDigitsAssignment_2_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1037:1: ( rule__BinIntLit__DigitsAssignment_2_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1037:2: rule__BinIntLit__DigitsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__BinIntLit__DigitsAssignment_2_1_in_rule__BinIntLit__Alternatives_22200);
                    rule__BinIntLit__DigitsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinIntLitAccess().getDigitsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1041:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1041:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1042:1: '_'
                    {
                     before(grammarAccess.getBinIntLitAccess().get_Keyword_2_2()); 
                    match(input,17,FOLLOW_17_in_rule__BinIntLit__Alternatives_22219); 
                     after(grammarAccess.getBinIntLitAccess().get_Keyword_2_2()); 

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
    // $ANTLR end "rule__BinIntLit__Alternatives_2"


    // $ANTLR start "rule__BinIntLit__Alternatives_3_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1054:1: rule__BinIntLit__Alternatives_3_0 : ( ( 'i' ) | ( ( rule__BinIntLit__UnsignedAssignment_3_0_1 ) ) );
    public final void rule__BinIntLit__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1058:1: ( ( 'i' ) | ( ( rule__BinIntLit__UnsignedAssignment_3_0_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1059:1: ( 'i' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1059:1: ( 'i' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1060:1: 'i'
                    {
                     before(grammarAccess.getBinIntLitAccess().getIKeyword_3_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__BinIntLit__Alternatives_3_02254); 
                     after(grammarAccess.getBinIntLitAccess().getIKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1067:6: ( ( rule__BinIntLit__UnsignedAssignment_3_0_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1067:6: ( ( rule__BinIntLit__UnsignedAssignment_3_0_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1068:1: ( rule__BinIntLit__UnsignedAssignment_3_0_1 )
                    {
                     before(grammarAccess.getBinIntLitAccess().getUnsignedAssignment_3_0_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1069:1: ( rule__BinIntLit__UnsignedAssignment_3_0_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1069:2: rule__BinIntLit__UnsignedAssignment_3_0_1
                    {
                    pushFollow(FOLLOW_rule__BinIntLit__UnsignedAssignment_3_0_1_in_rule__BinIntLit__Alternatives_3_02273);
                    rule__BinIntLit__UnsignedAssignment_3_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinIntLitAccess().getUnsignedAssignment_3_0_1()); 

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
    // $ANTLR end "rule__BinIntLit__Alternatives_3_0"


    // $ANTLR start "rule__OctIntLit__Alternatives_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1078:1: rule__OctIntLit__Alternatives_2 : ( ( ( rule__OctIntLit__DigitsAssignment_2_0 ) ) | ( '_' ) );
    public final void rule__OctIntLit__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1082:1: ( ( ( rule__OctIntLit__DigitsAssignment_2_0 ) ) | ( '_' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_OCT_DIGIT) ) {
                alt20=1;
            }
            else if ( (LA20_0==17) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1083:1: ( ( rule__OctIntLit__DigitsAssignment_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1083:1: ( ( rule__OctIntLit__DigitsAssignment_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1084:1: ( rule__OctIntLit__DigitsAssignment_2_0 )
                    {
                     before(grammarAccess.getOctIntLitAccess().getDigitsAssignment_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1085:1: ( rule__OctIntLit__DigitsAssignment_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1085:2: rule__OctIntLit__DigitsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__OctIntLit__DigitsAssignment_2_0_in_rule__OctIntLit__Alternatives_22306);
                    rule__OctIntLit__DigitsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOctIntLitAccess().getDigitsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1089:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1089:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1090:1: '_'
                    {
                     before(grammarAccess.getOctIntLitAccess().get_Keyword_2_1()); 
                    match(input,17,FOLLOW_17_in_rule__OctIntLit__Alternatives_22325); 
                     after(grammarAccess.getOctIntLitAccess().get_Keyword_2_1()); 

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
    // $ANTLR end "rule__OctIntLit__Alternatives_2"


    // $ANTLR start "rule__OctIntLit__Alternatives_3_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1102:1: rule__OctIntLit__Alternatives_3_0 : ( ( 'i' ) | ( ( rule__OctIntLit__UnsignedAssignment_3_0_1 ) ) );
    public final void rule__OctIntLit__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1106:1: ( ( 'i' ) | ( ( rule__OctIntLit__UnsignedAssignment_3_0_1 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1107:1: ( 'i' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1107:1: ( 'i' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1108:1: 'i'
                    {
                     before(grammarAccess.getOctIntLitAccess().getIKeyword_3_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__OctIntLit__Alternatives_3_02360); 
                     after(grammarAccess.getOctIntLitAccess().getIKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1115:6: ( ( rule__OctIntLit__UnsignedAssignment_3_0_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1115:6: ( ( rule__OctIntLit__UnsignedAssignment_3_0_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1116:1: ( rule__OctIntLit__UnsignedAssignment_3_0_1 )
                    {
                     before(grammarAccess.getOctIntLitAccess().getUnsignedAssignment_3_0_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1117:1: ( rule__OctIntLit__UnsignedAssignment_3_0_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1117:2: rule__OctIntLit__UnsignedAssignment_3_0_1
                    {
                    pushFollow(FOLLOW_rule__OctIntLit__UnsignedAssignment_3_0_1_in_rule__OctIntLit__Alternatives_3_02379);
                    rule__OctIntLit__UnsignedAssignment_3_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOctIntLitAccess().getUnsignedAssignment_3_0_1()); 

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
    // $ANTLR end "rule__OctIntLit__Alternatives_3_0"


    // $ANTLR start "rule__HexIntLit__Alternatives_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1126:1: rule__HexIntLit__Alternatives_2 : ( ( ( rule__HexIntLit__DigitsAssignment_2_0 ) ) | ( '_' ) );
    public final void rule__HexIntLit__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1130:1: ( ( ( rule__HexIntLit__DigitsAssignment_2_0 ) ) | ( '_' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_HEX_DIGIT) ) {
                alt22=1;
            }
            else if ( (LA22_0==17) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1131:1: ( ( rule__HexIntLit__DigitsAssignment_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1131:1: ( ( rule__HexIntLit__DigitsAssignment_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1132:1: ( rule__HexIntLit__DigitsAssignment_2_0 )
                    {
                     before(grammarAccess.getHexIntLitAccess().getDigitsAssignment_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1133:1: ( rule__HexIntLit__DigitsAssignment_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1133:2: rule__HexIntLit__DigitsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__HexIntLit__DigitsAssignment_2_0_in_rule__HexIntLit__Alternatives_22412);
                    rule__HexIntLit__DigitsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHexIntLitAccess().getDigitsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1137:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1137:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1138:1: '_'
                    {
                     before(grammarAccess.getHexIntLitAccess().get_Keyword_2_1()); 
                    match(input,17,FOLLOW_17_in_rule__HexIntLit__Alternatives_22431); 
                     after(grammarAccess.getHexIntLitAccess().get_Keyword_2_1()); 

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
    // $ANTLR end "rule__HexIntLit__Alternatives_2"


    // $ANTLR start "rule__HexIntLit__Alternatives_3_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1150:1: rule__HexIntLit__Alternatives_3_0 : ( ( 'i' ) | ( ( rule__HexIntLit__UnsignedAssignment_3_0_1 ) ) );
    public final void rule__HexIntLit__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1154:1: ( ( 'i' ) | ( ( rule__HexIntLit__UnsignedAssignment_3_0_1 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1155:1: ( 'i' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1155:1: ( 'i' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1156:1: 'i'
                    {
                     before(grammarAccess.getHexIntLitAccess().getIKeyword_3_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__HexIntLit__Alternatives_3_02466); 
                     after(grammarAccess.getHexIntLitAccess().getIKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1163:6: ( ( rule__HexIntLit__UnsignedAssignment_3_0_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1163:6: ( ( rule__HexIntLit__UnsignedAssignment_3_0_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1164:1: ( rule__HexIntLit__UnsignedAssignment_3_0_1 )
                    {
                     before(grammarAccess.getHexIntLitAccess().getUnsignedAssignment_3_0_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1165:1: ( rule__HexIntLit__UnsignedAssignment_3_0_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1165:2: rule__HexIntLit__UnsignedAssignment_3_0_1
                    {
                    pushFollow(FOLLOW_rule__HexIntLit__UnsignedAssignment_3_0_1_in_rule__HexIntLit__Alternatives_3_02485);
                    rule__HexIntLit__UnsignedAssignment_3_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getHexIntLitAccess().getUnsignedAssignment_3_0_1()); 

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
    // $ANTLR end "rule__HexIntLit__Alternatives_3_0"


    // $ANTLR start "rule__FloatSize__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1174:1: rule__FloatSize__Alternatives : ( ( ( '32' ) ) | ( ( '64' ) ) );
    public final void rule__FloatSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1178:1: ( ( ( '32' ) ) | ( ( '64' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            else if ( (LA24_0==23) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1179:1: ( ( '32' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1179:1: ( ( '32' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1180:1: ( '32' )
                    {
                     before(grammarAccess.getFloatSizeAccess().getFLOATEnumLiteralDeclaration_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1181:1: ( '32' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1181:3: '32'
                    {
                    match(input,22,FOLLOW_22_in_rule__FloatSize__Alternatives2519); 

                    }

                     after(grammarAccess.getFloatSizeAccess().getFLOATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1186:6: ( ( '64' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1186:6: ( ( '64' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1187:1: ( '64' )
                    {
                     before(grammarAccess.getFloatSizeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1188:1: ( '64' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1188:3: '64'
                    {
                    match(input,23,FOLLOW_23_in_rule__FloatSize__Alternatives2540); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1198:1: rule__IntSize__Alternatives : ( ( ( '8' ) ) | ( ( '16' ) ) | ( ( '32' ) ) | ( ( '64' ) ) );
    public final void rule__IntSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1202:1: ( ( ( '8' ) ) | ( ( '16' ) ) | ( ( '32' ) ) | ( ( '64' ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt25=1;
                }
                break;
            case 25:
                {
                alt25=2;
                }
                break;
            case 22:
                {
                alt25=3;
                }
                break;
            case 23:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1203:1: ( ( '8' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1203:1: ( ( '8' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1204:1: ( '8' )
                    {
                     before(grammarAccess.getIntSizeAccess().getBYTEEnumLiteralDeclaration_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1205:1: ( '8' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1205:3: '8'
                    {
                    match(input,24,FOLLOW_24_in_rule__IntSize__Alternatives2576); 

                    }

                     after(grammarAccess.getIntSizeAccess().getBYTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1210:6: ( ( '16' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1210:6: ( ( '16' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1211:1: ( '16' )
                    {
                     before(grammarAccess.getIntSizeAccess().getSHORTEnumLiteralDeclaration_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1212:1: ( '16' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1212:3: '16'
                    {
                    match(input,25,FOLLOW_25_in_rule__IntSize__Alternatives2597); 

                    }

                     after(grammarAccess.getIntSizeAccess().getSHORTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1217:6: ( ( '32' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1217:6: ( ( '32' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1218:1: ( '32' )
                    {
                     before(grammarAccess.getIntSizeAccess().getINTEnumLiteralDeclaration_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1219:1: ( '32' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1219:3: '32'
                    {
                    match(input,22,FOLLOW_22_in_rule__IntSize__Alternatives2618); 

                    }

                     after(grammarAccess.getIntSizeAccess().getINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1224:6: ( ( '64' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1224:6: ( ( '64' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1225:1: ( '64' )
                    {
                     before(grammarAccess.getIntSizeAccess().getLONGEnumLiteralDeclaration_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1226:1: ( '64' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1226:3: '64'
                    {
                    match(input,23,FOLLOW_23_in_rule__IntSize__Alternatives2639); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1238:1: rule__ItemAttr__Group__0 : rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 ;
    public final void rule__ItemAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1242:1: ( rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1243:2: rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02672);
            rule__ItemAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02675);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1250:1: rule__ItemAttr__Group__0__Impl : ( '#[' ) ;
    public final void rule__ItemAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1254:1: ( ( '#[' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1255:1: ( '#[' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1255:1: ( '#[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1256:1: '#['
            {
             before(grammarAccess.getItemAttrAccess().getNumberSignLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ItemAttr__Group__0__Impl2703); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1269:1: rule__ItemAttr__Group__1 : rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 ;
    public final void rule__ItemAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1273:1: ( rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1274:2: rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12734);
            rule__ItemAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12737);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1281:1: rule__ItemAttr__Group__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_1 ) ) ;
    public final void rule__ItemAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1285:1: ( ( ( rule__ItemAttr__AttrsAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1286:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1286:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1287:1: ( rule__ItemAttr__AttrsAssignment_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1288:1: ( rule__ItemAttr__AttrsAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1288:2: rule__ItemAttr__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl2764);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1298:1: rule__ItemAttr__Group__2 : rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 ;
    public final void rule__ItemAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1302:1: ( rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1303:2: rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__22794);
            rule__ItemAttr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__22797);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1310:1: rule__ItemAttr__Group__2__Impl : ( ( rule__ItemAttr__Group_2__0 )* ) ;
    public final void rule__ItemAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1314:1: ( ( ( rule__ItemAttr__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1315:1: ( ( rule__ItemAttr__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1315:1: ( ( rule__ItemAttr__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1316:1: ( rule__ItemAttr__Group_2__0 )*
            {
             before(grammarAccess.getItemAttrAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1317:1: ( rule__ItemAttr__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1317:2: rule__ItemAttr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl2824);
            	    rule__ItemAttr__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1327:1: rule__ItemAttr__Group__3 : rule__ItemAttr__Group__3__Impl ;
    public final void rule__ItemAttr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1331:1: ( rule__ItemAttr__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1332:2: rule__ItemAttr__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__32855);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1338:1: rule__ItemAttr__Group__3__Impl : ( ']' ) ;
    public final void rule__ItemAttr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1342:1: ( ( ']' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1343:1: ( ']' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1343:1: ( ']' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1344:1: ']'
            {
             before(grammarAccess.getItemAttrAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__ItemAttr__Group__3__Impl2883); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1365:1: rule__ItemAttr__Group_2__0 : rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 ;
    public final void rule__ItemAttr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1369:1: ( rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1370:2: rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__02922);
            rule__ItemAttr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__02925);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1377:1: rule__ItemAttr__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ItemAttr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1381:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1382:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1382:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1383:1: ','
            {
             before(grammarAccess.getItemAttrAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__ItemAttr__Group_2__0__Impl2953); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1396:1: rule__ItemAttr__Group_2__1 : rule__ItemAttr__Group_2__1__Impl ;
    public final void rule__ItemAttr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1400:1: ( rule__ItemAttr__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1401:2: rule__ItemAttr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__12984);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1407:1: rule__ItemAttr__Group_2__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) ;
    public final void rule__ItemAttr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1411:1: ( ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1412:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1412:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1413:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1414:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1414:2: rule__ItemAttr__AttrsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl3011);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1428:1: rule__AttrWithList__Group__0 : rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 ;
    public final void rule__AttrWithList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1432:1: ( rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1433:2: rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__03045);
            rule__AttrWithList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__03048);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1440:1: rule__AttrWithList__Group__0__Impl : ( ( rule__AttrWithList__IdentAssignment_0 ) ) ;
    public final void rule__AttrWithList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1444:1: ( ( ( rule__AttrWithList__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1445:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1445:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1446:1: ( rule__AttrWithList__IdentAssignment_0 )
            {
             before(grammarAccess.getAttrWithListAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1447:1: ( rule__AttrWithList__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1447:2: rule__AttrWithList__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl3075);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1457:1: rule__AttrWithList__Group__1 : rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 ;
    public final void rule__AttrWithList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1461:1: ( rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1462:2: rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__13105);
            rule__AttrWithList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__13108);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1469:1: rule__AttrWithList__Group__1__Impl : ( '(' ) ;
    public final void rule__AttrWithList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1473:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1474:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1474:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1475:1: '('
            {
             before(grammarAccess.getAttrWithListAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__AttrWithList__Group__1__Impl3136); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1488:1: rule__AttrWithList__Group__2 : rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 ;
    public final void rule__AttrWithList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1492:1: ( rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1493:2: rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__23167);
            rule__AttrWithList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__23170);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1500:1: rule__AttrWithList__Group__2__Impl : ( ( rule__AttrWithList__AttrsAssignment_2 ) ) ;
    public final void rule__AttrWithList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1504:1: ( ( ( rule__AttrWithList__AttrsAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1505:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1505:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1506:1: ( rule__AttrWithList__AttrsAssignment_2 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1507:1: ( rule__AttrWithList__AttrsAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1507:2: rule__AttrWithList__AttrsAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl3197);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1517:1: rule__AttrWithList__Group__3 : rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 ;
    public final void rule__AttrWithList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1521:1: ( rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1522:2: rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__33227);
            rule__AttrWithList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__33230);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1529:1: rule__AttrWithList__Group__3__Impl : ( ( rule__AttrWithList__Group_3__0 )* ) ;
    public final void rule__AttrWithList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1533:1: ( ( ( rule__AttrWithList__Group_3__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1534:1: ( ( rule__AttrWithList__Group_3__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1534:1: ( ( rule__AttrWithList__Group_3__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1535:1: ( rule__AttrWithList__Group_3__0 )*
            {
             before(grammarAccess.getAttrWithListAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1536:1: ( rule__AttrWithList__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1536:2: rule__AttrWithList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl3257);
            	    rule__AttrWithList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1546:1: rule__AttrWithList__Group__4 : rule__AttrWithList__Group__4__Impl ;
    public final void rule__AttrWithList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1550:1: ( rule__AttrWithList__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1551:2: rule__AttrWithList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__43288);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1557:1: rule__AttrWithList__Group__4__Impl : ( ')' ) ;
    public final void rule__AttrWithList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1561:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1562:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1562:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1563:1: ')'
            {
             before(grammarAccess.getAttrWithListAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__AttrWithList__Group__4__Impl3316); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1586:1: rule__AttrWithList__Group_3__0 : rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 ;
    public final void rule__AttrWithList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1590:1: ( rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1591:2: rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__03357);
            rule__AttrWithList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__03360);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1598:1: rule__AttrWithList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AttrWithList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1602:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1603:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1603:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1604:1: ','
            {
             before(grammarAccess.getAttrWithListAccess().getCommaKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__AttrWithList__Group_3__0__Impl3388); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1617:1: rule__AttrWithList__Group_3__1 : rule__AttrWithList__Group_3__1__Impl ;
    public final void rule__AttrWithList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1621:1: ( rule__AttrWithList__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1622:2: rule__AttrWithList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__13419);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1628:1: rule__AttrWithList__Group_3__1__Impl : ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) ;
    public final void rule__AttrWithList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1632:1: ( ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1633:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1633:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1634:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1635:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1635:2: rule__AttrWithList__AttrsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl3446);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1649:1: rule__LiteralAttr__Group__0 : rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 ;
    public final void rule__LiteralAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1653:1: ( rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1654:2: rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__03480);
            rule__LiteralAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__03483);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1661:1: rule__LiteralAttr__Group__0__Impl : ( ( rule__LiteralAttr__IdentAssignment_0 ) ) ;
    public final void rule__LiteralAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1665:1: ( ( ( rule__LiteralAttr__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1666:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1666:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1667:1: ( rule__LiteralAttr__IdentAssignment_0 )
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1668:1: ( rule__LiteralAttr__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1668:2: rule__LiteralAttr__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl3510);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1678:1: rule__LiteralAttr__Group__1 : rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 ;
    public final void rule__LiteralAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1682:1: ( rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1683:2: rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__13540);
            rule__LiteralAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__13543);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1690:1: rule__LiteralAttr__Group__1__Impl : ( '=' ) ;
    public final void rule__LiteralAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1694:1: ( ( '=' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1695:1: ( '=' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1695:1: ( '=' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1696:1: '='
            {
             before(grammarAccess.getLiteralAttrAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__LiteralAttr__Group__1__Impl3571); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1709:1: rule__LiteralAttr__Group__2 : rule__LiteralAttr__Group__2__Impl ;
    public final void rule__LiteralAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1713:1: ( rule__LiteralAttr__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1714:2: rule__LiteralAttr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23602);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1720:1: rule__LiteralAttr__Group__2__Impl : ( ( rule__LiteralAttr__ValueAssignment_2 ) ) ;
    public final void rule__LiteralAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1724:1: ( ( ( rule__LiteralAttr__ValueAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1725:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1725:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1726:1: ( rule__LiteralAttr__ValueAssignment_2 )
            {
             before(grammarAccess.getLiteralAttrAccess().getValueAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1727:1: ( rule__LiteralAttr__ValueAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1727:2: rule__LiteralAttr__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3629);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1743:1: rule__ItemAndAttrs__Group__0 : rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 ;
    public final void rule__ItemAndAttrs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1747:1: ( rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1748:2: rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03665);
            rule__ItemAndAttrs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03668);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1755:1: rule__ItemAndAttrs__Group__0__Impl : ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) ;
    public final void rule__ItemAndAttrs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1759:1: ( ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1760:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1760:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1761:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1762:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1762:2: rule__ItemAndAttrs__AttrsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3695);
            	    rule__ItemAndAttrs__AttrsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1772:1: rule__ItemAndAttrs__Group__1 : rule__ItemAndAttrs__Group__1__Impl ;
    public final void rule__ItemAndAttrs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1776:1: ( rule__ItemAndAttrs__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1777:2: rule__ItemAndAttrs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13726);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1783:1: rule__ItemAndAttrs__Group__1__Impl : ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) ;
    public final void rule__ItemAndAttrs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1787:1: ( ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1788:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1788:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1789:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1790:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1790:2: rule__ItemAndAttrs__ItemAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3753);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1804:1: rule__ModItem__Group__0 : rule__ModItem__Group__0__Impl rule__ModItem__Group__1 ;
    public final void rule__ModItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1808:1: ( rule__ModItem__Group__0__Impl rule__ModItem__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1809:2: rule__ModItem__Group__0__Impl rule__ModItem__Group__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__03787);
            rule__ModItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__03790);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1816:1: rule__ModItem__Group__0__Impl : ( 'mod' ) ;
    public final void rule__ModItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1820:1: ( ( 'mod' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1821:1: ( 'mod' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1821:1: ( 'mod' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1822:1: 'mod'
            {
             before(grammarAccess.getModItemAccess().getModKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ModItem__Group__0__Impl3818); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1835:1: rule__ModItem__Group__1 : rule__ModItem__Group__1__Impl rule__ModItem__Group__2 ;
    public final void rule__ModItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1839:1: ( rule__ModItem__Group__1__Impl rule__ModItem__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1840:2: rule__ModItem__Group__1__Impl rule__ModItem__Group__2
            {
            pushFollow(FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__13849);
            rule__ModItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__13852);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1847:1: rule__ModItem__Group__1__Impl : ( ( rule__ModItem__IdentAssignment_1 ) ) ;
    public final void rule__ModItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1851:1: ( ( ( rule__ModItem__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1852:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1852:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1853:1: ( rule__ModItem__IdentAssignment_1 )
            {
             before(grammarAccess.getModItemAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1854:1: ( rule__ModItem__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1854:2: rule__ModItem__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl3879);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1864:1: rule__ModItem__Group__2 : rule__ModItem__Group__2__Impl ;
    public final void rule__ModItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1868:1: ( rule__ModItem__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1869:2: rule__ModItem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__23909);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1875:1: rule__ModItem__Group__2__Impl : ( ( rule__ModItem__Alternatives_2 ) ) ;
    public final void rule__ModItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1879:1: ( ( ( rule__ModItem__Alternatives_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1880:1: ( ( rule__ModItem__Alternatives_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1880:1: ( ( rule__ModItem__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1881:1: ( rule__ModItem__Alternatives_2 )
            {
             before(grammarAccess.getModItemAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1882:1: ( rule__ModItem__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1882:2: rule__ModItem__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl3936);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1898:1: rule__ModItem__Group_2_1__0 : rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 ;
    public final void rule__ModItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1902:1: ( rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1903:2: rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__03972);
            rule__ModItem__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__03975);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1910:1: rule__ModItem__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__ModItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1914:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1915:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1915:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1916:1: '{'
            {
             before(grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,33,FOLLOW_33_in_rule__ModItem__Group_2_1__0__Impl4003); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1929:1: rule__ModItem__Group_2_1__1 : rule__ModItem__Group_2_1__1__Impl ;
    public final void rule__ModItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1933:1: ( rule__ModItem__Group_2_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1934:2: rule__ModItem__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__14034);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1940:1: rule__ModItem__Group_2_1__1__Impl : ( '}' ) ;
    public final void rule__ModItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1944:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1945:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1945:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1946:1: '}'
            {
             before(grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_1()); 
            match(input,34,FOLLOW_34_in_rule__ModItem__Group_2_1__1__Impl4062); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1963:1: rule__CharLit__Group__0 : rule__CharLit__Group__0__Impl rule__CharLit__Group__1 ;
    public final void rule__CharLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1967:1: ( rule__CharLit__Group__0__Impl rule__CharLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1968:2: rule__CharLit__Group__0__Impl rule__CharLit__Group__1
            {
            pushFollow(FOLLOW_rule__CharLit__Group__0__Impl_in_rule__CharLit__Group__04097);
            rule__CharLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharLit__Group__1_in_rule__CharLit__Group__04100);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1975:1: rule__CharLit__Group__0__Impl : ( '\\'' ) ;
    public final void rule__CharLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1979:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1980:1: ( '\\'' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1980:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1981:1: '\\''
            {
             before(grammarAccess.getCharLitAccess().getApostropheKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__CharLit__Group__0__Impl4128); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1994:1: rule__CharLit__Group__1 : rule__CharLit__Group__1__Impl rule__CharLit__Group__2 ;
    public final void rule__CharLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1998:1: ( rule__CharLit__Group__1__Impl rule__CharLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1999:2: rule__CharLit__Group__1__Impl rule__CharLit__Group__2
            {
            pushFollow(FOLLOW_rule__CharLit__Group__1__Impl_in_rule__CharLit__Group__14159);
            rule__CharLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharLit__Group__2_in_rule__CharLit__Group__14162);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2006:1: rule__CharLit__Group__1__Impl : ( ( rule__CharLit__Alternatives_1 ) ) ;
    public final void rule__CharLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2010:1: ( ( ( rule__CharLit__Alternatives_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2011:1: ( ( rule__CharLit__Alternatives_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2011:1: ( ( rule__CharLit__Alternatives_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2012:1: ( rule__CharLit__Alternatives_1 )
            {
             before(grammarAccess.getCharLitAccess().getAlternatives_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2013:1: ( rule__CharLit__Alternatives_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2013:2: rule__CharLit__Alternatives_1
            {
            pushFollow(FOLLOW_rule__CharLit__Alternatives_1_in_rule__CharLit__Group__1__Impl4189);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2023:1: rule__CharLit__Group__2 : rule__CharLit__Group__2__Impl ;
    public final void rule__CharLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2027:1: ( rule__CharLit__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2028:2: rule__CharLit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CharLit__Group__2__Impl_in_rule__CharLit__Group__24219);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2034:1: rule__CharLit__Group__2__Impl : ( '\\'' ) ;
    public final void rule__CharLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2038:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2039:1: ( '\\'' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2039:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2040:1: '\\''
            {
             before(grammarAccess.getCharLitAccess().getApostropheKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__CharLit__Group__2__Impl4247); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2059:1: rule__CharLit__Group_1_1__0 : rule__CharLit__Group_1_1__0__Impl rule__CharLit__Group_1_1__1 ;
    public final void rule__CharLit__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2063:1: ( rule__CharLit__Group_1_1__0__Impl rule__CharLit__Group_1_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2064:2: rule__CharLit__Group_1_1__0__Impl rule__CharLit__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CharLit__Group_1_1__0__Impl_in_rule__CharLit__Group_1_1__04284);
            rule__CharLit__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharLit__Group_1_1__1_in_rule__CharLit__Group_1_1__04287);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2071:1: rule__CharLit__Group_1_1__0__Impl : ( '\\\\' ) ;
    public final void rule__CharLit__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2075:1: ( ( '\\\\' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2076:1: ( '\\\\' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2076:1: ( '\\\\' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2077:1: '\\\\'
            {
             before(grammarAccess.getCharLitAccess().getReverseSolidusKeyword_1_1_0()); 
            match(input,12,FOLLOW_12_in_rule__CharLit__Group_1_1__0__Impl4315); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2090:1: rule__CharLit__Group_1_1__1 : rule__CharLit__Group_1_1__1__Impl ;
    public final void rule__CharLit__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2094:1: ( rule__CharLit__Group_1_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2095:2: rule__CharLit__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CharLit__Group_1_1__1__Impl_in_rule__CharLit__Group_1_1__14346);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2101:1: rule__CharLit__Group_1_1__1__Impl : ( ( rule__CharLit__Alternatives_1_1_1 ) ) ;
    public final void rule__CharLit__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2105:1: ( ( ( rule__CharLit__Alternatives_1_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2106:1: ( ( rule__CharLit__Alternatives_1_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2106:1: ( ( rule__CharLit__Alternatives_1_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2107:1: ( rule__CharLit__Alternatives_1_1_1 )
            {
             before(grammarAccess.getCharLitAccess().getAlternatives_1_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2108:1: ( rule__CharLit__Alternatives_1_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2108:2: rule__CharLit__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_rule__CharLit__Alternatives_1_1_1_in_rule__CharLit__Group_1_1__1__Impl4373);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2122:1: rule__EscapedChar__Group_0__0 : rule__EscapedChar__Group_0__0__Impl rule__EscapedChar__Group_0__1 ;
    public final void rule__EscapedChar__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2126:1: ( rule__EscapedChar__Group_0__0__Impl rule__EscapedChar__Group_0__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2127:2: rule__EscapedChar__Group_0__0__Impl rule__EscapedChar__Group_0__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_0__0__Impl_in_rule__EscapedChar__Group_0__04407);
            rule__EscapedChar__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_0__1_in_rule__EscapedChar__Group_0__04410);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2134:1: rule__EscapedChar__Group_0__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2138:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2139:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2139:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2140:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getEscapedCharAction_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2141:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2143:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2153:1: rule__EscapedChar__Group_0__1 : rule__EscapedChar__Group_0__1__Impl ;
    public final void rule__EscapedChar__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2157:1: ( rule__EscapedChar__Group_0__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2158:2: rule__EscapedChar__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_0__1__Impl_in_rule__EscapedChar__Group_0__14468);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2164:1: rule__EscapedChar__Group_0__1__Impl : ( ( rule__EscapedChar__CharAssignment_0_1 ) ) ;
    public final void rule__EscapedChar__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2168:1: ( ( ( rule__EscapedChar__CharAssignment_0_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2169:1: ( ( rule__EscapedChar__CharAssignment_0_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2169:1: ( ( rule__EscapedChar__CharAssignment_0_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2170:1: ( rule__EscapedChar__CharAssignment_0_1 )
            {
             before(grammarAccess.getEscapedCharAccess().getCharAssignment_0_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2171:1: ( rule__EscapedChar__CharAssignment_0_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2171:2: rule__EscapedChar__CharAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EscapedChar__CharAssignment_0_1_in_rule__EscapedChar__Group_0__1__Impl4495);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2185:1: rule__EscapedChar__Group_1__0 : rule__EscapedChar__Group_1__0__Impl rule__EscapedChar__Group_1__1 ;
    public final void rule__EscapedChar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2189:1: ( rule__EscapedChar__Group_1__0__Impl rule__EscapedChar__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2190:2: rule__EscapedChar__Group_1__0__Impl rule__EscapedChar__Group_1__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__0__Impl_in_rule__EscapedChar__Group_1__04529);
            rule__EscapedChar__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_1__1_in_rule__EscapedChar__Group_1__04532);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2197:1: rule__EscapedChar__Group_1__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2201:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2202:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2202:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2203:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2204:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2206:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2216:1: rule__EscapedChar__Group_1__1 : rule__EscapedChar__Group_1__1__Impl rule__EscapedChar__Group_1__2 ;
    public final void rule__EscapedChar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2220:1: ( rule__EscapedChar__Group_1__1__Impl rule__EscapedChar__Group_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2221:2: rule__EscapedChar__Group_1__1__Impl rule__EscapedChar__Group_1__2
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__1__Impl_in_rule__EscapedChar__Group_1__14590);
            rule__EscapedChar__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_1__2_in_rule__EscapedChar__Group_1__14593);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2228:1: rule__EscapedChar__Group_1__1__Impl : ( 'x' ) ;
    public final void rule__EscapedChar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2232:1: ( ( 'x' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2233:1: ( 'x' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2233:1: ( 'x' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2234:1: 'x'
            {
             before(grammarAccess.getEscapedCharAccess().getXKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__EscapedChar__Group_1__1__Impl4621); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2247:1: rule__EscapedChar__Group_1__2 : rule__EscapedChar__Group_1__2__Impl rule__EscapedChar__Group_1__3 ;
    public final void rule__EscapedChar__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2251:1: ( rule__EscapedChar__Group_1__2__Impl rule__EscapedChar__Group_1__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2252:2: rule__EscapedChar__Group_1__2__Impl rule__EscapedChar__Group_1__3
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__2__Impl_in_rule__EscapedChar__Group_1__24652);
            rule__EscapedChar__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_1__3_in_rule__EscapedChar__Group_1__24655);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2259:1: rule__EscapedChar__Group_1__2__Impl : ( ( rule__EscapedChar__DigitsAssignment_1_2 ) ) ;
    public final void rule__EscapedChar__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2263:1: ( ( ( rule__EscapedChar__DigitsAssignment_1_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2264:1: ( ( rule__EscapedChar__DigitsAssignment_1_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2264:1: ( ( rule__EscapedChar__DigitsAssignment_1_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2265:1: ( rule__EscapedChar__DigitsAssignment_1_2 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2266:1: ( rule__EscapedChar__DigitsAssignment_1_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2266:2: rule__EscapedChar__DigitsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_1_2_in_rule__EscapedChar__Group_1__2__Impl4682);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2276:1: rule__EscapedChar__Group_1__3 : rule__EscapedChar__Group_1__3__Impl ;
    public final void rule__EscapedChar__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2280:1: ( rule__EscapedChar__Group_1__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2281:2: rule__EscapedChar__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__3__Impl_in_rule__EscapedChar__Group_1__34712);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2287:1: rule__EscapedChar__Group_1__3__Impl : ( ( rule__EscapedChar__DigitsAssignment_1_3 ) ) ;
    public final void rule__EscapedChar__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2291:1: ( ( ( rule__EscapedChar__DigitsAssignment_1_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2292:1: ( ( rule__EscapedChar__DigitsAssignment_1_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2292:1: ( ( rule__EscapedChar__DigitsAssignment_1_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2293:1: ( rule__EscapedChar__DigitsAssignment_1_3 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2294:1: ( rule__EscapedChar__DigitsAssignment_1_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2294:2: rule__EscapedChar__DigitsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_1_3_in_rule__EscapedChar__Group_1__3__Impl4739);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2312:1: rule__EscapedChar__Group_2__0 : rule__EscapedChar__Group_2__0__Impl rule__EscapedChar__Group_2__1 ;
    public final void rule__EscapedChar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2316:1: ( rule__EscapedChar__Group_2__0__Impl rule__EscapedChar__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2317:2: rule__EscapedChar__Group_2__0__Impl rule__EscapedChar__Group_2__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__0__Impl_in_rule__EscapedChar__Group_2__04777);
            rule__EscapedChar__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__1_in_rule__EscapedChar__Group_2__04780);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2324:1: rule__EscapedChar__Group_2__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2328:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2329:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2329:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2330:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_2_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2331:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2333:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2343:1: rule__EscapedChar__Group_2__1 : rule__EscapedChar__Group_2__1__Impl rule__EscapedChar__Group_2__2 ;
    public final void rule__EscapedChar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2347:1: ( rule__EscapedChar__Group_2__1__Impl rule__EscapedChar__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2348:2: rule__EscapedChar__Group_2__1__Impl rule__EscapedChar__Group_2__2
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__1__Impl_in_rule__EscapedChar__Group_2__14838);
            rule__EscapedChar__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__2_in_rule__EscapedChar__Group_2__14841);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2355:1: rule__EscapedChar__Group_2__1__Impl : ( 'u' ) ;
    public final void rule__EscapedChar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2359:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2360:1: ( 'u' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2360:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2361:1: 'u'
            {
             before(grammarAccess.getEscapedCharAccess().getUKeyword_2_1()); 
            match(input,37,FOLLOW_37_in_rule__EscapedChar__Group_2__1__Impl4869); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2374:1: rule__EscapedChar__Group_2__2 : rule__EscapedChar__Group_2__2__Impl rule__EscapedChar__Group_2__3 ;
    public final void rule__EscapedChar__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2378:1: ( rule__EscapedChar__Group_2__2__Impl rule__EscapedChar__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2379:2: rule__EscapedChar__Group_2__2__Impl rule__EscapedChar__Group_2__3
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__2__Impl_in_rule__EscapedChar__Group_2__24900);
            rule__EscapedChar__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__3_in_rule__EscapedChar__Group_2__24903);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2386:1: rule__EscapedChar__Group_2__2__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_2 ) ) ;
    public final void rule__EscapedChar__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2390:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2391:1: ( ( rule__EscapedChar__DigitsAssignment_2_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2391:1: ( ( rule__EscapedChar__DigitsAssignment_2_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2392:1: ( rule__EscapedChar__DigitsAssignment_2_2 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2393:1: ( rule__EscapedChar__DigitsAssignment_2_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2393:2: rule__EscapedChar__DigitsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_2_in_rule__EscapedChar__Group_2__2__Impl4930);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2403:1: rule__EscapedChar__Group_2__3 : rule__EscapedChar__Group_2__3__Impl rule__EscapedChar__Group_2__4 ;
    public final void rule__EscapedChar__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2407:1: ( rule__EscapedChar__Group_2__3__Impl rule__EscapedChar__Group_2__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2408:2: rule__EscapedChar__Group_2__3__Impl rule__EscapedChar__Group_2__4
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__3__Impl_in_rule__EscapedChar__Group_2__34960);
            rule__EscapedChar__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__4_in_rule__EscapedChar__Group_2__34963);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2415:1: rule__EscapedChar__Group_2__3__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_3 ) ) ;
    public final void rule__EscapedChar__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2419:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2420:1: ( ( rule__EscapedChar__DigitsAssignment_2_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2420:1: ( ( rule__EscapedChar__DigitsAssignment_2_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2421:1: ( rule__EscapedChar__DigitsAssignment_2_3 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2422:1: ( rule__EscapedChar__DigitsAssignment_2_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2422:2: rule__EscapedChar__DigitsAssignment_2_3
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_3_in_rule__EscapedChar__Group_2__3__Impl4990);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2432:1: rule__EscapedChar__Group_2__4 : rule__EscapedChar__Group_2__4__Impl rule__EscapedChar__Group_2__5 ;
    public final void rule__EscapedChar__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2436:1: ( rule__EscapedChar__Group_2__4__Impl rule__EscapedChar__Group_2__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2437:2: rule__EscapedChar__Group_2__4__Impl rule__EscapedChar__Group_2__5
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__4__Impl_in_rule__EscapedChar__Group_2__45020);
            rule__EscapedChar__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__5_in_rule__EscapedChar__Group_2__45023);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2444:1: rule__EscapedChar__Group_2__4__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_4 ) ) ;
    public final void rule__EscapedChar__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2448:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2449:1: ( ( rule__EscapedChar__DigitsAssignment_2_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2449:1: ( ( rule__EscapedChar__DigitsAssignment_2_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2450:1: ( rule__EscapedChar__DigitsAssignment_2_4 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2451:1: ( rule__EscapedChar__DigitsAssignment_2_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2451:2: rule__EscapedChar__DigitsAssignment_2_4
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_4_in_rule__EscapedChar__Group_2__4__Impl5050);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2461:1: rule__EscapedChar__Group_2__5 : rule__EscapedChar__Group_2__5__Impl ;
    public final void rule__EscapedChar__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2465:1: ( rule__EscapedChar__Group_2__5__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2466:2: rule__EscapedChar__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__5__Impl_in_rule__EscapedChar__Group_2__55080);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2472:1: rule__EscapedChar__Group_2__5__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_5 ) ) ;
    public final void rule__EscapedChar__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2476:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_5 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2477:1: ( ( rule__EscapedChar__DigitsAssignment_2_5 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2477:1: ( ( rule__EscapedChar__DigitsAssignment_2_5 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2478:1: ( rule__EscapedChar__DigitsAssignment_2_5 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2479:1: ( rule__EscapedChar__DigitsAssignment_2_5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2479:2: rule__EscapedChar__DigitsAssignment_2_5
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_5_in_rule__EscapedChar__Group_2__5__Impl5107);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2501:1: rule__EscapedChar__Group_3__0 : rule__EscapedChar__Group_3__0__Impl rule__EscapedChar__Group_3__1 ;
    public final void rule__EscapedChar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2505:1: ( rule__EscapedChar__Group_3__0__Impl rule__EscapedChar__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2506:2: rule__EscapedChar__Group_3__0__Impl rule__EscapedChar__Group_3__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__0__Impl_in_rule__EscapedChar__Group_3__05149);
            rule__EscapedChar__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__1_in_rule__EscapedChar__Group_3__05152);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2513:1: rule__EscapedChar__Group_3__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2517:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2518:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2518:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2519:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2520:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2522:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2532:1: rule__EscapedChar__Group_3__1 : rule__EscapedChar__Group_3__1__Impl rule__EscapedChar__Group_3__2 ;
    public final void rule__EscapedChar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2536:1: ( rule__EscapedChar__Group_3__1__Impl rule__EscapedChar__Group_3__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2537:2: rule__EscapedChar__Group_3__1__Impl rule__EscapedChar__Group_3__2
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__1__Impl_in_rule__EscapedChar__Group_3__15210);
            rule__EscapedChar__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__2_in_rule__EscapedChar__Group_3__15213);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2544:1: rule__EscapedChar__Group_3__1__Impl : ( 'U' ) ;
    public final void rule__EscapedChar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2548:1: ( ( 'U' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2549:1: ( 'U' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2549:1: ( 'U' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2550:1: 'U'
            {
             before(grammarAccess.getEscapedCharAccess().getUKeyword_3_1()); 
            match(input,38,FOLLOW_38_in_rule__EscapedChar__Group_3__1__Impl5241); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2563:1: rule__EscapedChar__Group_3__2 : rule__EscapedChar__Group_3__2__Impl rule__EscapedChar__Group_3__3 ;
    public final void rule__EscapedChar__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2567:1: ( rule__EscapedChar__Group_3__2__Impl rule__EscapedChar__Group_3__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2568:2: rule__EscapedChar__Group_3__2__Impl rule__EscapedChar__Group_3__3
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__2__Impl_in_rule__EscapedChar__Group_3__25272);
            rule__EscapedChar__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__3_in_rule__EscapedChar__Group_3__25275);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2575:1: rule__EscapedChar__Group_3__2__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_2 ) ) ;
    public final void rule__EscapedChar__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2579:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2580:1: ( ( rule__EscapedChar__DigitsAssignment_3_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2580:1: ( ( rule__EscapedChar__DigitsAssignment_3_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2581:1: ( rule__EscapedChar__DigitsAssignment_3_2 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2582:1: ( rule__EscapedChar__DigitsAssignment_3_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2582:2: rule__EscapedChar__DigitsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_2_in_rule__EscapedChar__Group_3__2__Impl5302);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2592:1: rule__EscapedChar__Group_3__3 : rule__EscapedChar__Group_3__3__Impl rule__EscapedChar__Group_3__4 ;
    public final void rule__EscapedChar__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2596:1: ( rule__EscapedChar__Group_3__3__Impl rule__EscapedChar__Group_3__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2597:2: rule__EscapedChar__Group_3__3__Impl rule__EscapedChar__Group_3__4
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__3__Impl_in_rule__EscapedChar__Group_3__35332);
            rule__EscapedChar__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__4_in_rule__EscapedChar__Group_3__35335);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2604:1: rule__EscapedChar__Group_3__3__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_3 ) ) ;
    public final void rule__EscapedChar__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2608:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2609:1: ( ( rule__EscapedChar__DigitsAssignment_3_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2609:1: ( ( rule__EscapedChar__DigitsAssignment_3_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2610:1: ( rule__EscapedChar__DigitsAssignment_3_3 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2611:1: ( rule__EscapedChar__DigitsAssignment_3_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2611:2: rule__EscapedChar__DigitsAssignment_3_3
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_3_in_rule__EscapedChar__Group_3__3__Impl5362);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2621:1: rule__EscapedChar__Group_3__4 : rule__EscapedChar__Group_3__4__Impl rule__EscapedChar__Group_3__5 ;
    public final void rule__EscapedChar__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2625:1: ( rule__EscapedChar__Group_3__4__Impl rule__EscapedChar__Group_3__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2626:2: rule__EscapedChar__Group_3__4__Impl rule__EscapedChar__Group_3__5
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__4__Impl_in_rule__EscapedChar__Group_3__45392);
            rule__EscapedChar__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__5_in_rule__EscapedChar__Group_3__45395);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2633:1: rule__EscapedChar__Group_3__4__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_4 ) ) ;
    public final void rule__EscapedChar__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2637:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2638:1: ( ( rule__EscapedChar__DigitsAssignment_3_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2638:1: ( ( rule__EscapedChar__DigitsAssignment_3_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2639:1: ( rule__EscapedChar__DigitsAssignment_3_4 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2640:1: ( rule__EscapedChar__DigitsAssignment_3_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2640:2: rule__EscapedChar__DigitsAssignment_3_4
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_4_in_rule__EscapedChar__Group_3__4__Impl5422);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2650:1: rule__EscapedChar__Group_3__5 : rule__EscapedChar__Group_3__5__Impl rule__EscapedChar__Group_3__6 ;
    public final void rule__EscapedChar__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2654:1: ( rule__EscapedChar__Group_3__5__Impl rule__EscapedChar__Group_3__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2655:2: rule__EscapedChar__Group_3__5__Impl rule__EscapedChar__Group_3__6
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__5__Impl_in_rule__EscapedChar__Group_3__55452);
            rule__EscapedChar__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__6_in_rule__EscapedChar__Group_3__55455);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2662:1: rule__EscapedChar__Group_3__5__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_5 ) ) ;
    public final void rule__EscapedChar__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2666:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_5 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2667:1: ( ( rule__EscapedChar__DigitsAssignment_3_5 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2667:1: ( ( rule__EscapedChar__DigitsAssignment_3_5 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2668:1: ( rule__EscapedChar__DigitsAssignment_3_5 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2669:1: ( rule__EscapedChar__DigitsAssignment_3_5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2669:2: rule__EscapedChar__DigitsAssignment_3_5
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_5_in_rule__EscapedChar__Group_3__5__Impl5482);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2679:1: rule__EscapedChar__Group_3__6 : rule__EscapedChar__Group_3__6__Impl rule__EscapedChar__Group_3__7 ;
    public final void rule__EscapedChar__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2683:1: ( rule__EscapedChar__Group_3__6__Impl rule__EscapedChar__Group_3__7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2684:2: rule__EscapedChar__Group_3__6__Impl rule__EscapedChar__Group_3__7
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__6__Impl_in_rule__EscapedChar__Group_3__65512);
            rule__EscapedChar__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__7_in_rule__EscapedChar__Group_3__65515);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2691:1: rule__EscapedChar__Group_3__6__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_6 ) ) ;
    public final void rule__EscapedChar__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2695:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_6 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2696:1: ( ( rule__EscapedChar__DigitsAssignment_3_6 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2696:1: ( ( rule__EscapedChar__DigitsAssignment_3_6 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2697:1: ( rule__EscapedChar__DigitsAssignment_3_6 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_6()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2698:1: ( rule__EscapedChar__DigitsAssignment_3_6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2698:2: rule__EscapedChar__DigitsAssignment_3_6
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_6_in_rule__EscapedChar__Group_3__6__Impl5542);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2708:1: rule__EscapedChar__Group_3__7 : rule__EscapedChar__Group_3__7__Impl rule__EscapedChar__Group_3__8 ;
    public final void rule__EscapedChar__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2712:1: ( rule__EscapedChar__Group_3__7__Impl rule__EscapedChar__Group_3__8 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2713:2: rule__EscapedChar__Group_3__7__Impl rule__EscapedChar__Group_3__8
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__7__Impl_in_rule__EscapedChar__Group_3__75572);
            rule__EscapedChar__Group_3__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__8_in_rule__EscapedChar__Group_3__75575);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2720:1: rule__EscapedChar__Group_3__7__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_7 ) ) ;
    public final void rule__EscapedChar__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2724:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_7 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2725:1: ( ( rule__EscapedChar__DigitsAssignment_3_7 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2725:1: ( ( rule__EscapedChar__DigitsAssignment_3_7 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2726:1: ( rule__EscapedChar__DigitsAssignment_3_7 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_7()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2727:1: ( rule__EscapedChar__DigitsAssignment_3_7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2727:2: rule__EscapedChar__DigitsAssignment_3_7
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_7_in_rule__EscapedChar__Group_3__7__Impl5602);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2737:1: rule__EscapedChar__Group_3__8 : rule__EscapedChar__Group_3__8__Impl rule__EscapedChar__Group_3__9 ;
    public final void rule__EscapedChar__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2741:1: ( rule__EscapedChar__Group_3__8__Impl rule__EscapedChar__Group_3__9 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2742:2: rule__EscapedChar__Group_3__8__Impl rule__EscapedChar__Group_3__9
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__8__Impl_in_rule__EscapedChar__Group_3__85632);
            rule__EscapedChar__Group_3__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__9_in_rule__EscapedChar__Group_3__85635);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2749:1: rule__EscapedChar__Group_3__8__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_8 ) ) ;
    public final void rule__EscapedChar__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2753:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_8 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2754:1: ( ( rule__EscapedChar__DigitsAssignment_3_8 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2754:1: ( ( rule__EscapedChar__DigitsAssignment_3_8 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2755:1: ( rule__EscapedChar__DigitsAssignment_3_8 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_8()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2756:1: ( rule__EscapedChar__DigitsAssignment_3_8 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2756:2: rule__EscapedChar__DigitsAssignment_3_8
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_8_in_rule__EscapedChar__Group_3__8__Impl5662);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2766:1: rule__EscapedChar__Group_3__9 : rule__EscapedChar__Group_3__9__Impl ;
    public final void rule__EscapedChar__Group_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2770:1: ( rule__EscapedChar__Group_3__9__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2771:2: rule__EscapedChar__Group_3__9__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__9__Impl_in_rule__EscapedChar__Group_3__95692);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2777:1: rule__EscapedChar__Group_3__9__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_9 ) ) ;
    public final void rule__EscapedChar__Group_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2781:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_9 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2782:1: ( ( rule__EscapedChar__DigitsAssignment_3_9 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2782:1: ( ( rule__EscapedChar__DigitsAssignment_3_9 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2783:1: ( rule__EscapedChar__DigitsAssignment_3_9 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_9()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2784:1: ( rule__EscapedChar__DigitsAssignment_3_9 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2784:2: rule__EscapedChar__DigitsAssignment_3_9
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_9_in_rule__EscapedChar__Group_3__9__Impl5719);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2814:1: rule__FloatLit__Group__0 : rule__FloatLit__Group__0__Impl rule__FloatLit__Group__1 ;
    public final void rule__FloatLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2818:1: ( rule__FloatLit__Group__0__Impl rule__FloatLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2819:2: rule__FloatLit__Group__0__Impl rule__FloatLit__Group__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__0__Impl_in_rule__FloatLit__Group__05769);
            rule__FloatLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__1_in_rule__FloatLit__Group__05772);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2826:1: rule__FloatLit__Group__0__Impl : ( ( rule__FloatLit__DigitsAssignment_0 ) ) ;
    public final void rule__FloatLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2830:1: ( ( ( rule__FloatLit__DigitsAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2831:1: ( ( rule__FloatLit__DigitsAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2831:1: ( ( rule__FloatLit__DigitsAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2832:1: ( rule__FloatLit__DigitsAssignment_0 )
            {
             before(grammarAccess.getFloatLitAccess().getDigitsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2833:1: ( rule__FloatLit__DigitsAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2833:2: rule__FloatLit__DigitsAssignment_0
            {
            pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_0_in_rule__FloatLit__Group__0__Impl5799);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2843:1: rule__FloatLit__Group__1 : rule__FloatLit__Group__1__Impl rule__FloatLit__Group__2 ;
    public final void rule__FloatLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2847:1: ( rule__FloatLit__Group__1__Impl rule__FloatLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2848:2: rule__FloatLit__Group__1__Impl rule__FloatLit__Group__2
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__1__Impl_in_rule__FloatLit__Group__15829);
            rule__FloatLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__2_in_rule__FloatLit__Group__15832);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2855:1: rule__FloatLit__Group__1__Impl : ( ( rule__FloatLit__Alternatives_1 )* ) ;
    public final void rule__FloatLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2859:1: ( ( ( rule__FloatLit__Alternatives_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2860:1: ( ( rule__FloatLit__Alternatives_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2860:1: ( ( rule__FloatLit__Alternatives_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2861:1: ( rule__FloatLit__Alternatives_1 )*
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2862:1: ( rule__FloatLit__Alternatives_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_DEC_DIGIT||LA29_0==17) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2862:2: rule__FloatLit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__FloatLit__Alternatives_1_in_rule__FloatLit__Group__1__Impl5859);
            	    rule__FloatLit__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2872:1: rule__FloatLit__Group__2 : rule__FloatLit__Group__2__Impl rule__FloatLit__Group__3 ;
    public final void rule__FloatLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2876:1: ( rule__FloatLit__Group__2__Impl rule__FloatLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2877:2: rule__FloatLit__Group__2__Impl rule__FloatLit__Group__3
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__2__Impl_in_rule__FloatLit__Group__25890);
            rule__FloatLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__3_in_rule__FloatLit__Group__25893);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2884:1: rule__FloatLit__Group__2__Impl : ( ( rule__FloatLit__Group_2__0 ) ) ;
    public final void rule__FloatLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2888:1: ( ( ( rule__FloatLit__Group_2__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2889:1: ( ( rule__FloatLit__Group_2__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2889:1: ( ( rule__FloatLit__Group_2__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2890:1: ( rule__FloatLit__Group_2__0 )
            {
             before(grammarAccess.getFloatLitAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2891:1: ( rule__FloatLit__Group_2__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2891:2: rule__FloatLit__Group_2__0
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_2__0_in_rule__FloatLit__Group__2__Impl5920);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2901:1: rule__FloatLit__Group__3 : rule__FloatLit__Group__3__Impl rule__FloatLit__Group__4 ;
    public final void rule__FloatLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2905:1: ( rule__FloatLit__Group__3__Impl rule__FloatLit__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2906:2: rule__FloatLit__Group__3__Impl rule__FloatLit__Group__4
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__3__Impl_in_rule__FloatLit__Group__35950);
            rule__FloatLit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__4_in_rule__FloatLit__Group__35953);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2913:1: rule__FloatLit__Group__3__Impl : ( ( rule__FloatLit__Group_3__0 )? ) ;
    public final void rule__FloatLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2917:1: ( ( ( rule__FloatLit__Group_3__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2918:1: ( ( rule__FloatLit__Group_3__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2918:1: ( ( rule__FloatLit__Group_3__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2919:1: ( rule__FloatLit__Group_3__0 )?
            {
             before(grammarAccess.getFloatLitAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2920:1: ( rule__FloatLit__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=18 && LA30_0<=19)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2920:2: rule__FloatLit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__Group_3__0_in_rule__FloatLit__Group__3__Impl5980);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2930:1: rule__FloatLit__Group__4 : rule__FloatLit__Group__4__Impl ;
    public final void rule__FloatLit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2934:1: ( rule__FloatLit__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2935:2: rule__FloatLit__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__4__Impl_in_rule__FloatLit__Group__46011);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2941:1: rule__FloatLit__Group__4__Impl : ( ( rule__FloatLit__Group_4__0 )? ) ;
    public final void rule__FloatLit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2945:1: ( ( ( rule__FloatLit__Group_4__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2946:1: ( ( rule__FloatLit__Group_4__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2946:1: ( ( rule__FloatLit__Group_4__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2947:1: ( rule__FloatLit__Group_4__0 )?
            {
             before(grammarAccess.getFloatLitAccess().getGroup_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2948:1: ( rule__FloatLit__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2948:2: rule__FloatLit__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__Group_4__0_in_rule__FloatLit__Group__4__Impl6038);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2968:1: rule__FloatLit__Group_2__0 : rule__FloatLit__Group_2__0__Impl rule__FloatLit__Group_2__1 ;
    public final void rule__FloatLit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2972:1: ( rule__FloatLit__Group_2__0__Impl rule__FloatLit__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2973:2: rule__FloatLit__Group_2__0__Impl rule__FloatLit__Group_2__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_2__0__Impl_in_rule__FloatLit__Group_2__06079);
            rule__FloatLit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_2__1_in_rule__FloatLit__Group_2__06082);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2980:1: rule__FloatLit__Group_2__0__Impl : ( '.' ) ;
    public final void rule__FloatLit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2984:1: ( ( '.' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2985:1: ( '.' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2985:1: ( '.' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2986:1: '.'
            {
             before(grammarAccess.getFloatLitAccess().getFullStopKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__FloatLit__Group_2__0__Impl6110); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2999:1: rule__FloatLit__Group_2__1 : rule__FloatLit__Group_2__1__Impl ;
    public final void rule__FloatLit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3003:1: ( rule__FloatLit__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3004:2: rule__FloatLit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_2__1__Impl_in_rule__FloatLit__Group_2__16141);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3010:1: rule__FloatLit__Group_2__1__Impl : ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) ) ;
    public final void rule__FloatLit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3014:1: ( ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3015:1: ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3015:1: ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3016:1: ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3016:1: ( ( rule__FloatLit__Alternatives_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3017:1: ( rule__FloatLit__Alternatives_2_1 )
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3018:1: ( rule__FloatLit__Alternatives_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3018:2: rule__FloatLit__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl6170);
            rule__FloatLit__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3021:1: ( ( rule__FloatLit__Alternatives_2_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3022:1: ( rule__FloatLit__Alternatives_2_1 )*
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3023:1: ( rule__FloatLit__Alternatives_2_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_DEC_DIGIT||LA32_0==17) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3023:2: rule__FloatLit__Alternatives_2_1
            	    {
            	    pushFollow(FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl6182);
            	    rule__FloatLit__Alternatives_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3038:1: rule__FloatLit__Group_3__0 : rule__FloatLit__Group_3__0__Impl rule__FloatLit__Group_3__1 ;
    public final void rule__FloatLit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3042:1: ( rule__FloatLit__Group_3__0__Impl rule__FloatLit__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3043:2: rule__FloatLit__Group_3__0__Impl rule__FloatLit__Group_3__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_3__0__Impl_in_rule__FloatLit__Group_3__06219);
            rule__FloatLit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_3__1_in_rule__FloatLit__Group_3__06222);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3050:1: rule__FloatLit__Group_3__0__Impl : ( ( rule__FloatLit__Alternatives_3_0 ) ) ;
    public final void rule__FloatLit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3054:1: ( ( ( rule__FloatLit__Alternatives_3_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3055:1: ( ( rule__FloatLit__Alternatives_3_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3055:1: ( ( rule__FloatLit__Alternatives_3_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3056:1: ( rule__FloatLit__Alternatives_3_0 )
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3057:1: ( rule__FloatLit__Alternatives_3_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3057:2: rule__FloatLit__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_0_in_rule__FloatLit__Group_3__0__Impl6249);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3067:1: rule__FloatLit__Group_3__1 : rule__FloatLit__Group_3__1__Impl rule__FloatLit__Group_3__2 ;
    public final void rule__FloatLit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3071:1: ( rule__FloatLit__Group_3__1__Impl rule__FloatLit__Group_3__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3072:2: rule__FloatLit__Group_3__1__Impl rule__FloatLit__Group_3__2
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_3__1__Impl_in_rule__FloatLit__Group_3__16279);
            rule__FloatLit__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_3__2_in_rule__FloatLit__Group_3__16282);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3079:1: rule__FloatLit__Group_3__1__Impl : ( ( rule__FloatLit__Alternatives_3_1 )? ) ;
    public final void rule__FloatLit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3083:1: ( ( ( rule__FloatLit__Alternatives_3_1 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3084:1: ( ( rule__FloatLit__Alternatives_3_1 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3084:1: ( ( rule__FloatLit__Alternatives_3_1 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3085:1: ( rule__FloatLit__Alternatives_3_1 )?
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3086:1: ( rule__FloatLit__Alternatives_3_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20||LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3086:2: rule__FloatLit__Alternatives_3_1
                    {
                    pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_1_in_rule__FloatLit__Group_3__1__Impl6309);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3096:1: rule__FloatLit__Group_3__2 : rule__FloatLit__Group_3__2__Impl ;
    public final void rule__FloatLit__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3100:1: ( rule__FloatLit__Group_3__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3101:2: rule__FloatLit__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_3__2__Impl_in_rule__FloatLit__Group_3__26340);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3107:1: rule__FloatLit__Group_3__2__Impl : ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) ) ;
    public final void rule__FloatLit__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3111:1: ( ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3112:1: ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3112:1: ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3113:1: ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3113:1: ( ( rule__FloatLit__Alternatives_3_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3114:1: ( rule__FloatLit__Alternatives_3_2 )
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3115:1: ( rule__FloatLit__Alternatives_3_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3115:2: rule__FloatLit__Alternatives_3_2
            {
            pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl6369);
            rule__FloatLit__Alternatives_3_2();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3118:1: ( ( rule__FloatLit__Alternatives_3_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3119:1: ( rule__FloatLit__Alternatives_3_2 )*
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3120:1: ( rule__FloatLit__Alternatives_3_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_DEC_DIGIT||LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3120:2: rule__FloatLit__Alternatives_3_2
            	    {
            	    pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl6381);
            	    rule__FloatLit__Alternatives_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3137:1: rule__FloatLit__Group_4__0 : rule__FloatLit__Group_4__0__Impl rule__FloatLit__Group_4__1 ;
    public final void rule__FloatLit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3141:1: ( rule__FloatLit__Group_4__0__Impl rule__FloatLit__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3142:2: rule__FloatLit__Group_4__0__Impl rule__FloatLit__Group_4__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_4__0__Impl_in_rule__FloatLit__Group_4__06420);
            rule__FloatLit__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_4__1_in_rule__FloatLit__Group_4__06423);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3149:1: rule__FloatLit__Group_4__0__Impl : ( 'f' ) ;
    public final void rule__FloatLit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3153:1: ( ( 'f' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3154:1: ( 'f' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3154:1: ( 'f' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3155:1: 'f'
            {
             before(grammarAccess.getFloatLitAccess().getFKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__FloatLit__Group_4__0__Impl6451); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3168:1: rule__FloatLit__Group_4__1 : rule__FloatLit__Group_4__1__Impl ;
    public final void rule__FloatLit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3172:1: ( rule__FloatLit__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3173:2: rule__FloatLit__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_4__1__Impl_in_rule__FloatLit__Group_4__16482);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3179:1: rule__FloatLit__Group_4__1__Impl : ( ( rule__FloatLit__SizeAssignment_4_1 ) ) ;
    public final void rule__FloatLit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3183:1: ( ( ( rule__FloatLit__SizeAssignment_4_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3184:1: ( ( rule__FloatLit__SizeAssignment_4_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3184:1: ( ( rule__FloatLit__SizeAssignment_4_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3185:1: ( rule__FloatLit__SizeAssignment_4_1 )
            {
             before(grammarAccess.getFloatLitAccess().getSizeAssignment_4_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3186:1: ( rule__FloatLit__SizeAssignment_4_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3186:2: rule__FloatLit__SizeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FloatLit__SizeAssignment_4_1_in_rule__FloatLit__Group_4__1__Impl6509);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3200:1: rule__DecIntLit__Group__0 : rule__DecIntLit__Group__0__Impl rule__DecIntLit__Group__1 ;
    public final void rule__DecIntLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3204:1: ( rule__DecIntLit__Group__0__Impl rule__DecIntLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3205:2: rule__DecIntLit__Group__0__Impl rule__DecIntLit__Group__1
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__0__Impl_in_rule__DecIntLit__Group__06543);
            rule__DecIntLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecIntLit__Group__1_in_rule__DecIntLit__Group__06546);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3212:1: rule__DecIntLit__Group__0__Impl : ( ( rule__DecIntLit__DigitsAssignment_0 ) ) ;
    public final void rule__DecIntLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3216:1: ( ( ( rule__DecIntLit__DigitsAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3217:1: ( ( rule__DecIntLit__DigitsAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3217:1: ( ( rule__DecIntLit__DigitsAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3218:1: ( rule__DecIntLit__DigitsAssignment_0 )
            {
             before(grammarAccess.getDecIntLitAccess().getDigitsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3219:1: ( rule__DecIntLit__DigitsAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3219:2: rule__DecIntLit__DigitsAssignment_0
            {
            pushFollow(FOLLOW_rule__DecIntLit__DigitsAssignment_0_in_rule__DecIntLit__Group__0__Impl6573);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3229:1: rule__DecIntLit__Group__1 : rule__DecIntLit__Group__1__Impl rule__DecIntLit__Group__2 ;
    public final void rule__DecIntLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3233:1: ( rule__DecIntLit__Group__1__Impl rule__DecIntLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3234:2: rule__DecIntLit__Group__1__Impl rule__DecIntLit__Group__2
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__1__Impl_in_rule__DecIntLit__Group__16603);
            rule__DecIntLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecIntLit__Group__2_in_rule__DecIntLit__Group__16606);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3241:1: rule__DecIntLit__Group__1__Impl : ( ( rule__DecIntLit__Alternatives_1 )* ) ;
    public final void rule__DecIntLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3245:1: ( ( ( rule__DecIntLit__Alternatives_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3246:1: ( ( rule__DecIntLit__Alternatives_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3246:1: ( ( rule__DecIntLit__Alternatives_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3247:1: ( rule__DecIntLit__Alternatives_1 )*
            {
             before(grammarAccess.getDecIntLitAccess().getAlternatives_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3248:1: ( rule__DecIntLit__Alternatives_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_DEC_DIGIT||LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3248:2: rule__DecIntLit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__DecIntLit__Alternatives_1_in_rule__DecIntLit__Group__1__Impl6633);
            	    rule__DecIntLit__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3258:1: rule__DecIntLit__Group__2 : rule__DecIntLit__Group__2__Impl ;
    public final void rule__DecIntLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3262:1: ( rule__DecIntLit__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3263:2: rule__DecIntLit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__2__Impl_in_rule__DecIntLit__Group__26664);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3269:1: rule__DecIntLit__Group__2__Impl : ( ( rule__DecIntLit__Group_2__0 )? ) ;
    public final void rule__DecIntLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3273:1: ( ( ( rule__DecIntLit__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3274:1: ( ( rule__DecIntLit__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3274:1: ( ( rule__DecIntLit__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3275:1: ( rule__DecIntLit__Group_2__0 )?
            {
             before(grammarAccess.getDecIntLitAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3276:1: ( rule__DecIntLit__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21||LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3276:2: rule__DecIntLit__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DecIntLit__Group_2__0_in_rule__DecIntLit__Group__2__Impl6691);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3292:1: rule__DecIntLit__Group_2__0 : rule__DecIntLit__Group_2__0__Impl rule__DecIntLit__Group_2__1 ;
    public final void rule__DecIntLit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3296:1: ( rule__DecIntLit__Group_2__0__Impl rule__DecIntLit__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3297:2: rule__DecIntLit__Group_2__0__Impl rule__DecIntLit__Group_2__1
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group_2__0__Impl_in_rule__DecIntLit__Group_2__06728);
            rule__DecIntLit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecIntLit__Group_2__1_in_rule__DecIntLit__Group_2__06731);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3304:1: rule__DecIntLit__Group_2__0__Impl : ( ( rule__DecIntLit__Alternatives_2_0 ) ) ;
    public final void rule__DecIntLit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3308:1: ( ( ( rule__DecIntLit__Alternatives_2_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3309:1: ( ( rule__DecIntLit__Alternatives_2_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3309:1: ( ( rule__DecIntLit__Alternatives_2_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3310:1: ( rule__DecIntLit__Alternatives_2_0 )
            {
             before(grammarAccess.getDecIntLitAccess().getAlternatives_2_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3311:1: ( rule__DecIntLit__Alternatives_2_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3311:2: rule__DecIntLit__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__DecIntLit__Alternatives_2_0_in_rule__DecIntLit__Group_2__0__Impl6758);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3321:1: rule__DecIntLit__Group_2__1 : rule__DecIntLit__Group_2__1__Impl ;
    public final void rule__DecIntLit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3325:1: ( rule__DecIntLit__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3326:2: rule__DecIntLit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group_2__1__Impl_in_rule__DecIntLit__Group_2__16788);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3332:1: rule__DecIntLit__Group_2__1__Impl : ( ( rule__DecIntLit__SizeAssignment_2_1 ) ) ;
    public final void rule__DecIntLit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3336:1: ( ( ( rule__DecIntLit__SizeAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3337:1: ( ( rule__DecIntLit__SizeAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3337:1: ( ( rule__DecIntLit__SizeAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3338:1: ( rule__DecIntLit__SizeAssignment_2_1 )
            {
             before(grammarAccess.getDecIntLitAccess().getSizeAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3339:1: ( rule__DecIntLit__SizeAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3339:2: rule__DecIntLit__SizeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DecIntLit__SizeAssignment_2_1_in_rule__DecIntLit__Group_2__1__Impl6815);
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


    // $ANTLR start "rule__BinIntLit__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3353:1: rule__BinIntLit__Group__0 : rule__BinIntLit__Group__0__Impl rule__BinIntLit__Group__1 ;
    public final void rule__BinIntLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3357:1: ( rule__BinIntLit__Group__0__Impl rule__BinIntLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3358:2: rule__BinIntLit__Group__0__Impl rule__BinIntLit__Group__1
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group__0__Impl_in_rule__BinIntLit__Group__06849);
            rule__BinIntLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinIntLit__Group__1_in_rule__BinIntLit__Group__06852);
            rule__BinIntLit__Group__1();

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
    // $ANTLR end "rule__BinIntLit__Group__0"


    // $ANTLR start "rule__BinIntLit__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3365:1: rule__BinIntLit__Group__0__Impl : ( () ) ;
    public final void rule__BinIntLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3369:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3370:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3370:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3371:1: ()
            {
             before(grammarAccess.getBinIntLitAccess().getBinIntLitAction_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3372:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3374:1: 
            {
            }

             after(grammarAccess.getBinIntLitAccess().getBinIntLitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinIntLit__Group__0__Impl"


    // $ANTLR start "rule__BinIntLit__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3384:1: rule__BinIntLit__Group__1 : rule__BinIntLit__Group__1__Impl rule__BinIntLit__Group__2 ;
    public final void rule__BinIntLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3388:1: ( rule__BinIntLit__Group__1__Impl rule__BinIntLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3389:2: rule__BinIntLit__Group__1__Impl rule__BinIntLit__Group__2
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group__1__Impl_in_rule__BinIntLit__Group__16910);
            rule__BinIntLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinIntLit__Group__2_in_rule__BinIntLit__Group__16913);
            rule__BinIntLit__Group__2();

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
    // $ANTLR end "rule__BinIntLit__Group__1"


    // $ANTLR start "rule__BinIntLit__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3396:1: rule__BinIntLit__Group__1__Impl : ( '0b' ) ;
    public final void rule__BinIntLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3400:1: ( ( '0b' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3401:1: ( '0b' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3401:1: ( '0b' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3402:1: '0b'
            {
             before(grammarAccess.getBinIntLitAccess().getBKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__BinIntLit__Group__1__Impl6941); 
             after(grammarAccess.getBinIntLitAccess().getBKeyword_1()); 

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
    // $ANTLR end "rule__BinIntLit__Group__1__Impl"


    // $ANTLR start "rule__BinIntLit__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3415:1: rule__BinIntLit__Group__2 : rule__BinIntLit__Group__2__Impl rule__BinIntLit__Group__3 ;
    public final void rule__BinIntLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3419:1: ( rule__BinIntLit__Group__2__Impl rule__BinIntLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3420:2: rule__BinIntLit__Group__2__Impl rule__BinIntLit__Group__3
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group__2__Impl_in_rule__BinIntLit__Group__26972);
            rule__BinIntLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinIntLit__Group__3_in_rule__BinIntLit__Group__26975);
            rule__BinIntLit__Group__3();

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
    // $ANTLR end "rule__BinIntLit__Group__2"


    // $ANTLR start "rule__BinIntLit__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3427:1: rule__BinIntLit__Group__2__Impl : ( ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* ) ) ;
    public final void rule__BinIntLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3431:1: ( ( ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3432:1: ( ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3432:1: ( ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3433:1: ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3433:1: ( ( rule__BinIntLit__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3434:1: ( rule__BinIntLit__Alternatives_2 )
            {
             before(grammarAccess.getBinIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3435:1: ( rule__BinIntLit__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3435:2: rule__BinIntLit__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BinIntLit__Alternatives_2_in_rule__BinIntLit__Group__2__Impl7004);
            rule__BinIntLit__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getBinIntLitAccess().getAlternatives_2()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3438:1: ( ( rule__BinIntLit__Alternatives_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3439:1: ( rule__BinIntLit__Alternatives_2 )*
            {
             before(grammarAccess.getBinIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3440:1: ( rule__BinIntLit__Alternatives_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=16 && LA37_0<=17)||LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3440:2: rule__BinIntLit__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__BinIntLit__Alternatives_2_in_rule__BinIntLit__Group__2__Impl7016);
            	    rule__BinIntLit__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getBinIntLitAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__BinIntLit__Group__2__Impl"


    // $ANTLR start "rule__BinIntLit__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3451:1: rule__BinIntLit__Group__3 : rule__BinIntLit__Group__3__Impl ;
    public final void rule__BinIntLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3455:1: ( rule__BinIntLit__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3456:2: rule__BinIntLit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group__3__Impl_in_rule__BinIntLit__Group__37049);
            rule__BinIntLit__Group__3__Impl();

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
    // $ANTLR end "rule__BinIntLit__Group__3"


    // $ANTLR start "rule__BinIntLit__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3462:1: rule__BinIntLit__Group__3__Impl : ( ( rule__BinIntLit__Group_3__0 )? ) ;
    public final void rule__BinIntLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3466:1: ( ( ( rule__BinIntLit__Group_3__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3467:1: ( ( rule__BinIntLit__Group_3__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3467:1: ( ( rule__BinIntLit__Group_3__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3468:1: ( rule__BinIntLit__Group_3__0 )?
            {
             before(grammarAccess.getBinIntLitAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3469:1: ( rule__BinIntLit__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21||LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3469:2: rule__BinIntLit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BinIntLit__Group_3__0_in_rule__BinIntLit__Group__3__Impl7076);
                    rule__BinIntLit__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinIntLitAccess().getGroup_3()); 

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
    // $ANTLR end "rule__BinIntLit__Group__3__Impl"


    // $ANTLR start "rule__BinIntLit__Group_3__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3487:1: rule__BinIntLit__Group_3__0 : rule__BinIntLit__Group_3__0__Impl rule__BinIntLit__Group_3__1 ;
    public final void rule__BinIntLit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3491:1: ( rule__BinIntLit__Group_3__0__Impl rule__BinIntLit__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3492:2: rule__BinIntLit__Group_3__0__Impl rule__BinIntLit__Group_3__1
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group_3__0__Impl_in_rule__BinIntLit__Group_3__07115);
            rule__BinIntLit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinIntLit__Group_3__1_in_rule__BinIntLit__Group_3__07118);
            rule__BinIntLit__Group_3__1();

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
    // $ANTLR end "rule__BinIntLit__Group_3__0"


    // $ANTLR start "rule__BinIntLit__Group_3__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3499:1: rule__BinIntLit__Group_3__0__Impl : ( ( rule__BinIntLit__Alternatives_3_0 ) ) ;
    public final void rule__BinIntLit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3503:1: ( ( ( rule__BinIntLit__Alternatives_3_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3504:1: ( ( rule__BinIntLit__Alternatives_3_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3504:1: ( ( rule__BinIntLit__Alternatives_3_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3505:1: ( rule__BinIntLit__Alternatives_3_0 )
            {
             before(grammarAccess.getBinIntLitAccess().getAlternatives_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3506:1: ( rule__BinIntLit__Alternatives_3_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3506:2: rule__BinIntLit__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__BinIntLit__Alternatives_3_0_in_rule__BinIntLit__Group_3__0__Impl7145);
            rule__BinIntLit__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getBinIntLitAccess().getAlternatives_3_0()); 

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
    // $ANTLR end "rule__BinIntLit__Group_3__0__Impl"


    // $ANTLR start "rule__BinIntLit__Group_3__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3516:1: rule__BinIntLit__Group_3__1 : rule__BinIntLit__Group_3__1__Impl ;
    public final void rule__BinIntLit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3520:1: ( rule__BinIntLit__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3521:2: rule__BinIntLit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group_3__1__Impl_in_rule__BinIntLit__Group_3__17175);
            rule__BinIntLit__Group_3__1__Impl();

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
    // $ANTLR end "rule__BinIntLit__Group_3__1"


    // $ANTLR start "rule__BinIntLit__Group_3__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3527:1: rule__BinIntLit__Group_3__1__Impl : ( ( rule__BinIntLit__SizeAssignment_3_1 ) ) ;
    public final void rule__BinIntLit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3531:1: ( ( ( rule__BinIntLit__SizeAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3532:1: ( ( rule__BinIntLit__SizeAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3532:1: ( ( rule__BinIntLit__SizeAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3533:1: ( rule__BinIntLit__SizeAssignment_3_1 )
            {
             before(grammarAccess.getBinIntLitAccess().getSizeAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3534:1: ( rule__BinIntLit__SizeAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3534:2: rule__BinIntLit__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BinIntLit__SizeAssignment_3_1_in_rule__BinIntLit__Group_3__1__Impl7202);
            rule__BinIntLit__SizeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBinIntLitAccess().getSizeAssignment_3_1()); 

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
    // $ANTLR end "rule__BinIntLit__Group_3__1__Impl"


    // $ANTLR start "rule__OctIntLit__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3548:1: rule__OctIntLit__Group__0 : rule__OctIntLit__Group__0__Impl rule__OctIntLit__Group__1 ;
    public final void rule__OctIntLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3552:1: ( rule__OctIntLit__Group__0__Impl rule__OctIntLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3553:2: rule__OctIntLit__Group__0__Impl rule__OctIntLit__Group__1
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group__0__Impl_in_rule__OctIntLit__Group__07236);
            rule__OctIntLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OctIntLit__Group__1_in_rule__OctIntLit__Group__07239);
            rule__OctIntLit__Group__1();

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
    // $ANTLR end "rule__OctIntLit__Group__0"


    // $ANTLR start "rule__OctIntLit__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3560:1: rule__OctIntLit__Group__0__Impl : ( () ) ;
    public final void rule__OctIntLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3564:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3565:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3565:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3566:1: ()
            {
             before(grammarAccess.getOctIntLitAccess().getOctIntLitAction_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3567:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3569:1: 
            {
            }

             after(grammarAccess.getOctIntLitAccess().getOctIntLitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OctIntLit__Group__0__Impl"


    // $ANTLR start "rule__OctIntLit__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3579:1: rule__OctIntLit__Group__1 : rule__OctIntLit__Group__1__Impl rule__OctIntLit__Group__2 ;
    public final void rule__OctIntLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3583:1: ( rule__OctIntLit__Group__1__Impl rule__OctIntLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3584:2: rule__OctIntLit__Group__1__Impl rule__OctIntLit__Group__2
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group__1__Impl_in_rule__OctIntLit__Group__17297);
            rule__OctIntLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OctIntLit__Group__2_in_rule__OctIntLit__Group__17300);
            rule__OctIntLit__Group__2();

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
    // $ANTLR end "rule__OctIntLit__Group__1"


    // $ANTLR start "rule__OctIntLit__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3591:1: rule__OctIntLit__Group__1__Impl : ( '0o' ) ;
    public final void rule__OctIntLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3595:1: ( ( '0o' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3596:1: ( '0o' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3596:1: ( '0o' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3597:1: '0o'
            {
             before(grammarAccess.getOctIntLitAccess().getOKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__OctIntLit__Group__1__Impl7328); 
             after(grammarAccess.getOctIntLitAccess().getOKeyword_1()); 

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
    // $ANTLR end "rule__OctIntLit__Group__1__Impl"


    // $ANTLR start "rule__OctIntLit__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3610:1: rule__OctIntLit__Group__2 : rule__OctIntLit__Group__2__Impl rule__OctIntLit__Group__3 ;
    public final void rule__OctIntLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3614:1: ( rule__OctIntLit__Group__2__Impl rule__OctIntLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3615:2: rule__OctIntLit__Group__2__Impl rule__OctIntLit__Group__3
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group__2__Impl_in_rule__OctIntLit__Group__27359);
            rule__OctIntLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OctIntLit__Group__3_in_rule__OctIntLit__Group__27362);
            rule__OctIntLit__Group__3();

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
    // $ANTLR end "rule__OctIntLit__Group__2"


    // $ANTLR start "rule__OctIntLit__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3622:1: rule__OctIntLit__Group__2__Impl : ( ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* ) ) ;
    public final void rule__OctIntLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3626:1: ( ( ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3627:1: ( ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3627:1: ( ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3628:1: ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3628:1: ( ( rule__OctIntLit__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3629:1: ( rule__OctIntLit__Alternatives_2 )
            {
             before(grammarAccess.getOctIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3630:1: ( rule__OctIntLit__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3630:2: rule__OctIntLit__Alternatives_2
            {
            pushFollow(FOLLOW_rule__OctIntLit__Alternatives_2_in_rule__OctIntLit__Group__2__Impl7391);
            rule__OctIntLit__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getOctIntLitAccess().getAlternatives_2()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3633:1: ( ( rule__OctIntLit__Alternatives_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3634:1: ( rule__OctIntLit__Alternatives_2 )*
            {
             before(grammarAccess.getOctIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3635:1: ( rule__OctIntLit__Alternatives_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_OCT_DIGIT||LA39_0==17) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3635:2: rule__OctIntLit__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__OctIntLit__Alternatives_2_in_rule__OctIntLit__Group__2__Impl7403);
            	    rule__OctIntLit__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getOctIntLitAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__OctIntLit__Group__2__Impl"


    // $ANTLR start "rule__OctIntLit__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3646:1: rule__OctIntLit__Group__3 : rule__OctIntLit__Group__3__Impl ;
    public final void rule__OctIntLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3650:1: ( rule__OctIntLit__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3651:2: rule__OctIntLit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group__3__Impl_in_rule__OctIntLit__Group__37436);
            rule__OctIntLit__Group__3__Impl();

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
    // $ANTLR end "rule__OctIntLit__Group__3"


    // $ANTLR start "rule__OctIntLit__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3657:1: rule__OctIntLit__Group__3__Impl : ( ( rule__OctIntLit__Group_3__0 )? ) ;
    public final void rule__OctIntLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3661:1: ( ( ( rule__OctIntLit__Group_3__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3662:1: ( ( rule__OctIntLit__Group_3__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3662:1: ( ( rule__OctIntLit__Group_3__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3663:1: ( rule__OctIntLit__Group_3__0 )?
            {
             before(grammarAccess.getOctIntLitAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3664:1: ( rule__OctIntLit__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21||LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3664:2: rule__OctIntLit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__OctIntLit__Group_3__0_in_rule__OctIntLit__Group__3__Impl7463);
                    rule__OctIntLit__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOctIntLitAccess().getGroup_3()); 

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
    // $ANTLR end "rule__OctIntLit__Group__3__Impl"


    // $ANTLR start "rule__OctIntLit__Group_3__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3682:1: rule__OctIntLit__Group_3__0 : rule__OctIntLit__Group_3__0__Impl rule__OctIntLit__Group_3__1 ;
    public final void rule__OctIntLit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3686:1: ( rule__OctIntLit__Group_3__0__Impl rule__OctIntLit__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3687:2: rule__OctIntLit__Group_3__0__Impl rule__OctIntLit__Group_3__1
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group_3__0__Impl_in_rule__OctIntLit__Group_3__07502);
            rule__OctIntLit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OctIntLit__Group_3__1_in_rule__OctIntLit__Group_3__07505);
            rule__OctIntLit__Group_3__1();

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
    // $ANTLR end "rule__OctIntLit__Group_3__0"


    // $ANTLR start "rule__OctIntLit__Group_3__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3694:1: rule__OctIntLit__Group_3__0__Impl : ( ( rule__OctIntLit__Alternatives_3_0 ) ) ;
    public final void rule__OctIntLit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3698:1: ( ( ( rule__OctIntLit__Alternatives_3_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3699:1: ( ( rule__OctIntLit__Alternatives_3_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3699:1: ( ( rule__OctIntLit__Alternatives_3_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3700:1: ( rule__OctIntLit__Alternatives_3_0 )
            {
             before(grammarAccess.getOctIntLitAccess().getAlternatives_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3701:1: ( rule__OctIntLit__Alternatives_3_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3701:2: rule__OctIntLit__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__OctIntLit__Alternatives_3_0_in_rule__OctIntLit__Group_3__0__Impl7532);
            rule__OctIntLit__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getOctIntLitAccess().getAlternatives_3_0()); 

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
    // $ANTLR end "rule__OctIntLit__Group_3__0__Impl"


    // $ANTLR start "rule__OctIntLit__Group_3__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3711:1: rule__OctIntLit__Group_3__1 : rule__OctIntLit__Group_3__1__Impl ;
    public final void rule__OctIntLit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3715:1: ( rule__OctIntLit__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3716:2: rule__OctIntLit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group_3__1__Impl_in_rule__OctIntLit__Group_3__17562);
            rule__OctIntLit__Group_3__1__Impl();

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
    // $ANTLR end "rule__OctIntLit__Group_3__1"


    // $ANTLR start "rule__OctIntLit__Group_3__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3722:1: rule__OctIntLit__Group_3__1__Impl : ( ( rule__OctIntLit__SizeAssignment_3_1 ) ) ;
    public final void rule__OctIntLit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3726:1: ( ( ( rule__OctIntLit__SizeAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3727:1: ( ( rule__OctIntLit__SizeAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3727:1: ( ( rule__OctIntLit__SizeAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3728:1: ( rule__OctIntLit__SizeAssignment_3_1 )
            {
             before(grammarAccess.getOctIntLitAccess().getSizeAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3729:1: ( rule__OctIntLit__SizeAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3729:2: rule__OctIntLit__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__OctIntLit__SizeAssignment_3_1_in_rule__OctIntLit__Group_3__1__Impl7589);
            rule__OctIntLit__SizeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOctIntLitAccess().getSizeAssignment_3_1()); 

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
    // $ANTLR end "rule__OctIntLit__Group_3__1__Impl"


    // $ANTLR start "rule__HexIntLit__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3743:1: rule__HexIntLit__Group__0 : rule__HexIntLit__Group__0__Impl rule__HexIntLit__Group__1 ;
    public final void rule__HexIntLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3747:1: ( rule__HexIntLit__Group__0__Impl rule__HexIntLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3748:2: rule__HexIntLit__Group__0__Impl rule__HexIntLit__Group__1
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group__0__Impl_in_rule__HexIntLit__Group__07623);
            rule__HexIntLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HexIntLit__Group__1_in_rule__HexIntLit__Group__07626);
            rule__HexIntLit__Group__1();

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
    // $ANTLR end "rule__HexIntLit__Group__0"


    // $ANTLR start "rule__HexIntLit__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3755:1: rule__HexIntLit__Group__0__Impl : ( () ) ;
    public final void rule__HexIntLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3759:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3760:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3760:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3761:1: ()
            {
             before(grammarAccess.getHexIntLitAccess().getHexIntLitAction_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3762:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3764:1: 
            {
            }

             after(grammarAccess.getHexIntLitAccess().getHexIntLitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HexIntLit__Group__0__Impl"


    // $ANTLR start "rule__HexIntLit__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3774:1: rule__HexIntLit__Group__1 : rule__HexIntLit__Group__1__Impl rule__HexIntLit__Group__2 ;
    public final void rule__HexIntLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3778:1: ( rule__HexIntLit__Group__1__Impl rule__HexIntLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3779:2: rule__HexIntLit__Group__1__Impl rule__HexIntLit__Group__2
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group__1__Impl_in_rule__HexIntLit__Group__17684);
            rule__HexIntLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HexIntLit__Group__2_in_rule__HexIntLit__Group__17687);
            rule__HexIntLit__Group__2();

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
    // $ANTLR end "rule__HexIntLit__Group__1"


    // $ANTLR start "rule__HexIntLit__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3786:1: rule__HexIntLit__Group__1__Impl : ( '0x' ) ;
    public final void rule__HexIntLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3790:1: ( ( '0x' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3791:1: ( '0x' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3791:1: ( '0x' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3792:1: '0x'
            {
             before(grammarAccess.getHexIntLitAccess().getXKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__HexIntLit__Group__1__Impl7715); 
             after(grammarAccess.getHexIntLitAccess().getXKeyword_1()); 

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
    // $ANTLR end "rule__HexIntLit__Group__1__Impl"


    // $ANTLR start "rule__HexIntLit__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3805:1: rule__HexIntLit__Group__2 : rule__HexIntLit__Group__2__Impl rule__HexIntLit__Group__3 ;
    public final void rule__HexIntLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3809:1: ( rule__HexIntLit__Group__2__Impl rule__HexIntLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3810:2: rule__HexIntLit__Group__2__Impl rule__HexIntLit__Group__3
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group__2__Impl_in_rule__HexIntLit__Group__27746);
            rule__HexIntLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HexIntLit__Group__3_in_rule__HexIntLit__Group__27749);
            rule__HexIntLit__Group__3();

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
    // $ANTLR end "rule__HexIntLit__Group__2"


    // $ANTLR start "rule__HexIntLit__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3817:1: rule__HexIntLit__Group__2__Impl : ( ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* ) ) ;
    public final void rule__HexIntLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3821:1: ( ( ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3822:1: ( ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3822:1: ( ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3823:1: ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3823:1: ( ( rule__HexIntLit__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3824:1: ( rule__HexIntLit__Alternatives_2 )
            {
             before(grammarAccess.getHexIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3825:1: ( rule__HexIntLit__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3825:2: rule__HexIntLit__Alternatives_2
            {
            pushFollow(FOLLOW_rule__HexIntLit__Alternatives_2_in_rule__HexIntLit__Group__2__Impl7778);
            rule__HexIntLit__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getHexIntLitAccess().getAlternatives_2()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3828:1: ( ( rule__HexIntLit__Alternatives_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3829:1: ( rule__HexIntLit__Alternatives_2 )*
            {
             before(grammarAccess.getHexIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3830:1: ( rule__HexIntLit__Alternatives_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_HEX_DIGIT||LA41_0==17) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3830:2: rule__HexIntLit__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__HexIntLit__Alternatives_2_in_rule__HexIntLit__Group__2__Impl7790);
            	    rule__HexIntLit__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getHexIntLitAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__HexIntLit__Group__2__Impl"


    // $ANTLR start "rule__HexIntLit__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3841:1: rule__HexIntLit__Group__3 : rule__HexIntLit__Group__3__Impl ;
    public final void rule__HexIntLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3845:1: ( rule__HexIntLit__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3846:2: rule__HexIntLit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group__3__Impl_in_rule__HexIntLit__Group__37823);
            rule__HexIntLit__Group__3__Impl();

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
    // $ANTLR end "rule__HexIntLit__Group__3"


    // $ANTLR start "rule__HexIntLit__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3852:1: rule__HexIntLit__Group__3__Impl : ( ( rule__HexIntLit__Group_3__0 )? ) ;
    public final void rule__HexIntLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3856:1: ( ( ( rule__HexIntLit__Group_3__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3857:1: ( ( rule__HexIntLit__Group_3__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3857:1: ( ( rule__HexIntLit__Group_3__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3858:1: ( rule__HexIntLit__Group_3__0 )?
            {
             before(grammarAccess.getHexIntLitAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3859:1: ( rule__HexIntLit__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21||LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3859:2: rule__HexIntLit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__HexIntLit__Group_3__0_in_rule__HexIntLit__Group__3__Impl7850);
                    rule__HexIntLit__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHexIntLitAccess().getGroup_3()); 

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
    // $ANTLR end "rule__HexIntLit__Group__3__Impl"


    // $ANTLR start "rule__HexIntLit__Group_3__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3877:1: rule__HexIntLit__Group_3__0 : rule__HexIntLit__Group_3__0__Impl rule__HexIntLit__Group_3__1 ;
    public final void rule__HexIntLit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3881:1: ( rule__HexIntLit__Group_3__0__Impl rule__HexIntLit__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3882:2: rule__HexIntLit__Group_3__0__Impl rule__HexIntLit__Group_3__1
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group_3__0__Impl_in_rule__HexIntLit__Group_3__07889);
            rule__HexIntLit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HexIntLit__Group_3__1_in_rule__HexIntLit__Group_3__07892);
            rule__HexIntLit__Group_3__1();

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
    // $ANTLR end "rule__HexIntLit__Group_3__0"


    // $ANTLR start "rule__HexIntLit__Group_3__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3889:1: rule__HexIntLit__Group_3__0__Impl : ( ( rule__HexIntLit__Alternatives_3_0 ) ) ;
    public final void rule__HexIntLit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3893:1: ( ( ( rule__HexIntLit__Alternatives_3_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3894:1: ( ( rule__HexIntLit__Alternatives_3_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3894:1: ( ( rule__HexIntLit__Alternatives_3_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3895:1: ( rule__HexIntLit__Alternatives_3_0 )
            {
             before(grammarAccess.getHexIntLitAccess().getAlternatives_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3896:1: ( rule__HexIntLit__Alternatives_3_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3896:2: rule__HexIntLit__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__HexIntLit__Alternatives_3_0_in_rule__HexIntLit__Group_3__0__Impl7919);
            rule__HexIntLit__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getHexIntLitAccess().getAlternatives_3_0()); 

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
    // $ANTLR end "rule__HexIntLit__Group_3__0__Impl"


    // $ANTLR start "rule__HexIntLit__Group_3__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3906:1: rule__HexIntLit__Group_3__1 : rule__HexIntLit__Group_3__1__Impl ;
    public final void rule__HexIntLit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3910:1: ( rule__HexIntLit__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3911:2: rule__HexIntLit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group_3__1__Impl_in_rule__HexIntLit__Group_3__17949);
            rule__HexIntLit__Group_3__1__Impl();

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
    // $ANTLR end "rule__HexIntLit__Group_3__1"


    // $ANTLR start "rule__HexIntLit__Group_3__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3917:1: rule__HexIntLit__Group_3__1__Impl : ( ( rule__HexIntLit__SizeAssignment_3_1 ) ) ;
    public final void rule__HexIntLit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3921:1: ( ( ( rule__HexIntLit__SizeAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3922:1: ( ( rule__HexIntLit__SizeAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3922:1: ( ( rule__HexIntLit__SizeAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3923:1: ( rule__HexIntLit__SizeAssignment_3_1 )
            {
             before(grammarAccess.getHexIntLitAccess().getSizeAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3924:1: ( rule__HexIntLit__SizeAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3924:2: rule__HexIntLit__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__HexIntLit__SizeAssignment_3_1_in_rule__HexIntLit__Group_3__1__Impl7976);
            rule__HexIntLit__SizeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHexIntLitAccess().getSizeAssignment_3_1()); 

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
    // $ANTLR end "rule__HexIntLit__Group_3__1__Impl"


    // $ANTLR start "rule__Crate__ItemsAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3939:1: rule__Crate__ItemsAssignment : ( ruleItemAndAttrs ) ;
    public final void rule__Crate__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3943:1: ( ( ruleItemAndAttrs ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3944:1: ( ruleItemAndAttrs )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3944:1: ( ruleItemAndAttrs )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3945:1: ruleItemAndAttrs
            {
             before(grammarAccess.getCrateAccess().getItemsItemAndAttrsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment8015);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3954:1: rule__ItemAttr__AttrsAssignment_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3958:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3959:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3959:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3960:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_18046);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3969:1: rule__ItemAttr__AttrsAssignment_2_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3973:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3974:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3974:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3975:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_18077);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3984:1: rule__AttrWithList__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__AttrWithList__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3988:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3989:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3989:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3990:1: RULE_IDENT
            {
             before(grammarAccess.getAttrWithListAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_08108); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3999:1: rule__AttrWithList__AttrsAssignment_2 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4003:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4004:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4004:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4005:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_28139);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4014:1: rule__AttrWithList__AttrsAssignment_3_1 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4018:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4019:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4019:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4020:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_18170);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4029:1: rule__LiteralAttr__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__LiteralAttr__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4033:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4034:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4034:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4035:1: RULE_IDENT
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_08201); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4044:1: rule__LiteralAttr__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__LiteralAttr__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4048:1: ( ( ruleLiteral ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4049:1: ( ruleLiteral )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4049:1: ( ruleLiteral )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4050:1: ruleLiteral
            {
             before(grammarAccess.getLiteralAttrAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_28232);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4059:1: rule__ItemAndAttrs__AttrsAssignment_0 : ( ruleItemAttr ) ;
    public final void rule__ItemAndAttrs__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4063:1: ( ( ruleItemAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4064:1: ( ruleItemAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4064:1: ( ruleItemAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4065:1: ruleItemAttr
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsItemAttrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_08263);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4074:1: rule__ItemAndAttrs__ItemAssignment_1 : ( ruleItem ) ;
    public final void rule__ItemAndAttrs__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4078:1: ( ( ruleItem ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4079:1: ( ruleItem )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4079:1: ( ruleItem )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4080:1: ruleItem
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_18294);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4089:1: rule__ModItem__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__ModItem__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4093:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4094:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4094:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4095:1: RULE_IDENT
            {
             before(grammarAccess.getModItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_18325); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4104:1: rule__CharLit__CharAssignment_1_0 : ( RULE_NON_SINGLE_QUOTE ) ;
    public final void rule__CharLit__CharAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4108:1: ( ( RULE_NON_SINGLE_QUOTE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4109:1: ( RULE_NON_SINGLE_QUOTE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4109:1: ( RULE_NON_SINGLE_QUOTE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4110:1: RULE_NON_SINGLE_QUOTE
            {
             before(grammarAccess.getCharLitAccess().getCharNON_SINGLE_QUOTETerminalRuleCall_1_0_0()); 
            match(input,RULE_NON_SINGLE_QUOTE,FOLLOW_RULE_NON_SINGLE_QUOTE_in_rule__CharLit__CharAssignment_1_08356); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4119:1: rule__CharLit__CharAssignment_1_1_1_0 : ( ( '\\'' ) ) ;
    public final void rule__CharLit__CharAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4123:1: ( ( ( '\\'' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4124:1: ( ( '\\'' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4124:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4125:1: ( '\\'' )
            {
             before(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_1_1_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4126:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4127:1: '\\''
            {
             before(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_1_1_0_0()); 
            match(input,35,FOLLOW_35_in_rule__CharLit__CharAssignment_1_1_1_08392); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4142:1: rule__CharLit__EscapedCharAssignment_1_1_1_1 : ( ruleEscapedChar ) ;
    public final void rule__CharLit__EscapedCharAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4146:1: ( ( ruleEscapedChar ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4147:1: ( ruleEscapedChar )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4147:1: ( ruleEscapedChar )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4148:1: ruleEscapedChar
            {
             before(grammarAccess.getCharLitAccess().getEscapedCharEscapedCharParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleEscapedChar_in_rule__CharLit__EscapedCharAssignment_1_1_1_18431);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4157:1: rule__EscapedChar__CharAssignment_0_1 : ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) ) ;
    public final void rule__EscapedChar__CharAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4161:1: ( ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4162:1: ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4162:1: ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4163:1: ( rule__EscapedChar__CharAlternatives_0_1_0 )
            {
             before(grammarAccess.getEscapedCharAccess().getCharAlternatives_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4164:1: ( rule__EscapedChar__CharAlternatives_0_1_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4164:2: rule__EscapedChar__CharAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__EscapedChar__CharAlternatives_0_1_0_in_rule__EscapedChar__CharAssignment_0_18462);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4173:1: rule__EscapedChar__DigitsAssignment_1_2 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4177:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4178:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4178:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4179:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_2_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_28495); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4188:1: rule__EscapedChar__DigitsAssignment_1_3 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4192:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4193:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4193:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4194:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_3_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_38526); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4203:1: rule__EscapedChar__DigitsAssignment_2_2 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4207:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4208:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4208:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4209:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_2_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_28557); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4218:1: rule__EscapedChar__DigitsAssignment_2_3 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4222:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4223:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4223:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4224:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_3_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_38588); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4233:1: rule__EscapedChar__DigitsAssignment_2_4 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4237:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4238:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4238:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4239:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_4_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_48619); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4248:1: rule__EscapedChar__DigitsAssignment_2_5 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4252:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4253:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4253:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4254:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_5_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_58650); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4263:1: rule__EscapedChar__DigitsAssignment_3_2 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4267:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4268:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4268:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4269:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_2_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_28681); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4278:1: rule__EscapedChar__DigitsAssignment_3_3 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4282:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4283:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4283:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4284:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_3_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_38712); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4293:1: rule__EscapedChar__DigitsAssignment_3_4 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4297:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4298:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4298:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4299:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_4_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_48743); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4308:1: rule__EscapedChar__DigitsAssignment_3_5 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4312:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4313:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4313:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4314:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_5_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_58774); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4323:1: rule__EscapedChar__DigitsAssignment_3_6 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4327:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4328:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4328:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4329:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_6_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_68805); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4338:1: rule__EscapedChar__DigitsAssignment_3_7 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4342:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4343:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4343:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4344:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_7_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_78836); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4353:1: rule__EscapedChar__DigitsAssignment_3_8 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4357:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4358:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4358:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4359:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_8_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_88867); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4368:1: rule__EscapedChar__DigitsAssignment_3_9 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4372:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4373:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4373:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4374:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_9_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_98898); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4383:1: rule__FloatLit__DigitsAssignment_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4387:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4388:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4388:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4389:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_08929); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4398:1: rule__FloatLit__DigitsAssignment_1_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4402:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4403:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4403:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4404:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_1_08960); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4413:1: rule__FloatLit__DigitsAssignment_2_1_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4417:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4418:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4418:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4419:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_2_1_08991); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4428:1: rule__FloatLit__NegativeExpAssignment_3_1_1 : ( ( '-' ) ) ;
    public final void rule__FloatLit__NegativeExpAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4432:1: ( ( ( '-' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4433:1: ( ( '-' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4433:1: ( ( '-' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4434:1: ( '-' )
            {
             before(grammarAccess.getFloatLitAccess().getNegativeExpHyphenMinusKeyword_3_1_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4435:1: ( '-' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4436:1: '-'
            {
             before(grammarAccess.getFloatLitAccess().getNegativeExpHyphenMinusKeyword_3_1_1_0()); 
            match(input,44,FOLLOW_44_in_rule__FloatLit__NegativeExpAssignment_3_1_19027); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4451:1: rule__FloatLit__DigitsAssignment_3_2_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4455:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4456:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4456:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4457:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_3_2_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_3_2_09066); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4466:1: rule__FloatLit__SizeAssignment_4_1 : ( ruleFloatSize ) ;
    public final void rule__FloatLit__SizeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4470:1: ( ( ruleFloatSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4471:1: ( ruleFloatSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4471:1: ( ruleFloatSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4472:1: ruleFloatSize
            {
             before(grammarAccess.getFloatLitAccess().getSizeFloatSizeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleFloatSize_in_rule__FloatLit__SizeAssignment_4_19097);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4481:1: rule__DecIntLit__DigitsAssignment_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__DecIntLit__DigitsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4485:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4486:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4486:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4487:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_09128); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4496:1: rule__DecIntLit__DigitsAssignment_1_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__DecIntLit__DigitsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4500:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4501:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4501:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4502:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_1_09159); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4511:1: rule__DecIntLit__UnsignedAssignment_2_0_1 : ( ( 'u' ) ) ;
    public final void rule__DecIntLit__UnsignedAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4515:1: ( ( ( 'u' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4516:1: ( ( 'u' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4516:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4517:1: ( 'u' )
            {
             before(grammarAccess.getDecIntLitAccess().getUnsignedUKeyword_2_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4518:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4519:1: 'u'
            {
             before(grammarAccess.getDecIntLitAccess().getUnsignedUKeyword_2_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__DecIntLit__UnsignedAssignment_2_0_19195); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4534:1: rule__DecIntLit__SizeAssignment_2_1 : ( ruleIntSize ) ;
    public final void rule__DecIntLit__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4538:1: ( ( ruleIntSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4539:1: ( ruleIntSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4539:1: ( ruleIntSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4540:1: ruleIntSize
            {
             before(grammarAccess.getDecIntLitAccess().getSizeIntSizeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntSize_in_rule__DecIntLit__SizeAssignment_2_19234);
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


    // $ANTLR start "rule__BinIntLit__DigitsAssignment_2_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4549:1: rule__BinIntLit__DigitsAssignment_2_0 : ( ( '0' ) ) ;
    public final void rule__BinIntLit__DigitsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4553:1: ( ( ( '0' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4554:1: ( ( '0' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4554:1: ( ( '0' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4555:1: ( '0' )
            {
             before(grammarAccess.getBinIntLitAccess().getDigits0Keyword_2_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4556:1: ( '0' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4557:1: '0'
            {
             before(grammarAccess.getBinIntLitAccess().getDigits0Keyword_2_0_0()); 
            match(input,16,FOLLOW_16_in_rule__BinIntLit__DigitsAssignment_2_09270); 
             after(grammarAccess.getBinIntLitAccess().getDigits0Keyword_2_0_0()); 

            }

             after(grammarAccess.getBinIntLitAccess().getDigits0Keyword_2_0_0()); 

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
    // $ANTLR end "rule__BinIntLit__DigitsAssignment_2_0"


    // $ANTLR start "rule__BinIntLit__DigitsAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4572:1: rule__BinIntLit__DigitsAssignment_2_1 : ( ( '1' ) ) ;
    public final void rule__BinIntLit__DigitsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4576:1: ( ( ( '1' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4577:1: ( ( '1' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4577:1: ( ( '1' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4578:1: ( '1' )
            {
             before(grammarAccess.getBinIntLitAccess().getDigits1Keyword_2_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4579:1: ( '1' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4580:1: '1'
            {
             before(grammarAccess.getBinIntLitAccess().getDigits1Keyword_2_1_0()); 
            match(input,45,FOLLOW_45_in_rule__BinIntLit__DigitsAssignment_2_19314); 
             after(grammarAccess.getBinIntLitAccess().getDigits1Keyword_2_1_0()); 

            }

             after(grammarAccess.getBinIntLitAccess().getDigits1Keyword_2_1_0()); 

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
    // $ANTLR end "rule__BinIntLit__DigitsAssignment_2_1"


    // $ANTLR start "rule__BinIntLit__UnsignedAssignment_3_0_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4595:1: rule__BinIntLit__UnsignedAssignment_3_0_1 : ( ( 'u' ) ) ;
    public final void rule__BinIntLit__UnsignedAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4599:1: ( ( ( 'u' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4600:1: ( ( 'u' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4600:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4601:1: ( 'u' )
            {
             before(grammarAccess.getBinIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4602:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4603:1: 'u'
            {
             before(grammarAccess.getBinIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__BinIntLit__UnsignedAssignment_3_0_19358); 
             after(grammarAccess.getBinIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 

            }

             after(grammarAccess.getBinIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 

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
    // $ANTLR end "rule__BinIntLit__UnsignedAssignment_3_0_1"


    // $ANTLR start "rule__BinIntLit__SizeAssignment_3_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4618:1: rule__BinIntLit__SizeAssignment_3_1 : ( ruleIntSize ) ;
    public final void rule__BinIntLit__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4622:1: ( ( ruleIntSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4623:1: ( ruleIntSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4623:1: ( ruleIntSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4624:1: ruleIntSize
            {
             before(grammarAccess.getBinIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntSize_in_rule__BinIntLit__SizeAssignment_3_19397);
            ruleIntSize();

            state._fsp--;

             after(grammarAccess.getBinIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__BinIntLit__SizeAssignment_3_1"


    // $ANTLR start "rule__OctIntLit__DigitsAssignment_2_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4633:1: rule__OctIntLit__DigitsAssignment_2_0 : ( RULE_OCT_DIGIT ) ;
    public final void rule__OctIntLit__DigitsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4637:1: ( ( RULE_OCT_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4638:1: ( RULE_OCT_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4638:1: ( RULE_OCT_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4639:1: RULE_OCT_DIGIT
            {
             before(grammarAccess.getOctIntLitAccess().getDigitsOCT_DIGITTerminalRuleCall_2_0_0()); 
            match(input,RULE_OCT_DIGIT,FOLLOW_RULE_OCT_DIGIT_in_rule__OctIntLit__DigitsAssignment_2_09428); 
             after(grammarAccess.getOctIntLitAccess().getDigitsOCT_DIGITTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__OctIntLit__DigitsAssignment_2_0"


    // $ANTLR start "rule__OctIntLit__UnsignedAssignment_3_0_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4648:1: rule__OctIntLit__UnsignedAssignment_3_0_1 : ( ( 'u' ) ) ;
    public final void rule__OctIntLit__UnsignedAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4652:1: ( ( ( 'u' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4653:1: ( ( 'u' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4653:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4654:1: ( 'u' )
            {
             before(grammarAccess.getOctIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4655:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4656:1: 'u'
            {
             before(grammarAccess.getOctIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__OctIntLit__UnsignedAssignment_3_0_19464); 
             after(grammarAccess.getOctIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 

            }

             after(grammarAccess.getOctIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 

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
    // $ANTLR end "rule__OctIntLit__UnsignedAssignment_3_0_1"


    // $ANTLR start "rule__OctIntLit__SizeAssignment_3_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4671:1: rule__OctIntLit__SizeAssignment_3_1 : ( ruleIntSize ) ;
    public final void rule__OctIntLit__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4675:1: ( ( ruleIntSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4676:1: ( ruleIntSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4676:1: ( ruleIntSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4677:1: ruleIntSize
            {
             before(grammarAccess.getOctIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntSize_in_rule__OctIntLit__SizeAssignment_3_19503);
            ruleIntSize();

            state._fsp--;

             after(grammarAccess.getOctIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__OctIntLit__SizeAssignment_3_1"


    // $ANTLR start "rule__HexIntLit__DigitsAssignment_2_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4686:1: rule__HexIntLit__DigitsAssignment_2_0 : ( RULE_HEX_DIGIT ) ;
    public final void rule__HexIntLit__DigitsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4690:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4691:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4691:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4692:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getHexIntLitAccess().getDigitsHEX_DIGITTerminalRuleCall_2_0_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__HexIntLit__DigitsAssignment_2_09534); 
             after(grammarAccess.getHexIntLitAccess().getDigitsHEX_DIGITTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__HexIntLit__DigitsAssignment_2_0"


    // $ANTLR start "rule__HexIntLit__UnsignedAssignment_3_0_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4701:1: rule__HexIntLit__UnsignedAssignment_3_0_1 : ( ( 'u' ) ) ;
    public final void rule__HexIntLit__UnsignedAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4705:1: ( ( ( 'u' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4706:1: ( ( 'u' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4706:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4707:1: ( 'u' )
            {
             before(grammarAccess.getHexIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4708:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4709:1: 'u'
            {
             before(grammarAccess.getHexIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__HexIntLit__UnsignedAssignment_3_0_19570); 
             after(grammarAccess.getHexIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 

            }

             after(grammarAccess.getHexIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 

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
    // $ANTLR end "rule__HexIntLit__UnsignedAssignment_3_0_1"


    // $ANTLR start "rule__HexIntLit__SizeAssignment_3_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4724:1: rule__HexIntLit__SizeAssignment_3_1 : ( ruleIntSize ) ;
    public final void rule__HexIntLit__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4728:1: ( ( ruleIntSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4729:1: ( ruleIntSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4729:1: ( ruleIntSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4730:1: ruleIntSize
            {
             before(grammarAccess.getHexIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntSize_in_rule__HexIntLit__SizeAssignment_3_19609);
            ruleIntSize();

            state._fsp--;

             after(grammarAccess.getHexIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__HexIntLit__SizeAssignment_3_1"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\6\uffff";
    static final String DFA9_eofS =
        "\1\uffff\1\2\1\uffff\2\2\1\uffff";
    static final String DFA9_minS =
        "\2\7\1\uffff\2\7\1\uffff";
    static final String DFA9_maxS =
        "\1\53\1\47\1\uffff\2\47\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\2\uffff\1\1";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\41\uffff\3\2",
            "\1\3\11\uffff\1\4\3\uffff\1\2\5\uffff\2\2\1\uffff\1\2\6\uffff"+
            "\1\2\1\uffff\1\5",
            "",
            "\1\3\11\uffff\1\4\3\uffff\1\2\5\uffff\2\2\1\uffff\1\2\6\uffff"+
            "\1\2\1\uffff\1\5",
            "\1\3\11\uffff\1\4\3\uffff\1\2\5\uffff\2\2\1\uffff\1\2\6\uffff"+
            "\1\2\1\uffff\1\5",
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
            return "798:1: rule__NumberLit__Alternatives : ( ( ruleFloatLit ) | ( ruleIntLit ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleCrate_in_entryRuleCrate61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrate68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crate__ItemsAssignment_in_ruleCrate94 = new BitSet(new long[]{0x0000000104000002L});
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
    public static final BitSet FOLLOW_rule__IntLit__Alternatives_in_ruleIntLit874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecIntLit_in_entryRuleDecIntLit901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecIntLit908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__0_in_ruleDecIntLit934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinIntLit_in_entryRuleBinIntLit961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinIntLit968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__0_in_ruleBinIntLit994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctIntLit_in_entryRuleOctIntLit1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOctIntLit1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__0_in_ruleOctIntLit1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexIntLit_in_entryRuleHexIntLit1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexIntLit1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__0_in_ruleHexIntLit1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatSize__Alternatives_in_ruleFloatSize1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntSize__Alternatives_in_ruleIntSize1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ModItem__Alternatives_21272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_21291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rule__Literal__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__CharAssignment_1_0_in_rule__CharLit__Alternatives_11373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_1__0_in_rule__CharLit__Alternatives_11391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__CharAssignment_1_1_1_0_in_rule__CharLit__Alternatives_1_1_11424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__EscapedCharAssignment_1_1_1_1_in_rule__CharLit__Alternatives_1_1_11442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__0_in_rule__EscapedChar__Alternatives1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__0_in_rule__EscapedChar__Alternatives1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__0_in_rule__EscapedChar__Alternatives1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__0_in_rule__EscapedChar__Alternatives1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EscapedChar__CharAlternatives_0_1_01563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EscapedChar__CharAlternatives_0_1_01583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EscapedChar__CharAlternatives_0_1_01603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EscapedChar__CharAlternatives_0_1_01623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EscapedChar__CharAlternatives_0_1_01643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLit_in_rule__NumberLit__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLit_in_rule__NumberLit__Alternatives1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_1_0_in_rule__FloatLit__Alternatives_11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FloatLit__Alternatives_11745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_2_1_0_in_rule__FloatLit__Alternatives_2_11779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FloatLit__Alternatives_2_11798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FloatLit__Alternatives_3_01833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FloatLit__Alternatives_3_01853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FloatLit__Alternatives_3_11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__NegativeExpAssignment_3_1_1_in_rule__FloatLit__Alternatives_3_11907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_3_2_0_in_rule__FloatLit__Alternatives_3_21940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FloatLit__Alternatives_3_21959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecIntLit_in_rule__IntLit__Alternatives1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinIntLit_in_rule__IntLit__Alternatives2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctIntLit_in_rule__IntLit__Alternatives2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexIntLit_in_rule__IntLit__Alternatives2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__DigitsAssignment_1_0_in_rule__DecIntLit__Alternatives_12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DecIntLit__Alternatives_12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DecIntLit__Alternatives_2_02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__UnsignedAssignment_2_0_1_in_rule__DecIntLit__Alternatives_2_02149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__DigitsAssignment_2_0_in_rule__BinIntLit__Alternatives_22182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__DigitsAssignment_2_1_in_rule__BinIntLit__Alternatives_22200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BinIntLit__Alternatives_22219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BinIntLit__Alternatives_3_02254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__UnsignedAssignment_3_0_1_in_rule__BinIntLit__Alternatives_3_02273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__DigitsAssignment_2_0_in_rule__OctIntLit__Alternatives_22306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OctIntLit__Alternatives_22325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__OctIntLit__Alternatives_3_02360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__UnsignedAssignment_3_0_1_in_rule__OctIntLit__Alternatives_3_02379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__DigitsAssignment_2_0_in_rule__HexIntLit__Alternatives_22412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HexIntLit__Alternatives_22431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HexIntLit__Alternatives_3_02466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__UnsignedAssignment_3_0_1_in_rule__HexIntLit__Alternatives_3_02485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FloatSize__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FloatSize__Alternatives2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IntSize__Alternatives2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IntSize__Alternatives2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IntSize__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IntSize__Alternatives2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ItemAttr__Group__0__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12734 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__22794 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__22797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl2824 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__32855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ItemAttr__Group__3__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__02922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__02925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ItemAttr__Group_2__0__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__12984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__03045 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__03048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__13105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__13108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AttrWithList__Group__1__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__23167 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__23170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__33227 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__33230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl3257 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__43288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AttrWithList__Group__4__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__03357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__03360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AttrWithList__Group_3__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__13419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__03480 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__03483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__13540 = new BitSet(new long[]{0x00000E0800000080L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LiteralAttr__Group__1__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03665 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3695 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__03787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__03790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModItem__Group__0__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__13849 = new BitSet(new long[]{0x0000000200000800L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__13852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__23909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__03972 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__03975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModItem__Group_2_1__0__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__14034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ModItem__Group_2_1__1__Impl4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__0__Impl_in_rule__CharLit__Group__04097 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__CharLit__Group__1_in_rule__CharLit__Group__04100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CharLit__Group__0__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__1__Impl_in_rule__CharLit__Group__14159 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CharLit__Group__2_in_rule__CharLit__Group__14162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Alternatives_1_in_rule__CharLit__Group__1__Impl4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__2__Impl_in_rule__CharLit__Group__24219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CharLit__Group__2__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_1__0__Impl_in_rule__CharLit__Group_1_1__04284 = new BitSet(new long[]{0x000000780001F000L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_1__1_in_rule__CharLit__Group_1_1__04287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CharLit__Group_1_1__0__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_1__1__Impl_in_rule__CharLit__Group_1_1__14346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Alternatives_1_1_1_in_rule__CharLit__Group_1_1__1__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__0__Impl_in_rule__EscapedChar__Group_0__04407 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__1_in_rule__EscapedChar__Group_0__04410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__1__Impl_in_rule__EscapedChar__Group_0__14468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__CharAssignment_0_1_in_rule__EscapedChar__Group_0__1__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__0__Impl_in_rule__EscapedChar__Group_1__04529 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__1_in_rule__EscapedChar__Group_1__04532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__1__Impl_in_rule__EscapedChar__Group_1__14590 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__2_in_rule__EscapedChar__Group_1__14593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EscapedChar__Group_1__1__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__2__Impl_in_rule__EscapedChar__Group_1__24652 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__3_in_rule__EscapedChar__Group_1__24655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_1_2_in_rule__EscapedChar__Group_1__2__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__3__Impl_in_rule__EscapedChar__Group_1__34712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_1_3_in_rule__EscapedChar__Group_1__3__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__0__Impl_in_rule__EscapedChar__Group_2__04777 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__1_in_rule__EscapedChar__Group_2__04780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__1__Impl_in_rule__EscapedChar__Group_2__14838 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__2_in_rule__EscapedChar__Group_2__14841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EscapedChar__Group_2__1__Impl4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__2__Impl_in_rule__EscapedChar__Group_2__24900 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__3_in_rule__EscapedChar__Group_2__24903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_2_in_rule__EscapedChar__Group_2__2__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__3__Impl_in_rule__EscapedChar__Group_2__34960 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__4_in_rule__EscapedChar__Group_2__34963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_3_in_rule__EscapedChar__Group_2__3__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__4__Impl_in_rule__EscapedChar__Group_2__45020 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__5_in_rule__EscapedChar__Group_2__45023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_4_in_rule__EscapedChar__Group_2__4__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__5__Impl_in_rule__EscapedChar__Group_2__55080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_5_in_rule__EscapedChar__Group_2__5__Impl5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__0__Impl_in_rule__EscapedChar__Group_3__05149 = new BitSet(new long[]{0x000000780001F000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__1_in_rule__EscapedChar__Group_3__05152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__1__Impl_in_rule__EscapedChar__Group_3__15210 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__2_in_rule__EscapedChar__Group_3__15213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EscapedChar__Group_3__1__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__2__Impl_in_rule__EscapedChar__Group_3__25272 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__3_in_rule__EscapedChar__Group_3__25275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_2_in_rule__EscapedChar__Group_3__2__Impl5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__3__Impl_in_rule__EscapedChar__Group_3__35332 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__4_in_rule__EscapedChar__Group_3__35335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_3_in_rule__EscapedChar__Group_3__3__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__4__Impl_in_rule__EscapedChar__Group_3__45392 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__5_in_rule__EscapedChar__Group_3__45395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_4_in_rule__EscapedChar__Group_3__4__Impl5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__5__Impl_in_rule__EscapedChar__Group_3__55452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__6_in_rule__EscapedChar__Group_3__55455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_5_in_rule__EscapedChar__Group_3__5__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__6__Impl_in_rule__EscapedChar__Group_3__65512 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__7_in_rule__EscapedChar__Group_3__65515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_6_in_rule__EscapedChar__Group_3__6__Impl5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__7__Impl_in_rule__EscapedChar__Group_3__75572 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__8_in_rule__EscapedChar__Group_3__75575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_7_in_rule__EscapedChar__Group_3__7__Impl5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__8__Impl_in_rule__EscapedChar__Group_3__85632 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__9_in_rule__EscapedChar__Group_3__85635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_8_in_rule__EscapedChar__Group_3__8__Impl5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__9__Impl_in_rule__EscapedChar__Group_3__95692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_9_in_rule__EscapedChar__Group_3__9__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__0__Impl_in_rule__FloatLit__Group__05769 = new BitSet(new long[]{0x0000008000020080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__1_in_rule__FloatLit__Group__05772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_0_in_rule__FloatLit__Group__0__Impl5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__1__Impl_in_rule__FloatLit__Group__15829 = new BitSet(new long[]{0x0000008000020080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__2_in_rule__FloatLit__Group__15832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_1_in_rule__FloatLit__Group__1__Impl5859 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__2__Impl_in_rule__FloatLit__Group__25890 = new BitSet(new long[]{0x00000100000C0000L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__3_in_rule__FloatLit__Group__25893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__0_in_rule__FloatLit__Group__2__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__3__Impl_in_rule__FloatLit__Group__35950 = new BitSet(new long[]{0x00000100000C0000L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__4_in_rule__FloatLit__Group__35953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__0_in_rule__FloatLit__Group__3__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__4__Impl_in_rule__FloatLit__Group__46011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__0_in_rule__FloatLit__Group__4__Impl6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__0__Impl_in_rule__FloatLit__Group_2__06079 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__1_in_rule__FloatLit__Group_2__06082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FloatLit__Group_2__0__Impl6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__1__Impl_in_rule__FloatLit__Group_2__16141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl6170 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl6182 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__0__Impl_in_rule__FloatLit__Group_3__06219 = new BitSet(new long[]{0x0000100000120080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__1_in_rule__FloatLit__Group_3__06222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_0_in_rule__FloatLit__Group_3__0__Impl6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__1__Impl_in_rule__FloatLit__Group_3__16279 = new BitSet(new long[]{0x0000100000120080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__2_in_rule__FloatLit__Group_3__16282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_1_in_rule__FloatLit__Group_3__1__Impl6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__2__Impl_in_rule__FloatLit__Group_3__26340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl6369 = new BitSet(new long[]{0x0000100000120082L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl6381 = new BitSet(new long[]{0x0000100000120082L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__0__Impl_in_rule__FloatLit__Group_4__06420 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__1_in_rule__FloatLit__Group_4__06423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FloatLit__Group_4__0__Impl6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__1__Impl_in_rule__FloatLit__Group_4__16482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__SizeAssignment_4_1_in_rule__FloatLit__Group_4__1__Impl6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__0__Impl_in_rule__DecIntLit__Group__06543 = new BitSet(new long[]{0x0000002000220080L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__1_in_rule__DecIntLit__Group__06546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__DigitsAssignment_0_in_rule__DecIntLit__Group__0__Impl6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__1__Impl_in_rule__DecIntLit__Group__16603 = new BitSet(new long[]{0x0000002000220080L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__2_in_rule__DecIntLit__Group__16606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Alternatives_1_in_rule__DecIntLit__Group__1__Impl6633 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__2__Impl_in_rule__DecIntLit__Group__26664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__0_in_rule__DecIntLit__Group__2__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__0__Impl_in_rule__DecIntLit__Group_2__06728 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__1_in_rule__DecIntLit__Group_2__06731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Alternatives_2_0_in_rule__DecIntLit__Group_2__0__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__1__Impl_in_rule__DecIntLit__Group_2__16788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__SizeAssignment_2_1_in_rule__DecIntLit__Group_2__1__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__0__Impl_in_rule__BinIntLit__Group__06849 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__1_in_rule__BinIntLit__Group__06852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__1__Impl_in_rule__BinIntLit__Group__16910 = new BitSet(new long[]{0x0000200000030000L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__2_in_rule__BinIntLit__Group__16913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__BinIntLit__Group__1__Impl6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__2__Impl_in_rule__BinIntLit__Group__26972 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__3_in_rule__BinIntLit__Group__26975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Alternatives_2_in_rule__BinIntLit__Group__2__Impl7004 = new BitSet(new long[]{0x0000200000030002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Alternatives_2_in_rule__BinIntLit__Group__2__Impl7016 = new BitSet(new long[]{0x0000200000030002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__3__Impl_in_rule__BinIntLit__Group__37049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group_3__0_in_rule__BinIntLit__Group__3__Impl7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group_3__0__Impl_in_rule__BinIntLit__Group_3__07115 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group_3__1_in_rule__BinIntLit__Group_3__07118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Alternatives_3_0_in_rule__BinIntLit__Group_3__0__Impl7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group_3__1__Impl_in_rule__BinIntLit__Group_3__17175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__SizeAssignment_3_1_in_rule__BinIntLit__Group_3__1__Impl7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__0__Impl_in_rule__OctIntLit__Group__07236 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__1_in_rule__OctIntLit__Group__07239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__1__Impl_in_rule__OctIntLit__Group__17297 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__2_in_rule__OctIntLit__Group__17300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__OctIntLit__Group__1__Impl7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__2__Impl_in_rule__OctIntLit__Group__27359 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__3_in_rule__OctIntLit__Group__27362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Alternatives_2_in_rule__OctIntLit__Group__2__Impl7391 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_rule__OctIntLit__Alternatives_2_in_rule__OctIntLit__Group__2__Impl7403 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__3__Impl_in_rule__OctIntLit__Group__37436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group_3__0_in_rule__OctIntLit__Group__3__Impl7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group_3__0__Impl_in_rule__OctIntLit__Group_3__07502 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group_3__1_in_rule__OctIntLit__Group_3__07505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Alternatives_3_0_in_rule__OctIntLit__Group_3__0__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group_3__1__Impl_in_rule__OctIntLit__Group_3__17562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__SizeAssignment_3_1_in_rule__OctIntLit__Group_3__1__Impl7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__0__Impl_in_rule__HexIntLit__Group__07623 = new BitSet(new long[]{0x00000E0800000080L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__1_in_rule__HexIntLit__Group__07626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__1__Impl_in_rule__HexIntLit__Group__17684 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__2_in_rule__HexIntLit__Group__17687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__HexIntLit__Group__1__Impl7715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__2__Impl_in_rule__HexIntLit__Group__27746 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__3_in_rule__HexIntLit__Group__27749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Alternatives_2_in_rule__HexIntLit__Group__2__Impl7778 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_rule__HexIntLit__Alternatives_2_in_rule__HexIntLit__Group__2__Impl7790 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__3__Impl_in_rule__HexIntLit__Group__37823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group_3__0_in_rule__HexIntLit__Group__3__Impl7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group_3__0__Impl_in_rule__HexIntLit__Group_3__07889 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group_3__1_in_rule__HexIntLit__Group_3__07892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Alternatives_3_0_in_rule__HexIntLit__Group_3__0__Impl7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group_3__1__Impl_in_rule__HexIntLit__Group_3__17949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__SizeAssignment_3_1_in_rule__HexIntLit__Group_3__1__Impl7976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_18046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_18077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_08108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_28139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_18170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_08201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_28232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_08263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_18294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_18325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NON_SINGLE_QUOTE_in_rule__CharLit__CharAssignment_1_08356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CharLit__CharAssignment_1_1_1_08392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedChar_in_rule__CharLit__EscapedCharAssignment_1_1_1_18431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__CharAlternatives_0_1_0_in_rule__EscapedChar__CharAssignment_0_18462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_28495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_38526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_28557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_38588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_48619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_58650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_28681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_38712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_48743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_58774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_68805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_78836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_88867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_98898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_08929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_1_08960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_2_1_08991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FloatLit__NegativeExpAssignment_3_1_19027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_3_2_09066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatSize_in_rule__FloatLit__SizeAssignment_4_19097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_09128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_1_09159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DecIntLit__UnsignedAssignment_2_0_19195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntSize_in_rule__DecIntLit__SizeAssignment_2_19234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BinIntLit__DigitsAssignment_2_09270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__BinIntLit__DigitsAssignment_2_19314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BinIntLit__UnsignedAssignment_3_0_19358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntSize_in_rule__BinIntLit__SizeAssignment_3_19397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCT_DIGIT_in_rule__OctIntLit__DigitsAssignment_2_09428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__OctIntLit__UnsignedAssignment_3_0_19464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntSize_in_rule__OctIntLit__SizeAssignment_3_19503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__HexIntLit__DigitsAssignment_2_09534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__HexIntLit__UnsignedAssignment_3_0_19570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntSize_in_rule__HexIntLit__SizeAssignment_3_19609 = new BitSet(new long[]{0x0000000000000002L});

}