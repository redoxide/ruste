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
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_FLOAT_TYPE=7;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DEC_INT_LIT=37;
    public static final int RULE_SIGNED_INT_TYPE=16;
    public static final int RULE_I8=18;
    public static final int RULE_MUT_KEYWORD=12;
    public static final int RULE_MACHINE_UINT_TYPE=30;
    public static final int RULE_UTF32_CHAR=34;
    public static final int RULE_UTF16_CHAR=33;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int RULE_I16=19;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_U8=22;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_U64=25;
    public static final int T__54=54;
    public static final int RULE_OCT_INT_LIT=39;
    public static final int T__59=59;
    public static final int RULE_BIN_INT_LIT=38;
    public static final int RULE_INT_LIT=5;
    public static final int RULE_XID_CONTINUE=43;
    public static final int RULE_MACHINE_INT_TYPE=29;
    public static final int T__50=50;
    public static final int RULE_U32=24;
    public static final int RULE_HEX_INT_LIT=40;
    public static final int RULE_F64=28;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_DEC_DIGIT=36;
    public static final int RULE_OCT_DIGIT=41;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_HEX_DIGIT=35;
    public static final int RULE_UNICODE_CHAR=31;
    public static final int RULE_I32=20;
    public static final int RULE_UTF8_CHAR=32;
    public static final int RULE_INT_SIZE=15;
    public static final int RULE_INT_TYPE=6;
    public static final int RULE_UNSIGNED_INT_TYPE=17;
    public static final int RULE_I64=21;
    public static final int RULE_XID_START=42;
    public static final int RULE_FLOAT_LIT=4;
    public static final int RULE_IDENT=11;
    public static final int RULE_F32=27;
    public static final int RULE_U16=23;
    public static final int RULE_MACHINE_TYPE=9;
    public static final int RULE_FLOAT_SIZE=26;
    public static final int RULE_CHAR_LIT=14;
    public static final int RULE_STRING_LIT=13;
    public static final int RULE_BOOLEAN_TYPE=8;
    public static final int RULE_UNIT_TYPE=10;

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

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:11:7: ( 'priv' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:11:9: 'priv'
            {
            match("priv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:12:7: ( 'pub' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:12:9: 'pub'
            {
            match("pub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:13:7: ( '#[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:13:9: '#['
            {
            match("#["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:14:7: ( ']' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:15:7: ( ',' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:16:7: ( '(' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:17:7: ( ')' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:18:7: ( '=' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:19:7: ( 'mod' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:19:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:20:7: ( '{' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:21:7: ( '}' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:22:7: ( 'fn' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:22:9: 'fn'
            {
            match("fn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:23:7: ( '<' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:23:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:24:7: ( '>' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:24:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:25:7: ( '->' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:25:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:26:7: ( ':' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:27:7: ( '+' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:27:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:28:7: ( '_' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:28:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:29:7: ( '..' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:29:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:30:7: ( '[' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:30:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:31:7: ( 'struct' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:31:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:32:7: ( '@' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:32:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:33:7: ( '~' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:33:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:34:7: ( '&' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:34:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:35:7: ( 'enum' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:35:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:36:7: ( ';' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:36:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "RULE_INT_TYPE"
    public final void mRULE_INT_TYPE() throws RecognitionException {
        try {
            int _type = RULE_INT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7462:15: ( RULE_INT_SIZE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7462:17: RULE_INT_SIZE
            {
            mRULE_INT_SIZE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_TYPE"

    // $ANTLR start "RULE_INT_SIZE"
    public final void mRULE_INT_SIZE() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7464:24: ( ( RULE_SIGNED_INT_TYPE | RULE_UNSIGNED_INT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7464:26: ( RULE_SIGNED_INT_TYPE | RULE_UNSIGNED_INT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7464:26: ( RULE_SIGNED_INT_TYPE | RULE_UNSIGNED_INT_TYPE )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='i') ) {
                alt1=1;
            }
            else if ( (LA1_0=='u') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7464:27: RULE_SIGNED_INT_TYPE
                    {
                    mRULE_SIGNED_INT_TYPE(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7464:48: RULE_UNSIGNED_INT_TYPE
                    {
                    mRULE_UNSIGNED_INT_TYPE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_SIZE"

    // $ANTLR start "RULE_SIGNED_INT_TYPE"
    public final void mRULE_SIGNED_INT_TYPE() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7466:31: ( ( RULE_I8 | RULE_I16 | RULE_I32 | RULE_I64 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7466:33: ( RULE_I8 | RULE_I16 | RULE_I32 | RULE_I64 )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7466:33: ( RULE_I8 | RULE_I16 | RULE_I32 | RULE_I64 )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='i') ) {
                switch ( input.LA(2) ) {
                case '8':
                    {
                    alt2=1;
                    }
                    break;
                case '1':
                    {
                    alt2=2;
                    }
                    break;
                case '3':
                    {
                    alt2=3;
                    }
                    break;
                case '6':
                    {
                    alt2=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7466:34: RULE_I8
                    {
                    mRULE_I8(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7466:42: RULE_I16
                    {
                    mRULE_I16(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7466:51: RULE_I32
                    {
                    mRULE_I32(); 

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7466:60: RULE_I64
                    {
                    mRULE_I64(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INT_TYPE"

    // $ANTLR start "RULE_I8"
    public final void mRULE_I8() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7468:18: ( 'i8' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7468:20: 'i8'
            {
            match("i8"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_I8"

    // $ANTLR start "RULE_I16"
    public final void mRULE_I16() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7470:19: ( 'i16' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7470:21: 'i16'
            {
            match("i16"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_I16"

    // $ANTLR start "RULE_I32"
    public final void mRULE_I32() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7472:19: ( 'i32' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7472:21: 'i32'
            {
            match("i32"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_I32"

    // $ANTLR start "RULE_I64"
    public final void mRULE_I64() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7474:19: ( 'i64' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7474:21: 'i64'
            {
            match("i64"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_I64"

    // $ANTLR start "RULE_UNSIGNED_INT_TYPE"
    public final void mRULE_UNSIGNED_INT_TYPE() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7476:33: ( ( RULE_U8 | RULE_U16 | RULE_U32 | RULE_U64 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7476:35: ( RULE_U8 | RULE_U16 | RULE_U32 | RULE_U64 )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7476:35: ( RULE_U8 | RULE_U16 | RULE_U32 | RULE_U64 )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='u') ) {
                switch ( input.LA(2) ) {
                case '8':
                    {
                    alt3=1;
                    }
                    break;
                case '1':
                    {
                    alt3=2;
                    }
                    break;
                case '3':
                    {
                    alt3=3;
                    }
                    break;
                case '6':
                    {
                    alt3=4;
                    }
                    break;
                default:
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
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7476:36: RULE_U8
                    {
                    mRULE_U8(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7476:44: RULE_U16
                    {
                    mRULE_U16(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7476:53: RULE_U32
                    {
                    mRULE_U32(); 

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7476:62: RULE_U64
                    {
                    mRULE_U64(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_INT_TYPE"

    // $ANTLR start "RULE_U8"
    public final void mRULE_U8() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7478:18: ( 'u8' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7478:20: 'u8'
            {
            match("u8"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_U8"

    // $ANTLR start "RULE_U16"
    public final void mRULE_U16() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7480:19: ( 'u16' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7480:21: 'u16'
            {
            match("u16"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_U16"

    // $ANTLR start "RULE_U32"
    public final void mRULE_U32() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7482:19: ( 'u32' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7482:21: 'u32'
            {
            match("u32"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_U32"

    // $ANTLR start "RULE_U64"
    public final void mRULE_U64() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7484:19: ( 'u64' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7484:21: 'u64'
            {
            match("u64"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_U64"

    // $ANTLR start "RULE_FLOAT_TYPE"
    public final void mRULE_FLOAT_TYPE() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7486:17: ( RULE_FLOAT_SIZE )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7486:19: RULE_FLOAT_SIZE
            {
            mRULE_FLOAT_SIZE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_TYPE"

    // $ANTLR start "RULE_FLOAT_SIZE"
    public final void mRULE_FLOAT_SIZE() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7488:26: ( ( RULE_F32 | RULE_F64 ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7488:28: ( RULE_F32 | RULE_F64 )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7488:28: ( RULE_F32 | RULE_F64 )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='f') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='3') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='6') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7488:29: RULE_F32
                    {
                    mRULE_F32(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7488:38: RULE_F64
                    {
                    mRULE_F64(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_SIZE"

    // $ANTLR start "RULE_F32"
    public final void mRULE_F32() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7490:19: ( 'f32' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7490:21: 'f32'
            {
            match("f32"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_F32"

    // $ANTLR start "RULE_F64"
    public final void mRULE_F64() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7492:19: ( 'f64' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7492:21: 'f64'
            {
            match("f64"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_F64"

    // $ANTLR start "RULE_BOOLEAN_TYPE"
    public final void mRULE_BOOLEAN_TYPE() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7494:19: ( 'bool' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7494:21: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_TYPE"

    // $ANTLR start "RULE_MACHINE_TYPE"
    public final void mRULE_MACHINE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_MACHINE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7496:19: ( ( RULE_MACHINE_INT_TYPE | RULE_MACHINE_UINT_TYPE ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7496:21: ( RULE_MACHINE_INT_TYPE | RULE_MACHINE_UINT_TYPE )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7496:21: ( RULE_MACHINE_INT_TYPE | RULE_MACHINE_UINT_TYPE )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='i') ) {
                alt5=1;
            }
            else if ( (LA5_0=='u') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7496:22: RULE_MACHINE_INT_TYPE
                    {
                    mRULE_MACHINE_INT_TYPE(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7496:44: RULE_MACHINE_UINT_TYPE
                    {
                    mRULE_MACHINE_UINT_TYPE(); 

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
    // $ANTLR end "RULE_MACHINE_TYPE"

    // $ANTLR start "RULE_MACHINE_INT_TYPE"
    public final void mRULE_MACHINE_INT_TYPE() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7498:32: ( 'int' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7498:34: 'int'
            {
            match("int"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MACHINE_INT_TYPE"

    // $ANTLR start "RULE_MACHINE_UINT_TYPE"
    public final void mRULE_MACHINE_UINT_TYPE() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7500:33: ( 'uint' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7500:35: 'uint'
            {
            match("uint"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MACHINE_UINT_TYPE"

    // $ANTLR start "RULE_UNIT_TYPE"
    public final void mRULE_UNIT_TYPE() throws RecognitionException {
        try {
            int _type = RULE_UNIT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7502:16: ( '()' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7502:18: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNIT_TYPE"

    // $ANTLR start "RULE_MUT_KEYWORD"
    public final void mRULE_MUT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MUT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7504:18: ( 'mut' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7504:20: 'mut'
            {
            match("mut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUT_KEYWORD"

    // $ANTLR start "RULE_CHAR_LIT"
    public final void mRULE_CHAR_LIT() throws RecognitionException {
        try {
            int _type = RULE_CHAR_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7506:15: ( '\\'' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7506:17: '\\'' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7506:22: ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop6:
            do {
                int alt6=4;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2=='0'||LA6_2=='\\'||LA6_2=='n'||LA6_2=='r'||LA6_2=='t') ) {
                        alt6=1;
                    }
                    else if ( (LA6_2=='U'||LA6_2=='u'||LA6_2=='x') ) {
                        alt6=2;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=3;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7506:23: '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='0'||input.LA(1)=='\\'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7506:51: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7506:69: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop6;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR_LIT"

    // $ANTLR start "RULE_STRING_LIT"
    public final void mRULE_STRING_LIT() throws RecognitionException {
        try {
            int _type = RULE_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7508:17: ( '\"' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7508:19: '\"' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7508:23: ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\"' ) ) )*
            loop7:
            do {
                int alt7=4;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2=='0'||LA7_2=='\\'||LA7_2=='n'||LA7_2=='r'||LA7_2=='t') ) {
                        alt7=1;
                    }
                    else if ( (LA7_2=='U'||LA7_2=='u'||LA7_2=='x') ) {
                        alt7=2;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=3;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7508:24: '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='0'||input.LA(1)=='\\'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7508:52: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7508:70: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LIT"

    // $ANTLR start "RULE_UNICODE_CHAR"
    public final void mRULE_UNICODE_CHAR() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7510:28: ( ( RULE_UTF8_CHAR | RULE_UTF16_CHAR | RULE_UTF32_CHAR ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7510:30: ( RULE_UTF8_CHAR | RULE_UTF16_CHAR | RULE_UTF32_CHAR )
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7510:30: ( RULE_UTF8_CHAR | RULE_UTF16_CHAR | RULE_UTF32_CHAR )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'x':
                    {
                    alt8=1;
                    }
                    break;
                case 'u':
                    {
                    alt8=2;
                    }
                    break;
                case 'U':
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7510:31: RULE_UTF8_CHAR
                    {
                    mRULE_UTF8_CHAR(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7510:46: RULE_UTF16_CHAR
                    {
                    mRULE_UTF16_CHAR(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7510:62: RULE_UTF32_CHAR
                    {
                    mRULE_UTF32_CHAR(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_CHAR"

    // $ANTLR start "RULE_UTF8_CHAR"
    public final void mRULE_UTF8_CHAR() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7512:25: ( '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7512:27: '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match("\\x"); 

            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UTF8_CHAR"

    // $ANTLR start "RULE_UTF16_CHAR"
    public final void mRULE_UTF16_CHAR() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7514:26: ( '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7514:28: '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match("\\u"); 

            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UTF16_CHAR"

    // $ANTLR start "RULE_UTF32_CHAR"
    public final void mRULE_UTF32_CHAR() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7516:26: ( '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7516:28: '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match("\\U"); 

            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UTF32_CHAR"

    // $ANTLR start "RULE_FLOAT_LIT"
    public final void mRULE_FLOAT_LIT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:16: ( RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )* '.' ( RULE_DEC_DIGIT | '_' )+ ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+ )? ( RULE_FLOAT_SIZE )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:18: RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )* '.' ( RULE_DEC_DIGIT | '_' )+ ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+ )? ( RULE_FLOAT_SIZE )?
            {
            mRULE_DEC_DIGIT(); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:33: ( RULE_DEC_DIGIT | '_' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('.'); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:59: ( RULE_DEC_DIGIT | '_' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:81: ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='E'||LA13_0=='e') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:82: ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:92: ( '+' | '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='+'||LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:103: ( RULE_DEC_DIGIT | '_' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')||LA12_0=='_') ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:127: ( RULE_FLOAT_SIZE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='f') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7518:127: RULE_FLOAT_SIZE
                    {
                    mRULE_FLOAT_SIZE(); 

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
    // $ANTLR end "RULE_FLOAT_LIT"

    // $ANTLR start "RULE_INT_LIT"
    public final void mRULE_INT_LIT() throws RecognitionException {
        try {
            int _type = RULE_INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7520:14: ( ( RULE_DEC_INT_LIT | RULE_BIN_INT_LIT | RULE_OCT_INT_LIT | RULE_HEX_INT_LIT ) ( RULE_INT_SIZE )? )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7520:16: ( RULE_DEC_INT_LIT | RULE_BIN_INT_LIT | RULE_OCT_INT_LIT | RULE_HEX_INT_LIT ) ( RULE_INT_SIZE )?
            {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7520:16: ( RULE_DEC_INT_LIT | RULE_BIN_INT_LIT | RULE_OCT_INT_LIT | RULE_HEX_INT_LIT )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'b':
                    {
                    alt15=2;
                    }
                    break;
                case 'o':
                    {
                    alt15=3;
                    }
                    break;
                case 'x':
                    {
                    alt15=4;
                    }
                    break;
                default:
                    alt15=1;}

            }
            else if ( ((LA15_0>='1' && LA15_0<='9')) ) {
                alt15=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7520:17: RULE_DEC_INT_LIT
                    {
                    mRULE_DEC_INT_LIT(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7520:34: RULE_BIN_INT_LIT
                    {
                    mRULE_BIN_INT_LIT(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7520:51: RULE_OCT_INT_LIT
                    {
                    mRULE_OCT_INT_LIT(); 

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7520:68: RULE_HEX_INT_LIT
                    {
                    mRULE_HEX_INT_LIT(); 

                    }
                    break;

            }

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7520:86: ( RULE_INT_SIZE )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='i'||LA16_0=='u') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7520:86: RULE_INT_SIZE
                    {
                    mRULE_INT_SIZE(); 

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
    // $ANTLR end "RULE_INT_LIT"

    // $ANTLR start "RULE_DEC_INT_LIT"
    public final void mRULE_DEC_INT_LIT() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7522:27: ( RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7522:29: RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )*
            {
            mRULE_DEC_DIGIT(); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7522:44: ( RULE_DEC_DIGIT | '_' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||LA17_0=='_') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_INT_LIT"

    // $ANTLR start "RULE_BIN_INT_LIT"
    public final void mRULE_BIN_INT_LIT() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7524:27: ( '0b' ( '0' | '1' | '_' )+ )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7524:29: '0b' ( '0' | '1' | '_' )+
            {
            match("0b"); 

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7524:34: ( '0' | '1' | '_' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='1')||LA18_0=='_') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='1')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIN_INT_LIT"

    // $ANTLR start "RULE_OCT_INT_LIT"
    public final void mRULE_OCT_INT_LIT() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7526:27: ( '0o' ( RULE_OCT_DIGIT | '_' )+ )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7526:29: '0o' ( RULE_OCT_DIGIT | '_' )+
            {
            match("0o"); 

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7526:34: ( RULE_OCT_DIGIT | '_' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='7')||LA19_0=='_') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='7')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCT_INT_LIT"

    // $ANTLR start "RULE_HEX_INT_LIT"
    public final void mRULE_HEX_INT_LIT() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7528:27: ( '0x' ( RULE_HEX_DIGIT | '_' )+ )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7528:29: '0x' ( RULE_HEX_DIGIT | '_' )+
            {
            match("0x"); 

            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7528:34: ( RULE_HEX_DIGIT | '_' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='F')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='f')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_INT_LIT"

    // $ANTLR start "RULE_OCT_DIGIT"
    public final void mRULE_OCT_DIGIT() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7530:25: ( '0' .. '7' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7530:27: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCT_DIGIT"

    // $ANTLR start "RULE_DEC_DIGIT"
    public final void mRULE_DEC_DIGIT() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7532:25: ( '0' .. '9' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7532:27: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7534:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7534:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
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
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_XID_START"
    public final void mRULE_XID_START() throws RecognitionException {
        try {
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7536:25: ( 'a' .. 'z' )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7536:27: 'a' .. 'z'
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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7538:28: ( ( 'a' .. 'z' | '_' ) )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7538:30: ( 'a' .. 'z' | '_' )
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
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7540:12: ( RULE_XID_START ( RULE_XID_CONTINUE )* )
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7540:14: RULE_XID_START ( RULE_XID_CONTINUE )*
            {
            mRULE_XID_START(); 
            // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7540:29: ( RULE_XID_CONTINUE )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:7540:29: RULE_XID_CONTINUE
            	    {
            	    mRULE_XID_CONTINUE(); 

            	    }
            	    break;

            	default :
            	    break loop21;
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

    public void mTokens() throws RecognitionException {
        // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:8: ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_INT_TYPE | RULE_FLOAT_TYPE | RULE_BOOLEAN_TYPE | RULE_MACHINE_TYPE | RULE_UNIT_TYPE | RULE_MUT_KEYWORD | RULE_CHAR_LIT | RULE_STRING_LIT | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_IDENT )
        int alt22=37;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:10: T__44
                {
                mT__44(); 

                }
                break;
            case 2 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:16: T__45
                {
                mT__45(); 

                }
                break;
            case 3 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:22: T__46
                {
                mT__46(); 

                }
                break;
            case 4 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:28: T__47
                {
                mT__47(); 

                }
                break;
            case 5 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:34: T__48
                {
                mT__48(); 

                }
                break;
            case 6 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:40: T__49
                {
                mT__49(); 

                }
                break;
            case 7 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:46: T__50
                {
                mT__50(); 

                }
                break;
            case 8 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:52: T__51
                {
                mT__51(); 

                }
                break;
            case 9 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:58: T__52
                {
                mT__52(); 

                }
                break;
            case 10 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:64: T__53
                {
                mT__53(); 

                }
                break;
            case 11 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:70: T__54
                {
                mT__54(); 

                }
                break;
            case 12 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:76: T__55
                {
                mT__55(); 

                }
                break;
            case 13 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:82: T__56
                {
                mT__56(); 

                }
                break;
            case 14 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:88: T__57
                {
                mT__57(); 

                }
                break;
            case 15 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:94: T__58
                {
                mT__58(); 

                }
                break;
            case 16 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:100: T__59
                {
                mT__59(); 

                }
                break;
            case 17 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:106: T__60
                {
                mT__60(); 

                }
                break;
            case 18 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:112: T__61
                {
                mT__61(); 

                }
                break;
            case 19 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:118: T__62
                {
                mT__62(); 

                }
                break;
            case 20 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:124: T__63
                {
                mT__63(); 

                }
                break;
            case 21 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:130: T__64
                {
                mT__64(); 

                }
                break;
            case 22 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:136: T__65
                {
                mT__65(); 

                }
                break;
            case 23 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:142: T__66
                {
                mT__66(); 

                }
                break;
            case 24 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:148: T__67
                {
                mT__67(); 

                }
                break;
            case 25 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:154: T__68
                {
                mT__68(); 

                }
                break;
            case 26 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:160: T__69
                {
                mT__69(); 

                }
                break;
            case 27 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:166: RULE_INT_TYPE
                {
                mRULE_INT_TYPE(); 

                }
                break;
            case 28 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:180: RULE_FLOAT_TYPE
                {
                mRULE_FLOAT_TYPE(); 

                }
                break;
            case 29 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:196: RULE_BOOLEAN_TYPE
                {
                mRULE_BOOLEAN_TYPE(); 

                }
                break;
            case 30 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:214: RULE_MACHINE_TYPE
                {
                mRULE_MACHINE_TYPE(); 

                }
                break;
            case 31 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:232: RULE_UNIT_TYPE
                {
                mRULE_UNIT_TYPE(); 

                }
                break;
            case 32 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:247: RULE_MUT_KEYWORD
                {
                mRULE_MUT_KEYWORD(); 

                }
                break;
            case 33 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:264: RULE_CHAR_LIT
                {
                mRULE_CHAR_LIT(); 

                }
                break;
            case 34 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:278: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 35 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:294: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 36 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:309: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 37 :
                // ../de.redoxi.ruste.ui/src-gen/de/redoxi/ruste/ui/contentassist/antlr/internal/InternalRust.g:1:322: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\41\3\uffff\1\45\2\uffff\1\41\2\uffff\1\41\10\uffff\1"+
        "\41\3\uffff\1\41\1\uffff\3\41\2\uffff\2\60\1\uffff\2\41\2\uffff"+
        "\2\41\1\67\1\uffff\2\41\1\uffff\3\41\1\uffff\1\60\1\uffff\1\41\1"+
        "\76\1\77\1\100\1\uffff\2\41\1\103\2\41\1\106\3\uffff\1\41\1\110"+
        "\1\uffff\1\103\1\111\1\uffff\1\41\2\uffff\1\113\1\uffff";
    static final String DFA22_eofS =
        "\114\uffff";
    static final String DFA22_minS =
        "\1\42\1\162\3\uffff\1\51\2\uffff\1\157\2\uffff\1\63\10\uffff\1\164"+
        "\3\uffff\1\156\1\uffff\2\61\1\157\2\uffff\2\56\1\uffff\1\151\1\142"+
        "\2\uffff\1\144\1\164\1\137\1\uffff\1\162\1\165\1\uffff\1\164\1\156"+
        "\1\157\1\uffff\1\56\1\uffff\1\166\3\137\1\uffff\1\165\1\155\1\137"+
        "\1\164\1\154\1\137\3\uffff\1\143\1\137\1\uffff\2\137\1\uffff\1\164"+
        "\2\uffff\1\137\1\uffff";
    static final String DFA22_maxS =
        "\1\176\1\165\3\uffff\1\51\2\uffff\1\165\2\uffff\1\156\10\uffff\1"+
        "\164\3\uffff\1\156\1\uffff\1\156\1\151\1\157\2\uffff\2\137\1\uffff"+
        "\1\151\1\142\2\uffff\1\144\1\164\1\172\1\uffff\1\162\1\165\1\uffff"+
        "\1\164\1\156\1\157\1\uffff\1\137\1\uffff\1\166\3\172\1\uffff\1\165"+
        "\1\155\1\172\1\164\1\154\1\172\3\uffff\1\143\1\172\1\uffff\2\172"+
        "\1\uffff\1\164\2\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\uffff\1\7\1\10\1\uffff\1\12\1\13\1\uffff"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff\1\26\1\27\1\30"+
        "\1\uffff\1\32\3\uffff\1\41\1\42\2\uffff\1\45\2\uffff\1\37\1\6\3"+
        "\uffff\1\34\2\uffff\1\33\3\uffff\1\44\1\uffff\1\43\4\uffff\1\14"+
        "\6\uffff\1\2\1\11\1\40\2\uffff\1\36\2\uffff\1\1\1\uffff\1\31\1\35"+
        "\1\uffff\1\25";
    static final String DFA22_specialS =
        "\114\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\36\1\2\2\uffff\1\27\1\35\1\5\1\6\1\uffff\1\20\1\4\1\16\1"+
            "\22\1\uffff\1\37\11\40\1\17\1\31\1\14\1\7\1\15\1\uffff\1\25"+
            "\32\uffff\1\23\1\uffff\1\3\1\uffff\1\21\1\uffff\1\41\1\34\2"+
            "\41\1\30\1\13\2\41\1\32\3\41\1\10\2\41\1\1\2\41\1\24\1\41\1"+
            "\33\5\41\1\11\1\uffff\1\12\1\26",
            "\1\42\2\uffff\1\43",
            "",
            "",
            "",
            "\1\44",
            "",
            "",
            "\1\46\5\uffff\1\47",
            "",
            "",
            "\1\51\2\uffff\1\51\67\uffff\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "",
            "",
            "",
            "\1\53",
            "",
            "\1\54\1\uffff\1\54\2\uffff\1\54\1\uffff\1\54\65\uffff\1\55",
            "\1\54\1\uffff\1\54\2\uffff\1\54\1\uffff\1\54\60\uffff\1\56",
            "\1\57",
            "",
            "",
            "\1\62\1\uffff\12\61\45\uffff\1\61",
            "\1\62\1\uffff\12\61\45\uffff\1\61",
            "",
            "\1\63",
            "\1\64",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\41\1\uffff\32\41",
            "",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "\1\62\1\uffff\12\61\45\uffff\1\61",
            "",
            "\1\75",
            "\1\41\1\uffff\32\41",
            "\1\41\1\uffff\32\41",
            "\1\41\1\uffff\32\41",
            "",
            "\1\101",
            "\1\102",
            "\1\41\1\uffff\32\41",
            "\1\104",
            "\1\105",
            "\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\1\107",
            "\1\41\1\uffff\32\41",
            "",
            "\1\41\1\uffff\32\41",
            "\1\41\1\uffff\32\41",
            "",
            "\1\112",
            "",
            "",
            "\1\41\1\uffff\32\41",
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
            return "1:1: Tokens : ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_INT_TYPE | RULE_FLOAT_TYPE | RULE_BOOLEAN_TYPE | RULE_MACHINE_TYPE | RULE_UNIT_TYPE | RULE_MUT_KEYWORD | RULE_CHAR_LIT | RULE_STRING_LIT | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_IDENT );";
        }
    }
 

}