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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FLOAT_LIT", "RULE_INT_LIT", "RULE_INT_TYPE", "RULE_FLOAT_TYPE", "RULE_BOOLEAN_TYPE", "RULE_MACHINE_TYPE", "RULE_UNIT_TYPE", "RULE_IDENT", "RULE_STRING_LIT", "RULE_CHAR_LIT", "RULE_INT_SIZE", "RULE_SIGNED_INT_TYPE", "RULE_UNSIGNED_INT_TYPE", "RULE_I8", "RULE_I16", "RULE_I32", "RULE_I64", "RULE_U8", "RULE_U16", "RULE_U32", "RULE_U64", "RULE_FLOAT_SIZE", "RULE_F32", "RULE_F64", "RULE_MACHINE_INT_TYPE", "RULE_MACHINE_UINT_TYPE", "RULE_UNICODE_CHAR", "RULE_UTF8_CHAR", "RULE_UTF16_CHAR", "RULE_UTF32_CHAR", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_DEC_INT_LIT", "RULE_BIN_INT_LIT", "RULE_OCT_INT_LIT", "RULE_HEX_INT_LIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "'priv'", "'pub'", "'#['", "']'", "','", "'('", "')'", "'='", "'mod'", "'{'", "'}'", "'fn'", "'<'", "'>'", "'->'", "':'", "'+'", "'struct'", "'@'", "'~'", "'&'", "'enum'", "';'"
    };
    public static final int RULE_FLOAT_TYPE=7;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DEC_INT_LIT=36;
    public static final int RULE_SIGNED_INT_TYPE=15;
    public static final int RULE_I8=17;
    public static final int RULE_MACHINE_UINT_TYPE=29;
    public static final int RULE_UTF32_CHAR=33;
    public static final int RULE_UTF16_CHAR=32;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int RULE_I16=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_U8=21;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_U64=24;
    public static final int T__54=54;
    public static final int RULE_OCT_INT_LIT=38;
    public static final int T__59=59;
    public static final int RULE_BIN_INT_LIT=37;
    public static final int RULE_INT_LIT=5;
    public static final int RULE_XID_CONTINUE=42;
    public static final int RULE_MACHINE_INT_TYPE=28;
    public static final int T__50=50;
    public static final int RULE_U32=23;
    public static final int RULE_HEX_INT_LIT=39;
    public static final int RULE_F64=27;
    public static final int T__43=43;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_OCT_DIGIT=40;
    public static final int RULE_DEC_DIGIT=35;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_HEX_DIGIT=34;
    public static final int RULE_UNICODE_CHAR=30;
    public static final int RULE_UTF8_CHAR=31;
    public static final int RULE_I32=19;
    public static final int RULE_INT_SIZE=14;
    public static final int RULE_INT_TYPE=6;
    public static final int RULE_UNSIGNED_INT_TYPE=16;
    public static final int RULE_I64=20;
    public static final int RULE_XID_START=41;
    public static final int RULE_FLOAT_LIT=4;
    public static final int RULE_F32=26;
    public static final int RULE_IDENT=11;
    public static final int RULE_U16=22;
    public static final int RULE_MACHINE_TYPE=9;
    public static final int RULE_FLOAT_SIZE=25;
    public static final int RULE_STRING_LIT=12;
    public static final int RULE_CHAR_LIT=13;
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

                if ( (LA1_0==45||LA1_0==51||LA1_0==54) ) {
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:405:1: rulePat : ( ( rule__Pat__IdentAssignment ) ) ;
    public final void rulePat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:409:2: ( ( ( rule__Pat__IdentAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:410:1: ( ( rule__Pat__IdentAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:410:1: ( ( rule__Pat__IdentAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:411:1: ( rule__Pat__IdentAssignment )
            {
             before(grammarAccess.getPatAccess().getIdentAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:412:1: ( rule__Pat__IdentAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:412:2: rule__Pat__IdentAssignment
            {
            pushFollow(FOLLOW_rule__Pat__IdentAssignment_in_rulePat815);
            rule__Pat__IdentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPatAccess().getIdentAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:424:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:425:1: ( ruleType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:426:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType842);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType849); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:433:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:437:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:438:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:438:1: ( ( rule__Type__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:439:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:440:1: ( rule__Type__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:440:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType875);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:452:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:453:1: ( rulePrimitiveType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:454:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType902);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType909); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:461:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:465:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:466:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:466:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:467:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:468:1: ( rule__PrimitiveType__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:468:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType935);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:480:1: entryRuleTupleType : ruleTupleType EOF ;
    public final void entryRuleTupleType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:481:1: ( ruleTupleType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:482:1: ruleTupleType EOF
            {
             before(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_ruleTupleType_in_entryRuleTupleType962);
            ruleTupleType();

            state._fsp--;

             after(grammarAccess.getTupleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleType969); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:489:1: ruleTupleType : ( ( rule__TupleType__Group__0 ) ) ;
    public final void ruleTupleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:493:2: ( ( ( rule__TupleType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:494:1: ( ( rule__TupleType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:494:1: ( ( rule__TupleType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:495:1: ( rule__TupleType__Group__0 )
            {
             before(grammarAccess.getTupleTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:496:1: ( rule__TupleType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:496:2: rule__TupleType__Group__0
            {
            pushFollow(FOLLOW_rule__TupleType__Group__0_in_ruleTupleType995);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:508:1: entryRuleStructType : ruleStructType EOF ;
    public final void entryRuleStructType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:509:1: ( ruleStructType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:510:1: ruleStructType EOF
            {
             before(grammarAccess.getStructTypeRule()); 
            pushFollow(FOLLOW_ruleStructType_in_entryRuleStructType1022);
            ruleStructType();

            state._fsp--;

             after(grammarAccess.getStructTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructType1029); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:517:1: ruleStructType : ( ( rule__StructType__Group__0 ) ) ;
    public final void ruleStructType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:521:2: ( ( ( rule__StructType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:522:1: ( ( rule__StructType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:522:1: ( ( rule__StructType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:523:1: ( rule__StructType__Group__0 )
            {
             before(grammarAccess.getStructTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:524:1: ( rule__StructType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:524:2: rule__StructType__Group__0
            {
            pushFollow(FOLLOW_rule__StructType__Group__0_in_ruleStructType1055);
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


    // $ANTLR start "entryRuleBoxedType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:536:1: entryRuleBoxedType : ruleBoxedType EOF ;
    public final void entryRuleBoxedType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:537:1: ( ruleBoxedType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:538:1: ruleBoxedType EOF
            {
             before(grammarAccess.getBoxedTypeRule()); 
            pushFollow(FOLLOW_ruleBoxedType_in_entryRuleBoxedType1082);
            ruleBoxedType();

            state._fsp--;

             after(grammarAccess.getBoxedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxedType1089); 

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
    // $ANTLR end "entryRuleBoxedType"


    // $ANTLR start "ruleBoxedType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:545:1: ruleBoxedType : ( ( rule__BoxedType__Group__0 ) ) ;
    public final void ruleBoxedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:549:2: ( ( ( rule__BoxedType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:550:1: ( ( rule__BoxedType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:550:1: ( ( rule__BoxedType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:551:1: ( rule__BoxedType__Group__0 )
            {
             before(grammarAccess.getBoxedTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:552:1: ( rule__BoxedType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:552:2: rule__BoxedType__Group__0
            {
            pushFollow(FOLLOW_rule__BoxedType__Group__0_in_ruleBoxedType1115);
            rule__BoxedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoxedType"


    // $ANTLR start "entryRuleOwnedType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:564:1: entryRuleOwnedType : ruleOwnedType EOF ;
    public final void entryRuleOwnedType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:565:1: ( ruleOwnedType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:566:1: ruleOwnedType EOF
            {
             before(grammarAccess.getOwnedTypeRule()); 
            pushFollow(FOLLOW_ruleOwnedType_in_entryRuleOwnedType1142);
            ruleOwnedType();

            state._fsp--;

             after(grammarAccess.getOwnedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedType1149); 

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
    // $ANTLR end "entryRuleOwnedType"


    // $ANTLR start "ruleOwnedType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:573:1: ruleOwnedType : ( ( rule__OwnedType__Group__0 ) ) ;
    public final void ruleOwnedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:577:2: ( ( ( rule__OwnedType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:578:1: ( ( rule__OwnedType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:578:1: ( ( rule__OwnedType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:579:1: ( rule__OwnedType__Group__0 )
            {
             before(grammarAccess.getOwnedTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:580:1: ( rule__OwnedType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:580:2: rule__OwnedType__Group__0
            {
            pushFollow(FOLLOW_rule__OwnedType__Group__0_in_ruleOwnedType1175);
            rule__OwnedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOwnedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedType"


    // $ANTLR start "entryRuleBorrowedType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:592:1: entryRuleBorrowedType : ruleBorrowedType EOF ;
    public final void entryRuleBorrowedType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:593:1: ( ruleBorrowedType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:594:1: ruleBorrowedType EOF
            {
             before(grammarAccess.getBorrowedTypeRule()); 
            pushFollow(FOLLOW_ruleBorrowedType_in_entryRuleBorrowedType1202);
            ruleBorrowedType();

            state._fsp--;

             after(grammarAccess.getBorrowedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrowedType1209); 

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
    // $ANTLR end "entryRuleBorrowedType"


    // $ANTLR start "ruleBorrowedType"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:601:1: ruleBorrowedType : ( ( rule__BorrowedType__Group__0 ) ) ;
    public final void ruleBorrowedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:605:2: ( ( ( rule__BorrowedType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:606:1: ( ( rule__BorrowedType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:606:1: ( ( rule__BorrowedType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:607:1: ( rule__BorrowedType__Group__0 )
            {
             before(grammarAccess.getBorrowedTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:1: ( rule__BorrowedType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:2: rule__BorrowedType__Group__0
            {
            pushFollow(FOLLOW_rule__BorrowedType__Group__0_in_ruleBorrowedType1235);
            rule__BorrowedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBorrowedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBorrowedType"


    // $ANTLR start "entryRuleStructField"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:620:1: entryRuleStructField : ruleStructField EOF ;
    public final void entryRuleStructField() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:621:1: ( ruleStructField EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:622:1: ruleStructField EOF
            {
             before(grammarAccess.getStructFieldRule()); 
            pushFollow(FOLLOW_ruleStructField_in_entryRuleStructField1262);
            ruleStructField();

            state._fsp--;

             after(grammarAccess.getStructFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructField1269); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:629:1: ruleStructField : ( ( rule__StructField__Group__0 ) ) ;
    public final void ruleStructField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:633:2: ( ( ( rule__StructField__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:634:1: ( ( rule__StructField__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:634:1: ( ( rule__StructField__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:635:1: ( rule__StructField__Group__0 )
            {
             before(grammarAccess.getStructFieldAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:636:1: ( rule__StructField__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:636:2: rule__StructField__Group__0
            {
            pushFollow(FOLLOW_rule__StructField__Group__0_in_ruleStructField1295);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:648:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:649:1: ( ruleEnumType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:650:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType1322);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType1329); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:657:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:661:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:662:1: ( ( rule__EnumType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:662:1: ( ( rule__EnumType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:663:1: ( rule__EnumType__Group__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:664:1: ( rule__EnumType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:664:2: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0_in_ruleEnumType1355);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:676:1: entryRuleVariant : ruleVariant EOF ;
    public final void entryRuleVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:677:1: ( ruleVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:678:1: ruleVariant EOF
            {
             before(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_ruleVariant_in_entryRuleVariant1382);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariant1389); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:685:1: ruleVariant : ( ( rule__Variant__Alternatives ) ) ;
    public final void ruleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:689:2: ( ( ( rule__Variant__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:690:1: ( ( rule__Variant__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:690:1: ( ( rule__Variant__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:691:1: ( rule__Variant__Alternatives )
            {
             before(grammarAccess.getVariantAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:692:1: ( rule__Variant__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:692:2: rule__Variant__Alternatives
            {
            pushFollow(FOLLOW_rule__Variant__Alternatives_in_ruleVariant1415);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:704:1: entryRuleStructVariant : ruleStructVariant EOF ;
    public final void entryRuleStructVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:705:1: ( ruleStructVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:706:1: ruleStructVariant EOF
            {
             before(grammarAccess.getStructVariantRule()); 
            pushFollow(FOLLOW_ruleStructVariant_in_entryRuleStructVariant1442);
            ruleStructVariant();

            state._fsp--;

             after(grammarAccess.getStructVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructVariant1449); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:713:1: ruleStructVariant : ( ( rule__StructVariant__Group__0 ) ) ;
    public final void ruleStructVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:717:2: ( ( ( rule__StructVariant__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:718:1: ( ( rule__StructVariant__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:718:1: ( ( rule__StructVariant__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:719:1: ( rule__StructVariant__Group__0 )
            {
             before(grammarAccess.getStructVariantAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:720:1: ( rule__StructVariant__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:720:2: rule__StructVariant__Group__0
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__0_in_ruleStructVariant1475);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:732:1: entryRuleTupleVariant : ruleTupleVariant EOF ;
    public final void entryRuleTupleVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:733:1: ( ruleTupleVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:734:1: ruleTupleVariant EOF
            {
             before(grammarAccess.getTupleVariantRule()); 
            pushFollow(FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant1502);
            ruleTupleVariant();

            state._fsp--;

             after(grammarAccess.getTupleVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleVariant1509); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:741:1: ruleTupleVariant : ( ( rule__TupleVariant__Group__0 ) ) ;
    public final void ruleTupleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:745:2: ( ( ( rule__TupleVariant__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:746:1: ( ( rule__TupleVariant__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:746:1: ( ( rule__TupleVariant__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:747:1: ( rule__TupleVariant__Group__0 )
            {
             before(grammarAccess.getTupleVariantAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:748:1: ( rule__TupleVariant__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:748:2: rule__TupleVariant__Group__0
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__0_in_ruleTupleVariant1535);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:760:1: entryRuleUnitVariant : ruleUnitVariant EOF ;
    public final void entryRuleUnitVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:761:1: ( ruleUnitVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:762:1: ruleUnitVariant EOF
            {
             before(grammarAccess.getUnitVariantRule()); 
            pushFollow(FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant1562);
            ruleUnitVariant();

            state._fsp--;

             after(grammarAccess.getUnitVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitVariant1569); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:769:1: ruleUnitVariant : ( ( rule__UnitVariant__IdentAssignment ) ) ;
    public final void ruleUnitVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:773:2: ( ( ( rule__UnitVariant__IdentAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:774:1: ( ( rule__UnitVariant__IdentAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:774:1: ( ( rule__UnitVariant__IdentAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:775:1: ( rule__UnitVariant__IdentAssignment )
            {
             before(grammarAccess.getUnitVariantAccess().getIdentAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:776:1: ( rule__UnitVariant__IdentAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:776:2: rule__UnitVariant__IdentAssignment
            {
            pushFollow(FOLLOW_rule__UnitVariant__IdentAssignment_in_ruleUnitVariant1595);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:788:1: entryRuleStringLit : ruleStringLit EOF ;
    public final void entryRuleStringLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:789:1: ( ruleStringLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:790:1: ruleStringLit EOF
            {
             before(grammarAccess.getStringLitRule()); 
            pushFollow(FOLLOW_ruleStringLit_in_entryRuleStringLit1622);
            ruleStringLit();

            state._fsp--;

             after(grammarAccess.getStringLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLit1629); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:797:1: ruleStringLit : ( ( rule__StringLit__ValueAssignment ) ) ;
    public final void ruleStringLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:801:2: ( ( ( rule__StringLit__ValueAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:802:1: ( ( rule__StringLit__ValueAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:802:1: ( ( rule__StringLit__ValueAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:803:1: ( rule__StringLit__ValueAssignment )
            {
             before(grammarAccess.getStringLitAccess().getValueAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:804:1: ( rule__StringLit__ValueAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:804:2: rule__StringLit__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLit__ValueAssignment_in_ruleStringLit1655);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:816:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:817:1: ( ruleLiteral EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:818:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1682);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1689); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:825:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:829:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:830:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:830:1: ( ( rule__Literal__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:831:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:832:1: ( rule__Literal__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:832:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1715);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:844:1: entryRuleNumberLit : ruleNumberLit EOF ;
    public final void entryRuleNumberLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:845:1: ( ruleNumberLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:846:1: ruleNumberLit EOF
            {
             before(grammarAccess.getNumberLitRule()); 
            pushFollow(FOLLOW_ruleNumberLit_in_entryRuleNumberLit1742);
            ruleNumberLit();

            state._fsp--;

             after(grammarAccess.getNumberLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLit1749); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:853:1: ruleNumberLit : ( ( rule__NumberLit__ValueAssignment ) ) ;
    public final void ruleNumberLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:857:2: ( ( ( rule__NumberLit__ValueAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:858:1: ( ( rule__NumberLit__ValueAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:858:1: ( ( rule__NumberLit__ValueAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:859:1: ( rule__NumberLit__ValueAssignment )
            {
             before(grammarAccess.getNumberLitAccess().getValueAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:860:1: ( rule__NumberLit__ValueAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:860:2: rule__NumberLit__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberLit__ValueAssignment_in_ruleNumberLit1775);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:872:1: entryRuleCharLit : ruleCharLit EOF ;
    public final void entryRuleCharLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:873:1: ( ruleCharLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:874:1: ruleCharLit EOF
            {
             before(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit1802);
            ruleCharLit();

            state._fsp--;

             after(grammarAccess.getCharLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit1809); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:881:1: ruleCharLit : ( ( rule__CharLit__ValueAssignment ) ) ;
    public final void ruleCharLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:885:2: ( ( ( rule__CharLit__ValueAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:886:1: ( ( rule__CharLit__ValueAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:886:1: ( ( rule__CharLit__ValueAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:887:1: ( rule__CharLit__ValueAssignment )
            {
             before(grammarAccess.getCharLitAccess().getValueAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:888:1: ( rule__CharLit__ValueAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:888:2: rule__CharLit__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CharLit__ValueAssignment_in_ruleCharLit1835);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:901:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:905:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:906:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:906:1: ( ( rule__Visibility__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:907:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:908:1: ( rule__Visibility__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:908:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1872);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:919:1: rule__Attr__Alternatives : ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) );
    public final void rule__Attr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:923:1: ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==50) ) {
                    alt2=1;
                }
                else if ( (LA2_1==48) ) {
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:924:1: ( ruleLiteralAttr )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:924:1: ( ruleLiteralAttr )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:925:1: ruleLiteralAttr
                    {
                     before(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1907);
                    ruleLiteralAttr();

                    state._fsp--;

                     after(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:930:6: ( ruleAttrWithList )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:930:6: ( ruleAttrWithList )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:931:1: ruleAttrWithList
                    {
                     before(grammarAccess.getAttrAccess().getAttrWithListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1924);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:941:1: rule__Item__Alternatives : ( ( ruleModItem ) | ( ruleFnItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:945:1: ( ( ruleModItem ) | ( ruleFnItem ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==51) ) {
                alt3=1;
            }
            else if ( (LA3_0==54) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:946:1: ( ruleModItem )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:946:1: ( ruleModItem )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:947:1: ruleModItem
                    {
                     before(grammarAccess.getItemAccess().getModItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleModItem_in_rule__Item__Alternatives1956);
                    ruleModItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getModItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:952:6: ( ruleFnItem )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:952:6: ( ruleFnItem )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:953:1: ruleFnItem
                    {
                     before(grammarAccess.getItemAccess().getFnItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFnItem_in_rule__Item__Alternatives1973);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:963:1: rule__ModItem__Alternatives_2 : ( ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) ) | ( ( rule__ModItem__Group_2_1__0 ) ) );
    public final void rule__ModItem__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:967:1: ( ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) ) | ( ( rule__ModItem__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==65) ) {
                alt4=1;
            }
            else if ( (LA4_0==52) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:968:1: ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:968:1: ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:969:1: ( rule__ModItem__ExternalBodyAssignment_2_0 )
                    {
                     before(grammarAccess.getModItemAccess().getExternalBodyAssignment_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:970:1: ( rule__ModItem__ExternalBodyAssignment_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:970:2: rule__ModItem__ExternalBodyAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ModItem__ExternalBodyAssignment_2_0_in_rule__ModItem__Alternatives_22005);
                    rule__ModItem__ExternalBodyAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModItemAccess().getExternalBodyAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:974:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:974:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:975:1: ( rule__ModItem__Group_2_1__0 )
                    {
                     before(grammarAccess.getModItemAccess().getGroup_2_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:976:1: ( rule__ModItem__Group_2_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:976:2: rule__ModItem__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_22023);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:985:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleTupleType ) | ( ruleStructType ) | ( ruleEnumType ) | ( ruleBoxedType ) | ( ruleOwnedType ) | ( ruleBorrowedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:989:1: ( ( rulePrimitiveType ) | ( ruleTupleType ) | ( ruleStructType ) | ( ruleEnumType ) | ( ruleBoxedType ) | ( ruleOwnedType ) | ( ruleBorrowedType ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
            case RULE_FLOAT_TYPE:
            case RULE_BOOLEAN_TYPE:
            case RULE_MACHINE_TYPE:
            case RULE_UNIT_TYPE:
                {
                alt5=1;
                }
                break;
            case 48:
                {
                alt5=2;
                }
                break;
            case 60:
                {
                alt5=3;
                }
                break;
            case 64:
                {
                alt5=4;
                }
                break;
            case 61:
                {
                alt5=5;
                }
                break;
            case 62:
                {
                alt5=6;
                }
                break;
            case 63:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:990:1: ( rulePrimitiveType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:990:1: ( rulePrimitiveType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:991:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives2056);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:996:6: ( ruleTupleType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:996:6: ( ruleTupleType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:997:1: ruleTupleType
                    {
                     before(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTupleType_in_rule__Type__Alternatives2073);
                    ruleTupleType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1002:6: ( ruleStructType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1002:6: ( ruleStructType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1003:1: ruleStructType
                    {
                     before(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStructType_in_rule__Type__Alternatives2090);
                    ruleStructType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1008:6: ( ruleEnumType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1008:6: ( ruleEnumType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1009:1: ruleEnumType
                    {
                     before(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__Type__Alternatives2107);
                    ruleEnumType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1014:6: ( ruleBoxedType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1014:6: ( ruleBoxedType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1015:1: ruleBoxedType
                    {
                     before(grammarAccess.getTypeAccess().getBoxedTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBoxedType_in_rule__Type__Alternatives2124);
                    ruleBoxedType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBoxedTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1020:6: ( ruleOwnedType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1020:6: ( ruleOwnedType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1021:1: ruleOwnedType
                    {
                     before(grammarAccess.getTypeAccess().getOwnedTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleOwnedType_in_rule__Type__Alternatives2141);
                    ruleOwnedType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getOwnedTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1026:6: ( ruleBorrowedType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1026:6: ( ruleBorrowedType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1027:1: ruleBorrowedType
                    {
                     before(grammarAccess.getTypeAccess().getBorrowedTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleBorrowedType_in_rule__Type__Alternatives2158);
                    ruleBorrowedType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBorrowedTypeParserRuleCall_6()); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1037:1: rule__PrimitiveType__Alternatives : ( ( ( rule__PrimitiveType__Group_0__0 ) ) | ( ( rule__PrimitiveType__Group_1__0 ) ) | ( ( rule__PrimitiveType__Group_2__0 ) ) | ( ( rule__PrimitiveType__Group_3__0 ) ) | ( ( rule__PrimitiveType__Group_4__0 ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1041:1: ( ( ( rule__PrimitiveType__Group_0__0 ) ) | ( ( rule__PrimitiveType__Group_1__0 ) ) | ( ( rule__PrimitiveType__Group_2__0 ) ) | ( ( rule__PrimitiveType__Group_3__0 ) ) | ( ( rule__PrimitiveType__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
                {
                alt6=1;
                }
                break;
            case RULE_FLOAT_TYPE:
                {
                alt6=2;
                }
                break;
            case RULE_BOOLEAN_TYPE:
                {
                alt6=3;
                }
                break;
            case RULE_MACHINE_TYPE:
                {
                alt6=4;
                }
                break;
            case RULE_UNIT_TYPE:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1042:1: ( ( rule__PrimitiveType__Group_0__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1042:1: ( ( rule__PrimitiveType__Group_0__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1043:1: ( rule__PrimitiveType__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1044:1: ( rule__PrimitiveType__Group_0__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1044:2: rule__PrimitiveType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_0__0_in_rule__PrimitiveType__Alternatives2190);
                    rule__PrimitiveType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1048:6: ( ( rule__PrimitiveType__Group_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1048:6: ( ( rule__PrimitiveType__Group_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1049:1: ( rule__PrimitiveType__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1050:1: ( rule__PrimitiveType__Group_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1050:2: rule__PrimitiveType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_1__0_in_rule__PrimitiveType__Alternatives2208);
                    rule__PrimitiveType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1054:6: ( ( rule__PrimitiveType__Group_2__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1054:6: ( ( rule__PrimitiveType__Group_2__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1055:1: ( rule__PrimitiveType__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1056:1: ( rule__PrimitiveType__Group_2__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1056:2: rule__PrimitiveType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_2__0_in_rule__PrimitiveType__Alternatives2226);
                    rule__PrimitiveType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1060:6: ( ( rule__PrimitiveType__Group_3__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1060:6: ( ( rule__PrimitiveType__Group_3__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1061:1: ( rule__PrimitiveType__Group_3__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1062:1: ( rule__PrimitiveType__Group_3__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1062:2: rule__PrimitiveType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_3__0_in_rule__PrimitiveType__Alternatives2244);
                    rule__PrimitiveType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1066:6: ( ( rule__PrimitiveType__Group_4__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1066:6: ( ( rule__PrimitiveType__Group_4__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1067:1: ( rule__PrimitiveType__Group_4__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_4()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1068:1: ( rule__PrimitiveType__Group_4__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1068:2: rule__PrimitiveType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_4__0_in_rule__PrimitiveType__Alternatives2262);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1077:1: rule__Variant__Alternatives : ( ( ruleStructVariant ) | ( ruleTupleVariant ) | ( ruleUnitVariant ) );
    public final void rule__Variant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1081:1: ( ( ruleStructVariant ) | ( ruleTupleVariant ) | ( ruleUnitVariant ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IDENT) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 47:
                case 53:
                    {
                    alt7=3;
                    }
                    break;
                case 48:
                    {
                    alt7=2;
                    }
                    break;
                case 52:
                case 55:
                    {
                    alt7=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1082:1: ( ruleStructVariant )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1082:1: ( ruleStructVariant )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1083:1: ruleStructVariant
                    {
                     before(grammarAccess.getVariantAccess().getStructVariantParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructVariant_in_rule__Variant__Alternatives2295);
                    ruleStructVariant();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getStructVariantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1088:6: ( ruleTupleVariant )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1088:6: ( ruleTupleVariant )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1089:1: ruleTupleVariant
                    {
                     before(grammarAccess.getVariantAccess().getTupleVariantParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTupleVariant_in_rule__Variant__Alternatives2312);
                    ruleTupleVariant();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getTupleVariantParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1094:6: ( ruleUnitVariant )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1094:6: ( ruleUnitVariant )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1095:1: ruleUnitVariant
                    {
                     before(grammarAccess.getVariantAccess().getUnitVariantParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUnitVariant_in_rule__Variant__Alternatives2329);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1105:1: rule__Literal__Alternatives : ( ( ruleNumberLit ) | ( ruleCharLit ) | ( ruleStringLit ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1109:1: ( ( ruleNumberLit ) | ( ruleCharLit ) | ( ruleStringLit ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_FLOAT_LIT:
            case RULE_INT_LIT:
                {
                alt8=1;
                }
                break;
            case RULE_CHAR_LIT:
                {
                alt8=2;
                }
                break;
            case RULE_STRING_LIT:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1110:1: ( ruleNumberLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1110:1: ( ruleNumberLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1111:1: ruleNumberLit
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives2361);
                    ruleNumberLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1116:6: ( ruleCharLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1116:6: ( ruleCharLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1117:1: ruleCharLit
                    {
                     before(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCharLit_in_rule__Literal__Alternatives2378);
                    ruleCharLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1122:6: ( ruleStringLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1122:6: ( ruleStringLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1123:1: ruleStringLit
                    {
                     before(grammarAccess.getLiteralAccess().getStringLitParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringLit_in_rule__Literal__Alternatives2395);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1133:1: rule__NumberLit__ValueAlternatives_0 : ( ( RULE_FLOAT_LIT ) | ( RULE_INT_LIT ) );
    public final void rule__NumberLit__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1137:1: ( ( RULE_FLOAT_LIT ) | ( RULE_INT_LIT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_FLOAT_LIT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT_LIT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1138:1: ( RULE_FLOAT_LIT )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1138:1: ( RULE_FLOAT_LIT )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1139:1: RULE_FLOAT_LIT
                    {
                     before(grammarAccess.getNumberLitAccess().getValueFLOAT_LITTerminalRuleCall_0_0()); 
                    match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_rule__NumberLit__ValueAlternatives_02427); 
                     after(grammarAccess.getNumberLitAccess().getValueFLOAT_LITTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1144:6: ( RULE_INT_LIT )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1144:6: ( RULE_INT_LIT )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1145:1: RULE_INT_LIT
                    {
                     before(grammarAccess.getNumberLitAccess().getValueINT_LITTerminalRuleCall_0_1()); 
                    match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_rule__NumberLit__ValueAlternatives_02444); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1155:1: rule__Visibility__Alternatives : ( ( ( 'priv' ) ) | ( ( 'pub' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1159:1: ( ( ( 'priv' ) ) | ( ( 'pub' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==44) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1160:1: ( ( 'priv' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1160:1: ( ( 'priv' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1161:1: ( 'priv' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1162:1: ( 'priv' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1162:3: 'priv'
                    {
                    match(input,43,FOLLOW_43_in_rule__Visibility__Alternatives2477); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1167:6: ( ( 'pub' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1167:6: ( ( 'pub' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1168:1: ( 'pub' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1169:1: ( 'pub' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1169:3: 'pub'
                    {
                    match(input,44,FOLLOW_44_in_rule__Visibility__Alternatives2498); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1181:1: rule__ItemAttr__Group__0 : rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 ;
    public final void rule__ItemAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1185:1: ( rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1186:2: rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02531);
            rule__ItemAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02534);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1193:1: rule__ItemAttr__Group__0__Impl : ( '#[' ) ;
    public final void rule__ItemAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1197:1: ( ( '#[' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1198:1: ( '#[' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1198:1: ( '#[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1199:1: '#['
            {
             before(grammarAccess.getItemAttrAccess().getNumberSignLeftSquareBracketKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__ItemAttr__Group__0__Impl2562); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1212:1: rule__ItemAttr__Group__1 : rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 ;
    public final void rule__ItemAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1216:1: ( rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1217:2: rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12593);
            rule__ItemAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12596);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1224:1: rule__ItemAttr__Group__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_1 ) ) ;
    public final void rule__ItemAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1228:1: ( ( ( rule__ItemAttr__AttrsAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1229:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1229:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1230:1: ( rule__ItemAttr__AttrsAssignment_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1231:1: ( rule__ItemAttr__AttrsAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1231:2: rule__ItemAttr__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl2623);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1241:1: rule__ItemAttr__Group__2 : rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 ;
    public final void rule__ItemAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1245:1: ( rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1246:2: rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__22653);
            rule__ItemAttr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__22656);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1253:1: rule__ItemAttr__Group__2__Impl : ( ( rule__ItemAttr__Group_2__0 )* ) ;
    public final void rule__ItemAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1257:1: ( ( ( rule__ItemAttr__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1258:1: ( ( rule__ItemAttr__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1258:1: ( ( rule__ItemAttr__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1259:1: ( rule__ItemAttr__Group_2__0 )*
            {
             before(grammarAccess.getItemAttrAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1260:1: ( rule__ItemAttr__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1260:2: rule__ItemAttr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl2683);
            	    rule__ItemAttr__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1270:1: rule__ItemAttr__Group__3 : rule__ItemAttr__Group__3__Impl ;
    public final void rule__ItemAttr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1274:1: ( rule__ItemAttr__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1275:2: rule__ItemAttr__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__32714);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1281:1: rule__ItemAttr__Group__3__Impl : ( ']' ) ;
    public final void rule__ItemAttr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1285:1: ( ( ']' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1286:1: ( ']' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1286:1: ( ']' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1287:1: ']'
            {
             before(grammarAccess.getItemAttrAccess().getRightSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_46_in_rule__ItemAttr__Group__3__Impl2742); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1308:1: rule__ItemAttr__Group_2__0 : rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 ;
    public final void rule__ItemAttr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1312:1: ( rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1313:2: rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__02781);
            rule__ItemAttr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__02784);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1320:1: rule__ItemAttr__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ItemAttr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1324:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1325:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1325:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1326:1: ','
            {
             before(grammarAccess.getItemAttrAccess().getCommaKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__ItemAttr__Group_2__0__Impl2812); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1339:1: rule__ItemAttr__Group_2__1 : rule__ItemAttr__Group_2__1__Impl ;
    public final void rule__ItemAttr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1343:1: ( rule__ItemAttr__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1344:2: rule__ItemAttr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__12843);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1350:1: rule__ItemAttr__Group_2__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) ;
    public final void rule__ItemAttr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1354:1: ( ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1355:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1355:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1356:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1357:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1357:2: rule__ItemAttr__AttrsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl2870);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1371:1: rule__AttrWithList__Group__0 : rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 ;
    public final void rule__AttrWithList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1375:1: ( rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1376:2: rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__02904);
            rule__AttrWithList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__02907);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1383:1: rule__AttrWithList__Group__0__Impl : ( ( rule__AttrWithList__IdentAssignment_0 ) ) ;
    public final void rule__AttrWithList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1387:1: ( ( ( rule__AttrWithList__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1388:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1388:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1389:1: ( rule__AttrWithList__IdentAssignment_0 )
            {
             before(grammarAccess.getAttrWithListAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1390:1: ( rule__AttrWithList__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1390:2: rule__AttrWithList__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl2934);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1400:1: rule__AttrWithList__Group__1 : rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 ;
    public final void rule__AttrWithList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1404:1: ( rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1405:2: rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__12964);
            rule__AttrWithList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__12967);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1412:1: rule__AttrWithList__Group__1__Impl : ( '(' ) ;
    public final void rule__AttrWithList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1416:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1417:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1417:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1418:1: '('
            {
             before(grammarAccess.getAttrWithListAccess().getLeftParenthesisKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__AttrWithList__Group__1__Impl2995); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1431:1: rule__AttrWithList__Group__2 : rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 ;
    public final void rule__AttrWithList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1435:1: ( rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1436:2: rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__23026);
            rule__AttrWithList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__23029);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1443:1: rule__AttrWithList__Group__2__Impl : ( ( rule__AttrWithList__AttrsAssignment_2 ) ) ;
    public final void rule__AttrWithList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1447:1: ( ( ( rule__AttrWithList__AttrsAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1448:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1448:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1449:1: ( rule__AttrWithList__AttrsAssignment_2 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1450:1: ( rule__AttrWithList__AttrsAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1450:2: rule__AttrWithList__AttrsAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl3056);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1460:1: rule__AttrWithList__Group__3 : rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 ;
    public final void rule__AttrWithList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1464:1: ( rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1465:2: rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__33086);
            rule__AttrWithList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__33089);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1472:1: rule__AttrWithList__Group__3__Impl : ( ( rule__AttrWithList__Group_3__0 )* ) ;
    public final void rule__AttrWithList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1476:1: ( ( ( rule__AttrWithList__Group_3__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1477:1: ( ( rule__AttrWithList__Group_3__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1477:1: ( ( rule__AttrWithList__Group_3__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1478:1: ( rule__AttrWithList__Group_3__0 )*
            {
             before(grammarAccess.getAttrWithListAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1479:1: ( rule__AttrWithList__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==47) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1479:2: rule__AttrWithList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl3116);
            	    rule__AttrWithList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1489:1: rule__AttrWithList__Group__4 : rule__AttrWithList__Group__4__Impl ;
    public final void rule__AttrWithList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1493:1: ( rule__AttrWithList__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1494:2: rule__AttrWithList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__43147);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1500:1: rule__AttrWithList__Group__4__Impl : ( ')' ) ;
    public final void rule__AttrWithList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1504:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1505:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1505:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1506:1: ')'
            {
             before(grammarAccess.getAttrWithListAccess().getRightParenthesisKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__AttrWithList__Group__4__Impl3175); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1529:1: rule__AttrWithList__Group_3__0 : rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 ;
    public final void rule__AttrWithList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1533:1: ( rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1534:2: rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__03216);
            rule__AttrWithList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__03219);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1541:1: rule__AttrWithList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AttrWithList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1545:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1546:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1546:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1547:1: ','
            {
             before(grammarAccess.getAttrWithListAccess().getCommaKeyword_3_0()); 
            match(input,47,FOLLOW_47_in_rule__AttrWithList__Group_3__0__Impl3247); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1560:1: rule__AttrWithList__Group_3__1 : rule__AttrWithList__Group_3__1__Impl ;
    public final void rule__AttrWithList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1564:1: ( rule__AttrWithList__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1565:2: rule__AttrWithList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__13278);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1571:1: rule__AttrWithList__Group_3__1__Impl : ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) ;
    public final void rule__AttrWithList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1575:1: ( ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1576:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1576:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1577:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1578:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1578:2: rule__AttrWithList__AttrsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl3305);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1592:1: rule__LiteralAttr__Group__0 : rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 ;
    public final void rule__LiteralAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1596:1: ( rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1597:2: rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__03339);
            rule__LiteralAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__03342);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1604:1: rule__LiteralAttr__Group__0__Impl : ( ( rule__LiteralAttr__IdentAssignment_0 ) ) ;
    public final void rule__LiteralAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1608:1: ( ( ( rule__LiteralAttr__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1609:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1609:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1610:1: ( rule__LiteralAttr__IdentAssignment_0 )
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1611:1: ( rule__LiteralAttr__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1611:2: rule__LiteralAttr__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl3369);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1621:1: rule__LiteralAttr__Group__1 : rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 ;
    public final void rule__LiteralAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1625:1: ( rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1626:2: rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__13399);
            rule__LiteralAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__13402);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1633:1: rule__LiteralAttr__Group__1__Impl : ( '=' ) ;
    public final void rule__LiteralAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1637:1: ( ( '=' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1638:1: ( '=' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1638:1: ( '=' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1639:1: '='
            {
             before(grammarAccess.getLiteralAttrAccess().getEqualsSignKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__LiteralAttr__Group__1__Impl3430); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1652:1: rule__LiteralAttr__Group__2 : rule__LiteralAttr__Group__2__Impl ;
    public final void rule__LiteralAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1656:1: ( rule__LiteralAttr__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1657:2: rule__LiteralAttr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23461);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1663:1: rule__LiteralAttr__Group__2__Impl : ( ( rule__LiteralAttr__ValueAssignment_2 ) ) ;
    public final void rule__LiteralAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1667:1: ( ( ( rule__LiteralAttr__ValueAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1668:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1668:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1669:1: ( rule__LiteralAttr__ValueAssignment_2 )
            {
             before(grammarAccess.getLiteralAttrAccess().getValueAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1670:1: ( rule__LiteralAttr__ValueAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1670:2: rule__LiteralAttr__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3488);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1686:1: rule__ItemAndAttrs__Group__0 : rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 ;
    public final void rule__ItemAndAttrs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1690:1: ( rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1691:2: rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03524);
            rule__ItemAndAttrs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03527);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1698:1: rule__ItemAndAttrs__Group__0__Impl : ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) ;
    public final void rule__ItemAndAttrs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1702:1: ( ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1703:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1703:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1704:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1705:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1705:2: rule__ItemAndAttrs__AttrsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3554);
            	    rule__ItemAndAttrs__AttrsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1715:1: rule__ItemAndAttrs__Group__1 : rule__ItemAndAttrs__Group__1__Impl ;
    public final void rule__ItemAndAttrs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1719:1: ( rule__ItemAndAttrs__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1720:2: rule__ItemAndAttrs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13585);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1726:1: rule__ItemAndAttrs__Group__1__Impl : ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) ;
    public final void rule__ItemAndAttrs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1730:1: ( ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1731:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1731:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1732:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1733:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1733:2: rule__ItemAndAttrs__ItemAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3612);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1747:1: rule__ModItem__Group__0 : rule__ModItem__Group__0__Impl rule__ModItem__Group__1 ;
    public final void rule__ModItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1751:1: ( rule__ModItem__Group__0__Impl rule__ModItem__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1752:2: rule__ModItem__Group__0__Impl rule__ModItem__Group__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__03646);
            rule__ModItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__03649);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1759:1: rule__ModItem__Group__0__Impl : ( 'mod' ) ;
    public final void rule__ModItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1763:1: ( ( 'mod' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1764:1: ( 'mod' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1764:1: ( 'mod' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1765:1: 'mod'
            {
             before(grammarAccess.getModItemAccess().getModKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__ModItem__Group__0__Impl3677); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1778:1: rule__ModItem__Group__1 : rule__ModItem__Group__1__Impl rule__ModItem__Group__2 ;
    public final void rule__ModItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1782:1: ( rule__ModItem__Group__1__Impl rule__ModItem__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1783:2: rule__ModItem__Group__1__Impl rule__ModItem__Group__2
            {
            pushFollow(FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__13708);
            rule__ModItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__13711);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1790:1: rule__ModItem__Group__1__Impl : ( ( rule__ModItem__IdentAssignment_1 ) ) ;
    public final void rule__ModItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1794:1: ( ( ( rule__ModItem__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1795:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1795:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1796:1: ( rule__ModItem__IdentAssignment_1 )
            {
             before(grammarAccess.getModItemAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1797:1: ( rule__ModItem__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1797:2: rule__ModItem__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl3738);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1807:1: rule__ModItem__Group__2 : rule__ModItem__Group__2__Impl ;
    public final void rule__ModItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1811:1: ( rule__ModItem__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1812:2: rule__ModItem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__23768);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1818:1: rule__ModItem__Group__2__Impl : ( ( rule__ModItem__Alternatives_2 ) ) ;
    public final void rule__ModItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1822:1: ( ( ( rule__ModItem__Alternatives_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1823:1: ( ( rule__ModItem__Alternatives_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1823:1: ( ( rule__ModItem__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1824:1: ( rule__ModItem__Alternatives_2 )
            {
             before(grammarAccess.getModItemAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1825:1: ( rule__ModItem__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1825:2: rule__ModItem__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl3795);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1841:1: rule__ModItem__Group_2_1__0 : rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 ;
    public final void rule__ModItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1845:1: ( rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1846:2: rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__03831);
            rule__ModItem__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__03834);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1853:1: rule__ModItem__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__ModItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1857:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1858:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1858:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1859:1: '{'
            {
             before(grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,52,FOLLOW_52_in_rule__ModItem__Group_2_1__0__Impl3862); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1872:1: rule__ModItem__Group_2_1__1 : rule__ModItem__Group_2_1__1__Impl rule__ModItem__Group_2_1__2 ;
    public final void rule__ModItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1876:1: ( rule__ModItem__Group_2_1__1__Impl rule__ModItem__Group_2_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1877:2: rule__ModItem__Group_2_1__1__Impl rule__ModItem__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__13893);
            rule__ModItem__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group_2_1__2_in_rule__ModItem__Group_2_1__13896);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1884:1: rule__ModItem__Group_2_1__1__Impl : ( ( rule__ModItem__ItemsAssignment_2_1_1 )* ) ;
    public final void rule__ModItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1888:1: ( ( ( rule__ModItem__ItemsAssignment_2_1_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1889:1: ( ( rule__ModItem__ItemsAssignment_2_1_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1889:1: ( ( rule__ModItem__ItemsAssignment_2_1_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1890:1: ( rule__ModItem__ItemsAssignment_2_1_1 )*
            {
             before(grammarAccess.getModItemAccess().getItemsAssignment_2_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1891:1: ( rule__ModItem__ItemsAssignment_2_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==45||LA14_0==51||LA14_0==54) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1891:2: rule__ModItem__ItemsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ModItem__ItemsAssignment_2_1_1_in_rule__ModItem__Group_2_1__1__Impl3923);
            	    rule__ModItem__ItemsAssignment_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1901:1: rule__ModItem__Group_2_1__2 : rule__ModItem__Group_2_1__2__Impl ;
    public final void rule__ModItem__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1905:1: ( rule__ModItem__Group_2_1__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1906:2: rule__ModItem__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__2__Impl_in_rule__ModItem__Group_2_1__23954);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1912:1: rule__ModItem__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__ModItem__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1916:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1917:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1917:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1918:1: '}'
            {
             before(grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,53,FOLLOW_53_in_rule__ModItem__Group_2_1__2__Impl3982); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1937:1: rule__FnItem__Group__0 : rule__FnItem__Group__0__Impl rule__FnItem__Group__1 ;
    public final void rule__FnItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1941:1: ( rule__FnItem__Group__0__Impl rule__FnItem__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1942:2: rule__FnItem__Group__0__Impl rule__FnItem__Group__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group__0__Impl_in_rule__FnItem__Group__04019);
            rule__FnItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__1_in_rule__FnItem__Group__04022);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1949:1: rule__FnItem__Group__0__Impl : ( 'fn' ) ;
    public final void rule__FnItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1953:1: ( ( 'fn' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1954:1: ( 'fn' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1954:1: ( 'fn' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1955:1: 'fn'
            {
             before(grammarAccess.getFnItemAccess().getFnKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__FnItem__Group__0__Impl4050); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1968:1: rule__FnItem__Group__1 : rule__FnItem__Group__1__Impl rule__FnItem__Group__2 ;
    public final void rule__FnItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1972:1: ( rule__FnItem__Group__1__Impl rule__FnItem__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1973:2: rule__FnItem__Group__1__Impl rule__FnItem__Group__2
            {
            pushFollow(FOLLOW_rule__FnItem__Group__1__Impl_in_rule__FnItem__Group__14081);
            rule__FnItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__2_in_rule__FnItem__Group__14084);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1980:1: rule__FnItem__Group__1__Impl : ( ( rule__FnItem__IdentAssignment_1 ) ) ;
    public final void rule__FnItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1984:1: ( ( ( rule__FnItem__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1985:1: ( ( rule__FnItem__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1985:1: ( ( rule__FnItem__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1986:1: ( rule__FnItem__IdentAssignment_1 )
            {
             before(grammarAccess.getFnItemAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1987:1: ( rule__FnItem__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1987:2: rule__FnItem__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__FnItem__IdentAssignment_1_in_rule__FnItem__Group__1__Impl4111);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1997:1: rule__FnItem__Group__2 : rule__FnItem__Group__2__Impl rule__FnItem__Group__3 ;
    public final void rule__FnItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2001:1: ( rule__FnItem__Group__2__Impl rule__FnItem__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2002:2: rule__FnItem__Group__2__Impl rule__FnItem__Group__3
            {
            pushFollow(FOLLOW_rule__FnItem__Group__2__Impl_in_rule__FnItem__Group__24141);
            rule__FnItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__3_in_rule__FnItem__Group__24144);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2009:1: rule__FnItem__Group__2__Impl : ( ( rule__FnItem__Group_2__0 )? ) ;
    public final void rule__FnItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2013:1: ( ( ( rule__FnItem__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2014:1: ( ( rule__FnItem__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2014:1: ( ( rule__FnItem__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2015:1: ( rule__FnItem__Group_2__0 )?
            {
             before(grammarAccess.getFnItemAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2016:1: ( rule__FnItem__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==55) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2016:2: rule__FnItem__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FnItem__Group_2__0_in_rule__FnItem__Group__2__Impl4171);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2026:1: rule__FnItem__Group__3 : rule__FnItem__Group__3__Impl rule__FnItem__Group__4 ;
    public final void rule__FnItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2030:1: ( rule__FnItem__Group__3__Impl rule__FnItem__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2031:2: rule__FnItem__Group__3__Impl rule__FnItem__Group__4
            {
            pushFollow(FOLLOW_rule__FnItem__Group__3__Impl_in_rule__FnItem__Group__34202);
            rule__FnItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__4_in_rule__FnItem__Group__34205);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2038:1: rule__FnItem__Group__3__Impl : ( '(' ) ;
    public final void rule__FnItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2042:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2043:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2043:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2044:1: '('
            {
             before(grammarAccess.getFnItemAccess().getLeftParenthesisKeyword_3()); 
            match(input,48,FOLLOW_48_in_rule__FnItem__Group__3__Impl4233); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2057:1: rule__FnItem__Group__4 : rule__FnItem__Group__4__Impl rule__FnItem__Group__5 ;
    public final void rule__FnItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2061:1: ( rule__FnItem__Group__4__Impl rule__FnItem__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2062:2: rule__FnItem__Group__4__Impl rule__FnItem__Group__5
            {
            pushFollow(FOLLOW_rule__FnItem__Group__4__Impl_in_rule__FnItem__Group__44264);
            rule__FnItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__5_in_rule__FnItem__Group__44267);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2069:1: rule__FnItem__Group__4__Impl : ( ( rule__FnItem__Group_4__0 )? ) ;
    public final void rule__FnItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2073:1: ( ( ( rule__FnItem__Group_4__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2074:1: ( ( rule__FnItem__Group_4__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2074:1: ( ( rule__FnItem__Group_4__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2075:1: ( rule__FnItem__Group_4__0 )?
            {
             before(grammarAccess.getFnItemAccess().getGroup_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2076:1: ( rule__FnItem__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IDENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2076:2: rule__FnItem__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FnItem__Group_4__0_in_rule__FnItem__Group__4__Impl4294);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2086:1: rule__FnItem__Group__5 : rule__FnItem__Group__5__Impl rule__FnItem__Group__6 ;
    public final void rule__FnItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2090:1: ( rule__FnItem__Group__5__Impl rule__FnItem__Group__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2091:2: rule__FnItem__Group__5__Impl rule__FnItem__Group__6
            {
            pushFollow(FOLLOW_rule__FnItem__Group__5__Impl_in_rule__FnItem__Group__54325);
            rule__FnItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__6_in_rule__FnItem__Group__54328);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2098:1: rule__FnItem__Group__5__Impl : ( ')' ) ;
    public final void rule__FnItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2102:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2103:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2103:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2104:1: ')'
            {
             before(grammarAccess.getFnItemAccess().getRightParenthesisKeyword_5()); 
            match(input,49,FOLLOW_49_in_rule__FnItem__Group__5__Impl4356); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2117:1: rule__FnItem__Group__6 : rule__FnItem__Group__6__Impl rule__FnItem__Group__7 ;
    public final void rule__FnItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2121:1: ( rule__FnItem__Group__6__Impl rule__FnItem__Group__7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2122:2: rule__FnItem__Group__6__Impl rule__FnItem__Group__7
            {
            pushFollow(FOLLOW_rule__FnItem__Group__6__Impl_in_rule__FnItem__Group__64387);
            rule__FnItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__7_in_rule__FnItem__Group__64390);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2129:1: rule__FnItem__Group__6__Impl : ( ( rule__FnItem__Group_6__0 )? ) ;
    public final void rule__FnItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2133:1: ( ( ( rule__FnItem__Group_6__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2134:1: ( ( rule__FnItem__Group_6__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2134:1: ( ( rule__FnItem__Group_6__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2135:1: ( rule__FnItem__Group_6__0 )?
            {
             before(grammarAccess.getFnItemAccess().getGroup_6()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2136:1: ( rule__FnItem__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==57) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2136:2: rule__FnItem__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__FnItem__Group_6__0_in_rule__FnItem__Group__6__Impl4417);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2146:1: rule__FnItem__Group__7 : rule__FnItem__Group__7__Impl ;
    public final void rule__FnItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2150:1: ( rule__FnItem__Group__7__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2151:2: rule__FnItem__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group__7__Impl_in_rule__FnItem__Group__74448);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2157:1: rule__FnItem__Group__7__Impl : ( ( rule__FnItem__BodyAssignment_7 ) ) ;
    public final void rule__FnItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2161:1: ( ( ( rule__FnItem__BodyAssignment_7 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2162:1: ( ( rule__FnItem__BodyAssignment_7 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2162:1: ( ( rule__FnItem__BodyAssignment_7 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2163:1: ( rule__FnItem__BodyAssignment_7 )
            {
             before(grammarAccess.getFnItemAccess().getBodyAssignment_7()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2164:1: ( rule__FnItem__BodyAssignment_7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2164:2: rule__FnItem__BodyAssignment_7
            {
            pushFollow(FOLLOW_rule__FnItem__BodyAssignment_7_in_rule__FnItem__Group__7__Impl4475);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2190:1: rule__FnItem__Group_2__0 : rule__FnItem__Group_2__0__Impl rule__FnItem__Group_2__1 ;
    public final void rule__FnItem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2194:1: ( rule__FnItem__Group_2__0__Impl rule__FnItem__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2195:2: rule__FnItem__Group_2__0__Impl rule__FnItem__Group_2__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__0__Impl_in_rule__FnItem__Group_2__04521);
            rule__FnItem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2__1_in_rule__FnItem__Group_2__04524);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2202:1: rule__FnItem__Group_2__0__Impl : ( '<' ) ;
    public final void rule__FnItem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2206:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2207:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2207:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2208:1: '<'
            {
             before(grammarAccess.getFnItemAccess().getLessThanSignKeyword_2_0()); 
            match(input,55,FOLLOW_55_in_rule__FnItem__Group_2__0__Impl4552); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2221:1: rule__FnItem__Group_2__1 : rule__FnItem__Group_2__1__Impl rule__FnItem__Group_2__2 ;
    public final void rule__FnItem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2225:1: ( rule__FnItem__Group_2__1__Impl rule__FnItem__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2226:2: rule__FnItem__Group_2__1__Impl rule__FnItem__Group_2__2
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__1__Impl_in_rule__FnItem__Group_2__14583);
            rule__FnItem__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2__2_in_rule__FnItem__Group_2__14586);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2233:1: rule__FnItem__Group_2__1__Impl : ( ( rule__FnItem__ParamsAssignment_2_1 ) ) ;
    public final void rule__FnItem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2237:1: ( ( ( rule__FnItem__ParamsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2238:1: ( ( rule__FnItem__ParamsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2238:1: ( ( rule__FnItem__ParamsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2239:1: ( rule__FnItem__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getFnItemAccess().getParamsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2240:1: ( rule__FnItem__ParamsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2240:2: rule__FnItem__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FnItem__ParamsAssignment_2_1_in_rule__FnItem__Group_2__1__Impl4613);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2250:1: rule__FnItem__Group_2__2 : rule__FnItem__Group_2__2__Impl rule__FnItem__Group_2__3 ;
    public final void rule__FnItem__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2254:1: ( rule__FnItem__Group_2__2__Impl rule__FnItem__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2255:2: rule__FnItem__Group_2__2__Impl rule__FnItem__Group_2__3
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__2__Impl_in_rule__FnItem__Group_2__24643);
            rule__FnItem__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2__3_in_rule__FnItem__Group_2__24646);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2262:1: rule__FnItem__Group_2__2__Impl : ( ( rule__FnItem__Group_2_2__0 )* ) ;
    public final void rule__FnItem__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2266:1: ( ( ( rule__FnItem__Group_2_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2267:1: ( ( rule__FnItem__Group_2_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2267:1: ( ( rule__FnItem__Group_2_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2268:1: ( rule__FnItem__Group_2_2__0 )*
            {
             before(grammarAccess.getFnItemAccess().getGroup_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2269:1: ( rule__FnItem__Group_2_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==47) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2269:2: rule__FnItem__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FnItem__Group_2_2__0_in_rule__FnItem__Group_2__2__Impl4673);
            	    rule__FnItem__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2279:1: rule__FnItem__Group_2__3 : rule__FnItem__Group_2__3__Impl ;
    public final void rule__FnItem__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2283:1: ( rule__FnItem__Group_2__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2284:2: rule__FnItem__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__3__Impl_in_rule__FnItem__Group_2__34704);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2290:1: rule__FnItem__Group_2__3__Impl : ( '>' ) ;
    public final void rule__FnItem__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2294:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2295:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2295:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2296:1: '>'
            {
             before(grammarAccess.getFnItemAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,56,FOLLOW_56_in_rule__FnItem__Group_2__3__Impl4732); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2317:1: rule__FnItem__Group_2_2__0 : rule__FnItem__Group_2_2__0__Impl rule__FnItem__Group_2_2__1 ;
    public final void rule__FnItem__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2321:1: ( rule__FnItem__Group_2_2__0__Impl rule__FnItem__Group_2_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2322:2: rule__FnItem__Group_2_2__0__Impl rule__FnItem__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2_2__0__Impl_in_rule__FnItem__Group_2_2__04771);
            rule__FnItem__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2_2__1_in_rule__FnItem__Group_2_2__04774);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2329:1: rule__FnItem__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FnItem__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2333:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2334:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2334:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2335:1: ','
            {
             before(grammarAccess.getFnItemAccess().getCommaKeyword_2_2_0()); 
            match(input,47,FOLLOW_47_in_rule__FnItem__Group_2_2__0__Impl4802); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2348:1: rule__FnItem__Group_2_2__1 : rule__FnItem__Group_2_2__1__Impl ;
    public final void rule__FnItem__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2352:1: ( rule__FnItem__Group_2_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2353:2: rule__FnItem__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2_2__1__Impl_in_rule__FnItem__Group_2_2__14833);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2359:1: rule__FnItem__Group_2_2__1__Impl : ( ( rule__FnItem__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__FnItem__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2363:1: ( ( ( rule__FnItem__ParamsAssignment_2_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2364:1: ( ( rule__FnItem__ParamsAssignment_2_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2364:1: ( ( rule__FnItem__ParamsAssignment_2_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2365:1: ( rule__FnItem__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getFnItemAccess().getParamsAssignment_2_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2366:1: ( rule__FnItem__ParamsAssignment_2_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2366:2: rule__FnItem__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__FnItem__ParamsAssignment_2_2_1_in_rule__FnItem__Group_2_2__1__Impl4860);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2380:1: rule__FnItem__Group_4__0 : rule__FnItem__Group_4__0__Impl rule__FnItem__Group_4__1 ;
    public final void rule__FnItem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2384:1: ( rule__FnItem__Group_4__0__Impl rule__FnItem__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2385:2: rule__FnItem__Group_4__0__Impl rule__FnItem__Group_4__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4__0__Impl_in_rule__FnItem__Group_4__04894);
            rule__FnItem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_4__1_in_rule__FnItem__Group_4__04897);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2392:1: rule__FnItem__Group_4__0__Impl : ( ( rule__FnItem__ArgsAssignment_4_0 ) ) ;
    public final void rule__FnItem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2396:1: ( ( ( rule__FnItem__ArgsAssignment_4_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2397:1: ( ( rule__FnItem__ArgsAssignment_4_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2397:1: ( ( rule__FnItem__ArgsAssignment_4_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2398:1: ( rule__FnItem__ArgsAssignment_4_0 )
            {
             before(grammarAccess.getFnItemAccess().getArgsAssignment_4_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2399:1: ( rule__FnItem__ArgsAssignment_4_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2399:2: rule__FnItem__ArgsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__FnItem__ArgsAssignment_4_0_in_rule__FnItem__Group_4__0__Impl4924);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2409:1: rule__FnItem__Group_4__1 : rule__FnItem__Group_4__1__Impl ;
    public final void rule__FnItem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2413:1: ( rule__FnItem__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2414:2: rule__FnItem__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4__1__Impl_in_rule__FnItem__Group_4__14954);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2420:1: rule__FnItem__Group_4__1__Impl : ( ( rule__FnItem__Group_4_1__0 )* ) ;
    public final void rule__FnItem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2424:1: ( ( ( rule__FnItem__Group_4_1__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2425:1: ( ( rule__FnItem__Group_4_1__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2425:1: ( ( rule__FnItem__Group_4_1__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2426:1: ( rule__FnItem__Group_4_1__0 )*
            {
             before(grammarAccess.getFnItemAccess().getGroup_4_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2427:1: ( rule__FnItem__Group_4_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==47) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2427:2: rule__FnItem__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FnItem__Group_4_1__0_in_rule__FnItem__Group_4__1__Impl4981);
            	    rule__FnItem__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2441:1: rule__FnItem__Group_4_1__0 : rule__FnItem__Group_4_1__0__Impl rule__FnItem__Group_4_1__1 ;
    public final void rule__FnItem__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2445:1: ( rule__FnItem__Group_4_1__0__Impl rule__FnItem__Group_4_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2446:2: rule__FnItem__Group_4_1__0__Impl rule__FnItem__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4_1__0__Impl_in_rule__FnItem__Group_4_1__05016);
            rule__FnItem__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_4_1__1_in_rule__FnItem__Group_4_1__05019);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2453:1: rule__FnItem__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__FnItem__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2457:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2458:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2458:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2459:1: ','
            {
             before(grammarAccess.getFnItemAccess().getCommaKeyword_4_1_0()); 
            match(input,47,FOLLOW_47_in_rule__FnItem__Group_4_1__0__Impl5047); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2472:1: rule__FnItem__Group_4_1__1 : rule__FnItem__Group_4_1__1__Impl ;
    public final void rule__FnItem__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2476:1: ( rule__FnItem__Group_4_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2477:2: rule__FnItem__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4_1__1__Impl_in_rule__FnItem__Group_4_1__15078);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2483:1: rule__FnItem__Group_4_1__1__Impl : ( ( rule__FnItem__ArgsAssignment_4_1_1 ) ) ;
    public final void rule__FnItem__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2487:1: ( ( ( rule__FnItem__ArgsAssignment_4_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2488:1: ( ( rule__FnItem__ArgsAssignment_4_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2488:1: ( ( rule__FnItem__ArgsAssignment_4_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2489:1: ( rule__FnItem__ArgsAssignment_4_1_1 )
            {
             before(grammarAccess.getFnItemAccess().getArgsAssignment_4_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2490:1: ( rule__FnItem__ArgsAssignment_4_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2490:2: rule__FnItem__ArgsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__FnItem__ArgsAssignment_4_1_1_in_rule__FnItem__Group_4_1__1__Impl5105);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2504:1: rule__FnItem__Group_6__0 : rule__FnItem__Group_6__0__Impl rule__FnItem__Group_6__1 ;
    public final void rule__FnItem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2508:1: ( rule__FnItem__Group_6__0__Impl rule__FnItem__Group_6__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2509:2: rule__FnItem__Group_6__0__Impl rule__FnItem__Group_6__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_6__0__Impl_in_rule__FnItem__Group_6__05139);
            rule__FnItem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_6__1_in_rule__FnItem__Group_6__05142);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2516:1: rule__FnItem__Group_6__0__Impl : ( '->' ) ;
    public final void rule__FnItem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2520:1: ( ( '->' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2521:1: ( '->' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2521:1: ( '->' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2522:1: '->'
            {
             before(grammarAccess.getFnItemAccess().getHyphenMinusGreaterThanSignKeyword_6_0()); 
            match(input,57,FOLLOW_57_in_rule__FnItem__Group_6__0__Impl5170); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2535:1: rule__FnItem__Group_6__1 : rule__FnItem__Group_6__1__Impl ;
    public final void rule__FnItem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2539:1: ( rule__FnItem__Group_6__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2540:2: rule__FnItem__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_6__1__Impl_in_rule__FnItem__Group_6__15201);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2546:1: rule__FnItem__Group_6__1__Impl : ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) ) ;
    public final void rule__FnItem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2550:1: ( ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2551:1: ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2551:1: ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2552:1: ( rule__FnItem__ReturnTypeAssignment_6_1 )
            {
             before(grammarAccess.getFnItemAccess().getReturnTypeAssignment_6_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2553:1: ( rule__FnItem__ReturnTypeAssignment_6_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2553:2: rule__FnItem__ReturnTypeAssignment_6_1
            {
            pushFollow(FOLLOW_rule__FnItem__ReturnTypeAssignment_6_1_in_rule__FnItem__Group_6__1__Impl5228);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2567:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2571:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2572:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05262);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05265);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2579:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2583:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2584:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2584:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2585:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Block__Group__0__Impl5293); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2598:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2602:1: ( rule__Block__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2603:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15324);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2609:1: rule__Block__Group__1__Impl : ( '}' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2613:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2614:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2614:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2615:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__Block__Group__1__Impl5352); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2632:1: rule__GenericParamDecl__Group__0 : rule__GenericParamDecl__Group__0__Impl rule__GenericParamDecl__Group__1 ;
    public final void rule__GenericParamDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2636:1: ( rule__GenericParamDecl__Group__0__Impl rule__GenericParamDecl__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2637:2: rule__GenericParamDecl__Group__0__Impl rule__GenericParamDecl__Group__1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group__0__Impl_in_rule__GenericParamDecl__Group__05387);
            rule__GenericParamDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group__1_in_rule__GenericParamDecl__Group__05390);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2644:1: rule__GenericParamDecl__Group__0__Impl : ( ( rule__GenericParamDecl__IdentAssignment_0 ) ) ;
    public final void rule__GenericParamDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2648:1: ( ( ( rule__GenericParamDecl__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2649:1: ( ( rule__GenericParamDecl__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2649:1: ( ( rule__GenericParamDecl__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2650:1: ( rule__GenericParamDecl__IdentAssignment_0 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2651:1: ( rule__GenericParamDecl__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2651:2: rule__GenericParamDecl__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__IdentAssignment_0_in_rule__GenericParamDecl__Group__0__Impl5417);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2661:1: rule__GenericParamDecl__Group__1 : rule__GenericParamDecl__Group__1__Impl ;
    public final void rule__GenericParamDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2665:1: ( rule__GenericParamDecl__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2666:2: rule__GenericParamDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group__1__Impl_in_rule__GenericParamDecl__Group__15447);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2672:1: rule__GenericParamDecl__Group__1__Impl : ( ( rule__GenericParamDecl__Group_1__0 )? ) ;
    public final void rule__GenericParamDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2676:1: ( ( ( rule__GenericParamDecl__Group_1__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2677:1: ( ( rule__GenericParamDecl__Group_1__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2677:1: ( ( rule__GenericParamDecl__Group_1__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2678:1: ( rule__GenericParamDecl__Group_1__0 )?
            {
             before(grammarAccess.getGenericParamDeclAccess().getGroup_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2679:1: ( rule__GenericParamDecl__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2679:2: rule__GenericParamDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__0_in_rule__GenericParamDecl__Group__1__Impl5474);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2693:1: rule__GenericParamDecl__Group_1__0 : rule__GenericParamDecl__Group_1__0__Impl rule__GenericParamDecl__Group_1__1 ;
    public final void rule__GenericParamDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2697:1: ( rule__GenericParamDecl__Group_1__0__Impl rule__GenericParamDecl__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2698:2: rule__GenericParamDecl__Group_1__0__Impl rule__GenericParamDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__0__Impl_in_rule__GenericParamDecl__Group_1__05509);
            rule__GenericParamDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__1_in_rule__GenericParamDecl__Group_1__05512);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2705:1: rule__GenericParamDecl__Group_1__0__Impl : ( ':' ) ;
    public final void rule__GenericParamDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2709:1: ( ( ':' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2710:1: ( ':' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2710:1: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2711:1: ':'
            {
             before(grammarAccess.getGenericParamDeclAccess().getColonKeyword_1_0()); 
            match(input,58,FOLLOW_58_in_rule__GenericParamDecl__Group_1__0__Impl5540); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2724:1: rule__GenericParamDecl__Group_1__1 : rule__GenericParamDecl__Group_1__1__Impl rule__GenericParamDecl__Group_1__2 ;
    public final void rule__GenericParamDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2728:1: ( rule__GenericParamDecl__Group_1__1__Impl rule__GenericParamDecl__Group_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2729:2: rule__GenericParamDecl__Group_1__1__Impl rule__GenericParamDecl__Group_1__2
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__1__Impl_in_rule__GenericParamDecl__Group_1__15571);
            rule__GenericParamDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__2_in_rule__GenericParamDecl__Group_1__15574);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2736:1: rule__GenericParamDecl__Group_1__1__Impl : ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) ) ;
    public final void rule__GenericParamDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2740:1: ( ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2741:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2741:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2742:1: ( rule__GenericParamDecl__BoundsAssignment_1_1 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2743:1: ( rule__GenericParamDecl__BoundsAssignment_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2743:2: rule__GenericParamDecl__BoundsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_1_in_rule__GenericParamDecl__Group_1__1__Impl5601);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2753:1: rule__GenericParamDecl__Group_1__2 : rule__GenericParamDecl__Group_1__2__Impl ;
    public final void rule__GenericParamDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2757:1: ( rule__GenericParamDecl__Group_1__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2758:2: rule__GenericParamDecl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__2__Impl_in_rule__GenericParamDecl__Group_1__25631);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2764:1: rule__GenericParamDecl__Group_1__2__Impl : ( ( rule__GenericParamDecl__Group_1_2__0 ) ) ;
    public final void rule__GenericParamDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2768:1: ( ( ( rule__GenericParamDecl__Group_1_2__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2769:1: ( ( rule__GenericParamDecl__Group_1_2__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2769:1: ( ( rule__GenericParamDecl__Group_1_2__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2770:1: ( rule__GenericParamDecl__Group_1_2__0 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getGroup_1_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2771:1: ( rule__GenericParamDecl__Group_1_2__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2771:2: rule__GenericParamDecl__Group_1_2__0
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__0_in_rule__GenericParamDecl__Group_1__2__Impl5658);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2787:1: rule__GenericParamDecl__Group_1_2__0 : rule__GenericParamDecl__Group_1_2__0__Impl rule__GenericParamDecl__Group_1_2__1 ;
    public final void rule__GenericParamDecl__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2791:1: ( rule__GenericParamDecl__Group_1_2__0__Impl rule__GenericParamDecl__Group_1_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2792:2: rule__GenericParamDecl__Group_1_2__0__Impl rule__GenericParamDecl__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__0__Impl_in_rule__GenericParamDecl__Group_1_2__05694);
            rule__GenericParamDecl__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__1_in_rule__GenericParamDecl__Group_1_2__05697);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2799:1: rule__GenericParamDecl__Group_1_2__0__Impl : ( '+' ) ;
    public final void rule__GenericParamDecl__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2803:1: ( ( '+' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2804:1: ( '+' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2804:1: ( '+' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2805:1: '+'
            {
             before(grammarAccess.getGenericParamDeclAccess().getPlusSignKeyword_1_2_0()); 
            match(input,59,FOLLOW_59_in_rule__GenericParamDecl__Group_1_2__0__Impl5725); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2818:1: rule__GenericParamDecl__Group_1_2__1 : rule__GenericParamDecl__Group_1_2__1__Impl ;
    public final void rule__GenericParamDecl__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2822:1: ( rule__GenericParamDecl__Group_1_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2823:2: rule__GenericParamDecl__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__1__Impl_in_rule__GenericParamDecl__Group_1_2__15756);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2829:1: rule__GenericParamDecl__Group_1_2__1__Impl : ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) ) ;
    public final void rule__GenericParamDecl__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2833:1: ( ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2834:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2834:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2835:1: ( rule__GenericParamDecl__BoundsAssignment_1_2_1 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2836:1: ( rule__GenericParamDecl__BoundsAssignment_1_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2836:2: rule__GenericParamDecl__BoundsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_2_1_in_rule__GenericParamDecl__Group_1_2__1__Impl5783);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2850:1: rule__Arg__Group__0 : rule__Arg__Group__0__Impl rule__Arg__Group__1 ;
    public final void rule__Arg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2854:1: ( rule__Arg__Group__0__Impl rule__Arg__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2855:2: rule__Arg__Group__0__Impl rule__Arg__Group__1
            {
            pushFollow(FOLLOW_rule__Arg__Group__0__Impl_in_rule__Arg__Group__05817);
            rule__Arg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__1_in_rule__Arg__Group__05820);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2862:1: rule__Arg__Group__0__Impl : ( ( rule__Arg__PatAssignment_0 ) ) ;
    public final void rule__Arg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2866:1: ( ( ( rule__Arg__PatAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2867:1: ( ( rule__Arg__PatAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2867:1: ( ( rule__Arg__PatAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2868:1: ( rule__Arg__PatAssignment_0 )
            {
             before(grammarAccess.getArgAccess().getPatAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2869:1: ( rule__Arg__PatAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2869:2: rule__Arg__PatAssignment_0
            {
            pushFollow(FOLLOW_rule__Arg__PatAssignment_0_in_rule__Arg__Group__0__Impl5847);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2879:1: rule__Arg__Group__1 : rule__Arg__Group__1__Impl rule__Arg__Group__2 ;
    public final void rule__Arg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2883:1: ( rule__Arg__Group__1__Impl rule__Arg__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2884:2: rule__Arg__Group__1__Impl rule__Arg__Group__2
            {
            pushFollow(FOLLOW_rule__Arg__Group__1__Impl_in_rule__Arg__Group__15877);
            rule__Arg__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__2_in_rule__Arg__Group__15880);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2891:1: rule__Arg__Group__1__Impl : ( ':' ) ;
    public final void rule__Arg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2895:1: ( ( ':' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2896:1: ( ':' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2896:1: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2897:1: ':'
            {
             before(grammarAccess.getArgAccess().getColonKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__Arg__Group__1__Impl5908); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2910:1: rule__Arg__Group__2 : rule__Arg__Group__2__Impl ;
    public final void rule__Arg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2914:1: ( rule__Arg__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2915:2: rule__Arg__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Arg__Group__2__Impl_in_rule__Arg__Group__25939);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2921:1: rule__Arg__Group__2__Impl : ( ( rule__Arg__TypeAssignment_2 ) ) ;
    public final void rule__Arg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2925:1: ( ( ( rule__Arg__TypeAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2926:1: ( ( rule__Arg__TypeAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2926:1: ( ( rule__Arg__TypeAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2927:1: ( rule__Arg__TypeAssignment_2 )
            {
             before(grammarAccess.getArgAccess().getTypeAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2928:1: ( rule__Arg__TypeAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2928:2: rule__Arg__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Arg__TypeAssignment_2_in_rule__Arg__Group__2__Impl5966);
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


    // $ANTLR start "rule__PrimitiveType__Group_0__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2944:1: rule__PrimitiveType__Group_0__0 : rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1 ;
    public final void rule__PrimitiveType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2948:1: ( rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2949:2: rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_0__0__Impl_in_rule__PrimitiveType__Group_0__06002);
            rule__PrimitiveType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_0__1_in_rule__PrimitiveType__Group_0__06005);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2956:1: rule__PrimitiveType__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2960:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2961:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2961:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2962:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getIntTypeAction_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2963:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2965:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2975:1: rule__PrimitiveType__Group_0__1 : rule__PrimitiveType__Group_0__1__Impl ;
    public final void rule__PrimitiveType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2979:1: ( rule__PrimitiveType__Group_0__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2980:2: rule__PrimitiveType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_0__1__Impl_in_rule__PrimitiveType__Group_0__16063);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2986:1: rule__PrimitiveType__Group_0__1__Impl : ( RULE_INT_TYPE ) ;
    public final void rule__PrimitiveType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2990:1: ( ( RULE_INT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2991:1: ( RULE_INT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2991:1: ( RULE_INT_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2992:1: RULE_INT_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getINT_TYPETerminalRuleCall_0_1()); 
            match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rule__PrimitiveType__Group_0__1__Impl6090); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3007:1: rule__PrimitiveType__Group_1__0 : rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 ;
    public final void rule__PrimitiveType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3011:1: ( rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3012:2: rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1__0__Impl_in_rule__PrimitiveType__Group_1__06123);
            rule__PrimitiveType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_1__1_in_rule__PrimitiveType__Group_1__06126);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3019:1: rule__PrimitiveType__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3023:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3024:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3024:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3025:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getFloatTypeAction_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3026:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3028:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3038:1: rule__PrimitiveType__Group_1__1 : rule__PrimitiveType__Group_1__1__Impl ;
    public final void rule__PrimitiveType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3042:1: ( rule__PrimitiveType__Group_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3043:2: rule__PrimitiveType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1__1__Impl_in_rule__PrimitiveType__Group_1__16184);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3049:1: rule__PrimitiveType__Group_1__1__Impl : ( RULE_FLOAT_TYPE ) ;
    public final void rule__PrimitiveType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3053:1: ( ( RULE_FLOAT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3054:1: ( RULE_FLOAT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3054:1: ( RULE_FLOAT_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3055:1: RULE_FLOAT_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getFLOAT_TYPETerminalRuleCall_1_1()); 
            match(input,RULE_FLOAT_TYPE,FOLLOW_RULE_FLOAT_TYPE_in_rule__PrimitiveType__Group_1__1__Impl6211); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3070:1: rule__PrimitiveType__Group_2__0 : rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1 ;
    public final void rule__PrimitiveType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3074:1: ( rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3075:2: rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_2__0__Impl_in_rule__PrimitiveType__Group_2__06244);
            rule__PrimitiveType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_2__1_in_rule__PrimitiveType__Group_2__06247);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3082:1: rule__PrimitiveType__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3086:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3087:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3087:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3088:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getBoolTypeAction_2_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3089:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3091:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3101:1: rule__PrimitiveType__Group_2__1 : rule__PrimitiveType__Group_2__1__Impl ;
    public final void rule__PrimitiveType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3105:1: ( rule__PrimitiveType__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3106:2: rule__PrimitiveType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_2__1__Impl_in_rule__PrimitiveType__Group_2__16305);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3112:1: rule__PrimitiveType__Group_2__1__Impl : ( RULE_BOOLEAN_TYPE ) ;
    public final void rule__PrimitiveType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3116:1: ( ( RULE_BOOLEAN_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3117:1: ( RULE_BOOLEAN_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3117:1: ( RULE_BOOLEAN_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3118:1: RULE_BOOLEAN_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getBOOLEAN_TYPETerminalRuleCall_2_1()); 
            match(input,RULE_BOOLEAN_TYPE,FOLLOW_RULE_BOOLEAN_TYPE_in_rule__PrimitiveType__Group_2__1__Impl6332); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3133:1: rule__PrimitiveType__Group_3__0 : rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1 ;
    public final void rule__PrimitiveType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3137:1: ( rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3138:2: rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_3__0__Impl_in_rule__PrimitiveType__Group_3__06365);
            rule__PrimitiveType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_3__1_in_rule__PrimitiveType__Group_3__06368);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3145:1: rule__PrimitiveType__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3149:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3150:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3150:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3151:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getMachineTypeAction_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3152:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3154:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3164:1: rule__PrimitiveType__Group_3__1 : rule__PrimitiveType__Group_3__1__Impl ;
    public final void rule__PrimitiveType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3168:1: ( rule__PrimitiveType__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3169:2: rule__PrimitiveType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_3__1__Impl_in_rule__PrimitiveType__Group_3__16426);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3175:1: rule__PrimitiveType__Group_3__1__Impl : ( RULE_MACHINE_TYPE ) ;
    public final void rule__PrimitiveType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3179:1: ( ( RULE_MACHINE_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3180:1: ( RULE_MACHINE_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3180:1: ( RULE_MACHINE_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3181:1: RULE_MACHINE_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getMACHINE_TYPETerminalRuleCall_3_1()); 
            match(input,RULE_MACHINE_TYPE,FOLLOW_RULE_MACHINE_TYPE_in_rule__PrimitiveType__Group_3__1__Impl6453); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3196:1: rule__PrimitiveType__Group_4__0 : rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1 ;
    public final void rule__PrimitiveType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3200:1: ( rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3201:2: rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_4__0__Impl_in_rule__PrimitiveType__Group_4__06486);
            rule__PrimitiveType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_4__1_in_rule__PrimitiveType__Group_4__06489);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3208:1: rule__PrimitiveType__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3212:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3213:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3213:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3214:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getUnitTypeAction_4_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3215:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3217:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3227:1: rule__PrimitiveType__Group_4__1 : rule__PrimitiveType__Group_4__1__Impl ;
    public final void rule__PrimitiveType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3231:1: ( rule__PrimitiveType__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3232:2: rule__PrimitiveType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_4__1__Impl_in_rule__PrimitiveType__Group_4__16547);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3238:1: rule__PrimitiveType__Group_4__1__Impl : ( RULE_UNIT_TYPE ) ;
    public final void rule__PrimitiveType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3242:1: ( ( RULE_UNIT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3243:1: ( RULE_UNIT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3243:1: ( RULE_UNIT_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3244:1: RULE_UNIT_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getUNIT_TYPETerminalRuleCall_4_1()); 
            match(input,RULE_UNIT_TYPE,FOLLOW_RULE_UNIT_TYPE_in_rule__PrimitiveType__Group_4__1__Impl6574); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3259:1: rule__TupleType__Group__0 : rule__TupleType__Group__0__Impl rule__TupleType__Group__1 ;
    public final void rule__TupleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3263:1: ( rule__TupleType__Group__0__Impl rule__TupleType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3264:2: rule__TupleType__Group__0__Impl rule__TupleType__Group__1
            {
            pushFollow(FOLLOW_rule__TupleType__Group__0__Impl_in_rule__TupleType__Group__06607);
            rule__TupleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group__1_in_rule__TupleType__Group__06610);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3271:1: rule__TupleType__Group__0__Impl : ( '(' ) ;
    public final void rule__TupleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3275:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3276:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3276:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3277:1: '('
            {
             before(grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__TupleType__Group__0__Impl6638); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3290:1: rule__TupleType__Group__1 : rule__TupleType__Group__1__Impl rule__TupleType__Group__2 ;
    public final void rule__TupleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3294:1: ( rule__TupleType__Group__1__Impl rule__TupleType__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3295:2: rule__TupleType__Group__1__Impl rule__TupleType__Group__2
            {
            pushFollow(FOLLOW_rule__TupleType__Group__1__Impl_in_rule__TupleType__Group__16669);
            rule__TupleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group__2_in_rule__TupleType__Group__16672);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3302:1: rule__TupleType__Group__1__Impl : ( ( rule__TupleType__TypesAssignment_1 ) ) ;
    public final void rule__TupleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3306:1: ( ( ( rule__TupleType__TypesAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3307:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3307:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3308:1: ( rule__TupleType__TypesAssignment_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3309:1: ( rule__TupleType__TypesAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3309:2: rule__TupleType__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__TupleType__TypesAssignment_1_in_rule__TupleType__Group__1__Impl6699);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3319:1: rule__TupleType__Group__2 : rule__TupleType__Group__2__Impl rule__TupleType__Group__3 ;
    public final void rule__TupleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3323:1: ( rule__TupleType__Group__2__Impl rule__TupleType__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3324:2: rule__TupleType__Group__2__Impl rule__TupleType__Group__3
            {
            pushFollow(FOLLOW_rule__TupleType__Group__2__Impl_in_rule__TupleType__Group__26729);
            rule__TupleType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group__3_in_rule__TupleType__Group__26732);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3331:1: rule__TupleType__Group__2__Impl : ( ( rule__TupleType__Group_2__0 )* ) ;
    public final void rule__TupleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3335:1: ( ( ( rule__TupleType__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3336:1: ( ( rule__TupleType__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3336:1: ( ( rule__TupleType__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3337:1: ( rule__TupleType__Group_2__0 )*
            {
             before(grammarAccess.getTupleTypeAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3338:1: ( rule__TupleType__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3338:2: rule__TupleType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TupleType__Group_2__0_in_rule__TupleType__Group__2__Impl6759);
            	    rule__TupleType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3348:1: rule__TupleType__Group__3 : rule__TupleType__Group__3__Impl ;
    public final void rule__TupleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3352:1: ( rule__TupleType__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3353:2: rule__TupleType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TupleType__Group__3__Impl_in_rule__TupleType__Group__36790);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3359:1: rule__TupleType__Group__3__Impl : ( ')' ) ;
    public final void rule__TupleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3363:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3364:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3364:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3365:1: ')'
            {
             before(grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_49_in_rule__TupleType__Group__3__Impl6818); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3386:1: rule__TupleType__Group_2__0 : rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 ;
    public final void rule__TupleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3390:1: ( rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3391:2: rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1
            {
            pushFollow(FOLLOW_rule__TupleType__Group_2__0__Impl_in_rule__TupleType__Group_2__06857);
            rule__TupleType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group_2__1_in_rule__TupleType__Group_2__06860);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3398:1: rule__TupleType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TupleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3402:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3403:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3403:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3404:1: ','
            {
             before(grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__TupleType__Group_2__0__Impl6888); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3417:1: rule__TupleType__Group_2__1 : rule__TupleType__Group_2__1__Impl ;
    public final void rule__TupleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3421:1: ( rule__TupleType__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3422:2: rule__TupleType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleType__Group_2__1__Impl_in_rule__TupleType__Group_2__16919);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3428:1: rule__TupleType__Group_2__1__Impl : ( ( rule__TupleType__TypesAssignment_2_1 ) ) ;
    public final void rule__TupleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3432:1: ( ( ( rule__TupleType__TypesAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3433:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3433:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3434:1: ( rule__TupleType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3435:1: ( rule__TupleType__TypesAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3435:2: rule__TupleType__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TupleType__TypesAssignment_2_1_in_rule__TupleType__Group_2__1__Impl6946);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3449:1: rule__StructType__Group__0 : rule__StructType__Group__0__Impl rule__StructType__Group__1 ;
    public final void rule__StructType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3453:1: ( rule__StructType__Group__0__Impl rule__StructType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3454:2: rule__StructType__Group__0__Impl rule__StructType__Group__1
            {
            pushFollow(FOLLOW_rule__StructType__Group__0__Impl_in_rule__StructType__Group__06980);
            rule__StructType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__1_in_rule__StructType__Group__06983);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3461:1: rule__StructType__Group__0__Impl : ( 'struct' ) ;
    public final void rule__StructType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3465:1: ( ( 'struct' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3466:1: ( 'struct' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3466:1: ( 'struct' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3467:1: 'struct'
            {
             before(grammarAccess.getStructTypeAccess().getStructKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__StructType__Group__0__Impl7011); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3480:1: rule__StructType__Group__1 : rule__StructType__Group__1__Impl rule__StructType__Group__2 ;
    public final void rule__StructType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3484:1: ( rule__StructType__Group__1__Impl rule__StructType__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3485:2: rule__StructType__Group__1__Impl rule__StructType__Group__2
            {
            pushFollow(FOLLOW_rule__StructType__Group__1__Impl_in_rule__StructType__Group__17042);
            rule__StructType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__2_in_rule__StructType__Group__17045);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3492:1: rule__StructType__Group__1__Impl : ( ( rule__StructType__IdentAssignment_1 ) ) ;
    public final void rule__StructType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3496:1: ( ( ( rule__StructType__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3497:1: ( ( rule__StructType__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3497:1: ( ( rule__StructType__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3498:1: ( rule__StructType__IdentAssignment_1 )
            {
             before(grammarAccess.getStructTypeAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3499:1: ( rule__StructType__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3499:2: rule__StructType__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__StructType__IdentAssignment_1_in_rule__StructType__Group__1__Impl7072);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3509:1: rule__StructType__Group__2 : rule__StructType__Group__2__Impl rule__StructType__Group__3 ;
    public final void rule__StructType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3513:1: ( rule__StructType__Group__2__Impl rule__StructType__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3514:2: rule__StructType__Group__2__Impl rule__StructType__Group__3
            {
            pushFollow(FOLLOW_rule__StructType__Group__2__Impl_in_rule__StructType__Group__27102);
            rule__StructType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__3_in_rule__StructType__Group__27105);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3521:1: rule__StructType__Group__2__Impl : ( ( rule__StructType__Group_2__0 )? ) ;
    public final void rule__StructType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3525:1: ( ( ( rule__StructType__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3526:1: ( ( rule__StructType__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3526:1: ( ( rule__StructType__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3527:1: ( rule__StructType__Group_2__0 )?
            {
             before(grammarAccess.getStructTypeAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3528:1: ( rule__StructType__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3528:2: rule__StructType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StructType__Group_2__0_in_rule__StructType__Group__2__Impl7132);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3538:1: rule__StructType__Group__3 : rule__StructType__Group__3__Impl rule__StructType__Group__4 ;
    public final void rule__StructType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3542:1: ( rule__StructType__Group__3__Impl rule__StructType__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3543:2: rule__StructType__Group__3__Impl rule__StructType__Group__4
            {
            pushFollow(FOLLOW_rule__StructType__Group__3__Impl_in_rule__StructType__Group__37163);
            rule__StructType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__4_in_rule__StructType__Group__37166);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3550:1: rule__StructType__Group__3__Impl : ( '{' ) ;
    public final void rule__StructType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3554:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3555:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3555:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3556:1: '{'
            {
             before(grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__StructType__Group__3__Impl7194); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3569:1: rule__StructType__Group__4 : rule__StructType__Group__4__Impl rule__StructType__Group__5 ;
    public final void rule__StructType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3573:1: ( rule__StructType__Group__4__Impl rule__StructType__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3574:2: rule__StructType__Group__4__Impl rule__StructType__Group__5
            {
            pushFollow(FOLLOW_rule__StructType__Group__4__Impl_in_rule__StructType__Group__47225);
            rule__StructType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__5_in_rule__StructType__Group__47228);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3581:1: rule__StructType__Group__4__Impl : ( ( rule__StructType__FieldsAssignment_4 ) ) ;
    public final void rule__StructType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3585:1: ( ( ( rule__StructType__FieldsAssignment_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3586:1: ( ( rule__StructType__FieldsAssignment_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3586:1: ( ( rule__StructType__FieldsAssignment_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3587:1: ( rule__StructType__FieldsAssignment_4 )
            {
             before(grammarAccess.getStructTypeAccess().getFieldsAssignment_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3588:1: ( rule__StructType__FieldsAssignment_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3588:2: rule__StructType__FieldsAssignment_4
            {
            pushFollow(FOLLOW_rule__StructType__FieldsAssignment_4_in_rule__StructType__Group__4__Impl7255);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3598:1: rule__StructType__Group__5 : rule__StructType__Group__5__Impl rule__StructType__Group__6 ;
    public final void rule__StructType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3602:1: ( rule__StructType__Group__5__Impl rule__StructType__Group__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3603:2: rule__StructType__Group__5__Impl rule__StructType__Group__6
            {
            pushFollow(FOLLOW_rule__StructType__Group__5__Impl_in_rule__StructType__Group__57285);
            rule__StructType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__6_in_rule__StructType__Group__57288);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3610:1: rule__StructType__Group__5__Impl : ( ( rule__StructType__Group_5__0 )* ) ;
    public final void rule__StructType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3614:1: ( ( ( rule__StructType__Group_5__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3615:1: ( ( rule__StructType__Group_5__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3615:1: ( ( rule__StructType__Group_5__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3616:1: ( rule__StructType__Group_5__0 )*
            {
             before(grammarAccess.getStructTypeAccess().getGroup_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3617:1: ( rule__StructType__Group_5__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3617:2: rule__StructType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__StructType__Group_5__0_in_rule__StructType__Group__5__Impl7315);
            	    rule__StructType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3627:1: rule__StructType__Group__6 : rule__StructType__Group__6__Impl ;
    public final void rule__StructType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3631:1: ( rule__StructType__Group__6__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3632:2: rule__StructType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group__6__Impl_in_rule__StructType__Group__67346);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3638:1: rule__StructType__Group__6__Impl : ( '}' ) ;
    public final void rule__StructType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3642:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3643:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3643:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3644:1: '}'
            {
             before(grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,53,FOLLOW_53_in_rule__StructType__Group__6__Impl7374); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3671:1: rule__StructType__Group_2__0 : rule__StructType__Group_2__0__Impl rule__StructType__Group_2__1 ;
    public final void rule__StructType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3675:1: ( rule__StructType__Group_2__0__Impl rule__StructType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3676:2: rule__StructType__Group_2__0__Impl rule__StructType__Group_2__1
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__0__Impl_in_rule__StructType__Group_2__07419);
            rule__StructType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2__1_in_rule__StructType__Group_2__07422);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3683:1: rule__StructType__Group_2__0__Impl : ( '<' ) ;
    public final void rule__StructType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3687:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3688:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3688:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3689:1: '<'
            {
             before(grammarAccess.getStructTypeAccess().getLessThanSignKeyword_2_0()); 
            match(input,55,FOLLOW_55_in_rule__StructType__Group_2__0__Impl7450); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3702:1: rule__StructType__Group_2__1 : rule__StructType__Group_2__1__Impl rule__StructType__Group_2__2 ;
    public final void rule__StructType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3706:1: ( rule__StructType__Group_2__1__Impl rule__StructType__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3707:2: rule__StructType__Group_2__1__Impl rule__StructType__Group_2__2
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__1__Impl_in_rule__StructType__Group_2__17481);
            rule__StructType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2__2_in_rule__StructType__Group_2__17484);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3714:1: rule__StructType__Group_2__1__Impl : ( ( rule__StructType__ParamsAssignment_2_1 ) ) ;
    public final void rule__StructType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3718:1: ( ( ( rule__StructType__ParamsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3719:1: ( ( rule__StructType__ParamsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3719:1: ( ( rule__StructType__ParamsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3720:1: ( rule__StructType__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getStructTypeAccess().getParamsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3721:1: ( rule__StructType__ParamsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3721:2: rule__StructType__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StructType__ParamsAssignment_2_1_in_rule__StructType__Group_2__1__Impl7511);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3731:1: rule__StructType__Group_2__2 : rule__StructType__Group_2__2__Impl rule__StructType__Group_2__3 ;
    public final void rule__StructType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3735:1: ( rule__StructType__Group_2__2__Impl rule__StructType__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3736:2: rule__StructType__Group_2__2__Impl rule__StructType__Group_2__3
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__2__Impl_in_rule__StructType__Group_2__27541);
            rule__StructType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2__3_in_rule__StructType__Group_2__27544);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3743:1: rule__StructType__Group_2__2__Impl : ( ( rule__StructType__Group_2_2__0 )* ) ;
    public final void rule__StructType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3747:1: ( ( ( rule__StructType__Group_2_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3748:1: ( ( rule__StructType__Group_2_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3748:1: ( ( rule__StructType__Group_2_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3749:1: ( rule__StructType__Group_2_2__0 )*
            {
             before(grammarAccess.getStructTypeAccess().getGroup_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3750:1: ( rule__StructType__Group_2_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==47) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3750:2: rule__StructType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StructType__Group_2_2__0_in_rule__StructType__Group_2__2__Impl7571);
            	    rule__StructType__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3760:1: rule__StructType__Group_2__3 : rule__StructType__Group_2__3__Impl ;
    public final void rule__StructType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3764:1: ( rule__StructType__Group_2__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3765:2: rule__StructType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__3__Impl_in_rule__StructType__Group_2__37602);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3771:1: rule__StructType__Group_2__3__Impl : ( '>' ) ;
    public final void rule__StructType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3775:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3776:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3776:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3777:1: '>'
            {
             before(grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,56,FOLLOW_56_in_rule__StructType__Group_2__3__Impl7630); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3798:1: rule__StructType__Group_2_2__0 : rule__StructType__Group_2_2__0__Impl rule__StructType__Group_2_2__1 ;
    public final void rule__StructType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3802:1: ( rule__StructType__Group_2_2__0__Impl rule__StructType__Group_2_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3803:2: rule__StructType__Group_2_2__0__Impl rule__StructType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__StructType__Group_2_2__0__Impl_in_rule__StructType__Group_2_2__07669);
            rule__StructType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2_2__1_in_rule__StructType__Group_2_2__07672);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3810:1: rule__StructType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__StructType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3814:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3815:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3815:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3816:1: ','
            {
             before(grammarAccess.getStructTypeAccess().getCommaKeyword_2_2_0()); 
            match(input,47,FOLLOW_47_in_rule__StructType__Group_2_2__0__Impl7700); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3829:1: rule__StructType__Group_2_2__1 : rule__StructType__Group_2_2__1__Impl ;
    public final void rule__StructType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3833:1: ( rule__StructType__Group_2_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3834:2: rule__StructType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group_2_2__1__Impl_in_rule__StructType__Group_2_2__17731);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3840:1: rule__StructType__Group_2_2__1__Impl : ( ( rule__StructType__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__StructType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3844:1: ( ( ( rule__StructType__ParamsAssignment_2_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3845:1: ( ( rule__StructType__ParamsAssignment_2_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3845:1: ( ( rule__StructType__ParamsAssignment_2_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3846:1: ( rule__StructType__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getStructTypeAccess().getParamsAssignment_2_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3847:1: ( rule__StructType__ParamsAssignment_2_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3847:2: rule__StructType__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__StructType__ParamsAssignment_2_2_1_in_rule__StructType__Group_2_2__1__Impl7758);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3861:1: rule__StructType__Group_5__0 : rule__StructType__Group_5__0__Impl rule__StructType__Group_5__1 ;
    public final void rule__StructType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3865:1: ( rule__StructType__Group_5__0__Impl rule__StructType__Group_5__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3866:2: rule__StructType__Group_5__0__Impl rule__StructType__Group_5__1
            {
            pushFollow(FOLLOW_rule__StructType__Group_5__0__Impl_in_rule__StructType__Group_5__07792);
            rule__StructType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_5__1_in_rule__StructType__Group_5__07795);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3873:1: rule__StructType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StructType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3877:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3878:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3878:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3879:1: ','
            {
             before(grammarAccess.getStructTypeAccess().getCommaKeyword_5_0()); 
            match(input,47,FOLLOW_47_in_rule__StructType__Group_5__0__Impl7823); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3892:1: rule__StructType__Group_5__1 : rule__StructType__Group_5__1__Impl ;
    public final void rule__StructType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3896:1: ( rule__StructType__Group_5__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3897:2: rule__StructType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group_5__1__Impl_in_rule__StructType__Group_5__17854);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3903:1: rule__StructType__Group_5__1__Impl : ( ( rule__StructType__FieldsAssignment_5_1 ) ) ;
    public final void rule__StructType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3907:1: ( ( ( rule__StructType__FieldsAssignment_5_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3908:1: ( ( rule__StructType__FieldsAssignment_5_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3908:1: ( ( rule__StructType__FieldsAssignment_5_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3909:1: ( rule__StructType__FieldsAssignment_5_1 )
            {
             before(grammarAccess.getStructTypeAccess().getFieldsAssignment_5_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3910:1: ( rule__StructType__FieldsAssignment_5_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3910:2: rule__StructType__FieldsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StructType__FieldsAssignment_5_1_in_rule__StructType__Group_5__1__Impl7881);
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


    // $ANTLR start "rule__BoxedType__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3924:1: rule__BoxedType__Group__0 : rule__BoxedType__Group__0__Impl rule__BoxedType__Group__1 ;
    public final void rule__BoxedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3928:1: ( rule__BoxedType__Group__0__Impl rule__BoxedType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3929:2: rule__BoxedType__Group__0__Impl rule__BoxedType__Group__1
            {
            pushFollow(FOLLOW_rule__BoxedType__Group__0__Impl_in_rule__BoxedType__Group__07915);
            rule__BoxedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoxedType__Group__1_in_rule__BoxedType__Group__07918);
            rule__BoxedType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedType__Group__0"


    // $ANTLR start "rule__BoxedType__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3936:1: rule__BoxedType__Group__0__Impl : ( '@' ) ;
    public final void rule__BoxedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3940:1: ( ( '@' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3941:1: ( '@' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3941:1: ( '@' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3942:1: '@'
            {
             before(grammarAccess.getBoxedTypeAccess().getCommercialAtKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__BoxedType__Group__0__Impl7946); 
             after(grammarAccess.getBoxedTypeAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedType__Group__0__Impl"


    // $ANTLR start "rule__BoxedType__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3955:1: rule__BoxedType__Group__1 : rule__BoxedType__Group__1__Impl ;
    public final void rule__BoxedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3959:1: ( rule__BoxedType__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3960:2: rule__BoxedType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoxedType__Group__1__Impl_in_rule__BoxedType__Group__17977);
            rule__BoxedType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedType__Group__1"


    // $ANTLR start "rule__BoxedType__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3966:1: rule__BoxedType__Group__1__Impl : ( ( rule__BoxedType__TypeAssignment_1 ) ) ;
    public final void rule__BoxedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3970:1: ( ( ( rule__BoxedType__TypeAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3971:1: ( ( rule__BoxedType__TypeAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3971:1: ( ( rule__BoxedType__TypeAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3972:1: ( rule__BoxedType__TypeAssignment_1 )
            {
             before(grammarAccess.getBoxedTypeAccess().getTypeAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3973:1: ( rule__BoxedType__TypeAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3973:2: rule__BoxedType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BoxedType__TypeAssignment_1_in_rule__BoxedType__Group__1__Impl8004);
            rule__BoxedType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxedTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedType__Group__1__Impl"


    // $ANTLR start "rule__OwnedType__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3987:1: rule__OwnedType__Group__0 : rule__OwnedType__Group__0__Impl rule__OwnedType__Group__1 ;
    public final void rule__OwnedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3991:1: ( rule__OwnedType__Group__0__Impl rule__OwnedType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3992:2: rule__OwnedType__Group__0__Impl rule__OwnedType__Group__1
            {
            pushFollow(FOLLOW_rule__OwnedType__Group__0__Impl_in_rule__OwnedType__Group__08038);
            rule__OwnedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OwnedType__Group__1_in_rule__OwnedType__Group__08041);
            rule__OwnedType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedType__Group__0"


    // $ANTLR start "rule__OwnedType__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3999:1: rule__OwnedType__Group__0__Impl : ( '~' ) ;
    public final void rule__OwnedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4003:1: ( ( '~' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4004:1: ( '~' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4004:1: ( '~' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4005:1: '~'
            {
             before(grammarAccess.getOwnedTypeAccess().getTildeKeyword_0()); 
            match(input,62,FOLLOW_62_in_rule__OwnedType__Group__0__Impl8069); 
             after(grammarAccess.getOwnedTypeAccess().getTildeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedType__Group__0__Impl"


    // $ANTLR start "rule__OwnedType__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4018:1: rule__OwnedType__Group__1 : rule__OwnedType__Group__1__Impl ;
    public final void rule__OwnedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4022:1: ( rule__OwnedType__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4023:2: rule__OwnedType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OwnedType__Group__1__Impl_in_rule__OwnedType__Group__18100);
            rule__OwnedType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedType__Group__1"


    // $ANTLR start "rule__OwnedType__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4029:1: rule__OwnedType__Group__1__Impl : ( ( rule__OwnedType__TypeAssignment_1 ) ) ;
    public final void rule__OwnedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4033:1: ( ( ( rule__OwnedType__TypeAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4034:1: ( ( rule__OwnedType__TypeAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4034:1: ( ( rule__OwnedType__TypeAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4035:1: ( rule__OwnedType__TypeAssignment_1 )
            {
             before(grammarAccess.getOwnedTypeAccess().getTypeAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4036:1: ( rule__OwnedType__TypeAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4036:2: rule__OwnedType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__OwnedType__TypeAssignment_1_in_rule__OwnedType__Group__1__Impl8127);
            rule__OwnedType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOwnedTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedType__Group__1__Impl"


    // $ANTLR start "rule__BorrowedType__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4050:1: rule__BorrowedType__Group__0 : rule__BorrowedType__Group__0__Impl rule__BorrowedType__Group__1 ;
    public final void rule__BorrowedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4054:1: ( rule__BorrowedType__Group__0__Impl rule__BorrowedType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4055:2: rule__BorrowedType__Group__0__Impl rule__BorrowedType__Group__1
            {
            pushFollow(FOLLOW_rule__BorrowedType__Group__0__Impl_in_rule__BorrowedType__Group__08161);
            rule__BorrowedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorrowedType__Group__1_in_rule__BorrowedType__Group__08164);
            rule__BorrowedType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorrowedType__Group__0"


    // $ANTLR start "rule__BorrowedType__Group__0__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4062:1: rule__BorrowedType__Group__0__Impl : ( '&' ) ;
    public final void rule__BorrowedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4066:1: ( ( '&' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4067:1: ( '&' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4067:1: ( '&' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4068:1: '&'
            {
             before(grammarAccess.getBorrowedTypeAccess().getAmpersandKeyword_0()); 
            match(input,63,FOLLOW_63_in_rule__BorrowedType__Group__0__Impl8192); 
             after(grammarAccess.getBorrowedTypeAccess().getAmpersandKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorrowedType__Group__0__Impl"


    // $ANTLR start "rule__BorrowedType__Group__1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4081:1: rule__BorrowedType__Group__1 : rule__BorrowedType__Group__1__Impl ;
    public final void rule__BorrowedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4085:1: ( rule__BorrowedType__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4086:2: rule__BorrowedType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BorrowedType__Group__1__Impl_in_rule__BorrowedType__Group__18223);
            rule__BorrowedType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorrowedType__Group__1"


    // $ANTLR start "rule__BorrowedType__Group__1__Impl"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4092:1: rule__BorrowedType__Group__1__Impl : ( ( rule__BorrowedType__TypeAssignment_1 ) ) ;
    public final void rule__BorrowedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4096:1: ( ( ( rule__BorrowedType__TypeAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4097:1: ( ( rule__BorrowedType__TypeAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4097:1: ( ( rule__BorrowedType__TypeAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4098:1: ( rule__BorrowedType__TypeAssignment_1 )
            {
             before(grammarAccess.getBorrowedTypeAccess().getTypeAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4099:1: ( rule__BorrowedType__TypeAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4099:2: rule__BorrowedType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BorrowedType__TypeAssignment_1_in_rule__BorrowedType__Group__1__Impl8250);
            rule__BorrowedType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBorrowedTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorrowedType__Group__1__Impl"


    // $ANTLR start "rule__StructField__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4113:1: rule__StructField__Group__0 : rule__StructField__Group__0__Impl rule__StructField__Group__1 ;
    public final void rule__StructField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4117:1: ( rule__StructField__Group__0__Impl rule__StructField__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4118:2: rule__StructField__Group__0__Impl rule__StructField__Group__1
            {
            pushFollow(FOLLOW_rule__StructField__Group__0__Impl_in_rule__StructField__Group__08284);
            rule__StructField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructField__Group__1_in_rule__StructField__Group__08287);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4125:1: rule__StructField__Group__0__Impl : ( ( rule__StructField__VisAssignment_0 )? ) ;
    public final void rule__StructField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4129:1: ( ( ( rule__StructField__VisAssignment_0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4130:1: ( ( rule__StructField__VisAssignment_0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4130:1: ( ( rule__StructField__VisAssignment_0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4131:1: ( rule__StructField__VisAssignment_0 )?
            {
             before(grammarAccess.getStructFieldAccess().getVisAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4132:1: ( rule__StructField__VisAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=43 && LA25_0<=44)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4132:2: rule__StructField__VisAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StructField__VisAssignment_0_in_rule__StructField__Group__0__Impl8314);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4142:1: rule__StructField__Group__1 : rule__StructField__Group__1__Impl rule__StructField__Group__2 ;
    public final void rule__StructField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4146:1: ( rule__StructField__Group__1__Impl rule__StructField__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4147:2: rule__StructField__Group__1__Impl rule__StructField__Group__2
            {
            pushFollow(FOLLOW_rule__StructField__Group__1__Impl_in_rule__StructField__Group__18345);
            rule__StructField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructField__Group__2_in_rule__StructField__Group__18348);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4154:1: rule__StructField__Group__1__Impl : ( ( rule__StructField__IdentAssignment_1 ) ) ;
    public final void rule__StructField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4158:1: ( ( ( rule__StructField__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4159:1: ( ( rule__StructField__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4159:1: ( ( rule__StructField__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4160:1: ( rule__StructField__IdentAssignment_1 )
            {
             before(grammarAccess.getStructFieldAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4161:1: ( rule__StructField__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4161:2: rule__StructField__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__StructField__IdentAssignment_1_in_rule__StructField__Group__1__Impl8375);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4171:1: rule__StructField__Group__2 : rule__StructField__Group__2__Impl rule__StructField__Group__3 ;
    public final void rule__StructField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4175:1: ( rule__StructField__Group__2__Impl rule__StructField__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4176:2: rule__StructField__Group__2__Impl rule__StructField__Group__3
            {
            pushFollow(FOLLOW_rule__StructField__Group__2__Impl_in_rule__StructField__Group__28405);
            rule__StructField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructField__Group__3_in_rule__StructField__Group__28408);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4183:1: rule__StructField__Group__2__Impl : ( ':' ) ;
    public final void rule__StructField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4187:1: ( ( ':' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4188:1: ( ':' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4188:1: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4189:1: ':'
            {
             before(grammarAccess.getStructFieldAccess().getColonKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__StructField__Group__2__Impl8436); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4202:1: rule__StructField__Group__3 : rule__StructField__Group__3__Impl ;
    public final void rule__StructField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4206:1: ( rule__StructField__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4207:2: rule__StructField__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StructField__Group__3__Impl_in_rule__StructField__Group__38467);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4213:1: rule__StructField__Group__3__Impl : ( ( rule__StructField__TypeAssignment_3 ) ) ;
    public final void rule__StructField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4217:1: ( ( ( rule__StructField__TypeAssignment_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4218:1: ( ( rule__StructField__TypeAssignment_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4218:1: ( ( rule__StructField__TypeAssignment_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4219:1: ( rule__StructField__TypeAssignment_3 )
            {
             before(grammarAccess.getStructFieldAccess().getTypeAssignment_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4220:1: ( rule__StructField__TypeAssignment_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4220:2: rule__StructField__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__StructField__TypeAssignment_3_in_rule__StructField__Group__3__Impl8494);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4238:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4242:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4243:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__08532);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__08535);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4250:1: rule__EnumType__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4254:1: ( ( 'enum' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4255:1: ( 'enum' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4255:1: ( 'enum' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4256:1: 'enum'
            {
             before(grammarAccess.getEnumTypeAccess().getEnumKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__EnumType__Group__0__Impl8563); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4269:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4273:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4274:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__18594);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__18597);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4281:1: rule__EnumType__Group__1__Impl : ( ( rule__EnumType__IdentAssignment_1 ) ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4285:1: ( ( ( rule__EnumType__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4286:1: ( ( rule__EnumType__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4286:1: ( ( rule__EnumType__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4287:1: ( rule__EnumType__IdentAssignment_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4288:1: ( rule__EnumType__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4288:2: rule__EnumType__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumType__IdentAssignment_1_in_rule__EnumType__Group__1__Impl8624);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4298:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4302:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4303:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__28654);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__28657);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4310:1: rule__EnumType__Group__2__Impl : ( ( rule__EnumType__Group_2__0 )? ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4314:1: ( ( ( rule__EnumType__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4315:1: ( ( rule__EnumType__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4315:1: ( ( rule__EnumType__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4316:1: ( rule__EnumType__Group_2__0 )?
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4317:1: ( rule__EnumType__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4317:2: rule__EnumType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumType__Group_2__0_in_rule__EnumType__Group__2__Impl8684);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4327:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4331:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4332:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__38715);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__38718);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4339:1: rule__EnumType__Group__3__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4343:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4344:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4344:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4345:1: '{'
            {
             before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__EnumType__Group__3__Impl8746); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4358:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4362:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4363:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__48777);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__48780);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4370:1: rule__EnumType__Group__4__Impl : ( ( rule__EnumType__VariantsAssignment_4 ) ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4374:1: ( ( ( rule__EnumType__VariantsAssignment_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4375:1: ( ( rule__EnumType__VariantsAssignment_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4375:1: ( ( rule__EnumType__VariantsAssignment_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4376:1: ( rule__EnumType__VariantsAssignment_4 )
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsAssignment_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4377:1: ( rule__EnumType__VariantsAssignment_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4377:2: rule__EnumType__VariantsAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumType__VariantsAssignment_4_in_rule__EnumType__Group__4__Impl8807);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4387:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl rule__EnumType__Group__6 ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4391:1: ( rule__EnumType__Group__5__Impl rule__EnumType__Group__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4392:2: rule__EnumType__Group__5__Impl rule__EnumType__Group__6
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__58837);
            rule__EnumType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__58840);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4399:1: rule__EnumType__Group__5__Impl : ( ( rule__EnumType__Group_5__0 )* ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4403:1: ( ( ( rule__EnumType__Group_5__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4404:1: ( ( rule__EnumType__Group_5__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4404:1: ( ( rule__EnumType__Group_5__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4405:1: ( rule__EnumType__Group_5__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4406:1: ( rule__EnumType__Group_5__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==47) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4406:2: rule__EnumType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_5__0_in_rule__EnumType__Group__5__Impl8867);
            	    rule__EnumType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4416:1: rule__EnumType__Group__6 : rule__EnumType__Group__6__Impl ;
    public final void rule__EnumType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4420:1: ( rule__EnumType__Group__6__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4421:2: rule__EnumType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__68898);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4427:1: rule__EnumType__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4431:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4432:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4432:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4433:1: '}'
            {
             before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,53,FOLLOW_53_in_rule__EnumType__Group__6__Impl8926); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4460:1: rule__EnumType__Group_2__0 : rule__EnumType__Group_2__0__Impl rule__EnumType__Group_2__1 ;
    public final void rule__EnumType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4464:1: ( rule__EnumType__Group_2__0__Impl rule__EnumType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4465:2: rule__EnumType__Group_2__0__Impl rule__EnumType__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__0__Impl_in_rule__EnumType__Group_2__08971);
            rule__EnumType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2__1_in_rule__EnumType__Group_2__08974);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4472:1: rule__EnumType__Group_2__0__Impl : ( '<' ) ;
    public final void rule__EnumType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4476:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4477:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4477:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4478:1: '<'
            {
             before(grammarAccess.getEnumTypeAccess().getLessThanSignKeyword_2_0()); 
            match(input,55,FOLLOW_55_in_rule__EnumType__Group_2__0__Impl9002); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4491:1: rule__EnumType__Group_2__1 : rule__EnumType__Group_2__1__Impl rule__EnumType__Group_2__2 ;
    public final void rule__EnumType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4495:1: ( rule__EnumType__Group_2__1__Impl rule__EnumType__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4496:2: rule__EnumType__Group_2__1__Impl rule__EnumType__Group_2__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__1__Impl_in_rule__EnumType__Group_2__19033);
            rule__EnumType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2__2_in_rule__EnumType__Group_2__19036);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4503:1: rule__EnumType__Group_2__1__Impl : ( ( rule__EnumType__ParamsAssignment_2_1 ) ) ;
    public final void rule__EnumType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4507:1: ( ( ( rule__EnumType__ParamsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4508:1: ( ( rule__EnumType__ParamsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4508:1: ( ( rule__EnumType__ParamsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4509:1: ( rule__EnumType__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4510:1: ( rule__EnumType__ParamsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4510:2: rule__EnumType__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumType__ParamsAssignment_2_1_in_rule__EnumType__Group_2__1__Impl9063);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4520:1: rule__EnumType__Group_2__2 : rule__EnumType__Group_2__2__Impl rule__EnumType__Group_2__3 ;
    public final void rule__EnumType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4524:1: ( rule__EnumType__Group_2__2__Impl rule__EnumType__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4525:2: rule__EnumType__Group_2__2__Impl rule__EnumType__Group_2__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__2__Impl_in_rule__EnumType__Group_2__29093);
            rule__EnumType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2__3_in_rule__EnumType__Group_2__29096);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4532:1: rule__EnumType__Group_2__2__Impl : ( ( rule__EnumType__Group_2_2__0 )* ) ;
    public final void rule__EnumType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4536:1: ( ( ( rule__EnumType__Group_2_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4537:1: ( ( rule__EnumType__Group_2_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4537:1: ( ( rule__EnumType__Group_2_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4538:1: ( rule__EnumType__Group_2_2__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4539:1: ( rule__EnumType__Group_2_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==47) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4539:2: rule__EnumType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_2_2__0_in_rule__EnumType__Group_2__2__Impl9123);
            	    rule__EnumType__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4549:1: rule__EnumType__Group_2__3 : rule__EnumType__Group_2__3__Impl ;
    public final void rule__EnumType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4553:1: ( rule__EnumType__Group_2__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4554:2: rule__EnumType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__3__Impl_in_rule__EnumType__Group_2__39154);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4560:1: rule__EnumType__Group_2__3__Impl : ( '>' ) ;
    public final void rule__EnumType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4564:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4565:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4565:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4566:1: '>'
            {
             before(grammarAccess.getEnumTypeAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,56,FOLLOW_56_in_rule__EnumType__Group_2__3__Impl9182); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4587:1: rule__EnumType__Group_2_2__0 : rule__EnumType__Group_2_2__0__Impl rule__EnumType__Group_2_2__1 ;
    public final void rule__EnumType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4591:1: ( rule__EnumType__Group_2_2__0__Impl rule__EnumType__Group_2_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4592:2: rule__EnumType__Group_2_2__0__Impl rule__EnumType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2_2__0__Impl_in_rule__EnumType__Group_2_2__09221);
            rule__EnumType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2_2__1_in_rule__EnumType__Group_2_2__09224);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4599:1: rule__EnumType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4603:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4604:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4604:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4605:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_2_2_0()); 
            match(input,47,FOLLOW_47_in_rule__EnumType__Group_2_2__0__Impl9252); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4618:1: rule__EnumType__Group_2_2__1 : rule__EnumType__Group_2_2__1__Impl ;
    public final void rule__EnumType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4622:1: ( rule__EnumType__Group_2_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4623:2: rule__EnumType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2_2__1__Impl_in_rule__EnumType__Group_2_2__19283);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4629:1: rule__EnumType__Group_2_2__1__Impl : ( ( rule__EnumType__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__EnumType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4633:1: ( ( ( rule__EnumType__ParamsAssignment_2_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4634:1: ( ( rule__EnumType__ParamsAssignment_2_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4634:1: ( ( rule__EnumType__ParamsAssignment_2_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4635:1: ( rule__EnumType__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4636:1: ( rule__EnumType__ParamsAssignment_2_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4636:2: rule__EnumType__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__EnumType__ParamsAssignment_2_2_1_in_rule__EnumType__Group_2_2__1__Impl9310);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4650:1: rule__EnumType__Group_5__0 : rule__EnumType__Group_5__0__Impl rule__EnumType__Group_5__1 ;
    public final void rule__EnumType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4654:1: ( rule__EnumType__Group_5__0__Impl rule__EnumType__Group_5__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4655:2: rule__EnumType__Group_5__0__Impl rule__EnumType__Group_5__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_5__0__Impl_in_rule__EnumType__Group_5__09344);
            rule__EnumType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_5__1_in_rule__EnumType__Group_5__09347);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4662:1: rule__EnumType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4666:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4667:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4667:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4668:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_5_0()); 
            match(input,47,FOLLOW_47_in_rule__EnumType__Group_5__0__Impl9375); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4681:1: rule__EnumType__Group_5__1 : rule__EnumType__Group_5__1__Impl ;
    public final void rule__EnumType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4685:1: ( rule__EnumType__Group_5__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4686:2: rule__EnumType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_5__1__Impl_in_rule__EnumType__Group_5__19406);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4692:1: rule__EnumType__Group_5__1__Impl : ( ( rule__EnumType__VariantsAssignment_5_1 ) ) ;
    public final void rule__EnumType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4696:1: ( ( ( rule__EnumType__VariantsAssignment_5_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4697:1: ( ( rule__EnumType__VariantsAssignment_5_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4697:1: ( ( rule__EnumType__VariantsAssignment_5_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4698:1: ( rule__EnumType__VariantsAssignment_5_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsAssignment_5_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4699:1: ( rule__EnumType__VariantsAssignment_5_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4699:2: rule__EnumType__VariantsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EnumType__VariantsAssignment_5_1_in_rule__EnumType__Group_5__1__Impl9433);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4713:1: rule__StructVariant__Group__0 : rule__StructVariant__Group__0__Impl rule__StructVariant__Group__1 ;
    public final void rule__StructVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4717:1: ( rule__StructVariant__Group__0__Impl rule__StructVariant__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4718:2: rule__StructVariant__Group__0__Impl rule__StructVariant__Group__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__0__Impl_in_rule__StructVariant__Group__09467);
            rule__StructVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__1_in_rule__StructVariant__Group__09470);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4725:1: rule__StructVariant__Group__0__Impl : ( ( rule__StructVariant__IdentAssignment_0 ) ) ;
    public final void rule__StructVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4729:1: ( ( ( rule__StructVariant__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4730:1: ( ( rule__StructVariant__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4730:1: ( ( rule__StructVariant__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4731:1: ( rule__StructVariant__IdentAssignment_0 )
            {
             before(grammarAccess.getStructVariantAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4732:1: ( rule__StructVariant__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4732:2: rule__StructVariant__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__StructVariant__IdentAssignment_0_in_rule__StructVariant__Group__0__Impl9497);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4742:1: rule__StructVariant__Group__1 : rule__StructVariant__Group__1__Impl rule__StructVariant__Group__2 ;
    public final void rule__StructVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4746:1: ( rule__StructVariant__Group__1__Impl rule__StructVariant__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4747:2: rule__StructVariant__Group__1__Impl rule__StructVariant__Group__2
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__1__Impl_in_rule__StructVariant__Group__19527);
            rule__StructVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__2_in_rule__StructVariant__Group__19530);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4754:1: rule__StructVariant__Group__1__Impl : ( ( rule__StructVariant__Group_1__0 )? ) ;
    public final void rule__StructVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4758:1: ( ( ( rule__StructVariant__Group_1__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4759:1: ( ( rule__StructVariant__Group_1__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4759:1: ( ( rule__StructVariant__Group_1__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4760:1: ( rule__StructVariant__Group_1__0 )?
            {
             before(grammarAccess.getStructVariantAccess().getGroup_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4761:1: ( rule__StructVariant__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4761:2: rule__StructVariant__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StructVariant__Group_1__0_in_rule__StructVariant__Group__1__Impl9557);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4771:1: rule__StructVariant__Group__2 : rule__StructVariant__Group__2__Impl rule__StructVariant__Group__3 ;
    public final void rule__StructVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4775:1: ( rule__StructVariant__Group__2__Impl rule__StructVariant__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4776:2: rule__StructVariant__Group__2__Impl rule__StructVariant__Group__3
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__2__Impl_in_rule__StructVariant__Group__29588);
            rule__StructVariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__3_in_rule__StructVariant__Group__29591);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4783:1: rule__StructVariant__Group__2__Impl : ( '{' ) ;
    public final void rule__StructVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4787:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4788:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4788:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4789:1: '{'
            {
             before(grammarAccess.getStructVariantAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,52,FOLLOW_52_in_rule__StructVariant__Group__2__Impl9619); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4802:1: rule__StructVariant__Group__3 : rule__StructVariant__Group__3__Impl rule__StructVariant__Group__4 ;
    public final void rule__StructVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4806:1: ( rule__StructVariant__Group__3__Impl rule__StructVariant__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4807:2: rule__StructVariant__Group__3__Impl rule__StructVariant__Group__4
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__3__Impl_in_rule__StructVariant__Group__39650);
            rule__StructVariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__4_in_rule__StructVariant__Group__39653);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4814:1: rule__StructVariant__Group__3__Impl : ( ( rule__StructVariant__FieldsAssignment_3 ) ) ;
    public final void rule__StructVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4818:1: ( ( ( rule__StructVariant__FieldsAssignment_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4819:1: ( ( rule__StructVariant__FieldsAssignment_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4819:1: ( ( rule__StructVariant__FieldsAssignment_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4820:1: ( rule__StructVariant__FieldsAssignment_3 )
            {
             before(grammarAccess.getStructVariantAccess().getFieldsAssignment_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4821:1: ( rule__StructVariant__FieldsAssignment_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4821:2: rule__StructVariant__FieldsAssignment_3
            {
            pushFollow(FOLLOW_rule__StructVariant__FieldsAssignment_3_in_rule__StructVariant__Group__3__Impl9680);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4831:1: rule__StructVariant__Group__4 : rule__StructVariant__Group__4__Impl rule__StructVariant__Group__5 ;
    public final void rule__StructVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4835:1: ( rule__StructVariant__Group__4__Impl rule__StructVariant__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4836:2: rule__StructVariant__Group__4__Impl rule__StructVariant__Group__5
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__4__Impl_in_rule__StructVariant__Group__49710);
            rule__StructVariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__5_in_rule__StructVariant__Group__49713);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4843:1: rule__StructVariant__Group__4__Impl : ( ( rule__StructVariant__Group_4__0 )* ) ;
    public final void rule__StructVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4847:1: ( ( ( rule__StructVariant__Group_4__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4848:1: ( ( rule__StructVariant__Group_4__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4848:1: ( ( rule__StructVariant__Group_4__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4849:1: ( rule__StructVariant__Group_4__0 )*
            {
             before(grammarAccess.getStructVariantAccess().getGroup_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4850:1: ( rule__StructVariant__Group_4__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4850:2: rule__StructVariant__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__StructVariant__Group_4__0_in_rule__StructVariant__Group__4__Impl9740);
            	    rule__StructVariant__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4860:1: rule__StructVariant__Group__5 : rule__StructVariant__Group__5__Impl ;
    public final void rule__StructVariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4864:1: ( rule__StructVariant__Group__5__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4865:2: rule__StructVariant__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__5__Impl_in_rule__StructVariant__Group__59771);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4871:1: rule__StructVariant__Group__5__Impl : ( '}' ) ;
    public final void rule__StructVariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4875:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4876:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4876:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4877:1: '}'
            {
             before(grammarAccess.getStructVariantAccess().getRightCurlyBracketKeyword_5()); 
            match(input,53,FOLLOW_53_in_rule__StructVariant__Group__5__Impl9799); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4902:1: rule__StructVariant__Group_1__0 : rule__StructVariant__Group_1__0__Impl rule__StructVariant__Group_1__1 ;
    public final void rule__StructVariant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4906:1: ( rule__StructVariant__Group_1__0__Impl rule__StructVariant__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4907:2: rule__StructVariant__Group_1__0__Impl rule__StructVariant__Group_1__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__0__Impl_in_rule__StructVariant__Group_1__09842);
            rule__StructVariant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1__1_in_rule__StructVariant__Group_1__09845);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4914:1: rule__StructVariant__Group_1__0__Impl : ( '<' ) ;
    public final void rule__StructVariant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4918:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4919:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4919:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4920:1: '<'
            {
             before(grammarAccess.getStructVariantAccess().getLessThanSignKeyword_1_0()); 
            match(input,55,FOLLOW_55_in_rule__StructVariant__Group_1__0__Impl9873); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4933:1: rule__StructVariant__Group_1__1 : rule__StructVariant__Group_1__1__Impl rule__StructVariant__Group_1__2 ;
    public final void rule__StructVariant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4937:1: ( rule__StructVariant__Group_1__1__Impl rule__StructVariant__Group_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4938:2: rule__StructVariant__Group_1__1__Impl rule__StructVariant__Group_1__2
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__1__Impl_in_rule__StructVariant__Group_1__19904);
            rule__StructVariant__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1__2_in_rule__StructVariant__Group_1__19907);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4945:1: rule__StructVariant__Group_1__1__Impl : ( ( rule__StructVariant__ParamsAssignment_1_1 ) ) ;
    public final void rule__StructVariant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4949:1: ( ( ( rule__StructVariant__ParamsAssignment_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4950:1: ( ( rule__StructVariant__ParamsAssignment_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4950:1: ( ( rule__StructVariant__ParamsAssignment_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4951:1: ( rule__StructVariant__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getStructVariantAccess().getParamsAssignment_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4952:1: ( rule__StructVariant__ParamsAssignment_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4952:2: rule__StructVariant__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StructVariant__ParamsAssignment_1_1_in_rule__StructVariant__Group_1__1__Impl9934);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4962:1: rule__StructVariant__Group_1__2 : rule__StructVariant__Group_1__2__Impl rule__StructVariant__Group_1__3 ;
    public final void rule__StructVariant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4966:1: ( rule__StructVariant__Group_1__2__Impl rule__StructVariant__Group_1__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4967:2: rule__StructVariant__Group_1__2__Impl rule__StructVariant__Group_1__3
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__2__Impl_in_rule__StructVariant__Group_1__29964);
            rule__StructVariant__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1__3_in_rule__StructVariant__Group_1__29967);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4974:1: rule__StructVariant__Group_1__2__Impl : ( ( rule__StructVariant__Group_1_2__0 )* ) ;
    public final void rule__StructVariant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4978:1: ( ( ( rule__StructVariant__Group_1_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4979:1: ( ( rule__StructVariant__Group_1_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4979:1: ( ( rule__StructVariant__Group_1_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4980:1: ( rule__StructVariant__Group_1_2__0 )*
            {
             before(grammarAccess.getStructVariantAccess().getGroup_1_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4981:1: ( rule__StructVariant__Group_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4981:2: rule__StructVariant__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StructVariant__Group_1_2__0_in_rule__StructVariant__Group_1__2__Impl9994);
            	    rule__StructVariant__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4991:1: rule__StructVariant__Group_1__3 : rule__StructVariant__Group_1__3__Impl ;
    public final void rule__StructVariant__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4995:1: ( rule__StructVariant__Group_1__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4996:2: rule__StructVariant__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__3__Impl_in_rule__StructVariant__Group_1__310025);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5002:1: rule__StructVariant__Group_1__3__Impl : ( '>' ) ;
    public final void rule__StructVariant__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5006:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5007:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5007:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5008:1: '>'
            {
             before(grammarAccess.getStructVariantAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,56,FOLLOW_56_in_rule__StructVariant__Group_1__3__Impl10053); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5029:1: rule__StructVariant__Group_1_2__0 : rule__StructVariant__Group_1_2__0__Impl rule__StructVariant__Group_1_2__1 ;
    public final void rule__StructVariant__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5033:1: ( rule__StructVariant__Group_1_2__0__Impl rule__StructVariant__Group_1_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5034:2: rule__StructVariant__Group_1_2__0__Impl rule__StructVariant__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1_2__0__Impl_in_rule__StructVariant__Group_1_2__010092);
            rule__StructVariant__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1_2__1_in_rule__StructVariant__Group_1_2__010095);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5041:1: rule__StructVariant__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__StructVariant__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5045:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5046:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5046:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5047:1: ','
            {
             before(grammarAccess.getStructVariantAccess().getCommaKeyword_1_2_0()); 
            match(input,47,FOLLOW_47_in_rule__StructVariant__Group_1_2__0__Impl10123); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5060:1: rule__StructVariant__Group_1_2__1 : rule__StructVariant__Group_1_2__1__Impl ;
    public final void rule__StructVariant__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5064:1: ( rule__StructVariant__Group_1_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5065:2: rule__StructVariant__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1_2__1__Impl_in_rule__StructVariant__Group_1_2__110154);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5071:1: rule__StructVariant__Group_1_2__1__Impl : ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__StructVariant__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5075:1: ( ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5076:1: ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5076:1: ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5077:1: ( rule__StructVariant__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getStructVariantAccess().getParamsAssignment_1_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5078:1: ( rule__StructVariant__ParamsAssignment_1_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5078:2: rule__StructVariant__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__StructVariant__ParamsAssignment_1_2_1_in_rule__StructVariant__Group_1_2__1__Impl10181);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5092:1: rule__StructVariant__Group_4__0 : rule__StructVariant__Group_4__0__Impl rule__StructVariant__Group_4__1 ;
    public final void rule__StructVariant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5096:1: ( rule__StructVariant__Group_4__0__Impl rule__StructVariant__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5097:2: rule__StructVariant__Group_4__0__Impl rule__StructVariant__Group_4__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_4__0__Impl_in_rule__StructVariant__Group_4__010215);
            rule__StructVariant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_4__1_in_rule__StructVariant__Group_4__010218);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5104:1: rule__StructVariant__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StructVariant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5108:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5109:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5109:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5110:1: ','
            {
             before(grammarAccess.getStructVariantAccess().getCommaKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__StructVariant__Group_4__0__Impl10246); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5123:1: rule__StructVariant__Group_4__1 : rule__StructVariant__Group_4__1__Impl ;
    public final void rule__StructVariant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5127:1: ( rule__StructVariant__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5128:2: rule__StructVariant__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_4__1__Impl_in_rule__StructVariant__Group_4__110277);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5134:1: rule__StructVariant__Group_4__1__Impl : ( ( rule__StructVariant__FieldsAssignment_4_1 ) ) ;
    public final void rule__StructVariant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5138:1: ( ( ( rule__StructVariant__FieldsAssignment_4_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5139:1: ( ( rule__StructVariant__FieldsAssignment_4_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5139:1: ( ( rule__StructVariant__FieldsAssignment_4_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5140:1: ( rule__StructVariant__FieldsAssignment_4_1 )
            {
             before(grammarAccess.getStructVariantAccess().getFieldsAssignment_4_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5141:1: ( rule__StructVariant__FieldsAssignment_4_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5141:2: rule__StructVariant__FieldsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StructVariant__FieldsAssignment_4_1_in_rule__StructVariant__Group_4__1__Impl10304);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5155:1: rule__TupleVariant__Group__0 : rule__TupleVariant__Group__0__Impl rule__TupleVariant__Group__1 ;
    public final void rule__TupleVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5159:1: ( rule__TupleVariant__Group__0__Impl rule__TupleVariant__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5160:2: rule__TupleVariant__Group__0__Impl rule__TupleVariant__Group__1
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__0__Impl_in_rule__TupleVariant__Group__010338);
            rule__TupleVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__1_in_rule__TupleVariant__Group__010341);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5167:1: rule__TupleVariant__Group__0__Impl : ( ( rule__TupleVariant__IdentAssignment_0 ) ) ;
    public final void rule__TupleVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5171:1: ( ( ( rule__TupleVariant__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5172:1: ( ( rule__TupleVariant__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5172:1: ( ( rule__TupleVariant__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5173:1: ( rule__TupleVariant__IdentAssignment_0 )
            {
             before(grammarAccess.getTupleVariantAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5174:1: ( rule__TupleVariant__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5174:2: rule__TupleVariant__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__TupleVariant__IdentAssignment_0_in_rule__TupleVariant__Group__0__Impl10368);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5184:1: rule__TupleVariant__Group__1 : rule__TupleVariant__Group__1__Impl rule__TupleVariant__Group__2 ;
    public final void rule__TupleVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5188:1: ( rule__TupleVariant__Group__1__Impl rule__TupleVariant__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5189:2: rule__TupleVariant__Group__1__Impl rule__TupleVariant__Group__2
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__1__Impl_in_rule__TupleVariant__Group__110398);
            rule__TupleVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__2_in_rule__TupleVariant__Group__110401);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5196:1: rule__TupleVariant__Group__1__Impl : ( '(' ) ;
    public final void rule__TupleVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5200:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5201:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5201:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5202:1: '('
            {
             before(grammarAccess.getTupleVariantAccess().getLeftParenthesisKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__TupleVariant__Group__1__Impl10429); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5215:1: rule__TupleVariant__Group__2 : rule__TupleVariant__Group__2__Impl rule__TupleVariant__Group__3 ;
    public final void rule__TupleVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5219:1: ( rule__TupleVariant__Group__2__Impl rule__TupleVariant__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5220:2: rule__TupleVariant__Group__2__Impl rule__TupleVariant__Group__3
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__2__Impl_in_rule__TupleVariant__Group__210460);
            rule__TupleVariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__3_in_rule__TupleVariant__Group__210463);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5227:1: rule__TupleVariant__Group__2__Impl : ( ( rule__TupleVariant__TypesAssignment_2 ) ) ;
    public final void rule__TupleVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5231:1: ( ( ( rule__TupleVariant__TypesAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5232:1: ( ( rule__TupleVariant__TypesAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5232:1: ( ( rule__TupleVariant__TypesAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5233:1: ( rule__TupleVariant__TypesAssignment_2 )
            {
             before(grammarAccess.getTupleVariantAccess().getTypesAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5234:1: ( rule__TupleVariant__TypesAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5234:2: rule__TupleVariant__TypesAssignment_2
            {
            pushFollow(FOLLOW_rule__TupleVariant__TypesAssignment_2_in_rule__TupleVariant__Group__2__Impl10490);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5244:1: rule__TupleVariant__Group__3 : rule__TupleVariant__Group__3__Impl rule__TupleVariant__Group__4 ;
    public final void rule__TupleVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5248:1: ( rule__TupleVariant__Group__3__Impl rule__TupleVariant__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5249:2: rule__TupleVariant__Group__3__Impl rule__TupleVariant__Group__4
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__3__Impl_in_rule__TupleVariant__Group__310520);
            rule__TupleVariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__4_in_rule__TupleVariant__Group__310523);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5256:1: rule__TupleVariant__Group__3__Impl : ( ( rule__TupleVariant__Group_3__0 )* ) ;
    public final void rule__TupleVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5260:1: ( ( ( rule__TupleVariant__Group_3__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5261:1: ( ( rule__TupleVariant__Group_3__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5261:1: ( ( rule__TupleVariant__Group_3__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5262:1: ( rule__TupleVariant__Group_3__0 )*
            {
             before(grammarAccess.getTupleVariantAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5263:1: ( rule__TupleVariant__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5263:2: rule__TupleVariant__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TupleVariant__Group_3__0_in_rule__TupleVariant__Group__3__Impl10550);
            	    rule__TupleVariant__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5273:1: rule__TupleVariant__Group__4 : rule__TupleVariant__Group__4__Impl ;
    public final void rule__TupleVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5277:1: ( rule__TupleVariant__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5278:2: rule__TupleVariant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__4__Impl_in_rule__TupleVariant__Group__410581);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5284:1: rule__TupleVariant__Group__4__Impl : ( ')' ) ;
    public final void rule__TupleVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5288:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5289:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5289:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5290:1: ')'
            {
             before(grammarAccess.getTupleVariantAccess().getRightParenthesisKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__TupleVariant__Group__4__Impl10609); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5313:1: rule__TupleVariant__Group_3__0 : rule__TupleVariant__Group_3__0__Impl rule__TupleVariant__Group_3__1 ;
    public final void rule__TupleVariant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5317:1: ( rule__TupleVariant__Group_3__0__Impl rule__TupleVariant__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5318:2: rule__TupleVariant__Group_3__0__Impl rule__TupleVariant__Group_3__1
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group_3__0__Impl_in_rule__TupleVariant__Group_3__010650);
            rule__TupleVariant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group_3__1_in_rule__TupleVariant__Group_3__010653);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5325:1: rule__TupleVariant__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TupleVariant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5329:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5330:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5330:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5331:1: ','
            {
             before(grammarAccess.getTupleVariantAccess().getCommaKeyword_3_0()); 
            match(input,47,FOLLOW_47_in_rule__TupleVariant__Group_3__0__Impl10681); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5344:1: rule__TupleVariant__Group_3__1 : rule__TupleVariant__Group_3__1__Impl ;
    public final void rule__TupleVariant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5348:1: ( rule__TupleVariant__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5349:2: rule__TupleVariant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group_3__1__Impl_in_rule__TupleVariant__Group_3__110712);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5355:1: rule__TupleVariant__Group_3__1__Impl : ( ( rule__TupleVariant__TypesAssignment_3_1 ) ) ;
    public final void rule__TupleVariant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5359:1: ( ( ( rule__TupleVariant__TypesAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5360:1: ( ( rule__TupleVariant__TypesAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5360:1: ( ( rule__TupleVariant__TypesAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5361:1: ( rule__TupleVariant__TypesAssignment_3_1 )
            {
             before(grammarAccess.getTupleVariantAccess().getTypesAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5362:1: ( rule__TupleVariant__TypesAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5362:2: rule__TupleVariant__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TupleVariant__TypesAssignment_3_1_in_rule__TupleVariant__Group_3__1__Impl10739);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5377:1: rule__Crate__ItemsAssignment : ( ruleItemAndAttrs ) ;
    public final void rule__Crate__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5381:1: ( ( ruleItemAndAttrs ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5382:1: ( ruleItemAndAttrs )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5382:1: ( ruleItemAndAttrs )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5383:1: ruleItemAndAttrs
            {
             before(grammarAccess.getCrateAccess().getItemsItemAndAttrsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment10778);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5392:1: rule__ItemAttr__AttrsAssignment_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5396:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5397:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5397:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5398:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_110809);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5407:1: rule__ItemAttr__AttrsAssignment_2_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5411:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5412:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5412:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5413:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_110840);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5422:1: rule__AttrWithList__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__AttrWithList__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5426:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5427:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5427:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5428:1: RULE_IDENT
            {
             before(grammarAccess.getAttrWithListAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_010871); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5437:1: rule__AttrWithList__AttrsAssignment_2 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5441:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5442:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5442:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5443:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_210902);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5452:1: rule__AttrWithList__AttrsAssignment_3_1 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5456:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5457:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5457:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5458:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_110933);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5467:1: rule__LiteralAttr__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__LiteralAttr__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5471:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5472:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5472:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5473:1: RULE_IDENT
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_010964); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5482:1: rule__LiteralAttr__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__LiteralAttr__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5486:1: ( ( ruleLiteral ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5487:1: ( ruleLiteral )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5487:1: ( ruleLiteral )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5488:1: ruleLiteral
            {
             before(grammarAccess.getLiteralAttrAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_210995);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5497:1: rule__ItemAndAttrs__AttrsAssignment_0 : ( ruleItemAttr ) ;
    public final void rule__ItemAndAttrs__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5501:1: ( ( ruleItemAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5502:1: ( ruleItemAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5502:1: ( ruleItemAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5503:1: ruleItemAttr
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsItemAttrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_011026);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5512:1: rule__ItemAndAttrs__ItemAssignment_1 : ( ruleItem ) ;
    public final void rule__ItemAndAttrs__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5516:1: ( ( ruleItem ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5517:1: ( ruleItem )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5517:1: ( ruleItem )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5518:1: ruleItem
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_111057);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5527:1: rule__ModItem__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__ModItem__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5531:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5532:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5532:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5533:1: RULE_IDENT
            {
             before(grammarAccess.getModItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_111088); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5542:1: rule__ModItem__ExternalBodyAssignment_2_0 : ( ( ';' ) ) ;
    public final void rule__ModItem__ExternalBodyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5546:1: ( ( ( ';' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5547:1: ( ( ';' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5547:1: ( ( ';' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5548:1: ( ';' )
            {
             before(grammarAccess.getModItemAccess().getExternalBodySemicolonKeyword_2_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5549:1: ( ';' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5550:1: ';'
            {
             before(grammarAccess.getModItemAccess().getExternalBodySemicolonKeyword_2_0_0()); 
            match(input,65,FOLLOW_65_in_rule__ModItem__ExternalBodyAssignment_2_011124); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5565:1: rule__ModItem__ItemsAssignment_2_1_1 : ( ruleItemAndAttrs ) ;
    public final void rule__ModItem__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5569:1: ( ( ruleItemAndAttrs ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5570:1: ( ruleItemAndAttrs )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5570:1: ( ruleItemAndAttrs )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5571:1: ruleItemAndAttrs
            {
             before(grammarAccess.getModItemAccess().getItemsItemAndAttrsParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_rule__ModItem__ItemsAssignment_2_1_111163);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5580:1: rule__FnItem__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__FnItem__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5584:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5585:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5585:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5586:1: RULE_IDENT
            {
             before(grammarAccess.getFnItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__FnItem__IdentAssignment_111194); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5595:1: rule__FnItem__ParamsAssignment_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__FnItem__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5599:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5600:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5600:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5601:1: ruleGenericParamDecl
            {
             before(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_111225);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5610:1: rule__FnItem__ParamsAssignment_2_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__FnItem__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5614:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5615:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5615:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5616:1: ruleGenericParamDecl
            {
             before(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_2_111256);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5625:1: rule__FnItem__ArgsAssignment_4_0 : ( ruleArg ) ;
    public final void rule__FnItem__ArgsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5629:1: ( ( ruleArg ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5630:1: ( ruleArg )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5630:1: ( ruleArg )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5631:1: ruleArg
            {
             before(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_011287);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5640:1: rule__FnItem__ArgsAssignment_4_1_1 : ( ruleArg ) ;
    public final void rule__FnItem__ArgsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5644:1: ( ( ruleArg ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5645:1: ( ruleArg )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5645:1: ( ruleArg )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5646:1: ruleArg
            {
             before(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_1_111318);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5655:1: rule__FnItem__ReturnTypeAssignment_6_1 : ( ruleType ) ;
    public final void rule__FnItem__ReturnTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5659:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5660:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5660:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5661:1: ruleType
            {
             before(grammarAccess.getFnItemAccess().getReturnTypeTypeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__FnItem__ReturnTypeAssignment_6_111349);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5670:1: rule__FnItem__BodyAssignment_7 : ( ruleBlock ) ;
    public final void rule__FnItem__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5674:1: ( ( ruleBlock ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5675:1: ( ruleBlock )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5675:1: ( ruleBlock )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5676:1: ruleBlock
            {
             before(grammarAccess.getFnItemAccess().getBodyBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__FnItem__BodyAssignment_711380);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5685:1: rule__GenericParamDecl__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__GenericParamDecl__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5689:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5690:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5690:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5691:1: RULE_IDENT
            {
             before(grammarAccess.getGenericParamDeclAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__IdentAssignment_011411); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5700:1: rule__GenericParamDecl__BoundsAssignment_1_1 : ( RULE_IDENT ) ;
    public final void rule__GenericParamDecl__BoundsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5704:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5705:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5705:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5706:1: RULE_IDENT
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_111442); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5715:1: rule__GenericParamDecl__BoundsAssignment_1_2_1 : ( RULE_IDENT ) ;
    public final void rule__GenericParamDecl__BoundsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5719:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5720:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5720:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5721:1: RULE_IDENT
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_2_111473); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5730:1: rule__Arg__PatAssignment_0 : ( rulePat ) ;
    public final void rule__Arg__PatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5734:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5735:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5735:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5736:1: rulePat
            {
             before(grammarAccess.getArgAccess().getPatPatParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__Arg__PatAssignment_011504);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5745:1: rule__Arg__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Arg__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5749:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5750:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5750:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5751:1: ruleType
            {
             before(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Arg__TypeAssignment_211535);
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


    // $ANTLR start "rule__Pat__IdentAssignment"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5760:1: rule__Pat__IdentAssignment : ( RULE_IDENT ) ;
    public final void rule__Pat__IdentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5764:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5765:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5765:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5766:1: RULE_IDENT
            {
             before(grammarAccess.getPatAccess().getIdentIDENTTerminalRuleCall_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Pat__IdentAssignment11566); 
             after(grammarAccess.getPatAccess().getIdentIDENTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pat__IdentAssignment"


    // $ANTLR start "rule__TupleType__TypesAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5775:1: rule__TupleType__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5779:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5780:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5780:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5781:1: ruleType
            {
             before(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_111597);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5790:1: rule__TupleType__TypesAssignment_2_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5794:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5795:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5795:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5796:1: ruleType
            {
             before(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_2_111628);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5805:1: rule__StructType__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__StructType__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5809:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5810:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5810:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5811:1: RULE_IDENT
            {
             before(grammarAccess.getStructTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__StructType__IdentAssignment_111659); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5820:1: rule__StructType__ParamsAssignment_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructType__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5824:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5825:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5825:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5826:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_111690);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5835:1: rule__StructType__ParamsAssignment_2_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructType__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5839:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5840:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5840:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5841:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_2_111721);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5850:1: rule__StructType__FieldsAssignment_4 : ( ruleStructField ) ;
    public final void rule__StructType__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5854:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5855:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5855:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5856:1: ruleStructField
            {
             before(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_411752);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5865:1: rule__StructType__FieldsAssignment_5_1 : ( ruleStructField ) ;
    public final void rule__StructType__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5869:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5870:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5870:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5871:1: ruleStructField
            {
             before(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_5_111783);
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


    // $ANTLR start "rule__BoxedType__TypeAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5880:1: rule__BoxedType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__BoxedType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5884:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5885:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5885:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5886:1: ruleType
            {
             before(grammarAccess.getBoxedTypeAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__BoxedType__TypeAssignment_111814);
            ruleType();

            state._fsp--;

             after(grammarAccess.getBoxedTypeAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedType__TypeAssignment_1"


    // $ANTLR start "rule__OwnedType__TypeAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5895:1: rule__OwnedType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__OwnedType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5899:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5900:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5900:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5901:1: ruleType
            {
             before(grammarAccess.getOwnedTypeAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__OwnedType__TypeAssignment_111845);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOwnedTypeAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedType__TypeAssignment_1"


    // $ANTLR start "rule__BorrowedType__TypeAssignment_1"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5910:1: rule__BorrowedType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__BorrowedType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5914:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5915:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5915:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5916:1: ruleType
            {
             before(grammarAccess.getBorrowedTypeAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__BorrowedType__TypeAssignment_111876);
            ruleType();

            state._fsp--;

             after(grammarAccess.getBorrowedTypeAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorrowedType__TypeAssignment_1"


    // $ANTLR start "rule__StructField__VisAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5925:1: rule__StructField__VisAssignment_0 : ( ruleVisibility ) ;
    public final void rule__StructField__VisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5929:1: ( ( ruleVisibility ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5930:1: ( ruleVisibility )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5930:1: ( ruleVisibility )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5931:1: ruleVisibility
            {
             before(grammarAccess.getStructFieldAccess().getVisVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibility_in_rule__StructField__VisAssignment_011907);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5940:1: rule__StructField__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__StructField__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5944:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5945:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5945:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5946:1: RULE_IDENT
            {
             before(grammarAccess.getStructFieldAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__StructField__IdentAssignment_111938); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5955:1: rule__StructField__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__StructField__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5959:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5960:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5960:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5961:1: ruleType
            {
             before(grammarAccess.getStructFieldAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__StructField__TypeAssignment_311969);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5970:1: rule__EnumType__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__EnumType__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5974:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5975:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5975:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5976:1: RULE_IDENT
            {
             before(grammarAccess.getEnumTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__EnumType__IdentAssignment_112000); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5985:1: rule__EnumType__ParamsAssignment_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__EnumType__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5989:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5990:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5990:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5991:1: ruleGenericParamDecl
            {
             before(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_112031);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6000:1: rule__EnumType__ParamsAssignment_2_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__EnumType__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6004:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6005:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6005:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6006:1: ruleGenericParamDecl
            {
             before(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_2_112062);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6015:1: rule__EnumType__VariantsAssignment_4 : ( ruleVariant ) ;
    public final void rule__EnumType__VariantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6019:1: ( ( ruleVariant ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6020:1: ( ruleVariant )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6020:1: ( ruleVariant )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6021:1: ruleVariant
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_412093);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6030:1: rule__EnumType__VariantsAssignment_5_1 : ( ruleVariant ) ;
    public final void rule__EnumType__VariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6034:1: ( ( ruleVariant ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6035:1: ( ruleVariant )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6035:1: ( ruleVariant )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6036:1: ruleVariant
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_5_112124);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6045:1: rule__StructVariant__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__StructVariant__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6049:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6050:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6050:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6051:1: RULE_IDENT
            {
             before(grammarAccess.getStructVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__StructVariant__IdentAssignment_012155); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6060:1: rule__StructVariant__ParamsAssignment_1_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructVariant__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6064:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6065:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6065:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6066:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_112186);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6075:1: rule__StructVariant__ParamsAssignment_1_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructVariant__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6079:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6080:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6080:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6081:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_2_112217);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6090:1: rule__StructVariant__FieldsAssignment_3 : ( ruleStructField ) ;
    public final void rule__StructVariant__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6094:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6095:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6095:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6096:1: ruleStructField
            {
             before(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_312248);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6105:1: rule__StructVariant__FieldsAssignment_4_1 : ( ruleStructField ) ;
    public final void rule__StructVariant__FieldsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6109:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6110:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6110:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6111:1: ruleStructField
            {
             before(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_4_112279);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6120:1: rule__TupleVariant__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__TupleVariant__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6124:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6125:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6125:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6126:1: RULE_IDENT
            {
             before(grammarAccess.getTupleVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__TupleVariant__IdentAssignment_012310); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6135:1: rule__TupleVariant__TypesAssignment_2 : ( ruleType ) ;
    public final void rule__TupleVariant__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6139:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6140:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6140:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6141:1: ruleType
            {
             before(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_212341);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6150:1: rule__TupleVariant__TypesAssignment_3_1 : ( ruleType ) ;
    public final void rule__TupleVariant__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6154:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6155:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6155:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6156:1: ruleType
            {
             before(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_3_112372);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6165:1: rule__UnitVariant__IdentAssignment : ( RULE_IDENT ) ;
    public final void rule__UnitVariant__IdentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6169:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6170:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6170:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6171:1: RULE_IDENT
            {
             before(grammarAccess.getUnitVariantAccess().getIdentIDENTTerminalRuleCall_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__UnitVariant__IdentAssignment12403); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6180:1: rule__StringLit__ValueAssignment : ( RULE_STRING_LIT ) ;
    public final void rule__StringLit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6184:1: ( ( RULE_STRING_LIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6185:1: ( RULE_STRING_LIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6185:1: ( RULE_STRING_LIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6186:1: RULE_STRING_LIT
            {
             before(grammarAccess.getStringLitAccess().getValueSTRING_LITTerminalRuleCall_0()); 
            match(input,RULE_STRING_LIT,FOLLOW_RULE_STRING_LIT_in_rule__StringLit__ValueAssignment12434); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6195:1: rule__NumberLit__ValueAssignment : ( ( rule__NumberLit__ValueAlternatives_0 ) ) ;
    public final void rule__NumberLit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6199:1: ( ( ( rule__NumberLit__ValueAlternatives_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6200:1: ( ( rule__NumberLit__ValueAlternatives_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6200:1: ( ( rule__NumberLit__ValueAlternatives_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6201:1: ( rule__NumberLit__ValueAlternatives_0 )
            {
             before(grammarAccess.getNumberLitAccess().getValueAlternatives_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6202:1: ( rule__NumberLit__ValueAlternatives_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6202:2: rule__NumberLit__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__NumberLit__ValueAlternatives_0_in_rule__NumberLit__ValueAssignment12465);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6211:1: rule__CharLit__ValueAssignment : ( RULE_CHAR_LIT ) ;
    public final void rule__CharLit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6215:1: ( ( RULE_CHAR_LIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6216:1: ( RULE_CHAR_LIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6216:1: ( RULE_CHAR_LIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:6217:1: RULE_CHAR_LIT
            {
             before(grammarAccess.getCharLitAccess().getValueCHAR_LITTerminalRuleCall_0()); 
            match(input,RULE_CHAR_LIT,FOLLOW_RULE_CHAR_LIT_in_rule__CharLit__ValueAssignment12498); 
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


 

    public static final BitSet FOLLOW_ruleCrate_in_entryRuleCrate61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrate68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crate__ItemsAssignment_in_ruleCrate94 = new BitSet(new long[]{0x0048200000000002L});
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
    public static final BitSet FOLLOW_rule__Pat__IdentAssignment_in_rulePat815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_entryRuleTupleType962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleType969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__0_in_ruleTupleType995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_entryRuleStructType1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructType1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__0_in_ruleStructType1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedType_in_entryRuleBoxedType1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxedType1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxedType__Group__0_in_ruleBoxedType1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedType_in_entryRuleOwnedType1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedType1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OwnedType__Group__0_in_ruleOwnedType1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedType_in_entryRuleBorrowedType1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrowedType1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorrowedType__Group__0_in_ruleBorrowedType1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_entryRuleStructField1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructField1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__0_in_ruleStructField1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0_in_ruleEnumType1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariant1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant__Alternatives_in_ruleVariant1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_entryRuleStructVariant1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructVariant1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__0_in_ruleStructVariant1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleVariant1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__0_in_ruleTupleVariant1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitVariant1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnitVariant__IdentAssignment_in_ruleUnitVariant1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_entryRuleStringLit1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLit1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLit__ValueAssignment_in_ruleStringLit1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_entryRuleNumberLit1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLit1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLit__ValueAssignment_in_ruleNumberLit1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__ValueAssignment_in_ruleCharLit1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_rule__Item__Alternatives1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFnItem_in_rule__Item__Alternatives1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__ExternalBodyAssignment_2_0_in_rule__ModItem__Alternatives_22005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_22023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_rule__Type__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_rule__Type__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Type__Alternatives2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedType_in_rule__Type__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedType_in_rule__Type__Alternatives2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedType_in_rule__Type__Alternatives2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__0_in_rule__PrimitiveType__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__0_in_rule__PrimitiveType__Alternatives2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__0_in_rule__PrimitiveType__Alternatives2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__0_in_rule__PrimitiveType__Alternatives2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__0_in_rule__PrimitiveType__Alternatives2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_rule__Variant__Alternatives2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_rule__Variant__Alternatives2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_rule__Variant__Alternatives2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rule__Literal__Alternatives2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_rule__Literal__Alternatives2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_rule__NumberLit__ValueAlternatives_02427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LIT_in_rule__NumberLit__ValueAlternatives_02444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Visibility__Alternatives2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Visibility__Alternatives2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02531 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ItemAttr__Group__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12593 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__22653 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__22656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl2683 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__32714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ItemAttr__Group__3__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__02781 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__02784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ItemAttr__Group_2__0__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__12843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__02904 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__02907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__12964 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AttrWithList__Group__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__23026 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__23029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__33086 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__33089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl3116 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__43147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AttrWithList__Group__4__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__03216 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__03219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AttrWithList__Group_3__0__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__13278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__03339 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__13399 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__13402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__LiteralAttr__Group__1__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03524 = new BitSet(new long[]{0x0048200000000000L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3554 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__03646 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__03649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ModItem__Group__0__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__13708 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__23768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__03831 = new BitSet(new long[]{0x0068200000000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__03834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ModItem__Group_2_1__0__Impl3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__13893 = new BitSet(new long[]{0x0068200000000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__2_in_rule__ModItem__Group_2_1__13896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__ItemsAssignment_2_1_1_in_rule__ModItem__Group_2_1__1__Impl3923 = new BitSet(new long[]{0x0048200000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__2__Impl_in_rule__ModItem__Group_2_1__23954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ModItem__Group_2_1__2__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__0__Impl_in_rule__FnItem__Group__04019 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group__1_in_rule__FnItem__Group__04022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__FnItem__Group__0__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__1__Impl_in_rule__FnItem__Group__14081 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__2_in_rule__FnItem__Group__14084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__IdentAssignment_1_in_rule__FnItem__Group__1__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__2__Impl_in_rule__FnItem__Group__24141 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__3_in_rule__FnItem__Group__24144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__0_in_rule__FnItem__Group__2__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__3__Impl_in_rule__FnItem__Group__34202 = new BitSet(new long[]{0x0002000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group__4_in_rule__FnItem__Group__34205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FnItem__Group__3__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__4__Impl_in_rule__FnItem__Group__44264 = new BitSet(new long[]{0x0002000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group__5_in_rule__FnItem__Group__44267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__0_in_rule__FnItem__Group__4__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__5__Impl_in_rule__FnItem__Group__54325 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__6_in_rule__FnItem__Group__54328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__FnItem__Group__5__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__6__Impl_in_rule__FnItem__Group__64387 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__7_in_rule__FnItem__Group__64390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__0_in_rule__FnItem__Group__6__Impl4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__7__Impl_in_rule__FnItem__Group__74448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__BodyAssignment_7_in_rule__FnItem__Group__7__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__0__Impl_in_rule__FnItem__Group_2__04521 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__1_in_rule__FnItem__Group_2__04524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__FnItem__Group_2__0__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__1__Impl_in_rule__FnItem__Group_2__14583 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__2_in_rule__FnItem__Group_2__14586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ParamsAssignment_2_1_in_rule__FnItem__Group_2__1__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__2__Impl_in_rule__FnItem__Group_2__24643 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__3_in_rule__FnItem__Group_2__24646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__0_in_rule__FnItem__Group_2__2__Impl4673 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__3__Impl_in_rule__FnItem__Group_2__34704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__FnItem__Group_2__3__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__0__Impl_in_rule__FnItem__Group_2_2__04771 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__1_in_rule__FnItem__Group_2_2__04774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FnItem__Group_2_2__0__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__1__Impl_in_rule__FnItem__Group_2_2__14833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ParamsAssignment_2_2_1_in_rule__FnItem__Group_2_2__1__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__0__Impl_in_rule__FnItem__Group_4__04894 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__1_in_rule__FnItem__Group_4__04897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ArgsAssignment_4_0_in_rule__FnItem__Group_4__0__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__1__Impl_in_rule__FnItem__Group_4__14954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__0_in_rule__FnItem__Group_4__1__Impl4981 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__0__Impl_in_rule__FnItem__Group_4_1__05016 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__1_in_rule__FnItem__Group_4_1__05019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FnItem__Group_4_1__0__Impl5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__1__Impl_in_rule__FnItem__Group_4_1__15078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ArgsAssignment_4_1_1_in_rule__FnItem__Group_4_1__1__Impl5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__0__Impl_in_rule__FnItem__Group_6__05139 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__1_in_rule__FnItem__Group_6__05142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__FnItem__Group_6__0__Impl5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__1__Impl_in_rule__FnItem__Group_6__15201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ReturnTypeAssignment_6_1_in_rule__FnItem__Group_6__1__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05262 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Block__Group__0__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Block__Group__1__Impl5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__0__Impl_in_rule__GenericParamDecl__Group__05387 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__1_in_rule__GenericParamDecl__Group__05390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__IdentAssignment_0_in_rule__GenericParamDecl__Group__0__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__1__Impl_in_rule__GenericParamDecl__Group__15447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__0_in_rule__GenericParamDecl__Group__1__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__0__Impl_in_rule__GenericParamDecl__Group_1__05509 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__1_in_rule__GenericParamDecl__Group_1__05512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__GenericParamDecl__Group_1__0__Impl5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__1__Impl_in_rule__GenericParamDecl__Group_1__15571 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__2_in_rule__GenericParamDecl__Group_1__15574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_1_in_rule__GenericParamDecl__Group_1__1__Impl5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__2__Impl_in_rule__GenericParamDecl__Group_1__25631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__0_in_rule__GenericParamDecl__Group_1__2__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__0__Impl_in_rule__GenericParamDecl__Group_1_2__05694 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__1_in_rule__GenericParamDecl__Group_1_2__05697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__GenericParamDecl__Group_1_2__0__Impl5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__1__Impl_in_rule__GenericParamDecl__Group_1_2__15756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_2_1_in_rule__GenericParamDecl__Group_1_2__1__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__0__Impl_in_rule__Arg__Group__05817 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Arg__Group__1_in_rule__Arg__Group__05820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__PatAssignment_0_in_rule__Arg__Group__0__Impl5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__1__Impl_in_rule__Arg__Group__15877 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Arg__Group__2_in_rule__Arg__Group__15880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Arg__Group__1__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__2__Impl_in_rule__Arg__Group__25939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__TypeAssignment_2_in_rule__Arg__Group__2__Impl5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__0__Impl_in_rule__PrimitiveType__Group_0__06002 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__1_in_rule__PrimitiveType__Group_0__06005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__1__Impl_in_rule__PrimitiveType__Group_0__16063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rule__PrimitiveType__Group_0__1__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__0__Impl_in_rule__PrimitiveType__Group_1__06123 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__1_in_rule__PrimitiveType__Group_1__06126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__1__Impl_in_rule__PrimitiveType__Group_1__16184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_in_rule__PrimitiveType__Group_1__1__Impl6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__0__Impl_in_rule__PrimitiveType__Group_2__06244 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__1_in_rule__PrimitiveType__Group_2__06247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__1__Impl_in_rule__PrimitiveType__Group_2__16305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_TYPE_in_rule__PrimitiveType__Group_2__1__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__0__Impl_in_rule__PrimitiveType__Group_3__06365 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__1_in_rule__PrimitiveType__Group_3__06368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__1__Impl_in_rule__PrimitiveType__Group_3__16426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MACHINE_TYPE_in_rule__PrimitiveType__Group_3__1__Impl6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__0__Impl_in_rule__PrimitiveType__Group_4__06486 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__1_in_rule__PrimitiveType__Group_4__06489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__1__Impl_in_rule__PrimitiveType__Group_4__16547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNIT_TYPE_in_rule__PrimitiveType__Group_4__1__Impl6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__0__Impl_in_rule__TupleType__Group__06607 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__TupleType__Group__1_in_rule__TupleType__Group__06610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TupleType__Group__0__Impl6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__1__Impl_in_rule__TupleType__Group__16669 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__TupleType__Group__2_in_rule__TupleType__Group__16672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__TypesAssignment_1_in_rule__TupleType__Group__1__Impl6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__2__Impl_in_rule__TupleType__Group__26729 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__TupleType__Group__3_in_rule__TupleType__Group__26732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__0_in_rule__TupleType__Group__2__Impl6759 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__3__Impl_in_rule__TupleType__Group__36790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TupleType__Group__3__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__0__Impl_in_rule__TupleType__Group_2__06857 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__1_in_rule__TupleType__Group_2__06860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TupleType__Group_2__0__Impl6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__1__Impl_in_rule__TupleType__Group_2__16919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__TypesAssignment_2_1_in_rule__TupleType__Group_2__1__Impl6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__0__Impl_in_rule__StructType__Group__06980 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group__1_in_rule__StructType__Group__06983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__StructType__Group__0__Impl7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__1__Impl_in_rule__StructType__Group__17042 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__2_in_rule__StructType__Group__17045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__IdentAssignment_1_in_rule__StructType__Group__1__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__2__Impl_in_rule__StructType__Group__27102 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__3_in_rule__StructType__Group__27105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__0_in_rule__StructType__Group__2__Impl7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__3__Impl_in_rule__StructType__Group__37163 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group__4_in_rule__StructType__Group__37166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__StructType__Group__3__Impl7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__4__Impl_in_rule__StructType__Group__47225 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__5_in_rule__StructType__Group__47228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__FieldsAssignment_4_in_rule__StructType__Group__4__Impl7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__5__Impl_in_rule__StructType__Group__57285 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__6_in_rule__StructType__Group__57288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__0_in_rule__StructType__Group__5__Impl7315 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__6__Impl_in_rule__StructType__Group__67346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__StructType__Group__6__Impl7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__0__Impl_in_rule__StructType__Group_2__07419 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__1_in_rule__StructType__Group_2__07422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__StructType__Group_2__0__Impl7450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__1__Impl_in_rule__StructType__Group_2__17481 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__2_in_rule__StructType__Group_2__17484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__ParamsAssignment_2_1_in_rule__StructType__Group_2__1__Impl7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__2__Impl_in_rule__StructType__Group_2__27541 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__3_in_rule__StructType__Group_2__27544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__0_in_rule__StructType__Group_2__2__Impl7571 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__3__Impl_in_rule__StructType__Group_2__37602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__StructType__Group_2__3__Impl7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__0__Impl_in_rule__StructType__Group_2_2__07669 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__1_in_rule__StructType__Group_2_2__07672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StructType__Group_2_2__0__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__1__Impl_in_rule__StructType__Group_2_2__17731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__ParamsAssignment_2_2_1_in_rule__StructType__Group_2_2__1__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__0__Impl_in_rule__StructType__Group_5__07792 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__1_in_rule__StructType__Group_5__07795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StructType__Group_5__0__Impl7823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__1__Impl_in_rule__StructType__Group_5__17854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__FieldsAssignment_5_1_in_rule__StructType__Group_5__1__Impl7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxedType__Group__0__Impl_in_rule__BoxedType__Group__07915 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__BoxedType__Group__1_in_rule__BoxedType__Group__07918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__BoxedType__Group__0__Impl7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxedType__Group__1__Impl_in_rule__BoxedType__Group__17977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoxedType__TypeAssignment_1_in_rule__BoxedType__Group__1__Impl8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OwnedType__Group__0__Impl_in_rule__OwnedType__Group__08038 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__OwnedType__Group__1_in_rule__OwnedType__Group__08041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__OwnedType__Group__0__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OwnedType__Group__1__Impl_in_rule__OwnedType__Group__18100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OwnedType__TypeAssignment_1_in_rule__OwnedType__Group__1__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorrowedType__Group__0__Impl_in_rule__BorrowedType__Group__08161 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__BorrowedType__Group__1_in_rule__BorrowedType__Group__08164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__BorrowedType__Group__0__Impl8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorrowedType__Group__1__Impl_in_rule__BorrowedType__Group__18223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorrowedType__TypeAssignment_1_in_rule__BorrowedType__Group__1__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__0__Impl_in_rule__StructField__Group__08284 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructField__Group__1_in_rule__StructField__Group__08287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__VisAssignment_0_in_rule__StructField__Group__0__Impl8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__1__Impl_in_rule__StructField__Group__18345 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__StructField__Group__2_in_rule__StructField__Group__18348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__IdentAssignment_1_in_rule__StructField__Group__1__Impl8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__2__Impl_in_rule__StructField__Group__28405 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__StructField__Group__3_in_rule__StructField__Group__28408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__StructField__Group__2__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__3__Impl_in_rule__StructField__Group__38467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__TypeAssignment_3_in_rule__StructField__Group__3__Impl8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__08532 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__08535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__EnumType__Group__0__Impl8563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__18594 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__18597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__IdentAssignment_1_in_rule__EnumType__Group__1__Impl8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__28654 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__28657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__0_in_rule__EnumType__Group__2__Impl8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__38715 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__38718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EnumType__Group__3__Impl8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__48777 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__48780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__VariantsAssignment_4_in_rule__EnumType__Group__4__Impl8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__58837 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__58840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__0_in_rule__EnumType__Group__5__Impl8867 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__68898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__EnumType__Group__6__Impl8926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__0__Impl_in_rule__EnumType__Group_2__08971 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__1_in_rule__EnumType__Group_2__08974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__EnumType__Group_2__0__Impl9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__1__Impl_in_rule__EnumType__Group_2__19033 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__2_in_rule__EnumType__Group_2__19036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__ParamsAssignment_2_1_in_rule__EnumType__Group_2__1__Impl9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__2__Impl_in_rule__EnumType__Group_2__29093 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__3_in_rule__EnumType__Group_2__29096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__0_in_rule__EnumType__Group_2__2__Impl9123 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__3__Impl_in_rule__EnumType__Group_2__39154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__EnumType__Group_2__3__Impl9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__0__Impl_in_rule__EnumType__Group_2_2__09221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__1_in_rule__EnumType__Group_2_2__09224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumType__Group_2_2__0__Impl9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__1__Impl_in_rule__EnumType__Group_2_2__19283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__ParamsAssignment_2_2_1_in_rule__EnumType__Group_2_2__1__Impl9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__0__Impl_in_rule__EnumType__Group_5__09344 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__1_in_rule__EnumType__Group_5__09347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumType__Group_5__0__Impl9375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__1__Impl_in_rule__EnumType__Group_5__19406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__VariantsAssignment_5_1_in_rule__EnumType__Group_5__1__Impl9433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__0__Impl_in_rule__StructVariant__Group__09467 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__1_in_rule__StructVariant__Group__09470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__IdentAssignment_0_in_rule__StructVariant__Group__0__Impl9497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__1__Impl_in_rule__StructVariant__Group__19527 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__2_in_rule__StructVariant__Group__19530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__0_in_rule__StructVariant__Group__1__Impl9557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__2__Impl_in_rule__StructVariant__Group__29588 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__3_in_rule__StructVariant__Group__29591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__StructVariant__Group__2__Impl9619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__3__Impl_in_rule__StructVariant__Group__39650 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__4_in_rule__StructVariant__Group__39653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__FieldsAssignment_3_in_rule__StructVariant__Group__3__Impl9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__4__Impl_in_rule__StructVariant__Group__49710 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__5_in_rule__StructVariant__Group__49713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__0_in_rule__StructVariant__Group__4__Impl9740 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__5__Impl_in_rule__StructVariant__Group__59771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__StructVariant__Group__5__Impl9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__0__Impl_in_rule__StructVariant__Group_1__09842 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__1_in_rule__StructVariant__Group_1__09845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__StructVariant__Group_1__0__Impl9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__1__Impl_in_rule__StructVariant__Group_1__19904 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__2_in_rule__StructVariant__Group_1__19907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__ParamsAssignment_1_1_in_rule__StructVariant__Group_1__1__Impl9934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__2__Impl_in_rule__StructVariant__Group_1__29964 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__3_in_rule__StructVariant__Group_1__29967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__0_in_rule__StructVariant__Group_1__2__Impl9994 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__3__Impl_in_rule__StructVariant__Group_1__310025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__StructVariant__Group_1__3__Impl10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__0__Impl_in_rule__StructVariant__Group_1_2__010092 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__1_in_rule__StructVariant__Group_1_2__010095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StructVariant__Group_1_2__0__Impl10123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__1__Impl_in_rule__StructVariant__Group_1_2__110154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__ParamsAssignment_1_2_1_in_rule__StructVariant__Group_1_2__1__Impl10181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__0__Impl_in_rule__StructVariant__Group_4__010215 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__1_in_rule__StructVariant__Group_4__010218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StructVariant__Group_4__0__Impl10246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__1__Impl_in_rule__StructVariant__Group_4__110277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__FieldsAssignment_4_1_in_rule__StructVariant__Group_4__1__Impl10304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__0__Impl_in_rule__TupleVariant__Group__010338 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__1_in_rule__TupleVariant__Group__010341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__IdentAssignment_0_in_rule__TupleVariant__Group__0__Impl10368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__1__Impl_in_rule__TupleVariant__Group__110398 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__2_in_rule__TupleVariant__Group__110401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TupleVariant__Group__1__Impl10429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__2__Impl_in_rule__TupleVariant__Group__210460 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__3_in_rule__TupleVariant__Group__210463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__TypesAssignment_2_in_rule__TupleVariant__Group__2__Impl10490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__3__Impl_in_rule__TupleVariant__Group__310520 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__4_in_rule__TupleVariant__Group__310523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__0_in_rule__TupleVariant__Group__3__Impl10550 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__4__Impl_in_rule__TupleVariant__Group__410581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TupleVariant__Group__4__Impl10609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__0__Impl_in_rule__TupleVariant__Group_3__010650 = new BitSet(new long[]{0xF0010000000007C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__1_in_rule__TupleVariant__Group_3__010653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TupleVariant__Group_3__0__Impl10681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__1__Impl_in_rule__TupleVariant__Group_3__110712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__TypesAssignment_3_1_in_rule__TupleVariant__Group_3__1__Impl10739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment10778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_110809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_110840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_010871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_210902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_110933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_010964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_210995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_011026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_111057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_111088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__ModItem__ExternalBodyAssignment_2_011124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_rule__ModItem__ItemsAssignment_2_1_111163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__FnItem__IdentAssignment_111194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_111225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_2_111256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_011287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_1_111318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__FnItem__ReturnTypeAssignment_6_111349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__FnItem__BodyAssignment_711380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__IdentAssignment_011411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_111442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_2_111473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__Arg__PatAssignment_011504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Arg__TypeAssignment_211535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Pat__IdentAssignment11566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_111597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_2_111628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__StructType__IdentAssignment_111659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_111690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_2_111721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_411752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_5_111783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BoxedType__TypeAssignment_111814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__OwnedType__TypeAssignment_111845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BorrowedType__TypeAssignment_111876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__StructField__VisAssignment_011907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__StructField__IdentAssignment_111938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__StructField__TypeAssignment_311969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__EnumType__IdentAssignment_112000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_112031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_2_112062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_412093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_5_112124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__StructVariant__IdentAssignment_012155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_112186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_2_112217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_312248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_4_112279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__TupleVariant__IdentAssignment_012310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_212341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_3_112372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__UnitVariant__IdentAssignment12403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LIT_in_rule__StringLit__ValueAssignment12434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLit__ValueAlternatives_0_in_rule__NumberLit__ValueAssignment12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_LIT_in_rule__CharLit__ValueAssignment12498 = new BitSet(new long[]{0x0000000000000002L});

}