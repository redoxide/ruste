package de.redoxi.ruste.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRustLexer extends Lexer {
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
    public static final int T__11=11;
    public static final int RULE_IDENT=4;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_NON_SINGLE_QUOTE=5;
    public static final int T__10=10;
    public static final int RULE_XID_CONTINUE=8;

    // delegates
    // delegators

    public InternalRustLexer() {;} 
    public InternalRustLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRustLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:11:6: ( ';' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:11:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:12:7: ( '\\\\' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:12:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:13:7: ( 'n' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:13:9: 'n'
            {
            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:14:7: ( 'r' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:14:9: 'r'
            {
            match('r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:15:7: ( 't' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:15:9: 't'
            {
            match('t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:16:7: ( '0' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:16:9: '0'
            {
            match('0'); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:17:7: ( '#[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:17:9: '#['
            {
            match("#["); 


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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:18:7: ( ']' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:18:9: ']'
            {
            match(']'); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:19:7: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:19:9: ','
            {
            match(','); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:20:7: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:20:9: '('
            {
            match('('); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:21:7: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:21:9: ')'
            {
            match(')'); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:22:7: ( '=' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:22:9: '='
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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:23:7: ( 'mod' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:23:9: 'mod'
            {
            match("mod"); 


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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:24:7: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:24:9: '{'
            {
            match('{'); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:25:7: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:25:9: '}'
            {
            match('}'); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:26:7: ( '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:26:9: '\\''
            {
            match('\''); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:27:7: ( 'x' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:27:9: 'x'
            {
            match('x'); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:28:7: ( 'u' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:28:9: 'u'
            {
            match('u'); 

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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:29:7: ( 'U' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:29:9: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_HEX_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2566:16: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2566:18: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_XID_START"
    public final void mRULE_XID_START() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2568:25: ( 'a' .. 'z' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2568:27: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_XID_START"

    // $ANTLR start "RULE_XID_CONTINUE"
    public final void mRULE_XID_CONTINUE() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2570:28: ( ( 'a' .. 'z' | '_' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2570:30: ( 'a' .. 'z' | '_' )
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_XID_CONTINUE"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2572:12: ( RULE_XID_START ( RULE_XID_CONTINUE )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2572:14: RULE_XID_START ( RULE_XID_CONTINUE )*
            {
            mRULE_XID_START(); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2572:29: ( RULE_XID_CONTINUE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2572:29: RULE_XID_CONTINUE
            	    {
            	    mRULE_XID_CONTINUE(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_NON_SINGLE_QUOTE"
    public final void mRULE_NON_SINGLE_QUOTE() throws RecognitionException {
        try {
            int _type = RULE_NON_SINGLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2574:23: (~ ( '\\'' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:2574:25: ~ ( '\\'' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NON_SINGLE_QUOTE"

    public void mTokens() throws RecognitionException {
        // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_HEX_DIGIT | RULE_IDENT | RULE_NON_SINGLE_QUOTE )
        int alt2=22;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:123: RULE_HEX_DIGIT
                {
                mRULE_HEX_DIGIT(); 

                }
                break;
            case 21 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:138: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 22 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:149: RULE_NON_SINGLE_QUOTE
                {
                mRULE_NON_SINGLE_QUOTE(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\3\uffff\1\32\1\34\1\35\1\uffff\1\27\5\uffff\1\33\3\uffff\1\50\1"+
        "\51\1\uffff\1\53\20\uffff\1\33\6\uffff\1\55\1\uffff";
    static final String DFA2_eofS =
        "\56\uffff";
    static final String DFA2_minS =
        "\1\0\2\uffff\3\137\1\uffff\1\133\5\uffff\1\157\3\uffff\2\137\1\uffff"+
        "\1\137\20\uffff\1\144\6\uffff\1\137\1\uffff";
    static final String DFA2_maxS =
        "\1\uffff\2\uffff\3\172\1\uffff\1\133\5\uffff\1\157\3\uffff\2\172"+
        "\1\uffff\1\172\20\uffff\1\144\6\uffff\1\172\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1"+
        "\uffff\1\16\1\17\1\20\2\uffff\1\23\1\uffff\1\24\1\25\1\26\1\1\1"+
        "\2\1\3\1\25\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\1\16"+
        "\1\17\1\21\1\22\1\23\1\24\1\uffff\1\15";
    static final String DFA2_specialS =
        "\1\0\55\uffff}>";
    static final String[] DFA2_transitionS = {
            "\43\27\1\7\3\27\1\20\1\12\1\13\2\27\1\11\3\27\1\6\11\25\1\27"+
            "\1\1\1\27\1\14\3\27\6\25\16\27\1\23\6\27\1\2\1\10\3\27\6\24"+
            "\6\26\1\15\1\3\3\26\1\4\1\26\1\5\1\22\2\26\1\21\2\26\1\16\1"+
            "\27\1\17\uff82\27",
            "",
            "",
            "\1\33\1\uffff\32\33",
            "\1\33\1\uffff\32\33",
            "\1\33\1\uffff\32\33",
            "",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "",
            "",
            "",
            "\1\33\1\uffff\32\33",
            "\1\33\1\uffff\32\33",
            "",
            "\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_HEX_DIGIT | RULE_IDENT | RULE_NON_SINGLE_QUOTE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                        s = -1;
                        if ( (LA2_0==';') ) {s = 1;}

                        else if ( (LA2_0=='\\') ) {s = 2;}

                        else if ( (LA2_0=='n') ) {s = 3;}

                        else if ( (LA2_0=='r') ) {s = 4;}

                        else if ( (LA2_0=='t') ) {s = 5;}

                        else if ( (LA2_0=='0') ) {s = 6;}

                        else if ( (LA2_0=='#') ) {s = 7;}

                        else if ( (LA2_0==']') ) {s = 8;}

                        else if ( (LA2_0==',') ) {s = 9;}

                        else if ( (LA2_0=='(') ) {s = 10;}

                        else if ( (LA2_0==')') ) {s = 11;}

                        else if ( (LA2_0=='=') ) {s = 12;}

                        else if ( (LA2_0=='m') ) {s = 13;}

                        else if ( (LA2_0=='{') ) {s = 14;}

                        else if ( (LA2_0=='}') ) {s = 15;}

                        else if ( (LA2_0=='\'') ) {s = 16;}

                        else if ( (LA2_0=='x') ) {s = 17;}

                        else if ( (LA2_0=='u') ) {s = 18;}

                        else if ( (LA2_0=='U') ) {s = 19;}

                        else if ( ((LA2_0>='a' && LA2_0<='f')) ) {s = 20;}

                        else if ( ((LA2_0>='1' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')) ) {s = 21;}

                        else if ( ((LA2_0>='g' && LA2_0<='l')||(LA2_0>='o' && LA2_0<='q')||LA2_0=='s'||(LA2_0>='v' && LA2_0<='w')||(LA2_0>='y' && LA2_0<='z')) ) {s = 22;}

                        else if ( ((LA2_0>='\u0000' && LA2_0<='\"')||(LA2_0>='$' && LA2_0<='&')||(LA2_0>='*' && LA2_0<='+')||(LA2_0>='-' && LA2_0<='/')||LA2_0==':'||LA2_0=='<'||(LA2_0>='>' && LA2_0<='@')||(LA2_0>='G' && LA2_0<='T')||(LA2_0>='V' && LA2_0<='[')||(LA2_0>='^' && LA2_0<='`')||LA2_0=='|'||(LA2_0>='~' && LA2_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}