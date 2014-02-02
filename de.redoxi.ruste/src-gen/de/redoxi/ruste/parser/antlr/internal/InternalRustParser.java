package de.redoxi.ruste.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_NON_SINGLE_QUOTE", "RULE_HEX_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "'#['", "','", "']'", "'('", "')'", "'='", "'mod'", "';'", "'{'", "'}'", "'\\''", "'\\\\'", "'n'", "'r'", "'t'", "'0'", "'x'", "'u'", "'U'"
    };
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_HEX_DIGIT=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__19=19;
    public static final int RULE_XID_START=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int RULE_IDENT=4;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_NON_SINGLE_QUOTE=5;
    public static final int T__10=10;
    public static final int RULE_XID_CONTINUE=8;

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:67:1: entryRuleCrate returns [EObject current=null] : iv_ruleCrate= ruleCrate EOF ;
    public final EObject entryRuleCrate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrate = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:68:2: (iv_ruleCrate= ruleCrate EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:69:2: iv_ruleCrate= ruleCrate EOF
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:76:1: ruleCrate returns [EObject current=null] : ( (lv_items_0_0= ruleItemAndAttrs ) )* ;
    public final EObject ruleCrate() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:79:28: ( ( (lv_items_0_0= ruleItemAndAttrs ) )* )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:80:1: ( (lv_items_0_0= ruleItemAndAttrs ) )*
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:80:1: ( (lv_items_0_0= ruleItemAndAttrs ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:81:1: (lv_items_0_0= ruleItemAndAttrs )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:81:1: (lv_items_0_0= ruleItemAndAttrs )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:82:3: lv_items_0_0= ruleItemAndAttrs
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:106:1: entryRuleItemAttr returns [EObject current=null] : iv_ruleItemAttr= ruleItemAttr EOF ;
    public final EObject entryRuleItemAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemAttr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:107:2: (iv_ruleItemAttr= ruleItemAttr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:108:2: iv_ruleItemAttr= ruleItemAttr EOF
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:115:1: ruleItemAttr returns [EObject current=null] : (otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleItemAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attrs_1_0 = null;

        EObject lv_attrs_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:118:28: ( (otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:119:1: (otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:119:1: (otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:119:3: otherlv_0= '#[' ( (lv_attrs_1_0= ruleAttr ) ) (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleItemAttr213); 

                	newLeafNode(otherlv_0, grammarAccess.getItemAttrAccess().getNumberSignLeftSquareBracketKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:123:1: ( (lv_attrs_1_0= ruleAttr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:124:1: (lv_attrs_1_0= ruleAttr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:124:1: (lv_attrs_1_0= ruleAttr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:125:3: lv_attrs_1_0= ruleAttr
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:141:2: (otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:141:4: otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) )
            	    {
            	    otherlv_2=(Token)match(input,10,FOLLOW_10_in_ruleItemAttr247); 

            	        	newLeafNode(otherlv_2, grammarAccess.getItemAttrAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:145:1: ( (lv_attrs_3_0= ruleAttr ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:146:1: (lv_attrs_3_0= ruleAttr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:146:1: (lv_attrs_3_0= ruleAttr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:147:3: lv_attrs_3_0= ruleAttr
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

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleItemAttr282); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:175:1: entryRuleAttr returns [EObject current=null] : iv_ruleAttr= ruleAttr EOF ;
    public final EObject entryRuleAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:176:2: (iv_ruleAttr= ruleAttr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:177:2: iv_ruleAttr= ruleAttr EOF
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:184:1: ruleAttr returns [EObject current=null] : (this_LiteralAttr_0= ruleLiteralAttr | this_AttrWithList_1= ruleAttrWithList ) ;
    public final EObject ruleAttr() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralAttr_0 = null;

        EObject this_AttrWithList_1 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:187:28: ( (this_LiteralAttr_0= ruleLiteralAttr | this_AttrWithList_1= ruleAttrWithList ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:188:1: (this_LiteralAttr_0= ruleLiteralAttr | this_AttrWithList_1= ruleAttrWithList )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:188:1: (this_LiteralAttr_0= ruleLiteralAttr | this_AttrWithList_1= ruleAttrWithList )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==12) ) {
                    alt3=2;
                }
                else if ( (LA3_1==14) ) {
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:189:5: this_LiteralAttr_0= ruleLiteralAttr
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:199:5: this_AttrWithList_1= ruleAttrWithList
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:215:1: entryRuleAttrWithList returns [EObject current=null] : iv_ruleAttrWithList= ruleAttrWithList EOF ;
    public final EObject entryRuleAttrWithList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrWithList = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:216:2: (iv_ruleAttrWithList= ruleAttrWithList EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:217:2: iv_ruleAttrWithList= ruleAttrWithList EOF
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:224:1: ruleAttrWithList returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:227:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:228:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:228:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:228:2: ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '(' ( (lv_attrs_2_0= ruleAttr ) ) (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )* otherlv_5= ')'
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:228:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:229:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:229:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:230:3: lv_ident_0_0= RULE_IDENT
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAttrWithList506); 

                	newLeafNode(otherlv_1, grammarAccess.getAttrWithListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:250:1: ( (lv_attrs_2_0= ruleAttr ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:251:1: (lv_attrs_2_0= ruleAttr )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:251:1: (lv_attrs_2_0= ruleAttr )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:252:3: lv_attrs_2_0= ruleAttr
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:268:2: (otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==10) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:268:4: otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) )
            	    {
            	    otherlv_3=(Token)match(input,10,FOLLOW_10_in_ruleAttrWithList540); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAttrWithListAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:272:1: ( (lv_attrs_4_0= ruleAttr ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:273:1: (lv_attrs_4_0= ruleAttr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:273:1: (lv_attrs_4_0= ruleAttr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:274:3: lv_attrs_4_0= ruleAttr
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAttrWithList575); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:302:1: entryRuleLiteralAttr returns [EObject current=null] : iv_ruleLiteralAttr= ruleLiteralAttr EOF ;
    public final EObject entryRuleLiteralAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralAttr = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:303:2: (iv_ruleLiteralAttr= ruleLiteralAttr EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:304:2: iv_ruleLiteralAttr= ruleLiteralAttr EOF
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:311:1: ruleLiteralAttr returns [EObject current=null] : ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleLiteralAttr() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:314:28: ( ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:315:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:315:1: ( ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:315:2: ( (lv_ident_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteral ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:315:2: ( (lv_ident_0_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:316:1: (lv_ident_0_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:316:1: (lv_ident_0_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:317:3: lv_ident_0_0= RULE_IDENT
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleLiteralAttr680); 

                	newLeafNode(otherlv_1, grammarAccess.getLiteralAttrAccess().getEqualsSignKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:337:1: ( (lv_value_2_0= ruleLiteral ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:338:1: (lv_value_2_0= ruleLiteral )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:338:1: (lv_value_2_0= ruleLiteral )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:339:3: lv_value_2_0= ruleLiteral
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:363:1: entryRuleItemAndAttrs returns [EObject current=null] : iv_ruleItemAndAttrs= ruleItemAndAttrs EOF ;
    public final EObject entryRuleItemAndAttrs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemAndAttrs = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:364:2: (iv_ruleItemAndAttrs= ruleItemAndAttrs EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:365:2: iv_ruleItemAndAttrs= ruleItemAndAttrs EOF
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:372:1: ruleItemAndAttrs returns [EObject current=null] : ( ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) ) ) ;
    public final EObject ruleItemAndAttrs() throws RecognitionException {
        EObject current = null;

        EObject lv_attrs_0_0 = null;

        EObject lv_item_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:375:28: ( ( ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:376:1: ( ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:376:1: ( ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:376:2: ( (lv_attrs_0_0= ruleItemAttr ) )* ( (lv_item_1_0= ruleItem ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:376:2: ( (lv_attrs_0_0= ruleItemAttr ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==9) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:377:1: (lv_attrs_0_0= ruleItemAttr )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:377:1: (lv_attrs_0_0= ruleItemAttr )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:378:3: lv_attrs_0_0= ruleItemAttr
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:394:3: ( (lv_item_1_0= ruleItem ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:395:1: (lv_item_1_0= ruleItem )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:395:1: (lv_item_1_0= ruleItem )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:396:3: lv_item_1_0= ruleItem
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:420:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:421:2: (iv_ruleItem= ruleItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:422:2: iv_ruleItem= ruleItem EOF
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:429:1: ruleItem returns [EObject current=null] : this_ModItem_0= ruleModItem ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_ModItem_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:432:28: (this_ModItem_0= ruleModItem )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:434:5: this_ModItem_0= ruleModItem
            {
             
                    newCompositeNode(grammarAccess.getItemAccess().getModItemParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleModItem_in_ruleItem907);
            this_ModItem_0=ruleModItem();

            state._fsp--;

             
                    current = this_ModItem_0; 
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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleModItem"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:450:1: entryRuleModItem returns [EObject current=null] : iv_ruleModItem= ruleModItem EOF ;
    public final EObject entryRuleModItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:451:2: (iv_ruleModItem= ruleModItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:452:2: iv_ruleModItem= ruleModItem EOF
            {
             newCompositeNode(grammarAccess.getModItemRule()); 
            pushFollow(FOLLOW_ruleModItem_in_entryRuleModItem941);
            iv_ruleModItem=ruleModItem();

            state._fsp--;

             current =iv_ruleModItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModItem951); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:459:1: ruleModItem returns [EObject current=null] : (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) ) ) ;
    public final EObject ruleModItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:462:28: ( (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:463:1: (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:463:1: (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:463:3: otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleModItem988); 

                	newLeafNode(otherlv_0, grammarAccess.getModItemAccess().getModKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:467:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:468:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:468:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:469:3: lv_ident_1_0= RULE_IDENT
            {
            lv_ident_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleModItem1005); 

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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:485:2: (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:485:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleModItem1023); 

                        	newLeafNode(otherlv_2, grammarAccess.getModItemAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:490:6: (otherlv_3= '{' otherlv_4= '}' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:490:6: (otherlv_3= '{' otherlv_4= '}' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:490:8: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleModItem1042); 

                        	newLeafNode(otherlv_3, grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleModItem1054); 

                        	newLeafNode(otherlv_4, grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_1());
                        

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


    // $ANTLR start "entryRuleLiteral"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:506:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:507:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:508:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1092);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1102); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:515:1: ruleLiteral returns [EObject current=null] : this_CharLit_0= ruleCharLit ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_CharLit_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:518:28: (this_CharLit_0= ruleCharLit )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:520:5: this_CharLit_0= ruleCharLit
            {
             
                    newCompositeNode(grammarAccess.getLiteralAccess().getCharLitParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCharLit_in_ruleLiteral1148);
            this_CharLit_0=ruleCharLit();

            state._fsp--;

             
                    current = this_CharLit_0; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleCharLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:536:1: entryRuleCharLit returns [EObject current=null] : iv_ruleCharLit= ruleCharLit EOF ;
    public final EObject entryRuleCharLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:537:2: (iv_ruleCharLit= ruleCharLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:538:2: iv_ruleCharLit= ruleCharLit EOF
            {
             newCompositeNode(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit1182);
            iv_ruleCharLit=ruleCharLit();

            state._fsp--;

             current =iv_ruleCharLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit1192); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:545:1: ruleCharLit returns [EObject current=null] : (otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\'' ) ;
    public final EObject ruleCharLit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_char_1_0=null;
        Token otherlv_2=null;
        Token lv_char_3_0=null;
        Token otherlv_5=null;
        EObject lv_escapedChar_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:548:28: ( (otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\'' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:549:1: (otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\'' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:549:1: (otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\'' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:549:3: otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\''
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCharLit1229); 

                	newLeafNode(otherlv_0, grammarAccess.getCharLitAccess().getApostropheKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:553:1: ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NON_SINGLE_QUOTE) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:553:2: ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:553:2: ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:554:1: (lv_char_1_0= RULE_NON_SINGLE_QUOTE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:554:1: (lv_char_1_0= RULE_NON_SINGLE_QUOTE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:555:3: lv_char_1_0= RULE_NON_SINGLE_QUOTE
                    {
                    lv_char_1_0=(Token)match(input,RULE_NON_SINGLE_QUOTE,FOLLOW_RULE_NON_SINGLE_QUOTE_in_ruleCharLit1247); 

                    			newLeafNode(lv_char_1_0, grammarAccess.getCharLitAccess().getCharNON_SINGLE_QUOTETerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharLitRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"char",
                            		lv_char_1_0, 
                            		"NON_SINGLE_QUOTE");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:572:6: (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:572:6: (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:572:8: otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCharLit1271); 

                        	newLeafNode(otherlv_2, grammarAccess.getCharLitAccess().getReverseSolidusKeyword_1_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:576:1: ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    else if ( ((LA7_0>=20 && LA7_0<=27)) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:576:2: ( (lv_char_3_0= '\\'' ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:576:2: ( (lv_char_3_0= '\\'' ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:577:1: (lv_char_3_0= '\\'' )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:577:1: (lv_char_3_0= '\\'' )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:578:3: lv_char_3_0= '\\''
                            {
                            lv_char_3_0=(Token)match(input,19,FOLLOW_19_in_ruleCharLit1290); 

                                    newLeafNode(lv_char_3_0, grammarAccess.getCharLitAccess().getCharApostropheKeyword_1_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCharLitRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_3_0, "\'");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:592:6: ( (lv_escapedChar_4_0= ruleEscapedChar ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:592:6: ( (lv_escapedChar_4_0= ruleEscapedChar ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:593:1: (lv_escapedChar_4_0= ruleEscapedChar )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:593:1: (lv_escapedChar_4_0= ruleEscapedChar )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:594:3: lv_escapedChar_4_0= ruleEscapedChar
                            {
                             
                            	        newCompositeNode(grammarAccess.getCharLitAccess().getEscapedCharEscapedCharParserRuleCall_1_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleEscapedChar_in_ruleCharLit1330);
                            lv_escapedChar_4_0=ruleEscapedChar();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCharLitRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"escapedChar",
                                    		lv_escapedChar_4_0, 
                                    		"EscapedChar");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCharLit1345); 

                	newLeafNode(otherlv_5, grammarAccess.getCharLitAccess().getApostropheKeyword_2());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleEscapedChar"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:622:1: entryRuleEscapedChar returns [EObject current=null] : iv_ruleEscapedChar= ruleEscapedChar EOF ;
    public final EObject entryRuleEscapedChar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscapedChar = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:623:2: (iv_ruleEscapedChar= ruleEscapedChar EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:624:2: iv_ruleEscapedChar= ruleEscapedChar EOF
            {
             newCompositeNode(grammarAccess.getEscapedCharRule()); 
            pushFollow(FOLLOW_ruleEscapedChar_in_entryRuleEscapedChar1381);
            iv_ruleEscapedChar=ruleEscapedChar();

            state._fsp--;

             current =iv_ruleEscapedChar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedChar1391); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscapedChar"


    // $ANTLR start "ruleEscapedChar"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:631:1: ruleEscapedChar returns [EObject current=null] : ( ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) ) | ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) ) ) ;
    public final EObject ruleEscapedChar() throws RecognitionException {
        EObject current = null;

        Token lv_char_1_1=null;
        Token lv_char_1_2=null;
        Token lv_char_1_3=null;
        Token lv_char_1_4=null;
        Token lv_char_1_5=null;
        Token otherlv_3=null;
        Token lv_digits_4_0=null;
        Token lv_digits_5_0=null;
        Token otherlv_7=null;
        Token lv_digits_8_0=null;
        Token lv_digits_9_0=null;
        Token lv_digits_10_0=null;
        Token lv_digits_11_0=null;
        Token otherlv_13=null;
        Token lv_digits_14_0=null;
        Token lv_digits_15_0=null;
        Token lv_digits_16_0=null;
        Token lv_digits_17_0=null;
        Token lv_digits_18_0=null;
        Token lv_digits_19_0=null;
        Token lv_digits_20_0=null;
        Token lv_digits_21_0=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:634:28: ( ( ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) ) | ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:635:1: ( ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) ) | ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:635:1: ( ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) ) | ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:635:2: ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:635:2: ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:635:3: () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:635:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:636:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEscapedCharAccess().getEscapedCharAction_0_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:641:2: ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:642:1: ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:642:1: ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:643:1: (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:643:1: (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' )
                    int alt9=5;
                    switch ( input.LA(1) ) {
                    case 20:
                        {
                        alt9=1;
                        }
                        break;
                    case 21:
                        {
                        alt9=2;
                        }
                        break;
                    case 22:
                        {
                        alt9=3;
                        }
                        break;
                    case 23:
                        {
                        alt9=4;
                        }
                        break;
                    case 24:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:644:3: lv_char_1_1= '\\\\'
                            {
                            lv_char_1_1=(Token)match(input,20,FOLLOW_20_in_ruleEscapedChar1446); 

                                    newLeafNode(lv_char_1_1, grammarAccess.getEscapedCharAccess().getCharReverseSolidusKeyword_0_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEscapedCharRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:656:8: lv_char_1_2= 'n'
                            {
                            lv_char_1_2=(Token)match(input,21,FOLLOW_21_in_ruleEscapedChar1475); 

                                    newLeafNode(lv_char_1_2, grammarAccess.getEscapedCharAccess().getCharNKeyword_0_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEscapedCharRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_1_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:668:8: lv_char_1_3= 'r'
                            {
                            lv_char_1_3=(Token)match(input,22,FOLLOW_22_in_ruleEscapedChar1504); 

                                    newLeafNode(lv_char_1_3, grammarAccess.getEscapedCharAccess().getCharRKeyword_0_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEscapedCharRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_1_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:680:8: lv_char_1_4= 't'
                            {
                            lv_char_1_4=(Token)match(input,23,FOLLOW_23_in_ruleEscapedChar1533); 

                                    newLeafNode(lv_char_1_4, grammarAccess.getEscapedCharAccess().getCharTKeyword_0_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEscapedCharRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_1_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:692:8: lv_char_1_5= '0'
                            {
                            lv_char_1_5=(Token)match(input,24,FOLLOW_24_in_ruleEscapedChar1562); 

                                    newLeafNode(lv_char_1_5, grammarAccess.getEscapedCharAccess().getChar0Keyword_0_1_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEscapedCharRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_1_5, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:708:6: ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:708:6: ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:708:7: () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:708:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:709:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEscapedCharAccess().getUnicodeCharAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleEscapedChar1607); 

                        	newLeafNode(otherlv_3, grammarAccess.getEscapedCharAccess().getXKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:718:1: ( (lv_digits_4_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:719:1: (lv_digits_4_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:719:1: (lv_digits_4_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:720:3: lv_digits_4_0= RULE_HEX_DIGIT
                    {
                    lv_digits_4_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1624); 

                    			newLeafNode(lv_digits_4_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_4_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:736:2: ( (lv_digits_5_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:737:1: (lv_digits_5_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:737:1: (lv_digits_5_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:738:3: lv_digits_5_0= RULE_HEX_DIGIT
                    {
                    lv_digits_5_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1646); 

                    			newLeafNode(lv_digits_5_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_5_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:755:6: ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:755:6: ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:755:7: () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:755:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:756:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEscapedCharAccess().getUnicodeCharAction_2_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleEscapedChar1680); 

                        	newLeafNode(otherlv_7, grammarAccess.getEscapedCharAccess().getUKeyword_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:765:1: ( (lv_digits_8_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:766:1: (lv_digits_8_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:766:1: (lv_digits_8_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:767:3: lv_digits_8_0= RULE_HEX_DIGIT
                    {
                    lv_digits_8_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1697); 

                    			newLeafNode(lv_digits_8_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_8_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:783:2: ( (lv_digits_9_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:784:1: (lv_digits_9_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:784:1: (lv_digits_9_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:785:3: lv_digits_9_0= RULE_HEX_DIGIT
                    {
                    lv_digits_9_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1719); 

                    			newLeafNode(lv_digits_9_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_9_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:801:2: ( (lv_digits_10_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:802:1: (lv_digits_10_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:802:1: (lv_digits_10_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:803:3: lv_digits_10_0= RULE_HEX_DIGIT
                    {
                    lv_digits_10_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1741); 

                    			newLeafNode(lv_digits_10_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_10_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:819:2: ( (lv_digits_11_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:820:1: (lv_digits_11_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:820:1: (lv_digits_11_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:821:3: lv_digits_11_0= RULE_HEX_DIGIT
                    {
                    lv_digits_11_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1763); 

                    			newLeafNode(lv_digits_11_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_2_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_11_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:838:6: ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:838:6: ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:838:7: () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:838:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:839:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEscapedCharAccess().getUnicodeCharAction_3_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleEscapedChar1797); 

                        	newLeafNode(otherlv_13, grammarAccess.getEscapedCharAccess().getUKeyword_3_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:848:1: ( (lv_digits_14_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:849:1: (lv_digits_14_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:849:1: (lv_digits_14_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:850:3: lv_digits_14_0= RULE_HEX_DIGIT
                    {
                    lv_digits_14_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1814); 

                    			newLeafNode(lv_digits_14_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_14_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:866:2: ( (lv_digits_15_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:867:1: (lv_digits_15_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:867:1: (lv_digits_15_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:868:3: lv_digits_15_0= RULE_HEX_DIGIT
                    {
                    lv_digits_15_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1836); 

                    			newLeafNode(lv_digits_15_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_15_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:884:2: ( (lv_digits_16_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:885:1: (lv_digits_16_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:885:1: (lv_digits_16_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:886:3: lv_digits_16_0= RULE_HEX_DIGIT
                    {
                    lv_digits_16_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1858); 

                    			newLeafNode(lv_digits_16_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_16_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:902:2: ( (lv_digits_17_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:903:1: (lv_digits_17_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:903:1: (lv_digits_17_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:904:3: lv_digits_17_0= RULE_HEX_DIGIT
                    {
                    lv_digits_17_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1880); 

                    			newLeafNode(lv_digits_17_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_17_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:920:2: ( (lv_digits_18_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:921:1: (lv_digits_18_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:921:1: (lv_digits_18_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:922:3: lv_digits_18_0= RULE_HEX_DIGIT
                    {
                    lv_digits_18_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1902); 

                    			newLeafNode(lv_digits_18_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_18_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:938:2: ( (lv_digits_19_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:939:1: (lv_digits_19_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:939:1: (lv_digits_19_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:940:3: lv_digits_19_0= RULE_HEX_DIGIT
                    {
                    lv_digits_19_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1924); 

                    			newLeafNode(lv_digits_19_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_19_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:956:2: ( (lv_digits_20_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:957:1: (lv_digits_20_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:957:1: (lv_digits_20_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:958:3: lv_digits_20_0= RULE_HEX_DIGIT
                    {
                    lv_digits_20_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1946); 

                    			newLeafNode(lv_digits_20_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_20_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:974:2: ( (lv_digits_21_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:975:1: (lv_digits_21_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:975:1: (lv_digits_21_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:976:3: lv_digits_21_0= RULE_HEX_DIGIT
                    {
                    lv_digits_21_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1968); 

                    			newLeafNode(lv_digits_21_0, grammarAccess.getEscapedCharAccess().getDigitsHEX_DIGITTerminalRuleCall_3_9_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEscapedCharRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"digits",
                            		lv_digits_21_0, 
                            		"HEX_DIGIT");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleEscapedChar"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCrate_in_entryRuleCrate75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrate85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_ruleCrate130 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_ruleItemAttr_in_entryRuleItemAttr166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemAttr176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleItemAttr213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleItemAttr234 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleItemAttr247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleItemAttr268 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_11_in_ruleItemAttr282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_entryRuleAttr318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttr328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_ruleAttr375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_ruleAttr402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_entryRuleAttrWithList437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrWithList447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAttrWithList489 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttrWithList506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleAttrWithList527 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_10_in_ruleAttrWithList540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleAttrWithList561 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_13_in_ruleAttrWithList575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_entryRuleLiteralAttr611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAttr621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleLiteralAttr663 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLiteralAttr680 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralAttr701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_entryRuleItemAndAttrs737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemAndAttrs747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_ruleItemAndAttrs793 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_ruleItem_in_ruleItemAndAttrs815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_ruleItem907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_entryRuleModItem941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModItem951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModItem988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleModItem1005 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleModItem1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModItem1042 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModItem1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_ruleLiteral1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCharLit1229 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_RULE_NON_SINGLE_QUOTE_in_ruleCharLit1247 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20_in_ruleCharLit1271 = new BitSet(new long[]{0x000000000FF80000L});
    public static final BitSet FOLLOW_19_in_ruleCharLit1290 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleEscapedChar_in_ruleCharLit1330 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCharLit1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedChar_in_entryRuleEscapedChar1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedChar1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEscapedChar1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEscapedChar1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEscapedChar1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEscapedChar1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEscapedChar1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEscapedChar1607 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1624 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEscapedChar1680 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1697 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1719 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1741 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEscapedChar1797 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1814 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1836 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1858 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1880 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1902 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1924 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1946 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1968 = new BitSet(new long[]{0x0000000000000002L});

}