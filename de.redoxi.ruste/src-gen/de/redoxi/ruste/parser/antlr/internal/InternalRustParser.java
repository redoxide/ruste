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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_NON_SINGLE_QUOTE", "RULE_HEX_DIGIT", "RULE_DEC_DIGIT", "RULE_OCT_DIGIT", "RULE_XID_START", "RULE_XID_CONTINUE", "'#['", "','", "']'", "'('", "')'", "'='", "'mod'", "';'", "'{'", "'}'", "'\\''", "'\\\\'", "'n'", "'r'", "'t'", "'0'", "'x'", "'u'", "'U'", "'_'", "'.'", "'E'", "'e'", "'+'", "'-'", "'f'", "'i'", "'0b'", "'1'", "'0o'", "'0x'", "'32'", "'64'", "'8'", "'16'"
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

                if ( (LA1_0==11||LA1_0==17) ) {
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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleItemAttr213); 

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

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:142:4: otherlv_2= ',' ( (lv_attrs_3_0= ruleAttr ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleItemAttr247); 

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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleItemAttr282); 

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

                if ( (LA3_1==14) ) {
                    alt3=2;
                }
                else if ( (LA3_1==16) ) {
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleAttrWithList506); 

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

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:269:4: otherlv_3= ',' ( (lv_attrs_4_0= ruleAttr ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAttrWithList540); 

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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleAttrWithList575); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleLiteralAttr680); 

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

                if ( (LA5_0==11) ) {
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:430:1: ruleItem returns [EObject current=null] : this_ModItem_0= ruleModItem ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_ModItem_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:433:28: (this_ModItem_0= ruleModItem )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:435:5: this_ModItem_0= ruleModItem
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:451:1: entryRuleModItem returns [EObject current=null] : iv_ruleModItem= ruleModItem EOF ;
    public final EObject entryRuleModItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModItem = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:452:2: (iv_ruleModItem= ruleModItem EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:453:2: iv_ruleModItem= ruleModItem EOF
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:460:1: ruleModItem returns [EObject current=null] : (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) ) ) ;
    public final EObject ruleModItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:463:28: ( (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:464:1: (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:464:1: (otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:464:3: otherlv_0= 'mod' ( (lv_ident_1_0= RULE_IDENT ) ) (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleModItem988); 

                	newLeafNode(otherlv_0, grammarAccess.getModItemAccess().getModKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:468:1: ( (lv_ident_1_0= RULE_IDENT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:469:1: (lv_ident_1_0= RULE_IDENT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:469:1: (lv_ident_1_0= RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:470:3: lv_ident_1_0= RULE_IDENT
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:486:2: (otherlv_2= ';' | (otherlv_3= '{' otherlv_4= '}' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:486:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleModItem1023); 

                        	newLeafNode(otherlv_2, grammarAccess.getModItemAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:491:6: (otherlv_3= '{' otherlv_4= '}' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:491:6: (otherlv_3= '{' otherlv_4= '}' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:491:8: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleModItem1042); 

                        	newLeafNode(otherlv_3, grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleModItem1054); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:507:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:508:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:509:2: iv_ruleLiteral= ruleLiteral EOF
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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:516:1: ruleLiteral returns [EObject current=null] : (this_CharLit_0= ruleCharLit | this_NumberLit_1= ruleNumberLit ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_CharLit_0 = null;

        EObject this_NumberLit_1 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:519:28: ( (this_CharLit_0= ruleCharLit | this_NumberLit_1= ruleNumberLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:520:1: (this_CharLit_0= ruleCharLit | this_NumberLit_1= ruleNumberLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:520:1: (this_CharLit_0= ruleCharLit | this_NumberLit_1= ruleNumberLit )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_DEC_DIGIT||LA7_0==38||(LA7_0>=40 && LA7_0<=41)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:521:5: this_CharLit_0= ruleCharLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getCharLitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCharLit_in_ruleLiteral1149);
                    this_CharLit_0=ruleCharLit();

                    state._fsp--;

                     
                            current = this_CharLit_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:531:5: this_NumberLit_1= ruleNumberLit
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumberLit_in_ruleLiteral1176);
                    this_NumberLit_1=ruleNumberLit();

                    state._fsp--;

                     
                            current = this_NumberLit_1; 
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


    // $ANTLR start "entryRuleCharLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:547:1: entryRuleCharLit returns [EObject current=null] : iv_ruleCharLit= ruleCharLit EOF ;
    public final EObject entryRuleCharLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:548:2: (iv_ruleCharLit= ruleCharLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:549:2: iv_ruleCharLit= ruleCharLit EOF
            {
             newCompositeNode(grammarAccess.getCharLitRule()); 
            pushFollow(FOLLOW_ruleCharLit_in_entryRuleCharLit1211);
            iv_ruleCharLit=ruleCharLit();

            state._fsp--;

             current =iv_ruleCharLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLit1221); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:556:1: ruleCharLit returns [EObject current=null] : (otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\'' ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:559:28: ( (otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\'' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:560:1: (otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\'' )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:560:1: (otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\'' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:560:3: otherlv_0= '\\'' ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) ) otherlv_5= '\\''
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleCharLit1258); 

                	newLeafNode(otherlv_0, grammarAccess.getCharLitAccess().getApostropheKeyword_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:564:1: ( ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) ) | (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NON_SINGLE_QUOTE) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:564:2: ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:564:2: ( (lv_char_1_0= RULE_NON_SINGLE_QUOTE ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:565:1: (lv_char_1_0= RULE_NON_SINGLE_QUOTE )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:565:1: (lv_char_1_0= RULE_NON_SINGLE_QUOTE )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:566:3: lv_char_1_0= RULE_NON_SINGLE_QUOTE
                    {
                    lv_char_1_0=(Token)match(input,RULE_NON_SINGLE_QUOTE,FOLLOW_RULE_NON_SINGLE_QUOTE_in_ruleCharLit1276); 

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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:583:6: (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:583:6: (otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:583:8: otherlv_2= '\\\\' ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleCharLit1300); 

                        	newLeafNode(otherlv_2, grammarAccess.getCharLitAccess().getReverseSolidusKeyword_1_1_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:587:1: ( ( (lv_char_3_0= '\\'' ) ) | ( (lv_escapedChar_4_0= ruleEscapedChar ) ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        alt8=1;
                    }
                    else if ( ((LA8_0>=22 && LA8_0<=29)) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:587:2: ( (lv_char_3_0= '\\'' ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:587:2: ( (lv_char_3_0= '\\'' ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:588:1: (lv_char_3_0= '\\'' )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:588:1: (lv_char_3_0= '\\'' )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:589:3: lv_char_3_0= '\\''
                            {
                            lv_char_3_0=(Token)match(input,21,FOLLOW_21_in_ruleCharLit1319); 

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
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:603:6: ( (lv_escapedChar_4_0= ruleEscapedChar ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:603:6: ( (lv_escapedChar_4_0= ruleEscapedChar ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:604:1: (lv_escapedChar_4_0= ruleEscapedChar )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:604:1: (lv_escapedChar_4_0= ruleEscapedChar )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:605:3: lv_escapedChar_4_0= ruleEscapedChar
                            {
                             
                            	        newCompositeNode(grammarAccess.getCharLitAccess().getEscapedCharEscapedCharParserRuleCall_1_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleEscapedChar_in_ruleCharLit1359);
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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleCharLit1374); 

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:633:1: entryRuleEscapedChar returns [EObject current=null] : iv_ruleEscapedChar= ruleEscapedChar EOF ;
    public final EObject entryRuleEscapedChar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscapedChar = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:634:2: (iv_ruleEscapedChar= ruleEscapedChar EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:635:2: iv_ruleEscapedChar= ruleEscapedChar EOF
            {
             newCompositeNode(grammarAccess.getEscapedCharRule()); 
            pushFollow(FOLLOW_ruleEscapedChar_in_entryRuleEscapedChar1410);
            iv_ruleEscapedChar=ruleEscapedChar();

            state._fsp--;

             current =iv_ruleEscapedChar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedChar1420); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:642:1: ruleEscapedChar returns [EObject current=null] : ( ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) ) | ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) ) ) ;
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:645:28: ( ( ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) ) | ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:646:1: ( ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) ) | ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:646:1: ( ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) ) | ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) ) | ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:646:2: ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:646:2: ( () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:646:3: () ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:646:3: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:647:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEscapedCharAccess().getEscapedCharAction_0_0(),
                                current);
                        

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:652:2: ( ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:653:1: ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:653:1: ( (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:654:1: (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:654:1: (lv_char_1_1= '\\\\' | lv_char_1_2= 'n' | lv_char_1_3= 'r' | lv_char_1_4= 't' | lv_char_1_5= '0' )
                    int alt10=5;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt10=1;
                        }
                        break;
                    case 23:
                        {
                        alt10=2;
                        }
                        break;
                    case 24:
                        {
                        alt10=3;
                        }
                        break;
                    case 25:
                        {
                        alt10=4;
                        }
                        break;
                    case 26:
                        {
                        alt10=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:655:3: lv_char_1_1= '\\\\'
                            {
                            lv_char_1_1=(Token)match(input,22,FOLLOW_22_in_ruleEscapedChar1475); 

                                    newLeafNode(lv_char_1_1, grammarAccess.getEscapedCharAccess().getCharReverseSolidusKeyword_0_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEscapedCharRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:667:8: lv_char_1_2= 'n'
                            {
                            lv_char_1_2=(Token)match(input,23,FOLLOW_23_in_ruleEscapedChar1504); 

                                    newLeafNode(lv_char_1_2, grammarAccess.getEscapedCharAccess().getCharNKeyword_0_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEscapedCharRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_1_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:679:8: lv_char_1_3= 'r'
                            {
                            lv_char_1_3=(Token)match(input,24,FOLLOW_24_in_ruleEscapedChar1533); 

                                    newLeafNode(lv_char_1_3, grammarAccess.getEscapedCharAccess().getCharRKeyword_0_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEscapedCharRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_1_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:691:8: lv_char_1_4= 't'
                            {
                            lv_char_1_4=(Token)match(input,25,FOLLOW_25_in_ruleEscapedChar1562); 

                                    newLeafNode(lv_char_1_4, grammarAccess.getEscapedCharAccess().getCharTKeyword_0_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEscapedCharRule());
                            	        }
                                   		setWithLastConsumed(current, "char", lv_char_1_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:703:8: lv_char_1_5= '0'
                            {
                            lv_char_1_5=(Token)match(input,26,FOLLOW_26_in_ruleEscapedChar1591); 

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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:719:6: ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:719:6: ( () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:719:7: () otherlv_3= 'x' ( (lv_digits_4_0= RULE_HEX_DIGIT ) ) ( (lv_digits_5_0= RULE_HEX_DIGIT ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:719:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:720:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEscapedCharAccess().getUnicodeCharAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleEscapedChar1636); 

                        	newLeafNode(otherlv_3, grammarAccess.getEscapedCharAccess().getXKeyword_1_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:729:1: ( (lv_digits_4_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:730:1: (lv_digits_4_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:730:1: (lv_digits_4_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:731:3: lv_digits_4_0= RULE_HEX_DIGIT
                    {
                    lv_digits_4_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1653); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:747:2: ( (lv_digits_5_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:748:1: (lv_digits_5_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:748:1: (lv_digits_5_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:749:3: lv_digits_5_0= RULE_HEX_DIGIT
                    {
                    lv_digits_5_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1675); 

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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:766:6: ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:766:6: ( () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:766:7: () otherlv_7= 'u' ( (lv_digits_8_0= RULE_HEX_DIGIT ) ) ( (lv_digits_9_0= RULE_HEX_DIGIT ) ) ( (lv_digits_10_0= RULE_HEX_DIGIT ) ) ( (lv_digits_11_0= RULE_HEX_DIGIT ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:766:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:767:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEscapedCharAccess().getUnicodeCharAction_2_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleEscapedChar1709); 

                        	newLeafNode(otherlv_7, grammarAccess.getEscapedCharAccess().getUKeyword_2_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:776:1: ( (lv_digits_8_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:777:1: (lv_digits_8_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:777:1: (lv_digits_8_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:778:3: lv_digits_8_0= RULE_HEX_DIGIT
                    {
                    lv_digits_8_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1726); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:794:2: ( (lv_digits_9_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:795:1: (lv_digits_9_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:795:1: (lv_digits_9_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:796:3: lv_digits_9_0= RULE_HEX_DIGIT
                    {
                    lv_digits_9_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1748); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:812:2: ( (lv_digits_10_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:813:1: (lv_digits_10_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:813:1: (lv_digits_10_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:814:3: lv_digits_10_0= RULE_HEX_DIGIT
                    {
                    lv_digits_10_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1770); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:830:2: ( (lv_digits_11_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:831:1: (lv_digits_11_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:831:1: (lv_digits_11_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:832:3: lv_digits_11_0= RULE_HEX_DIGIT
                    {
                    lv_digits_11_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1792); 

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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:849:6: ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:849:6: ( () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:849:7: () otherlv_13= 'U' ( (lv_digits_14_0= RULE_HEX_DIGIT ) ) ( (lv_digits_15_0= RULE_HEX_DIGIT ) ) ( (lv_digits_16_0= RULE_HEX_DIGIT ) ) ( (lv_digits_17_0= RULE_HEX_DIGIT ) ) ( (lv_digits_18_0= RULE_HEX_DIGIT ) ) ( (lv_digits_19_0= RULE_HEX_DIGIT ) ) ( (lv_digits_20_0= RULE_HEX_DIGIT ) ) ( (lv_digits_21_0= RULE_HEX_DIGIT ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:849:7: ()
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:850:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getEscapedCharAccess().getUnicodeCharAction_3_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleEscapedChar1826); 

                        	newLeafNode(otherlv_13, grammarAccess.getEscapedCharAccess().getUKeyword_3_1());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:859:1: ( (lv_digits_14_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:860:1: (lv_digits_14_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:860:1: (lv_digits_14_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:861:3: lv_digits_14_0= RULE_HEX_DIGIT
                    {
                    lv_digits_14_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1843); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:877:2: ( (lv_digits_15_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:878:1: (lv_digits_15_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:878:1: (lv_digits_15_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:879:3: lv_digits_15_0= RULE_HEX_DIGIT
                    {
                    lv_digits_15_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1865); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:895:2: ( (lv_digits_16_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:896:1: (lv_digits_16_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:896:1: (lv_digits_16_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:897:3: lv_digits_16_0= RULE_HEX_DIGIT
                    {
                    lv_digits_16_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1887); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:913:2: ( (lv_digits_17_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:914:1: (lv_digits_17_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:914:1: (lv_digits_17_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:915:3: lv_digits_17_0= RULE_HEX_DIGIT
                    {
                    lv_digits_17_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1909); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:931:2: ( (lv_digits_18_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:932:1: (lv_digits_18_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:932:1: (lv_digits_18_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:933:3: lv_digits_18_0= RULE_HEX_DIGIT
                    {
                    lv_digits_18_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1931); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:949:2: ( (lv_digits_19_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:950:1: (lv_digits_19_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:950:1: (lv_digits_19_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:951:3: lv_digits_19_0= RULE_HEX_DIGIT
                    {
                    lv_digits_19_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1953); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:967:2: ( (lv_digits_20_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:968:1: (lv_digits_20_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:968:1: (lv_digits_20_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:969:3: lv_digits_20_0= RULE_HEX_DIGIT
                    {
                    lv_digits_20_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1975); 

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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:985:2: ( (lv_digits_21_0= RULE_HEX_DIGIT ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:986:1: (lv_digits_21_0= RULE_HEX_DIGIT )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:986:1: (lv_digits_21_0= RULE_HEX_DIGIT )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:987:3: lv_digits_21_0= RULE_HEX_DIGIT
                    {
                    lv_digits_21_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1997); 

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


    // $ANTLR start "entryRuleNumberLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1011:1: entryRuleNumberLit returns [EObject current=null] : iv_ruleNumberLit= ruleNumberLit EOF ;
    public final EObject entryRuleNumberLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1012:2: (iv_ruleNumberLit= ruleNumberLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1013:2: iv_ruleNumberLit= ruleNumberLit EOF
            {
             newCompositeNode(grammarAccess.getNumberLitRule()); 
            pushFollow(FOLLOW_ruleNumberLit_in_entryRuleNumberLit2039);
            iv_ruleNumberLit=ruleNumberLit();

            state._fsp--;

             current =iv_ruleNumberLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLit2049); 

            }

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
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1020:1: ruleNumberLit returns [EObject current=null] : (this_FloatLit_0= ruleFloatLit | this_IntLit_1= ruleIntLit ) ;
    public final EObject ruleNumberLit() throws RecognitionException {
        EObject current = null;

        EObject this_FloatLit_0 = null;

        EObject this_IntLit_1 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1023:28: ( (this_FloatLit_0= ruleFloatLit | this_IntLit_1= ruleIntLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1024:1: (this_FloatLit_0= ruleFloatLit | this_IntLit_1= ruleIntLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1024:1: (this_FloatLit_0= ruleFloatLit | this_IntLit_1= ruleIntLit )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1025:5: this_FloatLit_0= ruleFloatLit
                    {
                     
                            newCompositeNode(grammarAccess.getNumberLitAccess().getFloatLitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFloatLit_in_ruleNumberLit2096);
                    this_FloatLit_0=ruleFloatLit();

                    state._fsp--;

                     
                            current = this_FloatLit_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1035:5: this_IntLit_1= ruleIntLit
                    {
                     
                            newCompositeNode(grammarAccess.getNumberLitAccess().getIntLitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntLit_in_ruleNumberLit2123);
                    this_IntLit_1=ruleIntLit();

                    state._fsp--;

                     
                            current = this_IntLit_1; 
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
    // $ANTLR end "ruleNumberLit"


    // $ANTLR start "entryRuleFloatLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1051:1: entryRuleFloatLit returns [EObject current=null] : iv_ruleFloatLit= ruleFloatLit EOF ;
    public final EObject entryRuleFloatLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1052:2: (iv_ruleFloatLit= ruleFloatLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1053:2: iv_ruleFloatLit= ruleFloatLit EOF
            {
             newCompositeNode(grammarAccess.getFloatLitRule()); 
            pushFollow(FOLLOW_ruleFloatLit_in_entryRuleFloatLit2158);
            iv_ruleFloatLit=ruleFloatLit();

            state._fsp--;

             current =iv_ruleFloatLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLit2168); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatLit"


    // $ANTLR start "ruleFloatLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1060:1: ruleFloatLit returns [EObject current=null] : ( ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* (otherlv_3= '.' ( ( (lv_digits_4_0= RULE_DEC_DIGIT ) ) | otherlv_5= '_' )+ ) ( (otherlv_6= 'E' | otherlv_7= 'e' ) (otherlv_8= '+' | ( (lv_negativeExp_9_0= '-' ) ) )? ( ( (lv_digits_10_0= RULE_DEC_DIGIT ) ) | otherlv_11= '_' )+ )? (otherlv_12= 'f' ( (lv_size_13_0= ruleFloatSize ) ) )? ) ;
    public final EObject ruleFloatLit() throws RecognitionException {
        EObject current = null;

        Token lv_digits_0_0=null;
        Token lv_digits_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_digits_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_negativeExp_9_0=null;
        Token lv_digits_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_size_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1063:28: ( ( ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* (otherlv_3= '.' ( ( (lv_digits_4_0= RULE_DEC_DIGIT ) ) | otherlv_5= '_' )+ ) ( (otherlv_6= 'E' | otherlv_7= 'e' ) (otherlv_8= '+' | ( (lv_negativeExp_9_0= '-' ) ) )? ( ( (lv_digits_10_0= RULE_DEC_DIGIT ) ) | otherlv_11= '_' )+ )? (otherlv_12= 'f' ( (lv_size_13_0= ruleFloatSize ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1064:1: ( ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* (otherlv_3= '.' ( ( (lv_digits_4_0= RULE_DEC_DIGIT ) ) | otherlv_5= '_' )+ ) ( (otherlv_6= 'E' | otherlv_7= 'e' ) (otherlv_8= '+' | ( (lv_negativeExp_9_0= '-' ) ) )? ( ( (lv_digits_10_0= RULE_DEC_DIGIT ) ) | otherlv_11= '_' )+ )? (otherlv_12= 'f' ( (lv_size_13_0= ruleFloatSize ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1064:1: ( ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* (otherlv_3= '.' ( ( (lv_digits_4_0= RULE_DEC_DIGIT ) ) | otherlv_5= '_' )+ ) ( (otherlv_6= 'E' | otherlv_7= 'e' ) (otherlv_8= '+' | ( (lv_negativeExp_9_0= '-' ) ) )? ( ( (lv_digits_10_0= RULE_DEC_DIGIT ) ) | otherlv_11= '_' )+ )? (otherlv_12= 'f' ( (lv_size_13_0= ruleFloatSize ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1064:2: ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* (otherlv_3= '.' ( ( (lv_digits_4_0= RULE_DEC_DIGIT ) ) | otherlv_5= '_' )+ ) ( (otherlv_6= 'E' | otherlv_7= 'e' ) (otherlv_8= '+' | ( (lv_negativeExp_9_0= '-' ) ) )? ( ( (lv_digits_10_0= RULE_DEC_DIGIT ) ) | otherlv_11= '_' )+ )? (otherlv_12= 'f' ( (lv_size_13_0= ruleFloatSize ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1064:2: ( (lv_digits_0_0= RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1065:1: (lv_digits_0_0= RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1065:1: (lv_digits_0_0= RULE_DEC_DIGIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1066:3: lv_digits_0_0= RULE_DEC_DIGIT
            {
            lv_digits_0_0=(Token)match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_ruleFloatLit2210); 

            			newLeafNode(lv_digits_0_0, grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFloatLitRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"digits",
                    		lv_digits_0_0, 
                    		"DEC_DIGIT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1082:2: ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_DEC_DIGIT) ) {
                    alt13=1;
                }
                else if ( (LA13_0==30) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1082:3: ( (lv_digits_1_0= RULE_DEC_DIGIT ) )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1082:3: ( (lv_digits_1_0= RULE_DEC_DIGIT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1083:1: (lv_digits_1_0= RULE_DEC_DIGIT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1083:1: (lv_digits_1_0= RULE_DEC_DIGIT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1084:3: lv_digits_1_0= RULE_DEC_DIGIT
            	    {
            	    lv_digits_1_0=(Token)match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_ruleFloatLit2233); 

            	    			newLeafNode(lv_digits_1_0, grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFloatLitRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"digits",
            	            		lv_digits_1_0, 
            	            		"DEC_DIGIT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1101:7: otherlv_2= '_'
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleFloatLit2256); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFloatLitAccess().get_Keyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1105:3: (otherlv_3= '.' ( ( (lv_digits_4_0= RULE_DEC_DIGIT ) ) | otherlv_5= '_' )+ )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1105:5: otherlv_3= '.' ( ( (lv_digits_4_0= RULE_DEC_DIGIT ) ) | otherlv_5= '_' )+
            {
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleFloatLit2271); 

                	newLeafNode(otherlv_3, grammarAccess.getFloatLitAccess().getFullStopKeyword_2_0());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1109:1: ( ( (lv_digits_4_0= RULE_DEC_DIGIT ) ) | otherlv_5= '_' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DEC_DIGIT) ) {
                    alt14=1;
                }
                else if ( (LA14_0==30) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1109:2: ( (lv_digits_4_0= RULE_DEC_DIGIT ) )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1109:2: ( (lv_digits_4_0= RULE_DEC_DIGIT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1110:1: (lv_digits_4_0= RULE_DEC_DIGIT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1110:1: (lv_digits_4_0= RULE_DEC_DIGIT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1111:3: lv_digits_4_0= RULE_DEC_DIGIT
            	    {
            	    lv_digits_4_0=(Token)match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_ruleFloatLit2289); 

            	    			newLeafNode(lv_digits_4_0, grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_2_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFloatLitRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"digits",
            	            		lv_digits_4_0, 
            	            		"DEC_DIGIT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1128:7: otherlv_5= '_'
            	    {
            	    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleFloatLit2312); 

            	        	newLeafNode(otherlv_5, grammarAccess.getFloatLitAccess().get_Keyword_2_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1132:4: ( (otherlv_6= 'E' | otherlv_7= 'e' ) (otherlv_8= '+' | ( (lv_negativeExp_9_0= '-' ) ) )? ( ( (lv_digits_10_0= RULE_DEC_DIGIT ) ) | otherlv_11= '_' )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=32 && LA18_0<=33)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1132:5: (otherlv_6= 'E' | otherlv_7= 'e' ) (otherlv_8= '+' | ( (lv_negativeExp_9_0= '-' ) ) )? ( ( (lv_digits_10_0= RULE_DEC_DIGIT ) ) | otherlv_11= '_' )+
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1132:5: (otherlv_6= 'E' | otherlv_7= 'e' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==32) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==33) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1132:7: otherlv_6= 'E'
                            {
                            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleFloatLit2329); 

                                	newLeafNode(otherlv_6, grammarAccess.getFloatLitAccess().getEKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1137:7: otherlv_7= 'e'
                            {
                            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleFloatLit2347); 

                                	newLeafNode(otherlv_7, grammarAccess.getFloatLitAccess().getEKeyword_3_0_1());
                                

                            }
                            break;

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1141:2: (otherlv_8= '+' | ( (lv_negativeExp_9_0= '-' ) ) )?
                    int alt16=3;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==34) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==35) ) {
                        alt16=2;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1141:4: otherlv_8= '+'
                            {
                            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleFloatLit2361); 

                                	newLeafNode(otherlv_8, grammarAccess.getFloatLitAccess().getPlusSignKeyword_3_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1146:6: ( (lv_negativeExp_9_0= '-' ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1146:6: ( (lv_negativeExp_9_0= '-' ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1147:1: (lv_negativeExp_9_0= '-' )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1147:1: (lv_negativeExp_9_0= '-' )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1148:3: lv_negativeExp_9_0= '-'
                            {
                            lv_negativeExp_9_0=(Token)match(input,35,FOLLOW_35_in_ruleFloatLit2385); 

                                    newLeafNode(lv_negativeExp_9_0, grammarAccess.getFloatLitAccess().getNegativeExpHyphenMinusKeyword_3_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFloatLitRule());
                            	        }
                                   		setWithLastConsumed(current, "negativeExp", true, "-");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1161:4: ( ( (lv_digits_10_0= RULE_DEC_DIGIT ) ) | otherlv_11= '_' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_DEC_DIGIT) ) {
                            alt17=1;
                        }
                        else if ( (LA17_0==30) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1161:5: ( (lv_digits_10_0= RULE_DEC_DIGIT ) )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1161:5: ( (lv_digits_10_0= RULE_DEC_DIGIT ) )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1162:1: (lv_digits_10_0= RULE_DEC_DIGIT )
                    	    {
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1162:1: (lv_digits_10_0= RULE_DEC_DIGIT )
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1163:3: lv_digits_10_0= RULE_DEC_DIGIT
                    	    {
                    	    lv_digits_10_0=(Token)match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_ruleFloatLit2418); 

                    	    			newLeafNode(lv_digits_10_0, grammarAccess.getFloatLitAccess().getDigitsDEC_DIGITTerminalRuleCall_3_2_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFloatLitRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"digits",
                    	            		lv_digits_10_0, 
                    	            		"DEC_DIGIT");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1180:7: otherlv_11= '_'
                    	    {
                    	    otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleFloatLit2441); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getFloatLitAccess().get_Keyword_3_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1184:5: (otherlv_12= 'f' ( (lv_size_13_0= ruleFloatSize ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1184:7: otherlv_12= 'f' ( (lv_size_13_0= ruleFloatSize ) )
                    {
                    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleFloatLit2458); 

                        	newLeafNode(otherlv_12, grammarAccess.getFloatLitAccess().getFKeyword_4_0());
                        
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1188:1: ( (lv_size_13_0= ruleFloatSize ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1189:1: (lv_size_13_0= ruleFloatSize )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1189:1: (lv_size_13_0= ruleFloatSize )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1190:3: lv_size_13_0= ruleFloatSize
                    {
                     
                    	        newCompositeNode(grammarAccess.getFloatLitAccess().getSizeFloatSizeEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFloatSize_in_ruleFloatLit2479);
                    lv_size_13_0=ruleFloatSize();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFloatLitRule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_13_0, 
                            		"FloatSize");
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
    // $ANTLR end "ruleFloatLit"


    // $ANTLR start "entryRuleIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1214:1: entryRuleIntLit returns [EObject current=null] : iv_ruleIntLit= ruleIntLit EOF ;
    public final EObject entryRuleIntLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1215:2: (iv_ruleIntLit= ruleIntLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1216:2: iv_ruleIntLit= ruleIntLit EOF
            {
             newCompositeNode(grammarAccess.getIntLitRule()); 
            pushFollow(FOLLOW_ruleIntLit_in_entryRuleIntLit2517);
            iv_ruleIntLit=ruleIntLit();

            state._fsp--;

             current =iv_ruleIntLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLit2527); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLit"


    // $ANTLR start "ruleIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1223:1: ruleIntLit returns [EObject current=null] : (this_DecIntLit_0= ruleDecIntLit | this_BinIntLit_1= ruleBinIntLit | this_OctIntLit_2= ruleOctIntLit | this_HexIntLit_3= ruleHexIntLit ) ;
    public final EObject ruleIntLit() throws RecognitionException {
        EObject current = null;

        EObject this_DecIntLit_0 = null;

        EObject this_BinIntLit_1 = null;

        EObject this_OctIntLit_2 = null;

        EObject this_HexIntLit_3 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1226:28: ( (this_DecIntLit_0= ruleDecIntLit | this_BinIntLit_1= ruleBinIntLit | this_OctIntLit_2= ruleOctIntLit | this_HexIntLit_3= ruleHexIntLit ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1227:1: (this_DecIntLit_0= ruleDecIntLit | this_BinIntLit_1= ruleBinIntLit | this_OctIntLit_2= ruleOctIntLit | this_HexIntLit_3= ruleHexIntLit )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1227:1: (this_DecIntLit_0= ruleDecIntLit | this_BinIntLit_1= ruleBinIntLit | this_OctIntLit_2= ruleOctIntLit | this_HexIntLit_3= ruleHexIntLit )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_DEC_DIGIT:
                {
                alt20=1;
                }
                break;
            case 38:
                {
                alt20=2;
                }
                break;
            case 40:
                {
                alt20=3;
                }
                break;
            case 41:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1228:5: this_DecIntLit_0= ruleDecIntLit
                    {
                     
                            newCompositeNode(grammarAccess.getIntLitAccess().getDecIntLitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecIntLit_in_ruleIntLit2574);
                    this_DecIntLit_0=ruleDecIntLit();

                    state._fsp--;

                     
                            current = this_DecIntLit_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1238:5: this_BinIntLit_1= ruleBinIntLit
                    {
                     
                            newCompositeNode(grammarAccess.getIntLitAccess().getBinIntLitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBinIntLit_in_ruleIntLit2601);
                    this_BinIntLit_1=ruleBinIntLit();

                    state._fsp--;

                     
                            current = this_BinIntLit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1248:5: this_OctIntLit_2= ruleOctIntLit
                    {
                     
                            newCompositeNode(grammarAccess.getIntLitAccess().getOctIntLitParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleOctIntLit_in_ruleIntLit2628);
                    this_OctIntLit_2=ruleOctIntLit();

                    state._fsp--;

                     
                            current = this_OctIntLit_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1258:5: this_HexIntLit_3= ruleHexIntLit
                    {
                     
                            newCompositeNode(grammarAccess.getIntLitAccess().getHexIntLitParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleHexIntLit_in_ruleIntLit2655);
                    this_HexIntLit_3=ruleHexIntLit();

                    state._fsp--;

                     
                            current = this_HexIntLit_3; 
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
    // $ANTLR end "ruleIntLit"


    // $ANTLR start "entryRuleDecIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1274:1: entryRuleDecIntLit returns [EObject current=null] : iv_ruleDecIntLit= ruleDecIntLit EOF ;
    public final EObject entryRuleDecIntLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecIntLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1275:2: (iv_ruleDecIntLit= ruleDecIntLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1276:2: iv_ruleDecIntLit= ruleDecIntLit EOF
            {
             newCompositeNode(grammarAccess.getDecIntLitRule()); 
            pushFollow(FOLLOW_ruleDecIntLit_in_entryRuleDecIntLit2690);
            iv_ruleDecIntLit=ruleDecIntLit();

            state._fsp--;

             current =iv_ruleDecIntLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecIntLit2700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecIntLit"


    // $ANTLR start "ruleDecIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1283:1: ruleDecIntLit returns [EObject current=null] : ( ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* ( (otherlv_3= 'i' | ( (lv_unsigned_4_0= 'u' ) ) ) ( (lv_size_5_0= ruleIntSize ) ) )? ) ;
    public final EObject ruleDecIntLit() throws RecognitionException {
        EObject current = null;

        Token lv_digits_0_0=null;
        Token lv_digits_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_unsigned_4_0=null;
        Enumerator lv_size_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1286:28: ( ( ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* ( (otherlv_3= 'i' | ( (lv_unsigned_4_0= 'u' ) ) ) ( (lv_size_5_0= ruleIntSize ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1287:1: ( ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* ( (otherlv_3= 'i' | ( (lv_unsigned_4_0= 'u' ) ) ) ( (lv_size_5_0= ruleIntSize ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1287:1: ( ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* ( (otherlv_3= 'i' | ( (lv_unsigned_4_0= 'u' ) ) ) ( (lv_size_5_0= ruleIntSize ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1287:2: ( (lv_digits_0_0= RULE_DEC_DIGIT ) ) ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )* ( (otherlv_3= 'i' | ( (lv_unsigned_4_0= 'u' ) ) ) ( (lv_size_5_0= ruleIntSize ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1287:2: ( (lv_digits_0_0= RULE_DEC_DIGIT ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1288:1: (lv_digits_0_0= RULE_DEC_DIGIT )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1288:1: (lv_digits_0_0= RULE_DEC_DIGIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1289:3: lv_digits_0_0= RULE_DEC_DIGIT
            {
            lv_digits_0_0=(Token)match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_ruleDecIntLit2742); 

            			newLeafNode(lv_digits_0_0, grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecIntLitRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"digits",
                    		lv_digits_0_0, 
                    		"DEC_DIGIT");
            	    

            }


            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1305:2: ( ( (lv_digits_1_0= RULE_DEC_DIGIT ) ) | otherlv_2= '_' )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_DEC_DIGIT) ) {
                    alt21=1;
                }
                else if ( (LA21_0==30) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1305:3: ( (lv_digits_1_0= RULE_DEC_DIGIT ) )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1305:3: ( (lv_digits_1_0= RULE_DEC_DIGIT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1306:1: (lv_digits_1_0= RULE_DEC_DIGIT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1306:1: (lv_digits_1_0= RULE_DEC_DIGIT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1307:3: lv_digits_1_0= RULE_DEC_DIGIT
            	    {
            	    lv_digits_1_0=(Token)match(input,RULE_DEC_DIGIT,FOLLOW_RULE_DEC_DIGIT_in_ruleDecIntLit2765); 

            	    			newLeafNode(lv_digits_1_0, grammarAccess.getDecIntLitAccess().getDigitsDEC_DIGITTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDecIntLitRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"digits",
            	            		lv_digits_1_0, 
            	            		"DEC_DIGIT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1324:7: otherlv_2= '_'
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleDecIntLit2788); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDecIntLitAccess().get_Keyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1328:3: ( (otherlv_3= 'i' | ( (lv_unsigned_4_0= 'u' ) ) ) ( (lv_size_5_0= ruleIntSize ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28||LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1328:4: (otherlv_3= 'i' | ( (lv_unsigned_4_0= 'u' ) ) ) ( (lv_size_5_0= ruleIntSize ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1328:4: (otherlv_3= 'i' | ( (lv_unsigned_4_0= 'u' ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==37) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==28) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1328:6: otherlv_3= 'i'
                            {
                            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleDecIntLit2804); 

                                	newLeafNode(otherlv_3, grammarAccess.getDecIntLitAccess().getIKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1333:6: ( (lv_unsigned_4_0= 'u' ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1333:6: ( (lv_unsigned_4_0= 'u' ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1334:1: (lv_unsigned_4_0= 'u' )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1334:1: (lv_unsigned_4_0= 'u' )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1335:3: lv_unsigned_4_0= 'u'
                            {
                            lv_unsigned_4_0=(Token)match(input,28,FOLLOW_28_in_ruleDecIntLit2828); 

                                    newLeafNode(lv_unsigned_4_0, grammarAccess.getDecIntLitAccess().getUnsignedUKeyword_2_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDecIntLitRule());
                            	        }
                                   		setWithLastConsumed(current, "unsigned", true, "u");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1348:3: ( (lv_size_5_0= ruleIntSize ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1349:1: (lv_size_5_0= ruleIntSize )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1349:1: (lv_size_5_0= ruleIntSize )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1350:3: lv_size_5_0= ruleIntSize
                    {
                     
                    	        newCompositeNode(grammarAccess.getDecIntLitAccess().getSizeIntSizeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntSize_in_ruleDecIntLit2863);
                    lv_size_5_0=ruleIntSize();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDecIntLitRule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_5_0, 
                            		"IntSize");
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
    // $ANTLR end "ruleDecIntLit"


    // $ANTLR start "entryRuleBinIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1374:1: entryRuleBinIntLit returns [EObject current=null] : iv_ruleBinIntLit= ruleBinIntLit EOF ;
    public final EObject entryRuleBinIntLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinIntLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1375:2: (iv_ruleBinIntLit= ruleBinIntLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1376:2: iv_ruleBinIntLit= ruleBinIntLit EOF
            {
             newCompositeNode(grammarAccess.getBinIntLitRule()); 
            pushFollow(FOLLOW_ruleBinIntLit_in_entryRuleBinIntLit2901);
            iv_ruleBinIntLit=ruleBinIntLit();

            state._fsp--;

             current =iv_ruleBinIntLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinIntLit2911); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinIntLit"


    // $ANTLR start "ruleBinIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1383:1: ruleBinIntLit returns [EObject current=null] : ( () otherlv_1= '0b' ( ( (lv_digits_2_0= '0' ) ) | ( (lv_digits_3_0= '1' ) ) | otherlv_4= '_' )+ ( (otherlv_5= 'i' | ( (lv_unsigned_6_0= 'u' ) ) ) ( (lv_size_7_0= ruleIntSize ) ) )? ) ;
    public final EObject ruleBinIntLit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_digits_2_0=null;
        Token lv_digits_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_unsigned_6_0=null;
        Enumerator lv_size_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1386:28: ( ( () otherlv_1= '0b' ( ( (lv_digits_2_0= '0' ) ) | ( (lv_digits_3_0= '1' ) ) | otherlv_4= '_' )+ ( (otherlv_5= 'i' | ( (lv_unsigned_6_0= 'u' ) ) ) ( (lv_size_7_0= ruleIntSize ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1387:1: ( () otherlv_1= '0b' ( ( (lv_digits_2_0= '0' ) ) | ( (lv_digits_3_0= '1' ) ) | otherlv_4= '_' )+ ( (otherlv_5= 'i' | ( (lv_unsigned_6_0= 'u' ) ) ) ( (lv_size_7_0= ruleIntSize ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1387:1: ( () otherlv_1= '0b' ( ( (lv_digits_2_0= '0' ) ) | ( (lv_digits_3_0= '1' ) ) | otherlv_4= '_' )+ ( (otherlv_5= 'i' | ( (lv_unsigned_6_0= 'u' ) ) ) ( (lv_size_7_0= ruleIntSize ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1387:2: () otherlv_1= '0b' ( ( (lv_digits_2_0= '0' ) ) | ( (lv_digits_3_0= '1' ) ) | otherlv_4= '_' )+ ( (otherlv_5= 'i' | ( (lv_unsigned_6_0= 'u' ) ) ) ( (lv_size_7_0= ruleIntSize ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1387:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1388:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBinIntLitAccess().getBinIntLitAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleBinIntLit2957); 

                	newLeafNode(otherlv_1, grammarAccess.getBinIntLitAccess().getBKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1397:1: ( ( (lv_digits_2_0= '0' ) ) | ( (lv_digits_3_0= '1' ) ) | otherlv_4= '_' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt24=1;
                    }
                    break;
                case 39:
                    {
                    alt24=2;
                    }
                    break;
                case 30:
                    {
                    alt24=3;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1397:2: ( (lv_digits_2_0= '0' ) )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1397:2: ( (lv_digits_2_0= '0' ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1398:1: (lv_digits_2_0= '0' )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1398:1: (lv_digits_2_0= '0' )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1399:3: lv_digits_2_0= '0'
            	    {
            	    lv_digits_2_0=(Token)match(input,26,FOLLOW_26_in_ruleBinIntLit2976); 

            	            newLeafNode(lv_digits_2_0, grammarAccess.getBinIntLitAccess().getDigits0Keyword_2_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBinIntLitRule());
            	    	        }
            	           		addWithLastConsumed(current, "digits", lv_digits_2_0, "0");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1413:6: ( (lv_digits_3_0= '1' ) )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1413:6: ( (lv_digits_3_0= '1' ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1414:1: (lv_digits_3_0= '1' )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1414:1: (lv_digits_3_0= '1' )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1415:3: lv_digits_3_0= '1'
            	    {
            	    lv_digits_3_0=(Token)match(input,39,FOLLOW_39_in_ruleBinIntLit3013); 

            	            newLeafNode(lv_digits_3_0, grammarAccess.getBinIntLitAccess().getDigits1Keyword_2_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBinIntLitRule());
            	    	        }
            	           		addWithLastConsumed(current, "digits", lv_digits_3_0, "1");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1429:7: otherlv_4= '_'
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleBinIntLit3044); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBinIntLitAccess().get_Keyword_2_2());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1433:3: ( (otherlv_5= 'i' | ( (lv_unsigned_6_0= 'u' ) ) ) ( (lv_size_7_0= ruleIntSize ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28||LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1433:4: (otherlv_5= 'i' | ( (lv_unsigned_6_0= 'u' ) ) ) ( (lv_size_7_0= ruleIntSize ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1433:4: (otherlv_5= 'i' | ( (lv_unsigned_6_0= 'u' ) ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==37) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==28) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1433:6: otherlv_5= 'i'
                            {
                            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleBinIntLit3060); 

                                	newLeafNode(otherlv_5, grammarAccess.getBinIntLitAccess().getIKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1438:6: ( (lv_unsigned_6_0= 'u' ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1438:6: ( (lv_unsigned_6_0= 'u' ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1439:1: (lv_unsigned_6_0= 'u' )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1439:1: (lv_unsigned_6_0= 'u' )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1440:3: lv_unsigned_6_0= 'u'
                            {
                            lv_unsigned_6_0=(Token)match(input,28,FOLLOW_28_in_ruleBinIntLit3084); 

                                    newLeafNode(lv_unsigned_6_0, grammarAccess.getBinIntLitAccess().getUnsignedUKeyword_3_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBinIntLitRule());
                            	        }
                                   		setWithLastConsumed(current, "unsigned", true, "u");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1453:3: ( (lv_size_7_0= ruleIntSize ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1454:1: (lv_size_7_0= ruleIntSize )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1454:1: (lv_size_7_0= ruleIntSize )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1455:3: lv_size_7_0= ruleIntSize
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntSize_in_ruleBinIntLit3119);
                    lv_size_7_0=ruleIntSize();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinIntLitRule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_7_0, 
                            		"IntSize");
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
    // $ANTLR end "ruleBinIntLit"


    // $ANTLR start "entryRuleOctIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1479:1: entryRuleOctIntLit returns [EObject current=null] : iv_ruleOctIntLit= ruleOctIntLit EOF ;
    public final EObject entryRuleOctIntLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOctIntLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1480:2: (iv_ruleOctIntLit= ruleOctIntLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1481:2: iv_ruleOctIntLit= ruleOctIntLit EOF
            {
             newCompositeNode(grammarAccess.getOctIntLitRule()); 
            pushFollow(FOLLOW_ruleOctIntLit_in_entryRuleOctIntLit3157);
            iv_ruleOctIntLit=ruleOctIntLit();

            state._fsp--;

             current =iv_ruleOctIntLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOctIntLit3167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOctIntLit"


    // $ANTLR start "ruleOctIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1488:1: ruleOctIntLit returns [EObject current=null] : ( () otherlv_1= '0o' ( ( (lv_digits_2_0= RULE_OCT_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )? ) ;
    public final EObject ruleOctIntLit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_digits_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_unsigned_5_0=null;
        Enumerator lv_size_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1491:28: ( ( () otherlv_1= '0o' ( ( (lv_digits_2_0= RULE_OCT_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1492:1: ( () otherlv_1= '0o' ( ( (lv_digits_2_0= RULE_OCT_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1492:1: ( () otherlv_1= '0o' ( ( (lv_digits_2_0= RULE_OCT_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1492:2: () otherlv_1= '0o' ( ( (lv_digits_2_0= RULE_OCT_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1492:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1493:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOctIntLitAccess().getOctIntLitAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleOctIntLit3213); 

                	newLeafNode(otherlv_1, grammarAccess.getOctIntLitAccess().getOKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1502:1: ( ( (lv_digits_2_0= RULE_OCT_DIGIT ) ) | otherlv_3= '_' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_OCT_DIGIT) ) {
                    alt27=1;
                }
                else if ( (LA27_0==30) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1502:2: ( (lv_digits_2_0= RULE_OCT_DIGIT ) )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1502:2: ( (lv_digits_2_0= RULE_OCT_DIGIT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1503:1: (lv_digits_2_0= RULE_OCT_DIGIT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1503:1: (lv_digits_2_0= RULE_OCT_DIGIT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1504:3: lv_digits_2_0= RULE_OCT_DIGIT
            	    {
            	    lv_digits_2_0=(Token)match(input,RULE_OCT_DIGIT,FOLLOW_RULE_OCT_DIGIT_in_ruleOctIntLit3231); 

            	    			newLeafNode(lv_digits_2_0, grammarAccess.getOctIntLitAccess().getDigitsOCT_DIGITTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOctIntLitRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"digits",
            	            		lv_digits_2_0, 
            	            		"OCT_DIGIT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1521:7: otherlv_3= '_'
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleOctIntLit3254); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOctIntLitAccess().get_Keyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1525:3: ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28||LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1525:4: (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1525:4: (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==37) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==28) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1525:6: otherlv_4= 'i'
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleOctIntLit3270); 

                                	newLeafNode(otherlv_4, grammarAccess.getOctIntLitAccess().getIKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1530:6: ( (lv_unsigned_5_0= 'u' ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1530:6: ( (lv_unsigned_5_0= 'u' ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1531:1: (lv_unsigned_5_0= 'u' )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1531:1: (lv_unsigned_5_0= 'u' )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1532:3: lv_unsigned_5_0= 'u'
                            {
                            lv_unsigned_5_0=(Token)match(input,28,FOLLOW_28_in_ruleOctIntLit3294); 

                                    newLeafNode(lv_unsigned_5_0, grammarAccess.getOctIntLitAccess().getUnsignedUKeyword_3_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOctIntLitRule());
                            	        }
                                   		setWithLastConsumed(current, "unsigned", true, "u");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1545:3: ( (lv_size_6_0= ruleIntSize ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1546:1: (lv_size_6_0= ruleIntSize )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1546:1: (lv_size_6_0= ruleIntSize )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1547:3: lv_size_6_0= ruleIntSize
                    {
                     
                    	        newCompositeNode(grammarAccess.getOctIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntSize_in_ruleOctIntLit3329);
                    lv_size_6_0=ruleIntSize();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOctIntLitRule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_6_0, 
                            		"IntSize");
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
    // $ANTLR end "ruleOctIntLit"


    // $ANTLR start "entryRuleHexIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1571:1: entryRuleHexIntLit returns [EObject current=null] : iv_ruleHexIntLit= ruleHexIntLit EOF ;
    public final EObject entryRuleHexIntLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexIntLit = null;


        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1572:2: (iv_ruleHexIntLit= ruleHexIntLit EOF )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1573:2: iv_ruleHexIntLit= ruleHexIntLit EOF
            {
             newCompositeNode(grammarAccess.getHexIntLitRule()); 
            pushFollow(FOLLOW_ruleHexIntLit_in_entryRuleHexIntLit3367);
            iv_ruleHexIntLit=ruleHexIntLit();

            state._fsp--;

             current =iv_ruleHexIntLit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexIntLit3377); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHexIntLit"


    // $ANTLR start "ruleHexIntLit"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1580:1: ruleHexIntLit returns [EObject current=null] : ( () otherlv_1= '0x' ( ( (lv_digits_2_0= RULE_HEX_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )? ) ;
    public final EObject ruleHexIntLit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_digits_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_unsigned_5_0=null;
        Enumerator lv_size_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1583:28: ( ( () otherlv_1= '0x' ( ( (lv_digits_2_0= RULE_HEX_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )? ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1584:1: ( () otherlv_1= '0x' ( ( (lv_digits_2_0= RULE_HEX_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )? )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1584:1: ( () otherlv_1= '0x' ( ( (lv_digits_2_0= RULE_HEX_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1584:2: () otherlv_1= '0x' ( ( (lv_digits_2_0= RULE_HEX_DIGIT ) ) | otherlv_3= '_' )+ ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1584:2: ()
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1585:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHexIntLitAccess().getHexIntLitAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleHexIntLit3423); 

                	newLeafNode(otherlv_1, grammarAccess.getHexIntLitAccess().getXKeyword_1());
                
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1594:1: ( ( (lv_digits_2_0= RULE_HEX_DIGIT ) ) | otherlv_3= '_' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_HEX_DIGIT) ) {
                    alt30=1;
                }
                else if ( (LA30_0==30) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1594:2: ( (lv_digits_2_0= RULE_HEX_DIGIT ) )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1594:2: ( (lv_digits_2_0= RULE_HEX_DIGIT ) )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1595:1: (lv_digits_2_0= RULE_HEX_DIGIT )
            	    {
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1595:1: (lv_digits_2_0= RULE_HEX_DIGIT )
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1596:3: lv_digits_2_0= RULE_HEX_DIGIT
            	    {
            	    lv_digits_2_0=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleHexIntLit3441); 

            	    			newLeafNode(lv_digits_2_0, grammarAccess.getHexIntLitAccess().getDigitsHEX_DIGITTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getHexIntLitRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"digits",
            	            		lv_digits_2_0, 
            	            		"HEX_DIGIT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1613:7: otherlv_3= '_'
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleHexIntLit3464); 

            	        	newLeafNode(otherlv_3, grammarAccess.getHexIntLitAccess().get_Keyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1617:3: ( (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28||LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1617:4: (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) ) ( (lv_size_6_0= ruleIntSize ) )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1617:4: (otherlv_4= 'i' | ( (lv_unsigned_5_0= 'u' ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==37) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==28) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1617:6: otherlv_4= 'i'
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleHexIntLit3480); 

                                	newLeafNode(otherlv_4, grammarAccess.getHexIntLitAccess().getIKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1622:6: ( (lv_unsigned_5_0= 'u' ) )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1622:6: ( (lv_unsigned_5_0= 'u' ) )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1623:1: (lv_unsigned_5_0= 'u' )
                            {
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1623:1: (lv_unsigned_5_0= 'u' )
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1624:3: lv_unsigned_5_0= 'u'
                            {
                            lv_unsigned_5_0=(Token)match(input,28,FOLLOW_28_in_ruleHexIntLit3504); 

                                    newLeafNode(lv_unsigned_5_0, grammarAccess.getHexIntLitAccess().getUnsignedUKeyword_3_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getHexIntLitRule());
                            	        }
                                   		setWithLastConsumed(current, "unsigned", true, "u");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1637:3: ( (lv_size_6_0= ruleIntSize ) )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1638:1: (lv_size_6_0= ruleIntSize )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1638:1: (lv_size_6_0= ruleIntSize )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1639:3: lv_size_6_0= ruleIntSize
                    {
                     
                    	        newCompositeNode(grammarAccess.getHexIntLitAccess().getSizeIntSizeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntSize_in_ruleHexIntLit3539);
                    lv_size_6_0=ruleIntSize();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHexIntLitRule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_6_0, 
                            		"IntSize");
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
    // $ANTLR end "ruleHexIntLit"


    // $ANTLR start "ruleFloatSize"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1663:1: ruleFloatSize returns [Enumerator current=null] : ( (enumLiteral_0= '32' ) | (enumLiteral_1= '64' ) ) ;
    public final Enumerator ruleFloatSize() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1665:28: ( ( (enumLiteral_0= '32' ) | (enumLiteral_1= '64' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1666:1: ( (enumLiteral_0= '32' ) | (enumLiteral_1= '64' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1666:1: ( (enumLiteral_0= '32' ) | (enumLiteral_1= '64' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            else if ( (LA33_0==43) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1666:2: (enumLiteral_0= '32' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1666:2: (enumLiteral_0= '32' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1666:4: enumLiteral_0= '32'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleFloatSize3591); 

                            current = grammarAccess.getFloatSizeAccess().getFLOATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFloatSizeAccess().getFLOATEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1672:6: (enumLiteral_1= '64' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1672:6: (enumLiteral_1= '64' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1672:8: enumLiteral_1= '64'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleFloatSize3608); 

                            current = grammarAccess.getFloatSizeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFloatSizeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleFloatSize"


    // $ANTLR start "ruleIntSize"
    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1682:1: ruleIntSize returns [Enumerator current=null] : ( (enumLiteral_0= '8' ) | (enumLiteral_1= '16' ) | (enumLiteral_2= '32' ) | (enumLiteral_3= '64' ) ) ;
    public final Enumerator ruleIntSize() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1684:28: ( ( (enumLiteral_0= '8' ) | (enumLiteral_1= '16' ) | (enumLiteral_2= '32' ) | (enumLiteral_3= '64' ) ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1685:1: ( (enumLiteral_0= '8' ) | (enumLiteral_1= '16' ) | (enumLiteral_2= '32' ) | (enumLiteral_3= '64' ) )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1685:1: ( (enumLiteral_0= '8' ) | (enumLiteral_1= '16' ) | (enumLiteral_2= '32' ) | (enumLiteral_3= '64' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt34=1;
                }
                break;
            case 45:
                {
                alt34=2;
                }
                break;
            case 42:
                {
                alt34=3;
                }
                break;
            case 43:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1685:2: (enumLiteral_0= '8' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1685:2: (enumLiteral_0= '8' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1685:4: enumLiteral_0= '8'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleIntSize3653); 

                            current = grammarAccess.getIntSizeAccess().getBYTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIntSizeAccess().getBYTEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1691:6: (enumLiteral_1= '16' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1691:6: (enumLiteral_1= '16' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1691:8: enumLiteral_1= '16'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleIntSize3670); 

                            current = grammarAccess.getIntSizeAccess().getSHORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIntSizeAccess().getSHORTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1697:6: (enumLiteral_2= '32' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1697:6: (enumLiteral_2= '32' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1697:8: enumLiteral_2= '32'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleIntSize3687); 

                            current = grammarAccess.getIntSizeAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getIntSizeAccess().getINTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1703:6: (enumLiteral_3= '64' )
                    {
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1703:6: (enumLiteral_3= '64' )
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1703:8: enumLiteral_3= '64'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleIntSize3704); 

                            current = grammarAccess.getIntSizeAccess().getLONGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getIntSizeAccess().getLONGEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleIntSize"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\6\uffff";
    static final String DFA12_eofS =
        "\1\uffff\1\2\1\uffff\2\2\1\uffff";
    static final String DFA12_minS =
        "\2\7\1\uffff\2\7\1\uffff";
    static final String DFA12_maxS =
        "\1\51\1\45\1\uffff\2\45\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\2\uffff\1\1";
    static final String DFA12_specialS =
        "\6\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\36\uffff\1\2\1\uffff\2\2",
            "\1\3\4\uffff\2\2\1\uffff\1\2\14\uffff\1\2\1\uffff\1\4\1\5\5"+
            "\uffff\1\2",
            "",
            "\1\3\4\uffff\2\2\1\uffff\1\2\14\uffff\1\2\1\uffff\1\4\1\5\5"+
            "\uffff\1\2",
            "\1\3\4\uffff\2\2\1\uffff\1\2\14\uffff\1\2\1\uffff\1\4\1\5\5"+
            "\uffff\1\2",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1024:1: (this_FloatLit_0= ruleFloatLit | this_IntLit_1= ruleIntLit )";
        }
    }
 

    public static final BitSet FOLLOW_ruleCrate_in_entryRuleCrate75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrate85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_ruleCrate130 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_ruleItemAttr_in_entryRuleItemAttr166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemAttr176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleItemAttr213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleItemAttr234 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleItemAttr247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleItemAttr268 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleItemAttr282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttr_in_entryRuleAttr318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttr328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_ruleAttr375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_ruleAttr402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrWithList_in_entryRuleAttrWithList437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrWithList447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAttrWithList489 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttrWithList506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleAttrWithList527 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleAttrWithList540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttr_in_ruleAttrWithList561 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleAttrWithList575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAttr_in_entryRuleLiteralAttr611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAttr621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleLiteralAttr663 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLiteralAttr680 = new BitSet(new long[]{0x0000034000200080L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralAttr701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAndAttrs_in_entryRuleItemAndAttrs737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemAndAttrs747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemAttr_in_ruleItemAndAttrs793 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_ruleItem_in_ruleItemAndAttrs815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_ruleItem907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModItem_in_entryRuleModItem941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModItem951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModItem988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleModItem1005 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleModItem1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModItem1042 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleModItem1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_ruleLiteral1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_ruleLiteral1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLit_in_entryRuleCharLit1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLit1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCharLit1258 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_RULE_NON_SINGLE_QUOTE_in_ruleCharLit1276 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22_in_ruleCharLit1300 = new BitSet(new long[]{0x000000003FE00000L});
    public static final BitSet FOLLOW_21_in_ruleCharLit1319 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleEscapedChar_in_ruleCharLit1359 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCharLit1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedChar_in_entryRuleEscapedChar1410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedChar1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEscapedChar1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEscapedChar1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEscapedChar1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEscapedChar1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEscapedChar1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEscapedChar1636 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1653 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEscapedChar1709 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1748 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1770 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEscapedChar1826 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1843 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1865 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1887 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1909 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1931 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1953 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1975 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleEscapedChar1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLit_in_entryRuleNumberLit2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLit2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLit_in_ruleNumberLit2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLit_in_ruleNumberLit2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLit_in_entryRuleFloatLit2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLit2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_ruleFloatLit2210 = new BitSet(new long[]{0x00000000C0000080L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_ruleFloatLit2233 = new BitSet(new long[]{0x00000000C0000080L});
    public static final BitSet FOLLOW_30_in_ruleFloatLit2256 = new BitSet(new long[]{0x00000000C0000080L});
    public static final BitSet FOLLOW_31_in_ruleFloatLit2271 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_ruleFloatLit2289 = new BitSet(new long[]{0x0000001340000082L});
    public static final BitSet FOLLOW_30_in_ruleFloatLit2312 = new BitSet(new long[]{0x0000001340000082L});
    public static final BitSet FOLLOW_32_in_ruleFloatLit2329 = new BitSet(new long[]{0x0000000C40000080L});
    public static final BitSet FOLLOW_33_in_ruleFloatLit2347 = new BitSet(new long[]{0x0000000C40000080L});
    public static final BitSet FOLLOW_34_in_ruleFloatLit2361 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_35_in_ruleFloatLit2385 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_ruleFloatLit2418 = new BitSet(new long[]{0x0000001040000082L});
    public static final BitSet FOLLOW_30_in_ruleFloatLit2441 = new BitSet(new long[]{0x0000001040000082L});
    public static final BitSet FOLLOW_36_in_ruleFloatLit2458 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleFloatSize_in_ruleFloatLit2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLit_in_entryRuleIntLit2517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLit2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecIntLit_in_ruleIntLit2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinIntLit_in_ruleIntLit2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctIntLit_in_ruleIntLit2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexIntLit_in_ruleIntLit2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecIntLit_in_entryRuleDecIntLit2690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecIntLit2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_ruleDecIntLit2742 = new BitSet(new long[]{0x0000002050000082L});
    public static final BitSet FOLLOW_RULE_DEC_DIGIT_in_ruleDecIntLit2765 = new BitSet(new long[]{0x0000002050000082L});
    public static final BitSet FOLLOW_30_in_ruleDecIntLit2788 = new BitSet(new long[]{0x0000002050000082L});
    public static final BitSet FOLLOW_37_in_ruleDecIntLit2804 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_28_in_ruleDecIntLit2828 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleIntSize_in_ruleDecIntLit2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinIntLit_in_entryRuleBinIntLit2901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinIntLit2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBinIntLit2957 = new BitSet(new long[]{0x0000008044000000L});
    public static final BitSet FOLLOW_26_in_ruleBinIntLit2976 = new BitSet(new long[]{0x000000A054000002L});
    public static final BitSet FOLLOW_39_in_ruleBinIntLit3013 = new BitSet(new long[]{0x000000A054000002L});
    public static final BitSet FOLLOW_30_in_ruleBinIntLit3044 = new BitSet(new long[]{0x000000A054000002L});
    public static final BitSet FOLLOW_37_in_ruleBinIntLit3060 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_28_in_ruleBinIntLit3084 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleIntSize_in_ruleBinIntLit3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOctIntLit_in_entryRuleOctIntLit3157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOctIntLit3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOctIntLit3213 = new BitSet(new long[]{0x0000000040000100L});
    public static final BitSet FOLLOW_RULE_OCT_DIGIT_in_ruleOctIntLit3231 = new BitSet(new long[]{0x0000002050000102L});
    public static final BitSet FOLLOW_30_in_ruleOctIntLit3254 = new BitSet(new long[]{0x0000002050000102L});
    public static final BitSet FOLLOW_37_in_ruleOctIntLit3270 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_28_in_ruleOctIntLit3294 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleIntSize_in_ruleOctIntLit3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexIntLit_in_entryRuleHexIntLit3367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexIntLit3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleHexIntLit3423 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleHexIntLit3441 = new BitSet(new long[]{0x0000002050000042L});
    public static final BitSet FOLLOW_30_in_ruleHexIntLit3464 = new BitSet(new long[]{0x0000002050000042L});
    public static final BitSet FOLLOW_37_in_ruleHexIntLit3480 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_28_in_ruleHexIntLit3504 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleIntSize_in_ruleHexIntLit3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFloatSize3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleFloatSize3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleIntSize3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleIntSize3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleIntSize3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleIntSize3704 = new BitSet(new long[]{0x0000000000000002L});

}