package Hackerrank;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/three-month-preparation-kit-diagonal-difference/problem
 */
public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {

        int sumDiagonal = 0;
        int sumAntiDiagonal = 0;
        int n = arr.size();
        for (int j = 0; j < arr.size(); j++) {
            for (int k = 0; k < arr.get(j).size(); k++) {

                if (j == k) {
                    sumDiagonal += arr.get(j).get(k);
                }
                if (j + k == n - 1) {
                    sumAntiDiagonal += arr.get(j).get(k);
                }
            }
        }
        return Math.abs(sumDiagonal - sumAntiDiagonal);
    }
}
