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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING_LIT", "RULE_MUT_KEYWORD", "RULE_LIFETIME", "RULE_INT_TYPE", "RULE_FLOAT_TYPE", "RULE_BOOLEAN_TYPE", "RULE_MACHINE_TYPE", "RULE_UNIT_TYPE", "RULE_FLOAT_LIT", "RULE_INT_LIT", "RULE_CHAR_LIT", "RULE_INT_SIZE", "RULE_SIGNED_INT_TYPE", "RULE_UNSIGNED_INT_TYPE", "RULE_I8", "RULE_I16", "RULE_I32", "RULE_I64", "RULE_U8", "RULE_U16", "RULE_U32", "RULE_U64", "RULE_FLOAT_SIZE", "RULE_F32", "RULE_F64", "RULE_MACHINE_INT_TYPE", "RULE_MACHINE_UINT_TYPE", "RULE_UNICODE_CHAR", "RULE_UTF8_CHAR", "RULE_UTF16_CHAR", "RULE_UTF32_CHAR", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_DEC_INT_LIT", "RULE_BIN_INT_LIT", "RULE_OCT_INT_LIT", "RULE_HEX_INT_LIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "'#['", "','", "']'", "'('", "')'", "'='", "'mod'", "';'", "'{'", "'}'", "'fn'", "'<'", "'>'", "'->'", "'type'", "'struct'", "'enum'", "'trait'", "'unsafe'", "'extern'", "'impl'", "'for'", "'static'", "':'", "'..'", "'['", "'-'", "'*'", "'!'", "'@'", "'~'", "'&'", "'/'", "'%'", "'as'", "'+'", "'<<'", "'>>'", "'^'", "'|'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'while'", "'loop'", "'break'", "'continue'", "'do'", "'in'", "'if'", "'else'", "'_'", "'::'", "'::<'", "'priv'", "'pub'"
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
    public static final int T__85=85;
    public static final int RULE_I32=21;
    public static final int RULE_UTF8_CHAR=33;
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
    public static final int RULE_BIN_INT_LIT=39;
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

            if ( ((LA12_0>=RULE_IDENT && LA12_0<=RULE_MUT_KEYWORD)||(LA12_0>=RULE_FLOAT_LIT && LA12_0<=RULE_CHAR_LIT)||LA12_0==48||LA12_0==70||(LA12_0>=74 && LA12_0<=76)||LA12_0==98) ) {
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

                if ( (LA29_0==55||(LA29_0>=63 && LA29_0<=64)||(LA29_0>=101 && LA29_0<=102)) ) {
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

            if ( ((LA31_0>=101 && LA31_0<=102)) ) {
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

            if ( ((LA35_0>=RULE_IDENT && LA35_0<=RULE_MUT_KEYWORD)||(LA35_0>=RULE_FLOAT_LIT && LA35_0<=RULE_CHAR_LIT)||LA35_0==48||LA35_0==70||(LA35_0>=74 && LA35_0<=76)||LA35_0==98) ) {
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

            if ( ((LA44_0>=RULE_IDENT && LA44_0<=RULE_MUT_KEYWORD)||(LA44_0>=RULE_FLOAT_LIT && LA44_0<=RULE_CHAR_LIT)||LA44_0==48||LA44_0==70||(LA44_0>=74 && LA44_0<=76)||LA44_0==98) ) {
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

            if ( ((LA49_0>=RULE_IDENT && LA49_0<=RULE_MUT_KEYWORD)||(LA49_0>=RULE_FLOAT_LIT && LA49_0<=RULE_CHAR_LIT)||LA49_0==48||LA49_0==70||(LA49_0>=74 && LA49_0<=76)||LA49_0==98) ) {
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
            else if ( (LA52_0==RULE_STRING_LIT||LA52_0==RULE_LIFETIME||(LA52_0>=RULE_FLOAT_LIT && LA52_0<=RULE_CHAR_LIT)||LA52_0==48||LA52_0==53||LA52_0==66||(LA52_0>=70 && LA52_0<=76)||LA52_0==84||(LA52_0>=90 && LA52_0<=94)||LA52_0==96) ) {
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2435:1: ruleExprLeaf returns [EObject current=null] : (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary | this_ExprLambda_5= ruleExprLambda | this_ExprWhile_6= ruleExprWhile | this_ExprLoop_7= ruleExprLoop | this_ExprBreak_8= ruleExprBreak | this_ExprContinue_9= ruleExprContinue | this_ExprDo_10= ruleExprDo | this_ExprFor_11= ruleExprFor | this_ExprIf_12= ruleExprIf ) ;
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


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2438:28: ( (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary | this_ExprLambda_5= ruleExprLambda | this_ExprWhile_6= ruleExprWhile | this_ExprLoop_7= ruleExprLoop | this_ExprBreak_8= ruleExprBreak | this_ExprContinue_9= ruleExprContinue | this_ExprDo_10= ruleExprDo | this_ExprFor_11= ruleExprFor | this_ExprIf_12= ruleExprIf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2439:1: (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary | this_ExprLambda_5= ruleExprLambda | this_ExprWhile_6= ruleExprWhile | this_ExprLoop_7= ruleExprLoop | this_ExprBreak_8= ruleExprBreak | this_ExprContinue_9= ruleExprContinue | this_ExprDo_10= ruleExprDo | this_ExprFor_11= ruleExprFor | this_ExprIf_12= ruleExprIf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2439:1: (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary | this_ExprLambda_5= ruleExprLambda | this_ExprWhile_6= ruleExprWhile | this_ExprLoop_7= ruleExprLoop | this_ExprBreak_8= ruleExprBreak | this_ExprContinue_9= ruleExprContinue | this_ExprDo_10= ruleExprDo | this_ExprFor_11= ruleExprFor | this_ExprIf_12= ruleExprIf )
            int alt53=13;
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2576:1: entryRuleExprLiteral returns [EObject current=null] : iv_ruleExprLiteral= ruleExprLiteral EOF ;
    public final EObject entryRuleExprLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2577:2: (iv_ruleExprLiteral= ruleExprLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2578:2: iv_ruleExprLiteral= ruleExprLiteral EOF
            {
             newCompositeNode(grammarAccess.getExprLiteralRule()); 
            pushFollow(FOLLOW_ruleExprLiteral_in_entryRuleExprLiteral5397);
            iv_ruleExprLiteral=ruleExprLiteral();

            state._fsp--;

             current =iv_ruleExprLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLiteral5407); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2585:1: ruleExprLiteral returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject ruleExprLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2588:28: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2589:1: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2589:1: ( (lv_literal_0_0= ruleLiteral ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2590:1: (lv_literal_0_0= ruleLiteral )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2590:1: (lv_literal_0_0= ruleLiteral )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2591:3: lv_literal_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getExprLiteralAccess().getLiteralLiteralParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleExprLiteral5452);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2615:1: entryRuleExprPathHead returns [EObject current=null] : iv_ruleExprPathHead= ruleExprPathHead EOF ;
    public final EObject entryRuleExprPathHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprPathHead = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2616:2: (iv_ruleExprPathHead= ruleExprPathHead EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2617:2: iv_ruleExprPathHead= ruleExprPathHead EOF
            {
             newCompositeNode(grammarAccess.getExprPathHeadRule()); 
            pushFollow(FOLLOW_ruleExprPathHead_in_entryRuleExprPathHead5487);
            iv_ruleExprPathHead=ruleExprPathHead();

            state._fsp--;

             current =iv_ruleExprPathHead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprPathHead5497); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2624:1: ruleExprPathHead returns [EObject current=null] : ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? ) ;
    public final EObject ruleExprPathHead() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;

        EObject lv_struct_2_0 = null;

        EObject lv_tuple_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2627:28: ( ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2628:1: ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2628:1: ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2628:2: ( (lv_path_0_0= ruleExprPath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2628:2: ( (lv_path_0_0= ruleExprPath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2629:1: (lv_path_0_0= ruleExprPath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2629:1: (lv_path_0_0= ruleExprPath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2630:3: lv_path_0_0= ruleExprPath
            {
             
            	        newCompositeNode(grammarAccess.getExprPathHeadAccess().getPathExprPathParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExprPath_in_ruleExprPathHead5543);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2646:2: ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_IDENT||(LA54_1>=101 && LA54_1<=102)) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==48) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2646:3: ( () ( (lv_struct_2_0= ruleExprStruct ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2646:3: ( () ( (lv_struct_2_0= ruleExprStruct ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2646:4: () ( (lv_struct_2_0= ruleExprStruct ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2646:4: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2647:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExprPathHeadAccess().getExprStructPathAction_1_0_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2652:2: ( (lv_struct_2_0= ruleExprStruct ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2653:1: (lv_struct_2_0= ruleExprStruct )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2653:1: (lv_struct_2_0= ruleExprStruct )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2654:3: lv_struct_2_0= ruleExprStruct
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprPathHeadAccess().getStructExprStructParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprStruct_in_ruleExprPathHead5575);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2671:6: ( () ( (lv_tuple_4_0= ruleExprTuple ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2671:6: ( () ( (lv_tuple_4_0= ruleExprTuple ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2671:7: () ( (lv_tuple_4_0= ruleExprTuple ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2671:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2672:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExprPathHeadAccess().getExprTuplePathAction_1_1_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2677:2: ( (lv_tuple_4_0= ruleExprTuple ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2678:1: (lv_tuple_4_0= ruleExprTuple )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2678:1: (lv_tuple_4_0= ruleExprTuple )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2679:3: lv_tuple_4_0= ruleExprTuple
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprPathHeadAccess().getTupleExprTupleParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprTuple_in_ruleExprPathHead5613);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2703:1: entryRuleExprGroup returns [EObject current=null] : iv_ruleExprGroup= ruleExprGroup EOF ;
    public final EObject entryRuleExprGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprGroup = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2704:2: (iv_ruleExprGroup= ruleExprGroup EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2705:2: iv_ruleExprGroup= ruleExprGroup EOF
            {
             newCompositeNode(grammarAccess.getExprGroupRule()); 
            pushFollow(FOLLOW_ruleExprGroup_in_entryRuleExprGroup5652);
            iv_ruleExprGroup=ruleExprGroup();

            state._fsp--;

             current =iv_ruleExprGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprGroup5662); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2712:1: ruleExprGroup returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2715:28: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2716:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2716:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2716:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleExprGroup5699); 

                	newLeafNode(otherlv_0, grammarAccess.getExprGroupAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2720:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2721:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2721:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2722:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5720);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2738:2: ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==46) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2738:3: () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )?
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2738:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2739:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getExprGroupAccess().getExprTupleExprsAction_2_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5742); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprGroupAccess().getCommaKeyword_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2748:1: ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=RULE_IDENT && LA57_0<=RULE_STRING_LIT)||LA57_0==RULE_LIFETIME||(LA57_0>=RULE_FLOAT_LIT && LA57_0<=RULE_CHAR_LIT)||LA57_0==48||LA57_0==53||LA57_0==66||(LA57_0>=70 && LA57_0<=76)||LA57_0==84||(LA57_0>=90 && LA57_0<=94)||LA57_0==96) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2748:2: ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )?
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2748:2: ( (lv_exprs_4_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2749:1: (lv_exprs_4_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2749:1: (lv_exprs_4_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2750:3: lv_exprs_4_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprsExprParserRuleCall_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5764);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2766:2: (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==46) ) {
                                    int LA55_1 = input.LA(2);

                                    if ( ((LA55_1>=RULE_IDENT && LA55_1<=RULE_STRING_LIT)||LA55_1==RULE_LIFETIME||(LA55_1>=RULE_FLOAT_LIT && LA55_1<=RULE_CHAR_LIT)||LA55_1==48||LA55_1==53||LA55_1==66||(LA55_1>=70 && LA55_1<=76)||LA55_1==84||(LA55_1>=90 && LA55_1<=94)||LA55_1==96) ) {
                                        alt55=1;
                                    }


                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2766:4: otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) )
                            	    {
                            	    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5777); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getExprGroupAccess().getCommaKeyword_2_2_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2770:1: ( (lv_exprs_6_0= ruleExpr ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2771:1: (lv_exprs_6_0= ruleExpr )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2771:1: (lv_exprs_6_0= ruleExpr )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2772:3: lv_exprs_6_0= ruleExpr
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprsExprParserRuleCall_2_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5798);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2788:4: (otherlv_7= ',' )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==46) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2788:6: otherlv_7= ','
                                    {
                                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5813); 

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

            otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleExprGroup5831); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2804:1: entryRuleExprTuple returns [EObject current=null] : iv_ruleExprTuple= ruleExprTuple EOF ;
    public final EObject entryRuleExprTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTuple = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2805:2: (iv_ruleExprTuple= ruleExprTuple EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2806:2: iv_ruleExprTuple= ruleExprTuple EOF
            {
             newCompositeNode(grammarAccess.getExprTupleRule()); 
            pushFollow(FOLLOW_ruleExprTuple_in_entryRuleExprTuple5867);
            iv_ruleExprTuple=ruleExprTuple();

            state._fsp--;

             current =iv_ruleExprTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTuple5877); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2813:1: ruleExprTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2816:28: ( (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2817:1: (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2817:1: (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2817:3: otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleExprTuple5914); 

                	newLeafNode(otherlv_0, grammarAccess.getExprTupleAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2821:1: ( (lv_exprs_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2822:1: (lv_exprs_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2822:1: (lv_exprs_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2823:3: lv_exprs_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprTupleAccess().getExprsExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprTuple5935);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2839:2: (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==46) ) {
                    int LA59_1 = input.LA(2);

                    if ( ((LA59_1>=RULE_IDENT && LA59_1<=RULE_STRING_LIT)||LA59_1==RULE_LIFETIME||(LA59_1>=RULE_FLOAT_LIT && LA59_1<=RULE_CHAR_LIT)||LA59_1==48||LA59_1==53||LA59_1==66||(LA59_1>=70 && LA59_1<=76)||LA59_1==84||(LA59_1>=90 && LA59_1<=94)||LA59_1==96) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2839:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprTuple5948); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExprTupleAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2843:1: ( (lv_exprs_3_0= ruleExpr ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2844:1: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2844:1: (lv_exprs_3_0= ruleExpr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2845:3: lv_exprs_3_0= ruleExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprTupleAccess().getExprsExprParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprTuple5969);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2861:4: (otherlv_4= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2861:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleExprTuple5984); 

                        	newLeafNode(otherlv_4, grammarAccess.getExprTupleAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleExprTuple5998); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2877:1: entryRuleExprStruct returns [EObject current=null] : iv_ruleExprStruct= ruleExprStruct EOF ;
    public final EObject entryRuleExprStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprStruct = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2878:2: (iv_ruleExprStruct= ruleExprStruct EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2879:2: iv_ruleExprStruct= ruleExprStruct EOF
            {
             newCompositeNode(grammarAccess.getExprStructRule()); 
            pushFollow(FOLLOW_ruleExprStruct_in_entryRuleExprStruct6034);
            iv_ruleExprStruct=ruleExprStruct();

            state._fsp--;

             current =iv_ruleExprStruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprStruct6044); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2886:1: ruleExprStruct returns [EObject current=null] : (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2889:28: ( (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2890:1: (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2890:1: (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2890:3: otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleExprStruct6081); 

                	newLeafNode(otherlv_0, grammarAccess.getExprStructAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2894:1: ( (lv_fields_1_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2895:1: (lv_fields_1_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2895:1: (lv_fields_1_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2896:3: lv_fields_1_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getExprStructAccess().getFieldsStructFieldParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleExprStruct6102);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2912:2: (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==46) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2912:4: otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprStruct6115); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExprStructAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2916:1: ( (lv_fields_3_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2917:1: (lv_fields_3_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2917:1: (lv_fields_3_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2918:3: lv_fields_3_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprStructAccess().getFieldsStructFieldParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleExprStruct6136);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2934:4: (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==69) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2934:6: otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) )
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleExprStruct6151); 

                        	newLeafNode(otherlv_4, grammarAccess.getExprStructAccess().getFullStopFullStopKeyword_3_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2938:1: ( (lv_baseExpr_5_0= ruleExpr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2939:1: (lv_baseExpr_5_0= ruleExpr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2939:1: (lv_baseExpr_5_0= ruleExpr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2940:3: lv_baseExpr_5_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprStructAccess().getBaseExprExprParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprStruct6172);
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

            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleExprStruct6186); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2968:1: entryRuleExprVec returns [EObject current=null] : iv_ruleExprVec= ruleExprVec EOF ;
    public final EObject entryRuleExprVec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprVec = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2969:2: (iv_ruleExprVec= ruleExprVec EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2970:2: iv_ruleExprVec= ruleExprVec EOF
            {
             newCompositeNode(grammarAccess.getExprVecRule()); 
            pushFollow(FOLLOW_ruleExprVec_in_entryRuleExprVec6222);
            iv_ruleExprVec=ruleExprVec();

            state._fsp--;

             current =iv_ruleExprVec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprVec6232); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2977:1: ruleExprVec returns [EObject current=null] : (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2980:28: ( (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2981:1: (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2981:1: (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2981:3: otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleExprVec6269); 

                	newLeafNode(otherlv_0, grammarAccess.getExprVecAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2985:1: ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2986:1: (lv_mutable_1_0= RULE_MUT_KEYWORD )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2986:1: (lv_mutable_1_0= RULE_MUT_KEYWORD )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2987:3: lv_mutable_1_0= RULE_MUT_KEYWORD
            {
            lv_mutable_1_0=(Token)match(input,RULE_MUT_KEYWORD,FOLLOW_RULE_MUT_KEYWORD_in_ruleExprVec6286); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3003:2: ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_IDENT && LA65_0<=RULE_STRING_LIT)||LA65_0==RULE_LIFETIME||(LA65_0>=RULE_FLOAT_LIT && LA65_0<=RULE_CHAR_LIT)||LA65_0==48||LA65_0==53||LA65_0==66||(LA65_0>=70 && LA65_0<=76)||LA65_0==84||(LA65_0>=90 && LA65_0<=94)||LA65_0==96) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3003:3: ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3003:3: ( (lv_exprs_2_0= ruleExpr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3004:1: (lv_exprs_2_0= ruleExpr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3004:1: (lv_exprs_2_0= ruleExpr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3005:3: lv_exprs_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprVecAccess().getExprsExprParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6313);
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

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleExprVec6325); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprVecAccess().getCommaKeyword_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3025:1: ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==69) ) {
                        alt64=1;
                    }
                    else if ( ((LA64_0>=RULE_IDENT && LA64_0<=RULE_STRING_LIT)||LA64_0==RULE_LIFETIME||(LA64_0>=RULE_FLOAT_LIT && LA64_0<=RULE_CHAR_LIT)||LA64_0==48||LA64_0==53||LA64_0==66||(LA64_0>=70 && LA64_0<=76)||LA64_0==84||(LA64_0>=90 && LA64_0<=94)||LA64_0==96) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3025:2: (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3025:2: (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3025:4: otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) )
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleExprVec6339); 

                                	newLeafNode(otherlv_4, grammarAccess.getExprVecAccess().getFullStopFullStopKeyword_2_2_0_0());
                                
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3029:1: ( (lv_lenExpr_5_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3030:1: (lv_lenExpr_5_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3030:1: (lv_lenExpr_5_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3031:3: lv_lenExpr_5_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprVecAccess().getLenExprExprParserRuleCall_2_2_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6360);
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
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3048:6: ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3048:6: ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3048:7: ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3048:7: ( (lv_exprs_6_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3049:1: (lv_exprs_6_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3049:1: (lv_exprs_6_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3050:3: lv_exprs_6_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprVecAccess().getExprsExprParserRuleCall_2_2_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6389);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3066:2: (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+
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
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3066:4: otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) )
                            	    {
                            	    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleExprVec6402); 

                            	        	newLeafNode(otherlv_7, grammarAccess.getExprVecAccess().getCommaKeyword_2_2_1_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3070:1: ( (lv_exprs_8_0= ruleExpr ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3071:1: (lv_exprs_8_0= ruleExpr )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3071:1: (lv_exprs_8_0= ruleExpr )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3072:3: lv_exprs_8_0= ruleExpr
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getExprVecAccess().getExprsExprParserRuleCall_2_2_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6423);
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

            otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleExprVec6441); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3100:1: entryRuleExprUnary returns [EObject current=null] : iv_ruleExprUnary= ruleExprUnary EOF ;
    public final EObject entryRuleExprUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprUnary = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3101:2: (iv_ruleExprUnary= ruleExprUnary EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3102:2: iv_ruleExprUnary= ruleExprUnary EOF
            {
             newCompositeNode(grammarAccess.getExprUnaryRule()); 
            pushFollow(FOLLOW_ruleExprUnary_in_entryRuleExprUnary6477);
            iv_ruleExprUnary=ruleExprUnary();

            state._fsp--;

             current =iv_ruleExprUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprUnary6487); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3109:1: ruleExprUnary returns [EObject current=null] : (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3112:28: ( (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3113:1: (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3113:1: (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3114:5: this_NumericNegation_0= ruleNumericNegation
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getNumericNegationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumericNegation_in_ruleExprUnary6534);
                    this_NumericNegation_0=ruleNumericNegation();

                    state._fsp--;

                     
                            current = this_NumericNegation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3124:5: this_Dereference_1= ruleDereference
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getDereferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDereference_in_ruleExprUnary6561);
                    this_Dereference_1=ruleDereference();

                    state._fsp--;

                     
                            current = this_Dereference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3134:5: this_LogicalNegation_2= ruleLogicalNegation
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getLogicalNegationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLogicalNegation_in_ruleExprUnary6588);
                    this_LogicalNegation_2=ruleLogicalNegation();

                    state._fsp--;

                     
                            current = this_LogicalNegation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3144:5: this_ManagedBox_3= ruleManagedBox
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getManagedBoxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleManagedBox_in_ruleExprUnary6615);
                    this_ManagedBox_3=ruleManagedBox();

                    state._fsp--;

                     
                            current = this_ManagedBox_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3154:5: this_OwnedBox_4= ruleOwnedBox
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getOwnedBoxParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleOwnedBox_in_ruleExprUnary6642);
                    this_OwnedBox_4=ruleOwnedBox();

                    state._fsp--;

                     
                            current = this_OwnedBox_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3164:5: this_Borrow_5= ruleBorrow
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getBorrowParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBorrow_in_ruleExprUnary6669);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3180:1: entryRuleNumericNegation returns [EObject current=null] : iv_ruleNumericNegation= ruleNumericNegation EOF ;
    public final EObject entryRuleNumericNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericNegation = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3181:2: (iv_ruleNumericNegation= ruleNumericNegation EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3182:2: iv_ruleNumericNegation= ruleNumericNegation EOF
            {
             newCompositeNode(grammarAccess.getNumericNegationRule()); 
            pushFollow(FOLLOW_ruleNumericNegation_in_entryRuleNumericNegation6704);
            iv_ruleNumericNegation=ruleNumericNegation();

            state._fsp--;

             current =iv_ruleNumericNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericNegation6714); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3189:1: ruleNumericNegation returns [EObject current=null] : (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleNumericNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3192:28: ( (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3193:1: (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3193:1: (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3193:3: otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleNumericNegation6751); 

                	newLeafNode(otherlv_0, grammarAccess.getNumericNegationAccess().getHyphenMinusKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3197:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3198:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3198:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3199:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getNumericNegationAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleNumericNegation6772);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3223:1: entryRuleDereference returns [EObject current=null] : iv_ruleDereference= ruleDereference EOF ;
    public final EObject entryRuleDereference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDereference = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3224:2: (iv_ruleDereference= ruleDereference EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3225:2: iv_ruleDereference= ruleDereference EOF
            {
             newCompositeNode(grammarAccess.getDereferenceRule()); 
            pushFollow(FOLLOW_ruleDereference_in_entryRuleDereference6808);
            iv_ruleDereference=ruleDereference();

            state._fsp--;

             current =iv_ruleDereference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDereference6818); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3232:1: ruleDereference returns [EObject current=null] : (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleDereference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3235:28: ( (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3236:1: (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3236:1: (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3236:3: otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleDereference6855); 

                	newLeafNode(otherlv_0, grammarAccess.getDereferenceAccess().getAsteriskKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3240:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3241:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3241:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3242:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getDereferenceAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleDereference6876);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3266:1: entryRuleLogicalNegation returns [EObject current=null] : iv_ruleLogicalNegation= ruleLogicalNegation EOF ;
    public final EObject entryRuleLogicalNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegation = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3267:2: (iv_ruleLogicalNegation= ruleLogicalNegation EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3268:2: iv_ruleLogicalNegation= ruleLogicalNegation EOF
            {
             newCompositeNode(grammarAccess.getLogicalNegationRule()); 
            pushFollow(FOLLOW_ruleLogicalNegation_in_entryRuleLogicalNegation6912);
            iv_ruleLogicalNegation=ruleLogicalNegation();

            state._fsp--;

             current =iv_ruleLogicalNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNegation6922); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3275:1: ruleLogicalNegation returns [EObject current=null] : (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleLogicalNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3278:28: ( (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3279:1: (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3279:1: (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3279:3: otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleLogicalNegation6959); 

                	newLeafNode(otherlv_0, grammarAccess.getLogicalNegationAccess().getExclamationMarkKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3283:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3284:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3284:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3285:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getLogicalNegationAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleLogicalNegation6980);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3309:1: entryRuleManagedBox returns [EObject current=null] : iv_ruleManagedBox= ruleManagedBox EOF ;
    public final EObject entryRuleManagedBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManagedBox = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3310:2: (iv_ruleManagedBox= ruleManagedBox EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3311:2: iv_ruleManagedBox= ruleManagedBox EOF
            {
             newCompositeNode(grammarAccess.getManagedBoxRule()); 
            pushFollow(FOLLOW_ruleManagedBox_in_entryRuleManagedBox7016);
            iv_ruleManagedBox=ruleManagedBox();

            state._fsp--;

             current =iv_ruleManagedBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManagedBox7026); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3318:1: ruleManagedBox returns [EObject current=null] : (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleManagedBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3321:28: ( (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3322:1: (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3322:1: (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3322:3: otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleManagedBox7063); 

                	newLeafNode(otherlv_0, grammarAccess.getManagedBoxAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3326:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3327:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3327:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3328:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getManagedBoxAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleManagedBox7084);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3352:1: entryRuleOwnedBox returns [EObject current=null] : iv_ruleOwnedBox= ruleOwnedBox EOF ;
    public final EObject entryRuleOwnedBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedBox = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3353:2: (iv_ruleOwnedBox= ruleOwnedBox EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3354:2: iv_ruleOwnedBox= ruleOwnedBox EOF
            {
             newCompositeNode(grammarAccess.getOwnedBoxRule()); 
            pushFollow(FOLLOW_ruleOwnedBox_in_entryRuleOwnedBox7120);
            iv_ruleOwnedBox=ruleOwnedBox();

            state._fsp--;

             current =iv_ruleOwnedBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedBox7130); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3361:1: ruleOwnedBox returns [EObject current=null] : (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleOwnedBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3364:28: ( (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3365:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3365:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3365:3: otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleOwnedBox7167); 

                	newLeafNode(otherlv_0, grammarAccess.getOwnedBoxAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3369:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3370:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3370:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3371:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getOwnedBoxAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleOwnedBox7188);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3395:1: entryRuleBorrow returns [EObject current=null] : iv_ruleBorrow= ruleBorrow EOF ;
    public final EObject entryRuleBorrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorrow = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3396:2: (iv_ruleBorrow= ruleBorrow EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3397:2: iv_ruleBorrow= ruleBorrow EOF
            {
             newCompositeNode(grammarAccess.getBorrowRule()); 
            pushFollow(FOLLOW_ruleBorrow_in_entryRuleBorrow7224);
            iv_ruleBorrow=ruleBorrow();

            state._fsp--;

             current =iv_ruleBorrow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrow7234); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3404:1: ruleBorrow returns [EObject current=null] : (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleBorrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3407:28: ( (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3408:1: (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3408:1: (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3408:3: otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleBorrow7271); 

                	newLeafNode(otherlv_0, grammarAccess.getBorrowAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3412:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3413:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3413:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3414:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getBorrowAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleBorrow7292);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3438:1: entryRuleExprBinary returns [EObject current=null] : iv_ruleExprBinary= ruleExprBinary EOF ;
    public final EObject entryRuleExprBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBinary = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3439:2: (iv_ruleExprBinary= ruleExprBinary EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3440:2: iv_ruleExprBinary= ruleExprBinary EOF
            {
             newCompositeNode(grammarAccess.getExprBinaryRule()); 
            pushFollow(FOLLOW_ruleExprBinary_in_entryRuleExprBinary7328);
            iv_ruleExprBinary=ruleExprBinary();

            state._fsp--;

             current =iv_ruleExprBinary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBinary7338); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3447:1: ruleExprBinary returns [EObject current=null] : this_Assign_0= ruleAssign ;
    public final EObject ruleExprBinary() throws RecognitionException {
        EObject current = null;

        EObject this_Assign_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3450:28: (this_Assign_0= ruleAssign )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3452:5: this_Assign_0= ruleAssign
            {
             
                    newCompositeNode(grammarAccess.getExprBinaryAccess().getAssignParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAssign_in_ruleExprBinary7384);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3468:1: entryRuleDivisionMultiplicationOrModulo returns [EObject current=null] : iv_ruleDivisionMultiplicationOrModulo= ruleDivisionMultiplicationOrModulo EOF ;
    public final EObject entryRuleDivisionMultiplicationOrModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionMultiplicationOrModulo = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3469:2: (iv_ruleDivisionMultiplicationOrModulo= ruleDivisionMultiplicationOrModulo EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3470:2: iv_ruleDivisionMultiplicationOrModulo= ruleDivisionMultiplicationOrModulo EOF
            {
             newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloRule()); 
            pushFollow(FOLLOW_ruleDivisionMultiplicationOrModulo_in_entryRuleDivisionMultiplicationOrModulo7418);
            iv_ruleDivisionMultiplicationOrModulo=ruleDivisionMultiplicationOrModulo();

            state._fsp--;

             current =iv_ruleDivisionMultiplicationOrModulo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionMultiplicationOrModulo7428); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3477:1: ruleDivisionMultiplicationOrModulo returns [EObject current=null] : (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3480:28: ( (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3481:1: (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3481:1: (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3482:5: this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getExprLeafParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7475);
            this_ExprLeaf_0=ruleExprLeaf();

            state._fsp--;

             
                    current = this_ExprLeaf_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3490:1: ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )?
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3490:2: ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3490:2: ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3490:3: () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3490:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3491:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,77,FOLLOW_77_in_ruleDivisionMultiplicationOrModulo7497); 

                        	newLeafNode(otherlv_2, grammarAccess.getDivisionMultiplicationOrModuloAccess().getSolidusKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3500:1: ( (lv_right_3_0= ruleExprLeaf ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3501:1: (lv_right_3_0= ruleExprLeaf )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3501:1: (lv_right_3_0= ruleExprLeaf )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3502:3: lv_right_3_0= ruleExprLeaf
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7518);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3519:6: ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3519:6: ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3519:7: () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3519:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3520:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleDivisionMultiplicationOrModulo7547); 

                        	newLeafNode(otherlv_5, grammarAccess.getDivisionMultiplicationOrModuloAccess().getAsteriskKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3529:1: ( (lv_right_6_0= ruleExprLeaf ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3530:1: (lv_right_6_0= ruleExprLeaf )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3530:1: (lv_right_6_0= ruleExprLeaf )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3531:3: lv_right_6_0= ruleExprLeaf
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7568);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3548:6: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3548:6: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3548:7: () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3548:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3549:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleDivisionMultiplicationOrModulo7597); 

                        	newLeafNode(otherlv_8, grammarAccess.getDivisionMultiplicationOrModuloAccess().getPercentSignKeyword_1_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3558:1: ( (lv_right_9_0= ruleExprLeaf ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3559:1: (lv_right_9_0= ruleExprLeaf )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3559:1: (lv_right_9_0= ruleExprLeaf )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3560:3: lv_right_9_0= ruleExprLeaf
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7618);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3584:1: entryRuleAs returns [EObject current=null] : iv_ruleAs= ruleAs EOF ;
    public final EObject entryRuleAs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAs = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3585:2: (iv_ruleAs= ruleAs EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3586:2: iv_ruleAs= ruleAs EOF
            {
             newCompositeNode(grammarAccess.getAsRule()); 
            pushFollow(FOLLOW_ruleAs_in_entryRuleAs7657);
            iv_ruleAs=ruleAs();

            state._fsp--;

             current =iv_ruleAs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAs7667); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3593:1: ruleAs returns [EObject current=null] : (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? ) ;
    public final EObject ruleAs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_DivisionMultiplicationOrModulo_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3596:28: ( (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3597:1: (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3597:1: (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3598:5: this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAsAccess().getDivisionMultiplicationOrModuloParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDivisionMultiplicationOrModulo_in_ruleAs7714);
            this_DivisionMultiplicationOrModulo_0=ruleDivisionMultiplicationOrModulo();

            state._fsp--;

             
                    current = this_DivisionMultiplicationOrModulo_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3606:1: ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==79) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3606:2: () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3606:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3607:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAsAccess().getExprCastExprAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleAs7735); 

                        	newLeafNode(otherlv_2, grammarAccess.getAsAccess().getAsKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3616:1: ( (lv_type_3_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3617:1: (lv_type_3_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3617:1: (lv_type_3_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3618:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAsAccess().getTypeTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAs7756);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3642:1: entryRuleAdditionOrSubtraction returns [EObject current=null] : iv_ruleAdditionOrSubtraction= ruleAdditionOrSubtraction EOF ;
    public final EObject entryRuleAdditionOrSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOrSubtraction = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3643:2: (iv_ruleAdditionOrSubtraction= ruleAdditionOrSubtraction EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3644:2: iv_ruleAdditionOrSubtraction= ruleAdditionOrSubtraction EOF
            {
             newCompositeNode(grammarAccess.getAdditionOrSubtractionRule()); 
            pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_entryRuleAdditionOrSubtraction7794);
            iv_ruleAdditionOrSubtraction=ruleAdditionOrSubtraction();

            state._fsp--;

             current =iv_ruleAdditionOrSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOrSubtraction7804); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3651:1: ruleAdditionOrSubtraction returns [EObject current=null] : (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? ) ;
    public final EObject ruleAdditionOrSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_As_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3654:28: ( (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3655:1: (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3655:1: (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3656:5: this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAdditionOrSubtractionAccess().getAsParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7851);
            this_As_0=ruleAs();

            state._fsp--;

             
                    current = this_As_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3664:1: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )?
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3664:2: ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3664:2: ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3664:3: () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3664:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3665:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleAdditionOrSubtraction7873); 

                        	newLeafNode(otherlv_2, grammarAccess.getAdditionOrSubtractionAccess().getPlusSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3674:1: ( (lv_right_3_0= ruleAs ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3675:1: (lv_right_3_0= ruleAs )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3675:1: (lv_right_3_0= ruleAs )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3676:3: lv_right_3_0= ruleAs
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionOrSubtractionAccess().getRightAsParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7894);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3693:6: ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3693:6: ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3693:7: () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3693:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3694:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleAdditionOrSubtraction7923); 

                        	newLeafNode(otherlv_5, grammarAccess.getAdditionOrSubtractionAccess().getHyphenMinusKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3703:1: ( (lv_right_6_0= ruleAs ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3704:1: (lv_right_6_0= ruleAs )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3704:1: (lv_right_6_0= ruleAs )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3705:3: lv_right_6_0= ruleAs
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionOrSubtractionAccess().getRightAsParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7944);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3729:1: entryRuleShiftOperator returns [EObject current=null] : iv_ruleShiftOperator= ruleShiftOperator EOF ;
    public final EObject entryRuleShiftOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftOperator = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3730:2: (iv_ruleShiftOperator= ruleShiftOperator EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3731:2: iv_ruleShiftOperator= ruleShiftOperator EOF
            {
             newCompositeNode(grammarAccess.getShiftOperatorRule()); 
            pushFollow(FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator7983);
            iv_ruleShiftOperator=ruleShiftOperator();

            state._fsp--;

             current =iv_ruleShiftOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftOperator7993); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3738:1: ruleShiftOperator returns [EObject current=null] : (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? ) ;
    public final EObject ruleShiftOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_AdditionOrSubtraction_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3741:28: ( (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3742:1: (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3742:1: (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3743:5: this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getShiftOperatorAccess().getAdditionOrSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8040);
            this_AdditionOrSubtraction_0=ruleAdditionOrSubtraction();

            state._fsp--;

             
                    current = this_AdditionOrSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3751:1: ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )?
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3751:2: ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3751:2: ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3751:3: () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3751:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3752:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,81,FOLLOW_81_in_ruleShiftOperator8062); 

                        	newLeafNode(otherlv_2, grammarAccess.getShiftOperatorAccess().getLessThanSignLessThanSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3761:1: ( (lv_right_3_0= ruleAdditionOrSubtraction ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3762:1: (lv_right_3_0= ruleAdditionOrSubtraction )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3762:1: (lv_right_3_0= ruleAdditionOrSubtraction )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3763:3: lv_right_3_0= ruleAdditionOrSubtraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getShiftOperatorAccess().getRightAdditionOrSubtractionParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8083);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3780:6: ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3780:6: ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3780:7: () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3780:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3781:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,82,FOLLOW_82_in_ruleShiftOperator8112); 

                        	newLeafNode(otherlv_5, grammarAccess.getShiftOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3790:1: ( (lv_right_6_0= ruleAdditionOrSubtraction ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3791:1: (lv_right_6_0= ruleAdditionOrSubtraction )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3791:1: (lv_right_6_0= ruleAdditionOrSubtraction )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3792:3: lv_right_6_0= ruleAdditionOrSubtraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getShiftOperatorAccess().getRightAdditionOrSubtractionParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8133);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3816:1: entryRuleBitwiseAnd returns [EObject current=null] : iv_ruleBitwiseAnd= ruleBitwiseAnd EOF ;
    public final EObject entryRuleBitwiseAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAnd = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3817:2: (iv_ruleBitwiseAnd= ruleBitwiseAnd EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3818:2: iv_ruleBitwiseAnd= ruleBitwiseAnd EOF
            {
             newCompositeNode(grammarAccess.getBitwiseAndRule()); 
            pushFollow(FOLLOW_ruleBitwiseAnd_in_entryRuleBitwiseAnd8172);
            iv_ruleBitwiseAnd=ruleBitwiseAnd();

            state._fsp--;

             current =iv_ruleBitwiseAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAnd8182); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3825:1: ruleBitwiseAnd returns [EObject current=null] : (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? ) ;
    public final EObject ruleBitwiseAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ShiftOperator_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3828:28: ( (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3829:1: (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3829:1: (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3830:5: this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBitwiseAndAccess().getShiftOperatorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd8229);
            this_ShiftOperator_0=ruleShiftOperator();

            state._fsp--;

             
                    current = this_ShiftOperator_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3838:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==76) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3838:2: () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3838:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3839:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,76,FOLLOW_76_in_ruleBitwiseAnd8250); 

                        	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndAccess().getAmpersandKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3848:1: ( (lv_right_3_0= ruleShiftOperator ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3849:1: (lv_right_3_0= ruleShiftOperator )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3849:1: (lv_right_3_0= ruleShiftOperator )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3850:3: lv_right_3_0= ruleShiftOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getBitwiseAndAccess().getRightShiftOperatorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd8271);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3874:1: entryRuleBitwiseXor returns [EObject current=null] : iv_ruleBitwiseXor= ruleBitwiseXor EOF ;
    public final EObject entryRuleBitwiseXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXor = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3875:2: (iv_ruleBitwiseXor= ruleBitwiseXor EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3876:2: iv_ruleBitwiseXor= ruleBitwiseXor EOF
            {
             newCompositeNode(grammarAccess.getBitwiseXorRule()); 
            pushFollow(FOLLOW_ruleBitwiseXor_in_entryRuleBitwiseXor8309);
            iv_ruleBitwiseXor=ruleBitwiseXor();

            state._fsp--;

             current =iv_ruleBitwiseXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXor8319); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3883:1: ruleBitwiseXor returns [EObject current=null] : (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? ) ;
    public final EObject ruleBitwiseXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3886:28: ( (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3887:1: (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3887:1: (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3888:5: this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBitwiseXorAccess().getBitwiseAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor8366);
            this_BitwiseAnd_0=ruleBitwiseAnd();

            state._fsp--;

             
                    current = this_BitwiseAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3896:1: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==83) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3896:2: () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3896:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3897:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,83,FOLLOW_83_in_ruleBitwiseXor8387); 

                        	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorAccess().getCircumflexAccentKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3906:1: ( (lv_right_3_0= ruleBitwiseAnd ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3907:1: (lv_right_3_0= ruleBitwiseAnd )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3907:1: (lv_right_3_0= ruleBitwiseAnd )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3908:3: lv_right_3_0= ruleBitwiseAnd
                    {
                     
                    	        newCompositeNode(grammarAccess.getBitwiseXorAccess().getRightBitwiseAndParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor8408);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3932:1: entryRuleBitwiseOr returns [EObject current=null] : iv_ruleBitwiseOr= ruleBitwiseOr EOF ;
    public final EObject entryRuleBitwiseOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3933:2: (iv_ruleBitwiseOr= ruleBitwiseOr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3934:2: iv_ruleBitwiseOr= ruleBitwiseOr EOF
            {
             newCompositeNode(grammarAccess.getBitwiseOrRule()); 
            pushFollow(FOLLOW_ruleBitwiseOr_in_entryRuleBitwiseOr8446);
            iv_ruleBitwiseOr=ruleBitwiseOr();

            state._fsp--;

             current =iv_ruleBitwiseOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOr8456); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3941:1: ruleBitwiseOr returns [EObject current=null] : (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? ) ;
    public final EObject ruleBitwiseOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXor_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3944:28: ( (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3945:1: (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3945:1: (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3946:5: this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBitwiseOrAccess().getBitwiseXorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr8503);
            this_BitwiseXor_0=ruleBitwiseXor();

            state._fsp--;

             
                    current = this_BitwiseXor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3954:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==84) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3954:2: () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3954:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3955:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,84,FOLLOW_84_in_ruleBitwiseOr8524); 

                        	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrAccess().getVerticalLineKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3964:1: ( (lv_right_3_0= ruleBitwiseXor ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3965:1: (lv_right_3_0= ruleBitwiseXor )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3965:1: (lv_right_3_0= ruleBitwiseXor )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3966:3: lv_right_3_0= ruleBitwiseXor
                    {
                     
                    	        newCompositeNode(grammarAccess.getBitwiseOrAccess().getRightBitwiseXorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr8545);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3990:1: entryRuleComparisonOperators returns [EObject current=null] : iv_ruleComparisonOperators= ruleComparisonOperators EOF ;
    public final EObject entryRuleComparisonOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperators = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3991:2: (iv_ruleComparisonOperators= ruleComparisonOperators EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3992:2: iv_ruleComparisonOperators= ruleComparisonOperators EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorsRule()); 
            pushFollow(FOLLOW_ruleComparisonOperators_in_entryRuleComparisonOperators8583);
            iv_ruleComparisonOperators=ruleComparisonOperators();

            state._fsp--;

             current =iv_ruleComparisonOperators; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperators8593); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3999:1: ruleComparisonOperators returns [EObject current=null] : (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4002:28: ( (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4003:1: (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4003:1: (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4004:5: this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getBitwiseOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8640);
            this_BitwiseOr_0=ruleBitwiseOr();

            state._fsp--;

             
                    current = this_BitwiseOr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4012:1: ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )?
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4012:2: ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4012:2: ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4012:3: () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4012:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4013:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleComparisonOperators8662); 

                        	newLeafNode(otherlv_2, grammarAccess.getComparisonOperatorsAccess().getLessThanSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4022:1: ( (lv_right_3_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4023:1: (lv_right_3_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4023:1: (lv_right_3_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4024:3: lv_right_3_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8683);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4041:6: ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4041:6: ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4041:7: () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4041:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4042:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleComparisonOperators8712); 

                        	newLeafNode(otherlv_5, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4051:1: ( (lv_right_6_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4052:1: (lv_right_6_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4052:1: (lv_right_6_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4053:3: lv_right_6_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8733);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4070:6: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4070:6: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4070:7: () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4070:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4071:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,85,FOLLOW_85_in_ruleComparisonOperators8762); 

                        	newLeafNode(otherlv_8, grammarAccess.getComparisonOperatorsAccess().getLessThanSignEqualsSignKeyword_1_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4080:1: ( (lv_right_9_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4081:1: (lv_right_9_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4081:1: (lv_right_9_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4082:3: lv_right_9_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8783);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4099:6: ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4099:6: ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4099:7: () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4099:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4100:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0(),
                                current);
                        

                    }

                    otherlv_11=(Token)match(input,86,FOLLOW_86_in_ruleComparisonOperators8812); 

                        	newLeafNode(otherlv_11, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4109:1: ( (lv_right_12_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4110:1: (lv_right_12_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4110:1: (lv_right_12_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4111:3: lv_right_12_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8833);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4135:1: entryRuleEqualityOperator returns [EObject current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final EObject entryRuleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperator = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4136:2: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4137:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
             newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            pushFollow(FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator8872);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;

             current =iv_ruleEqualityOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityOperator8882); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4144:1: ruleEqualityOperator returns [EObject current=null] : (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? ) ;
    public final EObject ruleEqualityOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ComparisonOperators_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4147:28: ( (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4148:1: (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4148:1: (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4149:5: this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getEqualityOperatorAccess().getComparisonOperatorsParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8929);
            this_ComparisonOperators_0=ruleComparisonOperators();

            state._fsp--;

             
                    current = this_ComparisonOperators_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4157:1: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )?
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4157:2: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4157:2: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4157:3: () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4157:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4158:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,87,FOLLOW_87_in_ruleEqualityOperator8951); 

                        	newLeafNode(otherlv_2, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4167:1: ( (lv_right_3_0= ruleComparisonOperators ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4168:1: (lv_right_3_0= ruleComparisonOperators )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4168:1: (lv_right_3_0= ruleComparisonOperators )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4169:3: lv_right_3_0= ruleComparisonOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityOperatorAccess().getRightComparisonOperatorsParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8972);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4186:6: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4186:6: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4186:7: () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4186:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4187:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,88,FOLLOW_88_in_ruleEqualityOperator9001); 

                        	newLeafNode(otherlv_5, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4196:1: ( (lv_right_6_0= ruleComparisonOperators ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4197:1: (lv_right_6_0= ruleComparisonOperators )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4197:1: (lv_right_6_0= ruleComparisonOperators )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4198:3: lv_right_6_0= ruleComparisonOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityOperatorAccess().getRightComparisonOperatorsParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator9022);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4222:1: entryRuleBooleanAnd returns [EObject current=null] : iv_ruleBooleanAnd= ruleBooleanAnd EOF ;
    public final EObject entryRuleBooleanAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAnd = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4223:2: (iv_ruleBooleanAnd= ruleBooleanAnd EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4224:2: iv_ruleBooleanAnd= ruleBooleanAnd EOF
            {
             newCompositeNode(grammarAccess.getBooleanAndRule()); 
            pushFollow(FOLLOW_ruleBooleanAnd_in_entryRuleBooleanAnd9061);
            iv_ruleBooleanAnd=ruleBooleanAnd();

            state._fsp--;

             current =iv_ruleBooleanAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAnd9071); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4231:1: ruleBooleanAnd returns [EObject current=null] : (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? ) ;
    public final EObject ruleBooleanAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityOperator_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4234:28: ( (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4235:1: (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4235:1: (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4236:5: this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBooleanAndAccess().getEqualityOperatorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd9118);
            this_EqualityOperator_0=ruleEqualityOperator();

            state._fsp--;

             
                    current = this_EqualityOperator_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4244:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==89) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4244:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4244:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4245:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,89,FOLLOW_89_in_ruleBooleanAnd9139); 

                        	newLeafNode(otherlv_2, grammarAccess.getBooleanAndAccess().getAmpersandAmpersandKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4254:1: ( (lv_right_3_0= ruleEqualityOperator ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4255:1: (lv_right_3_0= ruleEqualityOperator )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4255:1: (lv_right_3_0= ruleEqualityOperator )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4256:3: lv_right_3_0= ruleEqualityOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanAndAccess().getRightEqualityOperatorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd9160);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4282:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4283:2: (iv_ruleAssign= ruleAssign EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4284:2: iv_ruleAssign= ruleAssign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign9200);
            iv_ruleAssign=ruleAssign();

            state._fsp--;

             current =iv_ruleAssign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign9210); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4291:1: ruleAssign returns [EObject current=null] : (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExprLValue_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4294:28: ( (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4295:1: (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4295:1: (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4296:5: this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAssignAccess().getExprLValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprLValue_in_ruleAssign9257);
            this_ExprLValue_0=ruleExprLValue();

            state._fsp--;

             
                    current = this_ExprLValue_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4304:1: ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==50) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4304:2: () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4304:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4305:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAssignAccess().getExprAssignLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleAssign9278); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4314:1: ( (lv_right_3_0= ruleExprUnary ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4315:1: (lv_right_3_0= ruleExprUnary )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4315:1: (lv_right_3_0= ruleExprUnary )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4316:3: lv_right_3_0= ruleExprUnary
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignAccess().getRightExprUnaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprUnary_in_ruleAssign9299);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4340:1: entryRuleExprLambda returns [EObject current=null] : iv_ruleExprLambda= ruleExprLambda EOF ;
    public final EObject entryRuleExprLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLambda = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4341:2: (iv_ruleExprLambda= ruleExprLambda EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4342:2: iv_ruleExprLambda= ruleExprLambda EOF
            {
             newCompositeNode(grammarAccess.getExprLambdaRule()); 
            pushFollow(FOLLOW_ruleExprLambda_in_entryRuleExprLambda9337);
            iv_ruleExprLambda=ruleExprLambda();

            state._fsp--;

             current =iv_ruleExprLambda; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLambda9347); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4349:1: ruleExprLambda returns [EObject current=null] : (otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) ) ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4352:28: ( (otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4353:1: (otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4353:1: (otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4353:3: otherlv_0= '|' ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )? otherlv_4= '|' ( (lv_expr_5_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleExprLambda9384); 

                	newLeafNode(otherlv_0, grammarAccess.getExprLambdaAccess().getVerticalLineKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4357:1: ( ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_IDENT) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4357:2: ( (lv_args_1_0= RULE_IDENT ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )*
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4357:2: ( (lv_args_1_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4358:1: (lv_args_1_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4358:1: (lv_args_1_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4359:3: lv_args_1_0= RULE_IDENT
                    {
                    lv_args_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprLambda9402); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4375:2: (otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==46) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4375:4: otherlv_2= ',' ( (lv_args_3_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprLambda9420); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getExprLambdaAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4379:1: ( (lv_args_3_0= RULE_IDENT ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4380:1: (lv_args_3_0= RULE_IDENT )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4380:1: (lv_args_3_0= RULE_IDENT )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4381:3: lv_args_3_0= RULE_IDENT
                    	    {
                    	    lv_args_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprLambda9437); 

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

            otherlv_4=(Token)match(input,84,FOLLOW_84_in_ruleExprLambda9458); 

                	newLeafNode(otherlv_4, grammarAccess.getExprLambdaAccess().getVerticalLineKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4401:1: ( (lv_expr_5_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4402:1: (lv_expr_5_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4402:1: (lv_expr_5_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4403:3: lv_expr_5_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprLambdaAccess().getExprExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprLambda9479);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4427:1: entryRuleExprWhile returns [EObject current=null] : iv_ruleExprWhile= ruleExprWhile EOF ;
    public final EObject entryRuleExprWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprWhile = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4428:2: (iv_ruleExprWhile= ruleExprWhile EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4429:2: iv_ruleExprWhile= ruleExprWhile EOF
            {
             newCompositeNode(grammarAccess.getExprWhileRule()); 
            pushFollow(FOLLOW_ruleExprWhile_in_entryRuleExprWhile9515);
            iv_ruleExprWhile=ruleExprWhile();

            state._fsp--;

             current =iv_ruleExprWhile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprWhile9525); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4436:1: ruleExprWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ) ;
    public final EObject ruleExprWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4439:28: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4440:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4440:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4440:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,90,FOLLOW_90_in_ruleExprWhile9562); 

                	newLeafNode(otherlv_0, grammarAccess.getExprWhileAccess().getWhileKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4444:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4445:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4445:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4446:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprWhileAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprWhile9583);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4462:2: ( (lv_block_2_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4463:1: (lv_block_2_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4463:1: (lv_block_2_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4464:3: lv_block_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprWhileAccess().getBlockBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprWhile9604);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4488:1: entryRuleExprLoop returns [EObject current=null] : iv_ruleExprLoop= ruleExprLoop EOF ;
    public final EObject entryRuleExprLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLoop = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4489:2: (iv_ruleExprLoop= ruleExprLoop EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4490:2: iv_ruleExprLoop= ruleExprLoop EOF
            {
             newCompositeNode(grammarAccess.getExprLoopRule()); 
            pushFollow(FOLLOW_ruleExprLoop_in_entryRuleExprLoop9640);
            iv_ruleExprLoop=ruleExprLoop();

            state._fsp--;

             current =iv_ruleExprLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLoop9650); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4497:1: ruleExprLoop returns [EObject current=null] : ( ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) ) ) ;
    public final EObject ruleExprLoop() throws RecognitionException {
        EObject current = null;

        Token lv_lifetime_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_block_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4500:28: ( ( ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4501:1: ( ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4501:1: ( ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4501:2: ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )? otherlv_2= 'loop' ( (lv_block_3_0= ruleBlock ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4501:2: ( ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_LIFETIME) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4501:3: ( (lv_lifetime_0_0= RULE_LIFETIME ) ) otherlv_1= ':'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4501:3: ( (lv_lifetime_0_0= RULE_LIFETIME ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4502:1: (lv_lifetime_0_0= RULE_LIFETIME )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4502:1: (lv_lifetime_0_0= RULE_LIFETIME )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4503:3: lv_lifetime_0_0= RULE_LIFETIME
                    {
                    lv_lifetime_0_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprLoop9693); 

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

                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleExprLoop9710); 

                        	newLeafNode(otherlv_1, grammarAccess.getExprLoopAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,91,FOLLOW_91_in_ruleExprLoop9724); 

                	newLeafNode(otherlv_2, grammarAccess.getExprLoopAccess().getLoopKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4527:1: ( (lv_block_3_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4528:1: (lv_block_3_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4528:1: (lv_block_3_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4529:3: lv_block_3_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprLoopAccess().getBlockBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprLoop9745);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4553:1: entryRuleExprBreak returns [EObject current=null] : iv_ruleExprBreak= ruleExprBreak EOF ;
    public final EObject entryRuleExprBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBreak = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4554:2: (iv_ruleExprBreak= ruleExprBreak EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4555:2: iv_ruleExprBreak= ruleExprBreak EOF
            {
             newCompositeNode(grammarAccess.getExprBreakRule()); 
            pushFollow(FOLLOW_ruleExprBreak_in_entryRuleExprBreak9781);
            iv_ruleExprBreak=ruleExprBreak();

            state._fsp--;

             current =iv_ruleExprBreak; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBreak9791); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4562:1: ruleExprBreak returns [EObject current=null] : ( () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? ) ;
    public final EObject ruleExprBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lifetime_2_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4565:28: ( ( () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4566:1: ( () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4566:1: ( () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4566:2: () otherlv_1= 'break' ( (lv_lifetime_2_0= RULE_LIFETIME ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4566:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4567:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExprBreakAccess().getExprBreakAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleExprBreak9837); 

                	newLeafNode(otherlv_1, grammarAccess.getExprBreakAccess().getBreakKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4576:1: ( (lv_lifetime_2_0= RULE_LIFETIME ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_LIFETIME) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4577:1: (lv_lifetime_2_0= RULE_LIFETIME )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4577:1: (lv_lifetime_2_0= RULE_LIFETIME )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4578:3: lv_lifetime_2_0= RULE_LIFETIME
                    {
                    lv_lifetime_2_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprBreak9854); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4602:1: entryRuleExprContinue returns [EObject current=null] : iv_ruleExprContinue= ruleExprContinue EOF ;
    public final EObject entryRuleExprContinue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprContinue = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4603:2: (iv_ruleExprContinue= ruleExprContinue EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4604:2: iv_ruleExprContinue= ruleExprContinue EOF
            {
             newCompositeNode(grammarAccess.getExprContinueRule()); 
            pushFollow(FOLLOW_ruleExprContinue_in_entryRuleExprContinue9896);
            iv_ruleExprContinue=ruleExprContinue();

            state._fsp--;

             current =iv_ruleExprContinue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprContinue9906); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4611:1: ruleExprContinue returns [EObject current=null] : ( () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? ) ;
    public final EObject ruleExprContinue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lifetime_2_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4614:28: ( ( () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4615:1: ( () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4615:1: ( () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4615:2: () otherlv_1= 'continue' ( (lv_lifetime_2_0= RULE_LIFETIME ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4615:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4616:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExprContinueAccess().getExprContinueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleExprContinue9952); 

                	newLeafNode(otherlv_1, grammarAccess.getExprContinueAccess().getContinueKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4625:1: ( (lv_lifetime_2_0= RULE_LIFETIME ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_LIFETIME) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4626:1: (lv_lifetime_2_0= RULE_LIFETIME )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4626:1: (lv_lifetime_2_0= RULE_LIFETIME )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4627:3: lv_lifetime_2_0= RULE_LIFETIME
                    {
                    lv_lifetime_2_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprContinue9969); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4651:1: entryRuleExprDo returns [EObject current=null] : iv_ruleExprDo= ruleExprDo EOF ;
    public final EObject entryRuleExprDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprDo = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4652:2: (iv_ruleExprDo= ruleExprDo EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4653:2: iv_ruleExprDo= ruleExprDo EOF
            {
             newCompositeNode(grammarAccess.getExprDoRule()); 
            pushFollow(FOLLOW_ruleExprDo_in_entryRuleExprDo10011);
            iv_ruleExprDo=ruleExprDo();

            state._fsp--;

             current =iv_ruleExprDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprDo10021); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4660:1: ruleExprDo returns [EObject current=null] : (otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) ) ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4663:28: ( (otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4664:1: (otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4664:1: (otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4664:3: otherlv_0= 'do' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= '|' ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )? otherlv_6= '|' ( (lv_block_7_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleExprDo10058); 

                	newLeafNode(otherlv_0, grammarAccess.getExprDoAccess().getDoKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4668:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4669:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4669:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4670:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprDoAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprDo10079);
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

            otherlv_2=(Token)match(input,84,FOLLOW_84_in_ruleExprDo10091); 

                	newLeafNode(otherlv_2, grammarAccess.getExprDoAccess().getVerticalLineKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4690:1: ( ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_IDENT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4690:2: ( (lv_args_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )*
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4690:2: ( (lv_args_3_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4691:1: (lv_args_3_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4691:1: (lv_args_3_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4692:3: lv_args_3_0= RULE_IDENT
                    {
                    lv_args_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprDo10109); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4708:2: (otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==46) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4708:4: otherlv_4= ',' ( (lv_args_5_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleExprDo10127); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getExprDoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4712:1: ( (lv_args_5_0= RULE_IDENT ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4713:1: (lv_args_5_0= RULE_IDENT )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4713:1: (lv_args_5_0= RULE_IDENT )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4714:3: lv_args_5_0= RULE_IDENT
                    	    {
                    	    lv_args_5_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprDo10144); 

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

            otherlv_6=(Token)match(input,84,FOLLOW_84_in_ruleExprDo10165); 

                	newLeafNode(otherlv_6, grammarAccess.getExprDoAccess().getVerticalLineKeyword_4());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4734:1: ( (lv_block_7_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4735:1: (lv_block_7_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4735:1: (lv_block_7_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4736:3: lv_block_7_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprDoAccess().getBlockBlockParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprDo10186);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4760:1: entryRuleExprFor returns [EObject current=null] : iv_ruleExprFor= ruleExprFor EOF ;
    public final EObject entryRuleExprFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprFor = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4761:2: (iv_ruleExprFor= ruleExprFor EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4762:2: iv_ruleExprFor= ruleExprFor EOF
            {
             newCompositeNode(grammarAccess.getExprForRule()); 
            pushFollow(FOLLOW_ruleExprFor_in_entryRuleExprFor10222);
            iv_ruleExprFor=ruleExprFor();

            state._fsp--;

             current =iv_ruleExprFor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprFor10232); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4769:1: ruleExprFor returns [EObject current=null] : (otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleExprFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_pat_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4772:28: ( (otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4773:1: (otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4773:1: (otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4773:3: otherlv_0= 'for' ( (lv_pat_1_0= rulePat ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleExprFor10269); 

                	newLeafNode(otherlv_0, grammarAccess.getExprForAccess().getForKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4777:1: ( (lv_pat_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4778:1: (lv_pat_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4778:1: (lv_pat_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4779:3: lv_pat_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getExprForAccess().getPatPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_ruleExprFor10290);
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

            otherlv_2=(Token)match(input,95,FOLLOW_95_in_ruleExprFor10302); 

                	newLeafNode(otherlv_2, grammarAccess.getExprForAccess().getInKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4799:1: ( (lv_expr_3_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4800:1: (lv_expr_3_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4800:1: (lv_expr_3_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4801:3: lv_expr_3_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprForAccess().getExprExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprFor10323);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4817:2: ( (lv_block_4_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4818:1: (lv_block_4_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4818:1: (lv_block_4_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4819:3: lv_block_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprForAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprFor10344);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4843:1: entryRuleExprIf returns [EObject current=null] : iv_ruleExprIf= ruleExprIf EOF ;
    public final EObject entryRuleExprIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprIf = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4844:2: (iv_ruleExprIf= ruleExprIf EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4845:2: iv_ruleExprIf= ruleExprIf EOF
            {
             newCompositeNode(grammarAccess.getExprIfRule()); 
            pushFollow(FOLLOW_ruleExprIf_in_entryRuleExprIf10380);
            iv_ruleExprIf=ruleExprIf();

            state._fsp--;

             current =iv_ruleExprIf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprIf10390); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4852:1: ruleExprIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )? ) ;
    public final EObject ruleExprIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;

        EObject lv_block_2_0 = null;

        EObject lv_else_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4855:28: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4856:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4856:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4856:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) ( (lv_block_2_0= ruleBlock ) ) ( (lv_else_3_0= ruleElseTail ) )?
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleExprIf10427); 

                	newLeafNode(otherlv_0, grammarAccess.getExprIfAccess().getIfKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4860:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4861:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4861:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4862:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprIfAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprIf10448);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4878:2: ( (lv_block_2_0= ruleBlock ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4879:1: (lv_block_2_0= ruleBlock )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4879:1: (lv_block_2_0= ruleBlock )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4880:3: lv_block_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getExprIfAccess().getBlockBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleExprIf10469);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4896:2: ( (lv_else_3_0= ruleElseTail ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==97) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4897:1: (lv_else_3_0= ruleElseTail )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4897:1: (lv_else_3_0= ruleElseTail )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4898:3: lv_else_3_0= ruleElseTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprIfAccess().getElseElseTailParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElseTail_in_ruleExprIf10490);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4922:1: entryRuleElseTail returns [EObject current=null] : iv_ruleElseTail= ruleElseTail EOF ;
    public final EObject entryRuleElseTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseTail = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4923:2: (iv_ruleElseTail= ruleElseTail EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4924:2: iv_ruleElseTail= ruleElseTail EOF
            {
             newCompositeNode(grammarAccess.getElseTailRule()); 
            pushFollow(FOLLOW_ruleElseTail_in_entryRuleElseTail10527);
            iv_ruleElseTail=ruleElseTail();

            state._fsp--;

             current =iv_ruleElseTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseTail10537); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4931:1: ruleElseTail returns [EObject current=null] : (otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) ) ) ;
    public final EObject ruleElseTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ExprIf_1 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4934:28: ( (otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4935:1: (otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4935:1: (otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4935:3: otherlv_0= 'else' (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleElseTail10574); 

                	newLeafNode(otherlv_0, grammarAccess.getElseTailAccess().getElseKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4939:1: (this_ExprIf_1= ruleExprIf | ( (lv_block_2_0= ruleBlock ) ) )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4940:5: this_ExprIf_1= ruleExprIf
                    {
                     
                            newCompositeNode(grammarAccess.getElseTailAccess().getExprIfParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleExprIf_in_ruleElseTail10597);
                    this_ExprIf_1=ruleExprIf();

                    state._fsp--;

                     
                            current = this_ExprIf_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4949:6: ( (lv_block_2_0= ruleBlock ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4949:6: ( (lv_block_2_0= ruleBlock ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4950:1: (lv_block_2_0= ruleBlock )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4950:1: (lv_block_2_0= ruleBlock )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4951:3: lv_block_2_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getElseTailAccess().getBlockBlockParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleElseTail10623);
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


    // $ANTLR start "entryRuleBlock"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4975:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4976:2: (iv_ruleBlock= ruleBlock EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4977:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock10660);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock10670); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4984:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4987:28: ( ( () otherlv_1= '{' otherlv_2= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4988:1: ( () otherlv_1= '{' otherlv_2= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4988:1: ( () otherlv_1= '{' otherlv_2= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4988:2: () otherlv_1= '{' otherlv_2= '}'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4988:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4989:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleBlock10716); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleBlock10728); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5010:1: entryRuleGenericParamDecl returns [EObject current=null] : iv_ruleGenericParamDecl= ruleGenericParamDecl EOF ;
    public final EObject entryRuleGenericParamDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericParamDecl = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5011:2: (iv_ruleGenericParamDecl= ruleGenericParamDecl EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5012:2: iv_ruleGenericParamDecl= ruleGenericParamDecl EOF
            {
             newCompositeNode(grammarAccess.getGenericParamDeclRule()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl10764);
            iv_ruleGenericParamDecl=ruleGenericParamDecl();

            state._fsp--;

             current =iv_ruleGenericParamDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericParamDecl10774); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5019:1: ruleGenericParamDecl returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? ) ;
    public final EObject ruleGenericParamDecl() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        Token lv_bounds_2_0=null;
        Token otherlv_3=null;
        Token lv_bounds_4_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5022:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5023:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5023:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5023:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5023:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5024:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5024:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5025:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl10816); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5041:2: (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==68) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5041:4: otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleGenericParamDecl10834); 

                        	newLeafNode(otherlv_1, grammarAccess.getGenericParamDeclAccess().getColonKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5045:1: ( (lv_bounds_2_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5046:1: (lv_bounds_2_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5046:1: (lv_bounds_2_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5047:3: lv_bounds_2_0= RULE_IDENT
                    {
                    lv_bounds_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl10851); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5063:2: (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5063:4: otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) )
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_80_in_ruleGenericParamDecl10869); 

                        	newLeafNode(otherlv_3, grammarAccess.getGenericParamDeclAccess().getPlusSignKeyword_1_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5067:1: ( (lv_bounds_4_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5068:1: (lv_bounds_4_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5068:1: (lv_bounds_4_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5069:3: lv_bounds_4_0= RULE_IDENT
                    {
                    lv_bounds_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl10886); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5093:1: entryRuleArg returns [EObject current=null] : iv_ruleArg= ruleArg EOF ;
    public final EObject entryRuleArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5094:2: (iv_ruleArg= ruleArg EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5095:2: iv_ruleArg= ruleArg EOF
            {
             newCompositeNode(grammarAccess.getArgRule()); 
            pushFollow(FOLLOW_ruleArg_in_entryRuleArg10930);
            iv_ruleArg=ruleArg();

            state._fsp--;

             current =iv_ruleArg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg10940); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5102:1: ruleArg returns [EObject current=null] : ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pat_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5105:28: ( ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5106:1: ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5106:1: ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5106:2: ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5106:2: ( (lv_pat_0_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5107:1: (lv_pat_0_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5107:1: (lv_pat_0_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5108:3: lv_pat_0_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getArgAccess().getPatPatParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_ruleArg10986);
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

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleArg10998); 

                	newLeafNode(otherlv_1, grammarAccess.getArgAccess().getColonKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5128:1: ( (lv_type_2_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5129:1: (lv_type_2_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5129:1: (lv_type_2_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5130:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArg11019);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5154:1: entryRulePat returns [EObject current=null] : iv_rulePat= rulePat EOF ;
    public final EObject entryRulePat() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePat = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5155:2: (iv_rulePat= rulePat EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5156:2: iv_rulePat= rulePat EOF
            {
             newCompositeNode(grammarAccess.getPatRule()); 
            pushFollow(FOLLOW_rulePat_in_entryRulePat11055);
            iv_rulePat=rulePat();

            state._fsp--;

             current =iv_rulePat; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePat11065); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5163:1: rulePat returns [EObject current=null] : (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum ) ;
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

        EObject this_PatRange_8 = null;

        EObject this_PatEnum_9 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5166:28: ( (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5167:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5167:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum )
            int alt88=10;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5168:5: this_PatWildcard_0= rulePatWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatWildcardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePatWildcard_in_rulePat11112);
                    this_PatWildcard_0=rulePatWildcard();

                    state._fsp--;

                     
                            current = this_PatWildcard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5178:5: this_PatIdent_1= rulePatIdent
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatIdentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePatIdent_in_rulePat11139);
                    this_PatIdent_1=rulePatIdent();

                    state._fsp--;

                     
                            current = this_PatIdent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5188:5: this_PatBoxed_2= rulePatBoxed
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatBoxedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePatBoxed_in_rulePat11166);
                    this_PatBoxed_2=rulePatBoxed();

                    state._fsp--;

                     
                            current = this_PatBoxed_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5198:5: this_PatOwned_3= rulePatOwned
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatOwnedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePatOwned_in_rulePat11193);
                    this_PatOwned_3=rulePatOwned();

                    state._fsp--;

                     
                            current = this_PatOwned_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5208:5: this_PatBorrowed_4= rulePatBorrowed
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatBorrowedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePatBorrowed_in_rulePat11220);
                    this_PatBorrowed_4=rulePatBorrowed();

                    state._fsp--;

                     
                            current = this_PatBorrowed_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5218:5: this_PatTuple_5= rulePatTuple
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatTupleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePatTuple_in_rulePat11247);
                    this_PatTuple_5=rulePatTuple();

                    state._fsp--;

                     
                            current = this_PatTuple_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5228:5: this_PatVector_6= rulePatVector
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatVectorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePatVector_in_rulePat11274);
                    this_PatVector_6=rulePatVector();

                    state._fsp--;

                     
                            current = this_PatVector_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5238:5: this_PatLiteral_7= rulePatLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatLiteralParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulePatLiteral_in_rulePat11301);
                    this_PatLiteral_7=rulePatLiteral();

                    state._fsp--;

                     
                            current = this_PatLiteral_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5248:5: this_PatRange_8= rulePatRange
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatRangeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePatRange_in_rulePat11328);
                    this_PatRange_8=rulePatRange();

                    state._fsp--;

                     
                            current = this_PatRange_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5258:5: this_PatEnum_9= rulePatEnum
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatEnumParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_rulePatEnum_in_rulePat11355);
                    this_PatEnum_9=rulePatEnum();

                    state._fsp--;

                     
                            current = this_PatEnum_9; 
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5274:1: entryRulePatWildcard returns [EObject current=null] : iv_rulePatWildcard= rulePatWildcard EOF ;
    public final EObject entryRulePatWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatWildcard = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5275:2: (iv_rulePatWildcard= rulePatWildcard EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5276:2: iv_rulePatWildcard= rulePatWildcard EOF
            {
             newCompositeNode(grammarAccess.getPatWildcardRule()); 
            pushFollow(FOLLOW_rulePatWildcard_in_entryRulePatWildcard11390);
            iv_rulePatWildcard=rulePatWildcard();

            state._fsp--;

             current =iv_rulePatWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatWildcard11400); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5283:1: rulePatWildcard returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject rulePatWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5286:28: ( ( () otherlv_1= '_' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5287:1: ( () otherlv_1= '_' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5287:1: ( () otherlv_1= '_' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5287:2: () otherlv_1= '_'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5287:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5288:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPatWildcardAccess().getPatWildcardAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,98,FOLLOW_98_in_rulePatWildcard11446); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5305:1: entryRulePatIdent returns [EObject current=null] : iv_rulePatIdent= rulePatIdent EOF ;
    public final EObject entryRulePatIdent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatIdent = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5306:2: (iv_rulePatIdent= rulePatIdent EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5307:2: iv_rulePatIdent= rulePatIdent EOF
            {
             newCompositeNode(grammarAccess.getPatIdentRule()); 
            pushFollow(FOLLOW_rulePatIdent_in_entryRulePatIdent11482);
            iv_rulePatIdent=rulePatIdent();

            state._fsp--;

             current =iv_rulePatIdent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatIdent11492); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5314:1: rulePatIdent returns [EObject current=null] : ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) ) ;
    public final EObject rulePatIdent() throws RecognitionException {
        EObject current = null;

        Token lv_mutable_0_0=null;
        Token lv_ident_1_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5317:28: ( ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5318:1: ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5318:1: ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5318:2: ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5318:2: ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5319:1: (lv_mutable_0_0= RULE_MUT_KEYWORD )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5319:1: (lv_mutable_0_0= RULE_MUT_KEYWORD )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5320:3: lv_mutable_0_0= RULE_MUT_KEYWORD
            {
            lv_mutable_0_0=(Token)match(input,RULE_MUT_KEYWORD,FOLLOW_RULE_MUT_KEYWORD_in_rulePatIdent11534); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5336:2: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5337:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5337:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5338:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePatIdent11556); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5362:1: entryRulePatBoxed returns [EObject current=null] : iv_rulePatBoxed= rulePatBoxed EOF ;
    public final EObject entryRulePatBoxed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatBoxed = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5363:2: (iv_rulePatBoxed= rulePatBoxed EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5364:2: iv_rulePatBoxed= rulePatBoxed EOF
            {
             newCompositeNode(grammarAccess.getPatBoxedRule()); 
            pushFollow(FOLLOW_rulePatBoxed_in_entryRulePatBoxed11597);
            iv_rulePatBoxed=rulePatBoxed();

            state._fsp--;

             current =iv_rulePatBoxed; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBoxed11607); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5371:1: rulePatBoxed returns [EObject current=null] : (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatBoxed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5374:28: ( (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5375:1: (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5375:1: (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5375:3: otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_rulePatBoxed11644); 

                	newLeafNode(otherlv_0, grammarAccess.getPatBoxedAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5379:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5380:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5380:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5381:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatBoxedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatBoxed11665);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5405:1: entryRulePatOwned returns [EObject current=null] : iv_rulePatOwned= rulePatOwned EOF ;
    public final EObject entryRulePatOwned() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatOwned = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5406:2: (iv_rulePatOwned= rulePatOwned EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5407:2: iv_rulePatOwned= rulePatOwned EOF
            {
             newCompositeNode(grammarAccess.getPatOwnedRule()); 
            pushFollow(FOLLOW_rulePatOwned_in_entryRulePatOwned11701);
            iv_rulePatOwned=rulePatOwned();

            state._fsp--;

             current =iv_rulePatOwned; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatOwned11711); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5414:1: rulePatOwned returns [EObject current=null] : (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatOwned() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5417:28: ( (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5418:1: (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5418:1: (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5418:3: otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_rulePatOwned11748); 

                	newLeafNode(otherlv_0, grammarAccess.getPatOwnedAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5422:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5423:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5423:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5424:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatOwnedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatOwned11769);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5448:1: entryRulePatBorrowed returns [EObject current=null] : iv_rulePatBorrowed= rulePatBorrowed EOF ;
    public final EObject entryRulePatBorrowed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatBorrowed = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5449:2: (iv_rulePatBorrowed= rulePatBorrowed EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5450:2: iv_rulePatBorrowed= rulePatBorrowed EOF
            {
             newCompositeNode(grammarAccess.getPatBorrowedRule()); 
            pushFollow(FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed11805);
            iv_rulePatBorrowed=rulePatBorrowed();

            state._fsp--;

             current =iv_rulePatBorrowed; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBorrowed11815); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5457:1: rulePatBorrowed returns [EObject current=null] : (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatBorrowed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5460:28: ( (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5461:1: (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5461:1: (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5461:3: otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_rulePatBorrowed11852); 

                	newLeafNode(otherlv_0, grammarAccess.getPatBorrowedAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5465:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5466:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5466:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5467:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatBorrowedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatBorrowed11873);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5491:1: entryRulePatTuple returns [EObject current=null] : iv_rulePatTuple= rulePatTuple EOF ;
    public final EObject entryRulePatTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatTuple = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5492:2: (iv_rulePatTuple= rulePatTuple EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5493:2: iv_rulePatTuple= rulePatTuple EOF
            {
             newCompositeNode(grammarAccess.getPatTupleRule()); 
            pushFollow(FOLLOW_rulePatTuple_in_entryRulePatTuple11909);
            iv_rulePatTuple=rulePatTuple();

            state._fsp--;

             current =iv_rulePatTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatTuple11919); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5500:1: rulePatTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' ) ;
    public final EObject rulePatTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_patterns_1_0 = null;

        EObject lv_patterns_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5503:28: ( (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5504:1: (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5504:1: (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5504:3: otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulePatTuple11956); 

                	newLeafNode(otherlv_0, grammarAccess.getPatTupleAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5508:1: ( (lv_patterns_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5509:1: (lv_patterns_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5509:1: (lv_patterns_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5510:3: lv_patterns_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatTuple11977);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5526:2: (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==46) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5526:4: otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulePatTuple11990); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPatTupleAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5530:1: ( (lv_patterns_3_0= rulePat ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5531:1: (lv_patterns_3_0= rulePat )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5531:1: (lv_patterns_3_0= rulePat )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5532:3: lv_patterns_3_0= rulePat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePat_in_rulePatTuple12011);
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
            	    break loop89;
                }
            } while (true);

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_rulePatTuple12025); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5560:1: entryRulePatVector returns [EObject current=null] : iv_rulePatVector= rulePatVector EOF ;
    public final EObject entryRulePatVector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatVector = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5561:2: (iv_rulePatVector= rulePatVector EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5562:2: iv_rulePatVector= rulePatVector EOF
            {
             newCompositeNode(grammarAccess.getPatVectorRule()); 
            pushFollow(FOLLOW_rulePatVector_in_entryRulePatVector12061);
            iv_rulePatVector=rulePatVector();

            state._fsp--;

             current =iv_rulePatVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatVector12071); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5569:1: rulePatVector returns [EObject current=null] : (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' ) ;
    public final EObject rulePatVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_patterns_1_0 = null;

        EObject lv_patterns_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5572:28: ( (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5573:1: (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5573:1: (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5573:3: otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_rulePatVector12108); 

                	newLeafNode(otherlv_0, grammarAccess.getPatVectorAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5577:1: ( (lv_patterns_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5578:1: (lv_patterns_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5578:1: (lv_patterns_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5579:3: lv_patterns_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatVector12129);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5595:2: (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==46) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5595:4: otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulePatVector12142); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPatVectorAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5599:1: ( (lv_patterns_3_0= rulePat ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5600:1: (lv_patterns_3_0= rulePat )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5600:1: (lv_patterns_3_0= rulePat )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5601:3: lv_patterns_3_0= rulePat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePat_in_rulePatVector12163);
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
            	    break loop90;
                }
            } while (true);

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_rulePatVector12177); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5629:1: entryRulePatLiteral returns [EObject current=null] : iv_rulePatLiteral= rulePatLiteral EOF ;
    public final EObject entryRulePatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5630:2: (iv_rulePatLiteral= rulePatLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5631:2: iv_rulePatLiteral= rulePatLiteral EOF
            {
             newCompositeNode(grammarAccess.getPatLiteralRule()); 
            pushFollow(FOLLOW_rulePatLiteral_in_entryRulePatLiteral12213);
            iv_rulePatLiteral=rulePatLiteral();

            state._fsp--;

             current =iv_rulePatLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatLiteral12223); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5638:1: rulePatLiteral returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject rulePatLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5641:28: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5642:1: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5642:1: ( (lv_literal_0_0= ruleLiteral ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5643:1: (lv_literal_0_0= ruleLiteral )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5643:1: (lv_literal_0_0= ruleLiteral )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5644:3: lv_literal_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getPatLiteralAccess().getLiteralLiteralParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_rulePatLiteral12268);
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


    // $ANTLR start "entryRulePatRange"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5668:1: entryRulePatRange returns [EObject current=null] : iv_rulePatRange= rulePatRange EOF ;
    public final EObject entryRulePatRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatRange = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5669:2: (iv_rulePatRange= rulePatRange EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5670:2: iv_rulePatRange= rulePatRange EOF
            {
             newCompositeNode(grammarAccess.getPatRangeRule()); 
            pushFollow(FOLLOW_rulePatRange_in_entryRulePatRange12303);
            iv_rulePatRange=rulePatRange();

            state._fsp--;

             current =iv_rulePatRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatRange12313); 

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
    // $ANTLR end "entryRulePatRange"


    // $ANTLR start "rulePatRange"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5677:1: rulePatRange returns [EObject current=null] : (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange ) ;
    public final EObject rulePatRange() throws RecognitionException {
        EObject current = null;

        EObject this_PatCharRange_0 = null;

        EObject this_PatNumberRange_1 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5680:28: ( (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5681:1: (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5681:1: (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_CHAR_LIT) ) {
                alt91=1;
            }
            else if ( ((LA91_0>=RULE_FLOAT_LIT && LA91_0<=RULE_INT_LIT)) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5682:5: this_PatCharRange_0= rulePatCharRange
                    {
                     
                            newCompositeNode(grammarAccess.getPatRangeAccess().getPatCharRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePatCharRange_in_rulePatRange12360);
                    this_PatCharRange_0=rulePatCharRange();

                    state._fsp--;

                     
                            current = this_PatCharRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5692:5: this_PatNumberRange_1= rulePatNumberRange
                    {
                     
                            newCompositeNode(grammarAccess.getPatRangeAccess().getPatNumberRangeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePatNumberRange_in_rulePatRange12387);
                    this_PatNumberRange_1=rulePatNumberRange();

                    state._fsp--;

                     
                            current = this_PatNumberRange_1; 
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
    // $ANTLR end "rulePatRange"


    // $ANTLR start "entryRulePatCharRange"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5708:1: entryRulePatCharRange returns [EObject current=null] : iv_rulePatCharRange= rulePatCharRange EOF ;
    public final EObject entryRulePatCharRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatCharRange = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5709:2: (iv_rulePatCharRange= rulePatCharRange EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5710:2: iv_rulePatCharRange= rulePatCharRange EOF
            {
             newCompositeNode(grammarAccess.getPatCharRangeRule()); 
            pushFollow(FOLLOW_rulePatCharRange_in_entryRulePatCharRange12422);
            iv_rulePatCharRange=rulePatCharRange();

            state._fsp--;

             current =iv_rulePatCharRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatCharRange12432); 

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
    // $ANTLR end "entryRulePatCharRange"


    // $ANTLR start "rulePatCharRange"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5717:1: rulePatCharRange returns [EObject current=null] : ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) ) ;
    public final EObject rulePatCharRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5720:28: ( ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5721:1: ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5721:1: ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5721:2: ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5721:2: ( (lv_start_0_0= ruleCharLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5722:1: (lv_start_0_0= ruleCharLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5722:1: (lv_start_0_0= ruleCharLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5723:3: lv_start_0_0= ruleCharLit
            {
             
            	        newCompositeNode(grammarAccess.getPatCharRangeAccess().getStartCharLitParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCharLit_in_rulePatCharRange12478);
            lv_start_0_0=ruleCharLit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatCharRangeRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_0_0, 
                    		"CharLit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_rulePatCharRange12490); 

                	newLeafNode(otherlv_1, grammarAccess.getPatCharRangeAccess().getFullStopFullStopKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5743:1: ( (lv_end_2_0= ruleCharLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5744:1: (lv_end_2_0= ruleCharLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5744:1: (lv_end_2_0= ruleCharLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5745:3: lv_end_2_0= ruleCharLit
            {
             
            	        newCompositeNode(grammarAccess.getPatCharRangeAccess().getEndCharLitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCharLit_in_rulePatCharRange12511);
            lv_end_2_0=ruleCharLit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatCharRangeRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_2_0, 
                    		"CharLit");
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
    // $ANTLR end "rulePatCharRange"


    // $ANTLR start "entryRulePatNumberRange"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5769:1: entryRulePatNumberRange returns [EObject current=null] : iv_rulePatNumberRange= rulePatNumberRange EOF ;
    public final EObject entryRulePatNumberRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatNumberRange = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5770:2: (iv_rulePatNumberRange= rulePatNumberRange EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5771:2: iv_rulePatNumberRange= rulePatNumberRange EOF
            {
             newCompositeNode(grammarAccess.getPatNumberRangeRule()); 
            pushFollow(FOLLOW_rulePatNumberRange_in_entryRulePatNumberRange12547);
            iv_rulePatNumberRange=rulePatNumberRange();

            state._fsp--;

             current =iv_rulePatNumberRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatNumberRange12557); 

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
    // $ANTLR end "entryRulePatNumberRange"


    // $ANTLR start "rulePatNumberRange"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5778:1: rulePatNumberRange returns [EObject current=null] : ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) ) ;
    public final EObject rulePatNumberRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5781:28: ( ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5782:1: ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5782:1: ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5782:2: ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5782:2: ( (lv_start_0_0= ruleNumberLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5783:1: (lv_start_0_0= ruleNumberLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5783:1: (lv_start_0_0= ruleNumberLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5784:3: lv_start_0_0= ruleNumberLit
            {
             
            	        newCompositeNode(grammarAccess.getPatNumberRangeAccess().getStartNumberLitParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberLit_in_rulePatNumberRange12603);
            lv_start_0_0=ruleNumberLit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatNumberRangeRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_0_0, 
                    		"NumberLit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_rulePatNumberRange12615); 

                	newLeafNode(otherlv_1, grammarAccess.getPatNumberRangeAccess().getFullStopFullStopKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5804:1: ( (lv_end_2_0= ruleNumberLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5805:1: (lv_end_2_0= ruleNumberLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5805:1: (lv_end_2_0= ruleNumberLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5806:3: lv_end_2_0= ruleNumberLit
            {
             
            	        newCompositeNode(grammarAccess.getPatNumberRangeAccess().getEndNumberLitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberLit_in_rulePatNumberRange12636);
            lv_end_2_0=ruleNumberLit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatNumberRangeRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_2_0, 
                    		"NumberLit");
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
    // $ANTLR end "rulePatNumberRange"


    // $ANTLR start "entryRulePatEnum"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5830:1: entryRulePatEnum returns [EObject current=null] : iv_rulePatEnum= rulePatEnum EOF ;
    public final EObject entryRulePatEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatEnum = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5831:2: (iv_rulePatEnum= rulePatEnum EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5832:2: iv_rulePatEnum= rulePatEnum EOF
            {
             newCompositeNode(grammarAccess.getPatEnumRule()); 
            pushFollow(FOLLOW_rulePatEnum_in_entryRulePatEnum12672);
            iv_rulePatEnum=rulePatEnum();

            state._fsp--;

             current =iv_rulePatEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatEnum12682); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5839:1: rulePatEnum returns [EObject current=null] : ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5842:28: ( ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5843:1: ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5843:1: ( ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5843:2: ( (lv_path_0_0= ruleExprPath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5843:2: ( (lv_path_0_0= ruleExprPath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5844:1: (lv_path_0_0= ruleExprPath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5844:1: (lv_path_0_0= ruleExprPath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5845:3: lv_path_0_0= ruleExprPath
            {
             
            	        newCompositeNode(grammarAccess.getPatEnumAccess().getPathExprPathParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExprPath_in_rulePatEnum12728);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5861:2: ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==48) ) {
                alt95=1;
            }
            else if ( (LA95_0==53) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5861:3: ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5861:3: ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5861:4: () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5861:4: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5862:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPatEnumAccess().getPatTupleEnumPathAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_rulePatEnum12751); 

                        	newLeafNode(otherlv_2, grammarAccess.getPatEnumAccess().getLeftParenthesisKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5871:1: (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) )
                    int alt93=3;
                    switch ( input.LA(1) ) {
                    case 72:
                        {
                        alt93=1;
                        }
                        break;
                    case 69:
                        {
                        alt93=2;
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
                    case 98:
                        {
                        alt93=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }

                    switch (alt93) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5871:3: otherlv_3= '*'
                            {
                            otherlv_3=(Token)match(input,72,FOLLOW_72_in_rulePatEnum12764); 

                                	newLeafNode(otherlv_3, grammarAccess.getPatEnumAccess().getAsteriskKeyword_1_0_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5876:7: otherlv_4= '..'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_rulePatEnum12782); 

                                	newLeafNode(otherlv_4, grammarAccess.getPatEnumAccess().getFullStopFullStopKeyword_1_0_2_1());
                                

                            }
                            break;
                        case 3 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5881:6: ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5881:6: ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5881:7: ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )*
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5881:7: ( (lv_patterns_5_0= rulePat ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5882:1: (lv_patterns_5_0= rulePat )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5882:1: (lv_patterns_5_0= rulePat )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5883:3: lv_patterns_5_0= rulePat
                            {
                             
                            	        newCompositeNode(grammarAccess.getPatEnumAccess().getPatternsPatParserRuleCall_1_0_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulePat_in_rulePatEnum12810);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5899:2: (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==46) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5899:4: otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) )
                            	    {
                            	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_rulePatEnum12823); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getPatEnumAccess().getCommaKeyword_1_0_2_2_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5903:1: ( (lv_patterns_7_0= rulePat ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5904:1: (lv_patterns_7_0= rulePat )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5904:1: (lv_patterns_7_0= rulePat )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5905:3: lv_patterns_7_0= rulePat
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPatEnumAccess().getPatternsPatParserRuleCall_1_0_2_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePat_in_rulePatEnum12844);
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
                            	    break loop92;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_rulePatEnum12860); 

                        	newLeafNode(otherlv_8, grammarAccess.getPatEnumAccess().getRightParenthesisKeyword_1_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5926:6: ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5926:6: ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5926:7: () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5926:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5927:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPatEnumAccess().getPatStructEnumPathAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,53,FOLLOW_53_in_rulePatEnum12889); 

                        	newLeafNode(otherlv_10, grammarAccess.getPatEnumAccess().getLeftCurlyBracketKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5936:1: ( (lv_fieldPatterns_11_0= ruleFieldPat ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5937:1: (lv_fieldPatterns_11_0= ruleFieldPat )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5937:1: (lv_fieldPatterns_11_0= ruleFieldPat )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5938:3: lv_fieldPatterns_11_0= ruleFieldPat
                    {
                     
                    	        newCompositeNode(grammarAccess.getPatEnumAccess().getFieldPatternsFieldPatParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldPat_in_rulePatEnum12910);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5954:2: (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==46) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5954:4: otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) )
                    	    {
                    	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_rulePatEnum12923); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getPatEnumAccess().getCommaKeyword_1_1_3_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5958:1: ( (lv_fieldPatterns_13_0= ruleFieldPat ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5959:1: (lv_fieldPatterns_13_0= ruleFieldPat )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5959:1: (lv_fieldPatterns_13_0= ruleFieldPat )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5960:3: lv_fieldPatterns_13_0= ruleFieldPat
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPatEnumAccess().getFieldPatternsFieldPatParserRuleCall_1_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFieldPat_in_rulePatEnum12944);
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
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,54,FOLLOW_54_in_rulePatEnum12958); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5988:1: entryRuleFieldPat returns [EObject current=null] : iv_ruleFieldPat= ruleFieldPat EOF ;
    public final EObject entryRuleFieldPat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPat = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5989:2: (iv_ruleFieldPat= ruleFieldPat EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5990:2: iv_ruleFieldPat= ruleFieldPat EOF
            {
             newCompositeNode(grammarAccess.getFieldPatRule()); 
            pushFollow(FOLLOW_ruleFieldPat_in_entryRuleFieldPat12996);
            iv_ruleFieldPat=ruleFieldPat();

            state._fsp--;

             current =iv_ruleFieldPat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldPat13006); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5997:1: ruleFieldPat returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? ) ;
    public final EObject ruleFieldPat() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        EObject lv_pattern_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6000:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6001:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6001:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6001:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6001:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6002:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6002:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6003:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFieldPat13048); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6019:2: (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==68) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6019:4: otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleFieldPat13066); 

                        	newLeafNode(otherlv_1, grammarAccess.getFieldPatAccess().getColonKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6023:1: ( (lv_pattern_2_0= rulePat ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6024:1: (lv_pattern_2_0= rulePat )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6024:1: (lv_pattern_2_0= rulePat )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6025:3: lv_pattern_2_0= rulePat
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldPatAccess().getPatternPatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePat_in_ruleFieldPat13087);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6049:1: entryRuleTypePath returns [EObject current=null] : iv_ruleTypePath= ruleTypePath EOF ;
    public final EObject entryRuleTypePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypePath = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6050:2: (iv_ruleTypePath= ruleTypePath EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6051:2: iv_ruleTypePath= ruleTypePath EOF
            {
             newCompositeNode(grammarAccess.getTypePathRule()); 
            pushFollow(FOLLOW_ruleTypePath_in_entryRuleTypePath13125);
            iv_ruleTypePath=ruleTypePath();

            state._fsp--;

             current =iv_ruleTypePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypePath13135); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6058:1: ruleTypePath returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6061:28: ( ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6062:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6062:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6062:2: ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* otherlv_3= '<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+ otherlv_9= '>'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6062:2: ( (lv_segments_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6063:1: (lv_segments_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6063:1: (lv_segments_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6064:3: lv_segments_0_0= RULE_IDENT
            {
            lv_segments_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTypePath13177); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6080:2: (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==99) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6080:4: otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) )
            	    {
            	    otherlv_1=(Token)match(input,99,FOLLOW_99_in_ruleTypePath13195); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTypePathAccess().getColonColonKeyword_1_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6084:1: ( (lv_segments_2_0= RULE_IDENT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6085:1: (lv_segments_2_0= RULE_IDENT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6085:1: (lv_segments_2_0= RULE_IDENT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6086:3: lv_segments_2_0= RULE_IDENT
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTypePath13212); 

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
            	    break loop97;
                }
            } while (true);

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleTypePath13231); 

                	newLeafNode(otherlv_3, grammarAccess.getTypePathAccess().getLessThanSignKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6106:1: ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_LIFETIME) ) {
                alt98=1;
            }
            else if ( (LA98_0==RULE_IDENT||(LA98_0>=RULE_INT_TYPE && LA98_0<=RULE_UNIT_TYPE)||(LA98_0>=74 && LA98_0<=76)) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6106:2: ( (lv_lifetimes_4_0= RULE_LIFETIME ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6106:2: ( (lv_lifetimes_4_0= RULE_LIFETIME ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6107:1: (lv_lifetimes_4_0= RULE_LIFETIME )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6107:1: (lv_lifetimes_4_0= RULE_LIFETIME )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6108:3: lv_lifetimes_4_0= RULE_LIFETIME
                    {
                    lv_lifetimes_4_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleTypePath13249); 

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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6125:6: ( (lv_genericTypes_5_0= ruleType ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6125:6: ( (lv_genericTypes_5_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6126:1: (lv_genericTypes_5_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6126:1: (lv_genericTypes_5_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6127:3: lv_genericTypes_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypePathAccess().getGenericTypesTypeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTypePath13281);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6143:3: (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==46) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6143:5: otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) )
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleTypePath13295); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTypePathAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6147:1: ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) )
            	    int alt99=2;
            	    int LA99_0 = input.LA(1);

            	    if ( (LA99_0==RULE_LIFETIME) ) {
            	        alt99=1;
            	    }
            	    else if ( (LA99_0==RULE_IDENT||(LA99_0>=RULE_INT_TYPE && LA99_0<=RULE_UNIT_TYPE)||(LA99_0>=74 && LA99_0<=76)) ) {
            	        alt99=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 99, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt99) {
            	        case 1 :
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6147:2: ( (lv_lifetimes_7_0= RULE_LIFETIME ) )
            	            {
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6147:2: ( (lv_lifetimes_7_0= RULE_LIFETIME ) )
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6148:1: (lv_lifetimes_7_0= RULE_LIFETIME )
            	            {
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6148:1: (lv_lifetimes_7_0= RULE_LIFETIME )
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6149:3: lv_lifetimes_7_0= RULE_LIFETIME
            	            {
            	            lv_lifetimes_7_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleTypePath13313); 

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
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6166:6: ( (lv_genericTypes_8_0= ruleType ) )
            	            {
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6166:6: ( (lv_genericTypes_8_0= ruleType ) )
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6167:1: (lv_genericTypes_8_0= ruleType )
            	            {
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6167:1: (lv_genericTypes_8_0= ruleType )
            	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6168:3: lv_genericTypes_8_0= ruleType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTypePathAccess().getGenericTypesTypeParserRuleCall_4_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleType_in_ruleTypePath13345);
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
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);

            otherlv_9=(Token)match(input,57,FOLLOW_57_in_ruleTypePath13360); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6196:1: entryRuleExprPath returns [EObject current=null] : iv_ruleExprPath= ruleExprPath EOF ;
    public final EObject entryRuleExprPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprPath = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6197:2: (iv_ruleExprPath= ruleExprPath EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6198:2: iv_ruleExprPath= ruleExprPath EOF
            {
             newCompositeNode(grammarAccess.getExprPathRule()); 
            pushFollow(FOLLOW_ruleExprPath_in_entryRuleExprPath13396);
            iv_ruleExprPath=ruleExprPath();

            state._fsp--;

             current =iv_ruleExprPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprPath13406); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6205:1: ruleExprPath returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )? ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6208:28: ( ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6209:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6209:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6209:2: ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6209:2: ( (lv_segments_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6210:1: (lv_segments_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6210:1: (lv_segments_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6211:3: lv_segments_0_0= RULE_IDENT
            {
            lv_segments_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprPath13448); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6227:2: (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==99) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6227:4: otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) )
            	    {
            	    otherlv_1=(Token)match(input,99,FOLLOW_99_in_ruleExprPath13466); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExprPathAccess().getColonColonKeyword_1_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6231:1: ( (lv_segments_2_0= RULE_IDENT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6232:1: (lv_segments_2_0= RULE_IDENT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6232:1: (lv_segments_2_0= RULE_IDENT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6233:3: lv_segments_2_0= RULE_IDENT
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleExprPath13483); 

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
            	    break loop101;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6249:4: (otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==100) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6249:6: otherlv_3= '::<' ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) ) (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )* otherlv_9= '>'
                    {
                    otherlv_3=(Token)match(input,100,FOLLOW_100_in_ruleExprPath13503); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprPathAccess().getColonColonLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6253:1: ( ( (lv_lifetimes_4_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_5_0= ruleType ) ) )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==RULE_LIFETIME) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==RULE_IDENT||(LA102_0>=RULE_INT_TYPE && LA102_0<=RULE_UNIT_TYPE)||(LA102_0>=74 && LA102_0<=76)) ) {
                        alt102=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }
                    switch (alt102) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6253:2: ( (lv_lifetimes_4_0= RULE_LIFETIME ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6253:2: ( (lv_lifetimes_4_0= RULE_LIFETIME ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6254:1: (lv_lifetimes_4_0= RULE_LIFETIME )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6254:1: (lv_lifetimes_4_0= RULE_LIFETIME )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6255:3: lv_lifetimes_4_0= RULE_LIFETIME
                            {
                            lv_lifetimes_4_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprPath13521); 

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
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6272:6: ( (lv_genericTypes_5_0= ruleType ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6272:6: ( (lv_genericTypes_5_0= ruleType ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6273:1: (lv_genericTypes_5_0= ruleType )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6273:1: (lv_genericTypes_5_0= ruleType )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6274:3: lv_genericTypes_5_0= ruleType
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprPathAccess().getGenericTypesTypeParserRuleCall_2_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleType_in_ruleExprPath13553);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6290:3: (otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==46) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6290:5: otherlv_6= ',' ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) )
                    	    {
                    	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleExprPath13567); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getExprPathAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6294:1: ( ( (lv_lifetimes_7_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_8_0= ruleType ) ) )
                    	    int alt103=2;
                    	    int LA103_0 = input.LA(1);

                    	    if ( (LA103_0==RULE_LIFETIME) ) {
                    	        alt103=1;
                    	    }
                    	    else if ( (LA103_0==RULE_IDENT||(LA103_0>=RULE_INT_TYPE && LA103_0<=RULE_UNIT_TYPE)||(LA103_0>=74 && LA103_0<=76)) ) {
                    	        alt103=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 103, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt103) {
                    	        case 1 :
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6294:2: ( (lv_lifetimes_7_0= RULE_LIFETIME ) )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6294:2: ( (lv_lifetimes_7_0= RULE_LIFETIME ) )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6295:1: (lv_lifetimes_7_0= RULE_LIFETIME )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6295:1: (lv_lifetimes_7_0= RULE_LIFETIME )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6296:3: lv_lifetimes_7_0= RULE_LIFETIME
                    	            {
                    	            lv_lifetimes_7_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_ruleExprPath13585); 

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
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6313:6: ( (lv_genericTypes_8_0= ruleType ) )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6313:6: ( (lv_genericTypes_8_0= ruleType ) )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6314:1: (lv_genericTypes_8_0= ruleType )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6314:1: (lv_genericTypes_8_0= ruleType )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6315:3: lv_genericTypes_8_0= ruleType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getExprPathAccess().getGenericTypesTypeParserRuleCall_2_2_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleType_in_ruleExprPath13617);
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
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,57,FOLLOW_57_in_ruleExprPath13632); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6343:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6344:2: (iv_ruleType= ruleType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6345:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType13670);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType13680); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6352:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_NamedType_1= ruleNamedType | this_BoxedPointer_2= ruleBoxedPointer | this_OwnedPointer_3= ruleOwnedPointer | this_BorrowedPointer_4= ruleBorrowedPointer ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_NamedType_1 = null;

        EObject this_BoxedPointer_2 = null;

        EObject this_OwnedPointer_3 = null;

        EObject this_BorrowedPointer_4 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6355:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_NamedType_1= ruleNamedType | this_BoxedPointer_2= ruleBoxedPointer | this_OwnedPointer_3= ruleOwnedPointer | this_BorrowedPointer_4= ruleBorrowedPointer ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6356:1: (this_PrimitiveType_0= rulePrimitiveType | this_NamedType_1= ruleNamedType | this_BoxedPointer_2= ruleBoxedPointer | this_OwnedPointer_3= ruleOwnedPointer | this_BorrowedPointer_4= ruleBorrowedPointer )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6356:1: (this_PrimitiveType_0= rulePrimitiveType | this_NamedType_1= ruleNamedType | this_BoxedPointer_2= ruleBoxedPointer | this_OwnedPointer_3= ruleOwnedPointer | this_BorrowedPointer_4= ruleBorrowedPointer )
            int alt106=5;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
            case RULE_FLOAT_TYPE:
            case RULE_BOOLEAN_TYPE:
            case RULE_MACHINE_TYPE:
            case RULE_UNIT_TYPE:
                {
                alt106=1;
                }
                break;
            case RULE_IDENT:
                {
                alt106=2;
                }
                break;
            case 74:
                {
                alt106=3;
                }
                break;
            case 75:
                {
                alt106=4;
                }
                break;
            case 76:
                {
                alt106=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6357:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType13727);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;

                     
                            current = this_PrimitiveType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6367:5: this_NamedType_1= ruleNamedType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamedType_in_ruleType13754);
                    this_NamedType_1=ruleNamedType();

                    state._fsp--;

                     
                            current = this_NamedType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6377:5: this_BoxedPointer_2= ruleBoxedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBoxedPointerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBoxedPointer_in_ruleType13781);
                    this_BoxedPointer_2=ruleBoxedPointer();

                    state._fsp--;

                     
                            current = this_BoxedPointer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6387:5: this_OwnedPointer_3= ruleOwnedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getOwnedPointerParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOwnedPointer_in_ruleType13808);
                    this_OwnedPointer_3=ruleOwnedPointer();

                    state._fsp--;

                     
                            current = this_OwnedPointer_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6397:5: this_BorrowedPointer_4= ruleBorrowedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBorrowedPointerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBorrowedPointer_in_ruleType13835);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6413:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6414:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6415:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType13870);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType13880); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6422:1: rulePrimitiveType returns [EObject current=null] : ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token this_INT_TYPE_1=null;
        Token this_FLOAT_TYPE_3=null;
        Token this_BOOLEAN_TYPE_5=null;
        Token this_MACHINE_TYPE_7=null;
        Token this_UNIT_TYPE_9=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6425:28: ( ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6426:1: ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6426:1: ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) )
            int alt107=5;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
                {
                alt107=1;
                }
                break;
            case RULE_FLOAT_TYPE:
                {
                alt107=2;
                }
                break;
            case RULE_BOOLEAN_TYPE:
                {
                alt107=3;
                }
                break;
            case RULE_MACHINE_TYPE:
                {
                alt107=4;
                }
                break;
            case RULE_UNIT_TYPE:
                {
                alt107=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6426:2: ( () this_INT_TYPE_1= RULE_INT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6426:2: ( () this_INT_TYPE_1= RULE_INT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6426:3: () this_INT_TYPE_1= RULE_INT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6426:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6427:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getIntTypeAction_0_0(),
                                current);
                        

                    }

                    this_INT_TYPE_1=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rulePrimitiveType13926); 
                     
                        newLeafNode(this_INT_TYPE_1, grammarAccess.getPrimitiveTypeAccess().getINT_TYPETerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6437:6: ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6437:6: ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6437:7: () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6437:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6438:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getFloatTypeAction_1_0(),
                                current);
                        

                    }

                    this_FLOAT_TYPE_3=(Token)match(input,RULE_FLOAT_TYPE,FOLLOW_RULE_FLOAT_TYPE_in_rulePrimitiveType13953); 
                     
                        newLeafNode(this_FLOAT_TYPE_3, grammarAccess.getPrimitiveTypeAccess().getFLOAT_TYPETerminalRuleCall_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6448:6: ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6448:6: ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6448:7: () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6448:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6449:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getBoolTypeAction_2_0(),
                                current);
                        

                    }

                    this_BOOLEAN_TYPE_5=(Token)match(input,RULE_BOOLEAN_TYPE,FOLLOW_RULE_BOOLEAN_TYPE_in_rulePrimitiveType13980); 
                     
                        newLeafNode(this_BOOLEAN_TYPE_5, grammarAccess.getPrimitiveTypeAccess().getBOOLEAN_TYPETerminalRuleCall_2_1()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6459:6: ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6459:6: ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6459:7: () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6459:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6460:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getMachineTypeAction_3_0(),
                                current);
                        

                    }

                    this_MACHINE_TYPE_7=(Token)match(input,RULE_MACHINE_TYPE,FOLLOW_RULE_MACHINE_TYPE_in_rulePrimitiveType14007); 
                     
                        newLeafNode(this_MACHINE_TYPE_7, grammarAccess.getPrimitiveTypeAccess().getMACHINE_TYPETerminalRuleCall_3_1()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6470:6: ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6470:6: ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6470:7: () this_UNIT_TYPE_9= RULE_UNIT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6470:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6471:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getUnitTypeAction_4_0(),
                                current);
                        

                    }

                    this_UNIT_TYPE_9=(Token)match(input,RULE_UNIT_TYPE,FOLLOW_RULE_UNIT_TYPE_in_rulePrimitiveType14034); 
                     
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6488:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6489:2: (iv_ruleNamedType= ruleNamedType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6490:2: iv_ruleNamedType= ruleNamedType EOF
            {
             newCompositeNode(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_ruleNamedType_in_entryRuleNamedType14070);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;

             current =iv_ruleNamedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedType14080); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6497:1: ruleNamedType returns [EObject current=null] : ( (lv_path_0_0= ruleTypePath ) ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6500:28: ( ( (lv_path_0_0= ruleTypePath ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6501:1: ( (lv_path_0_0= ruleTypePath ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6501:1: ( (lv_path_0_0= ruleTypePath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6502:1: (lv_path_0_0= ruleTypePath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6502:1: (lv_path_0_0= ruleTypePath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6503:3: lv_path_0_0= ruleTypePath
            {
             
            	        newCompositeNode(grammarAccess.getNamedTypeAccess().getPathTypePathParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTypePath_in_ruleNamedType14125);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6527:1: entryRuleBoxedPointer returns [EObject current=null] : iv_ruleBoxedPointer= ruleBoxedPointer EOF ;
    public final EObject entryRuleBoxedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6528:2: (iv_ruleBoxedPointer= ruleBoxedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6529:2: iv_ruleBoxedPointer= ruleBoxedPointer EOF
            {
             newCompositeNode(grammarAccess.getBoxedPointerRule()); 
            pushFollow(FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer14160);
            iv_ruleBoxedPointer=ruleBoxedPointer();

            state._fsp--;

             current =iv_ruleBoxedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxedPointer14170); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6536:1: ruleBoxedPointer returns [EObject current=null] : (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleBoxedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6539:28: ( (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6540:1: (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6540:1: (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6540:3: otherlv_0= '@' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleBoxedPointer14207); 

                	newLeafNode(otherlv_0, grammarAccess.getBoxedPointerAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6544:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6545:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6545:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6546:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBoxedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleBoxedPointer14228);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6570:1: entryRuleOwnedPointer returns [EObject current=null] : iv_ruleOwnedPointer= ruleOwnedPointer EOF ;
    public final EObject entryRuleOwnedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6571:2: (iv_ruleOwnedPointer= ruleOwnedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6572:2: iv_ruleOwnedPointer= ruleOwnedPointer EOF
            {
             newCompositeNode(grammarAccess.getOwnedPointerRule()); 
            pushFollow(FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer14264);
            iv_ruleOwnedPointer=ruleOwnedPointer();

            state._fsp--;

             current =iv_ruleOwnedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedPointer14274); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6579:1: ruleOwnedPointer returns [EObject current=null] : (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleOwnedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6582:28: ( (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6583:1: (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6583:1: (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6583:3: otherlv_0= '~' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleOwnedPointer14311); 

                	newLeafNode(otherlv_0, grammarAccess.getOwnedPointerAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6587:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6588:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6588:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6589:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getOwnedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleOwnedPointer14332);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6613:1: entryRuleBorrowedPointer returns [EObject current=null] : iv_ruleBorrowedPointer= ruleBorrowedPointer EOF ;
    public final EObject entryRuleBorrowedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorrowedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6614:2: (iv_ruleBorrowedPointer= ruleBorrowedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6615:2: iv_ruleBorrowedPointer= ruleBorrowedPointer EOF
            {
             newCompositeNode(grammarAccess.getBorrowedPointerRule()); 
            pushFollow(FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer14368);
            iv_ruleBorrowedPointer=ruleBorrowedPointer();

            state._fsp--;

             current =iv_ruleBorrowedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrowedPointer14378); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6622:1: ruleBorrowedPointer returns [EObject current=null] : (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleBorrowedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6625:28: ( (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6626:1: (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6626:1: (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6626:3: otherlv_0= '&' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleBorrowedPointer14415); 

                	newLeafNode(otherlv_0, grammarAccess.getBorrowedPointerAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6630:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6631:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6631:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6632:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBorrowedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleBorrowedPointer14436);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6656:1: entryRuleStructField returns [EObject current=null] : iv_ruleStructField= ruleStructField EOF ;
    public final EObject entryRuleStructField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructField = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6657:2: (iv_ruleStructField= ruleStructField EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6658:2: iv_ruleStructField= ruleStructField EOF
            {
             newCompositeNode(grammarAccess.getStructFieldRule()); 
            pushFollow(FOLLOW_ruleStructField_in_entryRuleStructField14472);
            iv_ruleStructField=ruleStructField();

            state._fsp--;

             current =iv_ruleStructField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructField14482); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6665:1: ruleStructField returns [EObject current=null] : ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleStructField() throws RecognitionException {
        EObject current = null;

        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_vis_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6668:28: ( ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6669:1: ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6669:1: ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6669:2: ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6669:2: ( (lv_vis_0_0= ruleVisibility ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( ((LA108_0>=101 && LA108_0<=102)) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6670:1: (lv_vis_0_0= ruleVisibility )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6670:1: (lv_vis_0_0= ruleVisibility )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6671:3: lv_vis_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructFieldAccess().getVisVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibility_in_ruleStructField14528);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6687:3: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6688:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6688:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6689:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructField14546); 

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

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleStructField14563); 

                	newLeafNode(otherlv_2, grammarAccess.getStructFieldAccess().getColonKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6709:1: ( (lv_type_3_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6710:1: (lv_type_3_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6710:1: (lv_type_3_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6711:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getStructFieldAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleStructField14584);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6737:1: entryRuleStructVariant returns [EObject current=null] : iv_ruleStructVariant= ruleStructVariant EOF ;
    public final EObject entryRuleStructVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6738:2: (iv_ruleStructVariant= ruleStructVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6739:2: iv_ruleStructVariant= ruleStructVariant EOF
            {
             newCompositeNode(grammarAccess.getStructVariantRule()); 
            pushFollow(FOLLOW_ruleStructVariant_in_entryRuleStructVariant14622);
            iv_ruleStructVariant=ruleStructVariant();

            state._fsp--;

             current =iv_ruleStructVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructVariant14632); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6746:1: ruleStructVariant returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6749:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6750:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6750:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6750:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6750:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6751:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6751:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6752:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructVariant14674); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6768:2: (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==56) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6768:4: otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleStructVariant14692); 

                        	newLeafNode(otherlv_1, grammarAccess.getStructVariantAccess().getLessThanSignKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6772:1: ( (lv_params_2_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6773:1: (lv_params_2_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6773:1: (lv_params_2_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6774:3: lv_params_2_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructVariant14713);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6790:2: (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==46) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6790:4: otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleStructVariant14726); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getStructVariantAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6794:1: ( (lv_params_4_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6795:1: (lv_params_4_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6795:1: (lv_params_4_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6796:3: lv_params_4_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructVariant14747);
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
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleStructVariant14761); 

                        	newLeafNode(otherlv_5, grammarAccess.getStructVariantAccess().getGreaterThanSignKeyword_1_3());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleStructVariant14775); 

                	newLeafNode(otherlv_6, grammarAccess.getStructVariantAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6820:1: ( (lv_fields_7_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6821:1: (lv_fields_7_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6821:1: (lv_fields_7_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6822:3: lv_fields_7_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleStructVariant14796);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6838:2: (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==46) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6838:4: otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) )
            	    {
            	    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleStructVariant14809); 

            	        	newLeafNode(otherlv_8, grammarAccess.getStructVariantAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6842:1: ( (lv_fields_9_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6843:1: (lv_fields_9_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6843:1: (lv_fields_9_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6844:3: lv_fields_9_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleStructVariant14830);
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
            	    break loop111;
                }
            } while (true);

            otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleStructVariant14844); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6872:1: entryRuleTupleVariant returns [EObject current=null] : iv_ruleTupleVariant= ruleTupleVariant EOF ;
    public final EObject entryRuleTupleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6873:2: (iv_ruleTupleVariant= ruleTupleVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6874:2: iv_ruleTupleVariant= ruleTupleVariant EOF
            {
             newCompositeNode(grammarAccess.getTupleVariantRule()); 
            pushFollow(FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant14880);
            iv_ruleTupleVariant=ruleTupleVariant();

            state._fsp--;

             current =iv_ruleTupleVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleVariant14890); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6881:1: ruleTupleVariant returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6884:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6885:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6885:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6885:2: ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6885:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6886:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6886:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6887:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTupleVariant14932); 

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

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleTupleVariant14949); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleVariantAccess().getLeftParenthesisKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6907:1: ( (lv_types_2_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6908:1: (lv_types_2_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6908:1: (lv_types_2_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6909:3: lv_types_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTupleVariant14970);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6925:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==46) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6925:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleTupleVariant14983); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTupleVariantAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6929:1: ( (lv_types_4_0= ruleType ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6930:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6930:1: (lv_types_4_0= ruleType )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6931:3: lv_types_4_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleTupleVariant15004);
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
            	    break loop112;
                }
            } while (true);

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleTupleVariant15018); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6959:1: entryRuleUnitVariant returns [EObject current=null] : iv_ruleUnitVariant= ruleUnitVariant EOF ;
    public final EObject entryRuleUnitVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6960:2: (iv_ruleUnitVariant= ruleUnitVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6961:2: iv_ruleUnitVariant= ruleUnitVariant EOF
            {
             newCompositeNode(grammarAccess.getUnitVariantRule()); 
            pushFollow(FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant15054);
            iv_ruleUnitVariant=ruleUnitVariant();

            state._fsp--;

             current =iv_ruleUnitVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitVariant15064); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6968:1: ruleUnitVariant returns [EObject current=null] : ( (lv_ident_0_0= RULE_IDENT ) ) ;
    public final EObject ruleUnitVariant() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6971:28: ( ( (lv_ident_0_0= RULE_IDENT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6972:1: ( (lv_ident_0_0= RULE_IDENT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6972:1: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6973:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6973:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6974:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleUnitVariant15105); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6998:1: entryRuleStringLit returns [EObject current=null] : iv_ruleStringLit= ruleStringLit EOF ;
    public final EObject entryRuleStringLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6999:2: (iv_ruleStringLit= ruleStringLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7000:2: iv_ruleStringLit= ruleStringLit EOF
            {
             newCompositeNode(grammarAccess.getStringLitRule()); 
            pushFollow(FOLLOW_ruleStringLit_in_entryRuleStringLit15145);
            iv_ruleStringLit=ruleStringLit();

            state._fsp--;

             current =iv_ruleStringLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLit15155); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7007:1: ruleStringLit returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_LIT ) ) ;
    public final EObject ruleStringLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7010:28: ( ( (lv_value_0_0= RULE_STRING_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7011:1: ( (lv_value_0_0= RULE_STRING_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7011:1: ( (lv_value_0_0= RULE_STRING_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7012:1: (lv_value_0_0= RULE_STRING_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7012:1: (lv_value_0_0= RULE_STRING_LIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7013:3: lv_value_0_0= RULE_STRING_LIT
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_RULE_STRING_LIT_in_ruleStringLit15196); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7037:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7038:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7039:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral15236);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral15246); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7046:1: ruleLiteral returns [EObject current=null] : (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLit_0 = null;

        EObject this_CharLit_1 = null;

        EObject this_StringLit_2 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7049:28: ( (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7050:1: (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7050:1: (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit )
            int alt113=3;
            switch ( input.LA(1) ) {
            case RULE_FLOAT_LIT:
            case RULE_INT_LIT:
                {
                alt113=1;
                }
                break;
            case RULE_CHAR_LIT:
                {
                alt113=2;
                }
                break;
            case RULE_STRING_LIT:
                {
                alt113=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7051:5: this_NumberLit_0= ruleNumberLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberLit_in_ruleLiteral15293);
                    this_NumberLit_0=ruleNumberLit();

                    state._fsp--;

                     
                            current = this_NumberLit_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7061:5: this_CharLit_1= ruleCharLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCharLit_in_ruleLiteral15320);
                    this_CharLit_1=ruleCharLit();

                    state._fsp--;

                     
                            current = this_CharLit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7071:5: this_StringLit_2= ruleStringLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLitParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringLit_in_ruleLiteral15347);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7087:1: entryRuleNumberLit returns [EObject current=null] : iv_ruleNumberLit= ruleNumberLit EOF ;
    public final EObject entryRuleNumberLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7088:2: (iv_ruleNumberLit= ruleNumberLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7089:2: iv_ruleNumberLit= ruleNumberLit EOF
            {
             newCompositeNode(grammarAccess.getNumberLitRule()); 
            pushFollow(FOLLOW_ruleNumberLit_in_entryRuleNumberLit15382);
            iv_ruleNumberLit=ruleNumberLit();

            state._fsp--;

             current =iv_ruleNumberLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLit15392); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7096:1: ruleNumberLit returns [EObject current=null] : ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) ) ;
    public final EObject ruleNumberLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7099:28: ( ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7100:1: ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7100:1: ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7101:1: ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7101:1: ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7102:1: (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7102:1: (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_FLOAT_LIT) ) {
                alt114=1;
            }
            else if ( (LA114_0==RULE_INT_LIT) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7103:3: lv_value_0_1= RULE_FLOAT_LIT
                    {
                    lv_value_0_1=(Token)match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_ruleNumberLit15435); 

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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7118:8: lv_value_0_2= RULE_INT_LIT
                    {
                    lv_value_0_2=(Token)match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_ruleNumberLit15455); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7144:1: entryRuleCharLit returns [EObject current=null] : iv_ruleCharLit= ruleCharLit EOF ;
    public final EObject entryRuleCharLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7145:2: (iv_ruleCharLit= ruleCharLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7146:2: iv_ruleCharLit= ruleCharLit EOF
            {
             newCompositeNode(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit15498);
            iv_ruleCharLit=ruleCharLit();

            state._fsp--;

             current =iv_ruleCharLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit15508); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7153:1: ruleCharLit returns [EObject current=null] : ( (lv_value_0_0= RULE_CHAR_LIT ) ) ;
    public final EObject ruleCharLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7156:28: ( ( (lv_value_0_0= RULE_CHAR_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7157:1: ( (lv_value_0_0= RULE_CHAR_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7157:1: ( (lv_value_0_0= RULE_CHAR_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7158:1: (lv_value_0_0= RULE_CHAR_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7158:1: (lv_value_0_0= RULE_CHAR_LIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7159:3: lv_value_0_0= RULE_CHAR_LIT
            {
            lv_value_0_0=(Token)match(input,RULE_CHAR_LIT,FOLLOW_RULE_CHAR_LIT_in_ruleCharLit15549); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7183:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7185:28: ( ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7186:1: ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7186:1: ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==101) ) {
                alt115=1;
            }
            else if ( (LA115_0==102) ) {
                alt115=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7186:2: (enumLiteral_0= 'priv' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7186:2: (enumLiteral_0= 'priv' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7186:4: enumLiteral_0= 'priv'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_101_in_ruleVisibility15603); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7192:6: (enumLiteral_1= 'pub' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7192:6: (enumLiteral_1= 'pub' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:7192:8: enumLiteral_1= 'pub'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_102_in_ruleVisibility15620); 

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


    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA88_eotS =
        "\16\uffff";
    static final String DFA88_eofS =
        "\10\uffff\3\13\3\uffff";
    static final String DFA88_minS =
        "\1\4\7\uffff\3\56\3\uffff";
    static final String DFA88_maxS =
        "\1\142\7\uffff\3\137\3\uffff";
    static final String DFA88_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\10\1\12\1\11";
    static final String DFA88_specialS =
        "\16\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\14\1\13\1\2\6\uffff\1\10\1\11\1\12\40\uffff\1\6\25\uffff"+
            "\1\7\3\uffff\1\3\1\4\1\5\25\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\13\1\uffff\1\13\4\uffff\1\13\15\uffff\1\13\1\15\31\uffff"+
            "\1\13",
            "\2\13\1\uffff\1\13\4\uffff\1\13\15\uffff\1\13\1\15\31\uffff"+
            "\1\13",
            "\2\13\1\uffff\1\13\4\uffff\1\13\15\uffff\1\13\1\15\31\uffff"+
            "\1\13",
            "",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "5167:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum )";
        }
    }
 

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
    public static final BitSet FOLLOW_48_in_ruleFnItem1516 = new BitSet(new long[]{0x000300000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleFnItem1538 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFnItem1551 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
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
    public static final BitSet FOLLOW_53_in_ruleStructItem2080 = new BitSet(new long[]{0x0000000000000010L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructItem2101 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructItem2114 = new BitSet(new long[]{0x0000000000000010L,0x0000006000000000L});
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
    public static final BitSet FOLLOW_53_in_ruleEnumVariant2701 = new BitSet(new long[]{0x0000000000000010L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleEnumVariant2722 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumVariant2735 = new BitSet(new long[]{0x0000000000000010L,0x0000006000000000L});
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
    public static final BitSet FOLLOW_53_in_ruleTraitItem2974 = new BitSet(new long[]{0x80C0000000000000L,0x0000006000000001L});
    public static final BitSet FOLLOW_ruleTraitMethod_in_ruleTraitItem2995 = new BitSet(new long[]{0x80C0000000000000L,0x0000006000000001L});
    public static final BitSet FOLLOW_54_in_ruleTraitItem3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraitMethod_in_entryRuleTraitMethod3044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraitMethod3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTraitMethod3098 = new BitSet(new long[]{0x0080000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_64_in_ruleTraitMethod3135 = new BitSet(new long[]{0x0080000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleTraitMethod3171 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTraitMethod3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTraitMethod3201 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_ruleTraitMethod3219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3240 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTraitMethod3253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3274 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleTraitMethod3288 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTraitMethod3302 = new BitSet(new long[]{0x000300000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleTraitMethod3324 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTraitMethod3337 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
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
    public static final BitSet FOLLOW_48_in_ruleImplMethod3911 = new BitSet(new long[]{0x000300000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleImplMethod3933 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleImplMethod3946 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
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
    public static final BitSet FOLLOW_48_in_ruleForeignFn4318 = new BitSet(new long[]{0x000300000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleForeignFn4340 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleForeignFn4353 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
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
    public static final BitSet FOLLOW_50_in_ruleStaticItem4613 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
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
    public static final BitSet FOLLOW_ruleExprLiteral_in_entryRuleExprLiteral5397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLiteral5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleExprLiteral5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPathHead_in_entryRuleExprPathHead5487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprPathHead5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPath_in_ruleExprPathHead5543 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_ruleExprPathHead5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTuple_in_ruleExprPathHead5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprGroup_in_entryRuleExprGroup5652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprGroup5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprGroup5699 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5720 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5742 = new BitSet(new long[]{0x002300000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5764 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5777 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5798 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5813 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleExprGroup5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTuple_in_entryRuleExprTuple5867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTuple5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprTuple5914 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprTuple5935 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprTuple5948 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprTuple5969 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprTuple5984 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleExprTuple5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_entryRuleExprStruct6034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprStruct6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExprStruct6081 = new BitSet(new long[]{0x0000000000000010L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleExprStruct6102 = new BitSet(new long[]{0x0040400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_46_in_ruleExprStruct6115 = new BitSet(new long[]{0x0000000000000010L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleExprStruct6136 = new BitSet(new long[]{0x0040400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleExprStruct6151 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprStruct6172 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleExprStruct6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprVec_in_entryRuleExprVec6222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprVec6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleExprVec6269 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_ruleExprVec6286 = new BitSet(new long[]{0x002180000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6313 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprVec6325 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FE4L});
    public static final BitSet FOLLOW_69_in_ruleExprVec6339 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6360 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6389 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprVec6402 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6423 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_ruleExprVec6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprUnary_in_entryRuleExprUnary6477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprUnary6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericNegation_in_ruleExprUnary6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDereference_in_ruleExprUnary6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNegation_in_ruleExprUnary6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManagedBox_in_ruleExprUnary6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedBox_in_ruleExprUnary6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_ruleExprUnary6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericNegation_in_entryRuleNumericNegation6704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericNegation6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleNumericNegation6751 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleNumericNegation6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDereference_in_entryRuleDereference6808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDereference6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDereference6855 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDereference6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNegation_in_entryRuleLogicalNegation6912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNegation6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleLogicalNegation6959 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleLogicalNegation6980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManagedBox_in_entryRuleManagedBox7016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManagedBox7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleManagedBox7063 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleManagedBox7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedBox_in_entryRuleOwnedBox7120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedBox7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOwnedBox7167 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleOwnedBox7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_entryRuleBorrow7224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrow7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBorrow7271 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleBorrow7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBinary_in_entryRuleExprBinary7328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBinary7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_ruleExprBinary7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionMultiplicationOrModulo_in_entryRuleDivisionMultiplicationOrModulo7418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionMultiplicationOrModulo7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006100L});
    public static final BitSet FOLLOW_77_in_ruleDivisionMultiplicationOrModulo7497 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDivisionMultiplicationOrModulo7547 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDivisionMultiplicationOrModulo7597 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAs_in_entryRuleAs7657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAs7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionMultiplicationOrModulo_in_ruleAs7714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleAs7735 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleAs7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_entryRuleAdditionOrSubtraction7794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOrSubtraction7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010080L});
    public static final BitSet FOLLOW_80_in_ruleAdditionOrSubtraction7873 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAdditionOrSubtraction7923 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator7983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftOperator7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8040 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleShiftOperator8062 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleShiftOperator8112 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator8133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAnd_in_entryRuleBitwiseAnd8172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAnd8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd8229 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleBitwiseAnd8250 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXor_in_entryRuleBitwiseXor8309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXor8319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor8366 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleBitwiseXor8387 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_entryRuleBitwiseOr8446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOr8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr8503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleBitwiseOr8524 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_entryRuleComparisonOperators8583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperators8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8640 = new BitSet(new long[]{0x0300000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_56_in_ruleComparisonOperators8662 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleComparisonOperators8712 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleComparisonOperators8762 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleComparisonOperators8812 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator8872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityOperator8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8929 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_87_in_ruleEqualityOperator8951 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleEqualityOperator9001 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator9022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAnd_in_entryRuleBooleanAnd9061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAnd9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd9118 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleBooleanAnd9139 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign9200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLValue_in_ruleAssign9257 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAssign9278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExprUnary_in_ruleAssign9299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLambda_in_entryRuleExprLambda9337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLambda9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleExprLambda9384 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprLambda9402 = new BitSet(new long[]{0x0000400000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_46_in_ruleExprLambda9420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprLambda9437 = new BitSet(new long[]{0x0000400000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleExprLambda9458 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprLambda9479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprWhile_in_entryRuleExprWhile9515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprWhile9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleExprWhile9562 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprWhile9583 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprWhile9604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLoop_in_entryRuleExprLoop9640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLoop9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprLoop9693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleExprLoop9710 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleExprLoop9724 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprLoop9745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBreak_in_entryRuleExprBreak9781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBreak9791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleExprBreak9837 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprBreak9854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprContinue_in_entryRuleExprContinue9896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprContinue9906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleExprContinue9952 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprContinue9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprDo_in_entryRuleExprDo10011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprDo10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleExprDo10058 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprDo10079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleExprDo10091 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprDo10109 = new BitSet(new long[]{0x0000400000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_46_in_ruleExprDo10127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprDo10144 = new BitSet(new long[]{0x0000400000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleExprDo10165 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprDo10186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprFor_in_entryRuleExprFor10222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprFor10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleExprFor10269 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_ruleExprFor10290 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleExprFor10302 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprFor10323 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprFor10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprIf_in_entryRuleExprIf10380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprIf10390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleExprIf10427 = new BitSet(new long[]{0x002100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprIf10448 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleExprIf10469 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleElseTail_in_ruleExprIf10490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseTail_in_entryRuleElseTail10527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseTail10537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleElseTail10574 = new BitSet(new long[]{0x042100000000E0F0L,0x000000057C101FC4L});
    public static final BitSet FOLLOW_ruleExprIf_in_ruleElseTail10597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleElseTail10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock10660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBlock10716 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleBlock10728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl10764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericParamDecl10774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl10816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleGenericParamDecl10834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl10851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleGenericParamDecl10869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl10886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_entryRuleArg10930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg10940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_ruleArg10986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleArg10998 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleArg11019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_entryRulePat11055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePat11065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_rulePat11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_rulePat11139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_rulePat11166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_rulePat11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_rulePat11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_rulePat11247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_rulePat11274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_rulePat11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatRange_in_rulePat11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatEnum_in_rulePat11355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_entryRulePatWildcard11390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatWildcard11400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rulePatWildcard11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_entryRulePatIdent11482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatIdent11492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_rulePatIdent11534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePatIdent11556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_entryRulePatBoxed11597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBoxed11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePatBoxed11644 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatBoxed11665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_entryRulePatOwned11701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatOwned11711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePatOwned11748 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatOwned11769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed11805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBorrowed11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePatBorrowed11852 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatBorrowed11873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_entryRulePatTuple11909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatTuple11919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePatTuple11956 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatTuple11977 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatTuple11990 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatTuple12011 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_rulePatTuple12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_entryRulePatVector12061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatVector12071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePatVector12108 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatVector12129 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_rulePatVector12142 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatVector12163 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_rulePatVector12177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_entryRulePatLiteral12213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatLiteral12223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePatLiteral12268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatRange_in_entryRulePatRange12303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatRange12313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatCharRange_in_rulePatRange12360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatNumberRange_in_rulePatRange12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatCharRange_in_entryRulePatCharRange12422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatCharRange12432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rulePatCharRange12478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rulePatCharRange12490 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCharLit_in_rulePatCharRange12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatNumberRange_in_entryRulePatNumberRange12547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatNumberRange12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rulePatNumberRange12603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rulePatNumberRange12615 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rulePatNumberRange12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatEnum_in_entryRulePatEnum12672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatEnum12682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPath_in_rulePatEnum12728 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_rulePatEnum12751 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001D60L});
    public static final BitSet FOLLOW_72_in_rulePatEnum12764 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_69_in_rulePatEnum12782 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rulePat_in_rulePatEnum12810 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatEnum12823 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatEnum12844 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_rulePatEnum12860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePatEnum12889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldPat_in_rulePatEnum12910 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatEnum12923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldPat_in_rulePatEnum12944 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_rulePatEnum12958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldPat_in_entryRuleFieldPat12996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldPat13006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFieldPat13048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleFieldPat13066 = new BitSet(new long[]{0x000100000000E070L,0x0000000400001C40L});
    public static final BitSet FOLLOW_rulePat_in_ruleFieldPat13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypePath_in_entryRuleTypePath13125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypePath13135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTypePath13177 = new BitSet(new long[]{0x0100000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleTypePath13195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTypePath13212 = new BitSet(new long[]{0x0100000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_56_in_ruleTypePath13231 = new BitSet(new long[]{0x0000000000001F90L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleTypePath13249 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypePath13281 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTypePath13295 = new BitSet(new long[]{0x0000000000001F90L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleTypePath13313 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypePath13345 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleTypePath13360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPath_in_entryRuleExprPath13396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprPath13406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprPath13448 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_99_in_ruleExprPath13466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleExprPath13483 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_100_in_ruleExprPath13503 = new BitSet(new long[]{0x0000000000001F90L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprPath13521 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleExprPath13553 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprPath13567 = new BitSet(new long[]{0x0000000000001F90L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_ruleExprPath13585 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleExprPath13617 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleExprPath13632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType13670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType13680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType13727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_ruleType13754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_ruleType13781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_ruleType13808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_ruleType13835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType13870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType13880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rulePrimitiveType13926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_in_rulePrimitiveType13953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_TYPE_in_rulePrimitiveType13980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MACHINE_TYPE_in_rulePrimitiveType14007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNIT_TYPE_in_rulePrimitiveType14034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_entryRuleNamedType14070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedType14080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypePath_in_ruleNamedType14125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer14160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxedPointer14170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBoxedPointer14207 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleBoxedPointer14228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer14264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedPointer14274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOwnedPointer14311 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleOwnedPointer14332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer14368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrowedPointer14378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBorrowedPointer14415 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleBorrowedPointer14436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_entryRuleStructField14472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructField14482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleStructField14528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructField14546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStructField14563 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleStructField14584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_entryRuleStructVariant14622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructVariant14632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructVariant14674 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleStructVariant14692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructVariant14713 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructVariant14726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructVariant14747 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleStructVariant14761 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleStructVariant14775 = new BitSet(new long[]{0x0000000000000010L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructVariant14796 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructVariant14809 = new BitSet(new long[]{0x0000000000000010L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructVariant14830 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleStructVariant14844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant14880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleVariant14890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTupleVariant14932 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTupleVariant14949 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleVariant14970 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTupleVariant14983 = new BitSet(new long[]{0x0000000000001F10L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleVariant15004 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTupleVariant15018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant15054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitVariant15064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleUnitVariant15105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_entryRuleStringLit15145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLit15155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LIT_in_ruleStringLit15196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral15236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral15246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_ruleLiteral15293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_ruleLiteral15320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_ruleLiteral15347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_entryRuleNumberLit15382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLit15392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_ruleNumberLit15435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LIT_in_ruleNumberLit15455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit15498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit15508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_LIT_in_ruleCharLit15549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleVisibility15603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleVisibility15620 = new BitSet(new long[]{0x0000000000000002L});

}