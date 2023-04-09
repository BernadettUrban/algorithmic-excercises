package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/find-the-median/problem
 */
public class FindTheMedian {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 2, 4, 6, 5, 3));
        System.out.println(findMedian(arr));
    }

    public static int findMedian(List<Integer> arr) {
        int median = 0;
        Collections.sort(arr);

        if (arr.size() % 2 == 0) {
            median = arr.get((arr.size() + 1) / 2 + 1);
        } else if (arr.size() % 2 != 0) {
            median = arr.get((arr.size()) / 2);
        }
        return median;

    }

}
