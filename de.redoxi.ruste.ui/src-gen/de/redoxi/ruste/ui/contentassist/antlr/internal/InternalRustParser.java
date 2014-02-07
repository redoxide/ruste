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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FLOAT_LIT", "RULE_INT_LIT", "RULE_INT_TYPE", "RULE_FLOAT_TYPE", "RULE_BOOLEAN_TYPE", "RULE_MACHINE_TYPE", "RULE_UNIT_TYPE", "RULE_IDENT", "RULE_MUT_KEYWORD", "RULE_STRING_LIT", "RULE_CHAR_LIT", "RULE_INT_SIZE", "RULE_SIGNED_INT_TYPE", "RULE_UNSIGNED_INT_TYPE", "RULE_I8", "RULE_I16", "RULE_I32", "RULE_I64", "RULE_U8", "RULE_U16", "RULE_U32", "RULE_U64", "RULE_FLOAT_SIZE", "RULE_F32", "RULE_F64", "RULE_MACHINE_INT_TYPE", "RULE_MACHINE_UINT_TYPE", "RULE_UNICODE_CHAR", "RULE_UTF8_CHAR", "RULE_UTF16_CHAR", "RULE_UTF32_CHAR", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_DEC_INT_LIT", "RULE_BIN_INT_LIT", "RULE_OCT_INT_LIT", "RULE_HEX_INT_LIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "'priv'", "'pub'", "'#['", "']'", "','", "'('", "')'", "'='", "'mod'", "'{'", "'}'", "'fn'", "'<'", "'>'", "'->'", "':'", "'+'", "'_'", "'@'", "'~'", "'&'", "'['", "'..'", "'struct'", "'enum'", "';'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_FLOAT_TYPE=7;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DEC_INT_LIT=37;
    public static final int RULE_I8=18;
    public static final int RULE_SIGNED_INT_TYPE=16;
    public static final int RULE_MUT_KEYWORD=12;
    public static final int RULE_MACHINE_UINT_TYPE=30;
    public static final int RULE_UTF32_CHAR=34;
    public static final int RULE_UTF16_CHAR=33;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int RULE_I16=19;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_U8=22;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_U64=25;
    public static final int T__54=54;
    public static final int RULE_OCT_INT_LIT=39;
    public static final int T__59=59;
    public static final int RULE_BIN_INT_LIT=38;
    public static final int RULE_INT_LIT=5;
    public static final int RULE_XID_CONTINUE=43;
    public static final int RULE_MACHINE_INT_TYPE=29;
    public static final int T__50=50;
    public static final int RULE_U32=24;
    public static final int RULE_HEX_INT_LIT=40;
    public static final int RULE_F64=28;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_OCT_DIGIT=41;
    public static final int RULE_DEC_DIGIT=36;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_HEX_DIGIT=35;
    public static final int RULE_UNICODE_CHAR=31;
    public static final int RULE_UTF8_CHAR=32;
    public static final int RULE_I32=20;
    public static final int RULE_INT_SIZE=15;
    public static final int RULE_INT_TYPE=6;
    public static final int RULE_UNSIGNED_INT_TYPE=17;
    public static final int RULE_I64=21;
    public static final int RULE_XID_START=42;
    public static final int RULE_FLOAT_LIT=4;
    public static final int RULE_F32=27;
    public static final int RULE_IDENT=11;
    public static final int RULE_U16=23;
    public static final int RULE_MACHINE_TYPE=9;
    public static final int RULE_FLOAT_SIZE=26;
    public static final int RULE_STRING_LIT=13;
    public static final int RULE_CHAR_LIT=14;
    public static final int RULE_BOOLEAN_TYPE=8;
    public static final int RULE_UNIT_TYPE=10;

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

                if ( (LA1_0==46||LA1_0==52||LA1_0==55) ) {
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:237:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:241:2: ( ( ( rule__Item__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:242:1: ( ( rule__Item__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:242:1: ( ( rule__Item__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:243:1: ( rule__Item__Alternatives )
            {
             before(grammarAccess.getItemAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:244:1: ( rule__Item__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:244:2: rule__Item__Alternatives
            {
            pushFollow(FOLLOW_rule__Item__Alternatives_in_ruleItem455);
            rule__Item__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAlternatives()); 

            }


            }

        }
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
            pushFollow(FOLLOW_ruleModItem_in_entryRuleModItem482);
            ruleModItem();

            state._fsp--;

             after(grammarAccess.getModItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModItem489); 

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
            pushFollow(FOLLOW_rule__ModItem__Group__0_in_ruleModItem515);
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


    // $ANTLR start "entryRuleFnItem"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:284:1: entryRuleFnItem : ruleFnItem EOF ;
    public final void entryRuleFnItem() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:285:1: ( ruleFnItem EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:286:1: ruleFnItem EOF
            {
             before(grammarAccess.getFnItemRule()); 
            pushFollow(FOLLOW_ruleFnItem_in_entryRuleFnItem542);
            ruleFnItem();

            state._fsp--;

             after(grammarAccess.getFnItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFnItem549); 

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
    // $ANTLR end "entryRuleFnItem"


    // $ANTLR start "ruleFnItem"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:293:1: ruleFnItem : ( ( rule__FnItem__Group__0 ) ) ;
    public final void ruleFnItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:297:2: ( ( ( rule__FnItem__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:298:1: ( ( rule__FnItem__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:298:1: ( ( rule__FnItem__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:299:1: ( rule__FnItem__Group__0 )
            {
             before(grammarAccess.getFnItemAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:300:1: ( rule__FnItem__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:300:2: rule__FnItem__Group__0
            {
            pushFollow(FOLLOW_rule__FnItem__Group__0_in_ruleFnItem575);
            rule__FnItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFnItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFnItem"


    // $ANTLR start "entryRuleBlock"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:312:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:313:1: ( ruleBlock EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:314:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock602);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock609); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:321:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:325:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:326:1: ( ( rule__Block__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:326:1: ( ( rule__Block__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:327:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:328:1: ( rule__Block__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:328:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock635);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleGenericParamDecl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:340:1: entryRuleGenericParamDecl : ruleGenericParamDecl EOF ;
    public final void entryRuleGenericParamDecl() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:341:1: ( ruleGenericParamDecl EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:342:1: ruleGenericParamDecl EOF
            {
             before(grammarAccess.getGenericParamDeclRule()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl662);
            ruleGenericParamDecl();

            state._fsp--;

             after(grammarAccess.getGenericParamDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericParamDecl669); 

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
    // $ANTLR end "entryRuleGenericParamDecl"


    // $ANTLR start "ruleGenericParamDecl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:349:1: ruleGenericParamDecl : ( ( rule__GenericParamDecl__Group__0 ) ) ;
    public final void ruleGenericParamDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:353:2: ( ( ( rule__GenericParamDecl__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:354:1: ( ( rule__GenericParamDecl__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:354:1: ( ( rule__GenericParamDecl__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:355:1: ( rule__GenericParamDecl__Group__0 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:356:1: ( rule__GenericParamDecl__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:356:2: rule__GenericParamDecl__Group__0
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group__0_in_ruleGenericParamDecl695);
            rule__GenericParamDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenericParamDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericParamDecl"


    // $ANTLR start "entryRuleArg"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:368:1: entryRuleArg : ruleArg EOF ;
    public final void entryRuleArg() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:369:1: ( ruleArg EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:370:1: ruleArg EOF
            {
             before(grammarAccess.getArgRule()); 
            pushFollow(FOLLOW_ruleArg_in_entryRuleArg722);
            ruleArg();

            state._fsp--;

             after(grammarAccess.getArgRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg729); 

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
    // $ANTLR end "entryRuleArg"


    // $ANTLR start "ruleArg"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:377:1: ruleArg : ( ( rule__Arg__Group__0 ) ) ;
    public final void ruleArg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:381:2: ( ( ( rule__Arg__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:382:1: ( ( rule__Arg__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:382:1: ( ( rule__Arg__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:383:1: ( rule__Arg__Group__0 )
            {
             before(grammarAccess.getArgAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:384:1: ( rule__Arg__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:384:2: rule__Arg__Group__0
            {
            pushFollow(FOLLOW_rule__Arg__Group__0_in_ruleArg755);
            rule__Arg__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArg"


    // $ANTLR start "entryRulePat"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:396:1: entryRulePat : rulePat EOF ;
    public final void entryRulePat() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:397:1: ( rulePat EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:398:1: rulePat EOF
            {
             before(grammarAccess.getPatRule()); 
            pushFollow(FOLLOW_rulePat_in_entryRulePat782);
            rulePat();

            state._fsp--;

             after(grammarAccess.getPatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePat789); 

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
    // $ANTLR end "entryRulePat"


    // $ANTLR start "rulePat"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:405:1: rulePat : ( ( rule__Pat__Alternatives ) ) ;
    public final void rulePat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:409:2: ( ( ( rule__Pat__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:410:1: ( ( rule__Pat__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:410:1: ( ( rule__Pat__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:411:1: ( rule__Pat__Alternatives )
            {
             before(grammarAccess.getPatAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:412:1: ( rule__Pat__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:412:2: rule__Pat__Alternatives
            {
            pushFollow(FOLLOW_rule__Pat__Alternatives_in_rulePat815);
            rule__Pat__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePat"


    // $ANTLR start "entryRulePatWildcard"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:424:1: entryRulePatWildcard : rulePatWildcard EOF ;
    public final void entryRulePatWildcard() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:425:1: ( rulePatWildcard EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:426:1: rulePatWildcard EOF
            {
             before(grammarAccess.getPatWildcardRule()); 
            pushFollow(FOLLOW_rulePatWildcard_in_entryRulePatWildcard842);
            rulePatWildcard();

            state._fsp--;

             after(grammarAccess.getPatWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatWildcard849); 

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
    // $ANTLR end "entryRulePatWildcard"


    // $ANTLR start "rulePatWildcard"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:433:1: rulePatWildcard : ( ( rule__PatWildcard__Group__0 ) ) ;
    public final void rulePatWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:437:2: ( ( ( rule__PatWildcard__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:438:1: ( ( rule__PatWildcard__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:438:1: ( ( rule__PatWildcard__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:439:1: ( rule__PatWildcard__Group__0 )
            {
             before(grammarAccess.getPatWildcardAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:440:1: ( rule__PatWildcard__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:440:2: rule__PatWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__PatWildcard__Group__0_in_rulePatWildcard875);
            rule__PatWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatWildcard"


    // $ANTLR start "entryRulePatIdent"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:452:1: entryRulePatIdent : rulePatIdent EOF ;
    public final void entryRulePatIdent() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:453:1: ( rulePatIdent EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:454:1: rulePatIdent EOF
            {
             before(grammarAccess.getPatIdentRule()); 
            pushFollow(FOLLOW_rulePatIdent_in_entryRulePatIdent902);
            rulePatIdent();

            state._fsp--;

             after(grammarAccess.getPatIdentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatIdent909); 

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
    // $ANTLR end "entryRulePatIdent"


    // $ANTLR start "rulePatIdent"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:461:1: rulePatIdent : ( ( rule__PatIdent__Group__0 ) ) ;
    public final void rulePatIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:465:2: ( ( ( rule__PatIdent__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:466:1: ( ( rule__PatIdent__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:466:1: ( ( rule__PatIdent__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:467:1: ( rule__PatIdent__Group__0 )
            {
             before(grammarAccess.getPatIdentAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:468:1: ( rule__PatIdent__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:468:2: rule__PatIdent__Group__0
            {
            pushFollow(FOLLOW_rule__PatIdent__Group__0_in_rulePatIdent935);
            rule__PatIdent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatIdentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatIdent"


    // $ANTLR start "entryRulePatBoxed"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:480:1: entryRulePatBoxed : rulePatBoxed EOF ;
    public final void entryRulePatBoxed() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:481:1: ( rulePatBoxed EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:482:1: rulePatBoxed EOF
            {
             before(grammarAccess.getPatBoxedRule()); 
            pushFollow(FOLLOW_rulePatBoxed_in_entryRulePatBoxed962);
            rulePatBoxed();

            state._fsp--;

             after(grammarAccess.getPatBoxedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBoxed969); 

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
    // $ANTLR end "entryRulePatBoxed"


    // $ANTLR start "rulePatBoxed"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:489:1: rulePatBoxed : ( ( rule__PatBoxed__Group__0 ) ) ;
    public final void rulePatBoxed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:493:2: ( ( ( rule__PatBoxed__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:494:1: ( ( rule__PatBoxed__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:494:1: ( ( rule__PatBoxed__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:495:1: ( rule__PatBoxed__Group__0 )
            {
             before(grammarAccess.getPatBoxedAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:496:1: ( rule__PatBoxed__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:496:2: rule__PatBoxed__Group__0
            {
            pushFollow(FOLLOW_rule__PatBoxed__Group__0_in_rulePatBoxed995);
            rule__PatBoxed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatBoxedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatBoxed"


    // $ANTLR start "entryRulePatOwned"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:508:1: entryRulePatOwned : rulePatOwned EOF ;
    public final void entryRulePatOwned() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:509:1: ( rulePatOwned EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:510:1: rulePatOwned EOF
            {
             before(grammarAccess.getPatOwnedRule()); 
            pushFollow(FOLLOW_rulePatOwned_in_entryRulePatOwned1022);
            rulePatOwned();

            state._fsp--;

             after(grammarAccess.getPatOwnedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatOwned1029); 

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
    // $ANTLR end "entryRulePatOwned"


    // $ANTLR start "rulePatOwned"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:517:1: rulePatOwned : ( ( rule__PatOwned__Group__0 ) ) ;
    public final void rulePatOwned() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:521:2: ( ( ( rule__PatOwned__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:522:1: ( ( rule__PatOwned__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:522:1: ( ( rule__PatOwned__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:523:1: ( rule__PatOwned__Group__0 )
            {
             before(grammarAccess.getPatOwnedAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:524:1: ( rule__PatOwned__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:524:2: rule__PatOwned__Group__0
            {
            pushFollow(FOLLOW_rule__PatOwned__Group__0_in_rulePatOwned1055);
            rule__PatOwned__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatOwnedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatOwned"


    // $ANTLR start "entryRulePatBorrowed"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:536:1: entryRulePatBorrowed : rulePatBorrowed EOF ;
    public final void entryRulePatBorrowed() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:537:1: ( rulePatBorrowed EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:538:1: rulePatBorrowed EOF
            {
             before(grammarAccess.getPatBorrowedRule()); 
            pushFollow(FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed1082);
            rulePatBorrowed();

            state._fsp--;

             after(grammarAccess.getPatBorrowedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBorrowed1089); 

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
    // $ANTLR end "entryRulePatBorrowed"


    // $ANTLR start "rulePatBorrowed"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:545:1: rulePatBorrowed : ( ( rule__PatBorrowed__Group__0 ) ) ;
    public final void rulePatBorrowed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:549:2: ( ( ( rule__PatBorrowed__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:550:1: ( ( rule__PatBorrowed__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:550:1: ( ( rule__PatBorrowed__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:551:1: ( rule__PatBorrowed__Group__0 )
            {
             before(grammarAccess.getPatBorrowedAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:552:1: ( rule__PatBorrowed__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:552:2: rule__PatBorrowed__Group__0
            {
            pushFollow(FOLLOW_rule__PatBorrowed__Group__0_in_rulePatBorrowed1115);
            rule__PatBorrowed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatBorrowedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatBorrowed"


    // $ANTLR start "entryRulePatTuple"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:564:1: entryRulePatTuple : rulePatTuple EOF ;
    public final void entryRulePatTuple() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:565:1: ( rulePatTuple EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:566:1: rulePatTuple EOF
            {
             before(grammarAccess.getPatTupleRule()); 
            pushFollow(FOLLOW_rulePatTuple_in_entryRulePatTuple1142);
            rulePatTuple();

            state._fsp--;

             after(grammarAccess.getPatTupleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatTuple1149); 

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
    // $ANTLR end "entryRulePatTuple"


    // $ANTLR start "rulePatTuple"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:573:1: rulePatTuple : ( ( rule__PatTuple__Group__0 ) ) ;
    public final void rulePatTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:577:2: ( ( ( rule__PatTuple__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:578:1: ( ( rule__PatTuple__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:578:1: ( ( rule__PatTuple__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:579:1: ( rule__PatTuple__Group__0 )
            {
             before(grammarAccess.getPatTupleAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:580:1: ( rule__PatTuple__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:580:2: rule__PatTuple__Group__0
            {
            pushFollow(FOLLOW_rule__PatTuple__Group__0_in_rulePatTuple1175);
            rule__PatTuple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatTupleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatTuple"


    // $ANTLR start "entryRulePatVector"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:592:1: entryRulePatVector : rulePatVector EOF ;
    public final void entryRulePatVector() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:593:1: ( rulePatVector EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:594:1: rulePatVector EOF
            {
             before(grammarAccess.getPatVectorRule()); 
            pushFollow(FOLLOW_rulePatVector_in_entryRulePatVector1202);
            rulePatVector();

            state._fsp--;

             after(grammarAccess.getPatVectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatVector1209); 

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
    // $ANTLR end "entryRulePatVector"


    // $ANTLR start "rulePatVector"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:601:1: rulePatVector : ( ( rule__PatVector__Group__0 ) ) ;
    public final void rulePatVector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:605:2: ( ( ( rule__PatVector__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:606:1: ( ( rule__PatVector__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:606:1: ( ( rule__PatVector__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:607:1: ( rule__PatVector__Group__0 )
            {
             before(grammarAccess.getPatVectorAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:1: ( rule__PatVector__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:2: rule__PatVector__Group__0
            {
            pushFollow(FOLLOW_rule__PatVector__Group__0_in_rulePatVector1235);
            rule__PatVector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatVectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatVector"


    // $ANTLR start "entryRulePatLiteral"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:620:1: entryRulePatLiteral : rulePatLiteral EOF ;
    public final void entryRulePatLiteral() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:621:1: ( rulePatLiteral EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:622:1: rulePatLiteral EOF
            {
             before(grammarAccess.getPatLiteralRule()); 
            pushFollow(FOLLOW_rulePatLiteral_in_entryRulePatLiteral1262);
            rulePatLiteral();

            state._fsp--;

             after(grammarAccess.getPatLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatLiteral1269); 

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
    // $ANTLR end "entryRulePatLiteral"


    // $ANTLR start "rulePatLiteral"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:629:1: rulePatLiteral : ( ( rule__PatLiteral__LiteralAssignment ) ) ;
    public final void rulePatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:633:2: ( ( ( rule__PatLiteral__LiteralAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:634:1: ( ( rule__PatLiteral__LiteralAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:634:1: ( ( rule__PatLiteral__LiteralAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:635:1: ( rule__PatLiteral__LiteralAssignment )
            {
             before(grammarAccess.getPatLiteralAccess().getLiteralAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:636:1: ( rule__PatLiteral__LiteralAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:636:2: rule__PatLiteral__LiteralAssignment
            {
            pushFollow(FOLLOW_rule__PatLiteral__LiteralAssignment_in_rulePatLiteral1295);
            rule__PatLiteral__LiteralAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPatLiteralAccess().getLiteralAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatLiteral"


    // $ANTLR start "entryRulePatRange"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:648:1: entryRulePatRange : rulePatRange EOF ;
    public final void entryRulePatRange() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:649:1: ( rulePatRange EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:650:1: rulePatRange EOF
            {
             before(grammarAccess.getPatRangeRule()); 
            pushFollow(FOLLOW_rulePatRange_in_entryRulePatRange1322);
            rulePatRange();

            state._fsp--;

             after(grammarAccess.getPatRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatRange1329); 

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
    // $ANTLR end "entryRulePatRange"


    // $ANTLR start "rulePatRange"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:657:1: rulePatRange : ( ( rule__PatRange__Alternatives ) ) ;
    public final void rulePatRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:661:2: ( ( ( rule__PatRange__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:662:1: ( ( rule__PatRange__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:662:1: ( ( rule__PatRange__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:663:1: ( rule__PatRange__Alternatives )
            {
             before(grammarAccess.getPatRangeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:664:1: ( rule__PatRange__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:664:2: rule__PatRange__Alternatives
            {
            pushFollow(FOLLOW_rule__PatRange__Alternatives_in_rulePatRange1355);
            rule__PatRange__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatRangeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatRange"


    // $ANTLR start "entryRulePatCharRange"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:676:1: entryRulePatCharRange : rulePatCharRange EOF ;
    public final void entryRulePatCharRange() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:677:1: ( rulePatCharRange EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:678:1: rulePatCharRange EOF
            {
             before(grammarAccess.getPatCharRangeRule()); 
            pushFollow(FOLLOW_rulePatCharRange_in_entryRulePatCharRange1382);
            rulePatCharRange();

            state._fsp--;

             after(grammarAccess.getPatCharRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatCharRange1389); 

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
    // $ANTLR end "entryRulePatCharRange"


    // $ANTLR start "rulePatCharRange"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:685:1: rulePatCharRange : ( ( rule__PatCharRange__Group__0 ) ) ;
    public final void rulePatCharRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:689:2: ( ( ( rule__PatCharRange__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:690:1: ( ( rule__PatCharRange__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:690:1: ( ( rule__PatCharRange__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:691:1: ( rule__PatCharRange__Group__0 )
            {
             before(grammarAccess.getPatCharRangeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:692:1: ( rule__PatCharRange__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:692:2: rule__PatCharRange__Group__0
            {
            pushFollow(FOLLOW_rule__PatCharRange__Group__0_in_rulePatCharRange1415);
            rule__PatCharRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatCharRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatCharRange"


    // $ANTLR start "entryRulePatNumberRange"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:704:1: entryRulePatNumberRange : rulePatNumberRange EOF ;
    public final void entryRulePatNumberRange() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:705:1: ( rulePatNumberRange EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:706:1: rulePatNumberRange EOF
            {
             before(grammarAccess.getPatNumberRangeRule()); 
            pushFollow(FOLLOW_rulePatNumberRange_in_entryRulePatNumberRange1442);
            rulePatNumberRange();

            state._fsp--;

             after(grammarAccess.getPatNumberRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatNumberRange1449); 

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
    // $ANTLR end "entryRulePatNumberRange"


    // $ANTLR start "rulePatNumberRange"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:713:1: rulePatNumberRange : ( ( rule__PatNumberRange__Group__0 ) ) ;
    public final void rulePatNumberRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:717:2: ( ( ( rule__PatNumberRange__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:718:1: ( ( rule__PatNumberRange__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:718:1: ( ( rule__PatNumberRange__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:719:1: ( rule__PatNumberRange__Group__0 )
            {
             before(grammarAccess.getPatNumberRangeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:720:1: ( rule__PatNumberRange__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:720:2: rule__PatNumberRange__Group__0
            {
            pushFollow(FOLLOW_rule__PatNumberRange__Group__0_in_rulePatNumberRange1475);
            rule__PatNumberRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatNumberRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatNumberRange"


    // $ANTLR start "entryRuleType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:732:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:733:1: ( ruleType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:734:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1502);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1509); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:741:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:745:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:746:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:746:1: ( ( rule__Type__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:747:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:748:1: ( rule__Type__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:748:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1535);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:760:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:761:1: ( rulePrimitiveType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:762:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1562);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1569); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:769:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:773:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:774:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:774:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:775:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:776:1: ( rule__PrimitiveType__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:776:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1595);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleTupleType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:788:1: entryRuleTupleType : ruleTupleType EOF ;
    public final void entryRuleTupleType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:789:1: ( ruleTupleType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:790:1: ruleTupleType EOF
            {
             before(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_ruleTupleType_in_entryRuleTupleType1622);
            ruleTupleType();

            state._fsp--;

             after(grammarAccess.getTupleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleType1629); 

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
    // $ANTLR end "entryRuleTupleType"


    // $ANTLR start "ruleTupleType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:797:1: ruleTupleType : ( ( rule__TupleType__Group__0 ) ) ;
    public final void ruleTupleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:801:2: ( ( ( rule__TupleType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:802:1: ( ( rule__TupleType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:802:1: ( ( rule__TupleType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:803:1: ( rule__TupleType__Group__0 )
            {
             before(grammarAccess.getTupleTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:804:1: ( rule__TupleType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:804:2: rule__TupleType__Group__0
            {
            pushFollow(FOLLOW_rule__TupleType__Group__0_in_ruleTupleType1655);
            rule__TupleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTupleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTupleType"


    // $ANTLR start "entryRuleStructType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:816:1: entryRuleStructType : ruleStructType EOF ;
    public final void entryRuleStructType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:817:1: ( ruleStructType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:818:1: ruleStructType EOF
            {
             before(grammarAccess.getStructTypeRule()); 
            pushFollow(FOLLOW_ruleStructType_in_entryRuleStructType1682);
            ruleStructType();

            state._fsp--;

             after(grammarAccess.getStructTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructType1689); 

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
    // $ANTLR end "entryRuleStructType"


    // $ANTLR start "ruleStructType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:825:1: ruleStructType : ( ( rule__StructType__Group__0 ) ) ;
    public final void ruleStructType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:829:2: ( ( ( rule__StructType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:830:1: ( ( rule__StructType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:830:1: ( ( rule__StructType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:831:1: ( rule__StructType__Group__0 )
            {
             before(grammarAccess.getStructTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:832:1: ( rule__StructType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:832:2: rule__StructType__Group__0
            {
            pushFollow(FOLLOW_rule__StructType__Group__0_in_ruleStructType1715);
            rule__StructType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructType"


    // $ANTLR start "entryRuleBoxedPointer"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:844:1: entryRuleBoxedPointer : ruleBoxedPointer EOF ;
    public final void entryRuleBoxedPointer() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:845:1: ( ruleBoxedPointer EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:846:1: ruleBoxedPointer EOF
            {
             before(grammarAccess.getBoxedPointerRule()); 
            pushFollow(FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer1742);
            ruleBoxedPointer();

            state._fsp--;

             after(grammarAccess.getBoxedPointerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxedPointer1749); 

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
    // $ANTLR end "entryRuleBoxedPointer"


    // $ANTLR start "ruleBoxedPointer"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:853:1: ruleBoxedPointer : ( ( rule__BoxedPointer__Group__0 ) ) ;
    public final void ruleBoxedPointer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:857:2: ( ( ( rule__BoxedPointer__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:858:1: ( ( rule__BoxedPointer__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:858:1: ( ( rule__BoxedPointer__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:859:1: ( rule__BoxedPointer__Group__0 )
            {
             before(grammarAccess.getBoxedPointerAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:860:1: ( rule__BoxedPointer__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:860:2: rule__BoxedPointer__Group__0
            {
            pushFollow(FOLLOW_rule__BoxedPointer__Group__0_in_ruleBoxedPointer1775);
            rule__BoxedPointer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxedPointerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoxedPointer"


    // $ANTLR start "entryRuleOwnedPointer"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:872:1: entryRuleOwnedPointer : ruleOwnedPointer EOF ;
    public final void entryRuleOwnedPointer() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:873:1: ( ruleOwnedPointer EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:874:1: ruleOwnedPointer EOF
            {
             before(grammarAccess.getOwnedPointerRule()); 
            pushFollow(FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer1802);
            ruleOwnedPointer();

            state._fsp--;

             after(grammarAccess.getOwnedPointerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedPointer1809); 

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
    // $ANTLR end "entryRuleOwnedPointer"


    // $ANTLR start "ruleOwnedPointer"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:881:1: ruleOwnedPointer : ( ( rule__OwnedPointer__Group__0 ) ) ;
    public final void ruleOwnedPointer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:885:2: ( ( ( rule__OwnedPointer__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:886:1: ( ( rule__OwnedPointer__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:886:1: ( ( rule__OwnedPointer__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:887:1: ( rule__OwnedPointer__Group__0 )
            {
             before(grammarAccess.getOwnedPointerAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:888:1: ( rule__OwnedPointer__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:888:2: rule__OwnedPointer__Group__0
            {
            pushFollow(FOLLOW_rule__OwnedPointer__Group__0_in_ruleOwnedPointer1835);
            rule__OwnedPointer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOwnedPointerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedPointer"


    // $ANTLR start "entryRuleBorrowedPointer"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:900:1: entryRuleBorrowedPointer : ruleBorrowedPointer EOF ;
    public final void entryRuleBorrowedPointer() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:901:1: ( ruleBorrowedPointer EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:902:1: ruleBorrowedPointer EOF
            {
             before(grammarAccess.getBorrowedPointerRule()); 
            pushFollow(FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer1862);
            ruleBorrowedPointer();

            state._fsp--;

             after(grammarAccess.getBorrowedPointerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrowedPointer1869); 

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
    // $ANTLR end "entryRuleBorrowedPointer"


    // $ANTLR start "ruleBorrowedPointer"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:909:1: ruleBorrowedPointer : ( ( rule__BorrowedPointer__Group__0 ) ) ;
    public final void ruleBorrowedPointer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:913:2: ( ( ( rule__BorrowedPointer__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:914:1: ( ( rule__BorrowedPointer__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:914:1: ( ( rule__BorrowedPointer__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:915:1: ( rule__BorrowedPointer__Group__0 )
            {
             before(grammarAccess.getBorrowedPointerAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:916:1: ( rule__BorrowedPointer__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:916:2: rule__BorrowedPointer__Group__0
            {
            pushFollow(FOLLOW_rule__BorrowedPointer__Group__0_in_ruleBorrowedPointer1895);
            rule__BorrowedPointer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBorrowedPointerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBorrowedPointer"


    // $ANTLR start "entryRuleStructField"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:928:1: entryRuleStructField : ruleStructField EOF ;
    public final void entryRuleStructField() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:929:1: ( ruleStructField EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:930:1: ruleStructField EOF
            {
             before(grammarAccess.getStructFieldRule()); 
            pushFollow(FOLLOW_ruleStructField_in_entryRuleStructField1922);
            ruleStructField();

            state._fsp--;

             after(grammarAccess.getStructFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructField1929); 

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
    // $ANTLR end "entryRuleStructField"


    // $ANTLR start "ruleStructField"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:937:1: ruleStructField : ( ( rule__StructField__Group__0 ) ) ;
    public final void ruleStructField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:941:2: ( ( ( rule__StructField__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:942:1: ( ( rule__StructField__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:942:1: ( ( rule__StructField__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:943:1: ( rule__StructField__Group__0 )
            {
             before(grammarAccess.getStructFieldAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:944:1: ( rule__StructField__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:944:2: rule__StructField__Group__0
            {
            pushFollow(FOLLOW_rule__StructField__Group__0_in_ruleStructField1955);
            rule__StructField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructField"


    // $ANTLR start "entryRuleEnumType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:956:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:957:1: ( ruleEnumType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:958:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType1982);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType1989); 

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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:965:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:969:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:970:1: ( ( rule__EnumType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:970:1: ( ( rule__EnumType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:971:1: ( rule__EnumType__Group__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:972:1: ( rule__EnumType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:972:2: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0_in_ruleEnumType2015);
            rule__EnumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleVariant"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:984:1: entryRuleVariant : ruleVariant EOF ;
    public final void entryRuleVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:985:1: ( ruleVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:986:1: ruleVariant EOF
            {
             before(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_ruleVariant_in_entryRuleVariant2042);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariant2049); 

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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:993:1: ruleVariant : ( ( rule__Variant__Alternatives ) ) ;
    public final void ruleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:997:2: ( ( ( rule__Variant__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:998:1: ( ( rule__Variant__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:998:1: ( ( rule__Variant__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:999:1: ( rule__Variant__Alternatives )
            {
             before(grammarAccess.getVariantAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1000:1: ( rule__Variant__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1000:2: rule__Variant__Alternatives
            {
            pushFollow(FOLLOW_rule__Variant__Alternatives_in_ruleVariant2075);
            rule__Variant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleStructVariant"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1012:1: entryRuleStructVariant : ruleStructVariant EOF ;
    public final void entryRuleStructVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1013:1: ( ruleStructVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1014:1: ruleStructVariant EOF
            {
             before(grammarAccess.getStructVariantRule()); 
            pushFollow(FOLLOW_ruleStructVariant_in_entryRuleStructVariant2102);
            ruleStructVariant();

            state._fsp--;

             after(grammarAccess.getStructVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructVariant2109); 

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
    // $ANTLR end "entryRuleStructVariant"


    // $ANTLR start "ruleStructVariant"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1021:1: ruleStructVariant : ( ( rule__StructVariant__Group__0 ) ) ;
    public final void ruleStructVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1025:2: ( ( ( rule__StructVariant__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1026:1: ( ( rule__StructVariant__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1026:1: ( ( rule__StructVariant__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1027:1: ( rule__StructVariant__Group__0 )
            {
             before(grammarAccess.getStructVariantAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1028:1: ( rule__StructVariant__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1028:2: rule__StructVariant__Group__0
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__0_in_ruleStructVariant2135);
            rule__StructVariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructVariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructVariant"


    // $ANTLR start "entryRuleTupleVariant"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1040:1: entryRuleTupleVariant : ruleTupleVariant EOF ;
    public final void entryRuleTupleVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1041:1: ( ruleTupleVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1042:1: ruleTupleVariant EOF
            {
             before(grammarAccess.getTupleVariantRule()); 
            pushFollow(FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant2162);
            ruleTupleVariant();

            state._fsp--;

             after(grammarAccess.getTupleVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleVariant2169); 

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
    // $ANTLR end "entryRuleTupleVariant"


    // $ANTLR start "ruleTupleVariant"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1049:1: ruleTupleVariant : ( ( rule__TupleVariant__Group__0 ) ) ;
    public final void ruleTupleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1053:2: ( ( ( rule__TupleVariant__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1054:1: ( ( rule__TupleVariant__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1054:1: ( ( rule__TupleVariant__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1055:1: ( rule__TupleVariant__Group__0 )
            {
             before(grammarAccess.getTupleVariantAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1056:1: ( rule__TupleVariant__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1056:2: rule__TupleVariant__Group__0
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__0_in_ruleTupleVariant2195);
            rule__TupleVariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTupleVariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTupleVariant"


    // $ANTLR start "entryRuleUnitVariant"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1068:1: entryRuleUnitVariant : ruleUnitVariant EOF ;
    public final void entryRuleUnitVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1069:1: ( ruleUnitVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1070:1: ruleUnitVariant EOF
            {
             before(grammarAccess.getUnitVariantRule()); 
            pushFollow(FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant2222);
            ruleUnitVariant();

            state._fsp--;

             after(grammarAccess.getUnitVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitVariant2229); 

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
    // $ANTLR end "entryRuleUnitVariant"


    // $ANTLR start "ruleUnitVariant"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1077:1: ruleUnitVariant : ( ( rule__UnitVariant__IdentAssignment ) ) ;
    public final void ruleUnitVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1081:2: ( ( ( rule__UnitVariant__IdentAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1082:1: ( ( rule__UnitVariant__IdentAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1082:1: ( ( rule__UnitVariant__IdentAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1083:1: ( rule__UnitVariant__IdentAssignment )
            {
             before(grammarAccess.getUnitVariantAccess().getIdentAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1084:1: ( rule__UnitVariant__IdentAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1084:2: rule__UnitVariant__IdentAssignment
            {
            pushFollow(FOLLOW_rule__UnitVariant__IdentAssignment_in_ruleUnitVariant2255);
            rule__UnitVariant__IdentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnitVariantAccess().getIdentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitVariant"


    // $ANTLR start "entryRuleStringLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1096:1: entryRuleStringLit : ruleStringLit EOF ;
    public final void entryRuleStringLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1097:1: ( ruleStringLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1098:1: ruleStringLit EOF
            {
             before(grammarAccess.getStringLitRule()); 
            pushFollow(FOLLOW_ruleStringLit_in_entryRuleStringLit2282);
            ruleStringLit();

            state._fsp--;

             after(grammarAccess.getStringLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLit2289); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1105:1: ruleStringLit : ( ( rule__StringLit__ValueAssignment ) ) ;
    public final void ruleStringLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1109:2: ( ( ( rule__StringLit__ValueAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1110:1: ( ( rule__StringLit__ValueAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1110:1: ( ( rule__StringLit__ValueAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1111:1: ( rule__StringLit__ValueAssignment )
            {
             before(grammarAccess.getStringLitAccess().getValueAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1112:1: ( rule__StringLit__ValueAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1112:2: rule__StringLit__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLit__ValueAssignment_in_ruleStringLit2315);
            rule__StringLit__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLitAccess().getValueAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLiteral"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1124:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1125:1: ( ruleLiteral EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1126:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2342);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2349); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1133:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1137:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1138:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1138:1: ( ( rule__Literal__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1139:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1140:1: ( rule__Literal__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1140:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2375);
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


    // $ANTLR start "entryRuleNumberLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1152:1: entryRuleNumberLit : ruleNumberLit EOF ;
    public final void entryRuleNumberLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1153:1: ( ruleNumberLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1154:1: ruleNumberLit EOF
            {
             before(grammarAccess.getNumberLitRule()); 
            pushFollow(FOLLOW_ruleNumberLit_in_entryRuleNumberLit2402);
            ruleNumberLit();

            state._fsp--;

             after(grammarAccess.getNumberLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLit2409); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1161:1: ruleNumberLit : ( ( rule__NumberLit__ValueAssignment ) ) ;
    public final void ruleNumberLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1165:2: ( ( ( rule__NumberLit__ValueAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1166:1: ( ( rule__NumberLit__ValueAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1166:1: ( ( rule__NumberLit__ValueAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1167:1: ( rule__NumberLit__ValueAssignment )
            {
             before(grammarAccess.getNumberLitAccess().getValueAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1168:1: ( rule__NumberLit__ValueAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1168:2: rule__NumberLit__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberLit__ValueAssignment_in_ruleNumberLit2435);
            rule__NumberLit__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLitAccess().getValueAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCharLit"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1180:1: entryRuleCharLit : ruleCharLit EOF ;
    public final void entryRuleCharLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1181:1: ( ruleCharLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1182:1: ruleCharLit EOF
            {
             before(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit2462);
            ruleCharLit();

            state._fsp--;

             after(grammarAccess.getCharLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit2469); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1189:1: ruleCharLit : ( ( rule__CharLit__ValueAssignment ) ) ;
    public final void ruleCharLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1193:2: ( ( ( rule__CharLit__ValueAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1194:1: ( ( rule__CharLit__ValueAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1194:1: ( ( rule__CharLit__ValueAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1195:1: ( rule__CharLit__ValueAssignment )
            {
             before(grammarAccess.getCharLitAccess().getValueAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1196:1: ( rule__CharLit__ValueAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1196:2: rule__CharLit__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CharLit__ValueAssignment_in_ruleCharLit2495);
            rule__CharLit__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCharLitAccess().getValueAssignment()); 

            }


            }

        }
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


    // $ANTLR start "ruleVisibility"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1209:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1213:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1214:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1214:1: ( ( rule__Visibility__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1215:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1216:1: ( rule__Visibility__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1216:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility2532);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__Attr__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1227:1: rule__Attr__Alternatives : ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) );
    public final void rule__Attr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1231:1: ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==49) ) {
                    alt2=2;
                }
                else if ( (LA2_1==51) ) {
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1232:1: ( ruleLiteralAttr )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1232:1: ( ruleLiteralAttr )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1233:1: ruleLiteralAttr
                    {
                     before(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives2567);
                    ruleLiteralAttr();

                    state._fsp--;

                     after(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1238:6: ( ruleAttrWithList )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1238:6: ( ruleAttrWithList )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1239:1: ruleAttrWithList
                    {
                     before(grammarAccess.getAttrAccess().getAttrWithListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives2584);
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


    // $ANTLR start "rule__Item__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1249:1: rule__Item__Alternatives : ( ( ruleModItem ) | ( ruleFnItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1253:1: ( ( ruleModItem ) | ( ruleFnItem ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            else if ( (LA3_0==55) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1254:1: ( ruleModItem )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1254:1: ( ruleModItem )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1255:1: ruleModItem
                    {
                     before(grammarAccess.getItemAccess().getModItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleModItem_in_rule__Item__Alternatives2616);
                    ruleModItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getModItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1260:6: ( ruleFnItem )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1260:6: ( ruleFnItem )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1261:1: ruleFnItem
                    {
                     before(grammarAccess.getItemAccess().getFnItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFnItem_in_rule__Item__Alternatives2633);
                    ruleFnItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getFnItemParserRuleCall_1()); 

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
    // $ANTLR end "rule__Item__Alternatives"


    // $ANTLR start "rule__ModItem__Alternatives_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1271:1: rule__ModItem__Alternatives_2 : ( ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) ) | ( ( rule__ModItem__Group_2_1__0 ) ) );
    public final void rule__ModItem__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1275:1: ( ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) ) | ( ( rule__ModItem__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==69) ) {
                alt4=1;
            }
            else if ( (LA4_0==53) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1276:1: ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1276:1: ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1277:1: ( rule__ModItem__ExternalBodyAssignment_2_0 )
                    {
                     before(grammarAccess.getModItemAccess().getExternalBodyAssignment_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1278:1: ( rule__ModItem__ExternalBodyAssignment_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1278:2: rule__ModItem__ExternalBodyAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ModItem__ExternalBodyAssignment_2_0_in_rule__ModItem__Alternatives_22665);
                    rule__ModItem__ExternalBodyAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModItemAccess().getExternalBodyAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1282:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1282:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1283:1: ( rule__ModItem__Group_2_1__0 )
                    {
                     before(grammarAccess.getModItemAccess().getGroup_2_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1284:1: ( rule__ModItem__Group_2_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1284:2: rule__ModItem__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_22683);
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


    // $ANTLR start "rule__Pat__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1293:1: rule__Pat__Alternatives : ( ( rulePatWildcard ) | ( rulePatIdent ) | ( rulePatBoxed ) | ( rulePatOwned ) | ( rulePatBorrowed ) | ( rulePatTuple ) | ( rulePatVector ) | ( rulePatLiteral ) | ( rulePatRange ) );
    public final void rule__Pat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1297:1: ( ( rulePatWildcard ) | ( rulePatIdent ) | ( rulePatBoxed ) | ( rulePatOwned ) | ( rulePatBorrowed ) | ( rulePatTuple ) | ( rulePatVector ) | ( rulePatLiteral ) | ( rulePatRange ) )
            int alt5=9;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1298:1: ( rulePatWildcard )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1298:1: ( rulePatWildcard )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1299:1: rulePatWildcard
                    {
                     before(grammarAccess.getPatAccess().getPatWildcardParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePatWildcard_in_rule__Pat__Alternatives2716);
                    rulePatWildcard();

                    state._fsp--;

                     after(grammarAccess.getPatAccess().getPatWildcardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1304:6: ( rulePatIdent )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1304:6: ( rulePatIdent )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1305:1: rulePatIdent
                    {
                     before(grammarAccess.getPatAccess().getPatIdentParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePatIdent_in_rule__Pat__Alternatives2733);
                    rulePatIdent();

                    state._fsp--;

                     after(grammarAccess.getPatAccess().getPatIdentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1310:6: ( rulePatBoxed )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1310:6: ( rulePatBoxed )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1311:1: rulePatBoxed
                    {
                     before(grammarAccess.getPatAccess().getPatBoxedParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePatBoxed_in_rule__Pat__Alternatives2750);
                    rulePatBoxed();

                    state._fsp--;

                     after(grammarAccess.getPatAccess().getPatBoxedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1316:6: ( rulePatOwned )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1316:6: ( rulePatOwned )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1317:1: rulePatOwned
                    {
                     before(grammarAccess.getPatAccess().getPatOwnedParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePatOwned_in_rule__Pat__Alternatives2767);
                    rulePatOwned();

                    state._fsp--;

                     after(grammarAccess.getPatAccess().getPatOwnedParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1322:6: ( rulePatBorrowed )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1322:6: ( rulePatBorrowed )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1323:1: rulePatBorrowed
                    {
                     before(grammarAccess.getPatAccess().getPatBorrowedParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulePatBorrowed_in_rule__Pat__Alternatives2784);
                    rulePatBorrowed();

                    state._fsp--;

                     after(grammarAccess.getPatAccess().getPatBorrowedParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1328:6: ( rulePatTuple )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1328:6: ( rulePatTuple )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1329:1: rulePatTuple
                    {
                     before(grammarAccess.getPatAccess().getPatTupleParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulePatTuple_in_rule__Pat__Alternatives2801);
                    rulePatTuple();

                    state._fsp--;

                     after(grammarAccess.getPatAccess().getPatTupleParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1334:6: ( rulePatVector )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1334:6: ( rulePatVector )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1335:1: rulePatVector
                    {
                     before(grammarAccess.getPatAccess().getPatVectorParserRuleCall_6()); 
                    pushFollow(FOLLOW_rulePatVector_in_rule__Pat__Alternatives2818);
                    rulePatVector();

                    state._fsp--;

                     after(grammarAccess.getPatAccess().getPatVectorParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1340:6: ( rulePatLiteral )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1340:6: ( rulePatLiteral )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1341:1: rulePatLiteral
                    {
                     before(grammarAccess.getPatAccess().getPatLiteralParserRuleCall_7()); 
                    pushFollow(FOLLOW_rulePatLiteral_in_rule__Pat__Alternatives2835);
                    rulePatLiteral();

                    state._fsp--;

                     after(grammarAccess.getPatAccess().getPatLiteralParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1346:6: ( rulePatRange )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1346:6: ( rulePatRange )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1347:1: rulePatRange
                    {
                     before(grammarAccess.getPatAccess().getPatRangeParserRuleCall_8()); 
                    pushFollow(FOLLOW_rulePatRange_in_rule__Pat__Alternatives2852);
                    rulePatRange();

                    state._fsp--;

                     after(grammarAccess.getPatAccess().getPatRangeParserRuleCall_8()); 

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
    // $ANTLR end "rule__Pat__Alternatives"


    // $ANTLR start "rule__PatRange__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1357:1: rule__PatRange__Alternatives : ( ( rulePatCharRange ) | ( rulePatNumberRange ) );
    public final void rule__PatRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1361:1: ( ( rulePatCharRange ) | ( rulePatNumberRange ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CHAR_LIT) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_FLOAT_LIT && LA6_0<=RULE_INT_LIT)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1362:1: ( rulePatCharRange )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1362:1: ( rulePatCharRange )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1363:1: rulePatCharRange
                    {
                     before(grammarAccess.getPatRangeAccess().getPatCharRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePatCharRange_in_rule__PatRange__Alternatives2884);
                    rulePatCharRange();

                    state._fsp--;

                     after(grammarAccess.getPatRangeAccess().getPatCharRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1368:6: ( rulePatNumberRange )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1368:6: ( rulePatNumberRange )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1369:1: rulePatNumberRange
                    {
                     before(grammarAccess.getPatRangeAccess().getPatNumberRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePatNumberRange_in_rule__PatRange__Alternatives2901);
                    rulePatNumberRange();

                    state._fsp--;

                     after(grammarAccess.getPatRangeAccess().getPatNumberRangeParserRuleCall_1()); 

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
    // $ANTLR end "rule__PatRange__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1379:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleTupleType ) | ( ruleStructType ) | ( ruleEnumType ) | ( ruleBoxedPointer ) | ( ruleOwnedPointer ) | ( ruleBorrowedPointer ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1383:1: ( ( rulePrimitiveType ) | ( ruleTupleType ) | ( ruleStructType ) | ( ruleEnumType ) | ( ruleBoxedPointer ) | ( ruleOwnedPointer ) | ( ruleBorrowedPointer ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
            case RULE_FLOAT_TYPE:
            case RULE_BOOLEAN_TYPE:
            case RULE_MACHINE_TYPE:
            case RULE_UNIT_TYPE:
                {
                alt7=1;
                }
                break;
            case 49:
                {
                alt7=2;
                }
                break;
            case 67:
                {
                alt7=3;
                }
                break;
            case 68:
                {
                alt7=4;
                }
                break;
            case 62:
                {
                alt7=5;
                }
                break;
            case 63:
                {
                alt7=6;
                }
                break;
            case 64:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1384:1: ( rulePrimitiveType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1384:1: ( rulePrimitiveType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1385:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives2933);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1390:6: ( ruleTupleType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1390:6: ( ruleTupleType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1391:1: ruleTupleType
                    {
                     before(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTupleType_in_rule__Type__Alternatives2950);
                    ruleTupleType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1396:6: ( ruleStructType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1396:6: ( ruleStructType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1397:1: ruleStructType
                    {
                     before(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStructType_in_rule__Type__Alternatives2967);
                    ruleStructType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1402:6: ( ruleEnumType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1402:6: ( ruleEnumType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1403:1: ruleEnumType
                    {
                     before(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__Type__Alternatives2984);
                    ruleEnumType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1408:6: ( ruleBoxedPointer )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1408:6: ( ruleBoxedPointer )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1409:1: ruleBoxedPointer
                    {
                     before(grammarAccess.getTypeAccess().getBoxedPointerParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBoxedPointer_in_rule__Type__Alternatives3001);
                    ruleBoxedPointer();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBoxedPointerParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1414:6: ( ruleOwnedPointer )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1414:6: ( ruleOwnedPointer )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1415:1: ruleOwnedPointer
                    {
                     before(grammarAccess.getTypeAccess().getOwnedPointerParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleOwnedPointer_in_rule__Type__Alternatives3018);
                    ruleOwnedPointer();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getOwnedPointerParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1420:6: ( ruleBorrowedPointer )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1420:6: ( ruleBorrowedPointer )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1421:1: ruleBorrowedPointer
                    {
                     before(grammarAccess.getTypeAccess().getBorrowedPointerParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleBorrowedPointer_in_rule__Type__Alternatives3035);
                    ruleBorrowedPointer();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBorrowedPointerParserRuleCall_6()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1431:1: rule__PrimitiveType__Alternatives : ( ( ( rule__PrimitiveType__Group_0__0 ) ) | ( ( rule__PrimitiveType__Group_1__0 ) ) | ( ( rule__PrimitiveType__Group_2__0 ) ) | ( ( rule__PrimitiveType__Group_3__0 ) ) | ( ( rule__PrimitiveType__Group_4__0 ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1435:1: ( ( ( rule__PrimitiveType__Group_0__0 ) ) | ( ( rule__PrimitiveType__Group_1__0 ) ) | ( ( rule__PrimitiveType__Group_2__0 ) ) | ( ( rule__PrimitiveType__Group_3__0 ) ) | ( ( rule__PrimitiveType__Group_4__0 ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
                {
                alt8=1;
                }
                break;
            case RULE_FLOAT_TYPE:
                {
                alt8=2;
                }
                break;
            case RULE_BOOLEAN_TYPE:
                {
                alt8=3;
                }
                break;
            case RULE_MACHINE_TYPE:
                {
                alt8=4;
                }
                break;
            case RULE_UNIT_TYPE:
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1436:1: ( ( rule__PrimitiveType__Group_0__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1436:1: ( ( rule__PrimitiveType__Group_0__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1437:1: ( rule__PrimitiveType__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1438:1: ( rule__PrimitiveType__Group_0__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1438:2: rule__PrimitiveType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_0__0_in_rule__PrimitiveType__Alternatives3067);
                    rule__PrimitiveType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1442:6: ( ( rule__PrimitiveType__Group_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1442:6: ( ( rule__PrimitiveType__Group_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1443:1: ( rule__PrimitiveType__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1444:1: ( rule__PrimitiveType__Group_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1444:2: rule__PrimitiveType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_1__0_in_rule__PrimitiveType__Alternatives3085);
                    rule__PrimitiveType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1448:6: ( ( rule__PrimitiveType__Group_2__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1448:6: ( ( rule__PrimitiveType__Group_2__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1449:1: ( rule__PrimitiveType__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1450:1: ( rule__PrimitiveType__Group_2__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1450:2: rule__PrimitiveType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_2__0_in_rule__PrimitiveType__Alternatives3103);
                    rule__PrimitiveType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1454:6: ( ( rule__PrimitiveType__Group_3__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1454:6: ( ( rule__PrimitiveType__Group_3__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1455:1: ( rule__PrimitiveType__Group_3__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1456:1: ( rule__PrimitiveType__Group_3__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1456:2: rule__PrimitiveType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_3__0_in_rule__PrimitiveType__Alternatives3121);
                    rule__PrimitiveType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1460:6: ( ( rule__PrimitiveType__Group_4__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1460:6: ( ( rule__PrimitiveType__Group_4__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1461:1: ( rule__PrimitiveType__Group_4__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_4()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1462:1: ( rule__PrimitiveType__Group_4__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1462:2: rule__PrimitiveType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_4__0_in_rule__PrimitiveType__Alternatives3139);
                    rule__PrimitiveType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__Variant__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1471:1: rule__Variant__Alternatives : ( ( ruleStructVariant ) | ( ruleTupleVariant ) | ( ruleUnitVariant ) );
    public final void rule__Variant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1475:1: ( ( ruleStructVariant ) | ( ruleTupleVariant ) | ( ruleUnitVariant ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_IDENT) ) {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    alt9=2;
                    }
                    break;
                case 53:
                case 56:
                    {
                    alt9=1;
                    }
                    break;
                case EOF:
                case 48:
                case 54:
                    {
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1476:1: ( ruleStructVariant )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1476:1: ( ruleStructVariant )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1477:1: ruleStructVariant
                    {
                     before(grammarAccess.getVariantAccess().getStructVariantParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructVariant_in_rule__Variant__Alternatives3172);
                    ruleStructVariant();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getStructVariantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1482:6: ( ruleTupleVariant )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1482:6: ( ruleTupleVariant )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1483:1: ruleTupleVariant
                    {
                     before(grammarAccess.getVariantAccess().getTupleVariantParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTupleVariant_in_rule__Variant__Alternatives3189);
                    ruleTupleVariant();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getTupleVariantParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1488:6: ( ruleUnitVariant )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1488:6: ( ruleUnitVariant )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1489:1: ruleUnitVariant
                    {
                     before(grammarAccess.getVariantAccess().getUnitVariantParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUnitVariant_in_rule__Variant__Alternatives3206);
                    ruleUnitVariant();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getUnitVariantParserRuleCall_2()); 

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
    // $ANTLR end "rule__Variant__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1499:1: rule__Literal__Alternatives : ( ( ruleNumberLit ) | ( ruleCharLit ) | ( ruleStringLit ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1503:1: ( ( ruleNumberLit ) | ( ruleCharLit ) | ( ruleStringLit ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_FLOAT_LIT:
            case RULE_INT_LIT:
                {
                alt10=1;
                }
                break;
            case RULE_CHAR_LIT:
                {
                alt10=2;
                }
                break;
            case RULE_STRING_LIT:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1504:1: ( ruleNumberLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1504:1: ( ruleNumberLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1505:1: ruleNumberLit
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives3238);
                    ruleNumberLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1510:6: ( ruleCharLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1510:6: ( ruleCharLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1511:1: ruleCharLit
                    {
                     before(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCharLit_in_rule__Literal__Alternatives3255);
                    ruleCharLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1516:6: ( ruleStringLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1516:6: ( ruleStringLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1517:1: ruleStringLit
                    {
                     before(grammarAccess.getLiteralAccess().getStringLitParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringLit_in_rule__Literal__Alternatives3272);
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


    // $ANTLR start "rule__NumberLit__ValueAlternatives_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1527:1: rule__NumberLit__ValueAlternatives_0 : ( ( RULE_FLOAT_LIT ) | ( RULE_INT_LIT ) );
    public final void rule__NumberLit__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1531:1: ( ( RULE_FLOAT_LIT ) | ( RULE_INT_LIT ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_FLOAT_LIT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT_LIT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1532:1: ( RULE_FLOAT_LIT )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1532:1: ( RULE_FLOAT_LIT )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1533:1: RULE_FLOAT_LIT
                    {
                     before(grammarAccess.getNumberLitAccess().getValueFLOAT_LITTerminalRuleCall_0_0()); 
                    match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_rule__NumberLit__ValueAlternatives_03304); 
                     after(grammarAccess.getNumberLitAccess().getValueFLOAT_LITTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1538:6: ( RULE_INT_LIT )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1538:6: ( RULE_INT_LIT )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1539:1: RULE_INT_LIT
                    {
                     before(grammarAccess.getNumberLitAccess().getValueINT_LITTerminalRuleCall_0_1()); 
                    match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_rule__NumberLit__ValueAlternatives_03321); 
                     after(grammarAccess.getNumberLitAccess().getValueINT_LITTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__NumberLit__ValueAlternatives_0"


    // $ANTLR start "rule__Visibility__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1549:1: rule__Visibility__Alternatives : ( ( ( 'priv' ) ) | ( ( 'pub' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1553:1: ( ( ( 'priv' ) ) | ( ( 'pub' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            else if ( (LA12_0==45) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1554:1: ( ( 'priv' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1554:1: ( ( 'priv' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1555:1: ( 'priv' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1556:1: ( 'priv' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1556:3: 'priv'
                    {
                    match(input,44,FOLLOW_44_in_rule__Visibility__Alternatives3354); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1561:6: ( ( 'pub' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1561:6: ( ( 'pub' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1562:1: ( 'pub' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1563:1: ( 'pub' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1563:3: 'pub'
                    {
                    match(input,45,FOLLOW_45_in_rule__Visibility__Alternatives3375); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__ItemAttr__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1575:1: rule__ItemAttr__Group__0 : rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 ;
    public final void rule__ItemAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1579:1: ( rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1580:2: rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__03408);
            rule__ItemAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__03411);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1587:1: rule__ItemAttr__Group__0__Impl : ( '#[' ) ;
    public final void rule__ItemAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1591:1: ( ( '#[' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1592:1: ( '#[' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1592:1: ( '#[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1593:1: '#['
            {
             before(grammarAccess.getItemAttrAccess().getNumberSignLeftSquareBracketKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__ItemAttr__Group__0__Impl3439); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1606:1: rule__ItemAttr__Group__1 : rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 ;
    public final void rule__ItemAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1610:1: ( rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1611:2: rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__13470);
            rule__ItemAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__13473);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1618:1: rule__ItemAttr__Group__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_1 ) ) ;
    public final void rule__ItemAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1622:1: ( ( ( rule__ItemAttr__AttrsAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1623:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1623:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1624:1: ( rule__ItemAttr__AttrsAssignment_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1625:1: ( rule__ItemAttr__AttrsAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1625:2: rule__ItemAttr__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl3500);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1635:1: rule__ItemAttr__Group__2 : rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 ;
    public final void rule__ItemAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1639:1: ( rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1640:2: rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__23530);
            rule__ItemAttr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__23533);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1647:1: rule__ItemAttr__Group__2__Impl : ( ( rule__ItemAttr__Group_2__0 )* ) ;
    public final void rule__ItemAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1651:1: ( ( ( rule__ItemAttr__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1652:1: ( ( rule__ItemAttr__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1652:1: ( ( rule__ItemAttr__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1653:1: ( rule__ItemAttr__Group_2__0 )*
            {
             before(grammarAccess.getItemAttrAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1654:1: ( rule__ItemAttr__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==48) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1654:2: rule__ItemAttr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl3560);
            	    rule__ItemAttr__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1664:1: rule__ItemAttr__Group__3 : rule__ItemAttr__Group__3__Impl ;
    public final void rule__ItemAttr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1668:1: ( rule__ItemAttr__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1669:2: rule__ItemAttr__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__33591);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1675:1: rule__ItemAttr__Group__3__Impl : ( ']' ) ;
    public final void rule__ItemAttr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1679:1: ( ( ']' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1680:1: ( ']' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1680:1: ( ']' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1681:1: ']'
            {
             before(grammarAccess.getItemAttrAccess().getRightSquareBracketKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__ItemAttr__Group__3__Impl3619); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1702:1: rule__ItemAttr__Group_2__0 : rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 ;
    public final void rule__ItemAttr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1706:1: ( rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1707:2: rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__03658);
            rule__ItemAttr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__03661);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1714:1: rule__ItemAttr__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ItemAttr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1718:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1719:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1719:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1720:1: ','
            {
             before(grammarAccess.getItemAttrAccess().getCommaKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__ItemAttr__Group_2__0__Impl3689); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1733:1: rule__ItemAttr__Group_2__1 : rule__ItemAttr__Group_2__1__Impl ;
    public final void rule__ItemAttr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1737:1: ( rule__ItemAttr__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1738:2: rule__ItemAttr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__13720);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1744:1: rule__ItemAttr__Group_2__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) ;
    public final void rule__ItemAttr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1748:1: ( ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1749:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1749:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1750:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1751:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1751:2: rule__ItemAttr__AttrsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl3747);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1765:1: rule__AttrWithList__Group__0 : rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 ;
    public final void rule__AttrWithList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1769:1: ( rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1770:2: rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__03781);
            rule__AttrWithList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__03784);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1777:1: rule__AttrWithList__Group__0__Impl : ( ( rule__AttrWithList__IdentAssignment_0 ) ) ;
    public final void rule__AttrWithList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1781:1: ( ( ( rule__AttrWithList__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1782:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1782:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1783:1: ( rule__AttrWithList__IdentAssignment_0 )
            {
             before(grammarAccess.getAttrWithListAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1784:1: ( rule__AttrWithList__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1784:2: rule__AttrWithList__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl3811);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1794:1: rule__AttrWithList__Group__1 : rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 ;
    public final void rule__AttrWithList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1798:1: ( rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1799:2: rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__13841);
            rule__AttrWithList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__13844);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1806:1: rule__AttrWithList__Group__1__Impl : ( '(' ) ;
    public final void rule__AttrWithList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1810:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1811:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1811:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1812:1: '('
            {
             before(grammarAccess.getAttrWithListAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__AttrWithList__Group__1__Impl3872); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1825:1: rule__AttrWithList__Group__2 : rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 ;
    public final void rule__AttrWithList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1829:1: ( rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1830:2: rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__23903);
            rule__AttrWithList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__23906);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1837:1: rule__AttrWithList__Group__2__Impl : ( ( rule__AttrWithList__AttrsAssignment_2 ) ) ;
    public final void rule__AttrWithList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1841:1: ( ( ( rule__AttrWithList__AttrsAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1842:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1842:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1843:1: ( rule__AttrWithList__AttrsAssignment_2 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1844:1: ( rule__AttrWithList__AttrsAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1844:2: rule__AttrWithList__AttrsAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl3933);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1854:1: rule__AttrWithList__Group__3 : rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 ;
    public final void rule__AttrWithList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1858:1: ( rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1859:2: rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__33963);
            rule__AttrWithList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__33966);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1866:1: rule__AttrWithList__Group__3__Impl : ( ( rule__AttrWithList__Group_3__0 )* ) ;
    public final void rule__AttrWithList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1870:1: ( ( ( rule__AttrWithList__Group_3__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1871:1: ( ( rule__AttrWithList__Group_3__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1871:1: ( ( rule__AttrWithList__Group_3__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1872:1: ( rule__AttrWithList__Group_3__0 )*
            {
             before(grammarAccess.getAttrWithListAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1873:1: ( rule__AttrWithList__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==48) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1873:2: rule__AttrWithList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl3993);
            	    rule__AttrWithList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1883:1: rule__AttrWithList__Group__4 : rule__AttrWithList__Group__4__Impl ;
    public final void rule__AttrWithList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1887:1: ( rule__AttrWithList__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1888:2: rule__AttrWithList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__44024);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1894:1: rule__AttrWithList__Group__4__Impl : ( ')' ) ;
    public final void rule__AttrWithList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1898:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1899:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1899:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1900:1: ')'
            {
             before(grammarAccess.getAttrWithListAccess().getRightParenthesisKeyword_4()); 
            match(input,50,FOLLOW_50_in_rule__AttrWithList__Group__4__Impl4052); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1923:1: rule__AttrWithList__Group_3__0 : rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 ;
    public final void rule__AttrWithList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1927:1: ( rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1928:2: rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__04093);
            rule__AttrWithList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__04096);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1935:1: rule__AttrWithList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AttrWithList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1939:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1940:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1940:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1941:1: ','
            {
             before(grammarAccess.getAttrWithListAccess().getCommaKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__AttrWithList__Group_3__0__Impl4124); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1954:1: rule__AttrWithList__Group_3__1 : rule__AttrWithList__Group_3__1__Impl ;
    public final void rule__AttrWithList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1958:1: ( rule__AttrWithList__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1959:2: rule__AttrWithList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__14155);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1965:1: rule__AttrWithList__Group_3__1__Impl : ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) ;
    public final void rule__AttrWithList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1969:1: ( ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1970:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1970:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1971:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1972:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1972:2: rule__AttrWithList__AttrsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl4182);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1986:1: rule__LiteralAttr__Group__0 : rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 ;
    public final void rule__LiteralAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1990:1: ( rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1991:2: rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__04216);
            rule__LiteralAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__04219);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1998:1: rule__LiteralAttr__Group__0__Impl : ( ( rule__LiteralAttr__IdentAssignment_0 ) ) ;
    public final void rule__LiteralAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2002:1: ( ( ( rule__LiteralAttr__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2003:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2003:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2004:1: ( rule__LiteralAttr__IdentAssignment_0 )
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2005:1: ( rule__LiteralAttr__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2005:2: rule__LiteralAttr__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl4246);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2015:1: rule__LiteralAttr__Group__1 : rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 ;
    public final void rule__LiteralAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2019:1: ( rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2020:2: rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__14276);
            rule__LiteralAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__14279);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2027:1: rule__LiteralAttr__Group__1__Impl : ( '=' ) ;
    public final void rule__LiteralAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2031:1: ( ( '=' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2032:1: ( '=' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2032:1: ( '=' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2033:1: '='
            {
             before(grammarAccess.getLiteralAttrAccess().getEqualsSignKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__LiteralAttr__Group__1__Impl4307); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2046:1: rule__LiteralAttr__Group__2 : rule__LiteralAttr__Group__2__Impl ;
    public final void rule__LiteralAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2050:1: ( rule__LiteralAttr__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2051:2: rule__LiteralAttr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__24338);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2057:1: rule__LiteralAttr__Group__2__Impl : ( ( rule__LiteralAttr__ValueAssignment_2 ) ) ;
    public final void rule__LiteralAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2061:1: ( ( ( rule__LiteralAttr__ValueAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2062:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2062:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2063:1: ( rule__LiteralAttr__ValueAssignment_2 )
            {
             before(grammarAccess.getLiteralAttrAccess().getValueAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2064:1: ( rule__LiteralAttr__ValueAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2064:2: rule__LiteralAttr__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl4365);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2080:1: rule__ItemAndAttrs__Group__0 : rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 ;
    public final void rule__ItemAndAttrs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2084:1: ( rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2085:2: rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__04401);
            rule__ItemAndAttrs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__04404);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2092:1: rule__ItemAndAttrs__Group__0__Impl : ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) ;
    public final void rule__ItemAndAttrs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2096:1: ( ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2097:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2097:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2098:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2099:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2099:2: rule__ItemAndAttrs__AttrsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl4431);
            	    rule__ItemAndAttrs__AttrsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2109:1: rule__ItemAndAttrs__Group__1 : rule__ItemAndAttrs__Group__1__Impl ;
    public final void rule__ItemAndAttrs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2113:1: ( rule__ItemAndAttrs__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2114:2: rule__ItemAndAttrs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__14462);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2120:1: rule__ItemAndAttrs__Group__1__Impl : ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) ;
    public final void rule__ItemAndAttrs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2124:1: ( ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2125:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2125:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2126:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2127:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2127:2: rule__ItemAndAttrs__ItemAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl4489);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2141:1: rule__ModItem__Group__0 : rule__ModItem__Group__0__Impl rule__ModItem__Group__1 ;
    public final void rule__ModItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2145:1: ( rule__ModItem__Group__0__Impl rule__ModItem__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2146:2: rule__ModItem__Group__0__Impl rule__ModItem__Group__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__04523);
            rule__ModItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__04526);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2153:1: rule__ModItem__Group__0__Impl : ( 'mod' ) ;
    public final void rule__ModItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2157:1: ( ( 'mod' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2158:1: ( 'mod' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2158:1: ( 'mod' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2159:1: 'mod'
            {
             before(grammarAccess.getModItemAccess().getModKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__ModItem__Group__0__Impl4554); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2172:1: rule__ModItem__Group__1 : rule__ModItem__Group__1__Impl rule__ModItem__Group__2 ;
    public final void rule__ModItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2176:1: ( rule__ModItem__Group__1__Impl rule__ModItem__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2177:2: rule__ModItem__Group__1__Impl rule__ModItem__Group__2
            {
            pushFollow(FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__14585);
            rule__ModItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__14588);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2184:1: rule__ModItem__Group__1__Impl : ( ( rule__ModItem__IdentAssignment_1 ) ) ;
    public final void rule__ModItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2188:1: ( ( ( rule__ModItem__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2189:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2189:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2190:1: ( rule__ModItem__IdentAssignment_1 )
            {
             before(grammarAccess.getModItemAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2191:1: ( rule__ModItem__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2191:2: rule__ModItem__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl4615);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2201:1: rule__ModItem__Group__2 : rule__ModItem__Group__2__Impl ;
    public final void rule__ModItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2205:1: ( rule__ModItem__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2206:2: rule__ModItem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__24645);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2212:1: rule__ModItem__Group__2__Impl : ( ( rule__ModItem__Alternatives_2 ) ) ;
    public final void rule__ModItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2216:1: ( ( ( rule__ModItem__Alternatives_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2217:1: ( ( rule__ModItem__Alternatives_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2217:1: ( ( rule__ModItem__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2218:1: ( rule__ModItem__Alternatives_2 )
            {
             before(grammarAccess.getModItemAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2219:1: ( rule__ModItem__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2219:2: rule__ModItem__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl4672);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2235:1: rule__ModItem__Group_2_1__0 : rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 ;
    public final void rule__ModItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2239:1: ( rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2240:2: rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__04708);
            rule__ModItem__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__04711);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2247:1: rule__ModItem__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__ModItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2251:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2252:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2252:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2253:1: '{'
            {
             before(grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,53,FOLLOW_53_in_rule__ModItem__Group_2_1__0__Impl4739); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2266:1: rule__ModItem__Group_2_1__1 : rule__ModItem__Group_2_1__1__Impl rule__ModItem__Group_2_1__2 ;
    public final void rule__ModItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2270:1: ( rule__ModItem__Group_2_1__1__Impl rule__ModItem__Group_2_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2271:2: rule__ModItem__Group_2_1__1__Impl rule__ModItem__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__14770);
            rule__ModItem__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group_2_1__2_in_rule__ModItem__Group_2_1__14773);
            rule__ModItem__Group_2_1__2();

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2278:1: rule__ModItem__Group_2_1__1__Impl : ( ( rule__ModItem__ItemsAssignment_2_1_1 )* ) ;
    public final void rule__ModItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2282:1: ( ( ( rule__ModItem__ItemsAssignment_2_1_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2283:1: ( ( rule__ModItem__ItemsAssignment_2_1_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2283:1: ( ( rule__ModItem__ItemsAssignment_2_1_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2284:1: ( rule__ModItem__ItemsAssignment_2_1_1 )*
            {
             before(grammarAccess.getModItemAccess().getItemsAssignment_2_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2285:1: ( rule__ModItem__ItemsAssignment_2_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46||LA16_0==52||LA16_0==55) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2285:2: rule__ModItem__ItemsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ModItem__ItemsAssignment_2_1_1_in_rule__ModItem__Group_2_1__1__Impl4800);
            	    rule__ModItem__ItemsAssignment_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModItemAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ModItem__Group_2_1__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2295:1: rule__ModItem__Group_2_1__2 : rule__ModItem__Group_2_1__2__Impl ;
    public final void rule__ModItem__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2299:1: ( rule__ModItem__Group_2_1__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2300:2: rule__ModItem__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__2__Impl_in_rule__ModItem__Group_2_1__24831);
            rule__ModItem__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__ModItem__Group_2_1__2"


    // $ANTLR start "rule__ModItem__Group_2_1__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2306:1: rule__ModItem__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__ModItem__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2310:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2311:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2311:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2312:1: '}'
            {
             before(grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,54,FOLLOW_54_in_rule__ModItem__Group_2_1__2__Impl4859); 
             after(grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__Group_2_1__2__Impl"


    // $ANTLR start "rule__FnItem__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2331:1: rule__FnItem__Group__0 : rule__FnItem__Group__0__Impl rule__FnItem__Group__1 ;
    public final void rule__FnItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2335:1: ( rule__FnItem__Group__0__Impl rule__FnItem__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2336:2: rule__FnItem__Group__0__Impl rule__FnItem__Group__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group__0__Impl_in_rule__FnItem__Group__04896);
            rule__FnItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__1_in_rule__FnItem__Group__04899);
            rule__FnItem__Group__1();

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
    // $ANTLR end "rule__FnItem__Group__0"


    // $ANTLR start "rule__FnItem__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2343:1: rule__FnItem__Group__0__Impl : ( 'fn' ) ;
    public final void rule__FnItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2347:1: ( ( 'fn' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2348:1: ( 'fn' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2348:1: ( 'fn' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2349:1: 'fn'
            {
             before(grammarAccess.getFnItemAccess().getFnKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__FnItem__Group__0__Impl4927); 
             after(grammarAccess.getFnItemAccess().getFnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group__0__Impl"


    // $ANTLR start "rule__FnItem__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2362:1: rule__FnItem__Group__1 : rule__FnItem__Group__1__Impl rule__FnItem__Group__2 ;
    public final void rule__FnItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2366:1: ( rule__FnItem__Group__1__Impl rule__FnItem__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2367:2: rule__FnItem__Group__1__Impl rule__FnItem__Group__2
            {
            pushFollow(FOLLOW_rule__FnItem__Group__1__Impl_in_rule__FnItem__Group__14958);
            rule__FnItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__2_in_rule__FnItem__Group__14961);
            rule__FnItem__Group__2();

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
    // $ANTLR end "rule__FnItem__Group__1"


    // $ANTLR start "rule__FnItem__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2374:1: rule__FnItem__Group__1__Impl : ( ( rule__FnItem__IdentAssignment_1 ) ) ;
    public final void rule__FnItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2378:1: ( ( ( rule__FnItem__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2379:1: ( ( rule__FnItem__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2379:1: ( ( rule__FnItem__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2380:1: ( rule__FnItem__IdentAssignment_1 )
            {
             before(grammarAccess.getFnItemAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2381:1: ( rule__FnItem__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2381:2: rule__FnItem__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__FnItem__IdentAssignment_1_in_rule__FnItem__Group__1__Impl4988);
            rule__FnItem__IdentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFnItemAccess().getIdentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group__1__Impl"


    // $ANTLR start "rule__FnItem__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2391:1: rule__FnItem__Group__2 : rule__FnItem__Group__2__Impl rule__FnItem__Group__3 ;
    public final void rule__FnItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2395:1: ( rule__FnItem__Group__2__Impl rule__FnItem__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2396:2: rule__FnItem__Group__2__Impl rule__FnItem__Group__3
            {
            pushFollow(FOLLOW_rule__FnItem__Group__2__Impl_in_rule__FnItem__Group__25018);
            rule__FnItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__3_in_rule__FnItem__Group__25021);
            rule__FnItem__Group__3();

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
    // $ANTLR end "rule__FnItem__Group__2"


    // $ANTLR start "rule__FnItem__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2403:1: rule__FnItem__Group__2__Impl : ( ( rule__FnItem__Group_2__0 )? ) ;
    public final void rule__FnItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2407:1: ( ( ( rule__FnItem__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2408:1: ( ( rule__FnItem__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2408:1: ( ( rule__FnItem__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2409:1: ( rule__FnItem__Group_2__0 )?
            {
             before(grammarAccess.getFnItemAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2410:1: ( rule__FnItem__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==56) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2410:2: rule__FnItem__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FnItem__Group_2__0_in_rule__FnItem__Group__2__Impl5048);
                    rule__FnItem__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFnItemAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group__2__Impl"


    // $ANTLR start "rule__FnItem__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2420:1: rule__FnItem__Group__3 : rule__FnItem__Group__3__Impl rule__FnItem__Group__4 ;
    public final void rule__FnItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2424:1: ( rule__FnItem__Group__3__Impl rule__FnItem__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2425:2: rule__FnItem__Group__3__Impl rule__FnItem__Group__4
            {
            pushFollow(FOLLOW_rule__FnItem__Group__3__Impl_in_rule__FnItem__Group__35079);
            rule__FnItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__4_in_rule__FnItem__Group__35082);
            rule__FnItem__Group__4();

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
    // $ANTLR end "rule__FnItem__Group__3"


    // $ANTLR start "rule__FnItem__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2432:1: rule__FnItem__Group__3__Impl : ( '(' ) ;
    public final void rule__FnItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2436:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2437:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2437:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2438:1: '('
            {
             before(grammarAccess.getFnItemAccess().getLeftParenthesisKeyword_3()); 
            match(input,49,FOLLOW_49_in_rule__FnItem__Group__3__Impl5110); 
             after(grammarAccess.getFnItemAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group__3__Impl"


    // $ANTLR start "rule__FnItem__Group__4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2451:1: rule__FnItem__Group__4 : rule__FnItem__Group__4__Impl rule__FnItem__Group__5 ;
    public final void rule__FnItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2455:1: ( rule__FnItem__Group__4__Impl rule__FnItem__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2456:2: rule__FnItem__Group__4__Impl rule__FnItem__Group__5
            {
            pushFollow(FOLLOW_rule__FnItem__Group__4__Impl_in_rule__FnItem__Group__45141);
            rule__FnItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__5_in_rule__FnItem__Group__45144);
            rule__FnItem__Group__5();

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
    // $ANTLR end "rule__FnItem__Group__4"


    // $ANTLR start "rule__FnItem__Group__4__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2463:1: rule__FnItem__Group__4__Impl : ( ( rule__FnItem__Group_4__0 )? ) ;
    public final void rule__FnItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2467:1: ( ( ( rule__FnItem__Group_4__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2468:1: ( ( rule__FnItem__Group_4__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2468:1: ( ( rule__FnItem__Group_4__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2469:1: ( rule__FnItem__Group_4__0 )?
            {
             before(grammarAccess.getFnItemAccess().getGroup_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2470:1: ( rule__FnItem__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_FLOAT_LIT && LA18_0<=RULE_INT_LIT)||(LA18_0>=RULE_MUT_KEYWORD && LA18_0<=RULE_CHAR_LIT)||LA18_0==49||(LA18_0>=61 && LA18_0<=65)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2470:2: rule__FnItem__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FnItem__Group_4__0_in_rule__FnItem__Group__4__Impl5171);
                    rule__FnItem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFnItemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group__4__Impl"


    // $ANTLR start "rule__FnItem__Group__5"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2480:1: rule__FnItem__Group__5 : rule__FnItem__Group__5__Impl rule__FnItem__Group__6 ;
    public final void rule__FnItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2484:1: ( rule__FnItem__Group__5__Impl rule__FnItem__Group__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2485:2: rule__FnItem__Group__5__Impl rule__FnItem__Group__6
            {
            pushFollow(FOLLOW_rule__FnItem__Group__5__Impl_in_rule__FnItem__Group__55202);
            rule__FnItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__6_in_rule__FnItem__Group__55205);
            rule__FnItem__Group__6();

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
    // $ANTLR end "rule__FnItem__Group__5"


    // $ANTLR start "rule__FnItem__Group__5__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2492:1: rule__FnItem__Group__5__Impl : ( ')' ) ;
    public final void rule__FnItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2496:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2497:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2497:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2498:1: ')'
            {
             before(grammarAccess.getFnItemAccess().getRightParenthesisKeyword_5()); 
            match(input,50,FOLLOW_50_in_rule__FnItem__Group__5__Impl5233); 
             after(grammarAccess.getFnItemAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group__5__Impl"


    // $ANTLR start "rule__FnItem__Group__6"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2511:1: rule__FnItem__Group__6 : rule__FnItem__Group__6__Impl rule__FnItem__Group__7 ;
    public final void rule__FnItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2515:1: ( rule__FnItem__Group__6__Impl rule__FnItem__Group__7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2516:2: rule__FnItem__Group__6__Impl rule__FnItem__Group__7
            {
            pushFollow(FOLLOW_rule__FnItem__Group__6__Impl_in_rule__FnItem__Group__65264);
            rule__FnItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__7_in_rule__FnItem__Group__65267);
            rule__FnItem__Group__7();

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
    // $ANTLR end "rule__FnItem__Group__6"


    // $ANTLR start "rule__FnItem__Group__6__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2523:1: rule__FnItem__Group__6__Impl : ( ( rule__FnItem__Group_6__0 )? ) ;
    public final void rule__FnItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2527:1: ( ( ( rule__FnItem__Group_6__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2528:1: ( ( rule__FnItem__Group_6__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2528:1: ( ( rule__FnItem__Group_6__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2529:1: ( rule__FnItem__Group_6__0 )?
            {
             before(grammarAccess.getFnItemAccess().getGroup_6()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2530:1: ( rule__FnItem__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==58) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2530:2: rule__FnItem__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__FnItem__Group_6__0_in_rule__FnItem__Group__6__Impl5294);
                    rule__FnItem__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFnItemAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group__6__Impl"


    // $ANTLR start "rule__FnItem__Group__7"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2540:1: rule__FnItem__Group__7 : rule__FnItem__Group__7__Impl ;
    public final void rule__FnItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2544:1: ( rule__FnItem__Group__7__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2545:2: rule__FnItem__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group__7__Impl_in_rule__FnItem__Group__75325);
            rule__FnItem__Group__7__Impl();

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
    // $ANTLR end "rule__FnItem__Group__7"


    // $ANTLR start "rule__FnItem__Group__7__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2551:1: rule__FnItem__Group__7__Impl : ( ( rule__FnItem__BodyAssignment_7 ) ) ;
    public final void rule__FnItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2555:1: ( ( ( rule__FnItem__BodyAssignment_7 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2556:1: ( ( rule__FnItem__BodyAssignment_7 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2556:1: ( ( rule__FnItem__BodyAssignment_7 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2557:1: ( rule__FnItem__BodyAssignment_7 )
            {
             before(grammarAccess.getFnItemAccess().getBodyAssignment_7()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2558:1: ( rule__FnItem__BodyAssignment_7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2558:2: rule__FnItem__BodyAssignment_7
            {
            pushFollow(FOLLOW_rule__FnItem__BodyAssignment_7_in_rule__FnItem__Group__7__Impl5352);
            rule__FnItem__BodyAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFnItemAccess().getBodyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group__7__Impl"


    // $ANTLR start "rule__FnItem__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2584:1: rule__FnItem__Group_2__0 : rule__FnItem__Group_2__0__Impl rule__FnItem__Group_2__1 ;
    public final void rule__FnItem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2588:1: ( rule__FnItem__Group_2__0__Impl rule__FnItem__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2589:2: rule__FnItem__Group_2__0__Impl rule__FnItem__Group_2__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__0__Impl_in_rule__FnItem__Group_2__05398);
            rule__FnItem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2__1_in_rule__FnItem__Group_2__05401);
            rule__FnItem__Group_2__1();

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
    // $ANTLR end "rule__FnItem__Group_2__0"


    // $ANTLR start "rule__FnItem__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2596:1: rule__FnItem__Group_2__0__Impl : ( '<' ) ;
    public final void rule__FnItem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2600:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2601:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2601:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2602:1: '<'
            {
             before(grammarAccess.getFnItemAccess().getLessThanSignKeyword_2_0()); 
            match(input,56,FOLLOW_56_in_rule__FnItem__Group_2__0__Impl5429); 
             after(grammarAccess.getFnItemAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_2__0__Impl"


    // $ANTLR start "rule__FnItem__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2615:1: rule__FnItem__Group_2__1 : rule__FnItem__Group_2__1__Impl rule__FnItem__Group_2__2 ;
    public final void rule__FnItem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2619:1: ( rule__FnItem__Group_2__1__Impl rule__FnItem__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2620:2: rule__FnItem__Group_2__1__Impl rule__FnItem__Group_2__2
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__1__Impl_in_rule__FnItem__Group_2__15460);
            rule__FnItem__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2__2_in_rule__FnItem__Group_2__15463);
            rule__FnItem__Group_2__2();

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
    // $ANTLR end "rule__FnItem__Group_2__1"


    // $ANTLR start "rule__FnItem__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2627:1: rule__FnItem__Group_2__1__Impl : ( ( rule__FnItem__ParamsAssignment_2_1 ) ) ;
    public final void rule__FnItem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2631:1: ( ( ( rule__FnItem__ParamsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2632:1: ( ( rule__FnItem__ParamsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2632:1: ( ( rule__FnItem__ParamsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2633:1: ( rule__FnItem__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getFnItemAccess().getParamsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2634:1: ( rule__FnItem__ParamsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2634:2: rule__FnItem__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FnItem__ParamsAssignment_2_1_in_rule__FnItem__Group_2__1__Impl5490);
            rule__FnItem__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFnItemAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_2__1__Impl"


    // $ANTLR start "rule__FnItem__Group_2__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2644:1: rule__FnItem__Group_2__2 : rule__FnItem__Group_2__2__Impl rule__FnItem__Group_2__3 ;
    public final void rule__FnItem__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2648:1: ( rule__FnItem__Group_2__2__Impl rule__FnItem__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2649:2: rule__FnItem__Group_2__2__Impl rule__FnItem__Group_2__3
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__2__Impl_in_rule__FnItem__Group_2__25520);
            rule__FnItem__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2__3_in_rule__FnItem__Group_2__25523);
            rule__FnItem__Group_2__3();

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
    // $ANTLR end "rule__FnItem__Group_2__2"


    // $ANTLR start "rule__FnItem__Group_2__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2656:1: rule__FnItem__Group_2__2__Impl : ( ( rule__FnItem__Group_2_2__0 )* ) ;
    public final void rule__FnItem__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2660:1: ( ( ( rule__FnItem__Group_2_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2661:1: ( ( rule__FnItem__Group_2_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2661:1: ( ( rule__FnItem__Group_2_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2662:1: ( rule__FnItem__Group_2_2__0 )*
            {
             before(grammarAccess.getFnItemAccess().getGroup_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2663:1: ( rule__FnItem__Group_2_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2663:2: rule__FnItem__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FnItem__Group_2_2__0_in_rule__FnItem__Group_2__2__Impl5550);
            	    rule__FnItem__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFnItemAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_2__2__Impl"


    // $ANTLR start "rule__FnItem__Group_2__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2673:1: rule__FnItem__Group_2__3 : rule__FnItem__Group_2__3__Impl ;
    public final void rule__FnItem__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2677:1: ( rule__FnItem__Group_2__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2678:2: rule__FnItem__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__3__Impl_in_rule__FnItem__Group_2__35581);
            rule__FnItem__Group_2__3__Impl();

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
    // $ANTLR end "rule__FnItem__Group_2__3"


    // $ANTLR start "rule__FnItem__Group_2__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2684:1: rule__FnItem__Group_2__3__Impl : ( '>' ) ;
    public final void rule__FnItem__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2688:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2689:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2689:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2690:1: '>'
            {
             before(grammarAccess.getFnItemAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,57,FOLLOW_57_in_rule__FnItem__Group_2__3__Impl5609); 
             after(grammarAccess.getFnItemAccess().getGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_2__3__Impl"


    // $ANTLR start "rule__FnItem__Group_2_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2711:1: rule__FnItem__Group_2_2__0 : rule__FnItem__Group_2_2__0__Impl rule__FnItem__Group_2_2__1 ;
    public final void rule__FnItem__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2715:1: ( rule__FnItem__Group_2_2__0__Impl rule__FnItem__Group_2_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2716:2: rule__FnItem__Group_2_2__0__Impl rule__FnItem__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2_2__0__Impl_in_rule__FnItem__Group_2_2__05648);
            rule__FnItem__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2_2__1_in_rule__FnItem__Group_2_2__05651);
            rule__FnItem__Group_2_2__1();

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
    // $ANTLR end "rule__FnItem__Group_2_2__0"


    // $ANTLR start "rule__FnItem__Group_2_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2723:1: rule__FnItem__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FnItem__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2727:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2728:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2728:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2729:1: ','
            {
             before(grammarAccess.getFnItemAccess().getCommaKeyword_2_2_0()); 
            match(input,48,FOLLOW_48_in_rule__FnItem__Group_2_2__0__Impl5679); 
             after(grammarAccess.getFnItemAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_2_2__0__Impl"


    // $ANTLR start "rule__FnItem__Group_2_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2742:1: rule__FnItem__Group_2_2__1 : rule__FnItem__Group_2_2__1__Impl ;
    public final void rule__FnItem__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2746:1: ( rule__FnItem__Group_2_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2747:2: rule__FnItem__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2_2__1__Impl_in_rule__FnItem__Group_2_2__15710);
            rule__FnItem__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__FnItem__Group_2_2__1"


    // $ANTLR start "rule__FnItem__Group_2_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2753:1: rule__FnItem__Group_2_2__1__Impl : ( ( rule__FnItem__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__FnItem__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2757:1: ( ( ( rule__FnItem__ParamsAssignment_2_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2758:1: ( ( rule__FnItem__ParamsAssignment_2_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2758:1: ( ( rule__FnItem__ParamsAssignment_2_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2759:1: ( rule__FnItem__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getFnItemAccess().getParamsAssignment_2_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2760:1: ( rule__FnItem__ParamsAssignment_2_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2760:2: rule__FnItem__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__FnItem__ParamsAssignment_2_2_1_in_rule__FnItem__Group_2_2__1__Impl5737);
            rule__FnItem__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFnItemAccess().getParamsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_2_2__1__Impl"


    // $ANTLR start "rule__FnItem__Group_4__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2774:1: rule__FnItem__Group_4__0 : rule__FnItem__Group_4__0__Impl rule__FnItem__Group_4__1 ;
    public final void rule__FnItem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2778:1: ( rule__FnItem__Group_4__0__Impl rule__FnItem__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2779:2: rule__FnItem__Group_4__0__Impl rule__FnItem__Group_4__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4__0__Impl_in_rule__FnItem__Group_4__05771);
            rule__FnItem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_4__1_in_rule__FnItem__Group_4__05774);
            rule__FnItem__Group_4__1();

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
    // $ANTLR end "rule__FnItem__Group_4__0"


    // $ANTLR start "rule__FnItem__Group_4__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2786:1: rule__FnItem__Group_4__0__Impl : ( ( rule__FnItem__ArgsAssignment_4_0 ) ) ;
    public final void rule__FnItem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2790:1: ( ( ( rule__FnItem__ArgsAssignment_4_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2791:1: ( ( rule__FnItem__ArgsAssignment_4_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2791:1: ( ( rule__FnItem__ArgsAssignment_4_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2792:1: ( rule__FnItem__ArgsAssignment_4_0 )
            {
             before(grammarAccess.getFnItemAccess().getArgsAssignment_4_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2793:1: ( rule__FnItem__ArgsAssignment_4_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2793:2: rule__FnItem__ArgsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__FnItem__ArgsAssignment_4_0_in_rule__FnItem__Group_4__0__Impl5801);
            rule__FnItem__ArgsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFnItemAccess().getArgsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_4__0__Impl"


    // $ANTLR start "rule__FnItem__Group_4__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2803:1: rule__FnItem__Group_4__1 : rule__FnItem__Group_4__1__Impl ;
    public final void rule__FnItem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2807:1: ( rule__FnItem__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2808:2: rule__FnItem__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4__1__Impl_in_rule__FnItem__Group_4__15831);
            rule__FnItem__Group_4__1__Impl();

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
    // $ANTLR end "rule__FnItem__Group_4__1"


    // $ANTLR start "rule__FnItem__Group_4__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2814:1: rule__FnItem__Group_4__1__Impl : ( ( rule__FnItem__Group_4_1__0 )* ) ;
    public final void rule__FnItem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2818:1: ( ( ( rule__FnItem__Group_4_1__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2819:1: ( ( rule__FnItem__Group_4_1__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2819:1: ( ( rule__FnItem__Group_4_1__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2820:1: ( rule__FnItem__Group_4_1__0 )*
            {
             before(grammarAccess.getFnItemAccess().getGroup_4_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2821:1: ( rule__FnItem__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==48) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2821:2: rule__FnItem__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FnItem__Group_4_1__0_in_rule__FnItem__Group_4__1__Impl5858);
            	    rule__FnItem__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFnItemAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_4__1__Impl"


    // $ANTLR start "rule__FnItem__Group_4_1__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2835:1: rule__FnItem__Group_4_1__0 : rule__FnItem__Group_4_1__0__Impl rule__FnItem__Group_4_1__1 ;
    public final void rule__FnItem__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2839:1: ( rule__FnItem__Group_4_1__0__Impl rule__FnItem__Group_4_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2840:2: rule__FnItem__Group_4_1__0__Impl rule__FnItem__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4_1__0__Impl_in_rule__FnItem__Group_4_1__05893);
            rule__FnItem__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_4_1__1_in_rule__FnItem__Group_4_1__05896);
            rule__FnItem__Group_4_1__1();

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
    // $ANTLR end "rule__FnItem__Group_4_1__0"


    // $ANTLR start "rule__FnItem__Group_4_1__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2847:1: rule__FnItem__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__FnItem__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2851:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2852:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2852:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2853:1: ','
            {
             before(grammarAccess.getFnItemAccess().getCommaKeyword_4_1_0()); 
            match(input,48,FOLLOW_48_in_rule__FnItem__Group_4_1__0__Impl5924); 
             after(grammarAccess.getFnItemAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_4_1__0__Impl"


    // $ANTLR start "rule__FnItem__Group_4_1__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2866:1: rule__FnItem__Group_4_1__1 : rule__FnItem__Group_4_1__1__Impl ;
    public final void rule__FnItem__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2870:1: ( rule__FnItem__Group_4_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2871:2: rule__FnItem__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4_1__1__Impl_in_rule__FnItem__Group_4_1__15955);
            rule__FnItem__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__FnItem__Group_4_1__1"


    // $ANTLR start "rule__FnItem__Group_4_1__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2877:1: rule__FnItem__Group_4_1__1__Impl : ( ( rule__FnItem__ArgsAssignment_4_1_1 ) ) ;
    public final void rule__FnItem__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2881:1: ( ( ( rule__FnItem__ArgsAssignment_4_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2882:1: ( ( rule__FnItem__ArgsAssignment_4_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2882:1: ( ( rule__FnItem__ArgsAssignment_4_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2883:1: ( rule__FnItem__ArgsAssignment_4_1_1 )
            {
             before(grammarAccess.getFnItemAccess().getArgsAssignment_4_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2884:1: ( rule__FnItem__ArgsAssignment_4_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2884:2: rule__FnItem__ArgsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__FnItem__ArgsAssignment_4_1_1_in_rule__FnItem__Group_4_1__1__Impl5982);
            rule__FnItem__ArgsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFnItemAccess().getArgsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_4_1__1__Impl"


    // $ANTLR start "rule__FnItem__Group_6__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2898:1: rule__FnItem__Group_6__0 : rule__FnItem__Group_6__0__Impl rule__FnItem__Group_6__1 ;
    public final void rule__FnItem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2902:1: ( rule__FnItem__Group_6__0__Impl rule__FnItem__Group_6__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2903:2: rule__FnItem__Group_6__0__Impl rule__FnItem__Group_6__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_6__0__Impl_in_rule__FnItem__Group_6__06016);
            rule__FnItem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_6__1_in_rule__FnItem__Group_6__06019);
            rule__FnItem__Group_6__1();

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
    // $ANTLR end "rule__FnItem__Group_6__0"


    // $ANTLR start "rule__FnItem__Group_6__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2910:1: rule__FnItem__Group_6__0__Impl : ( '->' ) ;
    public final void rule__FnItem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2914:1: ( ( '->' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2915:1: ( '->' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2915:1: ( '->' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2916:1: '->'
            {
             before(grammarAccess.getFnItemAccess().getHyphenMinusGreaterThanSignKeyword_6_0()); 
            match(input,58,FOLLOW_58_in_rule__FnItem__Group_6__0__Impl6047); 
             after(grammarAccess.getFnItemAccess().getHyphenMinusGreaterThanSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_6__0__Impl"


    // $ANTLR start "rule__FnItem__Group_6__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2929:1: rule__FnItem__Group_6__1 : rule__FnItem__Group_6__1__Impl ;
    public final void rule__FnItem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2933:1: ( rule__FnItem__Group_6__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2934:2: rule__FnItem__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_6__1__Impl_in_rule__FnItem__Group_6__16078);
            rule__FnItem__Group_6__1__Impl();

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
    // $ANTLR end "rule__FnItem__Group_6__1"


    // $ANTLR start "rule__FnItem__Group_6__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2940:1: rule__FnItem__Group_6__1__Impl : ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) ) ;
    public final void rule__FnItem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2944:1: ( ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2945:1: ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2945:1: ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2946:1: ( rule__FnItem__ReturnTypeAssignment_6_1 )
            {
             before(grammarAccess.getFnItemAccess().getReturnTypeAssignment_6_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2947:1: ( rule__FnItem__ReturnTypeAssignment_6_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2947:2: rule__FnItem__ReturnTypeAssignment_6_1
            {
            pushFollow(FOLLOW_rule__FnItem__ReturnTypeAssignment_6_1_in_rule__FnItem__Group_6__1__Impl6105);
            rule__FnItem__ReturnTypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFnItemAccess().getReturnTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__Group_6__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2961:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2965:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2966:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__06139);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__06142);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2973:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2977:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2978:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2978:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2979:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__Block__Group__0__Impl6170); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2992:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2996:1: ( rule__Block__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2997:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__16201);
            rule__Block__Group__1__Impl();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3003:1: rule__Block__Group__1__Impl : ( '}' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3007:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3008:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3008:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3009:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__Block__Group__1__Impl6229); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__GenericParamDecl__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3026:1: rule__GenericParamDecl__Group__0 : rule__GenericParamDecl__Group__0__Impl rule__GenericParamDecl__Group__1 ;
    public final void rule__GenericParamDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3030:1: ( rule__GenericParamDecl__Group__0__Impl rule__GenericParamDecl__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3031:2: rule__GenericParamDecl__Group__0__Impl rule__GenericParamDecl__Group__1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group__0__Impl_in_rule__GenericParamDecl__Group__06264);
            rule__GenericParamDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group__1_in_rule__GenericParamDecl__Group__06267);
            rule__GenericParamDecl__Group__1();

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
    // $ANTLR end "rule__GenericParamDecl__Group__0"


    // $ANTLR start "rule__GenericParamDecl__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3038:1: rule__GenericParamDecl__Group__0__Impl : ( ( rule__GenericParamDecl__IdentAssignment_0 ) ) ;
    public final void rule__GenericParamDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3042:1: ( ( ( rule__GenericParamDecl__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3043:1: ( ( rule__GenericParamDecl__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3043:1: ( ( rule__GenericParamDecl__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3044:1: ( rule__GenericParamDecl__IdentAssignment_0 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3045:1: ( rule__GenericParamDecl__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3045:2: rule__GenericParamDecl__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__IdentAssignment_0_in_rule__GenericParamDecl__Group__0__Impl6294);
            rule__GenericParamDecl__IdentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGenericParamDeclAccess().getIdentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__Group__0__Impl"


    // $ANTLR start "rule__GenericParamDecl__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3055:1: rule__GenericParamDecl__Group__1 : rule__GenericParamDecl__Group__1__Impl ;
    public final void rule__GenericParamDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3059:1: ( rule__GenericParamDecl__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3060:2: rule__GenericParamDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group__1__Impl_in_rule__GenericParamDecl__Group__16324);
            rule__GenericParamDecl__Group__1__Impl();

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
    // $ANTLR end "rule__GenericParamDecl__Group__1"


    // $ANTLR start "rule__GenericParamDecl__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3066:1: rule__GenericParamDecl__Group__1__Impl : ( ( rule__GenericParamDecl__Group_1__0 )? ) ;
    public final void rule__GenericParamDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3070:1: ( ( ( rule__GenericParamDecl__Group_1__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3071:1: ( ( rule__GenericParamDecl__Group_1__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3071:1: ( ( rule__GenericParamDecl__Group_1__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3072:1: ( rule__GenericParamDecl__Group_1__0 )?
            {
             before(grammarAccess.getGenericParamDeclAccess().getGroup_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3073:1: ( rule__GenericParamDecl__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==59) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3073:2: rule__GenericParamDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__0_in_rule__GenericParamDecl__Group__1__Impl6351);
                    rule__GenericParamDecl__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGenericParamDeclAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__Group__1__Impl"


    // $ANTLR start "rule__GenericParamDecl__Group_1__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3087:1: rule__GenericParamDecl__Group_1__0 : rule__GenericParamDecl__Group_1__0__Impl rule__GenericParamDecl__Group_1__1 ;
    public final void rule__GenericParamDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3091:1: ( rule__GenericParamDecl__Group_1__0__Impl rule__GenericParamDecl__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3092:2: rule__GenericParamDecl__Group_1__0__Impl rule__GenericParamDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__0__Impl_in_rule__GenericParamDecl__Group_1__06386);
            rule__GenericParamDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__1_in_rule__GenericParamDecl__Group_1__06389);
            rule__GenericParamDecl__Group_1__1();

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
    // $ANTLR end "rule__GenericParamDecl__Group_1__0"


    // $ANTLR start "rule__GenericParamDecl__Group_1__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3099:1: rule__GenericParamDecl__Group_1__0__Impl : ( ':' ) ;
    public final void rule__GenericParamDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3103:1: ( ( ':' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3104:1: ( ':' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3104:1: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3105:1: ':'
            {
             before(grammarAccess.getGenericParamDeclAccess().getColonKeyword_1_0()); 
            match(input,59,FOLLOW_59_in_rule__GenericParamDecl__Group_1__0__Impl6417); 
             after(grammarAccess.getGenericParamDeclAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__Group_1__0__Impl"


    // $ANTLR start "rule__GenericParamDecl__Group_1__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3118:1: rule__GenericParamDecl__Group_1__1 : rule__GenericParamDecl__Group_1__1__Impl rule__GenericParamDecl__Group_1__2 ;
    public final void rule__GenericParamDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3122:1: ( rule__GenericParamDecl__Group_1__1__Impl rule__GenericParamDecl__Group_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3123:2: rule__GenericParamDecl__Group_1__1__Impl rule__GenericParamDecl__Group_1__2
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__1__Impl_in_rule__GenericParamDecl__Group_1__16448);
            rule__GenericParamDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__2_in_rule__GenericParamDecl__Group_1__16451);
            rule__GenericParamDecl__Group_1__2();

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
    // $ANTLR end "rule__GenericParamDecl__Group_1__1"


    // $ANTLR start "rule__GenericParamDecl__Group_1__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3130:1: rule__GenericParamDecl__Group_1__1__Impl : ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) ) ;
    public final void rule__GenericParamDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3134:1: ( ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3135:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3135:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3136:1: ( rule__GenericParamDecl__BoundsAssignment_1_1 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3137:1: ( rule__GenericParamDecl__BoundsAssignment_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3137:2: rule__GenericParamDecl__BoundsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_1_in_rule__GenericParamDecl__Group_1__1__Impl6478);
            rule__GenericParamDecl__BoundsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__Group_1__1__Impl"


    // $ANTLR start "rule__GenericParamDecl__Group_1__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3147:1: rule__GenericParamDecl__Group_1__2 : rule__GenericParamDecl__Group_1__2__Impl ;
    public final void rule__GenericParamDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3151:1: ( rule__GenericParamDecl__Group_1__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3152:2: rule__GenericParamDecl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__2__Impl_in_rule__GenericParamDecl__Group_1__26508);
            rule__GenericParamDecl__Group_1__2__Impl();

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
    // $ANTLR end "rule__GenericParamDecl__Group_1__2"


    // $ANTLR start "rule__GenericParamDecl__Group_1__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3158:1: rule__GenericParamDecl__Group_1__2__Impl : ( ( rule__GenericParamDecl__Group_1_2__0 ) ) ;
    public final void rule__GenericParamDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3162:1: ( ( ( rule__GenericParamDecl__Group_1_2__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3163:1: ( ( rule__GenericParamDecl__Group_1_2__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3163:1: ( ( rule__GenericParamDecl__Group_1_2__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3164:1: ( rule__GenericParamDecl__Group_1_2__0 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getGroup_1_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3165:1: ( rule__GenericParamDecl__Group_1_2__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3165:2: rule__GenericParamDecl__Group_1_2__0
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__0_in_rule__GenericParamDecl__Group_1__2__Impl6535);
            rule__GenericParamDecl__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getGenericParamDeclAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__Group_1__2__Impl"


    // $ANTLR start "rule__GenericParamDecl__Group_1_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3181:1: rule__GenericParamDecl__Group_1_2__0 : rule__GenericParamDecl__Group_1_2__0__Impl rule__GenericParamDecl__Group_1_2__1 ;
    public final void rule__GenericParamDecl__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3185:1: ( rule__GenericParamDecl__Group_1_2__0__Impl rule__GenericParamDecl__Group_1_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3186:2: rule__GenericParamDecl__Group_1_2__0__Impl rule__GenericParamDecl__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__0__Impl_in_rule__GenericParamDecl__Group_1_2__06571);
            rule__GenericParamDecl__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__1_in_rule__GenericParamDecl__Group_1_2__06574);
            rule__GenericParamDecl__Group_1_2__1();

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
    // $ANTLR end "rule__GenericParamDecl__Group_1_2__0"


    // $ANTLR start "rule__GenericParamDecl__Group_1_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3193:1: rule__GenericParamDecl__Group_1_2__0__Impl : ( '+' ) ;
    public final void rule__GenericParamDecl__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3197:1: ( ( '+' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3198:1: ( '+' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3198:1: ( '+' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3199:1: '+'
            {
             before(grammarAccess.getGenericParamDeclAccess().getPlusSignKeyword_1_2_0()); 
            match(input,60,FOLLOW_60_in_rule__GenericParamDecl__Group_1_2__0__Impl6602); 
             after(grammarAccess.getGenericParamDeclAccess().getPlusSignKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__Group_1_2__0__Impl"


    // $ANTLR start "rule__GenericParamDecl__Group_1_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3212:1: rule__GenericParamDecl__Group_1_2__1 : rule__GenericParamDecl__Group_1_2__1__Impl ;
    public final void rule__GenericParamDecl__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3216:1: ( rule__GenericParamDecl__Group_1_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3217:2: rule__GenericParamDecl__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__1__Impl_in_rule__GenericParamDecl__Group_1_2__16633);
            rule__GenericParamDecl__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__GenericParamDecl__Group_1_2__1"


    // $ANTLR start "rule__GenericParamDecl__Group_1_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3223:1: rule__GenericParamDecl__Group_1_2__1__Impl : ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) ) ;
    public final void rule__GenericParamDecl__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3227:1: ( ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3228:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3228:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3229:1: ( rule__GenericParamDecl__BoundsAssignment_1_2_1 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3230:1: ( rule__GenericParamDecl__BoundsAssignment_1_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3230:2: rule__GenericParamDecl__BoundsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_2_1_in_rule__GenericParamDecl__Group_1_2__1__Impl6660);
            rule__GenericParamDecl__BoundsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__Group_1_2__1__Impl"


    // $ANTLR start "rule__Arg__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3244:1: rule__Arg__Group__0 : rule__Arg__Group__0__Impl rule__Arg__Group__1 ;
    public final void rule__Arg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3248:1: ( rule__Arg__Group__0__Impl rule__Arg__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3249:2: rule__Arg__Group__0__Impl rule__Arg__Group__1
            {
            pushFollow(FOLLOW_rule__Arg__Group__0__Impl_in_rule__Arg__Group__06694);
            rule__Arg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__1_in_rule__Arg__Group__06697);
            rule__Arg__Group__1();

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
    // $ANTLR end "rule__Arg__Group__0"


    // $ANTLR start "rule__Arg__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3256:1: rule__Arg__Group__0__Impl : ( ( rule__Arg__PatAssignment_0 ) ) ;
    public final void rule__Arg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3260:1: ( ( ( rule__Arg__PatAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3261:1: ( ( rule__Arg__PatAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3261:1: ( ( rule__Arg__PatAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3262:1: ( rule__Arg__PatAssignment_0 )
            {
             before(grammarAccess.getArgAccess().getPatAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3263:1: ( rule__Arg__PatAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3263:2: rule__Arg__PatAssignment_0
            {
            pushFollow(FOLLOW_rule__Arg__PatAssignment_0_in_rule__Arg__Group__0__Impl6724);
            rule__Arg__PatAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgAccess().getPatAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__Group__0__Impl"


    // $ANTLR start "rule__Arg__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3273:1: rule__Arg__Group__1 : rule__Arg__Group__1__Impl rule__Arg__Group__2 ;
    public final void rule__Arg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3277:1: ( rule__Arg__Group__1__Impl rule__Arg__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3278:2: rule__Arg__Group__1__Impl rule__Arg__Group__2
            {
            pushFollow(FOLLOW_rule__Arg__Group__1__Impl_in_rule__Arg__Group__16754);
            rule__Arg__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__2_in_rule__Arg__Group__16757);
            rule__Arg__Group__2();

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
    // $ANTLR end "rule__Arg__Group__1"


    // $ANTLR start "rule__Arg__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3285:1: rule__Arg__Group__1__Impl : ( ':' ) ;
    public final void rule__Arg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3289:1: ( ( ':' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3290:1: ( ':' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3290:1: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3291:1: ':'
            {
             before(grammarAccess.getArgAccess().getColonKeyword_1()); 
            match(input,59,FOLLOW_59_in_rule__Arg__Group__1__Impl6785); 
             after(grammarAccess.getArgAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__Group__1__Impl"


    // $ANTLR start "rule__Arg__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3304:1: rule__Arg__Group__2 : rule__Arg__Group__2__Impl ;
    public final void rule__Arg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3308:1: ( rule__Arg__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3309:2: rule__Arg__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Arg__Group__2__Impl_in_rule__Arg__Group__26816);
            rule__Arg__Group__2__Impl();

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
    // $ANTLR end "rule__Arg__Group__2"


    // $ANTLR start "rule__Arg__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3315:1: rule__Arg__Group__2__Impl : ( ( rule__Arg__TypeAssignment_2 ) ) ;
    public final void rule__Arg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3319:1: ( ( ( rule__Arg__TypeAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3320:1: ( ( rule__Arg__TypeAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3320:1: ( ( rule__Arg__TypeAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3321:1: ( rule__Arg__TypeAssignment_2 )
            {
             before(grammarAccess.getArgAccess().getTypeAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3322:1: ( rule__Arg__TypeAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3322:2: rule__Arg__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Arg__TypeAssignment_2_in_rule__Arg__Group__2__Impl6843);
            rule__Arg__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__Group__2__Impl"


    // $ANTLR start "rule__PatWildcard__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3338:1: rule__PatWildcard__Group__0 : rule__PatWildcard__Group__0__Impl rule__PatWildcard__Group__1 ;
    public final void rule__PatWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3342:1: ( rule__PatWildcard__Group__0__Impl rule__PatWildcard__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3343:2: rule__PatWildcard__Group__0__Impl rule__PatWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__PatWildcard__Group__0__Impl_in_rule__PatWildcard__Group__06879);
            rule__PatWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatWildcard__Group__1_in_rule__PatWildcard__Group__06882);
            rule__PatWildcard__Group__1();

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
    // $ANTLR end "rule__PatWildcard__Group__0"


    // $ANTLR start "rule__PatWildcard__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3350:1: rule__PatWildcard__Group__0__Impl : ( () ) ;
    public final void rule__PatWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3354:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3355:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3355:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3356:1: ()
            {
             before(grammarAccess.getPatWildcardAccess().getPatWildcardAction_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3357:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3359:1: 
            {
            }

             after(grammarAccess.getPatWildcardAccess().getPatWildcardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatWildcard__Group__0__Impl"


    // $ANTLR start "rule__PatWildcard__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3369:1: rule__PatWildcard__Group__1 : rule__PatWildcard__Group__1__Impl ;
    public final void rule__PatWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3373:1: ( rule__PatWildcard__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3374:2: rule__PatWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PatWildcard__Group__1__Impl_in_rule__PatWildcard__Group__16940);
            rule__PatWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__PatWildcard__Group__1"


    // $ANTLR start "rule__PatWildcard__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3380:1: rule__PatWildcard__Group__1__Impl : ( '_' ) ;
    public final void rule__PatWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3384:1: ( ( '_' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3385:1: ( '_' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3385:1: ( '_' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3386:1: '_'
            {
             before(grammarAccess.getPatWildcardAccess().get_Keyword_1()); 
            match(input,61,FOLLOW_61_in_rule__PatWildcard__Group__1__Impl6968); 
             after(grammarAccess.getPatWildcardAccess().get_Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatWildcard__Group__1__Impl"


    // $ANTLR start "rule__PatIdent__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3403:1: rule__PatIdent__Group__0 : rule__PatIdent__Group__0__Impl rule__PatIdent__Group__1 ;
    public final void rule__PatIdent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3407:1: ( rule__PatIdent__Group__0__Impl rule__PatIdent__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3408:2: rule__PatIdent__Group__0__Impl rule__PatIdent__Group__1
            {
            pushFollow(FOLLOW_rule__PatIdent__Group__0__Impl_in_rule__PatIdent__Group__07003);
            rule__PatIdent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatIdent__Group__1_in_rule__PatIdent__Group__07006);
            rule__PatIdent__Group__1();

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
    // $ANTLR end "rule__PatIdent__Group__0"


    // $ANTLR start "rule__PatIdent__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3415:1: rule__PatIdent__Group__0__Impl : ( ( rule__PatIdent__MutableAssignment_0 ) ) ;
    public final void rule__PatIdent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3419:1: ( ( ( rule__PatIdent__MutableAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3420:1: ( ( rule__PatIdent__MutableAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3420:1: ( ( rule__PatIdent__MutableAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3421:1: ( rule__PatIdent__MutableAssignment_0 )
            {
             before(grammarAccess.getPatIdentAccess().getMutableAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3422:1: ( rule__PatIdent__MutableAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3422:2: rule__PatIdent__MutableAssignment_0
            {
            pushFollow(FOLLOW_rule__PatIdent__MutableAssignment_0_in_rule__PatIdent__Group__0__Impl7033);
            rule__PatIdent__MutableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatIdentAccess().getMutableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatIdent__Group__0__Impl"


    // $ANTLR start "rule__PatIdent__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3432:1: rule__PatIdent__Group__1 : rule__PatIdent__Group__1__Impl ;
    public final void rule__PatIdent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3436:1: ( rule__PatIdent__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3437:2: rule__PatIdent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PatIdent__Group__1__Impl_in_rule__PatIdent__Group__17063);
            rule__PatIdent__Group__1__Impl();

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
    // $ANTLR end "rule__PatIdent__Group__1"


    // $ANTLR start "rule__PatIdent__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3443:1: rule__PatIdent__Group__1__Impl : ( ( rule__PatIdent__IdentAssignment_1 ) ) ;
    public final void rule__PatIdent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3447:1: ( ( ( rule__PatIdent__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3448:1: ( ( rule__PatIdent__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3448:1: ( ( rule__PatIdent__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3449:1: ( rule__PatIdent__IdentAssignment_1 )
            {
             before(grammarAccess.getPatIdentAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3450:1: ( rule__PatIdent__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3450:2: rule__PatIdent__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__PatIdent__IdentAssignment_1_in_rule__PatIdent__Group__1__Impl7090);
            rule__PatIdent__IdentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatIdentAccess().getIdentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatIdent__Group__1__Impl"


    // $ANTLR start "rule__PatBoxed__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3464:1: rule__PatBoxed__Group__0 : rule__PatBoxed__Group__0__Impl rule__PatBoxed__Group__1 ;
    public final void rule__PatBoxed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3468:1: ( rule__PatBoxed__Group__0__Impl rule__PatBoxed__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3469:2: rule__PatBoxed__Group__0__Impl rule__PatBoxed__Group__1
            {
            pushFollow(FOLLOW_rule__PatBoxed__Group__0__Impl_in_rule__PatBoxed__Group__07124);
            rule__PatBoxed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatBoxed__Group__1_in_rule__PatBoxed__Group__07127);
            rule__PatBoxed__Group__1();

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
    // $ANTLR end "rule__PatBoxed__Group__0"


    // $ANTLR start "rule__PatBoxed__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3476:1: rule__PatBoxed__Group__0__Impl : ( '@' ) ;
    public final void rule__PatBoxed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3480:1: ( ( '@' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3481:1: ( '@' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3481:1: ( '@' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3482:1: '@'
            {
             before(grammarAccess.getPatBoxedAccess().getCommercialAtKeyword_0()); 
            match(input,62,FOLLOW_62_in_rule__PatBoxed__Group__0__Impl7155); 
             after(grammarAccess.getPatBoxedAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatBoxed__Group__0__Impl"


    // $ANTLR start "rule__PatBoxed__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3495:1: rule__PatBoxed__Group__1 : rule__PatBoxed__Group__1__Impl ;
    public final void rule__PatBoxed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3499:1: ( rule__PatBoxed__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3500:2: rule__PatBoxed__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PatBoxed__Group__1__Impl_in_rule__PatBoxed__Group__17186);
            rule__PatBoxed__Group__1__Impl();

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
    // $ANTLR end "rule__PatBoxed__Group__1"


    // $ANTLR start "rule__PatBoxed__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3506:1: rule__PatBoxed__Group__1__Impl : ( ( rule__PatBoxed__PatternAssignment_1 ) ) ;
    public final void rule__PatBoxed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3510:1: ( ( ( rule__PatBoxed__PatternAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3511:1: ( ( rule__PatBoxed__PatternAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3511:1: ( ( rule__PatBoxed__PatternAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3512:1: ( rule__PatBoxed__PatternAssignment_1 )
            {
             before(grammarAccess.getPatBoxedAccess().getPatternAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3513:1: ( rule__PatBoxed__PatternAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3513:2: rule__PatBoxed__PatternAssignment_1
            {
            pushFollow(FOLLOW_rule__PatBoxed__PatternAssignment_1_in_rule__PatBoxed__Group__1__Impl7213);
            rule__PatBoxed__PatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatBoxedAccess().getPatternAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatBoxed__Group__1__Impl"


    // $ANTLR start "rule__PatOwned__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3527:1: rule__PatOwned__Group__0 : rule__PatOwned__Group__0__Impl rule__PatOwned__Group__1 ;
    public final void rule__PatOwned__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3531:1: ( rule__PatOwned__Group__0__Impl rule__PatOwned__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3532:2: rule__PatOwned__Group__0__Impl rule__PatOwned__Group__1
            {
            pushFollow(FOLLOW_rule__PatOwned__Group__0__Impl_in_rule__PatOwned__Group__07247);
            rule__PatOwned__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatOwned__Group__1_in_rule__PatOwned__Group__07250);
            rule__PatOwned__Group__1();

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
    // $ANTLR end "rule__PatOwned__Group__0"


    // $ANTLR start "rule__PatOwned__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3539:1: rule__PatOwned__Group__0__Impl : ( '~' ) ;
    public final void rule__PatOwned__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3543:1: ( ( '~' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3544:1: ( '~' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3544:1: ( '~' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3545:1: '~'
            {
             before(grammarAccess.getPatOwnedAccess().getTildeKeyword_0()); 
            match(input,63,FOLLOW_63_in_rule__PatOwned__Group__0__Impl7278); 
             after(grammarAccess.getPatOwnedAccess().getTildeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatOwned__Group__0__Impl"


    // $ANTLR start "rule__PatOwned__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3558:1: rule__PatOwned__Group__1 : rule__PatOwned__Group__1__Impl ;
    public final void rule__PatOwned__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3562:1: ( rule__PatOwned__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3563:2: rule__PatOwned__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PatOwned__Group__1__Impl_in_rule__PatOwned__Group__17309);
            rule__PatOwned__Group__1__Impl();

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
    // $ANTLR end "rule__PatOwned__Group__1"


    // $ANTLR start "rule__PatOwned__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3569:1: rule__PatOwned__Group__1__Impl : ( ( rule__PatOwned__PatternAssignment_1 ) ) ;
    public final void rule__PatOwned__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3573:1: ( ( ( rule__PatOwned__PatternAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3574:1: ( ( rule__PatOwned__PatternAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3574:1: ( ( rule__PatOwned__PatternAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3575:1: ( rule__PatOwned__PatternAssignment_1 )
            {
             before(grammarAccess.getPatOwnedAccess().getPatternAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3576:1: ( rule__PatOwned__PatternAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3576:2: rule__PatOwned__PatternAssignment_1
            {
            pushFollow(FOLLOW_rule__PatOwned__PatternAssignment_1_in_rule__PatOwned__Group__1__Impl7336);
            rule__PatOwned__PatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatOwnedAccess().getPatternAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatOwned__Group__1__Impl"


    // $ANTLR start "rule__PatBorrowed__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3590:1: rule__PatBorrowed__Group__0 : rule__PatBorrowed__Group__0__Impl rule__PatBorrowed__Group__1 ;
    public final void rule__PatBorrowed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3594:1: ( rule__PatBorrowed__Group__0__Impl rule__PatBorrowed__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3595:2: rule__PatBorrowed__Group__0__Impl rule__PatBorrowed__Group__1
            {
            pushFollow(FOLLOW_rule__PatBorrowed__Group__0__Impl_in_rule__PatBorrowed__Group__07370);
            rule__PatBorrowed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatBorrowed__Group__1_in_rule__PatBorrowed__Group__07373);
            rule__PatBorrowed__Group__1();

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
    // $ANTLR end "rule__PatBorrowed__Group__0"


    // $ANTLR start "rule__PatBorrowed__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3602:1: rule__PatBorrowed__Group__0__Impl : ( '&' ) ;
    public final void rule__PatBorrowed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3606:1: ( ( '&' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3607:1: ( '&' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3607:1: ( '&' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3608:1: '&'
            {
             before(grammarAccess.getPatBorrowedAccess().getAmpersandKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__PatBorrowed__Group__0__Impl7401); 
             after(grammarAccess.getPatBorrowedAccess().getAmpersandKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatBorrowed__Group__0__Impl"


    // $ANTLR start "rule__PatBorrowed__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3621:1: rule__PatBorrowed__Group__1 : rule__PatBorrowed__Group__1__Impl ;
    public final void rule__PatBorrowed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3625:1: ( rule__PatBorrowed__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3626:2: rule__PatBorrowed__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PatBorrowed__Group__1__Impl_in_rule__PatBorrowed__Group__17432);
            rule__PatBorrowed__Group__1__Impl();

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
    // $ANTLR end "rule__PatBorrowed__Group__1"


    // $ANTLR start "rule__PatBorrowed__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3632:1: rule__PatBorrowed__Group__1__Impl : ( ( rule__PatBorrowed__PatternAssignment_1 ) ) ;
    public final void rule__PatBorrowed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3636:1: ( ( ( rule__PatBorrowed__PatternAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3637:1: ( ( rule__PatBorrowed__PatternAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3637:1: ( ( rule__PatBorrowed__PatternAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3638:1: ( rule__PatBorrowed__PatternAssignment_1 )
            {
             before(grammarAccess.getPatBorrowedAccess().getPatternAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3639:1: ( rule__PatBorrowed__PatternAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3639:2: rule__PatBorrowed__PatternAssignment_1
            {
            pushFollow(FOLLOW_rule__PatBorrowed__PatternAssignment_1_in_rule__PatBorrowed__Group__1__Impl7459);
            rule__PatBorrowed__PatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatBorrowedAccess().getPatternAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatBorrowed__Group__1__Impl"


    // $ANTLR start "rule__PatTuple__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3653:1: rule__PatTuple__Group__0 : rule__PatTuple__Group__0__Impl rule__PatTuple__Group__1 ;
    public final void rule__PatTuple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3657:1: ( rule__PatTuple__Group__0__Impl rule__PatTuple__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3658:2: rule__PatTuple__Group__0__Impl rule__PatTuple__Group__1
            {
            pushFollow(FOLLOW_rule__PatTuple__Group__0__Impl_in_rule__PatTuple__Group__07493);
            rule__PatTuple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatTuple__Group__1_in_rule__PatTuple__Group__07496);
            rule__PatTuple__Group__1();

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
    // $ANTLR end "rule__PatTuple__Group__0"


    // $ANTLR start "rule__PatTuple__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3665:1: rule__PatTuple__Group__0__Impl : ( '(' ) ;
    public final void rule__PatTuple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3669:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3670:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3670:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3671:1: '('
            {
             before(grammarAccess.getPatTupleAccess().getLeftParenthesisKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__PatTuple__Group__0__Impl7524); 
             after(grammarAccess.getPatTupleAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatTuple__Group__0__Impl"


    // $ANTLR start "rule__PatTuple__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3684:1: rule__PatTuple__Group__1 : rule__PatTuple__Group__1__Impl rule__PatTuple__Group__2 ;
    public final void rule__PatTuple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3688:1: ( rule__PatTuple__Group__1__Impl rule__PatTuple__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3689:2: rule__PatTuple__Group__1__Impl rule__PatTuple__Group__2
            {
            pushFollow(FOLLOW_rule__PatTuple__Group__1__Impl_in_rule__PatTuple__Group__17555);
            rule__PatTuple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatTuple__Group__2_in_rule__PatTuple__Group__17558);
            rule__PatTuple__Group__2();

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
    // $ANTLR end "rule__PatTuple__Group__1"


    // $ANTLR start "rule__PatTuple__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3696:1: rule__PatTuple__Group__1__Impl : ( ( rule__PatTuple__PatternsAssignment_1 ) ) ;
    public final void rule__PatTuple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3700:1: ( ( ( rule__PatTuple__PatternsAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3701:1: ( ( rule__PatTuple__PatternsAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3701:1: ( ( rule__PatTuple__PatternsAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3702:1: ( rule__PatTuple__PatternsAssignment_1 )
            {
             before(grammarAccess.getPatTupleAccess().getPatternsAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3703:1: ( rule__PatTuple__PatternsAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3703:2: rule__PatTuple__PatternsAssignment_1
            {
            pushFollow(FOLLOW_rule__PatTuple__PatternsAssignment_1_in_rule__PatTuple__Group__1__Impl7585);
            rule__PatTuple__PatternsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatTupleAccess().getPatternsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatTuple__Group__1__Impl"


    // $ANTLR start "rule__PatTuple__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3713:1: rule__PatTuple__Group__2 : rule__PatTuple__Group__2__Impl rule__PatTuple__Group__3 ;
    public final void rule__PatTuple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3717:1: ( rule__PatTuple__Group__2__Impl rule__PatTuple__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3718:2: rule__PatTuple__Group__2__Impl rule__PatTuple__Group__3
            {
            pushFollow(FOLLOW_rule__PatTuple__Group__2__Impl_in_rule__PatTuple__Group__27615);
            rule__PatTuple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatTuple__Group__3_in_rule__PatTuple__Group__27618);
            rule__PatTuple__Group__3();

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
    // $ANTLR end "rule__PatTuple__Group__2"


    // $ANTLR start "rule__PatTuple__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3725:1: rule__PatTuple__Group__2__Impl : ( ( rule__PatTuple__Group_2__0 )* ) ;
    public final void rule__PatTuple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3729:1: ( ( ( rule__PatTuple__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3730:1: ( ( rule__PatTuple__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3730:1: ( ( rule__PatTuple__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3731:1: ( rule__PatTuple__Group_2__0 )*
            {
             before(grammarAccess.getPatTupleAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3732:1: ( rule__PatTuple__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==48) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3732:2: rule__PatTuple__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PatTuple__Group_2__0_in_rule__PatTuple__Group__2__Impl7645);
            	    rule__PatTuple__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPatTupleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatTuple__Group__2__Impl"


    // $ANTLR start "rule__PatTuple__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3742:1: rule__PatTuple__Group__3 : rule__PatTuple__Group__3__Impl ;
    public final void rule__PatTuple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3746:1: ( rule__PatTuple__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3747:2: rule__PatTuple__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PatTuple__Group__3__Impl_in_rule__PatTuple__Group__37676);
            rule__PatTuple__Group__3__Impl();

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
    // $ANTLR end "rule__PatTuple__Group__3"


    // $ANTLR start "rule__PatTuple__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3753:1: rule__PatTuple__Group__3__Impl : ( ')' ) ;
    public final void rule__PatTuple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3757:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3758:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3758:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3759:1: ')'
            {
             before(grammarAccess.getPatTupleAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FOLLOW_50_in_rule__PatTuple__Group__3__Impl7704); 
             after(grammarAccess.getPatTupleAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatTuple__Group__3__Impl"


    // $ANTLR start "rule__PatTuple__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3780:1: rule__PatTuple__Group_2__0 : rule__PatTuple__Group_2__0__Impl rule__PatTuple__Group_2__1 ;
    public final void rule__PatTuple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3784:1: ( rule__PatTuple__Group_2__0__Impl rule__PatTuple__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3785:2: rule__PatTuple__Group_2__0__Impl rule__PatTuple__Group_2__1
            {
            pushFollow(FOLLOW_rule__PatTuple__Group_2__0__Impl_in_rule__PatTuple__Group_2__07743);
            rule__PatTuple__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatTuple__Group_2__1_in_rule__PatTuple__Group_2__07746);
            rule__PatTuple__Group_2__1();

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
    // $ANTLR end "rule__PatTuple__Group_2__0"


    // $ANTLR start "rule__PatTuple__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3792:1: rule__PatTuple__Group_2__0__Impl : ( ',' ) ;
    public final void rule__PatTuple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3796:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3797:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3797:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3798:1: ','
            {
             before(grammarAccess.getPatTupleAccess().getCommaKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__PatTuple__Group_2__0__Impl7774); 
             after(grammarAccess.getPatTupleAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatTuple__Group_2__0__Impl"


    // $ANTLR start "rule__PatTuple__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3811:1: rule__PatTuple__Group_2__1 : rule__PatTuple__Group_2__1__Impl ;
    public final void rule__PatTuple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3815:1: ( rule__PatTuple__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3816:2: rule__PatTuple__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PatTuple__Group_2__1__Impl_in_rule__PatTuple__Group_2__17805);
            rule__PatTuple__Group_2__1__Impl();

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
    // $ANTLR end "rule__PatTuple__Group_2__1"


    // $ANTLR start "rule__PatTuple__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3822:1: rule__PatTuple__Group_2__1__Impl : ( ( rule__PatTuple__PatternsAssignment_2_1 ) ) ;
    public final void rule__PatTuple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3826:1: ( ( ( rule__PatTuple__PatternsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3827:1: ( ( rule__PatTuple__PatternsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3827:1: ( ( rule__PatTuple__PatternsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3828:1: ( rule__PatTuple__PatternsAssignment_2_1 )
            {
             before(grammarAccess.getPatTupleAccess().getPatternsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3829:1: ( rule__PatTuple__PatternsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3829:2: rule__PatTuple__PatternsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PatTuple__PatternsAssignment_2_1_in_rule__PatTuple__Group_2__1__Impl7832);
            rule__PatTuple__PatternsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPatTupleAccess().getPatternsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatTuple__Group_2__1__Impl"


    // $ANTLR start "rule__PatVector__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3843:1: rule__PatVector__Group__0 : rule__PatVector__Group__0__Impl rule__PatVector__Group__1 ;
    public final void rule__PatVector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3847:1: ( rule__PatVector__Group__0__Impl rule__PatVector__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3848:2: rule__PatVector__Group__0__Impl rule__PatVector__Group__1
            {
            pushFollow(FOLLOW_rule__PatVector__Group__0__Impl_in_rule__PatVector__Group__07866);
            rule__PatVector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatVector__Group__1_in_rule__PatVector__Group__07869);
            rule__PatVector__Group__1();

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
    // $ANTLR end "rule__PatVector__Group__0"


    // $ANTLR start "rule__PatVector__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3855:1: rule__PatVector__Group__0__Impl : ( '[' ) ;
    public final void rule__PatVector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3859:1: ( ( '[' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3860:1: ( '[' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3860:1: ( '[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3861:1: '['
            {
             before(grammarAccess.getPatVectorAccess().getLeftSquareBracketKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__PatVector__Group__0__Impl7897); 
             after(grammarAccess.getPatVectorAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatVector__Group__0__Impl"


    // $ANTLR start "rule__PatVector__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3874:1: rule__PatVector__Group__1 : rule__PatVector__Group__1__Impl rule__PatVector__Group__2 ;
    public final void rule__PatVector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3878:1: ( rule__PatVector__Group__1__Impl rule__PatVector__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3879:2: rule__PatVector__Group__1__Impl rule__PatVector__Group__2
            {
            pushFollow(FOLLOW_rule__PatVector__Group__1__Impl_in_rule__PatVector__Group__17928);
            rule__PatVector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatVector__Group__2_in_rule__PatVector__Group__17931);
            rule__PatVector__Group__2();

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
    // $ANTLR end "rule__PatVector__Group__1"


    // $ANTLR start "rule__PatVector__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3886:1: rule__PatVector__Group__1__Impl : ( ( rule__PatVector__PatternsAssignment_1 ) ) ;
    public final void rule__PatVector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3890:1: ( ( ( rule__PatVector__PatternsAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3891:1: ( ( rule__PatVector__PatternsAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3891:1: ( ( rule__PatVector__PatternsAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3892:1: ( rule__PatVector__PatternsAssignment_1 )
            {
             before(grammarAccess.getPatVectorAccess().getPatternsAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3893:1: ( rule__PatVector__PatternsAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3893:2: rule__PatVector__PatternsAssignment_1
            {
            pushFollow(FOLLOW_rule__PatVector__PatternsAssignment_1_in_rule__PatVector__Group__1__Impl7958);
            rule__PatVector__PatternsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatVectorAccess().getPatternsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatVector__Group__1__Impl"


    // $ANTLR start "rule__PatVector__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3903:1: rule__PatVector__Group__2 : rule__PatVector__Group__2__Impl rule__PatVector__Group__3 ;
    public final void rule__PatVector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3907:1: ( rule__PatVector__Group__2__Impl rule__PatVector__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3908:2: rule__PatVector__Group__2__Impl rule__PatVector__Group__3
            {
            pushFollow(FOLLOW_rule__PatVector__Group__2__Impl_in_rule__PatVector__Group__27988);
            rule__PatVector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatVector__Group__3_in_rule__PatVector__Group__27991);
            rule__PatVector__Group__3();

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
    // $ANTLR end "rule__PatVector__Group__2"


    // $ANTLR start "rule__PatVector__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3915:1: rule__PatVector__Group__2__Impl : ( ( rule__PatVector__Group_2__0 )* ) ;
    public final void rule__PatVector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3919:1: ( ( ( rule__PatVector__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3920:1: ( ( rule__PatVector__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3920:1: ( ( rule__PatVector__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3921:1: ( rule__PatVector__Group_2__0 )*
            {
             before(grammarAccess.getPatVectorAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3922:1: ( rule__PatVector__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3922:2: rule__PatVector__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PatVector__Group_2__0_in_rule__PatVector__Group__2__Impl8018);
            	    rule__PatVector__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getPatVectorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatVector__Group__2__Impl"


    // $ANTLR start "rule__PatVector__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3932:1: rule__PatVector__Group__3 : rule__PatVector__Group__3__Impl ;
    public final void rule__PatVector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3936:1: ( rule__PatVector__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3937:2: rule__PatVector__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PatVector__Group__3__Impl_in_rule__PatVector__Group__38049);
            rule__PatVector__Group__3__Impl();

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
    // $ANTLR end "rule__PatVector__Group__3"


    // $ANTLR start "rule__PatVector__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3943:1: rule__PatVector__Group__3__Impl : ( ']' ) ;
    public final void rule__PatVector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3947:1: ( ( ']' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3948:1: ( ']' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3948:1: ( ']' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3949:1: ']'
            {
             before(grammarAccess.getPatVectorAccess().getRightSquareBracketKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__PatVector__Group__3__Impl8077); 
             after(grammarAccess.getPatVectorAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatVector__Group__3__Impl"


    // $ANTLR start "rule__PatVector__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3970:1: rule__PatVector__Group_2__0 : rule__PatVector__Group_2__0__Impl rule__PatVector__Group_2__1 ;
    public final void rule__PatVector__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3974:1: ( rule__PatVector__Group_2__0__Impl rule__PatVector__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3975:2: rule__PatVector__Group_2__0__Impl rule__PatVector__Group_2__1
            {
            pushFollow(FOLLOW_rule__PatVector__Group_2__0__Impl_in_rule__PatVector__Group_2__08116);
            rule__PatVector__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatVector__Group_2__1_in_rule__PatVector__Group_2__08119);
            rule__PatVector__Group_2__1();

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
    // $ANTLR end "rule__PatVector__Group_2__0"


    // $ANTLR start "rule__PatVector__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3982:1: rule__PatVector__Group_2__0__Impl : ( ',' ) ;
    public final void rule__PatVector__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3986:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3987:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3987:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3988:1: ','
            {
             before(grammarAccess.getPatVectorAccess().getCommaKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__PatVector__Group_2__0__Impl8147); 
             after(grammarAccess.getPatVectorAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatVector__Group_2__0__Impl"


    // $ANTLR start "rule__PatVector__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4001:1: rule__PatVector__Group_2__1 : rule__PatVector__Group_2__1__Impl ;
    public final void rule__PatVector__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4005:1: ( rule__PatVector__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4006:2: rule__PatVector__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PatVector__Group_2__1__Impl_in_rule__PatVector__Group_2__18178);
            rule__PatVector__Group_2__1__Impl();

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
    // $ANTLR end "rule__PatVector__Group_2__1"


    // $ANTLR start "rule__PatVector__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4012:1: rule__PatVector__Group_2__1__Impl : ( ( rule__PatVector__PatternsAssignment_2_1 ) ) ;
    public final void rule__PatVector__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4016:1: ( ( ( rule__PatVector__PatternsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4017:1: ( ( rule__PatVector__PatternsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4017:1: ( ( rule__PatVector__PatternsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4018:1: ( rule__PatVector__PatternsAssignment_2_1 )
            {
             before(grammarAccess.getPatVectorAccess().getPatternsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4019:1: ( rule__PatVector__PatternsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4019:2: rule__PatVector__PatternsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PatVector__PatternsAssignment_2_1_in_rule__PatVector__Group_2__1__Impl8205);
            rule__PatVector__PatternsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPatVectorAccess().getPatternsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatVector__Group_2__1__Impl"


    // $ANTLR start "rule__PatCharRange__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4033:1: rule__PatCharRange__Group__0 : rule__PatCharRange__Group__0__Impl rule__PatCharRange__Group__1 ;
    public final void rule__PatCharRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4037:1: ( rule__PatCharRange__Group__0__Impl rule__PatCharRange__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4038:2: rule__PatCharRange__Group__0__Impl rule__PatCharRange__Group__1
            {
            pushFollow(FOLLOW_rule__PatCharRange__Group__0__Impl_in_rule__PatCharRange__Group__08239);
            rule__PatCharRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatCharRange__Group__1_in_rule__PatCharRange__Group__08242);
            rule__PatCharRange__Group__1();

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
    // $ANTLR end "rule__PatCharRange__Group__0"


    // $ANTLR start "rule__PatCharRange__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4045:1: rule__PatCharRange__Group__0__Impl : ( ( rule__PatCharRange__StartAssignment_0 ) ) ;
    public final void rule__PatCharRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4049:1: ( ( ( rule__PatCharRange__StartAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4050:1: ( ( rule__PatCharRange__StartAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4050:1: ( ( rule__PatCharRange__StartAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4051:1: ( rule__PatCharRange__StartAssignment_0 )
            {
             before(grammarAccess.getPatCharRangeAccess().getStartAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4052:1: ( rule__PatCharRange__StartAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4052:2: rule__PatCharRange__StartAssignment_0
            {
            pushFollow(FOLLOW_rule__PatCharRange__StartAssignment_0_in_rule__PatCharRange__Group__0__Impl8269);
            rule__PatCharRange__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatCharRangeAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatCharRange__Group__0__Impl"


    // $ANTLR start "rule__PatCharRange__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4062:1: rule__PatCharRange__Group__1 : rule__PatCharRange__Group__1__Impl rule__PatCharRange__Group__2 ;
    public final void rule__PatCharRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4066:1: ( rule__PatCharRange__Group__1__Impl rule__PatCharRange__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4067:2: rule__PatCharRange__Group__1__Impl rule__PatCharRange__Group__2
            {
            pushFollow(FOLLOW_rule__PatCharRange__Group__1__Impl_in_rule__PatCharRange__Group__18299);
            rule__PatCharRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatCharRange__Group__2_in_rule__PatCharRange__Group__18302);
            rule__PatCharRange__Group__2();

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
    // $ANTLR end "rule__PatCharRange__Group__1"


    // $ANTLR start "rule__PatCharRange__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4074:1: rule__PatCharRange__Group__1__Impl : ( '..' ) ;
    public final void rule__PatCharRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4078:1: ( ( '..' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4079:1: ( '..' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4079:1: ( '..' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4080:1: '..'
            {
             before(grammarAccess.getPatCharRangeAccess().getFullStopFullStopKeyword_1()); 
            match(input,66,FOLLOW_66_in_rule__PatCharRange__Group__1__Impl8330); 
             after(grammarAccess.getPatCharRangeAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatCharRange__Group__1__Impl"


    // $ANTLR start "rule__PatCharRange__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4093:1: rule__PatCharRange__Group__2 : rule__PatCharRange__Group__2__Impl ;
    public final void rule__PatCharRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4097:1: ( rule__PatCharRange__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4098:2: rule__PatCharRange__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PatCharRange__Group__2__Impl_in_rule__PatCharRange__Group__28361);
            rule__PatCharRange__Group__2__Impl();

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
    // $ANTLR end "rule__PatCharRange__Group__2"


    // $ANTLR start "rule__PatCharRange__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4104:1: rule__PatCharRange__Group__2__Impl : ( ( rule__PatCharRange__EndAssignment_2 ) ) ;
    public final void rule__PatCharRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4108:1: ( ( ( rule__PatCharRange__EndAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4109:1: ( ( rule__PatCharRange__EndAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4109:1: ( ( rule__PatCharRange__EndAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4110:1: ( rule__PatCharRange__EndAssignment_2 )
            {
             before(grammarAccess.getPatCharRangeAccess().getEndAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4111:1: ( rule__PatCharRange__EndAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4111:2: rule__PatCharRange__EndAssignment_2
            {
            pushFollow(FOLLOW_rule__PatCharRange__EndAssignment_2_in_rule__PatCharRange__Group__2__Impl8388);
            rule__PatCharRange__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatCharRangeAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatCharRange__Group__2__Impl"


    // $ANTLR start "rule__PatNumberRange__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4127:1: rule__PatNumberRange__Group__0 : rule__PatNumberRange__Group__0__Impl rule__PatNumberRange__Group__1 ;
    public final void rule__PatNumberRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4131:1: ( rule__PatNumberRange__Group__0__Impl rule__PatNumberRange__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4132:2: rule__PatNumberRange__Group__0__Impl rule__PatNumberRange__Group__1
            {
            pushFollow(FOLLOW_rule__PatNumberRange__Group__0__Impl_in_rule__PatNumberRange__Group__08424);
            rule__PatNumberRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatNumberRange__Group__1_in_rule__PatNumberRange__Group__08427);
            rule__PatNumberRange__Group__1();

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
    // $ANTLR end "rule__PatNumberRange__Group__0"


    // $ANTLR start "rule__PatNumberRange__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4139:1: rule__PatNumberRange__Group__0__Impl : ( ( rule__PatNumberRange__StartAssignment_0 ) ) ;
    public final void rule__PatNumberRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4143:1: ( ( ( rule__PatNumberRange__StartAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4144:1: ( ( rule__PatNumberRange__StartAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4144:1: ( ( rule__PatNumberRange__StartAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4145:1: ( rule__PatNumberRange__StartAssignment_0 )
            {
             before(grammarAccess.getPatNumberRangeAccess().getStartAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4146:1: ( rule__PatNumberRange__StartAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4146:2: rule__PatNumberRange__StartAssignment_0
            {
            pushFollow(FOLLOW_rule__PatNumberRange__StartAssignment_0_in_rule__PatNumberRange__Group__0__Impl8454);
            rule__PatNumberRange__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatNumberRangeAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatNumberRange__Group__0__Impl"


    // $ANTLR start "rule__PatNumberRange__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4156:1: rule__PatNumberRange__Group__1 : rule__PatNumberRange__Group__1__Impl rule__PatNumberRange__Group__2 ;
    public final void rule__PatNumberRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4160:1: ( rule__PatNumberRange__Group__1__Impl rule__PatNumberRange__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4161:2: rule__PatNumberRange__Group__1__Impl rule__PatNumberRange__Group__2
            {
            pushFollow(FOLLOW_rule__PatNumberRange__Group__1__Impl_in_rule__PatNumberRange__Group__18484);
            rule__PatNumberRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PatNumberRange__Group__2_in_rule__PatNumberRange__Group__18487);
            rule__PatNumberRange__Group__2();

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
    // $ANTLR end "rule__PatNumberRange__Group__1"


    // $ANTLR start "rule__PatNumberRange__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4168:1: rule__PatNumberRange__Group__1__Impl : ( '..' ) ;
    public final void rule__PatNumberRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4172:1: ( ( '..' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4173:1: ( '..' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4173:1: ( '..' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4174:1: '..'
            {
             before(grammarAccess.getPatNumberRangeAccess().getFullStopFullStopKeyword_1()); 
            match(input,66,FOLLOW_66_in_rule__PatNumberRange__Group__1__Impl8515); 
             after(grammarAccess.getPatNumberRangeAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatNumberRange__Group__1__Impl"


    // $ANTLR start "rule__PatNumberRange__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4187:1: rule__PatNumberRange__Group__2 : rule__PatNumberRange__Group__2__Impl ;
    public final void rule__PatNumberRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4191:1: ( rule__PatNumberRange__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4192:2: rule__PatNumberRange__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PatNumberRange__Group__2__Impl_in_rule__PatNumberRange__Group__28546);
            rule__PatNumberRange__Group__2__Impl();

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
    // $ANTLR end "rule__PatNumberRange__Group__2"


    // $ANTLR start "rule__PatNumberRange__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4198:1: rule__PatNumberRange__Group__2__Impl : ( ( rule__PatNumberRange__EndAssignment_2 ) ) ;
    public final void rule__PatNumberRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4202:1: ( ( ( rule__PatNumberRange__EndAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4203:1: ( ( rule__PatNumberRange__EndAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4203:1: ( ( rule__PatNumberRange__EndAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4204:1: ( rule__PatNumberRange__EndAssignment_2 )
            {
             before(grammarAccess.getPatNumberRangeAccess().getEndAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4205:1: ( rule__PatNumberRange__EndAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4205:2: rule__PatNumberRange__EndAssignment_2
            {
            pushFollow(FOLLOW_rule__PatNumberRange__EndAssignment_2_in_rule__PatNumberRange__Group__2__Impl8573);
            rule__PatNumberRange__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatNumberRangeAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatNumberRange__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_0__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4221:1: rule__PrimitiveType__Group_0__0 : rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1 ;
    public final void rule__PrimitiveType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4225:1: ( rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4226:2: rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_0__0__Impl_in_rule__PrimitiveType__Group_0__08609);
            rule__PrimitiveType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_0__1_in_rule__PrimitiveType__Group_0__08612);
            rule__PrimitiveType__Group_0__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_0__0"


    // $ANTLR start "rule__PrimitiveType__Group_0__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4233:1: rule__PrimitiveType__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4237:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4238:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4238:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4239:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getIntTypeAction_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4240:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4242:1: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getIntTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_0__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_0__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4252:1: rule__PrimitiveType__Group_0__1 : rule__PrimitiveType__Group_0__1__Impl ;
    public final void rule__PrimitiveType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4256:1: ( rule__PrimitiveType__Group_0__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4257:2: rule__PrimitiveType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_0__1__Impl_in_rule__PrimitiveType__Group_0__18670);
            rule__PrimitiveType__Group_0__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_0__1"


    // $ANTLR start "rule__PrimitiveType__Group_0__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4263:1: rule__PrimitiveType__Group_0__1__Impl : ( RULE_INT_TYPE ) ;
    public final void rule__PrimitiveType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4267:1: ( ( RULE_INT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4268:1: ( RULE_INT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4268:1: ( RULE_INT_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4269:1: RULE_INT_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getINT_TYPETerminalRuleCall_0_1()); 
            match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rule__PrimitiveType__Group_0__1__Impl8697); 
             after(grammarAccess.getPrimitiveTypeAccess().getINT_TYPETerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_0__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4284:1: rule__PrimitiveType__Group_1__0 : rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 ;
    public final void rule__PrimitiveType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4288:1: ( rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4289:2: rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1__0__Impl_in_rule__PrimitiveType__Group_1__08730);
            rule__PrimitiveType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_1__1_in_rule__PrimitiveType__Group_1__08733);
            rule__PrimitiveType__Group_1__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_1__0"


    // $ANTLR start "rule__PrimitiveType__Group_1__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4296:1: rule__PrimitiveType__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4300:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4301:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4301:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4302:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getFloatTypeAction_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4303:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4305:1: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getFloatTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4315:1: rule__PrimitiveType__Group_1__1 : rule__PrimitiveType__Group_1__1__Impl ;
    public final void rule__PrimitiveType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4319:1: ( rule__PrimitiveType__Group_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4320:2: rule__PrimitiveType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1__1__Impl_in_rule__PrimitiveType__Group_1__18791);
            rule__PrimitiveType__Group_1__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_1__1"


    // $ANTLR start "rule__PrimitiveType__Group_1__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4326:1: rule__PrimitiveType__Group_1__1__Impl : ( RULE_FLOAT_TYPE ) ;
    public final void rule__PrimitiveType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4330:1: ( ( RULE_FLOAT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4331:1: ( RULE_FLOAT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4331:1: ( RULE_FLOAT_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4332:1: RULE_FLOAT_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getFLOAT_TYPETerminalRuleCall_1_1()); 
            match(input,RULE_FLOAT_TYPE,FOLLOW_RULE_FLOAT_TYPE_in_rule__PrimitiveType__Group_1__1__Impl8818); 
             after(grammarAccess.getPrimitiveTypeAccess().getFLOAT_TYPETerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4347:1: rule__PrimitiveType__Group_2__0 : rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1 ;
    public final void rule__PrimitiveType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4351:1: ( rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4352:2: rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_2__0__Impl_in_rule__PrimitiveType__Group_2__08851);
            rule__PrimitiveType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_2__1_in_rule__PrimitiveType__Group_2__08854);
            rule__PrimitiveType__Group_2__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_2__0"


    // $ANTLR start "rule__PrimitiveType__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4359:1: rule__PrimitiveType__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4363:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4364:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4364:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4365:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getBoolTypeAction_2_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4366:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4368:1: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getBoolTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_2__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4378:1: rule__PrimitiveType__Group_2__1 : rule__PrimitiveType__Group_2__1__Impl ;
    public final void rule__PrimitiveType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4382:1: ( rule__PrimitiveType__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4383:2: rule__PrimitiveType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_2__1__Impl_in_rule__PrimitiveType__Group_2__18912);
            rule__PrimitiveType__Group_2__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_2__1"


    // $ANTLR start "rule__PrimitiveType__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4389:1: rule__PrimitiveType__Group_2__1__Impl : ( RULE_BOOLEAN_TYPE ) ;
    public final void rule__PrimitiveType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4393:1: ( ( RULE_BOOLEAN_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4394:1: ( RULE_BOOLEAN_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4394:1: ( RULE_BOOLEAN_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4395:1: RULE_BOOLEAN_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getBOOLEAN_TYPETerminalRuleCall_2_1()); 
            match(input,RULE_BOOLEAN_TYPE,FOLLOW_RULE_BOOLEAN_TYPE_in_rule__PrimitiveType__Group_2__1__Impl8939); 
             after(grammarAccess.getPrimitiveTypeAccess().getBOOLEAN_TYPETerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_2__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_3__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4410:1: rule__PrimitiveType__Group_3__0 : rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1 ;
    public final void rule__PrimitiveType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4414:1: ( rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4415:2: rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_3__0__Impl_in_rule__PrimitiveType__Group_3__08972);
            rule__PrimitiveType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_3__1_in_rule__PrimitiveType__Group_3__08975);
            rule__PrimitiveType__Group_3__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_3__0"


    // $ANTLR start "rule__PrimitiveType__Group_3__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4422:1: rule__PrimitiveType__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4426:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4427:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4427:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4428:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getMachineTypeAction_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4429:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4431:1: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getMachineTypeAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_3__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_3__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4441:1: rule__PrimitiveType__Group_3__1 : rule__PrimitiveType__Group_3__1__Impl ;
    public final void rule__PrimitiveType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4445:1: ( rule__PrimitiveType__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4446:2: rule__PrimitiveType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_3__1__Impl_in_rule__PrimitiveType__Group_3__19033);
            rule__PrimitiveType__Group_3__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_3__1"


    // $ANTLR start "rule__PrimitiveType__Group_3__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4452:1: rule__PrimitiveType__Group_3__1__Impl : ( RULE_MACHINE_TYPE ) ;
    public final void rule__PrimitiveType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4456:1: ( ( RULE_MACHINE_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4457:1: ( RULE_MACHINE_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4457:1: ( RULE_MACHINE_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4458:1: RULE_MACHINE_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getMACHINE_TYPETerminalRuleCall_3_1()); 
            match(input,RULE_MACHINE_TYPE,FOLLOW_RULE_MACHINE_TYPE_in_rule__PrimitiveType__Group_3__1__Impl9060); 
             after(grammarAccess.getPrimitiveTypeAccess().getMACHINE_TYPETerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_3__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_4__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4473:1: rule__PrimitiveType__Group_4__0 : rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1 ;
    public final void rule__PrimitiveType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4477:1: ( rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4478:2: rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_4__0__Impl_in_rule__PrimitiveType__Group_4__09093);
            rule__PrimitiveType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_4__1_in_rule__PrimitiveType__Group_4__09096);
            rule__PrimitiveType__Group_4__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_4__0"


    // $ANTLR start "rule__PrimitiveType__Group_4__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4485:1: rule__PrimitiveType__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4489:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4490:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4490:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4491:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getUnitTypeAction_4_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4492:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4494:1: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getUnitTypeAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_4__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_4__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4504:1: rule__PrimitiveType__Group_4__1 : rule__PrimitiveType__Group_4__1__Impl ;
    public final void rule__PrimitiveType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4508:1: ( rule__PrimitiveType__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4509:2: rule__PrimitiveType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_4__1__Impl_in_rule__PrimitiveType__Group_4__19154);
            rule__PrimitiveType__Group_4__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_4__1"


    // $ANTLR start "rule__PrimitiveType__Group_4__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4515:1: rule__PrimitiveType__Group_4__1__Impl : ( RULE_UNIT_TYPE ) ;
    public final void rule__PrimitiveType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4519:1: ( ( RULE_UNIT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4520:1: ( RULE_UNIT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4520:1: ( RULE_UNIT_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4521:1: RULE_UNIT_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getUNIT_TYPETerminalRuleCall_4_1()); 
            match(input,RULE_UNIT_TYPE,FOLLOW_RULE_UNIT_TYPE_in_rule__PrimitiveType__Group_4__1__Impl9181); 
             after(grammarAccess.getPrimitiveTypeAccess().getUNIT_TYPETerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_4__1__Impl"


    // $ANTLR start "rule__TupleType__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4536:1: rule__TupleType__Group__0 : rule__TupleType__Group__0__Impl rule__TupleType__Group__1 ;
    public final void rule__TupleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4540:1: ( rule__TupleType__Group__0__Impl rule__TupleType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4541:2: rule__TupleType__Group__0__Impl rule__TupleType__Group__1
            {
            pushFollow(FOLLOW_rule__TupleType__Group__0__Impl_in_rule__TupleType__Group__09214);
            rule__TupleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group__1_in_rule__TupleType__Group__09217);
            rule__TupleType__Group__1();

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
    // $ANTLR end "rule__TupleType__Group__0"


    // $ANTLR start "rule__TupleType__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4548:1: rule__TupleType__Group__0__Impl : ( '(' ) ;
    public final void rule__TupleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4552:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4553:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4553:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4554:1: '('
            {
             before(grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__TupleType__Group__0__Impl9245); 
             after(grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__0__Impl"


    // $ANTLR start "rule__TupleType__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4567:1: rule__TupleType__Group__1 : rule__TupleType__Group__1__Impl rule__TupleType__Group__2 ;
    public final void rule__TupleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4571:1: ( rule__TupleType__Group__1__Impl rule__TupleType__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4572:2: rule__TupleType__Group__1__Impl rule__TupleType__Group__2
            {
            pushFollow(FOLLOW_rule__TupleType__Group__1__Impl_in_rule__TupleType__Group__19276);
            rule__TupleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group__2_in_rule__TupleType__Group__19279);
            rule__TupleType__Group__2();

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
    // $ANTLR end "rule__TupleType__Group__1"


    // $ANTLR start "rule__TupleType__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4579:1: rule__TupleType__Group__1__Impl : ( ( rule__TupleType__TypesAssignment_1 ) ) ;
    public final void rule__TupleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4583:1: ( ( ( rule__TupleType__TypesAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4584:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4584:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4585:1: ( rule__TupleType__TypesAssignment_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4586:1: ( rule__TupleType__TypesAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4586:2: rule__TupleType__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__TupleType__TypesAssignment_1_in_rule__TupleType__Group__1__Impl9306);
            rule__TupleType__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTupleTypeAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__1__Impl"


    // $ANTLR start "rule__TupleType__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4596:1: rule__TupleType__Group__2 : rule__TupleType__Group__2__Impl rule__TupleType__Group__3 ;
    public final void rule__TupleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4600:1: ( rule__TupleType__Group__2__Impl rule__TupleType__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4601:2: rule__TupleType__Group__2__Impl rule__TupleType__Group__3
            {
            pushFollow(FOLLOW_rule__TupleType__Group__2__Impl_in_rule__TupleType__Group__29336);
            rule__TupleType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group__3_in_rule__TupleType__Group__29339);
            rule__TupleType__Group__3();

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
    // $ANTLR end "rule__TupleType__Group__2"


    // $ANTLR start "rule__TupleType__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4608:1: rule__TupleType__Group__2__Impl : ( ( rule__TupleType__Group_2__0 )* ) ;
    public final void rule__TupleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4612:1: ( ( ( rule__TupleType__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4613:1: ( ( rule__TupleType__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4613:1: ( ( rule__TupleType__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4614:1: ( rule__TupleType__Group_2__0 )*
            {
             before(grammarAccess.getTupleTypeAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4615:1: ( rule__TupleType__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4615:2: rule__TupleType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TupleType__Group_2__0_in_rule__TupleType__Group__2__Impl9366);
            	    rule__TupleType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTupleTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__2__Impl"


    // $ANTLR start "rule__TupleType__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4625:1: rule__TupleType__Group__3 : rule__TupleType__Group__3__Impl ;
    public final void rule__TupleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4629:1: ( rule__TupleType__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4630:2: rule__TupleType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TupleType__Group__3__Impl_in_rule__TupleType__Group__39397);
            rule__TupleType__Group__3__Impl();

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
    // $ANTLR end "rule__TupleType__Group__3"


    // $ANTLR start "rule__TupleType__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4636:1: rule__TupleType__Group__3__Impl : ( ')' ) ;
    public final void rule__TupleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4640:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4641:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4641:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4642:1: ')'
            {
             before(grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FOLLOW_50_in_rule__TupleType__Group__3__Impl9425); 
             after(grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group__3__Impl"


    // $ANTLR start "rule__TupleType__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4663:1: rule__TupleType__Group_2__0 : rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 ;
    public final void rule__TupleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4667:1: ( rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4668:2: rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1
            {
            pushFollow(FOLLOW_rule__TupleType__Group_2__0__Impl_in_rule__TupleType__Group_2__09464);
            rule__TupleType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group_2__1_in_rule__TupleType__Group_2__09467);
            rule__TupleType__Group_2__1();

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
    // $ANTLR end "rule__TupleType__Group_2__0"


    // $ANTLR start "rule__TupleType__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4675:1: rule__TupleType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TupleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4679:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4680:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4680:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4681:1: ','
            {
             before(grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__TupleType__Group_2__0__Impl9495); 
             after(grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group_2__0__Impl"


    // $ANTLR start "rule__TupleType__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4694:1: rule__TupleType__Group_2__1 : rule__TupleType__Group_2__1__Impl ;
    public final void rule__TupleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4698:1: ( rule__TupleType__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4699:2: rule__TupleType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleType__Group_2__1__Impl_in_rule__TupleType__Group_2__19526);
            rule__TupleType__Group_2__1__Impl();

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
    // $ANTLR end "rule__TupleType__Group_2__1"


    // $ANTLR start "rule__TupleType__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4705:1: rule__TupleType__Group_2__1__Impl : ( ( rule__TupleType__TypesAssignment_2_1 ) ) ;
    public final void rule__TupleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4709:1: ( ( ( rule__TupleType__TypesAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4710:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4710:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4711:1: ( rule__TupleType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4712:1: ( rule__TupleType__TypesAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4712:2: rule__TupleType__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TupleType__TypesAssignment_2_1_in_rule__TupleType__Group_2__1__Impl9553);
            rule__TupleType__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTupleTypeAccess().getTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__Group_2__1__Impl"


    // $ANTLR start "rule__StructType__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4726:1: rule__StructType__Group__0 : rule__StructType__Group__0__Impl rule__StructType__Group__1 ;
    public final void rule__StructType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4730:1: ( rule__StructType__Group__0__Impl rule__StructType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4731:2: rule__StructType__Group__0__Impl rule__StructType__Group__1
            {
            pushFollow(FOLLOW_rule__StructType__Group__0__Impl_in_rule__StructType__Group__09587);
            rule__StructType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__1_in_rule__StructType__Group__09590);
            rule__StructType__Group__1();

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
    // $ANTLR end "rule__StructType__Group__0"


    // $ANTLR start "rule__StructType__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4738:1: rule__StructType__Group__0__Impl : ( 'struct' ) ;
    public final void rule__StructType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4742:1: ( ( 'struct' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4743:1: ( 'struct' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4743:1: ( 'struct' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4744:1: 'struct'
            {
             before(grammarAccess.getStructTypeAccess().getStructKeyword_0()); 
            match(input,67,FOLLOW_67_in_rule__StructType__Group__0__Impl9618); 
             after(grammarAccess.getStructTypeAccess().getStructKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group__0__Impl"


    // $ANTLR start "rule__StructType__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4757:1: rule__StructType__Group__1 : rule__StructType__Group__1__Impl rule__StructType__Group__2 ;
    public final void rule__StructType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4761:1: ( rule__StructType__Group__1__Impl rule__StructType__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4762:2: rule__StructType__Group__1__Impl rule__StructType__Group__2
            {
            pushFollow(FOLLOW_rule__StructType__Group__1__Impl_in_rule__StructType__Group__19649);
            rule__StructType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__2_in_rule__StructType__Group__19652);
            rule__StructType__Group__2();

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
    // $ANTLR end "rule__StructType__Group__1"


    // $ANTLR start "rule__StructType__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4769:1: rule__StructType__Group__1__Impl : ( ( rule__StructType__IdentAssignment_1 ) ) ;
    public final void rule__StructType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4773:1: ( ( ( rule__StructType__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4774:1: ( ( rule__StructType__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4774:1: ( ( rule__StructType__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4775:1: ( rule__StructType__IdentAssignment_1 )
            {
             before(grammarAccess.getStructTypeAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4776:1: ( rule__StructType__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4776:2: rule__StructType__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__StructType__IdentAssignment_1_in_rule__StructType__Group__1__Impl9679);
            rule__StructType__IdentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructTypeAccess().getIdentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group__1__Impl"


    // $ANTLR start "rule__StructType__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4786:1: rule__StructType__Group__2 : rule__StructType__Group__2__Impl rule__StructType__Group__3 ;
    public final void rule__StructType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4790:1: ( rule__StructType__Group__2__Impl rule__StructType__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4791:2: rule__StructType__Group__2__Impl rule__StructType__Group__3
            {
            pushFollow(FOLLOW_rule__StructType__Group__2__Impl_in_rule__StructType__Group__29709);
            rule__StructType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__3_in_rule__StructType__Group__29712);
            rule__StructType__Group__3();

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
    // $ANTLR end "rule__StructType__Group__2"


    // $ANTLR start "rule__StructType__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4798:1: rule__StructType__Group__2__Impl : ( ( rule__StructType__Group_2__0 )? ) ;
    public final void rule__StructType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4802:1: ( ( ( rule__StructType__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4803:1: ( ( rule__StructType__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4803:1: ( ( rule__StructType__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4804:1: ( rule__StructType__Group_2__0 )?
            {
             before(grammarAccess.getStructTypeAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4805:1: ( rule__StructType__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==56) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4805:2: rule__StructType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StructType__Group_2__0_in_rule__StructType__Group__2__Impl9739);
                    rule__StructType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group__2__Impl"


    // $ANTLR start "rule__StructType__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4815:1: rule__StructType__Group__3 : rule__StructType__Group__3__Impl rule__StructType__Group__4 ;
    public final void rule__StructType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4819:1: ( rule__StructType__Group__3__Impl rule__StructType__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4820:2: rule__StructType__Group__3__Impl rule__StructType__Group__4
            {
            pushFollow(FOLLOW_rule__StructType__Group__3__Impl_in_rule__StructType__Group__39770);
            rule__StructType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__4_in_rule__StructType__Group__39773);
            rule__StructType__Group__4();

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
    // $ANTLR end "rule__StructType__Group__3"


    // $ANTLR start "rule__StructType__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4827:1: rule__StructType__Group__3__Impl : ( '{' ) ;
    public final void rule__StructType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4831:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4832:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4832:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4833:1: '{'
            {
             before(grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,53,FOLLOW_53_in_rule__StructType__Group__3__Impl9801); 
             after(grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group__3__Impl"


    // $ANTLR start "rule__StructType__Group__4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4846:1: rule__StructType__Group__4 : rule__StructType__Group__4__Impl rule__StructType__Group__5 ;
    public final void rule__StructType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4850:1: ( rule__StructType__Group__4__Impl rule__StructType__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4851:2: rule__StructType__Group__4__Impl rule__StructType__Group__5
            {
            pushFollow(FOLLOW_rule__StructType__Group__4__Impl_in_rule__StructType__Group__49832);
            rule__StructType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__5_in_rule__StructType__Group__49835);
            rule__StructType__Group__5();

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
    // $ANTLR end "rule__StructType__Group__4"


    // $ANTLR start "rule__StructType__Group__4__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4858:1: rule__StructType__Group__4__Impl : ( ( rule__StructType__FieldsAssignment_4 ) ) ;
    public final void rule__StructType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4862:1: ( ( ( rule__StructType__FieldsAssignment_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4863:1: ( ( rule__StructType__FieldsAssignment_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4863:1: ( ( rule__StructType__FieldsAssignment_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4864:1: ( rule__StructType__FieldsAssignment_4 )
            {
             before(grammarAccess.getStructTypeAccess().getFieldsAssignment_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4865:1: ( rule__StructType__FieldsAssignment_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4865:2: rule__StructType__FieldsAssignment_4
            {
            pushFollow(FOLLOW_rule__StructType__FieldsAssignment_4_in_rule__StructType__Group__4__Impl9862);
            rule__StructType__FieldsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStructTypeAccess().getFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group__4__Impl"


    // $ANTLR start "rule__StructType__Group__5"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4875:1: rule__StructType__Group__5 : rule__StructType__Group__5__Impl rule__StructType__Group__6 ;
    public final void rule__StructType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4879:1: ( rule__StructType__Group__5__Impl rule__StructType__Group__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4880:2: rule__StructType__Group__5__Impl rule__StructType__Group__6
            {
            pushFollow(FOLLOW_rule__StructType__Group__5__Impl_in_rule__StructType__Group__59892);
            rule__StructType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__6_in_rule__StructType__Group__59895);
            rule__StructType__Group__6();

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
    // $ANTLR end "rule__StructType__Group__5"


    // $ANTLR start "rule__StructType__Group__5__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4887:1: rule__StructType__Group__5__Impl : ( ( rule__StructType__Group_5__0 )* ) ;
    public final void rule__StructType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4891:1: ( ( ( rule__StructType__Group_5__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4892:1: ( ( rule__StructType__Group_5__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4892:1: ( ( rule__StructType__Group_5__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4893:1: ( rule__StructType__Group_5__0 )*
            {
             before(grammarAccess.getStructTypeAccess().getGroup_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4894:1: ( rule__StructType__Group_5__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4894:2: rule__StructType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__StructType__Group_5__0_in_rule__StructType__Group__5__Impl9922);
            	    rule__StructType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getStructTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group__5__Impl"


    // $ANTLR start "rule__StructType__Group__6"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4904:1: rule__StructType__Group__6 : rule__StructType__Group__6__Impl ;
    public final void rule__StructType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4908:1: ( rule__StructType__Group__6__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4909:2: rule__StructType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group__6__Impl_in_rule__StructType__Group__69953);
            rule__StructType__Group__6__Impl();

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
    // $ANTLR end "rule__StructType__Group__6"


    // $ANTLR start "rule__StructType__Group__6__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4915:1: rule__StructType__Group__6__Impl : ( '}' ) ;
    public final void rule__StructType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4919:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4920:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4920:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4921:1: '}'
            {
             before(grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,54,FOLLOW_54_in_rule__StructType__Group__6__Impl9981); 
             after(grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group__6__Impl"


    // $ANTLR start "rule__StructType__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4948:1: rule__StructType__Group_2__0 : rule__StructType__Group_2__0__Impl rule__StructType__Group_2__1 ;
    public final void rule__StructType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4952:1: ( rule__StructType__Group_2__0__Impl rule__StructType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4953:2: rule__StructType__Group_2__0__Impl rule__StructType__Group_2__1
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__0__Impl_in_rule__StructType__Group_2__010026);
            rule__StructType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2__1_in_rule__StructType__Group_2__010029);
            rule__StructType__Group_2__1();

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
    // $ANTLR end "rule__StructType__Group_2__0"


    // $ANTLR start "rule__StructType__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4960:1: rule__StructType__Group_2__0__Impl : ( '<' ) ;
    public final void rule__StructType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4964:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4965:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4965:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4966:1: '<'
            {
             before(grammarAccess.getStructTypeAccess().getLessThanSignKeyword_2_0()); 
            match(input,56,FOLLOW_56_in_rule__StructType__Group_2__0__Impl10057); 
             after(grammarAccess.getStructTypeAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group_2__0__Impl"


    // $ANTLR start "rule__StructType__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4979:1: rule__StructType__Group_2__1 : rule__StructType__Group_2__1__Impl rule__StructType__Group_2__2 ;
    public final void rule__StructType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4983:1: ( rule__StructType__Group_2__1__Impl rule__StructType__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4984:2: rule__StructType__Group_2__1__Impl rule__StructType__Group_2__2
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__1__Impl_in_rule__StructType__Group_2__110088);
            rule__StructType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2__2_in_rule__StructType__Group_2__110091);
            rule__StructType__Group_2__2();

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
    // $ANTLR end "rule__StructType__Group_2__1"


    // $ANTLR start "rule__StructType__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4991:1: rule__StructType__Group_2__1__Impl : ( ( rule__StructType__ParamsAssignment_2_1 ) ) ;
    public final void rule__StructType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4995:1: ( ( ( rule__StructType__ParamsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4996:1: ( ( rule__StructType__ParamsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4996:1: ( ( rule__StructType__ParamsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4997:1: ( rule__StructType__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getStructTypeAccess().getParamsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4998:1: ( rule__StructType__ParamsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4998:2: rule__StructType__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StructType__ParamsAssignment_2_1_in_rule__StructType__Group_2__1__Impl10118);
            rule__StructType__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStructTypeAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group_2__1__Impl"


    // $ANTLR start "rule__StructType__Group_2__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5008:1: rule__StructType__Group_2__2 : rule__StructType__Group_2__2__Impl rule__StructType__Group_2__3 ;
    public final void rule__StructType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5012:1: ( rule__StructType__Group_2__2__Impl rule__StructType__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5013:2: rule__StructType__Group_2__2__Impl rule__StructType__Group_2__3
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__2__Impl_in_rule__StructType__Group_2__210148);
            rule__StructType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2__3_in_rule__StructType__Group_2__210151);
            rule__StructType__Group_2__3();

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
    // $ANTLR end "rule__StructType__Group_2__2"


    // $ANTLR start "rule__StructType__Group_2__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5020:1: rule__StructType__Group_2__2__Impl : ( ( rule__StructType__Group_2_2__0 )* ) ;
    public final void rule__StructType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5024:1: ( ( ( rule__StructType__Group_2_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5025:1: ( ( rule__StructType__Group_2_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5025:1: ( ( rule__StructType__Group_2_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5026:1: ( rule__StructType__Group_2_2__0 )*
            {
             before(grammarAccess.getStructTypeAccess().getGroup_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5027:1: ( rule__StructType__Group_2_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5027:2: rule__StructType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StructType__Group_2_2__0_in_rule__StructType__Group_2__2__Impl10178);
            	    rule__StructType__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getStructTypeAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group_2__2__Impl"


    // $ANTLR start "rule__StructType__Group_2__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5037:1: rule__StructType__Group_2__3 : rule__StructType__Group_2__3__Impl ;
    public final void rule__StructType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5041:1: ( rule__StructType__Group_2__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5042:2: rule__StructType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__3__Impl_in_rule__StructType__Group_2__310209);
            rule__StructType__Group_2__3__Impl();

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
    // $ANTLR end "rule__StructType__Group_2__3"


    // $ANTLR start "rule__StructType__Group_2__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5048:1: rule__StructType__Group_2__3__Impl : ( '>' ) ;
    public final void rule__StructType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5052:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5053:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5053:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5054:1: '>'
            {
             before(grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,57,FOLLOW_57_in_rule__StructType__Group_2__3__Impl10237); 
             after(grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group_2__3__Impl"


    // $ANTLR start "rule__StructType__Group_2_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5075:1: rule__StructType__Group_2_2__0 : rule__StructType__Group_2_2__0__Impl rule__StructType__Group_2_2__1 ;
    public final void rule__StructType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5079:1: ( rule__StructType__Group_2_2__0__Impl rule__StructType__Group_2_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5080:2: rule__StructType__Group_2_2__0__Impl rule__StructType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__StructType__Group_2_2__0__Impl_in_rule__StructType__Group_2_2__010276);
            rule__StructType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2_2__1_in_rule__StructType__Group_2_2__010279);
            rule__StructType__Group_2_2__1();

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
    // $ANTLR end "rule__StructType__Group_2_2__0"


    // $ANTLR start "rule__StructType__Group_2_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5087:1: rule__StructType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__StructType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5091:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5092:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5092:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5093:1: ','
            {
             before(grammarAccess.getStructTypeAccess().getCommaKeyword_2_2_0()); 
            match(input,48,FOLLOW_48_in_rule__StructType__Group_2_2__0__Impl10307); 
             after(grammarAccess.getStructTypeAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group_2_2__0__Impl"


    // $ANTLR start "rule__StructType__Group_2_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5106:1: rule__StructType__Group_2_2__1 : rule__StructType__Group_2_2__1__Impl ;
    public final void rule__StructType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5110:1: ( rule__StructType__Group_2_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5111:2: rule__StructType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group_2_2__1__Impl_in_rule__StructType__Group_2_2__110338);
            rule__StructType__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__StructType__Group_2_2__1"


    // $ANTLR start "rule__StructType__Group_2_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5117:1: rule__StructType__Group_2_2__1__Impl : ( ( rule__StructType__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__StructType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5121:1: ( ( ( rule__StructType__ParamsAssignment_2_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5122:1: ( ( rule__StructType__ParamsAssignment_2_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5122:1: ( ( rule__StructType__ParamsAssignment_2_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5123:1: ( rule__StructType__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getStructTypeAccess().getParamsAssignment_2_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5124:1: ( rule__StructType__ParamsAssignment_2_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5124:2: rule__StructType__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__StructType__ParamsAssignment_2_2_1_in_rule__StructType__Group_2_2__1__Impl10365);
            rule__StructType__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStructTypeAccess().getParamsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group_2_2__1__Impl"


    // $ANTLR start "rule__StructType__Group_5__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5138:1: rule__StructType__Group_5__0 : rule__StructType__Group_5__0__Impl rule__StructType__Group_5__1 ;
    public final void rule__StructType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5142:1: ( rule__StructType__Group_5__0__Impl rule__StructType__Group_5__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5143:2: rule__StructType__Group_5__0__Impl rule__StructType__Group_5__1
            {
            pushFollow(FOLLOW_rule__StructType__Group_5__0__Impl_in_rule__StructType__Group_5__010399);
            rule__StructType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_5__1_in_rule__StructType__Group_5__010402);
            rule__StructType__Group_5__1();

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
    // $ANTLR end "rule__StructType__Group_5__0"


    // $ANTLR start "rule__StructType__Group_5__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5150:1: rule__StructType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StructType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5154:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5155:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5155:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5156:1: ','
            {
             before(grammarAccess.getStructTypeAccess().getCommaKeyword_5_0()); 
            match(input,48,FOLLOW_48_in_rule__StructType__Group_5__0__Impl10430); 
             after(grammarAccess.getStructTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group_5__0__Impl"


    // $ANTLR start "rule__StructType__Group_5__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5169:1: rule__StructType__Group_5__1 : rule__StructType__Group_5__1__Impl ;
    public final void rule__StructType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5173:1: ( rule__StructType__Group_5__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5174:2: rule__StructType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group_5__1__Impl_in_rule__StructType__Group_5__110461);
            rule__StructType__Group_5__1__Impl();

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
    // $ANTLR end "rule__StructType__Group_5__1"


    // $ANTLR start "rule__StructType__Group_5__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5180:1: rule__StructType__Group_5__1__Impl : ( ( rule__StructType__FieldsAssignment_5_1 ) ) ;
    public final void rule__StructType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5184:1: ( ( ( rule__StructType__FieldsAssignment_5_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5185:1: ( ( rule__StructType__FieldsAssignment_5_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5185:1: ( ( rule__StructType__FieldsAssignment_5_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5186:1: ( rule__StructType__FieldsAssignment_5_1 )
            {
             before(grammarAccess.getStructTypeAccess().getFieldsAssignment_5_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5187:1: ( rule__StructType__FieldsAssignment_5_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5187:2: rule__StructType__FieldsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StructType__FieldsAssignment_5_1_in_rule__StructType__Group_5__1__Impl10488);
            rule__StructType__FieldsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStructTypeAccess().getFieldsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__Group_5__1__Impl"


    // $ANTLR start "rule__BoxedPointer__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5201:1: rule__BoxedPointer__Group__0 : rule__BoxedPointer__Group__0__Impl rule__BoxedPointer__Group__1 ;
    public final void rule__BoxedPointer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5205:1: ( rule__BoxedPointer__Group__0__Impl rule__BoxedPointer__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5206:2: rule__BoxedPointer__Group__0__Impl rule__BoxedPointer__Group__1
            {
            pushFollow(FOLLOW_rule__BoxedPointer__Group__0__Impl_in_rule__BoxedPointer__Group__010522);
            rule__BoxedPointer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoxedPointer__Group__1_in_rule__BoxedPointer__Group__010525);
            rule__BoxedPointer__Group__1();

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
    // $ANTLR end "rule__BoxedPointer__Group__0"


    // $ANTLR start "rule__BoxedPointer__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5213:1: rule__BoxedPointer__Group__0__Impl : ( '@' ) ;
    public final void rule__BoxedPointer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5217:1: ( ( '@' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5218:1: ( '@' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5218:1: ( '@' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5219:1: '@'
            {
             before(grammarAccess.getBoxedPointerAccess().getCommercialAtKeyword_0()); 
            match(input,62,FOLLOW_62_in_rule__BoxedPointer__Group__0__Impl10553); 
             after(grammarAccess.getBoxedPointerAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPointer__Group__0__Impl"


    // $ANTLR start "rule__BoxedPointer__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5232:1: rule__BoxedPointer__Group__1 : rule__BoxedPointer__Group__1__Impl ;
    public final void rule__BoxedPointer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5236:1: ( rule__BoxedPointer__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5237:2: rule__BoxedPointer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoxedPointer__Group__1__Impl_in_rule__BoxedPointer__Group__110584);
            rule__BoxedPointer__Group__1__Impl();

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
    // $ANTLR end "rule__BoxedPointer__Group__1"


    // $ANTLR start "rule__BoxedPointer__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5243:1: rule__BoxedPointer__Group__1__Impl : ( ( rule__BoxedPointer__TypeAssignment_1 ) ) ;
    public final void rule__BoxedPointer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5247:1: ( ( ( rule__BoxedPointer__TypeAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5248:1: ( ( rule__BoxedPointer__TypeAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5248:1: ( ( rule__BoxedPointer__TypeAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5249:1: ( rule__BoxedPointer__TypeAssignment_1 )
            {
             before(grammarAccess.getBoxedPointerAccess().getTypeAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5250:1: ( rule__BoxedPointer__TypeAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5250:2: rule__BoxedPointer__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BoxedPointer__TypeAssignment_1_in_rule__BoxedPointer__Group__1__Impl10611);
            rule__BoxedPointer__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxedPointerAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPointer__Group__1__Impl"


    // $ANTLR start "rule__OwnedPointer__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5264:1: rule__OwnedPointer__Group__0 : rule__OwnedPointer__Group__0__Impl rule__OwnedPointer__Group__1 ;
    public final void rule__OwnedPointer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5268:1: ( rule__OwnedPointer__Group__0__Impl rule__OwnedPointer__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5269:2: rule__OwnedPointer__Group__0__Impl rule__OwnedPointer__Group__1
            {
            pushFollow(FOLLOW_rule__OwnedPointer__Group__0__Impl_in_rule__OwnedPointer__Group__010645);
            rule__OwnedPointer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OwnedPointer__Group__1_in_rule__OwnedPointer__Group__010648);
            rule__OwnedPointer__Group__1();

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
    // $ANTLR end "rule__OwnedPointer__Group__0"


    // $ANTLR start "rule__OwnedPointer__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5276:1: rule__OwnedPointer__Group__0__Impl : ( '~' ) ;
    public final void rule__OwnedPointer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5280:1: ( ( '~' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5281:1: ( '~' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5281:1: ( '~' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5282:1: '~'
            {
             before(grammarAccess.getOwnedPointerAccess().getTildeKeyword_0()); 
            match(input,63,FOLLOW_63_in_rule__OwnedPointer__Group__0__Impl10676); 
             after(grammarAccess.getOwnedPointerAccess().getTildeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedPointer__Group__0__Impl"


    // $ANTLR start "rule__OwnedPointer__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5295:1: rule__OwnedPointer__Group__1 : rule__OwnedPointer__Group__1__Impl ;
    public final void rule__OwnedPointer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5299:1: ( rule__OwnedPointer__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5300:2: rule__OwnedPointer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OwnedPointer__Group__1__Impl_in_rule__OwnedPointer__Group__110707);
            rule__OwnedPointer__Group__1__Impl();

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
    // $ANTLR end "rule__OwnedPointer__Group__1"


    // $ANTLR start "rule__OwnedPointer__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5306:1: rule__OwnedPointer__Group__1__Impl : ( ( rule__OwnedPointer__TypeAssignment_1 ) ) ;
    public final void rule__OwnedPointer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5310:1: ( ( ( rule__OwnedPointer__TypeAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5311:1: ( ( rule__OwnedPointer__TypeAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5311:1: ( ( rule__OwnedPointer__TypeAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5312:1: ( rule__OwnedPointer__TypeAssignment_1 )
            {
             before(grammarAccess.getOwnedPointerAccess().getTypeAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5313:1: ( rule__OwnedPointer__TypeAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5313:2: rule__OwnedPointer__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__OwnedPointer__TypeAssignment_1_in_rule__OwnedPointer__Group__1__Impl10734);
            rule__OwnedPointer__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOwnedPointerAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedPointer__Group__1__Impl"


    // $ANTLR start "rule__BorrowedPointer__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5327:1: rule__BorrowedPointer__Group__0 : rule__BorrowedPointer__Group__0__Impl rule__BorrowedPointer__Group__1 ;
    public final void rule__BorrowedPointer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5331:1: ( rule__BorrowedPointer__Group__0__Impl rule__BorrowedPointer__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5332:2: rule__BorrowedPointer__Group__0__Impl rule__BorrowedPointer__Group__1
            {
            pushFollow(FOLLOW_rule__BorrowedPointer__Group__0__Impl_in_rule__BorrowedPointer__Group__010768);
            rule__BorrowedPointer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorrowedPointer__Group__1_in_rule__BorrowedPointer__Group__010771);
            rule__BorrowedPointer__Group__1();

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
    // $ANTLR end "rule__BorrowedPointer__Group__0"


    // $ANTLR start "rule__BorrowedPointer__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5339:1: rule__BorrowedPointer__Group__0__Impl : ( '&' ) ;
    public final void rule__BorrowedPointer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5343:1: ( ( '&' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5344:1: ( '&' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5344:1: ( '&' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5345:1: '&'
            {
             before(grammarAccess.getBorrowedPointerAccess().getAmpersandKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__BorrowedPointer__Group__0__Impl10799); 
             after(grammarAccess.getBorrowedPointerAccess().getAmpersandKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorrowedPointer__Group__0__Impl"


    // $ANTLR start "rule__BorrowedPointer__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5358:1: rule__BorrowedPointer__Group__1 : rule__BorrowedPointer__Group__1__Impl ;
    public final void rule__BorrowedPointer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5362:1: ( rule__BorrowedPointer__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5363:2: rule__BorrowedPointer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BorrowedPointer__Group__1__Impl_in_rule__BorrowedPointer__Group__110830);
            rule__BorrowedPointer__Group__1__Impl();

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
    // $ANTLR end "rule__BorrowedPointer__Group__1"


    // $ANTLR start "rule__BorrowedPointer__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5369:1: rule__BorrowedPointer__Group__1__Impl : ( ( rule__BorrowedPointer__TypeAssignment_1 ) ) ;
    public final void rule__BorrowedPointer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5373:1: ( ( ( rule__BorrowedPointer__TypeAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5374:1: ( ( rule__BorrowedPointer__TypeAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5374:1: ( ( rule__BorrowedPointer__TypeAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5375:1: ( rule__BorrowedPointer__TypeAssignment_1 )
            {
             before(grammarAccess.getBorrowedPointerAccess().getTypeAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5376:1: ( rule__BorrowedPointer__TypeAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5376:2: rule__BorrowedPointer__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BorrowedPointer__TypeAssignment_1_in_rule__BorrowedPointer__Group__1__Impl10857);
            rule__BorrowedPointer__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBorrowedPointerAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorrowedPointer__Group__1__Impl"


    // $ANTLR start "rule__StructField__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5390:1: rule__StructField__Group__0 : rule__StructField__Group__0__Impl rule__StructField__Group__1 ;
    public final void rule__StructField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5394:1: ( rule__StructField__Group__0__Impl rule__StructField__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5395:2: rule__StructField__Group__0__Impl rule__StructField__Group__1
            {
            pushFollow(FOLLOW_rule__StructField__Group__0__Impl_in_rule__StructField__Group__010891);
            rule__StructField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructField__Group__1_in_rule__StructField__Group__010894);
            rule__StructField__Group__1();

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
    // $ANTLR end "rule__StructField__Group__0"


    // $ANTLR start "rule__StructField__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5402:1: rule__StructField__Group__0__Impl : ( ( rule__StructField__VisAssignment_0 )? ) ;
    public final void rule__StructField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5406:1: ( ( ( rule__StructField__VisAssignment_0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5407:1: ( ( rule__StructField__VisAssignment_0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5407:1: ( ( rule__StructField__VisAssignment_0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5408:1: ( rule__StructField__VisAssignment_0 )?
            {
             before(grammarAccess.getStructFieldAccess().getVisAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5409:1: ( rule__StructField__VisAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=44 && LA29_0<=45)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5409:2: rule__StructField__VisAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StructField__VisAssignment_0_in_rule__StructField__Group__0__Impl10921);
                    rule__StructField__VisAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructFieldAccess().getVisAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__0__Impl"


    // $ANTLR start "rule__StructField__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5419:1: rule__StructField__Group__1 : rule__StructField__Group__1__Impl rule__StructField__Group__2 ;
    public final void rule__StructField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5423:1: ( rule__StructField__Group__1__Impl rule__StructField__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5424:2: rule__StructField__Group__1__Impl rule__StructField__Group__2
            {
            pushFollow(FOLLOW_rule__StructField__Group__1__Impl_in_rule__StructField__Group__110952);
            rule__StructField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructField__Group__2_in_rule__StructField__Group__110955);
            rule__StructField__Group__2();

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
    // $ANTLR end "rule__StructField__Group__1"


    // $ANTLR start "rule__StructField__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5431:1: rule__StructField__Group__1__Impl : ( ( rule__StructField__IdentAssignment_1 ) ) ;
    public final void rule__StructField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5435:1: ( ( ( rule__StructField__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5436:1: ( ( rule__StructField__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5436:1: ( ( rule__StructField__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5437:1: ( rule__StructField__IdentAssignment_1 )
            {
             before(grammarAccess.getStructFieldAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5438:1: ( rule__StructField__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5438:2: rule__StructField__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__StructField__IdentAssignment_1_in_rule__StructField__Group__1__Impl10982);
            rule__StructField__IdentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldAccess().getIdentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__1__Impl"


    // $ANTLR start "rule__StructField__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5448:1: rule__StructField__Group__2 : rule__StructField__Group__2__Impl rule__StructField__Group__3 ;
    public final void rule__StructField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5452:1: ( rule__StructField__Group__2__Impl rule__StructField__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5453:2: rule__StructField__Group__2__Impl rule__StructField__Group__3
            {
            pushFollow(FOLLOW_rule__StructField__Group__2__Impl_in_rule__StructField__Group__211012);
            rule__StructField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructField__Group__3_in_rule__StructField__Group__211015);
            rule__StructField__Group__3();

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
    // $ANTLR end "rule__StructField__Group__2"


    // $ANTLR start "rule__StructField__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5460:1: rule__StructField__Group__2__Impl : ( ':' ) ;
    public final void rule__StructField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5464:1: ( ( ':' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5465:1: ( ':' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5465:1: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5466:1: ':'
            {
             before(grammarAccess.getStructFieldAccess().getColonKeyword_2()); 
            match(input,59,FOLLOW_59_in_rule__StructField__Group__2__Impl11043); 
             after(grammarAccess.getStructFieldAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__2__Impl"


    // $ANTLR start "rule__StructField__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5479:1: rule__StructField__Group__3 : rule__StructField__Group__3__Impl ;
    public final void rule__StructField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5483:1: ( rule__StructField__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5484:2: rule__StructField__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StructField__Group__3__Impl_in_rule__StructField__Group__311074);
            rule__StructField__Group__3__Impl();

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
    // $ANTLR end "rule__StructField__Group__3"


    // $ANTLR start "rule__StructField__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5490:1: rule__StructField__Group__3__Impl : ( ( rule__StructField__TypeAssignment_3 ) ) ;
    public final void rule__StructField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5494:1: ( ( ( rule__StructField__TypeAssignment_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5495:1: ( ( rule__StructField__TypeAssignment_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5495:1: ( ( rule__StructField__TypeAssignment_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5496:1: ( rule__StructField__TypeAssignment_3 )
            {
             before(grammarAccess.getStructFieldAccess().getTypeAssignment_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5497:1: ( rule__StructField__TypeAssignment_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5497:2: rule__StructField__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__StructField__TypeAssignment_3_in_rule__StructField__Group__3__Impl11101);
            rule__StructField__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__3__Impl"


    // $ANTLR start "rule__EnumType__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5515:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5519:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5520:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__011139);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__011142);
            rule__EnumType__Group__1();

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
    // $ANTLR end "rule__EnumType__Group__0"


    // $ANTLR start "rule__EnumType__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5527:1: rule__EnumType__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5531:1: ( ( 'enum' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5532:1: ( 'enum' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5532:1: ( 'enum' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5533:1: 'enum'
            {
             before(grammarAccess.getEnumTypeAccess().getEnumKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__EnumType__Group__0__Impl11170); 
             after(grammarAccess.getEnumTypeAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0__Impl"


    // $ANTLR start "rule__EnumType__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5546:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5550:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5551:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__111201);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__111204);
            rule__EnumType__Group__2();

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
    // $ANTLR end "rule__EnumType__Group__1"


    // $ANTLR start "rule__EnumType__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5558:1: rule__EnumType__Group__1__Impl : ( ( rule__EnumType__IdentAssignment_1 ) ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5562:1: ( ( ( rule__EnumType__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5563:1: ( ( rule__EnumType__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5563:1: ( ( rule__EnumType__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5564:1: ( rule__EnumType__IdentAssignment_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5565:1: ( rule__EnumType__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5565:2: rule__EnumType__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumType__IdentAssignment_1_in_rule__EnumType__Group__1__Impl11231);
            rule__EnumType__IdentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getIdentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1__Impl"


    // $ANTLR start "rule__EnumType__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5575:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5579:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5580:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__211261);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__211264);
            rule__EnumType__Group__3();

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
    // $ANTLR end "rule__EnumType__Group__2"


    // $ANTLR start "rule__EnumType__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5587:1: rule__EnumType__Group__2__Impl : ( ( rule__EnumType__Group_2__0 )? ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5591:1: ( ( ( rule__EnumType__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5592:1: ( ( rule__EnumType__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5592:1: ( ( rule__EnumType__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5593:1: ( rule__EnumType__Group_2__0 )?
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5594:1: ( rule__EnumType__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5594:2: rule__EnumType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumType__Group_2__0_in_rule__EnumType__Group__2__Impl11291);
                    rule__EnumType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2__Impl"


    // $ANTLR start "rule__EnumType__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5604:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5608:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5609:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__311322);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__311325);
            rule__EnumType__Group__4();

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
    // $ANTLR end "rule__EnumType__Group__3"


    // $ANTLR start "rule__EnumType__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5616:1: rule__EnumType__Group__3__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5620:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5621:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5621:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5622:1: '{'
            {
             before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,53,FOLLOW_53_in_rule__EnumType__Group__3__Impl11353); 
             after(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3__Impl"


    // $ANTLR start "rule__EnumType__Group__4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5635:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5639:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5640:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__411384);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__411387);
            rule__EnumType__Group__5();

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
    // $ANTLR end "rule__EnumType__Group__4"


    // $ANTLR start "rule__EnumType__Group__4__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5647:1: rule__EnumType__Group__4__Impl : ( ( rule__EnumType__VariantsAssignment_4 ) ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5651:1: ( ( ( rule__EnumType__VariantsAssignment_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5652:1: ( ( rule__EnumType__VariantsAssignment_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5652:1: ( ( rule__EnumType__VariantsAssignment_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5653:1: ( rule__EnumType__VariantsAssignment_4 )
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsAssignment_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5654:1: ( rule__EnumType__VariantsAssignment_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5654:2: rule__EnumType__VariantsAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumType__VariantsAssignment_4_in_rule__EnumType__Group__4__Impl11414);
            rule__EnumType__VariantsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getVariantsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4__Impl"


    // $ANTLR start "rule__EnumType__Group__5"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5664:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl rule__EnumType__Group__6 ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5668:1: ( rule__EnumType__Group__5__Impl rule__EnumType__Group__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5669:2: rule__EnumType__Group__5__Impl rule__EnumType__Group__6
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__511444);
            rule__EnumType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__511447);
            rule__EnumType__Group__6();

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
    // $ANTLR end "rule__EnumType__Group__5"


    // $ANTLR start "rule__EnumType__Group__5__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5676:1: rule__EnumType__Group__5__Impl : ( ( rule__EnumType__Group_5__0 )* ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5680:1: ( ( ( rule__EnumType__Group_5__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5681:1: ( ( rule__EnumType__Group_5__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5681:1: ( ( rule__EnumType__Group_5__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5682:1: ( rule__EnumType__Group_5__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5683:1: ( rule__EnumType__Group_5__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==48) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5683:2: rule__EnumType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_5__0_in_rule__EnumType__Group__5__Impl11474);
            	    rule__EnumType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEnumTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5__Impl"


    // $ANTLR start "rule__EnumType__Group__6"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5693:1: rule__EnumType__Group__6 : rule__EnumType__Group__6__Impl ;
    public final void rule__EnumType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5697:1: ( rule__EnumType__Group__6__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5698:2: rule__EnumType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__611505);
            rule__EnumType__Group__6__Impl();

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
    // $ANTLR end "rule__EnumType__Group__6"


    // $ANTLR start "rule__EnumType__Group__6__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5704:1: rule__EnumType__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5708:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5709:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5709:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5710:1: '}'
            {
             before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,54,FOLLOW_54_in_rule__EnumType__Group__6__Impl11533); 
             after(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__6__Impl"


    // $ANTLR start "rule__EnumType__Group_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5737:1: rule__EnumType__Group_2__0 : rule__EnumType__Group_2__0__Impl rule__EnumType__Group_2__1 ;
    public final void rule__EnumType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5741:1: ( rule__EnumType__Group_2__0__Impl rule__EnumType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5742:2: rule__EnumType__Group_2__0__Impl rule__EnumType__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__0__Impl_in_rule__EnumType__Group_2__011578);
            rule__EnumType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2__1_in_rule__EnumType__Group_2__011581);
            rule__EnumType__Group_2__1();

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
    // $ANTLR end "rule__EnumType__Group_2__0"


    // $ANTLR start "rule__EnumType__Group_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5749:1: rule__EnumType__Group_2__0__Impl : ( '<' ) ;
    public final void rule__EnumType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5753:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5754:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5754:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5755:1: '<'
            {
             before(grammarAccess.getEnumTypeAccess().getLessThanSignKeyword_2_0()); 
            match(input,56,FOLLOW_56_in_rule__EnumType__Group_2__0__Impl11609); 
             after(grammarAccess.getEnumTypeAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_2__0__Impl"


    // $ANTLR start "rule__EnumType__Group_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5768:1: rule__EnumType__Group_2__1 : rule__EnumType__Group_2__1__Impl rule__EnumType__Group_2__2 ;
    public final void rule__EnumType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5772:1: ( rule__EnumType__Group_2__1__Impl rule__EnumType__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5773:2: rule__EnumType__Group_2__1__Impl rule__EnumType__Group_2__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__1__Impl_in_rule__EnumType__Group_2__111640);
            rule__EnumType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2__2_in_rule__EnumType__Group_2__111643);
            rule__EnumType__Group_2__2();

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
    // $ANTLR end "rule__EnumType__Group_2__1"


    // $ANTLR start "rule__EnumType__Group_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5780:1: rule__EnumType__Group_2__1__Impl : ( ( rule__EnumType__ParamsAssignment_2_1 ) ) ;
    public final void rule__EnumType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5784:1: ( ( ( rule__EnumType__ParamsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5785:1: ( ( rule__EnumType__ParamsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5785:1: ( ( rule__EnumType__ParamsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5786:1: ( rule__EnumType__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5787:1: ( rule__EnumType__ParamsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5787:2: rule__EnumType__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumType__ParamsAssignment_2_1_in_rule__EnumType__Group_2__1__Impl11670);
            rule__EnumType__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_2__1__Impl"


    // $ANTLR start "rule__EnumType__Group_2__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5797:1: rule__EnumType__Group_2__2 : rule__EnumType__Group_2__2__Impl rule__EnumType__Group_2__3 ;
    public final void rule__EnumType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5801:1: ( rule__EnumType__Group_2__2__Impl rule__EnumType__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5802:2: rule__EnumType__Group_2__2__Impl rule__EnumType__Group_2__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__2__Impl_in_rule__EnumType__Group_2__211700);
            rule__EnumType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2__3_in_rule__EnumType__Group_2__211703);
            rule__EnumType__Group_2__3();

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
    // $ANTLR end "rule__EnumType__Group_2__2"


    // $ANTLR start "rule__EnumType__Group_2__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5809:1: rule__EnumType__Group_2__2__Impl : ( ( rule__EnumType__Group_2_2__0 )* ) ;
    public final void rule__EnumType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5813:1: ( ( ( rule__EnumType__Group_2_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5814:1: ( ( rule__EnumType__Group_2_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5814:1: ( ( rule__EnumType__Group_2_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5815:1: ( rule__EnumType__Group_2_2__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5816:1: ( rule__EnumType__Group_2_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==48) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5816:2: rule__EnumType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_2_2__0_in_rule__EnumType__Group_2__2__Impl11730);
            	    rule__EnumType__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getEnumTypeAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_2__2__Impl"


    // $ANTLR start "rule__EnumType__Group_2__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5826:1: rule__EnumType__Group_2__3 : rule__EnumType__Group_2__3__Impl ;
    public final void rule__EnumType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5830:1: ( rule__EnumType__Group_2__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5831:2: rule__EnumType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__3__Impl_in_rule__EnumType__Group_2__311761);
            rule__EnumType__Group_2__3__Impl();

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
    // $ANTLR end "rule__EnumType__Group_2__3"


    // $ANTLR start "rule__EnumType__Group_2__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5837:1: rule__EnumType__Group_2__3__Impl : ( '>' ) ;
    public final void rule__EnumType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5841:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5842:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5842:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5843:1: '>'
            {
             before(grammarAccess.getEnumTypeAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,57,FOLLOW_57_in_rule__EnumType__Group_2__3__Impl11789); 
             after(grammarAccess.getEnumTypeAccess().getGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_2__3__Impl"


    // $ANTLR start "rule__EnumType__Group_2_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5864:1: rule__EnumType__Group_2_2__0 : rule__EnumType__Group_2_2__0__Impl rule__EnumType__Group_2_2__1 ;
    public final void rule__EnumType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5868:1: ( rule__EnumType__Group_2_2__0__Impl rule__EnumType__Group_2_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5869:2: rule__EnumType__Group_2_2__0__Impl rule__EnumType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2_2__0__Impl_in_rule__EnumType__Group_2_2__011828);
            rule__EnumType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2_2__1_in_rule__EnumType__Group_2_2__011831);
            rule__EnumType__Group_2_2__1();

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
    // $ANTLR end "rule__EnumType__Group_2_2__0"


    // $ANTLR start "rule__EnumType__Group_2_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5876:1: rule__EnumType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5880:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5881:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5881:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5882:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_2_2_0()); 
            match(input,48,FOLLOW_48_in_rule__EnumType__Group_2_2__0__Impl11859); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_2_2__0__Impl"


    // $ANTLR start "rule__EnumType__Group_2_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5895:1: rule__EnumType__Group_2_2__1 : rule__EnumType__Group_2_2__1__Impl ;
    public final void rule__EnumType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5899:1: ( rule__EnumType__Group_2_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5900:2: rule__EnumType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2_2__1__Impl_in_rule__EnumType__Group_2_2__111890);
            rule__EnumType__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__EnumType__Group_2_2__1"


    // $ANTLR start "rule__EnumType__Group_2_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5906:1: rule__EnumType__Group_2_2__1__Impl : ( ( rule__EnumType__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__EnumType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5910:1: ( ( ( rule__EnumType__ParamsAssignment_2_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5911:1: ( ( rule__EnumType__ParamsAssignment_2_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5911:1: ( ( rule__EnumType__ParamsAssignment_2_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5912:1: ( rule__EnumType__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5913:1: ( rule__EnumType__ParamsAssignment_2_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5913:2: rule__EnumType__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__EnumType__ParamsAssignment_2_2_1_in_rule__EnumType__Group_2_2__1__Impl11917);
            rule__EnumType__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_2_2__1__Impl"


    // $ANTLR start "rule__EnumType__Group_5__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5927:1: rule__EnumType__Group_5__0 : rule__EnumType__Group_5__0__Impl rule__EnumType__Group_5__1 ;
    public final void rule__EnumType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5931:1: ( rule__EnumType__Group_5__0__Impl rule__EnumType__Group_5__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5932:2: rule__EnumType__Group_5__0__Impl rule__EnumType__Group_5__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_5__0__Impl_in_rule__EnumType__Group_5__011951);
            rule__EnumType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_5__1_in_rule__EnumType__Group_5__011954);
            rule__EnumType__Group_5__1();

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
    // $ANTLR end "rule__EnumType__Group_5__0"


    // $ANTLR start "rule__EnumType__Group_5__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5939:1: rule__EnumType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5943:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5944:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5944:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5945:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_5_0()); 
            match(input,48,FOLLOW_48_in_rule__EnumType__Group_5__0__Impl11982); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_5__0__Impl"


    // $ANTLR start "rule__EnumType__Group_5__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5958:1: rule__EnumType__Group_5__1 : rule__EnumType__Group_5__1__Impl ;
    public final void rule__EnumType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5962:1: ( rule__EnumType__Group_5__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5963:2: rule__EnumType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_5__1__Impl_in_rule__EnumType__Group_5__112013);
            rule__EnumType__Group_5__1__Impl();

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
    // $ANTLR end "rule__EnumType__Group_5__1"


    // $ANTLR start "rule__EnumType__Group_5__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5969:1: rule__EnumType__Group_5__1__Impl : ( ( rule__EnumType__VariantsAssignment_5_1 ) ) ;
    public final void rule__EnumType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5973:1: ( ( ( rule__EnumType__VariantsAssignment_5_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5974:1: ( ( rule__EnumType__VariantsAssignment_5_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5974:1: ( ( rule__EnumType__VariantsAssignment_5_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5975:1: ( rule__EnumType__VariantsAssignment_5_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsAssignment_5_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5976:1: ( rule__EnumType__VariantsAssignment_5_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5976:2: rule__EnumType__VariantsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EnumType__VariantsAssignment_5_1_in_rule__EnumType__Group_5__1__Impl12040);
            rule__EnumType__VariantsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getVariantsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_5__1__Impl"


    // $ANTLR start "rule__StructVariant__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5990:1: rule__StructVariant__Group__0 : rule__StructVariant__Group__0__Impl rule__StructVariant__Group__1 ;
    public final void rule__StructVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5994:1: ( rule__StructVariant__Group__0__Impl rule__StructVariant__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5995:2: rule__StructVariant__Group__0__Impl rule__StructVariant__Group__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__0__Impl_in_rule__StructVariant__Group__012074);
            rule__StructVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__1_in_rule__StructVariant__Group__012077);
            rule__StructVariant__Group__1();

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
    // $ANTLR end "rule__StructVariant__Group__0"


    // $ANTLR start "rule__StructVariant__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6002:1: rule__StructVariant__Group__0__Impl : ( ( rule__StructVariant__IdentAssignment_0 ) ) ;
    public final void rule__StructVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6006:1: ( ( ( rule__StructVariant__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6007:1: ( ( rule__StructVariant__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6007:1: ( ( rule__StructVariant__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6008:1: ( rule__StructVariant__IdentAssignment_0 )
            {
             before(grammarAccess.getStructVariantAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6009:1: ( rule__StructVariant__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6009:2: rule__StructVariant__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__StructVariant__IdentAssignment_0_in_rule__StructVariant__Group__0__Impl12104);
            rule__StructVariant__IdentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStructVariantAccess().getIdentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group__0__Impl"


    // $ANTLR start "rule__StructVariant__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6019:1: rule__StructVariant__Group__1 : rule__StructVariant__Group__1__Impl rule__StructVariant__Group__2 ;
    public final void rule__StructVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6023:1: ( rule__StructVariant__Group__1__Impl rule__StructVariant__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6024:2: rule__StructVariant__Group__1__Impl rule__StructVariant__Group__2
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__1__Impl_in_rule__StructVariant__Group__112134);
            rule__StructVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__2_in_rule__StructVariant__Group__112137);
            rule__StructVariant__Group__2();

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
    // $ANTLR end "rule__StructVariant__Group__1"


    // $ANTLR start "rule__StructVariant__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6031:1: rule__StructVariant__Group__1__Impl : ( ( rule__StructVariant__Group_1__0 )? ) ;
    public final void rule__StructVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6035:1: ( ( ( rule__StructVariant__Group_1__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6036:1: ( ( rule__StructVariant__Group_1__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6036:1: ( ( rule__StructVariant__Group_1__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6037:1: ( rule__StructVariant__Group_1__0 )?
            {
             before(grammarAccess.getStructVariantAccess().getGroup_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6038:1: ( rule__StructVariant__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6038:2: rule__StructVariant__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StructVariant__Group_1__0_in_rule__StructVariant__Group__1__Impl12164);
                    rule__StructVariant__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructVariantAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group__1__Impl"


    // $ANTLR start "rule__StructVariant__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6048:1: rule__StructVariant__Group__2 : rule__StructVariant__Group__2__Impl rule__StructVariant__Group__3 ;
    public final void rule__StructVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6052:1: ( rule__StructVariant__Group__2__Impl rule__StructVariant__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6053:2: rule__StructVariant__Group__2__Impl rule__StructVariant__Group__3
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__2__Impl_in_rule__StructVariant__Group__212195);
            rule__StructVariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__3_in_rule__StructVariant__Group__212198);
            rule__StructVariant__Group__3();

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
    // $ANTLR end "rule__StructVariant__Group__2"


    // $ANTLR start "rule__StructVariant__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6060:1: rule__StructVariant__Group__2__Impl : ( '{' ) ;
    public final void rule__StructVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6064:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6065:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6065:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6066:1: '{'
            {
             before(grammarAccess.getStructVariantAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,53,FOLLOW_53_in_rule__StructVariant__Group__2__Impl12226); 
             after(grammarAccess.getStructVariantAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group__2__Impl"


    // $ANTLR start "rule__StructVariant__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6079:1: rule__StructVariant__Group__3 : rule__StructVariant__Group__3__Impl rule__StructVariant__Group__4 ;
    public final void rule__StructVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6083:1: ( rule__StructVariant__Group__3__Impl rule__StructVariant__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6084:2: rule__StructVariant__Group__3__Impl rule__StructVariant__Group__4
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__3__Impl_in_rule__StructVariant__Group__312257);
            rule__StructVariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__4_in_rule__StructVariant__Group__312260);
            rule__StructVariant__Group__4();

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
    // $ANTLR end "rule__StructVariant__Group__3"


    // $ANTLR start "rule__StructVariant__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6091:1: rule__StructVariant__Group__3__Impl : ( ( rule__StructVariant__FieldsAssignment_3 ) ) ;
    public final void rule__StructVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6095:1: ( ( ( rule__StructVariant__FieldsAssignment_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6096:1: ( ( rule__StructVariant__FieldsAssignment_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6096:1: ( ( rule__StructVariant__FieldsAssignment_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6097:1: ( rule__StructVariant__FieldsAssignment_3 )
            {
             before(grammarAccess.getStructVariantAccess().getFieldsAssignment_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6098:1: ( rule__StructVariant__FieldsAssignment_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6098:2: rule__StructVariant__FieldsAssignment_3
            {
            pushFollow(FOLLOW_rule__StructVariant__FieldsAssignment_3_in_rule__StructVariant__Group__3__Impl12287);
            rule__StructVariant__FieldsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStructVariantAccess().getFieldsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group__3__Impl"


    // $ANTLR start "rule__StructVariant__Group__4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6108:1: rule__StructVariant__Group__4 : rule__StructVariant__Group__4__Impl rule__StructVariant__Group__5 ;
    public final void rule__StructVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6112:1: ( rule__StructVariant__Group__4__Impl rule__StructVariant__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6113:2: rule__StructVariant__Group__4__Impl rule__StructVariant__Group__5
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__4__Impl_in_rule__StructVariant__Group__412317);
            rule__StructVariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__5_in_rule__StructVariant__Group__412320);
            rule__StructVariant__Group__5();

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
    // $ANTLR end "rule__StructVariant__Group__4"


    // $ANTLR start "rule__StructVariant__Group__4__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6120:1: rule__StructVariant__Group__4__Impl : ( ( rule__StructVariant__Group_4__0 )* ) ;
    public final void rule__StructVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6124:1: ( ( ( rule__StructVariant__Group_4__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6125:1: ( ( rule__StructVariant__Group_4__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6125:1: ( ( rule__StructVariant__Group_4__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6126:1: ( rule__StructVariant__Group_4__0 )*
            {
             before(grammarAccess.getStructVariantAccess().getGroup_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6127:1: ( rule__StructVariant__Group_4__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==48) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6127:2: rule__StructVariant__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__StructVariant__Group_4__0_in_rule__StructVariant__Group__4__Impl12347);
            	    rule__StructVariant__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getStructVariantAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group__4__Impl"


    // $ANTLR start "rule__StructVariant__Group__5"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6137:1: rule__StructVariant__Group__5 : rule__StructVariant__Group__5__Impl ;
    public final void rule__StructVariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6141:1: ( rule__StructVariant__Group__5__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6142:2: rule__StructVariant__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__5__Impl_in_rule__StructVariant__Group__512378);
            rule__StructVariant__Group__5__Impl();

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
    // $ANTLR end "rule__StructVariant__Group__5"


    // $ANTLR start "rule__StructVariant__Group__5__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6148:1: rule__StructVariant__Group__5__Impl : ( '}' ) ;
    public final void rule__StructVariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6152:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6153:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6153:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6154:1: '}'
            {
             before(grammarAccess.getStructVariantAccess().getRightCurlyBracketKeyword_5()); 
            match(input,54,FOLLOW_54_in_rule__StructVariant__Group__5__Impl12406); 
             after(grammarAccess.getStructVariantAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group__5__Impl"


    // $ANTLR start "rule__StructVariant__Group_1__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6179:1: rule__StructVariant__Group_1__0 : rule__StructVariant__Group_1__0__Impl rule__StructVariant__Group_1__1 ;
    public final void rule__StructVariant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6183:1: ( rule__StructVariant__Group_1__0__Impl rule__StructVariant__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6184:2: rule__StructVariant__Group_1__0__Impl rule__StructVariant__Group_1__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__0__Impl_in_rule__StructVariant__Group_1__012449);
            rule__StructVariant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1__1_in_rule__StructVariant__Group_1__012452);
            rule__StructVariant__Group_1__1();

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
    // $ANTLR end "rule__StructVariant__Group_1__0"


    // $ANTLR start "rule__StructVariant__Group_1__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6191:1: rule__StructVariant__Group_1__0__Impl : ( '<' ) ;
    public final void rule__StructVariant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6195:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6196:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6196:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6197:1: '<'
            {
             before(grammarAccess.getStructVariantAccess().getLessThanSignKeyword_1_0()); 
            match(input,56,FOLLOW_56_in_rule__StructVariant__Group_1__0__Impl12480); 
             after(grammarAccess.getStructVariantAccess().getLessThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group_1__0__Impl"


    // $ANTLR start "rule__StructVariant__Group_1__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6210:1: rule__StructVariant__Group_1__1 : rule__StructVariant__Group_1__1__Impl rule__StructVariant__Group_1__2 ;
    public final void rule__StructVariant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6214:1: ( rule__StructVariant__Group_1__1__Impl rule__StructVariant__Group_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6215:2: rule__StructVariant__Group_1__1__Impl rule__StructVariant__Group_1__2
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__1__Impl_in_rule__StructVariant__Group_1__112511);
            rule__StructVariant__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1__2_in_rule__StructVariant__Group_1__112514);
            rule__StructVariant__Group_1__2();

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
    // $ANTLR end "rule__StructVariant__Group_1__1"


    // $ANTLR start "rule__StructVariant__Group_1__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6222:1: rule__StructVariant__Group_1__1__Impl : ( ( rule__StructVariant__ParamsAssignment_1_1 ) ) ;
    public final void rule__StructVariant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6226:1: ( ( ( rule__StructVariant__ParamsAssignment_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6227:1: ( ( rule__StructVariant__ParamsAssignment_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6227:1: ( ( rule__StructVariant__ParamsAssignment_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6228:1: ( rule__StructVariant__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getStructVariantAccess().getParamsAssignment_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6229:1: ( rule__StructVariant__ParamsAssignment_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6229:2: rule__StructVariant__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StructVariant__ParamsAssignment_1_1_in_rule__StructVariant__Group_1__1__Impl12541);
            rule__StructVariant__ParamsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStructVariantAccess().getParamsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group_1__1__Impl"


    // $ANTLR start "rule__StructVariant__Group_1__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6239:1: rule__StructVariant__Group_1__2 : rule__StructVariant__Group_1__2__Impl rule__StructVariant__Group_1__3 ;
    public final void rule__StructVariant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6243:1: ( rule__StructVariant__Group_1__2__Impl rule__StructVariant__Group_1__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6244:2: rule__StructVariant__Group_1__2__Impl rule__StructVariant__Group_1__3
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__2__Impl_in_rule__StructVariant__Group_1__212571);
            rule__StructVariant__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1__3_in_rule__StructVariant__Group_1__212574);
            rule__StructVariant__Group_1__3();

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
    // $ANTLR end "rule__StructVariant__Group_1__2"


    // $ANTLR start "rule__StructVariant__Group_1__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6251:1: rule__StructVariant__Group_1__2__Impl : ( ( rule__StructVariant__Group_1_2__0 )* ) ;
    public final void rule__StructVariant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6255:1: ( ( ( rule__StructVariant__Group_1_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6256:1: ( ( rule__StructVariant__Group_1_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6256:1: ( ( rule__StructVariant__Group_1_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6257:1: ( rule__StructVariant__Group_1_2__0 )*
            {
             before(grammarAccess.getStructVariantAccess().getGroup_1_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6258:1: ( rule__StructVariant__Group_1_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6258:2: rule__StructVariant__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StructVariant__Group_1_2__0_in_rule__StructVariant__Group_1__2__Impl12601);
            	    rule__StructVariant__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getStructVariantAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group_1__2__Impl"


    // $ANTLR start "rule__StructVariant__Group_1__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6268:1: rule__StructVariant__Group_1__3 : rule__StructVariant__Group_1__3__Impl ;
    public final void rule__StructVariant__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6272:1: ( rule__StructVariant__Group_1__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6273:2: rule__StructVariant__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__3__Impl_in_rule__StructVariant__Group_1__312632);
            rule__StructVariant__Group_1__3__Impl();

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
    // $ANTLR end "rule__StructVariant__Group_1__3"


    // $ANTLR start "rule__StructVariant__Group_1__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6279:1: rule__StructVariant__Group_1__3__Impl : ( '>' ) ;
    public final void rule__StructVariant__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6283:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6284:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6284:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6285:1: '>'
            {
             before(grammarAccess.getStructVariantAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,57,FOLLOW_57_in_rule__StructVariant__Group_1__3__Impl12660); 
             after(grammarAccess.getStructVariantAccess().getGreaterThanSignKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group_1__3__Impl"


    // $ANTLR start "rule__StructVariant__Group_1_2__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6306:1: rule__StructVariant__Group_1_2__0 : rule__StructVariant__Group_1_2__0__Impl rule__StructVariant__Group_1_2__1 ;
    public final void rule__StructVariant__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6310:1: ( rule__StructVariant__Group_1_2__0__Impl rule__StructVariant__Group_1_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6311:2: rule__StructVariant__Group_1_2__0__Impl rule__StructVariant__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1_2__0__Impl_in_rule__StructVariant__Group_1_2__012699);
            rule__StructVariant__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1_2__1_in_rule__StructVariant__Group_1_2__012702);
            rule__StructVariant__Group_1_2__1();

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
    // $ANTLR end "rule__StructVariant__Group_1_2__0"


    // $ANTLR start "rule__StructVariant__Group_1_2__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6318:1: rule__StructVariant__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__StructVariant__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6322:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6323:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6323:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6324:1: ','
            {
             before(grammarAccess.getStructVariantAccess().getCommaKeyword_1_2_0()); 
            match(input,48,FOLLOW_48_in_rule__StructVariant__Group_1_2__0__Impl12730); 
             after(grammarAccess.getStructVariantAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group_1_2__0__Impl"


    // $ANTLR start "rule__StructVariant__Group_1_2__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6337:1: rule__StructVariant__Group_1_2__1 : rule__StructVariant__Group_1_2__1__Impl ;
    public final void rule__StructVariant__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6341:1: ( rule__StructVariant__Group_1_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6342:2: rule__StructVariant__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1_2__1__Impl_in_rule__StructVariant__Group_1_2__112761);
            rule__StructVariant__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__StructVariant__Group_1_2__1"


    // $ANTLR start "rule__StructVariant__Group_1_2__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6348:1: rule__StructVariant__Group_1_2__1__Impl : ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__StructVariant__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6352:1: ( ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6353:1: ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6353:1: ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6354:1: ( rule__StructVariant__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getStructVariantAccess().getParamsAssignment_1_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6355:1: ( rule__StructVariant__ParamsAssignment_1_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6355:2: rule__StructVariant__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__StructVariant__ParamsAssignment_1_2_1_in_rule__StructVariant__Group_1_2__1__Impl12788);
            rule__StructVariant__ParamsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStructVariantAccess().getParamsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group_1_2__1__Impl"


    // $ANTLR start "rule__StructVariant__Group_4__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6369:1: rule__StructVariant__Group_4__0 : rule__StructVariant__Group_4__0__Impl rule__StructVariant__Group_4__1 ;
    public final void rule__StructVariant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6373:1: ( rule__StructVariant__Group_4__0__Impl rule__StructVariant__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6374:2: rule__StructVariant__Group_4__0__Impl rule__StructVariant__Group_4__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_4__0__Impl_in_rule__StructVariant__Group_4__012822);
            rule__StructVariant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_4__1_in_rule__StructVariant__Group_4__012825);
            rule__StructVariant__Group_4__1();

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
    // $ANTLR end "rule__StructVariant__Group_4__0"


    // $ANTLR start "rule__StructVariant__Group_4__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6381:1: rule__StructVariant__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StructVariant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6385:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6386:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6386:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6387:1: ','
            {
             before(grammarAccess.getStructVariantAccess().getCommaKeyword_4_0()); 
            match(input,48,FOLLOW_48_in_rule__StructVariant__Group_4__0__Impl12853); 
             after(grammarAccess.getStructVariantAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group_4__0__Impl"


    // $ANTLR start "rule__StructVariant__Group_4__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6400:1: rule__StructVariant__Group_4__1 : rule__StructVariant__Group_4__1__Impl ;
    public final void rule__StructVariant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6404:1: ( rule__StructVariant__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6405:2: rule__StructVariant__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_4__1__Impl_in_rule__StructVariant__Group_4__112884);
            rule__StructVariant__Group_4__1__Impl();

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
    // $ANTLR end "rule__StructVariant__Group_4__1"


    // $ANTLR start "rule__StructVariant__Group_4__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6411:1: rule__StructVariant__Group_4__1__Impl : ( ( rule__StructVariant__FieldsAssignment_4_1 ) ) ;
    public final void rule__StructVariant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6415:1: ( ( ( rule__StructVariant__FieldsAssignment_4_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6416:1: ( ( rule__StructVariant__FieldsAssignment_4_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6416:1: ( ( rule__StructVariant__FieldsAssignment_4_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6417:1: ( rule__StructVariant__FieldsAssignment_4_1 )
            {
             before(grammarAccess.getStructVariantAccess().getFieldsAssignment_4_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6418:1: ( rule__StructVariant__FieldsAssignment_4_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6418:2: rule__StructVariant__FieldsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StructVariant__FieldsAssignment_4_1_in_rule__StructVariant__Group_4__1__Impl12911);
            rule__StructVariant__FieldsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStructVariantAccess().getFieldsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__Group_4__1__Impl"


    // $ANTLR start "rule__TupleVariant__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6432:1: rule__TupleVariant__Group__0 : rule__TupleVariant__Group__0__Impl rule__TupleVariant__Group__1 ;
    public final void rule__TupleVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6436:1: ( rule__TupleVariant__Group__0__Impl rule__TupleVariant__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6437:2: rule__TupleVariant__Group__0__Impl rule__TupleVariant__Group__1
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__0__Impl_in_rule__TupleVariant__Group__012945);
            rule__TupleVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__1_in_rule__TupleVariant__Group__012948);
            rule__TupleVariant__Group__1();

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
    // $ANTLR end "rule__TupleVariant__Group__0"


    // $ANTLR start "rule__TupleVariant__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6444:1: rule__TupleVariant__Group__0__Impl : ( ( rule__TupleVariant__IdentAssignment_0 ) ) ;
    public final void rule__TupleVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6448:1: ( ( ( rule__TupleVariant__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6449:1: ( ( rule__TupleVariant__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6449:1: ( ( rule__TupleVariant__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6450:1: ( rule__TupleVariant__IdentAssignment_0 )
            {
             before(grammarAccess.getTupleVariantAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6451:1: ( rule__TupleVariant__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6451:2: rule__TupleVariant__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__TupleVariant__IdentAssignment_0_in_rule__TupleVariant__Group__0__Impl12975);
            rule__TupleVariant__IdentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTupleVariantAccess().getIdentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__Group__0__Impl"


    // $ANTLR start "rule__TupleVariant__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6461:1: rule__TupleVariant__Group__1 : rule__TupleVariant__Group__1__Impl rule__TupleVariant__Group__2 ;
    public final void rule__TupleVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6465:1: ( rule__TupleVariant__Group__1__Impl rule__TupleVariant__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6466:2: rule__TupleVariant__Group__1__Impl rule__TupleVariant__Group__2
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__1__Impl_in_rule__TupleVariant__Group__113005);
            rule__TupleVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__2_in_rule__TupleVariant__Group__113008);
            rule__TupleVariant__Group__2();

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
    // $ANTLR end "rule__TupleVariant__Group__1"


    // $ANTLR start "rule__TupleVariant__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6473:1: rule__TupleVariant__Group__1__Impl : ( '(' ) ;
    public final void rule__TupleVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6477:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6478:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6478:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6479:1: '('
            {
             before(grammarAccess.getTupleVariantAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__TupleVariant__Group__1__Impl13036); 
             after(grammarAccess.getTupleVariantAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__Group__1__Impl"


    // $ANTLR start "rule__TupleVariant__Group__2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6492:1: rule__TupleVariant__Group__2 : rule__TupleVariant__Group__2__Impl rule__TupleVariant__Group__3 ;
    public final void rule__TupleVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6496:1: ( rule__TupleVariant__Group__2__Impl rule__TupleVariant__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6497:2: rule__TupleVariant__Group__2__Impl rule__TupleVariant__Group__3
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__2__Impl_in_rule__TupleVariant__Group__213067);
            rule__TupleVariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__3_in_rule__TupleVariant__Group__213070);
            rule__TupleVariant__Group__3();

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
    // $ANTLR end "rule__TupleVariant__Group__2"


    // $ANTLR start "rule__TupleVariant__Group__2__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6504:1: rule__TupleVariant__Group__2__Impl : ( ( rule__TupleVariant__TypesAssignment_2 ) ) ;
    public final void rule__TupleVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6508:1: ( ( ( rule__TupleVariant__TypesAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6509:1: ( ( rule__TupleVariant__TypesAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6509:1: ( ( rule__TupleVariant__TypesAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6510:1: ( rule__TupleVariant__TypesAssignment_2 )
            {
             before(grammarAccess.getTupleVariantAccess().getTypesAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6511:1: ( rule__TupleVariant__TypesAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6511:2: rule__TupleVariant__TypesAssignment_2
            {
            pushFollow(FOLLOW_rule__TupleVariant__TypesAssignment_2_in_rule__TupleVariant__Group__2__Impl13097);
            rule__TupleVariant__TypesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTupleVariantAccess().getTypesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__Group__2__Impl"


    // $ANTLR start "rule__TupleVariant__Group__3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6521:1: rule__TupleVariant__Group__3 : rule__TupleVariant__Group__3__Impl rule__TupleVariant__Group__4 ;
    public final void rule__TupleVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6525:1: ( rule__TupleVariant__Group__3__Impl rule__TupleVariant__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6526:2: rule__TupleVariant__Group__3__Impl rule__TupleVariant__Group__4
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__3__Impl_in_rule__TupleVariant__Group__313127);
            rule__TupleVariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__4_in_rule__TupleVariant__Group__313130);
            rule__TupleVariant__Group__4();

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
    // $ANTLR end "rule__TupleVariant__Group__3"


    // $ANTLR start "rule__TupleVariant__Group__3__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6533:1: rule__TupleVariant__Group__3__Impl : ( ( rule__TupleVariant__Group_3__0 )* ) ;
    public final void rule__TupleVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6537:1: ( ( ( rule__TupleVariant__Group_3__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6538:1: ( ( rule__TupleVariant__Group_3__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6538:1: ( ( rule__TupleVariant__Group_3__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6539:1: ( rule__TupleVariant__Group_3__0 )*
            {
             before(grammarAccess.getTupleVariantAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6540:1: ( rule__TupleVariant__Group_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==48) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6540:2: rule__TupleVariant__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TupleVariant__Group_3__0_in_rule__TupleVariant__Group__3__Impl13157);
            	    rule__TupleVariant__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getTupleVariantAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__Group__3__Impl"


    // $ANTLR start "rule__TupleVariant__Group__4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6550:1: rule__TupleVariant__Group__4 : rule__TupleVariant__Group__4__Impl ;
    public final void rule__TupleVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6554:1: ( rule__TupleVariant__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6555:2: rule__TupleVariant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__4__Impl_in_rule__TupleVariant__Group__413188);
            rule__TupleVariant__Group__4__Impl();

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
    // $ANTLR end "rule__TupleVariant__Group__4"


    // $ANTLR start "rule__TupleVariant__Group__4__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6561:1: rule__TupleVariant__Group__4__Impl : ( ')' ) ;
    public final void rule__TupleVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6565:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6566:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6566:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6567:1: ')'
            {
             before(grammarAccess.getTupleVariantAccess().getRightParenthesisKeyword_4()); 
            match(input,50,FOLLOW_50_in_rule__TupleVariant__Group__4__Impl13216); 
             after(grammarAccess.getTupleVariantAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__Group__4__Impl"


    // $ANTLR start "rule__TupleVariant__Group_3__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6590:1: rule__TupleVariant__Group_3__0 : rule__TupleVariant__Group_3__0__Impl rule__TupleVariant__Group_3__1 ;
    public final void rule__TupleVariant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6594:1: ( rule__TupleVariant__Group_3__0__Impl rule__TupleVariant__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6595:2: rule__TupleVariant__Group_3__0__Impl rule__TupleVariant__Group_3__1
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group_3__0__Impl_in_rule__TupleVariant__Group_3__013257);
            rule__TupleVariant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group_3__1_in_rule__TupleVariant__Group_3__013260);
            rule__TupleVariant__Group_3__1();

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
    // $ANTLR end "rule__TupleVariant__Group_3__0"


    // $ANTLR start "rule__TupleVariant__Group_3__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6602:1: rule__TupleVariant__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TupleVariant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6606:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6607:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6607:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6608:1: ','
            {
             before(grammarAccess.getTupleVariantAccess().getCommaKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__TupleVariant__Group_3__0__Impl13288); 
             after(grammarAccess.getTupleVariantAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__Group_3__0__Impl"


    // $ANTLR start "rule__TupleVariant__Group_3__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6621:1: rule__TupleVariant__Group_3__1 : rule__TupleVariant__Group_3__1__Impl ;
    public final void rule__TupleVariant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6625:1: ( rule__TupleVariant__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6626:2: rule__TupleVariant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group_3__1__Impl_in_rule__TupleVariant__Group_3__113319);
            rule__TupleVariant__Group_3__1__Impl();

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
    // $ANTLR end "rule__TupleVariant__Group_3__1"


    // $ANTLR start "rule__TupleVariant__Group_3__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6632:1: rule__TupleVariant__Group_3__1__Impl : ( ( rule__TupleVariant__TypesAssignment_3_1 ) ) ;
    public final void rule__TupleVariant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6636:1: ( ( ( rule__TupleVariant__TypesAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6637:1: ( ( rule__TupleVariant__TypesAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6637:1: ( ( rule__TupleVariant__TypesAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6638:1: ( rule__TupleVariant__TypesAssignment_3_1 )
            {
             before(grammarAccess.getTupleVariantAccess().getTypesAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6639:1: ( rule__TupleVariant__TypesAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6639:2: rule__TupleVariant__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TupleVariant__TypesAssignment_3_1_in_rule__TupleVariant__Group_3__1__Impl13346);
            rule__TupleVariant__TypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTupleVariantAccess().getTypesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__Group_3__1__Impl"


    // $ANTLR start "rule__Crate__ItemsAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6654:1: rule__Crate__ItemsAssignment : ( ruleItemAndAttrs ) ;
    public final void rule__Crate__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6658:1: ( ( ruleItemAndAttrs ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6659:1: ( ruleItemAndAttrs )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6659:1: ( ruleItemAndAttrs )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6660:1: ruleItemAndAttrs
            {
             before(grammarAccess.getCrateAccess().getItemsItemAndAttrsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment13385);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6669:1: rule__ItemAttr__AttrsAssignment_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6673:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6674:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6674:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6675:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_113416);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6684:1: rule__ItemAttr__AttrsAssignment_2_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6688:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6689:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6689:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6690:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_113447);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6699:1: rule__AttrWithList__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__AttrWithList__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6703:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6704:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6704:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6705:1: RULE_IDENT
            {
             before(grammarAccess.getAttrWithListAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_013478); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6714:1: rule__AttrWithList__AttrsAssignment_2 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6718:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6719:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6719:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6720:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_213509);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6729:1: rule__AttrWithList__AttrsAssignment_3_1 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6733:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6734:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6734:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6735:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_113540);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6744:1: rule__LiteralAttr__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__LiteralAttr__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6748:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6749:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6749:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6750:1: RULE_IDENT
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_013571); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6759:1: rule__LiteralAttr__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__LiteralAttr__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6763:1: ( ( ruleLiteral ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6764:1: ( ruleLiteral )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6764:1: ( ruleLiteral )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6765:1: ruleLiteral
            {
             before(grammarAccess.getLiteralAttrAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_213602);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6774:1: rule__ItemAndAttrs__AttrsAssignment_0 : ( ruleItemAttr ) ;
    public final void rule__ItemAndAttrs__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6778:1: ( ( ruleItemAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6779:1: ( ruleItemAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6779:1: ( ruleItemAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6780:1: ruleItemAttr
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsItemAttrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_013633);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6789:1: rule__ItemAndAttrs__ItemAssignment_1 : ( ruleItem ) ;
    public final void rule__ItemAndAttrs__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6793:1: ( ( ruleItem ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6794:1: ( ruleItem )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6794:1: ( ruleItem )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6795:1: ruleItem
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_113664);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6804:1: rule__ModItem__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__ModItem__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6808:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6809:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6809:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6810:1: RULE_IDENT
            {
             before(grammarAccess.getModItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_113695); 
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


    // $ANTLR start "rule__ModItem__ExternalBodyAssignment_2_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6819:1: rule__ModItem__ExternalBodyAssignment_2_0 : ( ( ';' ) ) ;
    public final void rule__ModItem__ExternalBodyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6823:1: ( ( ( ';' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6824:1: ( ( ';' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6824:1: ( ( ';' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6825:1: ( ';' )
            {
             before(grammarAccess.getModItemAccess().getExternalBodySemicolonKeyword_2_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6826:1: ( ';' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6827:1: ';'
            {
             before(grammarAccess.getModItemAccess().getExternalBodySemicolonKeyword_2_0_0()); 
            match(input,69,FOLLOW_69_in_rule__ModItem__ExternalBodyAssignment_2_013731); 
             after(grammarAccess.getModItemAccess().getExternalBodySemicolonKeyword_2_0_0()); 

            }

             after(grammarAccess.getModItemAccess().getExternalBodySemicolonKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__ExternalBodyAssignment_2_0"


    // $ANTLR start "rule__ModItem__ItemsAssignment_2_1_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6842:1: rule__ModItem__ItemsAssignment_2_1_1 : ( ruleItemAndAttrs ) ;
    public final void rule__ModItem__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6846:1: ( ( ruleItemAndAttrs ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6847:1: ( ruleItemAndAttrs )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6847:1: ( ruleItemAndAttrs )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6848:1: ruleItemAndAttrs
            {
             before(grammarAccess.getModItemAccess().getItemsItemAndAttrsParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_rule__ModItem__ItemsAssignment_2_1_113770);
            ruleItemAndAttrs();

            state._fsp--;

             after(grammarAccess.getModItemAccess().getItemsItemAndAttrsParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModItem__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__FnItem__IdentAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6857:1: rule__FnItem__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__FnItem__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6861:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6862:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6862:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6863:1: RULE_IDENT
            {
             before(grammarAccess.getFnItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__FnItem__IdentAssignment_113801); 
             after(grammarAccess.getFnItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__IdentAssignment_1"


    // $ANTLR start "rule__FnItem__ParamsAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6872:1: rule__FnItem__ParamsAssignment_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__FnItem__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6876:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6877:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6877:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6878:1: ruleGenericParamDecl
            {
             before(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_113832);
            ruleGenericParamDecl();

            state._fsp--;

             after(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__ParamsAssignment_2_1"


    // $ANTLR start "rule__FnItem__ParamsAssignment_2_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6887:1: rule__FnItem__ParamsAssignment_2_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__FnItem__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6891:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6892:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6892:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6893:1: ruleGenericParamDecl
            {
             before(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_2_113863);
            ruleGenericParamDecl();

            state._fsp--;

             after(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__FnItem__ArgsAssignment_4_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6902:1: rule__FnItem__ArgsAssignment_4_0 : ( ruleArg ) ;
    public final void rule__FnItem__ArgsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6906:1: ( ( ruleArg ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6907:1: ( ruleArg )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6907:1: ( ruleArg )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6908:1: ruleArg
            {
             before(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_013894);
            ruleArg();

            state._fsp--;

             after(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__ArgsAssignment_4_0"


    // $ANTLR start "rule__FnItem__ArgsAssignment_4_1_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6917:1: rule__FnItem__ArgsAssignment_4_1_1 : ( ruleArg ) ;
    public final void rule__FnItem__ArgsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6921:1: ( ( ruleArg ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6922:1: ( ruleArg )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6922:1: ( ruleArg )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6923:1: ruleArg
            {
             before(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_1_113925);
            ruleArg();

            state._fsp--;

             after(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__ArgsAssignment_4_1_1"


    // $ANTLR start "rule__FnItem__ReturnTypeAssignment_6_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6932:1: rule__FnItem__ReturnTypeAssignment_6_1 : ( ruleType ) ;
    public final void rule__FnItem__ReturnTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6936:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6937:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6937:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6938:1: ruleType
            {
             before(grammarAccess.getFnItemAccess().getReturnTypeTypeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__FnItem__ReturnTypeAssignment_6_113956);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFnItemAccess().getReturnTypeTypeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__ReturnTypeAssignment_6_1"


    // $ANTLR start "rule__FnItem__BodyAssignment_7"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6947:1: rule__FnItem__BodyAssignment_7 : ( ruleBlock ) ;
    public final void rule__FnItem__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6951:1: ( ( ruleBlock ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6952:1: ( ruleBlock )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6952:1: ( ruleBlock )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6953:1: ruleBlock
            {
             before(grammarAccess.getFnItemAccess().getBodyBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__FnItem__BodyAssignment_713987);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getFnItemAccess().getBodyBlockParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FnItem__BodyAssignment_7"


    // $ANTLR start "rule__GenericParamDecl__IdentAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6962:1: rule__GenericParamDecl__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__GenericParamDecl__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6966:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6967:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6967:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6968:1: RULE_IDENT
            {
             before(grammarAccess.getGenericParamDeclAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__IdentAssignment_014018); 
             after(grammarAccess.getGenericParamDeclAccess().getIdentIDENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__IdentAssignment_0"


    // $ANTLR start "rule__GenericParamDecl__BoundsAssignment_1_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6977:1: rule__GenericParamDecl__BoundsAssignment_1_1 : ( RULE_IDENT ) ;
    public final void rule__GenericParamDecl__BoundsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6981:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6982:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6982:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6983:1: RULE_IDENT
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_114049); 
             after(grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__BoundsAssignment_1_1"


    // $ANTLR start "rule__GenericParamDecl__BoundsAssignment_1_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6992:1: rule__GenericParamDecl__BoundsAssignment_1_2_1 : ( RULE_IDENT ) ;
    public final void rule__GenericParamDecl__BoundsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6996:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6997:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6997:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6998:1: RULE_IDENT
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_2_114080); 
             after(grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericParamDecl__BoundsAssignment_1_2_1"


    // $ANTLR start "rule__Arg__PatAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7007:1: rule__Arg__PatAssignment_0 : ( rulePat ) ;
    public final void rule__Arg__PatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7011:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7012:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7012:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7013:1: rulePat
            {
             before(grammarAccess.getArgAccess().getPatPatParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__Arg__PatAssignment_014111);
            rulePat();

            state._fsp--;

             after(grammarAccess.getArgAccess().getPatPatParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__PatAssignment_0"


    // $ANTLR start "rule__Arg__TypeAssignment_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7022:1: rule__Arg__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Arg__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7026:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7027:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7027:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7028:1: ruleType
            {
             before(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Arg__TypeAssignment_214142);
            ruleType();

            state._fsp--;

             after(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__TypeAssignment_2"


    // $ANTLR start "rule__PatIdent__MutableAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7037:1: rule__PatIdent__MutableAssignment_0 : ( RULE_MUT_KEYWORD ) ;
    public final void rule__PatIdent__MutableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7041:1: ( ( RULE_MUT_KEYWORD ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7042:1: ( RULE_MUT_KEYWORD )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7042:1: ( RULE_MUT_KEYWORD )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7043:1: RULE_MUT_KEYWORD
            {
             before(grammarAccess.getPatIdentAccess().getMutableMUT_KEYWORDTerminalRuleCall_0_0()); 
            match(input,RULE_MUT_KEYWORD,FOLLOW_RULE_MUT_KEYWORD_in_rule__PatIdent__MutableAssignment_014173); 
             after(grammarAccess.getPatIdentAccess().getMutableMUT_KEYWORDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatIdent__MutableAssignment_0"


    // $ANTLR start "rule__PatIdent__IdentAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7052:1: rule__PatIdent__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__PatIdent__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7056:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7057:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7057:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7058:1: RULE_IDENT
            {
             before(grammarAccess.getPatIdentAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__PatIdent__IdentAssignment_114204); 
             after(grammarAccess.getPatIdentAccess().getIdentIDENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatIdent__IdentAssignment_1"


    // $ANTLR start "rule__PatBoxed__PatternAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7067:1: rule__PatBoxed__PatternAssignment_1 : ( rulePat ) ;
    public final void rule__PatBoxed__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7071:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7072:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7072:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7073:1: rulePat
            {
             before(grammarAccess.getPatBoxedAccess().getPatternPatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__PatBoxed__PatternAssignment_114235);
            rulePat();

            state._fsp--;

             after(grammarAccess.getPatBoxedAccess().getPatternPatParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatBoxed__PatternAssignment_1"


    // $ANTLR start "rule__PatOwned__PatternAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7082:1: rule__PatOwned__PatternAssignment_1 : ( rulePat ) ;
    public final void rule__PatOwned__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7086:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7087:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7087:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7088:1: rulePat
            {
             before(grammarAccess.getPatOwnedAccess().getPatternPatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__PatOwned__PatternAssignment_114266);
            rulePat();

            state._fsp--;

             after(grammarAccess.getPatOwnedAccess().getPatternPatParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatOwned__PatternAssignment_1"


    // $ANTLR start "rule__PatBorrowed__PatternAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7097:1: rule__PatBorrowed__PatternAssignment_1 : ( rulePat ) ;
    public final void rule__PatBorrowed__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7101:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7102:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7102:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7103:1: rulePat
            {
             before(grammarAccess.getPatBorrowedAccess().getPatternPatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__PatBorrowed__PatternAssignment_114297);
            rulePat();

            state._fsp--;

             after(grammarAccess.getPatBorrowedAccess().getPatternPatParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatBorrowed__PatternAssignment_1"


    // $ANTLR start "rule__PatTuple__PatternsAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7112:1: rule__PatTuple__PatternsAssignment_1 : ( rulePat ) ;
    public final void rule__PatTuple__PatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7116:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7117:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7117:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7118:1: rulePat
            {
             before(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__PatTuple__PatternsAssignment_114328);
            rulePat();

            state._fsp--;

             after(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatTuple__PatternsAssignment_1"


    // $ANTLR start "rule__PatTuple__PatternsAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7127:1: rule__PatTuple__PatternsAssignment_2_1 : ( rulePat ) ;
    public final void rule__PatTuple__PatternsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7131:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7132:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7132:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7133:1: rulePat
            {
             before(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__PatTuple__PatternsAssignment_2_114359);
            rulePat();

            state._fsp--;

             after(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatTuple__PatternsAssignment_2_1"


    // $ANTLR start "rule__PatVector__PatternsAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7142:1: rule__PatVector__PatternsAssignment_1 : ( rulePat ) ;
    public final void rule__PatVector__PatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7146:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7147:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7147:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7148:1: rulePat
            {
             before(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__PatVector__PatternsAssignment_114390);
            rulePat();

            state._fsp--;

             after(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatVector__PatternsAssignment_1"


    // $ANTLR start "rule__PatVector__PatternsAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7157:1: rule__PatVector__PatternsAssignment_2_1 : ( rulePat ) ;
    public final void rule__PatVector__PatternsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7161:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7162:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7162:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7163:1: rulePat
            {
             before(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__PatVector__PatternsAssignment_2_114421);
            rulePat();

            state._fsp--;

             after(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatVector__PatternsAssignment_2_1"


    // $ANTLR start "rule__PatLiteral__LiteralAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7172:1: rule__PatLiteral__LiteralAssignment : ( ruleLiteral ) ;
    public final void rule__PatLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7176:1: ( ( ruleLiteral ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7177:1: ( ruleLiteral )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7177:1: ( ruleLiteral )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7178:1: ruleLiteral
            {
             before(grammarAccess.getPatLiteralAccess().getLiteralLiteralParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__PatLiteral__LiteralAssignment14452);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getPatLiteralAccess().getLiteralLiteralParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatLiteral__LiteralAssignment"


    // $ANTLR start "rule__PatCharRange__StartAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7187:1: rule__PatCharRange__StartAssignment_0 : ( ruleCharLit ) ;
    public final void rule__PatCharRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7191:1: ( ( ruleCharLit ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7192:1: ( ruleCharLit )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7192:1: ( ruleCharLit )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7193:1: ruleCharLit
            {
             before(grammarAccess.getPatCharRangeAccess().getStartCharLitParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCharLit_in_rule__PatCharRange__StartAssignment_014483);
            ruleCharLit();

            state._fsp--;

             after(grammarAccess.getPatCharRangeAccess().getStartCharLitParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatCharRange__StartAssignment_0"


    // $ANTLR start "rule__PatCharRange__EndAssignment_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7202:1: rule__PatCharRange__EndAssignment_2 : ( ruleCharLit ) ;
    public final void rule__PatCharRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7206:1: ( ( ruleCharLit ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7207:1: ( ruleCharLit )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7207:1: ( ruleCharLit )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7208:1: ruleCharLit
            {
             before(grammarAccess.getPatCharRangeAccess().getEndCharLitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCharLit_in_rule__PatCharRange__EndAssignment_214514);
            ruleCharLit();

            state._fsp--;

             after(grammarAccess.getPatCharRangeAccess().getEndCharLitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatCharRange__EndAssignment_2"


    // $ANTLR start "rule__PatNumberRange__StartAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7217:1: rule__PatNumberRange__StartAssignment_0 : ( ruleNumberLit ) ;
    public final void rule__PatNumberRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7221:1: ( ( ruleNumberLit ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7222:1: ( ruleNumberLit )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7222:1: ( ruleNumberLit )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7223:1: ruleNumberLit
            {
             before(grammarAccess.getPatNumberRangeAccess().getStartNumberLitParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNumberLit_in_rule__PatNumberRange__StartAssignment_014545);
            ruleNumberLit();

            state._fsp--;

             after(grammarAccess.getPatNumberRangeAccess().getStartNumberLitParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatNumberRange__StartAssignment_0"


    // $ANTLR start "rule__PatNumberRange__EndAssignment_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7232:1: rule__PatNumberRange__EndAssignment_2 : ( ruleNumberLit ) ;
    public final void rule__PatNumberRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7236:1: ( ( ruleNumberLit ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7237:1: ( ruleNumberLit )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7237:1: ( ruleNumberLit )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7238:1: ruleNumberLit
            {
             before(grammarAccess.getPatNumberRangeAccess().getEndNumberLitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNumberLit_in_rule__PatNumberRange__EndAssignment_214576);
            ruleNumberLit();

            state._fsp--;

             after(grammarAccess.getPatNumberRangeAccess().getEndNumberLitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatNumberRange__EndAssignment_2"


    // $ANTLR start "rule__TupleType__TypesAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7247:1: rule__TupleType__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7251:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7252:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7252:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7253:1: ruleType
            {
             before(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_114607);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__TypesAssignment_1"


    // $ANTLR start "rule__TupleType__TypesAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7262:1: rule__TupleType__TypesAssignment_2_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7266:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7267:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7267:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7268:1: ruleType
            {
             before(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_2_114638);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleType__TypesAssignment_2_1"


    // $ANTLR start "rule__StructType__IdentAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7277:1: rule__StructType__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__StructType__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7281:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7282:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7282:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7283:1: RULE_IDENT
            {
             before(grammarAccess.getStructTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__StructType__IdentAssignment_114669); 
             after(grammarAccess.getStructTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__IdentAssignment_1"


    // $ANTLR start "rule__StructType__ParamsAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7292:1: rule__StructType__ParamsAssignment_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructType__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7296:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7297:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7297:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7298:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_114700);
            ruleGenericParamDecl();

            state._fsp--;

             after(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__ParamsAssignment_2_1"


    // $ANTLR start "rule__StructType__ParamsAssignment_2_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7307:1: rule__StructType__ParamsAssignment_2_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructType__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7311:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7312:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7312:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7313:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_2_114731);
            ruleGenericParamDecl();

            state._fsp--;

             after(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__StructType__FieldsAssignment_4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7322:1: rule__StructType__FieldsAssignment_4 : ( ruleStructField ) ;
    public final void rule__StructType__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7326:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7327:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7327:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7328:1: ruleStructField
            {
             before(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_414762);
            ruleStructField();

            state._fsp--;

             after(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__FieldsAssignment_4"


    // $ANTLR start "rule__StructType__FieldsAssignment_5_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7337:1: rule__StructType__FieldsAssignment_5_1 : ( ruleStructField ) ;
    public final void rule__StructType__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7341:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7342:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7342:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7343:1: ruleStructField
            {
             before(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_5_114793);
            ruleStructField();

            state._fsp--;

             after(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructType__FieldsAssignment_5_1"


    // $ANTLR start "rule__BoxedPointer__TypeAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7352:1: rule__BoxedPointer__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__BoxedPointer__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7356:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7357:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7357:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7358:1: ruleType
            {
             before(grammarAccess.getBoxedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__BoxedPointer__TypeAssignment_114824);
            ruleType();

            state._fsp--;

             after(grammarAccess.getBoxedPointerAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPointer__TypeAssignment_1"


    // $ANTLR start "rule__OwnedPointer__TypeAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7367:1: rule__OwnedPointer__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__OwnedPointer__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7371:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7372:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7372:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7373:1: ruleType
            {
             before(grammarAccess.getOwnedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__OwnedPointer__TypeAssignment_114855);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOwnedPointerAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedPointer__TypeAssignment_1"


    // $ANTLR start "rule__BorrowedPointer__TypeAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7382:1: rule__BorrowedPointer__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__BorrowedPointer__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7386:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7387:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7387:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7388:1: ruleType
            {
             before(grammarAccess.getBorrowedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__BorrowedPointer__TypeAssignment_114886);
            ruleType();

            state._fsp--;

             after(grammarAccess.getBorrowedPointerAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorrowedPointer__TypeAssignment_1"


    // $ANTLR start "rule__StructField__VisAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7397:1: rule__StructField__VisAssignment_0 : ( ruleVisibility ) ;
    public final void rule__StructField__VisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7401:1: ( ( ruleVisibility ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7402:1: ( ruleVisibility )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7402:1: ( ruleVisibility )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7403:1: ruleVisibility
            {
             before(grammarAccess.getStructFieldAccess().getVisVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibility_in_rule__StructField__VisAssignment_014917);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getStructFieldAccess().getVisVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__VisAssignment_0"


    // $ANTLR start "rule__StructField__IdentAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7412:1: rule__StructField__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__StructField__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7416:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7417:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7417:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7418:1: RULE_IDENT
            {
             before(grammarAccess.getStructFieldAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__StructField__IdentAssignment_114948); 
             after(grammarAccess.getStructFieldAccess().getIdentIDENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__IdentAssignment_1"


    // $ANTLR start "rule__StructField__TypeAssignment_3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7427:1: rule__StructField__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__StructField__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7431:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7432:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7432:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7433:1: ruleType
            {
             before(grammarAccess.getStructFieldAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__StructField__TypeAssignment_314979);
            ruleType();

            state._fsp--;

             after(grammarAccess.getStructFieldAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__TypeAssignment_3"


    // $ANTLR start "rule__EnumType__IdentAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7442:1: rule__EnumType__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__EnumType__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7446:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7447:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7447:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7448:1: RULE_IDENT
            {
             before(grammarAccess.getEnumTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__EnumType__IdentAssignment_115010); 
             after(grammarAccess.getEnumTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__IdentAssignment_1"


    // $ANTLR start "rule__EnumType__ParamsAssignment_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7457:1: rule__EnumType__ParamsAssignment_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__EnumType__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7461:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7462:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7462:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7463:1: ruleGenericParamDecl
            {
             before(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_115041);
            ruleGenericParamDecl();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__ParamsAssignment_2_1"


    // $ANTLR start "rule__EnumType__ParamsAssignment_2_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7472:1: rule__EnumType__ParamsAssignment_2_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__EnumType__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7476:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7477:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7477:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7478:1: ruleGenericParamDecl
            {
             before(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_2_115072);
            ruleGenericParamDecl();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__EnumType__VariantsAssignment_4"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7487:1: rule__EnumType__VariantsAssignment_4 : ( ruleVariant ) ;
    public final void rule__EnumType__VariantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7491:1: ( ( ruleVariant ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7492:1: ( ruleVariant )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7492:1: ( ruleVariant )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7493:1: ruleVariant
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_415103);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__VariantsAssignment_4"


    // $ANTLR start "rule__EnumType__VariantsAssignment_5_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7502:1: rule__EnumType__VariantsAssignment_5_1 : ( ruleVariant ) ;
    public final void rule__EnumType__VariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7506:1: ( ( ruleVariant ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7507:1: ( ruleVariant )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7507:1: ( ruleVariant )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7508:1: ruleVariant
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_5_115134);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__VariantsAssignment_5_1"


    // $ANTLR start "rule__StructVariant__IdentAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7517:1: rule__StructVariant__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__StructVariant__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7521:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7522:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7522:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7523:1: RULE_IDENT
            {
             before(grammarAccess.getStructVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__StructVariant__IdentAssignment_015165); 
             after(grammarAccess.getStructVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__IdentAssignment_0"


    // $ANTLR start "rule__StructVariant__ParamsAssignment_1_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7532:1: rule__StructVariant__ParamsAssignment_1_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructVariant__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7536:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7537:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7537:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7538:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_115196);
            ruleGenericParamDecl();

            state._fsp--;

             after(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__ParamsAssignment_1_1"


    // $ANTLR start "rule__StructVariant__ParamsAssignment_1_2_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7547:1: rule__StructVariant__ParamsAssignment_1_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructVariant__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7551:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7552:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7552:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7553:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_2_115227);
            ruleGenericParamDecl();

            state._fsp--;

             after(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__ParamsAssignment_1_2_1"


    // $ANTLR start "rule__StructVariant__FieldsAssignment_3"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7562:1: rule__StructVariant__FieldsAssignment_3 : ( ruleStructField ) ;
    public final void rule__StructVariant__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7566:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7567:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7567:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7568:1: ruleStructField
            {
             before(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_315258);
            ruleStructField();

            state._fsp--;

             after(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__FieldsAssignment_3"


    // $ANTLR start "rule__StructVariant__FieldsAssignment_4_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7577:1: rule__StructVariant__FieldsAssignment_4_1 : ( ruleStructField ) ;
    public final void rule__StructVariant__FieldsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7581:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7582:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7582:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7583:1: ruleStructField
            {
             before(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_4_115289);
            ruleStructField();

            state._fsp--;

             after(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructVariant__FieldsAssignment_4_1"


    // $ANTLR start "rule__TupleVariant__IdentAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7592:1: rule__TupleVariant__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__TupleVariant__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7596:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7597:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7597:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7598:1: RULE_IDENT
            {
             before(grammarAccess.getTupleVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__TupleVariant__IdentAssignment_015320); 
             after(grammarAccess.getTupleVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__IdentAssignment_0"


    // $ANTLR start "rule__TupleVariant__TypesAssignment_2"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7607:1: rule__TupleVariant__TypesAssignment_2 : ( ruleType ) ;
    public final void rule__TupleVariant__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7611:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7612:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7612:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7613:1: ruleType
            {
             before(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_215351);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__TypesAssignment_2"


    // $ANTLR start "rule__TupleVariant__TypesAssignment_3_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7622:1: rule__TupleVariant__TypesAssignment_3_1 : ( ruleType ) ;
    public final void rule__TupleVariant__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7626:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7627:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7627:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7628:1: ruleType
            {
             before(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_3_115382);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TupleVariant__TypesAssignment_3_1"


    // $ANTLR start "rule__UnitVariant__IdentAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7637:1: rule__UnitVariant__IdentAssignment : ( RULE_IDENT ) ;
    public final void rule__UnitVariant__IdentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7641:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7642:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7642:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7643:1: RULE_IDENT
            {
             before(grammarAccess.getUnitVariantAccess().getIdentIDENTTerminalRuleCall_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__UnitVariant__IdentAssignment15413); 
             after(grammarAccess.getUnitVariantAccess().getIdentIDENTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitVariant__IdentAssignment"


    // $ANTLR start "rule__StringLit__ValueAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7652:1: rule__StringLit__ValueAssignment : ( RULE_STRING_LIT ) ;
    public final void rule__StringLit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7656:1: ( ( RULE_STRING_LIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7657:1: ( RULE_STRING_LIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7657:1: ( RULE_STRING_LIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7658:1: RULE_STRING_LIT
            {
             before(grammarAccess.getStringLitAccess().getValueSTRING_LITTerminalRuleCall_0()); 
            match(input,RULE_STRING_LIT,FOLLOW_RULE_STRING_LIT_in_rule__StringLit__ValueAssignment15444); 
             after(grammarAccess.getStringLitAccess().getValueSTRING_LITTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLit__ValueAssignment"


    // $ANTLR start "rule__NumberLit__ValueAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7667:1: rule__NumberLit__ValueAssignment : ( ( rule__NumberLit__ValueAlternatives_0 ) ) ;
    public final void rule__NumberLit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7671:1: ( ( ( rule__NumberLit__ValueAlternatives_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7672:1: ( ( rule__NumberLit__ValueAlternatives_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7672:1: ( ( rule__NumberLit__ValueAlternatives_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7673:1: ( rule__NumberLit__ValueAlternatives_0 )
            {
             before(grammarAccess.getNumberLitAccess().getValueAlternatives_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7674:1: ( rule__NumberLit__ValueAlternatives_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7674:2: rule__NumberLit__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__NumberLit__ValueAlternatives_0_in_rule__NumberLit__ValueAssignment15475);
            rule__NumberLit__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLitAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLit__ValueAssignment"


    // $ANTLR start "rule__CharLit__ValueAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7683:1: rule__CharLit__ValueAssignment : ( RULE_CHAR_LIT ) ;
    public final void rule__CharLit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7687:1: ( ( RULE_CHAR_LIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7688:1: ( RULE_CHAR_LIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7688:1: ( RULE_CHAR_LIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7689:1: RULE_CHAR_LIT
            {
             before(grammarAccess.getCharLitAccess().getValueCHAR_LITTerminalRuleCall_0()); 
            match(input,RULE_CHAR_LIT,FOLLOW_RULE_CHAR_LIT_in_rule__CharLit__ValueAssignment15508); 
             after(grammarAccess.getCharLitAccess().getValueCHAR_LITTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharLit__ValueAssignment"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\10\uffff\3\13\2\uffff";
    static final String DFA5_minS =
        "\1\4\7\uffff\3\57\2\uffff";
    static final String DFA5_maxS =
        "\1\101\7\uffff\3\102\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\10\1\11";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\10\1\11\6\uffff\1\2\1\13\1\12\42\uffff\1\6\13\uffff\1\1\1"+
            "\3\1\4\1\5\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\13\1\uffff\1\13\10\uffff\1\13\6\uffff\1\14",
            "\2\13\1\uffff\1\13\10\uffff\1\13\6\uffff\1\14",
            "\2\13\1\uffff\1\13\10\uffff\1\13\6\uffff\1\14",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1293:1: rule__Pat__Alternatives : ( ( rulePatWildcard ) | ( rulePatIdent ) | ( rulePatBoxed ) | ( rulePatOwned ) | ( rulePatBorrowed ) | ( rulePatTuple ) | ( rulePatVector ) | ( rulePatLiteral ) | ( rulePatRange ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleCrate_in_entryRuleCrate61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrate68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crate__ItemsAssignment_in_ruleCrate94 = new BitSet(new long[]{0x0090400000000002L});
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
    public static final BitSet FOLLOW_rule__Item__Alternatives_in_ruleItem455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_entryRuleModItem482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModItem489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__0_in_ruleModItem515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFnItem_in_entryRuleFnItem542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFnItem549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__0_in_ruleFnItem575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericParamDecl669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__0_in_ruleGenericParamDecl695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_entryRuleArg722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__0_in_ruleArg755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_entryRulePat782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePat789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pat__Alternatives_in_rulePat815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_entryRulePatWildcard842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatWildcard849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatWildcard__Group__0_in_rulePatWildcard875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_entryRulePatIdent902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatIdent909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatIdent__Group__0_in_rulePatIdent935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_entryRulePatBoxed962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBoxed969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatBoxed__Group__0_in_rulePatBoxed995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_entryRulePatOwned1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatOwned1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatOwned__Group__0_in_rulePatOwned1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBorrowed1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatBorrowed__Group__0_in_rulePatBorrowed1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_entryRulePatTuple1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatTuple1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__Group__0_in_rulePatTuple1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_entryRulePatVector1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatVector1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__Group__0_in_rulePatVector1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_entryRulePatLiteral1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatLiteral1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatLiteral__LiteralAssignment_in_rulePatLiteral1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatRange_in_entryRulePatRange1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatRange1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatRange__Alternatives_in_rulePatRange1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatCharRange_in_entryRulePatCharRange1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatCharRange1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatCharRange__Group__0_in_rulePatCharRange1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatNumberRange_in_entryRulePatNumberRange1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatNumberRange1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatNumberRange__Group__0_in_rulePatNumberRange1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_entryRuleTupleType1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleType1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__0_in_ruleTupleType1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_entryRuleStructType1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructType1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__0_in_ruleStructType1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxedPointer1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxedPointer__Group__0_in_ruleBoxedPointer1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedPointer1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OwnedPointer__Group__0_in_ruleOwnedPointer1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrowedPointer1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorrowedPointer__Group__0_in_ruleBorrowedPointer1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_entryRuleStructField1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructField1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__0_in_ruleStructField1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0_in_ruleEnumType2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariant2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant__Alternatives_in_ruleVariant2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_entryRuleStructVariant2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructVariant2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__0_in_ruleStructVariant2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant2162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleVariant2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__0_in_ruleTupleVariant2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitVariant2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnitVariant__IdentAssignment_in_ruleUnitVariant2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_entryRuleStringLit2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLit2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLit__ValueAssignment_in_ruleStringLit2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_entryRuleNumberLit2402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLit2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLit__ValueAssignment_in_ruleNumberLit2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit2462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__ValueAssignment_in_ruleCharLit2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_rule__Item__Alternatives2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFnItem_in_rule__Item__Alternatives2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__ExternalBodyAssignment_2_0_in_rule__ModItem__Alternatives_22665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_22683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_rule__Pat__Alternatives2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_rule__Pat__Alternatives2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_rule__Pat__Alternatives2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_rule__Pat__Alternatives2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_rule__Pat__Alternatives2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_rule__Pat__Alternatives2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_rule__Pat__Alternatives2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_rule__Pat__Alternatives2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatRange_in_rule__Pat__Alternatives2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatCharRange_in_rule__PatRange__Alternatives2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatNumberRange_in_rule__PatRange__Alternatives2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_rule__Type__Alternatives2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_rule__Type__Alternatives2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Type__Alternatives2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_rule__Type__Alternatives3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_rule__Type__Alternatives3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_rule__Type__Alternatives3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__0_in_rule__PrimitiveType__Alternatives3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__0_in_rule__PrimitiveType__Alternatives3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__0_in_rule__PrimitiveType__Alternatives3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__0_in_rule__PrimitiveType__Alternatives3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__0_in_rule__PrimitiveType__Alternatives3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_rule__Variant__Alternatives3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_rule__Variant__Alternatives3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_rule__Variant__Alternatives3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rule__Literal__Alternatives3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_rule__Literal__Alternatives3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_rule__NumberLit__ValueAlternatives_03304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LIT_in_rule__NumberLit__ValueAlternatives_03321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Visibility__Alternatives3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Visibility__Alternatives3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__03408 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__03411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ItemAttr__Group__0__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__13470 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__13473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__23530 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__23533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl3560 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__33591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ItemAttr__Group__3__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__03658 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__03661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ItemAttr__Group_2__0__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__13720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__03781 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__03784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__13841 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__13844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AttrWithList__Group__1__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__23903 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__23906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__33963 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__33966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl3993 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__44024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__AttrWithList__Group__4__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__04093 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__04096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AttrWithList__Group_3__0__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__14155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__04216 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__04219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__14276 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__14279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__LiteralAttr__Group__1__Impl4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__24338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__04401 = new BitSet(new long[]{0x0090400000000000L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__04404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl4431 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__14462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__04523 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__04526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ModItem__Group__0__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__14585 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__14588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__24645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__04708 = new BitSet(new long[]{0x00D0400000000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__04711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ModItem__Group_2_1__0__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__14770 = new BitSet(new long[]{0x00D0400000000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__2_in_rule__ModItem__Group_2_1__14773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__ItemsAssignment_2_1_1_in_rule__ModItem__Group_2_1__1__Impl4800 = new BitSet(new long[]{0x0090400000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__2__Impl_in_rule__ModItem__Group_2_1__24831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ModItem__Group_2_1__2__Impl4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__0__Impl_in_rule__FnItem__Group__04896 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group__1_in_rule__FnItem__Group__04899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__FnItem__Group__0__Impl4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__1__Impl_in_rule__FnItem__Group__14958 = new BitSet(new long[]{0x0102000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__2_in_rule__FnItem__Group__14961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__IdentAssignment_1_in_rule__FnItem__Group__1__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__2__Impl_in_rule__FnItem__Group__25018 = new BitSet(new long[]{0x0102000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__3_in_rule__FnItem__Group__25021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__0_in_rule__FnItem__Group__2__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__3__Impl_in_rule__FnItem__Group__35079 = new BitSet(new long[]{0xE006000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__FnItem__Group__4_in_rule__FnItem__Group__35082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__FnItem__Group__3__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__4__Impl_in_rule__FnItem__Group__45141 = new BitSet(new long[]{0xE006000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__FnItem__Group__5_in_rule__FnItem__Group__45144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__0_in_rule__FnItem__Group__4__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__5__Impl_in_rule__FnItem__Group__55202 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__6_in_rule__FnItem__Group__55205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__FnItem__Group__5__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__6__Impl_in_rule__FnItem__Group__65264 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__7_in_rule__FnItem__Group__65267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__0_in_rule__FnItem__Group__6__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__7__Impl_in_rule__FnItem__Group__75325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__BodyAssignment_7_in_rule__FnItem__Group__7__Impl5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__0__Impl_in_rule__FnItem__Group_2__05398 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__1_in_rule__FnItem__Group_2__05401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__FnItem__Group_2__0__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__1__Impl_in_rule__FnItem__Group_2__15460 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__2_in_rule__FnItem__Group_2__15463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ParamsAssignment_2_1_in_rule__FnItem__Group_2__1__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__2__Impl_in_rule__FnItem__Group_2__25520 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__3_in_rule__FnItem__Group_2__25523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__0_in_rule__FnItem__Group_2__2__Impl5550 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__3__Impl_in_rule__FnItem__Group_2__35581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__FnItem__Group_2__3__Impl5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__0__Impl_in_rule__FnItem__Group_2_2__05648 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__1_in_rule__FnItem__Group_2_2__05651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FnItem__Group_2_2__0__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__1__Impl_in_rule__FnItem__Group_2_2__15710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ParamsAssignment_2_2_1_in_rule__FnItem__Group_2_2__1__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__0__Impl_in_rule__FnItem__Group_4__05771 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__1_in_rule__FnItem__Group_4__05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ArgsAssignment_4_0_in_rule__FnItem__Group_4__0__Impl5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__1__Impl_in_rule__FnItem__Group_4__15831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__0_in_rule__FnItem__Group_4__1__Impl5858 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__0__Impl_in_rule__FnItem__Group_4_1__05893 = new BitSet(new long[]{0xE002000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__1_in_rule__FnItem__Group_4_1__05896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FnItem__Group_4_1__0__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__1__Impl_in_rule__FnItem__Group_4_1__15955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ArgsAssignment_4_1_1_in_rule__FnItem__Group_4_1__1__Impl5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__0__Impl_in_rule__FnItem__Group_6__06016 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__1_in_rule__FnItem__Group_6__06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__FnItem__Group_6__0__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__1__Impl_in_rule__FnItem__Group_6__16078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ReturnTypeAssignment_6_1_in_rule__FnItem__Group_6__1__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__06139 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__06142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Block__Group__0__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__16201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Block__Group__1__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__0__Impl_in_rule__GenericParamDecl__Group__06264 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__1_in_rule__GenericParamDecl__Group__06267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__IdentAssignment_0_in_rule__GenericParamDecl__Group__0__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__1__Impl_in_rule__GenericParamDecl__Group__16324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__0_in_rule__GenericParamDecl__Group__1__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__0__Impl_in_rule__GenericParamDecl__Group_1__06386 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__1_in_rule__GenericParamDecl__Group_1__06389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__GenericParamDecl__Group_1__0__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__1__Impl_in_rule__GenericParamDecl__Group_1__16448 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__2_in_rule__GenericParamDecl__Group_1__16451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_1_in_rule__GenericParamDecl__Group_1__1__Impl6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__2__Impl_in_rule__GenericParamDecl__Group_1__26508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__0_in_rule__GenericParamDecl__Group_1__2__Impl6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__0__Impl_in_rule__GenericParamDecl__Group_1_2__06571 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__1_in_rule__GenericParamDecl__Group_1_2__06574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__GenericParamDecl__Group_1_2__0__Impl6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__1__Impl_in_rule__GenericParamDecl__Group_1_2__16633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_2_1_in_rule__GenericParamDecl__Group_1_2__1__Impl6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__0__Impl_in_rule__Arg__Group__06694 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Arg__Group__1_in_rule__Arg__Group__06697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__PatAssignment_0_in_rule__Arg__Group__0__Impl6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__1__Impl_in_rule__Arg__Group__16754 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__Arg__Group__2_in_rule__Arg__Group__16757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Arg__Group__1__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__2__Impl_in_rule__Arg__Group__26816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__TypeAssignment_2_in_rule__Arg__Group__2__Impl6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatWildcard__Group__0__Impl_in_rule__PatWildcard__Group__06879 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__PatWildcard__Group__1_in_rule__PatWildcard__Group__06882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatWildcard__Group__1__Impl_in_rule__PatWildcard__Group__16940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__PatWildcard__Group__1__Impl6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatIdent__Group__0__Impl_in_rule__PatIdent__Group__07003 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__PatIdent__Group__1_in_rule__PatIdent__Group__07006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatIdent__MutableAssignment_0_in_rule__PatIdent__Group__0__Impl7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatIdent__Group__1__Impl_in_rule__PatIdent__Group__17063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatIdent__IdentAssignment_1_in_rule__PatIdent__Group__1__Impl7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatBoxed__Group__0__Impl_in_rule__PatBoxed__Group__07124 = new BitSet(new long[]{0xE002000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__PatBoxed__Group__1_in_rule__PatBoxed__Group__07127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__PatBoxed__Group__0__Impl7155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatBoxed__Group__1__Impl_in_rule__PatBoxed__Group__17186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatBoxed__PatternAssignment_1_in_rule__PatBoxed__Group__1__Impl7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatOwned__Group__0__Impl_in_rule__PatOwned__Group__07247 = new BitSet(new long[]{0xE002000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__PatOwned__Group__1_in_rule__PatOwned__Group__07250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__PatOwned__Group__0__Impl7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatOwned__Group__1__Impl_in_rule__PatOwned__Group__17309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatOwned__PatternAssignment_1_in_rule__PatOwned__Group__1__Impl7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatBorrowed__Group__0__Impl_in_rule__PatBorrowed__Group__07370 = new BitSet(new long[]{0xE002000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__PatBorrowed__Group__1_in_rule__PatBorrowed__Group__07373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__PatBorrowed__Group__0__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatBorrowed__Group__1__Impl_in_rule__PatBorrowed__Group__17432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatBorrowed__PatternAssignment_1_in_rule__PatBorrowed__Group__1__Impl7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__Group__0__Impl_in_rule__PatTuple__Group__07493 = new BitSet(new long[]{0xE002000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__PatTuple__Group__1_in_rule__PatTuple__Group__07496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__PatTuple__Group__0__Impl7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__Group__1__Impl_in_rule__PatTuple__Group__17555 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_rule__PatTuple__Group__2_in_rule__PatTuple__Group__17558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__PatternsAssignment_1_in_rule__PatTuple__Group__1__Impl7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__Group__2__Impl_in_rule__PatTuple__Group__27615 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_rule__PatTuple__Group__3_in_rule__PatTuple__Group__27618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__Group_2__0_in_rule__PatTuple__Group__2__Impl7645 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__Group__3__Impl_in_rule__PatTuple__Group__37676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__PatTuple__Group__3__Impl7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__Group_2__0__Impl_in_rule__PatTuple__Group_2__07743 = new BitSet(new long[]{0xE002000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__PatTuple__Group_2__1_in_rule__PatTuple__Group_2__07746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PatTuple__Group_2__0__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__Group_2__1__Impl_in_rule__PatTuple__Group_2__17805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatTuple__PatternsAssignment_2_1_in_rule__PatTuple__Group_2__1__Impl7832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__Group__0__Impl_in_rule__PatVector__Group__07866 = new BitSet(new long[]{0xE002000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__PatVector__Group__1_in_rule__PatVector__Group__07869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__PatVector__Group__0__Impl7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__Group__1__Impl_in_rule__PatVector__Group__17928 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__PatVector__Group__2_in_rule__PatVector__Group__17931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__PatternsAssignment_1_in_rule__PatVector__Group__1__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__Group__2__Impl_in_rule__PatVector__Group__27988 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__PatVector__Group__3_in_rule__PatVector__Group__27991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__Group_2__0_in_rule__PatVector__Group__2__Impl8018 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__Group__3__Impl_in_rule__PatVector__Group__38049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__PatVector__Group__3__Impl8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__Group_2__0__Impl_in_rule__PatVector__Group_2__08116 = new BitSet(new long[]{0xE002000000007030L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__PatVector__Group_2__1_in_rule__PatVector__Group_2__08119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PatVector__Group_2__0__Impl8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__Group_2__1__Impl_in_rule__PatVector__Group_2__18178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatVector__PatternsAssignment_2_1_in_rule__PatVector__Group_2__1__Impl8205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatCharRange__Group__0__Impl_in_rule__PatCharRange__Group__08239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__PatCharRange__Group__1_in_rule__PatCharRange__Group__08242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatCharRange__StartAssignment_0_in_rule__PatCharRange__Group__0__Impl8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatCharRange__Group__1__Impl_in_rule__PatCharRange__Group__18299 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PatCharRange__Group__2_in_rule__PatCharRange__Group__18302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__PatCharRange__Group__1__Impl8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatCharRange__Group__2__Impl_in_rule__PatCharRange__Group__28361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatCharRange__EndAssignment_2_in_rule__PatCharRange__Group__2__Impl8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatNumberRange__Group__0__Impl_in_rule__PatNumberRange__Group__08424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__PatNumberRange__Group__1_in_rule__PatNumberRange__Group__08427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatNumberRange__StartAssignment_0_in_rule__PatNumberRange__Group__0__Impl8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatNumberRange__Group__1__Impl_in_rule__PatNumberRange__Group__18484 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PatNumberRange__Group__2_in_rule__PatNumberRange__Group__18487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__PatNumberRange__Group__1__Impl8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatNumberRange__Group__2__Impl_in_rule__PatNumberRange__Group__28546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatNumberRange__EndAssignment_2_in_rule__PatNumberRange__Group__2__Impl8573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__0__Impl_in_rule__PrimitiveType__Group_0__08609 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__1_in_rule__PrimitiveType__Group_0__08612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__1__Impl_in_rule__PrimitiveType__Group_0__18670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rule__PrimitiveType__Group_0__1__Impl8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__0__Impl_in_rule__PrimitiveType__Group_1__08730 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__1_in_rule__PrimitiveType__Group_1__08733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__1__Impl_in_rule__PrimitiveType__Group_1__18791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_in_rule__PrimitiveType__Group_1__1__Impl8818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__0__Impl_in_rule__PrimitiveType__Group_2__08851 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__1_in_rule__PrimitiveType__Group_2__08854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__1__Impl_in_rule__PrimitiveType__Group_2__18912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_TYPE_in_rule__PrimitiveType__Group_2__1__Impl8939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__0__Impl_in_rule__PrimitiveType__Group_3__08972 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__1_in_rule__PrimitiveType__Group_3__08975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__1__Impl_in_rule__PrimitiveType__Group_3__19033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MACHINE_TYPE_in_rule__PrimitiveType__Group_3__1__Impl9060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__0__Impl_in_rule__PrimitiveType__Group_4__09093 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__1_in_rule__PrimitiveType__Group_4__09096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__1__Impl_in_rule__PrimitiveType__Group_4__19154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNIT_TYPE_in_rule__PrimitiveType__Group_4__1__Impl9181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__0__Impl_in_rule__TupleType__Group__09214 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__TupleType__Group__1_in_rule__TupleType__Group__09217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TupleType__Group__0__Impl9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__1__Impl_in_rule__TupleType__Group__19276 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_rule__TupleType__Group__2_in_rule__TupleType__Group__19279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__TypesAssignment_1_in_rule__TupleType__Group__1__Impl9306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__2__Impl_in_rule__TupleType__Group__29336 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_rule__TupleType__Group__3_in_rule__TupleType__Group__29339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__0_in_rule__TupleType__Group__2__Impl9366 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__3__Impl_in_rule__TupleType__Group__39397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TupleType__Group__3__Impl9425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__0__Impl_in_rule__TupleType__Group_2__09464 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__1_in_rule__TupleType__Group_2__09467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TupleType__Group_2__0__Impl9495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__1__Impl_in_rule__TupleType__Group_2__19526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__TypesAssignment_2_1_in_rule__TupleType__Group_2__1__Impl9553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__0__Impl_in_rule__StructType__Group__09587 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group__1_in_rule__StructType__Group__09590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__StructType__Group__0__Impl9618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__1__Impl_in_rule__StructType__Group__19649 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__2_in_rule__StructType__Group__19652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__IdentAssignment_1_in_rule__StructType__Group__1__Impl9679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__2__Impl_in_rule__StructType__Group__29709 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__3_in_rule__StructType__Group__29712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__0_in_rule__StructType__Group__2__Impl9739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__3__Impl_in_rule__StructType__Group__39770 = new BitSet(new long[]{0x0000300000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group__4_in_rule__StructType__Group__39773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__StructType__Group__3__Impl9801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__4__Impl_in_rule__StructType__Group__49832 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__5_in_rule__StructType__Group__49835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__FieldsAssignment_4_in_rule__StructType__Group__4__Impl9862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__5__Impl_in_rule__StructType__Group__59892 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__6_in_rule__StructType__Group__59895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__0_in_rule__StructType__Group__5__Impl9922 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__6__Impl_in_rule__StructType__Group__69953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__StructType__Group__6__Impl9981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__0__Impl_in_rule__StructType__Group_2__010026 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__1_in_rule__StructType__Group_2__010029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__StructType__Group_2__0__Impl10057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__1__Impl_in_rule__StructType__Group_2__110088 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__2_in_rule__StructType__Group_2__110091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__ParamsAssignment_2_1_in_rule__StructType__Group_2__1__Impl10118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__2__Impl_in_rule__StructType__Group_2__210148 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__3_in_rule__StructType__Group_2__210151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__0_in_rule__StructType__Group_2__2__Impl10178 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__3__Impl_in_rule__StructType__Group_2__310209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__StructType__Group_2__3__Impl10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__0__Impl_in_rule__StructType__Group_2_2__010276 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__1_in_rule__StructType__Group_2_2__010279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__StructType__Group_2_2__0__Impl10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__1__Impl_in_rule__StructType__Group_2_2__110338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__ParamsAssignment_2_2_1_in_rule__StructType__Group_2_2__1__Impl10365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__0__Impl_in_rule__StructType__Group_5__010399 = new BitSet(new long[]{0x0000300000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__1_in_rule__StructType__Group_5__010402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__StructType__Group_5__0__Impl10430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__1__Impl_in_rule__StructType__Group_5__110461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__FieldsAssignment_5_1_in_rule__StructType__Group_5__1__Impl10488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxedPointer__Group__0__Impl_in_rule__BoxedPointer__Group__010522 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__BoxedPointer__Group__1_in_rule__BoxedPointer__Group__010525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__BoxedPointer__Group__0__Impl10553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxedPointer__Group__1__Impl_in_rule__BoxedPointer__Group__110584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxedPointer__TypeAssignment_1_in_rule__BoxedPointer__Group__1__Impl10611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OwnedPointer__Group__0__Impl_in_rule__OwnedPointer__Group__010645 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__OwnedPointer__Group__1_in_rule__OwnedPointer__Group__010648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__OwnedPointer__Group__0__Impl10676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OwnedPointer__Group__1__Impl_in_rule__OwnedPointer__Group__110707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OwnedPointer__TypeAssignment_1_in_rule__OwnedPointer__Group__1__Impl10734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorrowedPointer__Group__0__Impl_in_rule__BorrowedPointer__Group__010768 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__BorrowedPointer__Group__1_in_rule__BorrowedPointer__Group__010771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__BorrowedPointer__Group__0__Impl10799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorrowedPointer__Group__1__Impl_in_rule__BorrowedPointer__Group__110830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorrowedPointer__TypeAssignment_1_in_rule__BorrowedPointer__Group__1__Impl10857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__0__Impl_in_rule__StructField__Group__010891 = new BitSet(new long[]{0x0000300000000800L});
    public static final BitSet FOLLOW_rule__StructField__Group__1_in_rule__StructField__Group__010894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__VisAssignment_0_in_rule__StructField__Group__0__Impl10921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__1__Impl_in_rule__StructField__Group__110952 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__StructField__Group__2_in_rule__StructField__Group__110955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__IdentAssignment_1_in_rule__StructField__Group__1__Impl10982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__2__Impl_in_rule__StructField__Group__211012 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__StructField__Group__3_in_rule__StructField__Group__211015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__StructField__Group__2__Impl11043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__3__Impl_in_rule__StructField__Group__311074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__TypeAssignment_3_in_rule__StructField__Group__3__Impl11101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__011139 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__011142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__EnumType__Group__0__Impl11170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__111201 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__111204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__IdentAssignment_1_in_rule__EnumType__Group__1__Impl11231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__211261 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__211264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__0_in_rule__EnumType__Group__2__Impl11291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__311322 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__311325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__EnumType__Group__3__Impl11353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__411384 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__411387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__VariantsAssignment_4_in_rule__EnumType__Group__4__Impl11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__511444 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__511447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__0_in_rule__EnumType__Group__5__Impl11474 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__611505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__EnumType__Group__6__Impl11533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__0__Impl_in_rule__EnumType__Group_2__011578 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__1_in_rule__EnumType__Group_2__011581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__EnumType__Group_2__0__Impl11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__1__Impl_in_rule__EnumType__Group_2__111640 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__2_in_rule__EnumType__Group_2__111643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__ParamsAssignment_2_1_in_rule__EnumType__Group_2__1__Impl11670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__2__Impl_in_rule__EnumType__Group_2__211700 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__3_in_rule__EnumType__Group_2__211703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__0_in_rule__EnumType__Group_2__2__Impl11730 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__3__Impl_in_rule__EnumType__Group_2__311761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EnumType__Group_2__3__Impl11789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__0__Impl_in_rule__EnumType__Group_2_2__011828 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__1_in_rule__EnumType__Group_2_2__011831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EnumType__Group_2_2__0__Impl11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__1__Impl_in_rule__EnumType__Group_2_2__111890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__ParamsAssignment_2_2_1_in_rule__EnumType__Group_2_2__1__Impl11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__0__Impl_in_rule__EnumType__Group_5__011951 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__1_in_rule__EnumType__Group_5__011954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EnumType__Group_5__0__Impl11982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__1__Impl_in_rule__EnumType__Group_5__112013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__VariantsAssignment_5_1_in_rule__EnumType__Group_5__1__Impl12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__0__Impl_in_rule__StructVariant__Group__012074 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__1_in_rule__StructVariant__Group__012077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__IdentAssignment_0_in_rule__StructVariant__Group__0__Impl12104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__1__Impl_in_rule__StructVariant__Group__112134 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__2_in_rule__StructVariant__Group__112137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__0_in_rule__StructVariant__Group__1__Impl12164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__2__Impl_in_rule__StructVariant__Group__212195 = new BitSet(new long[]{0x0000300000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__3_in_rule__StructVariant__Group__212198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__StructVariant__Group__2__Impl12226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__3__Impl_in_rule__StructVariant__Group__312257 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__4_in_rule__StructVariant__Group__312260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__FieldsAssignment_3_in_rule__StructVariant__Group__3__Impl12287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__4__Impl_in_rule__StructVariant__Group__412317 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__5_in_rule__StructVariant__Group__412320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__0_in_rule__StructVariant__Group__4__Impl12347 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__5__Impl_in_rule__StructVariant__Group__512378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__StructVariant__Group__5__Impl12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__0__Impl_in_rule__StructVariant__Group_1__012449 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__1_in_rule__StructVariant__Group_1__012452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__StructVariant__Group_1__0__Impl12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__1__Impl_in_rule__StructVariant__Group_1__112511 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__2_in_rule__StructVariant__Group_1__112514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__ParamsAssignment_1_1_in_rule__StructVariant__Group_1__1__Impl12541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__2__Impl_in_rule__StructVariant__Group_1__212571 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__3_in_rule__StructVariant__Group_1__212574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__0_in_rule__StructVariant__Group_1__2__Impl12601 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__3__Impl_in_rule__StructVariant__Group_1__312632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__StructVariant__Group_1__3__Impl12660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__0__Impl_in_rule__StructVariant__Group_1_2__012699 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__1_in_rule__StructVariant__Group_1_2__012702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__StructVariant__Group_1_2__0__Impl12730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__1__Impl_in_rule__StructVariant__Group_1_2__112761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__ParamsAssignment_1_2_1_in_rule__StructVariant__Group_1_2__1__Impl12788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__0__Impl_in_rule__StructVariant__Group_4__012822 = new BitSet(new long[]{0x0000300000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__1_in_rule__StructVariant__Group_4__012825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__StructVariant__Group_4__0__Impl12853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__1__Impl_in_rule__StructVariant__Group_4__112884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__FieldsAssignment_4_1_in_rule__StructVariant__Group_4__1__Impl12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__0__Impl_in_rule__TupleVariant__Group__012945 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__1_in_rule__TupleVariant__Group__012948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__IdentAssignment_0_in_rule__TupleVariant__Group__0__Impl12975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__1__Impl_in_rule__TupleVariant__Group__113005 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__2_in_rule__TupleVariant__Group__113008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TupleVariant__Group__1__Impl13036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__2__Impl_in_rule__TupleVariant__Group__213067 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__3_in_rule__TupleVariant__Group__213070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__TypesAssignment_2_in_rule__TupleVariant__Group__2__Impl13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__3__Impl_in_rule__TupleVariant__Group__313127 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__4_in_rule__TupleVariant__Group__313130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__0_in_rule__TupleVariant__Group__3__Impl13157 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__4__Impl_in_rule__TupleVariant__Group__413188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TupleVariant__Group__4__Impl13216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__0__Impl_in_rule__TupleVariant__Group_3__013257 = new BitSet(new long[]{0xC0020000000007C0L,0x0000000000000019L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__1_in_rule__TupleVariant__Group_3__013260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TupleVariant__Group_3__0__Impl13288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__1__Impl_in_rule__TupleVariant__Group_3__113319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__TypesAssignment_3_1_in_rule__TupleVariant__Group_3__1__Impl13346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment13385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_113416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_113447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_013478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_213509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_113540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_013571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_213602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_013633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_113664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_113695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__ModItem__ExternalBodyAssignment_2_013731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_rule__ModItem__ItemsAssignment_2_1_113770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__FnItem__IdentAssignment_113801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_113832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_2_113863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_013894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_1_113925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__FnItem__ReturnTypeAssignment_6_113956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__FnItem__BodyAssignment_713987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__IdentAssignment_014018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_114049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_2_114080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__Arg__PatAssignment_014111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Arg__TypeAssignment_214142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_rule__PatIdent__MutableAssignment_014173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__PatIdent__IdentAssignment_114204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__PatBoxed__PatternAssignment_114235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__PatOwned__PatternAssignment_114266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__PatBorrowed__PatternAssignment_114297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__PatTuple__PatternsAssignment_114328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__PatTuple__PatternsAssignment_2_114359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__PatVector__PatternsAssignment_114390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__PatVector__PatternsAssignment_2_114421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__PatLiteral__LiteralAssignment14452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rule__PatCharRange__StartAssignment_014483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rule__PatCharRange__EndAssignment_214514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rule__PatNumberRange__StartAssignment_014545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rule__PatNumberRange__EndAssignment_214576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_114607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_2_114638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__StructType__IdentAssignment_114669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_114700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_2_114731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_414762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_5_114793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BoxedPointer__TypeAssignment_114824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__OwnedPointer__TypeAssignment_114855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BorrowedPointer__TypeAssignment_114886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__StructField__VisAssignment_014917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__StructField__IdentAssignment_114948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__StructField__TypeAssignment_314979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__EnumType__IdentAssignment_115010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_115041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_2_115072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_415103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_5_115134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__StructVariant__IdentAssignment_015165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_115196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_2_115227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_315258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_4_115289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__TupleVariant__IdentAssignment_015320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_215351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_3_115382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__UnitVariant__IdentAssignment15413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LIT_in_rule__StringLit__ValueAssignment15444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLit__ValueAlternatives_0_in_rule__NumberLit__ValueAssignment15475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_LIT_in_rule__CharLit__ValueAssignment15508 = new BitSet(new long[]{0x0000000000000002L});

}