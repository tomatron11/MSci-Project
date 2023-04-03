import java.io.FileNotFoundException;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.*;
import uk.ac.rhul.cs.csle.art.v3.lex.*;
import uk.ac.rhul.cs.csle.art.v3.manager.*;
import uk.ac.rhul.cs.csle.art.v3.manager.grammar.*;
import uk.ac.rhul.cs.csle.art.v3.manager.mode.*;
import uk.ac.rhul.cs.csle.art.util.*;
import uk.ac.rhul.cs.csle.art.util.text.*;
import uk.ac.rhul.cs.csle.art.v3.value.*;
import uk.ac.rhul.cs.csle.art.term.*;
import uk.ac.rhul.cs.csle.art.value.*;
/*******************************************************************************
*
* ARTGeneratedParser.java
*
*******************************************************************************/

  import java.util.HashMap;

@SuppressWarnings("fallthrough") public class ARTGeneratedParser extends ARTGLLParserHashPool {
  private String artInputString; // This is used in the MGLL generated parser instead of artlexer.artinputString
  private static boolean[] ARTSet1;
  private static boolean[] ARTSet2;
  private static boolean[] ARTSet3;
  private static boolean[] ARTSet4;
  private static boolean[] ARTSet5;
  private static boolean[] ARTSet6;
  private static boolean[] ARTSet7;
  private static boolean[] ARTSet8;
  private static boolean[] ARTSet9;
  private static boolean[] ARTSet10;
  private static boolean[] ARTSet11;
  private static boolean[] ARTSet12;
  private static boolean[] ARTSet13;
  private static boolean[] ARTSet14;
  private static boolean[] ARTSet15;
  private static boolean[] ARTSet16;
  private static boolean[] ARTSet17;
  private static boolean[] ARTSet18;
  private static boolean[] ARTSet19;
  private static boolean[] ARTSet20;
  private static boolean[] ARTSet21;
  private static boolean[] ARTSet22;
  private static boolean[] ARTSet23;
  private static boolean[] ARTSet24;
  private static boolean[] ARTSet25;
  private static boolean[] ARTSet26;
  private static boolean[] ARTSet27;
  private static boolean[] ARTSet28;
  private static boolean[] ARTSet29;
  private static boolean[] ARTSet30;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_SIMPLE_WHITESPACE = 3;
  public static final int ARTTS__DBLQUOTE = 4;
  public static final int ARTTS__LPAR = 5;
  public static final int ARTTS__RPAR = 6;
  public static final int ARTTS__COMMA = 7;
  public static final int ARTTS__PERIODprintToFile = 8;
  public static final int ARTTS__EQUAL = 9;
  public static final int ARTTS_backend = 10;
  public static final int ARTTS_object = 11;
  public static final int ARTTS_subClass = 12;
  public static final int ARTX_EPSILON = 13;
  public static final int ARTL_ART_ID = 14;
  public static final int ARTL_ART_INTEGER = 15;
  public static final int ARTL_ART_assign = 16;
  public static final int ARTL_ART_backend = 17;
  public static final int ARTL_ART_class = 18;
  public static final int ARTL_ART_deref = 19;
  public static final int ARTL_ART_object = 20;
  public static final int ARTL_ART_operand = 21;
  public static final int ARTL_ART_printToFile = 22;
  public static final int ARTL_ART_seq = 23;
  public static final int ARTL_ART_statement = 24;
  public static final int ARTL_ART_subClass = 25;
  public static final int ARTL_ART_subExpr = 26;
  public static final int ARTL_ART_thisHandle = 27;
  public static final int ARTL_ART_thisName = 28;
  public static final int ARTL_ART_ID_153 = 29;
  public static final int ARTL_ART_ID_154 = 30;
  public static final int ARTL_ART_ID_155 = 31;
  public static final int ARTL_ART_ID_156 = 32;
  public static final int ARTL_ART_INTEGER_159 = 33;
  public static final int ARTL_ART_INTEGER_160 = 34;
  public static final int ARTL_ART_INTEGER_161 = 35;
  public static final int ARTL_ART_INTEGER_162 = 36;
  public static final int ARTL_ART_assign_19 = 37;
  public static final int ARTL_ART_assign_20 = 38;
  public static final int ARTL_ART_assign_21 = 39;
  public static final int ARTL_ART_assign_22 = 40;
  public static final int ARTL_ART_assign_23 = 41;
  public static final int ARTL_ART_assign_24 = 42;
  public static final int ARTL_ART_assign_25 = 43;
  public static final int ARTL_ART_assign_26 = 44;
  public static final int ARTL_ART_backend_27 = 45;
  public static final int ARTL_ART_backend_28 = 46;
  public static final int ARTL_ART_backend_29 = 47;
  public static final int ARTL_ART_backend_30 = 48;
  public static final int ARTL_ART_backend_31 = 49;
  public static final int ARTL_ART_backend_32 = 50;
  public static final int ARTL_ART_backend_33 = 51;
  public static final int ARTL_ART_backend_34 = 52;
  public static final int ARTL_ART_backend_35 = 53;
  public static final int ARTL_ART_backend_36 = 54;
  public static final int ARTL_ART_backend_37 = 55;
  public static final int ARTL_ART_backend_38 = 56;
  public static final int ARTL_ART_backend_39 = 57;
  public static final int ARTL_ART_backend_40 = 58;
  public static final int ARTL_ART_backend_41 = 59;
  public static final int ARTL_ART_backend_42 = 60;
  public static final int ARTL_ART_backend_43 = 61;
  public static final int ARTL_ART_backend_44 = 62;
  public static final int ARTL_ART_class_69 = 63;
  public static final int ARTL_ART_class_70 = 64;
  public static final int ARTL_ART_class_71 = 65;
  public static final int ARTL_ART_class_72 = 66;
  public static final int ARTL_ART_class_73 = 67;
  public static final int ARTL_ART_class_74 = 68;
  public static final int ARTL_ART_class_75 = 69;
  public static final int ARTL_ART_class_76 = 70;
  public static final int ARTL_ART_class_77 = 71;
  public static final int ARTL_ART_class_78 = 72;
  public static final int ARTL_ART_class_79 = 73;
  public static final int ARTL_ART_class_80 = 74;
  public static final int ARTL_ART_deref_65 = 75;
  public static final int ARTL_ART_deref_66 = 76;
  public static final int ARTL_ART_deref_67 = 77;
  public static final int ARTL_ART_deref_68 = 78;
  public static final int ARTL_ART_object_101 = 79;
  public static final int ARTL_ART_object_102 = 80;
  public static final int ARTL_ART_object_103 = 81;
  public static final int ARTL_ART_object_104 = 82;
  public static final int ARTL_ART_object_105 = 83;
  public static final int ARTL_ART_object_106 = 84;
  public static final int ARTL_ART_object_107 = 85;
  public static final int ARTL_ART_object_108 = 86;
  public static final int ARTL_ART_object_109 = 87;
  public static final int ARTL_ART_object_110 = 88;
  public static final int ARTL_ART_object_111 = 89;
  public static final int ARTL_ART_object_112 = 90;
  public static final int ARTL_ART_object_113 = 91;
  public static final int ARTL_ART_object_114 = 92;
  public static final int ARTL_ART_object_115 = 93;
  public static final int ARTL_ART_object_116 = 94;
  public static final int ARTL_ART_object_117 = 95;
  public static final int ARTL_ART_object_118 = 96;
  public static final int ARTL_ART_object_119 = 97;
  public static final int ARTL_ART_object_120 = 98;
  public static final int ARTL_ART_object_121 = 99;
  public static final int ARTL_ART_object_122 = 100;
  public static final int ARTL_ART_object_123 = 101;
  public static final int ARTL_ART_object_124 = 102;
  public static final int ARTL_ART_object_125 = 103;
  public static final int ARTL_ART_object_126 = 104;
  public static final int ARTL_ART_object_127 = 105;
  public static final int ARTL_ART_object_128 = 106;
  public static final int ARTL_ART_operand_49 = 107;
  public static final int ARTL_ART_operand_50 = 108;
  public static final int ARTL_ART_operand_51 = 109;
  public static final int ARTL_ART_operand_52 = 110;
  public static final int ARTL_ART_operand_53 = 111;
  public static final int ARTL_ART_operand_54 = 112;
  public static final int ARTL_ART_operand_55 = 113;
  public static final int ARTL_ART_operand_56 = 114;
  public static final int ARTL_ART_operand_57 = 115;
  public static final int ARTL_ART_operand_58 = 116;
  public static final int ARTL_ART_operand_59 = 117;
  public static final int ARTL_ART_operand_60 = 118;
  public static final int ARTL_ART_operand_61 = 119;
  public static final int ARTL_ART_operand_62 = 120;
  public static final int ARTL_ART_operand_63 = 121;
  public static final int ARTL_ART_operand_64 = 122;
  public static final int ARTL_ART_printToFile_129 = 123;
  public static final int ARTL_ART_printToFile_130 = 124;
  public static final int ARTL_ART_printToFile_131 = 125;
  public static final int ARTL_ART_printToFile_132 = 126;
  public static final int ARTL_ART_printToFile_133 = 127;
  public static final int ARTL_ART_printToFile_134 = 128;
  public static final int ARTL_ART_seq_13 = 129;
  public static final int ARTL_ART_seq_14 = 130;
  public static final int ARTL_ART_seq_15 = 131;
  public static final int ARTL_ART_seq_16 = 132;
  public static final int ARTL_ART_seq_17 = 133;
  public static final int ARTL_ART_seq_18 = 134;
  public static final int ARTL_ART_statement_1 = 135;
  public static final int ARTL_ART_statement_2 = 136;
  public static final int ARTL_ART_statement_3 = 137;
  public static final int ARTL_ART_statement_4 = 138;
  public static final int ARTL_ART_statement_5 = 139;
  public static final int ARTL_ART_statement_6 = 140;
  public static final int ARTL_ART_statement_7 = 141;
  public static final int ARTL_ART_statement_8 = 142;
  public static final int ARTL_ART_statement_9 = 143;
  public static final int ARTL_ART_statement_10 = 144;
  public static final int ARTL_ART_statement_11 = 145;
  public static final int ARTL_ART_statement_12 = 146;
  public static final int ARTL_ART_subClass_81 = 147;
  public static final int ARTL_ART_subClass_82 = 148;
  public static final int ARTL_ART_subClass_83 = 149;
  public static final int ARTL_ART_subClass_84 = 150;
  public static final int ARTL_ART_subClass_85 = 151;
  public static final int ARTL_ART_subClass_86 = 152;
  public static final int ARTL_ART_subClass_87 = 153;
  public static final int ARTL_ART_subClass_88 = 154;
  public static final int ARTL_ART_subClass_89 = 155;
  public static final int ARTL_ART_subClass_90 = 156;
  public static final int ARTL_ART_subClass_91 = 157;
  public static final int ARTL_ART_subClass_92 = 158;
  public static final int ARTL_ART_subClass_93 = 159;
  public static final int ARTL_ART_subClass_94 = 160;
  public static final int ARTL_ART_subClass_95 = 161;
  public static final int ARTL_ART_subClass_96 = 162;
  public static final int ARTL_ART_subClass_97 = 163;
  public static final int ARTL_ART_subClass_98 = 164;
  public static final int ARTL_ART_subClass_99 = 165;
  public static final int ARTL_ART_subClass_100 = 166;
  public static final int ARTL_ART_subExpr_45 = 167;
  public static final int ARTL_ART_subExpr_46 = 168;
  public static final int ARTL_ART_subExpr_47 = 169;
  public static final int ARTL_ART_subExpr_48 = 170;
  public static final int ARTL_ART_thisHandle_141 = 171;
  public static final int ARTL_ART_thisHandle_142 = 172;
  public static final int ARTL_ART_thisHandle_143 = 173;
  public static final int ARTL_ART_thisHandle_144 = 174;
  public static final int ARTL_ART_thisHandle_147 = 175;
  public static final int ARTL_ART_thisHandle_148 = 176;
  public static final int ARTL_ART_thisHandle_149 = 177;
  public static final int ARTL_ART_thisHandle_150 = 178;
  public static final int ARTL_ART_thisName_135 = 179;
  public static final int ARTL_ART_thisName_136 = 180;
  public static final int ARTL_ART_thisName_137 = 181;
  public static final int ARTL_ART_thisName_138 = 182;
  public static final int ARTX_DESPATCH = 183;
  public static final int ARTX_DUMMY = 184;
  public static final int ARTX_LABEL_EXTENT = 185;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_ID() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ID production descriptor loads*/
      case ARTL_ART_ID: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ID_154, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_154: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_156, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_INTEGER() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal INTEGER production descriptor loads*/
      case ARTL_ART_INTEGER: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_INTEGER_160, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_160: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_162, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_assign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal assign production descriptor loads*/
      case ARTL_ART_assign: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_assign_20, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal assign: match production*/
      case ARTL_ART_assign_20: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_22, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_assign_22: 
        /* Nonterminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_24, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_26, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_assign_26: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_backend() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal backend production descriptor loads*/
      case ARTL_ART_backend: 
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_backend_28, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal backend: match production*/
      case ARTL_ART_backend_28: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_backend, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_30, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_32, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_34, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_34: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_36, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_38, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_38: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_40, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_42, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_42: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_44, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet1[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_class() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal class production descriptor loads*/
      case ARTL_ART_class: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_class_70, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_class_74, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_class_78, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal class: match production*/
      case ARTL_ART_class_70: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_class_72, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subClass; return; }
      case ARTL_ART_class_72: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal class: match production*/
      case ARTL_ART_class_74: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_class_76, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_object; return; }
      case ARTL_ART_class_76: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal class: match production*/
      case ARTL_ART_class_78: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_class_80, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printToFile; return; }
      case ARTL_ART_class_80: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_deref() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal deref production descriptor loads*/
      case ARTL_ART_deref: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_deref_66, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal deref: match production*/
      case ARTL_ART_deref_66: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_deref_68, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_deref_68: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_object() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal object production descriptor loads*/
      case ARTL_ART_object: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_object_102, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal object: match production*/
      case ARTL_ART_object_102: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_object, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_104, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_object_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_object_106: 
        /* Nonterminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_108, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_object_110, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_object_110: 
        /* Nonterminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_112, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__DBLQUOTE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_114, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_object_116, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_object_116: 
        /* Nonterminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__DBLQUOTE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_118, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_120, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__DBLQUOTE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_122, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_object_124, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_object_124: 
        /* Nonterminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__DBLQUOTE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_126, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_128, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_operand() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal operand production descriptor loads*/
      case ARTL_ART_operand: 
        if (ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_54, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_58, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_50: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_52, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_operand_52: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_54: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_56: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_58: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_60, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_62, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_operand_62: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_64, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_printToFile() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal printToFile production descriptor loads*/
      case ARTL_ART_printToFile: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printToFile_130, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal printToFile: match production*/
      case ARTL_ART_printToFile_130: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printToFile_132, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_printToFile_132: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIODprintToFile, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printToFile_134, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_seq() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal seq production descriptor loads*/
      case ARTL_ART_seq: 
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_seq_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal seq: match production*/
      case ARTL_ART_seq_14: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_16, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_16: 
        /* Nonterminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_18, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_18: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_10, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_4, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_seq; return; }
      case ARTL_ART_statement_4: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_6: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_8, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_assign; return; }
      case ARTL_ART_statement_8: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_10: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_12, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_class; return; }
      case ARTL_ART_statement_12: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subClass() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subClass production descriptor loads*/
      case ARTL_ART_subClass: 
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subClass_82, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subClass: match production*/
      case ARTL_ART_subClass_82: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_subClass, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subClass_84, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subClass_86, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_subClass_86: 
        /* Nonterminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subClass_88, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subClass_90, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_subClass_90: 
        /* Nonterminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subClass_92, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subClass_94, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subClass_94: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subClass_96, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subClass_98, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subClass_98: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subClass_100, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExpr production descriptor loads*/
      case ARTL_ART_subExpr: 
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_46, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_46: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_48, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_48: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_thisHandle() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal thisHandle production descriptor loads*/
      case ARTL_ART_thisHandle: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_thisHandle_142, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_thisHandle_148, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal thisHandle: match production*/
      case ARTL_ART_thisHandle_142: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_thisHandle_144, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_thisHandle_144: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet1[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal thisHandle: match production*/
      case ARTL_ART_thisHandle_148: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_thisHandle_150, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_thisHandle_150: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet1[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_thisName() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal thisName production descriptor loads*/
      case ARTL_ART_thisName: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_thisName_136, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal thisName: match production*/
      case ARTL_ART_thisName_136: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_thisName_138, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_thisName_138: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet1[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 29;
    artLexicaliseForV3GLL(artInputString, null);
    artLexCompleteTime = artReadClock();
    artDummySPPFNode = artFindSPPFInitial(ARTL_DUMMY, 0, 0);
    artCurrentSPPFNode = artDummySPPFNode;
    artRootGSSNode = artFindGSS(ARTL_EOS, 0, 0, 0);
    artCurrentGSSNode = artRootGSSNode;
    artCurrentRestartLabel = artStartSymbolLabel;
    artCurrentInputPairIndex = 0;
    artCurrentInputPairReference = 0;
    while (true)
      switch (artlhsL[artCurrentRestartLabel]) {
        case ARTL_ART_ID: 
          ARTPF_ART_ID();
          break;
        case ARTL_ART_INTEGER: 
          ARTPF_ART_INTEGER();
          break;
        case ARTL_ART_assign: 
          ARTPF_ART_assign();
          break;
        case ARTL_ART_backend: 
          ARTPF_ART_backend();
          break;
        case ARTL_ART_class: 
          ARTPF_ART_class();
          break;
        case ARTL_ART_deref: 
          ARTPF_ART_deref();
          break;
        case ARTL_ART_object: 
          ARTPF_ART_object();
          break;
        case ARTL_ART_operand: 
          ARTPF_ART_operand();
          break;
        case ARTL_ART_printToFile: 
          ARTPF_ART_printToFile();
          break;
        case ARTL_ART_seq: 
          ARTPF_ART_seq();
          break;
        case ARTL_ART_statement: 
          ARTPF_ART_statement();
          break;
        case ARTL_ART_subClass: 
          ARTPF_ART_subClass();
          break;
        case ARTL_ART_subExpr: 
          ARTPF_ART_subExpr();
          break;
        case ARTL_ART_thisHandle: 
          ARTPF_ART_thisHandle();
          break;
        case ARTL_ART_thisName: 
          ARTPF_ART_thisName();
          break;
        case ARTX_DESPATCH: 
          if (artNoDescriptors()) { 
            artCheckAcceptance();
            artParseCompleteTime = artReadClock();
            return;
           }
          artUnloadDescriptor();
      }
  }

  public void ARTSet1initialise() {
    ARTSet1 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet1, 0, artSetExtent, false);
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTB_ID] = true;
    ARTSet15[ARTTS_object] = true;
    ARTSet15[ARTTS_subClass] = true;
    ARTSet15[ARTL_ART_ID] = true;
    ARTSet15[ARTL_ART_object] = true;
    ARTSet15[ARTL_ART_printToFile] = true;
    ARTSet15[ARTL_ART_subClass] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTB_ID] = true;
    ARTSet7[ARTL_ART_ID] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTB_INTEGER] = true;
    ARTSet23[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTB_ID] = true;
    ARTSet21[ARTTB_INTEGER] = true;
    ARTSet21[ARTTS__LPAR] = true;
    ARTSet21[ARTL_ART_ID] = true;
    ARTSet21[ARTL_ART_INTEGER] = true;
    ARTSet21[ARTL_ART_deref] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTB_ID] = true;
    ARTSet30[ARTTB_INTEGER] = true;
    ARTSet30[ARTL_ART_ID] = true;
    ARTSet30[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTS_object] = true;
    ARTSet17[ARTL_ART_object] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTB_ID] = true;
    ARTSet22[ARTL_ART_ID] = true;
    ARTSet22[ARTL_ART_deref] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTX_EOS] = true;
    ARTSet3[ARTTB_ID] = true;
    ARTSet3[ARTTS__DBLQUOTE] = true;
    ARTSet3[ARTTS__LPAR] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__PERIODprintToFile] = true;
    ARTSet3[ARTTS__EQUAL] = true;
    ARTSet3[ARTTS_object] = true;
    ARTSet3[ARTTS_subClass] = true;
    ARTSet3[ARTL_ART_ID] = true;
    ARTSet3[ARTL_ART_assign] = true;
    ARTSet3[ARTL_ART_class] = true;
    ARTSet3[ARTL_ART_object] = true;
    ARTSet3[ARTL_ART_printToFile] = true;
    ARTSet3[ARTL_ART_seq] = true;
    ARTSet3[ARTL_ART_statement] = true;
    ARTSet3[ARTL_ART_subClass] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTS_subClass] = true;
    ARTSet16[ARTL_ART_subClass] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS__PERIODprintToFile] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTS_backend] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS__DBLQUOTE] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTB_ID] = true;
    ARTSet27[ARTTS_object] = true;
    ARTSet27[ARTTS_subClass] = true;
    ARTSet27[ARTL_ART_ID] = true;
    ARTSet27[ARTL_ART_class] = true;
    ARTSet27[ARTL_ART_object] = true;
    ARTSet27[ARTL_ART_printToFile] = true;
    ARTSet27[ARTL_ART_subClass] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTB_ID] = true;
    ARTSet26[ARTL_ART_ID] = true;
    ARTSet26[ARTL_ART_assign] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTS__LPAR] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__RPAR] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTX_EOS] = true;
    ARTSet8[ARTTB_ID] = true;
    ARTSet8[ARTTS_object] = true;
    ARTSet8[ARTTS_subClass] = true;
    ARTSet8[ARTL_ART_ID] = true;
    ARTSet8[ARTL_ART_assign] = true;
    ARTSet8[ARTL_ART_class] = true;
    ARTSet8[ARTL_ART_object] = true;
    ARTSet8[ARTL_ART_printToFile] = true;
    ARTSet8[ARTL_ART_seq] = true;
    ARTSet8[ARTL_ART_statement] = true;
    ARTSet8[ARTL_ART_subClass] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTB_ID] = true;
    ARTSet10[ARTTB_INTEGER] = true;
    ARTSet10[ARTTS__LPAR] = true;
    ARTSet10[ARTL_ART_ID] = true;
    ARTSet10[ARTL_ART_INTEGER] = true;
    ARTSet10[ARTL_ART_deref] = true;
    ARTSet10[ARTL_ART_operand] = true;
    ARTSet10[ARTL_ART_subExpr] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTS__COMMA] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTS_subClass] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTB_ID] = true;
    ARTSet25[ARTTS_object] = true;
    ARTSet25[ARTTS_subClass] = true;
    ARTSet25[ARTL_ART_ID] = true;
    ARTSet25[ARTL_ART_assign] = true;
    ARTSet25[ARTL_ART_class] = true;
    ARTSet25[ARTL_ART_object] = true;
    ARTSet25[ARTL_ART_printToFile] = true;
    ARTSet25[ARTL_ART_seq] = true;
    ARTSet25[ARTL_ART_statement] = true;
    ARTSet25[ARTL_ART_subClass] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTB_ID] = true;
    ARTSet18[ARTL_ART_ID] = true;
    ARTSet18[ARTL_ART_printToFile] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTB_ID] = true;
    ARTSet29[ARTTB_INTEGER] = true;
    ARTSet29[ARTTS__LPAR] = true;
    ARTSet29[ARTL_ART_ID] = true;
    ARTSet29[ARTL_ART_INTEGER] = true;
    ARTSet29[ARTL_ART_deref] = true;
    ARTSet29[ARTL_ART_operand] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS__EQUAL] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTX_EOS] = true;
    ARTSet6[ARTTB_ID] = true;
    ARTSet6[ARTTS__RPAR] = true;
    ARTSet6[ARTTS__COMMA] = true;
    ARTSet6[ARTTS_object] = true;
    ARTSet6[ARTTS_subClass] = true;
    ARTSet6[ARTL_ART_ID] = true;
    ARTSet6[ARTL_ART_assign] = true;
    ARTSet6[ARTL_ART_class] = true;
    ARTSet6[ARTL_ART_object] = true;
    ARTSet6[ARTL_ART_printToFile] = true;
    ARTSet6[ARTL_ART_seq] = true;
    ARTSet6[ARTL_ART_statement] = true;
    ARTSet6[ARTL_ART_subClass] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS_object] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet15initialise();
    ARTSet7initialise();
    ARTSet23initialise();
    ARTSet21initialise();
    ARTSet30initialise();
    ARTSet17initialise();
    ARTSet22initialise();
    ARTSet3initialise();
    ARTSet16initialise();
    ARTSet2initialise();
    ARTSet24initialise();
    ARTSet5initialise();
    ARTSet11initialise();
    ARTSet20initialise();
    ARTSet27initialise();
    ARTSet26initialise();
    ARTSet12initialise();
    ARTSet14initialise();
    ARTSet8initialise();
    ARTSet10initialise();
    ARTSet13initialise();
    ARTSet28initialise();
    ARTSet25initialise();
    ARTSet18initialise();
    ARTSet29initialise();
    ARTSet9initialise();
    ARTSet4initialise();
    ARTSet6initialise();
    ARTSet19initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_154] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_154] = "";
    artlhsL[ARTL_ART_ID_154] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_154] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_154] = true;
    artFolds[ARTL_ART_ID_156] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_ID_155] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_155] = "";
    artlhsL[ARTL_ART_ID_155] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_155] = true;
    artLabelInternalStrings[ARTL_ART_ID_156] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_156] = "";
    artlhsL[ARTL_ART_ID_156] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_156] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_156] = true;
    arteoR_pL[ARTL_ART_ID_156] = true;
    artPopD[ARTL_ART_ID_156] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_160] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_160] = "";
    artlhsL[ARTL_ART_INTEGER_160] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_160] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_160] = true;
    artFolds[ARTL_ART_INTEGER_162] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_INTEGER_161] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_161] = "";
    artlhsL[ARTL_ART_INTEGER_161] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_161] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_162] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_162] = "";
    artlhsL[ARTL_ART_INTEGER_162] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_162] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_162] = true;
    arteoR_pL[ARTL_ART_INTEGER_162] = true;
    artPopD[ARTL_ART_INTEGER_162] = true;
  }

  public void artTableInitialiser_ART_assign() {
    artLabelInternalStrings[ARTL_ART_assign] = "assign";
    artLabelStrings[ARTL_ART_assign] = "assign";
    artKindOfs[ARTL_ART_assign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_assign_20] = "assign ::= . ID '='  subExpr ";
    artLabelStrings[ARTL_ART_assign_20] = "";
    artlhsL[ARTL_ART_assign_20] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_20] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_22] = "assign ::= ID . '='  subExpr ";
    artLabelStrings[ARTL_ART_assign_22] = "";
    artlhsL[ARTL_ART_assign_22] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_22] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_assign_22] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_assign_22] = true;
    artFolds[ARTL_ART_assign_24] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_23] = "assign ::= ID '='  subExpr ";
    artLabelStrings[ARTL_ART_assign_23] = "";
    artlhsL[ARTL_ART_assign_23] = ARTL_ART_assign;
    artLabelInternalStrings[ARTL_ART_assign_24] = "assign ::= ID '='  . subExpr ";
    artLabelStrings[ARTL_ART_assign_24] = "";
    artlhsL[ARTL_ART_assign_24] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_24] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_26] = "assign ::= ID '='  subExpr .";
    artLabelStrings[ARTL_ART_assign_26] = "";
    artlhsL[ARTL_ART_assign_26] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_26] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_assign_26] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_assign_26] = true;
    arteoR_pL[ARTL_ART_assign_26] = true;
    artPopD[ARTL_ART_assign_26] = true;
  }

  public void artTableInitialiser_ART_backend() {
    artLabelInternalStrings[ARTL_ART_backend] = "backend";
    artLabelStrings[ARTL_ART_backend] = "backend";
    artKindOfs[ARTL_ART_backend] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_backend_28] = "backend ::= . 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_28] = "";
    artlhsL[ARTL_ART_backend_28] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_28] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_30] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_29] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_29] = "";
    artlhsL[ARTL_ART_backend_29] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_30] = "backend ::= 'backend'  . '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_30] = "";
    artlhsL[ARTL_ART_backend_30] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_30] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_backend_30] = true;
    artFolds[ARTL_ART_backend_32] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_31] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_31] = "";
    artlhsL[ARTL_ART_backend_31] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_32] = "backend ::= 'backend'  '('  . subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_32] = "";
    artlhsL[ARTL_ART_backend_32] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_32] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_34] = "backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_34] = "";
    artlhsL[ARTL_ART_backend_34] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_34] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_34] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_36] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_35] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_35] = "";
    artlhsL[ARTL_ART_backend_35] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_36] = "backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_36] = "";
    artlhsL[ARTL_ART_backend_36] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_36] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_38] = "backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_38] = "";
    artlhsL[ARTL_ART_backend_38] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_38] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_38] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_40] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_39] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_39] = "";
    artlhsL[ARTL_ART_backend_39] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_40] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_40] = "";
    artlhsL[ARTL_ART_backend_40] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_40] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_42] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_backend_42] = "";
    artlhsL[ARTL_ART_backend_42] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_42] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_42] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_backend_42] = true;
    artFolds[ARTL_ART_backend_44] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_43] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_43] = "";
    artlhsL[ARTL_ART_backend_43] = ARTL_ART_backend;
    artPopD[ARTL_ART_backend_43] = true;
    artLabelInternalStrings[ARTL_ART_backend_44] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .";
    artLabelStrings[ARTL_ART_backend_44] = "";
    artlhsL[ARTL_ART_backend_44] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_44] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_backend_44] = true;
    arteoR_pL[ARTL_ART_backend_44] = true;
    artPopD[ARTL_ART_backend_44] = true;
  }

  public void artTableInitialiser_ART_class() {
    artLabelInternalStrings[ARTL_ART_class] = "class";
    artLabelStrings[ARTL_ART_class] = "class";
    artKindOfs[ARTL_ART_class] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_class_70] = "class ::= . subClass ";
    artLabelStrings[ARTL_ART_class_70] = "";
    artlhsL[ARTL_ART_class_70] = ARTL_ART_class;
    artKindOfs[ARTL_ART_class_70] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_class_72] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_class_72] = "class ::= subClass .";
    artLabelStrings[ARTL_ART_class_72] = "";
    artlhsL[ARTL_ART_class_72] = ARTL_ART_class;
    artSlotInstanceOfs[ARTL_ART_class_72] = ARTL_ART_subClass;
    artKindOfs[ARTL_ART_class_72] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_class_72] = true;
    arteoR_pL[ARTL_ART_class_72] = true;
    artPopD[ARTL_ART_class_72] = true;
    artLabelInternalStrings[ARTL_ART_class_74] = "class ::= . object ";
    artLabelStrings[ARTL_ART_class_74] = "";
    artlhsL[ARTL_ART_class_74] = ARTL_ART_class;
    artKindOfs[ARTL_ART_class_74] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_class_76] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_class_76] = "class ::= object .";
    artLabelStrings[ARTL_ART_class_76] = "";
    artlhsL[ARTL_ART_class_76] = ARTL_ART_class;
    artSlotInstanceOfs[ARTL_ART_class_76] = ARTL_ART_object;
    artKindOfs[ARTL_ART_class_76] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_class_76] = true;
    arteoR_pL[ARTL_ART_class_76] = true;
    artPopD[ARTL_ART_class_76] = true;
    artLabelInternalStrings[ARTL_ART_class_78] = "class ::= . printToFile ";
    artLabelStrings[ARTL_ART_class_78] = "";
    artlhsL[ARTL_ART_class_78] = ARTL_ART_class;
    artKindOfs[ARTL_ART_class_78] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_class_80] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_class_80] = "class ::= printToFile .";
    artLabelStrings[ARTL_ART_class_80] = "";
    artlhsL[ARTL_ART_class_80] = ARTL_ART_class;
    artSlotInstanceOfs[ARTL_ART_class_80] = ARTL_ART_printToFile;
    artKindOfs[ARTL_ART_class_80] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_class_80] = true;
    arteoR_pL[ARTL_ART_class_80] = true;
    artPopD[ARTL_ART_class_80] = true;
  }

  public void artTableInitialiser_ART_deref() {
    artLabelInternalStrings[ARTL_ART_deref] = "deref";
    artLabelStrings[ARTL_ART_deref] = "deref";
    artKindOfs[ARTL_ART_deref] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_deref_66] = "deref ::= . ID ";
    artLabelStrings[ARTL_ART_deref_66] = "";
    artlhsL[ARTL_ART_deref_66] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_deref_66] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_deref_68] = "deref ::= ID .";
    artLabelStrings[ARTL_ART_deref_68] = "";
    artlhsL[ARTL_ART_deref_68] = ARTL_ART_deref;
    artSlotInstanceOfs[ARTL_ART_deref_68] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_deref_68] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_deref_68] = true;
    arteoR_pL[ARTL_ART_deref_68] = true;
    artPopD[ARTL_ART_deref_68] = true;
  }

  public void artTableInitialiser_ART_object() {
    artLabelInternalStrings[ARTL_ART_object] = "object";
    artLabelStrings[ARTL_ART_object] = "object";
    artKindOfs[ARTL_ART_object] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_object_102] = "object ::= . 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_102] = "";
    artlhsL[ARTL_ART_object_102] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_102] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_object_104] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_object_103] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_103] = "";
    artlhsL[ARTL_ART_object_103] = ARTL_ART_object;
    artLabelInternalStrings[ARTL_ART_object_104] = "object ::= 'object'  . ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_104] = "";
    artlhsL[ARTL_ART_object_104] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_104] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_object_104] = true;
    artLabelInternalStrings[ARTL_ART_object_106] = "object ::= 'object'  ID . '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_106] = "";
    artlhsL[ARTL_ART_object_106] = ARTL_ART_object;
    artSlotInstanceOfs[ARTL_ART_object_106] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_object_106] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_object_108] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_object_107] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_107] = "";
    artlhsL[ARTL_ART_object_107] = ARTL_ART_object;
    artLabelInternalStrings[ARTL_ART_object_108] = "object ::= 'object'  ID '='  . ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_108] = "";
    artlhsL[ARTL_ART_object_108] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_108] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_object_110] = "object ::= 'object'  ID '='  ID . '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_110] = "";
    artlhsL[ARTL_ART_object_110] = ARTL_ART_object;
    artSlotInstanceOfs[ARTL_ART_object_110] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_object_110] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_object_112] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_object_111] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_111] = "";
    artlhsL[ARTL_ART_object_111] = ARTL_ART_object;
    artLabelInternalStrings[ARTL_ART_object_112] = "object ::= 'object'  ID '='  ID '('  . '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_112] = "";
    artlhsL[ARTL_ART_object_112] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_112] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_object_114] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_object_113] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_113] = "";
    artlhsL[ARTL_ART_object_113] = ARTL_ART_object;
    artLabelInternalStrings[ARTL_ART_object_114] = "object ::= 'object'  ID '='  ID '('  '\"'  . ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_114] = "";
    artlhsL[ARTL_ART_object_114] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_114] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_object_116] = "object ::= 'object'  ID '='  ID '('  '\"'  ID . '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_116] = "";
    artlhsL[ARTL_ART_object_116] = ARTL_ART_object;
    artSlotInstanceOfs[ARTL_ART_object_116] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_object_116] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_object_118] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_object_117] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_117] = "";
    artlhsL[ARTL_ART_object_117] = ARTL_ART_object;
    artLabelInternalStrings[ARTL_ART_object_118] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  . ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_118] = "";
    artlhsL[ARTL_ART_object_118] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_118] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_object_120] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_object_119] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_119] = "";
    artlhsL[ARTL_ART_object_119] = ARTL_ART_object;
    artLabelInternalStrings[ARTL_ART_object_120] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  . '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_120] = "";
    artlhsL[ARTL_ART_object_120] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_120] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_object_122] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_object_121] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_121] = "";
    artlhsL[ARTL_ART_object_121] = ARTL_ART_object;
    artLabelInternalStrings[ARTL_ART_object_122] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  . ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_122] = "";
    artlhsL[ARTL_ART_object_122] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_122] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_object_124] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID . '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_124] = "";
    artlhsL[ARTL_ART_object_124] = ARTL_ART_object;
    artSlotInstanceOfs[ARTL_ART_object_124] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_object_124] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_object_124] = true;
    artFolds[ARTL_ART_object_126] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_object_125] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_125] = "";
    artlhsL[ARTL_ART_object_125] = ARTL_ART_object;
    artPopD[ARTL_ART_object_125] = true;
    artLabelInternalStrings[ARTL_ART_object_126] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  . ')'  ";
    artLabelStrings[ARTL_ART_object_126] = "";
    artlhsL[ARTL_ART_object_126] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_126] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_object_126] = true;
    artFolds[ARTL_ART_object_128] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_object_127] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  ";
    artLabelStrings[ARTL_ART_object_127] = "";
    artlhsL[ARTL_ART_object_127] = ARTL_ART_object;
    artPopD[ARTL_ART_object_127] = true;
    artLabelInternalStrings[ARTL_ART_object_128] = "object ::= 'object'  ID '='  ID '('  '\"'  ID '\"'  ','  '\"'  ID '\"'  ')'  .";
    artLabelStrings[ARTL_ART_object_128] = "";
    artlhsL[ARTL_ART_object_128] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_128] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_object_128] = true;
    arteoR_pL[ARTL_ART_object_128] = true;
    artPopD[ARTL_ART_object_128] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_50] = "operand ::= . deref ";
    artLabelStrings[ARTL_ART_operand_50] = "";
    artlhsL[ARTL_ART_operand_50] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_50] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_52] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_52] = "operand ::= deref .";
    artLabelStrings[ARTL_ART_operand_52] = "";
    artlhsL[ARTL_ART_operand_52] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_52] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_operand_52] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_52] = true;
    arteoR_pL[ARTL_ART_operand_52] = true;
    artPopD[ARTL_ART_operand_52] = true;
    artLabelInternalStrings[ARTL_ART_operand_54] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_54] = "";
    artlhsL[ARTL_ART_operand_54] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_54] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_56] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_56] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_56] = "";
    artlhsL[ARTL_ART_operand_56] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_56] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_56] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_56] = true;
    arteoR_pL[ARTL_ART_operand_56] = true;
    artPopD[ARTL_ART_operand_56] = true;
    artLabelInternalStrings[ARTL_ART_operand_58] = "operand ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_58] = "";
    artlhsL[ARTL_ART_operand_58] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_58] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_60] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_59] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_59] = "";
    artlhsL[ARTL_ART_operand_59] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_60] = "operand ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_60] = "";
    artlhsL[ARTL_ART_operand_60] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_60] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_60] = true;
    artFolds[ARTL_ART_operand_62] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_62] = "operand ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_operand_62] = "";
    artlhsL[ARTL_ART_operand_62] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_62] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_operand_62] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_62] = true;
    artFolds[ARTL_ART_operand_64] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_63] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_63] = "";
    artlhsL[ARTL_ART_operand_63] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_63] = true;
    artLabelInternalStrings[ARTL_ART_operand_64] = "operand ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_operand_64] = "";
    artlhsL[ARTL_ART_operand_64] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_64] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_64] = true;
    arteoR_pL[ARTL_ART_operand_64] = true;
    artPopD[ARTL_ART_operand_64] = true;
  }

  public void artTableInitialiser_ART_printToFile() {
    artLabelInternalStrings[ARTL_ART_printToFile] = "printToFile";
    artLabelStrings[ARTL_ART_printToFile] = "printToFile";
    artKindOfs[ARTL_ART_printToFile] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_printToFile_130] = "printToFile ::= . ID '.printToFile'  ";
    artLabelStrings[ARTL_ART_printToFile_130] = "";
    artlhsL[ARTL_ART_printToFile_130] = ARTL_ART_printToFile;
    artKindOfs[ARTL_ART_printToFile_130] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printToFile_132] = "printToFile ::= ID . '.printToFile'  ";
    artLabelStrings[ARTL_ART_printToFile_132] = "";
    artlhsL[ARTL_ART_printToFile_132] = ARTL_ART_printToFile;
    artSlotInstanceOfs[ARTL_ART_printToFile_132] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_printToFile_132] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printToFile_132] = true;
    artPopD[ARTL_ART_printToFile_132] = true;
    artFolds[ARTL_ART_printToFile_134] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_printToFile_133] = "printToFile ::= ID '.printToFile'  ";
    artLabelStrings[ARTL_ART_printToFile_133] = "";
    artlhsL[ARTL_ART_printToFile_133] = ARTL_ART_printToFile;
    artPopD[ARTL_ART_printToFile_133] = true;
    artLabelInternalStrings[ARTL_ART_printToFile_134] = "printToFile ::= ID '.printToFile'  .";
    artLabelStrings[ARTL_ART_printToFile_134] = "";
    artlhsL[ARTL_ART_printToFile_134] = ARTL_ART_printToFile;
    artKindOfs[ARTL_ART_printToFile_134] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printToFile_134] = true;
    arteoR_pL[ARTL_ART_printToFile_134] = true;
    artPopD[ARTL_ART_printToFile_134] = true;
  }

  public void artTableInitialiser_ART_seq() {
    artLabelInternalStrings[ARTL_ART_seq] = "seq";
    artLabelStrings[ARTL_ART_seq] = "seq";
    artKindOfs[ARTL_ART_seq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_seq_14] = "seq ::= . statement statement ";
    artLabelStrings[ARTL_ART_seq_14] = "";
    artlhsL[ARTL_ART_seq_14] = ARTL_ART_seq;
    artKindOfs[ARTL_ART_seq_14] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_seq_16] = "seq ::= statement . statement ";
    artLabelStrings[ARTL_ART_seq_16] = "";
    artlhsL[ARTL_ART_seq_16] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_16] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_16] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_seq_16] = true;
    artLabelInternalStrings[ARTL_ART_seq_18] = "seq ::= statement statement .";
    artLabelStrings[ARTL_ART_seq_18] = "";
    artlhsL[ARTL_ART_seq_18] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_18] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_18] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_seq_18] = true;
    arteoR_pL[ARTL_ART_seq_18] = true;
    artPopD[ARTL_ART_seq_18] = true;
  }

  public void artTableInitialiser_ART_statement() {
    artLabelInternalStrings[ARTL_ART_statement] = "statement";
    artLabelStrings[ARTL_ART_statement] = "statement";
    artKindOfs[ARTL_ART_statement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statement_2] = "statement ::= . seq ";
    artLabelStrings[ARTL_ART_statement_2] = "";
    artlhsL[ARTL_ART_statement_2] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_2] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_4] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_4] = "statement ::= seq .";
    artLabelStrings[ARTL_ART_statement_4] = "";
    artlhsL[ARTL_ART_statement_4] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_4] = ARTL_ART_seq;
    artKindOfs[ARTL_ART_statement_4] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_4] = true;
    arteoR_pL[ARTL_ART_statement_4] = true;
    artPopD[ARTL_ART_statement_4] = true;
    artLabelInternalStrings[ARTL_ART_statement_6] = "statement ::= . assign ";
    artLabelStrings[ARTL_ART_statement_6] = "";
    artlhsL[ARTL_ART_statement_6] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_6] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_8] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_8] = "statement ::= assign .";
    artLabelStrings[ARTL_ART_statement_8] = "";
    artlhsL[ARTL_ART_statement_8] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_8] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_statement_8] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_8] = true;
    arteoR_pL[ARTL_ART_statement_8] = true;
    artPopD[ARTL_ART_statement_8] = true;
    artLabelInternalStrings[ARTL_ART_statement_10] = "statement ::= . class ";
    artLabelStrings[ARTL_ART_statement_10] = "";
    artlhsL[ARTL_ART_statement_10] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_10] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_12] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_12] = "statement ::= class .";
    artLabelStrings[ARTL_ART_statement_12] = "";
    artlhsL[ARTL_ART_statement_12] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_12] = ARTL_ART_class;
    artKindOfs[ARTL_ART_statement_12] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_12] = true;
    arteoR_pL[ARTL_ART_statement_12] = true;
    artPopD[ARTL_ART_statement_12] = true;
  }

  public void artTableInitialiser_ART_subClass() {
    artLabelInternalStrings[ARTL_ART_subClass] = "subClass";
    artLabelStrings[ARTL_ART_subClass] = "subClass";
    artKindOfs[ARTL_ART_subClass] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subClass_82] = "subClass ::= . 'subClass'  ID '='  ID '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_82] = "";
    artlhsL[ARTL_ART_subClass_82] = ARTL_ART_subClass;
    artKindOfs[ARTL_ART_subClass_82] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subClass_84] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_subClass_83] = "subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_83] = "";
    artlhsL[ARTL_ART_subClass_83] = ARTL_ART_subClass;
    artLabelInternalStrings[ARTL_ART_subClass_84] = "subClass ::= 'subClass'  . ID '='  ID '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_84] = "";
    artlhsL[ARTL_ART_subClass_84] = ARTL_ART_subClass;
    artKindOfs[ARTL_ART_subClass_84] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subClass_84] = true;
    artLabelInternalStrings[ARTL_ART_subClass_86] = "subClass ::= 'subClass'  ID . '='  ID '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_86] = "";
    artlhsL[ARTL_ART_subClass_86] = ARTL_ART_subClass;
    artSlotInstanceOfs[ARTL_ART_subClass_86] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_subClass_86] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subClass_88] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_subClass_87] = "subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_87] = "";
    artlhsL[ARTL_ART_subClass_87] = ARTL_ART_subClass;
    artLabelInternalStrings[ARTL_ART_subClass_88] = "subClass ::= 'subClass'  ID '='  . ID '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_88] = "";
    artlhsL[ARTL_ART_subClass_88] = ARTL_ART_subClass;
    artKindOfs[ARTL_ART_subClass_88] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subClass_90] = "subClass ::= 'subClass'  ID '='  ID . '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_90] = "";
    artlhsL[ARTL_ART_subClass_90] = ARTL_ART_subClass;
    artSlotInstanceOfs[ARTL_ART_subClass_90] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_subClass_90] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subClass_92] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_subClass_91] = "subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_91] = "";
    artlhsL[ARTL_ART_subClass_91] = ARTL_ART_subClass;
    artLabelInternalStrings[ARTL_ART_subClass_92] = "subClass ::= 'subClass'  ID '='  ID '('  . subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_92] = "";
    artlhsL[ARTL_ART_subClass_92] = ARTL_ART_subClass;
    artKindOfs[ARTL_ART_subClass_92] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subClass_94] = "subClass ::= 'subClass'  ID '='  ID '('  subExpr . ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_94] = "";
    artlhsL[ARTL_ART_subClass_94] = ARTL_ART_subClass;
    artSlotInstanceOfs[ARTL_ART_subClass_94] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subClass_94] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subClass_96] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_subClass_95] = "subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_95] = "";
    artlhsL[ARTL_ART_subClass_95] = ARTL_ART_subClass;
    artLabelInternalStrings[ARTL_ART_subClass_96] = "subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_96] = "";
    artlhsL[ARTL_ART_subClass_96] = ARTL_ART_subClass;
    artKindOfs[ARTL_ART_subClass_96] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subClass_98] = "subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_subClass_98] = "";
    artlhsL[ARTL_ART_subClass_98] = ARTL_ART_subClass;
    artSlotInstanceOfs[ARTL_ART_subClass_98] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subClass_98] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_subClass_98] = true;
    artFolds[ARTL_ART_subClass_100] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_subClass_99] = "subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subClass_99] = "";
    artlhsL[ARTL_ART_subClass_99] = ARTL_ART_subClass;
    artPopD[ARTL_ART_subClass_99] = true;
    artLabelInternalStrings[ARTL_ART_subClass_100] = "subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  subExpr ')'  .";
    artLabelStrings[ARTL_ART_subClass_100] = "";
    artlhsL[ARTL_ART_subClass_100] = ARTL_ART_subClass;
    artKindOfs[ARTL_ART_subClass_100] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subClass_100] = true;
    arteoR_pL[ARTL_ART_subClass_100] = true;
    artPopD[ARTL_ART_subClass_100] = true;
  }

  public void artTableInitialiser_ART_subExpr() {
    artLabelInternalStrings[ARTL_ART_subExpr] = "subExpr";
    artLabelStrings[ARTL_ART_subExpr] = "subExpr";
    artKindOfs[ARTL_ART_subExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExpr_46] = "subExpr ::= . operand ";
    artLabelStrings[ARTL_ART_subExpr_46] = "";
    artlhsL[ARTL_ART_subExpr_46] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_46] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_48] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_48] = "subExpr ::= operand .";
    artLabelStrings[ARTL_ART_subExpr_48] = "";
    artlhsL[ARTL_ART_subExpr_48] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_48] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_48] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_48] = true;
    arteoR_pL[ARTL_ART_subExpr_48] = true;
    artPopD[ARTL_ART_subExpr_48] = true;
  }

  public void artTableInitialiser_ART_thisHandle() {
    artLabelInternalStrings[ARTL_ART_thisHandle] = "thisHandle";
    artLabelStrings[ARTL_ART_thisHandle] = "thisHandle";
    artKindOfs[ARTL_ART_thisHandle] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_thisHandle_142] = "thisHandle ::= . ID ";
    artLabelStrings[ARTL_ART_thisHandle_142] = "";
    artlhsL[ARTL_ART_thisHandle_142] = ARTL_ART_thisHandle;
    artKindOfs[ARTL_ART_thisHandle_142] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_thisHandle_144] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_thisHandle_144] = "thisHandle ::= ID .";
    artLabelStrings[ARTL_ART_thisHandle_144] = "";
    artlhsL[ARTL_ART_thisHandle_144] = ARTL_ART_thisHandle;
    artSlotInstanceOfs[ARTL_ART_thisHandle_144] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_thisHandle_144] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_thisHandle_144] = true;
    arteoR_pL[ARTL_ART_thisHandle_144] = true;
    artPopD[ARTL_ART_thisHandle_144] = true;
    artLabelInternalStrings[ARTL_ART_thisHandle_148] = "thisHandle ::= . INTEGER ";
    artLabelStrings[ARTL_ART_thisHandle_148] = "";
    artlhsL[ARTL_ART_thisHandle_148] = ARTL_ART_thisHandle;
    artKindOfs[ARTL_ART_thisHandle_148] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_thisHandle_150] = "thisHandle ::= INTEGER .";
    artLabelStrings[ARTL_ART_thisHandle_150] = "";
    artlhsL[ARTL_ART_thisHandle_150] = ARTL_ART_thisHandle;
    artSlotInstanceOfs[ARTL_ART_thisHandle_150] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_thisHandle_150] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_thisHandle_150] = true;
    arteoR_pL[ARTL_ART_thisHandle_150] = true;
    artPopD[ARTL_ART_thisHandle_150] = true;
  }

  public void artTableInitialiser_ART_thisName() {
    artLabelInternalStrings[ARTL_ART_thisName] = "thisName";
    artLabelStrings[ARTL_ART_thisName] = "thisName";
    artKindOfs[ARTL_ART_thisName] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_thisName_136] = "thisName ::= . ID ";
    artLabelStrings[ARTL_ART_thisName_136] = "";
    artlhsL[ARTL_ART_thisName_136] = ARTL_ART_thisName;
    artKindOfs[ARTL_ART_thisName_136] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_thisName_138] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_thisName_138] = "thisName ::= ID .";
    artLabelStrings[ARTL_ART_thisName_138] = "";
    artlhsL[ARTL_ART_thisName_138] = ARTL_ART_thisName;
    artSlotInstanceOfs[ARTL_ART_thisName_138] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_thisName_138] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_thisName_138] = true;
    arteoR_pL[ARTL_ART_thisName_138] = true;
    artPopD[ARTL_ART_thisName_138] = true;
  }

  public void artTableInitialise() {
    artLabelInternalStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelInternalStrings[ARTL_EOS] = "ART$";
    artLabelStrings[ARTL_EOS] = " EOS $";
    artLabelInternalStrings[ARTX_DESPATCH] = "ARTX_DESPATCH";
    artLabelStrings[ARTX_DESPATCH] = " DESPATCH";
    artLabelInternalStrings[ARTL_DUMMY] = "ARTL_DUMMY";
    artLabelStrings[ARTL_DUMMY] = " DUMMY";
    artLabelInternalStrings[ARTX_LABEL_EXTENT] = "!!ILLEGAL!!";
    artLabelStrings[ARTX_LABEL_EXTENT] = " ILLEGAL";
    artLabelStrings[ARTL_EPSILON] = "#";
    artLabelInternalStrings[ARTL_EPSILON] = "#";

    artTerminalRequiresWhiteSpace = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalRequiresWhiteSpace, 0, ARTL_EPSILON, false);

    artTerminalCaseInsensitive = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalCaseInsensitive, 0, ARTL_EPSILON, false);

    artlhsL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artlhsL, 0, ARTX_LABEL_EXTENT);
    artlhsL[ARTX_DESPATCH] = ARTX_DESPATCH;

    artKindOfs = new int[ARTX_LABEL_EXTENT + 1];
    artKindOfs[ARTL_EOS] = ARTK_EOS;
    artKindOfs[ARTL_EPSILON] = ARTK_EPSILON;

    artHigher = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artLonger = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artShorter = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artPreSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPreSlots, 0, ARTX_LABEL_EXTENT);

    artPostSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPostSlots, 0, ARTX_LABEL_EXTENT);

    artInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artSlotInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artSlotInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artUserNameOfs = new int[ARTX_LABEL_EXTENT + 1];

    artGathers = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artGathers, 0, ARTX_LABEL_EXTENT);

    artFolds = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artFolds, 0, ARTX_LABEL_EXTENT, 0);

    artpL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artpL, 0, ARTX_LABEL_EXTENT);

    artaL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artaL, 0, ARTX_LABEL_EXTENT);

    artcolonL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artcolonL, 0, ARTX_LABEL_EXTENT);

    arteoOPL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoOPL, 0, ARTX_LABEL_EXTENT, false);

    artfiRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiRL, 0, ARTX_LABEL_EXTENT, false);

    artfiPCL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiPCL, 0, ARTX_LABEL_EXTENT, false);

    arteoRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoRL, 0, ARTX_LABEL_EXTENT, false);

    arteoR_pL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoR_pL, 0, ARTX_LABEL_EXTENT, false);

    artPopD = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artPopD, 0, ARTX_LABEL_EXTENT, false);

    artLabelStrings[ARTTB_ID] = "ID";
    artLabelInternalStrings[ARTTB_ID] = "&ID";
    artKindOfs[ARTTB_ID] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_ID] = true;
    artLabelStrings[ARTTB_INTEGER] = "INTEGER";
    artLabelInternalStrings[ARTTB_INTEGER] = "&INTEGER";
    artKindOfs[ARTTB_INTEGER] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_INTEGER] = true;
    artLabelStrings[ARTTB_SIMPLE_WHITESPACE] = "SIMPLE_WHITESPACE";
    artLabelInternalStrings[ARTTB_SIMPLE_WHITESPACE] = "&SIMPLE_WHITESPACE";
    artKindOfs[ARTTB_SIMPLE_WHITESPACE] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_SIMPLE_WHITESPACE] = true;
    artLabelStrings[ARTTS__DBLQUOTE] = "\"";
    artLabelInternalStrings[ARTTS__DBLQUOTE] = "'\"'";
    artKindOfs[ARTTS__DBLQUOTE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__DBLQUOTE] = true;
    artLabelStrings[ARTTS__LPAR] = "(";
    artLabelInternalStrings[ARTTS__LPAR] = "'('";
    artKindOfs[ARTTS__LPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LPAR] = true;
    artLabelStrings[ARTTS__RPAR] = ")";
    artLabelInternalStrings[ARTTS__RPAR] = "')'";
    artKindOfs[ARTTS__RPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RPAR] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__PERIODprintToFile] = ".printToFile";
    artLabelInternalStrings[ARTTS__PERIODprintToFile] = "'.printToFile'";
    artKindOfs[ARTTS__PERIODprintToFile] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIODprintToFile] = true;
    artLabelStrings[ARTTS__EQUAL] = "=";
    artLabelInternalStrings[ARTTS__EQUAL] = "'='";
    artKindOfs[ARTTS__EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__EQUAL] = true;
    artLabelStrings[ARTTS_backend] = "backend";
    artLabelInternalStrings[ARTTS_backend] = "'backend'";
    artKindOfs[ARTTS_backend] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_backend] = true;
    artLabelStrings[ARTTS_object] = "object";
    artLabelInternalStrings[ARTTS_object] = "'object'";
    artKindOfs[ARTTS_object] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_object] = true;
    artLabelStrings[ARTTS_subClass] = "subClass";
    artLabelInternalStrings[ARTTS_subClass] = "'subClass'";
    artKindOfs[ARTTS_subClass] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_subClass] = true;
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_assign();
    artTableInitialiser_ART_backend();
    artTableInitialiser_ART_class();
    artTableInitialiser_ART_deref();
    artTableInitialiser_ART_object();
    artTableInitialiser_ART_operand();
    artTableInitialiser_ART_printToFile();
    artTableInitialiser_ART_seq();
    artTableInitialiser_ART_statement();
    artTableInitialiser_ART_subClass();
    artTableInitialiser_ART_subExpr();
    artTableInitialiser_ART_thisHandle();
    artTableInitialiser_ART_thisName();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS__DBLQUOTE;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 29;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_statement;
    artBuildDirectives = "ARTDirectives [verbosityLevel=0, statistics=false, trace=false, inputs=[], inputFilenames=[], lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;

  HashMap<String, Integer> variables = new HashMap<String, Integer>();
  int handle = 0;

  public static class ARTAT_ART_ID extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_INTEGER extends ARTGLLAttributeBlock {
    public int v;
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
      return ret + " ";
}
  }

  public static class ARTAT_ART_thisHandle extends ARTGLLAttributeBlock {
    public String v;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle INTEGER1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_thisName extends ARTGLLAttributeBlock {
    public String v;
    ARTGLLRDTHandle ID1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public void ARTRD_ID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*ID ::= &ID  .*/
      case ARTL_ART_ID_156: 
                ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID);
                if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
         ID.lexeme = artLexeme(ID.leftExtent, ID.rightExtent); 
  ID.v = artLexemeAsID(ID.leftExtent, ID.rightExtent); 
        break;
        default:
          throw new ARTException("ARTRD_ID: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_INTEGER(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*INTEGER ::= &INTEGER  .*/
    case ARTL_ART_INTEGER_162: 
            ARTRD_INTEGER(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER);
            if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       INTEGER.lexeme = artLexeme(INTEGER.leftExtent, INTEGER.rightExtent); 
  INTEGER.v = artLexemeAsInteger(INTEGER.leftExtent, INTEGER.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_INTEGER: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_assign(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*assign ::= ID '='  . subExpr */
    case ARTL_ART_assign_24: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
                        break;
    /*assign ::= ID '='  subExpr .*/
    case ARTL_ART_assign_26: 
      ID1 = new ARTAT_ART_ID();
            ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_assign: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_backend(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*backend ::= 'backend'  '('  . subExpr ','  subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_32: 
                              break;
    /*backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_34: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_36: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  */
    case ARTL_ART_backend_38: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  */
    case ARTL_ART_backend_40: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  */
    case ARTL_ART_backend_42: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .*/
    case ARTL_ART_backend_44: 
            ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_backend: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_class(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*class ::= subClass .*/
    case ARTL_ART_class_72: 
            ARTRD_class(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subClass(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*class ::= object .*/
    case ARTL_ART_class_76: 
            ARTRD_class(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_object(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null, null);
            break;
    /*class ::= printToFile .*/
    case ARTL_ART_class_80: 
            ARTRD_class(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printToFile(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_class: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_deref(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*deref ::= ID .*/
    case ARTL_ART_deref_68: 
      ID1 = new ARTAT_ART_ID();
            ARTRD_deref(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
        default:
          throw new ARTException("ARTRD_deref: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_object(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1, ARTAT_ART_ID ID2, ARTAT_ART_ID ID3, ARTAT_ART_ID ID4) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*object ::= 'object'  ID . '='  ID '('  '"'  ID '"'  ','  '"'  ID '"'  ')'  */
    case ARTL_ART_object_106: 
                  ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*object ::= 'object'  ID '='  . ID '('  '"'  ID '"'  ','  '"'  ID '"'  ')'  */
    case ARTL_ART_object_108: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
                  break;
    /*object ::= 'object'  ID '='  ID . '('  '"'  ID '"'  ','  '"'  ID '"'  ')'  */
    case ARTL_ART_object_110: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
      ID2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID2));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID2);
            break;
    /*object ::= 'object'  ID '='  ID '('  . '"'  ID '"'  ','  '"'  ID '"'  ')'  */
    case ARTL_ART_object_112: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
                  break;
    /*object ::= 'object'  ID '='  ID '('  '"'  . ID '"'  ','  '"'  ID '"'  ')'  */
    case ARTL_ART_object_114: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
                  break;
    /*object ::= 'object'  ID '='  ID '('  '"'  ID . '"'  ','  '"'  ID '"'  ')'  */
    case ARTL_ART_object_116: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
      ID3.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID3.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID3));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID3);
            break;
    /*object ::= 'object'  ID '='  ID '('  '"'  ID '"'  . ','  '"'  ID '"'  ')'  */
    case ARTL_ART_object_118: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
                  break;
    /*object ::= 'object'  ID '='  ID '('  '"'  ID '"'  ','  . '"'  ID '"'  ')'  */
    case ARTL_ART_object_120: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
                  break;
    /*object ::= 'object'  ID '='  ID '('  '"'  ID '"'  ','  '"'  . ID '"'  ')'  */
    case ARTL_ART_object_122: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
                  break;
    /*object ::= 'object'  ID '='  ID '('  '"'  ID '"'  ','  '"'  ID . '"'  ')'  */
    case ARTL_ART_object_124: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
      ID4.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID4.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID4));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID4);
            break;
    /*object ::= 'object'  ID '='  ID '('  '"'  ID '"'  ','  '"'  ID '"'  . ')'  */
    case ARTL_ART_object_126: 
      ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
                  break;
    /*object ::= 'object'  ID '='  ID '('  '"'  ID '"'  ','  '"'  ID '"'  ')'  .*/
    case ARTL_ART_object_128: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      ID3 = new ARTAT_ART_ID();
      ID4 = new ARTAT_ART_ID();
            ARTRD_object(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2, ID3, ID4);
                  break;
        default:
          throw new ARTException("ARTRD_object: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_operand(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*operand ::= deref .*/
    case ARTL_ART_operand_52: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_56: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*operand ::= '('  subExpr . ')'  */
    case ARTL_ART_operand_62: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*operand ::= '('  subExpr ')'  .*/
    case ARTL_ART_operand_64: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1);
                  break;
        default:
          throw new ARTException("ARTRD_operand: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_printToFile(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*printToFile ::= ID '.printToFile'  .*/
    case ARTL_ART_printToFile_134: 
      ID1 = new ARTAT_ART_ID();
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
                        break;
        default:
          throw new ARTException("ARTRD_printToFile: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_seq(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*seq ::= statement statement .*/
    case ARTL_ART_seq_18: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_seq: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statement ::= seq .*/
    case ARTL_ART_statement_4: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_seq(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= assign .*/
    case ARTL_ART_statement_8: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_assign(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= class .*/
    case ARTL_ART_statement_12: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_class(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_statement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subClass(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1, ARTAT_ART_ID ID2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subClass ::= 'subClass'  ID . '='  ID '('  subExpr ','  subExpr ')'  */
    case ARTL_ART_subClass_86: 
                  ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*subClass ::= 'subClass'  ID '='  . ID '('  subExpr ','  subExpr ')'  */
    case ARTL_ART_subClass_88: 
      ARTRD_subClass(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2);
                  break;
    /*subClass ::= 'subClass'  ID '='  ID . '('  subExpr ','  subExpr ')'  */
    case ARTL_ART_subClass_90: 
      ARTRD_subClass(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2);
      ID2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID2));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID2);
            break;
    /*subClass ::= 'subClass'  ID '='  ID '('  . subExpr ','  subExpr ')'  */
    case ARTL_ART_subClass_92: 
      ARTRD_subClass(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2);
                  break;
    /*subClass ::= 'subClass'  ID '='  ID '('  subExpr . ','  subExpr ')'  */
    case ARTL_ART_subClass_94: 
      ARTRD_subClass(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  . subExpr ')'  */
    case ARTL_ART_subClass_96: 
      ARTRD_subClass(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2);
                  break;
    /*subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  subExpr . ')'  */
    case ARTL_ART_subClass_98: 
      ARTRD_subClass(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subClass ::= 'subClass'  ID '='  ID '('  subExpr ','  subExpr ')'  .*/
    case ARTL_ART_subClass_100: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
            ARTRD_subClass(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, ID2);
                  break;
        default:
          throw new ARTException("ARTRD_subClass: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subExpr ::= operand .*/
    case ARTL_ART_subExpr_48: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_subExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_thisHandle(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_thisHandle thisHandle, ARTAT_ART_ID ID1, ARTAT_ART_INTEGER INTEGER1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*thisHandle ::= ID .*/
    case ARTL_ART_thisHandle_144: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
            ARTRD_thisHandle(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, thisHandle, ID1, INTEGER1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
       thisHandle.v = variables.get(ID1.v).toString(); 
      break;
    /*thisHandle ::= INTEGER .*/
    case ARTL_ART_thisHandle_150: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
            ARTRD_thisHandle(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, thisHandle, ID1, INTEGER1);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
       thisHandle.v = String.valueOf(INTEGER1.v); 
      break;
        default:
          throw new ARTException("ARTRD_thisHandle: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_thisName(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_thisName thisName, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*thisName ::= ID .*/
    case ARTL_ART_thisName_138: 
      ID1 = new ARTAT_ART_ID();
            ARTRD_thisName(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, thisName, ID1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
       variables.put(ID1.v, handle); handle++; 
      break;
        default:
          throw new ARTException("ARTRD_thisName: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_ID:  ARTRD_ID(artElement.element, artParent, artWriteable, (ARTAT_ART_ID) artAttributes); break;
    case ARTL_ART_INTEGER:  ARTRD_INTEGER(artElement.element, artParent, artWriteable, (ARTAT_ART_INTEGER) artAttributes); break;
    case ARTL_ART_assign: ARTRD_assign(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_backend: ARTRD_backend(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_class: ARTRD_class(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_deref: ARTRD_deref(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_object: ARTRD_object(artElement.element, artParent, artWriteable, null, null, null, null); break;
    case ARTL_ART_operand: ARTRD_operand(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_printToFile: ARTRD_printToFile(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_seq: ARTRD_seq(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_statement: ARTRD_statement(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_subClass: ARTRD_subClass(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_subExpr: ARTRD_subExpr(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_thisHandle:  ARTRD_thisHandle(artElement.element, artParent, artWriteable, (ARTAT_ART_thisHandle) artAttributes, null, null); break;
    case ARTL_ART_thisName:  ARTRD_thisName(artElement.element, artParent, artWriteable, (ARTAT_ART_thisName) artAttributes, null); break;
  }
}

public ARTGLLRDT artEvaluator() throws ARTException {
  artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, artInputString);
  ARTGLLRDTVertex artNewParent = new ARTGLLRDTVertex(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artRootSPPFNode),artSPPFNodeRightExtent(artRootSPPFNode),artSPPFNodeLabel(artRootSPPFNode), null));
  artRDT.setRoot(artNewParent);
  boolean artNewWriteable = true;
  artEvaluate(new ARTGLLRDTHandle(artRootSPPFNode), null, artNewParent, artNewWriteable);
  artAttributeEvaluateCompleteTime = artReadClock();
  return artRDT;
}
};
