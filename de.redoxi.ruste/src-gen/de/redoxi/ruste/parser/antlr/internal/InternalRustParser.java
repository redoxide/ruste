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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING_LIT", "RULE_MUT_KEYWORD", "RULE_LIFETIME", "RULE_INT_TYPE", "RULE_FLOAT_TYPE", "RULE_BOOLEAN_TYPE", "RULE_MACHINE_TYPE", "RULE_UNIT_TYPE", "RULE_FLOAT_LIT", "RULE_INT_LIT", "RULE_CHAR_LIT", "RULE_INT_SIZE", "RULE_SIGNED_INT_TYPE", "RULE_UNSIGNED_INT_TYPE", "RULE_I8", "RULE_I16", "RULE_I32", "RULE_I64", "RULE_U8", "RULE_U16", "RULE_U32", "RULE_U64", "RULE_FLOAT_SIZE", "RULE_F32", "RULE_F64", "RULE_MACHINE_INT_TYPE", "RULE_MACHINE_UINT_TYPE", "RULE_UNICODE_CHAR", "RULE_UTF8_CHAR", "RULE_UTF16_CHAR", "RULE_UTF32_CHAR", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_DEC_INT_LIT", "RULE_BIN_INT_LIT", "RULE_OCT_INT_LIT", "RULE_HEX_INT_LIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "'#['", "','", "']'", "'('", "')'", "'='", "'mod'", "';'", "'{'", "'}'", "'fn'", "'<'", "'>'", "'->'", "'type'", "'struct'", "'enum'", "'trait'", "'unsafe'", "'extern'", "'impl'", "'for'", "'static'", "':'", "'..'", "'-'", "'*'", "'!'", "'@'", "'~'", "'&'", "'/'", "'%'", "'as'", "'+'", "'<<'", "'>>'", "'^'", "'|'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'_'", "'['", "'::'", "'priv'", "'pub'"
    };
    public static final int RULE_FLOAT_TYPE=9;
    public static final int RULE_I8=19;
    public static final int RULE_MACHINE_UINT_TYPE=31;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_OCT_INT_LIT=40;
    public static final int RULE_INT_LIT=14;
    public static final int RULE_U32=25;
    public static final int RULE_HEX_INT_LIT=41;
    public static final int RULE_F64=29;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_DEC_DIGIT=37;
    public static final int RULE_OCT_DIGIT=42;
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
    public static final int T__61=61;
    public static final int RULE_UTF16_CHAR=34;
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

            if ( ((LA12_0>=RULE_IDENT && LA12_0<=RULE_MUT_KEYWORD)||(LA12_0>=RULE_FLOAT_LIT && LA12_0<=RULE_CHAR_LIT)||LA12_0==48||(LA12_0>=73 && LA12_0<=75)||(LA12_0>=89 && LA12_0<=90)) ) {
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

                if ( (LA29_0==55||(LA29_0>=63 && LA29_0<=64)||(LA29_0>=92 && LA29_0<=93)) ) {
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

            if ( ((LA31_0>=92 && LA31_0<=93)) ) {
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

            if ( ((LA35_0>=RULE_IDENT && LA35_0<=RULE_MUT_KEYWORD)||(LA35_0>=RULE_FLOAT_LIT && LA35_0<=RULE_CHAR_LIT)||LA35_0==48||(LA35_0>=73 && LA35_0<=75)||(LA35_0>=89 && LA35_0<=90)) ) {
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

            if ( ((LA44_0>=RULE_IDENT && LA44_0<=RULE_MUT_KEYWORD)||(LA44_0>=RULE_FLOAT_LIT && LA44_0<=RULE_CHAR_LIT)||LA44_0==48||(LA44_0>=73 && LA44_0<=75)||(LA44_0>=89 && LA44_0<=90)) ) {
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

            if ( ((LA49_0>=RULE_IDENT && LA49_0<=RULE_MUT_KEYWORD)||(LA49_0>=RULE_FLOAT_LIT && LA49_0<=RULE_CHAR_LIT)||LA49_0==48||(LA49_0>=73 && LA49_0<=75)||(LA49_0>=89 && LA49_0<=90)) ) {
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2365:1: ruleExprLValue returns [EObject current=null] : this_ExprPath_0= ruleExprPath ;
    public final EObject ruleExprLValue() throws RecognitionException {
        EObject current = null;

        EObject this_ExprPath_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2368:28: (this_ExprPath_0= ruleExprPath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2370:5: this_ExprPath_0= ruleExprPath
            {
             
                    newCompositeNode(grammarAccess.getExprLValueAccess().getExprPathParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExprPath_in_ruleExprLValue4828);
            this_ExprPath_0=ruleExprPath();

            state._fsp--;

             
                    current = this_ExprPath_0; 
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
            else if ( (LA52_0==48||LA52_0==53||(LA52_0>=70 && LA52_0<=75)) ) {
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2435:1: ruleExprLeaf returns [EObject current=null] : (this_ExprGroup_0= ruleExprGroup | this_ExprStruct_1= ruleExprStruct | this_ExprUnary_2= ruleExprUnary ) ;
    public final EObject ruleExprLeaf() throws RecognitionException {
        EObject current = null;

        EObject this_ExprGroup_0 = null;

        EObject this_ExprStruct_1 = null;

        EObject this_ExprUnary_2 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2438:28: ( (this_ExprGroup_0= ruleExprGroup | this_ExprStruct_1= ruleExprStruct | this_ExprUnary_2= ruleExprUnary ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2439:1: (this_ExprGroup_0= ruleExprGroup | this_ExprStruct_1= ruleExprStruct | this_ExprUnary_2= ruleExprUnary )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2439:1: (this_ExprGroup_0= ruleExprGroup | this_ExprStruct_1= ruleExprStruct | this_ExprUnary_2= ruleExprUnary )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt53=1;
                }
                break;
            case 53:
                {
                alt53=2;
                }
                break;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2440:5: this_ExprGroup_0= ruleExprGroup
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprGroupParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExprGroup_in_ruleExprLeaf5038);
                    this_ExprGroup_0=ruleExprGroup();

                    state._fsp--;

                     
                            current = this_ExprGroup_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2450:5: this_ExprStruct_1= ruleExprStruct
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprStructParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExprStruct_in_ruleExprLeaf5065);
                    this_ExprStruct_1=ruleExprStruct();

                    state._fsp--;

                     
                            current = this_ExprStruct_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2460:5: this_ExprUnary_2= ruleExprUnary
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprUnaryParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExprUnary_in_ruleExprLeaf5092);
                    this_ExprUnary_2=ruleExprUnary();

                    state._fsp--;

                     
                            current = this_ExprUnary_2; 
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


    // $ANTLR start "entryRuleExprPath"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2478:1: entryRuleExprPath returns [EObject current=null] : iv_ruleExprPath= ruleExprPath EOF ;
    public final EObject entryRuleExprPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprPath = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2479:2: (iv_ruleExprPath= ruleExprPath EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2480:2: iv_ruleExprPath= ruleExprPath EOF
            {
             newCompositeNode(grammarAccess.getExprPathRule()); 
            pushFollow(FOLLOW_ruleExprPath_in_entryRuleExprPath5129);
            iv_ruleExprPath=ruleExprPath();

            state._fsp--;

             current =iv_ruleExprPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprPath5139); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2487:1: ruleExprPath returns [EObject current=null] : ( ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? ) ;
    public final EObject ruleExprPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;

        EObject lv_struct_2_0 = null;

        EObject lv_tuple_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2490:28: ( ( ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2491:1: ( ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2491:1: ( ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2491:2: ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2491:2: ( (lv_path_0_0= rulePath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2492:1: (lv_path_0_0= rulePath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2492:1: (lv_path_0_0= rulePath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2493:3: lv_path_0_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getExprPathAccess().getPathPathParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePath_in_ruleExprPath5185);
            lv_path_0_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprPathRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2509:2: ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                alt54=1;
            }
            else if ( (LA54_0==48) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2509:3: ( () ( (lv_struct_2_0= ruleExprStruct ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2509:3: ( () ( (lv_struct_2_0= ruleExprStruct ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2509:4: () ( (lv_struct_2_0= ruleExprStruct ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2509:4: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2510:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExprPathAccess().getExprStructPathAction_1_0_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2515:2: ( (lv_struct_2_0= ruleExprStruct ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2516:1: (lv_struct_2_0= ruleExprStruct )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2516:1: (lv_struct_2_0= ruleExprStruct )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2517:3: lv_struct_2_0= ruleExprStruct
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprPathAccess().getStructExprStructParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprStruct_in_ruleExprPath5217);
                    lv_struct_2_0=ruleExprStruct();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprPathRule());
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2534:6: ( () ( (lv_tuple_4_0= ruleExprTuple ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2534:6: ( () ( (lv_tuple_4_0= ruleExprTuple ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2534:7: () ( (lv_tuple_4_0= ruleExprTuple ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2534:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2535:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExprPathAccess().getExprTuplePathAction_1_1_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2540:2: ( (lv_tuple_4_0= ruleExprTuple ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2541:1: (lv_tuple_4_0= ruleExprTuple )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2541:1: (lv_tuple_4_0= ruleExprTuple )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2542:3: lv_tuple_4_0= ruleExprTuple
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprPathAccess().getTupleExprTupleParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprTuple_in_ruleExprPath5255);
                    lv_tuple_4_0=ruleExprTuple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprPathRule());
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
    // $ANTLR end "ruleExprPath"


    // $ANTLR start "entryRuleExprGroup"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2566:1: entryRuleExprGroup returns [EObject current=null] : iv_ruleExprGroup= ruleExprGroup EOF ;
    public final EObject entryRuleExprGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprGroup = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2567:2: (iv_ruleExprGroup= ruleExprGroup EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2568:2: iv_ruleExprGroup= ruleExprGroup EOF
            {
             newCompositeNode(grammarAccess.getExprGroupRule()); 
            pushFollow(FOLLOW_ruleExprGroup_in_entryRuleExprGroup5294);
            iv_ruleExprGroup=ruleExprGroup();

            state._fsp--;

             current =iv_ruleExprGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprGroup5304); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2575:1: ruleExprGroup returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2578:28: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2579:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2579:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2579:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleExprGroup5341); 

                	newLeafNode(otherlv_0, grammarAccess.getExprGroupAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2583:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2584:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2584:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2585:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5362);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2601:2: ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==46) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2601:3: () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )?
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2601:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2602:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getExprGroupAccess().getExprTupleExprsAction_2_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5384); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprGroupAccess().getCommaKeyword_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2611:1: ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_IDENT||LA57_0==48||LA57_0==53||(LA57_0>=70 && LA57_0<=75)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2611:2: ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )?
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2611:2: ( (lv_exprs_4_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2612:1: (lv_exprs_4_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2612:1: (lv_exprs_4_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2613:3: lv_exprs_4_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprsExprParserRuleCall_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5406);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2629:2: (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==46) ) {
                                    int LA55_1 = input.LA(2);

                                    if ( (LA55_1==RULE_IDENT||LA55_1==48||LA55_1==53||(LA55_1>=70 && LA55_1<=75)) ) {
                                        alt55=1;
                                    }


                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2629:4: otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) )
                            	    {
                            	    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5419); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getExprGroupAccess().getCommaKeyword_2_2_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2633:1: ( (lv_exprs_6_0= ruleExpr ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2634:1: (lv_exprs_6_0= ruleExpr )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2634:1: (lv_exprs_6_0= ruleExpr )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2635:3: lv_exprs_6_0= ruleExpr
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprsExprParserRuleCall_2_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5440);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2651:4: (otherlv_7= ',' )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==46) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2651:6: otherlv_7= ','
                                    {
                                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5455); 

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

            otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleExprGroup5473); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2667:1: entryRuleExprTuple returns [EObject current=null] : iv_ruleExprTuple= ruleExprTuple EOF ;
    public final EObject entryRuleExprTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTuple = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2668:2: (iv_ruleExprTuple= ruleExprTuple EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2669:2: iv_ruleExprTuple= ruleExprTuple EOF
            {
             newCompositeNode(grammarAccess.getExprTupleRule()); 
            pushFollow(FOLLOW_ruleExprTuple_in_entryRuleExprTuple5509);
            iv_ruleExprTuple=ruleExprTuple();

            state._fsp--;

             current =iv_ruleExprTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTuple5519); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2676:1: ruleExprTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2679:28: ( (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2680:1: (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2680:1: (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2680:3: otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleExprTuple5556); 

                	newLeafNode(otherlv_0, grammarAccess.getExprTupleAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2684:1: ( (lv_exprs_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2685:1: (lv_exprs_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2685:1: (lv_exprs_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2686:3: lv_exprs_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprTupleAccess().getExprsExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprTuple5577);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2702:2: (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==46) ) {
                    int LA59_1 = input.LA(2);

                    if ( (LA59_1==RULE_IDENT||LA59_1==48||LA59_1==53||(LA59_1>=70 && LA59_1<=75)) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2702:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprTuple5590); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExprTupleAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2706:1: ( (lv_exprs_3_0= ruleExpr ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2707:1: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2707:1: (lv_exprs_3_0= ruleExpr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2708:3: lv_exprs_3_0= ruleExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprTupleAccess().getExprsExprParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprTuple5611);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2724:4: (otherlv_4= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2724:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleExprTuple5626); 

                        	newLeafNode(otherlv_4, grammarAccess.getExprTupleAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleExprTuple5640); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2740:1: entryRuleExprStruct returns [EObject current=null] : iv_ruleExprStruct= ruleExprStruct EOF ;
    public final EObject entryRuleExprStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprStruct = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2741:2: (iv_ruleExprStruct= ruleExprStruct EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2742:2: iv_ruleExprStruct= ruleExprStruct EOF
            {
             newCompositeNode(grammarAccess.getExprStructRule()); 
            pushFollow(FOLLOW_ruleExprStruct_in_entryRuleExprStruct5676);
            iv_ruleExprStruct=ruleExprStruct();

            state._fsp--;

             current =iv_ruleExprStruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprStruct5686); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2749:1: ruleExprStruct returns [EObject current=null] : (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2752:28: ( (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2753:1: (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2753:1: (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2753:3: otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleExprStruct5723); 

                	newLeafNode(otherlv_0, grammarAccess.getExprStructAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2757:1: ( (lv_fields_1_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2758:1: (lv_fields_1_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2758:1: (lv_fields_1_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2759:3: lv_fields_1_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getExprStructAccess().getFieldsStructFieldParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleExprStruct5744);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2775:2: (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==46) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2775:4: otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprStruct5757); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExprStructAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2779:1: ( (lv_fields_3_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2780:1: (lv_fields_3_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2780:1: (lv_fields_3_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2781:3: lv_fields_3_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprStructAccess().getFieldsStructFieldParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleExprStruct5778);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2797:4: (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==69) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2797:6: otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) )
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleExprStruct5793); 

                        	newLeafNode(otherlv_4, grammarAccess.getExprStructAccess().getFullStopFullStopKeyword_3_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2801:1: ( (lv_baseExpr_5_0= ruleExpr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2802:1: (lv_baseExpr_5_0= ruleExpr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2802:1: (lv_baseExpr_5_0= ruleExpr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2803:3: lv_baseExpr_5_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprStructAccess().getBaseExprExprParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprStruct5814);
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

            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleExprStruct5828); 

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


    // $ANTLR start "entryRuleExprUnary"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2831:1: entryRuleExprUnary returns [EObject current=null] : iv_ruleExprUnary= ruleExprUnary EOF ;
    public final EObject entryRuleExprUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprUnary = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2832:2: (iv_ruleExprUnary= ruleExprUnary EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2833:2: iv_ruleExprUnary= ruleExprUnary EOF
            {
             newCompositeNode(grammarAccess.getExprUnaryRule()); 
            pushFollow(FOLLOW_ruleExprUnary_in_entryRuleExprUnary5864);
            iv_ruleExprUnary=ruleExprUnary();

            state._fsp--;

             current =iv_ruleExprUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprUnary5874); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2840:1: ruleExprUnary returns [EObject current=null] : (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2843:28: ( (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2844:1: (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2844:1: (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow )
            int alt63=6;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt63=1;
                }
                break;
            case 71:
                {
                alt63=2;
                }
                break;
            case 72:
                {
                alt63=3;
                }
                break;
            case 73:
                {
                alt63=4;
                }
                break;
            case 74:
                {
                alt63=5;
                }
                break;
            case 75:
                {
                alt63=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2845:5: this_NumericNegation_0= ruleNumericNegation
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getNumericNegationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumericNegation_in_ruleExprUnary5921);
                    this_NumericNegation_0=ruleNumericNegation();

                    state._fsp--;

                     
                            current = this_NumericNegation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2855:5: this_Dereference_1= ruleDereference
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getDereferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDereference_in_ruleExprUnary5948);
                    this_Dereference_1=ruleDereference();

                    state._fsp--;

                     
                            current = this_Dereference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2865:5: this_LogicalNegation_2= ruleLogicalNegation
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getLogicalNegationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLogicalNegation_in_ruleExprUnary5975);
                    this_LogicalNegation_2=ruleLogicalNegation();

                    state._fsp--;

                     
                            current = this_LogicalNegation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2875:5: this_ManagedBox_3= ruleManagedBox
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getManagedBoxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleManagedBox_in_ruleExprUnary6002);
                    this_ManagedBox_3=ruleManagedBox();

                    state._fsp--;

                     
                            current = this_ManagedBox_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2885:5: this_OwnedBox_4= ruleOwnedBox
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getOwnedBoxParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleOwnedBox_in_ruleExprUnary6029);
                    this_OwnedBox_4=ruleOwnedBox();

                    state._fsp--;

                     
                            current = this_OwnedBox_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2895:5: this_Borrow_5= ruleBorrow
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getBorrowParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBorrow_in_ruleExprUnary6056);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2911:1: entryRuleNumericNegation returns [EObject current=null] : iv_ruleNumericNegation= ruleNumericNegation EOF ;
    public final EObject entryRuleNumericNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericNegation = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2912:2: (iv_ruleNumericNegation= ruleNumericNegation EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2913:2: iv_ruleNumericNegation= ruleNumericNegation EOF
            {
             newCompositeNode(grammarAccess.getNumericNegationRule()); 
            pushFollow(FOLLOW_ruleNumericNegation_in_entryRuleNumericNegation6091);
            iv_ruleNumericNegation=ruleNumericNegation();

            state._fsp--;

             current =iv_ruleNumericNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericNegation6101); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2920:1: ruleNumericNegation returns [EObject current=null] : (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleNumericNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2923:28: ( (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2924:1: (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2924:1: (otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2924:3: otherlv_0= '-' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleNumericNegation6138); 

                	newLeafNode(otherlv_0, grammarAccess.getNumericNegationAccess().getHyphenMinusKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2928:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2929:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2929:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2930:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getNumericNegationAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleNumericNegation6159);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2954:1: entryRuleDereference returns [EObject current=null] : iv_ruleDereference= ruleDereference EOF ;
    public final EObject entryRuleDereference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDereference = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2955:2: (iv_ruleDereference= ruleDereference EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2956:2: iv_ruleDereference= ruleDereference EOF
            {
             newCompositeNode(grammarAccess.getDereferenceRule()); 
            pushFollow(FOLLOW_ruleDereference_in_entryRuleDereference6195);
            iv_ruleDereference=ruleDereference();

            state._fsp--;

             current =iv_ruleDereference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDereference6205); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2963:1: ruleDereference returns [EObject current=null] : (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleDereference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2966:28: ( (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2967:1: (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2967:1: (otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2967:3: otherlv_0= '*' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleDereference6242); 

                	newLeafNode(otherlv_0, grammarAccess.getDereferenceAccess().getAsteriskKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2971:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2972:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2972:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2973:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getDereferenceAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleDereference6263);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2997:1: entryRuleLogicalNegation returns [EObject current=null] : iv_ruleLogicalNegation= ruleLogicalNegation EOF ;
    public final EObject entryRuleLogicalNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegation = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2998:2: (iv_ruleLogicalNegation= ruleLogicalNegation EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2999:2: iv_ruleLogicalNegation= ruleLogicalNegation EOF
            {
             newCompositeNode(grammarAccess.getLogicalNegationRule()); 
            pushFollow(FOLLOW_ruleLogicalNegation_in_entryRuleLogicalNegation6299);
            iv_ruleLogicalNegation=ruleLogicalNegation();

            state._fsp--;

             current =iv_ruleLogicalNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNegation6309); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3006:1: ruleLogicalNegation returns [EObject current=null] : (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleLogicalNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3009:28: ( (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3010:1: (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3010:1: (otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3010:3: otherlv_0= '!' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleLogicalNegation6346); 

                	newLeafNode(otherlv_0, grammarAccess.getLogicalNegationAccess().getExclamationMarkKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3014:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3015:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3015:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3016:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getLogicalNegationAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleLogicalNegation6367);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3040:1: entryRuleManagedBox returns [EObject current=null] : iv_ruleManagedBox= ruleManagedBox EOF ;
    public final EObject entryRuleManagedBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManagedBox = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3041:2: (iv_ruleManagedBox= ruleManagedBox EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3042:2: iv_ruleManagedBox= ruleManagedBox EOF
            {
             newCompositeNode(grammarAccess.getManagedBoxRule()); 
            pushFollow(FOLLOW_ruleManagedBox_in_entryRuleManagedBox6403);
            iv_ruleManagedBox=ruleManagedBox();

            state._fsp--;

             current =iv_ruleManagedBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManagedBox6413); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3049:1: ruleManagedBox returns [EObject current=null] : (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleManagedBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3052:28: ( (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3053:1: (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3053:1: (otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3053:3: otherlv_0= '@' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleManagedBox6450); 

                	newLeafNode(otherlv_0, grammarAccess.getManagedBoxAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3057:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3058:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3058:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3059:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getManagedBoxAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleManagedBox6471);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3083:1: entryRuleOwnedBox returns [EObject current=null] : iv_ruleOwnedBox= ruleOwnedBox EOF ;
    public final EObject entryRuleOwnedBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedBox = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3084:2: (iv_ruleOwnedBox= ruleOwnedBox EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3085:2: iv_ruleOwnedBox= ruleOwnedBox EOF
            {
             newCompositeNode(grammarAccess.getOwnedBoxRule()); 
            pushFollow(FOLLOW_ruleOwnedBox_in_entryRuleOwnedBox6507);
            iv_ruleOwnedBox=ruleOwnedBox();

            state._fsp--;

             current =iv_ruleOwnedBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedBox6517); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3092:1: ruleOwnedBox returns [EObject current=null] : (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleOwnedBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3095:28: ( (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3096:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3096:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3096:3: otherlv_0= '~' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleOwnedBox6554); 

                	newLeafNode(otherlv_0, grammarAccess.getOwnedBoxAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3100:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3101:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3101:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3102:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getOwnedBoxAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleOwnedBox6575);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3126:1: entryRuleBorrow returns [EObject current=null] : iv_ruleBorrow= ruleBorrow EOF ;
    public final EObject entryRuleBorrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorrow = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3127:2: (iv_ruleBorrow= ruleBorrow EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3128:2: iv_ruleBorrow= ruleBorrow EOF
            {
             newCompositeNode(grammarAccess.getBorrowRule()); 
            pushFollow(FOLLOW_ruleBorrow_in_entryRuleBorrow6611);
            iv_ruleBorrow=ruleBorrow();

            state._fsp--;

             current =iv_ruleBorrow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrow6621); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3135:1: ruleBorrow returns [EObject current=null] : (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) ) ;
    public final EObject ruleBorrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3138:28: ( (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3139:1: (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3139:1: (otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3139:3: otherlv_0= '&' ( (lv_expr_1_0= ruleExprLeaf ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleBorrow6658); 

                	newLeafNode(otherlv_0, grammarAccess.getBorrowAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3143:1: ( (lv_expr_1_0= ruleExprLeaf ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3144:1: (lv_expr_1_0= ruleExprLeaf )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3144:1: (lv_expr_1_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3145:3: lv_expr_1_0= ruleExprLeaf
            {
             
            	        newCompositeNode(grammarAccess.getBorrowAccess().getExprExprLeafParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleBorrow6679);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3169:1: entryRuleExprBinary returns [EObject current=null] : iv_ruleExprBinary= ruleExprBinary EOF ;
    public final EObject entryRuleExprBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBinary = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3170:2: (iv_ruleExprBinary= ruleExprBinary EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3171:2: iv_ruleExprBinary= ruleExprBinary EOF
            {
             newCompositeNode(grammarAccess.getExprBinaryRule()); 
            pushFollow(FOLLOW_ruleExprBinary_in_entryRuleExprBinary6715);
            iv_ruleExprBinary=ruleExprBinary();

            state._fsp--;

             current =iv_ruleExprBinary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBinary6725); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3178:1: ruleExprBinary returns [EObject current=null] : this_Assign_0= ruleAssign ;
    public final EObject ruleExprBinary() throws RecognitionException {
        EObject current = null;

        EObject this_Assign_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3181:28: (this_Assign_0= ruleAssign )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3183:5: this_Assign_0= ruleAssign
            {
             
                    newCompositeNode(grammarAccess.getExprBinaryAccess().getAssignParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAssign_in_ruleExprBinary6771);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3199:1: entryRuleDivisionMultiplicationOrModulo returns [EObject current=null] : iv_ruleDivisionMultiplicationOrModulo= ruleDivisionMultiplicationOrModulo EOF ;
    public final EObject entryRuleDivisionMultiplicationOrModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionMultiplicationOrModulo = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3200:2: (iv_ruleDivisionMultiplicationOrModulo= ruleDivisionMultiplicationOrModulo EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3201:2: iv_ruleDivisionMultiplicationOrModulo= ruleDivisionMultiplicationOrModulo EOF
            {
             newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloRule()); 
            pushFollow(FOLLOW_ruleDivisionMultiplicationOrModulo_in_entryRuleDivisionMultiplicationOrModulo6805);
            iv_ruleDivisionMultiplicationOrModulo=ruleDivisionMultiplicationOrModulo();

            state._fsp--;

             current =iv_ruleDivisionMultiplicationOrModulo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionMultiplicationOrModulo6815); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3208:1: ruleDivisionMultiplicationOrModulo returns [EObject current=null] : (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3211:28: ( (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3212:1: (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3212:1: (this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3213:5: this_ExprLeaf_0= ruleExprLeaf ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getExprLeafParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo6862);
            this_ExprLeaf_0=ruleExprLeaf();

            state._fsp--;

             
                    current = this_ExprLeaf_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3221:1: ( ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) ) | ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) ) )?
            int alt64=4;
            switch ( input.LA(1) ) {
                case 76:
                    {
                    alt64=1;
                    }
                    break;
                case 71:
                    {
                    alt64=2;
                    }
                    break;
                case 77:
                    {
                    alt64=3;
                    }
                    break;
            }

            switch (alt64) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3221:2: ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3221:2: ( () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3221:3: () otherlv_2= '/' ( (lv_right_3_0= ruleExprLeaf ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3221:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3222:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,76,FOLLOW_76_in_ruleDivisionMultiplicationOrModulo6884); 

                        	newLeafNode(otherlv_2, grammarAccess.getDivisionMultiplicationOrModuloAccess().getSolidusKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3231:1: ( (lv_right_3_0= ruleExprLeaf ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3232:1: (lv_right_3_0= ruleExprLeaf )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3232:1: (lv_right_3_0= ruleExprLeaf )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3233:3: lv_right_3_0= ruleExprLeaf
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo6905);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3250:6: ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3250:6: ( () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3250:7: () otherlv_5= '*' ( (lv_right_6_0= ruleExprLeaf ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3250:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3251:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleDivisionMultiplicationOrModulo6934); 

                        	newLeafNode(otherlv_5, grammarAccess.getDivisionMultiplicationOrModuloAccess().getAsteriskKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3260:1: ( (lv_right_6_0= ruleExprLeaf ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3261:1: (lv_right_6_0= ruleExprLeaf )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3261:1: (lv_right_6_0= ruleExprLeaf )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3262:3: lv_right_6_0= ruleExprLeaf
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo6955);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3279:6: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3279:6: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3279:7: () otherlv_8= '%' ( (lv_right_9_0= ruleExprLeaf ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3279:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3280:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,77,FOLLOW_77_in_ruleDivisionMultiplicationOrModulo6984); 

                        	newLeafNode(otherlv_8, grammarAccess.getDivisionMultiplicationOrModuloAccess().getPercentSignKeyword_1_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3289:1: ( (lv_right_9_0= ruleExprLeaf ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3290:1: (lv_right_9_0= ruleExprLeaf )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3290:1: (lv_right_9_0= ruleExprLeaf )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3291:3: lv_right_9_0= ruleExprLeaf
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7005);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3315:1: entryRuleAs returns [EObject current=null] : iv_ruleAs= ruleAs EOF ;
    public final EObject entryRuleAs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAs = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3316:2: (iv_ruleAs= ruleAs EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3317:2: iv_ruleAs= ruleAs EOF
            {
             newCompositeNode(grammarAccess.getAsRule()); 
            pushFollow(FOLLOW_ruleAs_in_entryRuleAs7044);
            iv_ruleAs=ruleAs();

            state._fsp--;

             current =iv_ruleAs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAs7054); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3324:1: ruleAs returns [EObject current=null] : (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? ) ;
    public final EObject ruleAs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_DivisionMultiplicationOrModulo_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3327:28: ( (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3328:1: (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3328:1: (this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3329:5: this_DivisionMultiplicationOrModulo_0= ruleDivisionMultiplicationOrModulo ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAsAccess().getDivisionMultiplicationOrModuloParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDivisionMultiplicationOrModulo_in_ruleAs7101);
            this_DivisionMultiplicationOrModulo_0=ruleDivisionMultiplicationOrModulo();

            state._fsp--;

             
                    current = this_DivisionMultiplicationOrModulo_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3337:1: ( () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==78) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3337:2: () otherlv_2= 'as' ( (lv_type_3_0= ruleType ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3337:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3338:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAsAccess().getExprCastExprAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,78,FOLLOW_78_in_ruleAs7122); 

                        	newLeafNode(otherlv_2, grammarAccess.getAsAccess().getAsKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3347:1: ( (lv_type_3_0= ruleType ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3348:1: (lv_type_3_0= ruleType )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3348:1: (lv_type_3_0= ruleType )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3349:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAsAccess().getTypeTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAs7143);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3373:1: entryRuleAdditionOrSubtraction returns [EObject current=null] : iv_ruleAdditionOrSubtraction= ruleAdditionOrSubtraction EOF ;
    public final EObject entryRuleAdditionOrSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOrSubtraction = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3374:2: (iv_ruleAdditionOrSubtraction= ruleAdditionOrSubtraction EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3375:2: iv_ruleAdditionOrSubtraction= ruleAdditionOrSubtraction EOF
            {
             newCompositeNode(grammarAccess.getAdditionOrSubtractionRule()); 
            pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_entryRuleAdditionOrSubtraction7181);
            iv_ruleAdditionOrSubtraction=ruleAdditionOrSubtraction();

            state._fsp--;

             current =iv_ruleAdditionOrSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOrSubtraction7191); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3382:1: ruleAdditionOrSubtraction returns [EObject current=null] : (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? ) ;
    public final EObject ruleAdditionOrSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_As_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3385:28: ( (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3386:1: (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3386:1: (this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3387:5: this_As_0= ruleAs ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAdditionOrSubtractionAccess().getAsParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7238);
            this_As_0=ruleAs();

            state._fsp--;

             
                    current = this_As_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3395:1: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) ) )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==79) ) {
                alt66=1;
            }
            else if ( (LA66_0==70) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3395:2: ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3395:2: ( () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3395:3: () otherlv_2= '+' ( (lv_right_3_0= ruleAs ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3395:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3396:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleAdditionOrSubtraction7260); 

                        	newLeafNode(otherlv_2, grammarAccess.getAdditionOrSubtractionAccess().getPlusSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3405:1: ( (lv_right_3_0= ruleAs ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3406:1: (lv_right_3_0= ruleAs )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3406:1: (lv_right_3_0= ruleAs )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3407:3: lv_right_3_0= ruleAs
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionOrSubtractionAccess().getRightAsParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7281);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3424:6: ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3424:6: ( () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3424:7: () otherlv_5= '-' ( (lv_right_6_0= ruleAs ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3424:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3425:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleAdditionOrSubtraction7310); 

                        	newLeafNode(otherlv_5, grammarAccess.getAdditionOrSubtractionAccess().getHyphenMinusKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3434:1: ( (lv_right_6_0= ruleAs ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3435:1: (lv_right_6_0= ruleAs )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3435:1: (lv_right_6_0= ruleAs )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3436:3: lv_right_6_0= ruleAs
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionOrSubtractionAccess().getRightAsParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7331);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3460:1: entryRuleShiftOperator returns [EObject current=null] : iv_ruleShiftOperator= ruleShiftOperator EOF ;
    public final EObject entryRuleShiftOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftOperator = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3461:2: (iv_ruleShiftOperator= ruleShiftOperator EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3462:2: iv_ruleShiftOperator= ruleShiftOperator EOF
            {
             newCompositeNode(grammarAccess.getShiftOperatorRule()); 
            pushFollow(FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator7370);
            iv_ruleShiftOperator=ruleShiftOperator();

            state._fsp--;

             current =iv_ruleShiftOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftOperator7380); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3469:1: ruleShiftOperator returns [EObject current=null] : (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? ) ;
    public final EObject ruleShiftOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_AdditionOrSubtraction_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3472:28: ( (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3473:1: (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3473:1: (this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3474:5: this_AdditionOrSubtraction_0= ruleAdditionOrSubtraction ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getShiftOperatorAccess().getAdditionOrSubtractionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator7427);
            this_AdditionOrSubtraction_0=ruleAdditionOrSubtraction();

            state._fsp--;

             
                    current = this_AdditionOrSubtraction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3482:1: ( ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) ) | ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) ) )?
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==80) ) {
                alt67=1;
            }
            else if ( (LA67_0==81) ) {
                alt67=2;
            }
            switch (alt67) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3482:2: ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3482:2: ( () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3482:3: () otherlv_2= '<<' ( (lv_right_3_0= ruleAdditionOrSubtraction ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3482:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3483:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleShiftOperator7449); 

                        	newLeafNode(otherlv_2, grammarAccess.getShiftOperatorAccess().getLessThanSignLessThanSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3492:1: ( (lv_right_3_0= ruleAdditionOrSubtraction ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3493:1: (lv_right_3_0= ruleAdditionOrSubtraction )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3493:1: (lv_right_3_0= ruleAdditionOrSubtraction )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3494:3: lv_right_3_0= ruleAdditionOrSubtraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getShiftOperatorAccess().getRightAdditionOrSubtractionParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator7470);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3511:6: ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3511:6: ( () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3511:7: () otherlv_5= '>>' ( (lv_right_6_0= ruleAdditionOrSubtraction ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3511:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3512:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,81,FOLLOW_81_in_ruleShiftOperator7499); 

                        	newLeafNode(otherlv_5, grammarAccess.getShiftOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3521:1: ( (lv_right_6_0= ruleAdditionOrSubtraction ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3522:1: (lv_right_6_0= ruleAdditionOrSubtraction )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3522:1: (lv_right_6_0= ruleAdditionOrSubtraction )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3523:3: lv_right_6_0= ruleAdditionOrSubtraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getShiftOperatorAccess().getRightAdditionOrSubtractionParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator7520);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3547:1: entryRuleBitwiseAnd returns [EObject current=null] : iv_ruleBitwiseAnd= ruleBitwiseAnd EOF ;
    public final EObject entryRuleBitwiseAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAnd = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3548:2: (iv_ruleBitwiseAnd= ruleBitwiseAnd EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3549:2: iv_ruleBitwiseAnd= ruleBitwiseAnd EOF
            {
             newCompositeNode(grammarAccess.getBitwiseAndRule()); 
            pushFollow(FOLLOW_ruleBitwiseAnd_in_entryRuleBitwiseAnd7559);
            iv_ruleBitwiseAnd=ruleBitwiseAnd();

            state._fsp--;

             current =iv_ruleBitwiseAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAnd7569); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3556:1: ruleBitwiseAnd returns [EObject current=null] : (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? ) ;
    public final EObject ruleBitwiseAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ShiftOperator_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3559:28: ( (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3560:1: (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3560:1: (this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3561:5: this_ShiftOperator_0= ruleShiftOperator ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBitwiseAndAccess().getShiftOperatorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd7616);
            this_ShiftOperator_0=ruleShiftOperator();

            state._fsp--;

             
                    current = this_ShiftOperator_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3569:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==75) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3569:2: () otherlv_2= '&' ( (lv_right_3_0= ruleShiftOperator ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3569:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3570:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,75,FOLLOW_75_in_ruleBitwiseAnd7637); 

                        	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndAccess().getAmpersandKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3579:1: ( (lv_right_3_0= ruleShiftOperator ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3580:1: (lv_right_3_0= ruleShiftOperator )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3580:1: (lv_right_3_0= ruleShiftOperator )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3581:3: lv_right_3_0= ruleShiftOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getBitwiseAndAccess().getRightShiftOperatorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd7658);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3605:1: entryRuleBitwiseXor returns [EObject current=null] : iv_ruleBitwiseXor= ruleBitwiseXor EOF ;
    public final EObject entryRuleBitwiseXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXor = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3606:2: (iv_ruleBitwiseXor= ruleBitwiseXor EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3607:2: iv_ruleBitwiseXor= ruleBitwiseXor EOF
            {
             newCompositeNode(grammarAccess.getBitwiseXorRule()); 
            pushFollow(FOLLOW_ruleBitwiseXor_in_entryRuleBitwiseXor7696);
            iv_ruleBitwiseXor=ruleBitwiseXor();

            state._fsp--;

             current =iv_ruleBitwiseXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXor7706); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3614:1: ruleBitwiseXor returns [EObject current=null] : (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? ) ;
    public final EObject ruleBitwiseXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3617:28: ( (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3618:1: (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3618:1: (this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3619:5: this_BitwiseAnd_0= ruleBitwiseAnd ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBitwiseXorAccess().getBitwiseAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor7753);
            this_BitwiseAnd_0=ruleBitwiseAnd();

            state._fsp--;

             
                    current = this_BitwiseAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3627:1: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==82) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3627:2: () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAnd ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3627:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3628:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,82,FOLLOW_82_in_ruleBitwiseXor7774); 

                        	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorAccess().getCircumflexAccentKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3637:1: ( (lv_right_3_0= ruleBitwiseAnd ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3638:1: (lv_right_3_0= ruleBitwiseAnd )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3638:1: (lv_right_3_0= ruleBitwiseAnd )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3639:3: lv_right_3_0= ruleBitwiseAnd
                    {
                     
                    	        newCompositeNode(grammarAccess.getBitwiseXorAccess().getRightBitwiseAndParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor7795);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3663:1: entryRuleBitwiseOr returns [EObject current=null] : iv_ruleBitwiseOr= ruleBitwiseOr EOF ;
    public final EObject entryRuleBitwiseOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3664:2: (iv_ruleBitwiseOr= ruleBitwiseOr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3665:2: iv_ruleBitwiseOr= ruleBitwiseOr EOF
            {
             newCompositeNode(grammarAccess.getBitwiseOrRule()); 
            pushFollow(FOLLOW_ruleBitwiseOr_in_entryRuleBitwiseOr7833);
            iv_ruleBitwiseOr=ruleBitwiseOr();

            state._fsp--;

             current =iv_ruleBitwiseOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOr7843); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3672:1: ruleBitwiseOr returns [EObject current=null] : (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? ) ;
    public final EObject ruleBitwiseOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXor_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3675:28: ( (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3676:1: (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3676:1: (this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3677:5: this_BitwiseXor_0= ruleBitwiseXor ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBitwiseOrAccess().getBitwiseXorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr7890);
            this_BitwiseXor_0=ruleBitwiseXor();

            state._fsp--;

             
                    current = this_BitwiseXor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3685:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==83) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3685:2: () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXor ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3685:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3686:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,83,FOLLOW_83_in_ruleBitwiseOr7911); 

                        	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrAccess().getVerticalLineKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3695:1: ( (lv_right_3_0= ruleBitwiseXor ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3696:1: (lv_right_3_0= ruleBitwiseXor )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3696:1: (lv_right_3_0= ruleBitwiseXor )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3697:3: lv_right_3_0= ruleBitwiseXor
                    {
                     
                    	        newCompositeNode(grammarAccess.getBitwiseOrAccess().getRightBitwiseXorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr7932);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3721:1: entryRuleComparisonOperators returns [EObject current=null] : iv_ruleComparisonOperators= ruleComparisonOperators EOF ;
    public final EObject entryRuleComparisonOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperators = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3722:2: (iv_ruleComparisonOperators= ruleComparisonOperators EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3723:2: iv_ruleComparisonOperators= ruleComparisonOperators EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorsRule()); 
            pushFollow(FOLLOW_ruleComparisonOperators_in_entryRuleComparisonOperators7970);
            iv_ruleComparisonOperators=ruleComparisonOperators();

            state._fsp--;

             current =iv_ruleComparisonOperators; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperators7980); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3730:1: ruleComparisonOperators returns [EObject current=null] : (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3733:28: ( (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3734:1: (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3734:1: (this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3735:5: this_BitwiseOr_0= ruleBitwiseOr ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getBitwiseOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8027);
            this_BitwiseOr_0=ruleBitwiseOr();

            state._fsp--;

             
                    current = this_BitwiseOr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3743:1: ( ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) ) )?
            int alt71=5;
            switch ( input.LA(1) ) {
                case 56:
                    {
                    alt71=1;
                    }
                    break;
                case 57:
                    {
                    alt71=2;
                    }
                    break;
                case 84:
                    {
                    alt71=3;
                    }
                    break;
                case 85:
                    {
                    alt71=4;
                    }
                    break;
            }

            switch (alt71) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3743:2: ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3743:2: ( () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3743:3: () otherlv_2= '<' ( (lv_right_3_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3743:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3744:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleComparisonOperators8049); 

                        	newLeafNode(otherlv_2, grammarAccess.getComparisonOperatorsAccess().getLessThanSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3753:1: ( (lv_right_3_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3754:1: (lv_right_3_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3754:1: (lv_right_3_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3755:3: lv_right_3_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8070);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3772:6: ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3772:6: ( () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3772:7: () otherlv_5= '>' ( (lv_right_6_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3772:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3773:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleComparisonOperators8099); 

                        	newLeafNode(otherlv_5, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3782:1: ( (lv_right_6_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3783:1: (lv_right_6_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3783:1: (lv_right_6_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3784:3: lv_right_6_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8120);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3801:6: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3801:6: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3801:7: () otherlv_8= '<=' ( (lv_right_9_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3801:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3802:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,84,FOLLOW_84_in_ruleComparisonOperators8149); 

                        	newLeafNode(otherlv_8, grammarAccess.getComparisonOperatorsAccess().getLessThanSignEqualsSignKeyword_1_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3811:1: ( (lv_right_9_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3812:1: (lv_right_9_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3812:1: (lv_right_9_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3813:3: lv_right_9_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8170);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3830:6: ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3830:6: ( () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3830:7: () otherlv_11= '>=' ( (lv_right_12_0= ruleBitwiseOr ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3830:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3831:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0(),
                                current);
                        

                    }

                    otherlv_11=(Token)match(input,85,FOLLOW_85_in_ruleComparisonOperators8199); 

                        	newLeafNode(otherlv_11, grammarAccess.getComparisonOperatorsAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3840:1: ( (lv_right_12_0= ruleBitwiseOr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3841:1: (lv_right_12_0= ruleBitwiseOr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3841:1: (lv_right_12_0= ruleBitwiseOr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3842:3: lv_right_12_0= ruleBitwiseOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8220);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3866:1: entryRuleEqualityOperator returns [EObject current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final EObject entryRuleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperator = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3867:2: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3868:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
             newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            pushFollow(FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator8259);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;

             current =iv_ruleEqualityOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityOperator8269); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3875:1: ruleEqualityOperator returns [EObject current=null] : (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? ) ;
    public final EObject ruleEqualityOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ComparisonOperators_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3878:28: ( (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3879:1: (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3879:1: (this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3880:5: this_ComparisonOperators_0= ruleComparisonOperators ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getEqualityOperatorAccess().getComparisonOperatorsParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8316);
            this_ComparisonOperators_0=ruleComparisonOperators();

            state._fsp--;

             
                    current = this_ComparisonOperators_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3888:1: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) ) )?
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==86) ) {
                alt72=1;
            }
            else if ( (LA72_0==87) ) {
                alt72=2;
            }
            switch (alt72) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3888:2: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3888:2: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3888:3: () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonOperators ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3888:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3889:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleEqualityOperator8338); 

                        	newLeafNode(otherlv_2, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3898:1: ( (lv_right_3_0= ruleComparisonOperators ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3899:1: (lv_right_3_0= ruleComparisonOperators )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3899:1: (lv_right_3_0= ruleComparisonOperators )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3900:3: lv_right_3_0= ruleComparisonOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityOperatorAccess().getRightComparisonOperatorsParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8359);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3917:6: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3917:6: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3917:7: () otherlv_5= '!=' ( (lv_right_6_0= ruleComparisonOperators ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3917:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3918:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,87,FOLLOW_87_in_ruleEqualityOperator8388); 

                        	newLeafNode(otherlv_5, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3927:1: ( (lv_right_6_0= ruleComparisonOperators ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3928:1: (lv_right_6_0= ruleComparisonOperators )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3928:1: (lv_right_6_0= ruleComparisonOperators )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3929:3: lv_right_6_0= ruleComparisonOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityOperatorAccess().getRightComparisonOperatorsParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8409);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3953:1: entryRuleBooleanAnd returns [EObject current=null] : iv_ruleBooleanAnd= ruleBooleanAnd EOF ;
    public final EObject entryRuleBooleanAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAnd = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3954:2: (iv_ruleBooleanAnd= ruleBooleanAnd EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3955:2: iv_ruleBooleanAnd= ruleBooleanAnd EOF
            {
             newCompositeNode(grammarAccess.getBooleanAndRule()); 
            pushFollow(FOLLOW_ruleBooleanAnd_in_entryRuleBooleanAnd8448);
            iv_ruleBooleanAnd=ruleBooleanAnd();

            state._fsp--;

             current =iv_ruleBooleanAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAnd8458); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3962:1: ruleBooleanAnd returns [EObject current=null] : (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? ) ;
    public final EObject ruleBooleanAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityOperator_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3965:28: ( (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3966:1: (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3966:1: (this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3967:5: this_EqualityOperator_0= ruleEqualityOperator ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBooleanAndAccess().getEqualityOperatorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd8505);
            this_EqualityOperator_0=ruleEqualityOperator();

            state._fsp--;

             
                    current = this_EqualityOperator_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3975:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==88) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3975:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityOperator ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3975:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3976:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,88,FOLLOW_88_in_ruleBooleanAnd8526); 

                        	newLeafNode(otherlv_2, grammarAccess.getBooleanAndAccess().getAmpersandAmpersandKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3985:1: ( (lv_right_3_0= ruleEqualityOperator ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3986:1: (lv_right_3_0= ruleEqualityOperator )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3986:1: (lv_right_3_0= ruleEqualityOperator )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3987:3: lv_right_3_0= ruleEqualityOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanAndAccess().getRightEqualityOperatorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd8547);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4013:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4014:2: (iv_ruleAssign= ruleAssign EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4015:2: iv_ruleAssign= ruleAssign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign8587);
            iv_ruleAssign=ruleAssign();

            state._fsp--;

             current =iv_ruleAssign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign8597); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4022:1: ruleAssign returns [EObject current=null] : (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExprLValue_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4025:28: ( (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4026:1: (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4026:1: (this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4027:5: this_ExprLValue_0= ruleExprLValue ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAssignAccess().getExprLValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprLValue_in_ruleAssign8644);
            this_ExprLValue_0=ruleExprLValue();

            state._fsp--;

             
                    current = this_ExprLValue_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4035:1: ( () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==50) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4035:2: () otherlv_2= '=' ( (lv_right_3_0= ruleExprUnary ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4035:2: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4036:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAssignAccess().getExprAssignLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleAssign8665); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4045:1: ( (lv_right_3_0= ruleExprUnary ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4046:1: (lv_right_3_0= ruleExprUnary )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4046:1: (lv_right_3_0= ruleExprUnary )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4047:3: lv_right_3_0= ruleExprUnary
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignAccess().getRightExprUnaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprUnary_in_ruleAssign8686);
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


    // $ANTLR start "entryRuleBlock"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4071:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4072:2: (iv_ruleBlock= ruleBlock EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4073:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock8724);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock8734); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4080:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4083:28: ( ( () otherlv_1= '{' otherlv_2= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4084:1: ( () otherlv_1= '{' otherlv_2= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4084:1: ( () otherlv_1= '{' otherlv_2= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4084:2: () otherlv_1= '{' otherlv_2= '}'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4084:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4085:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleBlock8780); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleBlock8792); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4106:1: entryRuleGenericParamDecl returns [EObject current=null] : iv_ruleGenericParamDecl= ruleGenericParamDecl EOF ;
    public final EObject entryRuleGenericParamDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericParamDecl = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4107:2: (iv_ruleGenericParamDecl= ruleGenericParamDecl EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4108:2: iv_ruleGenericParamDecl= ruleGenericParamDecl EOF
            {
             newCompositeNode(grammarAccess.getGenericParamDeclRule()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl8828);
            iv_ruleGenericParamDecl=ruleGenericParamDecl();

            state._fsp--;

             current =iv_ruleGenericParamDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericParamDecl8838); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4115:1: ruleGenericParamDecl returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? ) ;
    public final EObject ruleGenericParamDecl() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        Token lv_bounds_2_0=null;
        Token otherlv_3=null;
        Token lv_bounds_4_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4118:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4119:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4119:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4119:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4119:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4120:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4120:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4121:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl8880); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4137:2: (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==68) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4137:4: otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleGenericParamDecl8898); 

                        	newLeafNode(otherlv_1, grammarAccess.getGenericParamDeclAccess().getColonKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4141:1: ( (lv_bounds_2_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4142:1: (lv_bounds_2_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4142:1: (lv_bounds_2_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4143:3: lv_bounds_2_0= RULE_IDENT
                    {
                    lv_bounds_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl8915); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4159:2: (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4159:4: otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) )
                    {
                    otherlv_3=(Token)match(input,79,FOLLOW_79_in_ruleGenericParamDecl8933); 

                        	newLeafNode(otherlv_3, grammarAccess.getGenericParamDeclAccess().getPlusSignKeyword_1_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4163:1: ( (lv_bounds_4_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4164:1: (lv_bounds_4_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4164:1: (lv_bounds_4_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4165:3: lv_bounds_4_0= RULE_IDENT
                    {
                    lv_bounds_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl8950); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4189:1: entryRuleArg returns [EObject current=null] : iv_ruleArg= ruleArg EOF ;
    public final EObject entryRuleArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4190:2: (iv_ruleArg= ruleArg EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4191:2: iv_ruleArg= ruleArg EOF
            {
             newCompositeNode(grammarAccess.getArgRule()); 
            pushFollow(FOLLOW_ruleArg_in_entryRuleArg8994);
            iv_ruleArg=ruleArg();

            state._fsp--;

             current =iv_ruleArg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg9004); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4198:1: ruleArg returns [EObject current=null] : ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pat_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4201:28: ( ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4202:1: ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4202:1: ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4202:2: ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4202:2: ( (lv_pat_0_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4203:1: (lv_pat_0_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4203:1: (lv_pat_0_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4204:3: lv_pat_0_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getArgAccess().getPatPatParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_ruleArg9050);
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

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleArg9062); 

                	newLeafNode(otherlv_1, grammarAccess.getArgAccess().getColonKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4224:1: ( (lv_type_2_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4225:1: (lv_type_2_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4225:1: (lv_type_2_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4226:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArg9083);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4250:1: entryRulePat returns [EObject current=null] : iv_rulePat= rulePat EOF ;
    public final EObject entryRulePat() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePat = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4251:2: (iv_rulePat= rulePat EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4252:2: iv_rulePat= rulePat EOF
            {
             newCompositeNode(grammarAccess.getPatRule()); 
            pushFollow(FOLLOW_rulePat_in_entryRulePat9119);
            iv_rulePat=rulePat();

            state._fsp--;

             current =iv_rulePat; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePat9129); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4259:1: rulePat returns [EObject current=null] : (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4262:28: ( (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4263:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4263:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum )
            int alt76=10;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4264:5: this_PatWildcard_0= rulePatWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatWildcardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePatWildcard_in_rulePat9176);
                    this_PatWildcard_0=rulePatWildcard();

                    state._fsp--;

                     
                            current = this_PatWildcard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4274:5: this_PatIdent_1= rulePatIdent
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatIdentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePatIdent_in_rulePat9203);
                    this_PatIdent_1=rulePatIdent();

                    state._fsp--;

                     
                            current = this_PatIdent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4284:5: this_PatBoxed_2= rulePatBoxed
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatBoxedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePatBoxed_in_rulePat9230);
                    this_PatBoxed_2=rulePatBoxed();

                    state._fsp--;

                     
                            current = this_PatBoxed_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4294:5: this_PatOwned_3= rulePatOwned
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatOwnedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePatOwned_in_rulePat9257);
                    this_PatOwned_3=rulePatOwned();

                    state._fsp--;

                     
                            current = this_PatOwned_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4304:5: this_PatBorrowed_4= rulePatBorrowed
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatBorrowedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePatBorrowed_in_rulePat9284);
                    this_PatBorrowed_4=rulePatBorrowed();

                    state._fsp--;

                     
                            current = this_PatBorrowed_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4314:5: this_PatTuple_5= rulePatTuple
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatTupleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePatTuple_in_rulePat9311);
                    this_PatTuple_5=rulePatTuple();

                    state._fsp--;

                     
                            current = this_PatTuple_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4324:5: this_PatVector_6= rulePatVector
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatVectorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePatVector_in_rulePat9338);
                    this_PatVector_6=rulePatVector();

                    state._fsp--;

                     
                            current = this_PatVector_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4334:5: this_PatLiteral_7= rulePatLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatLiteralParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulePatLiteral_in_rulePat9365);
                    this_PatLiteral_7=rulePatLiteral();

                    state._fsp--;

                     
                            current = this_PatLiteral_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4344:5: this_PatRange_8= rulePatRange
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatRangeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePatRange_in_rulePat9392);
                    this_PatRange_8=rulePatRange();

                    state._fsp--;

                     
                            current = this_PatRange_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4354:5: this_PatEnum_9= rulePatEnum
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatEnumParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_rulePatEnum_in_rulePat9419);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4370:1: entryRulePatWildcard returns [EObject current=null] : iv_rulePatWildcard= rulePatWildcard EOF ;
    public final EObject entryRulePatWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatWildcard = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4371:2: (iv_rulePatWildcard= rulePatWildcard EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4372:2: iv_rulePatWildcard= rulePatWildcard EOF
            {
             newCompositeNode(grammarAccess.getPatWildcardRule()); 
            pushFollow(FOLLOW_rulePatWildcard_in_entryRulePatWildcard9454);
            iv_rulePatWildcard=rulePatWildcard();

            state._fsp--;

             current =iv_rulePatWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatWildcard9464); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4379:1: rulePatWildcard returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject rulePatWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4382:28: ( ( () otherlv_1= '_' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4383:1: ( () otherlv_1= '_' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4383:1: ( () otherlv_1= '_' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4383:2: () otherlv_1= '_'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4383:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4384:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPatWildcardAccess().getPatWildcardAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,89,FOLLOW_89_in_rulePatWildcard9510); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4401:1: entryRulePatIdent returns [EObject current=null] : iv_rulePatIdent= rulePatIdent EOF ;
    public final EObject entryRulePatIdent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatIdent = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4402:2: (iv_rulePatIdent= rulePatIdent EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4403:2: iv_rulePatIdent= rulePatIdent EOF
            {
             newCompositeNode(grammarAccess.getPatIdentRule()); 
            pushFollow(FOLLOW_rulePatIdent_in_entryRulePatIdent9546);
            iv_rulePatIdent=rulePatIdent();

            state._fsp--;

             current =iv_rulePatIdent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatIdent9556); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4410:1: rulePatIdent returns [EObject current=null] : ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) ) ;
    public final EObject rulePatIdent() throws RecognitionException {
        EObject current = null;

        Token lv_mutable_0_0=null;
        Token lv_ident_1_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4413:28: ( ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4414:1: ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4414:1: ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4414:2: ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4414:2: ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4415:1: (lv_mutable_0_0= RULE_MUT_KEYWORD )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4415:1: (lv_mutable_0_0= RULE_MUT_KEYWORD )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4416:3: lv_mutable_0_0= RULE_MUT_KEYWORD
            {
            lv_mutable_0_0=(Token)match(input,RULE_MUT_KEYWORD,FOLLOW_RULE_MUT_KEYWORD_in_rulePatIdent9598); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4432:2: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4433:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4433:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4434:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePatIdent9620); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4458:1: entryRulePatBoxed returns [EObject current=null] : iv_rulePatBoxed= rulePatBoxed EOF ;
    public final EObject entryRulePatBoxed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatBoxed = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4459:2: (iv_rulePatBoxed= rulePatBoxed EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4460:2: iv_rulePatBoxed= rulePatBoxed EOF
            {
             newCompositeNode(grammarAccess.getPatBoxedRule()); 
            pushFollow(FOLLOW_rulePatBoxed_in_entryRulePatBoxed9661);
            iv_rulePatBoxed=rulePatBoxed();

            state._fsp--;

             current =iv_rulePatBoxed; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBoxed9671); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4467:1: rulePatBoxed returns [EObject current=null] : (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatBoxed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4470:28: ( (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4471:1: (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4471:1: (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4471:3: otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_rulePatBoxed9708); 

                	newLeafNode(otherlv_0, grammarAccess.getPatBoxedAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4475:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4476:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4476:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4477:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatBoxedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatBoxed9729);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4501:1: entryRulePatOwned returns [EObject current=null] : iv_rulePatOwned= rulePatOwned EOF ;
    public final EObject entryRulePatOwned() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatOwned = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4502:2: (iv_rulePatOwned= rulePatOwned EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4503:2: iv_rulePatOwned= rulePatOwned EOF
            {
             newCompositeNode(grammarAccess.getPatOwnedRule()); 
            pushFollow(FOLLOW_rulePatOwned_in_entryRulePatOwned9765);
            iv_rulePatOwned=rulePatOwned();

            state._fsp--;

             current =iv_rulePatOwned; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatOwned9775); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4510:1: rulePatOwned returns [EObject current=null] : (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatOwned() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4513:28: ( (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4514:1: (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4514:1: (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4514:3: otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_rulePatOwned9812); 

                	newLeafNode(otherlv_0, grammarAccess.getPatOwnedAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4518:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4519:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4519:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4520:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatOwnedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatOwned9833);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4544:1: entryRulePatBorrowed returns [EObject current=null] : iv_rulePatBorrowed= rulePatBorrowed EOF ;
    public final EObject entryRulePatBorrowed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatBorrowed = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4545:2: (iv_rulePatBorrowed= rulePatBorrowed EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4546:2: iv_rulePatBorrowed= rulePatBorrowed EOF
            {
             newCompositeNode(grammarAccess.getPatBorrowedRule()); 
            pushFollow(FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed9869);
            iv_rulePatBorrowed=rulePatBorrowed();

            state._fsp--;

             current =iv_rulePatBorrowed; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBorrowed9879); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4553:1: rulePatBorrowed returns [EObject current=null] : (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatBorrowed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4556:28: ( (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4557:1: (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4557:1: (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4557:3: otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_rulePatBorrowed9916); 

                	newLeafNode(otherlv_0, grammarAccess.getPatBorrowedAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4561:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4562:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4562:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4563:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatBorrowedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatBorrowed9937);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4587:1: entryRulePatTuple returns [EObject current=null] : iv_rulePatTuple= rulePatTuple EOF ;
    public final EObject entryRulePatTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatTuple = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4588:2: (iv_rulePatTuple= rulePatTuple EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4589:2: iv_rulePatTuple= rulePatTuple EOF
            {
             newCompositeNode(grammarAccess.getPatTupleRule()); 
            pushFollow(FOLLOW_rulePatTuple_in_entryRulePatTuple9973);
            iv_rulePatTuple=rulePatTuple();

            state._fsp--;

             current =iv_rulePatTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatTuple9983); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4596:1: rulePatTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' ) ;
    public final EObject rulePatTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_patterns_1_0 = null;

        EObject lv_patterns_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4599:28: ( (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4600:1: (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4600:1: (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4600:3: otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulePatTuple10020); 

                	newLeafNode(otherlv_0, grammarAccess.getPatTupleAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4604:1: ( (lv_patterns_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4605:1: (lv_patterns_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4605:1: (lv_patterns_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4606:3: lv_patterns_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatTuple10041);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4622:2: (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==46) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4622:4: otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulePatTuple10054); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPatTupleAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4626:1: ( (lv_patterns_3_0= rulePat ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4627:1: (lv_patterns_3_0= rulePat )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4627:1: (lv_patterns_3_0= rulePat )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4628:3: lv_patterns_3_0= rulePat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePat_in_rulePatTuple10075);
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
            	    break loop77;
                }
            } while (true);

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_rulePatTuple10089); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4656:1: entryRulePatVector returns [EObject current=null] : iv_rulePatVector= rulePatVector EOF ;
    public final EObject entryRulePatVector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatVector = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4657:2: (iv_rulePatVector= rulePatVector EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4658:2: iv_rulePatVector= rulePatVector EOF
            {
             newCompositeNode(grammarAccess.getPatVectorRule()); 
            pushFollow(FOLLOW_rulePatVector_in_entryRulePatVector10125);
            iv_rulePatVector=rulePatVector();

            state._fsp--;

             current =iv_rulePatVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatVector10135); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4665:1: rulePatVector returns [EObject current=null] : (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' ) ;
    public final EObject rulePatVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_patterns_1_0 = null;

        EObject lv_patterns_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4668:28: ( (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4669:1: (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4669:1: (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4669:3: otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_90_in_rulePatVector10172); 

                	newLeafNode(otherlv_0, grammarAccess.getPatVectorAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4673:1: ( (lv_patterns_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4674:1: (lv_patterns_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4674:1: (lv_patterns_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4675:3: lv_patterns_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatVector10193);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4691:2: (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==46) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4691:4: otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulePatVector10206); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPatVectorAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4695:1: ( (lv_patterns_3_0= rulePat ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4696:1: (lv_patterns_3_0= rulePat )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4696:1: (lv_patterns_3_0= rulePat )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4697:3: lv_patterns_3_0= rulePat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePat_in_rulePatVector10227);
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
            	    break loop78;
                }
            } while (true);

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_rulePatVector10241); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4725:1: entryRulePatLiteral returns [EObject current=null] : iv_rulePatLiteral= rulePatLiteral EOF ;
    public final EObject entryRulePatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4726:2: (iv_rulePatLiteral= rulePatLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4727:2: iv_rulePatLiteral= rulePatLiteral EOF
            {
             newCompositeNode(grammarAccess.getPatLiteralRule()); 
            pushFollow(FOLLOW_rulePatLiteral_in_entryRulePatLiteral10277);
            iv_rulePatLiteral=rulePatLiteral();

            state._fsp--;

             current =iv_rulePatLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatLiteral10287); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4734:1: rulePatLiteral returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject rulePatLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4737:28: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4738:1: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4738:1: ( (lv_literal_0_0= ruleLiteral ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4739:1: (lv_literal_0_0= ruleLiteral )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4739:1: (lv_literal_0_0= ruleLiteral )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4740:3: lv_literal_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getPatLiteralAccess().getLiteralLiteralParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_rulePatLiteral10332);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4764:1: entryRulePatRange returns [EObject current=null] : iv_rulePatRange= rulePatRange EOF ;
    public final EObject entryRulePatRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatRange = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4765:2: (iv_rulePatRange= rulePatRange EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4766:2: iv_rulePatRange= rulePatRange EOF
            {
             newCompositeNode(grammarAccess.getPatRangeRule()); 
            pushFollow(FOLLOW_rulePatRange_in_entryRulePatRange10367);
            iv_rulePatRange=rulePatRange();

            state._fsp--;

             current =iv_rulePatRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatRange10377); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4773:1: rulePatRange returns [EObject current=null] : (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange ) ;
    public final EObject rulePatRange() throws RecognitionException {
        EObject current = null;

        EObject this_PatCharRange_0 = null;

        EObject this_PatNumberRange_1 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4776:28: ( (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4777:1: (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4777:1: (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_CHAR_LIT) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=RULE_FLOAT_LIT && LA79_0<=RULE_INT_LIT)) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4778:5: this_PatCharRange_0= rulePatCharRange
                    {
                     
                            newCompositeNode(grammarAccess.getPatRangeAccess().getPatCharRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePatCharRange_in_rulePatRange10424);
                    this_PatCharRange_0=rulePatCharRange();

                    state._fsp--;

                     
                            current = this_PatCharRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4788:5: this_PatNumberRange_1= rulePatNumberRange
                    {
                     
                            newCompositeNode(grammarAccess.getPatRangeAccess().getPatNumberRangeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePatNumberRange_in_rulePatRange10451);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4804:1: entryRulePatCharRange returns [EObject current=null] : iv_rulePatCharRange= rulePatCharRange EOF ;
    public final EObject entryRulePatCharRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatCharRange = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4805:2: (iv_rulePatCharRange= rulePatCharRange EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4806:2: iv_rulePatCharRange= rulePatCharRange EOF
            {
             newCompositeNode(grammarAccess.getPatCharRangeRule()); 
            pushFollow(FOLLOW_rulePatCharRange_in_entryRulePatCharRange10486);
            iv_rulePatCharRange=rulePatCharRange();

            state._fsp--;

             current =iv_rulePatCharRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatCharRange10496); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4813:1: rulePatCharRange returns [EObject current=null] : ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) ) ;
    public final EObject rulePatCharRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4816:28: ( ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4817:1: ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4817:1: ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4817:2: ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4817:2: ( (lv_start_0_0= ruleCharLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4818:1: (lv_start_0_0= ruleCharLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4818:1: (lv_start_0_0= ruleCharLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4819:3: lv_start_0_0= ruleCharLit
            {
             
            	        newCompositeNode(grammarAccess.getPatCharRangeAccess().getStartCharLitParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCharLit_in_rulePatCharRange10542);
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

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_rulePatCharRange10554); 

                	newLeafNode(otherlv_1, grammarAccess.getPatCharRangeAccess().getFullStopFullStopKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4839:1: ( (lv_end_2_0= ruleCharLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4840:1: (lv_end_2_0= ruleCharLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4840:1: (lv_end_2_0= ruleCharLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4841:3: lv_end_2_0= ruleCharLit
            {
             
            	        newCompositeNode(grammarAccess.getPatCharRangeAccess().getEndCharLitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCharLit_in_rulePatCharRange10575);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4865:1: entryRulePatNumberRange returns [EObject current=null] : iv_rulePatNumberRange= rulePatNumberRange EOF ;
    public final EObject entryRulePatNumberRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatNumberRange = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4866:2: (iv_rulePatNumberRange= rulePatNumberRange EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4867:2: iv_rulePatNumberRange= rulePatNumberRange EOF
            {
             newCompositeNode(grammarAccess.getPatNumberRangeRule()); 
            pushFollow(FOLLOW_rulePatNumberRange_in_entryRulePatNumberRange10611);
            iv_rulePatNumberRange=rulePatNumberRange();

            state._fsp--;

             current =iv_rulePatNumberRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatNumberRange10621); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4874:1: rulePatNumberRange returns [EObject current=null] : ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) ) ;
    public final EObject rulePatNumberRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4877:28: ( ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4878:1: ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4878:1: ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4878:2: ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4878:2: ( (lv_start_0_0= ruleNumberLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4879:1: (lv_start_0_0= ruleNumberLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4879:1: (lv_start_0_0= ruleNumberLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4880:3: lv_start_0_0= ruleNumberLit
            {
             
            	        newCompositeNode(grammarAccess.getPatNumberRangeAccess().getStartNumberLitParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberLit_in_rulePatNumberRange10667);
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

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_rulePatNumberRange10679); 

                	newLeafNode(otherlv_1, grammarAccess.getPatNumberRangeAccess().getFullStopFullStopKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4900:1: ( (lv_end_2_0= ruleNumberLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4901:1: (lv_end_2_0= ruleNumberLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4901:1: (lv_end_2_0= ruleNumberLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4902:3: lv_end_2_0= ruleNumberLit
            {
             
            	        newCompositeNode(grammarAccess.getPatNumberRangeAccess().getEndNumberLitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberLit_in_rulePatNumberRange10700);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4926:1: entryRulePatEnum returns [EObject current=null] : iv_rulePatEnum= rulePatEnum EOF ;
    public final EObject entryRulePatEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatEnum = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4927:2: (iv_rulePatEnum= rulePatEnum EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4928:2: iv_rulePatEnum= rulePatEnum EOF
            {
             newCompositeNode(grammarAccess.getPatEnumRule()); 
            pushFollow(FOLLOW_rulePatEnum_in_entryRulePatEnum10736);
            iv_rulePatEnum=rulePatEnum();

            state._fsp--;

             current =iv_rulePatEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatEnum10746); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4935:1: rulePatEnum returns [EObject current=null] : ( ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4938:28: ( ( ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4939:1: ( ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4939:1: ( ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4939:2: ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4939:2: ( (lv_path_0_0= rulePath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4940:1: (lv_path_0_0= rulePath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4940:1: (lv_path_0_0= rulePath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4941:3: lv_path_0_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getPatEnumAccess().getPathPathParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePath_in_rulePatEnum10792);
            lv_path_0_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatEnumRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4957:2: ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==48) ) {
                alt83=1;
            }
            else if ( (LA83_0==53) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4957:3: ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4957:3: ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4957:4: () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4957:4: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4958:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPatEnumAccess().getPatTupleEnumPathAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_rulePatEnum10815); 

                        	newLeafNode(otherlv_2, grammarAccess.getPatEnumAccess().getLeftParenthesisKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4967:1: (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) )
                    int alt81=3;
                    switch ( input.LA(1) ) {
                    case 71:
                        {
                        alt81=1;
                        }
                        break;
                    case 69:
                        {
                        alt81=2;
                        }
                        break;
                    case RULE_IDENT:
                    case RULE_STRING_LIT:
                    case RULE_MUT_KEYWORD:
                    case RULE_FLOAT_LIT:
                    case RULE_INT_LIT:
                    case RULE_CHAR_LIT:
                    case 48:
                    case 73:
                    case 74:
                    case 75:
                    case 89:
                    case 90:
                        {
                        alt81=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }

                    switch (alt81) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4967:3: otherlv_3= '*'
                            {
                            otherlv_3=(Token)match(input,71,FOLLOW_71_in_rulePatEnum10828); 

                                	newLeafNode(otherlv_3, grammarAccess.getPatEnumAccess().getAsteriskKeyword_1_0_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4972:7: otherlv_4= '..'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_rulePatEnum10846); 

                                	newLeafNode(otherlv_4, grammarAccess.getPatEnumAccess().getFullStopFullStopKeyword_1_0_2_1());
                                

                            }
                            break;
                        case 3 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4977:6: ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4977:6: ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4977:7: ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )*
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4977:7: ( (lv_patterns_5_0= rulePat ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4978:1: (lv_patterns_5_0= rulePat )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4978:1: (lv_patterns_5_0= rulePat )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4979:3: lv_patterns_5_0= rulePat
                            {
                             
                            	        newCompositeNode(grammarAccess.getPatEnumAccess().getPatternsPatParserRuleCall_1_0_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulePat_in_rulePatEnum10874);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4995:2: (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )*
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==46) ) {
                                    alt80=1;
                                }


                                switch (alt80) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4995:4: otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) )
                            	    {
                            	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_rulePatEnum10887); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getPatEnumAccess().getCommaKeyword_1_0_2_2_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4999:1: ( (lv_patterns_7_0= rulePat ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5000:1: (lv_patterns_7_0= rulePat )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5000:1: (lv_patterns_7_0= rulePat )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5001:3: lv_patterns_7_0= rulePat
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPatEnumAccess().getPatternsPatParserRuleCall_1_0_2_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePat_in_rulePatEnum10908);
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
                            	    break loop80;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_rulePatEnum10924); 

                        	newLeafNode(otherlv_8, grammarAccess.getPatEnumAccess().getRightParenthesisKeyword_1_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5022:6: ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5022:6: ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5022:7: () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5022:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5023:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPatEnumAccess().getPatStructEnumPathAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,53,FOLLOW_53_in_rulePatEnum10953); 

                        	newLeafNode(otherlv_10, grammarAccess.getPatEnumAccess().getLeftCurlyBracketKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5032:1: ( (lv_fieldPatterns_11_0= ruleFieldPat ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5033:1: (lv_fieldPatterns_11_0= ruleFieldPat )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5033:1: (lv_fieldPatterns_11_0= ruleFieldPat )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5034:3: lv_fieldPatterns_11_0= ruleFieldPat
                    {
                     
                    	        newCompositeNode(grammarAccess.getPatEnumAccess().getFieldPatternsFieldPatParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldPat_in_rulePatEnum10974);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5050:2: (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==46) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5050:4: otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) )
                    	    {
                    	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_rulePatEnum10987); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getPatEnumAccess().getCommaKeyword_1_1_3_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5054:1: ( (lv_fieldPatterns_13_0= ruleFieldPat ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5055:1: (lv_fieldPatterns_13_0= ruleFieldPat )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5055:1: (lv_fieldPatterns_13_0= ruleFieldPat )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5056:3: lv_fieldPatterns_13_0= ruleFieldPat
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPatEnumAccess().getFieldPatternsFieldPatParserRuleCall_1_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFieldPat_in_rulePatEnum11008);
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
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,54,FOLLOW_54_in_rulePatEnum11022); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5084:1: entryRuleFieldPat returns [EObject current=null] : iv_ruleFieldPat= ruleFieldPat EOF ;
    public final EObject entryRuleFieldPat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPat = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5085:2: (iv_ruleFieldPat= ruleFieldPat EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5086:2: iv_ruleFieldPat= ruleFieldPat EOF
            {
             newCompositeNode(grammarAccess.getFieldPatRule()); 
            pushFollow(FOLLOW_ruleFieldPat_in_entryRuleFieldPat11060);
            iv_ruleFieldPat=ruleFieldPat();

            state._fsp--;

             current =iv_ruleFieldPat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldPat11070); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5093:1: ruleFieldPat returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? ) ;
    public final EObject ruleFieldPat() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        EObject lv_pattern_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5096:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5097:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5097:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5097:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5097:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5098:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5098:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5099:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFieldPat11112); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5115:2: (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==68) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5115:4: otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleFieldPat11130); 

                        	newLeafNode(otherlv_1, grammarAccess.getFieldPatAccess().getColonKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5119:1: ( (lv_pattern_2_0= rulePat ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5120:1: (lv_pattern_2_0= rulePat )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5120:1: (lv_pattern_2_0= rulePat )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5121:3: lv_pattern_2_0= rulePat
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldPatAccess().getPatternPatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePat_in_ruleFieldPat11151);
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


    // $ANTLR start "entryRulePath"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5145:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5146:2: (iv_rulePath= rulePath EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5147:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath11189);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath11199); 

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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5154:1: rulePath returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )? ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token lv_segments_0_0=null;
        Token otherlv_1=null;
        Token lv_segments_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_lifetimes_5_0=null;
        Token otherlv_7=null;
        Token lv_lifetimes_8_0=null;
        Token otherlv_10=null;
        EObject lv_genericTypes_6_0 = null;

        EObject lv_genericTypes_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5157:28: ( ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5158:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5158:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5158:2: ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5158:2: ( (lv_segments_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5159:1: (lv_segments_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5159:1: (lv_segments_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5160:3: lv_segments_0_0= RULE_IDENT
            {
            lv_segments_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePath11241); 

            			newLeafNode(lv_segments_0_0, grammarAccess.getPathAccess().getSegmentsIDENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPathRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"segments",
                    		lv_segments_0_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5176:2: (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==91) ) {
                    int LA85_1 = input.LA(2);

                    if ( (LA85_1==RULE_IDENT) ) {
                        alt85=1;
                    }


                }


                switch (alt85) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5176:4: otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) )
            	    {
            	    otherlv_1=(Token)match(input,91,FOLLOW_91_in_rulePath11259); 

            	        	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getColonColonKeyword_1_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5180:1: ( (lv_segments_2_0= RULE_IDENT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5181:1: (lv_segments_2_0= RULE_IDENT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5181:1: (lv_segments_2_0= RULE_IDENT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5182:3: lv_segments_2_0= RULE_IDENT
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePath11276); 

            	    			newLeafNode(lv_segments_2_0, grammarAccess.getPathAccess().getSegmentsIDENTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPathRule());
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
            	    break loop85;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5198:4: (otherlv_3= '::' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==91) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5198:6: otherlv_3= '::'
                    {
                    otherlv_3=(Token)match(input,91,FOLLOW_91_in_rulePath11296); 

                        	newLeafNode(otherlv_3, grammarAccess.getPathAccess().getColonColonKeyword_2());
                        

                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5202:3: (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==56) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5202:5: otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>'
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_56_in_rulePath11311); 

                        	newLeafNode(otherlv_4, grammarAccess.getPathAccess().getLessThanSignKeyword_3_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5206:1: ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_LIFETIME) ) {
                        alt87=1;
                    }
                    else if ( ((LA87_0>=RULE_INT_TYPE && LA87_0<=RULE_UNIT_TYPE)||LA87_0==48||(LA87_0>=60 && LA87_0<=61)||(LA87_0>=73 && LA87_0<=75)) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5206:2: ( (lv_lifetimes_5_0= RULE_LIFETIME ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5206:2: ( (lv_lifetimes_5_0= RULE_LIFETIME ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5207:1: (lv_lifetimes_5_0= RULE_LIFETIME )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5207:1: (lv_lifetimes_5_0= RULE_LIFETIME )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5208:3: lv_lifetimes_5_0= RULE_LIFETIME
                            {
                            lv_lifetimes_5_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_rulePath11329); 

                            			newLeafNode(lv_lifetimes_5_0, grammarAccess.getPathAccess().getLifetimesLIFETIMETerminalRuleCall_3_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPathRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"lifetimes",
                                    		lv_lifetimes_5_0, 
                                    		"LIFETIME");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5225:6: ( (lv_genericTypes_6_0= ruleType ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5225:6: ( (lv_genericTypes_6_0= ruleType ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5226:1: (lv_genericTypes_6_0= ruleType )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5226:1: (lv_genericTypes_6_0= ruleType )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5227:3: lv_genericTypes_6_0= ruleType
                            {
                             
                            	        newCompositeNode(grammarAccess.getPathAccess().getGenericTypesTypeParserRuleCall_3_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleType_in_rulePath11361);
                            lv_genericTypes_6_0=ruleType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPathRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"genericTypes",
                                    		lv_genericTypes_6_0, 
                                    		"Type");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5243:3: (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==46) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5243:5: otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,46,FOLLOW_46_in_rulePath11375); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPathAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5247:1: ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) )
                    	    int alt88=2;
                    	    int LA88_0 = input.LA(1);

                    	    if ( (LA88_0==RULE_LIFETIME) ) {
                    	        alt88=1;
                    	    }
                    	    else if ( ((LA88_0>=RULE_INT_TYPE && LA88_0<=RULE_UNIT_TYPE)||LA88_0==48||(LA88_0>=60 && LA88_0<=61)||(LA88_0>=73 && LA88_0<=75)) ) {
                    	        alt88=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 88, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt88) {
                    	        case 1 :
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5247:2: ( (lv_lifetimes_8_0= RULE_LIFETIME ) )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5247:2: ( (lv_lifetimes_8_0= RULE_LIFETIME ) )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5248:1: (lv_lifetimes_8_0= RULE_LIFETIME )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5248:1: (lv_lifetimes_8_0= RULE_LIFETIME )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5249:3: lv_lifetimes_8_0= RULE_LIFETIME
                    	            {
                    	            lv_lifetimes_8_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_rulePath11393); 

                    	            			newLeafNode(lv_lifetimes_8_0, grammarAccess.getPathAccess().getLifetimesLIFETIMETerminalRuleCall_3_2_1_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getPathRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"lifetimes",
                    	                    		lv_lifetimes_8_0, 
                    	                    		"LIFETIME");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5266:6: ( (lv_genericTypes_9_0= ruleType ) )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5266:6: ( (lv_genericTypes_9_0= ruleType ) )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5267:1: (lv_genericTypes_9_0= ruleType )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5267:1: (lv_genericTypes_9_0= ruleType )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5268:3: lv_genericTypes_9_0= ruleType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getPathAccess().getGenericTypesTypeParserRuleCall_3_2_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleType_in_rulePath11425);
                    	            lv_genericTypes_9_0=ruleType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getPathRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"genericTypes",
                    	                    		lv_genericTypes_9_0, 
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
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,57,FOLLOW_57_in_rulePath11440); 

                        	newLeafNode(otherlv_10, grammarAccess.getPathAccess().getGreaterThanSignKeyword_3_3());
                        

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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5296:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5297:2: (iv_ruleType= ruleType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5298:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType11478);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType11488); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5305:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_TupleType_1= ruleTupleType | this_StructType_2= ruleStructType | this_EnumType_3= ruleEnumType | this_BoxedPointer_4= ruleBoxedPointer | this_OwnedPointer_5= ruleOwnedPointer | this_BorrowedPointer_6= ruleBorrowedPointer ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_TupleType_1 = null;

        EObject this_StructType_2 = null;

        EObject this_EnumType_3 = null;

        EObject this_BoxedPointer_4 = null;

        EObject this_OwnedPointer_5 = null;

        EObject this_BorrowedPointer_6 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5308:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_TupleType_1= ruleTupleType | this_StructType_2= ruleStructType | this_EnumType_3= ruleEnumType | this_BoxedPointer_4= ruleBoxedPointer | this_OwnedPointer_5= ruleOwnedPointer | this_BorrowedPointer_6= ruleBorrowedPointer ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5309:1: (this_PrimitiveType_0= rulePrimitiveType | this_TupleType_1= ruleTupleType | this_StructType_2= ruleStructType | this_EnumType_3= ruleEnumType | this_BoxedPointer_4= ruleBoxedPointer | this_OwnedPointer_5= ruleOwnedPointer | this_BorrowedPointer_6= ruleBorrowedPointer )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5309:1: (this_PrimitiveType_0= rulePrimitiveType | this_TupleType_1= ruleTupleType | this_StructType_2= ruleStructType | this_EnumType_3= ruleEnumType | this_BoxedPointer_4= ruleBoxedPointer | this_OwnedPointer_5= ruleOwnedPointer | this_BorrowedPointer_6= ruleBorrowedPointer )
            int alt91=7;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
            case RULE_FLOAT_TYPE:
            case RULE_BOOLEAN_TYPE:
            case RULE_MACHINE_TYPE:
            case RULE_UNIT_TYPE:
                {
                alt91=1;
                }
                break;
            case 48:
                {
                alt91=2;
                }
                break;
            case 60:
                {
                alt91=3;
                }
                break;
            case 61:
                {
                alt91=4;
                }
                break;
            case 73:
                {
                alt91=5;
                }
                break;
            case 74:
                {
                alt91=6;
                }
                break;
            case 75:
                {
                alt91=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5310:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType11535);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;

                     
                            current = this_PrimitiveType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5320:5: this_TupleType_1= ruleTupleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleType_in_ruleType11562);
                    this_TupleType_1=ruleTupleType();

                    state._fsp--;

                     
                            current = this_TupleType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5330:5: this_StructType_2= ruleStructType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStructType_in_ruleType11589);
                    this_StructType_2=ruleStructType();

                    state._fsp--;

                     
                            current = this_StructType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5340:5: this_EnumType_3= ruleEnumType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_ruleType11616);
                    this_EnumType_3=ruleEnumType();

                    state._fsp--;

                     
                            current = this_EnumType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5350:5: this_BoxedPointer_4= ruleBoxedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBoxedPointerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBoxedPointer_in_ruleType11643);
                    this_BoxedPointer_4=ruleBoxedPointer();

                    state._fsp--;

                     
                            current = this_BoxedPointer_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5360:5: this_OwnedPointer_5= ruleOwnedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getOwnedPointerParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleOwnedPointer_in_ruleType11670);
                    this_OwnedPointer_5=ruleOwnedPointer();

                    state._fsp--;

                     
                            current = this_OwnedPointer_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5370:5: this_BorrowedPointer_6= ruleBorrowedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBorrowedPointerParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleBorrowedPointer_in_ruleType11697);
                    this_BorrowedPointer_6=ruleBorrowedPointer();

                    state._fsp--;

                     
                            current = this_BorrowedPointer_6; 
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5386:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5387:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5388:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType11732);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType11742); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5395:1: rulePrimitiveType returns [EObject current=null] : ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token this_INT_TYPE_1=null;
        Token this_FLOAT_TYPE_3=null;
        Token this_BOOLEAN_TYPE_5=null;
        Token this_MACHINE_TYPE_7=null;
        Token this_UNIT_TYPE_9=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5398:28: ( ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5399:1: ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5399:1: ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) )
            int alt92=5;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
                {
                alt92=1;
                }
                break;
            case RULE_FLOAT_TYPE:
                {
                alt92=2;
                }
                break;
            case RULE_BOOLEAN_TYPE:
                {
                alt92=3;
                }
                break;
            case RULE_MACHINE_TYPE:
                {
                alt92=4;
                }
                break;
            case RULE_UNIT_TYPE:
                {
                alt92=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5399:2: ( () this_INT_TYPE_1= RULE_INT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5399:2: ( () this_INT_TYPE_1= RULE_INT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5399:3: () this_INT_TYPE_1= RULE_INT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5399:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5400:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getIntTypeAction_0_0(),
                                current);
                        

                    }

                    this_INT_TYPE_1=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rulePrimitiveType11788); 
                     
                        newLeafNode(this_INT_TYPE_1, grammarAccess.getPrimitiveTypeAccess().getINT_TYPETerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5410:6: ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5410:6: ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5410:7: () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5410:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5411:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getFloatTypeAction_1_0(),
                                current);
                        

                    }

                    this_FLOAT_TYPE_3=(Token)match(input,RULE_FLOAT_TYPE,FOLLOW_RULE_FLOAT_TYPE_in_rulePrimitiveType11815); 
                     
                        newLeafNode(this_FLOAT_TYPE_3, grammarAccess.getPrimitiveTypeAccess().getFLOAT_TYPETerminalRuleCall_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5421:6: ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5421:6: ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5421:7: () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5421:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5422:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getBoolTypeAction_2_0(),
                                current);
                        

                    }

                    this_BOOLEAN_TYPE_5=(Token)match(input,RULE_BOOLEAN_TYPE,FOLLOW_RULE_BOOLEAN_TYPE_in_rulePrimitiveType11842); 
                     
                        newLeafNode(this_BOOLEAN_TYPE_5, grammarAccess.getPrimitiveTypeAccess().getBOOLEAN_TYPETerminalRuleCall_2_1()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5432:6: ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5432:6: ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5432:7: () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5432:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5433:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getMachineTypeAction_3_0(),
                                current);
                        

                    }

                    this_MACHINE_TYPE_7=(Token)match(input,RULE_MACHINE_TYPE,FOLLOW_RULE_MACHINE_TYPE_in_rulePrimitiveType11869); 
                     
                        newLeafNode(this_MACHINE_TYPE_7, grammarAccess.getPrimitiveTypeAccess().getMACHINE_TYPETerminalRuleCall_3_1()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5443:6: ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5443:6: ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5443:7: () this_UNIT_TYPE_9= RULE_UNIT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5443:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5444:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getUnitTypeAction_4_0(),
                                current);
                        

                    }

                    this_UNIT_TYPE_9=(Token)match(input,RULE_UNIT_TYPE,FOLLOW_RULE_UNIT_TYPE_in_rulePrimitiveType11896); 
                     
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


    // $ANTLR start "entryRuleTupleType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5461:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5462:2: (iv_ruleTupleType= ruleTupleType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5463:2: iv_ruleTupleType= ruleTupleType EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_ruleTupleType_in_entryRuleTupleType11932);
            iv_ruleTupleType=ruleTupleType();

            state._fsp--;

             current =iv_ruleTupleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleType11942); 

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
    // $ANTLR end "entryRuleTupleType"


    // $ANTLR start "ruleTupleType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5470:1: ruleTupleType returns [EObject current=null] : (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5473:28: ( (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5474:1: (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5474:1: (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5474:3: otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleTupleType11979); 

                	newLeafNode(otherlv_0, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5478:1: ( (lv_types_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5479:1: (lv_types_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5479:1: (lv_types_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5480:3: lv_types_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTupleType12000);
            lv_types_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTupleTypeRule());
            	        }
                   		add(
                   			current, 
                   			"types",
                    		lv_types_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5496:2: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==46) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5496:4: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleTupleType12013); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5500:1: ( (lv_types_3_0= ruleType ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5501:1: (lv_types_3_0= ruleType )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5501:1: (lv_types_3_0= ruleType )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5502:3: lv_types_3_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleTupleType12034);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTupleTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_3_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleTupleType12048); 

                	newLeafNode(otherlv_4, grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleTupleType"


    // $ANTLR start "entryRuleStructType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5530:1: entryRuleStructType returns [EObject current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final EObject entryRuleStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5531:2: (iv_ruleStructType= ruleStructType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5532:2: iv_ruleStructType= ruleStructType EOF
            {
             newCompositeNode(grammarAccess.getStructTypeRule()); 
            pushFollow(FOLLOW_ruleStructType_in_entryRuleStructType12084);
            iv_ruleStructType=ruleStructType();

            state._fsp--;

             current =iv_ruleStructType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructType12094); 

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
    // $ANTLR end "entryRuleStructType"


    // $ANTLR start "ruleStructType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5539:1: ruleStructType returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleStructType() throws RecognitionException {
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5542:28: ( (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5543:1: (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5543:1: (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5543:3: otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleStructType12131); 

                	newLeafNode(otherlv_0, grammarAccess.getStructTypeAccess().getStructKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5547:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5548:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5548:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5549:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructType12148); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getStructTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5565:2: (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==56) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5565:4: otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleStructType12166); 

                        	newLeafNode(otherlv_2, grammarAccess.getStructTypeAccess().getLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5569:1: ( (lv_params_3_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5570:1: (lv_params_3_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5570:1: (lv_params_3_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5571:3: lv_params_3_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructType12187);
                    lv_params_3_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5587:2: (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==46) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5587:4: otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleStructType12200); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getStructTypeAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5591:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5592:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5592:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5593:3: lv_params_5_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructType12221);
                    	    lv_params_5_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructTypeRule());
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
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleStructType12235); 

                        	newLeafNode(otherlv_6, grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleStructType12249); 

                	newLeafNode(otherlv_7, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5617:1: ( (lv_fields_8_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5618:1: (lv_fields_8_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5618:1: (lv_fields_8_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5619:3: lv_fields_8_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleStructType12270);
            lv_fields_8_0=ruleStructField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStructTypeRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_8_0, 
                    		"StructField");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5635:2: (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==46) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5635:4: otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleStructType12283); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStructTypeAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5639:1: ( (lv_fields_10_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5640:1: (lv_fields_10_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5640:1: (lv_fields_10_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5641:3: lv_fields_10_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleStructType12304);
            	    lv_fields_10_0=ruleStructField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructTypeRule());
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
            	    break loop96;
                }
            } while (true);

            otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleStructType12318); 

                	newLeafNode(otherlv_11, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleStructType"


    // $ANTLR start "entryRuleBoxedPointer"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5669:1: entryRuleBoxedPointer returns [EObject current=null] : iv_ruleBoxedPointer= ruleBoxedPointer EOF ;
    public final EObject entryRuleBoxedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5670:2: (iv_ruleBoxedPointer= ruleBoxedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5671:2: iv_ruleBoxedPointer= ruleBoxedPointer EOF
            {
             newCompositeNode(grammarAccess.getBoxedPointerRule()); 
            pushFollow(FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer12354);
            iv_ruleBoxedPointer=ruleBoxedPointer();

            state._fsp--;

             current =iv_ruleBoxedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxedPointer12364); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5678:1: ruleBoxedPointer returns [EObject current=null] : (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleBoxedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5681:28: ( (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5682:1: (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5682:1: (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5682:3: otherlv_0= '@' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleBoxedPointer12401); 

                	newLeafNode(otherlv_0, grammarAccess.getBoxedPointerAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5686:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5687:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5687:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5688:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBoxedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleBoxedPointer12422);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5712:1: entryRuleOwnedPointer returns [EObject current=null] : iv_ruleOwnedPointer= ruleOwnedPointer EOF ;
    public final EObject entryRuleOwnedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5713:2: (iv_ruleOwnedPointer= ruleOwnedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5714:2: iv_ruleOwnedPointer= ruleOwnedPointer EOF
            {
             newCompositeNode(grammarAccess.getOwnedPointerRule()); 
            pushFollow(FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer12458);
            iv_ruleOwnedPointer=ruleOwnedPointer();

            state._fsp--;

             current =iv_ruleOwnedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedPointer12468); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5721:1: ruleOwnedPointer returns [EObject current=null] : (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleOwnedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5724:28: ( (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5725:1: (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5725:1: (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5725:3: otherlv_0= '~' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleOwnedPointer12505); 

                	newLeafNode(otherlv_0, grammarAccess.getOwnedPointerAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5729:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5730:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5730:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5731:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getOwnedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleOwnedPointer12526);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5755:1: entryRuleBorrowedPointer returns [EObject current=null] : iv_ruleBorrowedPointer= ruleBorrowedPointer EOF ;
    public final EObject entryRuleBorrowedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorrowedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5756:2: (iv_ruleBorrowedPointer= ruleBorrowedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5757:2: iv_ruleBorrowedPointer= ruleBorrowedPointer EOF
            {
             newCompositeNode(grammarAccess.getBorrowedPointerRule()); 
            pushFollow(FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer12562);
            iv_ruleBorrowedPointer=ruleBorrowedPointer();

            state._fsp--;

             current =iv_ruleBorrowedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrowedPointer12572); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5764:1: ruleBorrowedPointer returns [EObject current=null] : (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleBorrowedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5767:28: ( (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5768:1: (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5768:1: (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5768:3: otherlv_0= '&' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleBorrowedPointer12609); 

                	newLeafNode(otherlv_0, grammarAccess.getBorrowedPointerAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5772:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5773:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5773:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5774:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBorrowedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleBorrowedPointer12630);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5798:1: entryRuleStructField returns [EObject current=null] : iv_ruleStructField= ruleStructField EOF ;
    public final EObject entryRuleStructField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructField = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5799:2: (iv_ruleStructField= ruleStructField EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5800:2: iv_ruleStructField= ruleStructField EOF
            {
             newCompositeNode(grammarAccess.getStructFieldRule()); 
            pushFollow(FOLLOW_ruleStructField_in_entryRuleStructField12666);
            iv_ruleStructField=ruleStructField();

            state._fsp--;

             current =iv_ruleStructField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructField12676); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5807:1: ruleStructField returns [EObject current=null] : ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleStructField() throws RecognitionException {
        EObject current = null;

        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_vis_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5810:28: ( ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5811:1: ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5811:1: ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5811:2: ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5811:2: ( (lv_vis_0_0= ruleVisibility ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=92 && LA97_0<=93)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5812:1: (lv_vis_0_0= ruleVisibility )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5812:1: (lv_vis_0_0= ruleVisibility )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5813:3: lv_vis_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructFieldAccess().getVisVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibility_in_ruleStructField12722);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5829:3: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5830:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5830:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5831:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructField12740); 

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

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleStructField12757); 

                	newLeafNode(otherlv_2, grammarAccess.getStructFieldAccess().getColonKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5851:1: ( (lv_type_3_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5852:1: (lv_type_3_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5852:1: (lv_type_3_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5853:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getStructFieldAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleStructField12778);
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


    // $ANTLR start "entryRuleEnumType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5877:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5878:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5879:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType12814);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType12824); 

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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5886:1: ruleEnumType returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5889:28: ( (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5890:1: (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5890:1: (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5890:3: otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleEnumType12861); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getEnumKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5894:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5895:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5895:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5896:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleEnumType12878); 

            			newLeafNode(lv_ident_1_0, grammarAccess.getEnumTypeAccess().getIdentIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ident",
                    		lv_ident_1_0, 
                    		"IDENT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5912:2: (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==56) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5912:4: otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleEnumType12896); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumTypeAccess().getLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5916:1: ( (lv_params_3_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5917:1: (lv_params_3_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5917:1: (lv_params_3_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5918:3: lv_params_3_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleEnumType12917);
                    lv_params_3_0=ruleGenericParamDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"GenericParamDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5934:2: (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==46) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5934:4: otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleEnumType12930); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEnumTypeAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5938:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5939:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5939:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5940:3: lv_params_5_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleEnumType12951);
                    	    lv_params_5_0=ruleGenericParamDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumTypeRule());
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
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleEnumType12965); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumTypeAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleEnumType12979); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5964:1: ( (lv_variants_8_0= ruleVariant ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5965:1: (lv_variants_8_0= ruleVariant )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5965:1: (lv_variants_8_0= ruleVariant )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5966:3: lv_variants_8_0= ruleVariant
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariant_in_ruleEnumType13000);
            lv_variants_8_0=ruleVariant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumTypeRule());
            	        }
                   		add(
                   			current, 
                   			"variants",
                    		lv_variants_8_0, 
                    		"Variant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5982:2: (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==46) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5982:4: otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleEnumType13013); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEnumTypeAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5986:1: ( (lv_variants_10_0= ruleVariant ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5987:1: (lv_variants_10_0= ruleVariant )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5987:1: (lv_variants_10_0= ruleVariant )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5988:3: lv_variants_10_0= ruleVariant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariant_in_ruleEnumType13034);
            	    lv_variants_10_0=ruleVariant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variants",
            	            		lv_variants_10_0, 
            	            		"Variant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleEnumType13048); 

                	newLeafNode(otherlv_11, grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6016:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6017:2: (iv_ruleVariant= ruleVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6018:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_ruleVariant_in_entryRuleVariant13084);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariant13094); 

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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6025:1: ruleVariant returns [EObject current=null] : (this_StructVariant_0= ruleStructVariant | this_TupleVariant_1= ruleTupleVariant | this_UnitVariant_2= ruleUnitVariant ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        EObject this_StructVariant_0 = null;

        EObject this_TupleVariant_1 = null;

        EObject this_UnitVariant_2 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6028:28: ( (this_StructVariant_0= ruleStructVariant | this_TupleVariant_1= ruleTupleVariant | this_UnitVariant_2= ruleUnitVariant ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6029:1: (this_StructVariant_0= ruleStructVariant | this_TupleVariant_1= ruleTupleVariant | this_UnitVariant_2= ruleUnitVariant )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6029:1: (this_StructVariant_0= ruleStructVariant | this_TupleVariant_1= ruleTupleVariant | this_UnitVariant_2= ruleUnitVariant )
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_IDENT) ) {
                switch ( input.LA(2) ) {
                case 53:
                case 56:
                    {
                    alt101=1;
                    }
                    break;
                case EOF:
                case 46:
                case 54:
                    {
                    alt101=3;
                    }
                    break;
                case 48:
                    {
                    alt101=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6030:5: this_StructVariant_0= ruleStructVariant
                    {
                     
                            newCompositeNode(grammarAccess.getVariantAccess().getStructVariantParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructVariant_in_ruleVariant13141);
                    this_StructVariant_0=ruleStructVariant();

                    state._fsp--;

                     
                            current = this_StructVariant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6040:5: this_TupleVariant_1= ruleTupleVariant
                    {
                     
                            newCompositeNode(grammarAccess.getVariantAccess().getTupleVariantParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleVariant_in_ruleVariant13168);
                    this_TupleVariant_1=ruleTupleVariant();

                    state._fsp--;

                     
                            current = this_TupleVariant_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6050:5: this_UnitVariant_2= ruleUnitVariant
                    {
                     
                            newCompositeNode(grammarAccess.getVariantAccess().getUnitVariantParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUnitVariant_in_ruleVariant13195);
                    this_UnitVariant_2=ruleUnitVariant();

                    state._fsp--;

                     
                            current = this_UnitVariant_2; 
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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleStructVariant"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6066:1: entryRuleStructVariant returns [EObject current=null] : iv_ruleStructVariant= ruleStructVariant EOF ;
    public final EObject entryRuleStructVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6067:2: (iv_ruleStructVariant= ruleStructVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6068:2: iv_ruleStructVariant= ruleStructVariant EOF
            {
             newCompositeNode(grammarAccess.getStructVariantRule()); 
            pushFollow(FOLLOW_ruleStructVariant_in_entryRuleStructVariant13230);
            iv_ruleStructVariant=ruleStructVariant();

            state._fsp--;

             current =iv_ruleStructVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructVariant13240); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6075:1: ruleStructVariant returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6078:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6079:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6079:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6079:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6079:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6080:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6080:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6081:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructVariant13282); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6097:2: (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==56) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6097:4: otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleStructVariant13300); 

                        	newLeafNode(otherlv_1, grammarAccess.getStructVariantAccess().getLessThanSignKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6101:1: ( (lv_params_2_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6102:1: (lv_params_2_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6102:1: (lv_params_2_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6103:3: lv_params_2_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructVariant13321);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6119:2: (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==46) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6119:4: otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleStructVariant13334); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getStructVariantAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6123:1: ( (lv_params_4_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6124:1: (lv_params_4_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6124:1: (lv_params_4_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6125:3: lv_params_4_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructVariant13355);
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
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleStructVariant13369); 

                        	newLeafNode(otherlv_5, grammarAccess.getStructVariantAccess().getGreaterThanSignKeyword_1_3());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleStructVariant13383); 

                	newLeafNode(otherlv_6, grammarAccess.getStructVariantAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6149:1: ( (lv_fields_7_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6150:1: (lv_fields_7_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6150:1: (lv_fields_7_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6151:3: lv_fields_7_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleStructVariant13404);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6167:2: (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==46) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6167:4: otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) )
            	    {
            	    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleStructVariant13417); 

            	        	newLeafNode(otherlv_8, grammarAccess.getStructVariantAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6171:1: ( (lv_fields_9_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6172:1: (lv_fields_9_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6172:1: (lv_fields_9_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6173:3: lv_fields_9_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleStructVariant13438);
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
            	    break loop104;
                }
            } while (true);

            otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleStructVariant13452); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6201:1: entryRuleTupleVariant returns [EObject current=null] : iv_ruleTupleVariant= ruleTupleVariant EOF ;
    public final EObject entryRuleTupleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6202:2: (iv_ruleTupleVariant= ruleTupleVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6203:2: iv_ruleTupleVariant= ruleTupleVariant EOF
            {
             newCompositeNode(grammarAccess.getTupleVariantRule()); 
            pushFollow(FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant13488);
            iv_ruleTupleVariant=ruleTupleVariant();

            state._fsp--;

             current =iv_ruleTupleVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleVariant13498); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6210:1: ruleTupleVariant returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6213:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6214:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6214:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6214:2: ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6214:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6215:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6215:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6216:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTupleVariant13540); 

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

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleTupleVariant13557); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleVariantAccess().getLeftParenthesisKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6236:1: ( (lv_types_2_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6237:1: (lv_types_2_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6237:1: (lv_types_2_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6238:3: lv_types_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTupleVariant13578);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6254:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==46) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6254:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleTupleVariant13591); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTupleVariantAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6258:1: ( (lv_types_4_0= ruleType ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6259:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6259:1: (lv_types_4_0= ruleType )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6260:3: lv_types_4_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleTupleVariant13612);
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
            	    break loop105;
                }
            } while (true);

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleTupleVariant13626); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6288:1: entryRuleUnitVariant returns [EObject current=null] : iv_ruleUnitVariant= ruleUnitVariant EOF ;
    public final EObject entryRuleUnitVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6289:2: (iv_ruleUnitVariant= ruleUnitVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6290:2: iv_ruleUnitVariant= ruleUnitVariant EOF
            {
             newCompositeNode(grammarAccess.getUnitVariantRule()); 
            pushFollow(FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant13662);
            iv_ruleUnitVariant=ruleUnitVariant();

            state._fsp--;

             current =iv_ruleUnitVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitVariant13672); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6297:1: ruleUnitVariant returns [EObject current=null] : ( (lv_ident_0_0= RULE_IDENT ) ) ;
    public final EObject ruleUnitVariant() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6300:28: ( ( (lv_ident_0_0= RULE_IDENT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6301:1: ( (lv_ident_0_0= RULE_IDENT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6301:1: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6302:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6302:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6303:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleUnitVariant13713); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6327:1: entryRuleStringLit returns [EObject current=null] : iv_ruleStringLit= ruleStringLit EOF ;
    public final EObject entryRuleStringLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6328:2: (iv_ruleStringLit= ruleStringLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6329:2: iv_ruleStringLit= ruleStringLit EOF
            {
             newCompositeNode(grammarAccess.getStringLitRule()); 
            pushFollow(FOLLOW_ruleStringLit_in_entryRuleStringLit13753);
            iv_ruleStringLit=ruleStringLit();

            state._fsp--;

             current =iv_ruleStringLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLit13763); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6336:1: ruleStringLit returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_LIT ) ) ;
    public final EObject ruleStringLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6339:28: ( ( (lv_value_0_0= RULE_STRING_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6340:1: ( (lv_value_0_0= RULE_STRING_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6340:1: ( (lv_value_0_0= RULE_STRING_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6341:1: (lv_value_0_0= RULE_STRING_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6341:1: (lv_value_0_0= RULE_STRING_LIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6342:3: lv_value_0_0= RULE_STRING_LIT
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_RULE_STRING_LIT_in_ruleStringLit13804); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6366:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6367:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6368:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral13844);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral13854); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6375:1: ruleLiteral returns [EObject current=null] : (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLit_0 = null;

        EObject this_CharLit_1 = null;

        EObject this_StringLit_2 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6378:28: ( (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6379:1: (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6379:1: (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit )
            int alt106=3;
            switch ( input.LA(1) ) {
            case RULE_FLOAT_LIT:
            case RULE_INT_LIT:
                {
                alt106=1;
                }
                break;
            case RULE_CHAR_LIT:
                {
                alt106=2;
                }
                break;
            case RULE_STRING_LIT:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6380:5: this_NumberLit_0= ruleNumberLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberLit_in_ruleLiteral13901);
                    this_NumberLit_0=ruleNumberLit();

                    state._fsp--;

                     
                            current = this_NumberLit_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6390:5: this_CharLit_1= ruleCharLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCharLit_in_ruleLiteral13928);
                    this_CharLit_1=ruleCharLit();

                    state._fsp--;

                     
                            current = this_CharLit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6400:5: this_StringLit_2= ruleStringLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLitParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringLit_in_ruleLiteral13955);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6416:1: entryRuleNumberLit returns [EObject current=null] : iv_ruleNumberLit= ruleNumberLit EOF ;
    public final EObject entryRuleNumberLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6417:2: (iv_ruleNumberLit= ruleNumberLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6418:2: iv_ruleNumberLit= ruleNumberLit EOF
            {
             newCompositeNode(grammarAccess.getNumberLitRule()); 
            pushFollow(FOLLOW_ruleNumberLit_in_entryRuleNumberLit13990);
            iv_ruleNumberLit=ruleNumberLit();

            state._fsp--;

             current =iv_ruleNumberLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLit14000); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6425:1: ruleNumberLit returns [EObject current=null] : ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) ) ;
    public final EObject ruleNumberLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6428:28: ( ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6429:1: ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6429:1: ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6430:1: ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6430:1: ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6431:1: (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6431:1: (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_FLOAT_LIT) ) {
                alt107=1;
            }
            else if ( (LA107_0==RULE_INT_LIT) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6432:3: lv_value_0_1= RULE_FLOAT_LIT
                    {
                    lv_value_0_1=(Token)match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_ruleNumberLit14043); 

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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6447:8: lv_value_0_2= RULE_INT_LIT
                    {
                    lv_value_0_2=(Token)match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_ruleNumberLit14063); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6473:1: entryRuleCharLit returns [EObject current=null] : iv_ruleCharLit= ruleCharLit EOF ;
    public final EObject entryRuleCharLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6474:2: (iv_ruleCharLit= ruleCharLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6475:2: iv_ruleCharLit= ruleCharLit EOF
            {
             newCompositeNode(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit14106);
            iv_ruleCharLit=ruleCharLit();

            state._fsp--;

             current =iv_ruleCharLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit14116); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6482:1: ruleCharLit returns [EObject current=null] : ( (lv_value_0_0= RULE_CHAR_LIT ) ) ;
    public final EObject ruleCharLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6485:28: ( ( (lv_value_0_0= RULE_CHAR_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6486:1: ( (lv_value_0_0= RULE_CHAR_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6486:1: ( (lv_value_0_0= RULE_CHAR_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6487:1: (lv_value_0_0= RULE_CHAR_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6487:1: (lv_value_0_0= RULE_CHAR_LIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6488:3: lv_value_0_0= RULE_CHAR_LIT
            {
            lv_value_0_0=(Token)match(input,RULE_CHAR_LIT,FOLLOW_RULE_CHAR_LIT_in_ruleCharLit14157); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6512:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6514:28: ( ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6515:1: ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6515:1: ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==92) ) {
                alt108=1;
            }
            else if ( (LA108_0==93) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6515:2: (enumLiteral_0= 'priv' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6515:2: (enumLiteral_0= 'priv' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6515:4: enumLiteral_0= 'priv'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleVisibility14211); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6521:6: (enumLiteral_1= 'pub' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6521:6: (enumLiteral_1= 'pub' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6521:8: enumLiteral_1= 'pub'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleVisibility14228); 

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


    protected DFA76 dfa76 = new DFA76(this);
    static final String DFA76_eotS =
        "\16\uffff";
    static final String DFA76_eofS =
        "\10\uffff\3\13\3\uffff";
    static final String DFA76_minS =
        "\1\4\7\uffff\3\56\3\uffff";
    static final String DFA76_maxS =
        "\1\132\7\uffff\3\105\3\uffff";
    static final String DFA76_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\10\1\12\1\11";
    static final String DFA76_specialS =
        "\16\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\14\1\13\1\2\6\uffff\1\10\1\11\1\12\40\uffff\1\6\30\uffff"+
            "\1\3\1\4\1\5\15\uffff\1\1\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\13\1\uffff\1\13\4\uffff\1\13\15\uffff\1\13\1\15",
            "\2\13\1\uffff\1\13\4\uffff\1\13\15\uffff\1\13\1\15",
            "\2\13\1\uffff\1\13\4\uffff\1\13\15\uffff\1\13\1\15",
            "",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4263:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum )";
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
    public static final BitSet FOLLOW_48_in_ruleFnItem1516 = new BitSet(new long[]{0x000300000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_ruleArg_in_ruleFnItem1538 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFnItem1551 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_ruleArg_in_ruleFnItem1572 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleFnItem1588 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_58_in_ruleFnItem1601 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
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
    public static final BitSet FOLLOW_50_in_ruleTypeItem1846 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
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
    public static final BitSet FOLLOW_53_in_ruleStructItem2080 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructItem2101 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructItem2114 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
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
    public static final BitSet FOLLOW_48_in_ruleEnumVariant2612 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleEnumVariant2633 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumVariant2646 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleEnumVariant2667 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleEnumVariant2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEnumVariant2701 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleEnumVariant2722 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumVariant2735 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
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
    public static final BitSet FOLLOW_53_in_ruleTraitItem2974 = new BitSet(new long[]{0x80C0000000000000L,0x0000000030000001L});
    public static final BitSet FOLLOW_ruleTraitMethod_in_ruleTraitItem2995 = new BitSet(new long[]{0x80C0000000000000L,0x0000000030000001L});
    public static final BitSet FOLLOW_54_in_ruleTraitItem3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraitMethod_in_entryRuleTraitMethod3044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraitMethod3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTraitMethod3098 = new BitSet(new long[]{0x0080000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_64_in_ruleTraitMethod3135 = new BitSet(new long[]{0x0080000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleTraitMethod3171 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTraitMethod3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTraitMethod3201 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_ruleTraitMethod3219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3240 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTraitMethod3253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3274 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleTraitMethod3288 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTraitMethod3302 = new BitSet(new long[]{0x000300000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_ruleArg_in_ruleTraitMethod3324 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTraitMethod3337 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_ruleArg_in_ruleTraitMethod3358 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTraitMethod3374 = new BitSet(new long[]{0x0430000000000000L});
    public static final BitSet FOLLOW_58_in_ruleTraitMethod3387 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
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
    public static final BitSet FOLLOW_48_in_ruleImplMethod3911 = new BitSet(new long[]{0x000300000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_ruleArg_in_ruleImplMethod3933 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleImplMethod3946 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_ruleArg_in_ruleImplMethod3967 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleImplMethod3983 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_58_in_ruleImplMethod3996 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
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
    public static final BitSet FOLLOW_48_in_ruleForeignFn4318 = new BitSet(new long[]{0x000300000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_ruleArg_in_ruleForeignFn4340 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleForeignFn4353 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_ruleArg_in_ruleForeignFn4374 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleForeignFn4390 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_58_in_ruleForeignFn4403 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleForeignFn4424 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleForeignFn4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticItem_in_entryRuleStaticItem4474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticItem4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleStaticItem4521 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_ruleStaticItem4538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStaticItem4560 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticItem4578 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleStaticItem4599 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleStaticItem4613 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleStaticItem4634 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleStaticItem4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr4682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRValue_in_ruleExpr4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLValue_in_entryRuleExprLValue4772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLValue4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPath_in_ruleExprLValue4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRValue_in_entryRuleExprRValue4862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRValue4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBinary_in_ruleExprRValue4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleExprRValue4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_entryRuleExprLeaf4981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLeaf4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprGroup_in_ruleExprLeaf5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_ruleExprLeaf5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprUnary_in_ruleExprLeaf5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPath_in_entryRuleExprPath5129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprPath5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleExprPath5185 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_ruleExprPath5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTuple_in_ruleExprPath5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprGroup_in_entryRuleExprGroup5294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprGroup5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprGroup5341 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5362 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5384 = new BitSet(new long[]{0x002300000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5406 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5419 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5440 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5455 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleExprGroup5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTuple_in_entryRuleExprTuple5509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTuple5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprTuple5556 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprTuple5577 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprTuple5590 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprTuple5611 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprTuple5626 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleExprTuple5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_entryRuleExprStruct5676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprStruct5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExprStruct5723 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleExprStruct5744 = new BitSet(new long[]{0x0040400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_46_in_ruleExprStruct5757 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleExprStruct5778 = new BitSet(new long[]{0x0040400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleExprStruct5793 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprStruct5814 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleExprStruct5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprUnary_in_entryRuleExprUnary5864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprUnary5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericNegation_in_ruleExprUnary5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDereference_in_ruleExprUnary5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNegation_in_ruleExprUnary5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManagedBox_in_ruleExprUnary6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedBox_in_ruleExprUnary6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_ruleExprUnary6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericNegation_in_entryRuleNumericNegation6091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericNegation6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleNumericNegation6138 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleNumericNegation6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDereference_in_entryRuleDereference6195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDereference6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDereference6242 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDereference6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNegation_in_entryRuleLogicalNegation6299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNegation6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleLogicalNegation6346 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleLogicalNegation6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManagedBox_in_entryRuleManagedBox6403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManagedBox6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleManagedBox6450 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleManagedBox6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedBox_in_entryRuleOwnedBox6507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedBox6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOwnedBox6554 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleOwnedBox6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_entryRuleBorrow6611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrow6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBorrow6658 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleBorrow6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBinary_in_entryRuleExprBinary6715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBinary6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_ruleExprBinary6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionMultiplicationOrModulo_in_entryRuleDivisionMultiplicationOrModulo6805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionMultiplicationOrModulo6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo6862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003080L});
    public static final BitSet FOLLOW_76_in_ruleDivisionMultiplicationOrModulo6884 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDivisionMultiplicationOrModulo6934 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDivisionMultiplicationOrModulo6984 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleDivisionMultiplicationOrModulo7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAs_in_entryRuleAs7044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAs7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionMultiplicationOrModulo_in_ruleAs7101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleAs7122 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleAs7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_entryRuleAdditionOrSubtraction7181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOrSubtraction7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7238 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008040L});
    public static final BitSet FOLLOW_79_in_ruleAdditionOrSubtraction7260 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAdditionOrSubtraction7310 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleAs_in_ruleAdditionOrSubtraction7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator7370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftOperator7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator7427 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_ruleShiftOperator7449 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleShiftOperator7499 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleAdditionOrSubtraction_in_ruleShiftOperator7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAnd_in_entryRuleBitwiseAnd7559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAnd7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd7616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleBitwiseAnd7637 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleBitwiseAnd7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXor_in_entryRuleBitwiseXor7696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXor7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor7753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleBitwiseXor7774 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleBitwiseAnd_in_ruleBitwiseXor7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_entryRuleBitwiseOr7833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOr7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr7890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleBitwiseOr7911 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleBitwiseXor_in_ruleBitwiseOr7932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_entryRuleComparisonOperators7970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperators7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8027 = new BitSet(new long[]{0x0300000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_56_in_ruleComparisonOperators8049 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleComparisonOperators8099 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleComparisonOperators8149 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleComparisonOperators8199 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleBitwiseOr_in_ruleComparisonOperators8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator8259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityOperator8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_86_in_ruleEqualityOperator8338 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleEqualityOperator8388 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleComparisonOperators_in_ruleEqualityOperator8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAnd_in_entryRuleBooleanAnd8448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAnd8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd8505 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleBooleanAnd8526 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleBooleanAnd8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign8587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLValue_in_ruleAssign8644 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAssign8665 = new BitSet(new long[]{0x002100000000E070L,0x0000000006000FC0L});
    public static final BitSet FOLLOW_ruleExprUnary_in_ruleAssign8686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock8724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBlock8780 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleBlock8792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl8828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericParamDecl8838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl8880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleGenericParamDecl8898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl8915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleGenericParamDecl8933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl8950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_entryRuleArg8994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_ruleArg9050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleArg9062 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleArg9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_entryRulePat9119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePat9129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_rulePat9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_rulePat9203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_rulePat9230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_rulePat9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_rulePat9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_rulePat9311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_rulePat9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_rulePat9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatRange_in_rulePat9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatEnum_in_rulePat9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_entryRulePatWildcard9454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatWildcard9464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rulePatWildcard9510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_entryRulePatIdent9546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatIdent9556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_rulePatIdent9598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePatIdent9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_entryRulePatBoxed9661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBoxed9671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePatBoxed9708 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_rulePat_in_rulePatBoxed9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_entryRulePatOwned9765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatOwned9775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePatOwned9812 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_rulePat_in_rulePatOwned9833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed9869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBorrowed9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePatBorrowed9916 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_rulePat_in_rulePatBorrowed9937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_entryRulePatTuple9973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatTuple9983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePatTuple10020 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_rulePat_in_rulePatTuple10041 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatTuple10054 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_rulePat_in_rulePatTuple10075 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_rulePatTuple10089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_entryRulePatVector10125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatVector10135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulePatVector10172 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_rulePat_in_rulePatVector10193 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_rulePatVector10206 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_rulePat_in_rulePatVector10227 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_rulePatVector10241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_entryRulePatLiteral10277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatLiteral10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePatLiteral10332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatRange_in_entryRulePatRange10367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatRange10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatCharRange_in_rulePatRange10424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatNumberRange_in_rulePatRange10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatCharRange_in_entryRulePatCharRange10486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatCharRange10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rulePatCharRange10542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rulePatCharRange10554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCharLit_in_rulePatCharRange10575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatNumberRange_in_entryRulePatNumberRange10611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatNumberRange10621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rulePatNumberRange10667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rulePatNumberRange10679 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rulePatNumberRange10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatEnum_in_entryRulePatEnum10736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatEnum10746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rulePatEnum10792 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_rulePatEnum10815 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000EA0L});
    public static final BitSet FOLLOW_71_in_rulePatEnum10828 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_69_in_rulePatEnum10846 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rulePat_in_rulePatEnum10874 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatEnum10887 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_rulePat_in_rulePatEnum10908 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_rulePatEnum10924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePatEnum10953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldPat_in_rulePatEnum10974 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatEnum10987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldPat_in_rulePatEnum11008 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_rulePatEnum11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldPat_in_entryRuleFieldPat11060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldPat11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFieldPat11112 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleFieldPat11130 = new BitSet(new long[]{0x000100000000E070L,0x0000000006000E00L});
    public static final BitSet FOLLOW_rulePat_in_ruleFieldPat11151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath11189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath11199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePath11241 = new BitSet(new long[]{0x0100000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_rulePath11259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePath11276 = new BitSet(new long[]{0x0100000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_rulePath11296 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_rulePath11311 = new BitSet(new long[]{0x3001000000001F80L,0x0000000000000E00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_rulePath11329 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_rulePath11361 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_rulePath11375 = new BitSet(new long[]{0x3001000000001F80L,0x0000000000000E00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_rulePath11393 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_rulePath11425 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_rulePath11440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType11478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_ruleType11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_ruleType11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleType11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_ruleType11643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_ruleType11670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_ruleType11697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType11732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rulePrimitiveType11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_in_rulePrimitiveType11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_TYPE_in_rulePrimitiveType11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MACHINE_TYPE_in_rulePrimitiveType11869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNIT_TYPE_in_rulePrimitiveType11896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_entryRuleTupleType11932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleType11942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTupleType11979 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleType12000 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTupleType12013 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleType12034 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTupleType12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_entryRuleStructType12084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructType12094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleStructType12131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructType12148 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleStructType12166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructType12187 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructType12200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructType12221 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleStructType12235 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleStructType12249 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructType12270 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructType12283 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructType12304 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleStructType12318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer12354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxedPointer12364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleBoxedPointer12401 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleBoxedPointer12422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer12458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedPointer12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOwnedPointer12505 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleOwnedPointer12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer12562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrowedPointer12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBorrowedPointer12609 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleBorrowedPointer12630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_entryRuleStructField12666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructField12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleStructField12722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructField12740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStructField12757 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleStructField12778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType12814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType12824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEnumType12861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleEnumType12878 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleEnumType12896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleEnumType12917 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumType12930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleEnumType12951 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleEnumType12965 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleEnumType12979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariant_in_ruleEnumType13000 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumType13013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariant_in_ruleEnumType13034 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleEnumType13048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant13084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariant13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_ruleVariant13141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_ruleVariant13168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_ruleVariant13195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_entryRuleStructVariant13230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructVariant13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructVariant13282 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleStructVariant13300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructVariant13321 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructVariant13334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructVariant13355 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleStructVariant13369 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleStructVariant13383 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructVariant13404 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructVariant13417 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructVariant13438 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleStructVariant13452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant13488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleVariant13498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTupleVariant13540 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTupleVariant13557 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleVariant13578 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTupleVariant13591 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleVariant13612 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTupleVariant13626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant13662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitVariant13672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleUnitVariant13713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_entryRuleStringLit13753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLit13763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LIT_in_ruleStringLit13804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral13844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_ruleLiteral13901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_ruleLiteral13928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_ruleLiteral13955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_entryRuleNumberLit13990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLit14000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_ruleNumberLit14043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LIT_in_ruleNumberLit14063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit14106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit14116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_LIT_in_ruleCharLit14157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleVisibility14211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleVisibility14228 = new BitSet(new long[]{0x0000000000000002L});

}