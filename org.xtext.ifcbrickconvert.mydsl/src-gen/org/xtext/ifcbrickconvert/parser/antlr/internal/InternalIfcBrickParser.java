package org.xtext.ifcbrickconvert.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ifcbrickconvert.services.IfcBrickGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIfcBrickParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_XSTRING", "RULE_INT", "RULE_DOUBLE", "RULE_NUMBER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ISO-10303-21'", "';'", "'END-ISO-10303-21'", "'HEADER'", "'ENDSEC'", "'DATA'", "'='", "'('", "','", "')'", "'.'", "'$'", "'*'", "'#'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_XSTRING=5;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalIfcBrickParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIfcBrickParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIfcBrickParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIfcBrick.g"; }



     	private IfcBrickGrammarAccess grammarAccess;

        public InternalIfcBrickParser(TokenStream input, IfcBrickGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected IfcBrickGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalIfcBrick.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalIfcBrick.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalIfcBrick.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalIfcBrick.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'ISO-10303-21' otherlv_1= ';' ( (lv_header_2_0= ruleHeader ) ) ( (lv_data_3_0= ruleData ) ) otherlv_4= 'END-ISO-10303-21' otherlv_5= ';' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_header_2_0 = null;

        EObject lv_data_3_0 = null;



        	enterRule();

        try {
            // InternalIfcBrick.g:77:2: ( (otherlv_0= 'ISO-10303-21' otherlv_1= ';' ( (lv_header_2_0= ruleHeader ) ) ( (lv_data_3_0= ruleData ) ) otherlv_4= 'END-ISO-10303-21' otherlv_5= ';' ) )
            // InternalIfcBrick.g:78:2: (otherlv_0= 'ISO-10303-21' otherlv_1= ';' ( (lv_header_2_0= ruleHeader ) ) ( (lv_data_3_0= ruleData ) ) otherlv_4= 'END-ISO-10303-21' otherlv_5= ';' )
            {
            // InternalIfcBrick.g:78:2: (otherlv_0= 'ISO-10303-21' otherlv_1= ';' ( (lv_header_2_0= ruleHeader ) ) ( (lv_data_3_0= ruleData ) ) otherlv_4= 'END-ISO-10303-21' otherlv_5= ';' )
            // InternalIfcBrick.g:79:3: otherlv_0= 'ISO-10303-21' otherlv_1= ';' ( (lv_header_2_0= ruleHeader ) ) ( (lv_data_3_0= ruleData ) ) otherlv_4= 'END-ISO-10303-21' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getISO1030321Keyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getSemicolonKeyword_1());
            		
            // InternalIfcBrick.g:87:3: ( (lv_header_2_0= ruleHeader ) )
            // InternalIfcBrick.g:88:4: (lv_header_2_0= ruleHeader )
            {
            // InternalIfcBrick.g:88:4: (lv_header_2_0= ruleHeader )
            // InternalIfcBrick.g:89:5: lv_header_2_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getRootAccess().getHeaderHeaderParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_header_2_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_2_0,
            						"org.xtext.ifcbrickconvert.IfcBrick.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIfcBrick.g:106:3: ( (lv_data_3_0= ruleData ) )
            // InternalIfcBrick.g:107:4: (lv_data_3_0= ruleData )
            {
            // InternalIfcBrick.g:107:4: (lv_data_3_0= ruleData )
            // InternalIfcBrick.g:108:5: lv_data_3_0= ruleData
            {

            					newCompositeNode(grammarAccess.getRootAccess().getDataDataParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_data_3_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"data",
            						lv_data_3_0,
            						"org.xtext.ifcbrickconvert.IfcBrick.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRootAccess().getENDISO1030321Keyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRootAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleHeader"
    // InternalIfcBrick.g:137:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalIfcBrick.g:137:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalIfcBrick.g:138:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalIfcBrick.g:144:1: ruleHeader returns [EObject current=null] : (otherlv_0= 'HEADER' otherlv_1= ';' ( (lv_headerEntities_2_0= ruleEntityTerminated ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_headerEntities_2_0 = null;



        	enterRule();

        try {
            // InternalIfcBrick.g:150:2: ( (otherlv_0= 'HEADER' otherlv_1= ';' ( (lv_headerEntities_2_0= ruleEntityTerminated ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';' ) )
            // InternalIfcBrick.g:151:2: (otherlv_0= 'HEADER' otherlv_1= ';' ( (lv_headerEntities_2_0= ruleEntityTerminated ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';' )
            {
            // InternalIfcBrick.g:151:2: (otherlv_0= 'HEADER' otherlv_1= ';' ( (lv_headerEntities_2_0= ruleEntityTerminated ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';' )
            // InternalIfcBrick.g:152:3: otherlv_0= 'HEADER' otherlv_1= ';' ( (lv_headerEntities_2_0= ruleEntityTerminated ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getHEADERKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getSemicolonKeyword_1());
            		
            // InternalIfcBrick.g:160:3: ( (lv_headerEntities_2_0= ruleEntityTerminated ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIfcBrick.g:161:4: (lv_headerEntities_2_0= ruleEntityTerminated )
            	    {
            	    // InternalIfcBrick.g:161:4: (lv_headerEntities_2_0= ruleEntityTerminated )
            	    // InternalIfcBrick.g:162:5: lv_headerEntities_2_0= ruleEntityTerminated
            	    {

            	    					newCompositeNode(grammarAccess.getHeaderAccess().getHeaderEntitiesEntityTerminatedParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_headerEntities_2_0=ruleEntityTerminated();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    					}
            	    					add(
            	    						current,
            	    						"headerEntities",
            	    						lv_headerEntities_2_0,
            	    						"org.xtext.ifcbrickconvert.IfcBrick.EntityTerminated");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getENDSECKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleData"
    // InternalIfcBrick.g:191:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalIfcBrick.g:191:45: (iv_ruleData= ruleData EOF )
            // InternalIfcBrick.g:192:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalIfcBrick.g:198:1: ruleData returns [EObject current=null] : (otherlv_0= 'DATA' otherlv_1= ';' ( (lv_entityWithIds_2_0= ruleEntityWithId ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_entityWithIds_2_0 = null;



        	enterRule();

        try {
            // InternalIfcBrick.g:204:2: ( (otherlv_0= 'DATA' otherlv_1= ';' ( (lv_entityWithIds_2_0= ruleEntityWithId ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';' ) )
            // InternalIfcBrick.g:205:2: (otherlv_0= 'DATA' otherlv_1= ';' ( (lv_entityWithIds_2_0= ruleEntityWithId ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';' )
            {
            // InternalIfcBrick.g:205:2: (otherlv_0= 'DATA' otherlv_1= ';' ( (lv_entityWithIds_2_0= ruleEntityWithId ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';' )
            // InternalIfcBrick.g:206:3: otherlv_0= 'DATA' otherlv_1= ';' ( (lv_entityWithIds_2_0= ruleEntityWithId ) )+ otherlv_3= 'ENDSEC' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDATAKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getSemicolonKeyword_1());
            		
            // InternalIfcBrick.g:214:3: ( (lv_entityWithIds_2_0= ruleEntityWithId ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIfcBrick.g:215:4: (lv_entityWithIds_2_0= ruleEntityWithId )
            	    {
            	    // InternalIfcBrick.g:215:4: (lv_entityWithIds_2_0= ruleEntityWithId )
            	    // InternalIfcBrick.g:216:5: lv_entityWithIds_2_0= ruleEntityWithId
            	    {

            	    					newCompositeNode(grammarAccess.getDataAccess().getEntityWithIdsEntityWithIdParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_entityWithIds_2_0=ruleEntityWithId();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entityWithIds",
            	    						lv_entityWithIds_2_0,
            	    						"org.xtext.ifcbrickconvert.IfcBrick.EntityWithId");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDataAccess().getENDSECKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleEntity"
    // InternalIfcBrick.g:245:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalIfcBrick.g:245:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalIfcBrick.g:246:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalIfcBrick.g:252:1: ruleEntity returns [EObject current=null] : ( ( (lv_definition_0_0= RULE_ID ) ) ( (lv_attributeCollection_1_0= ruleAttributeCollection ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_definition_0_0=null;
        EObject lv_attributeCollection_1_0 = null;



        	enterRule();

        try {
            // InternalIfcBrick.g:258:2: ( ( ( (lv_definition_0_0= RULE_ID ) ) ( (lv_attributeCollection_1_0= ruleAttributeCollection ) ) ) )
            // InternalIfcBrick.g:259:2: ( ( (lv_definition_0_0= RULE_ID ) ) ( (lv_attributeCollection_1_0= ruleAttributeCollection ) ) )
            {
            // InternalIfcBrick.g:259:2: ( ( (lv_definition_0_0= RULE_ID ) ) ( (lv_attributeCollection_1_0= ruleAttributeCollection ) ) )
            // InternalIfcBrick.g:260:3: ( (lv_definition_0_0= RULE_ID ) ) ( (lv_attributeCollection_1_0= ruleAttributeCollection ) )
            {
            // InternalIfcBrick.g:260:3: ( (lv_definition_0_0= RULE_ID ) )
            // InternalIfcBrick.g:261:4: (lv_definition_0_0= RULE_ID )
            {
            // InternalIfcBrick.g:261:4: (lv_definition_0_0= RULE_ID )
            // InternalIfcBrick.g:262:5: lv_definition_0_0= RULE_ID
            {
            lv_definition_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_definition_0_0, grammarAccess.getEntityAccess().getDefinitionIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"definition",
            						lv_definition_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIfcBrick.g:278:3: ( (lv_attributeCollection_1_0= ruleAttributeCollection ) )
            // InternalIfcBrick.g:279:4: (lv_attributeCollection_1_0= ruleAttributeCollection )
            {
            // InternalIfcBrick.g:279:4: (lv_attributeCollection_1_0= ruleAttributeCollection )
            // InternalIfcBrick.g:280:5: lv_attributeCollection_1_0= ruleAttributeCollection
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getAttributeCollectionAttributeCollectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_attributeCollection_1_0=ruleAttributeCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"attributeCollection",
            						lv_attributeCollection_1_0,
            						"org.xtext.ifcbrickconvert.IfcBrick.AttributeCollection");
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityWithId"
    // InternalIfcBrick.g:301:1: entryRuleEntityWithId returns [EObject current=null] : iv_ruleEntityWithId= ruleEntityWithId EOF ;
    public final EObject entryRuleEntityWithId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityWithId = null;


        try {
            // InternalIfcBrick.g:301:53: (iv_ruleEntityWithId= ruleEntityWithId EOF )
            // InternalIfcBrick.g:302:2: iv_ruleEntityWithId= ruleEntityWithId EOF
            {
             newCompositeNode(grammarAccess.getEntityWithIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityWithId=ruleEntityWithId();

            state._fsp--;

             current =iv_ruleEntityWithId; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityWithId"


    // $ANTLR start "ruleEntityWithId"
    // InternalIfcBrick.g:308:1: ruleEntityWithId returns [EObject current=null] : ( ( (lv_eid_0_0= ruleEntId ) ) otherlv_1= '=' ( (lv_entity_2_0= ruleEntity ) ) otherlv_3= ';' ) ;
    public final EObject ruleEntityWithId() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_eid_0_0 = null;

        EObject lv_entity_2_0 = null;



        	enterRule();

        try {
            // InternalIfcBrick.g:314:2: ( ( ( (lv_eid_0_0= ruleEntId ) ) otherlv_1= '=' ( (lv_entity_2_0= ruleEntity ) ) otherlv_3= ';' ) )
            // InternalIfcBrick.g:315:2: ( ( (lv_eid_0_0= ruleEntId ) ) otherlv_1= '=' ( (lv_entity_2_0= ruleEntity ) ) otherlv_3= ';' )
            {
            // InternalIfcBrick.g:315:2: ( ( (lv_eid_0_0= ruleEntId ) ) otherlv_1= '=' ( (lv_entity_2_0= ruleEntity ) ) otherlv_3= ';' )
            // InternalIfcBrick.g:316:3: ( (lv_eid_0_0= ruleEntId ) ) otherlv_1= '=' ( (lv_entity_2_0= ruleEntity ) ) otherlv_3= ';'
            {
            // InternalIfcBrick.g:316:3: ( (lv_eid_0_0= ruleEntId ) )
            // InternalIfcBrick.g:317:4: (lv_eid_0_0= ruleEntId )
            {
            // InternalIfcBrick.g:317:4: (lv_eid_0_0= ruleEntId )
            // InternalIfcBrick.g:318:5: lv_eid_0_0= ruleEntId
            {

            					newCompositeNode(grammarAccess.getEntityWithIdAccess().getEidEntIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_eid_0_0=ruleEntId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityWithIdRule());
            					}
            					set(
            						current,
            						"eid",
            						lv_eid_0_0,
            						"org.xtext.ifcbrickconvert.IfcBrick.EntId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityWithIdAccess().getEqualsSignKeyword_1());
            		
            // InternalIfcBrick.g:339:3: ( (lv_entity_2_0= ruleEntity ) )
            // InternalIfcBrick.g:340:4: (lv_entity_2_0= ruleEntity )
            {
            // InternalIfcBrick.g:340:4: (lv_entity_2_0= ruleEntity )
            // InternalIfcBrick.g:341:5: lv_entity_2_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getEntityWithIdAccess().getEntityEntityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_entity_2_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityWithIdRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_2_0,
            						"org.xtext.ifcbrickconvert.IfcBrick.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityWithIdAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityWithId"


    // $ANTLR start "entryRuleEntityTerminated"
    // InternalIfcBrick.g:366:1: entryRuleEntityTerminated returns [EObject current=null] : iv_ruleEntityTerminated= ruleEntityTerminated EOF ;
    public final EObject entryRuleEntityTerminated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTerminated = null;


        try {
            // InternalIfcBrick.g:366:57: (iv_ruleEntityTerminated= ruleEntityTerminated EOF )
            // InternalIfcBrick.g:367:2: iv_ruleEntityTerminated= ruleEntityTerminated EOF
            {
             newCompositeNode(grammarAccess.getEntityTerminatedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityTerminated=ruleEntityTerminated();

            state._fsp--;

             current =iv_ruleEntityTerminated; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityTerminated"


    // $ANTLR start "ruleEntityTerminated"
    // InternalIfcBrick.g:373:1: ruleEntityTerminated returns [EObject current=null] : ( ( (lv_entity_0_0= ruleEntity ) ) otherlv_1= ';' ) ;
    public final EObject ruleEntityTerminated() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_entity_0_0 = null;



        	enterRule();

        try {
            // InternalIfcBrick.g:379:2: ( ( ( (lv_entity_0_0= ruleEntity ) ) otherlv_1= ';' ) )
            // InternalIfcBrick.g:380:2: ( ( (lv_entity_0_0= ruleEntity ) ) otherlv_1= ';' )
            {
            // InternalIfcBrick.g:380:2: ( ( (lv_entity_0_0= ruleEntity ) ) otherlv_1= ';' )
            // InternalIfcBrick.g:381:3: ( (lv_entity_0_0= ruleEntity ) ) otherlv_1= ';'
            {
            // InternalIfcBrick.g:381:3: ( (lv_entity_0_0= ruleEntity ) )
            // InternalIfcBrick.g:382:4: (lv_entity_0_0= ruleEntity )
            {
            // InternalIfcBrick.g:382:4: (lv_entity_0_0= ruleEntity )
            // InternalIfcBrick.g:383:5: lv_entity_0_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getEntityTerminatedAccess().getEntityEntityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_entity_0_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityTerminatedRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"org.xtext.ifcbrickconvert.IfcBrick.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityTerminatedAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityTerminated"


    // $ANTLR start "entryRuleAttributeCollection"
    // InternalIfcBrick.g:408:1: entryRuleAttributeCollection returns [EObject current=null] : iv_ruleAttributeCollection= ruleAttributeCollection EOF ;
    public final EObject entryRuleAttributeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeCollection = null;


        try {
            // InternalIfcBrick.g:408:60: (iv_ruleAttributeCollection= ruleAttributeCollection EOF )
            // InternalIfcBrick.g:409:2: iv_ruleAttributeCollection= ruleAttributeCollection EOF
            {
             newCompositeNode(grammarAccess.getAttributeCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeCollection=ruleAttributeCollection();

            state._fsp--;

             current =iv_ruleAttributeCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeCollection"


    // $ANTLR start "ruleAttributeCollection"
    // InternalIfcBrick.g:415:1: ruleAttributeCollection returns [EObject current=null] : (otherlv_0= '(' ( (lv_attributes_1_0= ruleAttribute ) )? (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleAttributeCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_1_0 = null;

        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalIfcBrick.g:421:2: ( (otherlv_0= '(' ( (lv_attributes_1_0= ruleAttribute ) )? (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )* otherlv_4= ')' ) )
            // InternalIfcBrick.g:422:2: (otherlv_0= '(' ( (lv_attributes_1_0= ruleAttribute ) )? (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )* otherlv_4= ')' )
            {
            // InternalIfcBrick.g:422:2: (otherlv_0= '(' ( (lv_attributes_1_0= ruleAttribute ) )? (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )* otherlv_4= ')' )
            // InternalIfcBrick.g:423:3: otherlv_0= '(' ( (lv_attributes_1_0= ruleAttribute ) )? (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeCollectionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalIfcBrick.g:427:3: ( (lv_attributes_1_0= ruleAttribute ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_NUMBER)||LA3_0==21||(LA3_0>=24 && LA3_0<=27)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIfcBrick.g:428:4: (lv_attributes_1_0= ruleAttribute )
                    {
                    // InternalIfcBrick.g:428:4: (lv_attributes_1_0= ruleAttribute )
                    // InternalIfcBrick.g:429:5: lv_attributes_1_0= ruleAttribute
                    {

                    					newCompositeNode(grammarAccess.getAttributeCollectionAccess().getAttributesAttributeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_attributes_1_0=ruleAttribute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeCollectionRule());
                    					}
                    					add(
                    						current,
                    						"attributes",
                    						lv_attributes_1_0,
                    						"org.xtext.ifcbrickconvert.IfcBrick.Attribute");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalIfcBrick.g:446:3: (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIfcBrick.g:447:4: otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAttributeCollectionAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIfcBrick.g:451:4: ( (lv_attributes_3_0= ruleAttribute ) )
            	    // InternalIfcBrick.g:452:5: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalIfcBrick.g:452:5: (lv_attributes_3_0= ruleAttribute )
            	    // InternalIfcBrick.g:453:6: lv_attributes_3_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAttributeCollectionAccess().getAttributesAttributeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAttributeCollectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_3_0,
            	    							"org.xtext.ifcbrickconvert.IfcBrick.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeCollectionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeCollection"


    // $ANTLR start "entryRuleAttribute"
    // InternalIfcBrick.g:479:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalIfcBrick.g:479:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalIfcBrick.g:480:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalIfcBrick.g:486:1: ruleAttribute returns [EObject current=null] : ( ( (lv_x_0_0= RULE_ID ) ) | ( (lv_eid_1_0= ruleEntId ) ) | (otherlv_2= '.' ( (lv_x_3_0= RULE_ID ) ) otherlv_4= '.' ) | ( (lv_c_5_0= ruleCSV ) ) | ( (lv_e_6_0= ruleEntity ) ) | ( (lv_ac_7_0= ruleAttributeCollection ) ) | ( (lv_u_8_0= '$' ) ) | ( (lv_u_9_0= '*' ) ) | ( (lv_s_10_0= RULE_XSTRING ) ) | ( (lv_i_11_0= RULE_INT ) ) | ( (lv_d_12_0= RULE_DOUBLE ) ) | ( (lv_n_13_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_u_8_0=null;
        Token lv_u_9_0=null;
        Token lv_s_10_0=null;
        Token lv_i_11_0=null;
        Token lv_d_12_0=null;
        Token lv_n_13_0=null;
        EObject lv_eid_1_0 = null;

        EObject lv_c_5_0 = null;

        EObject lv_e_6_0 = null;

        EObject lv_ac_7_0 = null;



        	enterRule();

        try {
            // InternalIfcBrick.g:492:2: ( ( ( (lv_x_0_0= RULE_ID ) ) | ( (lv_eid_1_0= ruleEntId ) ) | (otherlv_2= '.' ( (lv_x_3_0= RULE_ID ) ) otherlv_4= '.' ) | ( (lv_c_5_0= ruleCSV ) ) | ( (lv_e_6_0= ruleEntity ) ) | ( (lv_ac_7_0= ruleAttributeCollection ) ) | ( (lv_u_8_0= '$' ) ) | ( (lv_u_9_0= '*' ) ) | ( (lv_s_10_0= RULE_XSTRING ) ) | ( (lv_i_11_0= RULE_INT ) ) | ( (lv_d_12_0= RULE_DOUBLE ) ) | ( (lv_n_13_0= RULE_NUMBER ) ) ) )
            // InternalIfcBrick.g:493:2: ( ( (lv_x_0_0= RULE_ID ) ) | ( (lv_eid_1_0= ruleEntId ) ) | (otherlv_2= '.' ( (lv_x_3_0= RULE_ID ) ) otherlv_4= '.' ) | ( (lv_c_5_0= ruleCSV ) ) | ( (lv_e_6_0= ruleEntity ) ) | ( (lv_ac_7_0= ruleAttributeCollection ) ) | ( (lv_u_8_0= '$' ) ) | ( (lv_u_9_0= '*' ) ) | ( (lv_s_10_0= RULE_XSTRING ) ) | ( (lv_i_11_0= RULE_INT ) ) | ( (lv_d_12_0= RULE_DOUBLE ) ) | ( (lv_n_13_0= RULE_NUMBER ) ) )
            {
            // InternalIfcBrick.g:493:2: ( ( (lv_x_0_0= RULE_ID ) ) | ( (lv_eid_1_0= ruleEntId ) ) | (otherlv_2= '.' ( (lv_x_3_0= RULE_ID ) ) otherlv_4= '.' ) | ( (lv_c_5_0= ruleCSV ) ) | ( (lv_e_6_0= ruleEntity ) ) | ( (lv_ac_7_0= ruleAttributeCollection ) ) | ( (lv_u_8_0= '$' ) ) | ( (lv_u_9_0= '*' ) ) | ( (lv_s_10_0= RULE_XSTRING ) ) | ( (lv_i_11_0= RULE_INT ) ) | ( (lv_d_12_0= RULE_DOUBLE ) ) | ( (lv_n_13_0= RULE_NUMBER ) ) )
            int alt5=12;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalIfcBrick.g:494:3: ( (lv_x_0_0= RULE_ID ) )
                    {
                    // InternalIfcBrick.g:494:3: ( (lv_x_0_0= RULE_ID ) )
                    // InternalIfcBrick.g:495:4: (lv_x_0_0= RULE_ID )
                    {
                    // InternalIfcBrick.g:495:4: (lv_x_0_0= RULE_ID )
                    // InternalIfcBrick.g:496:5: lv_x_0_0= RULE_ID
                    {
                    lv_x_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_x_0_0, grammarAccess.getAttributeAccess().getXIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"x",
                    						lv_x_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIfcBrick.g:513:3: ( (lv_eid_1_0= ruleEntId ) )
                    {
                    // InternalIfcBrick.g:513:3: ( (lv_eid_1_0= ruleEntId ) )
                    // InternalIfcBrick.g:514:4: (lv_eid_1_0= ruleEntId )
                    {
                    // InternalIfcBrick.g:514:4: (lv_eid_1_0= ruleEntId )
                    // InternalIfcBrick.g:515:5: lv_eid_1_0= ruleEntId
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getEidEntIdParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_eid_1_0=ruleEntId();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"eid",
                    						lv_eid_1_0,
                    						"org.xtext.ifcbrickconvert.IfcBrick.EntId");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIfcBrick.g:533:3: (otherlv_2= '.' ( (lv_x_3_0= RULE_ID ) ) otherlv_4= '.' )
                    {
                    // InternalIfcBrick.g:533:3: (otherlv_2= '.' ( (lv_x_3_0= RULE_ID ) ) otherlv_4= '.' )
                    // InternalIfcBrick.g:534:4: otherlv_2= '.' ( (lv_x_3_0= RULE_ID ) ) otherlv_4= '.'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getFullStopKeyword_2_0());
                    			
                    // InternalIfcBrick.g:538:4: ( (lv_x_3_0= RULE_ID ) )
                    // InternalIfcBrick.g:539:5: (lv_x_3_0= RULE_ID )
                    {
                    // InternalIfcBrick.g:539:5: (lv_x_3_0= RULE_ID )
                    // InternalIfcBrick.g:540:6: lv_x_3_0= RULE_ID
                    {
                    lv_x_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_x_3_0, grammarAccess.getAttributeAccess().getXIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x",
                    							lv_x_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getFullStopKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIfcBrick.g:562:3: ( (lv_c_5_0= ruleCSV ) )
                    {
                    // InternalIfcBrick.g:562:3: ( (lv_c_5_0= ruleCSV ) )
                    // InternalIfcBrick.g:563:4: (lv_c_5_0= ruleCSV )
                    {
                    // InternalIfcBrick.g:563:4: (lv_c_5_0= ruleCSV )
                    // InternalIfcBrick.g:564:5: lv_c_5_0= ruleCSV
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getCCSVParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_c_5_0=ruleCSV();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"c",
                    						lv_c_5_0,
                    						"org.xtext.ifcbrickconvert.IfcBrick.CSV");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalIfcBrick.g:582:3: ( (lv_e_6_0= ruleEntity ) )
                    {
                    // InternalIfcBrick.g:582:3: ( (lv_e_6_0= ruleEntity ) )
                    // InternalIfcBrick.g:583:4: (lv_e_6_0= ruleEntity )
                    {
                    // InternalIfcBrick.g:583:4: (lv_e_6_0= ruleEntity )
                    // InternalIfcBrick.g:584:5: lv_e_6_0= ruleEntity
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getEEntityParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_e_6_0=ruleEntity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"e",
                    						lv_e_6_0,
                    						"org.xtext.ifcbrickconvert.IfcBrick.Entity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalIfcBrick.g:602:3: ( (lv_ac_7_0= ruleAttributeCollection ) )
                    {
                    // InternalIfcBrick.g:602:3: ( (lv_ac_7_0= ruleAttributeCollection ) )
                    // InternalIfcBrick.g:603:4: (lv_ac_7_0= ruleAttributeCollection )
                    {
                    // InternalIfcBrick.g:603:4: (lv_ac_7_0= ruleAttributeCollection )
                    // InternalIfcBrick.g:604:5: lv_ac_7_0= ruleAttributeCollection
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getAcAttributeCollectionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ac_7_0=ruleAttributeCollection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"ac",
                    						lv_ac_7_0,
                    						"org.xtext.ifcbrickconvert.IfcBrick.AttributeCollection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalIfcBrick.g:622:3: ( (lv_u_8_0= '$' ) )
                    {
                    // InternalIfcBrick.g:622:3: ( (lv_u_8_0= '$' ) )
                    // InternalIfcBrick.g:623:4: (lv_u_8_0= '$' )
                    {
                    // InternalIfcBrick.g:623:4: (lv_u_8_0= '$' )
                    // InternalIfcBrick.g:624:5: lv_u_8_0= '$'
                    {
                    lv_u_8_0=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_u_8_0, grammarAccess.getAttributeAccess().getUDollarSignKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "u", lv_u_8_0, "$");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalIfcBrick.g:637:3: ( (lv_u_9_0= '*' ) )
                    {
                    // InternalIfcBrick.g:637:3: ( (lv_u_9_0= '*' ) )
                    // InternalIfcBrick.g:638:4: (lv_u_9_0= '*' )
                    {
                    // InternalIfcBrick.g:638:4: (lv_u_9_0= '*' )
                    // InternalIfcBrick.g:639:5: lv_u_9_0= '*'
                    {
                    lv_u_9_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_u_9_0, grammarAccess.getAttributeAccess().getUAsteriskKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "u", lv_u_9_0, "*");
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalIfcBrick.g:652:3: ( (lv_s_10_0= RULE_XSTRING ) )
                    {
                    // InternalIfcBrick.g:652:3: ( (lv_s_10_0= RULE_XSTRING ) )
                    // InternalIfcBrick.g:653:4: (lv_s_10_0= RULE_XSTRING )
                    {
                    // InternalIfcBrick.g:653:4: (lv_s_10_0= RULE_XSTRING )
                    // InternalIfcBrick.g:654:5: lv_s_10_0= RULE_XSTRING
                    {
                    lv_s_10_0=(Token)match(input,RULE_XSTRING,FOLLOW_2); 

                    					newLeafNode(lv_s_10_0, grammarAccess.getAttributeAccess().getSXSTRINGTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"s",
                    						lv_s_10_0,
                    						"org.xtext.ifcbrickconvert.IfcBrick.XSTRING");
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalIfcBrick.g:671:3: ( (lv_i_11_0= RULE_INT ) )
                    {
                    // InternalIfcBrick.g:671:3: ( (lv_i_11_0= RULE_INT ) )
                    // InternalIfcBrick.g:672:4: (lv_i_11_0= RULE_INT )
                    {
                    // InternalIfcBrick.g:672:4: (lv_i_11_0= RULE_INT )
                    // InternalIfcBrick.g:673:5: lv_i_11_0= RULE_INT
                    {
                    lv_i_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_i_11_0, grammarAccess.getAttributeAccess().getIINTTerminalRuleCall_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"i",
                    						lv_i_11_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalIfcBrick.g:690:3: ( (lv_d_12_0= RULE_DOUBLE ) )
                    {
                    // InternalIfcBrick.g:690:3: ( (lv_d_12_0= RULE_DOUBLE ) )
                    // InternalIfcBrick.g:691:4: (lv_d_12_0= RULE_DOUBLE )
                    {
                    // InternalIfcBrick.g:691:4: (lv_d_12_0= RULE_DOUBLE )
                    // InternalIfcBrick.g:692:5: lv_d_12_0= RULE_DOUBLE
                    {
                    lv_d_12_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_d_12_0, grammarAccess.getAttributeAccess().getDDOUBLETerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"d",
                    						lv_d_12_0,
                    						"org.xtext.ifcbrickconvert.IfcBrick.DOUBLE");
                    				

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalIfcBrick.g:709:3: ( (lv_n_13_0= RULE_NUMBER ) )
                    {
                    // InternalIfcBrick.g:709:3: ( (lv_n_13_0= RULE_NUMBER ) )
                    // InternalIfcBrick.g:710:4: (lv_n_13_0= RULE_NUMBER )
                    {
                    // InternalIfcBrick.g:710:4: (lv_n_13_0= RULE_NUMBER )
                    // InternalIfcBrick.g:711:5: lv_n_13_0= RULE_NUMBER
                    {
                    lv_n_13_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_n_13_0, grammarAccess.getAttributeAccess().getNNUMBERTerminalRuleCall_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"n",
                    						lv_n_13_0,
                    						"org.xtext.ifcbrickconvert.IfcBrick.NUMBER");
                    				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntId"
    // InternalIfcBrick.g:731:1: entryRuleEntId returns [EObject current=null] : iv_ruleEntId= ruleEntId EOF ;
    public final EObject entryRuleEntId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntId = null;


        try {
            // InternalIfcBrick.g:731:46: (iv_ruleEntId= ruleEntId EOF )
            // InternalIfcBrick.g:732:2: iv_ruleEntId= ruleEntId EOF
            {
             newCompositeNode(grammarAccess.getEntIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntId=ruleEntId();

            state._fsp--;

             current =iv_ruleEntId; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntId"


    // $ANTLR start "ruleEntId"
    // InternalIfcBrick.g:738:1: ruleEntId returns [EObject current=null] : (otherlv_0= '#' ( (lv_id_1_0= RULE_INT ) ) ) ;
    public final EObject ruleEntId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalIfcBrick.g:744:2: ( (otherlv_0= '#' ( (lv_id_1_0= RULE_INT ) ) ) )
            // InternalIfcBrick.g:745:2: (otherlv_0= '#' ( (lv_id_1_0= RULE_INT ) ) )
            {
            // InternalIfcBrick.g:745:2: (otherlv_0= '#' ( (lv_id_1_0= RULE_INT ) ) )
            // InternalIfcBrick.g:746:3: otherlv_0= '#' ( (lv_id_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getEntIdAccess().getNumberSignKeyword_0());
            		
            // InternalIfcBrick.g:750:3: ( (lv_id_1_0= RULE_INT ) )
            // InternalIfcBrick.g:751:4: (lv_id_1_0= RULE_INT )
            {
            // InternalIfcBrick.g:751:4: (lv_id_1_0= RULE_INT )
            // InternalIfcBrick.g:752:5: lv_id_1_0= RULE_INT
            {
            lv_id_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getEntIdAccess().getIdINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntIdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleEntId"


    // $ANTLR start "entryRuleCSV"
    // InternalIfcBrick.g:772:1: entryRuleCSV returns [EObject current=null] : iv_ruleCSV= ruleCSV EOF ;
    public final EObject entryRuleCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSV = null;


        try {
            // InternalIfcBrick.g:772:44: (iv_ruleCSV= ruleCSV EOF )
            // InternalIfcBrick.g:773:2: iv_ruleCSV= ruleCSV EOF
            {
             newCompositeNode(grammarAccess.getCSVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSV=ruleCSV();

            state._fsp--;

             current =iv_ruleCSV; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSV"


    // $ANTLR start "ruleCSV"
    // InternalIfcBrick.g:779:1: ruleCSV returns [EObject current=null] : ( ( (lv_a_0_0= RULE_INT ) ) otherlv_1= ';' ( (lv_b_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCSV() throws RecognitionException {
        EObject current = null;

        Token lv_a_0_0=null;
        Token otherlv_1=null;
        Token lv_b_2_0=null;


        	enterRule();

        try {
            // InternalIfcBrick.g:785:2: ( ( ( (lv_a_0_0= RULE_INT ) ) otherlv_1= ';' ( (lv_b_2_0= RULE_INT ) ) ) )
            // InternalIfcBrick.g:786:2: ( ( (lv_a_0_0= RULE_INT ) ) otherlv_1= ';' ( (lv_b_2_0= RULE_INT ) ) )
            {
            // InternalIfcBrick.g:786:2: ( ( (lv_a_0_0= RULE_INT ) ) otherlv_1= ';' ( (lv_b_2_0= RULE_INT ) ) )
            // InternalIfcBrick.g:787:3: ( (lv_a_0_0= RULE_INT ) ) otherlv_1= ';' ( (lv_b_2_0= RULE_INT ) )
            {
            // InternalIfcBrick.g:787:3: ( (lv_a_0_0= RULE_INT ) )
            // InternalIfcBrick.g:788:4: (lv_a_0_0= RULE_INT )
            {
            // InternalIfcBrick.g:788:4: (lv_a_0_0= RULE_INT )
            // InternalIfcBrick.g:789:5: lv_a_0_0= RULE_INT
            {
            lv_a_0_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_a_0_0, grammarAccess.getCSVAccess().getAINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCSVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"a",
            						lv_a_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCSVAccess().getSemicolonKeyword_1());
            		
            // InternalIfcBrick.g:809:3: ( (lv_b_2_0= RULE_INT ) )
            // InternalIfcBrick.g:810:4: (lv_b_2_0= RULE_INT )
            {
            // InternalIfcBrick.g:810:4: (lv_b_2_0= RULE_INT )
            // InternalIfcBrick.g:811:5: lv_b_2_0= RULE_INT
            {
            lv_b_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_b_2_0, grammarAccess.getCSVAccess().getBINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCSVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"b",
            						lv_b_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleCSV"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\uffff\1\13\2\uffff\1\15\12\uffff";
    static final String dfa_3s = "\1\4\1\25\2\uffff\1\17\12\uffff";
    static final String dfa_4s = "\1\33\1\27\2\uffff\1\27\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\13\1\14\1\1\1\5\1\12\1\4";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\10\1\4\1\11\1\12\14\uffff\1\5\2\uffff\1\3\1\6\1\7\1\2",
            "\1\14\2\13",
            "",
            "",
            "\1\16\6\uffff\2\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "493:2: ( ( (lv_x_0_0= RULE_ID ) ) | ( (lv_eid_1_0= ruleEntId ) ) | (otherlv_2= '.' ( (lv_x_3_0= RULE_ID ) ) otherlv_4= '.' ) | ( (lv_c_5_0= ruleCSV ) ) | ( (lv_e_6_0= ruleEntity ) ) | ( (lv_ac_7_0= ruleAttributeCollection ) ) | ( (lv_u_8_0= '$' ) ) | ( (lv_u_9_0= '*' ) ) | ( (lv_s_10_0= RULE_XSTRING ) ) | ( (lv_i_11_0= RULE_INT ) ) | ( (lv_d_12_0= RULE_DOUBLE ) ) | ( (lv_n_13_0= RULE_NUMBER ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000FE001F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000F2001F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});

}