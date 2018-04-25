package org.xtext.ifcbrickconvert.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIfcBrickLexer extends Lexer {
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

    public InternalIfcBrickLexer() {;} 
    public InternalIfcBrickLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalIfcBrickLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalIfcBrick.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:11:7: ( 'ISO-10303-21' )
            // InternalIfcBrick.g:11:9: 'ISO-10303-21'
            {
            match("ISO-10303-21"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:12:7: ( ';' )
            // InternalIfcBrick.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:13:7: ( 'END-ISO-10303-21' )
            // InternalIfcBrick.g:13:9: 'END-ISO-10303-21'
            {
            match("END-ISO-10303-21"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:14:7: ( 'HEADER' )
            // InternalIfcBrick.g:14:9: 'HEADER'
            {
            match("HEADER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:15:7: ( 'ENDSEC' )
            // InternalIfcBrick.g:15:9: 'ENDSEC'
            {
            match("ENDSEC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:16:7: ( 'DATA' )
            // InternalIfcBrick.g:16:9: 'DATA'
            {
            match("DATA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:17:7: ( '=' )
            // InternalIfcBrick.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:18:7: ( '(' )
            // InternalIfcBrick.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:19:7: ( ')' )
            // InternalIfcBrick.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:20:7: ( ',' )
            // InternalIfcBrick.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:21:7: ( '.' )
            // InternalIfcBrick.g:21:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:22:7: ( '#' )
            // InternalIfcBrick.g:22:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:23:7: ( '$' )
            // InternalIfcBrick.g:23:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:24:7: ( '*' )
            // InternalIfcBrick.g:24:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1821:13: ( RULE_INT '.' ( RULE_INT )? ( 'E' ( '-' )? ( '0' .. '9' )* )? )
            // InternalIfcBrick.g:1821:15: RULE_INT '.' ( RULE_INT )? ( 'E' ( '-' )? ( '0' .. '9' )* )?
            {
            mRULE_INT(); 
            match('.'); 
            // InternalIfcBrick.g:1821:28: ( RULE_INT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalIfcBrick.g:1821:28: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalIfcBrick.g:1821:38: ( 'E' ( '-' )? ( '0' .. '9' )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIfcBrick.g:1821:39: 'E' ( '-' )? ( '0' .. '9' )*
                    {
                    match('E'); 
                    // InternalIfcBrick.g:1821:43: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalIfcBrick.g:1821:43: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // InternalIfcBrick.g:1821:48: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalIfcBrick.g:1821:49: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1823:13: ( '-' RULE_INT ( '.' ( RULE_INT )* )? ( 'E' ( '-' )? RULE_INT )? )
            // InternalIfcBrick.g:1823:15: '-' RULE_INT ( '.' ( RULE_INT )* )? ( 'E' ( '-' )? RULE_INT )?
            {
            match('-'); 
            mRULE_INT(); 
            // InternalIfcBrick.g:1823:28: ( '.' ( RULE_INT )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIfcBrick.g:1823:29: '.' ( RULE_INT )*
                    {
                    match('.'); 
                    // InternalIfcBrick.g:1823:33: ( RULE_INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalIfcBrick.g:1823:33: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalIfcBrick.g:1823:45: ( 'E' ( '-' )? RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIfcBrick.g:1823:46: 'E' ( '-' )? RULE_INT
                    {
                    match('E'); 
                    // InternalIfcBrick.g:1823:50: ( '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalIfcBrick.g:1823:50: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_XSTRING"
    public final void mRULE_XSTRING() throws RecognitionException {
        try {
            int _type = RULE_XSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1825:14: ( ( '\\'' ( options {greedy=false; } : . )* '\\'' )+ )
            // InternalIfcBrick.g:1825:16: ( '\\'' ( options {greedy=false; } : . )* '\\'' )+
            {
            // InternalIfcBrick.g:1825:16: ( '\\'' ( options {greedy=false; } : . )* '\\'' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\'') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIfcBrick.g:1825:17: '\\'' ( options {greedy=false; } : . )* '\\''
            	    {
            	    match('\''); 
            	    // InternalIfcBrick.g:1825:22: ( options {greedy=false; } : . )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0=='\'') ) {
            	            alt9=2;
            	        }
            	        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='\uFFFF')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalIfcBrick.g:1825:50: .
            	    	    {
            	    	    matchAny(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XSTRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1827:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIfcBrick.g:1827:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIfcBrick.g:1827:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIfcBrick.g:1827:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalIfcBrick.g:1827:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIfcBrick.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1829:10: ( ( '0' .. '9' )+ )
            // InternalIfcBrick.g:1829:12: ( '0' .. '9' )+
            {
            // InternalIfcBrick.g:1829:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIfcBrick.g:1829:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1831:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIfcBrick.g:1831:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIfcBrick.g:1831:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalIfcBrick.g:1831:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIfcBrick.g:1831:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalIfcBrick.g:1831:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIfcBrick.g:1831:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalIfcBrick.g:1831:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIfcBrick.g:1831:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalIfcBrick.g:1831:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIfcBrick.g:1831:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1833:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalIfcBrick.g:1833:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalIfcBrick.g:1833:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIfcBrick.g:1833:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1835:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIfcBrick.g:1835:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalIfcBrick.g:1835:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIfcBrick.g:1835:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalIfcBrick.g:1835:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalIfcBrick.g:1835:41: ( '\\r' )? '\\n'
                    {
                    // InternalIfcBrick.g:1835:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalIfcBrick.g:1835:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1837:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIfcBrick.g:1837:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIfcBrick.g:1837:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIfcBrick.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIfcBrick.g:1839:16: ( . )
            // InternalIfcBrick.g:1839:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalIfcBrick.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_DOUBLE | RULE_NUMBER | RULE_XSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=24;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalIfcBrick.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalIfcBrick.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalIfcBrick.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalIfcBrick.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalIfcBrick.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalIfcBrick.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalIfcBrick.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalIfcBrick.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalIfcBrick.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalIfcBrick.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalIfcBrick.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalIfcBrick.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalIfcBrick.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalIfcBrick.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalIfcBrick.g:1:94: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 16 :
                // InternalIfcBrick.g:1:106: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 17 :
                // InternalIfcBrick.g:1:118: RULE_XSTRING
                {
                mRULE_XSTRING(); 

                }
                break;
            case 18 :
                // InternalIfcBrick.g:1:131: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // InternalIfcBrick.g:1:139: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // InternalIfcBrick.g:1:148: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // InternalIfcBrick.g:1:160: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // InternalIfcBrick.g:1:176: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // InternalIfcBrick.g:1:192: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // InternalIfcBrick.g:1:200: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\30\1\uffff\3\30\10\uffff\1\45\3\26\1\uffff\2\26\2\uffff\1\30\2\uffff\3\30\11\uffff\1\45\11\uffff\4\30\1\uffff\1\64\3\uffff\2\30\1\77\1\uffff\2\30\1\uffff\1\102\1\103\2\uffff";
    static final String DFA22_eofS =
        "\104\uffff";
    static final String DFA22_minS =
        "\1\0\1\123\1\uffff\1\116\1\105\1\101\10\uffff\1\56\1\60\1\0\1\101\1\uffff\1\0\1\52\2\uffff\1\117\2\uffff\1\104\1\101\1\124\11\uffff\1\56\3\uffff\2\0\4\uffff\2\55\1\104\1\101\1\uffff\2\0\2\uffff\2\105\1\60\1\uffff\1\103\1\122\1\uffff\2\60\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\123\1\uffff\1\116\1\105\1\101\10\uffff\2\71\1\uffff\1\172\1\uffff\1\uffff\1\57\2\uffff\1\117\2\uffff\1\104\1\101\1\124\11\uffff\1\71\3\uffff\2\uffff\4\uffff\1\55\1\123\1\104\1\101\1\uffff\2\uffff\2\uffff\2\105\1\172\1\uffff\1\103\1\122\1\uffff\2\172\2\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\3\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\4\uffff\1\22\2\uffff\1\27\1\30\1\uffff\1\22\1\2\3\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\23\1\uffff\1\17\1\20\1\21\2\uffff\1\24\1\25\1\26\1\27\4\uffff\1\21\2\uffff\1\1\1\3\3\uffff\1\21\2\uffff\1\6\2\uffff\1\5\1\4";
    static final String DFA22_specialS =
        "\1\0\17\uffff\1\2\2\uffff\1\4\26\uffff\1\6\1\3\11\uffff\1\5\1\1\15\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\23\1\13\1\14\2\26\1\20\1\7\1\10\1\15\1\26\1\11\1\17\1\12\1\24\12\16\1\26\1\2\1\26\1\6\3\26\3\22\1\5\1\3\2\22\1\4\1\1\21\22\3\26\1\21\1\22\1\26\32\22\uff85\26",
            "\1\27",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\46",
            "\12\50",
            "\47\53\1\51\64\53\1\52\uffa3\53",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\0\54",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "\1\60",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\46",
            "",
            "",
            "",
            "\47\66\1\65\uffd8\66",
            "\47\53\1\51\64\53\1\52\uffa3\53",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70\45\uffff\1\71",
            "\1\72",
            "\1\73",
            "",
            "\47\53\1\74\64\53\1\52\uffa3\53",
            "\47\53\1\51\64\53\1\52\uffa3\53",
            "",
            "",
            "\1\75",
            "\1\76",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\100",
            "\1\101",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_DOUBLE | RULE_NUMBER | RULE_XSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='I') ) {s = 1;}

                        else if ( (LA22_0==';') ) {s = 2;}

                        else if ( (LA22_0=='E') ) {s = 3;}

                        else if ( (LA22_0=='H') ) {s = 4;}

                        else if ( (LA22_0=='D') ) {s = 5;}

                        else if ( (LA22_0=='=') ) {s = 6;}

                        else if ( (LA22_0=='(') ) {s = 7;}

                        else if ( (LA22_0==')') ) {s = 8;}

                        else if ( (LA22_0==',') ) {s = 9;}

                        else if ( (LA22_0=='.') ) {s = 10;}

                        else if ( (LA22_0=='#') ) {s = 11;}

                        else if ( (LA22_0=='$') ) {s = 12;}

                        else if ( (LA22_0=='*') ) {s = 13;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 14;}

                        else if ( (LA22_0=='-') ) {s = 15;}

                        else if ( (LA22_0=='\'') ) {s = 16;}

                        else if ( (LA22_0=='^') ) {s = 17;}

                        else if ( ((LA22_0>='A' && LA22_0<='C')||(LA22_0>='F' && LA22_0<='G')||(LA22_0>='J' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {s = 18;}

                        else if ( (LA22_0=='\"') ) {s = 19;}

                        else if ( (LA22_0=='/') ) {s = 20;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 21;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='%' && LA22_0<='&')||LA22_0=='+'||LA22_0==':'||LA22_0=='<'||(LA22_0>='>' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_54 = input.LA(1);

                        s = -1;
                        if ( (LA22_54=='\'') ) {s = 41;}

                        else if ( (LA22_54=='\\') ) {s = 42;}

                        else if ( ((LA22_54>='\u0000' && LA22_54<='&')||(LA22_54>='(' && LA22_54<='[')||(LA22_54>=']' && LA22_54<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_16 = input.LA(1);

                        s = -1;
                        if ( (LA22_16=='\'') ) {s = 41;}

                        else if ( (LA22_16=='\\') ) {s = 42;}

                        else if ( ((LA22_16>='\u0000' && LA22_16<='&')||(LA22_16>='(' && LA22_16<='[')||(LA22_16>=']' && LA22_16<='\uFFFF')) ) {s = 43;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_43 = input.LA(1);

                        s = -1;
                        if ( (LA22_43=='\'') ) {s = 41;}

                        else if ( (LA22_43=='\\') ) {s = 42;}

                        else if ( ((LA22_43>='\u0000' && LA22_43<='&')||(LA22_43>='(' && LA22_43<='[')||(LA22_43>=']' && LA22_43<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_19 = input.LA(1);

                        s = -1;
                        if ( ((LA22_19>='\u0000' && LA22_19<='\uFFFF')) ) {s = 44;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_53 = input.LA(1);

                        s = -1;
                        if ( (LA22_53=='\'') ) {s = 60;}

                        else if ( (LA22_53=='\\') ) {s = 42;}

                        else if ( ((LA22_53>='\u0000' && LA22_53<='&')||(LA22_53>='(' && LA22_53<='[')||(LA22_53>=']' && LA22_53<='\uFFFF')) ) {s = 43;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_42 = input.LA(1);

                        s = -1;
                        if ( (LA22_42=='\'') ) {s = 53;}

                        else if ( ((LA22_42>='\u0000' && LA22_42<='&')||(LA22_42>='(' && LA22_42<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}