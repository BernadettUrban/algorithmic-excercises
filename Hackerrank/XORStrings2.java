package Hackerrank;

public class XORStrings2 {
    public static String stringsXOR(String s, String t) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }
        return res;
    }
}
