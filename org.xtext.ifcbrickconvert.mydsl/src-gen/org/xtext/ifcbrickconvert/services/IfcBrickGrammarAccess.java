/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ifcbrickconvert.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class IfcBrickGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.Root");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cISO1030321Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cHeaderAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cHeaderHeaderParserRuleCall_2_0 = (RuleCall)cHeaderAssignment_2.eContents().get(0);
		private final Assignment cDataAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDataDataParserRuleCall_3_0 = (RuleCall)cDataAssignment_3.eContents().get(0);
		private final Keyword cENDISO1030321Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Root:
		//	'ISO-10303-21' ';'
		//	header=Header
		//	data=Data
		//	'END-ISO-10303-21' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'ISO-10303-21' ';' header=Header data=Data 'END-ISO-10303-21' ';'
		public Group getGroup() { return cGroup; }
		
		//'ISO-10303-21'
		public Keyword getISO1030321Keyword_0() { return cISO1030321Keyword_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
		
		//header=Header
		public Assignment getHeaderAssignment_2() { return cHeaderAssignment_2; }
		
		//Header
		public RuleCall getHeaderHeaderParserRuleCall_2_0() { return cHeaderHeaderParserRuleCall_2_0; }
		
		//data=Data
		public Assignment getDataAssignment_3() { return cDataAssignment_3; }
		
		//Data
		public RuleCall getDataDataParserRuleCall_3_0() { return cDataDataParserRuleCall_3_0; }
		
		//'END-ISO-10303-21'
		public Keyword getENDISO1030321Keyword_4() { return cENDISO1030321Keyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class HeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.Header");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHEADERKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cHeaderEntitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cHeaderEntitiesEntityTerminatedParserRuleCall_2_0 = (RuleCall)cHeaderEntitiesAssignment_2.eContents().get(0);
		private final Keyword cENDSECKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Header:
		//	'HEADER' ';'
		//	headerEntities+=EntityTerminated+
		//	'ENDSEC' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'HEADER' ';' headerEntities+=EntityTerminated+ 'ENDSEC' ';'
		public Group getGroup() { return cGroup; }
		
		//'HEADER'
		public Keyword getHEADERKeyword_0() { return cHEADERKeyword_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
		
		//headerEntities+=EntityTerminated+
		public Assignment getHeaderEntitiesAssignment_2() { return cHeaderEntitiesAssignment_2; }
		
		//EntityTerminated
		public RuleCall getHeaderEntitiesEntityTerminatedParserRuleCall_2_0() { return cHeaderEntitiesEntityTerminatedParserRuleCall_2_0; }
		
		//'ENDSEC'
		public Keyword getENDSECKeyword_3() { return cENDSECKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class DataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.Data");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDATAKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEntityWithIdsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEntityWithIdsEntityWithIdParserRuleCall_2_0 = (RuleCall)cEntityWithIdsAssignment_2.eContents().get(0);
		private final Keyword cENDSECKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Data:
		//	'DATA' ';'
		//	entityWithIds+=EntityWithId+
		//	'ENDSEC' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'DATA' ';' entityWithIds+=EntityWithId+ 'ENDSEC' ';'
		public Group getGroup() { return cGroup; }
		
		//'DATA'
		public Keyword getDATAKeyword_0() { return cDATAKeyword_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
		
		//entityWithIds+=EntityWithId+
		public Assignment getEntityWithIdsAssignment_2() { return cEntityWithIdsAssignment_2; }
		
		//EntityWithId
		public RuleCall getEntityWithIdsEntityWithIdParserRuleCall_2_0() { return cEntityWithIdsEntityWithIdParserRuleCall_2_0; }
		
		//'ENDSEC'
		public Keyword getENDSECKeyword_3() { return cENDSECKeyword_3; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDefinitionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDefinitionIDTerminalRuleCall_0_0 = (RuleCall)cDefinitionAssignment_0.eContents().get(0);
		private final Assignment cAttributeCollectionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttributeCollectionAttributeCollectionParserRuleCall_1_0 = (RuleCall)cAttributeCollectionAssignment_1.eContents().get(0);
		
		//Entity:
		//	definition=ID attributeCollection=AttributeCollection;
		@Override public ParserRule getRule() { return rule; }
		
		//definition=ID attributeCollection=AttributeCollection
		public Group getGroup() { return cGroup; }
		
		//definition=ID
		public Assignment getDefinitionAssignment_0() { return cDefinitionAssignment_0; }
		
		//ID
		public RuleCall getDefinitionIDTerminalRuleCall_0_0() { return cDefinitionIDTerminalRuleCall_0_0; }
		
		//attributeCollection=AttributeCollection
		public Assignment getAttributeCollectionAssignment_1() { return cAttributeCollectionAssignment_1; }
		
		//AttributeCollection
		public RuleCall getAttributeCollectionAttributeCollectionParserRuleCall_1_0() { return cAttributeCollectionAttributeCollectionParserRuleCall_1_0; }
	}
	public class EntityWithIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.EntityWithId");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEidAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEidEntIdParserRuleCall_0_0 = (RuleCall)cEidAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEntityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEntityEntityParserRuleCall_2_0 = (RuleCall)cEntityAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EntityWithId:
		//	eid=EntId '=' entity=Entity ';';
		@Override public ParserRule getRule() { return rule; }
		
		//eid=EntId '=' entity=Entity ';'
		public Group getGroup() { return cGroup; }
		
		//eid=EntId
		public Assignment getEidAssignment_0() { return cEidAssignment_0; }
		
		//EntId
		public RuleCall getEidEntIdParserRuleCall_0_0() { return cEidEntIdParserRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//entity=Entity
		public Assignment getEntityAssignment_2() { return cEntityAssignment_2; }
		
		//Entity
		public RuleCall getEntityEntityParserRuleCall_2_0() { return cEntityEntityParserRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class EntityTerminatedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.EntityTerminated");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEntityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEntityEntityParserRuleCall_0_0 = (RuleCall)cEntityAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//EntityTerminated:
		//	entity=Entity ';';
		@Override public ParserRule getRule() { return rule; }
		
		//entity=Entity ';'
		public Group getGroup() { return cGroup; }
		
		//entity=Entity
		public Assignment getEntityAssignment_0() { return cEntityAssignment_0; }
		
		//Entity
		public RuleCall getEntityEntityParserRuleCall_0_0() { return cEntityEntityParserRuleCall_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class AttributeCollectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.AttributeCollection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAttributesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_1_0 = (RuleCall)cAttributesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAttributesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_2_1_0 = (RuleCall)cAttributesAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AttributeCollection:
		//	'(' attributes+=Attribute? (',' attributes+=Attribute)* ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' attributes+=Attribute? (',' attributes+=Attribute)* ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//attributes+=Attribute?
		public Assignment getAttributesAssignment_1() { return cAttributesAssignment_1; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_1_0() { return cAttributesAttributeParserRuleCall_1_0; }
		
		//(',' attributes+=Attribute)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//attributes+=Attribute
		public Assignment getAttributesAssignment_2_1() { return cAttributesAssignment_2_1; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_1_0() { return cAttributesAttributeParserRuleCall_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.Attribute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cXAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cXIDTerminalRuleCall_0_0 = (RuleCall)cXAssignment_0.eContents().get(0);
		private final Assignment cEidAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cEidEntIdParserRuleCall_1_0 = (RuleCall)cEidAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cXAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cXIDTerminalRuleCall_2_1_0 = (RuleCall)cXAssignment_2_1.eContents().get(0);
		private final Keyword cFullStopKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cCAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cCCSVParserRuleCall_3_0 = (RuleCall)cCAssignment_3.eContents().get(0);
		private final Assignment cEAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cEEntityParserRuleCall_4_0 = (RuleCall)cEAssignment_4.eContents().get(0);
		private final Assignment cAcAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cAcAttributeCollectionParserRuleCall_5_0 = (RuleCall)cAcAssignment_5.eContents().get(0);
		private final Assignment cUAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final Keyword cUDollarSignKeyword_6_0 = (Keyword)cUAssignment_6.eContents().get(0);
		private final Assignment cUAssignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final Keyword cUAsteriskKeyword_7_0 = (Keyword)cUAssignment_7.eContents().get(0);
		private final Assignment cSAssignment_8 = (Assignment)cAlternatives.eContents().get(8);
		private final RuleCall cSXSTRINGTerminalRuleCall_8_0 = (RuleCall)cSAssignment_8.eContents().get(0);
		private final Assignment cIAssignment_9 = (Assignment)cAlternatives.eContents().get(9);
		private final RuleCall cIINTTerminalRuleCall_9_0 = (RuleCall)cIAssignment_9.eContents().get(0);
		private final Assignment cDAssignment_10 = (Assignment)cAlternatives.eContents().get(10);
		private final RuleCall cDDOUBLETerminalRuleCall_10_0 = (RuleCall)cDAssignment_10.eContents().get(0);
		private final Assignment cNAssignment_11 = (Assignment)cAlternatives.eContents().get(11);
		private final RuleCall cNNUMBERTerminalRuleCall_11_0 = (RuleCall)cNAssignment_11.eContents().get(0);
		
		//Attribute:
		//	x=ID | eid=EntId | '.' x=ID '.'
		//	| c=CSV | e=Entity | ac=AttributeCollection
		//	| u='$' | u='*' | s=XSTRING
		//	| i=INT | d=DOUBLE | n=NUMBER;
		@Override public ParserRule getRule() { return rule; }
		
		//x=ID | eid=EntId | '.' x=ID '.' | c=CSV | e=Entity | ac=AttributeCollection | u='$' | u='*' | s=XSTRING | i=INT |
		//d=DOUBLE | n=NUMBER
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//x=ID
		public Assignment getXAssignment_0() { return cXAssignment_0; }
		
		//ID
		public RuleCall getXIDTerminalRuleCall_0_0() { return cXIDTerminalRuleCall_0_0; }
		
		//eid=EntId
		public Assignment getEidAssignment_1() { return cEidAssignment_1; }
		
		//EntId
		public RuleCall getEidEntIdParserRuleCall_1_0() { return cEidEntIdParserRuleCall_1_0; }
		
		//'.' x=ID '.'
		public Group getGroup_2() { return cGroup_2; }
		
		//'.'
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }
		
		//x=ID
		public Assignment getXAssignment_2_1() { return cXAssignment_2_1; }
		
		//ID
		public RuleCall getXIDTerminalRuleCall_2_1_0() { return cXIDTerminalRuleCall_2_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_2_2() { return cFullStopKeyword_2_2; }
		
		//c=CSV
		public Assignment getCAssignment_3() { return cCAssignment_3; }
		
		//CSV
		public RuleCall getCCSVParserRuleCall_3_0() { return cCCSVParserRuleCall_3_0; }
		
		//e=Entity
		public Assignment getEAssignment_4() { return cEAssignment_4; }
		
		//Entity
		public RuleCall getEEntityParserRuleCall_4_0() { return cEEntityParserRuleCall_4_0; }
		
		//ac=AttributeCollection
		public Assignment getAcAssignment_5() { return cAcAssignment_5; }
		
		//AttributeCollection
		public RuleCall getAcAttributeCollectionParserRuleCall_5_0() { return cAcAttributeCollectionParserRuleCall_5_0; }
		
		//u='$'
		public Assignment getUAssignment_6() { return cUAssignment_6; }
		
		//'$'
		public Keyword getUDollarSignKeyword_6_0() { return cUDollarSignKeyword_6_0; }
		
		//u='*'
		public Assignment getUAssignment_7() { return cUAssignment_7; }
		
		//'*'
		public Keyword getUAsteriskKeyword_7_0() { return cUAsteriskKeyword_7_0; }
		
		//s=XSTRING
		public Assignment getSAssignment_8() { return cSAssignment_8; }
		
		//XSTRING
		public RuleCall getSXSTRINGTerminalRuleCall_8_0() { return cSXSTRINGTerminalRuleCall_8_0; }
		
		//i=INT
		public Assignment getIAssignment_9() { return cIAssignment_9; }
		
		//INT
		public RuleCall getIINTTerminalRuleCall_9_0() { return cIINTTerminalRuleCall_9_0; }
		
		//d=DOUBLE
		public Assignment getDAssignment_10() { return cDAssignment_10; }
		
		//DOUBLE
		public RuleCall getDDOUBLETerminalRuleCall_10_0() { return cDDOUBLETerminalRuleCall_10_0; }
		
		//n=NUMBER
		public Assignment getNAssignment_11() { return cNAssignment_11; }
		
		//NUMBER
		public RuleCall getNNUMBERTerminalRuleCall_11_0() { return cNNUMBERTerminalRuleCall_11_0; }
	}
	public class EntIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.EntId");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdINTTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		
		//EntId:
		//	'#' id=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'#' id=INT
		public Group getGroup() { return cGroup; }
		
		//'#'
		public Keyword getNumberSignKeyword_0() { return cNumberSignKeyword_0; }
		
		//id=INT
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//INT
		public RuleCall getIdINTTerminalRuleCall_1_0() { return cIdINTTerminalRuleCall_1_0; }
	}
	public class CSVElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.CSV");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAINTTerminalRuleCall_0_0 = (RuleCall)cAAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBINTTerminalRuleCall_2_0 = (RuleCall)cBAssignment_2.eContents().get(0);
		
		//CSV:
		//	a=INT ';' b=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//a=INT ';' b=INT
		public Group getGroup() { return cGroup; }
		
		//a=INT
		public Assignment getAAssignment_0() { return cAAssignment_0; }
		
		//INT
		public RuleCall getAINTTerminalRuleCall_0_0() { return cAINTTerminalRuleCall_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
		
		//b=INT
		public Assignment getBAssignment_2() { return cBAssignment_2; }
		
		//INT
		public RuleCall getBINTTerminalRuleCall_2_0() { return cBINTTerminalRuleCall_2_0; }
	}
	
	
	private final RootElements pRoot;
	private final HeaderElements pHeader;
	private final DataElements pData;
	private final EntityElements pEntity;
	private final EntityWithIdElements pEntityWithId;
	private final EntityTerminatedElements pEntityTerminated;
	private final AttributeCollectionElements pAttributeCollection;
	private final AttributeElements pAttribute;
	private final EntIdElements pEntId;
	private final CSVElements pCSV;
	private final TerminalRule tDOUBLE;
	private final TerminalRule tNUMBER;
	private final TerminalRule tXSTRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public IfcBrickGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pHeader = new HeaderElements();
		this.pData = new DataElements();
		this.pEntity = new EntityElements();
		this.pEntityWithId = new EntityWithIdElements();
		this.pEntityTerminated = new EntityTerminatedElements();
		this.pAttributeCollection = new AttributeCollectionElements();
		this.pAttribute = new AttributeElements();
		this.pEntId = new EntIdElements();
		this.pCSV = new CSVElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.DOUBLE");
		this.tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.NUMBER");
		this.tXSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ifcbrickconvert.IfcBrick.XSTRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.ifcbrickconvert.IfcBrick".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Root:
	//	'ISO-10303-21' ';'
	//	header=Header
	//	data=Data
	//	'END-ISO-10303-21' ';';
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//Header:
	//	'HEADER' ';'
	//	headerEntities+=EntityTerminated+
	//	'ENDSEC' ';';
	public HeaderElements getHeaderAccess() {
		return pHeader;
	}
	
	public ParserRule getHeaderRule() {
		return getHeaderAccess().getRule();
	}
	
	//Data:
	//	'DATA' ';'
	//	entityWithIds+=EntityWithId+
	//	'ENDSEC' ';';
	public DataElements getDataAccess() {
		return pData;
	}
	
	public ParserRule getDataRule() {
		return getDataAccess().getRule();
	}
	
	//Entity:
	//	definition=ID attributeCollection=AttributeCollection;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//EntityWithId:
	//	eid=EntId '=' entity=Entity ';';
	public EntityWithIdElements getEntityWithIdAccess() {
		return pEntityWithId;
	}
	
	public ParserRule getEntityWithIdRule() {
		return getEntityWithIdAccess().getRule();
	}
	
	//EntityTerminated:
	//	entity=Entity ';';
	public EntityTerminatedElements getEntityTerminatedAccess() {
		return pEntityTerminated;
	}
	
	public ParserRule getEntityTerminatedRule() {
		return getEntityTerminatedAccess().getRule();
	}
	
	//AttributeCollection:
	//	'(' attributes+=Attribute? (',' attributes+=Attribute)* ')';
	public AttributeCollectionElements getAttributeCollectionAccess() {
		return pAttributeCollection;
	}
	
	public ParserRule getAttributeCollectionRule() {
		return getAttributeCollectionAccess().getRule();
	}
	
	//Attribute:
	//	x=ID | eid=EntId | '.' x=ID '.'
	//	| c=CSV | e=Entity | ac=AttributeCollection
	//	| u='$' | u='*' | s=XSTRING
	//	| i=INT | d=DOUBLE | n=NUMBER;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//EntId:
	//	'#' id=INT;
	public EntIdElements getEntIdAccess() {
		return pEntId;
	}
	
	public ParserRule getEntIdRule() {
		return getEntIdAccess().getRule();
	}
	
	//CSV:
	//	a=INT ';' b=INT;
	public CSVElements getCSVAccess() {
		return pCSV;
	}
	
	public ParserRule getCSVRule() {
		return getCSVAccess().getRule();
	}
	
	//terminal DOUBLE:
	//	INT '.' INT? ('E' '-'? '0'..'9'*)?;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal NUMBER:
	//	'-' INT ('.' INT*)? ('E' '-'? INT)?;
	public TerminalRule getNUMBERRule() {
		return tNUMBER;
	}
	
	//terminal XSTRING:
	//	"'"->"'"+;
	public TerminalRule getXSTRINGRule() {
		return tXSTRING;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}