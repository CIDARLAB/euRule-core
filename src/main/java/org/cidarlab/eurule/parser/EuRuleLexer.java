// $ANTLR 3.4 /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g 2014-04-03 09:35:25

/*
Copyright (c) 2012 Boston University.
All rights reserved.
Permission is hereby granted, without written agreement and without
license or royalty fees, to use, copy, modify, and distribute this
software and its documentation for any purpose, provided that the above
copyright notice and the following two paragraphs appear in all copies
of this software.

IN NO EVENT SHALL BOSTON UNIVERSITY BE LIABLE TO ANY PARTY
FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES
ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
BOSTON UNIVERSITY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

BOSTON UNIVERSITY SPECIFICALLY DISCLAIMS ANY WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND BOSTON UNIVERSITY HAS
NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES,
ENHANCEMENTS, OR MODIFICATIONS.
*/

package org.cidarlab.eurule.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EuRuleLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int HEX_DIGIT=8;
    public static final int ID=9;
    public static final int INT=10;
    public static final int OCTAL_ESC=11;
    public static final int STRING=12;
    public static final int UNICODE_ESC=13;
    public static final int WS=14;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public EuRuleLexer() {} 
    public EuRuleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EuRuleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:28:7: ( '(' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:29:7: ( ')' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:30:7: ( ',' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:31:7: ( '.' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:32:7: ( ':=' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:32:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:33:7: ( '=' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:33:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:34:7: ( 'AFTER' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:34:9: 'AFTER'
            {
            match("AFTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:35:7: ( 'ALL_AFTER' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:35:9: 'ALL_AFTER'
            {
            match("ALL_AFTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:36:7: ( 'ALL_BEFORE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:36:9: 'ALL_BEFORE'
            {
            match("ALL_BEFORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:37:7: ( 'ALL_FORWARD' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:37:9: 'ALL_FORWARD'
            {
            match("ALL_FORWARD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:38:7: ( 'ALL_NEXTTO' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:38:9: 'ALL_NEXTTO'
            {
            match("ALL_NEXTTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:39:7: ( 'ALL_REVERSE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:39:9: 'ALL_REVERSE'
            {
            match("ALL_REVERSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:40:7: ( 'ALL_SAME_ORIENTATION' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:40:9: 'ALL_SAME_ORIENTATION'
            {
            match("ALL_SAME_ORIENTATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:41:7: ( 'ALTERNATE_ORIENTATION' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:41:9: 'ALTERNATE_ORIENTATION'
            {
            match("ALTERNATE_ORIENTATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:42:7: ( 'ALWAYS_NEXTTO' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:42:9: 'ALWAYS_NEXTTO'
            {
            match("ALWAYS_NEXTTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:43:7: ( 'BEFORE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:43:9: 'BEFORE'
            {
            match("BEFORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:44:7: ( 'CONTAINS' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:44:9: 'CONTAINS'
            {
            match("CONTAINS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:45:7: ( 'DRIVES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:45:9: 'DRIVES'
            {
            match("DRIVES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:46:7: ( 'ENDSWITH' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:46:9: 'ENDSWITH'
            {
            match("ENDSWITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:47:7: ( 'EQUALS' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:47:9: 'EQUALS'
            {
            match("EQUALS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:48:7: ( 'EXACTLY' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:48:9: 'EXACTLY'
            {
            match("EXACTLY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:49:7: ( 'FORWARD' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:49:9: 'FORWARD'
            {
            match("FORWARD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:50:7: ( 'INDUCES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:50:9: 'INDUCES'
            {
            match("INDUCES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:51:7: ( 'MATCHES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:51:9: 'MATCHES'
            {
            match("MATCHES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:52:7: ( 'MORETHAN' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:52:9: 'MORETHAN'
            {
            match("MORETHAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:53:7: ( 'N' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:53:9: 'N'
            {
            match('N'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:54:7: ( 'NEXTTO' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:54:9: 'NEXTTO'
            {
            match("NEXTTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:55:7: ( 'NOT' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:55:9: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:56:7: ( 'NOTCONTAINS' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:56:9: 'NOTCONTAINS'
            {
            match("NOTCONTAINS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:57:7: ( 'NOTEQUALS' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:57:9: 'NOTEQUALS'
            {
            match("NOTEQUALS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:58:7: ( 'NOTEXACTLY' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:58:9: 'NOTEXACTLY'
            {
            match("NOTEXACTLY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:59:7: ( 'NOTMATCHES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:59:9: 'NOTMATCHES'
            {
            match("NOTMATCHES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:60:7: ( 'NOTMORETHAN' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:60:9: 'NOTMORETHAN'
            {
            match("NOTMORETHAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:61:7: ( 'NOTTHEN' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:61:9: 'NOTTHEN'
            {
            match("NOTTHEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:62:7: ( 'NOTWITH' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:62:9: 'NOTWITH'
            {
            match("NOTWITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:63:7: ( 'OR' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:63:9: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:64:7: ( 'REPRESSES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:64:9: 'REPRESSES'
            {
            match("REPRESSES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:65:7: ( 'REVERSE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:65:9: 'REVERSE'
            {
            match("REVERSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:66:7: ( 'SAME_COUNT' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:66:9: 'SAME_COUNT'
            {
            match("SAME_COUNT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:67:7: ( 'SAME_ORIENTATION' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:67:9: 'SAME_ORIENTATION'
            {
            match("SAME_ORIENTATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:68:7: ( 'SOME_AFTER' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:68:9: 'SOME_AFTER'
            {
            match("SOME_AFTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:69:7: ( 'SOME_BEFORE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:69:9: 'SOME_BEFORE'
            {
            match("SOME_BEFORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:70:7: ( 'SOME_FORWARD' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:70:9: 'SOME_FORWARD'
            {
            match("SOME_FORWARD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:71:7: ( 'SOME_NEXTTO' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:71:9: 'SOME_NEXTTO'
            {
            match("SOME_NEXTTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:72:7: ( 'SOME_REVERSE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:72:9: 'SOME_REVERSE'
            {
            match("SOME_REVERSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:73:7: ( 'SOME_SAME_ORIENTATION' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:73:9: 'SOME_SAME_ORIENTATION'
            {
            match("SOME_SAME_ORIENTATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:74:7: ( 'STARTSWITH' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:74:9: 'STARTSWITH'
            {
            match("STARTSWITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:75:7: ( 'THEN' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:75:9: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:76:7: ( 'WITH' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:76:9: 'WITH'
            {
            match("WITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:77:7: ( '[' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:77:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:78:7: ( '\\\\/' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:78:9: '\\\\/'
            {
            match("\\/"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:79:7: ( ']' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:79:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:80:7: ( 'after' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:80:9: 'after'
            {
            match("after"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:81:7: ( 'all_after' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:81:9: 'all_after'
            {
            match("all_after"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:82:7: ( 'all_before' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:82:9: 'all_before'
            {
            match("all_before"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:83:7: ( 'all_forward' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:83:9: 'all_forward'
            {
            match("all_forward"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:84:7: ( 'all_nextto' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:84:9: 'all_nextto'
            {
            match("all_nextto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:85:7: ( 'all_reverse' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:85:9: 'all_reverse'
            {
            match("all_reverse"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:86:7: ( 'all_same_orientation' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:86:9: 'all_same_orientation'
            {
            match("all_same_orientation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:87:7: ( 'alternate_orientation' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:87:9: 'alternate_orientation'
            {
            match("alternate_orientation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:88:7: ( 'always_nextto' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:88:9: 'always_nextto'
            {
            match("always_nextto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:89:7: ( 'before' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:89:9: 'before'
            {
            match("before"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:90:7: ( 'contains' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:90:9: 'contains'
            {
            match("contains"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:91:7: ( 'drives' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:91:9: 'drives'
            {
            match("drives"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:92:7: ( 'endswith' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:92:9: 'endswith'
            {
            match("endswith"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:93:7: ( 'equals' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:93:9: 'equals'
            {
            match("equals"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:94:7: ( 'exactly' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:94:9: 'exactly'
            {
            match("exactly"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:95:7: ( 'forward' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:95:9: 'forward'
            {
            match("forward"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:96:7: ( 'induces' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:96:9: 'induces'
            {
            match("induces"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:97:7: ( 'matches' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:97:9: 'matches'
            {
            match("matches"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:98:7: ( 'morethan' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:98:9: 'morethan'
            {
            match("morethan"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:99:7: ( 'nextto' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:99:9: 'nextto'
            {
            match("nextto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:100:7: ( 'notcontains' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:100:9: 'notcontains'
            {
            match("notcontains"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:101:7: ( 'notequals' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:101:9: 'notequals'
            {
            match("notequals"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:102:7: ( 'notexactly' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:102:9: 'notexactly'
            {
            match("notexactly"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:103:7: ( 'notmatches' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:103:9: 'notmatches'
            {
            match("notmatches"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:104:7: ( 'notmorethan' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:104:9: 'notmorethan'
            {
            match("notmorethan"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:105:7: ( 'notthen' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:105:9: 'notthen'
            {
            match("notthen"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:106:7: ( 'notwith' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:106:9: 'notwith'
            {
            match("notwith"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:107:7: ( 'or' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:107:9: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:108:7: ( 'represses' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:108:9: 'represses'
            {
            match("represses"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:109:7: ( 'reverse' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:109:9: 'reverse'
            {
            match("reverse"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:110:7: ( 'same_count' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:110:9: 'same_count'
            {
            match("same_count"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:111:7: ( 'same_orientation' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:111:9: 'same_orientation'
            {
            match("same_orientation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:112:7: ( 'some_after' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:112:9: 'some_after'
            {
            match("some_after"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:113:8: ( 'some_before' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:113:10: 'some_before'
            {
            match("some_before"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:114:8: ( 'some_forward' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:114:10: 'some_forward'
            {
            match("some_forward"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:115:8: ( 'some_nextto' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:115:10: 'some_nextto'
            {
            match("some_nextto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:116:8: ( 'some_reverse' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:116:10: 'some_reverse'
            {
            match("some_reverse"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:117:8: ( 'some_same_orientation' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:117:10: 'some_same_orientation'
            {
            match("some_same_orientation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:118:8: ( 'startswith' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:118:10: 'startswith'
            {
            match("startswith"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:119:8: ( 'then' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:119:10: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:120:8: ( 'with' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:120:10: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:121:8: ( '||' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:121:10: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:253:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:253:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:253:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:256:5: ( ( '0' .. '9' )+ )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:256:7: ( '0' .. '9' )+
            {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:256:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:261:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:261:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:261:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:261:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:261:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:262:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:262:14: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:262:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:265:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:265:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:273:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:273:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:273:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:273:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:273:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:276:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:276:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:276:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                alt8=1;
            }
            else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:276:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:276:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:281:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:281:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:281:22: ( '+' | '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:281:33: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:284:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:288:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt11=1;
                    }
                    break;
                case 'u':
                    {
                    alt11=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt11=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:288:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:289:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:290:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:295:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1 >= '0' && LA12_1 <= '3')) ) {
                    int LA12_2 = input.LA(3);

                    if ( ((LA12_2 >= '0' && LA12_2 <= '7')) ) {
                        int LA12_4 = input.LA(4);

                        if ( ((LA12_4 >= '0' && LA12_4 <= '7')) ) {
                            alt12=1;
                        }
                        else {
                            alt12=2;
                        }
                    }
                    else {
                        alt12=3;
                    }
                }
                else if ( ((LA12_1 >= '4' && LA12_1 <= '7')) ) {
                    int LA12_3 = input.LA(3);

                    if ( ((LA12_3 >= '0' && LA12_3 <= '7')) ) {
                        alt12=2;
                    }
                    else {
                        alt12=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:295:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:296:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:297:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:302:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:302:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | ID | INT | COMMENT | WS | STRING | CHAR )
        int alt13=100;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:10: T__15
                {
                mT__15(); 


                }
                break;
            case 2 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:16: T__16
                {
                mT__16(); 


                }
                break;
            case 3 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:22: T__17
                {
                mT__17(); 


                }
                break;
            case 4 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:28: T__18
                {
                mT__18(); 


                }
                break;
            case 5 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:34: T__19
                {
                mT__19(); 


                }
                break;
            case 6 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:40: T__20
                {
                mT__20(); 


                }
                break;
            case 7 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:46: T__21
                {
                mT__21(); 


                }
                break;
            case 8 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:52: T__22
                {
                mT__22(); 


                }
                break;
            case 9 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:58: T__23
                {
                mT__23(); 


                }
                break;
            case 10 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:64: T__24
                {
                mT__24(); 


                }
                break;
            case 11 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:70: T__25
                {
                mT__25(); 


                }
                break;
            case 12 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:76: T__26
                {
                mT__26(); 


                }
                break;
            case 13 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:82: T__27
                {
                mT__27(); 


                }
                break;
            case 14 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:88: T__28
                {
                mT__28(); 


                }
                break;
            case 15 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:94: T__29
                {
                mT__29(); 


                }
                break;
            case 16 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:100: T__30
                {
                mT__30(); 


                }
                break;
            case 17 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:106: T__31
                {
                mT__31(); 


                }
                break;
            case 18 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:112: T__32
                {
                mT__32(); 


                }
                break;
            case 19 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:118: T__33
                {
                mT__33(); 


                }
                break;
            case 20 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:124: T__34
                {
                mT__34(); 


                }
                break;
            case 21 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:130: T__35
                {
                mT__35(); 


                }
                break;
            case 22 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:136: T__36
                {
                mT__36(); 


                }
                break;
            case 23 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:142: T__37
                {
                mT__37(); 


                }
                break;
            case 24 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:148: T__38
                {
                mT__38(); 


                }
                break;
            case 25 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:154: T__39
                {
                mT__39(); 


                }
                break;
            case 26 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:160: T__40
                {
                mT__40(); 


                }
                break;
            case 27 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:166: T__41
                {
                mT__41(); 


                }
                break;
            case 28 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:172: T__42
                {
                mT__42(); 


                }
                break;
            case 29 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:178: T__43
                {
                mT__43(); 


                }
                break;
            case 30 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:184: T__44
                {
                mT__44(); 


                }
                break;
            case 31 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:190: T__45
                {
                mT__45(); 


                }
                break;
            case 32 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:196: T__46
                {
                mT__46(); 


                }
                break;
            case 33 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:202: T__47
                {
                mT__47(); 


                }
                break;
            case 34 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:208: T__48
                {
                mT__48(); 


                }
                break;
            case 35 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:214: T__49
                {
                mT__49(); 


                }
                break;
            case 36 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:220: T__50
                {
                mT__50(); 


                }
                break;
            case 37 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:226: T__51
                {
                mT__51(); 


                }
                break;
            case 38 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:232: T__52
                {
                mT__52(); 


                }
                break;
            case 39 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:238: T__53
                {
                mT__53(); 


                }
                break;
            case 40 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:244: T__54
                {
                mT__54(); 


                }
                break;
            case 41 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:250: T__55
                {
                mT__55(); 


                }
                break;
            case 42 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:256: T__56
                {
                mT__56(); 


                }
                break;
            case 43 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:262: T__57
                {
                mT__57(); 


                }
                break;
            case 44 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:268: T__58
                {
                mT__58(); 


                }
                break;
            case 45 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:274: T__59
                {
                mT__59(); 


                }
                break;
            case 46 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:280: T__60
                {
                mT__60(); 


                }
                break;
            case 47 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:286: T__61
                {
                mT__61(); 


                }
                break;
            case 48 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:292: T__62
                {
                mT__62(); 


                }
                break;
            case 49 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:298: T__63
                {
                mT__63(); 


                }
                break;
            case 50 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:304: T__64
                {
                mT__64(); 


                }
                break;
            case 51 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:310: T__65
                {
                mT__65(); 


                }
                break;
            case 52 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:316: T__66
                {
                mT__66(); 


                }
                break;
            case 53 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:322: T__67
                {
                mT__67(); 


                }
                break;
            case 54 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:328: T__68
                {
                mT__68(); 


                }
                break;
            case 55 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:334: T__69
                {
                mT__69(); 


                }
                break;
            case 56 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:340: T__70
                {
                mT__70(); 


                }
                break;
            case 57 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:346: T__71
                {
                mT__71(); 


                }
                break;
            case 58 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:352: T__72
                {
                mT__72(); 


                }
                break;
            case 59 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:358: T__73
                {
                mT__73(); 


                }
                break;
            case 60 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:364: T__74
                {
                mT__74(); 


                }
                break;
            case 61 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:370: T__75
                {
                mT__75(); 


                }
                break;
            case 62 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:376: T__76
                {
                mT__76(); 


                }
                break;
            case 63 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:382: T__77
                {
                mT__77(); 


                }
                break;
            case 64 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:388: T__78
                {
                mT__78(); 


                }
                break;
            case 65 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:394: T__79
                {
                mT__79(); 


                }
                break;
            case 66 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:400: T__80
                {
                mT__80(); 


                }
                break;
            case 67 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:406: T__81
                {
                mT__81(); 


                }
                break;
            case 68 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:412: T__82
                {
                mT__82(); 


                }
                break;
            case 69 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:418: T__83
                {
                mT__83(); 


                }
                break;
            case 70 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:424: T__84
                {
                mT__84(); 


                }
                break;
            case 71 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:430: T__85
                {
                mT__85(); 


                }
                break;
            case 72 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:436: T__86
                {
                mT__86(); 


                }
                break;
            case 73 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:442: T__87
                {
                mT__87(); 


                }
                break;
            case 74 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:448: T__88
                {
                mT__88(); 


                }
                break;
            case 75 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:454: T__89
                {
                mT__89(); 


                }
                break;
            case 76 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:460: T__90
                {
                mT__90(); 


                }
                break;
            case 77 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:466: T__91
                {
                mT__91(); 


                }
                break;
            case 78 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:472: T__92
                {
                mT__92(); 


                }
                break;
            case 79 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:478: T__93
                {
                mT__93(); 


                }
                break;
            case 80 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:484: T__94
                {
                mT__94(); 


                }
                break;
            case 81 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:490: T__95
                {
                mT__95(); 


                }
                break;
            case 82 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:496: T__96
                {
                mT__96(); 


                }
                break;
            case 83 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:502: T__97
                {
                mT__97(); 


                }
                break;
            case 84 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:508: T__98
                {
                mT__98(); 


                }
                break;
            case 85 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:514: T__99
                {
                mT__99(); 


                }
                break;
            case 86 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:520: T__100
                {
                mT__100(); 


                }
                break;
            case 87 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:527: T__101
                {
                mT__101(); 


                }
                break;
            case 88 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:534: T__102
                {
                mT__102(); 


                }
                break;
            case 89 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:541: T__103
                {
                mT__103(); 


                }
                break;
            case 90 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:548: T__104
                {
                mT__104(); 


                }
                break;
            case 91 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:555: T__105
                {
                mT__105(); 


                }
                break;
            case 92 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:562: T__106
                {
                mT__106(); 


                }
                break;
            case 93 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:569: T__107
                {
                mT__107(); 


                }
                break;
            case 94 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:576: T__108
                {
                mT__108(); 


                }
                break;
            case 95 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:583: ID
                {
                mID(); 


                }
                break;
            case 96 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:586: INT
                {
                mINT(); 


                }
                break;
            case 97 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:590: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 98 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:598: WS
                {
                mWS(); 


                }
                break;
            case 99 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:601: STRING
                {
                mSTRING(); 


                }
                break;
            case 100 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:1:608: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\7\uffff\10\47\1\73\5\47\3\uffff\16\47\7\uffff\16\47\1\uffff\1\150"+
        "\24\47\1\u0080\25\47\1\u009c\1\uffff\27\47\1\uffff\33\47\1\uffff"+
        "\5\47\1\u00df\1\u00e0\31\47\1\u0101\1\u0102\1\u0103\37\47\2\uffff"+
        "\1\u0129\37\47\3\uffff\10\47\1\u0157\1\47\1\u0159\1\47\1\u015b\5"+
        "\47\1\u0161\22\47\1\uffff\10\47\1\u017c\1\47\1\u017e\1\47\1\u0180"+
        "\5\47\1\u0186\32\47\1\uffff\1\47\1\uffff\1\47\1\uffff\1\u01a3\1"+
        "\u01a4\1\u01a5\1\u01a6\1\47\1\uffff\5\47\1\u01ad\1\u01ae\1\47\1"+
        "\u01b0\21\47\1\uffff\1\47\1\uffff\1\47\1\uffff\1\u01c4\1\u01c5\1"+
        "\u01c6\1\u01c7\1\47\1\uffff\5\47\1\u01ce\1\u01cf\1\47\1\u01d1\21"+
        "\47\1\u01e3\1\u01e4\4\uffff\1\u01e5\5\47\2\uffff\1\47\1\uffff\21"+
        "\47\1\u01fd\1\u01fe\4\uffff\1\u01ff\5\47\2\uffff\1\47\1\uffff\11"+
        "\47\1\u020f\7\47\3\uffff\1\47\1\u0218\3\47\1\u021c\11\47\1\u0226"+
        "\7\47\3\uffff\1\47\1\u022f\3\47\1\u0233\11\47\1\uffff\1\u023d\1"+
        "\47\1\u023f\5\47\1\uffff\1\u0245\1\u0246\1\47\1\uffff\1\u0248\1"+
        "\47\1\u024a\5\47\1\u0250\1\uffff\1\u0251\1\47\1\u0253\5\47\1\uffff"+
        "\1\u0259\1\u025a\1\47\1\uffff\1\u025c\1\47\1\u025e\5\47\1\u0264"+
        "\1\uffff\1\u0265\1\uffff\1\u0266\3\47\1\u026a\2\uffff\1\u026b\1"+
        "\uffff\1\47\1\uffff\1\u026d\1\47\1\u026f\2\47\2\uffff\1\u0272\1"+
        "\uffff\1\u0273\3\47\1\u0277\2\uffff\1\u0278\1\uffff\1\47\1\uffff"+
        "\1\u027a\1\47\1\u027c\2\47\3\uffff\3\47\2\uffff\1\47\1\uffff\1\u0283"+
        "\1\uffff\1\u0284\1\47\2\uffff\3\47\2\uffff\1\47\1\uffff\1\u028a"+
        "\1\uffff\1\u028b\3\47\1\u028f\1\47\2\uffff\3\47\1\u0294\1\47\2\uffff"+
        "\3\47\1\uffff\4\47\1\uffff\14\47\1\u02a9\3\47\1\u02ad\3\47\1\uffff"+
        "\3\47\1\uffff\15\47\1\u02c1\2\47\1\u02c4\2\47\1\uffff\1\u02c7\1"+
        "\u02c8\1\uffff\1\u02c9\1\u02ca\4\uffff";
    static final String DFA13_eofS =
        "\u02cb\uffff";
    static final String DFA13_minS =
        "\1\11\6\uffff\1\106\1\105\1\117\1\122\1\116\1\117\1\116\1\101\1"+
        "\55\1\122\1\105\1\101\1\110\1\111\3\uffff\1\146\1\145\1\157\1\162"+
        "\1\156\1\157\1\156\1\141\1\145\1\162\1\145\1\141\1\150\1\151\7\uffff"+
        "\1\124\1\114\1\106\1\116\1\111\1\104\1\125\1\101\1\122\1\104\1\124"+
        "\1\122\1\130\1\124\1\uffff\1\55\1\120\2\115\1\101\1\105\1\124\1"+
        "\164\1\154\1\146\1\156\1\151\1\144\1\165\1\141\1\162\1\144\1\164"+
        "\1\162\1\170\1\164\1\55\1\160\2\155\1\141\1\145\1\164\1\105\1\137"+
        "\1\105\1\101\1\117\1\124\1\126\1\123\1\101\1\103\1\127\1\125\1\103"+
        "\1\105\1\124\1\55\1\uffff\1\122\3\105\1\122\1\116\1\110\1\145\1"+
        "\137\1\145\1\141\1\157\1\164\1\166\1\163\1\141\1\143\1\167\1\165"+
        "\1\143\1\145\1\164\1\143\1\uffff\1\162\3\145\1\162\1\156\1\150\1"+
        "\122\1\101\1\122\1\131\1\122\1\101\1\105\1\127\1\114\1\124\1\101"+
        "\1\103\1\110\2\124\1\117\1\121\1\101\1\110\1\111\1\uffff\1\105\1"+
        "\122\2\137\1\124\2\55\1\162\1\141\1\162\1\171\1\162\1\141\1\145"+
        "\1\167\1\154\1\164\1\141\1\143\1\150\2\164\1\157\1\161\1\141\1\150"+
        "\1\151\1\145\1\162\2\137\1\164\3\55\1\106\1\105\1\117\2\105\1\101"+
        "\1\116\1\123\1\105\1\111\1\123\1\111\1\123\1\114\1\122\2\105\1\110"+
        "\1\117\1\116\1\125\1\101\1\124\1\122\1\105\1\124\2\123\1\103\1\101"+
        "\1\123\2\uffff\1\55\1\146\1\145\1\157\2\145\1\141\1\156\1\163\1"+
        "\145\1\151\1\163\1\151\1\163\1\154\1\162\2\145\1\150\1\157\1\156"+
        "\1\165\1\141\1\164\1\162\1\145\1\164\2\163\1\143\1\141\1\163\3\uffff"+
        "\1\124\1\106\1\122\1\130\1\126\1\115\1\101\1\137\1\55\1\116\1\55"+
        "\1\124\1\55\1\131\1\104\2\123\1\101\1\55\1\124\1\101\2\103\1\105"+
        "\1\116\1\110\1\123\1\105\1\117\1\122\1\106\1\105\1\117\2\105\1\101"+
        "\1\127\1\uffff\1\164\1\146\1\162\1\170\1\166\1\155\1\141\1\137\1"+
        "\55\1\156\1\55\1\164\1\55\1\171\1\144\2\163\1\141\1\55\1\164\1\141"+
        "\2\143\1\145\1\156\1\150\1\163\1\145\1\157\1\162\1\146\1\145\1\157"+
        "\2\145\1\141\1\167\1\105\1\117\1\127\1\124\2\105\1\124\1\116\1\uffff"+
        "\1\123\1\uffff\1\110\1\uffff\4\55\1\116\1\uffff\1\101\1\114\1\124"+
        "\1\110\1\124\2\55\1\105\1\55\1\125\1\111\1\124\1\106\1\122\1\130"+
        "\1\126\1\115\1\111\1\145\1\157\1\167\1\164\2\145\1\164\1\156\1\uffff"+
        "\1\163\1\uffff\1\150\1\uffff\4\55\1\156\1\uffff\1\141\1\154\1\164"+
        "\1\150\1\164\2\55\1\145\1\55\1\165\1\151\1\164\1\146\1\162\1\170"+
        "\1\166\1\155\1\151\2\122\1\101\1\124\1\122\1\137\2\105\2\55\4\uffff"+
        "\1\55\1\111\1\123\1\114\1\105\1\110\2\uffff\1\123\1\uffff\1\116"+
        "\2\105\1\117\1\127\1\124\2\105\1\124\2\162\1\141\1\164\1\162\1\137"+
        "\2\145\2\55\4\uffff\1\55\1\151\1\163\1\154\1\145\1\150\2\uffff\1"+
        "\163\1\uffff\1\156\2\145\1\157\1\167\1\164\2\145\1\164\1\55\1\105"+
        "\1\122\1\117\1\123\1\117\1\137\1\130\3\uffff\1\116\1\55\1\131\1"+
        "\123\1\101\1\55\1\124\1\116\2\122\1\101\1\124\1\122\1\137\1\110"+
        "\1\55\1\145\1\162\1\157\1\163\1\157\1\137\1\170\3\uffff\1\156\1"+
        "\55\1\171\1\163\1\141\1\55\1\164\1\156\2\162\1\141\1\164\1\162\1"+
        "\137\1\150\1\uffff\1\55\1\104\1\55\1\105\1\122\1\117\1\124\1\123"+
        "\1\uffff\2\55\1\116\1\uffff\1\55\1\124\1\55\1\105\1\122\1\117\1"+
        "\123\1\117\1\55\1\uffff\1\55\1\144\1\55\1\145\1\162\1\157\1\164"+
        "\1\163\1\uffff\2\55\1\156\1\uffff\1\55\1\164\1\55\1\145\1\162\1"+
        "\157\1\163\1\157\1\55\1\uffff\1\55\1\uffff\1\55\1\111\1\122\1\124"+
        "\1\55\2\uffff\1\55\1\uffff\1\101\1\uffff\1\55\1\104\1\55\1\105\1"+
        "\122\2\uffff\1\55\1\uffff\1\55\1\151\1\162\1\164\1\55\2\uffff\1"+
        "\55\1\uffff\1\141\1\uffff\1\55\1\144\1\55\1\145\1\162\3\uffff\1"+
        "\105\1\111\1\117\2\uffff\1\124\1\uffff\1\55\1\uffff\1\55\1\111\2"+
        "\uffff\1\145\1\151\1\157\2\uffff\1\164\1\uffff\1\55\1\uffff\1\55"+
        "\1\151\1\116\1\105\1\55\1\111\2\uffff\1\105\1\156\1\145\1\55\1\151"+
        "\2\uffff\1\145\1\124\1\116\1\uffff\1\117\1\116\1\164\1\156\1\uffff"+
        "\1\157\1\156\1\101\1\124\1\116\1\124\1\141\1\164\1\156\1\164\1\124"+
        "\1\101\1\55\1\101\1\164\1\141\1\55\1\141\1\111\1\124\1\uffff\1\124"+
        "\1\151\1\164\1\uffff\1\164\1\117\2\111\1\157\2\151\1\116\2\117\1"+
        "\156\2\157\1\55\2\116\1\55\2\156\1\uffff\2\55\1\uffff\2\55\4\uffff";
    static final String DFA13_maxS =
        "\1\174\6\uffff\1\114\1\105\1\117\1\122\1\130\1\117\1\116\1\117\1"+
        "\172\1\122\1\105\1\124\1\110\1\111\3\uffff\1\154\1\145\1\157\1\162"+
        "\1\170\1\157\1\156\2\157\1\162\1\145\1\164\1\150\1\151\7\uffff\1"+
        "\124\1\127\1\106\1\116\1\111\1\104\1\125\1\101\1\122\1\104\1\124"+
        "\1\122\1\130\1\124\1\uffff\1\172\1\126\2\115\1\101\1\105\1\124\1"+
        "\164\1\167\1\146\1\156\1\151\1\144\1\165\1\141\1\162\1\144\1\164"+
        "\1\162\1\170\1\164\1\172\1\166\2\155\1\141\1\145\1\164\1\105\1\137"+
        "\1\105\1\101\1\117\1\124\1\126\1\123\1\101\1\103\1\127\1\125\1\103"+
        "\1\105\1\124\1\172\1\uffff\1\122\3\105\1\122\1\116\1\110\1\145\1"+
        "\137\1\145\1\141\1\157\1\164\1\166\1\163\1\141\1\143\1\167\1\165"+
        "\1\143\1\145\1\164\1\167\1\uffff\1\162\3\145\1\162\1\156\1\150\1"+
        "\122\1\123\1\122\1\131\1\122\1\101\1\105\1\127\1\114\1\124\1\101"+
        "\1\103\1\110\2\124\1\117\1\130\1\117\1\110\1\111\1\uffff\1\105\1"+
        "\122\2\137\1\124\2\172\1\162\1\163\1\162\1\171\1\162\1\141\1\145"+
        "\1\167\1\154\1\164\1\141\1\143\1\150\2\164\1\157\1\170\1\157\1\150"+
        "\1\151\1\145\1\162\2\137\1\164\3\172\1\106\1\105\1\117\2\105\1\101"+
        "\1\116\1\123\1\105\1\111\1\123\1\111\1\123\1\114\1\122\2\105\1\110"+
        "\1\117\1\116\1\125\1\101\1\124\1\122\1\105\1\124\2\123\1\117\2\123"+
        "\2\uffff\1\172\1\146\1\145\1\157\2\145\1\141\1\156\1\163\1\145\1"+
        "\151\1\163\1\151\1\163\1\154\1\162\2\145\1\150\1\157\1\156\1\165"+
        "\1\141\1\164\1\162\1\145\1\164\2\163\1\157\2\163\3\uffff\1\124\1"+
        "\106\1\122\1\130\1\126\1\115\1\101\1\137\1\172\1\116\1\172\1\124"+
        "\1\172\1\131\1\104\2\123\1\101\1\172\1\124\1\101\2\103\1\105\1\116"+
        "\1\110\1\123\1\105\1\117\1\122\1\106\1\105\1\117\2\105\1\101\1\127"+
        "\1\uffff\1\164\1\146\1\162\1\170\1\166\1\155\1\141\1\137\1\172\1"+
        "\156\1\172\1\164\1\172\1\171\1\144\2\163\1\141\1\172\1\164\1\141"+
        "\2\143\1\145\1\156\1\150\1\163\1\145\1\157\1\162\1\146\1\145\1\157"+
        "\2\145\1\141\1\167\1\105\1\117\1\127\1\124\2\105\1\124\1\116\1\uffff"+
        "\1\123\1\uffff\1\110\1\uffff\4\172\1\116\1\uffff\1\101\1\114\1\124"+
        "\1\110\1\124\2\172\1\105\1\172\1\125\1\111\1\124\1\106\1\122\1\130"+
        "\1\126\1\115\1\111\1\145\1\157\1\167\1\164\2\145\1\164\1\156\1\uffff"+
        "\1\163\1\uffff\1\150\1\uffff\4\172\1\156\1\uffff\1\141\1\154\1\164"+
        "\1\150\1\164\2\172\1\145\1\172\1\165\1\151\1\164\1\146\1\162\1\170"+
        "\1\166\1\155\1\151\2\122\1\101\1\124\1\122\1\137\2\105\2\172\4\uffff"+
        "\1\172\1\111\1\123\1\114\1\105\1\110\2\uffff\1\123\1\uffff\1\116"+
        "\2\105\1\117\1\127\1\124\2\105\1\124\2\162\1\141\1\164\1\162\1\137"+
        "\2\145\2\172\4\uffff\1\172\1\151\1\163\1\154\1\145\1\150\2\uffff"+
        "\1\163\1\uffff\1\156\2\145\1\157\1\167\1\164\2\145\1\164\1\172\1"+
        "\105\1\122\1\117\1\123\1\117\1\137\1\130\3\uffff\1\116\1\172\1\131"+
        "\1\123\1\101\1\172\1\124\1\116\2\122\1\101\1\124\1\122\1\137\1\110"+
        "\1\172\1\145\1\162\1\157\1\163\1\157\1\137\1\170\3\uffff\1\156\1"+
        "\172\1\171\1\163\1\141\1\172\1\164\1\156\2\162\1\141\1\164\1\162"+
        "\1\137\1\150\1\uffff\1\172\1\104\1\172\1\105\1\122\1\117\1\124\1"+
        "\123\1\uffff\2\172\1\116\1\uffff\1\172\1\124\1\172\1\105\1\122\1"+
        "\117\1\123\1\117\1\172\1\uffff\1\172\1\144\1\172\1\145\1\162\1\157"+
        "\1\164\1\163\1\uffff\2\172\1\156\1\uffff\1\172\1\164\1\172\1\145"+
        "\1\162\1\157\1\163\1\157\1\172\1\uffff\1\172\1\uffff\1\172\1\111"+
        "\1\122\1\124\1\172\2\uffff\1\172\1\uffff\1\101\1\uffff\1\172\1\104"+
        "\1\172\1\105\1\122\2\uffff\1\172\1\uffff\1\172\1\151\1\162\1\164"+
        "\1\172\2\uffff\1\172\1\uffff\1\141\1\uffff\1\172\1\144\1\172\1\145"+
        "\1\162\3\uffff\1\105\1\111\1\117\2\uffff\1\124\1\uffff\1\172\1\uffff"+
        "\1\172\1\111\2\uffff\1\145\1\151\1\157\2\uffff\1\164\1\uffff\1\172"+
        "\1\uffff\1\172\1\151\1\116\1\105\1\172\1\111\2\uffff\1\105\1\156"+
        "\1\145\1\172\1\151\2\uffff\1\145\1\124\1\116\1\uffff\1\117\1\116"+
        "\1\164\1\156\1\uffff\1\157\1\156\1\101\1\124\1\116\1\124\1\141\1"+
        "\164\1\156\1\164\1\124\1\101\1\172\1\101\1\164\1\141\1\172\1\141"+
        "\1\111\1\124\1\uffff\1\124\1\151\1\164\1\uffff\1\164\1\117\2\111"+
        "\1\157\2\151\1\116\2\117\1\156\2\157\1\172\2\116\1\172\2\156\1\uffff"+
        "\2\172\1\uffff\2\172\4\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\16\uffff\1\62\1\63\1\64\16\uffff"+
        "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\16\uffff\1\32\54\uffff"+
        "\1\44\27\uffff\1\120\33\uffff\1\34\102\uffff\1\60\1\61\40\uffff"+
        "\1\134\1\135\1\7\45\uffff\1\65\55\uffff\1\20\1\uffff\1\22\1\uffff"+
        "\1\24\5\uffff\1\33\32\uffff\1\76\1\uffff\1\100\1\uffff\1\102\5\uffff"+
        "\1\110\34\uffff\1\25\1\26\1\27\1\30\6\uffff\1\42\1\43\1\uffff\1"+
        "\46\23\uffff\1\103\1\104\1\105\1\106\6\uffff\1\116\1\117\1\uffff"+
        "\1\122\21\uffff\1\21\1\23\1\31\27\uffff\1\77\1\101\1\107\17\uffff"+
        "\1\10\10\uffff\1\36\3\uffff\1\45\11\uffff\1\66\10\uffff\1\112\3"+
        "\uffff\1\121\11\uffff\1\11\1\uffff\1\13\5\uffff\1\37\1\40\1\uffff"+
        "\1\47\1\uffff\1\51\5\uffff\1\57\1\67\1\uffff\1\71\5\uffff\1\113"+
        "\1\114\1\uffff\1\123\1\uffff\1\125\5\uffff\1\133\1\12\1\14\3\uffff"+
        "\1\35\1\41\1\uffff\1\52\1\uffff\1\54\2\uffff\1\70\1\72\3\uffff\1"+
        "\111\1\115\1\uffff\1\126\1\uffff\1\130\6\uffff\1\53\1\55\5\uffff"+
        "\1\127\1\131\3\uffff\1\17\4\uffff\1\75\24\uffff\1\50\3\uffff\1\124"+
        "\23\uffff\1\15\2\uffff\1\73\2\uffff\1\16\1\56\1\74\1\132";
    static final String DFA13_specialS =
        "\u02cb\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\52\2\uffff\1\52\22\uffff\1\52\1\uffff\1\53\4\uffff\1\54\1"+
            "\1\1\2\2\uffff\1\3\1\uffff\1\4\1\51\12\50\1\5\2\uffff\1\6\3"+
            "\uffff\1\7\1\10\1\11\1\12\1\13\1\14\2\47\1\15\3\47\1\16\1\17"+
            "\1\20\2\47\1\21\1\22\1\23\2\47\1\24\3\47\1\25\1\26\1\27\1\uffff"+
            "\1\47\1\uffff\1\30\1\31\1\32\1\33\1\34\1\35\2\47\1\36\3\47\1"+
            "\37\1\40\1\41\2\47\1\42\1\43\1\44\2\47\1\45\3\47\1\uffff\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55\5\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62\2\uffff\1\63\6\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67\15\uffff\1\70",
            "\1\47\2\uffff\12\47\7\uffff\4\47\1\71\11\47\1\72\13\47\4\uffff"+
            "\1\47\1\uffff\32\47",
            "\1\74",
            "\1\75",
            "\1\76\15\uffff\1\77\4\uffff\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\103\5\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110\2\uffff\1\111\6\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115\15\uffff\1\116",
            "\1\117\11\uffff\1\120",
            "\1\121",
            "\1\122",
            "\1\123\15\uffff\1\124\4\uffff\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "\1\131\7\uffff\1\132\2\uffff\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\151\5\uffff\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161\7\uffff\1\162\2\uffff\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0081\5\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\47\2\uffff\12\47\7\uffff\2\47\1\u0097\1\47\1\u0098\7\47"+
            "\1\u0099\6\47\1\u009a\2\47\1\u009b\3\47\4\uffff\1\47\1\uffff"+
            "\32\47",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\1\uffff\1\u00b4\7\uffff\1\u00b5\6\uffff\1\u00b6\2"+
            "\uffff\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0\1\u00c1\3\uffff\1\u00c2\7\uffff\1\u00c3\3\uffff\1"+
            "\u00c4\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4\6\uffff\1\u00d5",
            "\1\u00d6\15\uffff\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e1",
            "\1\u00e2\1\u00e3\3\uffff\1\u00e4\7\uffff\1\u00e5\3\uffff\1"+
            "\u00e6\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6\6\uffff\1\u00f7",
            "\1\u00f8\15\uffff\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120\13\uffff\1\u0121",
            "\1\u0122\1\u0123\3\uffff\1\u0124\7\uffff\1\u0125\3\uffff\1"+
            "\u0126\1\u0127",
            "\1\u0128",
            "",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146\13\uffff\1\u0147",
            "\1\u0148\1\u0149\3\uffff\1\u014a\7\uffff\1\u014b\3\uffff\1"+
            "\u014c\1\u014d",
            "\1\u014e",
            "",
            "",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0158",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u015a",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u017d",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u017f",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01af",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01c8",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01d0",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "",
            "",
            "\1\u01eb",
            "",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "",
            "",
            "\1\u0205",
            "",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "",
            "",
            "",
            "\1\u0217",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "",
            "",
            "",
            "\1\u022e",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u023e",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0247",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0249",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0252",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u025b",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u025d",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u026c",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u026e",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0270",
            "\1\u0271",
            "",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0279",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u027b",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u027d",
            "\1\u027e",
            "",
            "",
            "",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "",
            "",
            "\1\u0282",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0285",
            "",
            "",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "",
            "",
            "\1\u0289",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0290",
            "",
            "",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0295",
            "",
            "",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u02c2",
            "\1\u02c3",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u02c5",
            "\1\u02c6",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | ID | INT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}