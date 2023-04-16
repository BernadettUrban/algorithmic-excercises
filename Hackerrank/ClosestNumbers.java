package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    /**
     * https://www.hackerrank.com/challenges/three-month-preparation-kit-closest-numbers/problem
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(
                -5935536, -4857144, 8762611, -3710156,
                -62196, 5726532, 3880783, 8228893, 4557632,
                8243459, 8058689, -2004515, -2532128, -2809277,
                6230123, -1534444, 7594023, 8030804, -808395,
                3895414, -1042916, -6349277, 8056932, 6449041,
                -5776338, -5663713, -2118668, -7889996, -7194680,
                4072724, 5817742, 52723, -9978630, -4565272, -905845,
                2413011, 6580118, 7342503, 9920829, 3264328, -2498614,
                -7173602, 9550646, -3508831, 6660598, 7160307, -1454798,
                -7810912, -6934054, 5412837, -3256366, 5648256, 7539528,
                8948739, -9432879, 540367, -683895, -4837582, 404577, -7427248,
                7493712, -7517462, 59838, 7493355, 2624635, 7528881, 4482783, 5371130,
                -7137887, 5776578, -4043963, -4861937, -5490722, -3065192,
                -1330264, -5049584, 8815653, -2956679, -3663308,
                3294818, -3792431, -6884969, -6327570, -3304021,
                -7320937, -2754952, 5645257, 1616120, 2854718, 3721762, 9874605, 5629627,
                5448934, 6511446, -4557691, 4035783, -4467467, 2150627, 6427050, 3916593
        ));
        System.out.println(closestNumbers(arr));
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> answer = new ArrayList();
        Collections.sort(arr);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - 1; i++) {
            int absDifference = Math.abs(arr.get(i + 1) - arr.get(i));
            if (absDifference < min) {
                min = absDifference;
                answer.removeAll(answer);
                answer.add(arr.get(i));
                answer.add(arr.get(i + 1));
            } else if (absDifference == min) {
                answer.add(arr.get(i));
                answer.add(arr.get(i + 1));
            }
        }
        return answer;
    }

}
