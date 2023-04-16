package Hackerrank;

import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceArray {
    /**
     * https://www.hackerrank.com/challenges/three-month-preparation-kit-minimum-absolute-difference-in-an-array/problem
     *
     * @param arr
     * @return
     */
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            int absDiff = Math.abs(arr.get(i) - arr.get(i + 1));
            if (absDiff < min) {
                min = absDiff;
            }
        }
        return min;

    }

}
