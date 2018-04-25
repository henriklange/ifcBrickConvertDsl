/*
 * generated by Xtext 2.12.0
 */
grammar InternalIfcBrick;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.ifcbrickconvert.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ISO-10303-21'
		{
			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getISO1030321Keyword_0());
		}
		otherlv_1=';'
		{
			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getSemicolonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getHeaderHeaderParserRuleCall_2_0());
				}
				lv_header_2_0=ruleHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"header",
						lv_header_2_0,
						"org.xtext.ifcbrickconvert.IfcBrick.Header");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getDataDataParserRuleCall_3_0());
				}
				lv_data_3_0=ruleData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"data",
						lv_data_3_0,
						"org.xtext.ifcbrickconvert.IfcBrick.Data");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='END-ISO-10303-21'
		{
			newLeafNode(otherlv_4, grammarAccess.getRootAccess().getENDISO1030321Keyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getRootAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleHeader
entryRuleHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	iv_ruleHeader=ruleHeader
	{ $current=$iv_ruleHeader.current; }
	EOF;

// Rule Header
ruleHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='HEADER'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getHEADERKeyword_0());
		}
		otherlv_1=';'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getSemicolonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderAccess().getHeaderEntitiesEntityTerminatedParserRuleCall_2_0());
				}
				lv_headerEntities_2_0=ruleEntityTerminated
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderRule());
					}
					add(
						$current,
						"headerEntities",
						lv_headerEntities_2_0,
						"org.xtext.ifcbrickconvert.IfcBrick.EntityTerminated");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='ENDSEC'
		{
			newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getENDSECKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleData
entryRuleData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataRule()); }
	iv_ruleData=ruleData
	{ $current=$iv_ruleData.current; }
	EOF;

// Rule Data
ruleData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DATA'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDATAKeyword_0());
		}
		otherlv_1=';'
		{
			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getSemicolonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDataAccess().getEntityWithIdsEntityWithIdParserRuleCall_2_0());
				}
				lv_entityWithIds_2_0=ruleEntityWithId
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataRule());
					}
					add(
						$current,
						"entityWithIds",
						lv_entityWithIds_2_0,
						"org.xtext.ifcbrickconvert.IfcBrick.EntityWithId");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='ENDSEC'
		{
			newLeafNode(otherlv_3, grammarAccess.getDataAccess().getENDSECKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getDataAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_definition_0_0=RULE_ID
				{
					newLeafNode(lv_definition_0_0, grammarAccess.getEntityAccess().getDefinitionIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"definition",
						lv_definition_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getAttributeCollectionAttributeCollectionParserRuleCall_1_0());
				}
				lv_attributeCollection_1_0=ruleAttributeCollection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"attributeCollection",
						lv_attributeCollection_1_0,
						"org.xtext.ifcbrickconvert.IfcBrick.AttributeCollection");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEntityWithId
entryRuleEntityWithId returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityWithIdRule()); }
	iv_ruleEntityWithId=ruleEntityWithId
	{ $current=$iv_ruleEntityWithId.current; }
	EOF;

// Rule EntityWithId
ruleEntityWithId returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityWithIdAccess().getEidEntIdParserRuleCall_0_0());
				}
				lv_eid_0_0=ruleEntId
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityWithIdRule());
					}
					set(
						$current,
						"eid",
						lv_eid_0_0,
						"org.xtext.ifcbrickconvert.IfcBrick.EntId");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityWithIdAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityWithIdAccess().getEntityEntityParserRuleCall_2_0());
				}
				lv_entity_2_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityWithIdRule());
					}
					set(
						$current,
						"entity",
						lv_entity_2_0,
						"org.xtext.ifcbrickconvert.IfcBrick.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getEntityWithIdAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleEntityTerminated
entryRuleEntityTerminated returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityTerminatedRule()); }
	iv_ruleEntityTerminated=ruleEntityTerminated
	{ $current=$iv_ruleEntityTerminated.current; }
	EOF;

// Rule EntityTerminated
ruleEntityTerminated returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityTerminatedAccess().getEntityEntityParserRuleCall_0_0());
				}
				lv_entity_0_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityTerminatedRule());
					}
					set(
						$current,
						"entity",
						lv_entity_0_0,
						"org.xtext.ifcbrickconvert.IfcBrick.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=';'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityTerminatedAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleAttributeCollection
entryRuleAttributeCollection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeCollectionRule()); }
	iv_ruleAttributeCollection=ruleAttributeCollection
	{ $current=$iv_ruleAttributeCollection.current; }
	EOF;

// Rule AttributeCollection
ruleAttributeCollection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeCollectionAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeCollectionAccess().getAttributesAttributeParserRuleCall_1_0());
				}
				lv_attributes_1_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeCollectionRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_1_0,
						"org.xtext.ifcbrickconvert.IfcBrick.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getAttributeCollectionAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributeCollectionAccess().getAttributesAttributeParserRuleCall_2_1_0());
					}
					lv_attributes_3_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributeCollectionRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_3_0,
							"org.xtext.ifcbrickconvert.IfcBrick.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getAttributeCollectionAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_x_0_0=RULE_ID
				{
					newLeafNode(lv_x_0_0, grammarAccess.getAttributeAccess().getXIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getEidEntIdParserRuleCall_1_0());
				}
				lv_eid_1_0=ruleEntId
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"eid",
						lv_eid_1_0,
						"org.xtext.ifcbrickconvert.IfcBrick.EntId");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_2='.'
			{
				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getFullStopKeyword_2_0());
			}
			(
				(
					lv_x_3_0=RULE_ID
					{
						newLeafNode(lv_x_3_0, grammarAccess.getAttributeAccess().getXIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttributeRule());
						}
						setWithLastConsumed(
							$current,
							"x",
							lv_x_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_4='.'
			{
				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getFullStopKeyword_2_2());
			}
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getCCSVParserRuleCall_3_0());
				}
				lv_c_5_0=ruleCSV
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"c",
						lv_c_5_0,
						"org.xtext.ifcbrickconvert.IfcBrick.CSV");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getEEntityParserRuleCall_4_0());
				}
				lv_e_6_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"e",
						lv_e_6_0,
						"org.xtext.ifcbrickconvert.IfcBrick.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getAcAttributeCollectionParserRuleCall_5_0());
				}
				lv_ac_7_0=ruleAttributeCollection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"ac",
						lv_ac_7_0,
						"org.xtext.ifcbrickconvert.IfcBrick.AttributeCollection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				lv_u_8_0='$'
				{
					newLeafNode(lv_u_8_0, grammarAccess.getAttributeAccess().getUDollarSignKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed($current, "u", lv_u_8_0, "\$");
				}
			)
		)
		    |
		(
			(
				lv_u_9_0='*'
				{
					newLeafNode(lv_u_9_0, grammarAccess.getAttributeAccess().getUAsteriskKeyword_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed($current, "u", lv_u_9_0, "*");
				}
			)
		)
		    |
		(
			(
				lv_s_10_0=RULE_XSTRING
				{
					newLeafNode(lv_s_10_0, grammarAccess.getAttributeAccess().getSXSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"s",
						lv_s_10_0,
						"org.xtext.ifcbrickconvert.IfcBrick.XSTRING");
				}
			)
		)
		    |
		(
			(
				lv_i_11_0=RULE_INT
				{
					newLeafNode(lv_i_11_0, grammarAccess.getAttributeAccess().getIINTTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"i",
						lv_i_11_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		    |
		(
			(
				lv_d_12_0=RULE_DOUBLE
				{
					newLeafNode(lv_d_12_0, grammarAccess.getAttributeAccess().getDDOUBLETerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"d",
						lv_d_12_0,
						"org.xtext.ifcbrickconvert.IfcBrick.DOUBLE");
				}
			)
		)
		    |
		(
			(
				lv_n_13_0=RULE_NUMBER
				{
					newLeafNode(lv_n_13_0, grammarAccess.getAttributeAccess().getNNUMBERTerminalRuleCall_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"n",
						lv_n_13_0,
						"org.xtext.ifcbrickconvert.IfcBrick.NUMBER");
				}
			)
		)
	)
;

// Entry rule entryRuleEntId
entryRuleEntId returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntIdRule()); }
	iv_ruleEntId=ruleEntId
	{ $current=$iv_ruleEntId.current; }
	EOF;

// Rule EntId
ruleEntId returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntIdAccess().getNumberSignKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_INT
				{
					newLeafNode(lv_id_1_0, grammarAccess.getEntIdAccess().getIdINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntIdRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleCSV
entryRuleCSV returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCSVRule()); }
	iv_ruleCSV=ruleCSV
	{ $current=$iv_ruleCSV.current; }
	EOF;

// Rule CSV
ruleCSV returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_a_0_0=RULE_INT
				{
					newLeafNode(lv_a_0_0, grammarAccess.getCSVAccess().getAINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCSVRule());
					}
					setWithLastConsumed(
						$current,
						"a",
						lv_a_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1=';'
		{
			newLeafNode(otherlv_1, grammarAccess.getCSVAccess().getSemicolonKeyword_1());
		}
		(
			(
				lv_b_2_0=RULE_INT
				{
					newLeafNode(lv_b_2_0, grammarAccess.getCSVAccess().getBINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCSVRule());
					}
					setWithLastConsumed(
						$current,
						"b",
						lv_b_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_DOUBLE : RULE_INT '.' RULE_INT? ('E' '-'? ('0'..'9')*)?;

RULE_NUMBER : '-' RULE_INT ('.' RULE_INT*)? ('E' '-'? RULE_INT)?;

RULE_XSTRING : ('\'' ( options {greedy=false;} : . )*'\'')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;