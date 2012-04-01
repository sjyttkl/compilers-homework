
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Apr 01 23:09:55 CEST 2012
//----------------------------------------------------

package compiler.synanal;

import java_cup.runtime.*;
import compiler.report.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Apr 01 23:09:55 CEST 2012
  */
public class PascalSyn extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public PascalSyn() {super();}

  /** Constructor which sets the default scanner. */
  public PascalSyn(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public PascalSyn(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\004\000\002\002\006\000\002\003" +
    "\002\000\002\003\005\000\002\004\002\000\002\004\004" +
    "\000\002\004\004\000\002\004\004\000\002\005\004\000" +
    "\002\006\004\000\002\007\006\000\002\007\007\000\002" +
    "\010\004\000\002\011\006\000\002\011\007\000\002\015" +
    "\003\000\002\015\003\000\002\015\003\000\002\015\003" +
    "\000\002\015\003\000\002\015\005\000\002\016\003\000" +
    "\002\016\003\000\002\016\003\000\002\017\012\000\002" +
    "\020\005\000\002\021\003\000\002\021\004\000\002\022" +
    "\006\000\002\023\004\000\002\012\004\000\002\013\006" +
    "\000\002\013\007\000\002\014\003\000\002\014\003\000" +
    "\002\014\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\110\000\014\051\uffff\052\uffff\063\006\067\uffff\070" +
    "\uffff\001\002\000\012\051\ufffd\052\012\067\017\070\013" +
    "\001\002\000\004\002\011\001\002\000\004\010\007\001" +
    "\002\000\004\024\010\001\002\000\012\051\ufffe\052\ufffe" +
    "\067\ufffe\070\ufffe\001\002\000\004\002\001\001\002\000" +
    "\004\010\106\001\002\000\004\010\100\001\002\000\012" +
    "\051\ufffd\052\012\067\017\070\013\001\002\000\012\051" +
    "\ufffd\052\012\067\017\070\013\001\002\000\012\051\ufffd" +
    "\052\012\067\017\070\013\001\002\000\004\010\026\001" +
    "\002\000\004\051\021\001\002\000\004\055\024\001\002" +
    "\000\004\016\023\001\002\000\004\002\000\001\002\000" +
    "\004\016\ufff9\001\002\000\012\051\ufff5\052\ufff5\067\ufff5" +
    "\070\ufff5\001\002\000\004\030\027\001\002\000\022\010" +
    "\041\011\032\012\044\013\030\021\031\042\037\047\033" +
    "\064\034\001\002\000\006\023\uffea\024\uffea\001\002\000" +
    "\022\010\041\011\032\012\044\013\030\021\031\042\037" +
    "\047\033\064\034\001\002\000\006\023\uffec\024\uffec\001" +
    "\002\000\004\020\060\001\002\000\004\010\052\001\002" +
    "\000\006\023\ufff2\024\ufff2\001\002\000\004\024\046\001" +
    "\002\000\022\010\041\011\032\012\044\013\030\021\031" +
    "\042\037\047\033\064\034\001\002\000\006\023\uffef\024" +
    "\uffef\001\002\000\006\023\ufff1\024\ufff1\001\002\000\006" +
    "\023\ufff0\024\ufff0\001\002\000\006\023\uffee\024\uffee\001" +
    "\002\000\006\023\uffeb\024\uffeb\001\002\000\006\023\uffe4" +
    "\024\uffe4\001\002\000\014\010\026\051\ufff4\052\ufff4\067" +
    "\ufff4\070\ufff4\001\002\000\012\051\ufff3\052\ufff3\067\ufff3" +
    "\070\ufff3\001\002\000\004\055\057\001\002\000\006\010" +
    "\052\055\uffe7\001\002\000\004\014\053\001\002\000\022" +
    "\010\041\011\032\012\044\013\030\021\031\042\037\047" +
    "\033\064\034\001\002\000\004\024\055\001\002\000\006" +
    "\010\uffe5\055\uffe5\001\002\000\004\055\uffe6\001\002\000" +
    "\006\023\uffe8\024\uffe8\001\002\000\010\004\061\005\064" +
    "\006\063\001\002\000\010\017\uffe0\022\uffe0\024\uffe0\001" +
    "\002\000\004\017\065\001\002\000\010\017\uffde\022\uffde" +
    "\024\uffde\001\002\000\010\017\uffdf\022\uffdf\024\uffdf\001" +
    "\002\000\010\004\061\005\064\006\063\001\002\000\004" +
    "\022\067\001\002\000\004\061\070\001\002\000\022\010" +
    "\041\011\032\012\044\013\030\021\031\042\037\047\033" +
    "\064\034\001\002\000\006\023\uffe9\024\uffe9\001\002\000" +
    "\004\023\073\001\002\000\006\023\uffed\024\uffed\001\002" +
    "\000\004\051\ufffc\001\002\000\004\051\ufffb\001\002\000" +
    "\004\051\ufffa\001\002\000\012\051\uffe3\052\uffe3\067\uffe3" +
    "\070\uffe3\001\002\000\004\014\101\001\002\000\022\010" +
    "\041\011\032\012\044\013\030\021\031\042\037\047\033" +
    "\064\034\001\002\000\004\024\103\001\002\000\014\010" +
    "\100\051\uffe2\052\uffe2\067\uffe2\070\uffe2\001\002\000\012" +
    "\051\uffe1\052\uffe1\067\uffe1\070\uffe1\001\002\000\012\051" +
    "\ufff8\052\ufff8\067\ufff8\070\ufff8\001\002\000\004\030\107" +
    "\001\002\000\010\004\061\005\064\006\063\001\002\000" +
    "\004\024\111\001\002\000\014\010\106\051\ufff7\052\ufff7" +
    "\067\ufff7\070\ufff7\001\002\000\012\051\ufff6\052\ufff6\067" +
    "\ufff6\070\ufff6\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\110\000\006\002\004\003\003\001\001\000\012\004" +
    "\017\006\015\010\014\012\013\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\104\001\001\000\004\013\076" +
    "\001\001\000\012\004\075\006\015\010\014\012\013\001" +
    "\001\000\012\004\074\006\015\010\014\012\013\001\001" +
    "\000\012\004\073\006\015\010\014\012\013\001\001\000" +
    "\004\011\024\001\001\000\004\005\021\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\015\035" +
    "\016\034\017\041\020\037\023\042\001\001\000\002\001" +
    "\001\000\014\015\071\016\034\017\041\020\037\023\042" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\021" +
    "\047\022\050\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\015\044\016\034\017\041\020\037\023\042\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\046\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\021\055\022\050\001\001\000\002\001\001\000" +
    "\014\015\053\016\034\017\041\020\037\023\042\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\014\061\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\014\065\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\015\070\016\034\017\041\020\037\023\042\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\015\101\016\034" +
    "\017\041\020\037\023\042\001\001\000\002\001\001\000" +
    "\004\013\103\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\014\107\001\001\000\002\001" +
    "\001\000\004\007\111\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$PascalSyn$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$PascalSyn$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$PascalSyn$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        public void syntax_error(Symbol cur_token) {
            Report.warning ("Syntax error near word '" + (String)(cur_token.value) + "'.", cur_token.left, cur_token.right);
        }

        public void report_error(String message, Object info) {
        }

        public void report_fatal_error(String message, Object info) throws Exception {
        	throw new Exception(message);
        }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$PascalSyn$actions {
  private final PascalSyn parser;

  /** Constructor */
  CUP$PascalSyn$actions(PascalSyn parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$PascalSyn$do_action(
    int                        CUP$PascalSyn$act_num,
    java_cup.runtime.lr_parser CUP$PascalSyn$parser,
    java.util.Stack            CUP$PascalSyn$stack,
    int                        CUP$PascalSyn$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$PascalSyn$result;

      /* select the action based on the action number */
      switch (CUP$PascalSyn$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // value ::= INT_CONST 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("value",10, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // value ::= CHAR_CONST 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("value",10, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // value ::= BOOL_CONST 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("value",10, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // var_ ::= IDENTIFIER COLON type_desc SEMIC var_ 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("var_",9, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // var_ ::= IDENTIFIER COLON type_desc SEMIC 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("var_",9, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // var ::= VAR var_ 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("var",8, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // type_pointer ::= PTR type_desc 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_pointer",17, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // type_record_component ::= IDENTIFIER COLON type_desc SEMIC 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_record_component",16, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // type_record_components ::= type_record_component type_record_components 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_record_components",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // type_record_components ::= type_record_component 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_record_components",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // type_record ::= RECORD type_record_components END 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_record",14, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // type_table ::= ARRAY LBRACKET value DOTS value RBRACKET OF type_desc 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_table",13, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // type_atom ::= INT 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_atom",12, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // type_atom ::= CHAR 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_atom",12, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // type_atom ::= BOOL 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_atom",12, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // type_desc ::= LPARENTHESIS type_desc RPARENTHESIS 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_desc",11, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // type_desc ::= type_pointer 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_desc",11, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // type_desc ::= type_record 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_desc",11, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // type_desc ::= type_table 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_desc",11, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // type_desc ::= IDENTIFIER 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_desc",11, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // type_desc ::= type_atom 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_desc",11, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // type_ ::= IDENTIFIER EQU type_desc SEMIC type_ 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_",7, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // type_ ::= IDENTIFIER EQU type_desc SEMIC 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type_",7, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // type ::= TYPE type_ 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("type",6, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // constant_ ::= IDENTIFIER EQU value SEMIC constant_ 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("constant_",5, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // constant_ ::= IDENTIFIER EQU value SEMIC 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("constant_",5, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // constant ::= CONST constant_ 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("constant",4, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // sentence ::= BEGIN END 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("sentence",3, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // declaration ::= var declaration 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declaration",2, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // declaration ::= type declaration 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declaration",2, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declaration ::= constant declaration 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declaration",2, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaration ::= 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declaration",2, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // program ::= PROGRAM IDENTIFIER SEMIC 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("program",1, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("program",1, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // source ::= program declaration sentence DOT 
            {
              Object RESULT =null;

              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("source",0, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= source EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		RESULT = start_val;
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$PascalSyn$parser.done_parsing();
          return CUP$PascalSyn$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

