package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {
    public static void main(String[] args) {
        /**
         * https://www.hackerrank.com/challenges/three-month-preparation-kit-maximum-perimeter-triangle/problem
         * 5
         * 1 1 1 3 3
         * expected: 1 3 3
         *
         * 5
         * 3 9 2 15 3
         * exp: 2 3 3
         *
         * 50 2430 134 6373 215 1502 926 10312 351 74 572 3938
         * exp -1
         */
        List<Integer> sticks = new ArrayList<>(Arrays.asList(1, 1, 1, 3, 3));
        List<Integer> sticks2 = new ArrayList<>(Arrays.asList(50, 2430, 134, 6373, 215, 1502, 926, 10312, 351, 74, 572, 3938));
        System.out.println(maximumPerimeterTriangle(sticks2));
    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        List<Integer> answer = new ArrayList<>(3);
        List<List<Integer>> potenitalTriangles = new ArrayList<>();
        Collections.sort(sticks);

        for (int i = 0; i < sticks.size() - 2; i++) {
            if (sticks.get(i) + sticks.get(i + 1) > sticks.get(i + 2)) {
                List<Integer> potenial = new ArrayList<>(3);
                potenial.add(sticks.get(i));
                potenial.add(sticks.get(i + 1));
                potenial.add(sticks.get(i + 2));
                potenitalTriangles.add(potenial);
            }
        }

        if (potenitalTriangles.isEmpty()) {
            answer.add(-1);
        } else {
            int maxSum = 0;
            for (int i = 0; i < potenitalTriangles.size(); i++) {
                int sum = 0;
                for (int j = 0; j < potenitalTriangles.get(i).size(); j++) {
                    sum += potenitalTriangles.get(i).get(j);
                    if (sum > maxSum) {
                        if (!answer.isEmpty()) {
                            answer.removeAll(answer);
                        }
                        answer.addAll(potenitalTriangles.get(i));
                        maxSum = sum;
                    }
                }
            }
        }

        return answer;
    }
}
