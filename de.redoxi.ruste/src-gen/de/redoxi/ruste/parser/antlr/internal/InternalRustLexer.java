package de.redoxi.ruste.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRustLexer extends Lexer {
    public static final int RULE_FLOAT_TYPE=9;
    public static final int RULE_I8=19;
    public static final int RULE_MACHINE_UINT_TYPE=31;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_OCT_INT_LIT=40;
    public static final int RULE_INT_LIT=14;
    public static final int RULE_U32=25;
    public static final int RULE_HEX_INT_LIT=41;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_F64=29;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_DEC_DIGIT=37;
    public static final int RULE_OCT_DIGIT=42;
    public static final int RULE_HEX_DIGIT=36;
    public static final int RULE_UNICODE_CHAR=32;
    public static final int RULE_UTF8_CHAR=33;
    public static final int RULE_I32=21;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_UNSIGNED_INT_TYPE=18;
    public static final int RULE_XID_START=43;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_IDENT=4;
    public static final int RULE_MACHINE_TYPE=11;
    public static final int RULE_FLOAT_SIZE=27;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_BOOLEAN_TYPE=10;
    public static final int RULE_UNIT_TYPE=12;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DEC_INT_LIT=38;
    public static final int RULE_SIGNED_INT_TYPE=17;
    public static final int RULE_MUT_KEYWORD=6;
    public static final int RULE_UTF32_CHAR=35;
    public static final int T__61=61;
    public static final int RULE_UTF16_CHAR=34;
    public static final int T__60=60;
    public static final int RULE_I16=20;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_U8=23;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_U64=26;
    public static final int T__59=59;
    public static final int RULE_BIN_INT_LIT=39;
    public static final int RULE_XID_CONTINUE=44;
    public static final int RULE_MACHINE_INT_TYPE=30;
    public static final int T__50=50;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_LIFETIME=7;
    public static final int RULE_INT_SIZE=16;
    public static final int RULE_INT_TYPE=8;
    public static final int RULE_I64=22;
    public static final int RULE_FLOAT_LIT=13;
    public static final int RULE_F32=28;
    public static final int RULE_U16=24;
    public static final int RULE_CHAR_LIT=15;
    public static final int RULE_STRING_LIT=5;

    // delegates
    // delegators

    public InternalRustLexer() {;} 
    public InternalRustLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRustLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g"; }

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:11:7: ( '#[' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:11:9: '#['
            {
            match("#["); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:12:7: ( ',' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:12:9: ','
            {
            match(','); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:13:7: ( ']' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:13:9: ']'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:14:7: ( '(' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:14:9: '('
            {
            match('('); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:15:7: ( ')' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:15:9: ')'
            {
            match(')'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:16:7: ( '=' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:16:9: '='
            {
            match('='); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:17:7: ( 'mod' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:17:9: 'mod'
            {
            match("mod"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:18:7: ( ';' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:18:9: ';'
            {
            match(';'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:19:7: ( '{' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:19:9: '{'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:20:7: ( '}' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:20:9: '}'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:21:7: ( 'fn' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:21:9: 'fn'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:22:7: ( '<' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:22:9: '<'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:23:7: ( '>' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:23:9: '>'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:24:7: ( '->' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:24:9: '->'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:25:7: ( 'type' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:25:9: 'type'
            {
            match("type"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:26:7: ( 'struct' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:26:9: 'struct'
            {
            match("struct"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:27:7: ( 'enum' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:27:9: 'enum'
            {
            match("enum"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:28:7: ( 'trait' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:28:9: 'trait'
            {
            match("trait"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:29:7: ( 'unsafe' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:29:9: 'unsafe'
            {
            match("unsafe"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:30:7: ( 'extern' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:30:9: 'extern'
            {
            match("extern"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:31:7: ( 'impl' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:31:9: 'impl'
            {
            match("impl"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:32:7: ( 'for' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:32:9: 'for'
            {
            match("for"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:33:7: ( 'static' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:33:9: 'static'
            {
            match("static"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:34:7: ( ':' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:34:9: ':'
            {
            match(':'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:35:7: ( '..' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:35:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:36:7: ( '[' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:36:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:37:7: ( '-' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:37:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:38:7: ( '*' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:39:7: ( '!' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:39:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:40:7: ( '@' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:40:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:41:7: ( '~' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:41:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:42:7: ( '&' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:42:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:43:7: ( '/' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:43:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:44:7: ( '%' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:44:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:45:7: ( 'as' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:45:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:46:7: ( '+' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:46:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:47:7: ( '<<' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:47:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:48:7: ( '>>' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:48:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:49:7: ( '^' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:49:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:50:7: ( '|' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:50:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:51:7: ( '<=' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:51:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:52:7: ( '>=' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:52:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:53:7: ( '==' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:53:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:54:7: ( '!=' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:54:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:55:7: ( '&&' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:55:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:56:7: ( 'while' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:56:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:57:7: ( 'loop' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:57:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:58:7: ( '_' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:58:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:59:7: ( '::' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:59:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:60:7: ( '::<' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:60:9: '::<'
            {
            match("::<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:61:7: ( 'priv' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:61:9: 'priv'
            {
            match("priv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:62:7: ( 'pub' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:62:9: 'pub'
            {
            match("pub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "RULE_LIFETIME"
    public final void mRULE_LIFETIME() throws RecognitionException {
        try {
            int _type = RULE_LIFETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6729:15: ( '\\'' RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6729:17: '\\'' RULE_IDENT
            {
            match('\''); 
            mRULE_IDENT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LIFETIME"

    // $ANTLR start "RULE_INT_TYPE"
    public final void mRULE_INT_TYPE() throws RecognitionException {
        try {
            int _type = RULE_INT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6731:15: ( RULE_INT_SIZE )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6731:17: RULE_INT_SIZE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6733:24: ( ( RULE_SIGNED_INT_TYPE | RULE_UNSIGNED_INT_TYPE ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6733:26: ( RULE_SIGNED_INT_TYPE | RULE_UNSIGNED_INT_TYPE )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6733:26: ( RULE_SIGNED_INT_TYPE | RULE_UNSIGNED_INT_TYPE )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6733:27: RULE_SIGNED_INT_TYPE
                    {
                    mRULE_SIGNED_INT_TYPE(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6733:48: RULE_UNSIGNED_INT_TYPE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6735:31: ( ( RULE_I8 | RULE_I16 | RULE_I32 | RULE_I64 ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6735:33: ( RULE_I8 | RULE_I16 | RULE_I32 | RULE_I64 )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6735:33: ( RULE_I8 | RULE_I16 | RULE_I32 | RULE_I64 )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6735:34: RULE_I8
                    {
                    mRULE_I8(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6735:42: RULE_I16
                    {
                    mRULE_I16(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6735:51: RULE_I32
                    {
                    mRULE_I32(); 

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6735:60: RULE_I64
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6737:18: ( 'i8' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6737:20: 'i8'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6739:19: ( 'i16' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6739:21: 'i16'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6741:19: ( 'i32' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6741:21: 'i32'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6743:19: ( 'i64' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6743:21: 'i64'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6745:33: ( ( RULE_U8 | RULE_U16 | RULE_U32 | RULE_U64 ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6745:35: ( RULE_U8 | RULE_U16 | RULE_U32 | RULE_U64 )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6745:35: ( RULE_U8 | RULE_U16 | RULE_U32 | RULE_U64 )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6745:36: RULE_U8
                    {
                    mRULE_U8(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6745:44: RULE_U16
                    {
                    mRULE_U16(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6745:53: RULE_U32
                    {
                    mRULE_U32(); 

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6745:62: RULE_U64
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6747:18: ( 'u8' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6747:20: 'u8'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6749:19: ( 'u16' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6749:21: 'u16'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6751:19: ( 'u32' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6751:21: 'u32'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6753:19: ( 'u64' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6753:21: 'u64'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6755:17: ( RULE_FLOAT_SIZE )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6755:19: RULE_FLOAT_SIZE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6757:26: ( ( RULE_F32 | RULE_F64 ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6757:28: ( RULE_F32 | RULE_F64 )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6757:28: ( RULE_F32 | RULE_F64 )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6757:29: RULE_F32
                    {
                    mRULE_F32(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6757:38: RULE_F64
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6759:19: ( 'f32' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6759:21: 'f32'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6761:19: ( 'f64' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6761:21: 'f64'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6763:19: ( 'bool' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6763:21: 'bool'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6765:19: ( ( RULE_MACHINE_INT_TYPE | RULE_MACHINE_UINT_TYPE ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6765:21: ( RULE_MACHINE_INT_TYPE | RULE_MACHINE_UINT_TYPE )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6765:21: ( RULE_MACHINE_INT_TYPE | RULE_MACHINE_UINT_TYPE )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6765:22: RULE_MACHINE_INT_TYPE
                    {
                    mRULE_MACHINE_INT_TYPE(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6765:44: RULE_MACHINE_UINT_TYPE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6767:32: ( 'int' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6767:34: 'int'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6769:33: ( 'uint' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6769:35: 'uint'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6771:16: ( '()' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6771:18: '()'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6773:18: ( 'mut' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6773:20: 'mut'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6775:15: ( '\\'' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6775:17: '\\'' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6775:22: ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6775:23: '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' )
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6775:51: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6775:69: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6777:17: ( '\"' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6777:19: '\"' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6777:23: ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6777:24: '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' )
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6777:52: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6777:70: ~ ( ( '\\\\' | '\"' ) )
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6779:28: ( ( RULE_UTF8_CHAR | RULE_UTF16_CHAR | RULE_UTF32_CHAR ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6779:30: ( RULE_UTF8_CHAR | RULE_UTF16_CHAR | RULE_UTF32_CHAR )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6779:30: ( RULE_UTF8_CHAR | RULE_UTF16_CHAR | RULE_UTF32_CHAR )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6779:31: RULE_UTF8_CHAR
                    {
                    mRULE_UTF8_CHAR(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6779:46: RULE_UTF16_CHAR
                    {
                    mRULE_UTF16_CHAR(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6779:62: RULE_UTF32_CHAR
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6781:25: ( '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6781:27: '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6783:26: ( '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6783:28: '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6785:26: ( '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6785:28: '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:16: ( RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )* '.' ( RULE_DEC_DIGIT | '_' )+ ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+ )? ( RULE_FLOAT_SIZE )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:18: RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )* '.' ( RULE_DEC_DIGIT | '_' )+ ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+ )? ( RULE_FLOAT_SIZE )?
            {
            mRULE_DEC_DIGIT(); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:33: ( RULE_DEC_DIGIT | '_' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:59: ( RULE_DEC_DIGIT | '_' )+
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:81: ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='E'||LA13_0=='e') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:82: ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:92: ( '+' | '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='+'||LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:103: ( RULE_DEC_DIGIT | '_' )+
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
                    	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:127: ( RULE_FLOAT_SIZE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='f') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6787:127: RULE_FLOAT_SIZE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6789:14: ( ( RULE_DEC_INT_LIT | RULE_BIN_INT_LIT | RULE_OCT_INT_LIT | RULE_HEX_INT_LIT ) ( RULE_INT_SIZE )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6789:16: ( RULE_DEC_INT_LIT | RULE_BIN_INT_LIT | RULE_OCT_INT_LIT | RULE_HEX_INT_LIT ) ( RULE_INT_SIZE )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6789:16: ( RULE_DEC_INT_LIT | RULE_BIN_INT_LIT | RULE_OCT_INT_LIT | RULE_HEX_INT_LIT )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6789:17: RULE_DEC_INT_LIT
                    {
                    mRULE_DEC_INT_LIT(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6789:34: RULE_BIN_INT_LIT
                    {
                    mRULE_BIN_INT_LIT(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6789:51: RULE_OCT_INT_LIT
                    {
                    mRULE_OCT_INT_LIT(); 

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6789:68: RULE_HEX_INT_LIT
                    {
                    mRULE_HEX_INT_LIT(); 

                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6789:86: ( RULE_INT_SIZE )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='i'||LA16_0=='u') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6789:86: RULE_INT_SIZE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6791:27: ( RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )* )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6791:29: RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )*
            {
            mRULE_DEC_DIGIT(); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6791:44: ( RULE_DEC_DIGIT | '_' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||LA17_0=='_') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6793:27: ( '0b' ( '0' | '1' | '_' )+ )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6793:29: '0b' ( '0' | '1' | '_' )+
            {
            match("0b"); 

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6793:34: ( '0' | '1' | '_' )+
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6795:27: ( '0o' ( RULE_OCT_DIGIT | '_' )+ )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6795:29: '0o' ( RULE_OCT_DIGIT | '_' )+
            {
            match("0o"); 

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6795:34: ( RULE_OCT_DIGIT | '_' )+
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6797:27: ( '0x' ( RULE_HEX_DIGIT | '_' )+ )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6797:29: '0x' ( RULE_HEX_DIGIT | '_' )+
            {
            match("0x"); 

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6797:34: ( RULE_HEX_DIGIT | '_' )+
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6799:25: ( '0' .. '7' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6799:27: '0' .. '7'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6801:25: ( '0' .. '9' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6801:27: '0' .. '9'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6803:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6803:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6805:25: ( 'a' .. 'z' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6805:27: 'a' .. 'z'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6807:28: ( ( 'a' .. 'z' | '_' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6807:30: ( 'a' .. 'z' | '_' )
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6809:12: ( RULE_XID_START ( RULE_XID_CONTINUE )* )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6809:14: RULE_XID_START ( RULE_XID_CONTINUE )*
            {
            mRULE_XID_START(); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6809:29: ( RULE_XID_CONTINUE )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:6809:29: RULE_XID_CONTINUE
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
        // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:8: ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_LIFETIME | RULE_INT_TYPE | RULE_FLOAT_TYPE | RULE_BOOLEAN_TYPE | RULE_MACHINE_TYPE | RULE_UNIT_TYPE | RULE_MUT_KEYWORD | RULE_CHAR_LIT | RULE_STRING_LIT | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_IDENT )
        int alt22=64;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:10: T__45
                {
                mT__45(); 

                }
                break;
            case 2 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:16: T__46
                {
                mT__46(); 

                }
                break;
            case 3 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:22: T__47
                {
                mT__47(); 

                }
                break;
            case 4 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:28: T__48
                {
                mT__48(); 

                }
                break;
            case 5 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:34: T__49
                {
                mT__49(); 

                }
                break;
            case 6 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:40: T__50
                {
                mT__50(); 

                }
                break;
            case 7 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:46: T__51
                {
                mT__51(); 

                }
                break;
            case 8 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:52: T__52
                {
                mT__52(); 

                }
                break;
            case 9 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:58: T__53
                {
                mT__53(); 

                }
                break;
            case 10 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:64: T__54
                {
                mT__54(); 

                }
                break;
            case 11 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:70: T__55
                {
                mT__55(); 

                }
                break;
            case 12 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:76: T__56
                {
                mT__56(); 

                }
                break;
            case 13 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:82: T__57
                {
                mT__57(); 

                }
                break;
            case 14 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:88: T__58
                {
                mT__58(); 

                }
                break;
            case 15 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:94: T__59
                {
                mT__59(); 

                }
                break;
            case 16 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:100: T__60
                {
                mT__60(); 

                }
                break;
            case 17 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:106: T__61
                {
                mT__61(); 

                }
                break;
            case 18 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:112: T__62
                {
                mT__62(); 

                }
                break;
            case 19 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:118: T__63
                {
                mT__63(); 

                }
                break;
            case 20 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:124: T__64
                {
                mT__64(); 

                }
                break;
            case 21 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:130: T__65
                {
                mT__65(); 

                }
                break;
            case 22 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:136: T__66
                {
                mT__66(); 

                }
                break;
            case 23 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:142: T__67
                {
                mT__67(); 

                }
                break;
            case 24 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:148: T__68
                {
                mT__68(); 

                }
                break;
            case 25 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:154: T__69
                {
                mT__69(); 

                }
                break;
            case 26 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:160: T__70
                {
                mT__70(); 

                }
                break;
            case 27 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:166: T__71
                {
                mT__71(); 

                }
                break;
            case 28 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:172: T__72
                {
                mT__72(); 

                }
                break;
            case 29 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:178: T__73
                {
                mT__73(); 

                }
                break;
            case 30 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:184: T__74
                {
                mT__74(); 

                }
                break;
            case 31 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:190: T__75
                {
                mT__75(); 

                }
                break;
            case 32 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:196: T__76
                {
                mT__76(); 

                }
                break;
            case 33 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:202: T__77
                {
                mT__77(); 

                }
                break;
            case 34 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:208: T__78
                {
                mT__78(); 

                }
                break;
            case 35 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:214: T__79
                {
                mT__79(); 

                }
                break;
            case 36 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:220: T__80
                {
                mT__80(); 

                }
                break;
            case 37 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:226: T__81
                {
                mT__81(); 

                }
                break;
            case 38 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:232: T__82
                {
                mT__82(); 

                }
                break;
            case 39 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:238: T__83
                {
                mT__83(); 

                }
                break;
            case 40 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:244: T__84
                {
                mT__84(); 

                }
                break;
            case 41 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:250: T__85
                {
                mT__85(); 

                }
                break;
            case 42 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:256: T__86
                {
                mT__86(); 

                }
                break;
            case 43 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:262: T__87
                {
                mT__87(); 

                }
                break;
            case 44 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:268: T__88
                {
                mT__88(); 

                }
                break;
            case 45 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:274: T__89
                {
                mT__89(); 

                }
                break;
            case 46 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:280: T__90
                {
                mT__90(); 

                }
                break;
            case 47 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:286: T__91
                {
                mT__91(); 

                }
                break;
            case 48 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:292: T__92
                {
                mT__92(); 

                }
                break;
            case 49 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:298: T__93
                {
                mT__93(); 

                }
                break;
            case 50 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:304: T__94
                {
                mT__94(); 

                }
                break;
            case 51 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:310: T__95
                {
                mT__95(); 

                }
                break;
            case 52 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:316: T__96
                {
                mT__96(); 

                }
                break;
            case 53 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:322: RULE_LIFETIME
                {
                mRULE_LIFETIME(); 

                }
                break;
            case 54 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:336: RULE_INT_TYPE
                {
                mRULE_INT_TYPE(); 

                }
                break;
            case 55 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:350: RULE_FLOAT_TYPE
                {
                mRULE_FLOAT_TYPE(); 

                }
                break;
            case 56 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:366: RULE_BOOLEAN_TYPE
                {
                mRULE_BOOLEAN_TYPE(); 

                }
                break;
            case 57 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:384: RULE_MACHINE_TYPE
                {
                mRULE_MACHINE_TYPE(); 

                }
                break;
            case 58 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:402: RULE_UNIT_TYPE
                {
                mRULE_UNIT_TYPE(); 

                }
                break;
            case 59 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:417: RULE_MUT_KEYWORD
                {
                mRULE_MUT_KEYWORD(); 

                }
                break;
            case 60 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:434: RULE_CHAR_LIT
                {
                mRULE_CHAR_LIT(); 

                }
                break;
            case 61 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:448: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 62 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:464: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 63 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:479: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 64 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:492: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\4\uffff\1\55\1\uffff\1\57\1\53\3\uffff\1\53\1\67\1\72\1\74\5\53"+
        "\1\110\3\uffff\1\112\2\uffff\1\114\2\uffff\1\53\3\uffff\2\53\1\uffff"+
        "\1\53\1\uffff\1\53\1\uffff\2\125\5\uffff\2\53\1\132\1\53\11\uffff"+
        "\6\53\1\uffff\3\53\1\147\5\uffff\1\150\4\53\1\155\1\uffff\1\53\1"+
        "\uffff\1\125\1\uffff\1\160\1\161\1\uffff\1\162\11\53\1\174\3\uffff"+
        "\3\53\1\u0080\1\uffff\1\155\1\53\3\uffff\1\u0082\3\53\1\u0086\2"+
        "\53\1\174\1\u0089\1\uffff\1\53\1\u008b\1\u008c\1\uffff\1\u008d\1"+
        "\uffff\1\u008e\2\53\1\uffff\2\53\1\uffff\1\u0093\4\uffff\1\u0094"+
        "\1\u0095\1\u0096\1\u0097\5\uffff";
    static final String DFA22_eofS =
        "\u0098\uffff";
    static final String DFA22_minS =
        "\1\41\3\uffff\1\51\1\uffff\1\75\1\157\3\uffff\1\63\1\74\1\75\1\76"+
        "\1\162\1\164\1\156\2\61\1\72\3\uffff\1\75\2\uffff\1\46\2\uffff\1"+
        "\163\3\uffff\1\150\1\157\1\uffff\1\162\1\0\1\157\1\uffff\2\56\5"+
        "\uffff\1\144\1\164\1\137\1\162\11\uffff\1\160\2\141\1\165\1\164"+
        "\1\163\1\uffff\1\156\1\160\1\164\1\74\5\uffff\1\137\1\151\1\157"+
        "\1\151\1\142\1\0\1\uffff\1\157\1\uffff\1\56\1\uffff\2\137\1\uffff"+
        "\1\137\1\145\1\151\1\165\1\164\1\155\1\145\1\141\1\164\1\154\1\137"+
        "\3\uffff\1\154\1\160\1\166\1\137\1\uffff\1\0\1\154\3\uffff\1\137"+
        "\1\164\1\143\1\151\1\137\1\162\1\146\2\137\1\uffff\1\145\2\137\1"+
        "\uffff\1\137\1\uffff\1\137\1\164\1\143\1\uffff\1\156\1\145\1\uffff"+
        "\1\137\4\uffff\4\137\5\uffff";
    static final String DFA22_maxS =
        "\1\176\3\uffff\1\51\1\uffff\1\75\1\165\3\uffff\1\157\1\75\2\76\1"+
        "\171\1\164\1\170\2\156\1\72\3\uffff\1\75\2\uffff\1\46\2\uffff\1"+
        "\163\3\uffff\1\150\1\157\1\uffff\1\165\1\uffff\1\157\1\uffff\2\137"+
        "\5\uffff\1\144\1\164\1\172\1\162\11\uffff\1\160\1\141\1\162\1\165"+
        "\1\164\1\163\1\uffff\1\156\1\160\1\164\1\74\5\uffff\1\172\1\151"+
        "\1\157\1\151\1\142\1\uffff\1\uffff\1\157\1\uffff\1\137\1\uffff\2"+
        "\172\1\uffff\1\172\1\145\1\151\1\165\1\164\1\155\1\145\1\141\1\164"+
        "\1\154\1\172\3\uffff\1\154\1\160\1\166\1\172\1\uffff\1\uffff\1\154"+
        "\3\uffff\1\172\1\164\1\143\1\151\1\172\1\162\1\146\2\172\1\uffff"+
        "\1\145\2\172\1\uffff\1\172\1\uffff\1\172\1\164\1\143\1\uffff\1\156"+
        "\1\145\1\uffff\1\172\4\uffff\4\172\5\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\2\uffff\1\10\1\11\1\12\12\uffff"+
        "\1\31\1\32\1\34\1\uffff\1\36\1\37\1\uffff\1\41\1\42\1\uffff\1\44"+
        "\1\47\1\50\2\uffff\1\60\3\uffff\1\75\2\uffff\1\100\1\72\1\4\1\53"+
        "\1\6\4\uffff\1\67\1\45\1\51\1\14\1\46\1\52\1\15\1\16\1\33\6\uffff"+
        "\1\66\4\uffff\1\30\1\54\1\35\1\55\1\40\6\uffff\1\74\1\uffff\1\77"+
        "\1\uffff\1\76\2\uffff\1\13\13\uffff\1\62\1\61\1\43\4\uffff\1\65"+
        "\2\uffff\1\7\1\73\1\26\11\uffff\1\71\3\uffff\1\64\1\uffff\1\17\3"+
        "\uffff\1\21\2\uffff\1\25\1\uffff\1\57\1\63\1\70\1\22\4\uffff\1\56"+
        "\1\20\1\27\1\24\1\23";
    static final String DFA22_specialS =
        "\46\uffff\1\2\53\uffff\1\0\33\uffff\1\1\51\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\30\1\50\1\1\1\uffff\1\35\1\33\1\46\1\4\1\5\1\27\1\37\1\2"+
            "\1\16\1\25\1\34\1\51\11\52\1\24\1\10\1\14\1\6\1\15\1\uffff\1"+
            "\31\32\uffff\1\26\1\uffff\1\3\1\40\1\44\1\uffff\1\36\1\47\2"+
            "\53\1\21\1\13\2\53\1\23\2\53\1\43\1\7\2\53\1\45\2\53\1\20\1"+
            "\17\1\22\1\53\1\42\3\53\1\11\1\41\1\12\1\32",
            "",
            "",
            "",
            "\1\54",
            "",
            "\1\56",
            "\1\60\5\uffff\1\61",
            "",
            "",
            "",
            "\1\64\2\uffff\1\64\67\uffff\1\62\1\63",
            "\1\65\1\66",
            "\1\71\1\70",
            "\1\73",
            "\1\76\6\uffff\1\75",
            "\1\77",
            "\1\100\11\uffff\1\101",
            "\1\103\1\uffff\1\103\2\uffff\1\103\1\uffff\1\103\60\uffff\1"+
            "\104\4\uffff\1\102",
            "\1\103\1\uffff\1\103\2\uffff\1\103\1\uffff\1\103\64\uffff\1"+
            "\105\1\106",
            "\1\107",
            "",
            "",
            "",
            "\1\111",
            "",
            "",
            "\1\113",
            "",
            "",
            "\1\115",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "",
            "\1\120\2\uffff\1\121",
            "\141\123\32\122\uff85\123",
            "\1\124",
            "",
            "\1\127\1\uffff\12\126\45\uffff\1\126",
            "\1\127\1\uffff\12\126\45\uffff\1\126",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\53\1\uffff\32\53",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\137\20\uffff\1\136",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "",
            "",
            "\1\53\1\uffff\32\53",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\137\123\1\156\1\123\32\156\uff85\123",
            "",
            "\1\157",
            "",
            "\1\127\1\uffff\12\126\45\uffff\1\126",
            "",
            "\1\53\1\uffff\32\53",
            "\1\53\1\uffff\32\53",
            "",
            "\1\53\1\uffff\32\53",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\53\1\uffff\32\53",
            "",
            "\137\123\1\156\1\123\32\156\uff85\123",
            "\1\u0081",
            "",
            "",
            "",
            "\1\53\1\uffff\32\53",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\53\1\uffff\32\53",
            "\1\u0087",
            "\1\u0088",
            "\1\53\1\uffff\32\53",
            "\1\53\1\uffff\32\53",
            "",
            "\1\u008a",
            "\1\53\1\uffff\32\53",
            "\1\53\1\uffff\32\53",
            "",
            "\1\53\1\uffff\32\53",
            "",
            "\1\53\1\uffff\32\53",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\53\1\uffff\32\53",
            "\1\53\1\uffff\32\53",
            "\1\53\1\uffff\32\53",
            "\1\53\1\uffff\32\53",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_LIFETIME | RULE_INT_TYPE | RULE_FLOAT_TYPE | RULE_BOOLEAN_TYPE | RULE_MACHINE_TYPE | RULE_UNIT_TYPE | RULE_MUT_KEYWORD | RULE_CHAR_LIT | RULE_STRING_LIT | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_IDENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_82 = input.LA(1);

                        s = -1;
                        if ( (LA22_82=='_'||(LA22_82>='a' && LA22_82<='z')) ) {s = 110;}

                        else if ( ((LA22_82>='\u0000' && LA22_82<='^')||LA22_82=='`'||(LA22_82>='{' && LA22_82<='\uFFFF')) ) {s = 83;}

                        else s = 109;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_110 = input.LA(1);

                        s = -1;
                        if ( (LA22_110=='_'||(LA22_110>='a' && LA22_110<='z')) ) {s = 110;}

                        else if ( ((LA22_110>='\u0000' && LA22_110<='^')||LA22_110=='`'||(LA22_110>='{' && LA22_110<='\uFFFF')) ) {s = 83;}

                        else s = 109;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_38 = input.LA(1);

                        s = -1;
                        if ( ((LA22_38>='a' && LA22_38<='z')) ) {s = 82;}

                        else if ( ((LA22_38>='\u0000' && LA22_38<='`')||(LA22_38>='{' && LA22_38<='\uFFFF')) ) {s = 83;}

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