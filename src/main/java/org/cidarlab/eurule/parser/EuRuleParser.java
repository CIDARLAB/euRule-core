// $ANTLR 3.4 /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g 2014-04-02 12:30:12

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

import org.cidarlab.minieugene.Interp;
import org.cidarlab.minieugene.symbol.*;
import org.cidarlab.minieugene.predicates.*;
import org.cidarlab.minieugene.exception.EugeneException;

import org.apache.commons.lang3.ArrayUtils;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EuRuleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "')'", "','", "'.'", "':='", "'AFTER'", "'ALL_AFTER'", "'ALL_BEFORE'", "'ALL_FORWARD'", "'ALL_NEXTTO'", "'ALL_REVERSE'", "'ALL_SAME_ORIENTATION'", "'ALTERNATE_ORIENTATION'", "'ALWAYS_NEXTTO'", "'BEFORE'", "'CONTAINS'", "'DRIVES'", "'ENDSWITH'", "'EQUALS'", "'EXACTLY'", "'FORWARD'", "'INDUCES'", "'MATCHES'", "'MORETHAN'", "'NEXTTO'", "'NOT'", "'NOTCONTAINS'", "'NOTEQUALS'", "'NOTEXACTLY'", "'NOTMATCHES'", "'NOTMORETHAN'", "'NOTTHEN'", "'NOTWITH'", "'OR'", "'REPRESSES'", "'REVERSE'", "'SAME_COUNT'", "'SAME_ORIENTATION'", "'SOME_AFTER'", "'SOME_BEFORE'", "'SOME_FORWARD'", "'SOME_NEXTTO'", "'SOME_REVERSE'", "'SOME_SAME_ORIENTATION'", "'STARTSWITH'", "'THEN'", "'WITH'", "'['", "'\\\\/'", "']'", "'after'", "'all_after'", "'all_before'", "'all_forward'", "'all_nextto'", "'all_reverse'", "'all_same_orientation'", "'alternate_orientation'", "'always_nextto'", "'before'", "'contains'", "'drives'", "'endswith'", "'equals'", "'exactly'", "'forward'", "'induces'", "'matches'", "'morethan'", "'nextto'", "'notcontains'", "'notequals'", "'notexactly'", "'notmatches'", "'notmorethan'", "'notthen'", "'notwith'", "'or'", "'represses'", "'reverse'", "'same_count'", "'same_orientation'", "'some_after'", "'some_before'", "'some_forward'", "'some_nextto'", "'some_reverse'", "'some_same_orientation'", "'startswith'", "'then'", "'with'", "'||'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public EuRuleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public EuRuleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return EuRuleParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g"; }



    // INTERPRETER
    private Interp interp;

    // SYMBOL TABLES
    private SymbolTables symbols;
    public void init(SymbolTables symbols) {
        this.symbols = symbols;
    }

    // N
    private int N;

    // PREDICATES
    private LogicalAnd la = new LogicalAnd();

    private void addPredicate(Predicate p) {
        this.la.getPredicates().add(p);  
    }

    public LogicalAnd getPredicate() {
        this.la.setN(this.N);
        return this.la;
    }


    // for tokenization
    String[] tokens = null;
    private void addToken(String token) {
        if(null != tokens) {
            tokens = ArrayUtils.add(tokens, token);
        } else {
            tokens = new String[1];
            tokens[0] = token;
        }
    }




    // $ANTLR start "eurule"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:103:1: eurule : ( composite_constraint )+ ;
    public final void eurule() throws EugeneException, RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:105:2: ( ( composite_constraint )+ )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:105:4: ( composite_constraint )+
            {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:105:4: ( composite_constraint )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:105:5: composite_constraint
            	    {
            	    pushFollow(FOLLOW_composite_constraint_in_eurule45);
            	    composite_constraint();

            	    state._fsp--;


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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "eurule"



    // $ANTLR start "composite_constraint"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:108:1: composite_constraint : ID ( '(' list_of_parameters ')' )? ':=' composite_constraint_block '.' ;
    public final void composite_constraint() throws EugeneException, RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:110:2: ( ID ( '(' list_of_parameters ')' )? ':=' composite_constraint_block '.' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:110:4: ID ( '(' list_of_parameters ')' )? ':=' composite_constraint_block '.'
            {
            match(input,ID,FOLLOW_ID_in_composite_constraint63); 

            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:110:7: ( '(' list_of_parameters ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:110:9: '(' list_of_parameters ')'
                    {
                    match(input,15,FOLLOW_15_in_composite_constraint67); 

                    pushFollow(FOLLOW_list_of_parameters_in_composite_constraint69);
                    list_of_parameters();

                    state._fsp--;


                    match(input,16,FOLLOW_16_in_composite_constraint71); 

                    }
                    break;

            }


            match(input,19,FOLLOW_19_in_composite_constraint76); 

            pushFollow(FOLLOW_composite_constraint_block_in_composite_constraint78);
            composite_constraint_block();

            state._fsp--;


            match(input,18,FOLLOW_18_in_composite_constraint80); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "composite_constraint"



    // $ANTLR start "composite_constraint_block"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:113:1: composite_constraint_block : or_constraint ( ',' composite_constraint_block )? ;
    public final void composite_constraint_block() throws EugeneException, RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:115:2: ( or_constraint ( ',' composite_constraint_block )? )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:115:4: or_constraint ( ',' composite_constraint_block )?
            {
            pushFollow(FOLLOW_or_constraint_in_composite_constraint_block96);
            or_constraint();

            state._fsp--;


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:115:18: ( ',' composite_constraint_block )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:115:19: ',' composite_constraint_block
                    {
                    match(input,17,FOLLOW_17_in_composite_constraint_block99); 

                    pushFollow(FOLLOW_composite_constraint_block_in_composite_constraint_block101);
                    composite_constraint_block();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "composite_constraint_block"



    // $ANTLR start "or_constraint"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:118:1: or_constraint returns [List<Predicate> lst] : c= constraint ( ( 'OR' | '\\\\/' | 'or' | '||' ) o= or_constraint )? ;
    public final List<Predicate> or_constraint() throws EugeneException, RecognitionException {
        List<Predicate> lst = null;


        Predicate c =null;

        List<Predicate> o =null;



        lst = new ArrayList<Predicate>();

        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:124:2: (c= constraint ( ( 'OR' | '\\\\/' | 'or' | '||' ) o= or_constraint )? )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:124:4: c= constraint ( ( 'OR' | '\\\\/' | 'or' | '||' ) o= or_constraint )?
            {
            pushFollow(FOLLOW_constraint_in_or_constraint141);
            c=constraint();

            state._fsp--;



            lst.add(c);
            	

            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:126:4: ( ( 'OR' | '\\\\/' | 'or' | '||' ) o= or_constraint )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==48||LA4_0==63||LA4_0==92||LA4_0==106) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:126:5: ( 'OR' | '\\\\/' | 'or' | '||' ) o= or_constraint
                    {
                    if ( input.LA(1)==48||input.LA(1)==63||input.LA(1)==92||input.LA(1)==106 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_or_constraint_in_or_constraint158);
                    o=or_constraint();

                    state._fsp--;



                    lst.addAll(o);
                    	

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return lst;
    }
    // $ANTLR end "or_constraint"



    // $ANTLR start "constraint"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:131:1: constraint returns [Predicate p] : (not= 'NOT' )? (lhs= operand )? op= operator (rhs= operand )? ;
    public final Predicate constraint() throws EugeneException, RecognitionException {
        Predicate p = null;


        Token not=null;
        EuRuleParser.operand_return lhs =null;

        EuRuleParser.operator_return op =null;

        EuRuleParser.operand_return rhs =null;


        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:134:2: ( (not= 'NOT' )? (lhs= operand )? op= operator (rhs= operand )? )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:134:4: (not= 'NOT' )? (lhs= operand )? op= operator (rhs= operand )?
            {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:134:4: (not= 'NOT' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==40) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:134:5: not= 'NOT'
                    {
                    not=(Token)match(input,40,FOLLOW_40_in_constraint194); 


                    addToken("NOT");
                    	

                    }
                    break;

            }


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:136:6: (lhs= operand )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case ID:
                    {
                    alt6=1;
                    }
                    break;
                case INT:
                    {
                    alt6=1;
                    }
                    break;
                case 62:
                    {
                    int LA6_3 = input.LA(2);

                    if ( (LA6_3==INT) ) {
                        int LA6_5 = input.LA(3);

                        if ( (LA6_5==64) ) {
                            alt6=1;
                        }
                    }
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:136:7: lhs= operand
                    {
                    pushFollow(FOLLOW_operand_in_constraint203);
                    lhs=operand();

                    state._fsp--;



                    addToken((lhs!=null?input.toString(lhs.start,lhs.stop):null));	
                    	

                    }
                    break;

            }


            pushFollow(FOLLOW_operator_in_constraint211);
            op=operator();

            state._fsp--;



            addToken((op!=null?input.toString(op.start,op.stop):null));	
            	

            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:140:4: (rhs= operand )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= ID && LA7_0 <= INT)||LA7_0==62) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:140:5: rhs= operand
                    {
                    pushFollow(FOLLOW_operand_in_constraint218);
                    rhs=operand();

                    state._fsp--;



                    addToken((rhs!=null?input.toString(rhs.start,rhs.stop):null));	
                    	

                    }
                    break;

            }




            // turn the tokens into a miniEugene predicate	
            p = this.interp.interpreteRule(this.tokens);

            // reset the global token array
            this.tokens = null;
            	

            }

        }
        catch (EugeneException e) {

            throw new EugeneException(e.getMessage());	
            	
        }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "constraint"


    public static class operator_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "operator"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:155:1: operator : (| ( 'CONTAINS' | 'contains' ) | ( 'NOTCONTAINS' | 'notcontains' ) | ( 'EXACTLY' | 'exactly' ) | ( 'NOTEXACTLY' | 'notexactly' ) | ( 'MORETHAN' | 'morethan' ) | ( 'NOTMORETHAN' | 'notmorethan' ) | ( 'SAME_COUNT' | 'same_count' ) | ( 'WITH' | 'with' ) | ( 'NOTWITH' | 'notwith' ) | ( 'THEN' | 'then' ) | ( 'NOTTHEN' | 'notthen' ) | ( 'STARTSWITH' | 'startswith' ) | ( 'ENDSWITH' | 'endswith' ) | ( 'BEFORE' | 'before' ) | ( 'ALL_BEFORE' | 'all_before' ) | ( 'SOME_BEFORE' | 'some_before' ) | ( 'AFTER' | 'after' ) | ( 'ALL_AFTER' | 'all_after' ) | ( 'SOME_AFTER' | 'some_after' ) | ( 'NEXTTO' | 'nextto' ) | ( 'ALL_NEXTTO' | 'all_nextto' ) | ( 'SOME_NEXTTO' | 'some_nextto' ) | ( 'ALWAYS_NEXTTO' | 'always_nextto' ) | ( 'EQUALS' | 'equals' ) | ( 'NOTEQUALS' | 'notequals' ) | ( 'MATCHES' | 'matches' ) | ( 'NOTMATCHES' | 'notmatches' ) | ( 'FORWARD' | 'forward' ) | ( 'ALL_FORWARD' | 'all_forward' ) | ( 'SOME_FORWARD' | 'some_forward' ) | ( 'REVERSE' | 'reverse' ) | ( 'ALL_REVERSE' | 'all_reverse' ) | ( 'SOME_REVERSE' | 'some_reverse' ) | ( 'SAME_ORIENTATION' | 'same_orientation' ) | ( 'ALL_SAME_ORIENTATION' | 'all_same_orientation' ) | ( 'SOME_SAME_ORIENTATION' | 'some_same_orientation' ) | ( 'REPRESSES' | 'represses' ) | ( 'INDUCES' | 'induces' ) | ( 'DRIVES' | 'drives' ) | ( 'ALTERNATE_ORIENTATION' | 'alternate_orientation' ) );
    public final EuRuleParser.operator_return operator() throws RecognitionException {
        EuRuleParser.operator_return retval = new EuRuleParser.operator_return();
        retval.start = input.LT(1);


        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:155:9: (| ( 'CONTAINS' | 'contains' ) | ( 'NOTCONTAINS' | 'notcontains' ) | ( 'EXACTLY' | 'exactly' ) | ( 'NOTEXACTLY' | 'notexactly' ) | ( 'MORETHAN' | 'morethan' ) | ( 'NOTMORETHAN' | 'notmorethan' ) | ( 'SAME_COUNT' | 'same_count' ) | ( 'WITH' | 'with' ) | ( 'NOTWITH' | 'notwith' ) | ( 'THEN' | 'then' ) | ( 'NOTTHEN' | 'notthen' ) | ( 'STARTSWITH' | 'startswith' ) | ( 'ENDSWITH' | 'endswith' ) | ( 'BEFORE' | 'before' ) | ( 'ALL_BEFORE' | 'all_before' ) | ( 'SOME_BEFORE' | 'some_before' ) | ( 'AFTER' | 'after' ) | ( 'ALL_AFTER' | 'all_after' ) | ( 'SOME_AFTER' | 'some_after' ) | ( 'NEXTTO' | 'nextto' ) | ( 'ALL_NEXTTO' | 'all_nextto' ) | ( 'SOME_NEXTTO' | 'some_nextto' ) | ( 'ALWAYS_NEXTTO' | 'always_nextto' ) | ( 'EQUALS' | 'equals' ) | ( 'NOTEQUALS' | 'notequals' ) | ( 'MATCHES' | 'matches' ) | ( 'NOTMATCHES' | 'notmatches' ) | ( 'FORWARD' | 'forward' ) | ( 'ALL_FORWARD' | 'all_forward' ) | ( 'SOME_FORWARD' | 'some_forward' ) | ( 'REVERSE' | 'reverse' ) | ( 'ALL_REVERSE' | 'all_reverse' ) | ( 'SOME_REVERSE' | 'some_reverse' ) | ( 'SAME_ORIENTATION' | 'same_orientation' ) | ( 'ALL_SAME_ORIENTATION' | 'all_same_orientation' ) | ( 'SOME_SAME_ORIENTATION' | 'some_same_orientation' ) | ( 'REPRESSES' | 'represses' ) | ( 'INDUCES' | 'induces' ) | ( 'DRIVES' | 'drives' ) | ( 'ALTERNATE_ORIENTATION' | 'alternate_orientation' ) )
            int alt8=41;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case 17:
            case 18:
            case 48:
            case 62:
            case 63:
            case 92:
            case 106:
                {
                alt8=1;
                }
                break;
            case 30:
            case 75:
                {
                alt8=2;
                }
                break;
            case 41:
            case 85:
                {
                alt8=3;
                }
                break;
            case 34:
            case 79:
                {
                alt8=4;
                }
                break;
            case 43:
            case 87:
                {
                alt8=5;
                }
                break;
            case 38:
            case 83:
                {
                alt8=6;
                }
                break;
            case 45:
            case 89:
                {
                alt8=7;
                }
                break;
            case 51:
            case 95:
                {
                alt8=8;
                }
                break;
            case 61:
            case 105:
                {
                alt8=9;
                }
                break;
            case 47:
            case 91:
                {
                alt8=10;
                }
                break;
            case 60:
            case 104:
                {
                alt8=11;
                }
                break;
            case 46:
            case 90:
                {
                alt8=12;
                }
                break;
            case 59:
            case 103:
                {
                alt8=13;
                }
                break;
            case 32:
            case 77:
                {
                alt8=14;
                }
                break;
            case 29:
            case 74:
                {
                alt8=15;
                }
                break;
            case 22:
            case 67:
                {
                alt8=16;
                }
                break;
            case 54:
            case 98:
                {
                alt8=17;
                }
                break;
            case 20:
            case 65:
                {
                alt8=18;
                }
                break;
            case 21:
            case 66:
                {
                alt8=19;
                }
                break;
            case 53:
            case 97:
                {
                alt8=20;
                }
                break;
            case 39:
            case 84:
                {
                alt8=21;
                }
                break;
            case 24:
            case 69:
                {
                alt8=22;
                }
                break;
            case 56:
            case 100:
                {
                alt8=23;
                }
                break;
            case 28:
            case 73:
                {
                alt8=24;
                }
                break;
            case 33:
            case 78:
                {
                alt8=25;
                }
                break;
            case 42:
            case 86:
                {
                alt8=26;
                }
                break;
            case 37:
            case 82:
                {
                alt8=27;
                }
                break;
            case 44:
            case 88:
                {
                alt8=28;
                }
                break;
            case 35:
            case 80:
                {
                alt8=29;
                }
                break;
            case 23:
            case 68:
                {
                alt8=30;
                }
                break;
            case 55:
            case 99:
                {
                alt8=31;
                }
                break;
            case 50:
            case 94:
                {
                alt8=32;
                }
                break;
            case 25:
            case 70:
                {
                alt8=33;
                }
                break;
            case 57:
            case 101:
                {
                alt8=34;
                }
                break;
            case 52:
            case 96:
                {
                alt8=35;
                }
                break;
            case 26:
            case 71:
                {
                alt8=36;
                }
                break;
            case 58:
            case 102:
                {
                alt8=37;
                }
                break;
            case 49:
            case 93:
                {
                alt8=38;
                }
                break;
            case 36:
            case 81:
                {
                alt8=39;
                }
                break;
            case 31:
            case 76:
                {
                alt8=40;
                }
                break;
            case 27:
            case 72:
                {
                alt8=41;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:156:2: 
                    {
                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:156:4: ( 'CONTAINS' | 'contains' )
                    {
                    if ( input.LA(1)==30||input.LA(1)==75 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:157:4: ( 'NOTCONTAINS' | 'notcontains' )
                    {
                    if ( input.LA(1)==41||input.LA(1)==85 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 4 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:158:4: ( 'EXACTLY' | 'exactly' )
                    {
                    if ( input.LA(1)==34||input.LA(1)==79 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:159:4: ( 'NOTEXACTLY' | 'notexactly' )
                    {
                    if ( input.LA(1)==43||input.LA(1)==87 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 6 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:160:4: ( 'MORETHAN' | 'morethan' )
                    {
                    if ( input.LA(1)==38||input.LA(1)==83 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 7 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:161:4: ( 'NOTMORETHAN' | 'notmorethan' )
                    {
                    if ( input.LA(1)==45||input.LA(1)==89 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 8 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:162:4: ( 'SAME_COUNT' | 'same_count' )
                    {
                    if ( input.LA(1)==51||input.LA(1)==95 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 9 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:163:4: ( 'WITH' | 'with' )
                    {
                    if ( input.LA(1)==61||input.LA(1)==105 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 10 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:164:4: ( 'NOTWITH' | 'notwith' )
                    {
                    if ( input.LA(1)==47||input.LA(1)==91 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 11 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:165:4: ( 'THEN' | 'then' )
                    {
                    if ( input.LA(1)==60||input.LA(1)==104 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 12 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:166:4: ( 'NOTTHEN' | 'notthen' )
                    {
                    if ( input.LA(1)==46||input.LA(1)==90 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 13 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:167:4: ( 'STARTSWITH' | 'startswith' )
                    {
                    if ( input.LA(1)==59||input.LA(1)==103 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 14 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:168:4: ( 'ENDSWITH' | 'endswith' )
                    {
                    if ( input.LA(1)==32||input.LA(1)==77 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 15 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:169:4: ( 'BEFORE' | 'before' )
                    {
                    if ( input.LA(1)==29||input.LA(1)==74 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 16 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:170:4: ( 'ALL_BEFORE' | 'all_before' )
                    {
                    if ( input.LA(1)==22||input.LA(1)==67 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 17 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:171:4: ( 'SOME_BEFORE' | 'some_before' )
                    {
                    if ( input.LA(1)==54||input.LA(1)==98 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 18 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:172:4: ( 'AFTER' | 'after' )
                    {
                    if ( input.LA(1)==20||input.LA(1)==65 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 19 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:173:4: ( 'ALL_AFTER' | 'all_after' )
                    {
                    if ( input.LA(1)==21||input.LA(1)==66 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 20 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:174:4: ( 'SOME_AFTER' | 'some_after' )
                    {
                    if ( input.LA(1)==53||input.LA(1)==97 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 21 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:175:4: ( 'NEXTTO' | 'nextto' )
                    {
                    if ( input.LA(1)==39||input.LA(1)==84 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 22 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:176:4: ( 'ALL_NEXTTO' | 'all_nextto' )
                    {
                    if ( input.LA(1)==24||input.LA(1)==69 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 23 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:177:4: ( 'SOME_NEXTTO' | 'some_nextto' )
                    {
                    if ( input.LA(1)==56||input.LA(1)==100 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 24 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:178:4: ( 'ALWAYS_NEXTTO' | 'always_nextto' )
                    {
                    if ( input.LA(1)==28||input.LA(1)==73 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 25 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:179:4: ( 'EQUALS' | 'equals' )
                    {
                    if ( input.LA(1)==33||input.LA(1)==78 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 26 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:180:4: ( 'NOTEQUALS' | 'notequals' )
                    {
                    if ( input.LA(1)==42||input.LA(1)==86 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 27 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:181:4: ( 'MATCHES' | 'matches' )
                    {
                    if ( input.LA(1)==37||input.LA(1)==82 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 28 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:182:4: ( 'NOTMATCHES' | 'notmatches' )
                    {
                    if ( input.LA(1)==44||input.LA(1)==88 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 29 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:183:4: ( 'FORWARD' | 'forward' )
                    {
                    if ( input.LA(1)==35||input.LA(1)==80 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 30 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:184:4: ( 'ALL_FORWARD' | 'all_forward' )
                    {
                    if ( input.LA(1)==23||input.LA(1)==68 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 31 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:185:4: ( 'SOME_FORWARD' | 'some_forward' )
                    {
                    if ( input.LA(1)==55||input.LA(1)==99 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 32 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:186:4: ( 'REVERSE' | 'reverse' )
                    {
                    if ( input.LA(1)==50||input.LA(1)==94 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 33 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:187:4: ( 'ALL_REVERSE' | 'all_reverse' )
                    {
                    if ( input.LA(1)==25||input.LA(1)==70 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 34 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:188:4: ( 'SOME_REVERSE' | 'some_reverse' )
                    {
                    if ( input.LA(1)==57||input.LA(1)==101 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 35 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:189:4: ( 'SAME_ORIENTATION' | 'same_orientation' )
                    {
                    if ( input.LA(1)==52||input.LA(1)==96 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 36 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:190:4: ( 'ALL_SAME_ORIENTATION' | 'all_same_orientation' )
                    {
                    if ( input.LA(1)==26||input.LA(1)==71 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 37 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:191:4: ( 'SOME_SAME_ORIENTATION' | 'some_same_orientation' )
                    {
                    if ( input.LA(1)==58||input.LA(1)==102 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 38 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:192:4: ( 'REPRESSES' | 'represses' )
                    {
                    if ( input.LA(1)==49||input.LA(1)==93 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 39 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:193:4: ( 'INDUCES' | 'induces' )
                    {
                    if ( input.LA(1)==36||input.LA(1)==81 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 40 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:194:4: ( 'DRIVES' | 'drives' )
                    {
                    if ( input.LA(1)==31||input.LA(1)==76 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 41 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:195:4: ( 'ALTERNATE_ORIENTATION' | 'alternate_orientation' )
                    {
                    if ( input.LA(1)==27||input.LA(1)==72 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operator"


    public static class operand_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "operand"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:198:1: operand : ( ID | INT | '[' INT ']' );
    public final EuRuleParser.operand_return operand() throws RecognitionException {
        EuRuleParser.operand_return retval = new EuRuleParser.operand_return();
        retval.start = input.LT(1);


        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:198:9: ( ID | INT | '[' INT ']' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case INT:
                {
                alt9=2;
                }
                break;
            case 62:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:198:11: ID
                    {
                    match(input,ID,FOLLOW_ID_in_operand610); 

                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:199:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_operand616); 

                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:200:4: '[' INT ']'
                    {
                    match(input,62,FOLLOW_62_in_operand621); 

                    match(input,INT,FOLLOW_INT_in_operand623); 

                    match(input,64,FOLLOW_64_in_operand625); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operand"



    // $ANTLR start "list_of_parameters"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:203:1: list_of_parameters : ID ( ',' list_of_parameters )? ;
    public final void list_of_parameters() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:204:2: ( ID ( ',' list_of_parameters )? )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:204:4: ID ( ',' list_of_parameters )?
            {
            match(input,ID,FOLLOW_ID_in_list_of_parameters636); 

            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:204:7: ( ',' list_of_parameters )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/euRule-core/grammar/EuRule.g:204:8: ',' list_of_parameters
                    {
                    match(input,17,FOLLOW_17_in_list_of_parameters639); 

                    pushFollow(FOLLOW_list_of_parameters_in_list_of_parameters641);
                    list_of_parameters();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "list_of_parameters"

    // Delegated rules


 

    public static final BitSet FOLLOW_composite_constraint_in_eurule45 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ID_in_composite_constraint63 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_composite_constraint67 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_list_of_parameters_in_composite_constraint69 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_composite_constraint71 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_composite_constraint76 = new BitSet(new long[]{0x7FFEFFFFFFF00600L,0x000003FFEFFFFFFEL});
    public static final BitSet FOLLOW_composite_constraint_block_in_composite_constraint78 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_composite_constraint80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_constraint_in_composite_constraint_block96 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_composite_constraint_block99 = new BitSet(new long[]{0x7FFEFFFFFFF00600L,0x000003FFEFFFFFFEL});
    public static final BitSet FOLLOW_composite_constraint_block_in_composite_constraint_block101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_in_or_constraint141 = new BitSet(new long[]{0x8001000000000002L,0x0000040010000000L});
    public static final BitSet FOLLOW_set_in_or_constraint146 = new BitSet(new long[]{0x7FFEFFFFFFF00600L,0x000003FFEFFFFFFEL});
    public static final BitSet FOLLOW_or_constraint_in_or_constraint158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_constraint194 = new BitSet(new long[]{0x7FFEFEFFFFF00600L,0x000003FFEFFFFFFEL});
    public static final BitSet FOLLOW_operand_in_constraint203 = new BitSet(new long[]{0x7FFEFEFFFFF00600L,0x000003FFEFFFFFFEL});
    public static final BitSet FOLLOW_operator_in_constraint211 = new BitSet(new long[]{0x4000000000000602L});
    public static final BitSet FOLLOW_operand_in_constraint218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operand610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_operand616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_operand621 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_operand623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_operand625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_of_parameters636 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_list_of_parameters639 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_list_of_parameters_in_list_of_parameters641 = new BitSet(new long[]{0x0000000000000002L});

}