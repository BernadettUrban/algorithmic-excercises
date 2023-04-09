package Hackerrank;

/**
 * https://www.hackerrank.com/challenges/three-month-preparation-kit-flipping-bits/problem
 * https://stackoverflow.com/questions/28405143/hackerrank-flippingbits-wrong-output
 */
public class FlippingBits {
    public static long flippingBits(long n) {
        long answer = ~n & 0xffffffffL;

        return answer;

    }
}
