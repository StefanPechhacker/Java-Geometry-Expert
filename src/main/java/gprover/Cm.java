/**
 * Created by IntelliJ IDEA.
 * User: Ye
 * Date: 2006-2-16
 * Time: 13:37:35
 * To change this template use File | Settings | File Templates.
 */
package gprover;



final public class Cm {

    static public boolean isWindows() {
        return System.getProperty("os.name").startsWith("Windows");
    }

    final public static String s2070 = "(hyp)";

    final public static String s2072 = "The Machine Proof";

    final public static String s2077 = isWindows() ? "_|_" : " ⊥ ";
    final public static String s2078 = isWindows() ? "<)" : "∠";
    final public static String s2079 = isWindows() ? "||" : " ∥ ";
    final public static String s2080 = isWindows() ? "<|" : "∆";

    final public static String sangle = isWindows() ? "<)" : "∠";
    final public static String s2082 = " = ";
    final public static String s2083 = isWindows() ? "~" : " ∽ ";
    final public static String s2084 = isWindows() ? " intersect " : " ∩ ";


    final public static String s2705 = "midpoints\r\n";

    final public static String s2707 = "lines";

    final public static String s2709 = "plines";
    final public static String s2713 = "circles in the database.";

    final public static String s2715 = "perp[";
    final public static String s2716 = "circle";

    final public static String s2720 = "similar triangles";

    final public static String s2722 = "congruent triangles";

    final public static String s2727 = "       because ";
    final public static String s2728 = " and ";
    final public static String s2729 = "midp";

    final public static String s2732 = "cyclic";

    final public static String s2760 = "are collinear";

    final public static String PC_COLL = "COLLINEAR";
    final public static String PC_PARA = "PARALLEL";
    final public static String PC_PERP = "PERPENDICULAR";
    final public static String PC_CONG = "EQDISTANCE";
    final public static String PC_ACONG = "EQANGLE";
    final public static String PC_CYCLIC = "COCIRCLE";

    final public static String PC_STRI = "SIM_TRIANGLE";
    final public static String PC_CTRI = "CON_TRIANGLE";
    final public static String PC_MIDP = "MIDPOINT";

    final public static String PC_TRI = "tri";

    //  predicate.

    final public static String P_POINT = "POINT";

    final public static String P_SHOWD = "To Prove: ";

    final public static String DR_WPT = "WPT";

    ////////////////
    final public static String s2810 = "\r\n\r\nOnly full-angles are allowd in this case";
    final public static String s2811 = "\r\nConclusion cannot be represented with full-angles.\r\n";
    final public static String s2812 = "\r\nCannot solve this problem with full-angles.\r\n";

    /// -----------------------------------------
    final public static String s1993 = "Index";

    //-------------area--------------------------------------
    final public static String s2300 = "\r\n\r\nThe statement is true.\r\n\r\n";
    final public static String s2301 = "\r\n\\rnThe statement is false.\r\n\r\n";
    final public static String s2302 = "Conclusion not fund:";
    final public static String s2303 = "A new point";
    final public static String s2304 = "is introduced by construction\r\n";
    final public static String s2305 = "The new conclusion is: ";
    final public static String s2306 = "EQ_RATIO";
    final public static String s2307 = "Construction for point";
    final public static String s2308 = "is not allowd in area method.\r\n";

    final public static String s2310 = "In the area method, the lines and circles must meet in one point";
    final public static String s2311 = "construction INCENTER is not allowed in the prover.\r\n";
    final public static String s2312 = "Please use construction:\r\n construct a vertex from the incenter and two other vertex.\r\n";
    final public static String s2313 = "In the area method, PTRIANGLE can be used only when the conclusion is about vectors.";
    final public static String s2314 = "\r\n Proving failed. Statement is not proved.";

    final public static String s2220 = "\r\nThere exists no proof.\r\n";
    final public static String s2221 = "The conclusion is: ";
    final public static String s2222 = "This is equivalent to: ";
    final public static String s2223 = "Eliminating the common factors: ";

    final public static String s2225 = "\r\nThe geometric quantities used in the proof.\r\n";
    final public static String s2226 = "Eliminate variables";


    final public static String sfe_exp_error = "The conclusion can not be translated to full-angle expression.";

    final public static String getFError(int n) {
        if (n == 1)
            return sfe_exp_error;
        return "Failed to prove this theorem with Full Angle Method\n";
    }

    final public static boolean DEBUG = false;

    final public static void print(String s) {
        if (DEBUG)
            System.out.println(s);
    }


}
