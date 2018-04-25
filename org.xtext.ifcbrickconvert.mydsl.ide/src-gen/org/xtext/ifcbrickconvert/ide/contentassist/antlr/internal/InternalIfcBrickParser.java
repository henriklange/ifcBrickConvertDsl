package org.xtext.ifcbrickconvert.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.ifcbrickconvert.services.IfcBrickGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIfcBrickParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_XSTRING", "RULE_INT", "RULE_DOUBLE", "RULE_NUMBER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ISO-10303-21'", "';'", "'END-ISO-10303-21'", "'HEADER'", "'ENDSEC'", "'DATA'", "'='", "'('", "')'", "','", "'.'", "'#'", "'$'", "'*'"
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

    	public void setGrammarAccess(IfcBrickGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRoot"
    // InternalIfcBrick.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalIfcBrick.g:54:1: ( ruleRoot EOF )
            // InternalIfcBrick.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalIfcBrick.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalIfcBrick.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalIfcBrick.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalIfcBrick.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalIfcBrick.g:69:3: ( rule__Root__Group__0 )
            // InternalIfcBrick.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleHeader"
    // InternalIfcBrick.g:78:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalIfcBrick.g:79:1: ( ruleHeader EOF )
            // InternalIfcBrick.g:80:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalIfcBrick.g:87:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:91:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalIfcBrick.g:92:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalIfcBrick.g:92:2: ( ( rule__Header__Group__0 ) )
            // InternalIfcBrick.g:93:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalIfcBrick.g:94:3: ( rule__Header__Group__0 )
            // InternalIfcBrick.g:94:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleData"
    // InternalIfcBrick.g:103:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalIfcBrick.g:104:1: ( ruleData EOF )
            // InternalIfcBrick.g:105:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalIfcBrick.g:112:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:116:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalIfcBrick.g:117:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalIfcBrick.g:117:2: ( ( rule__Data__Group__0 ) )
            // InternalIfcBrick.g:118:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalIfcBrick.g:119:3: ( rule__Data__Group__0 )
            // InternalIfcBrick.g:119:4: rule__Data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleEntity"
    // InternalIfcBrick.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalIfcBrick.g:129:1: ( ruleEntity EOF )
            // InternalIfcBrick.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalIfcBrick.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalIfcBrick.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalIfcBrick.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalIfcBrick.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalIfcBrick.g:144:3: ( rule__Entity__Group__0 )
            // InternalIfcBrick.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityWithId"
    // InternalIfcBrick.g:153:1: entryRuleEntityWithId : ruleEntityWithId EOF ;
    public final void entryRuleEntityWithId() throws RecognitionException {
        try {
            // InternalIfcBrick.g:154:1: ( ruleEntityWithId EOF )
            // InternalIfcBrick.g:155:1: ruleEntityWithId EOF
            {
             before(grammarAccess.getEntityWithIdRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityWithId();

            state._fsp--;

             after(grammarAccess.getEntityWithIdRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityWithId"


    // $ANTLR start "ruleEntityWithId"
    // InternalIfcBrick.g:162:1: ruleEntityWithId : ( ( rule__EntityWithId__Group__0 ) ) ;
    public final void ruleEntityWithId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:166:2: ( ( ( rule__EntityWithId__Group__0 ) ) )
            // InternalIfcBrick.g:167:2: ( ( rule__EntityWithId__Group__0 ) )
            {
            // InternalIfcBrick.g:167:2: ( ( rule__EntityWithId__Group__0 ) )
            // InternalIfcBrick.g:168:3: ( rule__EntityWithId__Group__0 )
            {
             before(grammarAccess.getEntityWithIdAccess().getGroup()); 
            // InternalIfcBrick.g:169:3: ( rule__EntityWithId__Group__0 )
            // InternalIfcBrick.g:169:4: rule__EntityWithId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityWithId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityWithIdAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityWithId"


    // $ANTLR start "entryRuleEntityTerminated"
    // InternalIfcBrick.g:178:1: entryRuleEntityTerminated : ruleEntityTerminated EOF ;
    public final void entryRuleEntityTerminated() throws RecognitionException {
        try {
            // InternalIfcBrick.g:179:1: ( ruleEntityTerminated EOF )
            // InternalIfcBrick.g:180:1: ruleEntityTerminated EOF
            {
             before(grammarAccess.getEntityTerminatedRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityTerminated();

            state._fsp--;

             after(grammarAccess.getEntityTerminatedRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityTerminated"


    // $ANTLR start "ruleEntityTerminated"
    // InternalIfcBrick.g:187:1: ruleEntityTerminated : ( ( rule__EntityTerminated__Group__0 ) ) ;
    public final void ruleEntityTerminated() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:191:2: ( ( ( rule__EntityTerminated__Group__0 ) ) )
            // InternalIfcBrick.g:192:2: ( ( rule__EntityTerminated__Group__0 ) )
            {
            // InternalIfcBrick.g:192:2: ( ( rule__EntityTerminated__Group__0 ) )
            // InternalIfcBrick.g:193:3: ( rule__EntityTerminated__Group__0 )
            {
             before(grammarAccess.getEntityTerminatedAccess().getGroup()); 
            // InternalIfcBrick.g:194:3: ( rule__EntityTerminated__Group__0 )
            // InternalIfcBrick.g:194:4: rule__EntityTerminated__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityTerminated__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTerminatedAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityTerminated"


    // $ANTLR start "entryRuleAttributeCollection"
    // InternalIfcBrick.g:203:1: entryRuleAttributeCollection : ruleAttributeCollection EOF ;
    public final void entryRuleAttributeCollection() throws RecognitionException {
        try {
            // InternalIfcBrick.g:204:1: ( ruleAttributeCollection EOF )
            // InternalIfcBrick.g:205:1: ruleAttributeCollection EOF
            {
             before(grammarAccess.getAttributeCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeCollection();

            state._fsp--;

             after(grammarAccess.getAttributeCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeCollection"


    // $ANTLR start "ruleAttributeCollection"
    // InternalIfcBrick.g:212:1: ruleAttributeCollection : ( ( rule__AttributeCollection__Group__0 ) ) ;
    public final void ruleAttributeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:216:2: ( ( ( rule__AttributeCollection__Group__0 ) ) )
            // InternalIfcBrick.g:217:2: ( ( rule__AttributeCollection__Group__0 ) )
            {
            // InternalIfcBrick.g:217:2: ( ( rule__AttributeCollection__Group__0 ) )
            // InternalIfcBrick.g:218:3: ( rule__AttributeCollection__Group__0 )
            {
             before(grammarAccess.getAttributeCollectionAccess().getGroup()); 
            // InternalIfcBrick.g:219:3: ( rule__AttributeCollection__Group__0 )
            // InternalIfcBrick.g:219:4: rule__AttributeCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeCollectionAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeCollection"


    // $ANTLR start "entryRuleAttribute"
    // InternalIfcBrick.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalIfcBrick.g:229:1: ( ruleAttribute EOF )
            // InternalIfcBrick.g:230:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalIfcBrick.g:237:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:241:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalIfcBrick.g:242:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalIfcBrick.g:242:2: ( ( rule__Attribute__Alternatives ) )
            // InternalIfcBrick.g:243:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalIfcBrick.g:244:3: ( rule__Attribute__Alternatives )
            // InternalIfcBrick.g:244:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntId"
    // InternalIfcBrick.g:253:1: entryRuleEntId : ruleEntId EOF ;
    public final void entryRuleEntId() throws RecognitionException {
        try {
            // InternalIfcBrick.g:254:1: ( ruleEntId EOF )
            // InternalIfcBrick.g:255:1: ruleEntId EOF
            {
             before(grammarAccess.getEntIdRule()); 
            pushFollow(FOLLOW_1);
            ruleEntId();

            state._fsp--;

             after(grammarAccess.getEntIdRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntId"


    // $ANTLR start "ruleEntId"
    // InternalIfcBrick.g:262:1: ruleEntId : ( ( rule__EntId__Group__0 ) ) ;
    public final void ruleEntId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:266:2: ( ( ( rule__EntId__Group__0 ) ) )
            // InternalIfcBrick.g:267:2: ( ( rule__EntId__Group__0 ) )
            {
            // InternalIfcBrick.g:267:2: ( ( rule__EntId__Group__0 ) )
            // InternalIfcBrick.g:268:3: ( rule__EntId__Group__0 )
            {
             before(grammarAccess.getEntIdAccess().getGroup()); 
            // InternalIfcBrick.g:269:3: ( rule__EntId__Group__0 )
            // InternalIfcBrick.g:269:4: rule__EntId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntIdAccess().getGroup()); 

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
    // $ANTLR end "ruleEntId"


    // $ANTLR start "entryRuleCSV"
    // InternalIfcBrick.g:278:1: entryRuleCSV : ruleCSV EOF ;
    public final void entryRuleCSV() throws RecognitionException {
        try {
            // InternalIfcBrick.g:279:1: ( ruleCSV EOF )
            // InternalIfcBrick.g:280:1: ruleCSV EOF
            {
             before(grammarAccess.getCSVRule()); 
            pushFollow(FOLLOW_1);
            ruleCSV();

            state._fsp--;

             after(grammarAccess.getCSVRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCSV"


    // $ANTLR start "ruleCSV"
    // InternalIfcBrick.g:287:1: ruleCSV : ( ( rule__CSV__Group__0 ) ) ;
    public final void ruleCSV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:291:2: ( ( ( rule__CSV__Group__0 ) ) )
            // InternalIfcBrick.g:292:2: ( ( rule__CSV__Group__0 ) )
            {
            // InternalIfcBrick.g:292:2: ( ( rule__CSV__Group__0 ) )
            // InternalIfcBrick.g:293:3: ( rule__CSV__Group__0 )
            {
             before(grammarAccess.getCSVAccess().getGroup()); 
            // InternalIfcBrick.g:294:3: ( rule__CSV__Group__0 )
            // InternalIfcBrick.g:294:4: rule__CSV__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSV__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSVAccess().getGroup()); 

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
    // $ANTLR end "ruleCSV"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalIfcBrick.g:302:1: rule__Attribute__Alternatives : ( ( ( rule__Attribute__XAssignment_0 ) ) | ( ( rule__Attribute__EidAssignment_1 ) ) | ( ( rule__Attribute__Group_2__0 ) ) | ( ( rule__Attribute__CAssignment_3 ) ) | ( ( rule__Attribute__EAssignment_4 ) ) | ( ( rule__Attribute__AcAssignment_5 ) ) | ( ( rule__Attribute__UAssignment_6 ) ) | ( ( rule__Attribute__UAssignment_7 ) ) | ( ( rule__Attribute__SAssignment_8 ) ) | ( ( rule__Attribute__IAssignment_9 ) ) | ( ( rule__Attribute__DAssignment_10 ) ) | ( ( rule__Attribute__NAssignment_11 ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:306:1: ( ( ( rule__Attribute__XAssignment_0 ) ) | ( ( rule__Attribute__EidAssignment_1 ) ) | ( ( rule__Attribute__Group_2__0 ) ) | ( ( rule__Attribute__CAssignment_3 ) ) | ( ( rule__Attribute__EAssignment_4 ) ) | ( ( rule__Attribute__AcAssignment_5 ) ) | ( ( rule__Attribute__UAssignment_6 ) ) | ( ( rule__Attribute__UAssignment_7 ) ) | ( ( rule__Attribute__SAssignment_8 ) ) | ( ( rule__Attribute__IAssignment_9 ) ) | ( ( rule__Attribute__DAssignment_10 ) ) | ( ( rule__Attribute__NAssignment_11 ) ) )
            int alt1=12;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalIfcBrick.g:307:2: ( ( rule__Attribute__XAssignment_0 ) )
                    {
                    // InternalIfcBrick.g:307:2: ( ( rule__Attribute__XAssignment_0 ) )
                    // InternalIfcBrick.g:308:3: ( rule__Attribute__XAssignment_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getXAssignment_0()); 
                    // InternalIfcBrick.g:309:3: ( rule__Attribute__XAssignment_0 )
                    // InternalIfcBrick.g:309:4: rule__Attribute__XAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__XAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getXAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIfcBrick.g:313:2: ( ( rule__Attribute__EidAssignment_1 ) )
                    {
                    // InternalIfcBrick.g:313:2: ( ( rule__Attribute__EidAssignment_1 ) )
                    // InternalIfcBrick.g:314:3: ( rule__Attribute__EidAssignment_1 )
                    {
                     before(grammarAccess.getAttributeAccess().getEidAssignment_1()); 
                    // InternalIfcBrick.g:315:3: ( rule__Attribute__EidAssignment_1 )
                    // InternalIfcBrick.g:315:4: rule__Attribute__EidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__EidAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getEidAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIfcBrick.g:319:2: ( ( rule__Attribute__Group_2__0 ) )
                    {
                    // InternalIfcBrick.g:319:2: ( ( rule__Attribute__Group_2__0 ) )
                    // InternalIfcBrick.g:320:3: ( rule__Attribute__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_2()); 
                    // InternalIfcBrick.g:321:3: ( rule__Attribute__Group_2__0 )
                    // InternalIfcBrick.g:321:4: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIfcBrick.g:325:2: ( ( rule__Attribute__CAssignment_3 ) )
                    {
                    // InternalIfcBrick.g:325:2: ( ( rule__Attribute__CAssignment_3 ) )
                    // InternalIfcBrick.g:326:3: ( rule__Attribute__CAssignment_3 )
                    {
                     before(grammarAccess.getAttributeAccess().getCAssignment_3()); 
                    // InternalIfcBrick.g:327:3: ( rule__Attribute__CAssignment_3 )
                    // InternalIfcBrick.g:327:4: rule__Attribute__CAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__CAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getCAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIfcBrick.g:331:2: ( ( rule__Attribute__EAssignment_4 ) )
                    {
                    // InternalIfcBrick.g:331:2: ( ( rule__Attribute__EAssignment_4 ) )
                    // InternalIfcBrick.g:332:3: ( rule__Attribute__EAssignment_4 )
                    {
                     before(grammarAccess.getAttributeAccess().getEAssignment_4()); 
                    // InternalIfcBrick.g:333:3: ( rule__Attribute__EAssignment_4 )
                    // InternalIfcBrick.g:333:4: rule__Attribute__EAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__EAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getEAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIfcBrick.g:337:2: ( ( rule__Attribute__AcAssignment_5 ) )
                    {
                    // InternalIfcBrick.g:337:2: ( ( rule__Attribute__AcAssignment_5 ) )
                    // InternalIfcBrick.g:338:3: ( rule__Attribute__AcAssignment_5 )
                    {
                     before(grammarAccess.getAttributeAccess().getAcAssignment_5()); 
                    // InternalIfcBrick.g:339:3: ( rule__Attribute__AcAssignment_5 )
                    // InternalIfcBrick.g:339:4: rule__Attribute__AcAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__AcAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getAcAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalIfcBrick.g:343:2: ( ( rule__Attribute__UAssignment_6 ) )
                    {
                    // InternalIfcBrick.g:343:2: ( ( rule__Attribute__UAssignment_6 ) )
                    // InternalIfcBrick.g:344:3: ( rule__Attribute__UAssignment_6 )
                    {
                     before(grammarAccess.getAttributeAccess().getUAssignment_6()); 
                    // InternalIfcBrick.g:345:3: ( rule__Attribute__UAssignment_6 )
                    // InternalIfcBrick.g:345:4: rule__Attribute__UAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getUAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalIfcBrick.g:349:2: ( ( rule__Attribute__UAssignment_7 ) )
                    {
                    // InternalIfcBrick.g:349:2: ( ( rule__Attribute__UAssignment_7 ) )
                    // InternalIfcBrick.g:350:3: ( rule__Attribute__UAssignment_7 )
                    {
                     before(grammarAccess.getAttributeAccess().getUAssignment_7()); 
                    // InternalIfcBrick.g:351:3: ( rule__Attribute__UAssignment_7 )
                    // InternalIfcBrick.g:351:4: rule__Attribute__UAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__UAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getUAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalIfcBrick.g:355:2: ( ( rule__Attribute__SAssignment_8 ) )
                    {
                    // InternalIfcBrick.g:355:2: ( ( rule__Attribute__SAssignment_8 ) )
                    // InternalIfcBrick.g:356:3: ( rule__Attribute__SAssignment_8 )
                    {
                     before(grammarAccess.getAttributeAccess().getSAssignment_8()); 
                    // InternalIfcBrick.g:357:3: ( rule__Attribute__SAssignment_8 )
                    // InternalIfcBrick.g:357:4: rule__Attribute__SAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__SAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getSAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalIfcBrick.g:361:2: ( ( rule__Attribute__IAssignment_9 ) )
                    {
                    // InternalIfcBrick.g:361:2: ( ( rule__Attribute__IAssignment_9 ) )
                    // InternalIfcBrick.g:362:3: ( rule__Attribute__IAssignment_9 )
                    {
                     before(grammarAccess.getAttributeAccess().getIAssignment_9()); 
                    // InternalIfcBrick.g:363:3: ( rule__Attribute__IAssignment_9 )
                    // InternalIfcBrick.g:363:4: rule__Attribute__IAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getIAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalIfcBrick.g:367:2: ( ( rule__Attribute__DAssignment_10 ) )
                    {
                    // InternalIfcBrick.g:367:2: ( ( rule__Attribute__DAssignment_10 ) )
                    // InternalIfcBrick.g:368:3: ( rule__Attribute__DAssignment_10 )
                    {
                     before(grammarAccess.getAttributeAccess().getDAssignment_10()); 
                    // InternalIfcBrick.g:369:3: ( rule__Attribute__DAssignment_10 )
                    // InternalIfcBrick.g:369:4: rule__Attribute__DAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__DAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getDAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalIfcBrick.g:373:2: ( ( rule__Attribute__NAssignment_11 ) )
                    {
                    // InternalIfcBrick.g:373:2: ( ( rule__Attribute__NAssignment_11 ) )
                    // InternalIfcBrick.g:374:3: ( rule__Attribute__NAssignment_11 )
                    {
                     before(grammarAccess.getAttributeAccess().getNAssignment_11()); 
                    // InternalIfcBrick.g:375:3: ( rule__Attribute__NAssignment_11 )
                    // InternalIfcBrick.g:375:4: rule__Attribute__NAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__NAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getNAssignment_11()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // InternalIfcBrick.g:383:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:387:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalIfcBrick.g:388:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalIfcBrick.g:395:1: rule__Root__Group__0__Impl : ( 'ISO-10303-21' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:399:1: ( ( 'ISO-10303-21' ) )
            // InternalIfcBrick.g:400:1: ( 'ISO-10303-21' )
            {
            // InternalIfcBrick.g:400:1: ( 'ISO-10303-21' )
            // InternalIfcBrick.g:401:2: 'ISO-10303-21'
            {
             before(grammarAccess.getRootAccess().getISO1030321Keyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getISO1030321Keyword_0()); 

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
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalIfcBrick.g:410:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:414:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalIfcBrick.g:415:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalIfcBrick.g:422:1: rule__Root__Group__1__Impl : ( ';' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:426:1: ( ( ';' ) )
            // InternalIfcBrick.g:427:1: ( ';' )
            {
            // InternalIfcBrick.g:427:1: ( ';' )
            // InternalIfcBrick.g:428:2: ';'
            {
             before(grammarAccess.getRootAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalIfcBrick.g:437:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:441:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalIfcBrick.g:442:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__3();

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
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalIfcBrick.g:449:1: rule__Root__Group__2__Impl : ( ( rule__Root__HeaderAssignment_2 ) ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:453:1: ( ( ( rule__Root__HeaderAssignment_2 ) ) )
            // InternalIfcBrick.g:454:1: ( ( rule__Root__HeaderAssignment_2 ) )
            {
            // InternalIfcBrick.g:454:1: ( ( rule__Root__HeaderAssignment_2 ) )
            // InternalIfcBrick.g:455:2: ( rule__Root__HeaderAssignment_2 )
            {
             before(grammarAccess.getRootAccess().getHeaderAssignment_2()); 
            // InternalIfcBrick.g:456:2: ( rule__Root__HeaderAssignment_2 )
            // InternalIfcBrick.g:456:3: rule__Root__HeaderAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Root__HeaderAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getHeaderAssignment_2()); 

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
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalIfcBrick.g:464:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:468:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalIfcBrick.g:469:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__4();

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
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalIfcBrick.g:476:1: rule__Root__Group__3__Impl : ( ( rule__Root__DataAssignment_3 ) ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:480:1: ( ( ( rule__Root__DataAssignment_3 ) ) )
            // InternalIfcBrick.g:481:1: ( ( rule__Root__DataAssignment_3 ) )
            {
            // InternalIfcBrick.g:481:1: ( ( rule__Root__DataAssignment_3 ) )
            // InternalIfcBrick.g:482:2: ( rule__Root__DataAssignment_3 )
            {
             before(grammarAccess.getRootAccess().getDataAssignment_3()); 
            // InternalIfcBrick.g:483:2: ( rule__Root__DataAssignment_3 )
            // InternalIfcBrick.g:483:3: rule__Root__DataAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Root__DataAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getDataAssignment_3()); 

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
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // InternalIfcBrick.g:491:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:495:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalIfcBrick.g:496:2: rule__Root__Group__4__Impl rule__Root__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__5();

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
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // InternalIfcBrick.g:503:1: rule__Root__Group__4__Impl : ( 'END-ISO-10303-21' ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:507:1: ( ( 'END-ISO-10303-21' ) )
            // InternalIfcBrick.g:508:1: ( 'END-ISO-10303-21' )
            {
            // InternalIfcBrick.g:508:1: ( 'END-ISO-10303-21' )
            // InternalIfcBrick.g:509:2: 'END-ISO-10303-21'
            {
             before(grammarAccess.getRootAccess().getENDISO1030321Keyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getENDISO1030321Keyword_4()); 

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
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Root__Group__5"
    // InternalIfcBrick.g:518:1: rule__Root__Group__5 : rule__Root__Group__5__Impl ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:522:1: ( rule__Root__Group__5__Impl )
            // InternalIfcBrick.g:523:2: rule__Root__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__5__Impl();

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
    // $ANTLR end "rule__Root__Group__5"


    // $ANTLR start "rule__Root__Group__5__Impl"
    // InternalIfcBrick.g:529:1: rule__Root__Group__5__Impl : ( ';' ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:533:1: ( ( ';' ) )
            // InternalIfcBrick.g:534:1: ( ';' )
            {
            // InternalIfcBrick.g:534:1: ( ';' )
            // InternalIfcBrick.g:535:2: ';'
            {
             before(grammarAccess.getRootAccess().getSemicolonKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Root__Group__5__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalIfcBrick.g:545:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:549:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalIfcBrick.g:550:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

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
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalIfcBrick.g:557:1: rule__Header__Group__0__Impl : ( 'HEADER' ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:561:1: ( ( 'HEADER' ) )
            // InternalIfcBrick.g:562:1: ( 'HEADER' )
            {
            // InternalIfcBrick.g:562:1: ( 'HEADER' )
            // InternalIfcBrick.g:563:2: 'HEADER'
            {
             before(grammarAccess.getHeaderAccess().getHEADERKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHEADERKeyword_0()); 

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
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalIfcBrick.g:572:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:576:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalIfcBrick.g:577:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

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
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalIfcBrick.g:584:1: rule__Header__Group__1__Impl : ( ';' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:588:1: ( ( ';' ) )
            // InternalIfcBrick.g:589:1: ( ';' )
            {
            // InternalIfcBrick.g:589:1: ( ';' )
            // InternalIfcBrick.g:590:2: ';'
            {
             before(grammarAccess.getHeaderAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalIfcBrick.g:599:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:603:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalIfcBrick.g:604:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__3();

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
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalIfcBrick.g:611:1: rule__Header__Group__2__Impl : ( ( ( rule__Header__HeaderEntitiesAssignment_2 ) ) ( ( rule__Header__HeaderEntitiesAssignment_2 )* ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:615:1: ( ( ( ( rule__Header__HeaderEntitiesAssignment_2 ) ) ( ( rule__Header__HeaderEntitiesAssignment_2 )* ) ) )
            // InternalIfcBrick.g:616:1: ( ( ( rule__Header__HeaderEntitiesAssignment_2 ) ) ( ( rule__Header__HeaderEntitiesAssignment_2 )* ) )
            {
            // InternalIfcBrick.g:616:1: ( ( ( rule__Header__HeaderEntitiesAssignment_2 ) ) ( ( rule__Header__HeaderEntitiesAssignment_2 )* ) )
            // InternalIfcBrick.g:617:2: ( ( rule__Header__HeaderEntitiesAssignment_2 ) ) ( ( rule__Header__HeaderEntitiesAssignment_2 )* )
            {
            // InternalIfcBrick.g:617:2: ( ( rule__Header__HeaderEntitiesAssignment_2 ) )
            // InternalIfcBrick.g:618:3: ( rule__Header__HeaderEntitiesAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getHeaderEntitiesAssignment_2()); 
            // InternalIfcBrick.g:619:3: ( rule__Header__HeaderEntitiesAssignment_2 )
            // InternalIfcBrick.g:619:4: rule__Header__HeaderEntitiesAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Header__HeaderEntitiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getHeaderEntitiesAssignment_2()); 

            }

            // InternalIfcBrick.g:622:2: ( ( rule__Header__HeaderEntitiesAssignment_2 )* )
            // InternalIfcBrick.g:623:3: ( rule__Header__HeaderEntitiesAssignment_2 )*
            {
             before(grammarAccess.getHeaderAccess().getHeaderEntitiesAssignment_2()); 
            // InternalIfcBrick.g:624:3: ( rule__Header__HeaderEntitiesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIfcBrick.g:624:4: rule__Header__HeaderEntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Header__HeaderEntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getHeaderAccess().getHeaderEntitiesAssignment_2()); 

            }


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
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__3"
    // InternalIfcBrick.g:633:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:637:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalIfcBrick.g:638:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Header__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__4();

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
    // $ANTLR end "rule__Header__Group__3"


    // $ANTLR start "rule__Header__Group__3__Impl"
    // InternalIfcBrick.g:645:1: rule__Header__Group__3__Impl : ( 'ENDSEC' ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:649:1: ( ( 'ENDSEC' ) )
            // InternalIfcBrick.g:650:1: ( 'ENDSEC' )
            {
            // InternalIfcBrick.g:650:1: ( 'ENDSEC' )
            // InternalIfcBrick.g:651:2: 'ENDSEC'
            {
             before(grammarAccess.getHeaderAccess().getENDSECKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getENDSECKeyword_3()); 

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
    // $ANTLR end "rule__Header__Group__3__Impl"


    // $ANTLR start "rule__Header__Group__4"
    // InternalIfcBrick.g:660:1: rule__Header__Group__4 : rule__Header__Group__4__Impl ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:664:1: ( rule__Header__Group__4__Impl )
            // InternalIfcBrick.g:665:2: rule__Header__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__4__Impl();

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
    // $ANTLR end "rule__Header__Group__4"


    // $ANTLR start "rule__Header__Group__4__Impl"
    // InternalIfcBrick.g:671:1: rule__Header__Group__4__Impl : ( ';' ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:675:1: ( ( ';' ) )
            // InternalIfcBrick.g:676:1: ( ';' )
            {
            // InternalIfcBrick.g:676:1: ( ';' )
            // InternalIfcBrick.g:677:2: ';'
            {
             before(grammarAccess.getHeaderAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Header__Group__4__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalIfcBrick.g:687:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:691:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalIfcBrick.g:692:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__1();

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
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // InternalIfcBrick.g:699:1: rule__Data__Group__0__Impl : ( 'DATA' ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:703:1: ( ( 'DATA' ) )
            // InternalIfcBrick.g:704:1: ( 'DATA' )
            {
            // InternalIfcBrick.g:704:1: ( 'DATA' )
            // InternalIfcBrick.g:705:2: 'DATA'
            {
             before(grammarAccess.getDataAccess().getDATAKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getDATAKeyword_0()); 

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
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // InternalIfcBrick.g:714:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:718:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalIfcBrick.g:719:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__2();

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
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // InternalIfcBrick.g:726:1: rule__Data__Group__1__Impl : ( ';' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:730:1: ( ( ';' ) )
            // InternalIfcBrick.g:731:1: ( ';' )
            {
            // InternalIfcBrick.g:731:1: ( ';' )
            // InternalIfcBrick.g:732:2: ';'
            {
             before(grammarAccess.getDataAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // InternalIfcBrick.g:741:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:745:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // InternalIfcBrick.g:746:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__3();

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
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // InternalIfcBrick.g:753:1: rule__Data__Group__2__Impl : ( ( ( rule__Data__EntityWithIdsAssignment_2 ) ) ( ( rule__Data__EntityWithIdsAssignment_2 )* ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:757:1: ( ( ( ( rule__Data__EntityWithIdsAssignment_2 ) ) ( ( rule__Data__EntityWithIdsAssignment_2 )* ) ) )
            // InternalIfcBrick.g:758:1: ( ( ( rule__Data__EntityWithIdsAssignment_2 ) ) ( ( rule__Data__EntityWithIdsAssignment_2 )* ) )
            {
            // InternalIfcBrick.g:758:1: ( ( ( rule__Data__EntityWithIdsAssignment_2 ) ) ( ( rule__Data__EntityWithIdsAssignment_2 )* ) )
            // InternalIfcBrick.g:759:2: ( ( rule__Data__EntityWithIdsAssignment_2 ) ) ( ( rule__Data__EntityWithIdsAssignment_2 )* )
            {
            // InternalIfcBrick.g:759:2: ( ( rule__Data__EntityWithIdsAssignment_2 ) )
            // InternalIfcBrick.g:760:3: ( rule__Data__EntityWithIdsAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getEntityWithIdsAssignment_2()); 
            // InternalIfcBrick.g:761:3: ( rule__Data__EntityWithIdsAssignment_2 )
            // InternalIfcBrick.g:761:4: rule__Data__EntityWithIdsAssignment_2
            {
            pushFollow(FOLLOW_11);
            rule__Data__EntityWithIdsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getEntityWithIdsAssignment_2()); 

            }

            // InternalIfcBrick.g:764:2: ( ( rule__Data__EntityWithIdsAssignment_2 )* )
            // InternalIfcBrick.g:765:3: ( rule__Data__EntityWithIdsAssignment_2 )*
            {
             before(grammarAccess.getDataAccess().getEntityWithIdsAssignment_2()); 
            // InternalIfcBrick.g:766:3: ( rule__Data__EntityWithIdsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIfcBrick.g:766:4: rule__Data__EntityWithIdsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Data__EntityWithIdsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDataAccess().getEntityWithIdsAssignment_2()); 

            }


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
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Data__Group__3"
    // InternalIfcBrick.g:775:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:779:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // InternalIfcBrick.g:780:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__4();

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
    // $ANTLR end "rule__Data__Group__3"


    // $ANTLR start "rule__Data__Group__3__Impl"
    // InternalIfcBrick.g:787:1: rule__Data__Group__3__Impl : ( 'ENDSEC' ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:791:1: ( ( 'ENDSEC' ) )
            // InternalIfcBrick.g:792:1: ( 'ENDSEC' )
            {
            // InternalIfcBrick.g:792:1: ( 'ENDSEC' )
            // InternalIfcBrick.g:793:2: 'ENDSEC'
            {
             before(grammarAccess.getDataAccess().getENDSECKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getENDSECKeyword_3()); 

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
    // $ANTLR end "rule__Data__Group__3__Impl"


    // $ANTLR start "rule__Data__Group__4"
    // InternalIfcBrick.g:802:1: rule__Data__Group__4 : rule__Data__Group__4__Impl ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:806:1: ( rule__Data__Group__4__Impl )
            // InternalIfcBrick.g:807:2: rule__Data__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__4__Impl();

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
    // $ANTLR end "rule__Data__Group__4"


    // $ANTLR start "rule__Data__Group__4__Impl"
    // InternalIfcBrick.g:813:1: rule__Data__Group__4__Impl : ( ';' ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:817:1: ( ( ';' ) )
            // InternalIfcBrick.g:818:1: ( ';' )
            {
            // InternalIfcBrick.g:818:1: ( ';' )
            // InternalIfcBrick.g:819:2: ';'
            {
             before(grammarAccess.getDataAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Data__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalIfcBrick.g:829:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:833:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalIfcBrick.g:834:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalIfcBrick.g:841:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__DefinitionAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:845:1: ( ( ( rule__Entity__DefinitionAssignment_0 ) ) )
            // InternalIfcBrick.g:846:1: ( ( rule__Entity__DefinitionAssignment_0 ) )
            {
            // InternalIfcBrick.g:846:1: ( ( rule__Entity__DefinitionAssignment_0 ) )
            // InternalIfcBrick.g:847:2: ( rule__Entity__DefinitionAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getDefinitionAssignment_0()); 
            // InternalIfcBrick.g:848:2: ( rule__Entity__DefinitionAssignment_0 )
            // InternalIfcBrick.g:848:3: rule__Entity__DefinitionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__DefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getDefinitionAssignment_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalIfcBrick.g:856:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:860:1: ( rule__Entity__Group__1__Impl )
            // InternalIfcBrick.g:861:2: rule__Entity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1__Impl();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalIfcBrick.g:867:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__AttributeCollectionAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:871:1: ( ( ( rule__Entity__AttributeCollectionAssignment_1 ) ) )
            // InternalIfcBrick.g:872:1: ( ( rule__Entity__AttributeCollectionAssignment_1 ) )
            {
            // InternalIfcBrick.g:872:1: ( ( rule__Entity__AttributeCollectionAssignment_1 ) )
            // InternalIfcBrick.g:873:2: ( rule__Entity__AttributeCollectionAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributeCollectionAssignment_1()); 
            // InternalIfcBrick.g:874:2: ( rule__Entity__AttributeCollectionAssignment_1 )
            // InternalIfcBrick.g:874:3: rule__Entity__AttributeCollectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__AttributeCollectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributeCollectionAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__EntityWithId__Group__0"
    // InternalIfcBrick.g:883:1: rule__EntityWithId__Group__0 : rule__EntityWithId__Group__0__Impl rule__EntityWithId__Group__1 ;
    public final void rule__EntityWithId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:887:1: ( rule__EntityWithId__Group__0__Impl rule__EntityWithId__Group__1 )
            // InternalIfcBrick.g:888:2: rule__EntityWithId__Group__0__Impl rule__EntityWithId__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EntityWithId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityWithId__Group__1();

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
    // $ANTLR end "rule__EntityWithId__Group__0"


    // $ANTLR start "rule__EntityWithId__Group__0__Impl"
    // InternalIfcBrick.g:895:1: rule__EntityWithId__Group__0__Impl : ( ( rule__EntityWithId__EidAssignment_0 ) ) ;
    public final void rule__EntityWithId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:899:1: ( ( ( rule__EntityWithId__EidAssignment_0 ) ) )
            // InternalIfcBrick.g:900:1: ( ( rule__EntityWithId__EidAssignment_0 ) )
            {
            // InternalIfcBrick.g:900:1: ( ( rule__EntityWithId__EidAssignment_0 ) )
            // InternalIfcBrick.g:901:2: ( rule__EntityWithId__EidAssignment_0 )
            {
             before(grammarAccess.getEntityWithIdAccess().getEidAssignment_0()); 
            // InternalIfcBrick.g:902:2: ( rule__EntityWithId__EidAssignment_0 )
            // InternalIfcBrick.g:902:3: rule__EntityWithId__EidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityWithId__EidAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityWithIdAccess().getEidAssignment_0()); 

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
    // $ANTLR end "rule__EntityWithId__Group__0__Impl"


    // $ANTLR start "rule__EntityWithId__Group__1"
    // InternalIfcBrick.g:910:1: rule__EntityWithId__Group__1 : rule__EntityWithId__Group__1__Impl rule__EntityWithId__Group__2 ;
    public final void rule__EntityWithId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:914:1: ( rule__EntityWithId__Group__1__Impl rule__EntityWithId__Group__2 )
            // InternalIfcBrick.g:915:2: rule__EntityWithId__Group__1__Impl rule__EntityWithId__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EntityWithId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityWithId__Group__2();

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
    // $ANTLR end "rule__EntityWithId__Group__1"


    // $ANTLR start "rule__EntityWithId__Group__1__Impl"
    // InternalIfcBrick.g:922:1: rule__EntityWithId__Group__1__Impl : ( '=' ) ;
    public final void rule__EntityWithId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:926:1: ( ( '=' ) )
            // InternalIfcBrick.g:927:1: ( '=' )
            {
            // InternalIfcBrick.g:927:1: ( '=' )
            // InternalIfcBrick.g:928:2: '='
            {
             before(grammarAccess.getEntityWithIdAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityWithIdAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__EntityWithId__Group__1__Impl"


    // $ANTLR start "rule__EntityWithId__Group__2"
    // InternalIfcBrick.g:937:1: rule__EntityWithId__Group__2 : rule__EntityWithId__Group__2__Impl rule__EntityWithId__Group__3 ;
    public final void rule__EntityWithId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:941:1: ( rule__EntityWithId__Group__2__Impl rule__EntityWithId__Group__3 )
            // InternalIfcBrick.g:942:2: rule__EntityWithId__Group__2__Impl rule__EntityWithId__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__EntityWithId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityWithId__Group__3();

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
    // $ANTLR end "rule__EntityWithId__Group__2"


    // $ANTLR start "rule__EntityWithId__Group__2__Impl"
    // InternalIfcBrick.g:949:1: rule__EntityWithId__Group__2__Impl : ( ( rule__EntityWithId__EntityAssignment_2 ) ) ;
    public final void rule__EntityWithId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:953:1: ( ( ( rule__EntityWithId__EntityAssignment_2 ) ) )
            // InternalIfcBrick.g:954:1: ( ( rule__EntityWithId__EntityAssignment_2 ) )
            {
            // InternalIfcBrick.g:954:1: ( ( rule__EntityWithId__EntityAssignment_2 ) )
            // InternalIfcBrick.g:955:2: ( rule__EntityWithId__EntityAssignment_2 )
            {
             before(grammarAccess.getEntityWithIdAccess().getEntityAssignment_2()); 
            // InternalIfcBrick.g:956:2: ( rule__EntityWithId__EntityAssignment_2 )
            // InternalIfcBrick.g:956:3: rule__EntityWithId__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EntityWithId__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityWithIdAccess().getEntityAssignment_2()); 

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
    // $ANTLR end "rule__EntityWithId__Group__2__Impl"


    // $ANTLR start "rule__EntityWithId__Group__3"
    // InternalIfcBrick.g:964:1: rule__EntityWithId__Group__3 : rule__EntityWithId__Group__3__Impl ;
    public final void rule__EntityWithId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:968:1: ( rule__EntityWithId__Group__3__Impl )
            // InternalIfcBrick.g:969:2: rule__EntityWithId__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityWithId__Group__3__Impl();

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
    // $ANTLR end "rule__EntityWithId__Group__3"


    // $ANTLR start "rule__EntityWithId__Group__3__Impl"
    // InternalIfcBrick.g:975:1: rule__EntityWithId__Group__3__Impl : ( ';' ) ;
    public final void rule__EntityWithId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:979:1: ( ( ';' ) )
            // InternalIfcBrick.g:980:1: ( ';' )
            {
            // InternalIfcBrick.g:980:1: ( ';' )
            // InternalIfcBrick.g:981:2: ';'
            {
             before(grammarAccess.getEntityWithIdAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityWithIdAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__EntityWithId__Group__3__Impl"


    // $ANTLR start "rule__EntityTerminated__Group__0"
    // InternalIfcBrick.g:991:1: rule__EntityTerminated__Group__0 : rule__EntityTerminated__Group__0__Impl rule__EntityTerminated__Group__1 ;
    public final void rule__EntityTerminated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:995:1: ( rule__EntityTerminated__Group__0__Impl rule__EntityTerminated__Group__1 )
            // InternalIfcBrick.g:996:2: rule__EntityTerminated__Group__0__Impl rule__EntityTerminated__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EntityTerminated__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityTerminated__Group__1();

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
    // $ANTLR end "rule__EntityTerminated__Group__0"


    // $ANTLR start "rule__EntityTerminated__Group__0__Impl"
    // InternalIfcBrick.g:1003:1: rule__EntityTerminated__Group__0__Impl : ( ( rule__EntityTerminated__EntityAssignment_0 ) ) ;
    public final void rule__EntityTerminated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1007:1: ( ( ( rule__EntityTerminated__EntityAssignment_0 ) ) )
            // InternalIfcBrick.g:1008:1: ( ( rule__EntityTerminated__EntityAssignment_0 ) )
            {
            // InternalIfcBrick.g:1008:1: ( ( rule__EntityTerminated__EntityAssignment_0 ) )
            // InternalIfcBrick.g:1009:2: ( rule__EntityTerminated__EntityAssignment_0 )
            {
             before(grammarAccess.getEntityTerminatedAccess().getEntityAssignment_0()); 
            // InternalIfcBrick.g:1010:2: ( rule__EntityTerminated__EntityAssignment_0 )
            // InternalIfcBrick.g:1010:3: rule__EntityTerminated__EntityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityTerminated__EntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTerminatedAccess().getEntityAssignment_0()); 

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
    // $ANTLR end "rule__EntityTerminated__Group__0__Impl"


    // $ANTLR start "rule__EntityTerminated__Group__1"
    // InternalIfcBrick.g:1018:1: rule__EntityTerminated__Group__1 : rule__EntityTerminated__Group__1__Impl ;
    public final void rule__EntityTerminated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1022:1: ( rule__EntityTerminated__Group__1__Impl )
            // InternalIfcBrick.g:1023:2: rule__EntityTerminated__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityTerminated__Group__1__Impl();

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
    // $ANTLR end "rule__EntityTerminated__Group__1"


    // $ANTLR start "rule__EntityTerminated__Group__1__Impl"
    // InternalIfcBrick.g:1029:1: rule__EntityTerminated__Group__1__Impl : ( ';' ) ;
    public final void rule__EntityTerminated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1033:1: ( ( ';' ) )
            // InternalIfcBrick.g:1034:1: ( ';' )
            {
            // InternalIfcBrick.g:1034:1: ( ';' )
            // InternalIfcBrick.g:1035:2: ';'
            {
             before(grammarAccess.getEntityTerminatedAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityTerminatedAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__EntityTerminated__Group__1__Impl"


    // $ANTLR start "rule__AttributeCollection__Group__0"
    // InternalIfcBrick.g:1045:1: rule__AttributeCollection__Group__0 : rule__AttributeCollection__Group__0__Impl rule__AttributeCollection__Group__1 ;
    public final void rule__AttributeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1049:1: ( rule__AttributeCollection__Group__0__Impl rule__AttributeCollection__Group__1 )
            // InternalIfcBrick.g:1050:2: rule__AttributeCollection__Group__0__Impl rule__AttributeCollection__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AttributeCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeCollection__Group__1();

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
    // $ANTLR end "rule__AttributeCollection__Group__0"


    // $ANTLR start "rule__AttributeCollection__Group__0__Impl"
    // InternalIfcBrick.g:1057:1: rule__AttributeCollection__Group__0__Impl : ( '(' ) ;
    public final void rule__AttributeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1061:1: ( ( '(' ) )
            // InternalIfcBrick.g:1062:1: ( '(' )
            {
            // InternalIfcBrick.g:1062:1: ( '(' )
            // InternalIfcBrick.g:1063:2: '('
            {
             before(grammarAccess.getAttributeCollectionAccess().getLeftParenthesisKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeCollectionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__AttributeCollection__Group__0__Impl"


    // $ANTLR start "rule__AttributeCollection__Group__1"
    // InternalIfcBrick.g:1072:1: rule__AttributeCollection__Group__1 : rule__AttributeCollection__Group__1__Impl rule__AttributeCollection__Group__2 ;
    public final void rule__AttributeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1076:1: ( rule__AttributeCollection__Group__1__Impl rule__AttributeCollection__Group__2 )
            // InternalIfcBrick.g:1077:2: rule__AttributeCollection__Group__1__Impl rule__AttributeCollection__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AttributeCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeCollection__Group__2();

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
    // $ANTLR end "rule__AttributeCollection__Group__1"


    // $ANTLR start "rule__AttributeCollection__Group__1__Impl"
    // InternalIfcBrick.g:1084:1: rule__AttributeCollection__Group__1__Impl : ( ( rule__AttributeCollection__AttributesAssignment_1 )? ) ;
    public final void rule__AttributeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1088:1: ( ( ( rule__AttributeCollection__AttributesAssignment_1 )? ) )
            // InternalIfcBrick.g:1089:1: ( ( rule__AttributeCollection__AttributesAssignment_1 )? )
            {
            // InternalIfcBrick.g:1089:1: ( ( rule__AttributeCollection__AttributesAssignment_1 )? )
            // InternalIfcBrick.g:1090:2: ( rule__AttributeCollection__AttributesAssignment_1 )?
            {
             before(grammarAccess.getAttributeCollectionAccess().getAttributesAssignment_1()); 
            // InternalIfcBrick.g:1091:2: ( rule__AttributeCollection__AttributesAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_NUMBER)||LA4_0==21||(LA4_0>=24 && LA4_0<=27)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIfcBrick.g:1091:3: rule__AttributeCollection__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeCollection__AttributesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeCollectionAccess().getAttributesAssignment_1()); 

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
    // $ANTLR end "rule__AttributeCollection__Group__1__Impl"


    // $ANTLR start "rule__AttributeCollection__Group__2"
    // InternalIfcBrick.g:1099:1: rule__AttributeCollection__Group__2 : rule__AttributeCollection__Group__2__Impl rule__AttributeCollection__Group__3 ;
    public final void rule__AttributeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1103:1: ( rule__AttributeCollection__Group__2__Impl rule__AttributeCollection__Group__3 )
            // InternalIfcBrick.g:1104:2: rule__AttributeCollection__Group__2__Impl rule__AttributeCollection__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__AttributeCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeCollection__Group__3();

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
    // $ANTLR end "rule__AttributeCollection__Group__2"


    // $ANTLR start "rule__AttributeCollection__Group__2__Impl"
    // InternalIfcBrick.g:1111:1: rule__AttributeCollection__Group__2__Impl : ( ( rule__AttributeCollection__Group_2__0 )* ) ;
    public final void rule__AttributeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1115:1: ( ( ( rule__AttributeCollection__Group_2__0 )* ) )
            // InternalIfcBrick.g:1116:1: ( ( rule__AttributeCollection__Group_2__0 )* )
            {
            // InternalIfcBrick.g:1116:1: ( ( rule__AttributeCollection__Group_2__0 )* )
            // InternalIfcBrick.g:1117:2: ( rule__AttributeCollection__Group_2__0 )*
            {
             before(grammarAccess.getAttributeCollectionAccess().getGroup_2()); 
            // InternalIfcBrick.g:1118:2: ( rule__AttributeCollection__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIfcBrick.g:1118:3: rule__AttributeCollection__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AttributeCollection__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAttributeCollectionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AttributeCollection__Group__2__Impl"


    // $ANTLR start "rule__AttributeCollection__Group__3"
    // InternalIfcBrick.g:1126:1: rule__AttributeCollection__Group__3 : rule__AttributeCollection__Group__3__Impl ;
    public final void rule__AttributeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1130:1: ( rule__AttributeCollection__Group__3__Impl )
            // InternalIfcBrick.g:1131:2: rule__AttributeCollection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeCollection__Group__3__Impl();

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
    // $ANTLR end "rule__AttributeCollection__Group__3"


    // $ANTLR start "rule__AttributeCollection__Group__3__Impl"
    // InternalIfcBrick.g:1137:1: rule__AttributeCollection__Group__3__Impl : ( ')' ) ;
    public final void rule__AttributeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1141:1: ( ( ')' ) )
            // InternalIfcBrick.g:1142:1: ( ')' )
            {
            // InternalIfcBrick.g:1142:1: ( ')' )
            // InternalIfcBrick.g:1143:2: ')'
            {
             before(grammarAccess.getAttributeCollectionAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeCollectionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__AttributeCollection__Group__3__Impl"


    // $ANTLR start "rule__AttributeCollection__Group_2__0"
    // InternalIfcBrick.g:1153:1: rule__AttributeCollection__Group_2__0 : rule__AttributeCollection__Group_2__0__Impl rule__AttributeCollection__Group_2__1 ;
    public final void rule__AttributeCollection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1157:1: ( rule__AttributeCollection__Group_2__0__Impl rule__AttributeCollection__Group_2__1 )
            // InternalIfcBrick.g:1158:2: rule__AttributeCollection__Group_2__0__Impl rule__AttributeCollection__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__AttributeCollection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeCollection__Group_2__1();

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
    // $ANTLR end "rule__AttributeCollection__Group_2__0"


    // $ANTLR start "rule__AttributeCollection__Group_2__0__Impl"
    // InternalIfcBrick.g:1165:1: rule__AttributeCollection__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeCollection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1169:1: ( ( ',' ) )
            // InternalIfcBrick.g:1170:1: ( ',' )
            {
            // InternalIfcBrick.g:1170:1: ( ',' )
            // InternalIfcBrick.g:1171:2: ','
            {
             before(grammarAccess.getAttributeCollectionAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeCollectionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__AttributeCollection__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeCollection__Group_2__1"
    // InternalIfcBrick.g:1180:1: rule__AttributeCollection__Group_2__1 : rule__AttributeCollection__Group_2__1__Impl ;
    public final void rule__AttributeCollection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1184:1: ( rule__AttributeCollection__Group_2__1__Impl )
            // InternalIfcBrick.g:1185:2: rule__AttributeCollection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeCollection__Group_2__1__Impl();

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
    // $ANTLR end "rule__AttributeCollection__Group_2__1"


    // $ANTLR start "rule__AttributeCollection__Group_2__1__Impl"
    // InternalIfcBrick.g:1191:1: rule__AttributeCollection__Group_2__1__Impl : ( ( rule__AttributeCollection__AttributesAssignment_2_1 ) ) ;
    public final void rule__AttributeCollection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1195:1: ( ( ( rule__AttributeCollection__AttributesAssignment_2_1 ) ) )
            // InternalIfcBrick.g:1196:1: ( ( rule__AttributeCollection__AttributesAssignment_2_1 ) )
            {
            // InternalIfcBrick.g:1196:1: ( ( rule__AttributeCollection__AttributesAssignment_2_1 ) )
            // InternalIfcBrick.g:1197:2: ( rule__AttributeCollection__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getAttributeCollectionAccess().getAttributesAssignment_2_1()); 
            // InternalIfcBrick.g:1198:2: ( rule__AttributeCollection__AttributesAssignment_2_1 )
            // InternalIfcBrick.g:1198:3: rule__AttributeCollection__AttributesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeCollection__AttributesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeCollectionAccess().getAttributesAssignment_2_1()); 

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
    // $ANTLR end "rule__AttributeCollection__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2__0"
    // InternalIfcBrick.g:1207:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1211:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalIfcBrick.g:1212:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1();

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
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // InternalIfcBrick.g:1219:1: rule__Attribute__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1223:1: ( ( '.' ) )
            // InternalIfcBrick.g:1224:1: ( '.' )
            {
            // InternalIfcBrick.g:1224:1: ( '.' )
            // InternalIfcBrick.g:1225:2: '.'
            {
             before(grammarAccess.getAttributeAccess().getFullStopKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // InternalIfcBrick.g:1234:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1238:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // InternalIfcBrick.g:1239:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__2();

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
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // InternalIfcBrick.g:1246:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__XAssignment_2_1 ) ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1250:1: ( ( ( rule__Attribute__XAssignment_2_1 ) ) )
            // InternalIfcBrick.g:1251:1: ( ( rule__Attribute__XAssignment_2_1 ) )
            {
            // InternalIfcBrick.g:1251:1: ( ( rule__Attribute__XAssignment_2_1 ) )
            // InternalIfcBrick.g:1252:2: ( rule__Attribute__XAssignment_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getXAssignment_2_1()); 
            // InternalIfcBrick.g:1253:2: ( rule__Attribute__XAssignment_2_1 )
            // InternalIfcBrick.g:1253:3: rule__Attribute__XAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__XAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getXAssignment_2_1()); 

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
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2__2"
    // InternalIfcBrick.g:1261:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1265:1: ( rule__Attribute__Group_2__2__Impl )
            // InternalIfcBrick.g:1266:2: rule__Attribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_2__2"


    // $ANTLR start "rule__Attribute__Group_2__2__Impl"
    // InternalIfcBrick.g:1272:1: rule__Attribute__Group_2__2__Impl : ( '.' ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1276:1: ( ( '.' ) )
            // InternalIfcBrick.g:1277:1: ( '.' )
            {
            // InternalIfcBrick.g:1277:1: ( '.' )
            // InternalIfcBrick.g:1278:2: '.'
            {
             before(grammarAccess.getAttributeAccess().getFullStopKeyword_2_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFullStopKeyword_2_2()); 

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
    // $ANTLR end "rule__Attribute__Group_2__2__Impl"


    // $ANTLR start "rule__EntId__Group__0"
    // InternalIfcBrick.g:1288:1: rule__EntId__Group__0 : rule__EntId__Group__0__Impl rule__EntId__Group__1 ;
    public final void rule__EntId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1292:1: ( rule__EntId__Group__0__Impl rule__EntId__Group__1 )
            // InternalIfcBrick.g:1293:2: rule__EntId__Group__0__Impl rule__EntId__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EntId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntId__Group__1();

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
    // $ANTLR end "rule__EntId__Group__0"


    // $ANTLR start "rule__EntId__Group__0__Impl"
    // InternalIfcBrick.g:1300:1: rule__EntId__Group__0__Impl : ( '#' ) ;
    public final void rule__EntId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1304:1: ( ( '#' ) )
            // InternalIfcBrick.g:1305:1: ( '#' )
            {
            // InternalIfcBrick.g:1305:1: ( '#' )
            // InternalIfcBrick.g:1306:2: '#'
            {
             before(grammarAccess.getEntIdAccess().getNumberSignKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEntIdAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__EntId__Group__0__Impl"


    // $ANTLR start "rule__EntId__Group__1"
    // InternalIfcBrick.g:1315:1: rule__EntId__Group__1 : rule__EntId__Group__1__Impl ;
    public final void rule__EntId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1319:1: ( rule__EntId__Group__1__Impl )
            // InternalIfcBrick.g:1320:2: rule__EntId__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntId__Group__1__Impl();

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
    // $ANTLR end "rule__EntId__Group__1"


    // $ANTLR start "rule__EntId__Group__1__Impl"
    // InternalIfcBrick.g:1326:1: rule__EntId__Group__1__Impl : ( ( rule__EntId__IdAssignment_1 ) ) ;
    public final void rule__EntId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1330:1: ( ( ( rule__EntId__IdAssignment_1 ) ) )
            // InternalIfcBrick.g:1331:1: ( ( rule__EntId__IdAssignment_1 ) )
            {
            // InternalIfcBrick.g:1331:1: ( ( rule__EntId__IdAssignment_1 ) )
            // InternalIfcBrick.g:1332:2: ( rule__EntId__IdAssignment_1 )
            {
             before(grammarAccess.getEntIdAccess().getIdAssignment_1()); 
            // InternalIfcBrick.g:1333:2: ( rule__EntId__IdAssignment_1 )
            // InternalIfcBrick.g:1333:3: rule__EntId__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntId__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntIdAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__EntId__Group__1__Impl"


    // $ANTLR start "rule__CSV__Group__0"
    // InternalIfcBrick.g:1342:1: rule__CSV__Group__0 : rule__CSV__Group__0__Impl rule__CSV__Group__1 ;
    public final void rule__CSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1346:1: ( rule__CSV__Group__0__Impl rule__CSV__Group__1 )
            // InternalIfcBrick.g:1347:2: rule__CSV__Group__0__Impl rule__CSV__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CSV__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSV__Group__1();

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
    // $ANTLR end "rule__CSV__Group__0"


    // $ANTLR start "rule__CSV__Group__0__Impl"
    // InternalIfcBrick.g:1354:1: rule__CSV__Group__0__Impl : ( ( rule__CSV__AAssignment_0 ) ) ;
    public final void rule__CSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1358:1: ( ( ( rule__CSV__AAssignment_0 ) ) )
            // InternalIfcBrick.g:1359:1: ( ( rule__CSV__AAssignment_0 ) )
            {
            // InternalIfcBrick.g:1359:1: ( ( rule__CSV__AAssignment_0 ) )
            // InternalIfcBrick.g:1360:2: ( rule__CSV__AAssignment_0 )
            {
             before(grammarAccess.getCSVAccess().getAAssignment_0()); 
            // InternalIfcBrick.g:1361:2: ( rule__CSV__AAssignment_0 )
            // InternalIfcBrick.g:1361:3: rule__CSV__AAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CSV__AAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCSVAccess().getAAssignment_0()); 

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
    // $ANTLR end "rule__CSV__Group__0__Impl"


    // $ANTLR start "rule__CSV__Group__1"
    // InternalIfcBrick.g:1369:1: rule__CSV__Group__1 : rule__CSV__Group__1__Impl rule__CSV__Group__2 ;
    public final void rule__CSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1373:1: ( rule__CSV__Group__1__Impl rule__CSV__Group__2 )
            // InternalIfcBrick.g:1374:2: rule__CSV__Group__1__Impl rule__CSV__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__CSV__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSV__Group__2();

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
    // $ANTLR end "rule__CSV__Group__1"


    // $ANTLR start "rule__CSV__Group__1__Impl"
    // InternalIfcBrick.g:1381:1: rule__CSV__Group__1__Impl : ( ';' ) ;
    public final void rule__CSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1385:1: ( ( ';' ) )
            // InternalIfcBrick.g:1386:1: ( ';' )
            {
            // InternalIfcBrick.g:1386:1: ( ';' )
            // InternalIfcBrick.g:1387:2: ';'
            {
             before(grammarAccess.getCSVAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCSVAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__CSV__Group__1__Impl"


    // $ANTLR start "rule__CSV__Group__2"
    // InternalIfcBrick.g:1396:1: rule__CSV__Group__2 : rule__CSV__Group__2__Impl ;
    public final void rule__CSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1400:1: ( rule__CSV__Group__2__Impl )
            // InternalIfcBrick.g:1401:2: rule__CSV__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSV__Group__2__Impl();

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
    // $ANTLR end "rule__CSV__Group__2"


    // $ANTLR start "rule__CSV__Group__2__Impl"
    // InternalIfcBrick.g:1407:1: rule__CSV__Group__2__Impl : ( ( rule__CSV__BAssignment_2 ) ) ;
    public final void rule__CSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1411:1: ( ( ( rule__CSV__BAssignment_2 ) ) )
            // InternalIfcBrick.g:1412:1: ( ( rule__CSV__BAssignment_2 ) )
            {
            // InternalIfcBrick.g:1412:1: ( ( rule__CSV__BAssignment_2 ) )
            // InternalIfcBrick.g:1413:2: ( rule__CSV__BAssignment_2 )
            {
             before(grammarAccess.getCSVAccess().getBAssignment_2()); 
            // InternalIfcBrick.g:1414:2: ( rule__CSV__BAssignment_2 )
            // InternalIfcBrick.g:1414:3: rule__CSV__BAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSV__BAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCSVAccess().getBAssignment_2()); 

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
    // $ANTLR end "rule__CSV__Group__2__Impl"


    // $ANTLR start "rule__Root__HeaderAssignment_2"
    // InternalIfcBrick.g:1423:1: rule__Root__HeaderAssignment_2 : ( ruleHeader ) ;
    public final void rule__Root__HeaderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1427:1: ( ( ruleHeader ) )
            // InternalIfcBrick.g:1428:2: ( ruleHeader )
            {
            // InternalIfcBrick.g:1428:2: ( ruleHeader )
            // InternalIfcBrick.g:1429:3: ruleHeader
            {
             before(grammarAccess.getRootAccess().getHeaderHeaderParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getRootAccess().getHeaderHeaderParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Root__HeaderAssignment_2"


    // $ANTLR start "rule__Root__DataAssignment_3"
    // InternalIfcBrick.g:1438:1: rule__Root__DataAssignment_3 : ( ruleData ) ;
    public final void rule__Root__DataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1442:1: ( ( ruleData ) )
            // InternalIfcBrick.g:1443:2: ( ruleData )
            {
            // InternalIfcBrick.g:1443:2: ( ruleData )
            // InternalIfcBrick.g:1444:3: ruleData
            {
             before(grammarAccess.getRootAccess().getDataDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRootAccess().getDataDataParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Root__DataAssignment_3"


    // $ANTLR start "rule__Header__HeaderEntitiesAssignment_2"
    // InternalIfcBrick.g:1453:1: rule__Header__HeaderEntitiesAssignment_2 : ( ruleEntityTerminated ) ;
    public final void rule__Header__HeaderEntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1457:1: ( ( ruleEntityTerminated ) )
            // InternalIfcBrick.g:1458:2: ( ruleEntityTerminated )
            {
            // InternalIfcBrick.g:1458:2: ( ruleEntityTerminated )
            // InternalIfcBrick.g:1459:3: ruleEntityTerminated
            {
             before(grammarAccess.getHeaderAccess().getHeaderEntitiesEntityTerminatedParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityTerminated();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getHeaderEntitiesEntityTerminatedParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Header__HeaderEntitiesAssignment_2"


    // $ANTLR start "rule__Data__EntityWithIdsAssignment_2"
    // InternalIfcBrick.g:1468:1: rule__Data__EntityWithIdsAssignment_2 : ( ruleEntityWithId ) ;
    public final void rule__Data__EntityWithIdsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1472:1: ( ( ruleEntityWithId ) )
            // InternalIfcBrick.g:1473:2: ( ruleEntityWithId )
            {
            // InternalIfcBrick.g:1473:2: ( ruleEntityWithId )
            // InternalIfcBrick.g:1474:3: ruleEntityWithId
            {
             before(grammarAccess.getDataAccess().getEntityWithIdsEntityWithIdParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityWithId();

            state._fsp--;

             after(grammarAccess.getDataAccess().getEntityWithIdsEntityWithIdParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Data__EntityWithIdsAssignment_2"


    // $ANTLR start "rule__Entity__DefinitionAssignment_0"
    // InternalIfcBrick.g:1483:1: rule__Entity__DefinitionAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1487:1: ( ( RULE_ID ) )
            // InternalIfcBrick.g:1488:2: ( RULE_ID )
            {
            // InternalIfcBrick.g:1488:2: ( RULE_ID )
            // InternalIfcBrick.g:1489:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getDefinitionIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getDefinitionIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Entity__DefinitionAssignment_0"


    // $ANTLR start "rule__Entity__AttributeCollectionAssignment_1"
    // InternalIfcBrick.g:1498:1: rule__Entity__AttributeCollectionAssignment_1 : ( ruleAttributeCollection ) ;
    public final void rule__Entity__AttributeCollectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1502:1: ( ( ruleAttributeCollection ) )
            // InternalIfcBrick.g:1503:2: ( ruleAttributeCollection )
            {
            // InternalIfcBrick.g:1503:2: ( ruleAttributeCollection )
            // InternalIfcBrick.g:1504:3: ruleAttributeCollection
            {
             before(grammarAccess.getEntityAccess().getAttributeCollectionAttributeCollectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeCollection();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributeCollectionAttributeCollectionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__AttributeCollectionAssignment_1"


    // $ANTLR start "rule__EntityWithId__EidAssignment_0"
    // InternalIfcBrick.g:1513:1: rule__EntityWithId__EidAssignment_0 : ( ruleEntId ) ;
    public final void rule__EntityWithId__EidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1517:1: ( ( ruleEntId ) )
            // InternalIfcBrick.g:1518:2: ( ruleEntId )
            {
            // InternalIfcBrick.g:1518:2: ( ruleEntId )
            // InternalIfcBrick.g:1519:3: ruleEntId
            {
             before(grammarAccess.getEntityWithIdAccess().getEidEntIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntId();

            state._fsp--;

             after(grammarAccess.getEntityWithIdAccess().getEidEntIdParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EntityWithId__EidAssignment_0"


    // $ANTLR start "rule__EntityWithId__EntityAssignment_2"
    // InternalIfcBrick.g:1528:1: rule__EntityWithId__EntityAssignment_2 : ( ruleEntity ) ;
    public final void rule__EntityWithId__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1532:1: ( ( ruleEntity ) )
            // InternalIfcBrick.g:1533:2: ( ruleEntity )
            {
            // InternalIfcBrick.g:1533:2: ( ruleEntity )
            // InternalIfcBrick.g:1534:3: ruleEntity
            {
             before(grammarAccess.getEntityWithIdAccess().getEntityEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityWithIdAccess().getEntityEntityParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EntityWithId__EntityAssignment_2"


    // $ANTLR start "rule__EntityTerminated__EntityAssignment_0"
    // InternalIfcBrick.g:1543:1: rule__EntityTerminated__EntityAssignment_0 : ( ruleEntity ) ;
    public final void rule__EntityTerminated__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1547:1: ( ( ruleEntity ) )
            // InternalIfcBrick.g:1548:2: ( ruleEntity )
            {
            // InternalIfcBrick.g:1548:2: ( ruleEntity )
            // InternalIfcBrick.g:1549:3: ruleEntity
            {
             before(grammarAccess.getEntityTerminatedAccess().getEntityEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityTerminatedAccess().getEntityEntityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EntityTerminated__EntityAssignment_0"


    // $ANTLR start "rule__AttributeCollection__AttributesAssignment_1"
    // InternalIfcBrick.g:1558:1: rule__AttributeCollection__AttributesAssignment_1 : ( ruleAttribute ) ;
    public final void rule__AttributeCollection__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1562:1: ( ( ruleAttribute ) )
            // InternalIfcBrick.g:1563:2: ( ruleAttribute )
            {
            // InternalIfcBrick.g:1563:2: ( ruleAttribute )
            // InternalIfcBrick.g:1564:3: ruleAttribute
            {
             before(grammarAccess.getAttributeCollectionAccess().getAttributesAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeCollectionAccess().getAttributesAttributeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributeCollection__AttributesAssignment_1"


    // $ANTLR start "rule__AttributeCollection__AttributesAssignment_2_1"
    // InternalIfcBrick.g:1573:1: rule__AttributeCollection__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__AttributeCollection__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1577:1: ( ( ruleAttribute ) )
            // InternalIfcBrick.g:1578:2: ( ruleAttribute )
            {
            // InternalIfcBrick.g:1578:2: ( ruleAttribute )
            // InternalIfcBrick.g:1579:3: ruleAttribute
            {
             before(grammarAccess.getAttributeCollectionAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeCollectionAccess().getAttributesAttributeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AttributeCollection__AttributesAssignment_2_1"


    // $ANTLR start "rule__Attribute__XAssignment_0"
    // InternalIfcBrick.g:1588:1: rule__Attribute__XAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1592:1: ( ( RULE_ID ) )
            // InternalIfcBrick.g:1593:2: ( RULE_ID )
            {
            // InternalIfcBrick.g:1593:2: ( RULE_ID )
            // InternalIfcBrick.g:1594:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getXIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getXIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__XAssignment_0"


    // $ANTLR start "rule__Attribute__EidAssignment_1"
    // InternalIfcBrick.g:1603:1: rule__Attribute__EidAssignment_1 : ( ruleEntId ) ;
    public final void rule__Attribute__EidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1607:1: ( ( ruleEntId ) )
            // InternalIfcBrick.g:1608:2: ( ruleEntId )
            {
            // InternalIfcBrick.g:1608:2: ( ruleEntId )
            // InternalIfcBrick.g:1609:3: ruleEntId
            {
             before(grammarAccess.getAttributeAccess().getEidEntIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntId();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getEidEntIdParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__EidAssignment_1"


    // $ANTLR start "rule__Attribute__XAssignment_2_1"
    // InternalIfcBrick.g:1618:1: rule__Attribute__XAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Attribute__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1622:1: ( ( RULE_ID ) )
            // InternalIfcBrick.g:1623:2: ( RULE_ID )
            {
            // InternalIfcBrick.g:1623:2: ( RULE_ID )
            // InternalIfcBrick.g:1624:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getXIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getXIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Attribute__XAssignment_2_1"


    // $ANTLR start "rule__Attribute__CAssignment_3"
    // InternalIfcBrick.g:1633:1: rule__Attribute__CAssignment_3 : ( ruleCSV ) ;
    public final void rule__Attribute__CAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1637:1: ( ( ruleCSV ) )
            // InternalIfcBrick.g:1638:2: ( ruleCSV )
            {
            // InternalIfcBrick.g:1638:2: ( ruleCSV )
            // InternalIfcBrick.g:1639:3: ruleCSV
            {
             before(grammarAccess.getAttributeAccess().getCCSVParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCSV();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getCCSVParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Attribute__CAssignment_3"


    // $ANTLR start "rule__Attribute__EAssignment_4"
    // InternalIfcBrick.g:1648:1: rule__Attribute__EAssignment_4 : ( ruleEntity ) ;
    public final void rule__Attribute__EAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1652:1: ( ( ruleEntity ) )
            // InternalIfcBrick.g:1653:2: ( ruleEntity )
            {
            // InternalIfcBrick.g:1653:2: ( ruleEntity )
            // InternalIfcBrick.g:1654:3: ruleEntity
            {
             before(grammarAccess.getAttributeAccess().getEEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getEEntityParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Attribute__EAssignment_4"


    // $ANTLR start "rule__Attribute__AcAssignment_5"
    // InternalIfcBrick.g:1663:1: rule__Attribute__AcAssignment_5 : ( ruleAttributeCollection ) ;
    public final void rule__Attribute__AcAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1667:1: ( ( ruleAttributeCollection ) )
            // InternalIfcBrick.g:1668:2: ( ruleAttributeCollection )
            {
            // InternalIfcBrick.g:1668:2: ( ruleAttributeCollection )
            // InternalIfcBrick.g:1669:3: ruleAttributeCollection
            {
             before(grammarAccess.getAttributeAccess().getAcAttributeCollectionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeCollection();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAcAttributeCollectionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Attribute__AcAssignment_5"


    // $ANTLR start "rule__Attribute__UAssignment_6"
    // InternalIfcBrick.g:1678:1: rule__Attribute__UAssignment_6 : ( ( '$' ) ) ;
    public final void rule__Attribute__UAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1682:1: ( ( ( '$' ) ) )
            // InternalIfcBrick.g:1683:2: ( ( '$' ) )
            {
            // InternalIfcBrick.g:1683:2: ( ( '$' ) )
            // InternalIfcBrick.g:1684:3: ( '$' )
            {
             before(grammarAccess.getAttributeAccess().getUDollarSignKeyword_6_0()); 
            // InternalIfcBrick.g:1685:3: ( '$' )
            // InternalIfcBrick.g:1686:4: '$'
            {
             before(grammarAccess.getAttributeAccess().getUDollarSignKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getUDollarSignKeyword_6_0()); 

            }

             after(grammarAccess.getAttributeAccess().getUDollarSignKeyword_6_0()); 

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
    // $ANTLR end "rule__Attribute__UAssignment_6"


    // $ANTLR start "rule__Attribute__UAssignment_7"
    // InternalIfcBrick.g:1697:1: rule__Attribute__UAssignment_7 : ( ( '*' ) ) ;
    public final void rule__Attribute__UAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1701:1: ( ( ( '*' ) ) )
            // InternalIfcBrick.g:1702:2: ( ( '*' ) )
            {
            // InternalIfcBrick.g:1702:2: ( ( '*' ) )
            // InternalIfcBrick.g:1703:3: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getUAsteriskKeyword_7_0()); 
            // InternalIfcBrick.g:1704:3: ( '*' )
            // InternalIfcBrick.g:1705:4: '*'
            {
             before(grammarAccess.getAttributeAccess().getUAsteriskKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getUAsteriskKeyword_7_0()); 

            }

             after(grammarAccess.getAttributeAccess().getUAsteriskKeyword_7_0()); 

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
    // $ANTLR end "rule__Attribute__UAssignment_7"


    // $ANTLR start "rule__Attribute__SAssignment_8"
    // InternalIfcBrick.g:1716:1: rule__Attribute__SAssignment_8 : ( RULE_XSTRING ) ;
    public final void rule__Attribute__SAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1720:1: ( ( RULE_XSTRING ) )
            // InternalIfcBrick.g:1721:2: ( RULE_XSTRING )
            {
            // InternalIfcBrick.g:1721:2: ( RULE_XSTRING )
            // InternalIfcBrick.g:1722:3: RULE_XSTRING
            {
             before(grammarAccess.getAttributeAccess().getSXSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_XSTRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSXSTRINGTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Attribute__SAssignment_8"


    // $ANTLR start "rule__Attribute__IAssignment_9"
    // InternalIfcBrick.g:1731:1: rule__Attribute__IAssignment_9 : ( RULE_INT ) ;
    public final void rule__Attribute__IAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1735:1: ( ( RULE_INT ) )
            // InternalIfcBrick.g:1736:2: ( RULE_INT )
            {
            // InternalIfcBrick.g:1736:2: ( RULE_INT )
            // InternalIfcBrick.g:1737:3: RULE_INT
            {
             before(grammarAccess.getAttributeAccess().getIINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Attribute__IAssignment_9"


    // $ANTLR start "rule__Attribute__DAssignment_10"
    // InternalIfcBrick.g:1746:1: rule__Attribute__DAssignment_10 : ( RULE_DOUBLE ) ;
    public final void rule__Attribute__DAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1750:1: ( ( RULE_DOUBLE ) )
            // InternalIfcBrick.g:1751:2: ( RULE_DOUBLE )
            {
            // InternalIfcBrick.g:1751:2: ( RULE_DOUBLE )
            // InternalIfcBrick.g:1752:3: RULE_DOUBLE
            {
             before(grammarAccess.getAttributeAccess().getDDOUBLETerminalRuleCall_10_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDDOUBLETerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Attribute__DAssignment_10"


    // $ANTLR start "rule__Attribute__NAssignment_11"
    // InternalIfcBrick.g:1761:1: rule__Attribute__NAssignment_11 : ( RULE_NUMBER ) ;
    public final void rule__Attribute__NAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1765:1: ( ( RULE_NUMBER ) )
            // InternalIfcBrick.g:1766:2: ( RULE_NUMBER )
            {
            // InternalIfcBrick.g:1766:2: ( RULE_NUMBER )
            // InternalIfcBrick.g:1767:3: RULE_NUMBER
            {
             before(grammarAccess.getAttributeAccess().getNNUMBERTerminalRuleCall_11_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNNUMBERTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Attribute__NAssignment_11"


    // $ANTLR start "rule__EntId__IdAssignment_1"
    // InternalIfcBrick.g:1776:1: rule__EntId__IdAssignment_1 : ( RULE_INT ) ;
    public final void rule__EntId__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1780:1: ( ( RULE_INT ) )
            // InternalIfcBrick.g:1781:2: ( RULE_INT )
            {
            // InternalIfcBrick.g:1781:2: ( RULE_INT )
            // InternalIfcBrick.g:1782:3: RULE_INT
            {
             before(grammarAccess.getEntIdAccess().getIdINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntIdAccess().getIdINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntId__IdAssignment_1"


    // $ANTLR start "rule__CSV__AAssignment_0"
    // InternalIfcBrick.g:1791:1: rule__CSV__AAssignment_0 : ( RULE_INT ) ;
    public final void rule__CSV__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1795:1: ( ( RULE_INT ) )
            // InternalIfcBrick.g:1796:2: ( RULE_INT )
            {
            // InternalIfcBrick.g:1796:2: ( RULE_INT )
            // InternalIfcBrick.g:1797:3: RULE_INT
            {
             before(grammarAccess.getCSVAccess().getAINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCSVAccess().getAINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__CSV__AAssignment_0"


    // $ANTLR start "rule__CSV__BAssignment_2"
    // InternalIfcBrick.g:1806:1: rule__CSV__BAssignment_2 : ( RULE_INT ) ;
    public final void rule__CSV__BAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIfcBrick.g:1810:1: ( ( RULE_INT ) )
            // InternalIfcBrick.g:1811:2: ( RULE_INT )
            {
            // InternalIfcBrick.g:1811:2: ( RULE_INT )
            // InternalIfcBrick.g:1812:3: RULE_INT
            {
             before(grammarAccess.getCSVAccess().getBINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCSVAccess().getBINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CSV__BAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\uffff\1\14\2\uffff\1\16\12\uffff";
    static final String dfa_3s = "\1\4\1\25\2\uffff\1\17\12\uffff";
    static final String dfa_4s = "\1\33\1\27\2\uffff\1\27\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\13\1\14\1\5\1\1\1\4\1\12";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\10\1\4\1\11\1\12\14\uffff\1\5\2\uffff\1\3\1\2\1\6\1\7",
            "\1\13\2\14",
            "",
            "",
            "\1\15\6\uffff\2\16",
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

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "302:1: rule__Attribute__Alternatives : ( ( ( rule__Attribute__XAssignment_0 ) ) | ( ( rule__Attribute__EidAssignment_1 ) ) | ( ( rule__Attribute__Group_2__0 ) ) | ( ( rule__Attribute__CAssignment_3 ) ) | ( ( rule__Attribute__EAssignment_4 ) ) | ( ( rule__Attribute__AcAssignment_5 ) ) | ( ( rule__Attribute__UAssignment_6 ) ) | ( ( rule__Attribute__UAssignment_7 ) ) | ( ( rule__Attribute__SAssignment_8 ) ) | ( ( rule__Attribute__IAssignment_9 ) ) | ( ( rule__Attribute__DAssignment_10 ) ) | ( ( rule__Attribute__NAssignment_11 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000FE001F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F2001F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});

}