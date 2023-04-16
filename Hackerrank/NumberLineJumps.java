package Hackerrank;

/**
 * https://www.hackerrank.com/challenges/three-month-preparation-kit-kangaroo/problem
 */
public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String ans = "NO";
        for (int i = 1; i < 10000; i++) {
            if (x1 + i * v1 == x2 + i * v2) {
                ans = "YES";
                break;
            }
        }
        return ans;
    }
}
