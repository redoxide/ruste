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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_NON_SPECIAL_CHAR", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "';'", "'\\\\'", "'n'", "'r'", "'t'", "'0'", "'_'", "'E'", "'e'", "'+'", "'i'", "'32'", "'64'", "'8'", "'16'", "'#['", "']'", "','", "'('", "')'", "'='", "'mod'", "'{'", "'}'", "'\\''", "'x'", "'u'", "'U'", "'.'", "'f'", "'0b'", "'0o'", "'0x'", "'\"'", "'-'", "'1'"
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
    public static final int RULE_NON_SPECIAL_CHAR=5;
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
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_OCT_DIGIT=8;
    public static final int RULE_DEC_DIGIT=7;
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


    // $ANTLR start "entryRuleStringLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:564:1: entryRuleStringLit : ruleStringLit EOF ;
    public final void entryRuleStringLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:565:1: ( ruleStringLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:566:1: ruleStringLit EOF
            {
             before(grammarAccess.getStringLitRule()); 
            pushFollow(FOLLOW_ruleStringLit_in_entryRuleStringLit1141);
            ruleStringLit();

            state._fsp--;

             after(grammarAccess.getStringLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLit1148); 

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
    // $ANTLR end "entryRuleStringLit"


    // $ANTLR start "ruleStringLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:573:1: ruleStringLit : ( ( rule__StringLit__Group__0 ) ) ;
    public final void ruleStringLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:577:2: ( ( ( rule__StringLit__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:578:1: ( ( rule__StringLit__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:578:1: ( ( rule__StringLit__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:579:1: ( rule__StringLit__Group__0 )
            {
             before(grammarAccess.getStringLitAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:580:1: ( rule__StringLit__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:580:2: rule__StringLit__Group__0
            {
            pushFollow(FOLLOW_rule__StringLit__Group__0_in_ruleStringLit1174);
            rule__StringLit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLit"


    // $ANTLR start "entryRuleStringChar"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:592:1: entryRuleStringChar : ruleStringChar EOF ;
    public final void entryRuleStringChar() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:593:1: ( ruleStringChar EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:594:1: ruleStringChar EOF
            {
             before(grammarAccess.getStringCharRule()); 
            pushFollow(FOLLOW_ruleStringChar_in_entryRuleStringChar1201);
            ruleStringChar();

            state._fsp--;

             after(grammarAccess.getStringCharRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringChar1208); 

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
    // $ANTLR end "entryRuleStringChar"


    // $ANTLR start "ruleStringChar"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:601:1: ruleStringChar : ( ( rule__StringChar__Alternatives ) ) ;
    public final void ruleStringChar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:605:2: ( ( ( rule__StringChar__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:606:1: ( ( rule__StringChar__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:606:1: ( ( rule__StringChar__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:607:1: ( rule__StringChar__Alternatives )
            {
             before(grammarAccess.getStringCharAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:1: ( rule__StringChar__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:2: rule__StringChar__Alternatives
            {
            pushFollow(FOLLOW_rule__StringChar__Alternatives_in_ruleStringChar1234);
            rule__StringChar__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringCharAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringChar"


    // $ANTLR start "ruleFloatSize"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:621:1: ruleFloatSize : ( ( rule__FloatSize__Alternatives ) ) ;
    public final void ruleFloatSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:625:1: ( ( ( rule__FloatSize__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:626:1: ( ( rule__FloatSize__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:626:1: ( ( rule__FloatSize__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:627:1: ( rule__FloatSize__Alternatives )
            {
             before(grammarAccess.getFloatSizeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:628:1: ( rule__FloatSize__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:628:2: rule__FloatSize__Alternatives
            {
            pushFollow(FOLLOW_rule__FloatSize__Alternatives_in_ruleFloatSize1271);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:640:1: ruleIntSize : ( ( rule__IntSize__Alternatives ) ) ;
    public final void ruleIntSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:644:1: ( ( ( rule__IntSize__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:645:1: ( ( rule__IntSize__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:645:1: ( ( rule__IntSize__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:646:1: ( rule__IntSize__Alternatives )
            {
             before(grammarAccess.getIntSizeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:647:1: ( rule__IntSize__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:647:2: rule__IntSize__Alternatives
            {
            pushFollow(FOLLOW_rule__IntSize__Alternatives_in_ruleIntSize1307);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:658:1: rule__Attr__Alternatives : ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) );
    public final void rule__Attr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:662:1: ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==31) ) {
                    alt2=1;
                }
                else if ( (LA2_1==29) ) {
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:663:1: ( ruleLiteralAttr )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:663:1: ( ruleLiteralAttr )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:664:1: ruleLiteralAttr
                    {
                     before(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1342);
                    ruleLiteralAttr();

                    state._fsp--;

                     after(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:669:6: ( ruleAttrWithList )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:669:6: ( ruleAttrWithList )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:670:1: ruleAttrWithList
                    {
                     before(grammarAccess.getAttrAccess().getAttrWithListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1359);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:680:1: rule__ModItem__Alternatives_2 : ( ( ';' ) | ( ( rule__ModItem__Group_2_1__0 ) ) );
    public final void rule__ModItem__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:684:1: ( ( ';' ) | ( ( rule__ModItem__Group_2_1__0 ) ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:685:1: ( ';' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:685:1: ( ';' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:686:1: ';'
                    {
                     before(grammarAccess.getModItemAccess().getSemicolonKeyword_2_0()); 
                    match(input,11,FOLLOW_11_in_rule__ModItem__Alternatives_21392); 
                     after(grammarAccess.getModItemAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:693:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:693:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:694:1: ( rule__ModItem__Group_2_1__0 )
                    {
                     before(grammarAccess.getModItemAccess().getGroup_2_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:695:1: ( rule__ModItem__Group_2_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:695:2: rule__ModItem__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_21411);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:704:1: rule__Literal__Alternatives : ( ( ruleCharLit ) | ( ruleNumberLit ) | ( ruleStringLit ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:708:1: ( ( ruleCharLit ) | ( ruleNumberLit ) | ( ruleStringLit ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt4=1;
                }
                break;
            case RULE_DEC_DIGIT:
            case 41:
            case 42:
            case 43:
                {
                alt4=2;
                }
                break;
            case 44:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:709:1: ( ruleCharLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:709:1: ( ruleCharLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:710:1: ruleCharLit
                    {
                     before(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCharLit_in_rule__Literal__Alternatives1444);
                    ruleCharLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:715:6: ( ruleNumberLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:715:6: ( ruleNumberLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:716:1: ruleNumberLit
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives1461);
                    ruleNumberLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:721:6: ( ruleStringLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:721:6: ( ruleStringLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:722:1: ruleStringLit
                    {
                     before(grammarAccess.getLiteralAccess().getStringLitParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringLit_in_rule__Literal__Alternatives1478);
                    ruleStringLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLitParserRuleCall_2()); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:732:1: rule__CharLit__Alternatives_1 : ( ( ( rule__CharLit__CharAssignment_1_0 ) ) | ( ( rule__CharLit__CharAssignment_1_1 ) ) | ( ( rule__CharLit__Group_1_2__0 ) ) );
    public final void rule__CharLit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:736:1: ( ( ( rule__CharLit__CharAssignment_1_0 ) ) | ( ( rule__CharLit__CharAssignment_1_1 ) ) | ( ( rule__CharLit__Group_1_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_NON_SPECIAL_CHAR:
                {
                alt5=1;
                }
                break;
            case 44:
                {
                alt5=2;
                }
                break;
            case 12:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:737:1: ( ( rule__CharLit__CharAssignment_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:737:1: ( ( rule__CharLit__CharAssignment_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:738:1: ( rule__CharLit__CharAssignment_1_0 )
                    {
                     before(grammarAccess.getCharLitAccess().getCharAssignment_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:739:1: ( rule__CharLit__CharAssignment_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:739:2: rule__CharLit__CharAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__CharLit__CharAssignment_1_0_in_rule__CharLit__Alternatives_11510);
                    rule__CharLit__CharAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getCharAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:743:6: ( ( rule__CharLit__CharAssignment_1_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:743:6: ( ( rule__CharLit__CharAssignment_1_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:744:1: ( rule__CharLit__CharAssignment_1_1 )
                    {
                     before(grammarAccess.getCharLitAccess().getCharAssignment_1_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:745:1: ( rule__CharLit__CharAssignment_1_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:745:2: rule__CharLit__CharAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__CharLit__CharAssignment_1_1_in_rule__CharLit__Alternatives_11528);
                    rule__CharLit__CharAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getCharAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:749:6: ( ( rule__CharLit__Group_1_2__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:749:6: ( ( rule__CharLit__Group_1_2__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:750:1: ( rule__CharLit__Group_1_2__0 )
                    {
                     before(grammarAccess.getCharLitAccess().getGroup_1_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:751:1: ( rule__CharLit__Group_1_2__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:751:2: rule__CharLit__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__CharLit__Group_1_2__0_in_rule__CharLit__Alternatives_11546);
                    rule__CharLit__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getGroup_1_2()); 

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


    // $ANTLR start "rule__CharLit__Alternatives_1_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:760:1: rule__CharLit__Alternatives_1_2_1 : ( ( ( rule__CharLit__CharAssignment_1_2_1_0 ) ) | ( ( rule__CharLit__EscapedCharAssignment_1_2_1_1 ) ) );
    public final void rule__CharLit__Alternatives_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:764:1: ( ( ( rule__CharLit__CharAssignment_1_2_1_0 ) ) | ( ( rule__CharLit__EscapedCharAssignment_1_2_1_1 ) ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:765:1: ( ( rule__CharLit__CharAssignment_1_2_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:765:1: ( ( rule__CharLit__CharAssignment_1_2_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:766:1: ( rule__CharLit__CharAssignment_1_2_1_0 )
                    {
                     before(grammarAccess.getCharLitAccess().getCharAssignment_1_2_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:767:1: ( rule__CharLit__CharAssignment_1_2_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:767:2: rule__CharLit__CharAssignment_1_2_1_0
                    {
                    pushFollow(FOLLOW_rule__CharLit__CharAssignment_1_2_1_0_in_rule__CharLit__Alternatives_1_2_11579);
                    rule__CharLit__CharAssignment_1_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getCharAssignment_1_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:771:6: ( ( rule__CharLit__EscapedCharAssignment_1_2_1_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:771:6: ( ( rule__CharLit__EscapedCharAssignment_1_2_1_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:772:1: ( rule__CharLit__EscapedCharAssignment_1_2_1_1 )
                    {
                     before(grammarAccess.getCharLitAccess().getEscapedCharAssignment_1_2_1_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:773:1: ( rule__CharLit__EscapedCharAssignment_1_2_1_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:773:2: rule__CharLit__EscapedCharAssignment_1_2_1_1
                    {
                    pushFollow(FOLLOW_rule__CharLit__EscapedCharAssignment_1_2_1_1_in_rule__CharLit__Alternatives_1_2_11597);
                    rule__CharLit__EscapedCharAssignment_1_2_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharLitAccess().getEscapedCharAssignment_1_2_1_1()); 

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
    // $ANTLR end "rule__CharLit__Alternatives_1_2_1"


    // $ANTLR start "rule__EscapedChar__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:782:1: rule__EscapedChar__Alternatives : ( ( ( rule__EscapedChar__Group_0__0 ) ) | ( ( rule__EscapedChar__Group_1__0 ) ) | ( ( rule__EscapedChar__Group_2__0 ) ) | ( ( rule__EscapedChar__Group_3__0 ) ) );
    public final void rule__EscapedChar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:786:1: ( ( ( rule__EscapedChar__Group_0__0 ) ) | ( ( rule__EscapedChar__Group_1__0 ) ) | ( ( rule__EscapedChar__Group_2__0 ) ) | ( ( rule__EscapedChar__Group_3__0 ) ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:787:1: ( ( rule__EscapedChar__Group_0__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:787:1: ( ( rule__EscapedChar__Group_0__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:788:1: ( rule__EscapedChar__Group_0__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:789:1: ( rule__EscapedChar__Group_0__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:789:2: rule__EscapedChar__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_0__0_in_rule__EscapedChar__Alternatives1630);
                    rule__EscapedChar__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:793:6: ( ( rule__EscapedChar__Group_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:793:6: ( ( rule__EscapedChar__Group_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:794:1: ( rule__EscapedChar__Group_1__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:795:1: ( rule__EscapedChar__Group_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:795:2: rule__EscapedChar__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_1__0_in_rule__EscapedChar__Alternatives1648);
                    rule__EscapedChar__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:799:6: ( ( rule__EscapedChar__Group_2__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:799:6: ( ( rule__EscapedChar__Group_2__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:800:1: ( rule__EscapedChar__Group_2__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:801:1: ( rule__EscapedChar__Group_2__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:801:2: rule__EscapedChar__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_2__0_in_rule__EscapedChar__Alternatives1666);
                    rule__EscapedChar__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEscapedCharAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:805:6: ( ( rule__EscapedChar__Group_3__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:805:6: ( ( rule__EscapedChar__Group_3__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:806:1: ( rule__EscapedChar__Group_3__0 )
                    {
                     before(grammarAccess.getEscapedCharAccess().getGroup_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:807:1: ( rule__EscapedChar__Group_3__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:807:2: rule__EscapedChar__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EscapedChar__Group_3__0_in_rule__EscapedChar__Alternatives1684);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:816:1: rule__EscapedChar__CharAlternatives_0_1_0 : ( ( '\\\\' ) | ( 'n' ) | ( 'r' ) | ( 't' ) | ( '0' ) );
    public final void rule__EscapedChar__CharAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:820:1: ( ( '\\\\' ) | ( 'n' ) | ( 'r' ) | ( 't' ) | ( '0' ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:821:1: ( '\\\\' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:821:1: ( '\\\\' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:822:1: '\\\\'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharReverseSolidusKeyword_0_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__EscapedChar__CharAlternatives_0_1_01718); 
                     after(grammarAccess.getEscapedCharAccess().getCharReverseSolidusKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:829:6: ( 'n' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:829:6: ( 'n' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:830:1: 'n'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharNKeyword_0_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__EscapedChar__CharAlternatives_0_1_01738); 
                     after(grammarAccess.getEscapedCharAccess().getCharNKeyword_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:837:6: ( 'r' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:837:6: ( 'r' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:838:1: 'r'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharRKeyword_0_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__EscapedChar__CharAlternatives_0_1_01758); 
                     after(grammarAccess.getEscapedCharAccess().getCharRKeyword_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:845:6: ( 't' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:845:6: ( 't' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:846:1: 't'
                    {
                     before(grammarAccess.getEscapedCharAccess().getCharTKeyword_0_1_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__EscapedChar__CharAlternatives_0_1_01778); 
                     after(grammarAccess.getEscapedCharAccess().getCharTKeyword_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:853:6: ( '0' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:853:6: ( '0' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:854:1: '0'
                    {
                     before(grammarAccess.getEscapedCharAccess().getChar0Keyword_0_1_0_4()); 
                    match(input,16,FOLLOW_16_in_rule__EscapedChar__CharAlternatives_0_1_01798); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:866:1: rule__NumberLit__Alternatives : ( ( ruleFloatLit ) | ( ruleIntLit ) );
    public final void rule__NumberLit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:870:1: ( ( ruleFloatLit ) | ( ruleIntLit ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:871:1: ( ruleFloatLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:871:1: ( ruleFloatLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:872:1: ruleFloatLit
                    {
                     before(grammarAccess.getNumberLitAccess().getFloatLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFloatLit_in_rule__NumberLit__Alternatives1832);
                    ruleFloatLit();

                    state._fsp--;

                     after(grammarAccess.getNumberLitAccess().getFloatLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:877:6: ( ruleIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:877:6: ( ruleIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:878:1: ruleIntLit
                    {
                     before(grammarAccess.getNumberLitAccess().getIntLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntLit_in_rule__NumberLit__Alternatives1849);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:888:1: rule__FloatLit__Alternatives_1 : ( ( ( rule__FloatLit__DigitsAssignment_1_0 ) ) | ( '_' ) );
    public final void rule__FloatLit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:892:1: ( ( ( rule__FloatLit__DigitsAssignment_1_0 ) ) | ( '_' ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:893:1: ( ( rule__FloatLit__DigitsAssignment_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:893:1: ( ( rule__FloatLit__DigitsAssignment_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:894:1: ( rule__FloatLit__DigitsAssignment_1_0 )
                    {
                     before(grammarAccess.getFloatLitAccess().getDigitsAssignment_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:895:1: ( rule__FloatLit__DigitsAssignment_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:895:2: rule__FloatLit__DigitsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_1_0_in_rule__FloatLit__Alternatives_11881);
                    rule__FloatLit__DigitsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getDigitsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:899:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:899:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:900:1: '_'
                    {
                     before(grammarAccess.getFloatLitAccess().get_Keyword_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__FloatLit__Alternatives_11900); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:912:1: rule__FloatLit__Alternatives_2_1 : ( ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) ) | ( '_' ) );
    public final void rule__FloatLit__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:916:1: ( ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) ) | ( '_' ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:917:1: ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:917:1: ( ( rule__FloatLit__DigitsAssignment_2_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:918:1: ( rule__FloatLit__DigitsAssignment_2_1_0 )
                    {
                     before(grammarAccess.getFloatLitAccess().getDigitsAssignment_2_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:919:1: ( rule__FloatLit__DigitsAssignment_2_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:919:2: rule__FloatLit__DigitsAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_2_1_0_in_rule__FloatLit__Alternatives_2_11934);
                    rule__FloatLit__DigitsAssignment_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getDigitsAssignment_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:923:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:923:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:924:1: '_'
                    {
                     before(grammarAccess.getFloatLitAccess().get_Keyword_2_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__FloatLit__Alternatives_2_11953); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:936:1: rule__FloatLit__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__FloatLit__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:940:1: ( ( 'E' ) | ( 'e' ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:941:1: ( 'E' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:941:1: ( 'E' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:942:1: 'E'
                    {
                     before(grammarAccess.getFloatLitAccess().getEKeyword_3_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__FloatLit__Alternatives_3_01988); 
                     after(grammarAccess.getFloatLitAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:949:6: ( 'e' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:949:6: ( 'e' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:950:1: 'e'
                    {
                     before(grammarAccess.getFloatLitAccess().getEKeyword_3_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__FloatLit__Alternatives_3_02008); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:962:1: rule__FloatLit__Alternatives_3_1 : ( ( '+' ) | ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) ) );
    public final void rule__FloatLit__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:966:1: ( ( '+' ) | ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==45) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:967:1: ( '+' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:967:1: ( '+' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:968:1: '+'
                    {
                     before(grammarAccess.getFloatLitAccess().getPlusSignKeyword_3_1_0()); 
                    match(input,20,FOLLOW_20_in_rule__FloatLit__Alternatives_3_12043); 
                     after(grammarAccess.getFloatLitAccess().getPlusSignKeyword_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:975:6: ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:975:6: ( ( rule__FloatLit__NegativeExpAssignment_3_1_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:976:1: ( rule__FloatLit__NegativeExpAssignment_3_1_1 )
                    {
                     before(grammarAccess.getFloatLitAccess().getNegativeExpAssignment_3_1_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:977:1: ( rule__FloatLit__NegativeExpAssignment_3_1_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:977:2: rule__FloatLit__NegativeExpAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__FloatLit__NegativeExpAssignment_3_1_1_in_rule__FloatLit__Alternatives_3_12062);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:986:1: rule__FloatLit__Alternatives_3_2 : ( ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) ) | ( '_' ) );
    public final void rule__FloatLit__Alternatives_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:990:1: ( ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) ) | ( '_' ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:991:1: ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:991:1: ( ( rule__FloatLit__DigitsAssignment_3_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:992:1: ( rule__FloatLit__DigitsAssignment_3_2_0 )
                    {
                     before(grammarAccess.getFloatLitAccess().getDigitsAssignment_3_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:993:1: ( rule__FloatLit__DigitsAssignment_3_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:993:2: rule__FloatLit__DigitsAssignment_3_2_0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_3_2_0_in_rule__FloatLit__Alternatives_3_22095);
                    rule__FloatLit__DigitsAssignment_3_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatLitAccess().getDigitsAssignment_3_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:997:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:997:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:998:1: '_'
                    {
                     before(grammarAccess.getFloatLitAccess().get_Keyword_3_2_1()); 
                    match(input,17,FOLLOW_17_in_rule__FloatLit__Alternatives_3_22114); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1010:1: rule__IntLit__Alternatives : ( ( ruleDecIntLit ) | ( ruleBinIntLit ) | ( ruleOctIntLit ) | ( ruleHexIntLit ) );
    public final void rule__IntLit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1014:1: ( ( ruleDecIntLit ) | ( ruleBinIntLit ) | ( ruleOctIntLit ) | ( ruleHexIntLit ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1015:1: ( ruleDecIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1015:1: ( ruleDecIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1016:1: ruleDecIntLit
                    {
                     before(grammarAccess.getIntLitAccess().getDecIntLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDecIntLit_in_rule__IntLit__Alternatives2148);
                    ruleDecIntLit();

                    state._fsp--;

                     after(grammarAccess.getIntLitAccess().getDecIntLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1021:6: ( ruleBinIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1021:6: ( ruleBinIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1022:1: ruleBinIntLit
                    {
                     before(grammarAccess.getIntLitAccess().getBinIntLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBinIntLit_in_rule__IntLit__Alternatives2165);
                    ruleBinIntLit();

                    state._fsp--;

                     after(grammarAccess.getIntLitAccess().getBinIntLitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1027:6: ( ruleOctIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1027:6: ( ruleOctIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1028:1: ruleOctIntLit
                    {
                     before(grammarAccess.getIntLitAccess().getOctIntLitParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleOctIntLit_in_rule__IntLit__Alternatives2182);
                    ruleOctIntLit();

                    state._fsp--;

                     after(grammarAccess.getIntLitAccess().getOctIntLitParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1033:6: ( ruleHexIntLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1033:6: ( ruleHexIntLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1034:1: ruleHexIntLit
                    {
                     before(grammarAccess.getIntLitAccess().getHexIntLitParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHexIntLit_in_rule__IntLit__Alternatives2199);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1044:1: rule__DecIntLit__Alternatives_1 : ( ( ( rule__DecIntLit__DigitsAssignment_1_0 ) ) | ( '_' ) );
    public final void rule__DecIntLit__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1048:1: ( ( ( rule__DecIntLit__DigitsAssignment_1_0 ) ) | ( '_' ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1049:1: ( ( rule__DecIntLit__DigitsAssignment_1_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1049:1: ( ( rule__DecIntLit__DigitsAssignment_1_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1050:1: ( rule__DecIntLit__DigitsAssignment_1_0 )
                    {
                     before(grammarAccess.getDecIntLitAccess().getDigitsAssignment_1_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1051:1: ( rule__DecIntLit__DigitsAssignment_1_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1051:2: rule__DecIntLit__DigitsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__DecIntLit__DigitsAssignment_1_0_in_rule__DecIntLit__Alternatives_12231);
                    rule__DecIntLit__DigitsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDecIntLitAccess().getDigitsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1055:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1055:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1056:1: '_'
                    {
                     before(grammarAccess.getDecIntLitAccess().get_Keyword_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__DecIntLit__Alternatives_12250); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1068:1: rule__DecIntLit__Alternatives_2_0 : ( ( 'i' ) | ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) ) );
    public final void rule__DecIntLit__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1072:1: ( ( 'i' ) | ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1073:1: ( 'i' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1073:1: ( 'i' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1074:1: 'i'
                    {
                     before(grammarAccess.getDecIntLitAccess().getIKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__DecIntLit__Alternatives_2_02285); 
                     after(grammarAccess.getDecIntLitAccess().getIKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1081:6: ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1081:6: ( ( rule__DecIntLit__UnsignedAssignment_2_0_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1082:1: ( rule__DecIntLit__UnsignedAssignment_2_0_1 )
                    {
                     before(grammarAccess.getDecIntLitAccess().getUnsignedAssignment_2_0_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1083:1: ( rule__DecIntLit__UnsignedAssignment_2_0_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1083:2: rule__DecIntLit__UnsignedAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__DecIntLit__UnsignedAssignment_2_0_1_in_rule__DecIntLit__Alternatives_2_02304);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1092:1: rule__BinIntLit__Alternatives_2 : ( ( ( rule__BinIntLit__DigitsAssignment_2_0 ) ) | ( ( rule__BinIntLit__DigitsAssignment_2_1 ) ) | ( '_' ) );
    public final void rule__BinIntLit__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1096:1: ( ( ( rule__BinIntLit__DigitsAssignment_2_0 ) ) | ( ( rule__BinIntLit__DigitsAssignment_2_1 ) ) | ( '_' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt18=1;
                }
                break;
            case 46:
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1097:1: ( ( rule__BinIntLit__DigitsAssignment_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1097:1: ( ( rule__BinIntLit__DigitsAssignment_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1098:1: ( rule__BinIntLit__DigitsAssignment_2_0 )
                    {
                     before(grammarAccess.getBinIntLitAccess().getDigitsAssignment_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1099:1: ( rule__BinIntLit__DigitsAssignment_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1099:2: rule__BinIntLit__DigitsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BinIntLit__DigitsAssignment_2_0_in_rule__BinIntLit__Alternatives_22337);
                    rule__BinIntLit__DigitsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinIntLitAccess().getDigitsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1103:6: ( ( rule__BinIntLit__DigitsAssignment_2_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1103:6: ( ( rule__BinIntLit__DigitsAssignment_2_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1104:1: ( rule__BinIntLit__DigitsAssignment_2_1 )
                    {
                     before(grammarAccess.getBinIntLitAccess().getDigitsAssignment_2_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1105:1: ( rule__BinIntLit__DigitsAssignment_2_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1105:2: rule__BinIntLit__DigitsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__BinIntLit__DigitsAssignment_2_1_in_rule__BinIntLit__Alternatives_22355);
                    rule__BinIntLit__DigitsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinIntLitAccess().getDigitsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1109:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1109:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1110:1: '_'
                    {
                     before(grammarAccess.getBinIntLitAccess().get_Keyword_2_2()); 
                    match(input,17,FOLLOW_17_in_rule__BinIntLit__Alternatives_22374); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1122:1: rule__BinIntLit__Alternatives_3_0 : ( ( 'i' ) | ( ( rule__BinIntLit__UnsignedAssignment_3_0_1 ) ) );
    public final void rule__BinIntLit__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1126:1: ( ( 'i' ) | ( ( rule__BinIntLit__UnsignedAssignment_3_0_1 ) ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1127:1: ( 'i' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1127:1: ( 'i' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1128:1: 'i'
                    {
                     before(grammarAccess.getBinIntLitAccess().getIKeyword_3_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__BinIntLit__Alternatives_3_02409); 
                     after(grammarAccess.getBinIntLitAccess().getIKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1135:6: ( ( rule__BinIntLit__UnsignedAssignment_3_0_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1135:6: ( ( rule__BinIntLit__UnsignedAssignment_3_0_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1136:1: ( rule__BinIntLit__UnsignedAssignment_3_0_1 )
                    {
                     before(grammarAccess.getBinIntLitAccess().getUnsignedAssignment_3_0_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1137:1: ( rule__BinIntLit__UnsignedAssignment_3_0_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1137:2: rule__BinIntLit__UnsignedAssignment_3_0_1
                    {
                    pushFollow(FOLLOW_rule__BinIntLit__UnsignedAssignment_3_0_1_in_rule__BinIntLit__Alternatives_3_02428);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1146:1: rule__OctIntLit__Alternatives_2 : ( ( ( rule__OctIntLit__DigitsAssignment_2_0 ) ) | ( '_' ) );
    public final void rule__OctIntLit__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1150:1: ( ( ( rule__OctIntLit__DigitsAssignment_2_0 ) ) | ( '_' ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1151:1: ( ( rule__OctIntLit__DigitsAssignment_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1151:1: ( ( rule__OctIntLit__DigitsAssignment_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1152:1: ( rule__OctIntLit__DigitsAssignment_2_0 )
                    {
                     before(grammarAccess.getOctIntLitAccess().getDigitsAssignment_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1153:1: ( rule__OctIntLit__DigitsAssignment_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1153:2: rule__OctIntLit__DigitsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__OctIntLit__DigitsAssignment_2_0_in_rule__OctIntLit__Alternatives_22461);
                    rule__OctIntLit__DigitsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOctIntLitAccess().getDigitsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1157:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1157:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1158:1: '_'
                    {
                     before(grammarAccess.getOctIntLitAccess().get_Keyword_2_1()); 
                    match(input,17,FOLLOW_17_in_rule__OctIntLit__Alternatives_22480); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1170:1: rule__OctIntLit__Alternatives_3_0 : ( ( 'i' ) | ( ( rule__OctIntLit__UnsignedAssignment_3_0_1 ) ) );
    public final void rule__OctIntLit__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1174:1: ( ( 'i' ) | ( ( rule__OctIntLit__UnsignedAssignment_3_0_1 ) ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1175:1: ( 'i' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1175:1: ( 'i' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1176:1: 'i'
                    {
                     before(grammarAccess.getOctIntLitAccess().getIKeyword_3_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__OctIntLit__Alternatives_3_02515); 
                     after(grammarAccess.getOctIntLitAccess().getIKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1183:6: ( ( rule__OctIntLit__UnsignedAssignment_3_0_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1183:6: ( ( rule__OctIntLit__UnsignedAssignment_3_0_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1184:1: ( rule__OctIntLit__UnsignedAssignment_3_0_1 )
                    {
                     before(grammarAccess.getOctIntLitAccess().getUnsignedAssignment_3_0_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1185:1: ( rule__OctIntLit__UnsignedAssignment_3_0_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1185:2: rule__OctIntLit__UnsignedAssignment_3_0_1
                    {
                    pushFollow(FOLLOW_rule__OctIntLit__UnsignedAssignment_3_0_1_in_rule__OctIntLit__Alternatives_3_02534);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1194:1: rule__HexIntLit__Alternatives_2 : ( ( ( rule__HexIntLit__DigitsAssignment_2_0 ) ) | ( '_' ) );
    public final void rule__HexIntLit__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1198:1: ( ( ( rule__HexIntLit__DigitsAssignment_2_0 ) ) | ( '_' ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1199:1: ( ( rule__HexIntLit__DigitsAssignment_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1199:1: ( ( rule__HexIntLit__DigitsAssignment_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1200:1: ( rule__HexIntLit__DigitsAssignment_2_0 )
                    {
                     before(grammarAccess.getHexIntLitAccess().getDigitsAssignment_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1201:1: ( rule__HexIntLit__DigitsAssignment_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1201:2: rule__HexIntLit__DigitsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__HexIntLit__DigitsAssignment_2_0_in_rule__HexIntLit__Alternatives_22567);
                    rule__HexIntLit__DigitsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHexIntLitAccess().getDigitsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1205:6: ( '_' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1205:6: ( '_' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1206:1: '_'
                    {
                     before(grammarAccess.getHexIntLitAccess().get_Keyword_2_1()); 
                    match(input,17,FOLLOW_17_in_rule__HexIntLit__Alternatives_22586); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1218:1: rule__HexIntLit__Alternatives_3_0 : ( ( 'i' ) | ( ( rule__HexIntLit__UnsignedAssignment_3_0_1 ) ) );
    public final void rule__HexIntLit__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1222:1: ( ( 'i' ) | ( ( rule__HexIntLit__UnsignedAssignment_3_0_1 ) ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1223:1: ( 'i' )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1223:1: ( 'i' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1224:1: 'i'
                    {
                     before(grammarAccess.getHexIntLitAccess().getIKeyword_3_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__HexIntLit__Alternatives_3_02621); 
                     after(grammarAccess.getHexIntLitAccess().getIKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1231:6: ( ( rule__HexIntLit__UnsignedAssignment_3_0_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1231:6: ( ( rule__HexIntLit__UnsignedAssignment_3_0_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1232:1: ( rule__HexIntLit__UnsignedAssignment_3_0_1 )
                    {
                     before(grammarAccess.getHexIntLitAccess().getUnsignedAssignment_3_0_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1233:1: ( rule__HexIntLit__UnsignedAssignment_3_0_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1233:2: rule__HexIntLit__UnsignedAssignment_3_0_1
                    {
                    pushFollow(FOLLOW_rule__HexIntLit__UnsignedAssignment_3_0_1_in_rule__HexIntLit__Alternatives_3_02640);
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


    // $ANTLR start "rule__StringChar__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1242:1: rule__StringChar__Alternatives : ( ( ( rule__StringChar__CharAssignment_0 ) ) | ( ( rule__StringChar__CharAssignment_1 ) ) | ( ( rule__StringChar__Group_2__0 ) ) | ( ( rule__StringChar__Group_3__0 ) ) );
    public final void rule__StringChar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1246:1: ( ( ( rule__StringChar__CharAssignment_0 ) ) | ( ( rule__StringChar__CharAssignment_1 ) ) | ( ( rule__StringChar__Group_2__0 ) ) | ( ( rule__StringChar__Group_3__0 ) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_NON_SPECIAL_CHAR:
                {
                alt24=1;
                }
                break;
            case 35:
                {
                alt24=2;
                }
                break;
            case 12:
                {
                int LA24_3 = input.LA(2);

                if ( ((LA24_3>=12 && LA24_3<=16)||(LA24_3>=36 && LA24_3<=38)) ) {
                    alt24=4;
                }
                else if ( (LA24_3==44) ) {
                    alt24=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1247:1: ( ( rule__StringChar__CharAssignment_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1247:1: ( ( rule__StringChar__CharAssignment_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1248:1: ( rule__StringChar__CharAssignment_0 )
                    {
                     before(grammarAccess.getStringCharAccess().getCharAssignment_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1249:1: ( rule__StringChar__CharAssignment_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1249:2: rule__StringChar__CharAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StringChar__CharAssignment_0_in_rule__StringChar__Alternatives2673);
                    rule__StringChar__CharAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringCharAccess().getCharAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1253:6: ( ( rule__StringChar__CharAssignment_1 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1253:6: ( ( rule__StringChar__CharAssignment_1 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1254:1: ( rule__StringChar__CharAssignment_1 )
                    {
                     before(grammarAccess.getStringCharAccess().getCharAssignment_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1255:1: ( rule__StringChar__CharAssignment_1 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1255:2: rule__StringChar__CharAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StringChar__CharAssignment_1_in_rule__StringChar__Alternatives2691);
                    rule__StringChar__CharAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringCharAccess().getCharAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1259:6: ( ( rule__StringChar__Group_2__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1259:6: ( ( rule__StringChar__Group_2__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1260:1: ( rule__StringChar__Group_2__0 )
                    {
                     before(grammarAccess.getStringCharAccess().getGroup_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1261:1: ( rule__StringChar__Group_2__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1261:2: rule__StringChar__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringChar__Group_2__0_in_rule__StringChar__Alternatives2709);
                    rule__StringChar__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringCharAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1265:6: ( ( rule__StringChar__Group_3__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1265:6: ( ( rule__StringChar__Group_3__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1266:1: ( rule__StringChar__Group_3__0 )
                    {
                     before(grammarAccess.getStringCharAccess().getGroup_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1267:1: ( rule__StringChar__Group_3__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1267:2: rule__StringChar__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StringChar__Group_3__0_in_rule__StringChar__Alternatives2727);
                    rule__StringChar__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringCharAccess().getGroup_3()); 

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
    // $ANTLR end "rule__StringChar__Alternatives"


    // $ANTLR start "rule__FloatSize__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1276:1: rule__FloatSize__Alternatives : ( ( ( '32' ) ) | ( ( '64' ) ) );
    public final void rule__FloatSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1280:1: ( ( ( '32' ) ) | ( ( '64' ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            else if ( (LA25_0==23) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1281:1: ( ( '32' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1281:1: ( ( '32' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1282:1: ( '32' )
                    {
                     before(grammarAccess.getFloatSizeAccess().getFLOATEnumLiteralDeclaration_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1283:1: ( '32' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1283:3: '32'
                    {
                    match(input,22,FOLLOW_22_in_rule__FloatSize__Alternatives2761); 

                    }

                     after(grammarAccess.getFloatSizeAccess().getFLOATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1288:6: ( ( '64' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1288:6: ( ( '64' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1289:1: ( '64' )
                    {
                     before(grammarAccess.getFloatSizeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1290:1: ( '64' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1290:3: '64'
                    {
                    match(input,23,FOLLOW_23_in_rule__FloatSize__Alternatives2782); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1300:1: rule__IntSize__Alternatives : ( ( ( '8' ) ) | ( ( '16' ) ) | ( ( '32' ) ) | ( ( '64' ) ) );
    public final void rule__IntSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1304:1: ( ( ( '8' ) ) | ( ( '16' ) ) | ( ( '32' ) ) | ( ( '64' ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt26=1;
                }
                break;
            case 25:
                {
                alt26=2;
                }
                break;
            case 22:
                {
                alt26=3;
                }
                break;
            case 23:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1305:1: ( ( '8' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1305:1: ( ( '8' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1306:1: ( '8' )
                    {
                     before(grammarAccess.getIntSizeAccess().getBYTEEnumLiteralDeclaration_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1307:1: ( '8' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1307:3: '8'
                    {
                    match(input,24,FOLLOW_24_in_rule__IntSize__Alternatives2818); 

                    }

                     after(grammarAccess.getIntSizeAccess().getBYTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1312:6: ( ( '16' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1312:6: ( ( '16' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1313:1: ( '16' )
                    {
                     before(grammarAccess.getIntSizeAccess().getSHORTEnumLiteralDeclaration_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1314:1: ( '16' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1314:3: '16'
                    {
                    match(input,25,FOLLOW_25_in_rule__IntSize__Alternatives2839); 

                    }

                     after(grammarAccess.getIntSizeAccess().getSHORTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1319:6: ( ( '32' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1319:6: ( ( '32' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1320:1: ( '32' )
                    {
                     before(grammarAccess.getIntSizeAccess().getINTEnumLiteralDeclaration_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1321:1: ( '32' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1321:3: '32'
                    {
                    match(input,22,FOLLOW_22_in_rule__IntSize__Alternatives2860); 

                    }

                     after(grammarAccess.getIntSizeAccess().getINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1326:6: ( ( '64' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1326:6: ( ( '64' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1327:1: ( '64' )
                    {
                     before(grammarAccess.getIntSizeAccess().getLONGEnumLiteralDeclaration_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1328:1: ( '64' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1328:3: '64'
                    {
                    match(input,23,FOLLOW_23_in_rule__IntSize__Alternatives2881); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1340:1: rule__ItemAttr__Group__0 : rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 ;
    public final void rule__ItemAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1344:1: ( rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1345:2: rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02914);
            rule__ItemAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02917);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1352:1: rule__ItemAttr__Group__0__Impl : ( '#[' ) ;
    public final void rule__ItemAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1356:1: ( ( '#[' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1357:1: ( '#[' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1357:1: ( '#[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1358:1: '#['
            {
             before(grammarAccess.getItemAttrAccess().getNumberSignLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ItemAttr__Group__0__Impl2945); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1371:1: rule__ItemAttr__Group__1 : rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 ;
    public final void rule__ItemAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1375:1: ( rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1376:2: rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12976);
            rule__ItemAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12979);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1383:1: rule__ItemAttr__Group__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_1 ) ) ;
    public final void rule__ItemAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1387:1: ( ( ( rule__ItemAttr__AttrsAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1388:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1388:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1389:1: ( rule__ItemAttr__AttrsAssignment_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1390:1: ( rule__ItemAttr__AttrsAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1390:2: rule__ItemAttr__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl3006);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1400:1: rule__ItemAttr__Group__2 : rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 ;
    public final void rule__ItemAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1404:1: ( rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1405:2: rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__23036);
            rule__ItemAttr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__23039);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1412:1: rule__ItemAttr__Group__2__Impl : ( ( rule__ItemAttr__Group_2__0 )* ) ;
    public final void rule__ItemAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1416:1: ( ( ( rule__ItemAttr__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1417:1: ( ( rule__ItemAttr__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1417:1: ( ( rule__ItemAttr__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1418:1: ( rule__ItemAttr__Group_2__0 )*
            {
             before(grammarAccess.getItemAttrAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1419:1: ( rule__ItemAttr__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1419:2: rule__ItemAttr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl3066);
            	    rule__ItemAttr__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1429:1: rule__ItemAttr__Group__3 : rule__ItemAttr__Group__3__Impl ;
    public final void rule__ItemAttr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1433:1: ( rule__ItemAttr__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1434:2: rule__ItemAttr__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__33097);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1440:1: rule__ItemAttr__Group__3__Impl : ( ']' ) ;
    public final void rule__ItemAttr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1444:1: ( ( ']' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1445:1: ( ']' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1445:1: ( ']' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1446:1: ']'
            {
             before(grammarAccess.getItemAttrAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__ItemAttr__Group__3__Impl3125); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1467:1: rule__ItemAttr__Group_2__0 : rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 ;
    public final void rule__ItemAttr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1471:1: ( rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1472:2: rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__03164);
            rule__ItemAttr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__03167);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1479:1: rule__ItemAttr__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ItemAttr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1483:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1484:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1484:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1485:1: ','
            {
             before(grammarAccess.getItemAttrAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__ItemAttr__Group_2__0__Impl3195); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1498:1: rule__ItemAttr__Group_2__1 : rule__ItemAttr__Group_2__1__Impl ;
    public final void rule__ItemAttr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1502:1: ( rule__ItemAttr__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1503:2: rule__ItemAttr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__13226);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1509:1: rule__ItemAttr__Group_2__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) ;
    public final void rule__ItemAttr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1513:1: ( ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1514:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1514:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1515:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1516:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1516:2: rule__ItemAttr__AttrsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl3253);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1530:1: rule__AttrWithList__Group__0 : rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 ;
    public final void rule__AttrWithList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1534:1: ( rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1535:2: rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__03287);
            rule__AttrWithList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__03290);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1542:1: rule__AttrWithList__Group__0__Impl : ( ( rule__AttrWithList__IdentAssignment_0 ) ) ;
    public final void rule__AttrWithList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1546:1: ( ( ( rule__AttrWithList__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1547:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1547:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1548:1: ( rule__AttrWithList__IdentAssignment_0 )
            {
             before(grammarAccess.getAttrWithListAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1549:1: ( rule__AttrWithList__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1549:2: rule__AttrWithList__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl3317);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1559:1: rule__AttrWithList__Group__1 : rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 ;
    public final void rule__AttrWithList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1563:1: ( rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1564:2: rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__13347);
            rule__AttrWithList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__13350);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1571:1: rule__AttrWithList__Group__1__Impl : ( '(' ) ;
    public final void rule__AttrWithList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1575:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1576:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1576:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1577:1: '('
            {
             before(grammarAccess.getAttrWithListAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__AttrWithList__Group__1__Impl3378); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1590:1: rule__AttrWithList__Group__2 : rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 ;
    public final void rule__AttrWithList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1594:1: ( rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1595:2: rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__23409);
            rule__AttrWithList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__23412);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1602:1: rule__AttrWithList__Group__2__Impl : ( ( rule__AttrWithList__AttrsAssignment_2 ) ) ;
    public final void rule__AttrWithList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1606:1: ( ( ( rule__AttrWithList__AttrsAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1607:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1607:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1608:1: ( rule__AttrWithList__AttrsAssignment_2 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1609:1: ( rule__AttrWithList__AttrsAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1609:2: rule__AttrWithList__AttrsAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl3439);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1619:1: rule__AttrWithList__Group__3 : rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 ;
    public final void rule__AttrWithList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1623:1: ( rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1624:2: rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__33469);
            rule__AttrWithList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__33472);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1631:1: rule__AttrWithList__Group__3__Impl : ( ( rule__AttrWithList__Group_3__0 )* ) ;
    public final void rule__AttrWithList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1635:1: ( ( ( rule__AttrWithList__Group_3__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1636:1: ( ( rule__AttrWithList__Group_3__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1636:1: ( ( rule__AttrWithList__Group_3__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1637:1: ( rule__AttrWithList__Group_3__0 )*
            {
             before(grammarAccess.getAttrWithListAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1638:1: ( rule__AttrWithList__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1638:2: rule__AttrWithList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl3499);
            	    rule__AttrWithList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1648:1: rule__AttrWithList__Group__4 : rule__AttrWithList__Group__4__Impl ;
    public final void rule__AttrWithList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1652:1: ( rule__AttrWithList__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1653:2: rule__AttrWithList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__43530);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1659:1: rule__AttrWithList__Group__4__Impl : ( ')' ) ;
    public final void rule__AttrWithList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1663:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1664:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1664:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1665:1: ')'
            {
             before(grammarAccess.getAttrWithListAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__AttrWithList__Group__4__Impl3558); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1688:1: rule__AttrWithList__Group_3__0 : rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 ;
    public final void rule__AttrWithList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1692:1: ( rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1693:2: rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__03599);
            rule__AttrWithList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__03602);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1700:1: rule__AttrWithList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AttrWithList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1704:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1705:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1705:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1706:1: ','
            {
             before(grammarAccess.getAttrWithListAccess().getCommaKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__AttrWithList__Group_3__0__Impl3630); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1719:1: rule__AttrWithList__Group_3__1 : rule__AttrWithList__Group_3__1__Impl ;
    public final void rule__AttrWithList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1723:1: ( rule__AttrWithList__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1724:2: rule__AttrWithList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__13661);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1730:1: rule__AttrWithList__Group_3__1__Impl : ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) ;
    public final void rule__AttrWithList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1734:1: ( ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1735:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1735:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1736:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1737:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1737:2: rule__AttrWithList__AttrsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl3688);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1751:1: rule__LiteralAttr__Group__0 : rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 ;
    public final void rule__LiteralAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1755:1: ( rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1756:2: rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__03722);
            rule__LiteralAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__03725);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1763:1: rule__LiteralAttr__Group__0__Impl : ( ( rule__LiteralAttr__IdentAssignment_0 ) ) ;
    public final void rule__LiteralAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1767:1: ( ( ( rule__LiteralAttr__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1768:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1768:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1769:1: ( rule__LiteralAttr__IdentAssignment_0 )
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1770:1: ( rule__LiteralAttr__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1770:2: rule__LiteralAttr__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl3752);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1780:1: rule__LiteralAttr__Group__1 : rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 ;
    public final void rule__LiteralAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1784:1: ( rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1785:2: rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__13782);
            rule__LiteralAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__13785);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1792:1: rule__LiteralAttr__Group__1__Impl : ( '=' ) ;
    public final void rule__LiteralAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1796:1: ( ( '=' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1797:1: ( '=' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1797:1: ( '=' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1798:1: '='
            {
             before(grammarAccess.getLiteralAttrAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__LiteralAttr__Group__1__Impl3813); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1811:1: rule__LiteralAttr__Group__2 : rule__LiteralAttr__Group__2__Impl ;
    public final void rule__LiteralAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1815:1: ( rule__LiteralAttr__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1816:2: rule__LiteralAttr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23844);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1822:1: rule__LiteralAttr__Group__2__Impl : ( ( rule__LiteralAttr__ValueAssignment_2 ) ) ;
    public final void rule__LiteralAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1826:1: ( ( ( rule__LiteralAttr__ValueAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1827:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1827:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1828:1: ( rule__LiteralAttr__ValueAssignment_2 )
            {
             before(grammarAccess.getLiteralAttrAccess().getValueAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1829:1: ( rule__LiteralAttr__ValueAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1829:2: rule__LiteralAttr__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3871);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1845:1: rule__ItemAndAttrs__Group__0 : rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 ;
    public final void rule__ItemAndAttrs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1849:1: ( rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1850:2: rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03907);
            rule__ItemAndAttrs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03910);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1857:1: rule__ItemAndAttrs__Group__0__Impl : ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) ;
    public final void rule__ItemAndAttrs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1861:1: ( ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1862:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1862:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1863:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1864:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==26) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1864:2: rule__ItemAndAttrs__AttrsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3937);
            	    rule__ItemAndAttrs__AttrsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1874:1: rule__ItemAndAttrs__Group__1 : rule__ItemAndAttrs__Group__1__Impl ;
    public final void rule__ItemAndAttrs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1878:1: ( rule__ItemAndAttrs__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1879:2: rule__ItemAndAttrs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13968);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1885:1: rule__ItemAndAttrs__Group__1__Impl : ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) ;
    public final void rule__ItemAndAttrs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1889:1: ( ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1890:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1890:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1891:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1892:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1892:2: rule__ItemAndAttrs__ItemAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3995);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1906:1: rule__ModItem__Group__0 : rule__ModItem__Group__0__Impl rule__ModItem__Group__1 ;
    public final void rule__ModItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1910:1: ( rule__ModItem__Group__0__Impl rule__ModItem__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1911:2: rule__ModItem__Group__0__Impl rule__ModItem__Group__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__04029);
            rule__ModItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__04032);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1918:1: rule__ModItem__Group__0__Impl : ( 'mod' ) ;
    public final void rule__ModItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1922:1: ( ( 'mod' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1923:1: ( 'mod' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1923:1: ( 'mod' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1924:1: 'mod'
            {
             before(grammarAccess.getModItemAccess().getModKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ModItem__Group__0__Impl4060); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1937:1: rule__ModItem__Group__1 : rule__ModItem__Group__1__Impl rule__ModItem__Group__2 ;
    public final void rule__ModItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1941:1: ( rule__ModItem__Group__1__Impl rule__ModItem__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1942:2: rule__ModItem__Group__1__Impl rule__ModItem__Group__2
            {
            pushFollow(FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__14091);
            rule__ModItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__14094);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1949:1: rule__ModItem__Group__1__Impl : ( ( rule__ModItem__IdentAssignment_1 ) ) ;
    public final void rule__ModItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1953:1: ( ( ( rule__ModItem__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1954:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1954:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1955:1: ( rule__ModItem__IdentAssignment_1 )
            {
             before(grammarAccess.getModItemAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1956:1: ( rule__ModItem__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1956:2: rule__ModItem__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl4121);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1966:1: rule__ModItem__Group__2 : rule__ModItem__Group__2__Impl ;
    public final void rule__ModItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1970:1: ( rule__ModItem__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1971:2: rule__ModItem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__24151);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1977:1: rule__ModItem__Group__2__Impl : ( ( rule__ModItem__Alternatives_2 ) ) ;
    public final void rule__ModItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1981:1: ( ( ( rule__ModItem__Alternatives_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1982:1: ( ( rule__ModItem__Alternatives_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1982:1: ( ( rule__ModItem__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1983:1: ( rule__ModItem__Alternatives_2 )
            {
             before(grammarAccess.getModItemAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1984:1: ( rule__ModItem__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1984:2: rule__ModItem__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl4178);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2000:1: rule__ModItem__Group_2_1__0 : rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 ;
    public final void rule__ModItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2004:1: ( rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2005:2: rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__04214);
            rule__ModItem__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__04217);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2012:1: rule__ModItem__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__ModItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2016:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2017:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2017:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2018:1: '{'
            {
             before(grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,33,FOLLOW_33_in_rule__ModItem__Group_2_1__0__Impl4245); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2031:1: rule__ModItem__Group_2_1__1 : rule__ModItem__Group_2_1__1__Impl ;
    public final void rule__ModItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2035:1: ( rule__ModItem__Group_2_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2036:2: rule__ModItem__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__14276);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2042:1: rule__ModItem__Group_2_1__1__Impl : ( '}' ) ;
    public final void rule__ModItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2046:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2047:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2047:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2048:1: '}'
            {
             before(grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_1()); 
            match(input,34,FOLLOW_34_in_rule__ModItem__Group_2_1__1__Impl4304); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2065:1: rule__CharLit__Group__0 : rule__CharLit__Group__0__Impl rule__CharLit__Group__1 ;
    public final void rule__CharLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2069:1: ( rule__CharLit__Group__0__Impl rule__CharLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2070:2: rule__CharLit__Group__0__Impl rule__CharLit__Group__1
            {
            pushFollow(FOLLOW_rule__CharLit__Group__0__Impl_in_rule__CharLit__Group__04339);
            rule__CharLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharLit__Group__1_in_rule__CharLit__Group__04342);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2077:1: rule__CharLit__Group__0__Impl : ( '\\'' ) ;
    public final void rule__CharLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2081:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2082:1: ( '\\'' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2082:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2083:1: '\\''
            {
             before(grammarAccess.getCharLitAccess().getApostropheKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__CharLit__Group__0__Impl4370); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2096:1: rule__CharLit__Group__1 : rule__CharLit__Group__1__Impl rule__CharLit__Group__2 ;
    public final void rule__CharLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2100:1: ( rule__CharLit__Group__1__Impl rule__CharLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2101:2: rule__CharLit__Group__1__Impl rule__CharLit__Group__2
            {
            pushFollow(FOLLOW_rule__CharLit__Group__1__Impl_in_rule__CharLit__Group__14401);
            rule__CharLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharLit__Group__2_in_rule__CharLit__Group__14404);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2108:1: rule__CharLit__Group__1__Impl : ( ( rule__CharLit__Alternatives_1 ) ) ;
    public final void rule__CharLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2112:1: ( ( ( rule__CharLit__Alternatives_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2113:1: ( ( rule__CharLit__Alternatives_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2113:1: ( ( rule__CharLit__Alternatives_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2114:1: ( rule__CharLit__Alternatives_1 )
            {
             before(grammarAccess.getCharLitAccess().getAlternatives_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2115:1: ( rule__CharLit__Alternatives_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2115:2: rule__CharLit__Alternatives_1
            {
            pushFollow(FOLLOW_rule__CharLit__Alternatives_1_in_rule__CharLit__Group__1__Impl4431);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2125:1: rule__CharLit__Group__2 : rule__CharLit__Group__2__Impl ;
    public final void rule__CharLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2129:1: ( rule__CharLit__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2130:2: rule__CharLit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CharLit__Group__2__Impl_in_rule__CharLit__Group__24461);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2136:1: rule__CharLit__Group__2__Impl : ( '\\'' ) ;
    public final void rule__CharLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2140:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2141:1: ( '\\'' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2141:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2142:1: '\\''
            {
             before(grammarAccess.getCharLitAccess().getApostropheKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__CharLit__Group__2__Impl4489); 
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


    // $ANTLR start "rule__CharLit__Group_1_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2161:1: rule__CharLit__Group_1_2__0 : rule__CharLit__Group_1_2__0__Impl rule__CharLit__Group_1_2__1 ;
    public final void rule__CharLit__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2165:1: ( rule__CharLit__Group_1_2__0__Impl rule__CharLit__Group_1_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2166:2: rule__CharLit__Group_1_2__0__Impl rule__CharLit__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__CharLit__Group_1_2__0__Impl_in_rule__CharLit__Group_1_2__04526);
            rule__CharLit__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharLit__Group_1_2__1_in_rule__CharLit__Group_1_2__04529);
            rule__CharLit__Group_1_2__1();

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
    // $ANTLR end "rule__CharLit__Group_1_2__0"


    // $ANTLR start "rule__CharLit__Group_1_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2173:1: rule__CharLit__Group_1_2__0__Impl : ( '\\\\' ) ;
    public final void rule__CharLit__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2177:1: ( ( '\\\\' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2178:1: ( '\\\\' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2178:1: ( '\\\\' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2179:1: '\\\\'
            {
             before(grammarAccess.getCharLitAccess().getReverseSolidusKeyword_1_2_0()); 
            match(input,12,FOLLOW_12_in_rule__CharLit__Group_1_2__0__Impl4557); 
             after(grammarAccess.getCharLitAccess().getReverseSolidusKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group_1_2__0__Impl"


    // $ANTLR start "rule__CharLit__Group_1_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2192:1: rule__CharLit__Group_1_2__1 : rule__CharLit__Group_1_2__1__Impl ;
    public final void rule__CharLit__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2196:1: ( rule__CharLit__Group_1_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2197:2: rule__CharLit__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CharLit__Group_1_2__1__Impl_in_rule__CharLit__Group_1_2__14588);
            rule__CharLit__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__CharLit__Group_1_2__1"


    // $ANTLR start "rule__CharLit__Group_1_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2203:1: rule__CharLit__Group_1_2__1__Impl : ( ( rule__CharLit__Alternatives_1_2_1 ) ) ;
    public final void rule__CharLit__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2207:1: ( ( ( rule__CharLit__Alternatives_1_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2208:1: ( ( rule__CharLit__Alternatives_1_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2208:1: ( ( rule__CharLit__Alternatives_1_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2209:1: ( rule__CharLit__Alternatives_1_2_1 )
            {
             before(grammarAccess.getCharLitAccess().getAlternatives_1_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2210:1: ( rule__CharLit__Alternatives_1_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2210:2: rule__CharLit__Alternatives_1_2_1
            {
            pushFollow(FOLLOW_rule__CharLit__Alternatives_1_2_1_in_rule__CharLit__Group_1_2__1__Impl4615);
            rule__CharLit__Alternatives_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCharLitAccess().getAlternatives_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__Group_1_2__1__Impl"


    // $ANTLR start "rule__EscapedChar__Group_0__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2224:1: rule__EscapedChar__Group_0__0 : rule__EscapedChar__Group_0__0__Impl rule__EscapedChar__Group_0__1 ;
    public final void rule__EscapedChar__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2228:1: ( rule__EscapedChar__Group_0__0__Impl rule__EscapedChar__Group_0__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2229:2: rule__EscapedChar__Group_0__0__Impl rule__EscapedChar__Group_0__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_0__0__Impl_in_rule__EscapedChar__Group_0__04649);
            rule__EscapedChar__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_0__1_in_rule__EscapedChar__Group_0__04652);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2236:1: rule__EscapedChar__Group_0__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2240:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2241:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2241:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2242:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getEscapedCharAction_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2243:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2245:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2255:1: rule__EscapedChar__Group_0__1 : rule__EscapedChar__Group_0__1__Impl ;
    public final void rule__EscapedChar__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2259:1: ( rule__EscapedChar__Group_0__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2260:2: rule__EscapedChar__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_0__1__Impl_in_rule__EscapedChar__Group_0__14710);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2266:1: rule__EscapedChar__Group_0__1__Impl : ( ( rule__EscapedChar__CharAssignment_0_1 ) ) ;
    public final void rule__EscapedChar__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2270:1: ( ( ( rule__EscapedChar__CharAssignment_0_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2271:1: ( ( rule__EscapedChar__CharAssignment_0_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2271:1: ( ( rule__EscapedChar__CharAssignment_0_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2272:1: ( rule__EscapedChar__CharAssignment_0_1 )
            {
             before(grammarAccess.getEscapedCharAccess().getCharAssignment_0_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2273:1: ( rule__EscapedChar__CharAssignment_0_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2273:2: rule__EscapedChar__CharAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EscapedChar__CharAssignment_0_1_in_rule__EscapedChar__Group_0__1__Impl4737);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2287:1: rule__EscapedChar__Group_1__0 : rule__EscapedChar__Group_1__0__Impl rule__EscapedChar__Group_1__1 ;
    public final void rule__EscapedChar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2291:1: ( rule__EscapedChar__Group_1__0__Impl rule__EscapedChar__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2292:2: rule__EscapedChar__Group_1__0__Impl rule__EscapedChar__Group_1__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__0__Impl_in_rule__EscapedChar__Group_1__04771);
            rule__EscapedChar__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_1__1_in_rule__EscapedChar__Group_1__04774);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2299:1: rule__EscapedChar__Group_1__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2303:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2304:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2304:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2305:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2306:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2308:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2318:1: rule__EscapedChar__Group_1__1 : rule__EscapedChar__Group_1__1__Impl rule__EscapedChar__Group_1__2 ;
    public final void rule__EscapedChar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2322:1: ( rule__EscapedChar__Group_1__1__Impl rule__EscapedChar__Group_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2323:2: rule__EscapedChar__Group_1__1__Impl rule__EscapedChar__Group_1__2
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__1__Impl_in_rule__EscapedChar__Group_1__14832);
            rule__EscapedChar__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_1__2_in_rule__EscapedChar__Group_1__14835);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2330:1: rule__EscapedChar__Group_1__1__Impl : ( 'x' ) ;
    public final void rule__EscapedChar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2334:1: ( ( 'x' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2335:1: ( 'x' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2335:1: ( 'x' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2336:1: 'x'
            {
             before(grammarAccess.getEscapedCharAccess().getXKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__EscapedChar__Group_1__1__Impl4863); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2349:1: rule__EscapedChar__Group_1__2 : rule__EscapedChar__Group_1__2__Impl rule__EscapedChar__Group_1__3 ;
    public final void rule__EscapedChar__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2353:1: ( rule__EscapedChar__Group_1__2__Impl rule__EscapedChar__Group_1__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2354:2: rule__EscapedChar__Group_1__2__Impl rule__EscapedChar__Group_1__3
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__2__Impl_in_rule__EscapedChar__Group_1__24894);
            rule__EscapedChar__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_1__3_in_rule__EscapedChar__Group_1__24897);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2361:1: rule__EscapedChar__Group_1__2__Impl : ( ( rule__EscapedChar__DigitsAssignment_1_2 ) ) ;
    public final void rule__EscapedChar__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2365:1: ( ( ( rule__EscapedChar__DigitsAssignment_1_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2366:1: ( ( rule__EscapedChar__DigitsAssignment_1_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2366:1: ( ( rule__EscapedChar__DigitsAssignment_1_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2367:1: ( rule__EscapedChar__DigitsAssignment_1_2 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2368:1: ( rule__EscapedChar__DigitsAssignment_1_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2368:2: rule__EscapedChar__DigitsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_1_2_in_rule__EscapedChar__Group_1__2__Impl4924);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2378:1: rule__EscapedChar__Group_1__3 : rule__EscapedChar__Group_1__3__Impl ;
    public final void rule__EscapedChar__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2382:1: ( rule__EscapedChar__Group_1__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2383:2: rule__EscapedChar__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_1__3__Impl_in_rule__EscapedChar__Group_1__34954);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2389:1: rule__EscapedChar__Group_1__3__Impl : ( ( rule__EscapedChar__DigitsAssignment_1_3 ) ) ;
    public final void rule__EscapedChar__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2393:1: ( ( ( rule__EscapedChar__DigitsAssignment_1_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2394:1: ( ( rule__EscapedChar__DigitsAssignment_1_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2394:1: ( ( rule__EscapedChar__DigitsAssignment_1_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2395:1: ( rule__EscapedChar__DigitsAssignment_1_3 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2396:1: ( rule__EscapedChar__DigitsAssignment_1_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2396:2: rule__EscapedChar__DigitsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_1_3_in_rule__EscapedChar__Group_1__3__Impl4981);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2414:1: rule__EscapedChar__Group_2__0 : rule__EscapedChar__Group_2__0__Impl rule__EscapedChar__Group_2__1 ;
    public final void rule__EscapedChar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2418:1: ( rule__EscapedChar__Group_2__0__Impl rule__EscapedChar__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2419:2: rule__EscapedChar__Group_2__0__Impl rule__EscapedChar__Group_2__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__0__Impl_in_rule__EscapedChar__Group_2__05019);
            rule__EscapedChar__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__1_in_rule__EscapedChar__Group_2__05022);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2426:1: rule__EscapedChar__Group_2__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2430:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2431:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2431:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2432:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_2_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2433:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2435:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2445:1: rule__EscapedChar__Group_2__1 : rule__EscapedChar__Group_2__1__Impl rule__EscapedChar__Group_2__2 ;
    public final void rule__EscapedChar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2449:1: ( rule__EscapedChar__Group_2__1__Impl rule__EscapedChar__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2450:2: rule__EscapedChar__Group_2__1__Impl rule__EscapedChar__Group_2__2
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__1__Impl_in_rule__EscapedChar__Group_2__15080);
            rule__EscapedChar__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__2_in_rule__EscapedChar__Group_2__15083);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2457:1: rule__EscapedChar__Group_2__1__Impl : ( 'u' ) ;
    public final void rule__EscapedChar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2461:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2462:1: ( 'u' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2462:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2463:1: 'u'
            {
             before(grammarAccess.getEscapedCharAccess().getUKeyword_2_1()); 
            match(input,37,FOLLOW_37_in_rule__EscapedChar__Group_2__1__Impl5111); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2476:1: rule__EscapedChar__Group_2__2 : rule__EscapedChar__Group_2__2__Impl rule__EscapedChar__Group_2__3 ;
    public final void rule__EscapedChar__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2480:1: ( rule__EscapedChar__Group_2__2__Impl rule__EscapedChar__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2481:2: rule__EscapedChar__Group_2__2__Impl rule__EscapedChar__Group_2__3
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__2__Impl_in_rule__EscapedChar__Group_2__25142);
            rule__EscapedChar__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__3_in_rule__EscapedChar__Group_2__25145);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2488:1: rule__EscapedChar__Group_2__2__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_2 ) ) ;
    public final void rule__EscapedChar__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2492:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2493:1: ( ( rule__EscapedChar__DigitsAssignment_2_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2493:1: ( ( rule__EscapedChar__DigitsAssignment_2_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2494:1: ( rule__EscapedChar__DigitsAssignment_2_2 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2495:1: ( rule__EscapedChar__DigitsAssignment_2_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2495:2: rule__EscapedChar__DigitsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_2_in_rule__EscapedChar__Group_2__2__Impl5172);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2505:1: rule__EscapedChar__Group_2__3 : rule__EscapedChar__Group_2__3__Impl rule__EscapedChar__Group_2__4 ;
    public final void rule__EscapedChar__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2509:1: ( rule__EscapedChar__Group_2__3__Impl rule__EscapedChar__Group_2__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2510:2: rule__EscapedChar__Group_2__3__Impl rule__EscapedChar__Group_2__4
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__3__Impl_in_rule__EscapedChar__Group_2__35202);
            rule__EscapedChar__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__4_in_rule__EscapedChar__Group_2__35205);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2517:1: rule__EscapedChar__Group_2__3__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_3 ) ) ;
    public final void rule__EscapedChar__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2521:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2522:1: ( ( rule__EscapedChar__DigitsAssignment_2_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2522:1: ( ( rule__EscapedChar__DigitsAssignment_2_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2523:1: ( rule__EscapedChar__DigitsAssignment_2_3 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2524:1: ( rule__EscapedChar__DigitsAssignment_2_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2524:2: rule__EscapedChar__DigitsAssignment_2_3
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_3_in_rule__EscapedChar__Group_2__3__Impl5232);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2534:1: rule__EscapedChar__Group_2__4 : rule__EscapedChar__Group_2__4__Impl rule__EscapedChar__Group_2__5 ;
    public final void rule__EscapedChar__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2538:1: ( rule__EscapedChar__Group_2__4__Impl rule__EscapedChar__Group_2__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2539:2: rule__EscapedChar__Group_2__4__Impl rule__EscapedChar__Group_2__5
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__4__Impl_in_rule__EscapedChar__Group_2__45262);
            rule__EscapedChar__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_2__5_in_rule__EscapedChar__Group_2__45265);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2546:1: rule__EscapedChar__Group_2__4__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_4 ) ) ;
    public final void rule__EscapedChar__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2550:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2551:1: ( ( rule__EscapedChar__DigitsAssignment_2_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2551:1: ( ( rule__EscapedChar__DigitsAssignment_2_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2552:1: ( rule__EscapedChar__DigitsAssignment_2_4 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2553:1: ( rule__EscapedChar__DigitsAssignment_2_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2553:2: rule__EscapedChar__DigitsAssignment_2_4
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_4_in_rule__EscapedChar__Group_2__4__Impl5292);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2563:1: rule__EscapedChar__Group_2__5 : rule__EscapedChar__Group_2__5__Impl ;
    public final void rule__EscapedChar__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2567:1: ( rule__EscapedChar__Group_2__5__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2568:2: rule__EscapedChar__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_2__5__Impl_in_rule__EscapedChar__Group_2__55322);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2574:1: rule__EscapedChar__Group_2__5__Impl : ( ( rule__EscapedChar__DigitsAssignment_2_5 ) ) ;
    public final void rule__EscapedChar__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2578:1: ( ( ( rule__EscapedChar__DigitsAssignment_2_5 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2579:1: ( ( rule__EscapedChar__DigitsAssignment_2_5 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2579:1: ( ( rule__EscapedChar__DigitsAssignment_2_5 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2580:1: ( rule__EscapedChar__DigitsAssignment_2_5 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2581:1: ( rule__EscapedChar__DigitsAssignment_2_5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2581:2: rule__EscapedChar__DigitsAssignment_2_5
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_2_5_in_rule__EscapedChar__Group_2__5__Impl5349);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2603:1: rule__EscapedChar__Group_3__0 : rule__EscapedChar__Group_3__0__Impl rule__EscapedChar__Group_3__1 ;
    public final void rule__EscapedChar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2607:1: ( rule__EscapedChar__Group_3__0__Impl rule__EscapedChar__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2608:2: rule__EscapedChar__Group_3__0__Impl rule__EscapedChar__Group_3__1
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__0__Impl_in_rule__EscapedChar__Group_3__05391);
            rule__EscapedChar__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__1_in_rule__EscapedChar__Group_3__05394);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2615:1: rule__EscapedChar__Group_3__0__Impl : ( () ) ;
    public final void rule__EscapedChar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2619:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2620:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2620:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2621:1: ()
            {
             before(grammarAccess.getEscapedCharAccess().getUnicodeCharAction_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2622:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2624:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2634:1: rule__EscapedChar__Group_3__1 : rule__EscapedChar__Group_3__1__Impl rule__EscapedChar__Group_3__2 ;
    public final void rule__EscapedChar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2638:1: ( rule__EscapedChar__Group_3__1__Impl rule__EscapedChar__Group_3__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2639:2: rule__EscapedChar__Group_3__1__Impl rule__EscapedChar__Group_3__2
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__1__Impl_in_rule__EscapedChar__Group_3__15452);
            rule__EscapedChar__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__2_in_rule__EscapedChar__Group_3__15455);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2646:1: rule__EscapedChar__Group_3__1__Impl : ( 'U' ) ;
    public final void rule__EscapedChar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2650:1: ( ( 'U' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2651:1: ( 'U' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2651:1: ( 'U' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2652:1: 'U'
            {
             before(grammarAccess.getEscapedCharAccess().getUKeyword_3_1()); 
            match(input,38,FOLLOW_38_in_rule__EscapedChar__Group_3__1__Impl5483); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2665:1: rule__EscapedChar__Group_3__2 : rule__EscapedChar__Group_3__2__Impl rule__EscapedChar__Group_3__3 ;
    public final void rule__EscapedChar__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2669:1: ( rule__EscapedChar__Group_3__2__Impl rule__EscapedChar__Group_3__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2670:2: rule__EscapedChar__Group_3__2__Impl rule__EscapedChar__Group_3__3
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__2__Impl_in_rule__EscapedChar__Group_3__25514);
            rule__EscapedChar__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__3_in_rule__EscapedChar__Group_3__25517);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2677:1: rule__EscapedChar__Group_3__2__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_2 ) ) ;
    public final void rule__EscapedChar__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2681:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2682:1: ( ( rule__EscapedChar__DigitsAssignment_3_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2682:1: ( ( rule__EscapedChar__DigitsAssignment_3_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2683:1: ( rule__EscapedChar__DigitsAssignment_3_2 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2684:1: ( rule__EscapedChar__DigitsAssignment_3_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2684:2: rule__EscapedChar__DigitsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_2_in_rule__EscapedChar__Group_3__2__Impl5544);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2694:1: rule__EscapedChar__Group_3__3 : rule__EscapedChar__Group_3__3__Impl rule__EscapedChar__Group_3__4 ;
    public final void rule__EscapedChar__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2698:1: ( rule__EscapedChar__Group_3__3__Impl rule__EscapedChar__Group_3__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2699:2: rule__EscapedChar__Group_3__3__Impl rule__EscapedChar__Group_3__4
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__3__Impl_in_rule__EscapedChar__Group_3__35574);
            rule__EscapedChar__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__4_in_rule__EscapedChar__Group_3__35577);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2706:1: rule__EscapedChar__Group_3__3__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_3 ) ) ;
    public final void rule__EscapedChar__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2710:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2711:1: ( ( rule__EscapedChar__DigitsAssignment_3_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2711:1: ( ( rule__EscapedChar__DigitsAssignment_3_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2712:1: ( rule__EscapedChar__DigitsAssignment_3_3 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2713:1: ( rule__EscapedChar__DigitsAssignment_3_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2713:2: rule__EscapedChar__DigitsAssignment_3_3
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_3_in_rule__EscapedChar__Group_3__3__Impl5604);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2723:1: rule__EscapedChar__Group_3__4 : rule__EscapedChar__Group_3__4__Impl rule__EscapedChar__Group_3__5 ;
    public final void rule__EscapedChar__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2727:1: ( rule__EscapedChar__Group_3__4__Impl rule__EscapedChar__Group_3__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2728:2: rule__EscapedChar__Group_3__4__Impl rule__EscapedChar__Group_3__5
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__4__Impl_in_rule__EscapedChar__Group_3__45634);
            rule__EscapedChar__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__5_in_rule__EscapedChar__Group_3__45637);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2735:1: rule__EscapedChar__Group_3__4__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_4 ) ) ;
    public final void rule__EscapedChar__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2739:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2740:1: ( ( rule__EscapedChar__DigitsAssignment_3_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2740:1: ( ( rule__EscapedChar__DigitsAssignment_3_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2741:1: ( rule__EscapedChar__DigitsAssignment_3_4 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2742:1: ( rule__EscapedChar__DigitsAssignment_3_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2742:2: rule__EscapedChar__DigitsAssignment_3_4
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_4_in_rule__EscapedChar__Group_3__4__Impl5664);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2752:1: rule__EscapedChar__Group_3__5 : rule__EscapedChar__Group_3__5__Impl rule__EscapedChar__Group_3__6 ;
    public final void rule__EscapedChar__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2756:1: ( rule__EscapedChar__Group_3__5__Impl rule__EscapedChar__Group_3__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2757:2: rule__EscapedChar__Group_3__5__Impl rule__EscapedChar__Group_3__6
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__5__Impl_in_rule__EscapedChar__Group_3__55694);
            rule__EscapedChar__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__6_in_rule__EscapedChar__Group_3__55697);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2764:1: rule__EscapedChar__Group_3__5__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_5 ) ) ;
    public final void rule__EscapedChar__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2768:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_5 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2769:1: ( ( rule__EscapedChar__DigitsAssignment_3_5 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2769:1: ( ( rule__EscapedChar__DigitsAssignment_3_5 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2770:1: ( rule__EscapedChar__DigitsAssignment_3_5 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2771:1: ( rule__EscapedChar__DigitsAssignment_3_5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2771:2: rule__EscapedChar__DigitsAssignment_3_5
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_5_in_rule__EscapedChar__Group_3__5__Impl5724);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2781:1: rule__EscapedChar__Group_3__6 : rule__EscapedChar__Group_3__6__Impl rule__EscapedChar__Group_3__7 ;
    public final void rule__EscapedChar__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2785:1: ( rule__EscapedChar__Group_3__6__Impl rule__EscapedChar__Group_3__7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2786:2: rule__EscapedChar__Group_3__6__Impl rule__EscapedChar__Group_3__7
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__6__Impl_in_rule__EscapedChar__Group_3__65754);
            rule__EscapedChar__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__7_in_rule__EscapedChar__Group_3__65757);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2793:1: rule__EscapedChar__Group_3__6__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_6 ) ) ;
    public final void rule__EscapedChar__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2797:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_6 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2798:1: ( ( rule__EscapedChar__DigitsAssignment_3_6 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2798:1: ( ( rule__EscapedChar__DigitsAssignment_3_6 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2799:1: ( rule__EscapedChar__DigitsAssignment_3_6 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_6()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2800:1: ( rule__EscapedChar__DigitsAssignment_3_6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2800:2: rule__EscapedChar__DigitsAssignment_3_6
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_6_in_rule__EscapedChar__Group_3__6__Impl5784);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2810:1: rule__EscapedChar__Group_3__7 : rule__EscapedChar__Group_3__7__Impl rule__EscapedChar__Group_3__8 ;
    public final void rule__EscapedChar__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2814:1: ( rule__EscapedChar__Group_3__7__Impl rule__EscapedChar__Group_3__8 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2815:2: rule__EscapedChar__Group_3__7__Impl rule__EscapedChar__Group_3__8
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__7__Impl_in_rule__EscapedChar__Group_3__75814);
            rule__EscapedChar__Group_3__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__8_in_rule__EscapedChar__Group_3__75817);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2822:1: rule__EscapedChar__Group_3__7__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_7 ) ) ;
    public final void rule__EscapedChar__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2826:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_7 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2827:1: ( ( rule__EscapedChar__DigitsAssignment_3_7 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2827:1: ( ( rule__EscapedChar__DigitsAssignment_3_7 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2828:1: ( rule__EscapedChar__DigitsAssignment_3_7 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_7()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2829:1: ( rule__EscapedChar__DigitsAssignment_3_7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2829:2: rule__EscapedChar__DigitsAssignment_3_7
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_7_in_rule__EscapedChar__Group_3__7__Impl5844);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2839:1: rule__EscapedChar__Group_3__8 : rule__EscapedChar__Group_3__8__Impl rule__EscapedChar__Group_3__9 ;
    public final void rule__EscapedChar__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2843:1: ( rule__EscapedChar__Group_3__8__Impl rule__EscapedChar__Group_3__9 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2844:2: rule__EscapedChar__Group_3__8__Impl rule__EscapedChar__Group_3__9
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__8__Impl_in_rule__EscapedChar__Group_3__85874);
            rule__EscapedChar__Group_3__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EscapedChar__Group_3__9_in_rule__EscapedChar__Group_3__85877);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2851:1: rule__EscapedChar__Group_3__8__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_8 ) ) ;
    public final void rule__EscapedChar__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2855:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_8 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2856:1: ( ( rule__EscapedChar__DigitsAssignment_3_8 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2856:1: ( ( rule__EscapedChar__DigitsAssignment_3_8 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2857:1: ( rule__EscapedChar__DigitsAssignment_3_8 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_8()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2858:1: ( rule__EscapedChar__DigitsAssignment_3_8 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2858:2: rule__EscapedChar__DigitsAssignment_3_8
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_8_in_rule__EscapedChar__Group_3__8__Impl5904);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2868:1: rule__EscapedChar__Group_3__9 : rule__EscapedChar__Group_3__9__Impl ;
    public final void rule__EscapedChar__Group_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2872:1: ( rule__EscapedChar__Group_3__9__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2873:2: rule__EscapedChar__Group_3__9__Impl
            {
            pushFollow(FOLLOW_rule__EscapedChar__Group_3__9__Impl_in_rule__EscapedChar__Group_3__95934);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2879:1: rule__EscapedChar__Group_3__9__Impl : ( ( rule__EscapedChar__DigitsAssignment_3_9 ) ) ;
    public final void rule__EscapedChar__Group_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2883:1: ( ( ( rule__EscapedChar__DigitsAssignment_3_9 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2884:1: ( ( rule__EscapedChar__DigitsAssignment_3_9 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2884:1: ( ( rule__EscapedChar__DigitsAssignment_3_9 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2885:1: ( rule__EscapedChar__DigitsAssignment_3_9 )
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_9()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2886:1: ( rule__EscapedChar__DigitsAssignment_3_9 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2886:2: rule__EscapedChar__DigitsAssignment_3_9
            {
            pushFollow(FOLLOW_rule__EscapedChar__DigitsAssignment_3_9_in_rule__EscapedChar__Group_3__9__Impl5961);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2916:1: rule__FloatLit__Group__0 : rule__FloatLit__Group__0__Impl rule__FloatLit__Group__1 ;
    public final void rule__FloatLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2920:1: ( rule__FloatLit__Group__0__Impl rule__FloatLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2921:2: rule__FloatLit__Group__0__Impl rule__FloatLit__Group__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__0__Impl_in_rule__FloatLit__Group__06011);
            rule__FloatLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__1_in_rule__FloatLit__Group__06014);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2928:1: rule__FloatLit__Group__0__Impl : ( ( rule__FloatLit__DigitsAssignment_0 ) ) ;
    public final void rule__FloatLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2932:1: ( ( ( rule__FloatLit__DigitsAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2933:1: ( ( rule__FloatLit__DigitsAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2933:1: ( ( rule__FloatLit__DigitsAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2934:1: ( rule__FloatLit__DigitsAssignment_0 )
            {
             before(grammarAccess.getFloatLitAccess().getDigitsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2935:1: ( rule__FloatLit__DigitsAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2935:2: rule__FloatLit__DigitsAssignment_0
            {
            pushFollow(FOLLOW_rule__FloatLit__DigitsAssignment_0_in_rule__FloatLit__Group__0__Impl6041);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2945:1: rule__FloatLit__Group__1 : rule__FloatLit__Group__1__Impl rule__FloatLit__Group__2 ;
    public final void rule__FloatLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2949:1: ( rule__FloatLit__Group__1__Impl rule__FloatLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2950:2: rule__FloatLit__Group__1__Impl rule__FloatLit__Group__2
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__1__Impl_in_rule__FloatLit__Group__16071);
            rule__FloatLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__2_in_rule__FloatLit__Group__16074);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2957:1: rule__FloatLit__Group__1__Impl : ( ( rule__FloatLit__Alternatives_1 )* ) ;
    public final void rule__FloatLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2961:1: ( ( ( rule__FloatLit__Alternatives_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2962:1: ( ( rule__FloatLit__Alternatives_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2962:1: ( ( rule__FloatLit__Alternatives_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2963:1: ( rule__FloatLit__Alternatives_1 )*
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2964:1: ( rule__FloatLit__Alternatives_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_DEC_DIGIT||LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2964:2: rule__FloatLit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__FloatLit__Alternatives_1_in_rule__FloatLit__Group__1__Impl6101);
            	    rule__FloatLit__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2974:1: rule__FloatLit__Group__2 : rule__FloatLit__Group__2__Impl rule__FloatLit__Group__3 ;
    public final void rule__FloatLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2978:1: ( rule__FloatLit__Group__2__Impl rule__FloatLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2979:2: rule__FloatLit__Group__2__Impl rule__FloatLit__Group__3
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__2__Impl_in_rule__FloatLit__Group__26132);
            rule__FloatLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__3_in_rule__FloatLit__Group__26135);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2986:1: rule__FloatLit__Group__2__Impl : ( ( rule__FloatLit__Group_2__0 ) ) ;
    public final void rule__FloatLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2990:1: ( ( ( rule__FloatLit__Group_2__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2991:1: ( ( rule__FloatLit__Group_2__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2991:1: ( ( rule__FloatLit__Group_2__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2992:1: ( rule__FloatLit__Group_2__0 )
            {
             before(grammarAccess.getFloatLitAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2993:1: ( rule__FloatLit__Group_2__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2993:2: rule__FloatLit__Group_2__0
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_2__0_in_rule__FloatLit__Group__2__Impl6162);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3003:1: rule__FloatLit__Group__3 : rule__FloatLit__Group__3__Impl rule__FloatLit__Group__4 ;
    public final void rule__FloatLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3007:1: ( rule__FloatLit__Group__3__Impl rule__FloatLit__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3008:2: rule__FloatLit__Group__3__Impl rule__FloatLit__Group__4
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__3__Impl_in_rule__FloatLit__Group__36192);
            rule__FloatLit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group__4_in_rule__FloatLit__Group__36195);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3015:1: rule__FloatLit__Group__3__Impl : ( ( rule__FloatLit__Group_3__0 )? ) ;
    public final void rule__FloatLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3019:1: ( ( ( rule__FloatLit__Group_3__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3020:1: ( ( rule__FloatLit__Group_3__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3020:1: ( ( rule__FloatLit__Group_3__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3021:1: ( rule__FloatLit__Group_3__0 )?
            {
             before(grammarAccess.getFloatLitAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3022:1: ( rule__FloatLit__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=18 && LA31_0<=19)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3022:2: rule__FloatLit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__Group_3__0_in_rule__FloatLit__Group__3__Impl6222);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3032:1: rule__FloatLit__Group__4 : rule__FloatLit__Group__4__Impl ;
    public final void rule__FloatLit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3036:1: ( rule__FloatLit__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3037:2: rule__FloatLit__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group__4__Impl_in_rule__FloatLit__Group__46253);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3043:1: rule__FloatLit__Group__4__Impl : ( ( rule__FloatLit__Group_4__0 )? ) ;
    public final void rule__FloatLit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3047:1: ( ( ( rule__FloatLit__Group_4__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3048:1: ( ( rule__FloatLit__Group_4__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3048:1: ( ( rule__FloatLit__Group_4__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3049:1: ( rule__FloatLit__Group_4__0 )?
            {
             before(grammarAccess.getFloatLitAccess().getGroup_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3050:1: ( rule__FloatLit__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3050:2: rule__FloatLit__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FloatLit__Group_4__0_in_rule__FloatLit__Group__4__Impl6280);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3070:1: rule__FloatLit__Group_2__0 : rule__FloatLit__Group_2__0__Impl rule__FloatLit__Group_2__1 ;
    public final void rule__FloatLit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3074:1: ( rule__FloatLit__Group_2__0__Impl rule__FloatLit__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3075:2: rule__FloatLit__Group_2__0__Impl rule__FloatLit__Group_2__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_2__0__Impl_in_rule__FloatLit__Group_2__06321);
            rule__FloatLit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_2__1_in_rule__FloatLit__Group_2__06324);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3082:1: rule__FloatLit__Group_2__0__Impl : ( '.' ) ;
    public final void rule__FloatLit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3086:1: ( ( '.' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3087:1: ( '.' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3087:1: ( '.' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3088:1: '.'
            {
             before(grammarAccess.getFloatLitAccess().getFullStopKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__FloatLit__Group_2__0__Impl6352); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3101:1: rule__FloatLit__Group_2__1 : rule__FloatLit__Group_2__1__Impl ;
    public final void rule__FloatLit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3105:1: ( rule__FloatLit__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3106:2: rule__FloatLit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_2__1__Impl_in_rule__FloatLit__Group_2__16383);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3112:1: rule__FloatLit__Group_2__1__Impl : ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) ) ;
    public final void rule__FloatLit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3116:1: ( ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3117:1: ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3117:1: ( ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3118:1: ( ( rule__FloatLit__Alternatives_2_1 ) ) ( ( rule__FloatLit__Alternatives_2_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3118:1: ( ( rule__FloatLit__Alternatives_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3119:1: ( rule__FloatLit__Alternatives_2_1 )
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3120:1: ( rule__FloatLit__Alternatives_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3120:2: rule__FloatLit__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl6412);
            rule__FloatLit__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3123:1: ( ( rule__FloatLit__Alternatives_2_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3124:1: ( rule__FloatLit__Alternatives_2_1 )*
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3125:1: ( rule__FloatLit__Alternatives_2_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_DEC_DIGIT||LA33_0==17) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3125:2: rule__FloatLit__Alternatives_2_1
            	    {
            	    pushFollow(FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl6424);
            	    rule__FloatLit__Alternatives_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3140:1: rule__FloatLit__Group_3__0 : rule__FloatLit__Group_3__0__Impl rule__FloatLit__Group_3__1 ;
    public final void rule__FloatLit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3144:1: ( rule__FloatLit__Group_3__0__Impl rule__FloatLit__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3145:2: rule__FloatLit__Group_3__0__Impl rule__FloatLit__Group_3__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_3__0__Impl_in_rule__FloatLit__Group_3__06461);
            rule__FloatLit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_3__1_in_rule__FloatLit__Group_3__06464);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3152:1: rule__FloatLit__Group_3__0__Impl : ( ( rule__FloatLit__Alternatives_3_0 ) ) ;
    public final void rule__FloatLit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3156:1: ( ( ( rule__FloatLit__Alternatives_3_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3157:1: ( ( rule__FloatLit__Alternatives_3_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3157:1: ( ( rule__FloatLit__Alternatives_3_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3158:1: ( rule__FloatLit__Alternatives_3_0 )
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3159:1: ( rule__FloatLit__Alternatives_3_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3159:2: rule__FloatLit__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_0_in_rule__FloatLit__Group_3__0__Impl6491);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3169:1: rule__FloatLit__Group_3__1 : rule__FloatLit__Group_3__1__Impl rule__FloatLit__Group_3__2 ;
    public final void rule__FloatLit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3173:1: ( rule__FloatLit__Group_3__1__Impl rule__FloatLit__Group_3__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3174:2: rule__FloatLit__Group_3__1__Impl rule__FloatLit__Group_3__2
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_3__1__Impl_in_rule__FloatLit__Group_3__16521);
            rule__FloatLit__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_3__2_in_rule__FloatLit__Group_3__16524);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3181:1: rule__FloatLit__Group_3__1__Impl : ( ( rule__FloatLit__Alternatives_3_1 )? ) ;
    public final void rule__FloatLit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3185:1: ( ( ( rule__FloatLit__Alternatives_3_1 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3186:1: ( ( rule__FloatLit__Alternatives_3_1 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3186:1: ( ( rule__FloatLit__Alternatives_3_1 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3187:1: ( rule__FloatLit__Alternatives_3_1 )?
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3188:1: ( rule__FloatLit__Alternatives_3_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20||LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3188:2: rule__FloatLit__Alternatives_3_1
                    {
                    pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_1_in_rule__FloatLit__Group_3__1__Impl6551);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3198:1: rule__FloatLit__Group_3__2 : rule__FloatLit__Group_3__2__Impl ;
    public final void rule__FloatLit__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3202:1: ( rule__FloatLit__Group_3__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3203:2: rule__FloatLit__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_3__2__Impl_in_rule__FloatLit__Group_3__26582);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3209:1: rule__FloatLit__Group_3__2__Impl : ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) ) ;
    public final void rule__FloatLit__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3213:1: ( ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3214:1: ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3214:1: ( ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3215:1: ( ( rule__FloatLit__Alternatives_3_2 ) ) ( ( rule__FloatLit__Alternatives_3_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3215:1: ( ( rule__FloatLit__Alternatives_3_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3216:1: ( rule__FloatLit__Alternatives_3_2 )
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3217:1: ( rule__FloatLit__Alternatives_3_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3217:2: rule__FloatLit__Alternatives_3_2
            {
            pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl6611);
            rule__FloatLit__Alternatives_3_2();

            state._fsp--;


            }

             after(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3220:1: ( ( rule__FloatLit__Alternatives_3_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3221:1: ( rule__FloatLit__Alternatives_3_2 )*
            {
             before(grammarAccess.getFloatLitAccess().getAlternatives_3_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3222:1: ( rule__FloatLit__Alternatives_3_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_DEC_DIGIT||LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3222:2: rule__FloatLit__Alternatives_3_2
            	    {
            	    pushFollow(FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl6623);
            	    rule__FloatLit__Alternatives_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3239:1: rule__FloatLit__Group_4__0 : rule__FloatLit__Group_4__0__Impl rule__FloatLit__Group_4__1 ;
    public final void rule__FloatLit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3243:1: ( rule__FloatLit__Group_4__0__Impl rule__FloatLit__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3244:2: rule__FloatLit__Group_4__0__Impl rule__FloatLit__Group_4__1
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_4__0__Impl_in_rule__FloatLit__Group_4__06662);
            rule__FloatLit__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FloatLit__Group_4__1_in_rule__FloatLit__Group_4__06665);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3251:1: rule__FloatLit__Group_4__0__Impl : ( 'f' ) ;
    public final void rule__FloatLit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3255:1: ( ( 'f' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3256:1: ( 'f' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3256:1: ( 'f' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3257:1: 'f'
            {
             before(grammarAccess.getFloatLitAccess().getFKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__FloatLit__Group_4__0__Impl6693); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3270:1: rule__FloatLit__Group_4__1 : rule__FloatLit__Group_4__1__Impl ;
    public final void rule__FloatLit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3274:1: ( rule__FloatLit__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3275:2: rule__FloatLit__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatLit__Group_4__1__Impl_in_rule__FloatLit__Group_4__16724);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3281:1: rule__FloatLit__Group_4__1__Impl : ( ( rule__FloatLit__SizeAssignment_4_1 ) ) ;
    public final void rule__FloatLit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3285:1: ( ( ( rule__FloatLit__SizeAssignment_4_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3286:1: ( ( rule__FloatLit__SizeAssignment_4_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3286:1: ( ( rule__FloatLit__SizeAssignment_4_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3287:1: ( rule__FloatLit__SizeAssignment_4_1 )
            {
             before(grammarAccess.getFloatLitAccess().getSizeAssignment_4_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3288:1: ( rule__FloatLit__SizeAssignment_4_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3288:2: rule__FloatLit__SizeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FloatLit__SizeAssignment_4_1_in_rule__FloatLit__Group_4__1__Impl6751);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3302:1: rule__DecIntLit__Group__0 : rule__DecIntLit__Group__0__Impl rule__DecIntLit__Group__1 ;
    public final void rule__DecIntLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3306:1: ( rule__DecIntLit__Group__0__Impl rule__DecIntLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3307:2: rule__DecIntLit__Group__0__Impl rule__DecIntLit__Group__1
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__0__Impl_in_rule__DecIntLit__Group__06785);
            rule__DecIntLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecIntLit__Group__1_in_rule__DecIntLit__Group__06788);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3314:1: rule__DecIntLit__Group__0__Impl : ( ( rule__DecIntLit__DigitsAssignment_0 ) ) ;
    public final void rule__DecIntLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3318:1: ( ( ( rule__DecIntLit__DigitsAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3319:1: ( ( rule__DecIntLit__DigitsAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3319:1: ( ( rule__DecIntLit__DigitsAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3320:1: ( rule__DecIntLit__DigitsAssignment_0 )
            {
             before(grammarAccess.getDecIntLitAccess().getDigitsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3321:1: ( rule__DecIntLit__DigitsAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3321:2: rule__DecIntLit__DigitsAssignment_0
            {
            pushFollow(FOLLOW_rule__DecIntLit__DigitsAssignment_0_in_rule__DecIntLit__Group__0__Impl6815);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3331:1: rule__DecIntLit__Group__1 : rule__DecIntLit__Group__1__Impl rule__DecIntLit__Group__2 ;
    public final void rule__DecIntLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3335:1: ( rule__DecIntLit__Group__1__Impl rule__DecIntLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3336:2: rule__DecIntLit__Group__1__Impl rule__DecIntLit__Group__2
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__1__Impl_in_rule__DecIntLit__Group__16845);
            rule__DecIntLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecIntLit__Group__2_in_rule__DecIntLit__Group__16848);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3343:1: rule__DecIntLit__Group__1__Impl : ( ( rule__DecIntLit__Alternatives_1 )* ) ;
    public final void rule__DecIntLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3347:1: ( ( ( rule__DecIntLit__Alternatives_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3348:1: ( ( rule__DecIntLit__Alternatives_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3348:1: ( ( rule__DecIntLit__Alternatives_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3349:1: ( rule__DecIntLit__Alternatives_1 )*
            {
             before(grammarAccess.getDecIntLitAccess().getAlternatives_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3350:1: ( rule__DecIntLit__Alternatives_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_DEC_DIGIT||LA36_0==17) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3350:2: rule__DecIntLit__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__DecIntLit__Alternatives_1_in_rule__DecIntLit__Group__1__Impl6875);
            	    rule__DecIntLit__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3360:1: rule__DecIntLit__Group__2 : rule__DecIntLit__Group__2__Impl ;
    public final void rule__DecIntLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3364:1: ( rule__DecIntLit__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3365:2: rule__DecIntLit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group__2__Impl_in_rule__DecIntLit__Group__26906);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3371:1: rule__DecIntLit__Group__2__Impl : ( ( rule__DecIntLit__Group_2__0 )? ) ;
    public final void rule__DecIntLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3375:1: ( ( ( rule__DecIntLit__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3376:1: ( ( rule__DecIntLit__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3376:1: ( ( rule__DecIntLit__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3377:1: ( rule__DecIntLit__Group_2__0 )?
            {
             before(grammarAccess.getDecIntLitAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3378:1: ( rule__DecIntLit__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21||LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3378:2: rule__DecIntLit__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DecIntLit__Group_2__0_in_rule__DecIntLit__Group__2__Impl6933);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3394:1: rule__DecIntLit__Group_2__0 : rule__DecIntLit__Group_2__0__Impl rule__DecIntLit__Group_2__1 ;
    public final void rule__DecIntLit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3398:1: ( rule__DecIntLit__Group_2__0__Impl rule__DecIntLit__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3399:2: rule__DecIntLit__Group_2__0__Impl rule__DecIntLit__Group_2__1
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group_2__0__Impl_in_rule__DecIntLit__Group_2__06970);
            rule__DecIntLit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecIntLit__Group_2__1_in_rule__DecIntLit__Group_2__06973);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3406:1: rule__DecIntLit__Group_2__0__Impl : ( ( rule__DecIntLit__Alternatives_2_0 ) ) ;
    public final void rule__DecIntLit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3410:1: ( ( ( rule__DecIntLit__Alternatives_2_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3411:1: ( ( rule__DecIntLit__Alternatives_2_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3411:1: ( ( rule__DecIntLit__Alternatives_2_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3412:1: ( rule__DecIntLit__Alternatives_2_0 )
            {
             before(grammarAccess.getDecIntLitAccess().getAlternatives_2_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3413:1: ( rule__DecIntLit__Alternatives_2_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3413:2: rule__DecIntLit__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__DecIntLit__Alternatives_2_0_in_rule__DecIntLit__Group_2__0__Impl7000);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3423:1: rule__DecIntLit__Group_2__1 : rule__DecIntLit__Group_2__1__Impl ;
    public final void rule__DecIntLit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3427:1: ( rule__DecIntLit__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3428:2: rule__DecIntLit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DecIntLit__Group_2__1__Impl_in_rule__DecIntLit__Group_2__17030);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3434:1: rule__DecIntLit__Group_2__1__Impl : ( ( rule__DecIntLit__SizeAssignment_2_1 ) ) ;
    public final void rule__DecIntLit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3438:1: ( ( ( rule__DecIntLit__SizeAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3439:1: ( ( rule__DecIntLit__SizeAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3439:1: ( ( rule__DecIntLit__SizeAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3440:1: ( rule__DecIntLit__SizeAssignment_2_1 )
            {
             before(grammarAccess.getDecIntLitAccess().getSizeAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3441:1: ( rule__DecIntLit__SizeAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3441:2: rule__DecIntLit__SizeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DecIntLit__SizeAssignment_2_1_in_rule__DecIntLit__Group_2__1__Impl7057);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3455:1: rule__BinIntLit__Group__0 : rule__BinIntLit__Group__0__Impl rule__BinIntLit__Group__1 ;
    public final void rule__BinIntLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3459:1: ( rule__BinIntLit__Group__0__Impl rule__BinIntLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3460:2: rule__BinIntLit__Group__0__Impl rule__BinIntLit__Group__1
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group__0__Impl_in_rule__BinIntLit__Group__07091);
            rule__BinIntLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinIntLit__Group__1_in_rule__BinIntLit__Group__07094);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3467:1: rule__BinIntLit__Group__0__Impl : ( () ) ;
    public final void rule__BinIntLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3471:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3472:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3472:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3473:1: ()
            {
             before(grammarAccess.getBinIntLitAccess().getBinIntLitAction_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3474:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3476:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3486:1: rule__BinIntLit__Group__1 : rule__BinIntLit__Group__1__Impl rule__BinIntLit__Group__2 ;
    public final void rule__BinIntLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3490:1: ( rule__BinIntLit__Group__1__Impl rule__BinIntLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3491:2: rule__BinIntLit__Group__1__Impl rule__BinIntLit__Group__2
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group__1__Impl_in_rule__BinIntLit__Group__17152);
            rule__BinIntLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinIntLit__Group__2_in_rule__BinIntLit__Group__17155);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3498:1: rule__BinIntLit__Group__1__Impl : ( '0b' ) ;
    public final void rule__BinIntLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3502:1: ( ( '0b' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3503:1: ( '0b' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3503:1: ( '0b' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3504:1: '0b'
            {
             before(grammarAccess.getBinIntLitAccess().getBKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__BinIntLit__Group__1__Impl7183); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3517:1: rule__BinIntLit__Group__2 : rule__BinIntLit__Group__2__Impl rule__BinIntLit__Group__3 ;
    public final void rule__BinIntLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3521:1: ( rule__BinIntLit__Group__2__Impl rule__BinIntLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3522:2: rule__BinIntLit__Group__2__Impl rule__BinIntLit__Group__3
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group__2__Impl_in_rule__BinIntLit__Group__27214);
            rule__BinIntLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinIntLit__Group__3_in_rule__BinIntLit__Group__27217);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3529:1: rule__BinIntLit__Group__2__Impl : ( ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* ) ) ;
    public final void rule__BinIntLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3533:1: ( ( ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3534:1: ( ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3534:1: ( ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3535:1: ( ( rule__BinIntLit__Alternatives_2 ) ) ( ( rule__BinIntLit__Alternatives_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3535:1: ( ( rule__BinIntLit__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3536:1: ( rule__BinIntLit__Alternatives_2 )
            {
             before(grammarAccess.getBinIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3537:1: ( rule__BinIntLit__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3537:2: rule__BinIntLit__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BinIntLit__Alternatives_2_in_rule__BinIntLit__Group__2__Impl7246);
            rule__BinIntLit__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getBinIntLitAccess().getAlternatives_2()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3540:1: ( ( rule__BinIntLit__Alternatives_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3541:1: ( rule__BinIntLit__Alternatives_2 )*
            {
             before(grammarAccess.getBinIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3542:1: ( rule__BinIntLit__Alternatives_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=16 && LA38_0<=17)||LA38_0==46) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3542:2: rule__BinIntLit__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__BinIntLit__Alternatives_2_in_rule__BinIntLit__Group__2__Impl7258);
            	    rule__BinIntLit__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3553:1: rule__BinIntLit__Group__3 : rule__BinIntLit__Group__3__Impl ;
    public final void rule__BinIntLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3557:1: ( rule__BinIntLit__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3558:2: rule__BinIntLit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group__3__Impl_in_rule__BinIntLit__Group__37291);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3564:1: rule__BinIntLit__Group__3__Impl : ( ( rule__BinIntLit__Group_3__0 )? ) ;
    public final void rule__BinIntLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3568:1: ( ( ( rule__BinIntLit__Group_3__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3569:1: ( ( rule__BinIntLit__Group_3__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3569:1: ( ( rule__BinIntLit__Group_3__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3570:1: ( rule__BinIntLit__Group_3__0 )?
            {
             before(grammarAccess.getBinIntLitAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3571:1: ( rule__BinIntLit__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21||LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3571:2: rule__BinIntLit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BinIntLit__Group_3__0_in_rule__BinIntLit__Group__3__Impl7318);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3589:1: rule__BinIntLit__Group_3__0 : rule__BinIntLit__Group_3__0__Impl rule__BinIntLit__Group_3__1 ;
    public final void rule__BinIntLit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3593:1: ( rule__BinIntLit__Group_3__0__Impl rule__BinIntLit__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3594:2: rule__BinIntLit__Group_3__0__Impl rule__BinIntLit__Group_3__1
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group_3__0__Impl_in_rule__BinIntLit__Group_3__07357);
            rule__BinIntLit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinIntLit__Group_3__1_in_rule__BinIntLit__Group_3__07360);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3601:1: rule__BinIntLit__Group_3__0__Impl : ( ( rule__BinIntLit__Alternatives_3_0 ) ) ;
    public final void rule__BinIntLit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3605:1: ( ( ( rule__BinIntLit__Alternatives_3_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3606:1: ( ( rule__BinIntLit__Alternatives_3_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3606:1: ( ( rule__BinIntLit__Alternatives_3_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3607:1: ( rule__BinIntLit__Alternatives_3_0 )
            {
             before(grammarAccess.getBinIntLitAccess().getAlternatives_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3608:1: ( rule__BinIntLit__Alternatives_3_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3608:2: rule__BinIntLit__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__BinIntLit__Alternatives_3_0_in_rule__BinIntLit__Group_3__0__Impl7387);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3618:1: rule__BinIntLit__Group_3__1 : rule__BinIntLit__Group_3__1__Impl ;
    public final void rule__BinIntLit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3622:1: ( rule__BinIntLit__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3623:2: rule__BinIntLit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BinIntLit__Group_3__1__Impl_in_rule__BinIntLit__Group_3__17417);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3629:1: rule__BinIntLit__Group_3__1__Impl : ( ( rule__BinIntLit__SizeAssignment_3_1 ) ) ;
    public final void rule__BinIntLit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3633:1: ( ( ( rule__BinIntLit__SizeAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3634:1: ( ( rule__BinIntLit__SizeAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3634:1: ( ( rule__BinIntLit__SizeAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3635:1: ( rule__BinIntLit__SizeAssignment_3_1 )
            {
             before(grammarAccess.getBinIntLitAccess().getSizeAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3636:1: ( rule__BinIntLit__SizeAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3636:2: rule__BinIntLit__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BinIntLit__SizeAssignment_3_1_in_rule__BinIntLit__Group_3__1__Impl7444);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3650:1: rule__OctIntLit__Group__0 : rule__OctIntLit__Group__0__Impl rule__OctIntLit__Group__1 ;
    public final void rule__OctIntLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3654:1: ( rule__OctIntLit__Group__0__Impl rule__OctIntLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3655:2: rule__OctIntLit__Group__0__Impl rule__OctIntLit__Group__1
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group__0__Impl_in_rule__OctIntLit__Group__07478);
            rule__OctIntLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OctIntLit__Group__1_in_rule__OctIntLit__Group__07481);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3662:1: rule__OctIntLit__Group__0__Impl : ( () ) ;
    public final void rule__OctIntLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3666:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3667:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3667:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3668:1: ()
            {
             before(grammarAccess.getOctIntLitAccess().getOctIntLitAction_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3669:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3671:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3681:1: rule__OctIntLit__Group__1 : rule__OctIntLit__Group__1__Impl rule__OctIntLit__Group__2 ;
    public final void rule__OctIntLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3685:1: ( rule__OctIntLit__Group__1__Impl rule__OctIntLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3686:2: rule__OctIntLit__Group__1__Impl rule__OctIntLit__Group__2
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group__1__Impl_in_rule__OctIntLit__Group__17539);
            rule__OctIntLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OctIntLit__Group__2_in_rule__OctIntLit__Group__17542);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3693:1: rule__OctIntLit__Group__1__Impl : ( '0o' ) ;
    public final void rule__OctIntLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3697:1: ( ( '0o' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3698:1: ( '0o' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3698:1: ( '0o' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3699:1: '0o'
            {
             before(grammarAccess.getOctIntLitAccess().getOKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__OctIntLit__Group__1__Impl7570); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3712:1: rule__OctIntLit__Group__2 : rule__OctIntLit__Group__2__Impl rule__OctIntLit__Group__3 ;
    public final void rule__OctIntLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3716:1: ( rule__OctIntLit__Group__2__Impl rule__OctIntLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3717:2: rule__OctIntLit__Group__2__Impl rule__OctIntLit__Group__3
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group__2__Impl_in_rule__OctIntLit__Group__27601);
            rule__OctIntLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OctIntLit__Group__3_in_rule__OctIntLit__Group__27604);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3724:1: rule__OctIntLit__Group__2__Impl : ( ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* ) ) ;
    public final void rule__OctIntLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3728:1: ( ( ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3729:1: ( ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3729:1: ( ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3730:1: ( ( rule__OctIntLit__Alternatives_2 ) ) ( ( rule__OctIntLit__Alternatives_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3730:1: ( ( rule__OctIntLit__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3731:1: ( rule__OctIntLit__Alternatives_2 )
            {
             before(grammarAccess.getOctIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3732:1: ( rule__OctIntLit__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3732:2: rule__OctIntLit__Alternatives_2
            {
            pushFollow(FOLLOW_rule__OctIntLit__Alternatives_2_in_rule__OctIntLit__Group__2__Impl7633);
            rule__OctIntLit__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getOctIntLitAccess().getAlternatives_2()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3735:1: ( ( rule__OctIntLit__Alternatives_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3736:1: ( rule__OctIntLit__Alternatives_2 )*
            {
             before(grammarAccess.getOctIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3737:1: ( rule__OctIntLit__Alternatives_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_OCT_DIGIT||LA40_0==17) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3737:2: rule__OctIntLit__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__OctIntLit__Alternatives_2_in_rule__OctIntLit__Group__2__Impl7645);
            	    rule__OctIntLit__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3748:1: rule__OctIntLit__Group__3 : rule__OctIntLit__Group__3__Impl ;
    public final void rule__OctIntLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3752:1: ( rule__OctIntLit__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3753:2: rule__OctIntLit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group__3__Impl_in_rule__OctIntLit__Group__37678);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3759:1: rule__OctIntLit__Group__3__Impl : ( ( rule__OctIntLit__Group_3__0 )? ) ;
    public final void rule__OctIntLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3763:1: ( ( ( rule__OctIntLit__Group_3__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3764:1: ( ( rule__OctIntLit__Group_3__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3764:1: ( ( rule__OctIntLit__Group_3__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3765:1: ( rule__OctIntLit__Group_3__0 )?
            {
             before(grammarAccess.getOctIntLitAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3766:1: ( rule__OctIntLit__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==21||LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3766:2: rule__OctIntLit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__OctIntLit__Group_3__0_in_rule__OctIntLit__Group__3__Impl7705);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3784:1: rule__OctIntLit__Group_3__0 : rule__OctIntLit__Group_3__0__Impl rule__OctIntLit__Group_3__1 ;
    public final void rule__OctIntLit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3788:1: ( rule__OctIntLit__Group_3__0__Impl rule__OctIntLit__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3789:2: rule__OctIntLit__Group_3__0__Impl rule__OctIntLit__Group_3__1
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group_3__0__Impl_in_rule__OctIntLit__Group_3__07744);
            rule__OctIntLit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OctIntLit__Group_3__1_in_rule__OctIntLit__Group_3__07747);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3796:1: rule__OctIntLit__Group_3__0__Impl : ( ( rule__OctIntLit__Alternatives_3_0 ) ) ;
    public final void rule__OctIntLit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3800:1: ( ( ( rule__OctIntLit__Alternatives_3_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3801:1: ( ( rule__OctIntLit__Alternatives_3_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3801:1: ( ( rule__OctIntLit__Alternatives_3_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3802:1: ( rule__OctIntLit__Alternatives_3_0 )
            {
             before(grammarAccess.getOctIntLitAccess().getAlternatives_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3803:1: ( rule__OctIntLit__Alternatives_3_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3803:2: rule__OctIntLit__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__OctIntLit__Alternatives_3_0_in_rule__OctIntLit__Group_3__0__Impl7774);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3813:1: rule__OctIntLit__Group_3__1 : rule__OctIntLit__Group_3__1__Impl ;
    public final void rule__OctIntLit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3817:1: ( rule__OctIntLit__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3818:2: rule__OctIntLit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__OctIntLit__Group_3__1__Impl_in_rule__OctIntLit__Group_3__17804);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3824:1: rule__OctIntLit__Group_3__1__Impl : ( ( rule__OctIntLit__SizeAssignment_3_1 ) ) ;
    public final void rule__OctIntLit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3828:1: ( ( ( rule__OctIntLit__SizeAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3829:1: ( ( rule__OctIntLit__SizeAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3829:1: ( ( rule__OctIntLit__SizeAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3830:1: ( rule__OctIntLit__SizeAssignment_3_1 )
            {
             before(grammarAccess.getOctIntLitAccess().getSizeAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3831:1: ( rule__OctIntLit__SizeAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3831:2: rule__OctIntLit__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__OctIntLit__SizeAssignment_3_1_in_rule__OctIntLit__Group_3__1__Impl7831);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3845:1: rule__HexIntLit__Group__0 : rule__HexIntLit__Group__0__Impl rule__HexIntLit__Group__1 ;
    public final void rule__HexIntLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3849:1: ( rule__HexIntLit__Group__0__Impl rule__HexIntLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3850:2: rule__HexIntLit__Group__0__Impl rule__HexIntLit__Group__1
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group__0__Impl_in_rule__HexIntLit__Group__07865);
            rule__HexIntLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HexIntLit__Group__1_in_rule__HexIntLit__Group__07868);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3857:1: rule__HexIntLit__Group__0__Impl : ( () ) ;
    public final void rule__HexIntLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3861:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3862:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3862:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3863:1: ()
            {
             before(grammarAccess.getHexIntLitAccess().getHexIntLitAction_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3864:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3866:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3876:1: rule__HexIntLit__Group__1 : rule__HexIntLit__Group__1__Impl rule__HexIntLit__Group__2 ;
    public final void rule__HexIntLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3880:1: ( rule__HexIntLit__Group__1__Impl rule__HexIntLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3881:2: rule__HexIntLit__Group__1__Impl rule__HexIntLit__Group__2
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group__1__Impl_in_rule__HexIntLit__Group__17926);
            rule__HexIntLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HexIntLit__Group__2_in_rule__HexIntLit__Group__17929);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3888:1: rule__HexIntLit__Group__1__Impl : ( '0x' ) ;
    public final void rule__HexIntLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3892:1: ( ( '0x' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3893:1: ( '0x' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3893:1: ( '0x' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3894:1: '0x'
            {
             before(grammarAccess.getHexIntLitAccess().getXKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__HexIntLit__Group__1__Impl7957); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3907:1: rule__HexIntLit__Group__2 : rule__HexIntLit__Group__2__Impl rule__HexIntLit__Group__3 ;
    public final void rule__HexIntLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3911:1: ( rule__HexIntLit__Group__2__Impl rule__HexIntLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3912:2: rule__HexIntLit__Group__2__Impl rule__HexIntLit__Group__3
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group__2__Impl_in_rule__HexIntLit__Group__27988);
            rule__HexIntLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HexIntLit__Group__3_in_rule__HexIntLit__Group__27991);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3919:1: rule__HexIntLit__Group__2__Impl : ( ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* ) ) ;
    public final void rule__HexIntLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3923:1: ( ( ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3924:1: ( ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3924:1: ( ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3925:1: ( ( rule__HexIntLit__Alternatives_2 ) ) ( ( rule__HexIntLit__Alternatives_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3925:1: ( ( rule__HexIntLit__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3926:1: ( rule__HexIntLit__Alternatives_2 )
            {
             before(grammarAccess.getHexIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3927:1: ( rule__HexIntLit__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3927:2: rule__HexIntLit__Alternatives_2
            {
            pushFollow(FOLLOW_rule__HexIntLit__Alternatives_2_in_rule__HexIntLit__Group__2__Impl8020);
            rule__HexIntLit__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getHexIntLitAccess().getAlternatives_2()); 

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3930:1: ( ( rule__HexIntLit__Alternatives_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3931:1: ( rule__HexIntLit__Alternatives_2 )*
            {
             before(grammarAccess.getHexIntLitAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3932:1: ( rule__HexIntLit__Alternatives_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_HEX_DIGIT||LA42_0==17) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3932:2: rule__HexIntLit__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__HexIntLit__Alternatives_2_in_rule__HexIntLit__Group__2__Impl8032);
            	    rule__HexIntLit__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3943:1: rule__HexIntLit__Group__3 : rule__HexIntLit__Group__3__Impl ;
    public final void rule__HexIntLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3947:1: ( rule__HexIntLit__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3948:2: rule__HexIntLit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group__3__Impl_in_rule__HexIntLit__Group__38065);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3954:1: rule__HexIntLit__Group__3__Impl : ( ( rule__HexIntLit__Group_3__0 )? ) ;
    public final void rule__HexIntLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3958:1: ( ( ( rule__HexIntLit__Group_3__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3959:1: ( ( rule__HexIntLit__Group_3__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3959:1: ( ( rule__HexIntLit__Group_3__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3960:1: ( rule__HexIntLit__Group_3__0 )?
            {
             before(grammarAccess.getHexIntLitAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3961:1: ( rule__HexIntLit__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21||LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3961:2: rule__HexIntLit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__HexIntLit__Group_3__0_in_rule__HexIntLit__Group__3__Impl8092);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3979:1: rule__HexIntLit__Group_3__0 : rule__HexIntLit__Group_3__0__Impl rule__HexIntLit__Group_3__1 ;
    public final void rule__HexIntLit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3983:1: ( rule__HexIntLit__Group_3__0__Impl rule__HexIntLit__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3984:2: rule__HexIntLit__Group_3__0__Impl rule__HexIntLit__Group_3__1
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group_3__0__Impl_in_rule__HexIntLit__Group_3__08131);
            rule__HexIntLit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HexIntLit__Group_3__1_in_rule__HexIntLit__Group_3__08134);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3991:1: rule__HexIntLit__Group_3__0__Impl : ( ( rule__HexIntLit__Alternatives_3_0 ) ) ;
    public final void rule__HexIntLit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3995:1: ( ( ( rule__HexIntLit__Alternatives_3_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3996:1: ( ( rule__HexIntLit__Alternatives_3_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3996:1: ( ( rule__HexIntLit__Alternatives_3_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3997:1: ( rule__HexIntLit__Alternatives_3_0 )
            {
             before(grammarAccess.getHexIntLitAccess().getAlternatives_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3998:1: ( rule__HexIntLit__Alternatives_3_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3998:2: rule__HexIntLit__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__HexIntLit__Alternatives_3_0_in_rule__HexIntLit__Group_3__0__Impl8161);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4008:1: rule__HexIntLit__Group_3__1 : rule__HexIntLit__Group_3__1__Impl ;
    public final void rule__HexIntLit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4012:1: ( rule__HexIntLit__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4013:2: rule__HexIntLit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__HexIntLit__Group_3__1__Impl_in_rule__HexIntLit__Group_3__18191);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4019:1: rule__HexIntLit__Group_3__1__Impl : ( ( rule__HexIntLit__SizeAssignment_3_1 ) ) ;
    public final void rule__HexIntLit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4023:1: ( ( ( rule__HexIntLit__SizeAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4024:1: ( ( rule__HexIntLit__SizeAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4024:1: ( ( rule__HexIntLit__SizeAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4025:1: ( rule__HexIntLit__SizeAssignment_3_1 )
            {
             before(grammarAccess.getHexIntLitAccess().getSizeAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4026:1: ( rule__HexIntLit__SizeAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4026:2: rule__HexIntLit__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__HexIntLit__SizeAssignment_3_1_in_rule__HexIntLit__Group_3__1__Impl8218);
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


    // $ANTLR start "rule__StringLit__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4040:1: rule__StringLit__Group__0 : rule__StringLit__Group__0__Impl rule__StringLit__Group__1 ;
    public final void rule__StringLit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4044:1: ( rule__StringLit__Group__0__Impl rule__StringLit__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4045:2: rule__StringLit__Group__0__Impl rule__StringLit__Group__1
            {
            pushFollow(FOLLOW_rule__StringLit__Group__0__Impl_in_rule__StringLit__Group__08252);
            rule__StringLit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLit__Group__1_in_rule__StringLit__Group__08255);
            rule__StringLit__Group__1();

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
    // $ANTLR end "rule__StringLit__Group__0"


    // $ANTLR start "rule__StringLit__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4052:1: rule__StringLit__Group__0__Impl : ( () ) ;
    public final void rule__StringLit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4056:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4057:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4057:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4058:1: ()
            {
             before(grammarAccess.getStringLitAccess().getStringLitAction_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4059:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4061:1: 
            {
            }

             after(grammarAccess.getStringLitAccess().getStringLitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLit__Group__0__Impl"


    // $ANTLR start "rule__StringLit__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4071:1: rule__StringLit__Group__1 : rule__StringLit__Group__1__Impl rule__StringLit__Group__2 ;
    public final void rule__StringLit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4075:1: ( rule__StringLit__Group__1__Impl rule__StringLit__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4076:2: rule__StringLit__Group__1__Impl rule__StringLit__Group__2
            {
            pushFollow(FOLLOW_rule__StringLit__Group__1__Impl_in_rule__StringLit__Group__18313);
            rule__StringLit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLit__Group__2_in_rule__StringLit__Group__18316);
            rule__StringLit__Group__2();

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
    // $ANTLR end "rule__StringLit__Group__1"


    // $ANTLR start "rule__StringLit__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4083:1: rule__StringLit__Group__1__Impl : ( '\"' ) ;
    public final void rule__StringLit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4087:1: ( ( '\"' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4088:1: ( '\"' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4088:1: ( '\"' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4089:1: '\"'
            {
             before(grammarAccess.getStringLitAccess().getQuotationMarkKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__StringLit__Group__1__Impl8344); 
             after(grammarAccess.getStringLitAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLit__Group__1__Impl"


    // $ANTLR start "rule__StringLit__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4102:1: rule__StringLit__Group__2 : rule__StringLit__Group__2__Impl rule__StringLit__Group__3 ;
    public final void rule__StringLit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4106:1: ( rule__StringLit__Group__2__Impl rule__StringLit__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4107:2: rule__StringLit__Group__2__Impl rule__StringLit__Group__3
            {
            pushFollow(FOLLOW_rule__StringLit__Group__2__Impl_in_rule__StringLit__Group__28375);
            rule__StringLit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLit__Group__3_in_rule__StringLit__Group__28378);
            rule__StringLit__Group__3();

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
    // $ANTLR end "rule__StringLit__Group__2"


    // $ANTLR start "rule__StringLit__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4114:1: rule__StringLit__Group__2__Impl : ( ( rule__StringLit__CharsAssignment_2 )* ) ;
    public final void rule__StringLit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4118:1: ( ( ( rule__StringLit__CharsAssignment_2 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4119:1: ( ( rule__StringLit__CharsAssignment_2 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4119:1: ( ( rule__StringLit__CharsAssignment_2 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4120:1: ( rule__StringLit__CharsAssignment_2 )*
            {
             before(grammarAccess.getStringLitAccess().getCharsAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4121:1: ( rule__StringLit__CharsAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_NON_SPECIAL_CHAR||LA44_0==12||LA44_0==35) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4121:2: rule__StringLit__CharsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__StringLit__CharsAssignment_2_in_rule__StringLit__Group__2__Impl8405);
            	    rule__StringLit__CharsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getStringLitAccess().getCharsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLit__Group__2__Impl"


    // $ANTLR start "rule__StringLit__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4131:1: rule__StringLit__Group__3 : rule__StringLit__Group__3__Impl ;
    public final void rule__StringLit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4135:1: ( rule__StringLit__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4136:2: rule__StringLit__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringLit__Group__3__Impl_in_rule__StringLit__Group__38436);
            rule__StringLit__Group__3__Impl();

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
    // $ANTLR end "rule__StringLit__Group__3"


    // $ANTLR start "rule__StringLit__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4142:1: rule__StringLit__Group__3__Impl : ( '\"' ) ;
    public final void rule__StringLit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4146:1: ( ( '\"' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4147:1: ( '\"' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4147:1: ( '\"' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4148:1: '\"'
            {
             before(grammarAccess.getStringLitAccess().getQuotationMarkKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__StringLit__Group__3__Impl8464); 
             after(grammarAccess.getStringLitAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLit__Group__3__Impl"


    // $ANTLR start "rule__StringChar__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4169:1: rule__StringChar__Group_2__0 : rule__StringChar__Group_2__0__Impl rule__StringChar__Group_2__1 ;
    public final void rule__StringChar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4173:1: ( rule__StringChar__Group_2__0__Impl rule__StringChar__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4174:2: rule__StringChar__Group_2__0__Impl rule__StringChar__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringChar__Group_2__0__Impl_in_rule__StringChar__Group_2__08503);
            rule__StringChar__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringChar__Group_2__1_in_rule__StringChar__Group_2__08506);
            rule__StringChar__Group_2__1();

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
    // $ANTLR end "rule__StringChar__Group_2__0"


    // $ANTLR start "rule__StringChar__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4181:1: rule__StringChar__Group_2__0__Impl : ( '\\\\' ) ;
    public final void rule__StringChar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4185:1: ( ( '\\\\' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4186:1: ( '\\\\' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4186:1: ( '\\\\' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4187:1: '\\\\'
            {
             before(grammarAccess.getStringCharAccess().getReverseSolidusKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__StringChar__Group_2__0__Impl8534); 
             after(grammarAccess.getStringCharAccess().getReverseSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringChar__Group_2__0__Impl"


    // $ANTLR start "rule__StringChar__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4200:1: rule__StringChar__Group_2__1 : rule__StringChar__Group_2__1__Impl ;
    public final void rule__StringChar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4204:1: ( rule__StringChar__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4205:2: rule__StringChar__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringChar__Group_2__1__Impl_in_rule__StringChar__Group_2__18565);
            rule__StringChar__Group_2__1__Impl();

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
    // $ANTLR end "rule__StringChar__Group_2__1"


    // $ANTLR start "rule__StringChar__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4211:1: rule__StringChar__Group_2__1__Impl : ( ( rule__StringChar__CharAssignment_2_1 ) ) ;
    public final void rule__StringChar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4215:1: ( ( ( rule__StringChar__CharAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4216:1: ( ( rule__StringChar__CharAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4216:1: ( ( rule__StringChar__CharAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4217:1: ( rule__StringChar__CharAssignment_2_1 )
            {
             before(grammarAccess.getStringCharAccess().getCharAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4218:1: ( rule__StringChar__CharAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4218:2: rule__StringChar__CharAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringChar__CharAssignment_2_1_in_rule__StringChar__Group_2__1__Impl8592);
            rule__StringChar__CharAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStringCharAccess().getCharAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringChar__Group_2__1__Impl"


    // $ANTLR start "rule__StringChar__Group_3__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4232:1: rule__StringChar__Group_3__0 : rule__StringChar__Group_3__0__Impl rule__StringChar__Group_3__1 ;
    public final void rule__StringChar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4236:1: ( rule__StringChar__Group_3__0__Impl rule__StringChar__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4237:2: rule__StringChar__Group_3__0__Impl rule__StringChar__Group_3__1
            {
            pushFollow(FOLLOW_rule__StringChar__Group_3__0__Impl_in_rule__StringChar__Group_3__08626);
            rule__StringChar__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringChar__Group_3__1_in_rule__StringChar__Group_3__08629);
            rule__StringChar__Group_3__1();

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
    // $ANTLR end "rule__StringChar__Group_3__0"


    // $ANTLR start "rule__StringChar__Group_3__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4244:1: rule__StringChar__Group_3__0__Impl : ( '\\\\' ) ;
    public final void rule__StringChar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4248:1: ( ( '\\\\' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4249:1: ( '\\\\' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4249:1: ( '\\\\' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4250:1: '\\\\'
            {
             before(grammarAccess.getStringCharAccess().getReverseSolidusKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__StringChar__Group_3__0__Impl8657); 
             after(grammarAccess.getStringCharAccess().getReverseSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringChar__Group_3__0__Impl"


    // $ANTLR start "rule__StringChar__Group_3__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4263:1: rule__StringChar__Group_3__1 : rule__StringChar__Group_3__1__Impl ;
    public final void rule__StringChar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4267:1: ( rule__StringChar__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4268:2: rule__StringChar__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__StringChar__Group_3__1__Impl_in_rule__StringChar__Group_3__18688);
            rule__StringChar__Group_3__1__Impl();

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
    // $ANTLR end "rule__StringChar__Group_3__1"


    // $ANTLR start "rule__StringChar__Group_3__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4274:1: rule__StringChar__Group_3__1__Impl : ( ( rule__StringChar__EscapedCharAssignment_3_1 ) ) ;
    public final void rule__StringChar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4278:1: ( ( ( rule__StringChar__EscapedCharAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4279:1: ( ( rule__StringChar__EscapedCharAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4279:1: ( ( rule__StringChar__EscapedCharAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4280:1: ( rule__StringChar__EscapedCharAssignment_3_1 )
            {
             before(grammarAccess.getStringCharAccess().getEscapedCharAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4281:1: ( rule__StringChar__EscapedCharAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4281:2: rule__StringChar__EscapedCharAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StringChar__EscapedCharAssignment_3_1_in_rule__StringChar__Group_3__1__Impl8715);
            rule__StringChar__EscapedCharAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStringCharAccess().getEscapedCharAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringChar__Group_3__1__Impl"


    // $ANTLR start "rule__Crate__ItemsAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4296:1: rule__Crate__ItemsAssignment : ( ruleItemAndAttrs ) ;
    public final void rule__Crate__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4300:1: ( ( ruleItemAndAttrs ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4301:1: ( ruleItemAndAttrs )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4301:1: ( ruleItemAndAttrs )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4302:1: ruleItemAndAttrs
            {
             before(grammarAccess.getCrateAccess().getItemsItemAndAttrsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment8754);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4311:1: rule__ItemAttr__AttrsAssignment_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4315:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4316:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4316:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4317:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_18785);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4326:1: rule__ItemAttr__AttrsAssignment_2_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4330:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4331:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4331:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4332:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_18816);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4341:1: rule__AttrWithList__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__AttrWithList__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4345:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4346:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4346:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4347:1: RULE_IDENT
            {
             before(grammarAccess.getAttrWithListAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_08847); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4356:1: rule__AttrWithList__AttrsAssignment_2 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4360:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4361:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4361:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4362:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_28878);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4371:1: rule__AttrWithList__AttrsAssignment_3_1 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4375:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4376:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4376:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4377:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_18909);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4386:1: rule__LiteralAttr__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__LiteralAttr__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4390:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4391:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4391:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4392:1: RULE_IDENT
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_08940); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4401:1: rule__LiteralAttr__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__LiteralAttr__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4405:1: ( ( ruleLiteral ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4406:1: ( ruleLiteral )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4406:1: ( ruleLiteral )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4407:1: ruleLiteral
            {
             before(grammarAccess.getLiteralAttrAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_28971);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4416:1: rule__ItemAndAttrs__AttrsAssignment_0 : ( ruleItemAttr ) ;
    public final void rule__ItemAndAttrs__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4420:1: ( ( ruleItemAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4421:1: ( ruleItemAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4421:1: ( ruleItemAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4422:1: ruleItemAttr
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsItemAttrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_09002);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4431:1: rule__ItemAndAttrs__ItemAssignment_1 : ( ruleItem ) ;
    public final void rule__ItemAndAttrs__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4435:1: ( ( ruleItem ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4436:1: ( ruleItem )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4436:1: ( ruleItem )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4437:1: ruleItem
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_19033);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4446:1: rule__ModItem__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__ModItem__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4450:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4451:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4451:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4452:1: RULE_IDENT
            {
             before(grammarAccess.getModItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_19064); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4461:1: rule__CharLit__CharAssignment_1_0 : ( RULE_NON_SPECIAL_CHAR ) ;
    public final void rule__CharLit__CharAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4465:1: ( ( RULE_NON_SPECIAL_CHAR ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4466:1: ( RULE_NON_SPECIAL_CHAR )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4466:1: ( RULE_NON_SPECIAL_CHAR )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4467:1: RULE_NON_SPECIAL_CHAR
            {
             before(grammarAccess.getCharLitAccess().getCharNON_SPECIAL_CHARTerminalRuleCall_1_0_0()); 
            match(input,RULE_NON_SPECIAL_CHAR,FOLLOW_RULE_NON_SPECIAL_CHAR_in_rule__CharLit__CharAssignment_1_09095); 
             after(grammarAccess.getCharLitAccess().getCharNON_SPECIAL_CHARTerminalRuleCall_1_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CharLit__CharAssignment_1_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4476:1: rule__CharLit__CharAssignment_1_1 : ( ( '\"' ) ) ;
    public final void rule__CharLit__CharAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4480:1: ( ( ( '\"' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4481:1: ( ( '\"' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4481:1: ( ( '\"' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4482:1: ( '\"' )
            {
             before(grammarAccess.getCharLitAccess().getCharQuotationMarkKeyword_1_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4483:1: ( '\"' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4484:1: '\"'
            {
             before(grammarAccess.getCharLitAccess().getCharQuotationMarkKeyword_1_1_0()); 
            match(input,44,FOLLOW_44_in_rule__CharLit__CharAssignment_1_19131); 
             after(grammarAccess.getCharLitAccess().getCharQuotationMarkKeyword_1_1_0()); 

            }

             after(grammarAccess.getCharLitAccess().getCharQuotationMarkKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__CharAssignment_1_1"


    // $ANTLR start "rule__CharLit__CharAssignment_1_2_1_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4499:1: rule__CharLit__CharAssignment_1_2_1_0 : ( ( '\\'' ) ) ;
    public final void rule__CharLit__CharAssignment_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4503:1: ( ( ( '\\'' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4504:1: ( ( '\\'' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4504:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4505:1: ( '\\'' )
            {
             before(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_2_1_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4506:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4507:1: '\\''
            {
             before(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_2_1_0_0()); 
            match(input,35,FOLLOW_35_in_rule__CharLit__CharAssignment_1_2_1_09175); 
             after(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_2_1_0_0()); 

            }

             after(grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__CharAssignment_1_2_1_0"


    // $ANTLR start "rule__CharLit__EscapedCharAssignment_1_2_1_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4522:1: rule__CharLit__EscapedCharAssignment_1_2_1_1 : ( ruleEscapedChar ) ;
    public final void rule__CharLit__EscapedCharAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4526:1: ( ( ruleEscapedChar ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4527:1: ( ruleEscapedChar )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4527:1: ( ruleEscapedChar )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4528:1: ruleEscapedChar
            {
             before(grammarAccess.getCharLitAccess().getEscapedCharEscapedCharParserRuleCall_1_2_1_1_0()); 
            pushFollow(FOLLOW_ruleEscapedChar_in_rule__CharLit__EscapedCharAssignment_1_2_1_19214);
            ruleEscapedChar();

            state._fsp--;

             after(grammarAccess.getCharLitAccess().getEscapedCharEscapedCharParserRuleCall_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__EscapedCharAssignment_1_2_1_1"


    // $ANTLR start "rule__EscapedChar__CharAssignment_0_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4537:1: rule__EscapedChar__CharAssignment_0_1 : ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) ) ;
    public final void rule__EscapedChar__CharAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4541:1: ( ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4542:1: ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4542:1: ( ( rule__EscapedChar__CharAlternatives_0_1_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4543:1: ( rule__EscapedChar__CharAlternatives_0_1_0 )
            {
             before(grammarAccess.getEscapedCharAccess().getCharAlternatives_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4544:1: ( rule__EscapedChar__CharAlternatives_0_1_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4544:2: rule__EscapedChar__CharAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__EscapedChar__CharAlternatives_0_1_0_in_rule__EscapedChar__CharAssignment_0_19245);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4553:1: rule__EscapedChar__DigitsAssignment_1_2 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4557:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4558:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4558:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4559:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_2_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_29278); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4568:1: rule__EscapedChar__DigitsAssignment_1_3 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4572:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4573:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4573:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4574:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_3_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_39309); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4583:1: rule__EscapedChar__DigitsAssignment_2_2 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4587:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4588:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4588:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4589:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_2_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_29340); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4598:1: rule__EscapedChar__DigitsAssignment_2_3 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4602:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4603:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4603:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4604:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_3_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_39371); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4613:1: rule__EscapedChar__DigitsAssignment_2_4 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4617:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4618:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4618:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4619:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_4_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_49402); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4628:1: rule__EscapedChar__DigitsAssignment_2_5 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4632:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4633:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4633:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4634:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_5_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_59433); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4643:1: rule__EscapedChar__DigitsAssignment_3_2 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4647:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4648:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4648:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4649:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_2_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_29464); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4658:1: rule__EscapedChar__DigitsAssignment_3_3 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4662:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4663:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4663:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4664:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_3_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_39495); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4673:1: rule__EscapedChar__DigitsAssignment_3_4 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4677:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4678:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4678:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4679:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_4_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_49526); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4688:1: rule__EscapedChar__DigitsAssignment_3_5 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4692:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4693:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4693:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4694:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_5_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_59557); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4703:1: rule__EscapedChar__DigitsAssignment_3_6 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4707:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4708:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4708:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4709:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_6_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_69588); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4718:1: rule__EscapedChar__DigitsAssignment_3_7 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4722:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4723:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4723:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4724:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_7_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_79619); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4733:1: rule__EscapedChar__DigitsAssignment_3_8 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4737:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4738:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4738:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4739:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_8_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_89650); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4748:1: rule__EscapedChar__DigitsAssignment_3_9 : ( RULE_HEX_DIGIT ) ;
    public final void rule__EscapedChar__DigitsAssignment_3_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4752:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4753:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4753:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4754:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_9_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_99681); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4763:1: rule__FloatLit__DigitsAssignment_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4767:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4768:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4768:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4769:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_09712); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4778:1: rule__FloatLit__DigitsAssignment_1_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4782:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4783:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4783:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4784:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_1_09743); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4793:1: rule__FloatLit__DigitsAssignment_2_1_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4797:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4798:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4798:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4799:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_2_1_09774); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4808:1: rule__FloatLit__NegativeExpAssignment_3_1_1 : ( ( '-' ) ) ;
    public final void rule__FloatLit__NegativeExpAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4812:1: ( ( ( '-' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4813:1: ( ( '-' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4813:1: ( ( '-' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4814:1: ( '-' )
            {
             before(grammarAccess.getFloatLitAccess().getNegativeExpHyphenMinusKeyword_3_1_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4815:1: ( '-' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4816:1: '-'
            {
             before(grammarAccess.getFloatLitAccess().getNegativeExpHyphenMinusKeyword_3_1_1_0()); 
            match(input,45,FOLLOW_45_in_rule__FloatLit__NegativeExpAssignment_3_1_19810); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4831:1: rule__FloatLit__DigitsAssignment_3_2_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__FloatLit__DigitsAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4835:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4836:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4836:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4837:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_3_2_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_3_2_09849); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4846:1: rule__FloatLit__SizeAssignment_4_1 : ( ruleFloatSize ) ;
    public final void rule__FloatLit__SizeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4850:1: ( ( ruleFloatSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4851:1: ( ruleFloatSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4851:1: ( ruleFloatSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4852:1: ruleFloatSize
            {
             before(grammarAccess.getFloatLitAccess().getSizeFloatSizeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleFloatSize_in_rule__FloatLit__SizeAssignment_4_19880);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4861:1: rule__DecIntLit__DigitsAssignment_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__DecIntLit__DigitsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4865:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4866:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4866:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4867:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_09911); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4876:1: rule__DecIntLit__DigitsAssignment_1_0 : ( RULE_DEC_DIGIT ) ;
    public final void rule__DecIntLit__DigitsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4880:1: ( ( RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4881:1: ( RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4881:1: ( RULE_DEC_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4882:1: RULE_DEC_DIGIT
            {
             before(grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 
            match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_1_09942); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4891:1: rule__DecIntLit__UnsignedAssignment_2_0_1 : ( ( 'u' ) ) ;
    public final void rule__DecIntLit__UnsignedAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4895:1: ( ( ( 'u' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4896:1: ( ( 'u' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4896:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4897:1: ( 'u' )
            {
             before(grammarAccess.getDecIntLitAccess().getUnsignedUKeyword_2_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4898:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4899:1: 'u'
            {
             before(grammarAccess.getDecIntLitAccess().getUnsignedUKeyword_2_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__DecIntLit__UnsignedAssignment_2_0_19978); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4914:1: rule__DecIntLit__SizeAssignment_2_1 : ( ruleIntSize ) ;
    public final void rule__DecIntLit__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4918:1: ( ( ruleIntSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4919:1: ( ruleIntSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4919:1: ( ruleIntSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4920:1: ruleIntSize
            {
             before(grammarAccess.getDecIntLitAccess().getSizeIntSizeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntSize_in_rule__DecIntLit__SizeAssignment_2_110017);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4929:1: rule__BinIntLit__DigitsAssignment_2_0 : ( ( '0' ) ) ;
    public final void rule__BinIntLit__DigitsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4933:1: ( ( ( '0' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4934:1: ( ( '0' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4934:1: ( ( '0' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4935:1: ( '0' )
            {
             before(grammarAccess.getBinIntLitAccess().getDigits0Keyword_2_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4936:1: ( '0' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4937:1: '0'
            {
             before(grammarAccess.getBinIntLitAccess().getDigits0Keyword_2_0_0()); 
            match(input,16,FOLLOW_16_in_rule__BinIntLit__DigitsAssignment_2_010053); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4952:1: rule__BinIntLit__DigitsAssignment_2_1 : ( ( '1' ) ) ;
    public final void rule__BinIntLit__DigitsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4956:1: ( ( ( '1' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4957:1: ( ( '1' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4957:1: ( ( '1' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4958:1: ( '1' )
            {
             before(grammarAccess.getBinIntLitAccess().getDigits1Keyword_2_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4959:1: ( '1' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4960:1: '1'
            {
             before(grammarAccess.getBinIntLitAccess().getDigits1Keyword_2_1_0()); 
            match(input,46,FOLLOW_46_in_rule__BinIntLit__DigitsAssignment_2_110097); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4975:1: rule__BinIntLit__UnsignedAssignment_3_0_1 : ( ( 'u' ) ) ;
    public final void rule__BinIntLit__UnsignedAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4979:1: ( ( ( 'u' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4980:1: ( ( 'u' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4980:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4981:1: ( 'u' )
            {
             before(grammarAccess.getBinIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4982:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4983:1: 'u'
            {
             before(grammarAccess.getBinIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__BinIntLit__UnsignedAssignment_3_0_110141); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4998:1: rule__BinIntLit__SizeAssignment_3_1 : ( ruleIntSize ) ;
    public final void rule__BinIntLit__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5002:1: ( ( ruleIntSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5003:1: ( ruleIntSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5003:1: ( ruleIntSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5004:1: ruleIntSize
            {
             before(grammarAccess.getBinIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntSize_in_rule__BinIntLit__SizeAssignment_3_110180);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5013:1: rule__OctIntLit__DigitsAssignment_2_0 : ( RULE_OCT_DIGIT ) ;
    public final void rule__OctIntLit__DigitsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5017:1: ( ( RULE_OCT_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5018:1: ( RULE_OCT_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5018:1: ( RULE_OCT_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5019:1: RULE_OCT_DIGIT
            {
             before(grammarAccess.getOctIntLitAccess().getDigitsOCT_DIGITTerminalRuleCall_2_0_0()); 
            match(input,RULE_OCT_DIGIT,FOLLOW_RULE_OCT_DIGIT_in_rule__OctIntLit__DigitsAssignment_2_010211); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5028:1: rule__OctIntLit__UnsignedAssignment_3_0_1 : ( ( 'u' ) ) ;
    public final void rule__OctIntLit__UnsignedAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5032:1: ( ( ( 'u' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5033:1: ( ( 'u' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5033:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5034:1: ( 'u' )
            {
             before(grammarAccess.getOctIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5035:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5036:1: 'u'
            {
             before(grammarAccess.getOctIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__OctIntLit__UnsignedAssignment_3_0_110247); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5051:1: rule__OctIntLit__SizeAssignment_3_1 : ( ruleIntSize ) ;
    public final void rule__OctIntLit__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5055:1: ( ( ruleIntSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5056:1: ( ruleIntSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5056:1: ( ruleIntSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5057:1: ruleIntSize
            {
             before(grammarAccess.getOctIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntSize_in_rule__OctIntLit__SizeAssignment_3_110286);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5066:1: rule__HexIntLit__DigitsAssignment_2_0 : ( RULE_HEX_DIGIT ) ;
    public final void rule__HexIntLit__DigitsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5070:1: ( ( RULE_HEX_DIGIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5071:1: ( RULE_HEX_DIGIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5071:1: ( RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5072:1: RULE_HEX_DIGIT
            {
             before(grammarAccess.getHexIntLitAccess().getDigitsHEX_DIGITTerminalRuleCall_2_0_0()); 
            match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_rule__HexIntLit__DigitsAssignment_2_010317); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5081:1: rule__HexIntLit__UnsignedAssignment_3_0_1 : ( ( 'u' ) ) ;
    public final void rule__HexIntLit__UnsignedAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5085:1: ( ( ( 'u' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5086:1: ( ( 'u' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5086:1: ( ( 'u' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5087:1: ( 'u' )
            {
             before(grammarAccess.getHexIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5088:1: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5089:1: 'u'
            {
             before(grammarAccess.getHexIntLitAccess().getUnsignedUKeyword_3_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__HexIntLit__UnsignedAssignment_3_0_110353); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5104:1: rule__HexIntLit__SizeAssignment_3_1 : ( ruleIntSize ) ;
    public final void rule__HexIntLit__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5108:1: ( ( ruleIntSize ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5109:1: ( ruleIntSize )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5109:1: ( ruleIntSize )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5110:1: ruleIntSize
            {
             before(grammarAccess.getHexIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntSize_in_rule__HexIntLit__SizeAssignment_3_110392);
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


    // $ANTLR start "rule__StringLit__CharsAssignment_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5119:1: rule__StringLit__CharsAssignment_2 : ( ruleStringChar ) ;
    public final void rule__StringLit__CharsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5123:1: ( ( ruleStringChar ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5124:1: ( ruleStringChar )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5124:1: ( ruleStringChar )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5125:1: ruleStringChar
            {
             before(grammarAccess.getStringLitAccess().getCharsStringCharParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStringChar_in_rule__StringLit__CharsAssignment_210423);
            ruleStringChar();

            state._fsp--;

             after(grammarAccess.getStringLitAccess().getCharsStringCharParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLit__CharsAssignment_2"


    // $ANTLR start "rule__StringChar__CharAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5134:1: rule__StringChar__CharAssignment_0 : ( RULE_NON_SPECIAL_CHAR ) ;
    public final void rule__StringChar__CharAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5138:1: ( ( RULE_NON_SPECIAL_CHAR ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5139:1: ( RULE_NON_SPECIAL_CHAR )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5139:1: ( RULE_NON_SPECIAL_CHAR )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5140:1: RULE_NON_SPECIAL_CHAR
            {
             before(grammarAccess.getStringCharAccess().getCharNON_SPECIAL_CHARTerminalRuleCall_0_0()); 
            match(input,RULE_NON_SPECIAL_CHAR,FOLLOW_RULE_NON_SPECIAL_CHAR_in_rule__StringChar__CharAssignment_010454); 
             after(grammarAccess.getStringCharAccess().getCharNON_SPECIAL_CHARTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringChar__CharAssignment_0"


    // $ANTLR start "rule__StringChar__CharAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5149:1: rule__StringChar__CharAssignment_1 : ( ( '\\'' ) ) ;
    public final void rule__StringChar__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5153:1: ( ( ( '\\'' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5154:1: ( ( '\\'' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5154:1: ( ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5155:1: ( '\\'' )
            {
             before(grammarAccess.getStringCharAccess().getCharApostropheKeyword_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5156:1: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5157:1: '\\''
            {
             before(grammarAccess.getStringCharAccess().getCharApostropheKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__StringChar__CharAssignment_110490); 
             after(grammarAccess.getStringCharAccess().getCharApostropheKeyword_1_0()); 

            }

             after(grammarAccess.getStringCharAccess().getCharApostropheKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringChar__CharAssignment_1"


    // $ANTLR start "rule__StringChar__CharAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5172:1: rule__StringChar__CharAssignment_2_1 : ( ( '\"' ) ) ;
    public final void rule__StringChar__CharAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5176:1: ( ( ( '\"' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5177:1: ( ( '\"' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5177:1: ( ( '\"' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5178:1: ( '\"' )
            {
             before(grammarAccess.getStringCharAccess().getCharQuotationMarkKeyword_2_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5179:1: ( '\"' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5180:1: '\"'
            {
             before(grammarAccess.getStringCharAccess().getCharQuotationMarkKeyword_2_1_0()); 
            match(input,44,FOLLOW_44_in_rule__StringChar__CharAssignment_2_110534); 
             after(grammarAccess.getStringCharAccess().getCharQuotationMarkKeyword_2_1_0()); 

            }

             after(grammarAccess.getStringCharAccess().getCharQuotationMarkKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringChar__CharAssignment_2_1"


    // $ANTLR start "rule__StringChar__EscapedCharAssignment_3_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5195:1: rule__StringChar__EscapedCharAssignment_3_1 : ( ruleEscapedChar ) ;
    public final void rule__StringChar__EscapedCharAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5199:1: ( ( ruleEscapedChar ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5200:1: ( ruleEscapedChar )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5200:1: ( ruleEscapedChar )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5201:1: ruleEscapedChar
            {
             before(grammarAccess.getStringCharAccess().getEscapedCharEscapedCharParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEscapedChar_in_rule__StringChar__EscapedCharAssignment_3_110573);
            ruleEscapedChar();

            state._fsp--;

             after(grammarAccess.getStringCharAccess().getEscapedCharEscapedCharParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringChar__EscapedCharAssignment_3_1"

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
            return "866:1: rule__NumberLit__Alternatives : ( ( ruleFloatLit ) | ( ruleIntLit ) );";
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
    public static final BitSet FOLLOW_ruleStringLit_in_entryRuleStringLit1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLit1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLit__Group__0_in_ruleStringLit1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringChar_in_entryRuleStringChar1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringChar1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__Alternatives_in_ruleStringChar1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatSize__Alternatives_in_ruleFloatSize1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntSize__Alternatives_in_ruleIntSize1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ModItem__Alternatives_21392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_21411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rule__Literal__Alternatives1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_rule__Literal__Alternatives1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__CharAssignment_1_0_in_rule__CharLit__Alternatives_11510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__CharAssignment_1_1_in_rule__CharLit__Alternatives_11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_2__0_in_rule__CharLit__Alternatives_11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__CharAssignment_1_2_1_0_in_rule__CharLit__Alternatives_1_2_11579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__EscapedCharAssignment_1_2_1_1_in_rule__CharLit__Alternatives_1_2_11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__0_in_rule__EscapedChar__Alternatives1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__0_in_rule__EscapedChar__Alternatives1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__0_in_rule__EscapedChar__Alternatives1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__0_in_rule__EscapedChar__Alternatives1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EscapedChar__CharAlternatives_0_1_01718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EscapedChar__CharAlternatives_0_1_01738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EscapedChar__CharAlternatives_0_1_01758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EscapedChar__CharAlternatives_0_1_01778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EscapedChar__CharAlternatives_0_1_01798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLit_in_rule__NumberLit__Alternatives1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLit_in_rule__NumberLit__Alternatives1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_1_0_in_rule__FloatLit__Alternatives_11881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FloatLit__Alternatives_11900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_2_1_0_in_rule__FloatLit__Alternatives_2_11934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FloatLit__Alternatives_2_11953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FloatLit__Alternatives_3_01988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FloatLit__Alternatives_3_02008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FloatLit__Alternatives_3_12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__NegativeExpAssignment_3_1_1_in_rule__FloatLit__Alternatives_3_12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_3_2_0_in_rule__FloatLit__Alternatives_3_22095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FloatLit__Alternatives_3_22114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecIntLit_in_rule__IntLit__Alternatives2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinIntLit_in_rule__IntLit__Alternatives2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctIntLit_in_rule__IntLit__Alternatives2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexIntLit_in_rule__IntLit__Alternatives2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__DigitsAssignment_1_0_in_rule__DecIntLit__Alternatives_12231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DecIntLit__Alternatives_12250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DecIntLit__Alternatives_2_02285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__UnsignedAssignment_2_0_1_in_rule__DecIntLit__Alternatives_2_02304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__DigitsAssignment_2_0_in_rule__BinIntLit__Alternatives_22337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__DigitsAssignment_2_1_in_rule__BinIntLit__Alternatives_22355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BinIntLit__Alternatives_22374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BinIntLit__Alternatives_3_02409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__UnsignedAssignment_3_0_1_in_rule__BinIntLit__Alternatives_3_02428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__DigitsAssignment_2_0_in_rule__OctIntLit__Alternatives_22461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OctIntLit__Alternatives_22480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__OctIntLit__Alternatives_3_02515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__UnsignedAssignment_3_0_1_in_rule__OctIntLit__Alternatives_3_02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__DigitsAssignment_2_0_in_rule__HexIntLit__Alternatives_22567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HexIntLit__Alternatives_22586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HexIntLit__Alternatives_3_02621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__UnsignedAssignment_3_0_1_in_rule__HexIntLit__Alternatives_3_02640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__CharAssignment_0_in_rule__StringChar__Alternatives2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__CharAssignment_1_in_rule__StringChar__Alternatives2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__Group_2__0_in_rule__StringChar__Alternatives2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__Group_3__0_in_rule__StringChar__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FloatSize__Alternatives2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FloatSize__Alternatives2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IntSize__Alternatives2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IntSize__Alternatives2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IntSize__Alternatives2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IntSize__Alternatives2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ItemAttr__Group__0__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12976 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__23036 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__23039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl3066 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__33097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ItemAttr__Group__3__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__03164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__03167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ItemAttr__Group_2__0__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__13226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__03287 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__03290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__13347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__13350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AttrWithList__Group__1__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__23409 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__23412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__33469 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__33472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl3499 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__43530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AttrWithList__Group__4__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__03599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__03602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AttrWithList__Group_3__0__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__13661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__03722 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__03725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__13782 = new BitSet(new long[]{0x00001E0800000080L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__13785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LiteralAttr__Group__1__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03907 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3937 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__04029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__04032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModItem__Group__0__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__14091 = new BitSet(new long[]{0x0000000200000800L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__14094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__24151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__04214 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__04217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModItem__Group_2_1__0__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__14276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ModItem__Group_2_1__1__Impl4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__0__Impl_in_rule__CharLit__Group__04339 = new BitSet(new long[]{0x0000100000001020L});
    public static final BitSet FOLLOW_rule__CharLit__Group__1_in_rule__CharLit__Group__04342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CharLit__Group__0__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__1__Impl_in_rule__CharLit__Group__14401 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CharLit__Group__2_in_rule__CharLit__Group__14404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Alternatives_1_in_rule__CharLit__Group__1__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group__2__Impl_in_rule__CharLit__Group__24461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CharLit__Group__2__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_2__0__Impl_in_rule__CharLit__Group_1_2__04526 = new BitSet(new long[]{0x000000780001F000L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_2__1_in_rule__CharLit__Group_1_2__04529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CharLit__Group_1_2__0__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Group_1_2__1__Impl_in_rule__CharLit__Group_1_2__14588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__Alternatives_1_2_1_in_rule__CharLit__Group_1_2__1__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__0__Impl_in_rule__EscapedChar__Group_0__04649 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__1_in_rule__EscapedChar__Group_0__04652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_0__1__Impl_in_rule__EscapedChar__Group_0__14710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__CharAssignment_0_1_in_rule__EscapedChar__Group_0__1__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__0__Impl_in_rule__EscapedChar__Group_1__04771 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__1_in_rule__EscapedChar__Group_1__04774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__1__Impl_in_rule__EscapedChar__Group_1__14832 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__2_in_rule__EscapedChar__Group_1__14835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EscapedChar__Group_1__1__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__2__Impl_in_rule__EscapedChar__Group_1__24894 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__3_in_rule__EscapedChar__Group_1__24897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_1_2_in_rule__EscapedChar__Group_1__2__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_1__3__Impl_in_rule__EscapedChar__Group_1__34954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_1_3_in_rule__EscapedChar__Group_1__3__Impl4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__0__Impl_in_rule__EscapedChar__Group_2__05019 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__1_in_rule__EscapedChar__Group_2__05022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__1__Impl_in_rule__EscapedChar__Group_2__15080 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__2_in_rule__EscapedChar__Group_2__15083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EscapedChar__Group_2__1__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__2__Impl_in_rule__EscapedChar__Group_2__25142 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__3_in_rule__EscapedChar__Group_2__25145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_2_in_rule__EscapedChar__Group_2__2__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__3__Impl_in_rule__EscapedChar__Group_2__35202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__4_in_rule__EscapedChar__Group_2__35205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_3_in_rule__EscapedChar__Group_2__3__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__4__Impl_in_rule__EscapedChar__Group_2__45262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__5_in_rule__EscapedChar__Group_2__45265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_4_in_rule__EscapedChar__Group_2__4__Impl5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_2__5__Impl_in_rule__EscapedChar__Group_2__55322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_2_5_in_rule__EscapedChar__Group_2__5__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__0__Impl_in_rule__EscapedChar__Group_3__05391 = new BitSet(new long[]{0x000000780001F000L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__1_in_rule__EscapedChar__Group_3__05394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__1__Impl_in_rule__EscapedChar__Group_3__15452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__2_in_rule__EscapedChar__Group_3__15455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EscapedChar__Group_3__1__Impl5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__2__Impl_in_rule__EscapedChar__Group_3__25514 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__3_in_rule__EscapedChar__Group_3__25517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_2_in_rule__EscapedChar__Group_3__2__Impl5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__3__Impl_in_rule__EscapedChar__Group_3__35574 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__4_in_rule__EscapedChar__Group_3__35577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_3_in_rule__EscapedChar__Group_3__3__Impl5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__4__Impl_in_rule__EscapedChar__Group_3__45634 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__5_in_rule__EscapedChar__Group_3__45637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_4_in_rule__EscapedChar__Group_3__4__Impl5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__5__Impl_in_rule__EscapedChar__Group_3__55694 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__6_in_rule__EscapedChar__Group_3__55697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_5_in_rule__EscapedChar__Group_3__5__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__6__Impl_in_rule__EscapedChar__Group_3__65754 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__7_in_rule__EscapedChar__Group_3__65757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_6_in_rule__EscapedChar__Group_3__6__Impl5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__7__Impl_in_rule__EscapedChar__Group_3__75814 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__8_in_rule__EscapedChar__Group_3__75817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_7_in_rule__EscapedChar__Group_3__7__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__8__Impl_in_rule__EscapedChar__Group_3__85874 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__9_in_rule__EscapedChar__Group_3__85877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_8_in_rule__EscapedChar__Group_3__8__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__Group_3__9__Impl_in_rule__EscapedChar__Group_3__95934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__DigitsAssignment_3_9_in_rule__EscapedChar__Group_3__9__Impl5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__0__Impl_in_rule__FloatLit__Group__06011 = new BitSet(new long[]{0x0000008000020080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__1_in_rule__FloatLit__Group__06014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__DigitsAssignment_0_in_rule__FloatLit__Group__0__Impl6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__1__Impl_in_rule__FloatLit__Group__16071 = new BitSet(new long[]{0x0000008000020080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__2_in_rule__FloatLit__Group__16074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_1_in_rule__FloatLit__Group__1__Impl6101 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__2__Impl_in_rule__FloatLit__Group__26132 = new BitSet(new long[]{0x00000100000C0000L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__3_in_rule__FloatLit__Group__26135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__0_in_rule__FloatLit__Group__2__Impl6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__3__Impl_in_rule__FloatLit__Group__36192 = new BitSet(new long[]{0x00000100000C0000L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__4_in_rule__FloatLit__Group__36195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__0_in_rule__FloatLit__Group__3__Impl6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group__4__Impl_in_rule__FloatLit__Group__46253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__0_in_rule__FloatLit__Group__4__Impl6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__0__Impl_in_rule__FloatLit__Group_2__06321 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__1_in_rule__FloatLit__Group_2__06324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FloatLit__Group_2__0__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_2__1__Impl_in_rule__FloatLit__Group_2__16383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl6412 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_2_1_in_rule__FloatLit__Group_2__1__Impl6424 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__0__Impl_in_rule__FloatLit__Group_3__06461 = new BitSet(new long[]{0x0000200000120080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__1_in_rule__FloatLit__Group_3__06464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_0_in_rule__FloatLit__Group_3__0__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__1__Impl_in_rule__FloatLit__Group_3__16521 = new BitSet(new long[]{0x0000200000120080L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__2_in_rule__FloatLit__Group_3__16524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_1_in_rule__FloatLit__Group_3__1__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_3__2__Impl_in_rule__FloatLit__Group_3__26582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl6611 = new BitSet(new long[]{0x0000200000120082L});
    public static final BitSet FOLLOW_rule__FloatLit__Alternatives_3_2_in_rule__FloatLit__Group_3__2__Impl6623 = new BitSet(new long[]{0x0000200000120082L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__0__Impl_in_rule__FloatLit__Group_4__06662 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__1_in_rule__FloatLit__Group_4__06665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FloatLit__Group_4__0__Impl6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__Group_4__1__Impl_in_rule__FloatLit__Group_4__16724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLit__SizeAssignment_4_1_in_rule__FloatLit__Group_4__1__Impl6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__0__Impl_in_rule__DecIntLit__Group__06785 = new BitSet(new long[]{0x0000002000220080L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__1_in_rule__DecIntLit__Group__06788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__DigitsAssignment_0_in_rule__DecIntLit__Group__0__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__1__Impl_in_rule__DecIntLit__Group__16845 = new BitSet(new long[]{0x0000002000220080L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__2_in_rule__DecIntLit__Group__16848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Alternatives_1_in_rule__DecIntLit__Group__1__Impl6875 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group__2__Impl_in_rule__DecIntLit__Group__26906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__0_in_rule__DecIntLit__Group__2__Impl6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__0__Impl_in_rule__DecIntLit__Group_2__06970 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__1_in_rule__DecIntLit__Group_2__06973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Alternatives_2_0_in_rule__DecIntLit__Group_2__0__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__Group_2__1__Impl_in_rule__DecIntLit__Group_2__17030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecIntLit__SizeAssignment_2_1_in_rule__DecIntLit__Group_2__1__Impl7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__0__Impl_in_rule__BinIntLit__Group__07091 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__1_in_rule__BinIntLit__Group__07094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__1__Impl_in_rule__BinIntLit__Group__17152 = new BitSet(new long[]{0x0000400000030000L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__2_in_rule__BinIntLit__Group__17155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__BinIntLit__Group__1__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__2__Impl_in_rule__BinIntLit__Group__27214 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__3_in_rule__BinIntLit__Group__27217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Alternatives_2_in_rule__BinIntLit__Group__2__Impl7246 = new BitSet(new long[]{0x0000400000030002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Alternatives_2_in_rule__BinIntLit__Group__2__Impl7258 = new BitSet(new long[]{0x0000400000030002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group__3__Impl_in_rule__BinIntLit__Group__37291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group_3__0_in_rule__BinIntLit__Group__3__Impl7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group_3__0__Impl_in_rule__BinIntLit__Group_3__07357 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group_3__1_in_rule__BinIntLit__Group_3__07360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Alternatives_3_0_in_rule__BinIntLit__Group_3__0__Impl7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__Group_3__1__Impl_in_rule__BinIntLit__Group_3__17417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinIntLit__SizeAssignment_3_1_in_rule__BinIntLit__Group_3__1__Impl7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__0__Impl_in_rule__OctIntLit__Group__07478 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__1_in_rule__OctIntLit__Group__07481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__1__Impl_in_rule__OctIntLit__Group__17539 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__2_in_rule__OctIntLit__Group__17542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__OctIntLit__Group__1__Impl7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__2__Impl_in_rule__OctIntLit__Group__27601 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__3_in_rule__OctIntLit__Group__27604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Alternatives_2_in_rule__OctIntLit__Group__2__Impl7633 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_rule__OctIntLit__Alternatives_2_in_rule__OctIntLit__Group__2__Impl7645 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group__3__Impl_in_rule__OctIntLit__Group__37678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group_3__0_in_rule__OctIntLit__Group__3__Impl7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group_3__0__Impl_in_rule__OctIntLit__Group_3__07744 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group_3__1_in_rule__OctIntLit__Group_3__07747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Alternatives_3_0_in_rule__OctIntLit__Group_3__0__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__Group_3__1__Impl_in_rule__OctIntLit__Group_3__17804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OctIntLit__SizeAssignment_3_1_in_rule__OctIntLit__Group_3__1__Impl7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__0__Impl_in_rule__HexIntLit__Group__07865 = new BitSet(new long[]{0x00000E0000000080L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__1_in_rule__HexIntLit__Group__07868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__1__Impl_in_rule__HexIntLit__Group__17926 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__2_in_rule__HexIntLit__Group__17929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__HexIntLit__Group__1__Impl7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__2__Impl_in_rule__HexIntLit__Group__27988 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__3_in_rule__HexIntLit__Group__27991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Alternatives_2_in_rule__HexIntLit__Group__2__Impl8020 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_rule__HexIntLit__Alternatives_2_in_rule__HexIntLit__Group__2__Impl8032 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group__3__Impl_in_rule__HexIntLit__Group__38065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group_3__0_in_rule__HexIntLit__Group__3__Impl8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group_3__0__Impl_in_rule__HexIntLit__Group_3__08131 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group_3__1_in_rule__HexIntLit__Group_3__08134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Alternatives_3_0_in_rule__HexIntLit__Group_3__0__Impl8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__Group_3__1__Impl_in_rule__HexIntLit__Group_3__18191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexIntLit__SizeAssignment_3_1_in_rule__HexIntLit__Group_3__1__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLit__Group__0__Impl_in_rule__StringLit__Group__08252 = new BitSet(new long[]{0x00001E0800000080L});
    public static final BitSet FOLLOW_rule__StringLit__Group__1_in_rule__StringLit__Group__08255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLit__Group__1__Impl_in_rule__StringLit__Group__18313 = new BitSet(new long[]{0x0000100800001020L});
    public static final BitSet FOLLOW_rule__StringLit__Group__2_in_rule__StringLit__Group__18316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__StringLit__Group__1__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLit__Group__2__Impl_in_rule__StringLit__Group__28375 = new BitSet(new long[]{0x0000100800001020L});
    public static final BitSet FOLLOW_rule__StringLit__Group__3_in_rule__StringLit__Group__28378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLit__CharsAssignment_2_in_rule__StringLit__Group__2__Impl8405 = new BitSet(new long[]{0x0000000800001022L});
    public static final BitSet FOLLOW_rule__StringLit__Group__3__Impl_in_rule__StringLit__Group__38436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__StringLit__Group__3__Impl8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__Group_2__0__Impl_in_rule__StringChar__Group_2__08503 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__StringChar__Group_2__1_in_rule__StringChar__Group_2__08506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StringChar__Group_2__0__Impl8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__Group_2__1__Impl_in_rule__StringChar__Group_2__18565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__CharAssignment_2_1_in_rule__StringChar__Group_2__1__Impl8592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__Group_3__0__Impl_in_rule__StringChar__Group_3__08626 = new BitSet(new long[]{0x000000780001F000L});
    public static final BitSet FOLLOW_rule__StringChar__Group_3__1_in_rule__StringChar__Group_3__08629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StringChar__Group_3__0__Impl8657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__Group_3__1__Impl_in_rule__StringChar__Group_3__18688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringChar__EscapedCharAssignment_3_1_in_rule__StringChar__Group_3__1__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_18785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_18816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_08847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_28878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_18909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_08940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_28971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_09002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_19033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_19064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NON_SPECIAL_CHAR_in_rule__CharLit__CharAssignment_1_09095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__CharLit__CharAssignment_1_19131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CharLit__CharAssignment_1_2_1_09175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedChar_in_rule__CharLit__EscapedCharAssignment_1_2_1_19214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedChar__CharAlternatives_0_1_0_in_rule__EscapedChar__CharAssignment_0_19245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_29278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_1_39309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_29340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_39371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_49402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_2_59433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_29464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_39495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_49526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_59557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_69588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_79619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_89650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__EscapedChar__DigitsAssignment_3_99681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_09712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_1_09743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_2_1_09774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FloatLit__NegativeExpAssignment_3_1_19810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__FloatLit__DigitsAssignment_3_2_09849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatSize_in_rule__FloatLit__SizeAssignment_4_19880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_09911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_rule__DecIntLit__DigitsAssignment_1_09942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DecIntLit__UnsignedAssignment_2_0_19978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntSize_in_rule__DecIntLit__SizeAssignment_2_110017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BinIntLit__DigitsAssignment_2_010053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__BinIntLit__DigitsAssignment_2_110097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BinIntLit__UnsignedAssignment_3_0_110141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntSize_in_rule__BinIntLit__SizeAssignment_3_110180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCT_DIGIT_in_rule__OctIntLit__DigitsAssignment_2_010211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__OctIntLit__UnsignedAssignment_3_0_110247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntSize_in_rule__OctIntLit__SizeAssignment_3_110286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_rule__HexIntLit__DigitsAssignment_2_010317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__HexIntLit__UnsignedAssignment_3_0_110353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntSize_in_rule__HexIntLit__SizeAssignment_3_110392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringChar_in_rule__StringLit__CharsAssignment_210423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NON_SPECIAL_CHAR_in_rule__StringChar__CharAssignment_010454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringChar__CharAssignment_110490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__StringChar__CharAssignment_2_110534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedChar_in_rule__StringChar__EscapedCharAssignment_3_110573 = new BitSet(new long[]{0x0000000000000002L});

}