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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FLOAT_LIT", "RULE_INT_LIT", "RULE_INT_TYPE", "RULE_FLOAT_TYPE", "RULE_BOOLEAN_TYPE", "RULE_MACHINE_TYPE", "RULE_UNIT_TYPE", "RULE_IDENT", "RULE_STRING_LIT", "RULE_CHAR_LIT", "RULE_INT_SIZE", "RULE_SIGNED_INT_TYPE", "RULE_UNSIGNED_INT_TYPE", "RULE_I8", "RULE_I16", "RULE_I32", "RULE_I64", "RULE_U8", "RULE_U16", "RULE_U32", "RULE_U64", "RULE_FLOAT_SIZE", "RULE_F32", "RULE_F64", "RULE_MACHINE_INT_TYPE", "RULE_MACHINE_UINT_TYPE", "RULE_UNICODE_CHAR", "RULE_UTF8_CHAR", "RULE_UTF16_CHAR", "RULE_UTF32_CHAR", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_DEC_INT_LIT", "RULE_BIN_INT_LIT", "RULE_OCT_INT_LIT", "RULE_HEX_INT_LIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "'priv'", "'pub'", "'#['", "']'", "','", "'('", "')'", "'='", "'mod'", "'{'", "'}'", "'fn'", "'<'", "'>'", "'->'", "':'", "'+'", "'struct'", "'enum'", "';'"
    };
    public static final int RULE_FLOAT_TYPE=7;
    public static final int T__62=62;
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
    public static final int T__51=51;
    public static final int RULE_U8=21;
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


    // $ANTLR start "entryRuleStructField"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:536:1: entryRuleStructField : ruleStructField EOF ;
    public final void entryRuleStructField() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:537:1: ( ruleStructField EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:538:1: ruleStructField EOF
            {
             before(grammarAccess.getStructFieldRule()); 
            pushFollow(FOLLOW_ruleStructField_in_entryRuleStructField1082);
            ruleStructField();

            state._fsp--;

             after(grammarAccess.getStructFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructField1089); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:545:1: ruleStructField : ( ( rule__StructField__Group__0 ) ) ;
    public final void ruleStructField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:549:2: ( ( ( rule__StructField__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:550:1: ( ( rule__StructField__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:550:1: ( ( rule__StructField__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:551:1: ( rule__StructField__Group__0 )
            {
             before(grammarAccess.getStructFieldAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:552:1: ( rule__StructField__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:552:2: rule__StructField__Group__0
            {
            pushFollow(FOLLOW_rule__StructField__Group__0_in_ruleStructField1115);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:564:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:565:1: ( ruleEnumType EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:566:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType1142);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType1149); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:573:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:577:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:578:1: ( ( rule__EnumType__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:578:1: ( ( rule__EnumType__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:579:1: ( rule__EnumType__Group__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:580:1: ( rule__EnumType__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:580:2: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0_in_ruleEnumType1175);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:592:1: entryRuleVariant : ruleVariant EOF ;
    public final void entryRuleVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:593:1: ( ruleVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:594:1: ruleVariant EOF
            {
             before(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_ruleVariant_in_entryRuleVariant1202);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariant1209); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:601:1: ruleVariant : ( ( rule__Variant__Alternatives ) ) ;
    public final void ruleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:605:2: ( ( ( rule__Variant__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:606:1: ( ( rule__Variant__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:606:1: ( ( rule__Variant__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:607:1: ( rule__Variant__Alternatives )
            {
             before(grammarAccess.getVariantAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:1: ( rule__Variant__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:608:2: rule__Variant__Alternatives
            {
            pushFollow(FOLLOW_rule__Variant__Alternatives_in_ruleVariant1235);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:620:1: entryRuleStructVariant : ruleStructVariant EOF ;
    public final void entryRuleStructVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:621:1: ( ruleStructVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:622:1: ruleStructVariant EOF
            {
             before(grammarAccess.getStructVariantRule()); 
            pushFollow(FOLLOW_ruleStructVariant_in_entryRuleStructVariant1262);
            ruleStructVariant();

            state._fsp--;

             after(grammarAccess.getStructVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructVariant1269); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:629:1: ruleStructVariant : ( ( rule__StructVariant__Group__0 ) ) ;
    public final void ruleStructVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:633:2: ( ( ( rule__StructVariant__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:634:1: ( ( rule__StructVariant__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:634:1: ( ( rule__StructVariant__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:635:1: ( rule__StructVariant__Group__0 )
            {
             before(grammarAccess.getStructVariantAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:636:1: ( rule__StructVariant__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:636:2: rule__StructVariant__Group__0
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__0_in_ruleStructVariant1295);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:648:1: entryRuleTupleVariant : ruleTupleVariant EOF ;
    public final void entryRuleTupleVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:649:1: ( ruleTupleVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:650:1: ruleTupleVariant EOF
            {
             before(grammarAccess.getTupleVariantRule()); 
            pushFollow(FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant1322);
            ruleTupleVariant();

            state._fsp--;

             after(grammarAccess.getTupleVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleVariant1329); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:657:1: ruleTupleVariant : ( ( rule__TupleVariant__Group__0 ) ) ;
    public final void ruleTupleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:661:2: ( ( ( rule__TupleVariant__Group__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:662:1: ( ( rule__TupleVariant__Group__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:662:1: ( ( rule__TupleVariant__Group__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:663:1: ( rule__TupleVariant__Group__0 )
            {
             before(grammarAccess.getTupleVariantAccess().getGroup()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:664:1: ( rule__TupleVariant__Group__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:664:2: rule__TupleVariant__Group__0
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__0_in_ruleTupleVariant1355);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:676:1: entryRuleUnitVariant : ruleUnitVariant EOF ;
    public final void entryRuleUnitVariant() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:677:1: ( ruleUnitVariant EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:678:1: ruleUnitVariant EOF
            {
             before(grammarAccess.getUnitVariantRule()); 
            pushFollow(FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant1382);
            ruleUnitVariant();

            state._fsp--;

             after(grammarAccess.getUnitVariantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitVariant1389); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:685:1: ruleUnitVariant : ( ( rule__UnitVariant__IdentAssignment ) ) ;
    public final void ruleUnitVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:689:2: ( ( ( rule__UnitVariant__IdentAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:690:1: ( ( rule__UnitVariant__IdentAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:690:1: ( ( rule__UnitVariant__IdentAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:691:1: ( rule__UnitVariant__IdentAssignment )
            {
             before(grammarAccess.getUnitVariantAccess().getIdentAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:692:1: ( rule__UnitVariant__IdentAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:692:2: rule__UnitVariant__IdentAssignment
            {
            pushFollow(FOLLOW_rule__UnitVariant__IdentAssignment_in_ruleUnitVariant1415);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:704:1: entryRuleStringLit : ruleStringLit EOF ;
    public final void entryRuleStringLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:705:1: ( ruleStringLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:706:1: ruleStringLit EOF
            {
             before(grammarAccess.getStringLitRule()); 
            pushFollow(FOLLOW_ruleStringLit_in_entryRuleStringLit1442);
            ruleStringLit();

            state._fsp--;

             after(grammarAccess.getStringLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLit1449); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:713:1: ruleStringLit : ( ( rule__StringLit__ValueAssignment ) ) ;
    public final void ruleStringLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:717:2: ( ( ( rule__StringLit__ValueAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:718:1: ( ( rule__StringLit__ValueAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:718:1: ( ( rule__StringLit__ValueAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:719:1: ( rule__StringLit__ValueAssignment )
            {
             before(grammarAccess.getStringLitAccess().getValueAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:720:1: ( rule__StringLit__ValueAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:720:2: rule__StringLit__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLit__ValueAssignment_in_ruleStringLit1475);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:732:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:733:1: ( ruleLiteral EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:734:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1502);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1509); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:741:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:745:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:746:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:746:1: ( ( rule__Literal__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:747:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:748:1: ( rule__Literal__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:748:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1535);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:760:1: entryRuleNumberLit : ruleNumberLit EOF ;
    public final void entryRuleNumberLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:761:1: ( ruleNumberLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:762:1: ruleNumberLit EOF
            {
             before(grammarAccess.getNumberLitRule()); 
            pushFollow(FOLLOW_ruleNumberLit_in_entryRuleNumberLit1562);
            ruleNumberLit();

            state._fsp--;

             after(grammarAccess.getNumberLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLit1569); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:769:1: ruleNumberLit : ( ( rule__NumberLit__ValueAssignment ) ) ;
    public final void ruleNumberLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:773:2: ( ( ( rule__NumberLit__ValueAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:774:1: ( ( rule__NumberLit__ValueAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:774:1: ( ( rule__NumberLit__ValueAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:775:1: ( rule__NumberLit__ValueAssignment )
            {
             before(grammarAccess.getNumberLitAccess().getValueAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:776:1: ( rule__NumberLit__ValueAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:776:2: rule__NumberLit__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberLit__ValueAssignment_in_ruleNumberLit1595);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:788:1: entryRuleCharLit : ruleCharLit EOF ;
    public final void entryRuleCharLit() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:789:1: ( ruleCharLit EOF )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:790:1: ruleCharLit EOF
            {
             before(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit1622);
            ruleCharLit();

            state._fsp--;

             after(grammarAccess.getCharLitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit1629); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:797:1: ruleCharLit : ( ( rule__CharLit__ValueAssignment ) ) ;
    public final void ruleCharLit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:801:2: ( ( ( rule__CharLit__ValueAssignment ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:802:1: ( ( rule__CharLit__ValueAssignment ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:802:1: ( ( rule__CharLit__ValueAssignment ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:803:1: ( rule__CharLit__ValueAssignment )
            {
             before(grammarAccess.getCharLitAccess().getValueAssignment()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:804:1: ( rule__CharLit__ValueAssignment )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:804:2: rule__CharLit__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CharLit__ValueAssignment_in_ruleCharLit1655);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:817:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:821:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:822:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:822:1: ( ( rule__Visibility__Alternatives ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:823:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:824:1: ( rule__Visibility__Alternatives )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:824:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1692);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:835:1: rule__Attr__Alternatives : ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) );
    public final void rule__Attr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:839:1: ( ( ruleLiteralAttr ) | ( ruleAttrWithList ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:840:1: ( ruleLiteralAttr )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:840:1: ( ruleLiteralAttr )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:841:1: ruleLiteralAttr
                    {
                     before(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1727);
                    ruleLiteralAttr();

                    state._fsp--;

                     after(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:846:6: ( ruleAttrWithList )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:846:6: ( ruleAttrWithList )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:847:1: ruleAttrWithList
                    {
                     before(grammarAccess.getAttrAccess().getAttrWithListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1744);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:857:1: rule__Item__Alternatives : ( ( ruleModItem ) | ( ruleFnItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:861:1: ( ( ruleModItem ) | ( ruleFnItem ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:862:1: ( ruleModItem )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:862:1: ( ruleModItem )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:863:1: ruleModItem
                    {
                     before(grammarAccess.getItemAccess().getModItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleModItem_in_rule__Item__Alternatives1776);
                    ruleModItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getModItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:868:6: ( ruleFnItem )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:868:6: ( ruleFnItem )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:869:1: ruleFnItem
                    {
                     before(grammarAccess.getItemAccess().getFnItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFnItem_in_rule__Item__Alternatives1793);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:879:1: rule__ModItem__Alternatives_2 : ( ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) ) | ( ( rule__ModItem__Group_2_1__0 ) ) );
    public final void rule__ModItem__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:883:1: ( ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) ) | ( ( rule__ModItem__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==62) ) {
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:884:1: ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:884:1: ( ( rule__ModItem__ExternalBodyAssignment_2_0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:885:1: ( rule__ModItem__ExternalBodyAssignment_2_0 )
                    {
                     before(grammarAccess.getModItemAccess().getExternalBodyAssignment_2_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:886:1: ( rule__ModItem__ExternalBodyAssignment_2_0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:886:2: rule__ModItem__ExternalBodyAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ModItem__ExternalBodyAssignment_2_0_in_rule__ModItem__Alternatives_21825);
                    rule__ModItem__ExternalBodyAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModItemAccess().getExternalBodyAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:890:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:890:6: ( ( rule__ModItem__Group_2_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:891:1: ( rule__ModItem__Group_2_1__0 )
                    {
                     before(grammarAccess.getModItemAccess().getGroup_2_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:892:1: ( rule__ModItem__Group_2_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:892:2: rule__ModItem__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_21843);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:901:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleTupleType ) | ( ruleStructType ) | ( ruleEnumType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:905:1: ( ( rulePrimitiveType ) | ( ruleTupleType ) | ( ruleStructType ) | ( ruleEnumType ) )
            int alt5=4;
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
            case 61:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:906:1: ( rulePrimitiveType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:906:1: ( rulePrimitiveType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:907:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1876);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:912:6: ( ruleTupleType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:912:6: ( ruleTupleType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:913:1: ruleTupleType
                    {
                     before(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTupleType_in_rule__Type__Alternatives1893);
                    ruleTupleType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:918:6: ( ruleStructType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:918:6: ( ruleStructType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:919:1: ruleStructType
                    {
                     before(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStructType_in_rule__Type__Alternatives1910);
                    ruleStructType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:924:6: ( ruleEnumType )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:924:6: ( ruleEnumType )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:925:1: ruleEnumType
                    {
                     before(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__Type__Alternatives1927);
                    ruleEnumType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_3()); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:935:1: rule__PrimitiveType__Alternatives : ( ( ( rule__PrimitiveType__Group_0__0 ) ) | ( ( rule__PrimitiveType__Group_1__0 ) ) | ( ( rule__PrimitiveType__Group_2__0 ) ) | ( ( rule__PrimitiveType__Group_3__0 ) ) | ( ( rule__PrimitiveType__Group_4__0 ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:939:1: ( ( ( rule__PrimitiveType__Group_0__0 ) ) | ( ( rule__PrimitiveType__Group_1__0 ) ) | ( ( rule__PrimitiveType__Group_2__0 ) ) | ( ( rule__PrimitiveType__Group_3__0 ) ) | ( ( rule__PrimitiveType__Group_4__0 ) ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:940:1: ( ( rule__PrimitiveType__Group_0__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:940:1: ( ( rule__PrimitiveType__Group_0__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:941:1: ( rule__PrimitiveType__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:942:1: ( rule__PrimitiveType__Group_0__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:942:2: rule__PrimitiveType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_0__0_in_rule__PrimitiveType__Alternatives1959);
                    rule__PrimitiveType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:946:6: ( ( rule__PrimitiveType__Group_1__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:946:6: ( ( rule__PrimitiveType__Group_1__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:947:1: ( rule__PrimitiveType__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:948:1: ( rule__PrimitiveType__Group_1__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:948:2: rule__PrimitiveType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_1__0_in_rule__PrimitiveType__Alternatives1977);
                    rule__PrimitiveType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:952:6: ( ( rule__PrimitiveType__Group_2__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:952:6: ( ( rule__PrimitiveType__Group_2__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:953:1: ( rule__PrimitiveType__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:954:1: ( rule__PrimitiveType__Group_2__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:954:2: rule__PrimitiveType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_2__0_in_rule__PrimitiveType__Alternatives1995);
                    rule__PrimitiveType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:958:6: ( ( rule__PrimitiveType__Group_3__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:958:6: ( ( rule__PrimitiveType__Group_3__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:959:1: ( rule__PrimitiveType__Group_3__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_3()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:960:1: ( rule__PrimitiveType__Group_3__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:960:2: rule__PrimitiveType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_3__0_in_rule__PrimitiveType__Alternatives2013);
                    rule__PrimitiveType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:964:6: ( ( rule__PrimitiveType__Group_4__0 ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:964:6: ( ( rule__PrimitiveType__Group_4__0 ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:965:1: ( rule__PrimitiveType__Group_4__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_4()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:966:1: ( rule__PrimitiveType__Group_4__0 )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:966:2: rule__PrimitiveType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PrimitiveType__Group_4__0_in_rule__PrimitiveType__Alternatives2031);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:975:1: rule__Variant__Alternatives : ( ( ruleStructVariant ) | ( ruleTupleVariant ) | ( ruleUnitVariant ) );
    public final void rule__Variant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:979:1: ( ( ruleStructVariant ) | ( ruleTupleVariant ) | ( ruleUnitVariant ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IDENT) ) {
                switch ( input.LA(2) ) {
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
                case EOF:
                case 47:
                case 53:
                    {
                    alt7=3;
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:980:1: ( ruleStructVariant )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:980:1: ( ruleStructVariant )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:981:1: ruleStructVariant
                    {
                     before(grammarAccess.getVariantAccess().getStructVariantParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructVariant_in_rule__Variant__Alternatives2064);
                    ruleStructVariant();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getStructVariantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:986:6: ( ruleTupleVariant )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:986:6: ( ruleTupleVariant )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:987:1: ruleTupleVariant
                    {
                     before(grammarAccess.getVariantAccess().getTupleVariantParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTupleVariant_in_rule__Variant__Alternatives2081);
                    ruleTupleVariant();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getTupleVariantParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:992:6: ( ruleUnitVariant )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:992:6: ( ruleUnitVariant )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:993:1: ruleUnitVariant
                    {
                     before(grammarAccess.getVariantAccess().getUnitVariantParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUnitVariant_in_rule__Variant__Alternatives2098);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1003:1: rule__Literal__Alternatives : ( ( ruleNumberLit ) | ( ruleCharLit ) | ( ruleStringLit ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1007:1: ( ( ruleNumberLit ) | ( ruleCharLit ) | ( ruleStringLit ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1008:1: ( ruleNumberLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1008:1: ( ruleNumberLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1009:1: ruleNumberLit
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives2130);
                    ruleNumberLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1014:6: ( ruleCharLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1014:6: ( ruleCharLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1015:1: ruleCharLit
                    {
                     before(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCharLit_in_rule__Literal__Alternatives2147);
                    ruleCharLit();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1020:6: ( ruleStringLit )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1020:6: ( ruleStringLit )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1021:1: ruleStringLit
                    {
                     before(grammarAccess.getLiteralAccess().getStringLitParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringLit_in_rule__Literal__Alternatives2164);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1031:1: rule__NumberLit__ValueAlternatives_0 : ( ( RULE_FLOAT_LIT ) | ( RULE_INT_LIT ) );
    public final void rule__NumberLit__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1035:1: ( ( RULE_FLOAT_LIT ) | ( RULE_INT_LIT ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1036:1: ( RULE_FLOAT_LIT )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1036:1: ( RULE_FLOAT_LIT )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1037:1: RULE_FLOAT_LIT
                    {
                     before(grammarAccess.getNumberLitAccess().getValueFLOAT_LITTerminalRuleCall_0_0()); 
                    match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_rule__NumberLit__ValueAlternatives_02196); 
                     after(grammarAccess.getNumberLitAccess().getValueFLOAT_LITTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1042:6: ( RULE_INT_LIT )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1042:6: ( RULE_INT_LIT )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1043:1: RULE_INT_LIT
                    {
                     before(grammarAccess.getNumberLitAccess().getValueINT_LITTerminalRuleCall_0_1()); 
                    match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_rule__NumberLit__ValueAlternatives_02213); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1053:1: rule__Visibility__Alternatives : ( ( ( 'priv' ) ) | ( ( 'pub' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1057:1: ( ( ( 'priv' ) ) | ( ( 'pub' ) ) )
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1058:1: ( ( 'priv' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1058:1: ( ( 'priv' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1059:1: ( 'priv' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1060:1: ( 'priv' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1060:3: 'priv'
                    {
                    match(input,43,FOLLOW_43_in_rule__Visibility__Alternatives2246); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1065:6: ( ( 'pub' ) )
                    {
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1065:6: ( ( 'pub' ) )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1066:1: ( 'pub' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1067:1: ( 'pub' )
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1067:3: 'pub'
                    {
                    match(input,44,FOLLOW_44_in_rule__Visibility__Alternatives2267); 

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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1079:1: rule__ItemAttr__Group__0 : rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 ;
    public final void rule__ItemAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1083:1: ( rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1084:2: rule__ItemAttr__Group__0__Impl rule__ItemAttr__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02300);
            rule__ItemAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02303);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1091:1: rule__ItemAttr__Group__0__Impl : ( '#[' ) ;
    public final void rule__ItemAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1095:1: ( ( '#[' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1096:1: ( '#[' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1096:1: ( '#[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1097:1: '#['
            {
             before(grammarAccess.getItemAttrAccess().getNumberSignLeftSquareBracketKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__ItemAttr__Group__0__Impl2331); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1110:1: rule__ItemAttr__Group__1 : rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 ;
    public final void rule__ItemAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1114:1: ( rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1115:2: rule__ItemAttr__Group__1__Impl rule__ItemAttr__Group__2
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12362);
            rule__ItemAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12365);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1122:1: rule__ItemAttr__Group__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_1 ) ) ;
    public final void rule__ItemAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1126:1: ( ( ( rule__ItemAttr__AttrsAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1127:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1127:1: ( ( rule__ItemAttr__AttrsAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1128:1: ( rule__ItemAttr__AttrsAssignment_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1129:1: ( rule__ItemAttr__AttrsAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1129:2: rule__ItemAttr__AttrsAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl2392);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1139:1: rule__ItemAttr__Group__2 : rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 ;
    public final void rule__ItemAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1143:1: ( rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1144:2: rule__ItemAttr__Group__2__Impl rule__ItemAttr__Group__3
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__22422);
            rule__ItemAttr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__22425);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1151:1: rule__ItemAttr__Group__2__Impl : ( ( rule__ItemAttr__Group_2__0 )* ) ;
    public final void rule__ItemAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1155:1: ( ( ( rule__ItemAttr__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1156:1: ( ( rule__ItemAttr__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1156:1: ( ( rule__ItemAttr__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1157:1: ( rule__ItemAttr__Group_2__0 )*
            {
             before(grammarAccess.getItemAttrAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1158:1: ( rule__ItemAttr__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1158:2: rule__ItemAttr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl2452);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1168:1: rule__ItemAttr__Group__3 : rule__ItemAttr__Group__3__Impl ;
    public final void rule__ItemAttr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1172:1: ( rule__ItemAttr__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1173:2: rule__ItemAttr__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__32483);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1179:1: rule__ItemAttr__Group__3__Impl : ( ']' ) ;
    public final void rule__ItemAttr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1183:1: ( ( ']' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1184:1: ( ']' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1184:1: ( ']' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1185:1: ']'
            {
             before(grammarAccess.getItemAttrAccess().getRightSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_46_in_rule__ItemAttr__Group__3__Impl2511); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1206:1: rule__ItemAttr__Group_2__0 : rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 ;
    public final void rule__ItemAttr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1210:1: ( rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1211:2: rule__ItemAttr__Group_2__0__Impl rule__ItemAttr__Group_2__1
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__02550);
            rule__ItemAttr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__02553);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1218:1: rule__ItemAttr__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ItemAttr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1222:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1223:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1223:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1224:1: ','
            {
             before(grammarAccess.getItemAttrAccess().getCommaKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__ItemAttr__Group_2__0__Impl2581); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1237:1: rule__ItemAttr__Group_2__1 : rule__ItemAttr__Group_2__1__Impl ;
    public final void rule__ItemAttr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1241:1: ( rule__ItemAttr__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1242:2: rule__ItemAttr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__12612);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1248:1: rule__ItemAttr__Group_2__1__Impl : ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) ;
    public final void rule__ItemAttr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1252:1: ( ( ( rule__ItemAttr__AttrsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1253:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1253:1: ( ( rule__ItemAttr__AttrsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1254:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1255:1: ( rule__ItemAttr__AttrsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1255:2: rule__ItemAttr__AttrsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl2639);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1269:1: rule__AttrWithList__Group__0 : rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 ;
    public final void rule__AttrWithList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1273:1: ( rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1274:2: rule__AttrWithList__Group__0__Impl rule__AttrWithList__Group__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__02673);
            rule__AttrWithList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__02676);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1281:1: rule__AttrWithList__Group__0__Impl : ( ( rule__AttrWithList__IdentAssignment_0 ) ) ;
    public final void rule__AttrWithList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1285:1: ( ( ( rule__AttrWithList__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1286:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1286:1: ( ( rule__AttrWithList__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1287:1: ( rule__AttrWithList__IdentAssignment_0 )
            {
             before(grammarAccess.getAttrWithListAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1288:1: ( rule__AttrWithList__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1288:2: rule__AttrWithList__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl2703);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1298:1: rule__AttrWithList__Group__1 : rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 ;
    public final void rule__AttrWithList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1302:1: ( rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1303:2: rule__AttrWithList__Group__1__Impl rule__AttrWithList__Group__2
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__12733);
            rule__AttrWithList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__12736);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1310:1: rule__AttrWithList__Group__1__Impl : ( '(' ) ;
    public final void rule__AttrWithList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1314:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1315:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1315:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1316:1: '('
            {
             before(grammarAccess.getAttrWithListAccess().getLeftParenthesisKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__AttrWithList__Group__1__Impl2764); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1329:1: rule__AttrWithList__Group__2 : rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 ;
    public final void rule__AttrWithList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1333:1: ( rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1334:2: rule__AttrWithList__Group__2__Impl rule__AttrWithList__Group__3
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__22795);
            rule__AttrWithList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__22798);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1341:1: rule__AttrWithList__Group__2__Impl : ( ( rule__AttrWithList__AttrsAssignment_2 ) ) ;
    public final void rule__AttrWithList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1345:1: ( ( ( rule__AttrWithList__AttrsAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1346:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1346:1: ( ( rule__AttrWithList__AttrsAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1347:1: ( rule__AttrWithList__AttrsAssignment_2 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1348:1: ( rule__AttrWithList__AttrsAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1348:2: rule__AttrWithList__AttrsAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl2825);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1358:1: rule__AttrWithList__Group__3 : rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 ;
    public final void rule__AttrWithList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1362:1: ( rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1363:2: rule__AttrWithList__Group__3__Impl rule__AttrWithList__Group__4
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__32855);
            rule__AttrWithList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__32858);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1370:1: rule__AttrWithList__Group__3__Impl : ( ( rule__AttrWithList__Group_3__0 )* ) ;
    public final void rule__AttrWithList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1374:1: ( ( ( rule__AttrWithList__Group_3__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1375:1: ( ( rule__AttrWithList__Group_3__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1375:1: ( ( rule__AttrWithList__Group_3__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1376:1: ( rule__AttrWithList__Group_3__0 )*
            {
             before(grammarAccess.getAttrWithListAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1377:1: ( rule__AttrWithList__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==47) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1377:2: rule__AttrWithList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl2885);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1387:1: rule__AttrWithList__Group__4 : rule__AttrWithList__Group__4__Impl ;
    public final void rule__AttrWithList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1391:1: ( rule__AttrWithList__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1392:2: rule__AttrWithList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__42916);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1398:1: rule__AttrWithList__Group__4__Impl : ( ')' ) ;
    public final void rule__AttrWithList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1402:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1403:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1403:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1404:1: ')'
            {
             before(grammarAccess.getAttrWithListAccess().getRightParenthesisKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__AttrWithList__Group__4__Impl2944); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1427:1: rule__AttrWithList__Group_3__0 : rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 ;
    public final void rule__AttrWithList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1431:1: ( rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1432:2: rule__AttrWithList__Group_3__0__Impl rule__AttrWithList__Group_3__1
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__02985);
            rule__AttrWithList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__02988);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1439:1: rule__AttrWithList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AttrWithList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1443:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1444:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1444:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1445:1: ','
            {
             before(grammarAccess.getAttrWithListAccess().getCommaKeyword_3_0()); 
            match(input,47,FOLLOW_47_in_rule__AttrWithList__Group_3__0__Impl3016); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1458:1: rule__AttrWithList__Group_3__1 : rule__AttrWithList__Group_3__1__Impl ;
    public final void rule__AttrWithList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1462:1: ( rule__AttrWithList__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1463:2: rule__AttrWithList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__13047);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1469:1: rule__AttrWithList__Group_3__1__Impl : ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) ;
    public final void rule__AttrWithList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1473:1: ( ( ( rule__AttrWithList__AttrsAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1474:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1474:1: ( ( rule__AttrWithList__AttrsAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1475:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1476:1: ( rule__AttrWithList__AttrsAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1476:2: rule__AttrWithList__AttrsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl3074);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1490:1: rule__LiteralAttr__Group__0 : rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 ;
    public final void rule__LiteralAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1494:1: ( rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1495:2: rule__LiteralAttr__Group__0__Impl rule__LiteralAttr__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__03108);
            rule__LiteralAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__03111);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1502:1: rule__LiteralAttr__Group__0__Impl : ( ( rule__LiteralAttr__IdentAssignment_0 ) ) ;
    public final void rule__LiteralAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1506:1: ( ( ( rule__LiteralAttr__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1507:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1507:1: ( ( rule__LiteralAttr__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1508:1: ( rule__LiteralAttr__IdentAssignment_0 )
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1509:1: ( rule__LiteralAttr__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1509:2: rule__LiteralAttr__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl3138);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1519:1: rule__LiteralAttr__Group__1 : rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 ;
    public final void rule__LiteralAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1523:1: ( rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1524:2: rule__LiteralAttr__Group__1__Impl rule__LiteralAttr__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__13168);
            rule__LiteralAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__13171);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1531:1: rule__LiteralAttr__Group__1__Impl : ( '=' ) ;
    public final void rule__LiteralAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1535:1: ( ( '=' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1536:1: ( '=' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1536:1: ( '=' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1537:1: '='
            {
             before(grammarAccess.getLiteralAttrAccess().getEqualsSignKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__LiteralAttr__Group__1__Impl3199); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1550:1: rule__LiteralAttr__Group__2 : rule__LiteralAttr__Group__2__Impl ;
    public final void rule__LiteralAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1554:1: ( rule__LiteralAttr__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1555:2: rule__LiteralAttr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23230);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1561:1: rule__LiteralAttr__Group__2__Impl : ( ( rule__LiteralAttr__ValueAssignment_2 ) ) ;
    public final void rule__LiteralAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1565:1: ( ( ( rule__LiteralAttr__ValueAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1566:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1566:1: ( ( rule__LiteralAttr__ValueAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1567:1: ( rule__LiteralAttr__ValueAssignment_2 )
            {
             before(grammarAccess.getLiteralAttrAccess().getValueAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1568:1: ( rule__LiteralAttr__ValueAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1568:2: rule__LiteralAttr__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3257);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1584:1: rule__ItemAndAttrs__Group__0 : rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 ;
    public final void rule__ItemAndAttrs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1588:1: ( rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1589:2: rule__ItemAndAttrs__Group__0__Impl rule__ItemAndAttrs__Group__1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03293);
            rule__ItemAndAttrs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03296);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1596:1: rule__ItemAndAttrs__Group__0__Impl : ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) ;
    public final void rule__ItemAndAttrs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1600:1: ( ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1601:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1601:1: ( ( rule__ItemAndAttrs__AttrsAssignment_0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1602:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1603:1: ( rule__ItemAndAttrs__AttrsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1603:2: rule__ItemAndAttrs__AttrsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3323);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1613:1: rule__ItemAndAttrs__Group__1 : rule__ItemAndAttrs__Group__1__Impl ;
    public final void rule__ItemAndAttrs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1617:1: ( rule__ItemAndAttrs__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1618:2: rule__ItemAndAttrs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13354);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1624:1: rule__ItemAndAttrs__Group__1__Impl : ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) ;
    public final void rule__ItemAndAttrs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1628:1: ( ( ( rule__ItemAndAttrs__ItemAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1629:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1629:1: ( ( rule__ItemAndAttrs__ItemAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1630:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1631:1: ( rule__ItemAndAttrs__ItemAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1631:2: rule__ItemAndAttrs__ItemAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3381);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1645:1: rule__ModItem__Group__0 : rule__ModItem__Group__0__Impl rule__ModItem__Group__1 ;
    public final void rule__ModItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1649:1: ( rule__ModItem__Group__0__Impl rule__ModItem__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1650:2: rule__ModItem__Group__0__Impl rule__ModItem__Group__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__03415);
            rule__ModItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__03418);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1657:1: rule__ModItem__Group__0__Impl : ( 'mod' ) ;
    public final void rule__ModItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1661:1: ( ( 'mod' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1662:1: ( 'mod' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1662:1: ( 'mod' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1663:1: 'mod'
            {
             before(grammarAccess.getModItemAccess().getModKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__ModItem__Group__0__Impl3446); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1676:1: rule__ModItem__Group__1 : rule__ModItem__Group__1__Impl rule__ModItem__Group__2 ;
    public final void rule__ModItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1680:1: ( rule__ModItem__Group__1__Impl rule__ModItem__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1681:2: rule__ModItem__Group__1__Impl rule__ModItem__Group__2
            {
            pushFollow(FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__13477);
            rule__ModItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__13480);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1688:1: rule__ModItem__Group__1__Impl : ( ( rule__ModItem__IdentAssignment_1 ) ) ;
    public final void rule__ModItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1692:1: ( ( ( rule__ModItem__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1693:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1693:1: ( ( rule__ModItem__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1694:1: ( rule__ModItem__IdentAssignment_1 )
            {
             before(grammarAccess.getModItemAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1695:1: ( rule__ModItem__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1695:2: rule__ModItem__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl3507);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1705:1: rule__ModItem__Group__2 : rule__ModItem__Group__2__Impl ;
    public final void rule__ModItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1709:1: ( rule__ModItem__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1710:2: rule__ModItem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__23537);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1716:1: rule__ModItem__Group__2__Impl : ( ( rule__ModItem__Alternatives_2 ) ) ;
    public final void rule__ModItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1720:1: ( ( ( rule__ModItem__Alternatives_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1721:1: ( ( rule__ModItem__Alternatives_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1721:1: ( ( rule__ModItem__Alternatives_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1722:1: ( rule__ModItem__Alternatives_2 )
            {
             before(grammarAccess.getModItemAccess().getAlternatives_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1723:1: ( rule__ModItem__Alternatives_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1723:2: rule__ModItem__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl3564);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1739:1: rule__ModItem__Group_2_1__0 : rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 ;
    public final void rule__ModItem__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1743:1: ( rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1744:2: rule__ModItem__Group_2_1__0__Impl rule__ModItem__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__03600);
            rule__ModItem__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__03603);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1751:1: rule__ModItem__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__ModItem__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1755:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1756:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1756:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1757:1: '{'
            {
             before(grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,52,FOLLOW_52_in_rule__ModItem__Group_2_1__0__Impl3631); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1770:1: rule__ModItem__Group_2_1__1 : rule__ModItem__Group_2_1__1__Impl rule__ModItem__Group_2_1__2 ;
    public final void rule__ModItem__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1774:1: ( rule__ModItem__Group_2_1__1__Impl rule__ModItem__Group_2_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1775:2: rule__ModItem__Group_2_1__1__Impl rule__ModItem__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__13662);
            rule__ModItem__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModItem__Group_2_1__2_in_rule__ModItem__Group_2_1__13665);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1782:1: rule__ModItem__Group_2_1__1__Impl : ( ( rule__ModItem__ItemsAssignment_2_1_1 )* ) ;
    public final void rule__ModItem__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1786:1: ( ( ( rule__ModItem__ItemsAssignment_2_1_1 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1787:1: ( ( rule__ModItem__ItemsAssignment_2_1_1 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1787:1: ( ( rule__ModItem__ItemsAssignment_2_1_1 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1788:1: ( rule__ModItem__ItemsAssignment_2_1_1 )*
            {
             before(grammarAccess.getModItemAccess().getItemsAssignment_2_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1789:1: ( rule__ModItem__ItemsAssignment_2_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==45||LA14_0==51||LA14_0==54) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1789:2: rule__ModItem__ItemsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ModItem__ItemsAssignment_2_1_1_in_rule__ModItem__Group_2_1__1__Impl3692);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1799:1: rule__ModItem__Group_2_1__2 : rule__ModItem__Group_2_1__2__Impl ;
    public final void rule__ModItem__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1803:1: ( rule__ModItem__Group_2_1__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1804:2: rule__ModItem__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ModItem__Group_2_1__2__Impl_in_rule__ModItem__Group_2_1__23723);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1810:1: rule__ModItem__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__ModItem__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1814:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1815:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1815:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1816:1: '}'
            {
             before(grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,53,FOLLOW_53_in_rule__ModItem__Group_2_1__2__Impl3751); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1835:1: rule__FnItem__Group__0 : rule__FnItem__Group__0__Impl rule__FnItem__Group__1 ;
    public final void rule__FnItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1839:1: ( rule__FnItem__Group__0__Impl rule__FnItem__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1840:2: rule__FnItem__Group__0__Impl rule__FnItem__Group__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group__0__Impl_in_rule__FnItem__Group__03788);
            rule__FnItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__1_in_rule__FnItem__Group__03791);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1847:1: rule__FnItem__Group__0__Impl : ( 'fn' ) ;
    public final void rule__FnItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1851:1: ( ( 'fn' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1852:1: ( 'fn' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1852:1: ( 'fn' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1853:1: 'fn'
            {
             before(grammarAccess.getFnItemAccess().getFnKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__FnItem__Group__0__Impl3819); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1866:1: rule__FnItem__Group__1 : rule__FnItem__Group__1__Impl rule__FnItem__Group__2 ;
    public final void rule__FnItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1870:1: ( rule__FnItem__Group__1__Impl rule__FnItem__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1871:2: rule__FnItem__Group__1__Impl rule__FnItem__Group__2
            {
            pushFollow(FOLLOW_rule__FnItem__Group__1__Impl_in_rule__FnItem__Group__13850);
            rule__FnItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__2_in_rule__FnItem__Group__13853);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1878:1: rule__FnItem__Group__1__Impl : ( ( rule__FnItem__IdentAssignment_1 ) ) ;
    public final void rule__FnItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1882:1: ( ( ( rule__FnItem__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1883:1: ( ( rule__FnItem__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1883:1: ( ( rule__FnItem__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1884:1: ( rule__FnItem__IdentAssignment_1 )
            {
             before(grammarAccess.getFnItemAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1885:1: ( rule__FnItem__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1885:2: rule__FnItem__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__FnItem__IdentAssignment_1_in_rule__FnItem__Group__1__Impl3880);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1895:1: rule__FnItem__Group__2 : rule__FnItem__Group__2__Impl rule__FnItem__Group__3 ;
    public final void rule__FnItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1899:1: ( rule__FnItem__Group__2__Impl rule__FnItem__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1900:2: rule__FnItem__Group__2__Impl rule__FnItem__Group__3
            {
            pushFollow(FOLLOW_rule__FnItem__Group__2__Impl_in_rule__FnItem__Group__23910);
            rule__FnItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__3_in_rule__FnItem__Group__23913);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1907:1: rule__FnItem__Group__2__Impl : ( ( rule__FnItem__Group_2__0 )? ) ;
    public final void rule__FnItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1911:1: ( ( ( rule__FnItem__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1912:1: ( ( rule__FnItem__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1912:1: ( ( rule__FnItem__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1913:1: ( rule__FnItem__Group_2__0 )?
            {
             before(grammarAccess.getFnItemAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1914:1: ( rule__FnItem__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==55) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1914:2: rule__FnItem__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FnItem__Group_2__0_in_rule__FnItem__Group__2__Impl3940);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1924:1: rule__FnItem__Group__3 : rule__FnItem__Group__3__Impl rule__FnItem__Group__4 ;
    public final void rule__FnItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1928:1: ( rule__FnItem__Group__3__Impl rule__FnItem__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1929:2: rule__FnItem__Group__3__Impl rule__FnItem__Group__4
            {
            pushFollow(FOLLOW_rule__FnItem__Group__3__Impl_in_rule__FnItem__Group__33971);
            rule__FnItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__4_in_rule__FnItem__Group__33974);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1936:1: rule__FnItem__Group__3__Impl : ( '(' ) ;
    public final void rule__FnItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1940:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1941:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1941:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1942:1: '('
            {
             before(grammarAccess.getFnItemAccess().getLeftParenthesisKeyword_3()); 
            match(input,48,FOLLOW_48_in_rule__FnItem__Group__3__Impl4002); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1955:1: rule__FnItem__Group__4 : rule__FnItem__Group__4__Impl rule__FnItem__Group__5 ;
    public final void rule__FnItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1959:1: ( rule__FnItem__Group__4__Impl rule__FnItem__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1960:2: rule__FnItem__Group__4__Impl rule__FnItem__Group__5
            {
            pushFollow(FOLLOW_rule__FnItem__Group__4__Impl_in_rule__FnItem__Group__44033);
            rule__FnItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__5_in_rule__FnItem__Group__44036);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1967:1: rule__FnItem__Group__4__Impl : ( ( rule__FnItem__Group_4__0 )? ) ;
    public final void rule__FnItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1971:1: ( ( ( rule__FnItem__Group_4__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1972:1: ( ( rule__FnItem__Group_4__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1972:1: ( ( rule__FnItem__Group_4__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1973:1: ( rule__FnItem__Group_4__0 )?
            {
             before(grammarAccess.getFnItemAccess().getGroup_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1974:1: ( rule__FnItem__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IDENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1974:2: rule__FnItem__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FnItem__Group_4__0_in_rule__FnItem__Group__4__Impl4063);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1984:1: rule__FnItem__Group__5 : rule__FnItem__Group__5__Impl rule__FnItem__Group__6 ;
    public final void rule__FnItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1988:1: ( rule__FnItem__Group__5__Impl rule__FnItem__Group__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1989:2: rule__FnItem__Group__5__Impl rule__FnItem__Group__6
            {
            pushFollow(FOLLOW_rule__FnItem__Group__5__Impl_in_rule__FnItem__Group__54094);
            rule__FnItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__6_in_rule__FnItem__Group__54097);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1996:1: rule__FnItem__Group__5__Impl : ( ')' ) ;
    public final void rule__FnItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2000:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2001:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2001:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2002:1: ')'
            {
             before(grammarAccess.getFnItemAccess().getRightParenthesisKeyword_5()); 
            match(input,49,FOLLOW_49_in_rule__FnItem__Group__5__Impl4125); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2015:1: rule__FnItem__Group__6 : rule__FnItem__Group__6__Impl rule__FnItem__Group__7 ;
    public final void rule__FnItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2019:1: ( rule__FnItem__Group__6__Impl rule__FnItem__Group__7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2020:2: rule__FnItem__Group__6__Impl rule__FnItem__Group__7
            {
            pushFollow(FOLLOW_rule__FnItem__Group__6__Impl_in_rule__FnItem__Group__64156);
            rule__FnItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group__7_in_rule__FnItem__Group__64159);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2027:1: rule__FnItem__Group__6__Impl : ( ( rule__FnItem__Group_6__0 )? ) ;
    public final void rule__FnItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2031:1: ( ( ( rule__FnItem__Group_6__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2032:1: ( ( rule__FnItem__Group_6__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2032:1: ( ( rule__FnItem__Group_6__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2033:1: ( rule__FnItem__Group_6__0 )?
            {
             before(grammarAccess.getFnItemAccess().getGroup_6()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2034:1: ( rule__FnItem__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==57) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2034:2: rule__FnItem__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__FnItem__Group_6__0_in_rule__FnItem__Group__6__Impl4186);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2044:1: rule__FnItem__Group__7 : rule__FnItem__Group__7__Impl ;
    public final void rule__FnItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2048:1: ( rule__FnItem__Group__7__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2049:2: rule__FnItem__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group__7__Impl_in_rule__FnItem__Group__74217);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2055:1: rule__FnItem__Group__7__Impl : ( ( rule__FnItem__BodyAssignment_7 ) ) ;
    public final void rule__FnItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2059:1: ( ( ( rule__FnItem__BodyAssignment_7 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2060:1: ( ( rule__FnItem__BodyAssignment_7 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2060:1: ( ( rule__FnItem__BodyAssignment_7 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2061:1: ( rule__FnItem__BodyAssignment_7 )
            {
             before(grammarAccess.getFnItemAccess().getBodyAssignment_7()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2062:1: ( rule__FnItem__BodyAssignment_7 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2062:2: rule__FnItem__BodyAssignment_7
            {
            pushFollow(FOLLOW_rule__FnItem__BodyAssignment_7_in_rule__FnItem__Group__7__Impl4244);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2088:1: rule__FnItem__Group_2__0 : rule__FnItem__Group_2__0__Impl rule__FnItem__Group_2__1 ;
    public final void rule__FnItem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2092:1: ( rule__FnItem__Group_2__0__Impl rule__FnItem__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2093:2: rule__FnItem__Group_2__0__Impl rule__FnItem__Group_2__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__0__Impl_in_rule__FnItem__Group_2__04290);
            rule__FnItem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2__1_in_rule__FnItem__Group_2__04293);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2100:1: rule__FnItem__Group_2__0__Impl : ( '<' ) ;
    public final void rule__FnItem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2104:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2105:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2105:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2106:1: '<'
            {
             before(grammarAccess.getFnItemAccess().getLessThanSignKeyword_2_0()); 
            match(input,55,FOLLOW_55_in_rule__FnItem__Group_2__0__Impl4321); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2119:1: rule__FnItem__Group_2__1 : rule__FnItem__Group_2__1__Impl rule__FnItem__Group_2__2 ;
    public final void rule__FnItem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2123:1: ( rule__FnItem__Group_2__1__Impl rule__FnItem__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2124:2: rule__FnItem__Group_2__1__Impl rule__FnItem__Group_2__2
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__1__Impl_in_rule__FnItem__Group_2__14352);
            rule__FnItem__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2__2_in_rule__FnItem__Group_2__14355);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2131:1: rule__FnItem__Group_2__1__Impl : ( ( rule__FnItem__ParamsAssignment_2_1 ) ) ;
    public final void rule__FnItem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2135:1: ( ( ( rule__FnItem__ParamsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2136:1: ( ( rule__FnItem__ParamsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2136:1: ( ( rule__FnItem__ParamsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2137:1: ( rule__FnItem__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getFnItemAccess().getParamsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2138:1: ( rule__FnItem__ParamsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2138:2: rule__FnItem__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FnItem__ParamsAssignment_2_1_in_rule__FnItem__Group_2__1__Impl4382);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2148:1: rule__FnItem__Group_2__2 : rule__FnItem__Group_2__2__Impl rule__FnItem__Group_2__3 ;
    public final void rule__FnItem__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2152:1: ( rule__FnItem__Group_2__2__Impl rule__FnItem__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2153:2: rule__FnItem__Group_2__2__Impl rule__FnItem__Group_2__3
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__2__Impl_in_rule__FnItem__Group_2__24412);
            rule__FnItem__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2__3_in_rule__FnItem__Group_2__24415);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2160:1: rule__FnItem__Group_2__2__Impl : ( ( rule__FnItem__Group_2_2__0 )* ) ;
    public final void rule__FnItem__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2164:1: ( ( ( rule__FnItem__Group_2_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2165:1: ( ( rule__FnItem__Group_2_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2165:1: ( ( rule__FnItem__Group_2_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2166:1: ( rule__FnItem__Group_2_2__0 )*
            {
             before(grammarAccess.getFnItemAccess().getGroup_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2167:1: ( rule__FnItem__Group_2_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==47) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2167:2: rule__FnItem__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FnItem__Group_2_2__0_in_rule__FnItem__Group_2__2__Impl4442);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2177:1: rule__FnItem__Group_2__3 : rule__FnItem__Group_2__3__Impl ;
    public final void rule__FnItem__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2181:1: ( rule__FnItem__Group_2__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2182:2: rule__FnItem__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2__3__Impl_in_rule__FnItem__Group_2__34473);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2188:1: rule__FnItem__Group_2__3__Impl : ( '>' ) ;
    public final void rule__FnItem__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2192:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2193:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2193:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2194:1: '>'
            {
             before(grammarAccess.getFnItemAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,56,FOLLOW_56_in_rule__FnItem__Group_2__3__Impl4501); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2215:1: rule__FnItem__Group_2_2__0 : rule__FnItem__Group_2_2__0__Impl rule__FnItem__Group_2_2__1 ;
    public final void rule__FnItem__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2219:1: ( rule__FnItem__Group_2_2__0__Impl rule__FnItem__Group_2_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2220:2: rule__FnItem__Group_2_2__0__Impl rule__FnItem__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2_2__0__Impl_in_rule__FnItem__Group_2_2__04540);
            rule__FnItem__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_2_2__1_in_rule__FnItem__Group_2_2__04543);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2227:1: rule__FnItem__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FnItem__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2231:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2232:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2232:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2233:1: ','
            {
             before(grammarAccess.getFnItemAccess().getCommaKeyword_2_2_0()); 
            match(input,47,FOLLOW_47_in_rule__FnItem__Group_2_2__0__Impl4571); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2246:1: rule__FnItem__Group_2_2__1 : rule__FnItem__Group_2_2__1__Impl ;
    public final void rule__FnItem__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2250:1: ( rule__FnItem__Group_2_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2251:2: rule__FnItem__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_2_2__1__Impl_in_rule__FnItem__Group_2_2__14602);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2257:1: rule__FnItem__Group_2_2__1__Impl : ( ( rule__FnItem__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__FnItem__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2261:1: ( ( ( rule__FnItem__ParamsAssignment_2_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2262:1: ( ( rule__FnItem__ParamsAssignment_2_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2262:1: ( ( rule__FnItem__ParamsAssignment_2_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2263:1: ( rule__FnItem__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getFnItemAccess().getParamsAssignment_2_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2264:1: ( rule__FnItem__ParamsAssignment_2_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2264:2: rule__FnItem__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__FnItem__ParamsAssignment_2_2_1_in_rule__FnItem__Group_2_2__1__Impl4629);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2278:1: rule__FnItem__Group_4__0 : rule__FnItem__Group_4__0__Impl rule__FnItem__Group_4__1 ;
    public final void rule__FnItem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2282:1: ( rule__FnItem__Group_4__0__Impl rule__FnItem__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2283:2: rule__FnItem__Group_4__0__Impl rule__FnItem__Group_4__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4__0__Impl_in_rule__FnItem__Group_4__04663);
            rule__FnItem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_4__1_in_rule__FnItem__Group_4__04666);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2290:1: rule__FnItem__Group_4__0__Impl : ( ( rule__FnItem__ArgsAssignment_4_0 ) ) ;
    public final void rule__FnItem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2294:1: ( ( ( rule__FnItem__ArgsAssignment_4_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2295:1: ( ( rule__FnItem__ArgsAssignment_4_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2295:1: ( ( rule__FnItem__ArgsAssignment_4_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2296:1: ( rule__FnItem__ArgsAssignment_4_0 )
            {
             before(grammarAccess.getFnItemAccess().getArgsAssignment_4_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2297:1: ( rule__FnItem__ArgsAssignment_4_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2297:2: rule__FnItem__ArgsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__FnItem__ArgsAssignment_4_0_in_rule__FnItem__Group_4__0__Impl4693);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2307:1: rule__FnItem__Group_4__1 : rule__FnItem__Group_4__1__Impl ;
    public final void rule__FnItem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2311:1: ( rule__FnItem__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2312:2: rule__FnItem__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4__1__Impl_in_rule__FnItem__Group_4__14723);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2318:1: rule__FnItem__Group_4__1__Impl : ( ( rule__FnItem__Group_4_1__0 )* ) ;
    public final void rule__FnItem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2322:1: ( ( ( rule__FnItem__Group_4_1__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2323:1: ( ( rule__FnItem__Group_4_1__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2323:1: ( ( rule__FnItem__Group_4_1__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2324:1: ( rule__FnItem__Group_4_1__0 )*
            {
             before(grammarAccess.getFnItemAccess().getGroup_4_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2325:1: ( rule__FnItem__Group_4_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==47) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2325:2: rule__FnItem__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FnItem__Group_4_1__0_in_rule__FnItem__Group_4__1__Impl4750);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2339:1: rule__FnItem__Group_4_1__0 : rule__FnItem__Group_4_1__0__Impl rule__FnItem__Group_4_1__1 ;
    public final void rule__FnItem__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2343:1: ( rule__FnItem__Group_4_1__0__Impl rule__FnItem__Group_4_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2344:2: rule__FnItem__Group_4_1__0__Impl rule__FnItem__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4_1__0__Impl_in_rule__FnItem__Group_4_1__04785);
            rule__FnItem__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_4_1__1_in_rule__FnItem__Group_4_1__04788);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2351:1: rule__FnItem__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__FnItem__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2355:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2356:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2356:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2357:1: ','
            {
             before(grammarAccess.getFnItemAccess().getCommaKeyword_4_1_0()); 
            match(input,47,FOLLOW_47_in_rule__FnItem__Group_4_1__0__Impl4816); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2370:1: rule__FnItem__Group_4_1__1 : rule__FnItem__Group_4_1__1__Impl ;
    public final void rule__FnItem__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2374:1: ( rule__FnItem__Group_4_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2375:2: rule__FnItem__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_4_1__1__Impl_in_rule__FnItem__Group_4_1__14847);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2381:1: rule__FnItem__Group_4_1__1__Impl : ( ( rule__FnItem__ArgsAssignment_4_1_1 ) ) ;
    public final void rule__FnItem__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2385:1: ( ( ( rule__FnItem__ArgsAssignment_4_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2386:1: ( ( rule__FnItem__ArgsAssignment_4_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2386:1: ( ( rule__FnItem__ArgsAssignment_4_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2387:1: ( rule__FnItem__ArgsAssignment_4_1_1 )
            {
             before(grammarAccess.getFnItemAccess().getArgsAssignment_4_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2388:1: ( rule__FnItem__ArgsAssignment_4_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2388:2: rule__FnItem__ArgsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__FnItem__ArgsAssignment_4_1_1_in_rule__FnItem__Group_4_1__1__Impl4874);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2402:1: rule__FnItem__Group_6__0 : rule__FnItem__Group_6__0__Impl rule__FnItem__Group_6__1 ;
    public final void rule__FnItem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2406:1: ( rule__FnItem__Group_6__0__Impl rule__FnItem__Group_6__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2407:2: rule__FnItem__Group_6__0__Impl rule__FnItem__Group_6__1
            {
            pushFollow(FOLLOW_rule__FnItem__Group_6__0__Impl_in_rule__FnItem__Group_6__04908);
            rule__FnItem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FnItem__Group_6__1_in_rule__FnItem__Group_6__04911);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2414:1: rule__FnItem__Group_6__0__Impl : ( '->' ) ;
    public final void rule__FnItem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2418:1: ( ( '->' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2419:1: ( '->' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2419:1: ( '->' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2420:1: '->'
            {
             before(grammarAccess.getFnItemAccess().getHyphenMinusGreaterThanSignKeyword_6_0()); 
            match(input,57,FOLLOW_57_in_rule__FnItem__Group_6__0__Impl4939); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2433:1: rule__FnItem__Group_6__1 : rule__FnItem__Group_6__1__Impl ;
    public final void rule__FnItem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2437:1: ( rule__FnItem__Group_6__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2438:2: rule__FnItem__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__FnItem__Group_6__1__Impl_in_rule__FnItem__Group_6__14970);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2444:1: rule__FnItem__Group_6__1__Impl : ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) ) ;
    public final void rule__FnItem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2448:1: ( ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2449:1: ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2449:1: ( ( rule__FnItem__ReturnTypeAssignment_6_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2450:1: ( rule__FnItem__ReturnTypeAssignment_6_1 )
            {
             before(grammarAccess.getFnItemAccess().getReturnTypeAssignment_6_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2451:1: ( rule__FnItem__ReturnTypeAssignment_6_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2451:2: rule__FnItem__ReturnTypeAssignment_6_1
            {
            pushFollow(FOLLOW_rule__FnItem__ReturnTypeAssignment_6_1_in_rule__FnItem__Group_6__1__Impl4997);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2465:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2469:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2470:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05031);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05034);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2477:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2481:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2482:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2482:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2483:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Block__Group__0__Impl5062); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2496:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2500:1: ( rule__Block__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2501:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15093);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2507:1: rule__Block__Group__1__Impl : ( '}' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2511:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2512:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2512:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2513:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__Block__Group__1__Impl5121); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2530:1: rule__GenericParamDecl__Group__0 : rule__GenericParamDecl__Group__0__Impl rule__GenericParamDecl__Group__1 ;
    public final void rule__GenericParamDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2534:1: ( rule__GenericParamDecl__Group__0__Impl rule__GenericParamDecl__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2535:2: rule__GenericParamDecl__Group__0__Impl rule__GenericParamDecl__Group__1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group__0__Impl_in_rule__GenericParamDecl__Group__05156);
            rule__GenericParamDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group__1_in_rule__GenericParamDecl__Group__05159);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2542:1: rule__GenericParamDecl__Group__0__Impl : ( ( rule__GenericParamDecl__IdentAssignment_0 ) ) ;
    public final void rule__GenericParamDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2546:1: ( ( ( rule__GenericParamDecl__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2547:1: ( ( rule__GenericParamDecl__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2547:1: ( ( rule__GenericParamDecl__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2548:1: ( rule__GenericParamDecl__IdentAssignment_0 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2549:1: ( rule__GenericParamDecl__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2549:2: rule__GenericParamDecl__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__IdentAssignment_0_in_rule__GenericParamDecl__Group__0__Impl5186);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2559:1: rule__GenericParamDecl__Group__1 : rule__GenericParamDecl__Group__1__Impl ;
    public final void rule__GenericParamDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2563:1: ( rule__GenericParamDecl__Group__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2564:2: rule__GenericParamDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group__1__Impl_in_rule__GenericParamDecl__Group__15216);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2570:1: rule__GenericParamDecl__Group__1__Impl : ( ( rule__GenericParamDecl__Group_1__0 )? ) ;
    public final void rule__GenericParamDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2574:1: ( ( ( rule__GenericParamDecl__Group_1__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2575:1: ( ( rule__GenericParamDecl__Group_1__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2575:1: ( ( rule__GenericParamDecl__Group_1__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2576:1: ( rule__GenericParamDecl__Group_1__0 )?
            {
             before(grammarAccess.getGenericParamDeclAccess().getGroup_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2577:1: ( rule__GenericParamDecl__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2577:2: rule__GenericParamDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__0_in_rule__GenericParamDecl__Group__1__Impl5243);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2591:1: rule__GenericParamDecl__Group_1__0 : rule__GenericParamDecl__Group_1__0__Impl rule__GenericParamDecl__Group_1__1 ;
    public final void rule__GenericParamDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2595:1: ( rule__GenericParamDecl__Group_1__0__Impl rule__GenericParamDecl__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2596:2: rule__GenericParamDecl__Group_1__0__Impl rule__GenericParamDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__0__Impl_in_rule__GenericParamDecl__Group_1__05278);
            rule__GenericParamDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__1_in_rule__GenericParamDecl__Group_1__05281);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2603:1: rule__GenericParamDecl__Group_1__0__Impl : ( ':' ) ;
    public final void rule__GenericParamDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2607:1: ( ( ':' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2608:1: ( ':' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2608:1: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2609:1: ':'
            {
             before(grammarAccess.getGenericParamDeclAccess().getColonKeyword_1_0()); 
            match(input,58,FOLLOW_58_in_rule__GenericParamDecl__Group_1__0__Impl5309); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2622:1: rule__GenericParamDecl__Group_1__1 : rule__GenericParamDecl__Group_1__1__Impl rule__GenericParamDecl__Group_1__2 ;
    public final void rule__GenericParamDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2626:1: ( rule__GenericParamDecl__Group_1__1__Impl rule__GenericParamDecl__Group_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2627:2: rule__GenericParamDecl__Group_1__1__Impl rule__GenericParamDecl__Group_1__2
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__1__Impl_in_rule__GenericParamDecl__Group_1__15340);
            rule__GenericParamDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__2_in_rule__GenericParamDecl__Group_1__15343);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2634:1: rule__GenericParamDecl__Group_1__1__Impl : ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) ) ;
    public final void rule__GenericParamDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2638:1: ( ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2639:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2639:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2640:1: ( rule__GenericParamDecl__BoundsAssignment_1_1 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2641:1: ( rule__GenericParamDecl__BoundsAssignment_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2641:2: rule__GenericParamDecl__BoundsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_1_in_rule__GenericParamDecl__Group_1__1__Impl5370);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2651:1: rule__GenericParamDecl__Group_1__2 : rule__GenericParamDecl__Group_1__2__Impl ;
    public final void rule__GenericParamDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2655:1: ( rule__GenericParamDecl__Group_1__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2656:2: rule__GenericParamDecl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1__2__Impl_in_rule__GenericParamDecl__Group_1__25400);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2662:1: rule__GenericParamDecl__Group_1__2__Impl : ( ( rule__GenericParamDecl__Group_1_2__0 ) ) ;
    public final void rule__GenericParamDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2666:1: ( ( ( rule__GenericParamDecl__Group_1_2__0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2667:1: ( ( rule__GenericParamDecl__Group_1_2__0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2667:1: ( ( rule__GenericParamDecl__Group_1_2__0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2668:1: ( rule__GenericParamDecl__Group_1_2__0 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getGroup_1_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2669:1: ( rule__GenericParamDecl__Group_1_2__0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2669:2: rule__GenericParamDecl__Group_1_2__0
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__0_in_rule__GenericParamDecl__Group_1__2__Impl5427);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2685:1: rule__GenericParamDecl__Group_1_2__0 : rule__GenericParamDecl__Group_1_2__0__Impl rule__GenericParamDecl__Group_1_2__1 ;
    public final void rule__GenericParamDecl__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2689:1: ( rule__GenericParamDecl__Group_1_2__0__Impl rule__GenericParamDecl__Group_1_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2690:2: rule__GenericParamDecl__Group_1_2__0__Impl rule__GenericParamDecl__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__0__Impl_in_rule__GenericParamDecl__Group_1_2__05463);
            rule__GenericParamDecl__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__1_in_rule__GenericParamDecl__Group_1_2__05466);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2697:1: rule__GenericParamDecl__Group_1_2__0__Impl : ( '+' ) ;
    public final void rule__GenericParamDecl__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2701:1: ( ( '+' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2702:1: ( '+' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2702:1: ( '+' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2703:1: '+'
            {
             before(grammarAccess.getGenericParamDeclAccess().getPlusSignKeyword_1_2_0()); 
            match(input,59,FOLLOW_59_in_rule__GenericParamDecl__Group_1_2__0__Impl5494); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2716:1: rule__GenericParamDecl__Group_1_2__1 : rule__GenericParamDecl__Group_1_2__1__Impl ;
    public final void rule__GenericParamDecl__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2720:1: ( rule__GenericParamDecl__Group_1_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2721:2: rule__GenericParamDecl__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__Group_1_2__1__Impl_in_rule__GenericParamDecl__Group_1_2__15525);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2727:1: rule__GenericParamDecl__Group_1_2__1__Impl : ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) ) ;
    public final void rule__GenericParamDecl__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2731:1: ( ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2732:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2732:1: ( ( rule__GenericParamDecl__BoundsAssignment_1_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2733:1: ( rule__GenericParamDecl__BoundsAssignment_1_2_1 )
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsAssignment_1_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2734:1: ( rule__GenericParamDecl__BoundsAssignment_1_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2734:2: rule__GenericParamDecl__BoundsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_2_1_in_rule__GenericParamDecl__Group_1_2__1__Impl5552);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2748:1: rule__Arg__Group__0 : rule__Arg__Group__0__Impl rule__Arg__Group__1 ;
    public final void rule__Arg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2752:1: ( rule__Arg__Group__0__Impl rule__Arg__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2753:2: rule__Arg__Group__0__Impl rule__Arg__Group__1
            {
            pushFollow(FOLLOW_rule__Arg__Group__0__Impl_in_rule__Arg__Group__05586);
            rule__Arg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__1_in_rule__Arg__Group__05589);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2760:1: rule__Arg__Group__0__Impl : ( ( rule__Arg__PatAssignment_0 ) ) ;
    public final void rule__Arg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2764:1: ( ( ( rule__Arg__PatAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2765:1: ( ( rule__Arg__PatAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2765:1: ( ( rule__Arg__PatAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2766:1: ( rule__Arg__PatAssignment_0 )
            {
             before(grammarAccess.getArgAccess().getPatAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2767:1: ( rule__Arg__PatAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2767:2: rule__Arg__PatAssignment_0
            {
            pushFollow(FOLLOW_rule__Arg__PatAssignment_0_in_rule__Arg__Group__0__Impl5616);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2777:1: rule__Arg__Group__1 : rule__Arg__Group__1__Impl rule__Arg__Group__2 ;
    public final void rule__Arg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2781:1: ( rule__Arg__Group__1__Impl rule__Arg__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2782:2: rule__Arg__Group__1__Impl rule__Arg__Group__2
            {
            pushFollow(FOLLOW_rule__Arg__Group__1__Impl_in_rule__Arg__Group__15646);
            rule__Arg__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__2_in_rule__Arg__Group__15649);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2789:1: rule__Arg__Group__1__Impl : ( ':' ) ;
    public final void rule__Arg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2793:1: ( ( ':' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2794:1: ( ':' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2794:1: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2795:1: ':'
            {
             before(grammarAccess.getArgAccess().getColonKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__Arg__Group__1__Impl5677); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2808:1: rule__Arg__Group__2 : rule__Arg__Group__2__Impl ;
    public final void rule__Arg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2812:1: ( rule__Arg__Group__2__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2813:2: rule__Arg__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Arg__Group__2__Impl_in_rule__Arg__Group__25708);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2819:1: rule__Arg__Group__2__Impl : ( ( rule__Arg__TypeAssignment_2 ) ) ;
    public final void rule__Arg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2823:1: ( ( ( rule__Arg__TypeAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2824:1: ( ( rule__Arg__TypeAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2824:1: ( ( rule__Arg__TypeAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2825:1: ( rule__Arg__TypeAssignment_2 )
            {
             before(grammarAccess.getArgAccess().getTypeAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2826:1: ( rule__Arg__TypeAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2826:2: rule__Arg__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Arg__TypeAssignment_2_in_rule__Arg__Group__2__Impl5735);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2842:1: rule__PrimitiveType__Group_0__0 : rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1 ;
    public final void rule__PrimitiveType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2846:1: ( rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2847:2: rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_0__0__Impl_in_rule__PrimitiveType__Group_0__05771);
            rule__PrimitiveType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_0__1_in_rule__PrimitiveType__Group_0__05774);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2854:1: rule__PrimitiveType__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2858:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2859:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2859:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2860:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getIntTypeAction_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2861:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2863:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2873:1: rule__PrimitiveType__Group_0__1 : rule__PrimitiveType__Group_0__1__Impl ;
    public final void rule__PrimitiveType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2877:1: ( rule__PrimitiveType__Group_0__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2878:2: rule__PrimitiveType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_0__1__Impl_in_rule__PrimitiveType__Group_0__15832);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2884:1: rule__PrimitiveType__Group_0__1__Impl : ( RULE_INT_TYPE ) ;
    public final void rule__PrimitiveType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2888:1: ( ( RULE_INT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2889:1: ( RULE_INT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2889:1: ( RULE_INT_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2890:1: RULE_INT_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getINT_TYPETerminalRuleCall_0_1()); 
            match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rule__PrimitiveType__Group_0__1__Impl5859); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2905:1: rule__PrimitiveType__Group_1__0 : rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 ;
    public final void rule__PrimitiveType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2909:1: ( rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2910:2: rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1__0__Impl_in_rule__PrimitiveType__Group_1__05892);
            rule__PrimitiveType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_1__1_in_rule__PrimitiveType__Group_1__05895);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2917:1: rule__PrimitiveType__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2921:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2922:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2922:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2923:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getFloatTypeAction_1_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2924:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2926:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2936:1: rule__PrimitiveType__Group_1__1 : rule__PrimitiveType__Group_1__1__Impl ;
    public final void rule__PrimitiveType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2940:1: ( rule__PrimitiveType__Group_1__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2941:2: rule__PrimitiveType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_1__1__Impl_in_rule__PrimitiveType__Group_1__15953);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2947:1: rule__PrimitiveType__Group_1__1__Impl : ( RULE_FLOAT_TYPE ) ;
    public final void rule__PrimitiveType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2951:1: ( ( RULE_FLOAT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2952:1: ( RULE_FLOAT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2952:1: ( RULE_FLOAT_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2953:1: RULE_FLOAT_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getFLOAT_TYPETerminalRuleCall_1_1()); 
            match(input,RULE_FLOAT_TYPE,FOLLOW_RULE_FLOAT_TYPE_in_rule__PrimitiveType__Group_1__1__Impl5980); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2968:1: rule__PrimitiveType__Group_2__0 : rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1 ;
    public final void rule__PrimitiveType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2972:1: ( rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2973:2: rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_2__0__Impl_in_rule__PrimitiveType__Group_2__06013);
            rule__PrimitiveType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_2__1_in_rule__PrimitiveType__Group_2__06016);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2980:1: rule__PrimitiveType__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2984:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2985:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2985:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2986:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getBoolTypeAction_2_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2987:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2989:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2999:1: rule__PrimitiveType__Group_2__1 : rule__PrimitiveType__Group_2__1__Impl ;
    public final void rule__PrimitiveType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3003:1: ( rule__PrimitiveType__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3004:2: rule__PrimitiveType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_2__1__Impl_in_rule__PrimitiveType__Group_2__16074);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3010:1: rule__PrimitiveType__Group_2__1__Impl : ( RULE_BOOLEAN_TYPE ) ;
    public final void rule__PrimitiveType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3014:1: ( ( RULE_BOOLEAN_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3015:1: ( RULE_BOOLEAN_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3015:1: ( RULE_BOOLEAN_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3016:1: RULE_BOOLEAN_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getBOOLEAN_TYPETerminalRuleCall_2_1()); 
            match(input,RULE_BOOLEAN_TYPE,FOLLOW_RULE_BOOLEAN_TYPE_in_rule__PrimitiveType__Group_2__1__Impl6101); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3031:1: rule__PrimitiveType__Group_3__0 : rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1 ;
    public final void rule__PrimitiveType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3035:1: ( rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3036:2: rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_3__0__Impl_in_rule__PrimitiveType__Group_3__06134);
            rule__PrimitiveType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_3__1_in_rule__PrimitiveType__Group_3__06137);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3043:1: rule__PrimitiveType__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3047:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3048:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3048:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3049:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getMachineTypeAction_3_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3050:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3052:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3062:1: rule__PrimitiveType__Group_3__1 : rule__PrimitiveType__Group_3__1__Impl ;
    public final void rule__PrimitiveType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3066:1: ( rule__PrimitiveType__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3067:2: rule__PrimitiveType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_3__1__Impl_in_rule__PrimitiveType__Group_3__16195);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3073:1: rule__PrimitiveType__Group_3__1__Impl : ( RULE_MACHINE_TYPE ) ;
    public final void rule__PrimitiveType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3077:1: ( ( RULE_MACHINE_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3078:1: ( RULE_MACHINE_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3078:1: ( RULE_MACHINE_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3079:1: RULE_MACHINE_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getMACHINE_TYPETerminalRuleCall_3_1()); 
            match(input,RULE_MACHINE_TYPE,FOLLOW_RULE_MACHINE_TYPE_in_rule__PrimitiveType__Group_3__1__Impl6222); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3094:1: rule__PrimitiveType__Group_4__0 : rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1 ;
    public final void rule__PrimitiveType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3098:1: ( rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3099:2: rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_4__0__Impl_in_rule__PrimitiveType__Group_4__06255);
            rule__PrimitiveType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group_4__1_in_rule__PrimitiveType__Group_4__06258);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3106:1: rule__PrimitiveType__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3110:1: ( ( () ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3111:1: ( () )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3111:1: ( () )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3112:1: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getUnitTypeAction_4_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3113:1: ()
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3115:1: 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3125:1: rule__PrimitiveType__Group_4__1 : rule__PrimitiveType__Group_4__1__Impl ;
    public final void rule__PrimitiveType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3129:1: ( rule__PrimitiveType__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3130:2: rule__PrimitiveType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group_4__1__Impl_in_rule__PrimitiveType__Group_4__16316);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3136:1: rule__PrimitiveType__Group_4__1__Impl : ( RULE_UNIT_TYPE ) ;
    public final void rule__PrimitiveType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3140:1: ( ( RULE_UNIT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3141:1: ( RULE_UNIT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3141:1: ( RULE_UNIT_TYPE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3142:1: RULE_UNIT_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getUNIT_TYPETerminalRuleCall_4_1()); 
            match(input,RULE_UNIT_TYPE,FOLLOW_RULE_UNIT_TYPE_in_rule__PrimitiveType__Group_4__1__Impl6343); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3157:1: rule__TupleType__Group__0 : rule__TupleType__Group__0__Impl rule__TupleType__Group__1 ;
    public final void rule__TupleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3161:1: ( rule__TupleType__Group__0__Impl rule__TupleType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3162:2: rule__TupleType__Group__0__Impl rule__TupleType__Group__1
            {
            pushFollow(FOLLOW_rule__TupleType__Group__0__Impl_in_rule__TupleType__Group__06376);
            rule__TupleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group__1_in_rule__TupleType__Group__06379);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3169:1: rule__TupleType__Group__0__Impl : ( '(' ) ;
    public final void rule__TupleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3173:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3174:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3174:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3175:1: '('
            {
             before(grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__TupleType__Group__0__Impl6407); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3188:1: rule__TupleType__Group__1 : rule__TupleType__Group__1__Impl rule__TupleType__Group__2 ;
    public final void rule__TupleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3192:1: ( rule__TupleType__Group__1__Impl rule__TupleType__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3193:2: rule__TupleType__Group__1__Impl rule__TupleType__Group__2
            {
            pushFollow(FOLLOW_rule__TupleType__Group__1__Impl_in_rule__TupleType__Group__16438);
            rule__TupleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group__2_in_rule__TupleType__Group__16441);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3200:1: rule__TupleType__Group__1__Impl : ( ( rule__TupleType__TypesAssignment_1 ) ) ;
    public final void rule__TupleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3204:1: ( ( ( rule__TupleType__TypesAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3205:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3205:1: ( ( rule__TupleType__TypesAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3206:1: ( rule__TupleType__TypesAssignment_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3207:1: ( rule__TupleType__TypesAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3207:2: rule__TupleType__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__TupleType__TypesAssignment_1_in_rule__TupleType__Group__1__Impl6468);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3217:1: rule__TupleType__Group__2 : rule__TupleType__Group__2__Impl rule__TupleType__Group__3 ;
    public final void rule__TupleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3221:1: ( rule__TupleType__Group__2__Impl rule__TupleType__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3222:2: rule__TupleType__Group__2__Impl rule__TupleType__Group__3
            {
            pushFollow(FOLLOW_rule__TupleType__Group__2__Impl_in_rule__TupleType__Group__26498);
            rule__TupleType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group__3_in_rule__TupleType__Group__26501);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3229:1: rule__TupleType__Group__2__Impl : ( ( rule__TupleType__Group_2__0 )* ) ;
    public final void rule__TupleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3233:1: ( ( ( rule__TupleType__Group_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3234:1: ( ( rule__TupleType__Group_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3234:1: ( ( rule__TupleType__Group_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3235:1: ( rule__TupleType__Group_2__0 )*
            {
             before(grammarAccess.getTupleTypeAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3236:1: ( rule__TupleType__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3236:2: rule__TupleType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TupleType__Group_2__0_in_rule__TupleType__Group__2__Impl6528);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3246:1: rule__TupleType__Group__3 : rule__TupleType__Group__3__Impl ;
    public final void rule__TupleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3250:1: ( rule__TupleType__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3251:2: rule__TupleType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TupleType__Group__3__Impl_in_rule__TupleType__Group__36559);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3257:1: rule__TupleType__Group__3__Impl : ( ')' ) ;
    public final void rule__TupleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3261:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3262:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3262:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3263:1: ')'
            {
             before(grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_49_in_rule__TupleType__Group__3__Impl6587); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3284:1: rule__TupleType__Group_2__0 : rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 ;
    public final void rule__TupleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3288:1: ( rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3289:2: rule__TupleType__Group_2__0__Impl rule__TupleType__Group_2__1
            {
            pushFollow(FOLLOW_rule__TupleType__Group_2__0__Impl_in_rule__TupleType__Group_2__06626);
            rule__TupleType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleType__Group_2__1_in_rule__TupleType__Group_2__06629);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3296:1: rule__TupleType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TupleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3300:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3301:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3301:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3302:1: ','
            {
             before(grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__TupleType__Group_2__0__Impl6657); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3315:1: rule__TupleType__Group_2__1 : rule__TupleType__Group_2__1__Impl ;
    public final void rule__TupleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3319:1: ( rule__TupleType__Group_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3320:2: rule__TupleType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleType__Group_2__1__Impl_in_rule__TupleType__Group_2__16688);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3326:1: rule__TupleType__Group_2__1__Impl : ( ( rule__TupleType__TypesAssignment_2_1 ) ) ;
    public final void rule__TupleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3330:1: ( ( ( rule__TupleType__TypesAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3331:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3331:1: ( ( rule__TupleType__TypesAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3332:1: ( rule__TupleType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getTupleTypeAccess().getTypesAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3333:1: ( rule__TupleType__TypesAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3333:2: rule__TupleType__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TupleType__TypesAssignment_2_1_in_rule__TupleType__Group_2__1__Impl6715);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3347:1: rule__StructType__Group__0 : rule__StructType__Group__0__Impl rule__StructType__Group__1 ;
    public final void rule__StructType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3351:1: ( rule__StructType__Group__0__Impl rule__StructType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3352:2: rule__StructType__Group__0__Impl rule__StructType__Group__1
            {
            pushFollow(FOLLOW_rule__StructType__Group__0__Impl_in_rule__StructType__Group__06749);
            rule__StructType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__1_in_rule__StructType__Group__06752);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3359:1: rule__StructType__Group__0__Impl : ( 'struct' ) ;
    public final void rule__StructType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3363:1: ( ( 'struct' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3364:1: ( 'struct' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3364:1: ( 'struct' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3365:1: 'struct'
            {
             before(grammarAccess.getStructTypeAccess().getStructKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__StructType__Group__0__Impl6780); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3378:1: rule__StructType__Group__1 : rule__StructType__Group__1__Impl rule__StructType__Group__2 ;
    public final void rule__StructType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3382:1: ( rule__StructType__Group__1__Impl rule__StructType__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3383:2: rule__StructType__Group__1__Impl rule__StructType__Group__2
            {
            pushFollow(FOLLOW_rule__StructType__Group__1__Impl_in_rule__StructType__Group__16811);
            rule__StructType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__2_in_rule__StructType__Group__16814);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3390:1: rule__StructType__Group__1__Impl : ( ( rule__StructType__IdentAssignment_1 ) ) ;
    public final void rule__StructType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3394:1: ( ( ( rule__StructType__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3395:1: ( ( rule__StructType__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3395:1: ( ( rule__StructType__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3396:1: ( rule__StructType__IdentAssignment_1 )
            {
             before(grammarAccess.getStructTypeAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3397:1: ( rule__StructType__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3397:2: rule__StructType__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__StructType__IdentAssignment_1_in_rule__StructType__Group__1__Impl6841);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3407:1: rule__StructType__Group__2 : rule__StructType__Group__2__Impl rule__StructType__Group__3 ;
    public final void rule__StructType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3411:1: ( rule__StructType__Group__2__Impl rule__StructType__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3412:2: rule__StructType__Group__2__Impl rule__StructType__Group__3
            {
            pushFollow(FOLLOW_rule__StructType__Group__2__Impl_in_rule__StructType__Group__26871);
            rule__StructType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__3_in_rule__StructType__Group__26874);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3419:1: rule__StructType__Group__2__Impl : ( ( rule__StructType__Group_2__0 )? ) ;
    public final void rule__StructType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3423:1: ( ( ( rule__StructType__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3424:1: ( ( rule__StructType__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3424:1: ( ( rule__StructType__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3425:1: ( rule__StructType__Group_2__0 )?
            {
             before(grammarAccess.getStructTypeAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3426:1: ( rule__StructType__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3426:2: rule__StructType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StructType__Group_2__0_in_rule__StructType__Group__2__Impl6901);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3436:1: rule__StructType__Group__3 : rule__StructType__Group__3__Impl rule__StructType__Group__4 ;
    public final void rule__StructType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3440:1: ( rule__StructType__Group__3__Impl rule__StructType__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3441:2: rule__StructType__Group__3__Impl rule__StructType__Group__4
            {
            pushFollow(FOLLOW_rule__StructType__Group__3__Impl_in_rule__StructType__Group__36932);
            rule__StructType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__4_in_rule__StructType__Group__36935);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3448:1: rule__StructType__Group__3__Impl : ( '{' ) ;
    public final void rule__StructType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3452:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3453:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3453:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3454:1: '{'
            {
             before(grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__StructType__Group__3__Impl6963); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3467:1: rule__StructType__Group__4 : rule__StructType__Group__4__Impl rule__StructType__Group__5 ;
    public final void rule__StructType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3471:1: ( rule__StructType__Group__4__Impl rule__StructType__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3472:2: rule__StructType__Group__4__Impl rule__StructType__Group__5
            {
            pushFollow(FOLLOW_rule__StructType__Group__4__Impl_in_rule__StructType__Group__46994);
            rule__StructType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__5_in_rule__StructType__Group__46997);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3479:1: rule__StructType__Group__4__Impl : ( ( rule__StructType__FieldsAssignment_4 ) ) ;
    public final void rule__StructType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3483:1: ( ( ( rule__StructType__FieldsAssignment_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3484:1: ( ( rule__StructType__FieldsAssignment_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3484:1: ( ( rule__StructType__FieldsAssignment_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3485:1: ( rule__StructType__FieldsAssignment_4 )
            {
             before(grammarAccess.getStructTypeAccess().getFieldsAssignment_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3486:1: ( rule__StructType__FieldsAssignment_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3486:2: rule__StructType__FieldsAssignment_4
            {
            pushFollow(FOLLOW_rule__StructType__FieldsAssignment_4_in_rule__StructType__Group__4__Impl7024);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3496:1: rule__StructType__Group__5 : rule__StructType__Group__5__Impl rule__StructType__Group__6 ;
    public final void rule__StructType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3500:1: ( rule__StructType__Group__5__Impl rule__StructType__Group__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3501:2: rule__StructType__Group__5__Impl rule__StructType__Group__6
            {
            pushFollow(FOLLOW_rule__StructType__Group__5__Impl_in_rule__StructType__Group__57054);
            rule__StructType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group__6_in_rule__StructType__Group__57057);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3508:1: rule__StructType__Group__5__Impl : ( ( rule__StructType__Group_5__0 )* ) ;
    public final void rule__StructType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3512:1: ( ( ( rule__StructType__Group_5__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3513:1: ( ( rule__StructType__Group_5__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3513:1: ( ( rule__StructType__Group_5__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3514:1: ( rule__StructType__Group_5__0 )*
            {
             before(grammarAccess.getStructTypeAccess().getGroup_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3515:1: ( rule__StructType__Group_5__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3515:2: rule__StructType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__StructType__Group_5__0_in_rule__StructType__Group__5__Impl7084);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3525:1: rule__StructType__Group__6 : rule__StructType__Group__6__Impl ;
    public final void rule__StructType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3529:1: ( rule__StructType__Group__6__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3530:2: rule__StructType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group__6__Impl_in_rule__StructType__Group__67115);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3536:1: rule__StructType__Group__6__Impl : ( '}' ) ;
    public final void rule__StructType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3540:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3541:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3541:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3542:1: '}'
            {
             before(grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,53,FOLLOW_53_in_rule__StructType__Group__6__Impl7143); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3569:1: rule__StructType__Group_2__0 : rule__StructType__Group_2__0__Impl rule__StructType__Group_2__1 ;
    public final void rule__StructType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3573:1: ( rule__StructType__Group_2__0__Impl rule__StructType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3574:2: rule__StructType__Group_2__0__Impl rule__StructType__Group_2__1
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__0__Impl_in_rule__StructType__Group_2__07188);
            rule__StructType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2__1_in_rule__StructType__Group_2__07191);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3581:1: rule__StructType__Group_2__0__Impl : ( '<' ) ;
    public final void rule__StructType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3585:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3586:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3586:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3587:1: '<'
            {
             before(grammarAccess.getStructTypeAccess().getLessThanSignKeyword_2_0()); 
            match(input,55,FOLLOW_55_in_rule__StructType__Group_2__0__Impl7219); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3600:1: rule__StructType__Group_2__1 : rule__StructType__Group_2__1__Impl rule__StructType__Group_2__2 ;
    public final void rule__StructType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3604:1: ( rule__StructType__Group_2__1__Impl rule__StructType__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3605:2: rule__StructType__Group_2__1__Impl rule__StructType__Group_2__2
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__1__Impl_in_rule__StructType__Group_2__17250);
            rule__StructType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2__2_in_rule__StructType__Group_2__17253);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3612:1: rule__StructType__Group_2__1__Impl : ( ( rule__StructType__ParamsAssignment_2_1 ) ) ;
    public final void rule__StructType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3616:1: ( ( ( rule__StructType__ParamsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3617:1: ( ( rule__StructType__ParamsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3617:1: ( ( rule__StructType__ParamsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3618:1: ( rule__StructType__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getStructTypeAccess().getParamsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3619:1: ( rule__StructType__ParamsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3619:2: rule__StructType__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StructType__ParamsAssignment_2_1_in_rule__StructType__Group_2__1__Impl7280);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3629:1: rule__StructType__Group_2__2 : rule__StructType__Group_2__2__Impl rule__StructType__Group_2__3 ;
    public final void rule__StructType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3633:1: ( rule__StructType__Group_2__2__Impl rule__StructType__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3634:2: rule__StructType__Group_2__2__Impl rule__StructType__Group_2__3
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__2__Impl_in_rule__StructType__Group_2__27310);
            rule__StructType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2__3_in_rule__StructType__Group_2__27313);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3641:1: rule__StructType__Group_2__2__Impl : ( ( rule__StructType__Group_2_2__0 )* ) ;
    public final void rule__StructType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3645:1: ( ( ( rule__StructType__Group_2_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3646:1: ( ( rule__StructType__Group_2_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3646:1: ( ( rule__StructType__Group_2_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3647:1: ( rule__StructType__Group_2_2__0 )*
            {
             before(grammarAccess.getStructTypeAccess().getGroup_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3648:1: ( rule__StructType__Group_2_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==47) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3648:2: rule__StructType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StructType__Group_2_2__0_in_rule__StructType__Group_2__2__Impl7340);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3658:1: rule__StructType__Group_2__3 : rule__StructType__Group_2__3__Impl ;
    public final void rule__StructType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3662:1: ( rule__StructType__Group_2__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3663:2: rule__StructType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group_2__3__Impl_in_rule__StructType__Group_2__37371);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3669:1: rule__StructType__Group_2__3__Impl : ( '>' ) ;
    public final void rule__StructType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3673:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3674:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3674:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3675:1: '>'
            {
             before(grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,56,FOLLOW_56_in_rule__StructType__Group_2__3__Impl7399); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3696:1: rule__StructType__Group_2_2__0 : rule__StructType__Group_2_2__0__Impl rule__StructType__Group_2_2__1 ;
    public final void rule__StructType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3700:1: ( rule__StructType__Group_2_2__0__Impl rule__StructType__Group_2_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3701:2: rule__StructType__Group_2_2__0__Impl rule__StructType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__StructType__Group_2_2__0__Impl_in_rule__StructType__Group_2_2__07438);
            rule__StructType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_2_2__1_in_rule__StructType__Group_2_2__07441);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3708:1: rule__StructType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__StructType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3712:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3713:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3713:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3714:1: ','
            {
             before(grammarAccess.getStructTypeAccess().getCommaKeyword_2_2_0()); 
            match(input,47,FOLLOW_47_in_rule__StructType__Group_2_2__0__Impl7469); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3727:1: rule__StructType__Group_2_2__1 : rule__StructType__Group_2_2__1__Impl ;
    public final void rule__StructType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3731:1: ( rule__StructType__Group_2_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3732:2: rule__StructType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group_2_2__1__Impl_in_rule__StructType__Group_2_2__17500);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3738:1: rule__StructType__Group_2_2__1__Impl : ( ( rule__StructType__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__StructType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3742:1: ( ( ( rule__StructType__ParamsAssignment_2_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3743:1: ( ( rule__StructType__ParamsAssignment_2_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3743:1: ( ( rule__StructType__ParamsAssignment_2_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3744:1: ( rule__StructType__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getStructTypeAccess().getParamsAssignment_2_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3745:1: ( rule__StructType__ParamsAssignment_2_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3745:2: rule__StructType__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__StructType__ParamsAssignment_2_2_1_in_rule__StructType__Group_2_2__1__Impl7527);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3759:1: rule__StructType__Group_5__0 : rule__StructType__Group_5__0__Impl rule__StructType__Group_5__1 ;
    public final void rule__StructType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3763:1: ( rule__StructType__Group_5__0__Impl rule__StructType__Group_5__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3764:2: rule__StructType__Group_5__0__Impl rule__StructType__Group_5__1
            {
            pushFollow(FOLLOW_rule__StructType__Group_5__0__Impl_in_rule__StructType__Group_5__07561);
            rule__StructType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructType__Group_5__1_in_rule__StructType__Group_5__07564);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3771:1: rule__StructType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StructType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3775:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3776:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3776:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3777:1: ','
            {
             before(grammarAccess.getStructTypeAccess().getCommaKeyword_5_0()); 
            match(input,47,FOLLOW_47_in_rule__StructType__Group_5__0__Impl7592); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3790:1: rule__StructType__Group_5__1 : rule__StructType__Group_5__1__Impl ;
    public final void rule__StructType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3794:1: ( rule__StructType__Group_5__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3795:2: rule__StructType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__StructType__Group_5__1__Impl_in_rule__StructType__Group_5__17623);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3801:1: rule__StructType__Group_5__1__Impl : ( ( rule__StructType__FieldsAssignment_5_1 ) ) ;
    public final void rule__StructType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3805:1: ( ( ( rule__StructType__FieldsAssignment_5_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3806:1: ( ( rule__StructType__FieldsAssignment_5_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3806:1: ( ( rule__StructType__FieldsAssignment_5_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3807:1: ( rule__StructType__FieldsAssignment_5_1 )
            {
             before(grammarAccess.getStructTypeAccess().getFieldsAssignment_5_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3808:1: ( rule__StructType__FieldsAssignment_5_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3808:2: rule__StructType__FieldsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StructType__FieldsAssignment_5_1_in_rule__StructType__Group_5__1__Impl7650);
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


    // $ANTLR start "rule__StructField__Group__0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3822:1: rule__StructField__Group__0 : rule__StructField__Group__0__Impl rule__StructField__Group__1 ;
    public final void rule__StructField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3826:1: ( rule__StructField__Group__0__Impl rule__StructField__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3827:2: rule__StructField__Group__0__Impl rule__StructField__Group__1
            {
            pushFollow(FOLLOW_rule__StructField__Group__0__Impl_in_rule__StructField__Group__07684);
            rule__StructField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructField__Group__1_in_rule__StructField__Group__07687);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3834:1: rule__StructField__Group__0__Impl : ( ( rule__StructField__VisAssignment_0 )? ) ;
    public final void rule__StructField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3838:1: ( ( ( rule__StructField__VisAssignment_0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3839:1: ( ( rule__StructField__VisAssignment_0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3839:1: ( ( rule__StructField__VisAssignment_0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3840:1: ( rule__StructField__VisAssignment_0 )?
            {
             before(grammarAccess.getStructFieldAccess().getVisAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3841:1: ( rule__StructField__VisAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=43 && LA25_0<=44)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3841:2: rule__StructField__VisAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StructField__VisAssignment_0_in_rule__StructField__Group__0__Impl7714);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3851:1: rule__StructField__Group__1 : rule__StructField__Group__1__Impl rule__StructField__Group__2 ;
    public final void rule__StructField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3855:1: ( rule__StructField__Group__1__Impl rule__StructField__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3856:2: rule__StructField__Group__1__Impl rule__StructField__Group__2
            {
            pushFollow(FOLLOW_rule__StructField__Group__1__Impl_in_rule__StructField__Group__17745);
            rule__StructField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructField__Group__2_in_rule__StructField__Group__17748);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3863:1: rule__StructField__Group__1__Impl : ( ( rule__StructField__IdentAssignment_1 ) ) ;
    public final void rule__StructField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3867:1: ( ( ( rule__StructField__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3868:1: ( ( rule__StructField__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3868:1: ( ( rule__StructField__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3869:1: ( rule__StructField__IdentAssignment_1 )
            {
             before(grammarAccess.getStructFieldAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3870:1: ( rule__StructField__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3870:2: rule__StructField__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__StructField__IdentAssignment_1_in_rule__StructField__Group__1__Impl7775);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3880:1: rule__StructField__Group__2 : rule__StructField__Group__2__Impl rule__StructField__Group__3 ;
    public final void rule__StructField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3884:1: ( rule__StructField__Group__2__Impl rule__StructField__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3885:2: rule__StructField__Group__2__Impl rule__StructField__Group__3
            {
            pushFollow(FOLLOW_rule__StructField__Group__2__Impl_in_rule__StructField__Group__27805);
            rule__StructField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructField__Group__3_in_rule__StructField__Group__27808);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3892:1: rule__StructField__Group__2__Impl : ( ':' ) ;
    public final void rule__StructField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3896:1: ( ( ':' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3897:1: ( ':' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3897:1: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3898:1: ':'
            {
             before(grammarAccess.getStructFieldAccess().getColonKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__StructField__Group__2__Impl7836); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3911:1: rule__StructField__Group__3 : rule__StructField__Group__3__Impl ;
    public final void rule__StructField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3915:1: ( rule__StructField__Group__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3916:2: rule__StructField__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StructField__Group__3__Impl_in_rule__StructField__Group__37867);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3922:1: rule__StructField__Group__3__Impl : ( ( rule__StructField__TypeAssignment_3 ) ) ;
    public final void rule__StructField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3926:1: ( ( ( rule__StructField__TypeAssignment_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3927:1: ( ( rule__StructField__TypeAssignment_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3927:1: ( ( rule__StructField__TypeAssignment_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3928:1: ( rule__StructField__TypeAssignment_3 )
            {
             before(grammarAccess.getStructFieldAccess().getTypeAssignment_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3929:1: ( rule__StructField__TypeAssignment_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3929:2: rule__StructField__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__StructField__TypeAssignment_3_in_rule__StructField__Group__3__Impl7894);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3947:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3951:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3952:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__07932);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__07935);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3959:1: rule__EnumType__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3963:1: ( ( 'enum' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3964:1: ( 'enum' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3964:1: ( 'enum' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3965:1: 'enum'
            {
             before(grammarAccess.getEnumTypeAccess().getEnumKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__EnumType__Group__0__Impl7963); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3978:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3982:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3983:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__17994);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__17997);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3990:1: rule__EnumType__Group__1__Impl : ( ( rule__EnumType__IdentAssignment_1 ) ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3994:1: ( ( ( rule__EnumType__IdentAssignment_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3995:1: ( ( rule__EnumType__IdentAssignment_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3995:1: ( ( rule__EnumType__IdentAssignment_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3996:1: ( rule__EnumType__IdentAssignment_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getIdentAssignment_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3997:1: ( rule__EnumType__IdentAssignment_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:3997:2: rule__EnumType__IdentAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumType__IdentAssignment_1_in_rule__EnumType__Group__1__Impl8024);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4007:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4011:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4012:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__28054);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__28057);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4019:1: rule__EnumType__Group__2__Impl : ( ( rule__EnumType__Group_2__0 )? ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4023:1: ( ( ( rule__EnumType__Group_2__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4024:1: ( ( rule__EnumType__Group_2__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4024:1: ( ( rule__EnumType__Group_2__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4025:1: ( rule__EnumType__Group_2__0 )?
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4026:1: ( rule__EnumType__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4026:2: rule__EnumType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumType__Group_2__0_in_rule__EnumType__Group__2__Impl8084);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4036:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4040:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4041:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__38115);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__38118);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4048:1: rule__EnumType__Group__3__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4052:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4053:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4053:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4054:1: '{'
            {
             before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__EnumType__Group__3__Impl8146); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4067:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4071:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4072:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__48177);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__48180);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4079:1: rule__EnumType__Group__4__Impl : ( ( rule__EnumType__VariantsAssignment_4 ) ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4083:1: ( ( ( rule__EnumType__VariantsAssignment_4 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4084:1: ( ( rule__EnumType__VariantsAssignment_4 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4084:1: ( ( rule__EnumType__VariantsAssignment_4 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4085:1: ( rule__EnumType__VariantsAssignment_4 )
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsAssignment_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4086:1: ( rule__EnumType__VariantsAssignment_4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4086:2: rule__EnumType__VariantsAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumType__VariantsAssignment_4_in_rule__EnumType__Group__4__Impl8207);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4096:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl rule__EnumType__Group__6 ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4100:1: ( rule__EnumType__Group__5__Impl rule__EnumType__Group__6 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4101:2: rule__EnumType__Group__5__Impl rule__EnumType__Group__6
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__58237);
            rule__EnumType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__58240);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4108:1: rule__EnumType__Group__5__Impl : ( ( rule__EnumType__Group_5__0 )* ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4112:1: ( ( ( rule__EnumType__Group_5__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4113:1: ( ( rule__EnumType__Group_5__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4113:1: ( ( rule__EnumType__Group_5__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4114:1: ( rule__EnumType__Group_5__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_5()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4115:1: ( rule__EnumType__Group_5__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==47) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4115:2: rule__EnumType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_5__0_in_rule__EnumType__Group__5__Impl8267);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4125:1: rule__EnumType__Group__6 : rule__EnumType__Group__6__Impl ;
    public final void rule__EnumType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4129:1: ( rule__EnumType__Group__6__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4130:2: rule__EnumType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__68298);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4136:1: rule__EnumType__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4140:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4141:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4141:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4142:1: '}'
            {
             before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,53,FOLLOW_53_in_rule__EnumType__Group__6__Impl8326); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4169:1: rule__EnumType__Group_2__0 : rule__EnumType__Group_2__0__Impl rule__EnumType__Group_2__1 ;
    public final void rule__EnumType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4173:1: ( rule__EnumType__Group_2__0__Impl rule__EnumType__Group_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4174:2: rule__EnumType__Group_2__0__Impl rule__EnumType__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__0__Impl_in_rule__EnumType__Group_2__08371);
            rule__EnumType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2__1_in_rule__EnumType__Group_2__08374);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4181:1: rule__EnumType__Group_2__0__Impl : ( '<' ) ;
    public final void rule__EnumType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4185:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4186:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4186:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4187:1: '<'
            {
             before(grammarAccess.getEnumTypeAccess().getLessThanSignKeyword_2_0()); 
            match(input,55,FOLLOW_55_in_rule__EnumType__Group_2__0__Impl8402); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4200:1: rule__EnumType__Group_2__1 : rule__EnumType__Group_2__1__Impl rule__EnumType__Group_2__2 ;
    public final void rule__EnumType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4204:1: ( rule__EnumType__Group_2__1__Impl rule__EnumType__Group_2__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4205:2: rule__EnumType__Group_2__1__Impl rule__EnumType__Group_2__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__1__Impl_in_rule__EnumType__Group_2__18433);
            rule__EnumType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2__2_in_rule__EnumType__Group_2__18436);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4212:1: rule__EnumType__Group_2__1__Impl : ( ( rule__EnumType__ParamsAssignment_2_1 ) ) ;
    public final void rule__EnumType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4216:1: ( ( ( rule__EnumType__ParamsAssignment_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4217:1: ( ( rule__EnumType__ParamsAssignment_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4217:1: ( ( rule__EnumType__ParamsAssignment_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4218:1: ( rule__EnumType__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4219:1: ( rule__EnumType__ParamsAssignment_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4219:2: rule__EnumType__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumType__ParamsAssignment_2_1_in_rule__EnumType__Group_2__1__Impl8463);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4229:1: rule__EnumType__Group_2__2 : rule__EnumType__Group_2__2__Impl rule__EnumType__Group_2__3 ;
    public final void rule__EnumType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4233:1: ( rule__EnumType__Group_2__2__Impl rule__EnumType__Group_2__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4234:2: rule__EnumType__Group_2__2__Impl rule__EnumType__Group_2__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__2__Impl_in_rule__EnumType__Group_2__28493);
            rule__EnumType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2__3_in_rule__EnumType__Group_2__28496);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4241:1: rule__EnumType__Group_2__2__Impl : ( ( rule__EnumType__Group_2_2__0 )* ) ;
    public final void rule__EnumType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4245:1: ( ( ( rule__EnumType__Group_2_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4246:1: ( ( rule__EnumType__Group_2_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4246:1: ( ( rule__EnumType__Group_2_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4247:1: ( rule__EnumType__Group_2_2__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_2_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4248:1: ( rule__EnumType__Group_2_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==47) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4248:2: rule__EnumType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_2_2__0_in_rule__EnumType__Group_2__2__Impl8523);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4258:1: rule__EnumType__Group_2__3 : rule__EnumType__Group_2__3__Impl ;
    public final void rule__EnumType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4262:1: ( rule__EnumType__Group_2__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4263:2: rule__EnumType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2__3__Impl_in_rule__EnumType__Group_2__38554);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4269:1: rule__EnumType__Group_2__3__Impl : ( '>' ) ;
    public final void rule__EnumType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4273:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4274:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4274:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4275:1: '>'
            {
             before(grammarAccess.getEnumTypeAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,56,FOLLOW_56_in_rule__EnumType__Group_2__3__Impl8582); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4296:1: rule__EnumType__Group_2_2__0 : rule__EnumType__Group_2_2__0__Impl rule__EnumType__Group_2_2__1 ;
    public final void rule__EnumType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4300:1: ( rule__EnumType__Group_2_2__0__Impl rule__EnumType__Group_2_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4301:2: rule__EnumType__Group_2_2__0__Impl rule__EnumType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2_2__0__Impl_in_rule__EnumType__Group_2_2__08621);
            rule__EnumType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_2_2__1_in_rule__EnumType__Group_2_2__08624);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4308:1: rule__EnumType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4312:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4313:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4313:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4314:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_2_2_0()); 
            match(input,47,FOLLOW_47_in_rule__EnumType__Group_2_2__0__Impl8652); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4327:1: rule__EnumType__Group_2_2__1 : rule__EnumType__Group_2_2__1__Impl ;
    public final void rule__EnumType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4331:1: ( rule__EnumType__Group_2_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4332:2: rule__EnumType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_2_2__1__Impl_in_rule__EnumType__Group_2_2__18683);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4338:1: rule__EnumType__Group_2_2__1__Impl : ( ( rule__EnumType__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__EnumType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4342:1: ( ( ( rule__EnumType__ParamsAssignment_2_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4343:1: ( ( rule__EnumType__ParamsAssignment_2_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4343:1: ( ( rule__EnumType__ParamsAssignment_2_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4344:1: ( rule__EnumType__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getParamsAssignment_2_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4345:1: ( rule__EnumType__ParamsAssignment_2_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4345:2: rule__EnumType__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__EnumType__ParamsAssignment_2_2_1_in_rule__EnumType__Group_2_2__1__Impl8710);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4359:1: rule__EnumType__Group_5__0 : rule__EnumType__Group_5__0__Impl rule__EnumType__Group_5__1 ;
    public final void rule__EnumType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4363:1: ( rule__EnumType__Group_5__0__Impl rule__EnumType__Group_5__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4364:2: rule__EnumType__Group_5__0__Impl rule__EnumType__Group_5__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_5__0__Impl_in_rule__EnumType__Group_5__08744);
            rule__EnumType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_5__1_in_rule__EnumType__Group_5__08747);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4371:1: rule__EnumType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4375:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4376:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4376:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4377:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_5_0()); 
            match(input,47,FOLLOW_47_in_rule__EnumType__Group_5__0__Impl8775); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4390:1: rule__EnumType__Group_5__1 : rule__EnumType__Group_5__1__Impl ;
    public final void rule__EnumType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4394:1: ( rule__EnumType__Group_5__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4395:2: rule__EnumType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_5__1__Impl_in_rule__EnumType__Group_5__18806);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4401:1: rule__EnumType__Group_5__1__Impl : ( ( rule__EnumType__VariantsAssignment_5_1 ) ) ;
    public final void rule__EnumType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4405:1: ( ( ( rule__EnumType__VariantsAssignment_5_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4406:1: ( ( rule__EnumType__VariantsAssignment_5_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4406:1: ( ( rule__EnumType__VariantsAssignment_5_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4407:1: ( rule__EnumType__VariantsAssignment_5_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsAssignment_5_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4408:1: ( rule__EnumType__VariantsAssignment_5_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4408:2: rule__EnumType__VariantsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EnumType__VariantsAssignment_5_1_in_rule__EnumType__Group_5__1__Impl8833);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4422:1: rule__StructVariant__Group__0 : rule__StructVariant__Group__0__Impl rule__StructVariant__Group__1 ;
    public final void rule__StructVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4426:1: ( rule__StructVariant__Group__0__Impl rule__StructVariant__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4427:2: rule__StructVariant__Group__0__Impl rule__StructVariant__Group__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__0__Impl_in_rule__StructVariant__Group__08867);
            rule__StructVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__1_in_rule__StructVariant__Group__08870);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4434:1: rule__StructVariant__Group__0__Impl : ( ( rule__StructVariant__IdentAssignment_0 ) ) ;
    public final void rule__StructVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4438:1: ( ( ( rule__StructVariant__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4439:1: ( ( rule__StructVariant__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4439:1: ( ( rule__StructVariant__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4440:1: ( rule__StructVariant__IdentAssignment_0 )
            {
             before(grammarAccess.getStructVariantAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4441:1: ( rule__StructVariant__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4441:2: rule__StructVariant__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__StructVariant__IdentAssignment_0_in_rule__StructVariant__Group__0__Impl8897);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4451:1: rule__StructVariant__Group__1 : rule__StructVariant__Group__1__Impl rule__StructVariant__Group__2 ;
    public final void rule__StructVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4455:1: ( rule__StructVariant__Group__1__Impl rule__StructVariant__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4456:2: rule__StructVariant__Group__1__Impl rule__StructVariant__Group__2
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__1__Impl_in_rule__StructVariant__Group__18927);
            rule__StructVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__2_in_rule__StructVariant__Group__18930);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4463:1: rule__StructVariant__Group__1__Impl : ( ( rule__StructVariant__Group_1__0 )? ) ;
    public final void rule__StructVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4467:1: ( ( ( rule__StructVariant__Group_1__0 )? ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4468:1: ( ( rule__StructVariant__Group_1__0 )? )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4468:1: ( ( rule__StructVariant__Group_1__0 )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4469:1: ( rule__StructVariant__Group_1__0 )?
            {
             before(grammarAccess.getStructVariantAccess().getGroup_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4470:1: ( rule__StructVariant__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4470:2: rule__StructVariant__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StructVariant__Group_1__0_in_rule__StructVariant__Group__1__Impl8957);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4480:1: rule__StructVariant__Group__2 : rule__StructVariant__Group__2__Impl rule__StructVariant__Group__3 ;
    public final void rule__StructVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4484:1: ( rule__StructVariant__Group__2__Impl rule__StructVariant__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4485:2: rule__StructVariant__Group__2__Impl rule__StructVariant__Group__3
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__2__Impl_in_rule__StructVariant__Group__28988);
            rule__StructVariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__3_in_rule__StructVariant__Group__28991);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4492:1: rule__StructVariant__Group__2__Impl : ( '{' ) ;
    public final void rule__StructVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4496:1: ( ( '{' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4497:1: ( '{' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4497:1: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4498:1: '{'
            {
             before(grammarAccess.getStructVariantAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,52,FOLLOW_52_in_rule__StructVariant__Group__2__Impl9019); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4511:1: rule__StructVariant__Group__3 : rule__StructVariant__Group__3__Impl rule__StructVariant__Group__4 ;
    public final void rule__StructVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4515:1: ( rule__StructVariant__Group__3__Impl rule__StructVariant__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4516:2: rule__StructVariant__Group__3__Impl rule__StructVariant__Group__4
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__3__Impl_in_rule__StructVariant__Group__39050);
            rule__StructVariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__4_in_rule__StructVariant__Group__39053);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4523:1: rule__StructVariant__Group__3__Impl : ( ( rule__StructVariant__FieldsAssignment_3 ) ) ;
    public final void rule__StructVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4527:1: ( ( ( rule__StructVariant__FieldsAssignment_3 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4528:1: ( ( rule__StructVariant__FieldsAssignment_3 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4528:1: ( ( rule__StructVariant__FieldsAssignment_3 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4529:1: ( rule__StructVariant__FieldsAssignment_3 )
            {
             before(grammarAccess.getStructVariantAccess().getFieldsAssignment_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4530:1: ( rule__StructVariant__FieldsAssignment_3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4530:2: rule__StructVariant__FieldsAssignment_3
            {
            pushFollow(FOLLOW_rule__StructVariant__FieldsAssignment_3_in_rule__StructVariant__Group__3__Impl9080);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4540:1: rule__StructVariant__Group__4 : rule__StructVariant__Group__4__Impl rule__StructVariant__Group__5 ;
    public final void rule__StructVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4544:1: ( rule__StructVariant__Group__4__Impl rule__StructVariant__Group__5 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4545:2: rule__StructVariant__Group__4__Impl rule__StructVariant__Group__5
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__4__Impl_in_rule__StructVariant__Group__49110);
            rule__StructVariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group__5_in_rule__StructVariant__Group__49113);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4552:1: rule__StructVariant__Group__4__Impl : ( ( rule__StructVariant__Group_4__0 )* ) ;
    public final void rule__StructVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4556:1: ( ( ( rule__StructVariant__Group_4__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4557:1: ( ( rule__StructVariant__Group_4__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4557:1: ( ( rule__StructVariant__Group_4__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4558:1: ( rule__StructVariant__Group_4__0 )*
            {
             before(grammarAccess.getStructVariantAccess().getGroup_4()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4559:1: ( rule__StructVariant__Group_4__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4559:2: rule__StructVariant__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__StructVariant__Group_4__0_in_rule__StructVariant__Group__4__Impl9140);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4569:1: rule__StructVariant__Group__5 : rule__StructVariant__Group__5__Impl ;
    public final void rule__StructVariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4573:1: ( rule__StructVariant__Group__5__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4574:2: rule__StructVariant__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group__5__Impl_in_rule__StructVariant__Group__59171);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4580:1: rule__StructVariant__Group__5__Impl : ( '}' ) ;
    public final void rule__StructVariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4584:1: ( ( '}' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4585:1: ( '}' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4585:1: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4586:1: '}'
            {
             before(grammarAccess.getStructVariantAccess().getRightCurlyBracketKeyword_5()); 
            match(input,53,FOLLOW_53_in_rule__StructVariant__Group__5__Impl9199); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4611:1: rule__StructVariant__Group_1__0 : rule__StructVariant__Group_1__0__Impl rule__StructVariant__Group_1__1 ;
    public final void rule__StructVariant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4615:1: ( rule__StructVariant__Group_1__0__Impl rule__StructVariant__Group_1__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4616:2: rule__StructVariant__Group_1__0__Impl rule__StructVariant__Group_1__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__0__Impl_in_rule__StructVariant__Group_1__09242);
            rule__StructVariant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1__1_in_rule__StructVariant__Group_1__09245);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4623:1: rule__StructVariant__Group_1__0__Impl : ( '<' ) ;
    public final void rule__StructVariant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4627:1: ( ( '<' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4628:1: ( '<' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4628:1: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4629:1: '<'
            {
             before(grammarAccess.getStructVariantAccess().getLessThanSignKeyword_1_0()); 
            match(input,55,FOLLOW_55_in_rule__StructVariant__Group_1__0__Impl9273); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4642:1: rule__StructVariant__Group_1__1 : rule__StructVariant__Group_1__1__Impl rule__StructVariant__Group_1__2 ;
    public final void rule__StructVariant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4646:1: ( rule__StructVariant__Group_1__1__Impl rule__StructVariant__Group_1__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4647:2: rule__StructVariant__Group_1__1__Impl rule__StructVariant__Group_1__2
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__1__Impl_in_rule__StructVariant__Group_1__19304);
            rule__StructVariant__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1__2_in_rule__StructVariant__Group_1__19307);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4654:1: rule__StructVariant__Group_1__1__Impl : ( ( rule__StructVariant__ParamsAssignment_1_1 ) ) ;
    public final void rule__StructVariant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4658:1: ( ( ( rule__StructVariant__ParamsAssignment_1_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4659:1: ( ( rule__StructVariant__ParamsAssignment_1_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4659:1: ( ( rule__StructVariant__ParamsAssignment_1_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4660:1: ( rule__StructVariant__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getStructVariantAccess().getParamsAssignment_1_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4661:1: ( rule__StructVariant__ParamsAssignment_1_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4661:2: rule__StructVariant__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StructVariant__ParamsAssignment_1_1_in_rule__StructVariant__Group_1__1__Impl9334);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4671:1: rule__StructVariant__Group_1__2 : rule__StructVariant__Group_1__2__Impl rule__StructVariant__Group_1__3 ;
    public final void rule__StructVariant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4675:1: ( rule__StructVariant__Group_1__2__Impl rule__StructVariant__Group_1__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4676:2: rule__StructVariant__Group_1__2__Impl rule__StructVariant__Group_1__3
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__2__Impl_in_rule__StructVariant__Group_1__29364);
            rule__StructVariant__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1__3_in_rule__StructVariant__Group_1__29367);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4683:1: rule__StructVariant__Group_1__2__Impl : ( ( rule__StructVariant__Group_1_2__0 )* ) ;
    public final void rule__StructVariant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4687:1: ( ( ( rule__StructVariant__Group_1_2__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4688:1: ( ( rule__StructVariant__Group_1_2__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4688:1: ( ( rule__StructVariant__Group_1_2__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4689:1: ( rule__StructVariant__Group_1_2__0 )*
            {
             before(grammarAccess.getStructVariantAccess().getGroup_1_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4690:1: ( rule__StructVariant__Group_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4690:2: rule__StructVariant__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StructVariant__Group_1_2__0_in_rule__StructVariant__Group_1__2__Impl9394);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4700:1: rule__StructVariant__Group_1__3 : rule__StructVariant__Group_1__3__Impl ;
    public final void rule__StructVariant__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4704:1: ( rule__StructVariant__Group_1__3__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4705:2: rule__StructVariant__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1__3__Impl_in_rule__StructVariant__Group_1__39425);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4711:1: rule__StructVariant__Group_1__3__Impl : ( '>' ) ;
    public final void rule__StructVariant__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4715:1: ( ( '>' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4716:1: ( '>' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4716:1: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4717:1: '>'
            {
             before(grammarAccess.getStructVariantAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,56,FOLLOW_56_in_rule__StructVariant__Group_1__3__Impl9453); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4738:1: rule__StructVariant__Group_1_2__0 : rule__StructVariant__Group_1_2__0__Impl rule__StructVariant__Group_1_2__1 ;
    public final void rule__StructVariant__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4742:1: ( rule__StructVariant__Group_1_2__0__Impl rule__StructVariant__Group_1_2__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4743:2: rule__StructVariant__Group_1_2__0__Impl rule__StructVariant__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1_2__0__Impl_in_rule__StructVariant__Group_1_2__09492);
            rule__StructVariant__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_1_2__1_in_rule__StructVariant__Group_1_2__09495);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4750:1: rule__StructVariant__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__StructVariant__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4754:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4755:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4755:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4756:1: ','
            {
             before(grammarAccess.getStructVariantAccess().getCommaKeyword_1_2_0()); 
            match(input,47,FOLLOW_47_in_rule__StructVariant__Group_1_2__0__Impl9523); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4769:1: rule__StructVariant__Group_1_2__1 : rule__StructVariant__Group_1_2__1__Impl ;
    public final void rule__StructVariant__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4773:1: ( rule__StructVariant__Group_1_2__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4774:2: rule__StructVariant__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_1_2__1__Impl_in_rule__StructVariant__Group_1_2__19554);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4780:1: rule__StructVariant__Group_1_2__1__Impl : ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__StructVariant__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4784:1: ( ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4785:1: ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4785:1: ( ( rule__StructVariant__ParamsAssignment_1_2_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4786:1: ( rule__StructVariant__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getStructVariantAccess().getParamsAssignment_1_2_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4787:1: ( rule__StructVariant__ParamsAssignment_1_2_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4787:2: rule__StructVariant__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__StructVariant__ParamsAssignment_1_2_1_in_rule__StructVariant__Group_1_2__1__Impl9581);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4801:1: rule__StructVariant__Group_4__0 : rule__StructVariant__Group_4__0__Impl rule__StructVariant__Group_4__1 ;
    public final void rule__StructVariant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4805:1: ( rule__StructVariant__Group_4__0__Impl rule__StructVariant__Group_4__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4806:2: rule__StructVariant__Group_4__0__Impl rule__StructVariant__Group_4__1
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_4__0__Impl_in_rule__StructVariant__Group_4__09615);
            rule__StructVariant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructVariant__Group_4__1_in_rule__StructVariant__Group_4__09618);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4813:1: rule__StructVariant__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StructVariant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4817:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4818:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4818:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4819:1: ','
            {
             before(grammarAccess.getStructVariantAccess().getCommaKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__StructVariant__Group_4__0__Impl9646); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4832:1: rule__StructVariant__Group_4__1 : rule__StructVariant__Group_4__1__Impl ;
    public final void rule__StructVariant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4836:1: ( rule__StructVariant__Group_4__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4837:2: rule__StructVariant__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StructVariant__Group_4__1__Impl_in_rule__StructVariant__Group_4__19677);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4843:1: rule__StructVariant__Group_4__1__Impl : ( ( rule__StructVariant__FieldsAssignment_4_1 ) ) ;
    public final void rule__StructVariant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4847:1: ( ( ( rule__StructVariant__FieldsAssignment_4_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4848:1: ( ( rule__StructVariant__FieldsAssignment_4_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4848:1: ( ( rule__StructVariant__FieldsAssignment_4_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4849:1: ( rule__StructVariant__FieldsAssignment_4_1 )
            {
             before(grammarAccess.getStructVariantAccess().getFieldsAssignment_4_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4850:1: ( rule__StructVariant__FieldsAssignment_4_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4850:2: rule__StructVariant__FieldsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StructVariant__FieldsAssignment_4_1_in_rule__StructVariant__Group_4__1__Impl9704);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4864:1: rule__TupleVariant__Group__0 : rule__TupleVariant__Group__0__Impl rule__TupleVariant__Group__1 ;
    public final void rule__TupleVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4868:1: ( rule__TupleVariant__Group__0__Impl rule__TupleVariant__Group__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4869:2: rule__TupleVariant__Group__0__Impl rule__TupleVariant__Group__1
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__0__Impl_in_rule__TupleVariant__Group__09738);
            rule__TupleVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__1_in_rule__TupleVariant__Group__09741);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4876:1: rule__TupleVariant__Group__0__Impl : ( ( rule__TupleVariant__IdentAssignment_0 ) ) ;
    public final void rule__TupleVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4880:1: ( ( ( rule__TupleVariant__IdentAssignment_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4881:1: ( ( rule__TupleVariant__IdentAssignment_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4881:1: ( ( rule__TupleVariant__IdentAssignment_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4882:1: ( rule__TupleVariant__IdentAssignment_0 )
            {
             before(grammarAccess.getTupleVariantAccess().getIdentAssignment_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4883:1: ( rule__TupleVariant__IdentAssignment_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4883:2: rule__TupleVariant__IdentAssignment_0
            {
            pushFollow(FOLLOW_rule__TupleVariant__IdentAssignment_0_in_rule__TupleVariant__Group__0__Impl9768);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4893:1: rule__TupleVariant__Group__1 : rule__TupleVariant__Group__1__Impl rule__TupleVariant__Group__2 ;
    public final void rule__TupleVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4897:1: ( rule__TupleVariant__Group__1__Impl rule__TupleVariant__Group__2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4898:2: rule__TupleVariant__Group__1__Impl rule__TupleVariant__Group__2
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__1__Impl_in_rule__TupleVariant__Group__19798);
            rule__TupleVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__2_in_rule__TupleVariant__Group__19801);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4905:1: rule__TupleVariant__Group__1__Impl : ( '(' ) ;
    public final void rule__TupleVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4909:1: ( ( '(' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4910:1: ( '(' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4910:1: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4911:1: '('
            {
             before(grammarAccess.getTupleVariantAccess().getLeftParenthesisKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__TupleVariant__Group__1__Impl9829); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4924:1: rule__TupleVariant__Group__2 : rule__TupleVariant__Group__2__Impl rule__TupleVariant__Group__3 ;
    public final void rule__TupleVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4928:1: ( rule__TupleVariant__Group__2__Impl rule__TupleVariant__Group__3 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4929:2: rule__TupleVariant__Group__2__Impl rule__TupleVariant__Group__3
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__2__Impl_in_rule__TupleVariant__Group__29860);
            rule__TupleVariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__3_in_rule__TupleVariant__Group__29863);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4936:1: rule__TupleVariant__Group__2__Impl : ( ( rule__TupleVariant__TypesAssignment_2 ) ) ;
    public final void rule__TupleVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4940:1: ( ( ( rule__TupleVariant__TypesAssignment_2 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4941:1: ( ( rule__TupleVariant__TypesAssignment_2 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4941:1: ( ( rule__TupleVariant__TypesAssignment_2 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4942:1: ( rule__TupleVariant__TypesAssignment_2 )
            {
             before(grammarAccess.getTupleVariantAccess().getTypesAssignment_2()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4943:1: ( rule__TupleVariant__TypesAssignment_2 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4943:2: rule__TupleVariant__TypesAssignment_2
            {
            pushFollow(FOLLOW_rule__TupleVariant__TypesAssignment_2_in_rule__TupleVariant__Group__2__Impl9890);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4953:1: rule__TupleVariant__Group__3 : rule__TupleVariant__Group__3__Impl rule__TupleVariant__Group__4 ;
    public final void rule__TupleVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4957:1: ( rule__TupleVariant__Group__3__Impl rule__TupleVariant__Group__4 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4958:2: rule__TupleVariant__Group__3__Impl rule__TupleVariant__Group__4
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__3__Impl_in_rule__TupleVariant__Group__39920);
            rule__TupleVariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group__4_in_rule__TupleVariant__Group__39923);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4965:1: rule__TupleVariant__Group__3__Impl : ( ( rule__TupleVariant__Group_3__0 )* ) ;
    public final void rule__TupleVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4969:1: ( ( ( rule__TupleVariant__Group_3__0 )* ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4970:1: ( ( rule__TupleVariant__Group_3__0 )* )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4970:1: ( ( rule__TupleVariant__Group_3__0 )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4971:1: ( rule__TupleVariant__Group_3__0 )*
            {
             before(grammarAccess.getTupleVariantAccess().getGroup_3()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4972:1: ( rule__TupleVariant__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4972:2: rule__TupleVariant__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TupleVariant__Group_3__0_in_rule__TupleVariant__Group__3__Impl9950);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4982:1: rule__TupleVariant__Group__4 : rule__TupleVariant__Group__4__Impl ;
    public final void rule__TupleVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4986:1: ( rule__TupleVariant__Group__4__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4987:2: rule__TupleVariant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group__4__Impl_in_rule__TupleVariant__Group__49981);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4993:1: rule__TupleVariant__Group__4__Impl : ( ')' ) ;
    public final void rule__TupleVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4997:1: ( ( ')' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4998:1: ( ')' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4998:1: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:4999:1: ')'
            {
             before(grammarAccess.getTupleVariantAccess().getRightParenthesisKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__TupleVariant__Group__4__Impl10009); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5022:1: rule__TupleVariant__Group_3__0 : rule__TupleVariant__Group_3__0__Impl rule__TupleVariant__Group_3__1 ;
    public final void rule__TupleVariant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5026:1: ( rule__TupleVariant__Group_3__0__Impl rule__TupleVariant__Group_3__1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5027:2: rule__TupleVariant__Group_3__0__Impl rule__TupleVariant__Group_3__1
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group_3__0__Impl_in_rule__TupleVariant__Group_3__010050);
            rule__TupleVariant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TupleVariant__Group_3__1_in_rule__TupleVariant__Group_3__010053);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5034:1: rule__TupleVariant__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TupleVariant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5038:1: ( ( ',' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5039:1: ( ',' )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5039:1: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5040:1: ','
            {
             before(grammarAccess.getTupleVariantAccess().getCommaKeyword_3_0()); 
            match(input,47,FOLLOW_47_in_rule__TupleVariant__Group_3__0__Impl10081); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5053:1: rule__TupleVariant__Group_3__1 : rule__TupleVariant__Group_3__1__Impl ;
    public final void rule__TupleVariant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5057:1: ( rule__TupleVariant__Group_3__1__Impl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5058:2: rule__TupleVariant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TupleVariant__Group_3__1__Impl_in_rule__TupleVariant__Group_3__110112);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5064:1: rule__TupleVariant__Group_3__1__Impl : ( ( rule__TupleVariant__TypesAssignment_3_1 ) ) ;
    public final void rule__TupleVariant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5068:1: ( ( ( rule__TupleVariant__TypesAssignment_3_1 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5069:1: ( ( rule__TupleVariant__TypesAssignment_3_1 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5069:1: ( ( rule__TupleVariant__TypesAssignment_3_1 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5070:1: ( rule__TupleVariant__TypesAssignment_3_1 )
            {
             before(grammarAccess.getTupleVariantAccess().getTypesAssignment_3_1()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5071:1: ( rule__TupleVariant__TypesAssignment_3_1 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5071:2: rule__TupleVariant__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TupleVariant__TypesAssignment_3_1_in_rule__TupleVariant__Group_3__1__Impl10139);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5086:1: rule__Crate__ItemsAssignment : ( ruleItemAndAttrs ) ;
    public final void rule__Crate__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5090:1: ( ( ruleItemAndAttrs ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5091:1: ( ruleItemAndAttrs )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5091:1: ( ruleItemAndAttrs )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5092:1: ruleItemAndAttrs
            {
             before(grammarAccess.getCrateAccess().getItemsItemAndAttrsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment10178);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5101:1: rule__ItemAttr__AttrsAssignment_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5105:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5106:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5106:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5107:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_110209);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5116:1: rule__ItemAttr__AttrsAssignment_2_1 : ( ruleAttr ) ;
    public final void rule__ItemAttr__AttrsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5120:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5121:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5121:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5122:1: ruleAttr
            {
             before(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_110240);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5131:1: rule__AttrWithList__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__AttrWithList__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5135:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5136:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5136:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5137:1: RULE_IDENT
            {
             before(grammarAccess.getAttrWithListAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_010271); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5146:1: rule__AttrWithList__AttrsAssignment_2 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5150:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5151:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5151:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5152:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_210302);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5161:1: rule__AttrWithList__AttrsAssignment_3_1 : ( ruleAttr ) ;
    public final void rule__AttrWithList__AttrsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5165:1: ( ( ruleAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5166:1: ( ruleAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5166:1: ( ruleAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5167:1: ruleAttr
            {
             before(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_110333);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5176:1: rule__LiteralAttr__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__LiteralAttr__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5180:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5181:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5181:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5182:1: RULE_IDENT
            {
             before(grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_010364); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5191:1: rule__LiteralAttr__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__LiteralAttr__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5195:1: ( ( ruleLiteral ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5196:1: ( ruleLiteral )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5196:1: ( ruleLiteral )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5197:1: ruleLiteral
            {
             before(grammarAccess.getLiteralAttrAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_210395);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5206:1: rule__ItemAndAttrs__AttrsAssignment_0 : ( ruleItemAttr ) ;
    public final void rule__ItemAndAttrs__AttrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5210:1: ( ( ruleItemAttr ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5211:1: ( ruleItemAttr )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5211:1: ( ruleItemAttr )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5212:1: ruleItemAttr
            {
             before(grammarAccess.getItemAndAttrsAccess().getAttrsItemAttrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_010426);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5221:1: rule__ItemAndAttrs__ItemAssignment_1 : ( ruleItem ) ;
    public final void rule__ItemAndAttrs__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5225:1: ( ( ruleItem ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5226:1: ( ruleItem )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5226:1: ( ruleItem )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5227:1: ruleItem
            {
             before(grammarAccess.getItemAndAttrsAccess().getItemItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_110457);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5236:1: rule__ModItem__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__ModItem__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5240:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5241:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5241:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5242:1: RULE_IDENT
            {
             before(grammarAccess.getModItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_110488); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5251:1: rule__ModItem__ExternalBodyAssignment_2_0 : ( ( ';' ) ) ;
    public final void rule__ModItem__ExternalBodyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5255:1: ( ( ( ';' ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5256:1: ( ( ';' ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5256:1: ( ( ';' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5257:1: ( ';' )
            {
             before(grammarAccess.getModItemAccess().getExternalBodySemicolonKeyword_2_0_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5258:1: ( ';' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5259:1: ';'
            {
             before(grammarAccess.getModItemAccess().getExternalBodySemicolonKeyword_2_0_0()); 
            match(input,62,FOLLOW_62_in_rule__ModItem__ExternalBodyAssignment_2_010524); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5274:1: rule__ModItem__ItemsAssignment_2_1_1 : ( ruleItemAndAttrs ) ;
    public final void rule__ModItem__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5278:1: ( ( ruleItemAndAttrs ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5279:1: ( ruleItemAndAttrs )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5279:1: ( ruleItemAndAttrs )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5280:1: ruleItemAndAttrs
            {
             before(grammarAccess.getModItemAccess().getItemsItemAndAttrsParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_rule__ModItem__ItemsAssignment_2_1_110563);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5289:1: rule__FnItem__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__FnItem__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5293:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5294:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5294:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5295:1: RULE_IDENT
            {
             before(grammarAccess.getFnItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__FnItem__IdentAssignment_110594); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5304:1: rule__FnItem__ParamsAssignment_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__FnItem__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5308:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5309:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5309:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5310:1: ruleGenericParamDecl
            {
             before(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_110625);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5319:1: rule__FnItem__ParamsAssignment_2_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__FnItem__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5323:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5324:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5324:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5325:1: ruleGenericParamDecl
            {
             before(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_2_110656);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5334:1: rule__FnItem__ArgsAssignment_4_0 : ( ruleArg ) ;
    public final void rule__FnItem__ArgsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5338:1: ( ( ruleArg ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5339:1: ( ruleArg )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5339:1: ( ruleArg )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5340:1: ruleArg
            {
             before(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_010687);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5349:1: rule__FnItem__ArgsAssignment_4_1_1 : ( ruleArg ) ;
    public final void rule__FnItem__ArgsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5353:1: ( ( ruleArg ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5354:1: ( ruleArg )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5354:1: ( ruleArg )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5355:1: ruleArg
            {
             before(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_1_110718);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5364:1: rule__FnItem__ReturnTypeAssignment_6_1 : ( ruleType ) ;
    public final void rule__FnItem__ReturnTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5368:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5369:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5369:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5370:1: ruleType
            {
             before(grammarAccess.getFnItemAccess().getReturnTypeTypeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__FnItem__ReturnTypeAssignment_6_110749);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5379:1: rule__FnItem__BodyAssignment_7 : ( ruleBlock ) ;
    public final void rule__FnItem__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5383:1: ( ( ruleBlock ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5384:1: ( ruleBlock )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5384:1: ( ruleBlock )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5385:1: ruleBlock
            {
             before(grammarAccess.getFnItemAccess().getBodyBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__FnItem__BodyAssignment_710780);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5394:1: rule__GenericParamDecl__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__GenericParamDecl__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5398:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5399:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5399:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5400:1: RULE_IDENT
            {
             before(grammarAccess.getGenericParamDeclAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__IdentAssignment_010811); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5409:1: rule__GenericParamDecl__BoundsAssignment_1_1 : ( RULE_IDENT ) ;
    public final void rule__GenericParamDecl__BoundsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5413:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5414:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5414:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5415:1: RULE_IDENT
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_110842); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5424:1: rule__GenericParamDecl__BoundsAssignment_1_2_1 : ( RULE_IDENT ) ;
    public final void rule__GenericParamDecl__BoundsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5428:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5429:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5429:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5430:1: RULE_IDENT
            {
             before(grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_2_110873); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5439:1: rule__Arg__PatAssignment_0 : ( rulePat ) ;
    public final void rule__Arg__PatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5443:1: ( ( rulePat ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5444:1: ( rulePat )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5444:1: ( rulePat )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5445:1: rulePat
            {
             before(grammarAccess.getArgAccess().getPatPatParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePat_in_rule__Arg__PatAssignment_010904);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5454:1: rule__Arg__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Arg__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5458:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5459:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5459:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5460:1: ruleType
            {
             before(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Arg__TypeAssignment_210935);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5469:1: rule__Pat__IdentAssignment : ( RULE_IDENT ) ;
    public final void rule__Pat__IdentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5473:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5474:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5474:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5475:1: RULE_IDENT
            {
             before(grammarAccess.getPatAccess().getIdentIDENTTerminalRuleCall_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Pat__IdentAssignment10966); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5484:1: rule__TupleType__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5488:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5489:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5489:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5490:1: ruleType
            {
             before(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_110997);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5499:1: rule__TupleType__TypesAssignment_2_1 : ( ruleType ) ;
    public final void rule__TupleType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5503:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5504:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5504:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5505:1: ruleType
            {
             before(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_2_111028);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5514:1: rule__StructType__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__StructType__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5518:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5519:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5519:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5520:1: RULE_IDENT
            {
             before(grammarAccess.getStructTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__StructType__IdentAssignment_111059); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5529:1: rule__StructType__ParamsAssignment_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructType__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5533:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5534:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5534:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5535:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_111090);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5544:1: rule__StructType__ParamsAssignment_2_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructType__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5548:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5549:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5549:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5550:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_2_111121);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5559:1: rule__StructType__FieldsAssignment_4 : ( ruleStructField ) ;
    public final void rule__StructType__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5563:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5564:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5564:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5565:1: ruleStructField
            {
             before(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_411152);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5574:1: rule__StructType__FieldsAssignment_5_1 : ( ruleStructField ) ;
    public final void rule__StructType__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5578:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5579:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5579:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5580:1: ruleStructField
            {
             before(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_5_111183);
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


    // $ANTLR start "rule__StructField__VisAssignment_0"
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5589:1: rule__StructField__VisAssignment_0 : ( ruleVisibility ) ;
    public final void rule__StructField__VisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5593:1: ( ( ruleVisibility ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5594:1: ( ruleVisibility )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5594:1: ( ruleVisibility )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5595:1: ruleVisibility
            {
             before(grammarAccess.getStructFieldAccess().getVisVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibility_in_rule__StructField__VisAssignment_011214);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5604:1: rule__StructField__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__StructField__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5608:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5609:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5609:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5610:1: RULE_IDENT
            {
             before(grammarAccess.getStructFieldAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__StructField__IdentAssignment_111245); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5619:1: rule__StructField__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__StructField__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5623:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5624:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5624:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5625:1: ruleType
            {
             before(grammarAccess.getStructFieldAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__StructField__TypeAssignment_311276);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5634:1: rule__EnumType__IdentAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__EnumType__IdentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5638:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5639:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5639:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5640:1: RULE_IDENT
            {
             before(grammarAccess.getEnumTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__EnumType__IdentAssignment_111307); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5649:1: rule__EnumType__ParamsAssignment_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__EnumType__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5653:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5654:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5654:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5655:1: ruleGenericParamDecl
            {
             before(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_111338);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5664:1: rule__EnumType__ParamsAssignment_2_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__EnumType__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5668:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5669:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5669:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5670:1: ruleGenericParamDecl
            {
             before(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_2_111369);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5679:1: rule__EnumType__VariantsAssignment_4 : ( ruleVariant ) ;
    public final void rule__EnumType__VariantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5683:1: ( ( ruleVariant ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5684:1: ( ruleVariant )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5684:1: ( ruleVariant )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5685:1: ruleVariant
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_411400);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5694:1: rule__EnumType__VariantsAssignment_5_1 : ( ruleVariant ) ;
    public final void rule__EnumType__VariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5698:1: ( ( ruleVariant ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5699:1: ( ruleVariant )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5699:1: ( ruleVariant )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5700:1: ruleVariant
            {
             before(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_5_111431);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5709:1: rule__StructVariant__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__StructVariant__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5713:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5714:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5714:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5715:1: RULE_IDENT
            {
             before(grammarAccess.getStructVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__StructVariant__IdentAssignment_011462); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5724:1: rule__StructVariant__ParamsAssignment_1_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructVariant__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5728:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5729:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5729:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5730:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_111493);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5739:1: rule__StructVariant__ParamsAssignment_1_2_1 : ( ruleGenericParamDecl ) ;
    public final void rule__StructVariant__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5743:1: ( ( ruleGenericParamDecl ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5744:1: ( ruleGenericParamDecl )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5744:1: ( ruleGenericParamDecl )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5745:1: ruleGenericParamDecl
            {
             before(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_2_111524);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5754:1: rule__StructVariant__FieldsAssignment_3 : ( ruleStructField ) ;
    public final void rule__StructVariant__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5758:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5759:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5759:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5760:1: ruleStructField
            {
             before(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_311555);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5769:1: rule__StructVariant__FieldsAssignment_4_1 : ( ruleStructField ) ;
    public final void rule__StructVariant__FieldsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5773:1: ( ( ruleStructField ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5774:1: ( ruleStructField )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5774:1: ( ruleStructField )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5775:1: ruleStructField
            {
             before(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_4_111586);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5784:1: rule__TupleVariant__IdentAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__TupleVariant__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5788:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5789:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5789:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5790:1: RULE_IDENT
            {
             before(grammarAccess.getTupleVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__TupleVariant__IdentAssignment_011617); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5799:1: rule__TupleVariant__TypesAssignment_2 : ( ruleType ) ;
    public final void rule__TupleVariant__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5803:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5804:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5804:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5805:1: ruleType
            {
             before(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_211648);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5814:1: rule__TupleVariant__TypesAssignment_3_1 : ( ruleType ) ;
    public final void rule__TupleVariant__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5818:1: ( ( ruleType ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5819:1: ( ruleType )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5819:1: ( ruleType )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5820:1: ruleType
            {
             before(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_3_111679);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5829:1: rule__UnitVariant__IdentAssignment : ( RULE_IDENT ) ;
    public final void rule__UnitVariant__IdentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5833:1: ( ( RULE_IDENT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5834:1: ( RULE_IDENT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5834:1: ( RULE_IDENT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5835:1: RULE_IDENT
            {
             before(grammarAccess.getUnitVariantAccess().getIdentIDENTTerminalRuleCall_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__UnitVariant__IdentAssignment11710); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5844:1: rule__StringLit__ValueAssignment : ( RULE_STRING_LIT ) ;
    public final void rule__StringLit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5848:1: ( ( RULE_STRING_LIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5849:1: ( RULE_STRING_LIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5849:1: ( RULE_STRING_LIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5850:1: RULE_STRING_LIT
            {
             before(grammarAccess.getStringLitAccess().getValueSTRING_LITTerminalRuleCall_0()); 
            match(input,RULE_STRING_LIT,FOLLOW_RULE_STRING_LIT_in_rule__StringLit__ValueAssignment11741); 
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5859:1: rule__NumberLit__ValueAssignment : ( ( rule__NumberLit__ValueAlternatives_0 ) ) ;
    public final void rule__NumberLit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5863:1: ( ( ( rule__NumberLit__ValueAlternatives_0 ) ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5864:1: ( ( rule__NumberLit__ValueAlternatives_0 ) )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5864:1: ( ( rule__NumberLit__ValueAlternatives_0 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5865:1: ( rule__NumberLit__ValueAlternatives_0 )
            {
             before(grammarAccess.getNumberLitAccess().getValueAlternatives_0()); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5866:1: ( rule__NumberLit__ValueAlternatives_0 )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5866:2: rule__NumberLit__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__NumberLit__ValueAlternatives_0_in_rule__NumberLit__ValueAssignment11772);
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
    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5875:1: rule__CharLit__ValueAssignment : ( RULE_CHAR_LIT ) ;
    public final void rule__CharLit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5879:1: ( ( RULE_CHAR_LIT ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5880:1: ( RULE_CHAR_LIT )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5880:1: ( RULE_CHAR_LIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:5881:1: RULE_CHAR_LIT
            {
             before(grammarAccess.getCharLitAccess().getValueCHAR_LITTerminalRuleCall_0()); 
            match(input,RULE_CHAR_LIT,FOLLOW_RULE_CHAR_LIT_in_rule__CharLit__ValueAssignment11805); 
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
    public static final BitSet FOLLOW_ruleStructField_in_entryRuleStructField1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructField1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__0_in_ruleStructField1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0_in_ruleEnumType1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariant1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variant__Alternatives_in_ruleVariant1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_entryRuleStructVariant1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructVariant1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__0_in_ruleStructVariant1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleVariant1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__0_in_ruleTupleVariant1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitVariant1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnitVariant__IdentAssignment_in_ruleUnitVariant1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_entryRuleStringLit1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLit1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLit__ValueAssignment_in_ruleStringLit1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_entryRuleNumberLit1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLit1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLit__ValueAssignment_in_ruleNumberLit1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharLit__ValueAssignment_in_ruleCharLit1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_rule__Attr__Alternatives1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_rule__Attr__Alternatives1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_rule__Item__Alternatives1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFnItem_in_rule__Item__Alternatives1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__ExternalBodyAssignment_2_0_in_rule__ModItem__Alternatives_21825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0_in_rule__ModItem__Alternatives_21843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_rule__Type__Alternatives1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_rule__Type__Alternatives1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Type__Alternatives1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__0_in_rule__PrimitiveType__Alternatives1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__0_in_rule__PrimitiveType__Alternatives1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__0_in_rule__PrimitiveType__Alternatives1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__0_in_rule__PrimitiveType__Alternatives2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__0_in_rule__PrimitiveType__Alternatives2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_rule__Variant__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_rule__Variant__Alternatives2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_rule__Variant__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rule__Literal__Alternatives2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rule__Literal__Alternatives2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_rule__Literal__Alternatives2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_rule__NumberLit__ValueAlternatives_02196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LIT_in_rule__NumberLit__ValueAlternatives_02213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Visibility__Alternatives2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Visibility__Alternatives2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__0__Impl_in_rule__ItemAttr__Group__02300 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1_in_rule__ItemAttr__Group__02303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ItemAttr__Group__0__Impl2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__1__Impl_in_rule__ItemAttr__Group__12362 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2_in_rule__ItemAttr__Group__12365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_1_in_rule__ItemAttr__Group__1__Impl2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__2__Impl_in_rule__ItemAttr__Group__22422 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3_in_rule__ItemAttr__Group__22425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0_in_rule__ItemAttr__Group__2__Impl2452 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group__3__Impl_in_rule__ItemAttr__Group__32483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ItemAttr__Group__3__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__0__Impl_in_rule__ItemAttr__Group_2__02550 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1_in_rule__ItemAttr__Group_2__02553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ItemAttr__Group_2__0__Impl2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__Group_2__1__Impl_in_rule__ItemAttr__Group_2__12612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAttr__AttrsAssignment_2_1_in_rule__ItemAttr__Group_2__1__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__0__Impl_in_rule__AttrWithList__Group__02673 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1_in_rule__AttrWithList__Group__02676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__IdentAssignment_0_in_rule__AttrWithList__Group__0__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__1__Impl_in_rule__AttrWithList__Group__12733 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2_in_rule__AttrWithList__Group__12736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AttrWithList__Group__1__Impl2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__2__Impl_in_rule__AttrWithList__Group__22795 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3_in_rule__AttrWithList__Group__22798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_2_in_rule__AttrWithList__Group__2__Impl2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__3__Impl_in_rule__AttrWithList__Group__32855 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4_in_rule__AttrWithList__Group__32858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0_in_rule__AttrWithList__Group__3__Impl2885 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group__4__Impl_in_rule__AttrWithList__Group__42916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AttrWithList__Group__4__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__0__Impl_in_rule__AttrWithList__Group_3__02985 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1_in_rule__AttrWithList__Group_3__02988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AttrWithList__Group_3__0__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__Group_3__1__Impl_in_rule__AttrWithList__Group_3__13047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrWithList__AttrsAssignment_3_1_in_rule__AttrWithList__Group_3__1__Impl3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__0__Impl_in_rule__LiteralAttr__Group__03108 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1_in_rule__LiteralAttr__Group__03111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__IdentAssignment_0_in_rule__LiteralAttr__Group__0__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__1__Impl_in_rule__LiteralAttr__Group__13168 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2_in_rule__LiteralAttr__Group__13171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__LiteralAttr__Group__1__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__Group__2__Impl_in_rule__LiteralAttr__Group__23230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAttr__ValueAssignment_2_in_rule__LiteralAttr__Group__2__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__0__Impl_in_rule__ItemAndAttrs__Group__03293 = new BitSet(new long[]{0x0048200000000000L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1_in_rule__ItemAndAttrs__Group__03296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__AttrsAssignment_0_in_rule__ItemAndAttrs__Group__0__Impl3323 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__Group__1__Impl_in_rule__ItemAndAttrs__Group__13354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemAndAttrs__ItemAssignment_1_in_rule__ItemAndAttrs__Group__1__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__0__Impl_in_rule__ModItem__Group__03415 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1_in_rule__ModItem__Group__03418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ModItem__Group__0__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__1__Impl_in_rule__ModItem__Group__13477 = new BitSet(new long[]{0x4010000000000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2_in_rule__ModItem__Group__13480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__IdentAssignment_1_in_rule__ModItem__Group__1__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group__2__Impl_in_rule__ModItem__Group__23537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Alternatives_2_in_rule__ModItem__Group__2__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__0__Impl_in_rule__ModItem__Group_2_1__03600 = new BitSet(new long[]{0x0068200000000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1_in_rule__ModItem__Group_2_1__03603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ModItem__Group_2_1__0__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__1__Impl_in_rule__ModItem__Group_2_1__13662 = new BitSet(new long[]{0x0068200000000000L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__2_in_rule__ModItem__Group_2_1__13665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModItem__ItemsAssignment_2_1_1_in_rule__ModItem__Group_2_1__1__Impl3692 = new BitSet(new long[]{0x0048200000000002L});
    public static final BitSet FOLLOW_rule__ModItem__Group_2_1__2__Impl_in_rule__ModItem__Group_2_1__23723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ModItem__Group_2_1__2__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__0__Impl_in_rule__FnItem__Group__03788 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group__1_in_rule__FnItem__Group__03791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__FnItem__Group__0__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__1__Impl_in_rule__FnItem__Group__13850 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__2_in_rule__FnItem__Group__13853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__IdentAssignment_1_in_rule__FnItem__Group__1__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__2__Impl_in_rule__FnItem__Group__23910 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__3_in_rule__FnItem__Group__23913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__0_in_rule__FnItem__Group__2__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__3__Impl_in_rule__FnItem__Group__33971 = new BitSet(new long[]{0x0002000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group__4_in_rule__FnItem__Group__33974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FnItem__Group__3__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__4__Impl_in_rule__FnItem__Group__44033 = new BitSet(new long[]{0x0002000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group__5_in_rule__FnItem__Group__44036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__0_in_rule__FnItem__Group__4__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__5__Impl_in_rule__FnItem__Group__54094 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__6_in_rule__FnItem__Group__54097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__FnItem__Group__5__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__6__Impl_in_rule__FnItem__Group__64156 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group__7_in_rule__FnItem__Group__64159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__0_in_rule__FnItem__Group__6__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group__7__Impl_in_rule__FnItem__Group__74217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__BodyAssignment_7_in_rule__FnItem__Group__7__Impl4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__0__Impl_in_rule__FnItem__Group_2__04290 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__1_in_rule__FnItem__Group_2__04293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__FnItem__Group_2__0__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__1__Impl_in_rule__FnItem__Group_2__14352 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__2_in_rule__FnItem__Group_2__14355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ParamsAssignment_2_1_in_rule__FnItem__Group_2__1__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__2__Impl_in_rule__FnItem__Group_2__24412 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__3_in_rule__FnItem__Group_2__24415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__0_in_rule__FnItem__Group_2__2__Impl4442 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2__3__Impl_in_rule__FnItem__Group_2__34473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__FnItem__Group_2__3__Impl4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__0__Impl_in_rule__FnItem__Group_2_2__04540 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__1_in_rule__FnItem__Group_2_2__04543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FnItem__Group_2_2__0__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_2_2__1__Impl_in_rule__FnItem__Group_2_2__14602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ParamsAssignment_2_2_1_in_rule__FnItem__Group_2_2__1__Impl4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__0__Impl_in_rule__FnItem__Group_4__04663 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__1_in_rule__FnItem__Group_4__04666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ArgsAssignment_4_0_in_rule__FnItem__Group_4__0__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4__1__Impl_in_rule__FnItem__Group_4__14723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__0_in_rule__FnItem__Group_4__1__Impl4750 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__0__Impl_in_rule__FnItem__Group_4_1__04785 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__1_in_rule__FnItem__Group_4_1__04788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FnItem__Group_4_1__0__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_4_1__1__Impl_in_rule__FnItem__Group_4_1__14847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ArgsAssignment_4_1_1_in_rule__FnItem__Group_4_1__1__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__0__Impl_in_rule__FnItem__Group_6__04908 = new BitSet(new long[]{0x30010000000007C0L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__1_in_rule__FnItem__Group_6__04911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__FnItem__Group_6__0__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__Group_6__1__Impl_in_rule__FnItem__Group_6__14970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FnItem__ReturnTypeAssignment_6_1_in_rule__FnItem__Group_6__1__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05031 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Block__Group__0__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Block__Group__1__Impl5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__0__Impl_in_rule__GenericParamDecl__Group__05156 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__1_in_rule__GenericParamDecl__Group__05159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__IdentAssignment_0_in_rule__GenericParamDecl__Group__0__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group__1__Impl_in_rule__GenericParamDecl__Group__15216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__0_in_rule__GenericParamDecl__Group__1__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__0__Impl_in_rule__GenericParamDecl__Group_1__05278 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__1_in_rule__GenericParamDecl__Group_1__05281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__GenericParamDecl__Group_1__0__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__1__Impl_in_rule__GenericParamDecl__Group_1__15340 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__2_in_rule__GenericParamDecl__Group_1__15343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_1_in_rule__GenericParamDecl__Group_1__1__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1__2__Impl_in_rule__GenericParamDecl__Group_1__25400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__0_in_rule__GenericParamDecl__Group_1__2__Impl5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__0__Impl_in_rule__GenericParamDecl__Group_1_2__05463 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__1_in_rule__GenericParamDecl__Group_1_2__05466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__GenericParamDecl__Group_1_2__0__Impl5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__Group_1_2__1__Impl_in_rule__GenericParamDecl__Group_1_2__15525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericParamDecl__BoundsAssignment_1_2_1_in_rule__GenericParamDecl__Group_1_2__1__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__0__Impl_in_rule__Arg__Group__05586 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Arg__Group__1_in_rule__Arg__Group__05589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__PatAssignment_0_in_rule__Arg__Group__0__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__1__Impl_in_rule__Arg__Group__15646 = new BitSet(new long[]{0x30010000000007C0L});
    public static final BitSet FOLLOW_rule__Arg__Group__2_in_rule__Arg__Group__15649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Arg__Group__1__Impl5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__2__Impl_in_rule__Arg__Group__25708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__TypeAssignment_2_in_rule__Arg__Group__2__Impl5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__0__Impl_in_rule__PrimitiveType__Group_0__05771 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__1_in_rule__PrimitiveType__Group_0__05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_0__1__Impl_in_rule__PrimitiveType__Group_0__15832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rule__PrimitiveType__Group_0__1__Impl5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__0__Impl_in_rule__PrimitiveType__Group_1__05892 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__1_in_rule__PrimitiveType__Group_1__05895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_1__1__Impl_in_rule__PrimitiveType__Group_1__15953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_in_rule__PrimitiveType__Group_1__1__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__0__Impl_in_rule__PrimitiveType__Group_2__06013 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__1_in_rule__PrimitiveType__Group_2__06016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_2__1__Impl_in_rule__PrimitiveType__Group_2__16074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_TYPE_in_rule__PrimitiveType__Group_2__1__Impl6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__0__Impl_in_rule__PrimitiveType__Group_3__06134 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__1_in_rule__PrimitiveType__Group_3__06137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_3__1__Impl_in_rule__PrimitiveType__Group_3__16195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MACHINE_TYPE_in_rule__PrimitiveType__Group_3__1__Impl6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__0__Impl_in_rule__PrimitiveType__Group_4__06255 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__1_in_rule__PrimitiveType__Group_4__06258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group_4__1__Impl_in_rule__PrimitiveType__Group_4__16316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNIT_TYPE_in_rule__PrimitiveType__Group_4__1__Impl6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__0__Impl_in_rule__TupleType__Group__06376 = new BitSet(new long[]{0x30010000000007C0L});
    public static final BitSet FOLLOW_rule__TupleType__Group__1_in_rule__TupleType__Group__06379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TupleType__Group__0__Impl6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__1__Impl_in_rule__TupleType__Group__16438 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__TupleType__Group__2_in_rule__TupleType__Group__16441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__TypesAssignment_1_in_rule__TupleType__Group__1__Impl6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__2__Impl_in_rule__TupleType__Group__26498 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__TupleType__Group__3_in_rule__TupleType__Group__26501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__0_in_rule__TupleType__Group__2__Impl6528 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group__3__Impl_in_rule__TupleType__Group__36559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TupleType__Group__3__Impl6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__0__Impl_in_rule__TupleType__Group_2__06626 = new BitSet(new long[]{0x30010000000007C0L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__1_in_rule__TupleType__Group_2__06629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TupleType__Group_2__0__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__Group_2__1__Impl_in_rule__TupleType__Group_2__16688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleType__TypesAssignment_2_1_in_rule__TupleType__Group_2__1__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__0__Impl_in_rule__StructType__Group__06749 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group__1_in_rule__StructType__Group__06752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__StructType__Group__0__Impl6780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__1__Impl_in_rule__StructType__Group__16811 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__2_in_rule__StructType__Group__16814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__IdentAssignment_1_in_rule__StructType__Group__1__Impl6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__2__Impl_in_rule__StructType__Group__26871 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__3_in_rule__StructType__Group__26874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__0_in_rule__StructType__Group__2__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__3__Impl_in_rule__StructType__Group__36932 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group__4_in_rule__StructType__Group__36935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__StructType__Group__3__Impl6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__4__Impl_in_rule__StructType__Group__46994 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__5_in_rule__StructType__Group__46997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__FieldsAssignment_4_in_rule__StructType__Group__4__Impl7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__5__Impl_in_rule__StructType__Group__57054 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group__6_in_rule__StructType__Group__57057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__0_in_rule__StructType__Group__5__Impl7084 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group__6__Impl_in_rule__StructType__Group__67115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__StructType__Group__6__Impl7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__0__Impl_in_rule__StructType__Group_2__07188 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__1_in_rule__StructType__Group_2__07191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__StructType__Group_2__0__Impl7219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__1__Impl_in_rule__StructType__Group_2__17250 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__2_in_rule__StructType__Group_2__17253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__ParamsAssignment_2_1_in_rule__StructType__Group_2__1__Impl7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__2__Impl_in_rule__StructType__Group_2__27310 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__3_in_rule__StructType__Group_2__27313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__0_in_rule__StructType__Group_2__2__Impl7340 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2__3__Impl_in_rule__StructType__Group_2__37371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__StructType__Group_2__3__Impl7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__0__Impl_in_rule__StructType__Group_2_2__07438 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__1_in_rule__StructType__Group_2_2__07441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StructType__Group_2_2__0__Impl7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_2_2__1__Impl_in_rule__StructType__Group_2_2__17500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__ParamsAssignment_2_2_1_in_rule__StructType__Group_2_2__1__Impl7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__0__Impl_in_rule__StructType__Group_5__07561 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__1_in_rule__StructType__Group_5__07564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StructType__Group_5__0__Impl7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__Group_5__1__Impl_in_rule__StructType__Group_5__17623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructType__FieldsAssignment_5_1_in_rule__StructType__Group_5__1__Impl7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__0__Impl_in_rule__StructField__Group__07684 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructField__Group__1_in_rule__StructField__Group__07687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__VisAssignment_0_in_rule__StructField__Group__0__Impl7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__1__Impl_in_rule__StructField__Group__17745 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__StructField__Group__2_in_rule__StructField__Group__17748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__IdentAssignment_1_in_rule__StructField__Group__1__Impl7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__2__Impl_in_rule__StructField__Group__27805 = new BitSet(new long[]{0x30010000000007C0L});
    public static final BitSet FOLLOW_rule__StructField__Group__3_in_rule__StructField__Group__27808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__StructField__Group__2__Impl7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__Group__3__Impl_in_rule__StructField__Group__37867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructField__TypeAssignment_3_in_rule__StructField__Group__3__Impl7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__07932 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__07935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EnumType__Group__0__Impl7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__17994 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__17997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__IdentAssignment_1_in_rule__EnumType__Group__1__Impl8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__28054 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__28057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__0_in_rule__EnumType__Group__2__Impl8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__38115 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__38118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EnumType__Group__3__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__48177 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__48180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__VariantsAssignment_4_in_rule__EnumType__Group__4__Impl8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__58237 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__58240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__0_in_rule__EnumType__Group__5__Impl8267 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__68298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__EnumType__Group__6__Impl8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__0__Impl_in_rule__EnumType__Group_2__08371 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__1_in_rule__EnumType__Group_2__08374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__EnumType__Group_2__0__Impl8402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__1__Impl_in_rule__EnumType__Group_2__18433 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__2_in_rule__EnumType__Group_2__18436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__ParamsAssignment_2_1_in_rule__EnumType__Group_2__1__Impl8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__2__Impl_in_rule__EnumType__Group_2__28493 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__3_in_rule__EnumType__Group_2__28496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__0_in_rule__EnumType__Group_2__2__Impl8523 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2__3__Impl_in_rule__EnumType__Group_2__38554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__EnumType__Group_2__3__Impl8582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__0__Impl_in_rule__EnumType__Group_2_2__08621 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__1_in_rule__EnumType__Group_2_2__08624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumType__Group_2_2__0__Impl8652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_2_2__1__Impl_in_rule__EnumType__Group_2_2__18683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__ParamsAssignment_2_2_1_in_rule__EnumType__Group_2_2__1__Impl8710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__0__Impl_in_rule__EnumType__Group_5__08744 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__1_in_rule__EnumType__Group_5__08747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumType__Group_5__0__Impl8775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_5__1__Impl_in_rule__EnumType__Group_5__18806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__VariantsAssignment_5_1_in_rule__EnumType__Group_5__1__Impl8833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__0__Impl_in_rule__StructVariant__Group__08867 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__1_in_rule__StructVariant__Group__08870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__IdentAssignment_0_in_rule__StructVariant__Group__0__Impl8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__1__Impl_in_rule__StructVariant__Group__18927 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__2_in_rule__StructVariant__Group__18930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__0_in_rule__StructVariant__Group__1__Impl8957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__2__Impl_in_rule__StructVariant__Group__28988 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__3_in_rule__StructVariant__Group__28991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__StructVariant__Group__2__Impl9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__3__Impl_in_rule__StructVariant__Group__39050 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__4_in_rule__StructVariant__Group__39053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__FieldsAssignment_3_in_rule__StructVariant__Group__3__Impl9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__4__Impl_in_rule__StructVariant__Group__49110 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__5_in_rule__StructVariant__Group__49113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__0_in_rule__StructVariant__Group__4__Impl9140 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group__5__Impl_in_rule__StructVariant__Group__59171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__StructVariant__Group__5__Impl9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__0__Impl_in_rule__StructVariant__Group_1__09242 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__1_in_rule__StructVariant__Group_1__09245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__StructVariant__Group_1__0__Impl9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__1__Impl_in_rule__StructVariant__Group_1__19304 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__2_in_rule__StructVariant__Group_1__19307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__ParamsAssignment_1_1_in_rule__StructVariant__Group_1__1__Impl9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__2__Impl_in_rule__StructVariant__Group_1__29364 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__3_in_rule__StructVariant__Group_1__29367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__0_in_rule__StructVariant__Group_1__2__Impl9394 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1__3__Impl_in_rule__StructVariant__Group_1__39425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__StructVariant__Group_1__3__Impl9453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__0__Impl_in_rule__StructVariant__Group_1_2__09492 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__1_in_rule__StructVariant__Group_1_2__09495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StructVariant__Group_1_2__0__Impl9523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_1_2__1__Impl_in_rule__StructVariant__Group_1_2__19554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__ParamsAssignment_1_2_1_in_rule__StructVariant__Group_1_2__1__Impl9581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__0__Impl_in_rule__StructVariant__Group_4__09615 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__1_in_rule__StructVariant__Group_4__09618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StructVariant__Group_4__0__Impl9646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__Group_4__1__Impl_in_rule__StructVariant__Group_4__19677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructVariant__FieldsAssignment_4_1_in_rule__StructVariant__Group_4__1__Impl9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__0__Impl_in_rule__TupleVariant__Group__09738 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__1_in_rule__TupleVariant__Group__09741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__IdentAssignment_0_in_rule__TupleVariant__Group__0__Impl9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__1__Impl_in_rule__TupleVariant__Group__19798 = new BitSet(new long[]{0x30010000000007C0L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__2_in_rule__TupleVariant__Group__19801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TupleVariant__Group__1__Impl9829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__2__Impl_in_rule__TupleVariant__Group__29860 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__3_in_rule__TupleVariant__Group__29863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__TypesAssignment_2_in_rule__TupleVariant__Group__2__Impl9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__3__Impl_in_rule__TupleVariant__Group__39920 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__4_in_rule__TupleVariant__Group__39923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__0_in_rule__TupleVariant__Group__3__Impl9950 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group__4__Impl_in_rule__TupleVariant__Group__49981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TupleVariant__Group__4__Impl10009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__0__Impl_in_rule__TupleVariant__Group_3__010050 = new BitSet(new long[]{0x30010000000007C0L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__1_in_rule__TupleVariant__Group_3__010053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TupleVariant__Group_3__0__Impl10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__Group_3__1__Impl_in_rule__TupleVariant__Group_3__110112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TupleVariant__TypesAssignment_3_1_in_rule__TupleVariant__Group_3__1__Impl10139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_rule__Crate__ItemsAssignment10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_110209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__ItemAttr__AttrsAssignment_2_110240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__AttrWithList__IdentAssignment_010271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_210302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_rule__AttrWithList__AttrsAssignment_3_110333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__LiteralAttr__IdentAssignment_010364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAttr__ValueAssignment_210395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_rule__ItemAndAttrs__AttrsAssignment_010426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__ItemAndAttrs__ItemAssignment_110457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__ModItem__IdentAssignment_110488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__ModItem__ExternalBodyAssignment_2_010524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_rule__ModItem__ItemsAssignment_2_1_110563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__FnItem__IdentAssignment_110594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_110625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__FnItem__ParamsAssignment_2_2_110656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_010687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_rule__FnItem__ArgsAssignment_4_1_110718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__FnItem__ReturnTypeAssignment_6_110749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__FnItem__BodyAssignment_710780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__IdentAssignment_010811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_110842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__GenericParamDecl__BoundsAssignment_1_2_110873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_rule__Arg__PatAssignment_010904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Arg__TypeAssignment_210935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Pat__IdentAssignment10966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_110997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleType__TypesAssignment_2_111028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__StructType__IdentAssignment_111059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_111090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructType__ParamsAssignment_2_2_111121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_411152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructType__FieldsAssignment_5_111183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__StructField__VisAssignment_011214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__StructField__IdentAssignment_111245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__StructField__TypeAssignment_311276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__EnumType__IdentAssignment_111307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_111338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__EnumType__ParamsAssignment_2_2_111369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_411400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_rule__EnumType__VariantsAssignment_5_111431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__StructVariant__IdentAssignment_011462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_111493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_rule__StructVariant__ParamsAssignment_1_2_111524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_311555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_rule__StructVariant__FieldsAssignment_4_111586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__TupleVariant__IdentAssignment_011617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_211648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TupleVariant__TypesAssignment_3_111679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__UnitVariant__IdentAssignment11710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LIT_in_rule__StringLit__ValueAssignment11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLit__ValueAlternatives_0_in_rule__NumberLit__ValueAssignment11772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_LIT_in_rule__CharLit__ValueAssignment11805 = new BitSet(new long[]{0x0000000000000002L});

}