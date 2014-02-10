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
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_FLOAT_TYPE=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DEC_INT_LIT=38;
    public static final int RULE_SIGNED_INT_TYPE=17;
    public static final int RULE_I8=19;
    public static final int RULE_MUT_KEYWORD=5;
    public static final int RULE_MACHINE_UINT_TYPE=31;
    public static final int RULE_UTF32_CHAR=35;
    public static final int RULE_UTF16_CHAR=34;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int RULE_I16=20;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_U8=23;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_U64=26;
    public static final int T__54=54;
    public static final int RULE_OCT_INT_LIT=40;
    public static final int T__59=59;
    public static final int RULE_BIN_INT_LIT=39;
    public static final int RULE_INT_LIT=14;
    public static final int RULE_XID_CONTINUE=44;
    public static final int RULE_MACHINE_INT_TYPE=30;
    public static final int T__50=50;
    public static final int RULE_U32=25;
    public static final int RULE_HEX_INT_LIT=41;
    public static final int RULE_F64=29;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__45=45;
    public static final int RULE_DEC_DIGIT=37;
    public static final int RULE_OCT_DIGIT=42;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_HEX_DIGIT=36;
    public static final int RULE_UNICODE_CHAR=32;
    public static final int RULE_LIFETIME=6;
    public static final int RULE_I32=21;
    public static final int RULE_UTF8_CHAR=33;
    public static final int RULE_INT_SIZE=16;
    public static final int RULE_INT_TYPE=7;
    public static final int RULE_UNSIGNED_INT_TYPE=18;
    public static final int RULE_I64=22;
    public static final int RULE_XID_START=43;
    public static final int RULE_FLOAT_LIT=13;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_IDENT=4;
    public static final int RULE_F32=28;
    public static final int RULE_U16=24;
    public static final int RULE_MACHINE_TYPE=10;
    public static final int RULE_FLOAT_SIZE=27;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_STRING_LIT=12;
    public static final int RULE_CHAR_LIT=15;
    public static final int RULE_BOOLEAN_TYPE=9;
    public static final int T__73=73;
    public static final int RULE_UNIT_TYPE=11;
    public static final int T__78=78;
    public static final int T__77=77;

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:33:7: ( ':' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:33:9: ':'
            {
            match(':'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:34:7: ( '+' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:34:9: '+'
            {
            match('+'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:35:7: ( '_' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:35:9: '_'
            {
            match('_'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:36:7: ( '@' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:36:9: '@'
            {
            match('@'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:37:7: ( '~' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:37:9: '~'
            {
            match('~'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:38:7: ( '&' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:38:9: '&'
            {
            match('&'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:39:7: ( '[' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:39:9: '['
            {
            match('['); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:40:7: ( '..' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:40:9: '..'
            {
            match(".."); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:41:7: ( '*' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:41:9: '*'
            {
            match('*'); 

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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:42:7: ( '::' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:42:9: '::'
            {
            match("::"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:43:7: ( 'priv' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:43:9: 'priv'
            {
            match("priv"); 


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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:44:7: ( 'pub' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:44:9: 'pub'
            {
            match("pub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "RULE_LIFETIME"
    public final void mRULE_LIFETIME() throws RecognitionException {
        try {
            int _type = RULE_LIFETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4464:15: ( '\\'' RULE_IDENT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4464:17: '\\'' RULE_IDENT
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4466:15: ( RULE_INT_SIZE )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4466:17: RULE_INT_SIZE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4468:24: ( ( RULE_SIGNED_INT_TYPE | RULE_UNSIGNED_INT_TYPE ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4468:26: ( RULE_SIGNED_INT_TYPE | RULE_UNSIGNED_INT_TYPE )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4468:26: ( RULE_SIGNED_INT_TYPE | RULE_UNSIGNED_INT_TYPE )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4468:27: RULE_SIGNED_INT_TYPE
                    {
                    mRULE_SIGNED_INT_TYPE(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4468:48: RULE_UNSIGNED_INT_TYPE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4470:31: ( ( RULE_I8 | RULE_I16 | RULE_I32 | RULE_I64 ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4470:33: ( RULE_I8 | RULE_I16 | RULE_I32 | RULE_I64 )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4470:33: ( RULE_I8 | RULE_I16 | RULE_I32 | RULE_I64 )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4470:34: RULE_I8
                    {
                    mRULE_I8(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4470:42: RULE_I16
                    {
                    mRULE_I16(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4470:51: RULE_I32
                    {
                    mRULE_I32(); 

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4470:60: RULE_I64
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4472:18: ( 'i8' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4472:20: 'i8'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4474:19: ( 'i16' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4474:21: 'i16'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4476:19: ( 'i32' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4476:21: 'i32'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4478:19: ( 'i64' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4478:21: 'i64'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4480:33: ( ( RULE_U8 | RULE_U16 | RULE_U32 | RULE_U64 ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4480:35: ( RULE_U8 | RULE_U16 | RULE_U32 | RULE_U64 )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4480:35: ( RULE_U8 | RULE_U16 | RULE_U32 | RULE_U64 )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4480:36: RULE_U8
                    {
                    mRULE_U8(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4480:44: RULE_U16
                    {
                    mRULE_U16(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4480:53: RULE_U32
                    {
                    mRULE_U32(); 

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4480:62: RULE_U64
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4482:18: ( 'u8' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4482:20: 'u8'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4484:19: ( 'u16' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4484:21: 'u16'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4486:19: ( 'u32' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4486:21: 'u32'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4488:19: ( 'u64' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4488:21: 'u64'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4490:17: ( RULE_FLOAT_SIZE )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4490:19: RULE_FLOAT_SIZE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4492:26: ( ( RULE_F32 | RULE_F64 ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4492:28: ( RULE_F32 | RULE_F64 )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4492:28: ( RULE_F32 | RULE_F64 )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4492:29: RULE_F32
                    {
                    mRULE_F32(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4492:38: RULE_F64
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4494:19: ( 'f32' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4494:21: 'f32'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4496:19: ( 'f64' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4496:21: 'f64'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4498:19: ( 'bool' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4498:21: 'bool'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4500:19: ( ( RULE_MACHINE_INT_TYPE | RULE_MACHINE_UINT_TYPE ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4500:21: ( RULE_MACHINE_INT_TYPE | RULE_MACHINE_UINT_TYPE )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4500:21: ( RULE_MACHINE_INT_TYPE | RULE_MACHINE_UINT_TYPE )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4500:22: RULE_MACHINE_INT_TYPE
                    {
                    mRULE_MACHINE_INT_TYPE(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4500:44: RULE_MACHINE_UINT_TYPE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4502:32: ( 'int' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4502:34: 'int'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4504:33: ( 'uint' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4504:35: 'uint'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4506:16: ( '()' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4506:18: '()'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4508:18: ( 'mut' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4508:20: 'mut'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4510:15: ( '\\'' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4510:17: '\\'' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4510:22: ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4510:23: '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' )
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4510:51: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4510:69: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4512:17: ( '\"' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4512:19: '\"' ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4512:23: ( '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' ) | RULE_UNICODE_CHAR | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4512:24: '\\\\' ( '\\\\' | 'n' | 'r' | 't' | '0' )
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
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4512:52: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4512:70: ~ ( ( '\\\\' | '\"' ) )
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4514:28: ( ( RULE_UTF8_CHAR | RULE_UTF16_CHAR | RULE_UTF32_CHAR ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4514:30: ( RULE_UTF8_CHAR | RULE_UTF16_CHAR | RULE_UTF32_CHAR )
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4514:30: ( RULE_UTF8_CHAR | RULE_UTF16_CHAR | RULE_UTF32_CHAR )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4514:31: RULE_UTF8_CHAR
                    {
                    mRULE_UTF8_CHAR(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4514:46: RULE_UTF16_CHAR
                    {
                    mRULE_UTF16_CHAR(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4514:62: RULE_UTF32_CHAR
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4516:25: ( '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4516:27: '\\\\x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4518:26: ( '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4518:28: '\\\\u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4520:26: ( '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4520:28: '\\\\U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:16: ( RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )* '.' ( RULE_DEC_DIGIT | '_' )+ ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+ )? ( RULE_FLOAT_SIZE )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:18: RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )* '.' ( RULE_DEC_DIGIT | '_' )+ ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+ )? ( RULE_FLOAT_SIZE )?
            {
            mRULE_DEC_DIGIT(); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:33: ( RULE_DEC_DIGIT | '_' )*
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:59: ( RULE_DEC_DIGIT | '_' )+
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:81: ( ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='E'||LA13_0=='e') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:82: ( 'E' | 'e' ) ( '+' | '-' )? ( RULE_DEC_DIGIT | '_' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:92: ( '+' | '-' )?
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

                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:103: ( RULE_DEC_DIGIT | '_' )+
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

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:127: ( RULE_FLOAT_SIZE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='f') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4522:127: RULE_FLOAT_SIZE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4524:14: ( ( RULE_DEC_INT_LIT | RULE_BIN_INT_LIT | RULE_OCT_INT_LIT | RULE_HEX_INT_LIT ) ( RULE_INT_SIZE )? )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4524:16: ( RULE_DEC_INT_LIT | RULE_BIN_INT_LIT | RULE_OCT_INT_LIT | RULE_HEX_INT_LIT ) ( RULE_INT_SIZE )?
            {
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4524:16: ( RULE_DEC_INT_LIT | RULE_BIN_INT_LIT | RULE_OCT_INT_LIT | RULE_HEX_INT_LIT )
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
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4524:17: RULE_DEC_INT_LIT
                    {
                    mRULE_DEC_INT_LIT(); 

                    }
                    break;
                case 2 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4524:34: RULE_BIN_INT_LIT
                    {
                    mRULE_BIN_INT_LIT(); 

                    }
                    break;
                case 3 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4524:51: RULE_OCT_INT_LIT
                    {
                    mRULE_OCT_INT_LIT(); 

                    }
                    break;
                case 4 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4524:68: RULE_HEX_INT_LIT
                    {
                    mRULE_HEX_INT_LIT(); 

                    }
                    break;

            }

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4524:86: ( RULE_INT_SIZE )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='i'||LA16_0=='u') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4524:86: RULE_INT_SIZE
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4526:27: ( RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )* )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4526:29: RULE_DEC_DIGIT ( RULE_DEC_DIGIT | '_' )*
            {
            mRULE_DEC_DIGIT(); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4526:44: ( RULE_DEC_DIGIT | '_' )*
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4528:27: ( '0b' ( '0' | '1' | '_' )+ )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4528:29: '0b' ( '0' | '1' | '_' )+
            {
            match("0b"); 

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4528:34: ( '0' | '1' | '_' )+
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4530:27: ( '0o' ( RULE_OCT_DIGIT | '_' )+ )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4530:29: '0o' ( RULE_OCT_DIGIT | '_' )+
            {
            match("0o"); 

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4530:34: ( RULE_OCT_DIGIT | '_' )+
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4532:27: ( '0x' ( RULE_HEX_DIGIT | '_' )+ )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4532:29: '0x' ( RULE_HEX_DIGIT | '_' )+
            {
            match("0x"); 

            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4532:34: ( RULE_HEX_DIGIT | '_' )+
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4534:25: ( '0' .. '7' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4534:27: '0' .. '7'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4536:25: ( '0' .. '9' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4536:27: '0' .. '9'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4538:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4538:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4540:25: ( 'a' .. 'z' )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4540:27: 'a' .. 'z'
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4542:28: ( ( 'a' .. 'z' | '_' ) )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4542:30: ( 'a' .. 'z' | '_' )
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
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4544:12: ( RULE_XID_START ( RULE_XID_CONTINUE )* )
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4544:14: RULE_XID_START ( RULE_XID_CONTINUE )*
            {
            mRULE_XID_START(); 
            // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4544:29: ( RULE_XID_CONTINUE )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:4544:29: RULE_XID_CONTINUE
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
        // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:8: ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_LIFETIME | RULE_INT_TYPE | RULE_FLOAT_TYPE | RULE_BOOLEAN_TYPE | RULE_MACHINE_TYPE | RULE_UNIT_TYPE | RULE_MUT_KEYWORD | RULE_CHAR_LIT | RULE_STRING_LIT | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_IDENT )
        int alt22=46;
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
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:214: RULE_LIFETIME
                {
                mRULE_LIFETIME(); 

                }
                break;
            case 36 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:228: RULE_INT_TYPE
                {
                mRULE_INT_TYPE(); 

                }
                break;
            case 37 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:242: RULE_FLOAT_TYPE
                {
                mRULE_FLOAT_TYPE(); 

                }
                break;
            case 38 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:258: RULE_BOOLEAN_TYPE
                {
                mRULE_BOOLEAN_TYPE(); 

                }
                break;
            case 39 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:276: RULE_MACHINE_TYPE
                {
                mRULE_MACHINE_TYPE(); 

                }
                break;
            case 40 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:294: RULE_UNIT_TYPE
                {
                mRULE_UNIT_TYPE(); 

                }
                break;
            case 41 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:309: RULE_MUT_KEYWORD
                {
                mRULE_MUT_KEYWORD(); 

                }
                break;
            case 42 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:326: RULE_CHAR_LIT
                {
                mRULE_CHAR_LIT(); 

                }
                break;
            case 43 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:340: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 44 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:356: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 45 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:371: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 46 :
                // ../de.redoxi.ruste/src-gen/de/redoxi/ruste/parser/antlr/internal/InternalRust.g:1:384: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\4\uffff\1\45\2\uffff\1\43\3\uffff\1\43\3\uffff\5\43\1\66\10\uffff"+
        "\1\43\1\uffff\1\43\1\uffff\2\74\3\uffff\2\43\1\101\1\43\1\uffff"+
        "\6\43\1\uffff\3\43\2\uffff\2\43\1\117\1\uffff\1\43\1\uffff\1\74"+
        "\1\uffff\1\121\1\122\1\uffff\1\123\10\43\1\134\1\43\1\136\1\117"+
        "\1\uffff\1\43\3\uffff\1\140\2\43\1\143\2\43\1\134\1\146\1\uffff"+
        "\1\147\1\uffff\1\150\1\uffff\1\151\1\43\1\uffff\2\43\4\uffff\1\155"+
        "\1\156\1\157\3\uffff";
    static final String DFA22_eofS =
        "\160\uffff";
    static final String DFA22_minS =
        "\1\42\3\uffff\1\51\2\uffff\1\157\3\uffff\1\63\3\uffff\1\162\1\164"+
        "\1\156\2\61\1\72\10\uffff\1\162\1\0\1\157\1\uffff\2\56\3\uffff\1"+
        "\144\1\164\1\137\1\162\1\uffff\1\160\1\141\1\162\1\165\1\164\1\163"+
        "\1\uffff\1\156\1\160\1\164\2\uffff\1\151\1\142\1\0\1\uffff\1\157"+
        "\1\uffff\1\56\1\uffff\2\137\1\uffff\1\137\1\145\1\151\1\165\1\155"+
        "\1\145\1\141\1\164\1\154\1\137\1\166\1\137\1\0\1\uffff\1\154\3\uffff"+
        "\1\137\1\164\1\143\1\137\1\162\1\146\2\137\1\uffff\1\137\1\uffff"+
        "\1\137\1\uffff\1\137\1\164\1\uffff\1\156\1\145\4\uffff\3\137\3\uffff";
    static final String DFA22_maxS =
        "\1\176\3\uffff\1\51\2\uffff\1\165\3\uffff\1\157\3\uffff\1\171\1"+
        "\164\1\170\2\156\1\72\10\uffff\1\165\1\uffff\1\157\1\uffff\2\137"+
        "\3\uffff\1\144\1\164\1\172\1\162\1\uffff\1\160\1\141\1\162\1\165"+
        "\1\164\1\163\1\uffff\1\156\1\160\1\164\2\uffff\1\151\1\142\1\uffff"+
        "\1\uffff\1\157\1\uffff\1\137\1\uffff\2\172\1\uffff\1\172\1\145\1"+
        "\151\1\165\1\155\1\145\1\141\1\164\1\154\1\172\1\166\1\172\1\uffff"+
        "\1\uffff\1\154\3\uffff\1\172\1\164\1\143\1\172\1\162\1\146\2\172"+
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\164\1\uffff\1\156\1"+
        "\145\4\uffff\3\172\3\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\uffff\1\10\1\11\1\12\1\uffff"+
        "\1\14\1\15\1\16\6\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
        "\3\uffff\1\53\2\uffff\1\56\1\50\1\4\4\uffff\1\45\6\uffff\1\44\3"+
        "\uffff\1\40\1\27\3\uffff\1\52\1\uffff\1\55\1\uffff\1\54\2\uffff"+
        "\1\13\15\uffff\1\43\1\uffff\1\7\1\51\1\26\10\uffff\1\47\1\uffff"+
        "\1\42\1\uffff\1\17\2\uffff\1\21\2\uffff\1\25\1\41\1\46\1\22\3\uffff"+
        "\1\20\1\24\1\23";
    static final String DFA22_specialS =
        "\36\uffff\1\1\32\uffff\1\2\24\uffff\1\0\41\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\40\1\1\2\uffff\1\31\1\36\1\4\1\5\1\34\1\25\1\2\1\16\1\33"+
            "\1\uffff\1\41\11\42\1\24\1\10\1\14\1\6\1\15\1\uffff\1\27\32"+
            "\uffff\1\32\1\uffff\1\3\1\uffff\1\26\1\uffff\1\43\1\37\2\43"+
            "\1\21\1\13\2\43\1\23\3\43\1\7\2\43\1\35\2\43\1\20\1\17\1\22"+
            "\5\43\1\11\1\uffff\1\12\1\30",
            "",
            "",
            "",
            "\1\44",
            "",
            "",
            "\1\46\5\uffff\1\47",
            "",
            "",
            "",
            "\1\52\2\uffff\1\52\67\uffff\1\50\1\51",
            "",
            "",
            "",
            "\1\54\6\uffff\1\53",
            "\1\55",
            "\1\56\11\uffff\1\57",
            "\1\61\1\uffff\1\61\2\uffff\1\61\1\uffff\1\61\60\uffff\1\62"+
            "\4\uffff\1\60",
            "\1\61\1\uffff\1\61\2\uffff\1\61\1\uffff\1\61\64\uffff\1\63"+
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\2\uffff\1\70",
            "\141\72\32\71\uff85\72",
            "\1\73",
            "",
            "\1\76\1\uffff\12\75\45\uffff\1\75",
            "\1\76\1\uffff\12\75\45\uffff\1\75",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\43\1\uffff\32\43",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\115",
            "\137\72\1\116\1\72\32\116\uff85\72",
            "",
            "\1\120",
            "",
            "\1\76\1\uffff\12\75\45\uffff\1\75",
            "",
            "\1\43\1\uffff\32\43",
            "\1\43\1\uffff\32\43",
            "",
            "\1\43\1\uffff\32\43",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\43\1\uffff\32\43",
            "\1\135",
            "\1\43\1\uffff\32\43",
            "\137\72\1\116\1\72\32\116\uff85\72",
            "",
            "\1\137",
            "",
            "",
            "",
            "\1\43\1\uffff\32\43",
            "\1\141",
            "\1\142",
            "\1\43\1\uffff\32\43",
            "\1\144",
            "\1\145",
            "\1\43\1\uffff\32\43",
            "\1\43\1\uffff\32\43",
            "",
            "\1\43\1\uffff\32\43",
            "",
            "\1\43\1\uffff\32\43",
            "",
            "\1\43\1\uffff\32\43",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "",
            "",
            "",
            "",
            "\1\43\1\uffff\32\43",
            "\1\43\1\uffff\32\43",
            "\1\43\1\uffff\32\43",
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
            return "1:1: Tokens : ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | RULE_LIFETIME | RULE_INT_TYPE | RULE_FLOAT_TYPE | RULE_BOOLEAN_TYPE | RULE_MACHINE_TYPE | RULE_UNIT_TYPE | RULE_MUT_KEYWORD | RULE_CHAR_LIT | RULE_STRING_LIT | RULE_FLOAT_LIT | RULE_INT_LIT | RULE_IDENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_78 = input.LA(1);

                        s = -1;
                        if ( ((LA22_78>='\u0000' && LA22_78<='^')||LA22_78=='`'||(LA22_78>='{' && LA22_78<='\uFFFF')) ) {s = 58;}

                        else if ( (LA22_78=='_'||(LA22_78>='a' && LA22_78<='z')) ) {s = 78;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_30 = input.LA(1);

                        s = -1;
                        if ( ((LA22_30>='a' && LA22_30<='z')) ) {s = 57;}

                        else if ( ((LA22_30>='\u0000' && LA22_30<='`')||(LA22_30>='{' && LA22_30<='\uFFFF')) ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_57 = input.LA(1);

                        s = -1;
                        if ( ((LA22_57>='\u0000' && LA22_57<='^')||LA22_57=='`'||(LA22_57>='{' && LA22_57<='\uFFFF')) ) {s = 58;}

                        else if ( (LA22_57=='_'||(LA22_57>='a' && LA22_57<='z')) ) {s = 78;}

                        else s = 79;

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