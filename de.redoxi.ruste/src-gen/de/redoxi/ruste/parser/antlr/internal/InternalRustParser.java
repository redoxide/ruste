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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING_LIT", "RULE_MUT_KEYWORD", "RULE_LIFETIME", "RULE_INT_TYPE", "RULE_FLOAT_TYPE", "RULE_BOOLEAN_TYPE", "RULE_MACHINE_TYPE", "RULE_UNIT_TYPE", "RULE_FLOAT_LIT", "RULE_INT_LIT", "RULE_CHAR_LIT", "RULE_INT_SIZE", "RULE_SIGNED_INT_TYPE", "RULE_UNSIGNED_INT_TYPE", "RULE_I8", "RULE_I16", "RULE_I32", "RULE_I64", "RULE_U8", "RULE_U16", "RULE_U32", "RULE_U64", "RULE_FLOAT_SIZE", "RULE_F32", "RULE_F64", "RULE_MACHINE_INT_TYPE", "RULE_MACHINE_UINT_TYPE", "RULE_UNICODE_CHAR", "RULE_UTF8_CHAR", "RULE_UTF16_CHAR", "RULE_UTF32_CHAR", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_DEC_INT_LIT", "RULE_BIN_INT_LIT", "RULE_OCT_INT_LIT", "RULE_HEX_INT_LIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "'#['", "','", "']'", "'('", "')'", "'='", "'mod'", "';'", "'{'", "'}'", "'fn'", "'<'", "'>'", "'->'", "'type'", "'struct'", "'enum'", "'trait'", "'unsafe'", "'extern'", "'impl'", "'for'", "'static'", "':'", "'..'", "'['", "'-'", "'*'", "'!'", "'@'", "'~'", "'&'", "'+'", "'_'", "'::'", "'priv'", "'pub'"
    };
    public static final int T__68=68;
    public static final int RULE_FLOAT_TYPE=9;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DEC_INT_LIT=38;
    public static final int RULE_I8=19;
    public static final int RULE_SIGNED_INT_TYPE=17;
    public static final int RULE_MUT_KEYWORD=6;
    public static final int RULE_MACHINE_UINT_TYPE=31;
    public static final int RULE_UTF32_CHAR=35;
    public static final int RULE_UTF16_CHAR=34;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_I16=20;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_U8=23;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_U64=26;
    public static final int T__54=54;
    public static final int RULE_OCT_INT_LIT=40;
    public static final int T__59=59;
    public static final int RULE_BIN_INT_LIT=39;
    public static final int RULE_INT_LIT=14;
    public static final int RULE_XID_CONTINUE=44;
    public static final int RULE_MACHINE_INT_TYPE=30;
    public static final int T__50=50;
    public static final int RULE_U32=25;
    public static final int RULE_HEX_INT_LIT=41;
    public static final int RULE_F64=29;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__45=45;
    public static final int RULE_OCT_DIGIT=42;
    public static final int RULE_DEC_DIGIT=37;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_HEX_DIGIT=36;
    public static final int RULE_UNICODE_CHAR=32;
    public static final int RULE_UTF8_CHAR=33;
    public static final int RULE_I32=21;
    public static final int RULE_LIFETIME=7;
    public static final int RULE_INT_SIZE=16;
    public static final int RULE_INT_TYPE=8;
    public static final int RULE_UNSIGNED_INT_TYPE=18;
    public static final int RULE_I64=22;
    public static final int RULE_XID_START=43;
    public static final int RULE_FLOAT_LIT=13;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_F32=28;
    public static final int RULE_IDENT=4;
    public static final int RULE_U16=24;
    public static final int RULE_MACHINE_TYPE=11;
    public static final int RULE_FLOAT_SIZE=27;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int RULE_CHAR_LIT=15;
    public static final int T__74=74;
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_BOOLEAN_TYPE=10;
    public static final int T__73=73;
    public static final int RULE_UNIT_TYPE=12;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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

                if ( (LA3_1==50) ) {
                    alt3=1;
                }
                else if ( (LA3_1==48) ) {
                    alt3=2;
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

            if ( ((LA12_0>=RULE_IDENT && LA12_0<=RULE_MUT_KEYWORD)||(LA12_0>=RULE_FLOAT_LIT && LA12_0<=RULE_CHAR_LIT)||LA12_0==48||LA12_0==70||(LA12_0>=74 && LA12_0<=76)||LA12_0==78) ) {
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

                if ( (LA29_0==55||(LA29_0>=63 && LA29_0<=64)||(LA29_0>=80 && LA29_0<=81)) ) {
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

            if ( ((LA31_0>=80 && LA31_0<=81)) ) {
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

            if ( ((LA35_0>=RULE_IDENT && LA35_0<=RULE_MUT_KEYWORD)||(LA35_0>=RULE_FLOAT_LIT && LA35_0<=RULE_CHAR_LIT)||LA35_0==48||LA35_0==70||(LA35_0>=74 && LA35_0<=76)||LA35_0==78) ) {
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

            if ( ((LA44_0>=RULE_IDENT && LA44_0<=RULE_MUT_KEYWORD)||(LA44_0>=RULE_FLOAT_LIT && LA44_0<=RULE_CHAR_LIT)||LA44_0==48||LA44_0==70||(LA44_0>=74 && LA44_0<=76)||LA44_0==78) ) {
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

            if ( ((LA49_0>=RULE_IDENT && LA49_0<=RULE_MUT_KEYWORD)||(LA49_0>=RULE_FLOAT_LIT && LA49_0<=RULE_CHAR_LIT)||LA49_0==48||LA49_0==70||(LA49_0>=74 && LA49_0<=76)||LA49_0==78) ) {
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


    // $ANTLR start "entryRuleExprRValue"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2358:1: entryRuleExprRValue returns [EObject current=null] : iv_ruleExprRValue= ruleExprRValue EOF ;
    public final EObject entryRuleExprRValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRValue = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2359:2: (iv_ruleExprRValue= ruleExprRValue EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2360:2: iv_ruleExprRValue= ruleExprRValue EOF
            {
             newCompositeNode(grammarAccess.getExprRValueRule()); 
            pushFollow(FOLLOW_ruleExprRValue_in_entryRuleExprRValue4774);
            iv_ruleExprRValue=ruleExprRValue();

            state._fsp--;

             current =iv_ruleExprRValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRValue4784); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2367:1: ruleExprRValue returns [EObject current=null] : this_ExprLeaf_0= ruleExprLeaf ;
    public final EObject ruleExprRValue() throws RecognitionException {
        EObject current = null;

        EObject this_ExprLeaf_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2370:28: (this_ExprLeaf_0= ruleExprLeaf )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2372:5: this_ExprLeaf_0= ruleExprLeaf
            {
             
                    newCompositeNode(grammarAccess.getExprRValueAccess().getExprLeafParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExprLeaf_in_ruleExprRValue4830);
            this_ExprLeaf_0=ruleExprLeaf();

            state._fsp--;

             
                    current = this_ExprLeaf_0; 
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
    // $ANTLR end "ruleExprRValue"


    // $ANTLR start "entryRuleExprLeaf"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2388:1: entryRuleExprLeaf returns [EObject current=null] : iv_ruleExprLeaf= ruleExprLeaf EOF ;
    public final EObject entryRuleExprLeaf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLeaf = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2389:2: (iv_ruleExprLeaf= ruleExprLeaf EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2390:2: iv_ruleExprLeaf= ruleExprLeaf EOF
            {
             newCompositeNode(grammarAccess.getExprLeafRule()); 
            pushFollow(FOLLOW_ruleExprLeaf_in_entryRuleExprLeaf4864);
            iv_ruleExprLeaf=ruleExprLeaf();

            state._fsp--;

             current =iv_ruleExprLeaf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLeaf4874); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2397:1: ruleExprLeaf returns [EObject current=null] : (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary ) ;
    public final EObject ruleExprLeaf() throws RecognitionException {
        EObject current = null;

        EObject this_ExprLiteral_0 = null;

        EObject this_ExprGroup_1 = null;

        EObject this_ExprStruct_2 = null;

        EObject this_ExprVec_3 = null;

        EObject this_ExprUnary_4 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2400:28: ( (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2401:1: (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2401:1: (this_ExprLiteral_0= ruleExprLiteral | this_ExprGroup_1= ruleExprGroup | this_ExprStruct_2= ruleExprStruct | this_ExprVec_3= ruleExprVec | this_ExprUnary_4= ruleExprUnary )
            int alt52=5;
            switch ( input.LA(1) ) {
            case RULE_STRING_LIT:
            case RULE_FLOAT_LIT:
            case RULE_INT_LIT:
            case RULE_CHAR_LIT:
                {
                alt52=1;
                }
                break;
            case 48:
                {
                alt52=2;
                }
                break;
            case 53:
                {
                alt52=3;
                }
                break;
            case 70:
                {
                alt52=4;
                }
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2402:5: this_ExprLiteral_0= ruleExprLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExprLiteral_in_ruleExprLeaf4921);
                    this_ExprLiteral_0=ruleExprLiteral();

                    state._fsp--;

                     
                            current = this_ExprLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2412:5: this_ExprGroup_1= ruleExprGroup
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprGroupParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExprGroup_in_ruleExprLeaf4948);
                    this_ExprGroup_1=ruleExprGroup();

                    state._fsp--;

                     
                            current = this_ExprGroup_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2422:5: this_ExprStruct_2= ruleExprStruct
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprStructParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExprStruct_in_ruleExprLeaf4975);
                    this_ExprStruct_2=ruleExprStruct();

                    state._fsp--;

                     
                            current = this_ExprStruct_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2432:5: this_ExprVec_3= ruleExprVec
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprVecParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExprVec_in_ruleExprLeaf5002);
                    this_ExprVec_3=ruleExprVec();

                    state._fsp--;

                     
                            current = this_ExprVec_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2442:5: this_ExprUnary_4= ruleExprUnary
                    {
                     
                            newCompositeNode(grammarAccess.getExprLeafAccess().getExprUnaryParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExprUnary_in_ruleExprLeaf5029);
                    this_ExprUnary_4=ruleExprUnary();

                    state._fsp--;

                     
                            current = this_ExprUnary_4; 
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2458:1: entryRuleExprLiteral returns [EObject current=null] : iv_ruleExprLiteral= ruleExprLiteral EOF ;
    public final EObject entryRuleExprLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2459:2: (iv_ruleExprLiteral= ruleExprLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2460:2: iv_ruleExprLiteral= ruleExprLiteral EOF
            {
             newCompositeNode(grammarAccess.getExprLiteralRule()); 
            pushFollow(FOLLOW_ruleExprLiteral_in_entryRuleExprLiteral5064);
            iv_ruleExprLiteral=ruleExprLiteral();

            state._fsp--;

             current =iv_ruleExprLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprLiteral5074); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2467:1: ruleExprLiteral returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject ruleExprLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2470:28: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2471:1: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2471:1: ( (lv_literal_0_0= ruleLiteral ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2472:1: (lv_literal_0_0= ruleLiteral )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2472:1: (lv_literal_0_0= ruleLiteral )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2473:3: lv_literal_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getExprLiteralAccess().getLiteralLiteralParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleExprLiteral5119);
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


    // $ANTLR start "entryRuleExprPath"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2497:1: entryRuleExprPath returns [EObject current=null] : iv_ruleExprPath= ruleExprPath EOF ;
    public final EObject entryRuleExprPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprPath = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2498:2: (iv_ruleExprPath= ruleExprPath EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2499:2: iv_ruleExprPath= ruleExprPath EOF
            {
             newCompositeNode(grammarAccess.getExprPathRule()); 
            pushFollow(FOLLOW_ruleExprPath_in_entryRuleExprPath5154);
            iv_ruleExprPath=ruleExprPath();

            state._fsp--;

             current =iv_ruleExprPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprPath5164); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2506:1: ruleExprPath returns [EObject current=null] : ( ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? ) ;
    public final EObject ruleExprPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;

        EObject lv_struct_2_0 = null;

        EObject lv_tuple_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2509:28: ( ( ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2510:1: ( ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2510:1: ( ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2510:2: ( (lv_path_0_0= rulePath ) ) ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2510:2: ( (lv_path_0_0= rulePath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2511:1: (lv_path_0_0= rulePath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2511:1: (lv_path_0_0= rulePath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2512:3: lv_path_0_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getExprPathAccess().getPathPathParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePath_in_ruleExprPath5210);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2528:2: ( ( () ( (lv_struct_2_0= ruleExprStruct ) ) ) | ( () ( (lv_tuple_4_0= ruleExprTuple ) ) ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==53) ) {
                alt53=1;
            }
            else if ( (LA53_0==48) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2528:3: ( () ( (lv_struct_2_0= ruleExprStruct ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2528:3: ( () ( (lv_struct_2_0= ruleExprStruct ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2528:4: () ( (lv_struct_2_0= ruleExprStruct ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2528:4: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2529:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExprPathAccess().getExprStructPathAction_1_0_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2534:2: ( (lv_struct_2_0= ruleExprStruct ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2535:1: (lv_struct_2_0= ruleExprStruct )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2535:1: (lv_struct_2_0= ruleExprStruct )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2536:3: lv_struct_2_0= ruleExprStruct
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprPathAccess().getStructExprStructParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprStruct_in_ruleExprPath5242);
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2553:6: ( () ( (lv_tuple_4_0= ruleExprTuple ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2553:6: ( () ( (lv_tuple_4_0= ruleExprTuple ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2553:7: () ( (lv_tuple_4_0= ruleExprTuple ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2553:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2554:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExprPathAccess().getExprTuplePathAction_1_1_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2559:2: ( (lv_tuple_4_0= ruleExprTuple ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2560:1: (lv_tuple_4_0= ruleExprTuple )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2560:1: (lv_tuple_4_0= ruleExprTuple )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2561:3: lv_tuple_4_0= ruleExprTuple
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprPathAccess().getTupleExprTupleParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprTuple_in_ruleExprPath5280);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2585:1: entryRuleExprGroup returns [EObject current=null] : iv_ruleExprGroup= ruleExprGroup EOF ;
    public final EObject entryRuleExprGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprGroup = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2586:2: (iv_ruleExprGroup= ruleExprGroup EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2587:2: iv_ruleExprGroup= ruleExprGroup EOF
            {
             newCompositeNode(grammarAccess.getExprGroupRule()); 
            pushFollow(FOLLOW_ruleExprGroup_in_entryRuleExprGroup5319);
            iv_ruleExprGroup=ruleExprGroup();

            state._fsp--;

             current =iv_ruleExprGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprGroup5329); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2594:1: ruleExprGroup returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2597:28: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2598:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2598:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2598:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleExprGroup5366); 

                	newLeafNode(otherlv_0, grammarAccess.getExprGroupAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2602:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2603:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2603:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2604:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5387);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2620:2: ( () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )? )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2620:3: () otherlv_3= ',' ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )?
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2620:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2621:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getExprGroupAccess().getExprTupleExprsAction_2_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5409); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprGroupAccess().getCommaKeyword_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2630:1: ( ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )? )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_STRING_LIT||(LA56_0>=RULE_FLOAT_LIT && LA56_0<=RULE_CHAR_LIT)||LA56_0==48||LA56_0==53||(LA56_0>=70 && LA56_0<=76)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2630:2: ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* (otherlv_7= ',' )?
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2630:2: ( (lv_exprs_4_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2631:1: (lv_exprs_4_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2631:1: (lv_exprs_4_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2632:3: lv_exprs_4_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprsExprParserRuleCall_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5431);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2648:2: (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==46) ) {
                                    int LA54_1 = input.LA(2);

                                    if ( (LA54_1==RULE_STRING_LIT||(LA54_1>=RULE_FLOAT_LIT && LA54_1<=RULE_CHAR_LIT)||LA54_1==48||LA54_1==53||(LA54_1>=70 && LA54_1<=76)) ) {
                                        alt54=1;
                                    }


                                }


                                switch (alt54) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2648:4: otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) )
                            	    {
                            	    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5444); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getExprGroupAccess().getCommaKeyword_2_2_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2652:1: ( (lv_exprs_6_0= ruleExpr ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2653:1: (lv_exprs_6_0= ruleExpr )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2653:1: (lv_exprs_6_0= ruleExpr )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2654:3: lv_exprs_6_0= ruleExpr
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getExprGroupAccess().getExprsExprParserRuleCall_2_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprGroup5465);
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
                            	    break loop54;
                                }
                            } while (true);

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2670:4: (otherlv_7= ',' )?
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==46) ) {
                                alt55=1;
                            }
                            switch (alt55) {
                                case 1 :
                                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2670:6: otherlv_7= ','
                                    {
                                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleExprGroup5480); 

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

            otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleExprGroup5498); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2686:1: entryRuleExprTuple returns [EObject current=null] : iv_ruleExprTuple= ruleExprTuple EOF ;
    public final EObject entryRuleExprTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTuple = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2687:2: (iv_ruleExprTuple= ruleExprTuple EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2688:2: iv_ruleExprTuple= ruleExprTuple EOF
            {
             newCompositeNode(grammarAccess.getExprTupleRule()); 
            pushFollow(FOLLOW_ruleExprTuple_in_entryRuleExprTuple5534);
            iv_ruleExprTuple=ruleExprTuple();

            state._fsp--;

             current =iv_ruleExprTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTuple5544); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2695:1: ruleExprTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2698:28: ( (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2699:1: (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2699:1: (otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2699:3: otherlv_0= '(' ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )* (otherlv_4= ',' )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleExprTuple5581); 

                	newLeafNode(otherlv_0, grammarAccess.getExprTupleAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2703:1: ( (lv_exprs_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2704:1: (lv_exprs_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2704:1: (lv_exprs_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2705:3: lv_exprs_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getExprTupleAccess().getExprsExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleExprTuple5602);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2721:2: (otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==46) ) {
                    int LA58_1 = input.LA(2);

                    if ( (LA58_1==RULE_STRING_LIT||(LA58_1>=RULE_FLOAT_LIT && LA58_1<=RULE_CHAR_LIT)||LA58_1==48||LA58_1==53||(LA58_1>=70 && LA58_1<=76)) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2721:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprTuple5615); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExprTupleAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2725:1: ( (lv_exprs_3_0= ruleExpr ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2726:1: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2726:1: (lv_exprs_3_0= ruleExpr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2727:3: lv_exprs_3_0= ruleExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprTupleAccess().getExprsExprParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprTuple5636);
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
            	    break loop58;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2743:4: (otherlv_4= ',' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==46) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2743:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleExprTuple5651); 

                        	newLeafNode(otherlv_4, grammarAccess.getExprTupleAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleExprTuple5665); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2759:1: entryRuleExprStruct returns [EObject current=null] : iv_ruleExprStruct= ruleExprStruct EOF ;
    public final EObject entryRuleExprStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprStruct = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2760:2: (iv_ruleExprStruct= ruleExprStruct EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2761:2: iv_ruleExprStruct= ruleExprStruct EOF
            {
             newCompositeNode(grammarAccess.getExprStructRule()); 
            pushFollow(FOLLOW_ruleExprStruct_in_entryRuleExprStruct5701);
            iv_ruleExprStruct=ruleExprStruct();

            state._fsp--;

             current =iv_ruleExprStruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprStruct5711); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2768:1: ruleExprStruct returns [EObject current=null] : (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2771:28: ( (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2772:1: (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2772:1: (otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2772:3: otherlv_0= '{' ( (lv_fields_1_0= ruleStructField ) ) (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )* (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleExprStruct5748); 

                	newLeafNode(otherlv_0, grammarAccess.getExprStructAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2776:1: ( (lv_fields_1_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2777:1: (lv_fields_1_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2777:1: (lv_fields_1_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2778:3: lv_fields_1_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getExprStructAccess().getFieldsStructFieldParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleExprStruct5769);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2794:2: (otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==46) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2794:4: otherlv_2= ',' ( (lv_fields_3_0= ruleStructField ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleExprStruct5782); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExprStructAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2798:1: ( (lv_fields_3_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2799:1: (lv_fields_3_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2799:1: (lv_fields_3_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2800:3: lv_fields_3_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprStructAccess().getFieldsStructFieldParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleExprStruct5803);
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
            	    break loop60;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2816:4: (otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==69) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2816:6: otherlv_4= '..' ( (lv_baseExpr_5_0= ruleExpr ) )
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleExprStruct5818); 

                        	newLeafNode(otherlv_4, grammarAccess.getExprStructAccess().getFullStopFullStopKeyword_3_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2820:1: ( (lv_baseExpr_5_0= ruleExpr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2821:1: (lv_baseExpr_5_0= ruleExpr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2821:1: (lv_baseExpr_5_0= ruleExpr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2822:3: lv_baseExpr_5_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprStructAccess().getBaseExprExprParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprStruct5839);
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

            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleExprStruct5853); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2850:1: entryRuleExprVec returns [EObject current=null] : iv_ruleExprVec= ruleExprVec EOF ;
    public final EObject entryRuleExprVec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprVec = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2851:2: (iv_ruleExprVec= ruleExprVec EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2852:2: iv_ruleExprVec= ruleExprVec EOF
            {
             newCompositeNode(grammarAccess.getExprVecRule()); 
            pushFollow(FOLLOW_ruleExprVec_in_entryRuleExprVec5889);
            iv_ruleExprVec=ruleExprVec();

            state._fsp--;

             current =iv_ruleExprVec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprVec5899); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2859:1: ruleExprVec returns [EObject current=null] : (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2862:28: ( (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2863:1: (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2863:1: (otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2863:3: otherlv_0= '[' ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) ) ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )? otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleExprVec5936); 

                	newLeafNode(otherlv_0, grammarAccess.getExprVecAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2867:1: ( (lv_mutable_1_0= RULE_MUT_KEYWORD ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2868:1: (lv_mutable_1_0= RULE_MUT_KEYWORD )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2868:1: (lv_mutable_1_0= RULE_MUT_KEYWORD )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2869:3: lv_mutable_1_0= RULE_MUT_KEYWORD
            {
            lv_mutable_1_0=(Token)match(input,RULE_MUT_KEYWORD,FOLLOW_RULE_MUT_KEYWORD_in_ruleExprVec5953); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2885:2: ( ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING_LIT||(LA64_0>=RULE_FLOAT_LIT && LA64_0<=RULE_CHAR_LIT)||LA64_0==48||LA64_0==53||(LA64_0>=70 && LA64_0<=76)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2885:3: ( (lv_exprs_2_0= ruleExpr ) ) otherlv_3= ',' ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2885:3: ( (lv_exprs_2_0= ruleExpr ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2886:1: (lv_exprs_2_0= ruleExpr )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2886:1: (lv_exprs_2_0= ruleExpr )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2887:3: lv_exprs_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprVecAccess().getExprsExprParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprVec5980);
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

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleExprVec5992); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprVecAccess().getCommaKeyword_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2907:1: ( (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) ) | ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ ) )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==69) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==RULE_STRING_LIT||(LA63_0>=RULE_FLOAT_LIT && LA63_0<=RULE_CHAR_LIT)||LA63_0==48||LA63_0==53||(LA63_0>=70 && LA63_0<=76)) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2907:2: (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2907:2: (otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2907:4: otherlv_4= '..' ( (lv_lenExpr_5_0= ruleExpr ) )
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleExprVec6006); 

                                	newLeafNode(otherlv_4, grammarAccess.getExprVecAccess().getFullStopFullStopKeyword_2_2_0_0());
                                
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2911:1: ( (lv_lenExpr_5_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2912:1: (lv_lenExpr_5_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2912:1: (lv_lenExpr_5_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2913:3: lv_lenExpr_5_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprVecAccess().getLenExprExprParserRuleCall_2_2_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6027);
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
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2930:6: ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2930:6: ( ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+ )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2930:7: ( (lv_exprs_6_0= ruleExpr ) ) (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2930:7: ( (lv_exprs_6_0= ruleExpr ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2931:1: (lv_exprs_6_0= ruleExpr )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2931:1: (lv_exprs_6_0= ruleExpr )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2932:3: lv_exprs_6_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprVecAccess().getExprsExprParserRuleCall_2_2_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6056);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2948:2: (otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) ) )+
                            int cnt62=0;
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==46) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2948:4: otherlv_7= ',' ( (lv_exprs_8_0= ruleExpr ) )
                            	    {
                            	    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleExprVec6069); 

                            	        	newLeafNode(otherlv_7, grammarAccess.getExprVecAccess().getCommaKeyword_2_2_1_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2952:1: ( (lv_exprs_8_0= ruleExpr ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2953:1: (lv_exprs_8_0= ruleExpr )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2953:1: (lv_exprs_8_0= ruleExpr )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2954:3: lv_exprs_8_0= ruleExpr
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getExprVecAccess().getExprsExprParserRuleCall_2_2_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprVec6090);
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
                            	    if ( cnt62 >= 1 ) break loop62;
                                        EarlyExitException eee =
                                            new EarlyExitException(62, input);
                                        throw eee;
                                }
                                cnt62++;
                            } while (true);


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleExprVec6108); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2982:1: entryRuleExprUnary returns [EObject current=null] : iv_ruleExprUnary= ruleExprUnary EOF ;
    public final EObject entryRuleExprUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprUnary = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2983:2: (iv_ruleExprUnary= ruleExprUnary EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2984:2: iv_ruleExprUnary= ruleExprUnary EOF
            {
             newCompositeNode(grammarAccess.getExprUnaryRule()); 
            pushFollow(FOLLOW_ruleExprUnary_in_entryRuleExprUnary6144);
            iv_ruleExprUnary=ruleExprUnary();

            state._fsp--;

             current =iv_ruleExprUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprUnary6154); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2991:1: ruleExprUnary returns [EObject current=null] : (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2994:28: ( (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2995:1: (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2995:1: (this_NumericNegation_0= ruleNumericNegation | this_Dereference_1= ruleDereference | this_LogicalNegation_2= ruleLogicalNegation | this_ManagedBox_3= ruleManagedBox | this_OwnedBox_4= ruleOwnedBox | this_Borrow_5= ruleBorrow )
            int alt65=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt65=1;
                }
                break;
            case 72:
                {
                alt65=2;
                }
                break;
            case 73:
                {
                alt65=3;
                }
                break;
            case 74:
                {
                alt65=4;
                }
                break;
            case 75:
                {
                alt65=5;
                }
                break;
            case 76:
                {
                alt65=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:2996:5: this_NumericNegation_0= ruleNumericNegation
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getNumericNegationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumericNegation_in_ruleExprUnary6201);
                    this_NumericNegation_0=ruleNumericNegation();

                    state._fsp--;

                     
                            current = this_NumericNegation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3006:5: this_Dereference_1= ruleDereference
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getDereferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDereference_in_ruleExprUnary6228);
                    this_Dereference_1=ruleDereference();

                    state._fsp--;

                     
                            current = this_Dereference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3016:5: this_LogicalNegation_2= ruleLogicalNegation
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getLogicalNegationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLogicalNegation_in_ruleExprUnary6255);
                    this_LogicalNegation_2=ruleLogicalNegation();

                    state._fsp--;

                     
                            current = this_LogicalNegation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3026:5: this_ManagedBox_3= ruleManagedBox
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getManagedBoxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleManagedBox_in_ruleExprUnary6282);
                    this_ManagedBox_3=ruleManagedBox();

                    state._fsp--;

                     
                            current = this_ManagedBox_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3036:5: this_OwnedBox_4= ruleOwnedBox
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getOwnedBoxParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleOwnedBox_in_ruleExprUnary6309);
                    this_OwnedBox_4=ruleOwnedBox();

                    state._fsp--;

                     
                            current = this_OwnedBox_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3046:5: this_Borrow_5= ruleBorrow
                    {
                     
                            newCompositeNode(grammarAccess.getExprUnaryAccess().getBorrowParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBorrow_in_ruleExprUnary6336);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3062:1: entryRuleNumericNegation returns [EObject current=null] : iv_ruleNumericNegation= ruleNumericNegation EOF ;
    public final EObject entryRuleNumericNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericNegation = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3063:2: (iv_ruleNumericNegation= ruleNumericNegation EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3064:2: iv_ruleNumericNegation= ruleNumericNegation EOF
            {
             newCompositeNode(grammarAccess.getNumericNegationRule()); 
            pushFollow(FOLLOW_ruleNumericNegation_in_entryRuleNumericNegation6371);
            iv_ruleNumericNegation=ruleNumericNegation();

            state._fsp--;

             current =iv_ruleNumericNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericNegation6381); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3071:1: ruleNumericNegation returns [EObject current=null] : (otherlv_0= '-' ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleNumericNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3074:28: ( (otherlv_0= '-' ( (lv_expr_1_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3075:1: (otherlv_0= '-' ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3075:1: (otherlv_0= '-' ( (lv_expr_1_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3075:3: otherlv_0= '-' ( (lv_expr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleNumericNegation6418); 

                	newLeafNode(otherlv_0, grammarAccess.getNumericNegationAccess().getHyphenMinusKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3079:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3080:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3080:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3081:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getNumericNegationAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleNumericNegation6439);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericNegationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
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
    // $ANTLR end "ruleNumericNegation"


    // $ANTLR start "entryRuleDereference"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3105:1: entryRuleDereference returns [EObject current=null] : iv_ruleDereference= ruleDereference EOF ;
    public final EObject entryRuleDereference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDereference = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3106:2: (iv_ruleDereference= ruleDereference EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3107:2: iv_ruleDereference= ruleDereference EOF
            {
             newCompositeNode(grammarAccess.getDereferenceRule()); 
            pushFollow(FOLLOW_ruleDereference_in_entryRuleDereference6475);
            iv_ruleDereference=ruleDereference();

            state._fsp--;

             current =iv_ruleDereference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDereference6485); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3114:1: ruleDereference returns [EObject current=null] : (otherlv_0= '*' ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleDereference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3117:28: ( (otherlv_0= '*' ( (lv_expr_1_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3118:1: (otherlv_0= '*' ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3118:1: (otherlv_0= '*' ( (lv_expr_1_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3118:3: otherlv_0= '*' ( (lv_expr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleDereference6522); 

                	newLeafNode(otherlv_0, grammarAccess.getDereferenceAccess().getAsteriskKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3122:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3123:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3123:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3124:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getDereferenceAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleDereference6543);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDereferenceRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
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
    // $ANTLR end "ruleDereference"


    // $ANTLR start "entryRuleLogicalNegation"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3148:1: entryRuleLogicalNegation returns [EObject current=null] : iv_ruleLogicalNegation= ruleLogicalNegation EOF ;
    public final EObject entryRuleLogicalNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNegation = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3149:2: (iv_ruleLogicalNegation= ruleLogicalNegation EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3150:2: iv_ruleLogicalNegation= ruleLogicalNegation EOF
            {
             newCompositeNode(grammarAccess.getLogicalNegationRule()); 
            pushFollow(FOLLOW_ruleLogicalNegation_in_entryRuleLogicalNegation6579);
            iv_ruleLogicalNegation=ruleLogicalNegation();

            state._fsp--;

             current =iv_ruleLogicalNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNegation6589); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3157:1: ruleLogicalNegation returns [EObject current=null] : (otherlv_0= '!' ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleLogicalNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3160:28: ( (otherlv_0= '!' ( (lv_expr_1_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3161:1: (otherlv_0= '!' ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3161:1: (otherlv_0= '!' ( (lv_expr_1_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3161:3: otherlv_0= '!' ( (lv_expr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleLogicalNegation6626); 

                	newLeafNode(otherlv_0, grammarAccess.getLogicalNegationAccess().getExclamationMarkKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3165:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3166:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3166:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3167:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getLogicalNegationAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleLogicalNegation6647);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalNegationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
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
    // $ANTLR end "ruleLogicalNegation"


    // $ANTLR start "entryRuleManagedBox"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3191:1: entryRuleManagedBox returns [EObject current=null] : iv_ruleManagedBox= ruleManagedBox EOF ;
    public final EObject entryRuleManagedBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManagedBox = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3192:2: (iv_ruleManagedBox= ruleManagedBox EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3193:2: iv_ruleManagedBox= ruleManagedBox EOF
            {
             newCompositeNode(grammarAccess.getManagedBoxRule()); 
            pushFollow(FOLLOW_ruleManagedBox_in_entryRuleManagedBox6683);
            iv_ruleManagedBox=ruleManagedBox();

            state._fsp--;

             current =iv_ruleManagedBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleManagedBox6693); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3200:1: ruleManagedBox returns [EObject current=null] : (otherlv_0= '@' ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleManagedBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3203:28: ( (otherlv_0= '@' ( (lv_expr_1_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3204:1: (otherlv_0= '@' ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3204:1: (otherlv_0= '@' ( (lv_expr_1_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3204:3: otherlv_0= '@' ( (lv_expr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleManagedBox6730); 

                	newLeafNode(otherlv_0, grammarAccess.getManagedBoxAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3208:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3209:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3209:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3210:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getManagedBoxAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleManagedBox6751);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getManagedBoxRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
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
    // $ANTLR end "ruleManagedBox"


    // $ANTLR start "entryRuleOwnedBox"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3234:1: entryRuleOwnedBox returns [EObject current=null] : iv_ruleOwnedBox= ruleOwnedBox EOF ;
    public final EObject entryRuleOwnedBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedBox = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3235:2: (iv_ruleOwnedBox= ruleOwnedBox EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3236:2: iv_ruleOwnedBox= ruleOwnedBox EOF
            {
             newCompositeNode(grammarAccess.getOwnedBoxRule()); 
            pushFollow(FOLLOW_ruleOwnedBox_in_entryRuleOwnedBox6787);
            iv_ruleOwnedBox=ruleOwnedBox();

            state._fsp--;

             current =iv_ruleOwnedBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedBox6797); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3243:1: ruleOwnedBox returns [EObject current=null] : (otherlv_0= '~' ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleOwnedBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3246:28: ( (otherlv_0= '~' ( (lv_expr_1_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3247:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3247:1: (otherlv_0= '~' ( (lv_expr_1_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3247:3: otherlv_0= '~' ( (lv_expr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleOwnedBox6834); 

                	newLeafNode(otherlv_0, grammarAccess.getOwnedBoxAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3251:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3252:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3252:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3253:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getOwnedBoxAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleOwnedBox6855);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOwnedBoxRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
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
    // $ANTLR end "ruleOwnedBox"


    // $ANTLR start "entryRuleBorrow"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3277:1: entryRuleBorrow returns [EObject current=null] : iv_ruleBorrow= ruleBorrow EOF ;
    public final EObject entryRuleBorrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorrow = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3278:2: (iv_ruleBorrow= ruleBorrow EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3279:2: iv_ruleBorrow= ruleBorrow EOF
            {
             newCompositeNode(grammarAccess.getBorrowRule()); 
            pushFollow(FOLLOW_ruleBorrow_in_entryRuleBorrow6891);
            iv_ruleBorrow=ruleBorrow();

            state._fsp--;

             current =iv_ruleBorrow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrow6901); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3286:1: ruleBorrow returns [EObject current=null] : (otherlv_0= '&' ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleBorrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3289:28: ( (otherlv_0= '&' ( (lv_expr_1_0= ruleExpr ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3290:1: (otherlv_0= '&' ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3290:1: (otherlv_0= '&' ( (lv_expr_1_0= ruleExpr ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3290:3: otherlv_0= '&' ( (lv_expr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleBorrow6938); 

                	newLeafNode(otherlv_0, grammarAccess.getBorrowAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3294:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3295:1: (lv_expr_1_0= ruleExpr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3295:1: (lv_expr_1_0= ruleExpr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3296:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getBorrowAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleBorrow6959);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBorrowRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
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
    // $ANTLR end "ruleBorrow"


    // $ANTLR start "entryRuleBlock"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3320:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3321:2: (iv_ruleBlock= ruleBlock EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3322:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock6995);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock7005); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3329:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3332:28: ( ( () otherlv_1= '{' otherlv_2= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3333:1: ( () otherlv_1= '{' otherlv_2= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3333:1: ( () otherlv_1= '{' otherlv_2= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3333:2: () otherlv_1= '{' otherlv_2= '}'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3333:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3334:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleBlock7051); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleBlock7063); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3355:1: entryRuleGenericParamDecl returns [EObject current=null] : iv_ruleGenericParamDecl= ruleGenericParamDecl EOF ;
    public final EObject entryRuleGenericParamDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericParamDecl = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3356:2: (iv_ruleGenericParamDecl= ruleGenericParamDecl EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3357:2: iv_ruleGenericParamDecl= ruleGenericParamDecl EOF
            {
             newCompositeNode(grammarAccess.getGenericParamDeclRule()); 
            pushFollow(FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl7099);
            iv_ruleGenericParamDecl=ruleGenericParamDecl();

            state._fsp--;

             current =iv_ruleGenericParamDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericParamDecl7109); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3364:1: ruleGenericParamDecl returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? ) ;
    public final EObject ruleGenericParamDecl() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        Token lv_bounds_2_0=null;
        Token otherlv_3=null;
        Token lv_bounds_4_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3367:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3368:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3368:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3368:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3368:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3369:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3369:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3370:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl7151); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3386:2: (otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==68) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3386:4: otherlv_1= ':' ( (lv_bounds_2_0= RULE_IDENT ) ) (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleGenericParamDecl7169); 

                        	newLeafNode(otherlv_1, grammarAccess.getGenericParamDeclAccess().getColonKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3390:1: ( (lv_bounds_2_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3391:1: (lv_bounds_2_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3391:1: (lv_bounds_2_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3392:3: lv_bounds_2_0= RULE_IDENT
                    {
                    lv_bounds_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl7186); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3408:2: (otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3408:4: otherlv_3= '+' ( (lv_bounds_4_0= RULE_IDENT ) )
                    {
                    otherlv_3=(Token)match(input,77,FOLLOW_77_in_ruleGenericParamDecl7204); 

                        	newLeafNode(otherlv_3, grammarAccess.getGenericParamDeclAccess().getPlusSignKeyword_1_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3412:1: ( (lv_bounds_4_0= RULE_IDENT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3413:1: (lv_bounds_4_0= RULE_IDENT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3413:1: (lv_bounds_4_0= RULE_IDENT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3414:3: lv_bounds_4_0= RULE_IDENT
                    {
                    lv_bounds_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleGenericParamDecl7221); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3438:1: entryRuleArg returns [EObject current=null] : iv_ruleArg= ruleArg EOF ;
    public final EObject entryRuleArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3439:2: (iv_ruleArg= ruleArg EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3440:2: iv_ruleArg= ruleArg EOF
            {
             newCompositeNode(grammarAccess.getArgRule()); 
            pushFollow(FOLLOW_ruleArg_in_entryRuleArg7265);
            iv_ruleArg=ruleArg();

            state._fsp--;

             current =iv_ruleArg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg7275); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3447:1: ruleArg returns [EObject current=null] : ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pat_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3450:28: ( ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3451:1: ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3451:1: ( ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3451:2: ( (lv_pat_0_0= rulePat ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3451:2: ( (lv_pat_0_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3452:1: (lv_pat_0_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3452:1: (lv_pat_0_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3453:3: lv_pat_0_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getArgAccess().getPatPatParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_ruleArg7321);
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

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleArg7333); 

                	newLeafNode(otherlv_1, grammarAccess.getArgAccess().getColonKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3473:1: ( (lv_type_2_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3474:1: (lv_type_2_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3474:1: (lv_type_2_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3475:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArg7354);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3499:1: entryRulePat returns [EObject current=null] : iv_rulePat= rulePat EOF ;
    public final EObject entryRulePat() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePat = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3500:2: (iv_rulePat= rulePat EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3501:2: iv_rulePat= rulePat EOF
            {
             newCompositeNode(grammarAccess.getPatRule()); 
            pushFollow(FOLLOW_rulePat_in_entryRulePat7390);
            iv_rulePat=rulePat();

            state._fsp--;

             current =iv_rulePat; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePat7400); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3508:1: rulePat returns [EObject current=null] : (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3511:28: ( (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3512:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3512:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum )
            int alt67=10;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3513:5: this_PatWildcard_0= rulePatWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatWildcardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePatWildcard_in_rulePat7447);
                    this_PatWildcard_0=rulePatWildcard();

                    state._fsp--;

                     
                            current = this_PatWildcard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3523:5: this_PatIdent_1= rulePatIdent
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatIdentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePatIdent_in_rulePat7474);
                    this_PatIdent_1=rulePatIdent();

                    state._fsp--;

                     
                            current = this_PatIdent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3533:5: this_PatBoxed_2= rulePatBoxed
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatBoxedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePatBoxed_in_rulePat7501);
                    this_PatBoxed_2=rulePatBoxed();

                    state._fsp--;

                     
                            current = this_PatBoxed_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3543:5: this_PatOwned_3= rulePatOwned
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatOwnedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePatOwned_in_rulePat7528);
                    this_PatOwned_3=rulePatOwned();

                    state._fsp--;

                     
                            current = this_PatOwned_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3553:5: this_PatBorrowed_4= rulePatBorrowed
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatBorrowedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePatBorrowed_in_rulePat7555);
                    this_PatBorrowed_4=rulePatBorrowed();

                    state._fsp--;

                     
                            current = this_PatBorrowed_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3563:5: this_PatTuple_5= rulePatTuple
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatTupleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePatTuple_in_rulePat7582);
                    this_PatTuple_5=rulePatTuple();

                    state._fsp--;

                     
                            current = this_PatTuple_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3573:5: this_PatVector_6= rulePatVector
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatVectorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePatVector_in_rulePat7609);
                    this_PatVector_6=rulePatVector();

                    state._fsp--;

                     
                            current = this_PatVector_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3583:5: this_PatLiteral_7= rulePatLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatLiteralParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulePatLiteral_in_rulePat7636);
                    this_PatLiteral_7=rulePatLiteral();

                    state._fsp--;

                     
                            current = this_PatLiteral_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3593:5: this_PatRange_8= rulePatRange
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatRangeParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePatRange_in_rulePat7663);
                    this_PatRange_8=rulePatRange();

                    state._fsp--;

                     
                            current = this_PatRange_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3603:5: this_PatEnum_9= rulePatEnum
                    {
                     
                            newCompositeNode(grammarAccess.getPatAccess().getPatEnumParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_rulePatEnum_in_rulePat7690);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3619:1: entryRulePatWildcard returns [EObject current=null] : iv_rulePatWildcard= rulePatWildcard EOF ;
    public final EObject entryRulePatWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatWildcard = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3620:2: (iv_rulePatWildcard= rulePatWildcard EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3621:2: iv_rulePatWildcard= rulePatWildcard EOF
            {
             newCompositeNode(grammarAccess.getPatWildcardRule()); 
            pushFollow(FOLLOW_rulePatWildcard_in_entryRulePatWildcard7725);
            iv_rulePatWildcard=rulePatWildcard();

            state._fsp--;

             current =iv_rulePatWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatWildcard7735); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3628:1: rulePatWildcard returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject rulePatWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3631:28: ( ( () otherlv_1= '_' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3632:1: ( () otherlv_1= '_' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3632:1: ( () otherlv_1= '_' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3632:2: () otherlv_1= '_'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3632:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3633:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPatWildcardAccess().getPatWildcardAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_rulePatWildcard7781); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3650:1: entryRulePatIdent returns [EObject current=null] : iv_rulePatIdent= rulePatIdent EOF ;
    public final EObject entryRulePatIdent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatIdent = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3651:2: (iv_rulePatIdent= rulePatIdent EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3652:2: iv_rulePatIdent= rulePatIdent EOF
            {
             newCompositeNode(grammarAccess.getPatIdentRule()); 
            pushFollow(FOLLOW_rulePatIdent_in_entryRulePatIdent7817);
            iv_rulePatIdent=rulePatIdent();

            state._fsp--;

             current =iv_rulePatIdent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatIdent7827); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3659:1: rulePatIdent returns [EObject current=null] : ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) ) ;
    public final EObject rulePatIdent() throws RecognitionException {
        EObject current = null;

        Token lv_mutable_0_0=null;
        Token lv_ident_1_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3662:28: ( ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3663:1: ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3663:1: ( ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3663:2: ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) ) ( (lv_ident_1_0= RULE_IDENT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3663:2: ( (lv_mutable_0_0= RULE_MUT_KEYWORD ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3664:1: (lv_mutable_0_0= RULE_MUT_KEYWORD )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3664:1: (lv_mutable_0_0= RULE_MUT_KEYWORD )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3665:3: lv_mutable_0_0= RULE_MUT_KEYWORD
            {
            lv_mutable_0_0=(Token)match(input,RULE_MUT_KEYWORD,FOLLOW_RULE_MUT_KEYWORD_in_rulePatIdent7869); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3681:2: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3682:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3682:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3683:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePatIdent7891); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3707:1: entryRulePatBoxed returns [EObject current=null] : iv_rulePatBoxed= rulePatBoxed EOF ;
    public final EObject entryRulePatBoxed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatBoxed = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3708:2: (iv_rulePatBoxed= rulePatBoxed EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3709:2: iv_rulePatBoxed= rulePatBoxed EOF
            {
             newCompositeNode(grammarAccess.getPatBoxedRule()); 
            pushFollow(FOLLOW_rulePatBoxed_in_entryRulePatBoxed7932);
            iv_rulePatBoxed=rulePatBoxed();

            state._fsp--;

             current =iv_rulePatBoxed; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBoxed7942); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3716:1: rulePatBoxed returns [EObject current=null] : (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatBoxed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3719:28: ( (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3720:1: (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3720:1: (otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3720:3: otherlv_0= '@' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_rulePatBoxed7979); 

                	newLeafNode(otherlv_0, grammarAccess.getPatBoxedAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3724:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3725:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3725:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3726:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatBoxedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatBoxed8000);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3750:1: entryRulePatOwned returns [EObject current=null] : iv_rulePatOwned= rulePatOwned EOF ;
    public final EObject entryRulePatOwned() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatOwned = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3751:2: (iv_rulePatOwned= rulePatOwned EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3752:2: iv_rulePatOwned= rulePatOwned EOF
            {
             newCompositeNode(grammarAccess.getPatOwnedRule()); 
            pushFollow(FOLLOW_rulePatOwned_in_entryRulePatOwned8036);
            iv_rulePatOwned=rulePatOwned();

            state._fsp--;

             current =iv_rulePatOwned; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatOwned8046); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3759:1: rulePatOwned returns [EObject current=null] : (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatOwned() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3762:28: ( (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3763:1: (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3763:1: (otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3763:3: otherlv_0= '~' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_rulePatOwned8083); 

                	newLeafNode(otherlv_0, grammarAccess.getPatOwnedAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3767:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3768:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3768:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3769:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatOwnedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatOwned8104);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3793:1: entryRulePatBorrowed returns [EObject current=null] : iv_rulePatBorrowed= rulePatBorrowed EOF ;
    public final EObject entryRulePatBorrowed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatBorrowed = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3794:2: (iv_rulePatBorrowed= rulePatBorrowed EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3795:2: iv_rulePatBorrowed= rulePatBorrowed EOF
            {
             newCompositeNode(grammarAccess.getPatBorrowedRule()); 
            pushFollow(FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed8140);
            iv_rulePatBorrowed=rulePatBorrowed();

            state._fsp--;

             current =iv_rulePatBorrowed; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatBorrowed8150); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3802:1: rulePatBorrowed returns [EObject current=null] : (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) ) ;
    public final EObject rulePatBorrowed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pattern_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3805:28: ( (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3806:1: (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3806:1: (otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3806:3: otherlv_0= '&' ( (lv_pattern_1_0= rulePat ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_rulePatBorrowed8187); 

                	newLeafNode(otherlv_0, grammarAccess.getPatBorrowedAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3810:1: ( (lv_pattern_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3811:1: (lv_pattern_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3811:1: (lv_pattern_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3812:3: lv_pattern_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatBorrowedAccess().getPatternPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatBorrowed8208);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3836:1: entryRulePatTuple returns [EObject current=null] : iv_rulePatTuple= rulePatTuple EOF ;
    public final EObject entryRulePatTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatTuple = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3837:2: (iv_rulePatTuple= rulePatTuple EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3838:2: iv_rulePatTuple= rulePatTuple EOF
            {
             newCompositeNode(grammarAccess.getPatTupleRule()); 
            pushFollow(FOLLOW_rulePatTuple_in_entryRulePatTuple8244);
            iv_rulePatTuple=rulePatTuple();

            state._fsp--;

             current =iv_rulePatTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatTuple8254); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3845:1: rulePatTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' ) ;
    public final EObject rulePatTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_patterns_1_0 = null;

        EObject lv_patterns_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3848:28: ( (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3849:1: (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3849:1: (otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3849:3: otherlv_0= '(' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulePatTuple8291); 

                	newLeafNode(otherlv_0, grammarAccess.getPatTupleAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3853:1: ( (lv_patterns_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3854:1: (lv_patterns_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3854:1: (lv_patterns_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3855:3: lv_patterns_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatTuple8312);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3871:2: (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==46) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3871:4: otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulePatTuple8325); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPatTupleAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3875:1: ( (lv_patterns_3_0= rulePat ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3876:1: (lv_patterns_3_0= rulePat )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3876:1: (lv_patterns_3_0= rulePat )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3877:3: lv_patterns_3_0= rulePat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPatTupleAccess().getPatternsPatParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePat_in_rulePatTuple8346);
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
            	    break loop68;
                }
            } while (true);

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_rulePatTuple8360); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3905:1: entryRulePatVector returns [EObject current=null] : iv_rulePatVector= rulePatVector EOF ;
    public final EObject entryRulePatVector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatVector = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3906:2: (iv_rulePatVector= rulePatVector EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3907:2: iv_rulePatVector= rulePatVector EOF
            {
             newCompositeNode(grammarAccess.getPatVectorRule()); 
            pushFollow(FOLLOW_rulePatVector_in_entryRulePatVector8396);
            iv_rulePatVector=rulePatVector();

            state._fsp--;

             current =iv_rulePatVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatVector8406); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3914:1: rulePatVector returns [EObject current=null] : (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' ) ;
    public final EObject rulePatVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_patterns_1_0 = null;

        EObject lv_patterns_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3917:28: ( (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3918:1: (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3918:1: (otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3918:3: otherlv_0= '[' ( (lv_patterns_1_0= rulePat ) ) (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_rulePatVector8443); 

                	newLeafNode(otherlv_0, grammarAccess.getPatVectorAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3922:1: ( (lv_patterns_1_0= rulePat ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3923:1: (lv_patterns_1_0= rulePat )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3923:1: (lv_patterns_1_0= rulePat )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3924:3: lv_patterns_1_0= rulePat
            {
             
            	        newCompositeNode(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePat_in_rulePatVector8464);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3940:2: (otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==46) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3940:4: otherlv_2= ',' ( (lv_patterns_3_0= rulePat ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulePatVector8477); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPatVectorAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3944:1: ( (lv_patterns_3_0= rulePat ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3945:1: (lv_patterns_3_0= rulePat )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3945:1: (lv_patterns_3_0= rulePat )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3946:3: lv_patterns_3_0= rulePat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPatVectorAccess().getPatternsPatParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePat_in_rulePatVector8498);
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
            	    break loop69;
                }
            } while (true);

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_rulePatVector8512); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3974:1: entryRulePatLiteral returns [EObject current=null] : iv_rulePatLiteral= rulePatLiteral EOF ;
    public final EObject entryRulePatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3975:2: (iv_rulePatLiteral= rulePatLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3976:2: iv_rulePatLiteral= rulePatLiteral EOF
            {
             newCompositeNode(grammarAccess.getPatLiteralRule()); 
            pushFollow(FOLLOW_rulePatLiteral_in_entryRulePatLiteral8548);
            iv_rulePatLiteral=rulePatLiteral();

            state._fsp--;

             current =iv_rulePatLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatLiteral8558); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3983:1: rulePatLiteral returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject rulePatLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3986:28: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3987:1: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3987:1: ( (lv_literal_0_0= ruleLiteral ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3988:1: (lv_literal_0_0= ruleLiteral )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3988:1: (lv_literal_0_0= ruleLiteral )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:3989:3: lv_literal_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getPatLiteralAccess().getLiteralLiteralParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_rulePatLiteral8603);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4013:1: entryRulePatRange returns [EObject current=null] : iv_rulePatRange= rulePatRange EOF ;
    public final EObject entryRulePatRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatRange = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4014:2: (iv_rulePatRange= rulePatRange EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4015:2: iv_rulePatRange= rulePatRange EOF
            {
             newCompositeNode(grammarAccess.getPatRangeRule()); 
            pushFollow(FOLLOW_rulePatRange_in_entryRulePatRange8638);
            iv_rulePatRange=rulePatRange();

            state._fsp--;

             current =iv_rulePatRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatRange8648); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4022:1: rulePatRange returns [EObject current=null] : (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange ) ;
    public final EObject rulePatRange() throws RecognitionException {
        EObject current = null;

        EObject this_PatCharRange_0 = null;

        EObject this_PatNumberRange_1 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4025:28: ( (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4026:1: (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4026:1: (this_PatCharRange_0= rulePatCharRange | this_PatNumberRange_1= rulePatNumberRange )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_CHAR_LIT) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=RULE_FLOAT_LIT && LA70_0<=RULE_INT_LIT)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4027:5: this_PatCharRange_0= rulePatCharRange
                    {
                     
                            newCompositeNode(grammarAccess.getPatRangeAccess().getPatCharRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePatCharRange_in_rulePatRange8695);
                    this_PatCharRange_0=rulePatCharRange();

                    state._fsp--;

                     
                            current = this_PatCharRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4037:5: this_PatNumberRange_1= rulePatNumberRange
                    {
                     
                            newCompositeNode(grammarAccess.getPatRangeAccess().getPatNumberRangeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePatNumberRange_in_rulePatRange8722);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4053:1: entryRulePatCharRange returns [EObject current=null] : iv_rulePatCharRange= rulePatCharRange EOF ;
    public final EObject entryRulePatCharRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatCharRange = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4054:2: (iv_rulePatCharRange= rulePatCharRange EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4055:2: iv_rulePatCharRange= rulePatCharRange EOF
            {
             newCompositeNode(grammarAccess.getPatCharRangeRule()); 
            pushFollow(FOLLOW_rulePatCharRange_in_entryRulePatCharRange8757);
            iv_rulePatCharRange=rulePatCharRange();

            state._fsp--;

             current =iv_rulePatCharRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatCharRange8767); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4062:1: rulePatCharRange returns [EObject current=null] : ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) ) ;
    public final EObject rulePatCharRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4065:28: ( ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4066:1: ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4066:1: ( ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4066:2: ( (lv_start_0_0= ruleCharLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleCharLit ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4066:2: ( (lv_start_0_0= ruleCharLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4067:1: (lv_start_0_0= ruleCharLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4067:1: (lv_start_0_0= ruleCharLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4068:3: lv_start_0_0= ruleCharLit
            {
             
            	        newCompositeNode(grammarAccess.getPatCharRangeAccess().getStartCharLitParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCharLit_in_rulePatCharRange8813);
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

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_rulePatCharRange8825); 

                	newLeafNode(otherlv_1, grammarAccess.getPatCharRangeAccess().getFullStopFullStopKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4088:1: ( (lv_end_2_0= ruleCharLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4089:1: (lv_end_2_0= ruleCharLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4089:1: (lv_end_2_0= ruleCharLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4090:3: lv_end_2_0= ruleCharLit
            {
             
            	        newCompositeNode(grammarAccess.getPatCharRangeAccess().getEndCharLitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCharLit_in_rulePatCharRange8846);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4114:1: entryRulePatNumberRange returns [EObject current=null] : iv_rulePatNumberRange= rulePatNumberRange EOF ;
    public final EObject entryRulePatNumberRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatNumberRange = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4115:2: (iv_rulePatNumberRange= rulePatNumberRange EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4116:2: iv_rulePatNumberRange= rulePatNumberRange EOF
            {
             newCompositeNode(grammarAccess.getPatNumberRangeRule()); 
            pushFollow(FOLLOW_rulePatNumberRange_in_entryRulePatNumberRange8882);
            iv_rulePatNumberRange=rulePatNumberRange();

            state._fsp--;

             current =iv_rulePatNumberRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatNumberRange8892); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4123:1: rulePatNumberRange returns [EObject current=null] : ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) ) ;
    public final EObject rulePatNumberRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4126:28: ( ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4127:1: ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4127:1: ( ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4127:2: ( (lv_start_0_0= ruleNumberLit ) ) otherlv_1= '..' ( (lv_end_2_0= ruleNumberLit ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4127:2: ( (lv_start_0_0= ruleNumberLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4128:1: (lv_start_0_0= ruleNumberLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4128:1: (lv_start_0_0= ruleNumberLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4129:3: lv_start_0_0= ruleNumberLit
            {
             
            	        newCompositeNode(grammarAccess.getPatNumberRangeAccess().getStartNumberLitParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberLit_in_rulePatNumberRange8938);
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

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_rulePatNumberRange8950); 

                	newLeafNode(otherlv_1, grammarAccess.getPatNumberRangeAccess().getFullStopFullStopKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4149:1: ( (lv_end_2_0= ruleNumberLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4150:1: (lv_end_2_0= ruleNumberLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4150:1: (lv_end_2_0= ruleNumberLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4151:3: lv_end_2_0= ruleNumberLit
            {
             
            	        newCompositeNode(grammarAccess.getPatNumberRangeAccess().getEndNumberLitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberLit_in_rulePatNumberRange8971);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4175:1: entryRulePatEnum returns [EObject current=null] : iv_rulePatEnum= rulePatEnum EOF ;
    public final EObject entryRulePatEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatEnum = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4176:2: (iv_rulePatEnum= rulePatEnum EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4177:2: iv_rulePatEnum= rulePatEnum EOF
            {
             newCompositeNode(grammarAccess.getPatEnumRule()); 
            pushFollow(FOLLOW_rulePatEnum_in_entryRulePatEnum9007);
            iv_rulePatEnum=rulePatEnum();

            state._fsp--;

             current =iv_rulePatEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatEnum9017); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4184:1: rulePatEnum returns [EObject current=null] : ( ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4187:28: ( ( ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4188:1: ( ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4188:1: ( ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4188:2: ( (lv_path_0_0= rulePath ) ) ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4188:2: ( (lv_path_0_0= rulePath ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4189:1: (lv_path_0_0= rulePath )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4189:1: (lv_path_0_0= rulePath )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4190:3: lv_path_0_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getPatEnumAccess().getPathPathParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePath_in_rulePatEnum9063);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4206:2: ( ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' ) | ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==48) ) {
                alt74=1;
            }
            else if ( (LA74_0==53) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4206:3: ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4206:3: ( () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4206:4: () otherlv_2= '(' (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) ) otherlv_8= ')'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4206:4: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4207:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPatEnumAccess().getPatTupleEnumPathAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_rulePatEnum9086); 

                        	newLeafNode(otherlv_2, grammarAccess.getPatEnumAccess().getLeftParenthesisKeyword_1_0_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4216:1: (otherlv_3= '*' | otherlv_4= '..' | ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* ) )
                    int alt72=3;
                    switch ( input.LA(1) ) {
                    case 72:
                        {
                        alt72=1;
                        }
                        break;
                    case 69:
                        {
                        alt72=2;
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
                    case 78:
                        {
                        alt72=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }

                    switch (alt72) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4216:3: otherlv_3= '*'
                            {
                            otherlv_3=(Token)match(input,72,FOLLOW_72_in_rulePatEnum9099); 

                                	newLeafNode(otherlv_3, grammarAccess.getPatEnumAccess().getAsteriskKeyword_1_0_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4221:7: otherlv_4= '..'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_rulePatEnum9117); 

                                	newLeafNode(otherlv_4, grammarAccess.getPatEnumAccess().getFullStopFullStopKeyword_1_0_2_1());
                                

                            }
                            break;
                        case 3 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4226:6: ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4226:6: ( ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )* )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4226:7: ( (lv_patterns_5_0= rulePat ) ) (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )*
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4226:7: ( (lv_patterns_5_0= rulePat ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4227:1: (lv_patterns_5_0= rulePat )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4227:1: (lv_patterns_5_0= rulePat )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4228:3: lv_patterns_5_0= rulePat
                            {
                             
                            	        newCompositeNode(grammarAccess.getPatEnumAccess().getPatternsPatParserRuleCall_1_0_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulePat_in_rulePatEnum9145);
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

                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4244:2: (otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==46) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4244:4: otherlv_6= ',' ( (lv_patterns_7_0= rulePat ) )
                            	    {
                            	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_rulePatEnum9158); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getPatEnumAccess().getCommaKeyword_1_0_2_2_1_0());
                            	        
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4248:1: ( (lv_patterns_7_0= rulePat ) )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4249:1: (lv_patterns_7_0= rulePat )
                            	    {
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4249:1: (lv_patterns_7_0= rulePat )
                            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4250:3: lv_patterns_7_0= rulePat
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPatEnumAccess().getPatternsPatParserRuleCall_1_0_2_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePat_in_rulePatEnum9179);
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
                            	    break loop71;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_rulePatEnum9195); 

                        	newLeafNode(otherlv_8, grammarAccess.getPatEnumAccess().getRightParenthesisKeyword_1_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4271:6: ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4271:6: ( () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4271:7: () otherlv_10= '{' ( (lv_fieldPatterns_11_0= ruleFieldPat ) ) (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )* otherlv_14= '}'
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4271:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4272:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPatEnumAccess().getPatStructEnumPathAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,53,FOLLOW_53_in_rulePatEnum9224); 

                        	newLeafNode(otherlv_10, grammarAccess.getPatEnumAccess().getLeftCurlyBracketKeyword_1_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4281:1: ( (lv_fieldPatterns_11_0= ruleFieldPat ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4282:1: (lv_fieldPatterns_11_0= ruleFieldPat )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4282:1: (lv_fieldPatterns_11_0= ruleFieldPat )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4283:3: lv_fieldPatterns_11_0= ruleFieldPat
                    {
                     
                    	        newCompositeNode(grammarAccess.getPatEnumAccess().getFieldPatternsFieldPatParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldPat_in_rulePatEnum9245);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4299:2: (otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==46) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4299:4: otherlv_12= ',' ( (lv_fieldPatterns_13_0= ruleFieldPat ) )
                    	    {
                    	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_rulePatEnum9258); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getPatEnumAccess().getCommaKeyword_1_1_3_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4303:1: ( (lv_fieldPatterns_13_0= ruleFieldPat ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4304:1: (lv_fieldPatterns_13_0= ruleFieldPat )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4304:1: (lv_fieldPatterns_13_0= ruleFieldPat )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4305:3: lv_fieldPatterns_13_0= ruleFieldPat
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPatEnumAccess().getFieldPatternsFieldPatParserRuleCall_1_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFieldPat_in_rulePatEnum9279);
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
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,54,FOLLOW_54_in_rulePatEnum9293); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4333:1: entryRuleFieldPat returns [EObject current=null] : iv_ruleFieldPat= ruleFieldPat EOF ;
    public final EObject entryRuleFieldPat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPat = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4334:2: (iv_ruleFieldPat= ruleFieldPat EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4335:2: iv_ruleFieldPat= ruleFieldPat EOF
            {
             newCompositeNode(grammarAccess.getFieldPatRule()); 
            pushFollow(FOLLOW_ruleFieldPat_in_entryRuleFieldPat9331);
            iv_ruleFieldPat=ruleFieldPat();

            state._fsp--;

             current =iv_ruleFieldPat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldPat9341); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4342:1: ruleFieldPat returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? ) ;
    public final EObject ruleFieldPat() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        EObject lv_pattern_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4345:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4346:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4346:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4346:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4346:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4347:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4347:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4348:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFieldPat9383); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4364:2: (otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==68) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4364:4: otherlv_1= ':' ( (lv_pattern_2_0= rulePat ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleFieldPat9401); 

                        	newLeafNode(otherlv_1, grammarAccess.getFieldPatAccess().getColonKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4368:1: ( (lv_pattern_2_0= rulePat ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4369:1: (lv_pattern_2_0= rulePat )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4369:1: (lv_pattern_2_0= rulePat )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4370:3: lv_pattern_2_0= rulePat
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldPatAccess().getPatternPatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePat_in_ruleFieldPat9422);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4394:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4395:2: (iv_rulePath= rulePath EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4396:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath9460);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath9470); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4403:1: rulePath returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )? ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4406:28: ( ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4407:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4407:1: ( ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4407:2: ( (lv_segments_0_0= RULE_IDENT ) ) (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )* (otherlv_3= '::' )? (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4407:2: ( (lv_segments_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4408:1: (lv_segments_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4408:1: (lv_segments_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4409:3: lv_segments_0_0= RULE_IDENT
            {
            lv_segments_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePath9512); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4425:2: (otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==79) ) {
                    int LA76_1 = input.LA(2);

                    if ( (LA76_1==RULE_IDENT) ) {
                        alt76=1;
                    }


                }


                switch (alt76) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4425:4: otherlv_1= '::' ( (lv_segments_2_0= RULE_IDENT ) )
            	    {
            	    otherlv_1=(Token)match(input,79,FOLLOW_79_in_rulePath9530); 

            	        	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getColonColonKeyword_1_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4429:1: ( (lv_segments_2_0= RULE_IDENT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4430:1: (lv_segments_2_0= RULE_IDENT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4430:1: (lv_segments_2_0= RULE_IDENT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4431:3: lv_segments_2_0= RULE_IDENT
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePath9547); 

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
            	    break loop76;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4447:4: (otherlv_3= '::' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==79) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4447:6: otherlv_3= '::'
                    {
                    otherlv_3=(Token)match(input,79,FOLLOW_79_in_rulePath9567); 

                        	newLeafNode(otherlv_3, grammarAccess.getPathAccess().getColonColonKeyword_2());
                        

                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4451:3: (otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==56) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4451:5: otherlv_4= '<' ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) ) (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )* otherlv_10= '>'
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_56_in_rulePath9582); 

                        	newLeafNode(otherlv_4, grammarAccess.getPathAccess().getLessThanSignKeyword_3_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4455:1: ( ( (lv_lifetimes_5_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_6_0= ruleType ) ) )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==RULE_LIFETIME) ) {
                        alt78=1;
                    }
                    else if ( ((LA78_0>=RULE_INT_TYPE && LA78_0<=RULE_UNIT_TYPE)||LA78_0==48||(LA78_0>=60 && LA78_0<=61)||(LA78_0>=74 && LA78_0<=76)) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4455:2: ( (lv_lifetimes_5_0= RULE_LIFETIME ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4455:2: ( (lv_lifetimes_5_0= RULE_LIFETIME ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4456:1: (lv_lifetimes_5_0= RULE_LIFETIME )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4456:1: (lv_lifetimes_5_0= RULE_LIFETIME )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4457:3: lv_lifetimes_5_0= RULE_LIFETIME
                            {
                            lv_lifetimes_5_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_rulePath9600); 

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
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4474:6: ( (lv_genericTypes_6_0= ruleType ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4474:6: ( (lv_genericTypes_6_0= ruleType ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4475:1: (lv_genericTypes_6_0= ruleType )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4475:1: (lv_genericTypes_6_0= ruleType )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4476:3: lv_genericTypes_6_0= ruleType
                            {
                             
                            	        newCompositeNode(grammarAccess.getPathAccess().getGenericTypesTypeParserRuleCall_3_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleType_in_rulePath9632);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4492:3: (otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==46) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4492:5: otherlv_7= ',' ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,46,FOLLOW_46_in_rulePath9646); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPathAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4496:1: ( ( (lv_lifetimes_8_0= RULE_LIFETIME ) ) | ( (lv_genericTypes_9_0= ruleType ) ) )
                    	    int alt79=2;
                    	    int LA79_0 = input.LA(1);

                    	    if ( (LA79_0==RULE_LIFETIME) ) {
                    	        alt79=1;
                    	    }
                    	    else if ( ((LA79_0>=RULE_INT_TYPE && LA79_0<=RULE_UNIT_TYPE)||LA79_0==48||(LA79_0>=60 && LA79_0<=61)||(LA79_0>=74 && LA79_0<=76)) ) {
                    	        alt79=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 79, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt79) {
                    	        case 1 :
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4496:2: ( (lv_lifetimes_8_0= RULE_LIFETIME ) )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4496:2: ( (lv_lifetimes_8_0= RULE_LIFETIME ) )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4497:1: (lv_lifetimes_8_0= RULE_LIFETIME )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4497:1: (lv_lifetimes_8_0= RULE_LIFETIME )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4498:3: lv_lifetimes_8_0= RULE_LIFETIME
                    	            {
                    	            lv_lifetimes_8_0=(Token)match(input,RULE_LIFETIME,FOLLOW_RULE_LIFETIME_in_rulePath9664); 

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
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4515:6: ( (lv_genericTypes_9_0= ruleType ) )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4515:6: ( (lv_genericTypes_9_0= ruleType ) )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4516:1: (lv_genericTypes_9_0= ruleType )
                    	            {
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4516:1: (lv_genericTypes_9_0= ruleType )
                    	            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4517:3: lv_genericTypes_9_0= ruleType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getPathAccess().getGenericTypesTypeParserRuleCall_3_2_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleType_in_rulePath9696);
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
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,57,FOLLOW_57_in_rulePath9711); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4545:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4546:2: (iv_ruleType= ruleType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4547:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType9749);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType9759); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4554:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_TupleType_1= ruleTupleType | this_StructType_2= ruleStructType | this_EnumType_3= ruleEnumType | this_BoxedPointer_4= ruleBoxedPointer | this_OwnedPointer_5= ruleOwnedPointer | this_BorrowedPointer_6= ruleBorrowedPointer ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4557:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_TupleType_1= ruleTupleType | this_StructType_2= ruleStructType | this_EnumType_3= ruleEnumType | this_BoxedPointer_4= ruleBoxedPointer | this_OwnedPointer_5= ruleOwnedPointer | this_BorrowedPointer_6= ruleBorrowedPointer ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4558:1: (this_PrimitiveType_0= rulePrimitiveType | this_TupleType_1= ruleTupleType | this_StructType_2= ruleStructType | this_EnumType_3= ruleEnumType | this_BoxedPointer_4= ruleBoxedPointer | this_OwnedPointer_5= ruleOwnedPointer | this_BorrowedPointer_6= ruleBorrowedPointer )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4558:1: (this_PrimitiveType_0= rulePrimitiveType | this_TupleType_1= ruleTupleType | this_StructType_2= ruleStructType | this_EnumType_3= ruleEnumType | this_BoxedPointer_4= ruleBoxedPointer | this_OwnedPointer_5= ruleOwnedPointer | this_BorrowedPointer_6= ruleBorrowedPointer )
            int alt82=7;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
            case RULE_FLOAT_TYPE:
            case RULE_BOOLEAN_TYPE:
            case RULE_MACHINE_TYPE:
            case RULE_UNIT_TYPE:
                {
                alt82=1;
                }
                break;
            case 48:
                {
                alt82=2;
                }
                break;
            case 60:
                {
                alt82=3;
                }
                break;
            case 61:
                {
                alt82=4;
                }
                break;
            case 74:
                {
                alt82=5;
                }
                break;
            case 75:
                {
                alt82=6;
                }
                break;
            case 76:
                {
                alt82=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4559:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType9806);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;

                     
                            current = this_PrimitiveType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4569:5: this_TupleType_1= ruleTupleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleType_in_ruleType9833);
                    this_TupleType_1=ruleTupleType();

                    state._fsp--;

                     
                            current = this_TupleType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4579:5: this_StructType_2= ruleStructType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStructType_in_ruleType9860);
                    this_StructType_2=ruleStructType();

                    state._fsp--;

                     
                            current = this_StructType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4589:5: this_EnumType_3= ruleEnumType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_ruleType9887);
                    this_EnumType_3=ruleEnumType();

                    state._fsp--;

                     
                            current = this_EnumType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4599:5: this_BoxedPointer_4= ruleBoxedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBoxedPointerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBoxedPointer_in_ruleType9914);
                    this_BoxedPointer_4=ruleBoxedPointer();

                    state._fsp--;

                     
                            current = this_BoxedPointer_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4609:5: this_OwnedPointer_5= ruleOwnedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getOwnedPointerParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleOwnedPointer_in_ruleType9941);
                    this_OwnedPointer_5=ruleOwnedPointer();

                    state._fsp--;

                     
                            current = this_OwnedPointer_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4619:5: this_BorrowedPointer_6= ruleBorrowedPointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBorrowedPointerParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleBorrowedPointer_in_ruleType9968);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4635:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4636:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4637:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType10003);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType10013); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4644:1: rulePrimitiveType returns [EObject current=null] : ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token this_INT_TYPE_1=null;
        Token this_FLOAT_TYPE_3=null;
        Token this_BOOLEAN_TYPE_5=null;
        Token this_MACHINE_TYPE_7=null;
        Token this_UNIT_TYPE_9=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4647:28: ( ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4648:1: ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4648:1: ( ( () this_INT_TYPE_1= RULE_INT_TYPE ) | ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE ) | ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE ) | ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE ) | ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE ) )
            int alt83=5;
            switch ( input.LA(1) ) {
            case RULE_INT_TYPE:
                {
                alt83=1;
                }
                break;
            case RULE_FLOAT_TYPE:
                {
                alt83=2;
                }
                break;
            case RULE_BOOLEAN_TYPE:
                {
                alt83=3;
                }
                break;
            case RULE_MACHINE_TYPE:
                {
                alt83=4;
                }
                break;
            case RULE_UNIT_TYPE:
                {
                alt83=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4648:2: ( () this_INT_TYPE_1= RULE_INT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4648:2: ( () this_INT_TYPE_1= RULE_INT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4648:3: () this_INT_TYPE_1= RULE_INT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4648:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4649:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getIntTypeAction_0_0(),
                                current);
                        

                    }

                    this_INT_TYPE_1=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rulePrimitiveType10059); 
                     
                        newLeafNode(this_INT_TYPE_1, grammarAccess.getPrimitiveTypeAccess().getINT_TYPETerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4659:6: ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4659:6: ( () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4659:7: () this_FLOAT_TYPE_3= RULE_FLOAT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4659:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4660:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getFloatTypeAction_1_0(),
                                current);
                        

                    }

                    this_FLOAT_TYPE_3=(Token)match(input,RULE_FLOAT_TYPE,FOLLOW_RULE_FLOAT_TYPE_in_rulePrimitiveType10086); 
                     
                        newLeafNode(this_FLOAT_TYPE_3, grammarAccess.getPrimitiveTypeAccess().getFLOAT_TYPETerminalRuleCall_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4670:6: ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4670:6: ( () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4670:7: () this_BOOLEAN_TYPE_5= RULE_BOOLEAN_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4670:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4671:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getBoolTypeAction_2_0(),
                                current);
                        

                    }

                    this_BOOLEAN_TYPE_5=(Token)match(input,RULE_BOOLEAN_TYPE,FOLLOW_RULE_BOOLEAN_TYPE_in_rulePrimitiveType10113); 
                     
                        newLeafNode(this_BOOLEAN_TYPE_5, grammarAccess.getPrimitiveTypeAccess().getBOOLEAN_TYPETerminalRuleCall_2_1()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4681:6: ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4681:6: ( () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4681:7: () this_MACHINE_TYPE_7= RULE_MACHINE_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4681:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4682:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getMachineTypeAction_3_0(),
                                current);
                        

                    }

                    this_MACHINE_TYPE_7=(Token)match(input,RULE_MACHINE_TYPE,FOLLOW_RULE_MACHINE_TYPE_in_rulePrimitiveType10140); 
                     
                        newLeafNode(this_MACHINE_TYPE_7, grammarAccess.getPrimitiveTypeAccess().getMACHINE_TYPETerminalRuleCall_3_1()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4692:6: ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4692:6: ( () this_UNIT_TYPE_9= RULE_UNIT_TYPE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4692:7: () this_UNIT_TYPE_9= RULE_UNIT_TYPE
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4692:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4693:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimitiveTypeAccess().getUnitTypeAction_4_0(),
                                current);
                        

                    }

                    this_UNIT_TYPE_9=(Token)match(input,RULE_UNIT_TYPE,FOLLOW_RULE_UNIT_TYPE_in_rulePrimitiveType10167); 
                     
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4710:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4711:2: (iv_ruleTupleType= ruleTupleType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4712:2: iv_ruleTupleType= ruleTupleType EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_ruleTupleType_in_entryRuleTupleType10203);
            iv_ruleTupleType=ruleTupleType();

            state._fsp--;

             current =iv_ruleTupleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleType10213); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4719:1: ruleTupleType returns [EObject current=null] : (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4722:28: ( (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4723:1: (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4723:1: (otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4723:3: otherlv_0= '(' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleTupleType10250); 

                	newLeafNode(otherlv_0, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4727:1: ( (lv_types_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4728:1: (lv_types_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4728:1: (lv_types_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4729:3: lv_types_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTupleType10271);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4745:2: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==46) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4745:4: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleTupleType10284); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTupleTypeAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4749:1: ( (lv_types_3_0= ruleType ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4750:1: (lv_types_3_0= ruleType )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4750:1: (lv_types_3_0= ruleType )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4751:3: lv_types_3_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTupleTypeAccess().getTypesTypeParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleTupleType10305);
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
            	    break loop84;
                }
            } while (true);

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleTupleType10319); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4779:1: entryRuleStructType returns [EObject current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final EObject entryRuleStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4780:2: (iv_ruleStructType= ruleStructType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4781:2: iv_ruleStructType= ruleStructType EOF
            {
             newCompositeNode(grammarAccess.getStructTypeRule()); 
            pushFollow(FOLLOW_ruleStructType_in_entryRuleStructType10355);
            iv_ruleStructType=ruleStructType();

            state._fsp--;

             current =iv_ruleStructType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructType10365); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4788:1: ruleStructType returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4791:28: ( (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4792:1: (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4792:1: (otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4792:3: otherlv_0= 'struct' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_fields_8_0= ruleStructField ) ) (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleStructType10402); 

                	newLeafNode(otherlv_0, grammarAccess.getStructTypeAccess().getStructKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4796:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4797:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4797:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4798:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructType10419); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4814:2: (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==56) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4814:4: otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleStructType10437); 

                        	newLeafNode(otherlv_2, grammarAccess.getStructTypeAccess().getLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4818:1: ( (lv_params_3_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4819:1: (lv_params_3_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4819:1: (lv_params_3_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4820:3: lv_params_3_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructType10458);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4836:2: (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==46) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4836:4: otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleStructType10471); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getStructTypeAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4840:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4841:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4841:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4842:3: lv_params_5_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructType10492);
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
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleStructType10506); 

                        	newLeafNode(otherlv_6, grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleStructType10520); 

                	newLeafNode(otherlv_7, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4866:1: ( (lv_fields_8_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4867:1: (lv_fields_8_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4867:1: (lv_fields_8_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4868:3: lv_fields_8_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleStructType10541);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4884:2: (otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==46) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4884:4: otherlv_9= ',' ( (lv_fields_10_0= ruleStructField ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleStructType10554); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStructTypeAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4888:1: ( (lv_fields_10_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4889:1: (lv_fields_10_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4889:1: (lv_fields_10_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4890:3: lv_fields_10_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructTypeAccess().getFieldsStructFieldParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleStructType10575);
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
            	    break loop87;
                }
            } while (true);

            otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleStructType10589); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4918:1: entryRuleBoxedPointer returns [EObject current=null] : iv_ruleBoxedPointer= ruleBoxedPointer EOF ;
    public final EObject entryRuleBoxedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4919:2: (iv_ruleBoxedPointer= ruleBoxedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4920:2: iv_ruleBoxedPointer= ruleBoxedPointer EOF
            {
             newCompositeNode(grammarAccess.getBoxedPointerRule()); 
            pushFollow(FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer10625);
            iv_ruleBoxedPointer=ruleBoxedPointer();

            state._fsp--;

             current =iv_ruleBoxedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxedPointer10635); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4927:1: ruleBoxedPointer returns [EObject current=null] : (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleBoxedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4930:28: ( (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4931:1: (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4931:1: (otherlv_0= '@' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4931:3: otherlv_0= '@' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleBoxedPointer10672); 

                	newLeafNode(otherlv_0, grammarAccess.getBoxedPointerAccess().getCommercialAtKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4935:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4936:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4936:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4937:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBoxedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleBoxedPointer10693);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4961:1: entryRuleOwnedPointer returns [EObject current=null] : iv_ruleOwnedPointer= ruleOwnedPointer EOF ;
    public final EObject entryRuleOwnedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4962:2: (iv_ruleOwnedPointer= ruleOwnedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4963:2: iv_ruleOwnedPointer= ruleOwnedPointer EOF
            {
             newCompositeNode(grammarAccess.getOwnedPointerRule()); 
            pushFollow(FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer10729);
            iv_ruleOwnedPointer=ruleOwnedPointer();

            state._fsp--;

             current =iv_ruleOwnedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOwnedPointer10739); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4970:1: ruleOwnedPointer returns [EObject current=null] : (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleOwnedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4973:28: ( (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4974:1: (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4974:1: (otherlv_0= '~' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4974:3: otherlv_0= '~' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleOwnedPointer10776); 

                	newLeafNode(otherlv_0, grammarAccess.getOwnedPointerAccess().getTildeKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4978:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4979:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4979:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4980:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getOwnedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleOwnedPointer10797);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5004:1: entryRuleBorrowedPointer returns [EObject current=null] : iv_ruleBorrowedPointer= ruleBorrowedPointer EOF ;
    public final EObject entryRuleBorrowedPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorrowedPointer = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5005:2: (iv_ruleBorrowedPointer= ruleBorrowedPointer EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5006:2: iv_ruleBorrowedPointer= ruleBorrowedPointer EOF
            {
             newCompositeNode(grammarAccess.getBorrowedPointerRule()); 
            pushFollow(FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer10833);
            iv_ruleBorrowedPointer=ruleBorrowedPointer();

            state._fsp--;

             current =iv_ruleBorrowedPointer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorrowedPointer10843); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5013:1: ruleBorrowedPointer returns [EObject current=null] : (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleBorrowedPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5016:28: ( (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5017:1: (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5017:1: (otherlv_0= '&' ( (lv_type_1_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5017:3: otherlv_0= '&' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleBorrowedPointer10880); 

                	newLeafNode(otherlv_0, grammarAccess.getBorrowedPointerAccess().getAmpersandKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5021:1: ( (lv_type_1_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5022:1: (lv_type_1_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5022:1: (lv_type_1_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5023:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBorrowedPointerAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleBorrowedPointer10901);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5047:1: entryRuleStructField returns [EObject current=null] : iv_ruleStructField= ruleStructField EOF ;
    public final EObject entryRuleStructField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructField = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5048:2: (iv_ruleStructField= ruleStructField EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5049:2: iv_ruleStructField= ruleStructField EOF
            {
             newCompositeNode(grammarAccess.getStructFieldRule()); 
            pushFollow(FOLLOW_ruleStructField_in_entryRuleStructField10937);
            iv_ruleStructField=ruleStructField();

            state._fsp--;

             current =iv_ruleStructField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructField10947); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5056:1: ruleStructField returns [EObject current=null] : ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleStructField() throws RecognitionException {
        EObject current = null;

        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_vis_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5059:28: ( ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5060:1: ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5060:1: ( ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5060:2: ( (lv_vis_0_0= ruleVisibility ) )? ( (lv_ident_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5060:2: ( (lv_vis_0_0= ruleVisibility ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=80 && LA88_0<=81)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5061:1: (lv_vis_0_0= ruleVisibility )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5061:1: (lv_vis_0_0= ruleVisibility )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5062:3: lv_vis_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructFieldAccess().getVisVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibility_in_ruleStructField10993);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5078:3: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5079:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5079:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5080:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructField11011); 

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

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleStructField11028); 

                	newLeafNode(otherlv_2, grammarAccess.getStructFieldAccess().getColonKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5100:1: ( (lv_type_3_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5101:1: (lv_type_3_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5101:1: (lv_type_3_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5102:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getStructFieldAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleStructField11049);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5126:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5127:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5128:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType11085);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType11095); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5135:1: ruleEnumType returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5138:28: ( (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5139:1: (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5139:1: (otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5139:3: otherlv_0= 'enum' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )? otherlv_7= '{' ( (lv_variants_8_0= ruleVariant ) ) (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleEnumType11132); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getEnumKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5143:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5144:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5144:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5145:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleEnumType11149); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5161:2: (otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==56) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5161:4: otherlv_2= '<' ( (lv_params_3_0= ruleGenericParamDecl ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleEnumType11167); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumTypeAccess().getLessThanSignKeyword_2_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5165:1: ( (lv_params_3_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5166:1: (lv_params_3_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5166:1: (lv_params_3_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5167:3: lv_params_3_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleEnumType11188);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5183:2: (otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==46) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5183:4: otherlv_4= ',' ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleEnumType11201); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEnumTypeAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5187:1: ( (lv_params_5_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5188:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5188:1: (lv_params_5_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5189:3: lv_params_5_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumTypeAccess().getParamsGenericParamDeclParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleEnumType11222);
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
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleEnumType11236); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumTypeAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleEnumType11250); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5213:1: ( (lv_variants_8_0= ruleVariant ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5214:1: (lv_variants_8_0= ruleVariant )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5214:1: (lv_variants_8_0= ruleVariant )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5215:3: lv_variants_8_0= ruleVariant
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariant_in_ruleEnumType11271);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5231:2: (otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==46) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5231:4: otherlv_9= ',' ( (lv_variants_10_0= ruleVariant ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleEnumType11284); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEnumTypeAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5235:1: ( (lv_variants_10_0= ruleVariant ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5236:1: (lv_variants_10_0= ruleVariant )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5236:1: (lv_variants_10_0= ruleVariant )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5237:3: lv_variants_10_0= ruleVariant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariant_in_ruleEnumType11305);
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
            	    break loop91;
                }
            } while (true);

            otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleEnumType11319); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5265:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5266:2: (iv_ruleVariant= ruleVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5267:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_ruleVariant_in_entryRuleVariant11355);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariant11365); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5274:1: ruleVariant returns [EObject current=null] : (this_StructVariant_0= ruleStructVariant | this_TupleVariant_1= ruleTupleVariant | this_UnitVariant_2= ruleUnitVariant ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        EObject this_StructVariant_0 = null;

        EObject this_TupleVariant_1 = null;

        EObject this_UnitVariant_2 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5277:28: ( (this_StructVariant_0= ruleStructVariant | this_TupleVariant_1= ruleTupleVariant | this_UnitVariant_2= ruleUnitVariant ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5278:1: (this_StructVariant_0= ruleStructVariant | this_TupleVariant_1= ruleTupleVariant | this_UnitVariant_2= ruleUnitVariant )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5278:1: (this_StructVariant_0= ruleStructVariant | this_TupleVariant_1= ruleTupleVariant | this_UnitVariant_2= ruleUnitVariant )
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_IDENT) ) {
                switch ( input.LA(2) ) {
                case 53:
                case 56:
                    {
                    alt92=1;
                    }
                    break;
                case EOF:
                case 46:
                case 54:
                    {
                    alt92=3;
                    }
                    break;
                case 48:
                    {
                    alt92=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5279:5: this_StructVariant_0= ruleStructVariant
                    {
                     
                            newCompositeNode(grammarAccess.getVariantAccess().getStructVariantParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructVariant_in_ruleVariant11412);
                    this_StructVariant_0=ruleStructVariant();

                    state._fsp--;

                     
                            current = this_StructVariant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5289:5: this_TupleVariant_1= ruleTupleVariant
                    {
                     
                            newCompositeNode(grammarAccess.getVariantAccess().getTupleVariantParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleVariant_in_ruleVariant11439);
                    this_TupleVariant_1=ruleTupleVariant();

                    state._fsp--;

                     
                            current = this_TupleVariant_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5299:5: this_UnitVariant_2= ruleUnitVariant
                    {
                     
                            newCompositeNode(grammarAccess.getVariantAccess().getUnitVariantParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUnitVariant_in_ruleVariant11466);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5315:1: entryRuleStructVariant returns [EObject current=null] : iv_ruleStructVariant= ruleStructVariant EOF ;
    public final EObject entryRuleStructVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5316:2: (iv_ruleStructVariant= ruleStructVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5317:2: iv_ruleStructVariant= ruleStructVariant EOF
            {
             newCompositeNode(grammarAccess.getStructVariantRule()); 
            pushFollow(FOLLOW_ruleStructVariant_in_entryRuleStructVariant11501);
            iv_ruleStructVariant=ruleStructVariant();

            state._fsp--;

             current =iv_ruleStructVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructVariant11511); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5324:1: ruleStructVariant returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5327:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5328:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5328:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5328:2: ( (lv_ident_0_0= RULE_IDENT ) ) (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )? otherlv_6= '{' ( (lv_fields_7_0= ruleStructField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )* otherlv_10= '}'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5328:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5329:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5329:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5330:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleStructVariant11553); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5346:2: (otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==56) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5346:4: otherlv_1= '<' ( (lv_params_2_0= ruleGenericParamDecl ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleStructVariant11571); 

                        	newLeafNode(otherlv_1, grammarAccess.getStructVariantAccess().getLessThanSignKeyword_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5350:1: ( (lv_params_2_0= ruleGenericParamDecl ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5351:1: (lv_params_2_0= ruleGenericParamDecl )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5351:1: (lv_params_2_0= ruleGenericParamDecl )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5352:3: lv_params_2_0= ruleGenericParamDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructVariant11592);
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5368:2: (otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==46) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5368:4: otherlv_3= ',' ( (lv_params_4_0= ruleGenericParamDecl ) )
                    	    {
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleStructVariant11605); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getStructVariantAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5372:1: ( (lv_params_4_0= ruleGenericParamDecl ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5373:1: (lv_params_4_0= ruleGenericParamDecl )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5373:1: (lv_params_4_0= ruleGenericParamDecl )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5374:3: lv_params_4_0= ruleGenericParamDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructVariantAccess().getParamsGenericParamDeclParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGenericParamDecl_in_ruleStructVariant11626);
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
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleStructVariant11640); 

                        	newLeafNode(otherlv_5, grammarAccess.getStructVariantAccess().getGreaterThanSignKeyword_1_3());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleStructVariant11654); 

                	newLeafNode(otherlv_6, grammarAccess.getStructVariantAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5398:1: ( (lv_fields_7_0= ruleStructField ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5399:1: (lv_fields_7_0= ruleStructField )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5399:1: (lv_fields_7_0= ruleStructField )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5400:3: lv_fields_7_0= ruleStructField
            {
             
            	        newCompositeNode(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStructField_in_ruleStructVariant11675);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5416:2: (otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==46) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5416:4: otherlv_8= ',' ( (lv_fields_9_0= ruleStructField ) )
            	    {
            	    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleStructVariant11688); 

            	        	newLeafNode(otherlv_8, grammarAccess.getStructVariantAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5420:1: ( (lv_fields_9_0= ruleStructField ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5421:1: (lv_fields_9_0= ruleStructField )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5421:1: (lv_fields_9_0= ruleStructField )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5422:3: lv_fields_9_0= ruleStructField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructVariantAccess().getFieldsStructFieldParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructField_in_ruleStructVariant11709);
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
            	    break loop95;
                }
            } while (true);

            otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleStructVariant11723); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5450:1: entryRuleTupleVariant returns [EObject current=null] : iv_ruleTupleVariant= ruleTupleVariant EOF ;
    public final EObject entryRuleTupleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5451:2: (iv_ruleTupleVariant= ruleTupleVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5452:2: iv_ruleTupleVariant= ruleTupleVariant EOF
            {
             newCompositeNode(grammarAccess.getTupleVariantRule()); 
            pushFollow(FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant11759);
            iv_ruleTupleVariant=ruleTupleVariant();

            state._fsp--;

             current =iv_ruleTupleVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleVariant11769); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5459:1: ruleTupleVariant returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5462:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5463:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5463:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5463:2: ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= ')'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5463:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5464:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5464:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5465:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTupleVariant11811); 

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

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleTupleVariant11828); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleVariantAccess().getLeftParenthesisKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5485:1: ( (lv_types_2_0= ruleType ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5486:1: (lv_types_2_0= ruleType )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5486:1: (lv_types_2_0= ruleType )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5487:3: lv_types_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTupleVariant11849);
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5503:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==46) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5503:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleTupleVariant11862); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTupleVariantAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5507:1: ( (lv_types_4_0= ruleType ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5508:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5508:1: (lv_types_4_0= ruleType )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5509:3: lv_types_4_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTupleVariantAccess().getTypesTypeParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleTupleVariant11883);
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
            	    break loop96;
                }
            } while (true);

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleTupleVariant11897); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5537:1: entryRuleUnitVariant returns [EObject current=null] : iv_ruleUnitVariant= ruleUnitVariant EOF ;
    public final EObject entryRuleUnitVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitVariant = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5538:2: (iv_ruleUnitVariant= ruleUnitVariant EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5539:2: iv_ruleUnitVariant= ruleUnitVariant EOF
            {
             newCompositeNode(grammarAccess.getUnitVariantRule()); 
            pushFollow(FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant11933);
            iv_ruleUnitVariant=ruleUnitVariant();

            state._fsp--;

             current =iv_ruleUnitVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitVariant11943); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5546:1: ruleUnitVariant returns [EObject current=null] : ( (lv_ident_0_0= RULE_IDENT ) ) ;
    public final EObject ruleUnitVariant() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5549:28: ( ( (lv_ident_0_0= RULE_IDENT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5550:1: ( (lv_ident_0_0= RULE_IDENT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5550:1: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5551:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5551:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5552:3: lv_ident_0_0= RULE_IDENT
            {
            lv_ident_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleUnitVariant11984); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5576:1: entryRuleStringLit returns [EObject current=null] : iv_ruleStringLit= ruleStringLit EOF ;
    public final EObject entryRuleStringLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5577:2: (iv_ruleStringLit= ruleStringLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5578:2: iv_ruleStringLit= ruleStringLit EOF
            {
             newCompositeNode(grammarAccess.getStringLitRule()); 
            pushFollow(FOLLOW_ruleStringLit_in_entryRuleStringLit12024);
            iv_ruleStringLit=ruleStringLit();

            state._fsp--;

             current =iv_ruleStringLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLit12034); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5585:1: ruleStringLit returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_LIT ) ) ;
    public final EObject ruleStringLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5588:28: ( ( (lv_value_0_0= RULE_STRING_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5589:1: ( (lv_value_0_0= RULE_STRING_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5589:1: ( (lv_value_0_0= RULE_STRING_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5590:1: (lv_value_0_0= RULE_STRING_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5590:1: (lv_value_0_0= RULE_STRING_LIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5591:3: lv_value_0_0= RULE_STRING_LIT
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_RULE_STRING_LIT_in_ruleStringLit12075); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5615:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5616:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5617:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral12115);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral12125); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5624:1: ruleLiteral returns [EObject current=null] : (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLit_0 = null;

        EObject this_CharLit_1 = null;

        EObject this_StringLit_2 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5627:28: ( (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5628:1: (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5628:1: (this_NumberLit_0= ruleNumberLit | this_CharLit_1= ruleCharLit | this_StringLit_2= ruleStringLit )
            int alt97=3;
            switch ( input.LA(1) ) {
            case RULE_FLOAT_LIT:
            case RULE_INT_LIT:
                {
                alt97=1;
                }
                break;
            case RULE_CHAR_LIT:
                {
                alt97=2;
                }
                break;
            case RULE_STRING_LIT:
                {
                alt97=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5629:5: this_NumberLit_0= ruleNumberLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberLit_in_ruleLiteral12172);
                    this_NumberLit_0=ruleNumberLit();

                    state._fsp--;

                     
                            current = this_NumberLit_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5639:5: this_CharLit_1= ruleCharLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCharLit_in_ruleLiteral12199);
                    this_CharLit_1=ruleCharLit();

                    state._fsp--;

                     
                            current = this_CharLit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5649:5: this_StringLit_2= ruleStringLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLitParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringLit_in_ruleLiteral12226);
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5665:1: entryRuleNumberLit returns [EObject current=null] : iv_ruleNumberLit= ruleNumberLit EOF ;
    public final EObject entryRuleNumberLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5666:2: (iv_ruleNumberLit= ruleNumberLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5667:2: iv_ruleNumberLit= ruleNumberLit EOF
            {
             newCompositeNode(grammarAccess.getNumberLitRule()); 
            pushFollow(FOLLOW_ruleNumberLit_in_entryRuleNumberLit12261);
            iv_ruleNumberLit=ruleNumberLit();

            state._fsp--;

             current =iv_ruleNumberLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLit12271); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5674:1: ruleNumberLit returns [EObject current=null] : ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) ) ;
    public final EObject ruleNumberLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5677:28: ( ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5678:1: ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5678:1: ( ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5679:1: ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5679:1: ( (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5680:1: (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5680:1: (lv_value_0_1= RULE_FLOAT_LIT | lv_value_0_2= RULE_INT_LIT )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_FLOAT_LIT) ) {
                alt98=1;
            }
            else if ( (LA98_0==RULE_INT_LIT) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5681:3: lv_value_0_1= RULE_FLOAT_LIT
                    {
                    lv_value_0_1=(Token)match(input,RULE_FLOAT_LIT,FOLLOW_RULE_FLOAT_LIT_in_ruleNumberLit12314); 

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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5696:8: lv_value_0_2= RULE_INT_LIT
                    {
                    lv_value_0_2=(Token)match(input,RULE_INT_LIT,FOLLOW_RULE_INT_LIT_in_ruleNumberLit12334); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5722:1: entryRuleCharLit returns [EObject current=null] : iv_ruleCharLit= ruleCharLit EOF ;
    public final EObject entryRuleCharLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5723:2: (iv_ruleCharLit= ruleCharLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5724:2: iv_ruleCharLit= ruleCharLit EOF
            {
             newCompositeNode(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit12377);
            iv_ruleCharLit=ruleCharLit();

            state._fsp--;

             current =iv_ruleCharLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit12387); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5731:1: ruleCharLit returns [EObject current=null] : ( (lv_value_0_0= RULE_CHAR_LIT ) ) ;
    public final EObject ruleCharLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5734:28: ( ( (lv_value_0_0= RULE_CHAR_LIT ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5735:1: ( (lv_value_0_0= RULE_CHAR_LIT ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5735:1: ( (lv_value_0_0= RULE_CHAR_LIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5736:1: (lv_value_0_0= RULE_CHAR_LIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5736:1: (lv_value_0_0= RULE_CHAR_LIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5737:3: lv_value_0_0= RULE_CHAR_LIT
            {
            lv_value_0_0=(Token)match(input,RULE_CHAR_LIT,FOLLOW_RULE_CHAR_LIT_in_ruleCharLit12428); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5761:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5763:28: ( ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5764:1: ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5764:1: ( (enumLiteral_0= 'priv' ) | (enumLiteral_1= 'pub' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==80) ) {
                alt99=1;
            }
            else if ( (LA99_0==81) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5764:2: (enumLiteral_0= 'priv' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5764:2: (enumLiteral_0= 'priv' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5764:4: enumLiteral_0= 'priv'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_80_in_ruleVisibility12482); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5770:6: (enumLiteral_1= 'pub' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5770:6: (enumLiteral_1= 'pub' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:5770:8: enumLiteral_1= 'pub'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_81_in_ruleVisibility12499); 

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


    protected DFA67 dfa67 = new DFA67(this);
    static final String DFA67_eotS =
        "\16\uffff";
    static final String DFA67_eofS =
        "\10\uffff\3\13\3\uffff";
    static final String DFA67_minS =
        "\1\4\7\uffff\3\56\3\uffff";
    static final String DFA67_maxS =
        "\1\116\7\uffff\3\105\3\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\10\1\12\1\11";
    static final String DFA67_specialS =
        "\16\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\14\1\13\1\2\6\uffff\1\10\1\11\1\12\40\uffff\1\6\25\uffff"+
            "\1\7\3\uffff\1\3\1\4\1\5\1\uffff\1\1",
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3512:1: (this_PatWildcard_0= rulePatWildcard | this_PatIdent_1= rulePatIdent | this_PatBoxed_2= rulePatBoxed | this_PatOwned_3= rulePatOwned | this_PatBorrowed_4= rulePatBorrowed | this_PatTuple_5= rulePatTuple | this_PatVector_6= rulePatVector | this_PatLiteral_7= rulePatLiteral | this_PatRange_8= rulePatRange | this_PatEnum_9= rulePatEnum )";
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
    public static final BitSet FOLLOW_48_in_ruleFnItem1516 = new BitSet(new long[]{0x000300000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleFnItem1538 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFnItem1551 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleFnItem1572 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleFnItem1588 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_58_in_ruleFnItem1601 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
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
    public static final BitSet FOLLOW_50_in_ruleTypeItem1846 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
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
    public static final BitSet FOLLOW_53_in_ruleStructItem2080 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructItem2101 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructItem2114 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
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
    public static final BitSet FOLLOW_48_in_ruleEnumVariant2612 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleEnumVariant2633 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumVariant2646 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleEnumVariant2667 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleEnumVariant2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEnumVariant2701 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleEnumVariant2722 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumVariant2735 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
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
    public static final BitSet FOLLOW_53_in_ruleTraitItem2974 = new BitSet(new long[]{0x80C0000000000000L,0x0000000000030001L});
    public static final BitSet FOLLOW_ruleTraitMethod_in_ruleTraitItem2995 = new BitSet(new long[]{0x80C0000000000000L,0x0000000000030001L});
    public static final BitSet FOLLOW_54_in_ruleTraitItem3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraitMethod_in_entryRuleTraitMethod3044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraitMethod3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTraitMethod3098 = new BitSet(new long[]{0x0080000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_64_in_ruleTraitMethod3135 = new BitSet(new long[]{0x0080000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleTraitMethod3171 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTraitMethod3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTraitMethod3201 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_ruleTraitMethod3219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3240 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTraitMethod3253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleTraitMethod3274 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleTraitMethod3288 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTraitMethod3302 = new BitSet(new long[]{0x000300000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleTraitMethod3324 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTraitMethod3337 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleTraitMethod3358 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTraitMethod3374 = new BitSet(new long[]{0x0430000000000000L});
    public static final BitSet FOLLOW_58_in_ruleTraitMethod3387 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
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
    public static final BitSet FOLLOW_48_in_ruleImplMethod3911 = new BitSet(new long[]{0x000300000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleImplMethod3933 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleImplMethod3946 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleImplMethod3967 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleImplMethod3983 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_58_in_ruleImplMethod3996 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
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
    public static final BitSet FOLLOW_48_in_ruleForeignFn4318 = new BitSet(new long[]{0x000300000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleForeignFn4340 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleForeignFn4353 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_ruleArg_in_ruleForeignFn4374 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleForeignFn4390 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_58_in_ruleForeignFn4403 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleForeignFn4424 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleForeignFn4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticItem_in_entryRuleStaticItem4474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticItem4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleStaticItem4521 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_ruleStaticItem4538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStaticItem4560 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticItem4578 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleStaticItem4599 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleStaticItem4613 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleStaticItem4634 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleStaticItem4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr4682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRValue_in_ruleExpr4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRValue_in_entryRuleExprRValue4774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRValue4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_ruleExprRValue4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLeaf_in_entryRuleExprLeaf4864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLeaf4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLiteral_in_ruleExprLeaf4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprGroup_in_ruleExprLeaf4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_ruleExprLeaf4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprVec_in_ruleExprLeaf5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprUnary_in_ruleExprLeaf5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprLiteral_in_entryRuleExprLiteral5064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprLiteral5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleExprLiteral5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprPath_in_entryRuleExprPath5154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprPath5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleExprPath5210 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_ruleExprPath5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTuple_in_ruleExprPath5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprGroup_in_entryRuleExprGroup5319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprGroup5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprGroup5366 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5387 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5409 = new BitSet(new long[]{0x002300000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5431 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5444 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprGroup5465 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprGroup5480 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleExprGroup5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTuple_in_entryRuleExprTuple5534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTuple5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprTuple5581 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprTuple5602 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprTuple5615 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprTuple5636 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprTuple5651 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleExprTuple5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprStruct_in_entryRuleExprStruct5701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprStruct5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExprStruct5748 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleExprStruct5769 = new BitSet(new long[]{0x0040400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_46_in_ruleExprStruct5782 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleExprStruct5803 = new BitSet(new long[]{0x0040400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleExprStruct5818 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprStruct5839 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleExprStruct5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprVec_in_entryRuleExprVec5889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprVec5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleExprVec5936 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_ruleExprVec5953 = new BitSet(new long[]{0x002180000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec5980 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprVec5992 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_69_in_ruleExprVec6006 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6027 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6056 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExprVec6069 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprVec6090 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_ruleExprVec6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprUnary_in_entryRuleExprUnary6144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprUnary6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericNegation_in_ruleExprUnary6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDereference_in_ruleExprUnary6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNegation_in_ruleExprUnary6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManagedBox_in_ruleExprUnary6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedBox_in_ruleExprUnary6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_ruleExprUnary6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericNegation_in_entryRuleNumericNegation6371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericNegation6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleNumericNegation6418 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleNumericNegation6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDereference_in_entryRuleDereference6475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDereference6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDereference6522 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleDereference6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNegation_in_entryRuleLogicalNegation6579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNegation6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleLogicalNegation6626 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleLogicalNegation6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManagedBox_in_entryRuleManagedBox6683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleManagedBox6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleManagedBox6730 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleManagedBox6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedBox_in_entryRuleOwnedBox6787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedBox6797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOwnedBox6834 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleOwnedBox6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrow_in_entryRuleBorrow6891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrow6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBorrow6938 = new BitSet(new long[]{0x002100000000E020L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleBorrow6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock6995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBlock7051 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleBlock7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_entryRuleGenericParamDecl7099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericParamDecl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl7151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleGenericParamDecl7169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl7186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleGenericParamDecl7204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleGenericParamDecl7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_entryRuleArg7265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_ruleArg7321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleArg7333 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleArg7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePat_in_entryRulePat7390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePat7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_rulePat7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_rulePat7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_rulePat7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_rulePat7528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_rulePat7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_rulePat7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_rulePat7609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_rulePat7636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatRange_in_rulePat7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatEnum_in_rulePat7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatWildcard_in_entryRulePatWildcard7725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatWildcard7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePatWildcard7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatIdent_in_entryRulePatIdent7817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatIdent7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MUT_KEYWORD_in_rulePatIdent7869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePatIdent7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBoxed_in_entryRulePatBoxed7932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBoxed7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePatBoxed7979 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatBoxed8000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatOwned_in_entryRulePatOwned8036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatOwned8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePatOwned8083 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatOwned8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatBorrowed_in_entryRulePatBorrowed8140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatBorrowed8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePatBorrowed8187 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatBorrowed8208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatTuple_in_entryRulePatTuple8244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatTuple8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePatTuple8291 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatTuple8312 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatTuple8325 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatTuple8346 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_rulePatTuple8360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatVector_in_entryRulePatVector8396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatVector8406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePatVector8443 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatVector8464 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_rulePatVector8477 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatVector8498 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_rulePatVector8512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatLiteral_in_entryRulePatLiteral8548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatLiteral8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePatLiteral8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatRange_in_entryRulePatRange8638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatRange8648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatCharRange_in_rulePatRange8695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatNumberRange_in_rulePatRange8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatCharRange_in_entryRulePatCharRange8757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatCharRange8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_rulePatCharRange8813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rulePatCharRange8825 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCharLit_in_rulePatCharRange8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatNumberRange_in_entryRulePatNumberRange8882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatNumberRange8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rulePatNumberRange8938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rulePatNumberRange8950 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleNumberLit_in_rulePatNumberRange8971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatEnum_in_entryRulePatEnum9007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatEnum9017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rulePatEnum9063 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_rulePatEnum9086 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005D60L});
    public static final BitSet FOLLOW_72_in_rulePatEnum9099 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_69_in_rulePatEnum9117 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rulePat_in_rulePatEnum9145 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatEnum9158 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_rulePat_in_rulePatEnum9179 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_rulePatEnum9195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePatEnum9224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldPat_in_rulePatEnum9245 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_rulePatEnum9258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldPat_in_rulePatEnum9279 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_rulePatEnum9293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldPat_in_entryRuleFieldPat9331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldPat9341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFieldPat9383 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleFieldPat9401 = new BitSet(new long[]{0x000100000000E070L,0x0000000000005C40L});
    public static final BitSet FOLLOW_rulePat_in_ruleFieldPat9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath9460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePath9512 = new BitSet(new long[]{0x0100000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_rulePath9530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePath9547 = new BitSet(new long[]{0x0100000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_rulePath9567 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_rulePath9582 = new BitSet(new long[]{0x3001000000001F80L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_rulePath9600 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_rulePath9632 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_rulePath9646 = new BitSet(new long[]{0x3001000000001F80L,0x0000000000001C00L});
    public static final BitSet FOLLOW_RULE_LIFETIME_in_rulePath9664 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_ruleType_in_rulePath9696 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_rulePath9711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType9749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType9806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_ruleType9833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_ruleType9860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleType9887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_ruleType9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_ruleType9941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_ruleType9968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType10003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType10013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rulePrimitiveType10059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_in_rulePrimitiveType10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_TYPE_in_rulePrimitiveType10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MACHINE_TYPE_in_rulePrimitiveType10140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNIT_TYPE_in_rulePrimitiveType10167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_entryRuleTupleType10203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleType10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTupleType10250 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleType10271 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTupleType10284 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleType10305 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTupleType10319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_entryRuleStructType10355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructType10365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleStructType10402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructType10419 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleStructType10437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructType10458 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructType10471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructType10492 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleStructType10506 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleStructType10520 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructType10541 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructType10554 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructType10575 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleStructType10589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxedPointer_in_entryRuleBoxedPointer10625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxedPointer10635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBoxedPointer10672 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleBoxedPointer10693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOwnedPointer_in_entryRuleOwnedPointer10729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOwnedPointer10739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOwnedPointer10776 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleOwnedPointer10797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorrowedPointer_in_entryRuleBorrowedPointer10833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorrowedPointer10843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBorrowedPointer10880 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleBorrowedPointer10901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructField_in_entryRuleStructField10937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructField10947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleStructField10993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructField11011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStructField11028 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleStructField11049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType11085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType11095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEnumType11132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleEnumType11149 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleEnumType11167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleEnumType11188 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumType11201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleEnumType11222 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleEnumType11236 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleEnumType11250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariant_in_ruleEnumType11271 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumType11284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariant_in_ruleEnumType11305 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleEnumType11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant11355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariant11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_ruleVariant11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_ruleVariant11439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_ruleVariant11466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructVariant_in_entryRuleStructVariant11501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructVariant11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleStructVariant11553 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_ruleStructVariant11571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructVariant11592 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructVariant11605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGenericParamDecl_in_ruleStructVariant11626 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_ruleStructVariant11640 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleStructVariant11654 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructVariant11675 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStructVariant11688 = new BitSet(new long[]{0x0000000000000010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleStructField_in_ruleStructVariant11709 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_54_in_ruleStructVariant11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleVariant_in_entryRuleTupleVariant11759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleVariant11769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTupleVariant11811 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTupleVariant11828 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleVariant11849 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTupleVariant11862 = new BitSet(new long[]{0x3001000000001F00L,0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleVariant11883 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTupleVariant11897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitVariant_in_entryRuleUnitVariant11933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitVariant11943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleUnitVariant11984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_entryRuleStringLit12024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLit12034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LIT_in_ruleStringLit12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral12115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral12125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_ruleLiteral12172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_ruleLiteral12199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLit_in_ruleLiteral12226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_entryRuleNumberLit12261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLit12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LIT_in_ruleNumberLit12314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LIT_in_ruleNumberLit12334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit12377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_LIT_in_ruleCharLit12428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleVisibility12482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleVisibility12499 = new BitSet(new long[]{0x0000000000000002L});

}