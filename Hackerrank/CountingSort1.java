package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {

    /*
     *https://www.hackerrank.com/challenges/three-month-preparation-kit-countingsort1/problem
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> answer = new ArrayList();

        for (int i = 0; i < 100; i++) {
            answer.add(0);
        }
        for (int i = 0; i < arr.size(); i++) {
            answer.set(arr.get(i), answer.get(arr.get(i)) + 1);
        }
        return answer;
    }


}
