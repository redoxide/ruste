package de.redoxi.ruste.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.redoxi.ruste.services.RustGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRustParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING_LIT", "RULE_MUT_KEYWORD", "RULE_LIFETIME", "RULE_INT_TYPE", "RULE_FLOAT_TYPE", "RULE_BOOLEAN_TYPE", "RULE_MACHINE_TYPE", "RULE_UNIT_TYPE", "RULE_FLOAT_LIT", "RULE_INT_LIT", "RULE_CHAR_LIT", "RULE_INT_SIZE", "RULE_SIGNED_INT_TYPE", "RULE_UNSIGNED_INT_TYPE", "RULE_I8", "RULE_I16", "RULE_I32", "RULE_I64", "RULE_U8", "RULE_U16", "RULE_U32", "RULE_U64", "RULE_FLOAT_SIZE", "RULE_F32", "RULE_F64", "RULE_MACHINE_INT_TYPE", "RULE_MACHINE_UINT_TYPE", "RULE_UNICODE_CHAR", "RULE_UTF8_CHAR", "RULE_UTF16_CHAR", "RULE_UTF32_CHAR", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_DEC_INT_LIT", "RULE_BIN_INT_LIT", "RULE_OCT_INT_LIT", "RULE_HEX_INT_LIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "'#['", "','", "']'", "'('", "')'", "'='", "'mod'", "';'", "'{'", "'}'", "'fn'", "'<'", "'>'", "'->'", "'type'", "'struct'", "'enum'", "'trait'", "'unsafe'", "'extern'", "'impl'", "'for'", "'static'", "':'", "'..'", "'['", "'-'", "'*'", "'!'", "'@'", "'~'", "'&'", "'/'", "'%'", "'as'", "'+'", "'<<'", "'>>'", "'^'", "'|'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'while'", "'loop'", "'break'", "'continue'", "'do'", "'in'", "'if'", "'else'", "'match'", "'=>'", "'return'", "'_'", "'::'", "'::<'", "'priv'", "'pub'"
    };
    public static final int RULE_FLOAT_TYPE=9;
    public static final int RULE_I8=19;
    public static final int RULE_MACHINE_UINT_TYPE=31;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_OCT_INT_LIT=40;
    public static final int RULE_INT_LIT=14;
    public static final int T__99=99;
    public static final int RULE_U32=25;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int RULE_HEX_INT_LIT=41;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_F64=29;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_OCT_DIGIT=42;
    public static final int RULE_DEC_DIGIT=37;
    public static final int RULE_HEX_DIGIT=36;
    public static final int RULE_UNICODE_CHAR=32;
    public static final int RULE_UTF8_CHAR=33;
    public static final int T__85=85;
    public static final int RULE_I32=21;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_UNSIGNED_INT_TYPE=18;
    public static final int RULE_XID_START=43;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_IDENT=4;
    public static final int RULE_MACHINE_TYPE=11;
    public static final int RULE_FLOAT_SIZE=27;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_BOOLEAN_TYPE=10;
    public static final int RULE_UNIT_TYPE=12;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DEC_INT_LIT=38;
    public static final int RULE_SIGNED_INT_TYPE=17;
    public static final int RULE_MUT_KEYWORD=6;
    public static final int RULE_UTF32_CHAR=35;
    public static final int RULE_UTF16_CHAR=34;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_I16=20;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_U8=23;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_U64=26;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int RULE_BIN_INT_LIT=39;
    public static final int T__105=105;
    public static final int RULE_XID_CONTINUE=44;
    public static final int RULE_MACHINE_INT_TYPE=30;
    public static final int T__50=50;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_LIFETIME=7;
    public static final int RULE_INT_SIZE=16;
    public static final int RULE_INT_TYPE=8;
    public static final int RULE_I64=22;
    public static final int RULE_FLOAT_LIT=13;
    public static final int RULE_F32=28;
    public static final int RULE_U16=24;
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_CHAR_LIT=15;

    // delegates
    // delegators


        public InternalRustParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRustParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRustParser.tokenNames; }
    public String getGrammarFileName() { return "../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g"; }



     	private RustGrammarAccess grammarAccess;
     	
        public InternalRustParser(TokenStream input, RustGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Crate";	
       	}
       	
       	@Override
       	protected RustGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCrate"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:68:1: entryRuleCrate returns [EObject current=null] : iv_ruleCrate= ruleCrate EOF ;
    public final EObject entryRuleCrate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrate = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:69:2: (iv_ruleCrate= ruleCrate EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:70:2: iv_ruleCrate= ruleCrate EOF
            {
             newCompositeNode(grammarAccess.getCrateRule()); 
            pushFollow(FOLLOW_ruleCrate_in_entryRuleCrate75);
            iv_ruleCrate=ruleCrate();

            state._fsp--;

             current =iv_ruleCrate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrate85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrate"


    // $ANTLR start "ruleCrate"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:77:1: ruleCrate returns [EObject current=null] : ( (lv_items_0_0= ruleItemAndAttrs ) )* ;
    public final EObject ruleCrate() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:80:28: ( ( (lv_items_0_0= ruleItemAndAttrs ) )* )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:81:1: ( (lv_items_0_0= ruleItemAndAttrs ) )*
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:81:1: ( (lv_items_0_0= ruleItemAndAttrs ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==45||LA1_0==51||LA1_0==55||(LA1_0>=59 && LA1_0<=62)||(LA1_0>=64 && LA1_0<=65)||LA1_0==67) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:82:1: (lv_items_0_0= ruleItemAndAttrs )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:82:1: (lv_items_0_0= ruleItemAndAttrs )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:83:3: lv_items_0_0= ruleItemAndAttrs
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCrateAccess().getItemsItemAndAttrsParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItemAndAttrs_in_ruleCrate130);
            	    lv_items_0_0=ruleItemAndAttrs();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCrateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_0_0, 
            	            		"ItemAndAttrs");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrate"


    // $ANTLR start "entryRuleItemAttr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:107:1: entryRuleItemAttr returns [EObject current=null] : iv_ruleItemAttr= ruleItemAttr EOF ;
    public final EObject entryRuleItemAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemAttr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:108:2: (iv_ruleItemAttr= ruleItemAttr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:109:2: iv_ruleItemAttr= ruleItemAttr EOF
            {
             newCompositeNode(grammarAccess.getItemAttrRule()); 
            pushFollow(FOLLOW_ruleItemAttr_in_entryRuleItemAttr166);
            iv_ruleItemAttr=ruleItemAttr();

            state._fsp--;

             current =iv_ruleItemAttr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemAttr176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemAttr"


    // $ANTLR start "ruleItemAttr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:116:1: ruleItemAttr returns [EObject current=null] : (otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleItemAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attrs_1_0 = null;

        EObject lv_attrs_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:119:28: ( (otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:120:1: (otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:120:1: (otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:120:3: otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleItemAttr213); 

                	newLeafNode(otherlv_0, grammarAccess.getItemAttrAccess().getNumberSignLeftSquareBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:124:1: ( (lv_attrs_1_0= ruleAttr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:125:1: (lv_attrs_1_0= ruleAttr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:125:1: (lv_attrs_1_0= ruleAttr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:126:3: lv_attrs_1_0= ruleAttr
            {
             
            	        newCompositeNode(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttr_in_ruleItemAttr234);
            lv_attrs_1_0=ruleAttr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getItemAttrRule());
            	        }
                   		add(
                   			current, 
                   			"attrs",
                    		lv_attrs_1_0, 
                    		"Attr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:142:2: (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==46) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:142:4: otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleItemAttr247); 

            	        	newLeafNode(otherlv_2, grammarAccess.getItemAttrAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:146:1: ( (lv_attrs_3_0= ruleAttr ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:147:1: (lv_attrs_3_0= ruleAttr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:147:1: (lv_attrs_3_0= ruleAttr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:148:3: lv_attrs_3_0= ruleAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getItemAttrAccess().getAttrsAttrParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttr_in_ruleItemAttr268);
            	    lv_attrs_3_0=ruleAttr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getItemAttrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attrs",
            	            		lv_attrs_3_0, 
            	            		"Attr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleItemAttr282); 

                	newLeafNode(otherlv_4, grammarAccess.getItemAttrAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemAttr"


    // $ANTLR start "entryRuleAttr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:176:1: entryRuleAttr returns [EObject current=null] : iv_ruleAttr= ruleAttr EOF ;
    public final EObject entryRuleAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:177:2: (iv_ruleAttr= ruleAttr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:178:2: iv_ruleAttr= ruleAttr EOF
            {
             newCompositeNode(grammarAccess.getAttrRule()); 
            pushFollow(FOLLOW_ruleAttr_in_entryRuleAttr318);
            iv_ruleAttr=ruleAttr();

            state._fsp--;

             current =iv_ruleAttr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttr328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttr"


    // $ANTLR start "ruleAttr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:185:1: ruleAttr returns [EObject current=null] : (this_LiteralAttr_0= ruleLiteralAttr | this_AttrWithList_1= ruleAttrWithList ) ;
    public final EObject ruleAttr() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralAttr_0 = null;

        EObject this_AttrWithList_1 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:188:28: ( (this_LiteralAttr_0= ruleLiteralAttr | this_AttrWithList_1= ruleAttrWithList ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:189:1: (this_LiteralAttr_0= ruleLiteralAttr | this_AttrWithList_1= ruleAttrWithList )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:189:1: (this_LiteralAttr_0= ruleLiteralAttr | this_AttrWithList_1= ruleAttrWithList )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==48) ) {
                    alt3=2;
                }
                else if ( (LA3_1==50) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:190:5: this_LiteralAttr_0= ruleLiteralAttr
                    {
                     
                            newCompositeNode(grammarAccess.getAttrAccess().getLiteralAttrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteralAttr_in_ruleAttr375);
                    this_LiteralAttr_0=ruleLiteralAttr();

                    state._fsp--;

                     
                            current = this_LiteralAttr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:200:5: this_AttrWithList_1= ruleAttrWithList
                    {
                     
                            newCompositeNode(grammarAccess.getAttrAccess().getAttrWithListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttrWithList_in_ruleAttr402);
                    this_AttrWithList_1=ruleAttrWithList();

                    state._fsp--;

                     
                            current = this_AttrWithList_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttr"


    // $ANTLR start "entryRuleAttrWithList"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:216:1: entryRuleAttrWithList returns [EObject current=null] : iv_ruleAttrWithList= ruleAttrWithList EOF ;
    public final EObject entryRuleAttrWithList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrWithList = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:217:2: (iv_ruleAttrWithList= ruleAttrWithList EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:218:2: iv_ruleAttrWithList= ruleAttrWithList EOF
            {
             newCompositeNode(grammarAccess.getAttrWithListRule()); 
            pushFollow(FOLLOW_ruleAttrWithList_in_entryRuleAttrWithList437);
            iv_ruleAttrWithList=ruleAttrWithList();

            state._fsp--;

             current =iv_ruleAttrWithList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrWithList447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttrWithList"


    // $ANTLR start "ruleAttrWithList"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:225:1: ruleAttrWithList returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleAttrWithList() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attrs_2_0 = null;

        EObject lv_attrs_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:228:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:229:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:229:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:229:2: ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:229:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:230:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:230:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:231:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAttrWithList489); 

            			newLeafNode(lv_ident_0_0, grammarAccess.getAttrWithListAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrWithListRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_0_0, 
                    		"IDENT");
            	    

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleAttrWithList506); 

                	newLeafNode(otherlv_1, grammarAccess.getAttrWithListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:251:1: ( (lv_attrs_2_0= ruleAttr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:252:1: (lv_attrs_2_0= ruleAttr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:252:1: (lv_attrs_2_0= ruleAttr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:253:3: lv_attrs_2_0= ruleAttr
            {
             
            	        newCompositeNode(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttr_in_ruleAttrWithList527);
            lv_attrs_2_0=ruleAttr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttrWithListRule());
            	        }
                   		add(
                   			current, 
                   			"attrs",
                    		lv_attrs_2_0, 
                    		"Attr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:269:2: (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==46) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:269:4: otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleAttrWithList540); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAttrWithListAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:273:1: ( (lv_attrs_4_0= ruleAttr ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:274:1: (lv_attrs_4_0= ruleAttr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:274:1: (lv_attrs_4_0= ruleAttr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:275:3: lv_attrs_4_0= ruleAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttrWithListAccess().getAttrsAttrParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttr_in_ruleAttrWithList561);
            	    lv_attrs_4_0=ruleAttr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttrWithListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attrs",
            	            		lv_attrs_4_0, 
            	            		"Attr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleAttrWithList575); 

                	newLeafNode(otherlv_5, grammarAccess.getAttrWithListAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttrWithList"


    // $ANTLR start "entryRuleLiteralAttr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:303:1: entryRuleLiteralAttr returns [EObject current=null] : iv_ruleLiteralAttr= ruleLiteralAttr EOF ;
    public final EObject entryRuleLiteralAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralAttr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:304:2: (iv_ruleLiteralAttr= ruleLiteralAttr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:305:2: iv_ruleLiteralAttr= ruleLiteralAttr EOF
            {
             newCompositeNode(grammarAccess.getLiteralAttrRule()); 
            pushFollow(FOLLOW_ruleLiteralAttr_in_entryRuleLiteralAttr611);
            iv_ruleLiteralAttr=ruleLiteralAttr();

            state._fsp--;

             current =iv_ruleLiteralAttr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAttr621); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralAttr"


    // $ANTLR start "ruleLiteralAttr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:312:1: ruleLiteralAttr returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleLiteralAttr() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:315:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:316:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:316:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:316:2: ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:316:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:317:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:317:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:318:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleLiteralAttr663); 

            			newLeafNode(lv_ident_0_0, grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralAttrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_0_0, 
                    		"IDENT");
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleLiteralAttr680); 

                	newLeafNode(otherlv_1, grammarAccess.getLiteralAttrAccess().getEqualsSignKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:338:1: ( (lv_value_2_0= ruleLiteral ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:339:1: (lv_value_2_0= ruleLiteral )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:339:1: (lv_value_2_0= ruleLiteral )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:340:3: lv_value_2_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getLiteralAttrAccess().getValueLiteralParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleLiteralAttr701);
            lv_value_2_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLiteralAttrRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Literal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralAttr"


    // $ANTLR start "entryRuleItemAndAttrs"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:364:1: entryRuleItemAndAttrs returns [EObject current=null] : iv_ruleItemAndAttrs= ruleItemAndAttrs EOF ;
    public final EObject entryRuleItemAndAttrs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemAndAttrs = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:365:2: (iv_ruleItemAndAttrs= ruleItemAndAttrs EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:366:2: iv_ruleItemAndAttrs= ruleItemAndAttrs EOF
            {
             newCompositeNode(grammarAccess.getItemAndAttrsRule()); 
            pushFollow(FOLLOW_ruleItemAndAttrs_in_entryRuleItemAndAttrs737);
            iv_ruleItemAndAttrs=ruleItemAndAttrs();

            state._fsp--;

             current =iv_ruleItemAndAttrs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemAndAttrs747); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemAndAttrs"


    // $ANTLR start "ruleItemAndAttrs"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:373:1: ruleItemAndAttrs returns [EObject current=null] : ( ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) ) ) ;
    public final EObject ruleItemAndAttrs() throws RecognitionException {
        EObject current = null;

        EObject lv_attrs_0_0 = null;

        EObject lv_item_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:376:28: ( ( ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:377:1: ( ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:377:1: ( ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:377:2: ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:377:2: ( (lv_attrs_0_0= ruleItemAttr ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==45) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:378:1: (lv_attrs_0_0= ruleItemAttr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:378:1: (lv_attrs_0_0= ruleItemAttr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:379:3: lv_attrs_0_0= ruleItemAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getItemAndAttrsAccess().getAttrsItemAttrParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItemAttr_in_ruleItemAndAttrs793);
            	    lv_attrs_0_0=ruleItemAttr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getItemAndAttrsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attrs",
            	            		lv_attrs_0_0, 
            	            		"ItemAttr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:395:3: ( (lv_item_1_0= ruleItem ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:396:1: (lv_item_1_0= ruleItem )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:396:1: (lv_item_1_0= ruleItem )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:397:3: lv_item_1_0= ruleItem
            {
             
            	        newCompositeNode(grammarAccess.getItemAndAttrsAccess().getItemItemParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleItem_in_ruleItemAndAttrs815);
            lv_item_1_0=ruleItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getItemAndAttrsRule());
            	        }
                   		set(
                   			current, 
                   			"item",
                    		lv_item_1_0, 
                    		"Item");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemAndAttrs"


    // $ANTLR start "entryRuleItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:421:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:422:2: (iv_ruleItem= ruleItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:423:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem851);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem861); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:430:1: ruleItem returns [EObject current=null] : (this_ModItem_0= ruleModItem | this_FnItem_1= ruleFnItem | this_TypeItem_2= ruleTypeItem | this_StructItem_3= ruleStructItem | this_EnumItem_4= ruleEnumItem | this_TraitItem_5= ruleTraitItem | this_ImplItem_6= ruleImplItem | this_ExternBlock_7= ruleExternBlock | this_StaticItem_8= ruleStaticItem ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_ModItem_0 = null;

        EObject this_FnItem_1 = null;

        EObject this_TypeItem_2 = null;

        EObject this_StructItem_3 = null;

        EObject this_EnumItem_4 = null;

        EObject this_TraitItem_5 = null;

        EObject this_ImplItem_6 = null;

        EObject this_ExternBlock_7 = null;

        EObject this_StaticItem_8 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:433:28: ( (this_ModItem_0= ruleModItem | this_FnItem_1= ruleFnItem | this_TypeItem_2= ruleTypeItem | this_StructItem_3= ruleStructItem | this_EnumItem_4= ruleEnumItem | this_TraitItem_5= ruleTraitItem | this_ImplItem_6= ruleImplItem | this_ExternBlock_7= ruleExternBlock | this_StaticItem_8= ruleStaticItem ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:434:1: (this_ModItem_0= ruleModItem | this_FnItem_1= ruleFnItem | this_TypeItem_2= ruleTypeItem | this_StructItem_3= ruleStructItem | this_EnumItem_4= ruleEnumItem | this_TraitItem_5= ruleTraitItem | this_ImplItem_6= ruleImplItem | this_ExternBlock_7= ruleExternBlock | this_StaticItem_8= ruleStaticItem )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:434:1: (this_ModItem_0= ruleModItem | this_FnItem_1= ruleFnItem | this_TypeItem_2= ruleTypeItem | this_StructItem_3= ruleStructItem | this_EnumItem_4= ruleEnumItem | this_TraitItem_5= ruleTraitItem | this_ImplItem_6= ruleImplItem | this_ExternBlock_7= ruleExternBlock | this_StaticItem_8= ruleStaticItem )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt6=1;
                }
                break;
            case 55:
                {
                alt6=2;
                }
                break;
            case 59:
                {
                alt6=3;
                }
                break;
            case 60:
                {
                alt6=4;
                }
                break;
            case 61:
                {
                alt6=5;
                }
                break;
            case 62:
                {
                alt6=6;
                }
                break;
            case 65:
                {
                alt6=7;
                }
                break;
            case 64:
                {
                alt6=8;
                }
                break;
            case 67:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:435:5: this_ModItem_0= ruleModItem
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getModItemParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleModItem_in_ruleItem908);
                    this_ModItem_0=ruleModItem();

                    state._fsp--;

                     
                            current = this_ModItem_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:445:5: this_FnItem_1= ruleFnItem
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getFnItemParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFnItem_in_ruleItem935);
                    this_FnItem_1=ruleFnItem();

                    state._fsp--;

                     
                            current = this_FnItem_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:455:5: this_TypeItem_2= ruleTypeItem
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTypeItemParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTypeItem_in_ruleItem962);
                    this_TypeItem_2=ruleTypeItem();

                    state._fsp--;

                     
                            current = this_TypeItem_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:465:5: this_StructItem_3= ruleStructItem
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getStructItemParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStructItem_in_ruleItem989);
                    this_StructItem_3=ruleStructItem();

                    state._fsp--;

                     
                            current = this_StructItem_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:475:5: this_EnumItem_4= ruleEnumItem
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getEnumItemParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEnumItem_in_ruleItem1016);
                    this_EnumItem_4=ruleEnumItem();

                    state._fsp--;

                     
                            current = this_EnumItem_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:485:5: this_TraitItem_5= ruleTraitItem
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTraitItemParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTraitItem_in_ruleItem1043);
                    this_TraitItem_5=ruleTraitItem();

                    state._fsp--;

                     
                            current = this_TraitItem_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:495:5: this_ImplItem_6= ruleImplItem
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getImplItemParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleImplItem_in_ruleItem1070);
                    this_ImplItem_6=ruleImplItem();

                    state._fsp--;

                     
                            current = this_ImplItem_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:505:5: this_ExternBlock_7= ruleExternBlock
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getExternBlockParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleExternBlock_in_ruleItem1097);
                    this_ExternBlock_7=ruleExternBlock();

                    state._fsp--;

                     
                            current = this_ExternBlock_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:515:5: this_StaticItem_8= ruleStaticItem
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getStaticItemParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleStaticItem_in_ruleItem1124);
                    this_StaticItem_8=ruleStaticItem();

                    state._fsp--;

                     
                            current = this_StaticItem_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleModItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:531:1: entryRuleModItem returns [EObject current=null] : iv_ruleModItem= ruleModItem EOF ;
    public final EObject entryRuleModItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:532:2: (iv_ruleModItem= ruleModItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:533:2: iv_ruleModItem= ruleModItem EOF
            {
             newCompositeNode(grammarAccess.getModItemRule()); 
            pushFollow(FOLLOW_ruleModItem_in_entryRuleModItem1159);
            iv_ruleModItem=ruleModItem();

            state._fsp--;

             current =iv_ruleModItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModItem1169); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModItem"


    // $ANTLR start "ruleModItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:540:1: ruleModItem returns [EObject current=null] : (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) ( ( (lv_externalBody_2_0= ';' ) ) | (otherlv_3= '{' ( (lv_items_4_0= ruleItemAndAttrs ) )* otherlv_5= '}' ) ) ) ;
    public final EObject ruleModItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token lv_externalBody_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:543:28: ( (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) ( ( (lv_externalBody_2_0= ';' ) ) | (otherlv_3= '{' ( (lv_items_4_0= ruleItemAndAttrs ) )* otherlv_5= '}' ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:544:1: (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) ( ( (lv_externalBody_2_0= ';' ) ) | (otherlv_3= '{' ( (lv_items_4_0= ruleItemAndAttrs ) )* otherlv_5= '}' ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:544:1: (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) ( ( (lv_externalBody_2_0= ';' ) ) | (otherlv_3= '{' ( (lv_items_4_0= ruleItemAndAttrs ) )* otherlv_5= '}' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:544:3: otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) ( ( (lv_externalBody_2_0= ';' ) ) | (otherlv_3= '{' ( (lv_items_4_0= ruleItemAndAttrs ) )* otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleModItem1206); 

                	newLeafNode(otherlv_0, grammarAccess.getModItemAccess().getModKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:548:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:549:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:549:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:550:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleModItem1223); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getModItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:566:2: ( ( (lv_externalBody_2_0= ';' ) ) | (otherlv_3= '{' ( (lv_items_4_0= ruleItemAndAttrs ) )* otherlv_5= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==52) ) {
                alt8=1;
            }
            else if ( (LA8_0==53) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:566:3: ( (lv_externalBody_2_0= ';' ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:566:3: ( (lv_externalBody_2_0= ';' ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:567:1: (lv_externalBody_2_0= ';' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:567:1: (lv_externalBody_2_0= ';' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:568:3: lv_externalBody_2_0= ';'
                    {
                    lv_externalBody_2_0=(Token)match(input,52,FOLLOW_52_in_ruleModItem1247); 

                            newLeafNode(lv_externalBody_2_0, grammarAccess.getModItemAccess().getExternalBodySemicolonKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModItemRule());
                    	        }
                           		setWithLastConsumed(current, "externalBody", true, ";");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:582:6: (otherlv_3= '{' ( (lv_items_4_0= ruleItemAndAttrs ) )* otherlv_5= '}' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:582:6: (otherlv_3= '{' ( (lv_items_4_0= ruleItemAndAttrs ) )* otherlv_5= '}' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:582:8: otherlv_3= '{' ( (lv_items_4_0= ruleItemAndAttrs ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleModItem1279); 

                        	newLeafNode(otherlv_3, grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:586:1: ( (lv_items_4_0= ruleItemAndAttrs ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==45||LA7_0==51||LA7_0==55||(LA7_0>=59 && LA7_0<=62)||(LA7_0>=64 && LA7_0<=65)||LA7_0==67) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:587:1: (lv_items_4_0= ruleItemAndAttrs )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:587:1: (lv_items_4_0= ruleItemAndAttrs )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:588:3: lv_items_4_0= ruleItemAndAttrs
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModItemAccess().getItemsItemAndAttrsParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleItemAndAttrs_in_ruleModItem1300);
                    	    lv_items_4_0=ruleItemAndAttrs();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_4_0, 
                    	            		"ItemAndAttrs");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleModItem1313); 

                        	newLeafNode(otherlv_5, grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_2());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModItem"


    // $ANTLR start "entryRuleFnItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:616:1: entryRuleFnItem returns [EObject current=null] : iv_ruleFnItem= ruleFnItem EOF ;
    public final EObject entryRuleFnItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFnItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:617:2: (iv_ruleFnItem= ruleFnItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:618:2: iv_ruleFnItem= ruleFnItem EOF
            {
             newCompositeNode(grammarAccess.getFnItemRule()); 
            pushFollow(FOLLOW_ruleFnItem_in_entryRuleFnItem1351);
            iv_ruleFnItem=ruleFnItem();

            state._fsp--;

             current =iv_ruleFnItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFnItem1361); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFnItem"


    // $ANTLR start "ruleFnItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:625:1: ruleFnItem returns [EObject current=null] : (otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( ( (lv_args_8_0= ruleArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleArg ) ) )* )? otherlv_11= ')' (otherlv_12= '->' ( (lv_returnType_13_0= ruleType ) ) )? ( (lv_body_14_0= ruleBlock ) ) ) ;
    public final EObject ruleFnItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_args_8_0 = null;

        EObject lv_args_10_0 = null;

        EObject lv_returnType_13_0 = null;

        EObject lv_body_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:628:28: ( (otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( ( (lv_args_8_0= ruleArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleArg ) ) )* )? otherlv_11= ')' (otherlv_12= '->' ( (lv_returnType_13_0= ruleType ) ) )? ( (lv_body_14_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:629:1: (otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( ( (lv_args_8_0= ruleArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleArg ) ) )* )? otherlv_11= ')' (otherlv_12= '->' ( (lv_returnType_13_0= ruleType ) ) )? ( (lv_body_14_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:629:1: (otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( ( (lv_args_8_0= ruleArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleArg ) ) )* )? otherlv_11= ')' (otherlv_12= '->' ( (lv_returnType_13_0= ruleType ) ) )? ( (lv_body_14_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:629:3: otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( ( (lv_args_8_0= ruleArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleArg ) ) )* )? otherlv_11= ')' (otherlv_12= '->' ( (lv_returnType_13_0= ruleType ) ) )? ( (lv_body_14_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleFnItem1398); 

                	newLeafNode(otherlv_0, grammarAccess.getFnItemAccess().getFnKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:633:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:634:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:634:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:635:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFnItem1415); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getFnItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFnItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:651:2: (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==56) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:651:4: otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleFnItem1433); 

                        	newLeafNode(otherlv_2, grammarAccess.getFnItemAccess().getLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:655:1: ( (lv_params_3_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:656:1: (lv_params_3_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:656:1: (lv_params_3_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:657:3: lv_params_3_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleFnItem1454);
                    lv_params_3_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFnItemRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:673:2: (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==46) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:673:4: otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleFnItem1467); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFnItemAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:677:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:678:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:678:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:679:3: lv_params_5_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFnItemAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleFnItem1488);
                    	    lv_params_5_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFnItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"GenericParamDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleFnItem1502); 

                        	newLeafNode(otherlv_6, grammarAccess.getFnItemAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleFnItem1516); 

                	newLeafNode(otherlv_7, grammarAccess.getFnItemAccess().getLeftParenthesisKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:703:1: ( ( (lv_args_8_0= ruleArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleArg ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_IDENT && LA12_0<=RULE_MUT_KEYWORD)||(LA12_0>=RULE_FLOAT_LIT && LA12_0<=RULE_CHAR_LIT)||LA12_0==48||LA12_0==70||(LA12_0>=74 && LA12_0<=76)||LA12_0==101) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:703:2: ( (lv_args_8_0= ruleArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleArg ) ) )*
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:703:2: ( (lv_args_8_0= ruleArg ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:704:1: (lv_args_8_0= ruleArg )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:704:1: (lv_args_8_0= ruleArg )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:705:3: lv_args_8_0= ruleArg
                    {
                     
                    	        newCompositeNode(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArg_in_ruleFnItem1538);
                    lv_args_8_0=ruleArg();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFnItemRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_8_0, 
                            		"Arg");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:721:2: (otherlv_9= ',' ( (lv_args_10_0= ruleArg ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==46) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:721:4: otherlv_9= ',' ( (lv_args_10_0= ruleArg ) )
                    	    {
                    	    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleFnItem1551); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getFnItemAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:725:1: ( (lv_args_10_0= ruleArg ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:726:1: (lv_args_10_0= ruleArg )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:726:1: (lv_args_10_0= ruleArg )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:727:3: lv_args_10_0= ruleArg
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFnItemAccess().getArgsArgParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArg_in_ruleFnItem1572);
                    	    lv_args_10_0=ruleArg();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFnItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_10_0, 
                    	            		"Arg");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,49,FOLLOW_49_in_ruleFnItem1588); 

                	newLeafNode(otherlv_11, grammarAccess.getFnItemAccess().getRightParenthesisKeyword_5());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:747:1: (otherlv_12= '->' ( (lv_returnType_13_0= ruleType ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==58) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:747:3: otherlv_12= '->' ( (lv_returnType_13_0= ruleType ) )
                    {
                    otherlv_12=(Token)match(input,58,FOLLOW_58_in_ruleFnItem1601); 

                        	newLeafNode(otherlv_12, grammarAccess.getFnItemAccess().getHyphenMinusGreaterThanSignKeyword_6_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:751:1: ( (lv_returnType_13_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:752:1: (lv_returnType_13_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:752:1: (lv_returnType_13_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:753:3: lv_returnType_13_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFnItemAccess().getReturnTypeTypeParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleFnItem1622);
                    lv_returnType_13_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFnItemRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_13_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:769:4: ( (lv_body_14_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:770:1: (lv_body_14_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:770:1: (lv_body_14_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:771:3: lv_body_14_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getFnItemAccess().getBodyBlockParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleFnItem1645);
            lv_body_14_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFnItemRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_14_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFnItem"


    // $ANTLR start "entryRuleTypeItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:795:1: entryRuleTypeItem returns [EObject current=null] : iv_ruleTypeItem= ruleTypeItem EOF ;
    public final EObject entryRuleTypeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:796:2: (iv_ruleTypeItem= ruleTypeItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:797:2: iv_ruleTypeItem= ruleTypeItem EOF
            {
             newCompositeNode(grammarAccess.getTypeItemRule()); 
            pushFollow(FOLLOW_ruleTypeItem_in_entryRuleTypeItem1681);
            iv_ruleTypeItem=ruleTypeItem();

            state._fsp--;

             current =iv_ruleTypeItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeItem1691); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeItem"


    // $ANTLR start "ruleTypeItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:804:1: ruleTypeItem returns [EObject current=null] : (otherlv_0= 'type' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '=' ( (lv_type_8_0= ruleType ) ) otherlv_9= ';' ) ;
    public final EObject ruleTypeItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_type_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:807:28: ( (otherlv_0= 'type' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '=' ( (lv_type_8_0= ruleType ) ) otherlv_9= ';' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:808:1: (otherlv_0= 'type' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '=' ( (lv_type_8_0= ruleType ) ) otherlv_9= ';' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:808:1: (otherlv_0= 'type' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '=' ( (lv_type_8_0= ruleType ) ) otherlv_9= ';' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:808:3: otherlv_0= 'type' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '=' ( (lv_type_8_0= ruleType ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleTypeItem1728); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeItemAccess().getTypeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:812:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:813:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:813:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:814:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTypeItem1745); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getTypeItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:830:2: (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==56) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:830:4: otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleTypeItem1763); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeItemAccess().getLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:834:1: ( (lv_params_3_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:835:1: (lv_params_3_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:835:1: (lv_params_3_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:836:3: lv_params_3_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeItemAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleTypeItem1784);
                    lv_params_3_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeItemRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:852:2: (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==46) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:852:4: otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleTypeItem1797); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTypeItemAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:856:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:857:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:857:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:858:3: lv_params_5_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeItemAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleTypeItem1818);
                    	    lv_params_5_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"GenericParamDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleTypeItem1832); 

                        	newLeafNode(otherlv_6, grammarAccess.getTypeItemAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleTypeItem1846); 

                	newLeafNode(otherlv_7, grammarAccess.getTypeItemAccess().getEqualsSignKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:882:1: ( (lv_type_8_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:883:1: (lv_type_8_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:883:1: (lv_type_8_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:884:3: lv_type_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeItemAccess().getTypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeItem1867);
            lv_type_8_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeItemRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,52,FOLLOW_52_in_ruleTypeItem1879); 

                	newLeafNode(otherlv_9, grammarAccess.getTypeItemAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeItem"


    // $ANTLR start "entryRuleStructItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:912:1: entryRuleStructItem returns [EObject current=null] : iv_ruleStructItem= ruleStructItem EOF ;
    public final EObject entryRuleStructItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:913:2: (iv_ruleStructItem= ruleStructItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:914:2: iv_ruleStructItem= ruleStructItem EOF
            {
             newCompositeNode(grammarAccess.getStructItemRule()); 
            pushFollow(FOLLOW_ruleStructItem_in_entryRuleStructItem1915);
            iv_ruleStructItem=ruleStructItem();

            state._fsp--;

             current =iv_ruleStructItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructItem1925); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructItem"


    // $ANTLR start "ruleStructItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:921:1: ruleStructItem returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleStructItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_fields_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:924:28: ( (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:925:1: (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:925:1: (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:925:3: otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleStructItem1962); 

                	newLeafNode(otherlv_0, grammarAccess.getStructItemAccess().getStructKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:929:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:930:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:930:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:931:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructItem1979); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getStructItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:947:2: (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==56) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:947:4: otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleStructItem1997); 

                        	newLeafNode(otherlv_2, grammarAccess.getStructItemAccess().getLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:951:1: ( (lv_params_3_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:952:1: (lv_params_3_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:952:1: (lv_params_3_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:953:3: lv_params_3_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructItemAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructItem2018);
                    lv_params_3_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructItemRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:969:2: (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==46) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:969:4: otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleStructItem2031); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getStructItemAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:973:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:974:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:974:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:975:3: lv_params_5_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructItemAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructItem2052);
                    	    lv_params_5_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"GenericParamDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleStructItem2066); 

                        	newLeafNode(otherlv_6, grammarAccess.getStructItemAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleStructItem2080); 

                	newLeafNode(otherlv_7, grammarAccess.getStructItemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:999:1: ( (lv_fields_8_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1000:1: (lv_fields_8_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1000:1: (lv_fields_8_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1001:3: lv_fields_8_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getStructItemAccess().getFieldsStructFieldParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleStructItem2101);
            lv_fields_8_0=ruleStructField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStructItemRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_8_0, 
                    		"StructField");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1017:2: (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1017:4: otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleStructItem2114); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStructItemAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1021:1: ( (lv_fields_10_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1022:1: (lv_fields_10_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1022:1: (lv_fields_10_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1023:3: lv_fields_10_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructItemAccess().getFieldsStructFieldParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleStructItem2135);
            	    lv_fields_10_0=ruleStructField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructItemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_10_0, 
            	            		"StructField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleStructItem2149); 

                	newLeafNode(otherlv_11, grammarAccess.getStructItemAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructItem"


    // $ANTLR start "entryRuleEnumItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1051:1: entryRuleEnumItem returns [EObject current=null] : iv_ruleEnumItem= ruleEnumItem EOF ;
    public final EObject entryRuleEnumItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1052:2: (iv_ruleEnumItem= ruleEnumItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1053:2: iv_ruleEnumItem= ruleEnumItem EOF
            {
             newCompositeNode(grammarAccess.getEnumItemRule()); 
            pushFollow(FOLLOW_ruleEnumItem_in_entryRuleEnumItem2185);
            iv_ruleEnumItem=ruleEnumItem();

            state._fsp--;

             current =iv_ruleEnumItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumItem2195); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumItem"


    // $ANTLR start "ruleEnumItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1060:1: ruleEnumItem returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleEnumVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleEnumVariant ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleEnumItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_variants_8_0 = null;

        EObject lv_variants_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1063:28: ( (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleEnumVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleEnumVariant ) ) )* otherlv_11= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1064:1: (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleEnumVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleEnumVariant ) ) )* otherlv_11= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1064:1: (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleEnumVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleEnumVariant ) ) )* otherlv_11= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1064:3: otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleEnumVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleEnumVariant ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleEnumItem2232); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumItemAccess().getEnumKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1068:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1069:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1069:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1070:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleEnumItem2249); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getEnumItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1086:2: (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==56) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1086:4: otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleEnumItem2267); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumItemAccess().getLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1090:1: ( (lv_params_3_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1091:1: (lv_params_3_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1091:1: (lv_params_3_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1092:3: lv_params_3_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumItemAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleEnumItem2288);
                    lv_params_3_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumItemRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1108:2: (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==46) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1108:4: otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleEnumItem2301); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEnumItemAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1112:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1113:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1113:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1114:3: lv_params_5_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumItemAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleEnumItem2322);
                    	    lv_params_5_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"GenericParamDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleEnumItem2336); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumItemAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleEnumItem2350); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumItemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1138:1: ( (lv_variants_8_0= ruleEnumVariant ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1139:1: (lv_variants_8_0= ruleEnumVariant )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1139:1: (lv_variants_8_0= ruleEnumVariant )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1140:3: lv_variants_8_0= ruleEnumVariant
            {
             
            	        newCompositeNode(grammarAccess.getEnumItemAccess().getVariantsEnumVariantParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumVariant_in_ruleEnumItem2371);
            lv_variants_8_0=ruleEnumVariant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumItemRule());
            	        }
                   		add(
                   			current, 
                   			"variants",
                    		lv_variants_8_0, 
                    		"EnumVariant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1156:2: (otherlv_9= ',' ( (lv_variants_10_0= ruleEnumVariant ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1156:4: otherlv_9= ',' ( (lv_variants_10_0= ruleEnumVariant ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleEnumItem2384); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEnumItemAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1160:1: ( (lv_variants_10_0= ruleEnumVariant ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1161:1: (lv_variants_10_0= ruleEnumVariant )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1161:1: (lv_variants_10_0= ruleEnumVariant )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1162:3: lv_variants_10_0= ruleEnumVariant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumItemAccess().getVariantsEnumVariantParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumVariant_in_ruleEnumItem2405);
            	    lv_variants_10_0=ruleEnumVariant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumItemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variants",
            	            		lv_variants_10_0, 
            	            		"EnumVariant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleEnumItem2419); 

                	newLeafNode(otherlv_11, grammarAccess.getEnumItemAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumItem"


    // $ANTLR start "entryRuleEnumVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1190:1: entryRuleEnumVariant returns [EObject current=null] : iv_ruleEnumVariant= ruleEnumVariant EOF ;
    public final EObject entryRuleEnumVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1191:2: (iv_ruleEnumVariant= ruleEnumVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1192:2: iv_ruleEnumVariant= ruleEnumVariant EOF
            {
             newCompositeNode(grammarAccess.getEnumVariantRule()); 
            pushFollow(FOLLOW_ruleEnumVariant_in_entryRuleEnumVariant2455);
            iv_ruleEnumVariant=ruleEnumVariant();

            state._fsp--;

             current =iv_ruleEnumVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumVariant2465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumVariant"


    // $ANTLR start "ruleEnumVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1199:1: ruleEnumVariant returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_params_4_0= RULE_IDENT ) ) )* otherlv_5= '>' )? ( (otherlv_6= '(' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= ')' ) | (otherlv_11= '{' ( (lv_fields_12_0= ruleStructField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )* otherlv_15= '}' ) )? ) ;
    public final EObject ruleEnumVariant() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        Token lv_params_2_0=null;
        Token otherlv_3=null;
        Token lv_params_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_types_7_0 = null;

        EObject lv_types_9_0 = null;

        EObject lv_fields_12_0 = null;

        EObject lv_fields_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1202:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_params_4_0= RULE_IDENT ) ) )* otherlv_5= '>' )? ( (otherlv_6= '(' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= ')' ) | (otherlv_11= '{' ( (lv_fields_12_0= ruleStructField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )* otherlv_15= '}' ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1203:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_params_4_0= RULE_IDENT ) ) )* otherlv_5= '>' )? ( (otherlv_6= '(' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= ')' ) | (otherlv_11= '{' ( (lv_fields_12_0= ruleStructField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )* otherlv_15= '}' ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1203:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_params_4_0= RULE_IDENT ) ) )* otherlv_5= '>' )? ( (otherlv_6= '(' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= ')' ) | (otherlv_11= '{' ( (lv_fields_12_0= ruleStructField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )* otherlv_15= '}' ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1203:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_params_4_0= RULE_IDENT ) ) )* otherlv_5= '>' )? ( (otherlv_6= '(' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= ')' ) | (otherlv_11= '{' ( (lv_fields_12_0= ruleStructField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )* otherlv_15= '}' ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1203:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1204:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1204:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1205:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleEnumVariant2507); 

            			newLeafNode(lv_ident_0_0, grammarAccess.getEnumVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumVariantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_0_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1221:2: (otherlv_1= '<' ( (lv_params_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_params_4_0= RULE_IDENT ) ) )* otherlv_5= '>' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1221:4: otherlv_1= '<' ( (lv_params_2_0= RULE_IDENT ) ) (otherlv_3= ',' ( (lv_params_4_0= RULE_IDENT ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleEnumVariant2525); 

                        	newLeafNode(otherlv_1, grammarAccess.getEnumVariantAccess().getLessThanSignKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1225:1: ( (lv_params_2_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1226:1: (lv_params_2_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1226:1: (lv_params_2_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1227:3: lv_params_2_0= RULE_IDENT
                    {
                    lv_params_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleEnumVariant2542); 

                    			newLeafNode(lv_params_2_0, grammarAccess.getEnumVariantAccess().getParamsIDENTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumVariantRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"params",
                            		lv_params_2_0, 
                            		"IDENT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1243:2: (otherlv_3= ',' ( (lv_params_4_0= RULE_IDENT ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==46) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1243:4: otherlv_3= ',' ( (lv_params_4_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleEnumVariant2560); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getEnumVariantAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1247:1: ( (lv_params_4_0= RULE_IDENT ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1248:1: (lv_params_4_0= RULE_IDENT )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1248:1: (lv_params_4_0= RULE_IDENT )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1249:3: lv_params_4_0= RULE_IDENT
                    	    {
                    	    lv_params_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleEnumVariant2577); 

                    	    			newLeafNode(lv_params_4_0, grammarAccess.getEnumVariantAccess().getParamsIDENTTerminalRuleCall_1_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEnumVariantRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_4_0, 
                    	            		"IDENT");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleEnumVariant2596); 

                        	newLeafNode(otherlv_5, grammarAccess.getEnumVariantAccess().getGreaterThanSignKeyword_1_3());
                        

                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1269:3: ( (otherlv_6= '(' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= ')' ) | (otherlv_11= '{' ( (lv_fields_12_0= ruleStructField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )* otherlv_15= '}' ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            else if ( (LA26_0==53) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1269:4: (otherlv_6= '(' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= ')' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1269:4: (otherlv_6= '(' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= ')' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1269:6: otherlv_6= '(' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleEnumVariant2612); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumVariantAccess().getLeftParenthesisKeyword_2_0_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1273:1: ( (lv_types_7_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1274:1: (lv_types_7_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1274:1: (lv_types_7_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1275:3: lv_types_7_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumVariantAccess().getTypesTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleEnumVariant2633);
                    lv_types_7_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumVariantRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_7_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1291:2: (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==46) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1291:4: otherlv_8= ',' ( (lv_types_9_0= ruleType ) )
                    	    {
                    	    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleEnumVariant2646); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getEnumVariantAccess().getCommaKeyword_2_0_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1295:1: ( (lv_types_9_0= ruleType ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1296:1: (lv_types_9_0= ruleType )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1296:1: (lv_types_9_0= ruleType )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1297:3: lv_types_9_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumVariantAccess().getTypesTypeParserRuleCall_2_0_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleEnumVariant2667);
                    	    lv_types_9_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumVariantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_9_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleEnumVariant2681); 

                        	newLeafNode(otherlv_10, grammarAccess.getEnumVariantAccess().getRightParenthesisKeyword_2_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1318:6: (otherlv_11= '{' ( (lv_fields_12_0= ruleStructField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )* otherlv_15= '}' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1318:6: (otherlv_11= '{' ( (lv_fields_12_0= ruleStructField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )* otherlv_15= '}' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1318:8: otherlv_11= '{' ( (lv_fields_12_0= ruleStructField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,53,FOLLOW_53_in_ruleEnumVariant2701); 

                        	newLeafNode(otherlv_11, grammarAccess.getEnumVariantAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1322:1: ( (lv_fields_12_0= ruleStructField ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1323:1: (lv_fields_12_0= ruleStructField )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1323:1: (lv_fields_12_0= ruleStructField )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1324:3: lv_fields_12_0= ruleStructField
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumVariantAccess().getFieldsStructFieldParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStructField_in_ruleEnumVariant2722);
                    lv_fields_12_0=ruleStructField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumVariantRule());
                    	        }
                           		add(
                           			current, 
                           			"fields",
                            		lv_fields_12_0, 
                            		"StructField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1340:2: (otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==46) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1340:4: otherlv_13= ',' ( (lv_fields_14_0= ruleStructField ) )
                    	    {
                    	    otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleEnumVariant2735); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getEnumVariantAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1344:1: ( (lv_fields_14_0= ruleStructField ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1345:1: (lv_fields_14_0= ruleStructField )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1345:1: (lv_fields_14_0= ruleStructField )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1346:3: lv_fields_14_0= ruleStructField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumVariantAccess().getFieldsStructFieldParserRuleCall_2_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStructField_in_ruleEnumVariant2756);
                    	    lv_fields_14_0=ruleStructField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumVariantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fields",
                    	            		lv_fields_14_0, 
                    	            		"StructField");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,54,FOLLOW_54_in_ruleEnumVariant2770); 

                        	newLeafNode(otherlv_15, grammarAccess.getEnumVariantAccess().getRightCurlyBracketKeyword_2_1_3());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumVariant"


    // $ANTLR start "entryRuleTraitItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1374:1: entryRuleTraitItem returns [EObject current=null] : iv_ruleTraitItem= ruleTraitItem EOF ;
    public final EObject entryRuleTraitItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraitItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1375:2: (iv_ruleTraitItem= ruleTraitItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1376:2: iv_ruleTraitItem= ruleTraitItem EOF
            {
             newCompositeNode(grammarAccess.getTraitItemRule()); 
            pushFollow(FOLLOW_ruleTraitItem_in_entryRuleTraitItem2809);
            iv_ruleTraitItem=ruleTraitItem();

            state._fsp--;

             current =iv_ruleTraitItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraitItem2819); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraitItem"


    // $ANTLR start "ruleTraitItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1383:1: ruleTraitItem returns [EObject current=null] : (otherlv_0= 'trait' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_methods_8_0= ruleTraitMethod ) )* otherlv_9= '}' ) ;
    public final EObject ruleTraitItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_methods_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1386:28: ( (otherlv_0= 'trait' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_methods_8_0= ruleTraitMethod ) )* otherlv_9= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1387:1: (otherlv_0= 'trait' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_methods_8_0= ruleTraitMethod ) )* otherlv_9= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1387:1: (otherlv_0= 'trait' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_methods_8_0= ruleTraitMethod ) )* otherlv_9= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1387:3: otherlv_0= 'trait' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_methods_8_0= ruleTraitMethod ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleTraitItem2856); 

                	newLeafNode(otherlv_0, grammarAccess.getTraitItemAccess().getTraitKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1391:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1392:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1392:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1393:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTraitItem2873); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getTraitItemAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTraitItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1409:2: (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1409:4: otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleTraitItem2891); 

                        	newLeafNode(otherlv_2, grammarAccess.getTraitItemAccess().getLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1413:1: ( (lv_params_3_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1414:1: (lv_params_3_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1414:1: (lv_params_3_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1415:3: lv_params_3_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getTraitItemAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleTraitItem2912);
                    lv_params_3_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTraitItemRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1431:2: (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==46) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1431:4: otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleTraitItem2925); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTraitItemAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1435:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1436:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1436:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1437:3: lv_params_5_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTraitItemAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleTraitItem2946);
                    	    lv_params_5_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTraitItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"GenericParamDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleTraitItem2960); 

                        	newLeafNode(otherlv_6, grammarAccess.getTraitItemAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleTraitItem2974); 

                	newLeafNode(otherlv_7, grammarAccess.getTraitItemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1461:1: ( (lv_methods_8_0= ruleTraitMethod ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==55||(LA29_0>=63 && LA29_0<=64)||(LA29_0>=104 && LA29_0<=105)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1462:1: (lv_methods_8_0= ruleTraitMethod )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1462:1: (lv_methods_8_0= ruleTraitMethod )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1463:3: lv_methods_8_0= ruleTraitMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTraitItemAccess().getMethodsTraitMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTraitMethod_in_ruleTraitItem2995);
            	    lv_methods_8_0=ruleTraitMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTraitItemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_8_0, 
            	            		"TraitMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_9=(Token)match(input,54,FOLLOW_54_in_ruleTraitItem3008); 

                	newLeafNode(otherlv_9, grammarAccess.getTraitItemAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraitItem"


    // $ANTLR start "entryRuleTraitMethod"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1491:1: entryRuleTraitMethod returns [EObject current=null] : iv_ruleTraitMethod= ruleTraitMethod EOF ;
    public final EObject entryRuleTraitMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraitMethod = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1492:2: (iv_ruleTraitMethod= ruleTraitMethod EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1493:2: iv_ruleTraitMethod= ruleTraitMethod EOF
            {
             newCompositeNode(grammarAccess.getTraitMethodRule()); 
            pushFollow(FOLLOW_ruleTraitMethod_in_entryRuleTraitMethod3044);
            iv_ruleTraitMethod=ruleTraitMethod();

            state._fsp--;

             current =iv_ruleTraitMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraitMethod3054); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraitMethod"


    // $ANTLR start "ruleTraitMethod"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1500:1: ruleTraitMethod returns [EObject current=null] : ( ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? ( (lv_vis_2_0= ruleVisibility ) )? otherlv_3= 'fn' ( (lv_ident_4_0= RULE_IDENT ) ) (otherlv_5= '<' ( (lv_params_6_0= ruleGenericParamDecl ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleGenericParamDecl ) ) )* otherlv_9= '>' )? otherlv_10= '(' ( ( (lv_args_11_0= ruleArg ) ) (otherlv_12= ',' ( (lv_args_13_0= ruleArg ) ) )* )? otherlv_14= ')' (otherlv_15= '->' ( (lv_returnType_16_0= ruleType ) ) )? ( ( (lv_body_17_0= ruleBlock ) ) | otherlv_18= ';' ) ) ;
    public final EObject ruleTraitMethod() throws RecognitionException {
        EObject current = null;

        Token lv_unsafe_0_0=null;
        Token lv_extern_1_0=null;
        Token otherlv_3=null;
        Token lv_ident_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Enumerator lv_vis_2_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_args_11_0 = null;

        EObject lv_args_13_0 = null;

        EObject lv_returnType_16_0 = null;

        EObject lv_body_17_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1503:28: ( ( ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? ( (lv_vis_2_0= ruleVisibility ) )? otherlv_3= 'fn' ( (lv_ident_4_0= RULE_IDENT ) ) (otherlv_5= '<' ( (lv_params_6_0= ruleGenericParamDecl ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleGenericParamDecl ) ) )* otherlv_9= '>' )? otherlv_10= '(' ( ( (lv_args_11_0= ruleArg ) ) (otherlv_12= ',' ( (lv_args_13_0= ruleArg ) ) )* )? otherlv_14= ')' (otherlv_15= '->' ( (lv_returnType_16_0= ruleType ) ) )? ( ( (lv_body_17_0= ruleBlock ) ) | otherlv_18= ';' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1504:1: ( ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? ( (lv_vis_2_0= ruleVisibility ) )? otherlv_3= 'fn' ( (lv_ident_4_0= RULE_IDENT ) ) (otherlv_5= '<' ( (lv_params_6_0= ruleGenericParamDecl ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleGenericParamDecl ) ) )* otherlv_9= '>' )? otherlv_10= '(' ( ( (lv_args_11_0= ruleArg ) ) (otherlv_12= ',' ( (lv_args_13_0= ruleArg ) ) )* )? otherlv_14= ')' (otherlv_15= '->' ( (lv_returnType_16_0= ruleType ) ) )? ( ( (lv_body_17_0= ruleBlock ) ) | otherlv_18= ';' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1504:1: ( ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? ( (lv_vis_2_0= ruleVisibility ) )? otherlv_3= 'fn' ( (lv_ident_4_0= RULE_IDENT ) ) (otherlv_5= '<' ( (lv_params_6_0= ruleGenericParamDecl ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleGenericParamDecl ) ) )* otherlv_9= '>' )? otherlv_10= '(' ( ( (lv_args_11_0= ruleArg ) ) (otherlv_12= ',' ( (lv_args_13_0= ruleArg ) ) )* )? otherlv_14= ')' (otherlv_15= '->' ( (lv_returnType_16_0= ruleType ) ) )? ( ( (lv_body_17_0= ruleBlock ) ) | otherlv_18= ';' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1504:2: ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? ( (lv_vis_2_0= ruleVisibility ) )? otherlv_3= 'fn' ( (lv_ident_4_0= RULE_IDENT ) ) (otherlv_5= '<' ( (lv_params_6_0= ruleGenericParamDecl ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleGenericParamDecl ) ) )* otherlv_9= '>' )? otherlv_10= '(' ( ( (lv_args_11_0= ruleArg ) ) (otherlv_12= ',' ( (lv_args_13_0= ruleArg ) ) )* )? otherlv_14= ')' (otherlv_15= '->' ( (lv_returnType_16_0= ruleType ) ) )? ( ( (lv_body_17_0= ruleBlock ) ) | otherlv_18= ';' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1504:2: ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            else if ( (LA30_0==64) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1504:3: ( (lv_unsafe_0_0= 'unsafe' ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1504:3: ( (lv_unsafe_0_0= 'unsafe' ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1505:1: (lv_unsafe_0_0= 'unsafe' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1505:1: (lv_unsafe_0_0= 'unsafe' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1506:3: lv_unsafe_0_0= 'unsafe'
                    {
                    lv_unsafe_0_0=(Token)match(input,63,FOLLOW_63_in_ruleTraitMethod3098); 

                            newLeafNode(lv_unsafe_0_0, grammarAccess.getTraitMethodAccess().getUnsafeUnsafeKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTraitMethodRule());
                    	        }
                           		setWithLastConsumed(current, "unsafe", true, "unsafe");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1520:6: ( (lv_extern_1_0= 'extern' ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1520:6: ( (lv_extern_1_0= 'extern' ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1521:1: (lv_extern_1_0= 'extern' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1521:1: (lv_extern_1_0= 'extern' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1522:3: lv_extern_1_0= 'extern'
                    {
                    lv_extern_1_0=(Token)match(input,64,FOLLOW_64_in_ruleTraitMethod3135); 

                            newLeafNode(lv_extern_1_0, grammarAccess.getTraitMethodAccess().getExternExternKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTraitMethodRule());
                    	        }
                           		setWithLastConsumed(current, "extern", true, "extern");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1535:4: ( (lv_vis_2_0= ruleVisibility ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=104 && LA31_0<=105)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1536:1: (lv_vis_2_0= ruleVisibility )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1536:1: (lv_vis_2_0= ruleVisibility )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1537:3: lv_vis_2_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getTraitMethodAccess().getVisVisibilityEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibility_in_ruleTraitMethod3171);
                    lv_vis_2_0=ruleVisibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTraitMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"vis",
                            		lv_vis_2_0, 
                            		"Visibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleTraitMethod3184); 

                	newLeafNode(otherlv_3, grammarAccess.getTraitMethodAccess().getFnKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1557:1: ( (lv_ident_4_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1558:1: (lv_ident_4_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1558:1: (lv_ident_4_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1559:3: lv_ident_4_0= RULE_IDENT
            {
            lv_ident_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTraitMethod3201); 

            			newLeafNode(lv_ident_4_0, grammarAccess.getTraitMethodAccess().getIdentIDENTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTraitMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_4_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1575:2: (otherlv_5= '<' ( (lv_params_6_0= ruleGenericParamDecl ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleGenericParamDecl ) ) )* otherlv_9= '>' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1575:4: otherlv_5= '<' ( (lv_params_6_0= ruleGenericParamDecl ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleGenericParamDecl ) ) )* otherlv_9= '>'
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_56_in_ruleTraitMethod3219); 

                        	newLeafNode(otherlv_5, grammarAccess.getTraitMethodAccess().getLessThanSignKeyword_4_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1579:1: ( (lv_params_6_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1580:1: (lv_params_6_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1580:1: (lv_params_6_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1581:3: lv_params_6_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getTraitMethodAccess().getParamsGenericParamDeclParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3240);
                    lv_params_6_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTraitMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_6_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1597:2: (otherlv_7= ',' ( (lv_params_8_0= ruleGenericParamDecl ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==46) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1597:4: otherlv_7= ',' ( (lv_params_8_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleTraitMethod3253); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTraitMethodAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1601:1: ( (lv_params_8_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1602:1: (lv_params_8_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1602:1: (lv_params_8_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1603:3: lv_params_8_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTraitMethodAccess().getParamsGenericParamDeclParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3274);
                    	    lv_params_8_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTraitMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_8_0, 
                    	            		"GenericParamDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,57,FOLLOW_57_in_ruleTraitMethod3288); 

                        	newLeafNode(otherlv_9, grammarAccess.getTraitMethodAccess().getGreaterThanSignKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleTraitMethod3302); 

                	newLeafNode(otherlv_10, grammarAccess.getTraitMethodAccess().getLeftParenthesisKeyword_5());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1627:1: ( ( (lv_args_11_0= ruleArg ) ) (otherlv_12= ',' ( (lv_args_13_0= ruleArg ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_IDENT && LA35_0<=RULE_MUT_KEYWORD)||(LA35_0>=RULE_FLOAT_LIT && LA35_0<=RULE_CHAR_LIT)||LA35_0==48||LA35_0==70||(LA35_0>=74 && LA35_0<=76)||LA35_0==101) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1627:2: ( (lv_args_11_0= ruleArg ) ) (otherlv_12= ',' ( (lv_args_13_0= ruleArg ) ) )*
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1627:2: ( (lv_args_11_0= ruleArg ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1628:1: (lv_args_11_0= ruleArg )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1628:1: (lv_args_11_0= ruleArg )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1629:3: lv_args_11_0= ruleArg
                    {
                     
                    	        newCompositeNode(grammarAccess.getTraitMethodAccess().getArgsArgParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArg_in_ruleTraitMethod3324);
                    lv_args_11_0=ruleArg();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTraitMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_11_0, 
                            		"Arg");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1645:2: (otherlv_12= ',' ( (lv_args_13_0= ruleArg ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==46) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1645:4: otherlv_12= ',' ( (lv_args_13_0= ruleArg ) )
                    	    {
                    	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleTraitMethod3337); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTraitMethodAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1649:1: ( (lv_args_13_0= ruleArg ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1650:1: (lv_args_13_0= ruleArg )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1650:1: (lv_args_13_0= ruleArg )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1651:3: lv_args_13_0= ruleArg
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTraitMethodAccess().getArgsArgParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArg_in_ruleTraitMethod3358);
                    	    lv_args_13_0=ruleArg();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTraitMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_13_0, 
                    	            		"Arg");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,49,FOLLOW_49_in_ruleTraitMethod3374); 

                	newLeafNode(otherlv_14, grammarAccess.getTraitMethodAccess().getRightParenthesisKeyword_7());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1671:1: (otherlv_15= '->' ( (lv_returnType_16_0= ruleType ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1671:3: otherlv_15= '->' ( (lv_returnType_16_0= ruleType ) )
                    {
                    otherlv_15=(Token)match(input,58,FOLLOW_58_in_ruleTraitMethod3387); 

                        	newLeafNode(otherlv_15, grammarAccess.getTraitMethodAccess().getHyphenMinusGreaterThanSignKeyword_8_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1675:1: ( (lv_returnType_16_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1676:1: (lv_returnType_16_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1676:1: (lv_returnType_16_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1677:3: lv_returnType_16_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTraitMethodAccess().getReturnTypeTypeParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTraitMethod3408);
                    lv_returnType_16_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTraitMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_16_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1693:4: ( ( (lv_body_17_0= ruleBlock ) ) | otherlv_18= ';' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            else if ( (LA37_0==52) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1693:5: ( (lv_body_17_0= ruleBlock ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1693:5: ( (lv_body_17_0= ruleBlock ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1694:1: (lv_body_17_0= ruleBlock )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1694:1: (lv_body_17_0= ruleBlock )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1695:3: lv_body_17_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getTraitMethodAccess().getBodyBlockParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleTraitMethod3432);
                    lv_body_17_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTraitMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_17_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1712:7: otherlv_18= ';'
                    {
                    otherlv_18=(Token)match(input,52,FOLLOW_52_in_ruleTraitMethod3450); 

                        	newLeafNode(otherlv_18, grammarAccess.getTraitMethodAccess().getSemicolonKeyword_9_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraitMethod"


    // $ANTLR start "entryRuleImplItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1724:1: entryRuleImplItem returns [EObject current=null] : iv_ruleImplItem= ruleImplItem EOF ;
    public final EObject entryRuleImplItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1725:2: (iv_ruleImplItem= ruleImplItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1726:2: iv_ruleImplItem= ruleImplItem EOF
            {
             newCompositeNode(grammarAccess.getImplItemRule()); 
            pushFollow(FOLLOW_ruleImplItem_in_entryRuleImplItem3487);
            iv_ruleImplItem=ruleImplItem();

            state._fsp--;

             current =iv_ruleImplItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplItem3497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplItem"


    // $ANTLR start "ruleImplItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1733:1: ruleImplItem returns [EObject current=null] : (otherlv_0= 'impl' ( ( (lv_trait_1_0= RULE_IDENT ) ) otherlv_2= 'for' )? ( (lv_struct_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleImplMethod ) )* otherlv_6= '}' ) ;
    public final EObject ruleImplItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_trait_1_0=null;
        Token otherlv_2=null;
        Token lv_struct_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_methods_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1736:28: ( (otherlv_0= 'impl' ( ( (lv_trait_1_0= RULE_IDENT ) ) otherlv_2= 'for' )? ( (lv_struct_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleImplMethod ) )* otherlv_6= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1737:1: (otherlv_0= 'impl' ( ( (lv_trait_1_0= RULE_IDENT ) ) otherlv_2= 'for' )? ( (lv_struct_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleImplMethod ) )* otherlv_6= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1737:1: (otherlv_0= 'impl' ( ( (lv_trait_1_0= RULE_IDENT ) ) otherlv_2= 'for' )? ( (lv_struct_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleImplMethod ) )* otherlv_6= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1737:3: otherlv_0= 'impl' ( ( (lv_trait_1_0= RULE_IDENT ) ) otherlv_2= 'for' )? ( (lv_struct_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleImplMethod ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleImplItem3534); 

                	newLeafNode(otherlv_0, grammarAccess.getImplItemAccess().getImplKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1741:1: ( ( (lv_trait_1_0= RULE_IDENT ) ) otherlv_2= 'for' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_IDENT) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==66) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1741:2: ( (lv_trait_1_0= RULE_IDENT ) ) otherlv_2= 'for'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1741:2: ( (lv_trait_1_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1742:1: (lv_trait_1_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1742:1: (lv_trait_1_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1743:3: lv_trait_1_0= RULE_IDENT
                    {
                    lv_trait_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleImplItem3552); 

                    			newLeafNode(lv_trait_1_0, grammarAccess.getImplItemAccess().getTraitIDENTTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImplItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"trait",
                            		lv_trait_1_0, 
                            		"IDENT");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleImplItem3569); 

                        	newLeafNode(otherlv_2, grammarAccess.getImplItemAccess().getForKeyword_1_1());
                        

                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1763:3: ( (lv_struct_3_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1764:1: (lv_struct_3_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1764:1: (lv_struct_3_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1765:3: lv_struct_3_0= RULE_IDENT
            {
            lv_struct_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleImplItem3588); 

            			newLeafNode(lv_struct_3_0, grammarAccess.getImplItemAccess().getStructIDENTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImplItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"struct",
                    		lv_struct_3_0, 
                    		"IDENT");
            	    

            }


            }

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleImplItem3605); 

                	newLeafNode(otherlv_4, grammarAccess.getImplItemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1785:1: ( (lv_methods_5_0= ruleImplMethod ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==55||(LA39_0>=63 && LA39_0<=64)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1786:1: (lv_methods_5_0= ruleImplMethod )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1786:1: (lv_methods_5_0= ruleImplMethod )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1787:3: lv_methods_5_0= ruleImplMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplItemAccess().getMethodsImplMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImplMethod_in_ruleImplItem3626);
            	    lv_methods_5_0=ruleImplMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImplItemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_5_0, 
            	            		"ImplMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleImplItem3639); 

                	newLeafNode(otherlv_6, grammarAccess.getImplItemAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplItem"


    // $ANTLR start "entryRuleImplMethod"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1815:1: entryRuleImplMethod returns [EObject current=null] : iv_ruleImplMethod= ruleImplMethod EOF ;
    public final EObject entryRuleImplMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplMethod = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1816:2: (iv_ruleImplMethod= ruleImplMethod EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1817:2: iv_ruleImplMethod= ruleImplMethod EOF
            {
             newCompositeNode(grammarAccess.getImplMethodRule()); 
            pushFollow(FOLLOW_ruleImplMethod_in_entryRuleImplMethod3675);
            iv_ruleImplMethod=ruleImplMethod();

            state._fsp--;

             current =iv_ruleImplMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplMethod3685); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplMethod"


    // $ANTLR start "ruleImplMethod"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1824:1: ruleImplMethod returns [EObject current=null] : ( ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? otherlv_2= 'fn' ( (lv_ident_3_0= RULE_IDENT ) ) (otherlv_4= '<' ( (lv_params_5_0= ruleGenericParamDecl ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleGenericParamDecl ) ) )* otherlv_8= '>' )? otherlv_9= '(' ( ( (lv_args_10_0= ruleArg ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleArg ) ) )* )? otherlv_13= ')' (otherlv_14= '->' ( (lv_returnType_15_0= ruleType ) ) )? ( (lv_body_16_0= ruleBlock ) ) ) ;
    public final EObject ruleImplMethod() throws RecognitionException {
        EObject current = null;

        Token lv_unsafe_0_0=null;
        Token lv_extern_1_0=null;
        Token otherlv_2=null;
        Token lv_ident_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_args_10_0 = null;

        EObject lv_args_12_0 = null;

        EObject lv_returnType_15_0 = null;

        EObject lv_body_16_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1827:28: ( ( ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? otherlv_2= 'fn' ( (lv_ident_3_0= RULE_IDENT ) ) (otherlv_4= '<' ( (lv_params_5_0= ruleGenericParamDecl ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleGenericParamDecl ) ) )* otherlv_8= '>' )? otherlv_9= '(' ( ( (lv_args_10_0= ruleArg ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleArg ) ) )* )? otherlv_13= ')' (otherlv_14= '->' ( (lv_returnType_15_0= ruleType ) ) )? ( (lv_body_16_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1828:1: ( ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? otherlv_2= 'fn' ( (lv_ident_3_0= RULE_IDENT ) ) (otherlv_4= '<' ( (lv_params_5_0= ruleGenericParamDecl ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleGenericParamDecl ) ) )* otherlv_8= '>' )? otherlv_9= '(' ( ( (lv_args_10_0= ruleArg ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleArg ) ) )* )? otherlv_13= ')' (otherlv_14= '->' ( (lv_returnType_15_0= ruleType ) ) )? ( (lv_body_16_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1828:1: ( ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? otherlv_2= 'fn' ( (lv_ident_3_0= RULE_IDENT ) ) (otherlv_4= '<' ( (lv_params_5_0= ruleGenericParamDecl ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleGenericParamDecl ) ) )* otherlv_8= '>' )? otherlv_9= '(' ( ( (lv_args_10_0= ruleArg ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleArg ) ) )* )? otherlv_13= ')' (otherlv_14= '->' ( (lv_returnType_15_0= ruleType ) ) )? ( (lv_body_16_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1828:2: ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )? otherlv_2= 'fn' ( (lv_ident_3_0= RULE_IDENT ) ) (otherlv_4= '<' ( (lv_params_5_0= ruleGenericParamDecl ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleGenericParamDecl ) ) )* otherlv_8= '>' )? otherlv_9= '(' ( ( (lv_args_10_0= ruleArg ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleArg ) ) )* )? otherlv_13= ')' (otherlv_14= '->' ( (lv_returnType_15_0= ruleType ) ) )? ( (lv_body_16_0= ruleBlock ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1828:2: ( ( (lv_unsafe_0_0= 'unsafe' ) ) | ( (lv_extern_1_0= 'extern' ) ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==63) ) {
                alt40=1;
            }
            else if ( (LA40_0==64) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1828:3: ( (lv_unsafe_0_0= 'unsafe' ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1828:3: ( (lv_unsafe_0_0= 'unsafe' ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1829:1: (lv_unsafe_0_0= 'unsafe' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1829:1: (lv_unsafe_0_0= 'unsafe' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1830:3: lv_unsafe_0_0= 'unsafe'
                    {
                    lv_unsafe_0_0=(Token)match(input,63,FOLLOW_63_in_ruleImplMethod3729); 

                            newLeafNode(lv_unsafe_0_0, grammarAccess.getImplMethodAccess().getUnsafeUnsafeKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImplMethodRule());
                    	        }
                           		setWithLastConsumed(current, "unsafe", true, "unsafe");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1844:6: ( (lv_extern_1_0= 'extern' ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1844:6: ( (lv_extern_1_0= 'extern' ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1845:1: (lv_extern_1_0= 'extern' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1845:1: (lv_extern_1_0= 'extern' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1846:3: lv_extern_1_0= 'extern'
                    {
                    lv_extern_1_0=(Token)match(input,64,FOLLOW_64_in_ruleImplMethod3766); 

                            newLeafNode(lv_extern_1_0, grammarAccess.getImplMethodAccess().getExternExternKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImplMethodRule());
                    	        }
                           		setWithLastConsumed(current, "extern", true, "extern");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleImplMethod3793); 

                	newLeafNode(otherlv_2, grammarAccess.getImplMethodAccess().getFnKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1863:1: ( (lv_ident_3_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1864:1: (lv_ident_3_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1864:1: (lv_ident_3_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1865:3: lv_ident_3_0= RULE_IDENT
            {
            lv_ident_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleImplMethod3810); 

            			newLeafNode(lv_ident_3_0, grammarAccess.getImplMethodAccess().getIdentIDENTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImplMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_3_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1881:2: (otherlv_4= '<' ( (lv_params_5_0= ruleGenericParamDecl ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleGenericParamDecl ) ) )* otherlv_8= '>' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1881:4: otherlv_4= '<' ( (lv_params_5_0= ruleGenericParamDecl ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleGenericParamDecl ) ) )* otherlv_8= '>'
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleImplMethod3828); 

                        	newLeafNode(otherlv_4, grammarAccess.getImplMethodAccess().getLessThanSignKeyword_3_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1885:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1886:1: (lv_params_5_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1886:1: (lv_params_5_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1887:3: lv_params_5_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getImplMethodAccess().getParamsGenericParamDeclParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleImplMethod3849);
                    lv_params_5_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImplMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_5_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1903:2: (otherlv_6= ',' ( (lv_params_7_0= ruleGenericParamDecl ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==46) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1903:4: otherlv_6= ',' ( (lv_params_7_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleImplMethod3862); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getImplMethodAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1907:1: ( (lv_params_7_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1908:1: (lv_params_7_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1908:1: (lv_params_7_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1909:3: lv_params_7_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplMethodAccess().getParamsGenericParamDeclParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleImplMethod3883);
                    	    lv_params_7_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_7_0, 
                    	            		"GenericParamDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,57,FOLLOW_57_in_ruleImplMethod3897); 

                        	newLeafNode(otherlv_8, grammarAccess.getImplMethodAccess().getGreaterThanSignKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleImplMethod3911); 

                	newLeafNode(otherlv_9, grammarAccess.getImplMethodAccess().getLeftParenthesisKeyword_4());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1933:1: ( ( (lv_args_10_0= ruleArg ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleArg ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_IDENT && LA44_0<=RULE_MUT_KEYWORD)||(LA44_0>=RULE_FLOAT_LIT && LA44_0<=RULE_CHAR_LIT)||LA44_0==48||LA44_0==70||(LA44_0>=74 && LA44_0<=76)||LA44_0==101) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1933:2: ( (lv_args_10_0= ruleArg ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleArg ) ) )*
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1933:2: ( (lv_args_10_0= ruleArg ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1934:1: (lv_args_10_0= ruleArg )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1934:1: (lv_args_10_0= ruleArg )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1935:3: lv_args_10_0= ruleArg
                    {
                     
                    	        newCompositeNode(grammarAccess.getImplMethodAccess().getArgsArgParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArg_in_ruleImplMethod3933);
                    lv_args_10_0=ruleArg();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImplMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_10_0, 
                            		"Arg");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1951:2: (otherlv_11= ',' ( (lv_args_12_0= ruleArg ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==46) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1951:4: otherlv_11= ',' ( (lv_args_12_0= ruleArg ) )
                    	    {
                    	    otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleImplMethod3946); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getImplMethodAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1955:1: ( (lv_args_12_0= ruleArg ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1956:1: (lv_args_12_0= ruleArg )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1956:1: (lv_args_12_0= ruleArg )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1957:3: lv_args_12_0= ruleArg
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplMethodAccess().getArgsArgParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArg_in_ruleImplMethod3967);
                    	    lv_args_12_0=ruleArg();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_12_0, 
                    	            		"Arg");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleImplMethod3983); 

                	newLeafNode(otherlv_13, grammarAccess.getImplMethodAccess().getRightParenthesisKeyword_6());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1977:1: (otherlv_14= '->' ( (lv_returnType_15_0= ruleType ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1977:3: otherlv_14= '->' ( (lv_returnType_15_0= ruleType ) )
                    {
                    otherlv_14=(Token)match(input,58,FOLLOW_58_in_ruleImplMethod3996); 

                        	newLeafNode(otherlv_14, grammarAccess.getImplMethodAccess().getHyphenMinusGreaterThanSignKeyword_7_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1981:1: ( (lv_returnType_15_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1982:1: (lv_returnType_15_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1982:1: (lv_returnType_15_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1983:3: lv_returnType_15_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getImplMethodAccess().getReturnTypeTypeParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleImplMethod4017);
                    lv_returnType_15_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImplMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_15_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1999:4: ( (lv_body_16_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2000:1: (lv_body_16_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2000:1: (lv_body_16_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2001:3: lv_body_16_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getImplMethodAccess().getBodyBlockParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleImplMethod4040);
            lv_body_16_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplMethodRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_16_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplMethod"


    // $ANTLR start "entryRuleExternBlock"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2025:1: entryRuleExternBlock returns [EObject current=null] : iv_ruleExternBlock= ruleExternBlock EOF ;
    public final EObject entryRuleExternBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternBlock = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2026:2: (iv_ruleExternBlock= ruleExternBlock EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2027:2: iv_ruleExternBlock= ruleExternBlock EOF
            {
             newCompositeNode(grammarAccess.getExternBlockRule()); 
            pushFollow(FOLLOW_ruleExternBlock_in_entryRuleExternBlock4076);
            iv_ruleExternBlock=ruleExternBlock();

            state._fsp--;

             current =iv_ruleExternBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternBlock4086); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternBlock"


    // $ANTLR start "ruleExternBlock"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2034:1: ruleExternBlock returns [EObject current=null] : ( () otherlv_1= 'extern' ( (lv_abi_2_0= RULE_STRING_LIT ) )? otherlv_3= '{' ( (lv_functions_4_0= ruleForeignFn ) )* otherlv_5= '}' ) ;
    public final EObject ruleExternBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_abi_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_functions_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2037:28: ( ( () otherlv_1= 'extern' ( (lv_abi_2_0= RULE_STRING_LIT ) )? otherlv_3= '{' ( (lv_functions_4_0= ruleForeignFn ) )* otherlv_5= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2038:1: ( () otherlv_1= 'extern' ( (lv_abi_2_0= RULE_STRING_LIT ) )? otherlv_3= '{' ( (lv_functions_4_0= ruleForeignFn ) )* otherlv_5= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2038:1: ( () otherlv_1= 'extern' ( (lv_abi_2_0= RULE_STRING_LIT ) )? otherlv_3= '{' ( (lv_functions_4_0= ruleForeignFn ) )* otherlv_5= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2038:2: () otherlv_1= 'extern' ( (lv_abi_2_0= RULE_STRING_LIT ) )? otherlv_3= '{' ( (lv_functions_4_0= ruleForeignFn ) )* otherlv_5= '}'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2038:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2039:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExternBlockAccess().getExternBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleExternBlock4132); 

                	newLeafNode(otherlv_1, grammarAccess.getExternBlockAccess().getExternKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2048:1: ( (lv_abi_2_0= RULE_STRING_LIT ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING_LIT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2049:1: (lv_abi_2_0= RULE_STRING_LIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2049:1: (lv_abi_2_0= RULE_STRING_LIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2050:3: lv_abi_2_0= RULE_STRING_LIT
                    {
                    lv_abi_2_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_RULE_STRING_LIT_in_ruleExternBlock4149); 

                    			newLeafNode(lv_abi_2_0, grammarAccess.getExternBlockAccess().getAbiSTRING_LITTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExternBlockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"abi",
                            		lv_abi_2_0, 
                            		"STRING_LIT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleExternBlock4167); 

                	newLeafNode(otherlv_3, grammarAccess.getExternBlockAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2070:1: ( (lv_functions_4_0= ruleForeignFn ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==55) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2071:1: (lv_functions_4_0= ruleForeignFn )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2071:1: (lv_functions_4_0= ruleForeignFn )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2072:3: lv_functions_4_0= ruleForeignFn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternBlockAccess().getFunctionsForeignFnParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleForeignFn_in_ruleExternBlock4188);
            	    lv_functions_4_0=ruleForeignFn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functions",
            	            		lv_functions_4_0, 
            	            		"ForeignFn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleExternBlock4201); 

                	newLeafNode(otherlv_5, grammarAccess.getExternBlockAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternBlock"


    // $ANTLR start "entryRuleForeignFn"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2100:1: entryRuleForeignFn returns [EObject current=null] : iv_ruleForeignFn= ruleForeignFn EOF ;
    public final EObject entryRuleForeignFn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignFn = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2101:2: (iv_ruleForeignFn= ruleForeignFn EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2102:2: iv_ruleForeignFn= ruleForeignFn EOF
            {
             newCompositeNode(grammarAccess.getForeignFnRule()); 
            pushFollow(FOLLOW_ruleForeignFn_in_entryRuleForeignFn4237);
            iv_ruleForeignFn=ruleForeignFn();

            state._fsp--;

             current =iv_ruleForeignFn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignFn4247); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeignFn"


    // $ANTLR start "ruleForeignFn"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2109:1: ruleForeignFn returns [EObject current=null] : (otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= ')' (otherlv_7= '->' ( (lv_returnType_8_0= ruleType ) ) )? otherlv_9= ';' ) ;
    public final EObject ruleForeignFn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_returnType_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2112:28: ( (otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= ')' (otherlv_7= '->' ( (lv_returnType_8_0= ruleType ) ) )? otherlv_9= ';' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2113:1: (otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= ')' (otherlv_7= '->' ( (lv_returnType_8_0= ruleType ) ) )? otherlv_9= ';' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2113:1: (otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= ')' (otherlv_7= '->' ( (lv_returnType_8_0= ruleType ) ) )? otherlv_9= ';' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2113:3: otherlv_0= 'fn' ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArg ) ) )* )? otherlv_6= ')' (otherlv_7= '->' ( (lv_returnType_8_0= ruleType ) ) )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleForeignFn4284); 

                	newLeafNode(otherlv_0, grammarAccess.getForeignFnAccess().getFnKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2117:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2118:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2118:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2119:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleForeignFn4301); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getForeignFnAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForeignFnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleForeignFn4318); 

                	newLeafNode(otherlv_2, grammarAccess.getForeignFnAccess().getLeftParenthesisKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2139:1: ( ( (lv_args_3_0= ruleArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArg ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_IDENT && LA49_0<=RULE_MUT_KEYWORD)||(LA49_0>=RULE_FLOAT_LIT && LA49_0<=RULE_CHAR_LIT)||LA49_0==48||LA49_0==70||(LA49_0>=74 && LA49_0<=76)||LA49_0==101) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2139:2: ( (lv_args_3_0= ruleArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleArg ) ) )*
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2139:2: ( (lv_args_3_0= ruleArg ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2140:1: (lv_args_3_0= ruleArg )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2140:1: (lv_args_3_0= ruleArg )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2141:3: lv_args_3_0= ruleArg
                    {
                     
                    	        newCompositeNode(grammarAccess.getForeignFnAccess().getArgsArgParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArg_in_ruleForeignFn4340);
                    lv_args_3_0=ruleArg();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForeignFnRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_3_0, 
                            		"Arg");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2157:2: (otherlv_4= ',' ( (lv_args_5_0= ruleArg ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==46) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2157:4: otherlv_4= ',' ( (lv_args_5_0= ruleArg ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleForeignFn4353); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getForeignFnAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2161:1: ( (lv_args_5_0= ruleArg ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2162:1: (lv_args_5_0= ruleArg )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2162:1: (lv_args_5_0= ruleArg )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2163:3: lv_args_5_0= ruleArg
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getForeignFnAccess().getArgsArgParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArg_in_ruleForeignFn4374);
                    	    lv_args_5_0=ruleArg();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getForeignFnRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_5_0, 
                    	            		"Arg");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleForeignFn4390); 

                	newLeafNode(otherlv_6, grammarAccess.getForeignFnAccess().getRightParenthesisKeyword_4());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2183:1: (otherlv_7= '->' ( (lv_returnType_8_0= ruleType ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2183:3: otherlv_7= '->' ( (lv_returnType_8_0= ruleType ) )
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_58_in_ruleForeignFn4403); 

                        	newLeafNode(otherlv_7, grammarAccess.getForeignFnAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2187:1: ( (lv_returnType_8_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2188:1: (lv_returnType_8_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2188:1: (lv_returnType_8_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2189:3: lv_returnType_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getForeignFnAccess().getReturnTypeTypeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleForeignFn4424);
                    lv_returnType_8_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForeignFnRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_8_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,52,FOLLOW_52_in_ruleForeignFn4438); 

                	newLeafNode(otherlv_9, grammarAccess.getForeignFnAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeignFn"


    // $ANTLR start "entryRuleStaticItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2217:1: entryRuleStaticItem returns [EObject current=null] : iv_ruleStaticItem= ruleStaticItem EOF ;
    public final EObject entryRuleStaticItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2218:2: (iv_ruleStaticItem= ruleStaticItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2219:2: iv_ruleStaticItem= ruleStaticItem EOF
            {
             newCompositeNode(grammarAccess.getStaticItemRule()); 
            pushFollow(FOLLOW_ruleStaticItem_in_entryRuleStaticItem4474);
            iv_ruleStaticItem=ruleStaticItem();

            state._fsp--;

             current =iv_ruleStaticItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticItem4484); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticItem"


    // $ANTLR start "ruleStaticItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2226:1: ruleStaticItem returns [EObject current=null] : (otherlv_0= 'static' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_2_0= RULE_IDENT ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= '=' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ';' ) ;
    public final EObject ruleStaticItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token lv_ident_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_4_0 = null;

        EObject lv_expr_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2229:28: ( (otherlv_0= 'static' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_2_0= RULE_IDENT ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= '=' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ';' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2230:1: (otherlv_0= 'static' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_2_0= RULE_IDENT ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= '=' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ';' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2230:1: (otherlv_0= 'static' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_2_0= RULE_IDENT ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= '=' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ';' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2230:3: otherlv_0= 'static' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_2_0= RULE_IDENT ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= '=' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleStaticItem4521); 

                	newLeafNode(otherlv_0, grammarAccess.getStaticItemAccess().getStaticKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2234:1: ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2235:1: (lv_mutable_1_0= RULE_MUT_KEYWORD )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2235:1: (lv_mutable_1_0= RULE_MUT_KEYWORD )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2236:3: lv_mutable_1_0= RULE_MUT_KEYWORD
            {
            lv_mutable_1_0=(Token)match(input,RULE_MUT_KEYWORD,FOLLOW_RULE_MUT_KEYWORD_in_ruleStaticItem4538); 

            			newLeafNode(lv_mutable_1_0, grammarAccess.getStaticItemAccess().getMutableMUT_KEYWORDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStaticItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mutable",
                    		true, 
                    		"MUT_KEYWORD");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2252:2: ( (lv_ident_2_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2253:1: (lv_ident_2_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2253:1: (lv_ident_2_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2254:3: lv_ident_2_0= RULE_IDENT
            {
            lv_ident_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStaticItem4560); 

            			newLeafNode(lv_ident_2_0, grammarAccess.getStaticItemAccess().getIdentIDENTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStaticItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_2_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2270:2: (otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==68) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2270:4: otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleStaticItem4578); 

                        	newLeafNode(otherlv_3, grammarAccess.getStaticItemAccess().getColonKeyword_3_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2274:1: ( (lv_type_4_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2275:1: (lv_type_4_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2275:1: (lv_type_4_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2276:3: lv_type_4_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStaticItemAccess().getTypeTypeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleStaticItem4599);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStaticItemRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleStaticItem4613); 

                	newLeafNode(otherlv_5, grammarAccess.getStaticItemAccess().getEqualsSignKeyword_4());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2296:1: ( (lv_expr_6_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2297:1: (lv_expr_6_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2297:1: (lv_expr_6_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2298:3: lv_expr_6_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getStaticItemAccess().getExprExprParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleStaticItem4634);
            lv_expr_6_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStaticItemRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_6_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleStaticItem4646); 

                	newLeafNode(otherlv_7, grammarAccess.getStaticItemAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticItem"


    // $ANTLR start "entryRuleExpr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2326:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2327:2: (iv_ruleExpr= ruleExpr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2328:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr4682);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr4692); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2335:1: ruleExpr returns [EObject current=null] : this_ExprRValue_0= ruleExprRValue ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ExprRValue_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2338:28: (this_ExprRValue_0= ruleExprRValue )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2340:5: this_ExprRValue_0= ruleExprRValue
            {
             
                    newCompositeNode(grammarAccess.getExprAccess().getExprRValueParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExprRValue_in_ruleExpr4738);
            this_ExprRValue_0=ruleExprRValue();

            state._fsp--;

             
                    current = this_ExprRValue_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprLValue"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2356:1: entryRuleExprLValue returns [EObject current=null] : iv_ruleExprLValue= ruleExprLValue EOF ;
    public final EObject entryRuleExprLValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLValue = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2357:2: (iv_ruleExprLValue= ruleExprLValue EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2358:2: iv_ruleExprLValue= ruleExprLValue EOF
            {
             newCompositeNode(grammarAccess.getExprLValueRule()); 
            pushFollow(FOLLOW_ruleExprLValue_in_entryRuleExprLValue4772);
            iv_ruleExprLValue=ruleExprLValue();

            state._fsp--;

             current =iv_ruleExprLValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLValue4782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprLValue"


    // $ANTLR start "ruleExprLValue"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2365:1: ruleExprLValue returns [EObject current=null] : this_ExprPathHead_0= ruleExprPathHead ;
    public final EObject ruleExprLValue() throws RecognitionException {
        EObject current = null;

        EObject this_ExprPathHead_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2368:28: (this_ExprPathHead_0= ruleExprPathHead )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2370:5: this_ExprPathHead_0= ruleExprPathHead
            {
             
                    newCompositeNode(grammarAccess.getExprLValueAccess().getExprPathHeadParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExprPathHead_in_ruleExprLValue4828);
            this_ExprPathHead_0=ruleExprPathHead();

            state._fsp--;

             
                    current = this_ExprPathHead_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprLValue"


    // $ANTLR start "entryRuleExprRValue"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2386:1: entryRuleExprRValue returns [EObject current=null] : iv_ruleExprRValue= ruleExprRValue EOF ;
    public final EObject entryRuleExprRValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRValue = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2387:2: (iv_ruleExprRValue= ruleExprRValue EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2388:2: iv_ruleExprRValue= ruleExprRValue EOF
            {
             newCompositeNode(grammarAccess.getExprRValueRule()); 
            pushFollow(FOLLOW_ruleExprRValue_in_entryRuleExprRValue4862);
            iv_ruleExprRValue=ruleExprRValue();

            state._fsp--;

             current =iv_ruleExprRValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRValue4872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprRValue"


    // $ANTLR start "ruleExprRValue"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2395:1: ruleExprRValue returns [EObject current=null] : (this_ExprBinary_0= ruleExprBinary | this_ExprLeaf_1= ruleExprLeaf ) ;
    public final EObject ruleExprRValue() throws RecognitionException {
        EObject current = null;

        EObject this_ExprBinary_0 = null;

        EObject this_ExprLeaf_1 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2398:28: ( (this_ExprBinary_0= ruleExprBinary | this_ExprLeaf_1= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2399:1: (this_ExprBinary_0= ruleExprBinary | this_ExprLeaf_1= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2399:1: (this_ExprBinary_0= ruleExprBinary | this_ExprLeaf_1= ruleExprLeaf )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_IDENT) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_STRING_LIT||LA52_0==RULE_LIFETIME||(LA52_0>=RULE_FLOAT_LIT && LA52_0<=RULE_CHAR_LIT)||LA52_0==48||LA52_0==53||LA52_0==66||(LA52_0>=70 && LA52_0<=76)||LA52_0==84||(LA52_0>=90 && LA52_0<=94)||LA52_0==96||LA52_0==98||LA52_0==100) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2400:5: this_ExprBinary_0= ruleExprBinary
                    {
                     
                            newCompositeNode(grammarAccess.getExprRValueAccess().getExprBinaryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExprBinary_in_ruleExprRValue4919);
                    this_ExprBinary_0=ruleExprBinary();

                    state._fsp--;

                     
                            current = this_ExprBinary_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2410:5: this_ExprLeaf_1= ruleExprLeaf
                    {
                     
                            newCompositeNode(grammarAccess.getExprRValueAccess().getExprLeafParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleExprRValue4946);
                    this_ExprLeaf_1=ruleExprLeaf();

                    state._fsp--;

                     
                            current = this_ExprLeaf_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprRValue"


    // $ANTLR start "entryRuleExprLeaf"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2426:1: entryRuleExprLeaf returns [EObject current=null] : iv_ruleExprLeaf= ruleExprLeaf EOF ;
    public final EObject entryRuleExprLeaf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLeaf = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2427:2: (iv_ruleExprLeaf= ruleExprLeaf EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2428:2: iv_ruleExprLeaf= ruleExprLeaf EOF
            {
             newCompositeNode(grammarAccess.getExprLeafRule()); 
            pushFollow(FOLLOW_ruleExprLeaf_in_entryRuleExprLeaf4981);
            iv_ruleExprLeaf=ruleExprLeaf();

            state._fsp--;

             current =iv_ruleExprLeaf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLeaf4991); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprLeaf"


    // $ANTLR start "ruleExprLeaf"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2435:1: ruleExprLeaf returns [EObject current=null] : (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary | this_ExprLambda_5= ruleExprLambda | this_ExprWhile_6= ruleExprWhile | this_ExprLoop_7= ruleExprLoop | this_ExprBreak_8= ruleExprBreak | this_ExprContinue_9= ruleExprContinue | this_ExprDo_10= ruleExprDo | this_ExprFor_11= ruleExprFor | this_ExprIf_12= ruleExprIf | this_ExprMatch_13= ruleExprMatch | this_ExprReturn_14= ruleExprReturn ) ;
    public final EObject ruleExprLeaf() throws RecognitionException {
        EObject current = null;

        EObject this_ExprLiteral_0 = null;

        EObject this_ExprGroup_1 = null;

        EObject this_ExprStruct_2 = null;

        EObject this_ExprVec_3 = null;

        EObject this_ExprUnary_4 = null;

        EObject this_ExprLambda_5 = null;

        EObject this_ExprWhile_6 = null;

        EObject this_ExprLoop_7 = null;

        EObject this_ExprBreak_8 = null;

        EObject this_ExprContinue_9 = null;

        EObject this_ExprDo_10 = null;

        EObject this_ExprFor_11 = null;

        EObject this_ExprIf_12 = null;

        EObject this_ExprMatch_13 = null;

        EObject this_ExprReturn_14 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2438:28: ( (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary | this_ExprLambda_5= ruleExprLambda | this_ExprWhile_6= ruleExprWhile | this_ExprLoop_7= ruleExprLoop | this_ExprBreak_8= ruleExprBreak | this_ExprContinue_9= ruleExprContinue | this_ExprDo_10= ruleExprDo | this_ExprFor_11= ruleExprFor | this_ExprIf_12= ruleExprIf | this_ExprMatch_13= ruleExprMatch | this_ExprReturn_14= ruleExprReturn ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2439:1: (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary | this_ExprLambda_5= ruleExprLambda | this_ExprWhile_6= ruleExprWhile | this_ExprLoop_7= ruleExprLoop | this_ExprBreak_8= ruleExprBreak | this_ExprContinue_9= ruleExprContinue | this_ExprDo_10= ruleExprDo | this_ExprFor_11= ruleExprFor | this_ExprIf_12= ruleExprIf | this_ExprMatch_13= ruleExprMatch | this_ExprReturn_14= ruleExprReturn )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2439:1: (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary | this_ExprLambda_5= ruleExprLambda | this_ExprWhile_6= ruleExprWhile | this_ExprLoop_7= ruleExprLoop | this_ExprBreak_8= ruleExprBreak | this_ExprContinue_9= ruleExprContinue | this_ExprDo_10= ruleExprDo | this_ExprFor_11= ruleExprFor | this_ExprIf_12= ruleExprIf | this_ExprMatch_13= ruleExprMatch | this_ExprReturn_14= ruleExprReturn )
            int alt53=15;
            switch ( input.LA(1) ) {
            case RULE_STRING_LIT:
            case RULE_FLOAT_LIT:
            case RULE_INT_LIT:
            case RULE_CHAR_LIT:
                {
                alt53=1;
                }
                break;
            case 48:
                {
                alt53=2;
                }
                break;
            case 53:
                {
                alt53=3;
                }
                break;
            case 70:
                {
                alt53=4;
                }
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt53=5;
                }
                break;
            case 84:
                {
                alt53=6;
                }
                break;
            case 90:
                {
                alt53=7;
                }
                break;
            case RULE_LIFETIME:
            case 91:
                {
                alt53=8;
                }
                break;
            case 92:
                {
                alt53=9;
                }
                break;
            case 93:
                {
                alt53=10;
                }
                break;
            case 94:
                {
                alt53=11;
                }
                break;
            case 66:
                {
                alt53=12;
                }
                break;
            case 96:
                {
                alt53=13;
                }
                break;
            case 98:
                {
                alt53=14;
                }
                break;
            case 100:
                {
                alt53=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2440:5: this_ExprLiteral_0= ruleExprLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExprLiteral_in_ruleExprLeaf5038);
                    this_ExprLiteral_0=ruleExprLiteral();

                    state._fsp--;

                     
                            current = this_ExprLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2450:5: this_ExprGroup_1= ruleExprGroup
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprGroupParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExprGroup_in_ruleExprLeaf5065);
                    this_ExprGroup_1=ruleExprGroup();

                    state._fsp--;

                     
                            current = this_ExprGroup_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2460:5: this_ExprStruct_2= ruleExprStruct
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprStructParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExprStruct_in_ruleExprLeaf5092);
                    this_ExprStruct_2=ruleExprStruct();

                    state._fsp--;

                     
                            current = this_ExprStruct_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2470:5: this_ExprVec_3= ruleExprVec
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprVecParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExprVec_in_ruleExprLeaf5119);
                    this_ExprVec_3=ruleExprVec();

                    state._fsp--;

                     
                            current = this_ExprVec_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2480:5: this_ExprUnary_4= ruleExprUnary
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprUnaryParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExprUnary_in_ruleExprLeaf5146);
                    this_ExprUnary_4=ruleExprUnary();

                    state._fsp--;

                     
                            current = this_ExprUnary_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2490:5: this_ExprLambda_5= ruleExprLambda
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprLambdaParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleExprLambda_in_ruleExprLeaf5173);
                    this_ExprLambda_5=ruleExprLambda();

                    state._fsp--;

                     
                            current = this_ExprLambda_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2500:5: this_ExprWhile_6= ruleExprWhile
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprWhileParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleExprWhile_in_ruleExprLeaf5200);
                    this_ExprWhile_6=ruleExprWhile();

                    state._fsp--;

                     
                            current = this_ExprWhile_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2510:5: this_ExprLoop_7= ruleExprLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprLoopParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleExprLoop_in_ruleExprLeaf5227);
                    this_ExprLoop_7=ruleExprLoop();

                    state._fsp--;

                     
                            current = this_ExprLoop_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2520:5: this_ExprBreak_8= ruleExprBreak
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprBreakParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleExprBreak_in_ruleExprLeaf5254);
                    this_ExprBreak_8=ruleExprBreak();

                    state._fsp--;

                     
                            current = this_ExprBreak_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2530:5: this_ExprContinue_9= ruleExprContinue
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprContinueParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleExprContinue_in_ruleExprLeaf5281);
                    this_ExprContinue_9=ruleExprContinue();

                    state._fsp--;

                     
                            current = this_ExprContinue_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2540:5: this_ExprDo_10= ruleExprDo
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprDoParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleExprDo_in_ruleExprLeaf5308);
                    this_ExprDo_10=ruleExprDo();

                    state._fsp--;

                     
                            current = this_ExprDo_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2550:5: this_ExprFor_11= ruleExprFor
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprForParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleExprFor_in_ruleExprLeaf5335);
                    this_ExprFor_11=ruleExprFor();

                    state._fsp--;

                     
                            current = this_ExprFor_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2560:5: this_ExprIf_12= ruleExprIf
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprIfParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleExprIf_in_ruleExprLeaf5362);
                    this_ExprIf_12=ruleExprIf();

                    state._fsp--;

                     
                            current = this_ExprIf_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2570:5: this_ExprMatch_13= ruleExprMatch
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprMatchParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleExprMatch_in_ruleExprLeaf5389);
                    this_ExprMatch_13=ruleExprMatch();

                    state._fsp--;

                     
                            current = this_ExprMatch_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2580:5: this_ExprReturn_14= ruleExprReturn
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprReturnParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleExprReturn_in_ruleExprLeaf5416);
                    this_ExprReturn_14=ruleExprReturn();

                    state._fsp--;

                     
                            current = this_ExprReturn_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprLeaf"


    // $ANTLR start "entryRuleExprLiteral"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2596:1: entryRuleExprLiteral returns [EObject current=null] : iv_ruleExprLiteral= ruleExprLiteral EOF ;
    public final EObject entryRuleExprLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2597:2: (iv_ruleExprLiteral= ruleExprLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2598:2: iv_ruleExprLiteral= ruleExprLiteral EOF
            {
             newCompositeNode(grammarAccess.getExprLiteralRule()); 
            pushFollow(FOLLOW_ruleExprLiteral_in_entryRuleExprLiteral5451);
            iv_ruleExprLiteral=ruleExprLiteral();

            state._fsp--;

             current =iv_ruleExprLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLiteral5461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprLiteral"


    // $ANTLR start "ruleExprLiteral"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2605:1: ruleExprLiteral returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject ruleExprLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2608:28: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2609:1: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2609:1: ( (lv_literal_0_0= ruleLiteral ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2610:1: (lv_literal_0_0= ruleLiteral )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2610:1: (lv_literal_0_0= ruleLiteral )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2611:3: lv_literal_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getExprLiteralAccess().getLiteralLiteralParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleExprLiteral5506);
            lv_literal_0_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"literal",
                    		lv_literal_0_0, 
                    		"Literal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprLiteral"


    // $ANTLR start "entryRuleExprPathHead"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2635:1: entryRuleExprPathHead returns [EObject current=null] : iv_ruleExprPathHead= ruleExprPathHead EOF ;
    public final EObject entryRuleExprPathHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprPathHead = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2636:2: (iv_ruleExprPathHead= ruleExprPathHead EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2637:2: iv_ruleExprPathHead= ruleExprPathHead EOF
            {
             newCompositeNode(grammarAccess.getExprPathHeadRule()); 
            pushFollow(FOLLOW_ruleExprPathHead_in_entryRuleExprPathHead5541);
            iv_ruleExprPathHead=ruleExprPathHead();

            state._fsp--;

             current =iv_ruleExprPathHead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprPathHead5551); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprPathHead"


    // $ANTLR start "ruleExprPathHead"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2644:1: ruleExprPathHead returns [EObject current=null] : ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? ) ;
    public final EObject ruleExprPathHead() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;

        EObject lv_struct_2_0 = null;

        EObject lv_tuple_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2647:28: ( ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2648:1: ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2648:1: ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2648:2: ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2648:2: ( (lv_path_0_0= ruleExprPath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2649:1: (lv_path_0_0= ruleExprPath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2649:1: (lv_path_0_0= ruleExprPath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2650:3: lv_path_0_0= ruleExprPath
            {
             
            	        newCompositeNode(grammarAccess.getExprPathHeadAccess().getPathExprPathParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExprPath_in_ruleExprPathHead5597);
            lv_path_0_0=ruleExprPath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprPathHeadRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"ExprPath");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2666:2: ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                int LA54_1 = input.LA(2);

                if ( ((LA54_1>=104 && LA54_1<=105)) ) {
                    alt54=1;
                }
                else if ( (LA54_1==RULE_IDENT) ) {
                    int LA54_5 = input.LA(3);

                    if ( (LA54_5==68) ) {
                        alt54=1;
                    }
                }
            }
            else if ( (LA54_0==48) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2666:3: ( () ( (lv_struct_2_0= ruleExprStruct ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2666:3: ( () ( (lv_struct_2_0= ruleExprStruct ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2666:4: () ( (lv_struct_2_0= ruleExprStruct ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2666:4: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2667:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExprPathHeadAccess().getExprStructPathAction_1_0_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2672:2: ( (lv_struct_2_0= ruleExprStruct ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2673:1: (lv_struct_2_0= ruleExprStruct )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2673:1: (lv_struct_2_0= ruleExprStruct )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2674:3: lv_struct_2_0= ruleExprStruct
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprPathHeadAccess().getStructExprStructParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprStruct_in_ruleExprPathHead5629);
                    lv_struct_2_0=ruleExprStruct();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprPathHeadRule());
                    	        }
                           		set(
                           			current, 
                           			"struct",
                            		lv_struct_2_0, 
                            		"ExprStruct");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2691:6: ( () ( (lv_tuple_4_0= ruleExprTuple ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2691:6: ( () ( (lv_tuple_4_0= ruleExprTuple ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2691:7: () ( (lv_tuple_4_0= ruleExprTuple ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2691:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2692:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExprPathHeadAccess().getExprTuplePathAction_1_1_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2697:2: ( (lv_tuple_4_0= ruleExprTuple ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2698:1: (lv_tuple_4_0= ruleExprTuple )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2698:1: (lv_tuple_4_0= ruleExprTuple )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2699:3: lv_tuple_4_0= ruleExprTuple
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprPathHeadAccess().getTupleExprTupleParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprTuple_in_ruleExprPathHead5667);
                    lv_tuple_4_0=ruleExprTuple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprPathHeadRule());
                    	        }
                           		set(
                           			current, 
                           			"tuple",
                            		lv_tuple_4_0, 
                            		"ExprTuple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprPathHead"


    // $ANTLR start "entryRuleExprGroup"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2723:1: entryRuleExprGroup returns [EObject current=null] : iv_ruleExprGroup= ruleExprGroup EOF ;
    public final EObject entryRuleExprGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprGroup = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2724:2: (iv_ruleExprGroup= ruleExprGroup EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2725:2: iv_ruleExprGroup= ruleExprGroup EOF
            {
             newCompositeNode(grammarAccess.getExprGroupRule()); 
            pushFollow(FOLLOW_ruleExprGroup_in_entryRuleExprGroup5706);
            iv_ruleExprGroup=ruleExprGroup();

            state._fsp--;

             current =iv_ruleExprGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprGroup5716); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprGroup"


    // $ANTLR start "ruleExprGroup"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2732:1: ruleExprGroup returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' ) ;
    public final EObject ruleExprGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_expr_1_0 = null;

        EObject lv_exprs_4_0 = null;

        EObject lv_exprs_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2735:28: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2736:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2736:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2736:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleExprGroup5753); 

                	newLeafNode(otherlv_0, grammarAccess.getExprGroupAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2740:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2741:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2741:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2742:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5774);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprGroupRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2758:2: ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==46) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2758:3: () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )?
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2758:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2759:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getExprGroupAccess().getExprTupleExprsAction_2_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5796); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprGroupAccess().getCommaKeyword_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2768:1: ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=RULE_IDENT && LA57_0<=RULE_STRING_LIT)||LA57_0==RULE_LIFETIME||(LA57_0>=RULE_FLOAT_LIT && LA57_0<=RULE_CHAR_LIT)||LA57_0==48||LA57_0==53||LA57_0==66||(LA57_0>=70 && LA57_0<=76)||LA57_0==84||(LA57_0>=90 && LA57_0<=94)||LA57_0==96||LA57_0==98||LA57_0==100) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2768:2: ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )?
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2768:2: ( (lv_exprs_4_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2769:1: (lv_exprs_4_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2769:1: (lv_exprs_4_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2770:3: lv_exprs_4_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprsExprParserRuleCall_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5818);
                            lv_exprs_4_0=ruleExpr();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getExprGroupRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"exprs",
                                    		lv_exprs_4_0, 
                                    		"Expr");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2786:2: (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==46) ) {
                                    int LA55_1 = input.LA(2);

                                    if ( ((LA55_1>=RULE_IDENT && LA55_1<=RULE_STRING_LIT)||LA55_1==RULE_LIFETIME||(LA55_1>=RULE_FLOAT_LIT && LA55_1<=RULE_CHAR_LIT)||LA55_1==48||LA55_1==53||LA55_1==66||(LA55_1>=70 && LA55_1<=76)||LA55_1==84||(LA55_1>=90 && LA55_1<=94)||LA55_1==96||LA55_1==98||LA55_1==100) ) {
                                        alt55=1;
                                    }


                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2786:4: otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) )
                            	    {
                            	    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5831); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getExprGroupAccess().getCommaKeyword_2_2_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2790:1: ( (lv_exprs_6_0= ruleExpr ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2791:1: (lv_exprs_6_0= ruleExpr )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2791:1: (lv_exprs_6_0= ruleExpr )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2792:3: lv_exprs_6_0= ruleExpr
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprsExprParserRuleCall_2_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5852);
                            	    lv_exprs_6_0=ruleExpr();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getExprGroupRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"exprs",
                            	            		lv_exprs_6_0, 
                            	            		"Expr");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2808:4: (otherlv_7= ',' )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==46) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2808:6: otherlv_7= ','
                                    {
                                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5867); 

                                        	newLeafNode(otherlv_7, grammarAccess.getExprGroupAccess().getCommaKeyword_2_2_2());
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleExprGroup5885); 

                	newLeafNode(otherlv_8, grammarAccess.getExprGroupAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprGroup"


    // $ANTLR start "entryRuleExprTuple"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2824:1: entryRuleExprTuple returns [EObject current=null] : iv_ruleExprTuple= ruleExprTuple EOF ;
    public final EObject entryRuleExprTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTuple = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2825:2: (iv_ruleExprTuple= ruleExprTuple EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2826:2: iv_ruleExprTuple= ruleExprTuple EOF
            {
             newCompositeNode(grammarAccess.getExprTupleRule()); 
            pushFollow(FOLLOW_ruleExprTuple_in_entryRuleExprTuple5921);
            iv_ruleExprTuple=ruleExprTuple();

            state._fsp--;

             current =iv_ruleExprTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTuple5931); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprTuple"


    // $ANTLR start "ruleExprTuple"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2833:1: ruleExprTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' ) ;
    public final EObject ruleExprTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2836:28: ( (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2837:1: (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2837:1: (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2837:3: otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleExprTuple5968); 

                	newLeafNode(otherlv_0, grammarAccess.getExprTupleAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2841:1: ( (lv_exprs_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2842:1: (lv_exprs_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2842:1: (lv_exprs_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2843:3: lv_exprs_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprTupleAccess().getExprsExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprTuple5989);
            lv_exprs_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprTupleRule());
            	        }
                   		add(
                   			current, 
                   			"exprs",
                    		lv_exprs_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2859:2: (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==46) ) {
                    int LA59_1 = input.LA(2);

                    if ( ((LA59_1>=RULE_IDENT && LA59_1<=RULE_STRING_LIT)||LA59_1==RULE_LIFETIME||(LA59_1>=RULE_FLOAT_LIT && LA59_1<=RULE_CHAR_LIT)||LA59_1==48||LA59_1==53||LA59_1==66||(LA59_1>=70 && LA59_1<=76)||LA59_1==84||(LA59_1>=90 && LA59_1<=94)||LA59_1==96||LA59_1==98||LA59_1==100) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2859:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprTuple6002); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExprTupleAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2863:1: ( (lv_exprs_3_0= ruleExpr ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2864:1: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2864:1: (lv_exprs_3_0= ruleExpr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2865:3: lv_exprs_3_0= ruleExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprTupleAccess().getExprsExprParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprTuple6023);
            	    lv_exprs_3_0=ruleExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprTupleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exprs",
            	            		lv_exprs_3_0, 
            	            		"Expr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2881:4: (otherlv_4= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2881:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleExprTuple6038); 

                        	newLeafNode(otherlv_4, grammarAccess.getExprTupleAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleExprTuple6052); 

                	newLeafNode(otherlv_5, grammarAccess.getExprTupleAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprTuple"


    // $ANTLR start "entryRuleExprStruct"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2897:1: entryRuleExprStruct returns [EObject current=null] : iv_ruleExprStruct= ruleExprStruct EOF ;
    public final EObject entryRuleExprStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprStruct = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2898:2: (iv_ruleExprStruct= ruleExprStruct EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2899:2: iv_ruleExprStruct= ruleExprStruct EOF
            {
             newCompositeNode(grammarAccess.getExprStructRule()); 
            pushFollow(FOLLOW_ruleExprStruct_in_entryRuleExprStruct6088);
            iv_ruleExprStruct=ruleExprStruct();

            state._fsp--;

             current =iv_ruleExprStruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprStruct6098); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprStruct"


    // $ANTLR start "ruleExprStruct"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2906:1: ruleExprStruct returns [EObject current=null] : (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleExprStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fields_1_0 = null;

        EObject lv_fields_3_0 = null;

        EObject lv_baseExpr_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2909:28: ( (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2910:1: (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2910:1: (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2910:3: otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleExprStruct6135); 

                	newLeafNode(otherlv_0, grammarAccess.getExprStructAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2914:1: ( (lv_fields_1_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2915:1: (lv_fields_1_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2915:1: (lv_fields_1_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2916:3: lv_fields_1_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getExprStructAccess().getFieldsStructFieldParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleExprStruct6156);
            lv_fields_1_0=ruleStructField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprStructRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_1_0, 
                    		"StructField");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2932:2: (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==46) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2932:4: otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprStruct6169); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExprStructAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2936:1: ( (lv_fields_3_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2937:1: (lv_fields_3_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2937:1: (lv_fields_3_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2938:3: lv_fields_3_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprStructAccess().getFieldsStructFieldParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleExprStruct6190);
            	    lv_fields_3_0=ruleStructField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprStructRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_3_0, 
            	            		"StructField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2954:4: (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==69) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2954:6: otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) )
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleExprStruct6205); 

                        	newLeafNode(otherlv_4, grammarAccess.getExprStructAccess().getFullStopFullStopKeyword_3_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2958:1: ( (lv_baseExpr_5_0= ruleExpr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2959:1: (lv_baseExpr_5_0= ruleExpr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2959:1: (lv_baseExpr_5_0= ruleExpr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2960:3: lv_baseExpr_5_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprStructAccess().getBaseExprExprParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprStruct6226);
                    lv_baseExpr_5_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprStructRule());
                    	        }
                           		set(
                           			current, 
                           			"baseExpr",
                            		lv_baseExpr_5_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleExprStruct6240); 

                	newLeafNode(otherlv_6, grammarAccess.getExprStructAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprStruct"


    // $ANTLR start "entryRuleExprVec"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2988:1: entryRuleExprVec returns [EObject current=null] : iv_ruleExprVec= ruleExprVec EOF ;
    public final EObject entryRuleExprVec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprVec = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2989:2: (iv_ruleExprVec= ruleExprVec EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2990:2: iv_ruleExprVec= ruleExprVec EOF
            {
             newCompositeNode(grammarAccess.getExprVecRule()); 
            pushFollow(FOLLOW_ruleExprVec_in_entryRuleExprVec6276);
            iv_ruleExprVec=ruleExprVec();

            state._fsp--;

             current =iv_ruleExprVec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprVec6286); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprVec"


    // $ANTLR start "ruleExprVec"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2997:1: ruleExprVec returns [EObject current=null] : (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' ) ;
    public final EObject ruleExprVec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_exprs_2_0 = null;

        EObject lv_lenExpr_5_0 = null;

        EObject lv_exprs_6_0 = null;

        EObject lv_exprs_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3000:28: ( (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3001:1: (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3001:1: (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3001:3: otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleExprVec6323); 

                	newLeafNode(otherlv_0, grammarAccess.getExprVecAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3005:1: ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3006:1: (lv_mutable_1_0= RULE_MUT_KEYWORD )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3006:1: (lv_mutable_1_0= RULE_MUT_KEYWORD )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3007:3: lv_mutable_1_0= RULE_MUT_KEYWORD
            {
            lv_mutable_1_0=(Token)match(input,RULE_MUT_KEYWORD,FOLLOW_RULE_MUT_KEYWORD_in_ruleExprVec6340); 

            			newLeafNode(lv_mutable_1_0, grammarAccess.getExprVecAccess().getMutableMUT_KEYWORDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExprVecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mutable",
                    		true, 
                    		"MUT_KEYWORD");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3023:2: ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_IDENT && LA65_0<=RULE_STRING_LIT)||LA65_0==RULE_LIFETIME||(LA65_0>=RULE_FLOAT_LIT && LA65_0<=RULE_CHAR_LIT)||LA65_0==48||LA65_0==53||LA65_0==66||(LA65_0>=70 && LA65_0<=76)||LA65_0==84||(LA65_0>=90 && LA65_0<=94)||LA65_0==96||LA65_0==98||LA65_0==100) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3023:3: ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3023:3: ( (lv_exprs_2_0= ruleExpr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3024:1: (lv_exprs_2_0= ruleExpr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3024:1: (lv_exprs_2_0= ruleExpr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3025:3: lv_exprs_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprVecAccess().getExprsExprParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6367);
                    lv_exprs_2_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprVecRule());
                    	        }
                           		add(
                           			current, 
                           			"exprs",
                            		lv_exprs_2_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleExprVec6379); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprVecAccess().getCommaKeyword_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3045:1: ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==69) ) {
                        alt64=1;
                    }
                    else if ( ((LA64_0>=RULE_IDENT && LA64_0<=RULE_STRING_LIT)||LA64_0==RULE_LIFETIME||(LA64_0>=RULE_FLOAT_LIT && LA64_0<=RULE_CHAR_LIT)||LA64_0==48||LA64_0==53||LA64_0==66||(LA64_0>=70 && LA64_0<=76)||LA64_0==84||(LA64_0>=90 && LA64_0<=94)||LA64_0==96||LA64_0==98||LA64_0==100) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3045:2: (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3045:2: (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3045:4: otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) )
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleExprVec6393); 

                                	newLeafNode(otherlv_4, grammarAccess.getExprVecAccess().getFullStopFullStopKeyword_2_2_0_0());
                                
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3049:1: ( (lv_lenExpr_5_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3050:1: (lv_lenExpr_5_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3050:1: (lv_lenExpr_5_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3051:3: lv_lenExpr_5_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprVecAccess().getLenExprExprParserRuleCall_2_2_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6414);
                            lv_lenExpr_5_0=ruleExpr();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getExprVecRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"lenExpr",
                                    		lv_lenExpr_5_0, 
                                    		"Expr");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3068:6: ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3068:6: ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3068:7: ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3068:7: ( (lv_exprs_6_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3069:1: (lv_exprs_6_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3069:1: (lv_exprs_6_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3070:3: lv_exprs_6_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprVecAccess().getExprsExprParserRuleCall_2_2_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6443);
                            lv_exprs_6_0=ruleExpr();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getExprVecRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"exprs",
                                    		lv_exprs_6_0, 
                                    		"Expr");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3086:2: (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+
                            int cnt63=0;
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==46) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3086:4: otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) )
                            	    {
                            	    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleExprVec6456); 

                            	        	newLeafNode(otherlv_7, grammarAccess.getExprVecAccess().getCommaKeyword_2_2_1_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3090:1: ( (lv_exprs_8_0= ruleExpr ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3091:1: (lv_exprs_8_0= ruleExpr )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3091:1: (lv_exprs_8_0= ruleExpr )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3092:3: lv_exprs_8_0= ruleExpr
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getExprVecAccess().getExprsExprParserRuleCall_2_2_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6477);
                            	    lv_exprs_8_0=ruleExpr();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getExprVecRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"exprs",
                            	            		lv_exprs_8_0, 
                            	            		"Expr");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt63 >= 1 ) break loop63;
                                        EarlyExitException eee =
                                            new EarlyExitException(63, input);
                                        throw eee;
                                }
                                cnt63++;
                            } while (true);


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleExprVec6495); 

                	newLeafNode(otherlv_9, grammarAccess.getExprVecAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprVec"


    // $ANTLR start "entryRuleExprUnary"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3120:1: entryRuleExprUnary returns [EObject current=null] : iv_ruleExprUnary= ruleExprUnary EOF ;
    public final EObject entryRuleExprUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprUnary = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3121:2: (iv_ruleExprUnary= ruleExprUnary EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3122:2: iv_ruleExprUnary= ruleExprUnary EOF
            {
             newCompositeNode(grammarAccess.getExprUnaryRule()); 
            pushFollow(FOLLOW_ruleExprUnary_in_entryRuleExprUnary6531);
            iv_ruleExprUnary=ruleExprUnary();

            state._fsp--;

             current =iv_ruleExprUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprUnary6541); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprUnary"


    // $ANTLR start "ruleExprUnary"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3129:1: ruleExprUnary returns [EObject current=null] : (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow ) ;
    public final EObject ruleExprUnary() throws RecognitionException {
        EObject current = null;

        EObject this_NumericNegation_0 = null;

        EObject this_Dereference_1 = null;

        EObject this_LogicalNegation_2 = null;

        EObject this_ManagedBox_3 = null;

        EObject this_OwnedBox_4 = null;

        EObject this_Borrow_5 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3132:28: ( (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3133:1: (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3133:1: (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow )
            int alt66=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt66=1;
                }
                break;
            case 72:
                {
                alt66=2;
                }
                break;
            case 73:
                {
                alt66=3;
                }
                break;
            case 74:
                {
                alt66=4;
                }
                break;
            case 75:
                {
                alt66=5;
                }
                break;
            case 76:
                {
                alt66=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3134:5: this_NumericNegation_0= ruleNumericNegation
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getNumericNegationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumericNegation_in_ruleExprUnary6588);
                    this_NumericNegation_0=ruleNumericNegation();

                    state._fsp--;

                     
                            current = this_NumericNegation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3144:5: this_Dereference_1= ruleDereference
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getDereferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDereference_in_ruleExprUnary6615);
                    this_Dereference_1=ruleDereference();

                    state._fsp--;

                     
                            current = this_Dereference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3154:5: this_LogicalNegation_2= ruleLogicalNegation
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getLogicalNegationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLogicalNegation_in_ruleExprUnary6642);
                    this_LogicalNegation_2=ruleLogicalNegation();

                    state._fsp--;

                     
                            current = this_LogicalNegation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3164:5: this_ManagedBox_3= ruleManagedBox
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getManagedBoxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleManagedBox_in_ruleExprUnary6669);
                    this_ManagedBox_3=ruleManagedBox();

                    state._fsp--;

                     
                            current = this_ManagedBox_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3174:5: this_OwnedBox_4= ruleOwnedBox
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getOwnedBoxParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleOwnedBox_in_ruleExprUnary6696);
                    this_OwnedBox_4=ruleOwnedBox();

                    state._fsp--;

                     
                            current = this_OwnedBox_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3184:5: this_Borrow_5= ruleBorrow
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getBorrowParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBorrow_in_ruleExprUnary6723);
                    this_Borrow_5=ruleBorrow();

                    state._fsp--;

                     
                            current = this_Borrow_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprUnary"


    // $ANTLR start "entryRuleNumericNegation"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3200:1: entryRuleNumericNegation returns [EObject current=null] : iv_ruleNumericNegation= ruleNumericNegation EOF ;
    public final EObject entryRuleNumericNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericNegation = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3201:2: (iv_ruleNumericNegation= ruleNumericNegation EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3202:2: iv_ruleNumericNegation= ruleNumericNegation EOF
            {
             newCompositeNode(grammarAccess.getNumericNegationRule()); 
            pushFollow(FOLLOW_ruleNumericNegation_in_entryRuleNumericNegation6758);
            iv_ruleNumericNegation=ruleNumericNegation();

            state._fsp--;

             current =iv_ruleNumericNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericNegation6768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericNegation"


    // $ANTLR start "ruleNumericNegation"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3209:1: ruleNumericNegation returns [EObject current=null] : (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleNumericNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3212:28: ( (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3213:1: (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3213:1: (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3213:3: otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleNumericNegation6805); 

                	newLeafNode(otherlv_0, grammarAccess.getNumericNegationAccess().getHyphenMinusKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3217:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3218:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3218:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3219:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getNumericNegationAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleNumericNegation6826);
            lv_expr_1_0=ruleExprLeaf();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericNegationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"ExprLeaf");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericNegation"


    // $ANTLR start "entryRuleDereference"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3243:1: entryRuleDereference returns [EObject current=null] : iv_ruleDereference= ruleDereference EOF ;
    public final EObject entryRuleDereference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDereference = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3244:2: (iv_ruleDereference= ruleDereference EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3245:2: iv_ruleDereference= ruleDereference EOF
            {
             newCompositeNode(grammarAccess.getDereferenceRule()); 
            pushFollow(FOLLOW_ruleDereference_in_entryRuleDereference6862);
            iv_ruleDereference=ruleDereference();

            state._fsp--;

             current =iv_ruleDereference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDereference6872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDereference"


    // $ANTLR start "ruleDereference"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3252:1: ruleDereference returns [EObject current=null] : (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleDereference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3255:28: ( (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3256:1: (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3256:1: (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3256:3: otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleDereference6909); 

                	newLeafNode(otherlv_0, grammarAccess.getDereferenceAccess().getAsteriskKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3260:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3261:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3261:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3262:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getDereferenceAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleDereference6930);
            lv_expr_1_0=ruleExprLeaf();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDereferenceRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"ExprLeaf");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDereference"


    // $ANTLR start "entryRuleLogicalNegation"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3286:1: entryRuleLogicalNegation returns [EObject current=null] : iv_ruleLogicalNegation= ruleLogicalNegation EOF ;
    public final EObject entryRuleLogicalNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegation = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3287:2: (iv_ruleLogicalNegation= ruleLogicalNegation EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3288:2: iv_ruleLogicalNegation= ruleLogicalNegation EOF
            {
             newCompositeNode(grammarAccess.getLogicalNegationRule()); 
            pushFollow(FOLLOW_ruleLogicalNegation_in_entryRuleLogicalNegation6966);
            iv_ruleLogicalNegation=ruleLogicalNegation();

            state._fsp--;

             current =iv_ruleLogicalNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNegation6976); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalNegation"


    // $ANTLR start "ruleLogicalNegation"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3295:1: ruleLogicalNegation returns [EObject current=null] : (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleLogicalNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3298:28: ( (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3299:1: (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3299:1: (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3299:3: otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleLogicalNegation7013); 

                	newLeafNode(otherlv_0, grammarAccess.getLogicalNegationAccess().getExclamationMarkKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3303:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3304:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3304:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3305:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getLogicalNegationAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleLogicalNegation7034);
            lv_expr_1_0=ruleExprLeaf();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalNegationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"ExprLeaf");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalNegation"


    // $ANTLR start "entryRuleManagedBox"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3329:1: entryRuleManagedBox returns [EObject current=null] : iv_ruleManagedBox= ruleManagedBox EOF ;
    public final EObject entryRuleManagedBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManagedBox = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3330:2: (iv_ruleManagedBox= ruleManagedBox EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3331:2: iv_ruleManagedBox= ruleManagedBox EOF
            {
             newCompositeNode(grammarAccess.getManagedBoxRule()); 
            pushFollow(FOLLOW_ruleManagedBox_in_entryRuleManagedBox7070);
            iv_ruleManagedBox=ruleManagedBox();

            state._fsp--;

             current =iv_ruleManagedBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManagedBox7080); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManagedBox"


    // $ANTLR start "ruleManagedBox"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3338:1: ruleManagedBox returns [EObject current=null] : (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleManagedBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3341:28: ( (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3342:1: (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3342:1: (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3342:3: otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleManagedBox7117); 

                	newLeafNode(otherlv_0, grammarAccess.getManagedBoxAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3346:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3347:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3347:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3348:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getManagedBoxAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleManagedBox7138);
            lv_expr_1_0=ruleExprLeaf();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getManagedBoxRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"ExprLeaf");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManagedBox"


    // $ANTLR start "entryRuleOwnedBox"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3372:1: entryRuleOwnedBox returns [EObject current=null] : iv_ruleOwnedBox= ruleOwnedBox EOF ;
    public final EObject entryRuleOwnedBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedBox = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3373:2: (iv_ruleOwnedBox= ruleOwnedBox EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3374:2: iv_ruleOwnedBox= ruleOwnedBox EOF
            {
             newCompositeNode(grammarAccess.getOwnedBoxRule()); 
            pushFollow(FOLLOW_ruleOwnedBox_in_entryRuleOwnedBox7174);
            iv_ruleOwnedBox=ruleOwnedBox();

            state._fsp--;

             current =iv_ruleOwnedBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedBox7184); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnedBox"


    // $ANTLR start "ruleOwnedBox"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3381:1: ruleOwnedBox returns [EObject current=null] : (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleOwnedBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3384:28: ( (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3385:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3385:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3385:3: otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleOwnedBox7221); 

                	newLeafNode(otherlv_0, grammarAccess.getOwnedBoxAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3389:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3390:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3390:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3391:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getOwnedBoxAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleOwnedBox7242);
            lv_expr_1_0=ruleExprLeaf();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOwnedBoxRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"ExprLeaf");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOwnedBox"


    // $ANTLR start "entryRuleBorrow"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3415:1: entryRuleBorrow returns [EObject current=null] : iv_ruleBorrow= ruleBorrow EOF ;
    public final EObject entryRuleBorrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorrow = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3416:2: (iv_ruleBorrow= ruleBorrow EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3417:2: iv_ruleBorrow= ruleBorrow EOF
            {
             newCompositeNode(grammarAccess.getBorrowRule()); 
            pushFollow(FOLLOW_ruleBorrow_in_entryRuleBorrow7278);
            iv_ruleBorrow=ruleBorrow();

            state._fsp--;

             current =iv_ruleBorrow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrow7288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBorrow"


    // $ANTLR start "ruleBorrow"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3424:1: ruleBorrow returns [EObject current=null] : (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleBorrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3427:28: ( (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3428:1: (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3428:1: (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3428:3: otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleBorrow7325); 

                	newLeafNode(otherlv_0, grammarAccess.getBorrowAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3432:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3433:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3433:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3434:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getBorrowAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleBorrow7346);
            lv_expr_1_0=ruleExprLeaf();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBorrowRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"ExprLeaf");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBorrow"


    // $ANTLR start "entryRuleExprBinary"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3458:1: entryRuleExprBinary returns [EObject current=null] : iv_ruleExprBinary= ruleExprBinary EOF ;
    public final EObject entryRuleExprBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBinary = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3459:2: (iv_ruleExprBinary= ruleExprBinary EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3460:2: iv_ruleExprBinary= ruleExprBinary EOF
            {
             newCompositeNode(grammarAccess.getExprBinaryRule()); 
            pushFollow(FOLLOW_ruleExprBinary_in_entryRuleExprBinary7382);
            iv_ruleExprBinary=ruleExprBinary();

            state._fsp--;

             current =iv_ruleExprBinary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBinary7392); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprBinary"


    // $ANTLR start "ruleExprBinary"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3467:1: ruleExprBinary returns [EObject current=null] : this_Assign_0= ruleAssign ;
    public final EObject ruleExprBinary() throws RecognitionException {
        EObject current = null;

        EObject this_Assign_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3470:28: (this_Assign_0= ruleAssign )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3472:5: this_Assign_0= ruleAssign
            {
             
                    newCompositeNode(grammarAccess.getExprBinaryAccess().getAssignParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAssign_in_ruleExprBinary7438);
            this_Assign_0=ruleAssign();

            state._fsp--;

             
                    current = this_Assign_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprBinary"


    // $ANTLR start "entryRuleDivisionMultiplicationOrModulo"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3488:1: entryRuleDivisionMultiplicationOrModulo returns [EObject current=null] : iv_ruleDivisionMultiplicationOrModulo= ruleDivisionMultiplicationOrModulo EOF ;
    public final EObject entryRuleDivisionMultiplicationOrModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionMultiplicationOrModulo = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3489:2: (iv_ruleDivisionMultiplicationOrModulo= ruleDivisionMultiplicationOrModulo EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3490:2: iv_ruleDivisionMultiplicationOrModulo= ruleDivisionMultiplicationOrModulo EOF
            {
             newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloRule()); 
            pushFollow(FOLLOW_ruleDivisionMultiplicationOrModulo_in_entryRuleDivisionMultiplicationOrModulo7472);
            iv_ruleDivisionMultiplicationOrModulo=ruleDivisionMultiplicationOrModulo();

            state._fsp--;

             current =iv_ruleDivisionMultiplicationOrModulo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionMultiplicationOrModulo7482); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionMultiplicationOrModulo"


    // $ANTLR start "ruleDivisionMultiplicationOrModulo"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3497:1: ruleDivisionMultiplicationOrModulo returns [EObject current=null] : (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? ) ;
    public final EObject ruleDivisionMultiplicationOrModulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_ExprLeaf_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3500:28: ( (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3501:1: (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3501:1: (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3502:5: this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getExprLeafParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7529);
            this_ExprLeaf_0=ruleExprLeaf();

            state._fsp--;

             
                    current = this_ExprLeaf_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3510:1: ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )?
            int alt67=4;
            switch ( input.LA(1) ) {
                case 77:
                    {
                    alt67=1;
                    }
                    break;
                case 72:
                    {
                    alt67=2;
                    }
                    break;
                case 78:
                    {
                    alt67=3;
                    }
                    break;
            }

            switch (alt67) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3510:2: ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3510:2: ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3510:3: () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3510:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3511:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,77,FOLLOW_77_in_ruleDivisionMultiplicationOrModulo7551); 

                        	newLeafNode(otherlv_2, grammarAccess.getDivisionMultiplicationOrModuloAccess().getSolidusKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3520:1: ( (lv_right_3_0= ruleExprLeaf ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3521:1: (lv_right_3_0= ruleExprLeaf )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3521:1: (lv_right_3_0= ruleExprLeaf )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3522:3: lv_right_3_0= ruleExprLeaf
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7572);
                    lv_right_3_0=ruleExprLeaf();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDivisionMultiplicationOrModuloRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"ExprLeaf");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3539:6: ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3539:6: ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3539:7: () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3539:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3540:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleDivisionMultiplicationOrModulo7601); 

                        	newLeafNode(otherlv_5, grammarAccess.getDivisionMultiplicationOrModuloAccess().getAsteriskKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3549:1: ( (lv_right_6_0= ruleExprLeaf ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3550:1: (lv_right_6_0= ruleExprLeaf )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3550:1: (lv_right_6_0= ruleExprLeaf )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3551:3: lv_right_6_0= ruleExprLeaf
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7622);
                    lv_right_6_0=ruleExprLeaf();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDivisionMultiplicationOrModuloRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_6_0, 
                            		"ExprLeaf");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3568:6: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3568:6: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3568:7: () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3568:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3569:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleDivisionMultiplicationOrModulo7651); 

                        	newLeafNode(otherlv_8, grammarAccess.getDivisionMultiplicationOrModuloAccess().getPercentSignKeyword_1_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3578:1: ( (lv_right_9_0= ruleExprLeaf ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3579:1: (lv_right_9_0= ruleExprLeaf )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3579:1: (lv_right_9_0= ruleExprLeaf )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3580:3: lv_right_9_0= ruleExprLeaf
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7672);
                    lv_right_9_0=ruleExprLeaf();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDivisionMultiplicationOrModuloRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_9_0, 
                            		"ExprLeaf");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionMultiplicationOrModulo"


    // $ANTLR start "entryRuleAs"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3604:1: entryRuleAs returns [EObject current=null] : iv_ruleAs= ruleAs EOF ;
    public final EObject entryRuleAs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAs = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3605:2: (iv_ruleAs= ruleAs EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3606:2: iv_ruleAs= ruleAs EOF
            {
             newCompositeNode(grammarAccess.getAsRule()); 
            pushFollow(FOLLOW_ruleAs_in_entryRuleAs7711);
            iv_ruleAs=ruleAs();

            state._fsp--;

             current =iv_ruleAs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAs7721); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAs"


    // $ANTLR start "ruleAs"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3613:1: ruleAs returns [EObject current=null] : (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? ) ;
    public final EObject ruleAs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_DivisionMultiplicationOrModulo_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3616:28: ( (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3617:1: (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3617:1: (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3618:5: this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAsAccess().getDivisionMultiplicationOrModuloParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDivisionMultiplicationOrModulo_in_ruleAs7768);
            this_DivisionMultiplicationOrModulo_0=ruleDivisionMultiplicationOrModulo();

            state._fsp--;

             
                    current = this_DivisionMultiplicationOrModulo_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3626:1: ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==79) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3626:2: () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3626:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3627:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAsAccess().getExprCastExprAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleAs7789); 

                        	newLeafNode(otherlv_2, grammarAccess.getAsAccess().getAsKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3636:1: ( (lv_type_3_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3637:1: (lv_type_3_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3637:1: (lv_type_3_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3638:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAsAccess().getTypeTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAs7810);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAsRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAs"


    // $ANTLR start "entryRuleAdditionOrSubtraction"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3662:1: entryRuleAdditionOrSubtraction returns [EObject current=null] : iv_ruleAdditionOrSubtraction= ruleAdditionOrSubtraction EOF ;
    public final EObject entryRuleAdditionOrSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOrSubtraction = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3663:2: (iv_ruleAdditionOrSubtraction= ruleAdditionOrSubtraction EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3664:2: iv_ruleAdditionOrSubtraction= ruleAdditionOrSubtraction EOF
            {
             newCompositeNode(grammarAccess.getAdditionOrSubtractionRule()); 
            pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_entryRuleAdditionOrSubtraction7848);
            iv_ruleAdditionOrSubtraction=ruleAdditionOrSubtraction();

            state._fsp--;

             current =iv_ruleAdditionOrSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOrSubtraction7858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionOrSubtraction"


    // $ANTLR start "ruleAdditionOrSubtraction"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3671:1: ruleAdditionOrSubtraction returns [EObject current=null] : (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? ) ;
    public final EObject ruleAdditionOrSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_As_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3674:28: ( (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3675:1: (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3675:1: (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3676:5: this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAdditionOrSubtractionAccess().getAsParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7905);
            this_As_0=ruleAs();

            state._fsp--;

             
                    current = this_As_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3684:1: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )?
            int alt69=3;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==80) ) {
                alt69=1;
            }
            else if ( (LA69_0==71) ) {
                alt69=2;
            }
            switch (alt69) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3684:2: ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3684:2: ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3684:3: () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3684:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3685:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleAdditionOrSubtraction7927); 

                        	newLeafNode(otherlv_2, grammarAccess.getAdditionOrSubtractionAccess().getPlusSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3694:1: ( (lv_right_3_0= ruleAs ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3695:1: (lv_right_3_0= ruleAs )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3695:1: (lv_right_3_0= ruleAs )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3696:3: lv_right_3_0= ruleAs
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionOrSubtractionAccess().getRightAsParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7948);
                    lv_right_3_0=ruleAs();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAdditionOrSubtractionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"As");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3713:6: ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3713:6: ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3713:7: () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3713:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3714:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleAdditionOrSubtraction7977); 

                        	newLeafNode(otherlv_5, grammarAccess.getAdditionOrSubtractionAccess().getHyphenMinusKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3723:1: ( (lv_right_6_0= ruleAs ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3724:1: (lv_right_6_0= ruleAs )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3724:1: (lv_right_6_0= ruleAs )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3725:3: lv_right_6_0= ruleAs
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionOrSubtractionAccess().getRightAsParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7998);
                    lv_right_6_0=ruleAs();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAdditionOrSubtractionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_6_0, 
                            		"As");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOrSubtraction"


    // $ANTLR start "entryRuleShiftOperator"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3749:1: entryRuleShiftOperator returns [EObject current=null] : iv_ruleShiftOperator= ruleShiftOperator EOF ;
    public final EObject entryRuleShiftOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftOperator = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3750:2: (iv_ruleShiftOperator= ruleShiftOperator EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3751:2: iv_ruleShiftOperator= ruleShiftOperator EOF
            {
             newCompositeNode(grammarAccess.getShiftOperatorRule()); 
            pushFollow(FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator8037);
            iv_ruleShiftOperator=ruleShiftOperator();

            state._fsp--;

             current =iv_ruleShiftOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftOperator8047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftOperator"


    // $ANTLR start "ruleShiftOperator"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3758:1: ruleShiftOperator returns [EObject current=null] : (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? ) ;
    public final EObject ruleShiftOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_AdditionOrSubtraction_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3761:28: ( (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3762:1: (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3762:1: (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3763:5: this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getShiftOperatorAccess().getAdditionOrSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8094);
            this_AdditionOrSubtraction_0=ruleAdditionOrSubtraction();

            state._fsp--;

             
                    current = this_AdditionOrSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3771:1: ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )?
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==81) ) {
                alt70=1;
            }
            else if ( (LA70_0==82) ) {
                alt70=2;
            }
            switch (alt70) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3771:2: ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3771:2: ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3771:3: () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3771:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3772:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,81,FOLLOW_81_in_ruleShiftOperator8116); 

                        	newLeafNode(otherlv_2, grammarAccess.getShiftOperatorAccess().getLessThanSignLessThanSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3781:1: ( (lv_right_3_0= ruleAdditionOrSubtraction ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3782:1: (lv_right_3_0= ruleAdditionOrSubtraction )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3782:1: (lv_right_3_0= ruleAdditionOrSubtraction )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3783:3: lv_right_3_0= ruleAdditionOrSubtraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getShiftOperatorAccess().getRightAdditionOrSubtractionParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8137);
                    lv_right_3_0=ruleAdditionOrSubtraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShiftOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"AdditionOrSubtraction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3800:6: ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3800:6: ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3800:7: () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3800:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3801:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,82,FOLLOW_82_in_ruleShiftOperator8166); 

                        	newLeafNode(otherlv_5, grammarAccess.getShiftOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3810:1: ( (lv_right_6_0= ruleAdditionOrSubtraction ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3811:1: (lv_right_6_0= ruleAdditionOrSubtraction )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3811:1: (lv_right_6_0= ruleAdditionOrSubtraction )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3812:3: lv_right_6_0= ruleAdditionOrSubtraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getShiftOperatorAccess().getRightAdditionOrSubtractionParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8187);
                    lv_right_6_0=ruleAdditionOrSubtraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShiftOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_6_0, 
                            		"AdditionOrSubtraction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShiftOperator"


    // $ANTLR start "entryRuleBitwiseAnd"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3836:1: entryRuleBitwiseAnd returns [EObject current=null] : iv_ruleBitwiseAnd= ruleBitwiseAnd EOF ;
    public final EObject entryRuleBitwiseAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAnd = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3837:2: (iv_ruleBitwiseAnd= ruleBitwiseAnd EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3838:2: iv_ruleBitwiseAnd= ruleBitwiseAnd EOF
            {
             newCompositeNode(grammarAccess.getBitwiseAndRule()); 
            pushFollow(FOLLOW_ruleBitwiseAnd_in_entryRuleBitwiseAnd8226);
            iv_ruleBitwiseAnd=ruleBitwiseAnd();

            state._fsp--;

             current =iv_ruleBitwiseAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAnd8236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAnd"


    // $ANTLR start "ruleBitwiseAnd"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3845:1: ruleBitwiseAnd returns [EObject current=null] : (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? ) ;
    public final EObject ruleBitwiseAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ShiftOperator_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3848:28: ( (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3849:1: (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3849:1: (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3850:5: this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBitwiseAndAccess().getShiftOperatorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd8283);
            this_ShiftOperator_0=ruleShiftOperator();

            state._fsp--;

             
                    current = this_ShiftOperator_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3858:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==76) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3858:2: () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3858:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3859:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,76,FOLLOW_76_in_ruleBitwiseAnd8304); 

                        	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndAccess().getAmpersandKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3868:1: ( (lv_right_3_0= ruleShiftOperator ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3869:1: (lv_right_3_0= ruleShiftOperator )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3869:1: (lv_right_3_0= ruleShiftOperator )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3870:3: lv_right_3_0= ruleShiftOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getBitwiseAndAccess().getRightShiftOperatorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd8325);
                    lv_right_3_0=ruleShiftOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBitwiseAndRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"ShiftOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAnd"


    // $ANTLR start "entryRuleBitwiseXor"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3894:1: entryRuleBitwiseXor returns [EObject current=null] : iv_ruleBitwiseXor= ruleBitwiseXor EOF ;
    public final EObject entryRuleBitwiseXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXor = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3895:2: (iv_ruleBitwiseXor= ruleBitwiseXor EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3896:2: iv_ruleBitwiseXor= ruleBitwiseXor EOF
            {
             newCompositeNode(grammarAccess.getBitwiseXorRule()); 
            pushFollow(FOLLOW_ruleBitwiseXor_in_entryRuleBitwiseXor8363);
            iv_ruleBitwiseXor=ruleBitwiseXor();

            state._fsp--;

             current =iv_ruleBitwiseXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXor8373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseXor"


    // $ANTLR start "ruleBitwiseXor"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3903:1: ruleBitwiseXor returns [EObject current=null] : (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? ) ;
    public final EObject ruleBitwiseXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3906:28: ( (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3907:1: (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3907:1: (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3908:5: this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBitwiseXorAccess().getBitwiseAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor8420);
            this_BitwiseAnd_0=ruleBitwiseAnd();

            state._fsp--;

             
                    current = this_BitwiseAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3916:1: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==83) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3916:2: () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3916:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3917:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,83,FOLLOW_83_in_ruleBitwiseXor8441); 

                        	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorAccess().getCircumflexAccentKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3926:1: ( (lv_right_3_0= ruleBitwiseAnd ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3927:1: (lv_right_3_0= ruleBitwiseAnd )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3927:1: (lv_right_3_0= ruleBitwiseAnd )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3928:3: lv_right_3_0= ruleBitwiseAnd
                    {
                     
                    	        newCompositeNode(grammarAccess.getBitwiseXorAccess().getRightBitwiseAndParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor8462);
                    lv_right_3_0=ruleBitwiseAnd();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBitwiseXorRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"BitwiseAnd");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseXor"


    // $ANTLR start "entryRuleBitwiseOr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3952:1: entryRuleBitwiseOr returns [EObject current=null] : iv_ruleBitwiseOr= ruleBitwiseOr EOF ;
    public final EObject entryRuleBitwiseOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3953:2: (iv_ruleBitwiseOr= ruleBitwiseOr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3954:2: iv_ruleBitwiseOr= ruleBitwiseOr EOF
            {
             newCompositeNode(grammarAccess.getBitwiseOrRule()); 
            pushFollow(FOLLOW_ruleBitwiseOr_in_entryRuleBitwiseOr8500);
            iv_ruleBitwiseOr=ruleBitwiseOr();

            state._fsp--;

             current =iv_ruleBitwiseOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOr8510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOr"


    // $ANTLR start "ruleBitwiseOr"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3961:1: ruleBitwiseOr returns [EObject current=null] : (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? ) ;
    public final EObject ruleBitwiseOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXor_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3964:28: ( (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3965:1: (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3965:1: (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3966:5: this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBitwiseOrAccess().getBitwiseXorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr8557);
            this_BitwiseXor_0=ruleBitwiseXor();

            state._fsp--;

             
                    current = this_BitwiseXor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3974:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==84) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3974:2: () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3974:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3975:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,84,FOLLOW_84_in_ruleBitwiseOr8578); 

                        	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrAccess().getVerticalLineKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3984:1: ( (lv_right_3_0= ruleBitwiseXor ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3985:1: (lv_right_3_0= ruleBitwiseXor )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3985:1: (lv_right_3_0= ruleBitwiseXor )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3986:3: lv_right_3_0= ruleBitwiseXor
                    {
                     
                    	        newCompositeNode(grammarAccess.getBitwiseOrAccess().getRightBitwiseXorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr8599);
                    lv_right_3_0=ruleBitwiseXor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBitwiseOrRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"BitwiseXor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOr"


    // $ANTLR start "entryRuleComparisonOperators"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4010:1: entryRuleComparisonOperators returns [EObject current=null] : iv_ruleComparisonOperators= ruleComparisonOperators EOF ;
    public final EObject entryRuleComparisonOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperators = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4011:2: (iv_ruleComparisonOperators= ruleComparisonOperators EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4012:2: iv_ruleComparisonOperators= ruleComparisonOperators EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorsRule()); 
            pushFollow(FOLLOW_ruleComparisonOperators_in_entryRuleComparisonOperators8637);
            iv_ruleComparisonOperators=ruleComparisonOperators();

            state._fsp--;

             current =iv_ruleComparisonOperators; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperators8647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonOperators"


    // $ANTLR start "ruleComparisonOperators"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4019:1: ruleComparisonOperators returns [EObject current=null] : (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? ) ;
    public final EObject ruleComparisonOperators() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_BitwiseOr_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4022:28: ( (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4023:1: (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4023:1: (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4024:5: this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getBitwiseOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8694);
            this_BitwiseOr_0=ruleBitwiseOr();

            state._fsp--;

             
                    current = this_BitwiseOr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4032:1: ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )?
            int alt74=5;
            switch ( input.LA(1) ) {
                case 56:
                    {
                    alt74=1;
                    }
                    break;
                case 57:
                    {
                    alt74=2;
                    }
                    break;
                case 85:
                    {
                    alt74=3;
                    }
                    break;
                case 86:
                    {
                    alt74=4;
                    }
                    break;
            }

            switch (alt74) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4032:2: ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4032:2: ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4032:3: () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4032:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4033:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleComparisonOperators8716); 

                        	newLeafNode(otherlv_2, grammarAccess.getComparisonOperatorsAccess().getLessThanSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4042:1: ( (lv_right_3_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4043:1: (lv_right_3_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4043:1: (lv_right_3_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4044:3: lv_right_3_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8737);
                    lv_right_3_0=ruleBitwiseOr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonOperatorsRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"BitwiseOr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4061:6: ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4061:6: ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4061:7: () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4061:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4062:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleComparisonOperators8766); 

                        	newLeafNode(otherlv_5, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4071:1: ( (lv_right_6_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4072:1: (lv_right_6_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4072:1: (lv_right_6_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4073:3: lv_right_6_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8787);
                    lv_right_6_0=ruleBitwiseOr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonOperatorsRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_6_0, 
                            		"BitwiseOr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4090:6: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4090:6: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4090:7: () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4090:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4091:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,85,FOLLOW_85_in_ruleComparisonOperators8816); 

                        	newLeafNode(otherlv_8, grammarAccess.getComparisonOperatorsAccess().getLessThanSignEqualsSignKeyword_1_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4100:1: ( (lv_right_9_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4101:1: (lv_right_9_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4101:1: (lv_right_9_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4102:3: lv_right_9_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8837);
                    lv_right_9_0=ruleBitwiseOr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonOperatorsRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_9_0, 
                            		"BitwiseOr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4119:6: ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4119:6: ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4119:7: () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4119:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4120:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0(),
                                current);
                        

                    }

                    otherlv_11=(Token)match(input,86,FOLLOW_86_in_ruleComparisonOperators8866); 

                        	newLeafNode(otherlv_11, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4129:1: ( (lv_right_12_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4130:1: (lv_right_12_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4130:1: (lv_right_12_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4131:3: lv_right_12_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8887);
                    lv_right_12_0=ruleBitwiseOr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonOperatorsRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_12_0, 
                            		"BitwiseOr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperators"


    // $ANTLR start "entryRuleEqualityOperator"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4155:1: entryRuleEqualityOperator returns [EObject current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final EObject entryRuleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperator = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4156:2: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4157:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
             newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            pushFollow(FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator8926);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;

             current =iv_ruleEqualityOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityOperator8936); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityOperator"


    // $ANTLR start "ruleEqualityOperator"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4164:1: ruleEqualityOperator returns [EObject current=null] : (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? ) ;
    public final EObject ruleEqualityOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ComparisonOperators_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4167:28: ( (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4168:1: (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4168:1: (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4169:5: this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getEqualityOperatorAccess().getComparisonOperatorsParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8983);
            this_ComparisonOperators_0=ruleComparisonOperators();

            state._fsp--;

             
                    current = this_ComparisonOperators_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4177:1: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )?
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==87) ) {
                alt75=1;
            }
            else if ( (LA75_0==88) ) {
                alt75=2;
            }
            switch (alt75) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4177:2: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4177:2: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4177:3: () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4177:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4178:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,87,FOLLOW_87_in_ruleEqualityOperator9005); 

                        	newLeafNode(otherlv_2, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4187:1: ( (lv_right_3_0= ruleComparisonOperators ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4188:1: (lv_right_3_0= ruleComparisonOperators )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4188:1: (lv_right_3_0= ruleComparisonOperators )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4189:3: lv_right_3_0= ruleComparisonOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityOperatorAccess().getRightComparisonOperatorsParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator9026);
                    lv_right_3_0=ruleComparisonOperators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"ComparisonOperators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4206:6: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4206:6: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4206:7: () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4206:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4207:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,88,FOLLOW_88_in_ruleEqualityOperator9055); 

                        	newLeafNode(otherlv_5, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4216:1: ( (lv_right_6_0= ruleComparisonOperators ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4217:1: (lv_right_6_0= ruleComparisonOperators )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4217:1: (lv_right_6_0= ruleComparisonOperators )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4218:3: lv_right_6_0= ruleComparisonOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityOperatorAccess().getRightComparisonOperatorsParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator9076);
                    lv_right_6_0=ruleComparisonOperators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_6_0, 
                            		"ComparisonOperators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "entryRuleBooleanAnd"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4242:1: entryRuleBooleanAnd returns [EObject current=null] : iv_ruleBooleanAnd= ruleBooleanAnd EOF ;
    public final EObject entryRuleBooleanAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAnd = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4243:2: (iv_ruleBooleanAnd= ruleBooleanAnd EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4244:2: iv_ruleBooleanAnd= ruleBooleanAnd EOF
            {
             newCompositeNode(grammarAccess.getBooleanAndRule()); 
            pushFollow(FOLLOW_ruleBooleanAnd_in_entryRuleBooleanAnd9115);
            iv_ruleBooleanAnd=ruleBooleanAnd();

            state._fsp--;

             current =iv_ruleBooleanAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAnd9125); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanAnd"


    // $ANTLR start "ruleBooleanAnd"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4251:1: ruleBooleanAnd returns [EObject current=null] : (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? ) ;
    public final EObject ruleBooleanAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityOperator_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4254:28: ( (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4255:1: (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4255:1: (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4256:5: this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBooleanAndAccess().getEqualityOperatorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd9172);
            this_EqualityOperator_0=ruleEqualityOperator();

            state._fsp--;

             
                    current = this_EqualityOperator_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4264:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==89) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4264:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4264:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4265:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,89,FOLLOW_89_in_ruleBooleanAnd9193); 

                        	newLeafNode(otherlv_2, grammarAccess.getBooleanAndAccess().getAmpersandAmpersandKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4274:1: ( (lv_right_3_0= ruleEqualityOperator ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4275:1: (lv_right_3_0= ruleEqualityOperator )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4275:1: (lv_right_3_0= ruleEqualityOperator )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4276:3: lv_right_3_0= ruleEqualityOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanAndAccess().getRightEqualityOperatorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd9214);
                    lv_right_3_0=ruleEqualityOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanAndRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"EqualityOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanAnd"


    // $ANTLR start "entryRuleAssign"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4302:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4303:2: (iv_ruleAssign= ruleAssign EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4304:2: iv_ruleAssign= ruleAssign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign9254);
            iv_ruleAssign=ruleAssign();

            state._fsp--;

             current =iv_ruleAssign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign9264); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4311:1: ruleAssign returns [EObject current=null] : (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExprLValue_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4314:28: ( (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4315:1: (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4315:1: (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4316:5: this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAssignAccess().getExprLValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprLValue_in_ruleAssign9311);
            this_ExprLValue_0=ruleExprLValue();

            state._fsp--;

             
                    current = this_ExprLValue_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4324:1: ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==50) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4324:2: () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4324:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4325:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAssignAccess().getExprAssignLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleAssign9332); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4334:1: ( (lv_right_3_0= ruleExprUnary ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4335:1: (lv_right_3_0= ruleExprUnary )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4335:1: (lv_right_3_0= ruleExprUnary )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4336:3: lv_right_3_0= ruleExprUnary
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignAccess().getRightExprUnaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprUnary_in_ruleAssign9353);
                    lv_right_3_0=ruleExprUnary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"ExprUnary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleExprLambda"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4360:1: entryRuleExprLambda returns [EObject current=null] : iv_ruleExprLambda= ruleExprLambda EOF ;
    public final EObject entryRuleExprLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLambda = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4361:2: (iv_ruleExprLambda= ruleExprLambda EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4362:2: iv_ruleExprLambda= ruleExprLambda EOF
            {
             newCompositeNode(grammarAccess.getExprLambdaRule()); 
            pushFollow(FOLLOW_ruleExprLambda_in_entryRuleExprLambda9391);
            iv_ruleExprLambda=ruleExprLambda();

            state._fsp--;

             current =iv_ruleExprLambda; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLambda9401); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprLambda"


    // $ANTLR start "ruleExprLambda"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4369:1: ruleExprLambda returns [EObject current=null] : (otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) ) ) ;
    public final EObject ruleExprLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_args_1_0=null;
        Token otherlv_2=null;
        Token lv_args_3_0=null;
        Token otherlv_4=null;
        EObject lv_expr_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4372:28: ( (otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4373:1: (otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4373:1: (otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4373:3: otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleExprLambda9438); 

                	newLeafNode(otherlv_0, grammarAccess.getExprLambdaAccess().getVerticalLineKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4377:1: ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_IDENT) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4377:2: ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )*
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4377:2: ( (lv_args_1_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4378:1: (lv_args_1_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4378:1: (lv_args_1_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4379:3: lv_args_1_0= RULE_IDENT
                    {
                    lv_args_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprLambda9456); 

                    			newLeafNode(lv_args_1_0, grammarAccess.getExprLambdaAccess().getArgsIDENTTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExprLambdaRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"args",
                            		lv_args_1_0, 
                            		"IDENT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4395:2: (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==46) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4395:4: otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprLambda9474); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getExprLambdaAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4399:1: ( (lv_args_3_0= RULE_IDENT ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4400:1: (lv_args_3_0= RULE_IDENT )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4400:1: (lv_args_3_0= RULE_IDENT )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4401:3: lv_args_3_0= RULE_IDENT
                    	    {
                    	    lv_args_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprLambda9491); 

                    	    			newLeafNode(lv_args_3_0, grammarAccess.getExprLambdaAccess().getArgsIDENTTerminalRuleCall_1_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExprLambdaRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_3_0, 
                    	            		"IDENT");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,84,FOLLOW_84_in_ruleExprLambda9512); 

                	newLeafNode(otherlv_4, grammarAccess.getExprLambdaAccess().getVerticalLineKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4421:1: ( (lv_expr_5_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4422:1: (lv_expr_5_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4422:1: (lv_expr_5_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4423:3: lv_expr_5_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprLambdaAccess().getExprExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprLambda9533);
            lv_expr_5_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprLambdaRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_5_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprLambda"


    // $ANTLR start "entryRuleExprWhile"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4447:1: entryRuleExprWhile returns [EObject current=null] : iv_ruleExprWhile= ruleExprWhile EOF ;
    public final EObject entryRuleExprWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprWhile = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4448:2: (iv_ruleExprWhile= ruleExprWhile EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4449:2: iv_ruleExprWhile= ruleExprWhile EOF
            {
             newCompositeNode(grammarAccess.getExprWhileRule()); 
            pushFollow(FOLLOW_ruleExprWhile_in_entryRuleExprWhile9569);
            iv_ruleExprWhile=ruleExprWhile();

            state._fsp--;

             current =iv_ruleExprWhile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprWhile9579); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprWhile"


    // $ANTLR start "ruleExprWhile"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4456:1: ruleExprWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ) ;
    public final EObject ruleExprWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4459:28: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4460:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4460:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4460:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,90,FOLLOW_90_in_ruleExprWhile9616); 

                	newLeafNode(otherlv_0, grammarAccess.getExprWhileAccess().getWhileKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4464:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4465:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4465:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4466:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprWhileAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprWhile9637);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprWhileRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4482:2: ( (lv_block_2_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4483:1: (lv_block_2_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4483:1: (lv_block_2_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4484:3: lv_block_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprWhileAccess().getBlockBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprWhile9658);
            lv_block_2_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprWhileRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_2_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprWhile"


    // $ANTLR start "entryRuleExprLoop"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4508:1: entryRuleExprLoop returns [EObject current=null] : iv_ruleExprLoop= ruleExprLoop EOF ;
    public final EObject entryRuleExprLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLoop = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4509:2: (iv_ruleExprLoop= ruleExprLoop EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4510:2: iv_ruleExprLoop= ruleExprLoop EOF
            {
             newCompositeNode(grammarAccess.getExprLoopRule()); 
            pushFollow(FOLLOW_ruleExprLoop_in_entryRuleExprLoop9694);
            iv_ruleExprLoop=ruleExprLoop();

            state._fsp--;

             current =iv_ruleExprLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLoop9704); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprLoop"


    // $ANTLR start "ruleExprLoop"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4517:1: ruleExprLoop returns [EObject current=null] : ( ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) ) ) ;
    public final EObject ruleExprLoop() throws RecognitionException {
        EObject current = null;

        Token lv_lifetime_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_block_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4520:28: ( ( ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4521:1: ( ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4521:1: ( ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4521:2: ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4521:2: ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_LIFETIME) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4521:3: ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4521:3: ( (lv_lifetime_0_0= RULE_LIFETIME ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:1: (lv_lifetime_0_0= RULE_LIFETIME )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:1: (lv_lifetime_0_0= RULE_LIFETIME )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4523:3: lv_lifetime_0_0= RULE_LIFETIME
                    {
                    lv_lifetime_0_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprLoop9747); 

                    			newLeafNode(lv_lifetime_0_0, grammarAccess.getExprLoopAccess().getLifetimeLIFETIMETerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExprLoopRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lifetime",
                            		lv_lifetime_0_0, 
                            		"LIFETIME");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleExprLoop9764); 

                        	newLeafNode(otherlv_1, grammarAccess.getExprLoopAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,91,FOLLOW_91_in_ruleExprLoop9778); 

                	newLeafNode(otherlv_2, grammarAccess.getExprLoopAccess().getLoopKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4547:1: ( (lv_block_3_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4548:1: (lv_block_3_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4548:1: (lv_block_3_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4549:3: lv_block_3_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprLoopAccess().getBlockBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprLoop9799);
            lv_block_3_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprLoopRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_3_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprLoop"


    // $ANTLR start "entryRuleExprBreak"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4573:1: entryRuleExprBreak returns [EObject current=null] : iv_ruleExprBreak= ruleExprBreak EOF ;
    public final EObject entryRuleExprBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBreak = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4574:2: (iv_ruleExprBreak= ruleExprBreak EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4575:2: iv_ruleExprBreak= ruleExprBreak EOF
            {
             newCompositeNode(grammarAccess.getExprBreakRule()); 
            pushFollow(FOLLOW_ruleExprBreak_in_entryRuleExprBreak9835);
            iv_ruleExprBreak=ruleExprBreak();

            state._fsp--;

             current =iv_ruleExprBreak; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBreak9845); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprBreak"


    // $ANTLR start "ruleExprBreak"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4582:1: ruleExprBreak returns [EObject current=null] : ( () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? ) ;
    public final EObject ruleExprBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lifetime_2_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4585:28: ( ( () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4586:1: ( () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4586:1: ( () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4586:2: () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4586:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4587:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExprBreakAccess().getExprBreakAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleExprBreak9891); 

                	newLeafNode(otherlv_1, grammarAccess.getExprBreakAccess().getBreakKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4596:1: ( (lv_lifetime_2_0= RULE_LIFETIME ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_LIFETIME) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4597:1: (lv_lifetime_2_0= RULE_LIFETIME )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4597:1: (lv_lifetime_2_0= RULE_LIFETIME )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4598:3: lv_lifetime_2_0= RULE_LIFETIME
                    {
                    lv_lifetime_2_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprBreak9908); 

                    			newLeafNode(lv_lifetime_2_0, grammarAccess.getExprBreakAccess().getLifetimeLIFETIMETerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExprBreakRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lifetime",
                            		lv_lifetime_2_0, 
                            		"LIFETIME");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprBreak"


    // $ANTLR start "entryRuleExprContinue"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4622:1: entryRuleExprContinue returns [EObject current=null] : iv_ruleExprContinue= ruleExprContinue EOF ;
    public final EObject entryRuleExprContinue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprContinue = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4623:2: (iv_ruleExprContinue= ruleExprContinue EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4624:2: iv_ruleExprContinue= ruleExprContinue EOF
            {
             newCompositeNode(grammarAccess.getExprContinueRule()); 
            pushFollow(FOLLOW_ruleExprContinue_in_entryRuleExprContinue9950);
            iv_ruleExprContinue=ruleExprContinue();

            state._fsp--;

             current =iv_ruleExprContinue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprContinue9960); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprContinue"


    // $ANTLR start "ruleExprContinue"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4631:1: ruleExprContinue returns [EObject current=null] : ( () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? ) ;
    public final EObject ruleExprContinue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lifetime_2_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4634:28: ( ( () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4635:1: ( () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4635:1: ( () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4635:2: () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4635:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4636:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExprContinueAccess().getExprContinueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleExprContinue10006); 

                	newLeafNode(otherlv_1, grammarAccess.getExprContinueAccess().getContinueKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4645:1: ( (lv_lifetime_2_0= RULE_LIFETIME ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_LIFETIME) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4646:1: (lv_lifetime_2_0= RULE_LIFETIME )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4646:1: (lv_lifetime_2_0= RULE_LIFETIME )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4647:3: lv_lifetime_2_0= RULE_LIFETIME
                    {
                    lv_lifetime_2_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprContinue10023); 

                    			newLeafNode(lv_lifetime_2_0, grammarAccess.getExprContinueAccess().getLifetimeLIFETIMETerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExprContinueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lifetime",
                            		lv_lifetime_2_0, 
                            		"LIFETIME");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprContinue"


    // $ANTLR start "entryRuleExprDo"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4671:1: entryRuleExprDo returns [EObject current=null] : iv_ruleExprDo= ruleExprDo EOF ;
    public final EObject entryRuleExprDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprDo = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4672:2: (iv_ruleExprDo= ruleExprDo EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4673:2: iv_ruleExprDo= ruleExprDo EOF
            {
             newCompositeNode(grammarAccess.getExprDoRule()); 
            pushFollow(FOLLOW_ruleExprDo_in_entryRuleExprDo10065);
            iv_ruleExprDo=ruleExprDo();

            state._fsp--;

             current =iv_ruleExprDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprDo10075); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprDo"


    // $ANTLR start "ruleExprDo"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4680:1: ruleExprDo returns [EObject current=null] : (otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) ) ) ;
    public final EObject ruleExprDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_args_3_0=null;
        Token otherlv_4=null;
        Token lv_args_5_0=null;
        Token otherlv_6=null;
        EObject lv_expr_1_0 = null;

        EObject lv_block_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4683:28: ( (otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4684:1: (otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4684:1: (otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4684:3: otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleExprDo10112); 

                	newLeafNode(otherlv_0, grammarAccess.getExprDoAccess().getDoKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4688:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4689:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4689:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4690:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprDoAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprDo10133);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprDoRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,84,FOLLOW_84_in_ruleExprDo10145); 

                	newLeafNode(otherlv_2, grammarAccess.getExprDoAccess().getVerticalLineKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4710:1: ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_IDENT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4710:2: ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )*
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4710:2: ( (lv_args_3_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4711:1: (lv_args_3_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4711:1: (lv_args_3_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4712:3: lv_args_3_0= RULE_IDENT
                    {
                    lv_args_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprDo10163); 

                    			newLeafNode(lv_args_3_0, grammarAccess.getExprDoAccess().getArgsIDENTTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExprDoRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"args",
                            		lv_args_3_0, 
                            		"IDENT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4728:2: (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==46) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4728:4: otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleExprDo10181); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getExprDoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4732:1: ( (lv_args_5_0= RULE_IDENT ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4733:1: (lv_args_5_0= RULE_IDENT )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4733:1: (lv_args_5_0= RULE_IDENT )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4734:3: lv_args_5_0= RULE_IDENT
                    	    {
                    	    lv_args_5_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprDo10198); 

                    	    			newLeafNode(lv_args_5_0, grammarAccess.getExprDoAccess().getArgsIDENTTerminalRuleCall_3_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExprDoRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_5_0, 
                    	            		"IDENT");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,84,FOLLOW_84_in_ruleExprDo10219); 

                	newLeafNode(otherlv_6, grammarAccess.getExprDoAccess().getVerticalLineKeyword_4());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4754:1: ( (lv_block_7_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4755:1: (lv_block_7_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4755:1: (lv_block_7_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4756:3: lv_block_7_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprDoAccess().getBlockBlockParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprDo10240);
            lv_block_7_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprDoRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_7_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprDo"


    // $ANTLR start "entryRuleExprFor"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4780:1: entryRuleExprFor returns [EObject current=null] : iv_ruleExprFor= ruleExprFor EOF ;
    public final EObject entryRuleExprFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprFor = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4781:2: (iv_ruleExprFor= ruleExprFor EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4782:2: iv_ruleExprFor= ruleExprFor EOF
            {
             newCompositeNode(grammarAccess.getExprForRule()); 
            pushFollow(FOLLOW_ruleExprFor_in_entryRuleExprFor10276);
            iv_ruleExprFor=ruleExprFor();

            state._fsp--;

             current =iv_ruleExprFor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprFor10286); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprFor"


    // $ANTLR start "ruleExprFor"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4789:1: ruleExprFor returns [EObject current=null] : (otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleExprFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_pat_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4792:28: ( (otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4793:1: (otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4793:1: (otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4793:3: otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleExprFor10323); 

                	newLeafNode(otherlv_0, grammarAccess.getExprForAccess().getForKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4797:1: ( (lv_pat_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4798:1: (lv_pat_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4798:1: (lv_pat_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4799:3: lv_pat_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getExprForAccess().getPatPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_ruleExprFor10344);
            lv_pat_1_0=rulePat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprForRule());
            	        }
                   		set(
                   			current, 
                   			"pat",
                    		lv_pat_1_0, 
                    		"Pat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,95,FOLLOW_95_in_ruleExprFor10356); 

                	newLeafNode(otherlv_2, grammarAccess.getExprForAccess().getInKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4819:1: ( (lv_expr_3_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4820:1: (lv_expr_3_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4820:1: (lv_expr_3_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4821:3: lv_expr_3_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprForAccess().getExprExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprFor10377);
            lv_expr_3_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprForRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4837:2: ( (lv_block_4_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4838:1: (lv_block_4_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4838:1: (lv_block_4_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4839:3: lv_block_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprForAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprFor10398);
            lv_block_4_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprForRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_4_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprFor"


    // $ANTLR start "entryRuleExprIf"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4863:1: entryRuleExprIf returns [EObject current=null] : iv_ruleExprIf= ruleExprIf EOF ;
    public final EObject entryRuleExprIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprIf = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4864:2: (iv_ruleExprIf= ruleExprIf EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4865:2: iv_ruleExprIf= ruleExprIf EOF
            {
             newCompositeNode(grammarAccess.getExprIfRule()); 
            pushFollow(FOLLOW_ruleExprIf_in_entryRuleExprIf10434);
            iv_ruleExprIf=ruleExprIf();

            state._fsp--;

             current =iv_ruleExprIf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprIf10444); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprIf"


    // $ANTLR start "ruleExprIf"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4872:1: ruleExprIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )? ) ;
    public final EObject ruleExprIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;

        EObject lv_block_2_0 = null;

        EObject lv_else_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4875:28: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4876:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4876:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4876:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )?
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleExprIf10481); 

                	newLeafNode(otherlv_0, grammarAccess.getExprIfAccess().getIfKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4880:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4881:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4881:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4882:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprIfAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprIf10502);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprIfRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4898:2: ( (lv_block_2_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4899:1: (lv_block_2_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4899:1: (lv_block_2_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4900:3: lv_block_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprIfAccess().getBlockBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprIf10523);
            lv_block_2_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprIfRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_2_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4916:2: ( (lv_else_3_0= ruleElseTail ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==97) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4917:1: (lv_else_3_0= ruleElseTail )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4917:1: (lv_else_3_0= ruleElseTail )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4918:3: lv_else_3_0= ruleElseTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprIfAccess().getElseElseTailParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElseTail_in_ruleExprIf10544);
                    lv_else_3_0=ruleElseTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprIfRule());
                    	        }
                           		set(
                           			current, 
                           			"else",
                            		lv_else_3_0, 
                            		"ElseTail");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprIf"


    // $ANTLR start "entryRuleElseTail"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4942:1: entryRuleElseTail returns [EObject current=null] : iv_ruleElseTail= ruleElseTail EOF ;
    public final EObject entryRuleElseTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseTail = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4943:2: (iv_ruleElseTail= ruleElseTail EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4944:2: iv_ruleElseTail= ruleElseTail EOF
            {
             newCompositeNode(grammarAccess.getElseTailRule()); 
            pushFollow(FOLLOW_ruleElseTail_in_entryRuleElseTail10581);
            iv_ruleElseTail=ruleElseTail();

            state._fsp--;

             current =iv_ruleElseTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseTail10591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseTail"


    // $ANTLR start "ruleElseTail"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4951:1: ruleElseTail returns [EObject current=null] : (otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) ) ) ;
    public final EObject ruleElseTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ExprIf_1 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4954:28: ( (otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4955:1: (otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4955:1: (otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4955:3: otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleElseTail10628); 

                	newLeafNode(otherlv_0, grammarAccess.getElseTailAccess().getElseKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4959:1: (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==96) ) {
                alt86=1;
            }
            else if ( (LA86_0==53) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4960:5: this_ExprIf_1= ruleExprIf
                    {
                     
                            newCompositeNode(grammarAccess.getElseTailAccess().getExprIfParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleExprIf_in_ruleElseTail10651);
                    this_ExprIf_1=ruleExprIf();

                    state._fsp--;

                     
                            current = this_ExprIf_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4969:6: ( (lv_block_2_0= ruleBlock ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4969:6: ( (lv_block_2_0= ruleBlock ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4970:1: (lv_block_2_0= ruleBlock )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4970:1: (lv_block_2_0= ruleBlock )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4971:3: lv_block_2_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getElseTailAccess().getBlockBlockParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleElseTail10677);
                    lv_block_2_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElseTailRule());
                    	        }
                           		set(
                           			current, 
                           			"block",
                            		lv_block_2_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseTail"


    // $ANTLR start "entryRuleExprMatch"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4995:1: entryRuleExprMatch returns [EObject current=null] : iv_ruleExprMatch= ruleExprMatch EOF ;
    public final EObject entryRuleExprMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMatch = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4996:2: (iv_ruleExprMatch= ruleExprMatch EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4997:2: iv_ruleExprMatch= ruleExprMatch EOF
            {
             newCompositeNode(grammarAccess.getExprMatchRule()); 
            pushFollow(FOLLOW_ruleExprMatch_in_entryRuleExprMatch10714);
            iv_ruleExprMatch=ruleExprMatch();

            state._fsp--;

             current =iv_ruleExprMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMatch10724); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprMatch"


    // $ANTLR start "ruleExprMatch"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5004:1: ruleExprMatch returns [EObject current=null] : (otherlv_0= 'match' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '{' ( (lv_arms_3_0= ruleMatchArm ) ) (otherlv_4= '|' ( (lv_arms_5_0= ruleMatchArm ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleExprMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_1_0 = null;

        EObject lv_arms_3_0 = null;

        EObject lv_arms_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5007:28: ( (otherlv_0= 'match' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '{' ( (lv_arms_3_0= ruleMatchArm ) ) (otherlv_4= '|' ( (lv_arms_5_0= ruleMatchArm ) ) )* otherlv_6= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5008:1: (otherlv_0= 'match' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '{' ( (lv_arms_3_0= ruleMatchArm ) ) (otherlv_4= '|' ( (lv_arms_5_0= ruleMatchArm ) ) )* otherlv_6= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5008:1: (otherlv_0= 'match' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '{' ( (lv_arms_3_0= ruleMatchArm ) ) (otherlv_4= '|' ( (lv_arms_5_0= ruleMatchArm ) ) )* otherlv_6= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5008:3: otherlv_0= 'match' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '{' ( (lv_arms_3_0= ruleMatchArm ) ) (otherlv_4= '|' ( (lv_arms_5_0= ruleMatchArm ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_98_in_ruleExprMatch10761); 

                	newLeafNode(otherlv_0, grammarAccess.getExprMatchAccess().getMatchKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5012:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5013:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5013:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5014:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprMatchAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprMatch10782);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprMatchRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleExprMatch10794); 

                	newLeafNode(otherlv_2, grammarAccess.getExprMatchAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5034:1: ( (lv_arms_3_0= ruleMatchArm ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5035:1: (lv_arms_3_0= ruleMatchArm )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5035:1: (lv_arms_3_0= ruleMatchArm )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5036:3: lv_arms_3_0= ruleMatchArm
            {
             
            	        newCompositeNode(grammarAccess.getExprMatchAccess().getArmsMatchArmParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMatchArm_in_ruleExprMatch10815);
            lv_arms_3_0=ruleMatchArm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprMatchRule());
            	        }
                   		add(
                   			current, 
                   			"arms",
                    		lv_arms_3_0, 
                    		"MatchArm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5052:2: (otherlv_4= '|' ( (lv_arms_5_0= ruleMatchArm ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==84) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5052:4: otherlv_4= '|' ( (lv_arms_5_0= ruleMatchArm ) )
            	    {
            	    otherlv_4=(Token)match(input,84,FOLLOW_84_in_ruleExprMatch10828); 

            	        	newLeafNode(otherlv_4, grammarAccess.getExprMatchAccess().getVerticalLineKeyword_4_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5056:1: ( (lv_arms_5_0= ruleMatchArm ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5057:1: (lv_arms_5_0= ruleMatchArm )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5057:1: (lv_arms_5_0= ruleMatchArm )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5058:3: lv_arms_5_0= ruleMatchArm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprMatchAccess().getArmsMatchArmParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMatchArm_in_ruleExprMatch10849);
            	    lv_arms_5_0=ruleMatchArm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprMatchRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arms",
            	            		lv_arms_5_0, 
            	            		"MatchArm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleExprMatch10863); 

                	newLeafNode(otherlv_6, grammarAccess.getExprMatchAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprMatch"


    // $ANTLR start "entryRuleMatchArm"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5086:1: entryRuleMatchArm returns [EObject current=null] : iv_ruleMatchArm= ruleMatchArm EOF ;
    public final EObject entryRuleMatchArm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchArm = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5087:2: (iv_ruleMatchArm= ruleMatchArm EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5088:2: iv_ruleMatchArm= ruleMatchArm EOF
            {
             newCompositeNode(grammarAccess.getMatchArmRule()); 
            pushFollow(FOLLOW_ruleMatchArm_in_entryRuleMatchArm10899);
            iv_ruleMatchArm=ruleMatchArm();

            state._fsp--;

             current =iv_ruleMatchArm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchArm10909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatchArm"


    // $ANTLR start "ruleMatchArm"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5095:1: ruleMatchArm returns [EObject current=null] : ( ( (lv_matchPat_0_0= ruleMatchPat ) ) otherlv_1= '=>' ( ( ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ',' ) | ( (lv_block_4_0= ruleBlock ) ) ) ) ;
    public final EObject ruleMatchArm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_matchPat_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5098:28: ( ( ( (lv_matchPat_0_0= ruleMatchPat ) ) otherlv_1= '=>' ( ( ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ',' ) | ( (lv_block_4_0= ruleBlock ) ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5099:1: ( ( (lv_matchPat_0_0= ruleMatchPat ) ) otherlv_1= '=>' ( ( ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ',' ) | ( (lv_block_4_0= ruleBlock ) ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5099:1: ( ( (lv_matchPat_0_0= ruleMatchPat ) ) otherlv_1= '=>' ( ( ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ',' ) | ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5099:2: ( (lv_matchPat_0_0= ruleMatchPat ) ) otherlv_1= '=>' ( ( ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ',' ) | ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5099:2: ( (lv_matchPat_0_0= ruleMatchPat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5100:1: (lv_matchPat_0_0= ruleMatchPat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5100:1: (lv_matchPat_0_0= ruleMatchPat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5101:3: lv_matchPat_0_0= ruleMatchPat
            {
             
            	        newCompositeNode(grammarAccess.getMatchArmAccess().getMatchPatMatchPatParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMatchPat_in_ruleMatchArm10955);
            lv_matchPat_0_0=ruleMatchPat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatchArmRule());
            	        }
                   		set(
                   			current, 
                   			"matchPat",
                    		lv_matchPat_0_0, 
                    		"MatchPat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,99,FOLLOW_99_in_ruleMatchArm10967); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchArmAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5121:1: ( ( ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ',' ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=RULE_IDENT && LA88_0<=RULE_STRING_LIT)||LA88_0==RULE_LIFETIME||(LA88_0>=RULE_FLOAT_LIT && LA88_0<=RULE_CHAR_LIT)||LA88_0==48||LA88_0==66||(LA88_0>=70 && LA88_0<=76)||LA88_0==84||(LA88_0>=90 && LA88_0<=94)||LA88_0==96||LA88_0==98||LA88_0==100) ) {
                alt88=1;
            }
            else if ( (LA88_0==53) ) {
                int LA88_2 = input.LA(2);

                if ( (LA88_2==RULE_IDENT||(LA88_2>=104 && LA88_2<=105)) ) {
                    alt88=1;
                }
                else if ( (LA88_2==54) ) {
                    alt88=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5121:2: ( ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ',' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5121:2: ( ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ',' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5121:3: ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ','
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5121:3: ( (lv_expr_2_0= ruleExpr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5122:1: (lv_expr_2_0= ruleExpr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5122:1: (lv_expr_2_0= ruleExpr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5123:3: lv_expr_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchArmAccess().getExprExprParserRuleCall_2_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleMatchArm10990);
                    lv_expr_2_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatchArmRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_2_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleMatchArm11002); 

                        	newLeafNode(otherlv_3, grammarAccess.getMatchArmAccess().getCommaKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5144:6: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5144:6: ( (lv_block_4_0= ruleBlock ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5145:1: (lv_block_4_0= ruleBlock )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5145:1: (lv_block_4_0= ruleBlock )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5146:3: lv_block_4_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchArmAccess().getBlockBlockParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleMatchArm11030);
                    lv_block_4_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatchArmRule());
                    	        }
                           		set(
                           			current, 
                           			"block",
                            		lv_block_4_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatchArm"


    // $ANTLR start "entryRuleMatchPat"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5170:1: entryRuleMatchPat returns [EObject current=null] : iv_ruleMatchPat= ruleMatchPat EOF ;
    public final EObject entryRuleMatchPat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchPat = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5171:2: (iv_ruleMatchPat= ruleMatchPat EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5172:2: iv_ruleMatchPat= ruleMatchPat EOF
            {
             newCompositeNode(grammarAccess.getMatchPatRule()); 
            pushFollow(FOLLOW_ruleMatchPat_in_entryRuleMatchPat11067);
            iv_ruleMatchPat=ruleMatchPat();

            state._fsp--;

             current =iv_ruleMatchPat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchPat11077); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatchPat"


    // $ANTLR start "ruleMatchPat"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5179:1: ruleMatchPat returns [EObject current=null] : ( ( (lv_pat_0_0= rulePat ) ) (otherlv_1= '..' ( (lv_endPat_2_0= rulePat ) ) )? (otherlv_3= 'if' ( (lv_expr_4_0= ruleExpr ) ) ) ) ;
    public final EObject ruleMatchPat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pat_0_0 = null;

        EObject lv_endPat_2_0 = null;

        EObject lv_expr_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5182:28: ( ( ( (lv_pat_0_0= rulePat ) ) (otherlv_1= '..' ( (lv_endPat_2_0= rulePat ) ) )? (otherlv_3= 'if' ( (lv_expr_4_0= ruleExpr ) ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5183:1: ( ( (lv_pat_0_0= rulePat ) ) (otherlv_1= '..' ( (lv_endPat_2_0= rulePat ) ) )? (otherlv_3= 'if' ( (lv_expr_4_0= ruleExpr ) ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5183:1: ( ( (lv_pat_0_0= rulePat ) ) (otherlv_1= '..' ( (lv_endPat_2_0= rulePat ) ) )? (otherlv_3= 'if' ( (lv_expr_4_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5183:2: ( (lv_pat_0_0= rulePat ) ) (otherlv_1= '..' ( (lv_endPat_2_0= rulePat ) ) )? (otherlv_3= 'if' ( (lv_expr_4_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5183:2: ( (lv_pat_0_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5184:1: (lv_pat_0_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5184:1: (lv_pat_0_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5185:3: lv_pat_0_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getMatchPatAccess().getPatPatParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_ruleMatchPat11123);
            lv_pat_0_0=rulePat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatchPatRule());
            	        }
                   		set(
                   			current, 
                   			"pat",
                    		lv_pat_0_0, 
                    		"Pat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5201:2: (otherlv_1= '..' ( (lv_endPat_2_0= rulePat ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==69) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5201:4: otherlv_1= '..' ( (lv_endPat_2_0= rulePat ) )
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleMatchPat11136); 

                        	newLeafNode(otherlv_1, grammarAccess.getMatchPatAccess().getFullStopFullStopKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5205:1: ( (lv_endPat_2_0= rulePat ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5206:1: (lv_endPat_2_0= rulePat )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5206:1: (lv_endPat_2_0= rulePat )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5207:3: lv_endPat_2_0= rulePat
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchPatAccess().getEndPatPatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePat_in_ruleMatchPat11157);
                    lv_endPat_2_0=rulePat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatchPatRule());
                    	        }
                           		set(
                           			current, 
                           			"endPat",
                            		lv_endPat_2_0, 
                            		"Pat");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5223:4: (otherlv_3= 'if' ( (lv_expr_4_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5223:6: otherlv_3= 'if' ( (lv_expr_4_0= ruleExpr ) )
            {
            otherlv_3=(Token)match(input,96,FOLLOW_96_in_ruleMatchPat11172); 

                	newLeafNode(otherlv_3, grammarAccess.getMatchPatAccess().getIfKeyword_2_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5227:1: ( (lv_expr_4_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5228:1: (lv_expr_4_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5228:1: (lv_expr_4_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5229:3: lv_expr_4_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getMatchPatAccess().getExprExprParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleMatchPat11193);
            lv_expr_4_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatchPatRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_4_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatchPat"


    // $ANTLR start "entryRuleExprReturn"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5253:1: entryRuleExprReturn returns [EObject current=null] : iv_ruleExprReturn= ruleExprReturn EOF ;
    public final EObject entryRuleExprReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprReturn = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5254:2: (iv_ruleExprReturn= ruleExprReturn EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5255:2: iv_ruleExprReturn= ruleExprReturn EOF
            {
             newCompositeNode(grammarAccess.getExprReturnRule()); 
            pushFollow(FOLLOW_ruleExprReturn_in_entryRuleExprReturn11230);
            iv_ruleExprReturn=ruleExprReturn();

            state._fsp--;

             current =iv_ruleExprReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprReturn11240); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprReturn"


    // $ANTLR start "ruleExprReturn"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5262:1: ruleExprReturn returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleExprReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5265:28: ( ( () otherlv_1= 'return' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5266:1: ( () otherlv_1= 'return' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5266:1: ( () otherlv_1= 'return' ( (lv_expr_2_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5266:2: () otherlv_1= 'return' ( (lv_expr_2_0= ruleExpr ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5266:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5267:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExprReturnAccess().getExprReturnAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,100,FOLLOW_100_in_ruleExprReturn11286); 

                	newLeafNode(otherlv_1, grammarAccess.getExprReturnAccess().getReturnKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5276:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5277:1: (lv_expr_2_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5277:1: (lv_expr_2_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5278:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprReturnAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprReturn11307);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprReturnRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprReturn"


    // $ANTLR start "entryRuleBlock"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5302:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5303:2: (iv_ruleBlock= ruleBlock EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5304:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock11343);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock11353); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5311:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5314:28: ( ( () otherlv_1= '{' otherlv_2= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5315:1: ( () otherlv_1= '{' otherlv_2= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5315:1: ( () otherlv_1= '{' otherlv_2= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5315:2: () otherlv_1= '{' otherlv_2= '}'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5315:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5316:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleBlock11399); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleBlock11411); 

                	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleGenericParamDecl"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5337:1: entryRuleGenericParamDecl returns [EObject current=null] : iv_ruleGenericParamDecl= ruleGenericParamDecl EOF ;
    public final EObject entryRuleGenericParamDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericParamDecl = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5338:2: (iv_ruleGenericParamDecl= ruleGenericParamDecl EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5339:2: iv_ruleGenericParamDecl= ruleGenericParamDecl EOF
            {
             newCompositeNode(grammarAccess.getGenericParamDeclRule()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl11447);
            iv_ruleGenericParamDecl=ruleGenericParamDecl();

            state._fsp--;

             current =iv_ruleGenericParamDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericParamDecl11457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericParamDecl"


    // $ANTLR start "ruleGenericParamDecl"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5346:1: ruleGenericParamDecl returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? ) ;
    public final EObject ruleGenericParamDecl() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        Token lv_bounds_2_0=null;
        Token otherlv_3=null;
        Token lv_bounds_4_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5349:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5350:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5350:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5350:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5350:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5351:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5351:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5352:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl11499); 

            			newLeafNode(lv_ident_0_0, grammarAccess.getGenericParamDeclAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenericParamDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_0_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5368:2: (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==68) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5368:4: otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleGenericParamDecl11517); 

                        	newLeafNode(otherlv_1, grammarAccess.getGenericParamDeclAccess().getColonKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5372:1: ( (lv_bounds_2_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5373:1: (lv_bounds_2_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5373:1: (lv_bounds_2_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5374:3: lv_bounds_2_0= RULE_IDENT
                    {
                    lv_bounds_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl11534); 

                    			newLeafNode(lv_bounds_2_0, grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGenericParamDeclRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"bounds",
                            		lv_bounds_2_0, 
                            		"IDENT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5390:2: (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5390:4: otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) )
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_80_in_ruleGenericParamDecl11552); 

                        	newLeafNode(otherlv_3, grammarAccess.getGenericParamDeclAccess().getPlusSignKeyword_1_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5394:1: ( (lv_bounds_4_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5395:1: (lv_bounds_4_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5395:1: (lv_bounds_4_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5396:3: lv_bounds_4_0= RULE_IDENT
                    {
                    lv_bounds_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl11569); 

                    			newLeafNode(lv_bounds_4_0, grammarAccess.getGenericParamDeclAccess().getBoundsIDENTTerminalRuleCall_1_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGenericParamDeclRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"bounds",
                            		lv_bounds_4_0, 
                            		"IDENT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericParamDecl"


    // $ANTLR start "entryRuleArg"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5420:1: entryRuleArg returns [EObject current=null] : iv_ruleArg= ruleArg EOF ;
    public final EObject entryRuleArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5421:2: (iv_ruleArg= ruleArg EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5422:2: iv_ruleArg= ruleArg EOF
            {
             newCompositeNode(grammarAccess.getArgRule()); 
            pushFollow(FOLLOW_ruleArg_in_entryRuleArg11613);
            iv_ruleArg=ruleArg();

            state._fsp--;

             current =iv_ruleArg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg11623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArg"


    // $ANTLR start "ruleArg"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5429:1: ruleArg returns [EObject current=null] : ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pat_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5432:28: ( ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5433:1: ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5433:1: ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5433:2: ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5433:2: ( (lv_pat_0_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5434:1: (lv_pat_0_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5434:1: (lv_pat_0_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5435:3: lv_pat_0_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getArgAccess().getPatPatParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_ruleArg11669);
            lv_pat_0_0=rulePat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArgRule());
            	        }
                   		set(
                   			current, 
                   			"pat",
                    		lv_pat_0_0, 
                    		"Pat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleArg11681); 

                	newLeafNode(otherlv_1, grammarAccess.getArgAccess().getColonKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5455:1: ( (lv_type_2_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5456:1: (lv_type_2_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5456:1: (lv_type_2_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5457:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArg11702);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArgRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArg"


    // $ANTLR start "entryRulePat"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5481:1: entryRulePat returns [EObject current=null] : iv_rulePat= rulePat EOF ;
    public final EObject entryRulePat() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePat = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5482:2: (iv_rulePat= rulePat EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5483:2: iv_rulePat= rulePat EOF
            {
             newCompositeNode(grammarAccess.getPatRule()); 
            pushFollow(FOLLOW_rulePat_in_entryRulePat11738);
            iv_rulePat=rulePat();

            state._fsp--;

             current =iv_rulePat; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePat11748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePat"


    // $ANTLR start "rulePat"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5490:1: rulePat returns [EObject current=null] : (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatEnum_8= rulePatEnum ) ;
    public final EObject rulePat() throws RecognitionException {
        EObject current = null;

        EObject this_PatWildcard_0 = null;

        EObject this_PatIdent_1 = null;

        EObject this_PatBoxed_2 = null;

        EObject this_PatOwned_3 = null;

        EObject this_PatBorrowed_4 = null;

        EObject this_PatTuple_5 = null;

        EObject this_PatVector_6 = null;

        EObject this_PatLiteral_7 = null;

        EObject this_PatEnum_8 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5493:28: ( (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatEnum_8= rulePatEnum ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5494:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatEnum_8= rulePatEnum )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5494:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatEnum_8= rulePatEnum )
            int alt91=9;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt91=1;
                }
                break;
            case RULE_MUT_KEYWORD:
                {
                alt91=2;
                }
                break;
            case 74:
                {
                alt91=3;
                }
                break;
            case 75:
                {
                alt91=4;
                }
                break;
            case 76:
                {
                alt91=5;
                }
                break;
            case 48:
                {
                alt91=6;
                }
                break;
            case 70:
                {
                alt91=7;
                }
                break;
            case RULE_STRING_LIT:
            case RULE_FLOAT_LIT:
            case RULE_INT_LIT:
            case RULE_CHAR_LIT:
                {
                alt91=8;
                }
                break;
            case RULE_IDENT:
                {
                alt91=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5495:5: this_PatWildcard_0= rulePatWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatWildcardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePatWildcard_in_rulePat11795);
                    this_PatWildcard_0=rulePatWildcard();

                    state._fsp--;

                     
                            current = this_PatWildcard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5505:5: this_PatIdent_1= rulePatIdent
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatIdentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePatIdent_in_rulePat11822);
                    this_PatIdent_1=rulePatIdent();

                    state._fsp--;

                     
                            current = this_PatIdent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5515:5: this_PatBoxed_2= rulePatBoxed
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatBoxedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePatBoxed_in_rulePat11849);
                    this_PatBoxed_2=rulePatBoxed();

                    state._fsp--;

                     
                            current = this_PatBoxed_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5525:5: this_PatOwned_3= rulePatOwned
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatOwnedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePatOwned_in_rulePat11876);
                    this_PatOwned_3=rulePatOwned();

                    state._fsp--;

                     
                            current = this_PatOwned_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5535:5: this_PatBorrowed_4= rulePatBorrowed
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatBorrowedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePatBorrowed_in_rulePat11903);
                    this_PatBorrowed_4=rulePatBorrowed();

                    state._fsp--;

                     
                            current = this_PatBorrowed_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5545:5: this_PatTuple_5= rulePatTuple
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatTupleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePatTuple_in_rulePat11930);
                    this_PatTuple_5=rulePatTuple();

                    state._fsp--;

                     
                            current = this_PatTuple_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5555:5: this_PatVector_6= rulePatVector
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatVectorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePatVector_in_rulePat11957);
                    this_PatVector_6=rulePatVector();

                    state._fsp--;

                     
                            current = this_PatVector_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5565:5: this_PatLiteral_7= rulePatLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatLiteralParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulePatLiteral_in_rulePat11984);
                    this_PatLiteral_7=rulePatLiteral();

                    state._fsp--;

                     
                            current = this_PatLiteral_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5575:5: this_PatEnum_8= rulePatEnum
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatEnumParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePatEnum_in_rulePat12011);
                    this_PatEnum_8=rulePatEnum();

                    state._fsp--;

                     
                            current = this_PatEnum_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePat"


    // $ANTLR start "entryRulePatWildcard"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5591:1: entryRulePatWildcard returns [EObject current=null] : iv_rulePatWildcard= rulePatWildcard EOF ;
    public final EObject entryRulePatWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatWildcard = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5592:2: (iv_rulePatWildcard= rulePatWildcard EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5593:2: iv_rulePatWildcard= rulePatWildcard EOF
            {
             newCompositeNode(grammarAccess.getPatWildcardRule()); 
            pushFollow(FOLLOW_rulePatWildcard_in_entryRulePatWildcard12046);
            iv_rulePatWildcard=rulePatWildcard();

            state._fsp--;

             current =iv_rulePatWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatWildcard12056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatWildcard"


    // $ANTLR start "rulePatWildcard"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5600:1: rulePatWildcard returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject rulePatWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5603:28: ( ( () otherlv_1= '_' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5604:1: ( () otherlv_1= '_' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5604:1: ( () otherlv_1= '_' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5604:2: () otherlv_1= '_'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5604:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5605:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPatWildcardAccess().getPatWildcardAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,101,FOLLOW_101_in_rulePatWildcard12102); 

                	newLeafNode(otherlv_1, grammarAccess.getPatWildcardAccess().get_Keyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatWildcard"


    // $ANTLR start "entryRulePatIdent"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5622:1: entryRulePatIdent returns [EObject current=null] : iv_rulePatIdent= rulePatIdent EOF ;
    public final EObject entryRulePatIdent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatIdent = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5623:2: (iv_rulePatIdent= rulePatIdent EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5624:2: iv_rulePatIdent= rulePatIdent EOF
            {
             newCompositeNode(grammarAccess.getPatIdentRule()); 
            pushFollow(FOLLOW_rulePatIdent_in_entryRulePatIdent12138);
            iv_rulePatIdent=rulePatIdent();

            state._fsp--;

             current =iv_rulePatIdent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatIdent12148); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatIdent"


    // $ANTLR start "rulePatIdent"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5631:1: rulePatIdent returns [EObject current=null] : ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) ) ;
    public final EObject rulePatIdent() throws RecognitionException {
        EObject current = null;

        Token lv_mutable_0_0=null;
        Token lv_ident_1_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5634:28: ( ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5635:1: ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5635:1: ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5635:2: ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5635:2: ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5636:1: (lv_mutable_0_0= RULE_MUT_KEYWORD )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5636:1: (lv_mutable_0_0= RULE_MUT_KEYWORD )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5637:3: lv_mutable_0_0= RULE_MUT_KEYWORD
            {
            lv_mutable_0_0=(Token)match(input,RULE_MUT_KEYWORD,FOLLOW_RULE_MUT_KEYWORD_in_rulePatIdent12190); 

            			newLeafNode(lv_mutable_0_0, grammarAccess.getPatIdentAccess().getMutableMUT_KEYWORDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPatIdentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mutable",
                    		true, 
                    		"MUT_KEYWORD");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5653:2: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5654:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5654:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5655:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePatIdent12212); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getPatIdentAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPatIdentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatIdent"


    // $ANTLR start "entryRulePatBoxed"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5679:1: entryRulePatBoxed returns [EObject current=null] : iv_rulePatBoxed= rulePatBoxed EOF ;
    public final EObject entryRulePatBoxed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatBoxed = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5680:2: (iv_rulePatBoxed= rulePatBoxed EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5681:2: iv_rulePatBoxed= rulePatBoxed EOF
            {
             newCompositeNode(grammarAccess.getPatBoxedRule()); 
            pushFollow(FOLLOW_rulePatBoxed_in_entryRulePatBoxed12253);
            iv_rulePatBoxed=rulePatBoxed();

            state._fsp--;

             current =iv_rulePatBoxed; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBoxed12263); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatBoxed"


    // $ANTLR start "rulePatBoxed"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5688:1: rulePatBoxed returns [EObject current=null] : (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatBoxed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5691:28: ( (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5692:1: (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5692:1: (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5692:3: otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_rulePatBoxed12300); 

                	newLeafNode(otherlv_0, grammarAccess.getPatBoxedAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5696:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5697:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5697:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5698:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatBoxedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatBoxed12321);
            lv_pattern_1_0=rulePat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatBoxedRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_1_0, 
                    		"Pat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatBoxed"


    // $ANTLR start "entryRulePatOwned"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5722:1: entryRulePatOwned returns [EObject current=null] : iv_rulePatOwned= rulePatOwned EOF ;
    public final EObject entryRulePatOwned() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatOwned = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5723:2: (iv_rulePatOwned= rulePatOwned EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5724:2: iv_rulePatOwned= rulePatOwned EOF
            {
             newCompositeNode(grammarAccess.getPatOwnedRule()); 
            pushFollow(FOLLOW_rulePatOwned_in_entryRulePatOwned12357);
            iv_rulePatOwned=rulePatOwned();

            state._fsp--;

             current =iv_rulePatOwned; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatOwned12367); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatOwned"


    // $ANTLR start "rulePatOwned"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5731:1: rulePatOwned returns [EObject current=null] : (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatOwned() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5734:28: ( (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5735:1: (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5735:1: (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5735:3: otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_rulePatOwned12404); 

                	newLeafNode(otherlv_0, grammarAccess.getPatOwnedAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5739:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5740:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5740:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5741:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatOwnedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatOwned12425);
            lv_pattern_1_0=rulePat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatOwnedRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_1_0, 
                    		"Pat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatOwned"


    // $ANTLR start "entryRulePatBorrowed"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5765:1: entryRulePatBorrowed returns [EObject current=null] : iv_rulePatBorrowed= rulePatBorrowed EOF ;
    public final EObject entryRulePatBorrowed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatBorrowed = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5766:2: (iv_rulePatBorrowed= rulePatBorrowed EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5767:2: iv_rulePatBorrowed= rulePatBorrowed EOF
            {
             newCompositeNode(grammarAccess.getPatBorrowedRule()); 
            pushFollow(FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed12461);
            iv_rulePatBorrowed=rulePatBorrowed();

            state._fsp--;

             current =iv_rulePatBorrowed; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBorrowed12471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatBorrowed"


    // $ANTLR start "rulePatBorrowed"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5774:1: rulePatBorrowed returns [EObject current=null] : (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatBorrowed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5777:28: ( (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5778:1: (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5778:1: (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5778:3: otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_rulePatBorrowed12508); 

                	newLeafNode(otherlv_0, grammarAccess.getPatBorrowedAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5782:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5783:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5783:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5784:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatBorrowedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatBorrowed12529);
            lv_pattern_1_0=rulePat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatBorrowedRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_1_0, 
                    		"Pat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatBorrowed"


    // $ANTLR start "entryRulePatTuple"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5808:1: entryRulePatTuple returns [EObject current=null] : iv_rulePatTuple= rulePatTuple EOF ;
    public final EObject entryRulePatTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatTuple = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5809:2: (iv_rulePatTuple= rulePatTuple EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5810:2: iv_rulePatTuple= rulePatTuple EOF
            {
             newCompositeNode(grammarAccess.getPatTupleRule()); 
            pushFollow(FOLLOW_rulePatTuple_in_entryRulePatTuple12565);
            iv_rulePatTuple=rulePatTuple();

            state._fsp--;

             current =iv_rulePatTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatTuple12575); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatTuple"


    // $ANTLR start "rulePatTuple"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5817:1: rulePatTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' ) ;
    public final EObject rulePatTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_patterns_1_0 = null;

        EObject lv_patterns_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5820:28: ( (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5821:1: (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5821:1: (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5821:3: otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulePatTuple12612); 

                	newLeafNode(otherlv_0, grammarAccess.getPatTupleAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5825:1: ( (lv_patterns_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5826:1: (lv_patterns_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5826:1: (lv_patterns_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5827:3: lv_patterns_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatTuple12633);
            lv_patterns_1_0=rulePat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatTupleRule());
            	        }
                   		add(
                   			current, 
                   			"patterns",
                    		lv_patterns_1_0, 
                    		"Pat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5843:2: (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==46) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5843:4: otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulePatTuple12646); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPatTupleAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5847:1: ( (lv_patterns_3_0= rulePat ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5848:1: (lv_patterns_3_0= rulePat )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5848:1: (lv_patterns_3_0= rulePat )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5849:3: lv_patterns_3_0= rulePat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePat_in_rulePatTuple12667);
            	    lv_patterns_3_0=rulePat();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPatTupleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"patterns",
            	            		lv_patterns_3_0, 
            	            		"Pat");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_rulePatTuple12681); 

                	newLeafNode(otherlv_4, grammarAccess.getPatTupleAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatTuple"


    // $ANTLR start "entryRulePatVector"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5877:1: entryRulePatVector returns [EObject current=null] : iv_rulePatVector= rulePatVector EOF ;
    public final EObject entryRulePatVector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatVector = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5878:2: (iv_rulePatVector= rulePatVector EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5879:2: iv_rulePatVector= rulePatVector EOF
            {
             newCompositeNode(grammarAccess.getPatVectorRule()); 
            pushFollow(FOLLOW_rulePatVector_in_entryRulePatVector12717);
            iv_rulePatVector=rulePatVector();

            state._fsp--;

             current =iv_rulePatVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatVector12727); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatVector"


    // $ANTLR start "rulePatVector"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5886:1: rulePatVector returns [EObject current=null] : (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' ) ;
    public final EObject rulePatVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_patterns_1_0 = null;

        EObject lv_patterns_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5889:28: ( (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5890:1: (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5890:1: (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5890:3: otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_rulePatVector12764); 

                	newLeafNode(otherlv_0, grammarAccess.getPatVectorAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5894:1: ( (lv_patterns_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5895:1: (lv_patterns_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5895:1: (lv_patterns_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5896:3: lv_patterns_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatVector12785);
            lv_patterns_1_0=rulePat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatVectorRule());
            	        }
                   		add(
                   			current, 
                   			"patterns",
                    		lv_patterns_1_0, 
                    		"Pat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5912:2: (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==46) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5912:4: otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulePatVector12798); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPatVectorAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5916:1: ( (lv_patterns_3_0= rulePat ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5917:1: (lv_patterns_3_0= rulePat )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5917:1: (lv_patterns_3_0= rulePat )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5918:3: lv_patterns_3_0= rulePat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePat_in_rulePatVector12819);
            	    lv_patterns_3_0=rulePat();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPatVectorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"patterns",
            	            		lv_patterns_3_0, 
            	            		"Pat");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_rulePatVector12833); 

                	newLeafNode(otherlv_4, grammarAccess.getPatVectorAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatVector"


    // $ANTLR start "entryRulePatLiteral"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5946:1: entryRulePatLiteral returns [EObject current=null] : iv_rulePatLiteral= rulePatLiteral EOF ;
    public final EObject entryRulePatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5947:2: (iv_rulePatLiteral= rulePatLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5948:2: iv_rulePatLiteral= rulePatLiteral EOF
            {
             newCompositeNode(grammarAccess.getPatLiteralRule()); 
            pushFollow(FOLLOW_rulePatLiteral_in_entryRulePatLiteral12869);
            iv_rulePatLiteral=rulePatLiteral();

            state._fsp--;

             current =iv_rulePatLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatLiteral12879); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatLiteral"


    // $ANTLR start "rulePatLiteral"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5955:1: rulePatLiteral returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject rulePatLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5958:28: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5959:1: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5959:1: ( (lv_literal_0_0= ruleLiteral ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5960:1: (lv_literal_0_0= ruleLiteral )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5960:1: (lv_literal_0_0= ruleLiteral )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5961:3: lv_literal_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getPatLiteralAccess().getLiteralLiteralParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_rulePatLiteral12924);
            lv_literal_0_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"literal",
                    		lv_literal_0_0, 
                    		"Literal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatLiteral"


    // $ANTLR start "entryRulePatEnum"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5985:1: entryRulePatEnum returns [EObject current=null] : iv_rulePatEnum= rulePatEnum EOF ;
    public final EObject entryRulePatEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatEnum = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5986:2: (iv_rulePatEnum= rulePatEnum EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5987:2: iv_rulePatEnum= rulePatEnum EOF
            {
             newCompositeNode(grammarAccess.getPatEnumRule()); 
            pushFollow(FOLLOW_rulePatEnum_in_entryRulePatEnum12959);
            iv_rulePatEnum=rulePatEnum();

            state._fsp--;

             current =iv_rulePatEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatEnum12969); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatEnum"


    // $ANTLR start "rulePatEnum"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5994:1: rulePatEnum returns [EObject current=null] : ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) ) ;
    public final EObject rulePatEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_path_0_0 = null;

        EObject lv_patterns_5_0 = null;

        EObject lv_patterns_7_0 = null;

        EObject lv_fieldPatterns_11_0 = null;

        EObject lv_fieldPatterns_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5997:28: ( ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5998:1: ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5998:1: ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5998:2: ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5998:2: ( (lv_path_0_0= ruleExprPath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5999:1: (lv_path_0_0= ruleExprPath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5999:1: (lv_path_0_0= ruleExprPath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6000:3: lv_path_0_0= ruleExprPath
            {
             
            	        newCompositeNode(grammarAccess.getPatEnumAccess().getPathExprPathParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExprPath_in_rulePatEnum13015);
            lv_path_0_0=ruleExprPath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatEnumRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"ExprPath");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6016:2: ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==48) ) {
                alt97=1;
            }
            else if ( (LA97_0==53) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6016:3: ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6016:3: ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6016:4: () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6016:4: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6017:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPatEnumAccess().getPatTupleEnumPathAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_rulePatEnum13038); 

                        	newLeafNode(otherlv_2, grammarAccess.getPatEnumAccess().getLeftParenthesisKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6026:1: (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) )
                    int alt95=3;
                    switch ( input.LA(1) ) {
                    case 72:
                        {
                        alt95=1;
                        }
                        break;
                    case 69:
                        {
                        alt95=2;
                        }
                        break;
                    case RULE_IDENT:
                    case RULE_STRING_LIT:
                    case RULE_MUT_KEYWORD:
                    case RULE_FLOAT_LIT:
                    case RULE_INT_LIT:
                    case RULE_CHAR_LIT:
                    case 48:
                    case 70:
                    case 74:
                    case 75:
                    case 76:
                    case 101:
                        {
                        alt95=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }

                    switch (alt95) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6026:3: otherlv_3= '*'
                            {
                            otherlv_3=(Token)match(input,72,FOLLOW_72_in_rulePatEnum13051); 

                                	newLeafNode(otherlv_3, grammarAccess.getPatEnumAccess().getAsteriskKeyword_1_0_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6031:7: otherlv_4= '..'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_rulePatEnum13069); 

                                	newLeafNode(otherlv_4, grammarAccess.getPatEnumAccess().getFullStopFullStopKeyword_1_0_2_1());
                                

                            }
                            break;
                        case 3 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6036:6: ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6036:6: ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6036:7: ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )*
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6036:7: ( (lv_patterns_5_0= rulePat ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6037:1: (lv_patterns_5_0= rulePat )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6037:1: (lv_patterns_5_0= rulePat )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6038:3: lv_patterns_5_0= rulePat
                            {
                             
                            	        newCompositeNode(grammarAccess.getPatEnumAccess().getPatternsPatParserRuleCall_1_0_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulePat_in_rulePatEnum13097);
                            lv_patterns_5_0=rulePat();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPatEnumRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"patterns",
                                    		lv_patterns_5_0, 
                                    		"Pat");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6054:2: (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==46) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6054:4: otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) )
                            	    {
                            	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_rulePatEnum13110); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getPatEnumAccess().getCommaKeyword_1_0_2_2_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6058:1: ( (lv_patterns_7_0= rulePat ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6059:1: (lv_patterns_7_0= rulePat )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6059:1: (lv_patterns_7_0= rulePat )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6060:3: lv_patterns_7_0= rulePat
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPatEnumAccess().getPatternsPatParserRuleCall_1_0_2_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePat_in_rulePatEnum13131);
                            	    lv_patterns_7_0=rulePat();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPatEnumRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"patterns",
                            	            		lv_patterns_7_0, 
                            	            		"Pat");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop94;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_rulePatEnum13147); 

                        	newLeafNode(otherlv_8, grammarAccess.getPatEnumAccess().getRightParenthesisKeyword_1_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6081:6: ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6081:6: ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6081:7: () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6081:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6082:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPatEnumAccess().getPatStructEnumPathAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,53,FOLLOW_53_in_rulePatEnum13176); 

                        	newLeafNode(otherlv_10, grammarAccess.getPatEnumAccess().getLeftCurlyBracketKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6091:1: ( (lv_fieldPatterns_11_0= ruleFieldPat ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6092:1: (lv_fieldPatterns_11_0= ruleFieldPat )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6092:1: (lv_fieldPatterns_11_0= ruleFieldPat )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6093:3: lv_fieldPatterns_11_0= ruleFieldPat
                    {
                     
                    	        newCompositeNode(grammarAccess.getPatEnumAccess().getFieldPatternsFieldPatParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldPat_in_rulePatEnum13197);
                    lv_fieldPatterns_11_0=ruleFieldPat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPatEnumRule());
                    	        }
                           		add(
                           			current, 
                           			"fieldPatterns",
                            		lv_fieldPatterns_11_0, 
                            		"FieldPat");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6109:2: (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==46) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6109:4: otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) )
                    	    {
                    	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_rulePatEnum13210); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getPatEnumAccess().getCommaKeyword_1_1_3_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6113:1: ( (lv_fieldPatterns_13_0= ruleFieldPat ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6114:1: (lv_fieldPatterns_13_0= ruleFieldPat )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6114:1: (lv_fieldPatterns_13_0= ruleFieldPat )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6115:3: lv_fieldPatterns_13_0= ruleFieldPat
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPatEnumAccess().getFieldPatternsFieldPatParserRuleCall_1_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFieldPat_in_rulePatEnum13231);
                    	    lv_fieldPatterns_13_0=ruleFieldPat();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPatEnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fieldPatterns",
                    	            		lv_fieldPatterns_13_0, 
                    	            		"FieldPat");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,54,FOLLOW_54_in_rulePatEnum13245); 

                        	newLeafNode(otherlv_14, grammarAccess.getPatEnumAccess().getRightCurlyBracketKeyword_1_1_4());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatEnum"


    // $ANTLR start "entryRuleFieldPat"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6143:1: entryRuleFieldPat returns [EObject current=null] : iv_ruleFieldPat= ruleFieldPat EOF ;
    public final EObject entryRuleFieldPat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPat = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6144:2: (iv_ruleFieldPat= ruleFieldPat EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6145:2: iv_ruleFieldPat= ruleFieldPat EOF
            {
             newCompositeNode(grammarAccess.getFieldPatRule()); 
            pushFollow(FOLLOW_ruleFieldPat_in_entryRuleFieldPat13283);
            iv_ruleFieldPat=ruleFieldPat();

            state._fsp--;

             current =iv_ruleFieldPat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldPat13293); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldPat"


    // $ANTLR start "ruleFieldPat"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6152:1: ruleFieldPat returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? ) ;
    public final EObject ruleFieldPat() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        EObject lv_pattern_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6155:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6156:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6156:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6156:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6156:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6157:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6157:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6158:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFieldPat13335); 

            			newLeafNode(lv_ident_0_0, grammarAccess.getFieldPatAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldPatRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_0_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6174:2: (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==68) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6174:4: otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleFieldPat13353); 

                        	newLeafNode(otherlv_1, grammarAccess.getFieldPatAccess().getColonKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6178:1: ( (lv_pattern_2_0= rulePat ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6179:1: (lv_pattern_2_0= rulePat )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6179:1: (lv_pattern_2_0= rulePat )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6180:3: lv_pattern_2_0= rulePat
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldPatAccess().getPatternPatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePat_in_ruleFieldPat13374);
                    lv_pattern_2_0=rulePat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldPatRule());
                    	        }
                           		set(
                           			current, 
                           			"pattern",
                            		lv_pattern_2_0, 
                            		"Pat");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldPat"


    // $ANTLR start "entryRuleTypePath"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6204:1: entryRuleTypePath returns [EObject current=null] : iv_ruleTypePath= ruleTypePath EOF ;
    public final EObject entryRuleTypePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypePath = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6205:2: (iv_ruleTypePath= ruleTypePath EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6206:2: iv_ruleTypePath= ruleTypePath EOF
            {
             newCompositeNode(grammarAccess.getTypePathRule()); 
            pushFollow(FOLLOW_ruleTypePath_in_entryRuleTypePath13412);
            iv_ruleTypePath=ruleTypePath();

            state._fsp--;

             current =iv_ruleTypePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypePath13422); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypePath"


    // $ANTLR start "ruleTypePath"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6213:1: ruleTypePath returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>' ) ;
    public final EObject ruleTypePath() throws RecognitionException {
        EObject current = null;

        Token lv_segments_0_0=null;
        Token otherlv_1=null;
        Token lv_segments_2_0=null;
        Token otherlv_3=null;
        Token lv_lifetimes_4_0=null;
        Token otherlv_6=null;
        Token lv_lifetimes_7_0=null;
        Token otherlv_9=null;
        EObject lv_genericTypes_5_0 = null;

        EObject lv_genericTypes_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6216:28: ( ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6217:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6217:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6217:2: ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6217:2: ( (lv_segments_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6218:1: (lv_segments_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6218:1: (lv_segments_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6219:3: lv_segments_0_0= RULE_IDENT
            {
            lv_segments_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTypePath13464); 

            			newLeafNode(lv_segments_0_0, grammarAccess.getTypePathAccess().getSegmentsIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypePathRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"segments",
                    		lv_segments_0_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6235:2: (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==102) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6235:4: otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) )
            	    {
            	    otherlv_1=(Token)match(input,102,FOLLOW_102_in_ruleTypePath13482); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTypePathAccess().getColonColonKeyword_1_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6239:1: ( (lv_segments_2_0= RULE_IDENT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6240:1: (lv_segments_2_0= RULE_IDENT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6240:1: (lv_segments_2_0= RULE_IDENT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6241:3: lv_segments_2_0= RULE_IDENT
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTypePath13499); 

            	    			newLeafNode(lv_segments_2_0, grammarAccess.getTypePathAccess().getSegmentsIDENTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTypePathRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"segments",
            	            		lv_segments_2_0, 
            	            		"IDENT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleTypePath13518); 

                	newLeafNode(otherlv_3, grammarAccess.getTypePathAccess().getLessThanSignKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6261:1: ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_LIFETIME) ) {
                alt100=1;
            }
            else if ( (LA100_0==RULE_IDENT||(LA100_0>=RULE_INT_TYPE && LA100_0<=RULE_UNIT_TYPE)||(LA100_0>=74 && LA100_0<=76)) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6261:2: ( (lv_lifetimes_4_0= RULE_LIFETIME ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6261:2: ( (lv_lifetimes_4_0= RULE_LIFETIME ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6262:1: (lv_lifetimes_4_0= RULE_LIFETIME )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6262:1: (lv_lifetimes_4_0= RULE_LIFETIME )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6263:3: lv_lifetimes_4_0= RULE_LIFETIME
                    {
                    lv_lifetimes_4_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleTypePath13536); 

                    			newLeafNode(lv_lifetimes_4_0, grammarAccess.getTypePathAccess().getLifetimesLIFETIMETerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypePathRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"lifetimes",
                            		lv_lifetimes_4_0, 
                            		"LIFETIME");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6280:6: ( (lv_genericTypes_5_0= ruleType ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6280:6: ( (lv_genericTypes_5_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6281:1: (lv_genericTypes_5_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6281:1: (lv_genericTypes_5_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6282:3: lv_genericTypes_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypePathAccess().getGenericTypesTypeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTypePath13568);
                    lv_genericTypes_5_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypePathRule());
                    	        }
                           		add(
                           			current, 
                           			"genericTypes",
                            		lv_genericTypes_5_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6298:3: (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+
            int cnt102=0;
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==46) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6298:5: otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) )
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleTypePath13582); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTypePathAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6302:1: ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) )
            	    int alt101=2;
            	    int LA101_0 = input.LA(1);

            	    if ( (LA101_0==RULE_LIFETIME) ) {
            	        alt101=1;
            	    }
            	    else if ( (LA101_0==RULE_IDENT||(LA101_0>=RULE_INT_TYPE && LA101_0<=RULE_UNIT_TYPE)||(LA101_0>=74 && LA101_0<=76)) ) {
            	        alt101=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 101, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt101) {
            	        case 1 :
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6302:2: ( (lv_lifetimes_7_0= RULE_LIFETIME ) )
            	            {
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6302:2: ( (lv_lifetimes_7_0= RULE_LIFETIME ) )
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6303:1: (lv_lifetimes_7_0= RULE_LIFETIME )
            	            {
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6303:1: (lv_lifetimes_7_0= RULE_LIFETIME )
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6304:3: lv_lifetimes_7_0= RULE_LIFETIME
            	            {
            	            lv_lifetimes_7_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleTypePath13600); 

            	            			newLeafNode(lv_lifetimes_7_0, grammarAccess.getTypePathAccess().getLifetimesLIFETIMETerminalRuleCall_4_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTypePathRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"lifetimes",
            	                    		lv_lifetimes_7_0, 
            	                    		"LIFETIME");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6321:6: ( (lv_genericTypes_8_0= ruleType ) )
            	            {
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6321:6: ( (lv_genericTypes_8_0= ruleType ) )
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6322:1: (lv_genericTypes_8_0= ruleType )
            	            {
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6322:1: (lv_genericTypes_8_0= ruleType )
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6323:3: lv_genericTypes_8_0= ruleType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTypePathAccess().getGenericTypesTypeParserRuleCall_4_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleType_in_ruleTypePath13632);
            	            lv_genericTypes_8_0=ruleType();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTypePathRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"genericTypes",
            	                    		lv_genericTypes_8_0, 
            	                    		"Type");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt102 >= 1 ) break loop102;
                        EarlyExitException eee =
                            new EarlyExitException(102, input);
                        throw eee;
                }
                cnt102++;
            } while (true);

            otherlv_9=(Token)match(input,57,FOLLOW_57_in_ruleTypePath13647); 

                	newLeafNode(otherlv_9, grammarAccess.getTypePathAccess().getGreaterThanSignKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypePath"


    // $ANTLR start "entryRuleExprPath"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6351:1: entryRuleExprPath returns [EObject current=null] : iv_ruleExprPath= ruleExprPath EOF ;
    public final EObject entryRuleExprPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprPath = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6352:2: (iv_ruleExprPath= ruleExprPath EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6353:2: iv_ruleExprPath= ruleExprPath EOF
            {
             newCompositeNode(grammarAccess.getExprPathRule()); 
            pushFollow(FOLLOW_ruleExprPath_in_entryRuleExprPath13683);
            iv_ruleExprPath=ruleExprPath();

            state._fsp--;

             current =iv_ruleExprPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprPath13693); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprPath"


    // $ANTLR start "ruleExprPath"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6360:1: ruleExprPath returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )? ) ;
    public final EObject ruleExprPath() throws RecognitionException {
        EObject current = null;

        Token lv_segments_0_0=null;
        Token otherlv_1=null;
        Token lv_segments_2_0=null;
        Token otherlv_3=null;
        Token lv_lifetimes_4_0=null;
        Token otherlv_6=null;
        Token lv_lifetimes_7_0=null;
        Token otherlv_9=null;
        EObject lv_genericTypes_5_0 = null;

        EObject lv_genericTypes_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6363:28: ( ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6364:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6364:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6364:2: ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6364:2: ( (lv_segments_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6365:1: (lv_segments_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6365:1: (lv_segments_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6366:3: lv_segments_0_0= RULE_IDENT
            {
            lv_segments_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprPath13735); 

            			newLeafNode(lv_segments_0_0, grammarAccess.getExprPathAccess().getSegmentsIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExprPathRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"segments",
                    		lv_segments_0_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6382:2: (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==102) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6382:4: otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) )
            	    {
            	    otherlv_1=(Token)match(input,102,FOLLOW_102_in_ruleExprPath13753); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExprPathAccess().getColonColonKeyword_1_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6386:1: ( (lv_segments_2_0= RULE_IDENT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6387:1: (lv_segments_2_0= RULE_IDENT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6387:1: (lv_segments_2_0= RULE_IDENT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6388:3: lv_segments_2_0= RULE_IDENT
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprPath13770); 

            	    			newLeafNode(lv_segments_2_0, grammarAccess.getExprPathAccess().getSegmentsIDENTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprPathRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"segments",
            	            		lv_segments_2_0, 
            	            		"IDENT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6404:4: (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==103) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6404:6: otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>'
                    {
                    otherlv_3=(Token)match(input,103,FOLLOW_103_in_ruleExprPath13790); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprPathAccess().getColonColonLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6408:1: ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==RULE_LIFETIME) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==RULE_IDENT||(LA104_0>=RULE_INT_TYPE && LA104_0<=RULE_UNIT_TYPE)||(LA104_0>=74 && LA104_0<=76)) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6408:2: ( (lv_lifetimes_4_0= RULE_LIFETIME ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6408:2: ( (lv_lifetimes_4_0= RULE_LIFETIME ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6409:1: (lv_lifetimes_4_0= RULE_LIFETIME )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6409:1: (lv_lifetimes_4_0= RULE_LIFETIME )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6410:3: lv_lifetimes_4_0= RULE_LIFETIME
                            {
                            lv_lifetimes_4_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprPath13808); 

                            			newLeafNode(lv_lifetimes_4_0, grammarAccess.getExprPathAccess().getLifetimesLIFETIMETerminalRuleCall_2_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExprPathRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"lifetimes",
                                    		lv_lifetimes_4_0, 
                                    		"LIFETIME");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6427:6: ( (lv_genericTypes_5_0= ruleType ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6427:6: ( (lv_genericTypes_5_0= ruleType ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6428:1: (lv_genericTypes_5_0= ruleType )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6428:1: (lv_genericTypes_5_0= ruleType )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6429:3: lv_genericTypes_5_0= ruleType
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprPathAccess().getGenericTypesTypeParserRuleCall_2_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleType_in_ruleExprPath13840);
                            lv_genericTypes_5_0=ruleType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getExprPathRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"genericTypes",
                                    		lv_genericTypes_5_0, 
                                    		"Type");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6445:3: (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==46) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6445:5: otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) )
                    	    {
                    	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleExprPath13854); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getExprPathAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6449:1: ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) )
                    	    int alt105=2;
                    	    int LA105_0 = input.LA(1);

                    	    if ( (LA105_0==RULE_LIFETIME) ) {
                    	        alt105=1;
                    	    }
                    	    else if ( (LA105_0==RULE_IDENT||(LA105_0>=RULE_INT_TYPE && LA105_0<=RULE_UNIT_TYPE)||(LA105_0>=74 && LA105_0<=76)) ) {
                    	        alt105=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 105, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt105) {
                    	        case 1 :
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6449:2: ( (lv_lifetimes_7_0= RULE_LIFETIME ) )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6449:2: ( (lv_lifetimes_7_0= RULE_LIFETIME ) )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6450:1: (lv_lifetimes_7_0= RULE_LIFETIME )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6450:1: (lv_lifetimes_7_0= RULE_LIFETIME )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6451:3: lv_lifetimes_7_0= RULE_LIFETIME
                    	            {
                    	            lv_lifetimes_7_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprPath13872); 

                    	            			newLeafNode(lv_lifetimes_7_0, grammarAccess.getExprPathAccess().getLifetimesLIFETIMETerminalRuleCall_2_2_1_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getExprPathRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"lifetimes",
                    	                    		lv_lifetimes_7_0, 
                    	                    		"LIFETIME");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6468:6: ( (lv_genericTypes_8_0= ruleType ) )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6468:6: ( (lv_genericTypes_8_0= ruleType ) )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6469:1: (lv_genericTypes_8_0= ruleType )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6469:1: (lv_genericTypes_8_0= ruleType )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6470:3: lv_genericTypes_8_0= ruleType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getExprPathAccess().getGenericTypesTypeParserRuleCall_2_2_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleType_in_ruleExprPath13904);
                    	            lv_genericTypes_8_0=ruleType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getExprPathRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"genericTypes",
                    	                    		lv_genericTypes_8_0, 
                    	                    		"Type");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,57,FOLLOW_57_in_ruleExprPath13919); 

                        	newLeafNode(otherlv_9, grammarAccess.getExprPathAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprPath"


    // $ANTLR start "entryRuleType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6498:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6499:2: (iv_ruleType= ruleType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6500:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType13957);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType13967); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6507:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_NamedType_1= ruleNamedType | this_BoxedPointer_2= ruleBoxedPointer | this_OwnedPointer_3= ruleOwnedPointer | this_BorrowedPointer_4= ruleBorrowedPointer ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_NamedType_1 = null;

        EObject this_BoxedPointer_2 = null;

        EObject this_OwnedPointer_3 = null;

        EObject this_BorrowedPointer_4 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6510:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_NamedType_1= ruleNamedType | this_BoxedPointer_2= ruleBoxedPointer | this_OwnedPointer_3= ruleOwnedPointer | this_BorrowedPointer_4= ruleBorrowedPointer ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6511:1: (this_PrimitiveType_0= rulePrimitiveType | this_NamedType_1= ruleNamedType | this_BoxedPointer_2= ruleBoxedPointer | this_OwnedPointer_3= ruleOwnedPointer | this_BorrowedPointer_4= ruleBorrowedPointer )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6511:1: (this_PrimitiveType_0= rulePrimitiveType | this_NamedType_1= ruleNamedType | this_BoxedPointer_2= ruleBoxedPointer | this_OwnedPointer_3= ruleOwnedPointer | this_BorrowedPointer_4= ruleBorrowedPointer )
            int alt108=5;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
            case RULE_FLOAT_TYPE:
            case RULE_BOOLEAN_TYPE:
            case RULE_MACHINE_TYPE:
            case RULE_UNIT_TYPE:
                {
                alt108=1;
                }
                break;
            case RULE_IDENT:
                {
                alt108=2;
                }
                break;
            case 74:
                {
                alt108=3;
                }
                break;
            case 75:
                {
                alt108=4;
                }
                break;
            case 76:
                {
                alt108=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6512:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType14014);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;

                     
                            current = this_PrimitiveType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6522:5: this_NamedType_1= ruleNamedType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamedType_in_ruleType14041);
                    this_NamedType_1=ruleNamedType();

                    state._fsp--;

                     
                            current = this_NamedType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6532:5: this_BoxedPointer_2= ruleBoxedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBoxedPointerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBoxedPointer_in_ruleType14068);
                    this_BoxedPointer_2=ruleBoxedPointer();

                    state._fsp--;

                     
                            current = this_BoxedPointer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6542:5: this_OwnedPointer_3= ruleOwnedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getOwnedPointerParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOwnedPointer_in_ruleType14095);
                    this_OwnedPointer_3=ruleOwnedPointer();

                    state._fsp--;

                     
                            current = this_OwnedPointer_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6552:5: this_BorrowedPointer_4= ruleBorrowedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBorrowedPointerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBorrowedPointer_in_ruleType14122);
                    this_BorrowedPointer_4=ruleBorrowedPointer();

                    state._fsp--;

                     
                            current = this_BorrowedPointer_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6568:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6569:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6570:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType14157);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType14167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6577:1: rulePrimitiveType returns [EObject current=null] : ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token this_INT_TYPE_1=null;
        Token this_FLOAT_TYPE_3=null;
        Token this_BOOLEAN_TYPE_5=null;
        Token this_MACHINE_TYPE_7=null;
        Token this_UNIT_TYPE_9=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6580:28: ( ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6581:1: ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6581:1: ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) )
            int alt109=5;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
                {
                alt109=1;
                }
                break;
            case RULE_FLOAT_TYPE:
                {
                alt109=2;
                }
                break;
            case RULE_BOOLEAN_TYPE:
                {
                alt109=3;
                }
                break;
            case RULE_MACHINE_TYPE:
                {
                alt109=4;
                }
                break;
            case RULE_UNIT_TYPE:
                {
                alt109=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6581:2: ( () this_INT_TYPE_1= RULE_INT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6581:2: ( () this_INT_TYPE_1= RULE_INT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6581:3: () this_INT_TYPE_1= RULE_INT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6581:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6582:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getIntTypeAction_0_0(),
                                current);
                        

                    }

                    this_INT_TYPE_1=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rulePrimitiveType14213); 
                     
                        newLeafNode(this_INT_TYPE_1, grammarAccess.getPrimitiveTypeAccess().getINT_TYPETerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6592:6: ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6592:6: ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6592:7: () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6592:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6593:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getFloatTypeAction_1_0(),
                                current);
                        

                    }

                    this_FLOAT_TYPE_3=(Token)match(input,RULE_FLOAT_TYPE,FOLLOW_RULE_FLOAT_TYPE_in_rulePrimitiveType14240); 
                     
                        newLeafNode(this_FLOAT_TYPE_3, grammarAccess.getPrimitiveTypeAccess().getFLOAT_TYPETerminalRuleCall_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6603:6: ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6603:6: ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6603:7: () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6603:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6604:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getBoolTypeAction_2_0(),
                                current);
                        

                    }

                    this_BOOLEAN_TYPE_5=(Token)match(input,RULE_BOOLEAN_TYPE,FOLLOW_RULE_BOOLEAN_TYPE_in_rulePrimitiveType14267); 
                     
                        newLeafNode(this_BOOLEAN_TYPE_5, grammarAccess.getPrimitiveTypeAccess().getBOOLEAN_TYPETerminalRuleCall_2_1()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6614:6: ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6614:6: ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6614:7: () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6614:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6615:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getMachineTypeAction_3_0(),
                                current);
                        

                    }

                    this_MACHINE_TYPE_7=(Token)match(input,RULE_MACHINE_TYPE,FOLLOW_RULE_MACHINE_TYPE_in_rulePrimitiveType14294); 
                     
                        newLeafNode(this_MACHINE_TYPE_7, grammarAccess.getPrimitiveTypeAccess().getMACHINE_TYPETerminalRuleCall_3_1()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6625:6: ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6625:6: ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6625:7: () this_UNIT_TYPE_9= RULE_UNIT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6625:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6626:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getUnitTypeAction_4_0(),
                                current);
                        

                    }

                    this_UNIT_TYPE_9=(Token)match(input,RULE_UNIT_TYPE,FOLLOW_RULE_UNIT_TYPE_in_rulePrimitiveType14321); 
                     
                        newLeafNode(this_UNIT_TYPE_9, grammarAccess.getPrimitiveTypeAccess().getUNIT_TYPETerminalRuleCall_4_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleNamedType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6643:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6644:2: (iv_ruleNamedType= ruleNamedType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6645:2: iv_ruleNamedType= ruleNamedType EOF
            {
             newCompositeNode(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_ruleNamedType_in_entryRuleNamedType14357);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;

             current =iv_ruleNamedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedType14367); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6652:1: ruleNamedType returns [EObject current=null] : ( (lv_path_0_0= ruleTypePath ) ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6655:28: ( ( (lv_path_0_0= ruleTypePath ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6656:1: ( (lv_path_0_0= ruleTypePath ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6656:1: ( (lv_path_0_0= ruleTypePath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6657:1: (lv_path_0_0= ruleTypePath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6657:1: (lv_path_0_0= ruleTypePath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6658:3: lv_path_0_0= ruleTypePath
            {
             
            	        newCompositeNode(grammarAccess.getNamedTypeAccess().getPathTypePathParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTypePath_in_ruleNamedType14412);
            lv_path_0_0=ruleTypePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamedTypeRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"TypePath");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleBoxedPointer"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6682:1: entryRuleBoxedPointer returns [EObject current=null] : iv_ruleBoxedPointer= ruleBoxedPointer EOF ;
    public final EObject entryRuleBoxedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6683:2: (iv_ruleBoxedPointer= ruleBoxedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6684:2: iv_ruleBoxedPointer= ruleBoxedPointer EOF
            {
             newCompositeNode(grammarAccess.getBoxedPointerRule()); 
            pushFollow(FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer14447);
            iv_ruleBoxedPointer=ruleBoxedPointer();

            state._fsp--;

             current =iv_ruleBoxedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxedPointer14457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoxedPointer"


    // $ANTLR start "ruleBoxedPointer"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6691:1: ruleBoxedPointer returns [EObject current=null] : (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleBoxedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6694:28: ( (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6695:1: (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6695:1: (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6695:3: otherlv_0= '@' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleBoxedPointer14494); 

                	newLeafNode(otherlv_0, grammarAccess.getBoxedPointerAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6699:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6700:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6700:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6701:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBoxedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleBoxedPointer14515);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBoxedPointerRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoxedPointer"


    // $ANTLR start "entryRuleOwnedPointer"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6725:1: entryRuleOwnedPointer returns [EObject current=null] : iv_ruleOwnedPointer= ruleOwnedPointer EOF ;
    public final EObject entryRuleOwnedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6726:2: (iv_ruleOwnedPointer= ruleOwnedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6727:2: iv_ruleOwnedPointer= ruleOwnedPointer EOF
            {
             newCompositeNode(grammarAccess.getOwnedPointerRule()); 
            pushFollow(FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer14551);
            iv_ruleOwnedPointer=ruleOwnedPointer();

            state._fsp--;

             current =iv_ruleOwnedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedPointer14561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnedPointer"


    // $ANTLR start "ruleOwnedPointer"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6734:1: ruleOwnedPointer returns [EObject current=null] : (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleOwnedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6737:28: ( (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6738:1: (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6738:1: (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6738:3: otherlv_0= '~' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleOwnedPointer14598); 

                	newLeafNode(otherlv_0, grammarAccess.getOwnedPointerAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6742:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6743:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6743:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6744:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getOwnedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleOwnedPointer14619);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOwnedPointerRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOwnedPointer"


    // $ANTLR start "entryRuleBorrowedPointer"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6768:1: entryRuleBorrowedPointer returns [EObject current=null] : iv_ruleBorrowedPointer= ruleBorrowedPointer EOF ;
    public final EObject entryRuleBorrowedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorrowedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6769:2: (iv_ruleBorrowedPointer= ruleBorrowedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6770:2: iv_ruleBorrowedPointer= ruleBorrowedPointer EOF
            {
             newCompositeNode(grammarAccess.getBorrowedPointerRule()); 
            pushFollow(FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer14655);
            iv_ruleBorrowedPointer=ruleBorrowedPointer();

            state._fsp--;

             current =iv_ruleBorrowedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrowedPointer14665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBorrowedPointer"


    // $ANTLR start "ruleBorrowedPointer"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6777:1: ruleBorrowedPointer returns [EObject current=null] : (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleBorrowedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6780:28: ( (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6781:1: (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6781:1: (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6781:3: otherlv_0= '&' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleBorrowedPointer14702); 

                	newLeafNode(otherlv_0, grammarAccess.getBorrowedPointerAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6785:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6786:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6786:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBorrowedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleBorrowedPointer14723);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBorrowedPointerRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBorrowedPointer"


    // $ANTLR start "entryRuleStructField"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6811:1: entryRuleStructField returns [EObject current=null] : iv_ruleStructField= ruleStructField EOF ;
    public final EObject entryRuleStructField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructField = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6812:2: (iv_ruleStructField= ruleStructField EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6813:2: iv_ruleStructField= ruleStructField EOF
            {
             newCompositeNode(grammarAccess.getStructFieldRule()); 
            pushFollow(FOLLOW_ruleStructField_in_entryRuleStructField14759);
            iv_ruleStructField=ruleStructField();

            state._fsp--;

             current =iv_ruleStructField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructField14769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructField"


    // $ANTLR start "ruleStructField"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6820:1: ruleStructField returns [EObject current=null] : ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleStructField() throws RecognitionException {
        EObject current = null;

        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_vis_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6823:28: ( ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6824:1: ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6824:1: ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6824:2: ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6824:2: ( (lv_vis_0_0= ruleVisibility ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( ((LA110_0>=104 && LA110_0<=105)) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6825:1: (lv_vis_0_0= ruleVisibility )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6825:1: (lv_vis_0_0= ruleVisibility )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6826:3: lv_vis_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructFieldAccess().getVisVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibility_in_ruleStructField14815);
                    lv_vis_0_0=ruleVisibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"vis",
                            		lv_vis_0_0, 
                            		"Visibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6842:3: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6843:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6843:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6844:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructField14833); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getStructFieldAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleStructField14850); 

                	newLeafNode(otherlv_2, grammarAccess.getStructFieldAccess().getColonKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6864:1: ( (lv_type_3_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6865:1: (lv_type_3_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6865:1: (lv_type_3_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6866:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getStructFieldAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleStructField14871);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStructFieldRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructField"


    // $ANTLR start "entryRuleStructVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6892:1: entryRuleStructVariant returns [EObject current=null] : iv_ruleStructVariant= ruleStructVariant EOF ;
    public final EObject entryRuleStructVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6893:2: (iv_ruleStructVariant= ruleStructVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6894:2: iv_ruleStructVariant= ruleStructVariant EOF
            {
             newCompositeNode(grammarAccess.getStructVariantRule()); 
            pushFollow(FOLLOW_ruleStructVariant_in_entryRuleStructVariant14909);
            iv_ruleStructVariant=ruleStructVariant();

            state._fsp--;

             current =iv_ruleStructVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructVariant14919); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructVariant"


    // $ANTLR start "ruleStructVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6901:1: ruleStructVariant returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleStructVariant() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_fields_7_0 = null;

        EObject lv_fields_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6904:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6905:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6905:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6905:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6905:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6906:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6906:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6907:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructVariant14961); 

            			newLeafNode(lv_ident_0_0, grammarAccess.getStructVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructVariantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_0_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6923:2: (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==56) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6923:4: otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleStructVariant14979); 

                        	newLeafNode(otherlv_1, grammarAccess.getStructVariantAccess().getLessThanSignKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6927:1: ( (lv_params_2_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6928:1: (lv_params_2_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6928:1: (lv_params_2_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6929:3: lv_params_2_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructVariant15000);
                    lv_params_2_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructVariantRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_2_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6945:2: (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==46) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6945:4: otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleStructVariant15013); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getStructVariantAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6949:1: ( (lv_params_4_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6950:1: (lv_params_4_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6950:1: (lv_params_4_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6951:3: lv_params_4_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructVariant15034);
                    	    lv_params_4_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructVariantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_4_0, 
                    	            		"GenericParamDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleStructVariant15048); 

                        	newLeafNode(otherlv_5, grammarAccess.getStructVariantAccess().getGreaterThanSignKeyword_1_3());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleStructVariant15062); 

                	newLeafNode(otherlv_6, grammarAccess.getStructVariantAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6975:1: ( (lv_fields_7_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6976:1: (lv_fields_7_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6976:1: (lv_fields_7_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6977:3: lv_fields_7_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleStructVariant15083);
            lv_fields_7_0=ruleStructField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStructVariantRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_7_0, 
                    		"StructField");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6993:2: (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==46) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6993:4: otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) )
            	    {
            	    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleStructVariant15096); 

            	        	newLeafNode(otherlv_8, grammarAccess.getStructVariantAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6997:1: ( (lv_fields_9_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6998:1: (lv_fields_9_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6998:1: (lv_fields_9_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6999:3: lv_fields_9_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleStructVariant15117);
            	    lv_fields_9_0=ruleStructField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructVariantRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_9_0, 
            	            		"StructField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);

            otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleStructVariant15131); 

                	newLeafNode(otherlv_10, grammarAccess.getStructVariantAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructVariant"


    // $ANTLR start "entryRuleTupleVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7027:1: entryRuleTupleVariant returns [EObject current=null] : iv_ruleTupleVariant= ruleTupleVariant EOF ;
    public final EObject entryRuleTupleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7028:2: (iv_ruleTupleVariant= ruleTupleVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7029:2: iv_ruleTupleVariant= ruleTupleVariant EOF
            {
             newCompositeNode(grammarAccess.getTupleVariantRule()); 
            pushFollow(FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant15167);
            iv_ruleTupleVariant=ruleTupleVariant();

            state._fsp--;

             current =iv_ruleTupleVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleVariant15177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleVariant"


    // $ANTLR start "ruleTupleVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7036:1: ruleTupleVariant returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleTupleVariant() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_2_0 = null;

        EObject lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7039:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7040:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7040:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7040:2: ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7040:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7041:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7041:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7042:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTupleVariant15219); 

            			newLeafNode(lv_ident_0_0, grammarAccess.getTupleVariantAccess().getIdentIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTupleVariantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_0_0, 
                    		"IDENT");
            	    

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleTupleVariant15236); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleVariantAccess().getLeftParenthesisKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7062:1: ( (lv_types_2_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7063:1: (lv_types_2_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7063:1: (lv_types_2_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7064:3: lv_types_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTupleVariant15257);
            lv_types_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTupleVariantRule());
            	        }
                   		add(
                   			current, 
                   			"types",
                    		lv_types_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7080:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==46) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7080:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleTupleVariant15270); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTupleVariantAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7084:1: ( (lv_types_4_0= ruleType ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7085:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7085:1: (lv_types_4_0= ruleType )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7086:3: lv_types_4_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleTupleVariant15291);
            	    lv_types_4_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTupleVariantRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_4_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleTupleVariant15305); 

                	newLeafNode(otherlv_5, grammarAccess.getTupleVariantAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleVariant"


    // $ANTLR start "entryRuleUnitVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7114:1: entryRuleUnitVariant returns [EObject current=null] : iv_ruleUnitVariant= ruleUnitVariant EOF ;
    public final EObject entryRuleUnitVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7115:2: (iv_ruleUnitVariant= ruleUnitVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7116:2: iv_ruleUnitVariant= ruleUnitVariant EOF
            {
             newCompositeNode(grammarAccess.getUnitVariantRule()); 
            pushFollow(FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant15341);
            iv_ruleUnitVariant=ruleUnitVariant();

            state._fsp--;

             current =iv_ruleUnitVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitVariant15351); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitVariant"


    // $ANTLR start "ruleUnitVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7123:1: ruleUnitVariant returns [EObject current=null] : ( (lv_ident_0_0= RULE_IDENT ) ) ;
    public final EObject ruleUnitVariant() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7126:28: ( ( (lv_ident_0_0= RULE_IDENT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7127:1: ( (lv_ident_0_0= RULE_IDENT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7127:1: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7128:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7128:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7129:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleUnitVariant15392); 

            			newLeafNode(lv_ident_0_0, grammarAccess.getUnitVariantAccess().getIdentIDENTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnitVariantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_0_0, 
                    		"IDENT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitVariant"


    // $ANTLR start "entryRuleStringLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7153:1: entryRuleStringLit returns [EObject current=null] : iv_ruleStringLit= ruleStringLit EOF ;
    public final EObject entryRuleStringLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7154:2: (iv_ruleStringLit= ruleStringLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7155:2: iv_ruleStringLit= ruleStringLit EOF
            {
             newCompositeNode(grammarAccess.getStringLitRule()); 
            pushFollow(FOLLOW_ruleStringLit_in_entryRuleStringLit15432);
            iv_ruleStringLit=ruleStringLit();

            state._fsp--;

             current =iv_ruleStringLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLit15442); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLit"


    // $ANTLR start "ruleStringLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7162:1: ruleStringLit returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_LIT ) ) ;
    public final EObject ruleStringLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7165:28: ( ( (lv_value_0_0= RULE_STRING_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7166:1: ( (lv_value_0_0= RULE_STRING_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7166:1: ( (lv_value_0_0= RULE_STRING_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7167:1: (lv_value_0_0= RULE_STRING_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7167:1: (lv_value_0_0= RULE_STRING_LIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7168:3: lv_value_0_0= RULE_STRING_LIT
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_RULE_STRING_LIT_in_ruleStringLit15483); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLitAccess().getValueSTRING_LITTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING_LIT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLit"


    // $ANTLR start "entryRuleLiteral"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7192:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7193:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7194:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral15523);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral15533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7201:1: ruleLiteral returns [EObject current=null] : (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLit_0 = null;

        EObject this_CharLit_1 = null;

        EObject this_StringLit_2 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7204:28: ( (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7205:1: (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7205:1: (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit )
            int alt115=3;
            switch ( input.LA(1) ) {
            case RULE_FLOAT_LIT:
            case RULE_INT_LIT:
                {
                alt115=1;
                }
                break;
            case RULE_CHAR_LIT:
                {
                alt115=2;
                }
                break;
            case RULE_STRING_LIT:
                {
                alt115=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7206:5: this_NumberLit_0= ruleNumberLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberLit_in_ruleLiteral15580);
                    this_NumberLit_0=ruleNumberLit();

                    state._fsp--;

                     
                            current = this_NumberLit_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7216:5: this_CharLit_1= ruleCharLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCharLit_in_ruleLiteral15607);
                    this_CharLit_1=ruleCharLit();

                    state._fsp--;

                     
                            current = this_CharLit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7226:5: this_StringLit_2= ruleStringLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLitParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringLit_in_ruleLiteral15634);
                    this_StringLit_2=ruleStringLit();

                    state._fsp--;

                     
                            current = this_StringLit_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNumberLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7242:1: entryRuleNumberLit returns [EObject current=null] : iv_ruleNumberLit= ruleNumberLit EOF ;
    public final EObject entryRuleNumberLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7243:2: (iv_ruleNumberLit= ruleNumberLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7244:2: iv_ruleNumberLit= ruleNumberLit EOF
            {
             newCompositeNode(grammarAccess.getNumberLitRule()); 
            pushFollow(FOLLOW_ruleNumberLit_in_entryRuleNumberLit15669);
            iv_ruleNumberLit=ruleNumberLit();

            state._fsp--;

             current =iv_ruleNumberLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLit15679); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLit"


    // $ANTLR start "ruleNumberLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7251:1: ruleNumberLit returns [EObject current=null] : ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) ) ;
    public final EObject ruleNumberLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7254:28: ( ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7255:1: ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7255:1: ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7256:1: ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7256:1: ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7257:1: (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7257:1: (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_FLOAT_LIT) ) {
                alt116=1;
            }
            else if ( (LA116_0==RULE_INT_LIT) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7258:3: lv_value_0_1= RULE_FLOAT_LIT
                    {
                    lv_value_0_1=(Token)match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_ruleNumberLit15722); 

                    			newLeafNode(lv_value_0_1, grammarAccess.getNumberLitAccess().getValueFLOAT_LITTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberLitRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_1, 
                            		"FLOAT_LIT");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7273:8: lv_value_0_2= RULE_INT_LIT
                    {
                    lv_value_0_2=(Token)match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_ruleNumberLit15742); 

                    			newLeafNode(lv_value_0_2, grammarAccess.getNumberLitAccess().getValueINT_LITTerminalRuleCall_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberLitRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_2, 
                            		"INT_LIT");
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLit"


    // $ANTLR start "entryRuleCharLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7299:1: entryRuleCharLit returns [EObject current=null] : iv_ruleCharLit= ruleCharLit EOF ;
    public final EObject entryRuleCharLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7300:2: (iv_ruleCharLit= ruleCharLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7301:2: iv_ruleCharLit= ruleCharLit EOF
            {
             newCompositeNode(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit15785);
            iv_ruleCharLit=ruleCharLit();

            state._fsp--;

             current =iv_ruleCharLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit15795); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharLit"


    // $ANTLR start "ruleCharLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7308:1: ruleCharLit returns [EObject current=null] : ( (lv_value_0_0= RULE_CHAR_LIT ) ) ;
    public final EObject ruleCharLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7311:28: ( ( (lv_value_0_0= RULE_CHAR_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7312:1: ( (lv_value_0_0= RULE_CHAR_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7312:1: ( (lv_value_0_0= RULE_CHAR_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7313:1: (lv_value_0_0= RULE_CHAR_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7313:1: (lv_value_0_0= RULE_CHAR_LIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7314:3: lv_value_0_0= RULE_CHAR_LIT
            {
            lv_value_0_0=(Token)match(input,RULE_CHAR_LIT,FOLLOW_RULE_CHAR_LIT_in_ruleCharLit15836); 

            			newLeafNode(lv_value_0_0, grammarAccess.getCharLitAccess().getValueCHAR_LITTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharLitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"CHAR_LIT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharLit"


    // $ANTLR start "ruleVisibility"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7338:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7340:28: ( ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7341:1: ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7341:1: ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==104) ) {
                alt117=1;
            }
            else if ( (LA117_0==105) ) {
                alt117=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7341:2: (enumLiteral_0= 'priv' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7341:2: (enumLiteral_0= 'priv' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7341:4: enumLiteral_0= 'priv'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_104_in_ruleVisibility15890); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7347:6: (enumLiteral_1= 'pub' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7347:6: (enumLiteral_1= 'pub' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7347:8: enumLiteral_1= 'pub'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_105_in_ruleVisibility15907); 

                            current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCrate_in_entryRuleCrate75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrate85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_ruleCrate130 = new BitSet(new long[]{0x7888200000000002L,0x000000000000000BL});
    public static final BitSet FOLLOW_ruleItemAttr_in_entryRuleItemAttr166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemAttr176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleItemAttr213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleItemAttr234 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleItemAttr247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleItemAttr268 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_ruleItemAttr282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_entryRuleAttr318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttr328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_ruleAttr375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_ruleAttr402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_entryRuleAttrWithList437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrWithList447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAttrWithList489 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleAttrWithList506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleAttrWithList527 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleAttrWithList540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleAttrWithList561 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleAttrWithList575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_entryRuleLiteralAttr611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAttr621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleLiteralAttr663 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleLiteralAttr680 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralAttr701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_entryRuleItemAndAttrs737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemAndAttrs747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_ruleItemAndAttrs793 = new BitSet(new long[]{0x7888200000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_ruleItem_in_ruleItemAndAttrs815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_ruleItem908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFnItem_in_ruleItem935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeItem_in_ruleItem962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructItem_in_ruleItem989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumItem_in_ruleItem1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraitItem_in_ruleItem1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplItem_in_ruleItem1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternBlock_in_ruleItem1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticItem_in_ruleItem1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_entryRuleModItem1159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModItem1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleModItem1206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleModItem1223 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleModItem1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleModItem1279 = new BitSet(new long[]{0x78C8200000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_ruleModItem1300 = new BitSet(new long[]{0x78C8200000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_54_in_ruleModItem1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFnItem_in_entryRuleFnItem1351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFnItem1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFnItem1398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFnItem1415 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_ruleFnItem1433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleFnItem1454 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFnItem1467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleFnItem1488 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleFnItem1502 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleFnItem1516 = new BitSet(new long[]{0x000300000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleFnItem1538 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFnItem1551 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleFnItem1572 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleFnItem1588 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_58_in_ruleFnItem1601 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleFnItem1622 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFnItem1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeItem_in_entryRuleTypeItem1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeItem1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTypeItem1728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTypeItem1745 = new BitSet(new long[]{0x0104000000000000L});
    public static final BitSet FOLLOW_56_in_ruleTypeItem1763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTypeItem1784 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTypeItem1797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTypeItem1818 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleTypeItem1832 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleTypeItem1846 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeItem1867 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleTypeItem1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructItem_in_entryRuleStructItem1915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructItem1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleStructItem1962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructItem1979 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleStructItem1997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructItem2018 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructItem2031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructItem2052 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleStructItem2066 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleStructItem2080 = new BitSet(new long[]{0x0000000000000010L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructItem2101 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructItem2114 = new BitSet(new long[]{0x0000000000000010L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructItem2135 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleStructItem2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumItem_in_entryRuleEnumItem2185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumItem2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEnumItem2232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleEnumItem2249 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleEnumItem2267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleEnumItem2288 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumItem2301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleEnumItem2322 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleEnumItem2336 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleEnumItem2350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumVariant_in_ruleEnumItem2371 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumItem2384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumVariant_in_ruleEnumItem2405 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleEnumItem2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumVariant_in_entryRuleEnumVariant2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumVariant2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleEnumVariant2507 = new BitSet(new long[]{0x0121000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEnumVariant2525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleEnumVariant2542 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumVariant2560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleEnumVariant2577 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleEnumVariant2596 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEnumVariant2612 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleEnumVariant2633 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumVariant2646 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleEnumVariant2667 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleEnumVariant2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEnumVariant2701 = new BitSet(new long[]{0x0000000000000010L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleEnumVariant2722 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumVariant2735 = new BitSet(new long[]{0x0000000000000010L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleEnumVariant2756 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleEnumVariant2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraitItem_in_entryRuleTraitItem2809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraitItem2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTraitItem2856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTraitItem2873 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleTraitItem2891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitItem2912 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTraitItem2925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitItem2946 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleTraitItem2960 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleTraitItem2974 = new BitSet(new long[]{0x80C0000000000000L,0x0000030000000001L});
    public static final BitSet FOLLOW_ruleTraitMethod_in_ruleTraitItem2995 = new BitSet(new long[]{0x80C0000000000000L,0x0000030000000001L});
    public static final BitSet FOLLOW_54_in_ruleTraitItem3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraitMethod_in_entryRuleTraitMethod3044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraitMethod3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTraitMethod3098 = new BitSet(new long[]{0x0080000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_64_in_ruleTraitMethod3135 = new BitSet(new long[]{0x0080000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleTraitMethod3171 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTraitMethod3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTraitMethod3201 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_ruleTraitMethod3219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3240 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTraitMethod3253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3274 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleTraitMethod3288 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTraitMethod3302 = new BitSet(new long[]{0x000300000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleTraitMethod3324 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTraitMethod3337 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleTraitMethod3358 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTraitMethod3374 = new BitSet(new long[]{0x0430000000000000L});
    public static final BitSet FOLLOW_58_in_ruleTraitMethod3387 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTraitMethod3408 = new BitSet(new long[]{0x0430000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleTraitMethod3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTraitMethod3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplItem_in_entryRuleImplItem3487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplItem3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleImplItem3534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleImplItem3552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleImplItem3569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleImplItem3588 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleImplItem3605 = new BitSet(new long[]{0x80C0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleImplMethod_in_ruleImplItem3626 = new BitSet(new long[]{0x80C0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54_in_ruleImplItem3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplMethod_in_entryRuleImplMethod3675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplMethod3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleImplMethod3729 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_64_in_ruleImplMethod3766 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleImplMethod3793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleImplMethod3810 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_ruleImplMethod3828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleImplMethod3849 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleImplMethod3862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleImplMethod3883 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleImplMethod3897 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleImplMethod3911 = new BitSet(new long[]{0x000300000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleImplMethod3933 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleImplMethod3946 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleImplMethod3967 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleImplMethod3983 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_58_in_ruleImplMethod3996 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleImplMethod4017 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleImplMethod4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternBlock_in_entryRuleExternBlock4076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternBlock4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleExternBlock4132 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_LIT_in_ruleExternBlock4149 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleExternBlock4167 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_ruleForeignFn_in_ruleExternBlock4188 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_54_in_ruleExternBlock4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignFn_in_entryRuleForeignFn4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignFn4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleForeignFn4284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleForeignFn4301 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleForeignFn4318 = new BitSet(new long[]{0x000300000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleForeignFn4340 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleForeignFn4353 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleForeignFn4374 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleForeignFn4390 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_58_in_ruleForeignFn4403 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleForeignFn4424 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleForeignFn4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticItem_in_entryRuleStaticItem4474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticItem4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleStaticItem4521 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_ruleStaticItem4538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStaticItem4560 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticItem4578 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleStaticItem4599 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleStaticItem4613 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleStaticItem4634 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleStaticItem4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr4682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRValue_in_ruleExpr4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLValue_in_entryRuleExprLValue4772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLValue4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPathHead_in_ruleExprLValue4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRValue_in_entryRuleExprRValue4862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRValue4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBinary_in_ruleExprRValue4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleExprRValue4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_entryRuleExprLeaf4981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLeaf4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLiteral_in_ruleExprLeaf5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprGroup_in_ruleExprLeaf5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_ruleExprLeaf5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprVec_in_ruleExprLeaf5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprUnary_in_ruleExprLeaf5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLambda_in_ruleExprLeaf5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprWhile_in_ruleExprLeaf5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLoop_in_ruleExprLeaf5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBreak_in_ruleExprLeaf5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprContinue_in_ruleExprLeaf5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprDo_in_ruleExprLeaf5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprFor_in_ruleExprLeaf5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprIf_in_ruleExprLeaf5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMatch_in_ruleExprLeaf5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprReturn_in_ruleExprLeaf5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLiteral_in_entryRuleExprLiteral5451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLiteral5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleExprLiteral5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPathHead_in_entryRuleExprPathHead5541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprPathHead5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPath_in_ruleExprPathHead5597 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_ruleExprPathHead5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTuple_in_ruleExprPathHead5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprGroup_in_entryRuleExprGroup5706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprGroup5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprGroup5753 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5774 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5796 = new BitSet(new long[]{0x002300000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5818 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5831 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5852 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5867 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleExprGroup5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTuple_in_entryRuleExprTuple5921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTuple5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprTuple5968 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprTuple5989 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprTuple6002 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprTuple6023 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprTuple6038 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleExprTuple6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_entryRuleExprStruct6088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprStruct6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExprStruct6135 = new BitSet(new long[]{0x0000000000000010L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleExprStruct6156 = new BitSet(new long[]{0x0040400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_46_in_ruleExprStruct6169 = new BitSet(new long[]{0x0000000000000010L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleExprStruct6190 = new BitSet(new long[]{0x0040400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleExprStruct6205 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprStruct6226 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleExprStruct6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprVec_in_entryRuleExprVec6276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprVec6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleExprVec6323 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_ruleExprVec6340 = new BitSet(new long[]{0x002180000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6367 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprVec6379 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FE4L});
    public static final BitSet FOLLOW_69_in_ruleExprVec6393 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6414 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6443 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprVec6456 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6477 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_ruleExprVec6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprUnary_in_entryRuleExprUnary6531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprUnary6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericNegation_in_ruleExprUnary6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDereference_in_ruleExprUnary6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNegation_in_ruleExprUnary6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManagedBox_in_ruleExprUnary6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedBox_in_ruleExprUnary6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_ruleExprUnary6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericNegation_in_entryRuleNumericNegation6758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericNegation6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleNumericNegation6805 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleNumericNegation6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDereference_in_entryRuleDereference6862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDereference6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDereference6909 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDereference6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNegation_in_entryRuleLogicalNegation6966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNegation6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleLogicalNegation7013 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleLogicalNegation7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManagedBox_in_entryRuleManagedBox7070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManagedBox7080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleManagedBox7117 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleManagedBox7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedBox_in_entryRuleOwnedBox7174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedBox7184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOwnedBox7221 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleOwnedBox7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_entryRuleBorrow7278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrow7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBorrow7325 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleBorrow7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBinary_in_entryRuleExprBinary7382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBinary7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_ruleExprBinary7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionMultiplicationOrModulo_in_entryRuleDivisionMultiplicationOrModulo7472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionMultiplicationOrModulo7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006100L});
    public static final BitSet FOLLOW_77_in_ruleDivisionMultiplicationOrModulo7551 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDivisionMultiplicationOrModulo7601 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDivisionMultiplicationOrModulo7651 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAs_in_entryRuleAs7711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAs7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionMultiplicationOrModulo_in_ruleAs7768 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleAs7789 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleAs7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_entryRuleAdditionOrSubtraction7848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOrSubtraction7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010080L});
    public static final BitSet FOLLOW_80_in_ruleAdditionOrSubtraction7927 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAdditionOrSubtraction7977 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator8037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftOperator8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8094 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleShiftOperator8116 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleShiftOperator8166 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAnd_in_entryRuleBitwiseAnd8226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAnd8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd8283 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleBitwiseAnd8304 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXor_in_entryRuleBitwiseXor8363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXor8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor8420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleBitwiseXor8441 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_entryRuleBitwiseOr8500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOr8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr8557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleBitwiseOr8578 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr8599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_entryRuleComparisonOperators8637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperators8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8694 = new BitSet(new long[]{0x0300000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_56_in_ruleComparisonOperators8716 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleComparisonOperators8766 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleComparisonOperators8816 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleComparisonOperators8866 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator8926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityOperator8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8983 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_87_in_ruleEqualityOperator9005 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleEqualityOperator9055 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator9076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAnd_in_entryRuleBooleanAnd9115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAnd9125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd9172 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleBooleanAnd9193 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign9254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign9264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLValue_in_ruleAssign9311 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAssign9332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExprUnary_in_ruleAssign9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLambda_in_entryRuleExprLambda9391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLambda9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleExprLambda9438 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprLambda9456 = new BitSet(new long[]{0x0000400000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_46_in_ruleExprLambda9474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprLambda9491 = new BitSet(new long[]{0x0000400000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleExprLambda9512 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprLambda9533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprWhile_in_entryRuleExprWhile9569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprWhile9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleExprWhile9616 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprWhile9637 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprWhile9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLoop_in_entryRuleExprLoop9694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLoop9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprLoop9747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleExprLoop9764 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleExprLoop9778 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprLoop9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBreak_in_entryRuleExprBreak9835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBreak9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleExprBreak9891 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprBreak9908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprContinue_in_entryRuleExprContinue9950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprContinue9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleExprContinue10006 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprContinue10023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprDo_in_entryRuleExprDo10065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprDo10075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleExprDo10112 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprDo10133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleExprDo10145 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprDo10163 = new BitSet(new long[]{0x0000400000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_46_in_ruleExprDo10181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprDo10198 = new BitSet(new long[]{0x0000400000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleExprDo10219 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprDo10240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprFor_in_entryRuleExprFor10276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprFor10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleExprFor10323 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_ruleExprFor10344 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleExprFor10356 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprFor10377 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprFor10398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprIf_in_entryRuleExprIf10434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprIf10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleExprIf10481 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprIf10502 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprIf10523 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleElseTail_in_ruleExprIf10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseTail_in_entryRuleElseTail10581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseTail10591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleElseTail10628 = new BitSet(new long[]{0x0420000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleExprIf_in_ruleElseTail10651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleElseTail10677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMatch_in_entryRuleExprMatch10714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMatch10724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleExprMatch10761 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprMatch10782 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleExprMatch10794 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleMatchArm_in_ruleExprMatch10815 = new BitSet(new long[]{0x0040000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleExprMatch10828 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_ruleMatchArm_in_ruleExprMatch10849 = new BitSet(new long[]{0x0040000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_54_in_ruleExprMatch10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchArm_in_entryRuleMatchArm10899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchArm10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPat_in_ruleMatchArm10955 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleMatchArm10967 = new BitSet(new long[]{0x042100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleMatchArm10990 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleMatchArm11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleMatchArm11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPat_in_entryRuleMatchPat11067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchPat11077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_ruleMatchPat11123 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000020L});
    public static final BitSet FOLLOW_69_in_ruleMatchPat11136 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_ruleMatchPat11157 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleMatchPat11172 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleMatchPat11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprReturn_in_entryRuleExprReturn11230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprReturn11240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleExprReturn11286 = new BitSet(new long[]{0x002100000000E0F0L,0x000000357C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprReturn11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock11343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock11353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBlock11399 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleBlock11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl11447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericParamDecl11457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl11499 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleGenericParamDecl11517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl11534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleGenericParamDecl11552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl11569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_entryRuleArg11613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_ruleArg11669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleArg11681 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleArg11702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_entryRulePat11738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePat11748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_rulePat11795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_rulePat11822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_rulePat11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_rulePat11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_rulePat11903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_rulePat11930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_rulePat11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_rulePat11984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatEnum_in_rulePat12011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_entryRulePatWildcard12046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatWildcard12056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rulePatWildcard12102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_entryRulePatIdent12138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatIdent12148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_rulePatIdent12190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePatIdent12212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_entryRulePatBoxed12253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBoxed12263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePatBoxed12300 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatBoxed12321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_entryRulePatOwned12357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatOwned12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePatOwned12404 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatOwned12425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed12461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBorrowed12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePatBorrowed12508 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatBorrowed12529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_entryRulePatTuple12565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatTuple12575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePatTuple12612 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatTuple12633 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatTuple12646 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatTuple12667 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_rulePatTuple12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_entryRulePatVector12717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatVector12727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePatVector12764 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatVector12785 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_rulePatVector12798 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatVector12819 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_rulePatVector12833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_entryRulePatLiteral12869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatLiteral12879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePatLiteral12924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatEnum_in_entryRulePatEnum12959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatEnum12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPath_in_rulePatEnum13015 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_rulePatEnum13038 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001D60L});
    public static final BitSet FOLLOW_72_in_rulePatEnum13051 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_69_in_rulePatEnum13069 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rulePat_in_rulePatEnum13097 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatEnum13110 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatEnum13131 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_rulePatEnum13147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePatEnum13176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldPat_in_rulePatEnum13197 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatEnum13210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldPat_in_rulePatEnum13231 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_rulePatEnum13245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldPat_in_entryRuleFieldPat13283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldPat13293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFieldPat13335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleFieldPat13353 = new BitSet(new long[]{0x000100000000E070L,0x0000002000001C40L});
    public static final BitSet FOLLOW_rulePat_in_ruleFieldPat13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypePath_in_entryRuleTypePath13412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypePath13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTypePath13464 = new BitSet(new long[]{0x0100000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleTypePath13482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTypePath13499 = new BitSet(new long[]{0x0100000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_56_in_ruleTypePath13518 = new BitSet(new long[]{0x0000000000001F90L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleTypePath13536 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypePath13568 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTypePath13582 = new BitSet(new long[]{0x0000000000001F90L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleTypePath13600 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypePath13632 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleTypePath13647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPath_in_entryRuleExprPath13683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprPath13693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprPath13735 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_102_in_ruleExprPath13753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprPath13770 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_103_in_ruleExprPath13790 = new BitSet(new long[]{0x0000000000001F90L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprPath13808 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleExprPath13840 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprPath13854 = new BitSet(new long[]{0x0000000000001F90L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprPath13872 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleExprPath13904 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleExprPath13919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType13957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_ruleType14041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_ruleType14068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_ruleType14095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_ruleType14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType14157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType14167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rulePrimitiveType14213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_in_rulePrimitiveType14240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_TYPE_in_rulePrimitiveType14267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MACHINE_TYPE_in_rulePrimitiveType14294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNIT_TYPE_in_rulePrimitiveType14321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_entryRuleNamedType14357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedType14367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypePath_in_ruleNamedType14412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer14447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxedPointer14457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBoxedPointer14494 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleBoxedPointer14515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer14551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedPointer14561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOwnedPointer14598 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleOwnedPointer14619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer14655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrowedPointer14665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBorrowedPointer14702 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleBorrowedPointer14723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_entryRuleStructField14759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructField14769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleStructField14815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructField14833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStructField14850 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleStructField14871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_entryRuleStructVariant14909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructVariant14919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructVariant14961 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleStructVariant14979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructVariant15000 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructVariant15013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructVariant15034 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleStructVariant15048 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleStructVariant15062 = new BitSet(new long[]{0x0000000000000010L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructVariant15083 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructVariant15096 = new BitSet(new long[]{0x0000000000000010L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructVariant15117 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleStructVariant15131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant15167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleVariant15177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTupleVariant15219 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTupleVariant15236 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleVariant15257 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTupleVariant15270 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleVariant15291 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTupleVariant15305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant15341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitVariant15351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleUnitVariant15392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_entryRuleStringLit15432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLit15442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LIT_in_ruleStringLit15483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral15523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral15533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_ruleLiteral15580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_ruleLiteral15607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_ruleLiteral15634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_entryRuleNumberLit15669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLit15679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_ruleNumberLit15722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LIT_in_ruleNumberLit15742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit15785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit15795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_LIT_in_ruleCharLit15836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleVisibility15890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleVisibility15907 = new BitSet(new long[]{0x0000000000000002L});

}