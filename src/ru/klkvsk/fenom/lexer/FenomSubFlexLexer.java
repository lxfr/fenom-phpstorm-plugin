/* The following code was generated by JFlex 1.4.3 on 16.07.13 16:52 */

package ru.klkvsk.fenom.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;
import static ru.klkvsk.fenom.psi.FenomTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 16.07.13 16:52 from the specification file
 * <tt>C:/Users/klkvsk/IdeaProjects/Fenom/src/ru/klkvsk/fenom/lexer/FenomSub.flex</tt>
 */
class FenomSubFlexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\7\1\5\1\0\1\7\1\7\22\0\1\10\1\60\1\6"+
    "\1\0\1\11\1\0\1\62\1\3\2\50\1\0\1\0\1\61\1\56"+
    "\1\12\1\57\12\2\1\52\1\53\1\63\1\54\1\55\1\60\1\0"+
    "\1\27\3\13\1\23\1\25\2\13\1\37\2\13\1\31\1\41\1\35"+
    "\1\13\1\43\1\13\1\17\1\33\1\15\1\21\3\13\1\45\1\13"+
    "\1\47\1\4\1\47\1\0\1\1\1\0\1\30\3\14\1\24\1\26"+
    "\2\14\1\40\2\14\1\32\1\42\1\36\1\14\1\44\1\14\1\20"+
    "\1\34\1\16\1\22\3\14\1\46\1\14\1\0\1\51\1\0\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\1\1\4\1\1\1\4"+
    "\1\1\1\5\5\2\1\6\1\7\1\10\1\11\1\12"+
    "\2\13\2\1\1\13\1\14\1\15\6\16\2\0\1\17"+
    "\4\0\1\20\5\2\1\13\2\21\6\16\1\3\1\16"+
    "\5\2\6\16\2\2\2\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\150\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\150\0\150\0\150\0\150\0\150\0\u030c\0\u0340\0\u0374"+
    "\0\u03a8\0\150\0\150\0\150\0\u03dc\0\u0410\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0104\0\150\0\u0548\0\u016c\0\u057c"+
    "\0\u05b0\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c"+
    "\0\u071c\0\150\0\u03a8\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820"+
    "\0\u0514\0\150\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958"+
    "\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\234\0\u0a5c\0\u0a90\0\u0ac4"+
    "\0\u0af8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\3\1\7\1\10\1\7"+
    "\1\11\1\12\1\13\2\4\2\14\4\4\2\15\2\16"+
    "\6\4\2\17\2\20\6\4\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\27\1\3\1\4\1\5\1\6\1\3\1\7\1\10"+
    "\1\7\1\11\1\12\1\13\1\4\1\35\1\14\1\36"+
    "\1\4\1\35\1\4\1\35\1\15\1\37\1\16\1\40"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\17\1\41"+
    "\1\20\1\42\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\27\65\0\2\4\10\0"+
    "\34\4\17\0\1\5\7\0\1\43\51\0\3\44\1\45"+
    "\1\46\57\44\5\0\1\7\1\0\2\7\53\0\4\47"+
    "\1\50\1\47\1\45\55\47\5\0\1\7\1\0\2\7"+
    "\3\0\1\51\1\0\1\51\1\0\1\51\1\0\1\51"+
    "\1\0\1\51\1\0\1\51\1\0\1\51\1\0\1\51"+
    "\1\0\1\51\1\0\1\51\1\0\1\51\1\0\1\51"+
    "\1\0\1\51\1\0\1\51\16\0\1\52\11\0\34\52"+
    "\16\0\2\4\10\0\4\4\2\53\26\4\16\0\2\4"+
    "\10\0\26\4\2\54\4\4\16\0\2\4\10\0\14\4"+
    "\2\55\16\4\16\0\2\4\10\0\6\4\2\56\24\4"+
    "\16\0\2\4\10\0\20\4\2\57\12\4\71\0\1\60"+
    "\1\61\5\0\1\60\54\0\2\60\5\0\1\60\55\0"+
    "\1\62\22\0\1\63\1\0\1\63\1\0\1\63\1\0"+
    "\1\63\1\0\1\63\1\0\1\63\1\0\1\63\1\0"+
    "\1\63\1\0\1\63\1\0\1\63\1\0\1\63\1\0"+
    "\1\63\1\0\1\63\1\0\1\63\16\0\2\4\10\0"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\16\0\2\4\10\0\1\4"+
    "\1\35\1\4\1\35\1\53\1\64\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\16\0\2\4\10\0\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\54\1\65\1\4\1\35"+
    "\1\4\1\35\16\0\2\4\10\0\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\55\1\66\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\16\0\2\4\10\0\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\56\1\67\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\16\0\2\4\10\0\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\57\1\70\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\17\0"+
    "\1\71\61\0\5\44\1\0\56\44\5\47\1\0\56\47"+
    "\10\0\1\72\3\0\1\51\1\0\1\51\1\0\1\51"+
    "\1\0\1\51\1\0\1\51\1\0\1\51\1\0\1\51"+
    "\1\0\1\51\1\0\1\51\1\0\1\51\1\0\1\51"+
    "\1\0\1\51\1\0\1\51\1\0\1\51\5\0\1\72"+
    "\11\0\1\52\7\0\35\52\16\0\2\4\10\0\6\4"+
    "\2\73\24\4\16\0\2\4\10\0\30\4\2\74\2\4"+
    "\16\0\2\4\10\0\16\4\2\75\14\4\16\0\2\4"+
    "\10\0\16\4\2\76\14\4\16\0\2\4\10\0\20\4"+
    "\2\77\12\4\71\0\2\32\5\0\1\32\1\0\2\4"+
    "\10\0\1\4\1\35\1\4\1\35\1\4\1\35\1\73"+
    "\1\100\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\16\0\2\4\10\0"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\74\1\101\1\4\1\35\16\0\2\4\10\0\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\75\1\102\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\16\0\2\4\10\0\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\76\1\103\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\16\0\2\4\10\0\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\77\1\104\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\16\0\2\4\10\0\10\4\2\105\22\4\16\0"+
    "\2\4\10\0\2\4\2\106\30\4\16\0\2\4\10\0"+
    "\20\4\2\73\12\4\16\0\2\4\10\0\16\4\2\105"+
    "\14\4\16\0\2\4\10\0\10\4\2\107\22\4\16\0"+
    "\2\4\10\0\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\105\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\16\0\2\4"+
    "\10\0\1\4\1\35\1\106\1\110\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\16\0\2\4\10\0"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\73\1\100\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\16\0\2\4\10\0\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\105\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\16\0\2\4\10\0\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\107\1\111"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\16\0\2\4\10\0\32\4\2\105\16\0"+
    "\2\4\10\0\2\4\2\105\30\4\16\0\2\4\10\0"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\4\1\35\1\4\1\35\1\4\1\35"+
    "\1\4\1\35\1\105\1\35\16\0\2\4\10\0\1\4"+
    "\1\35\1\105\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\1\4\1\35\1\4\1\35\1\4"+
    "\1\35\1\4\1\35\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2860];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\7\1\1\11\5\1\5\11\4\1\3\11"+
    "\6\1\2\0\1\11\4\0\10\1\1\11\7\1\1\11"+
    "\17\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Stack<Integer> stack = new Stack<Integer>();

    public void yypushState(int newState) {
      stack.push(yystate());
      yybegin(newState);
    }

    public void yypopState() {
      yybegin(stack.pop());
    }


  FenomSubFlexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  FenomSubFlexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 160) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL.charAt(zzMarkedPosL-1)) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { return WHITE_SPACE;
          }
        case 18: break;
        case 14: 
          { return KEYWORD;
          }
        case 19: break;
        case 5: 
          { return DOT;
          }
        case 20: break;
        case 13: 
          { return LOGIC;
          }
        case 21: break;
        case 11: 
          { return OPERATOR;
          }
        case 22: break;
        case 7: 
          { return BRACKETS;
          }
        case 23: break;
        case 6: 
          { return ARRAY;
          }
        case 24: break;
        case 8: 
          { return MODIFIER;
          }
        case 25: break;
        case 12: 
          { return COMMA;
          }
        case 26: break;
        case 2: 
          { return IDENTIFIER;
          }
        case 27: break;
        case 1: 
          { return BAD_CHARACTER;
          }
        case 28: break;
        case 17: 
          { return ASSIGN;
          }
        case 29: break;
        case 15: 
          { return STRING;
          }
        case 30: break;
        case 10: 
          { return SEMICOLON;
          }
        case 31: break;
        case 9: 
          { return COLON;
          }
        case 32: break;
        case 3: 
          { return NUMBER;
          }
        case 33: break;
        case 16: 
          { return VARIABLE;
          }
        case 34: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
