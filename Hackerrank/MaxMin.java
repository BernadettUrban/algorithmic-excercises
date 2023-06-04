package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
                4504,
                1520,
                5857,
                4094,
                4157,
                3902,
                822,
                6643,
                2422,
                7288,
                8245,
                9948,
                2822,
                1784,
                7802,
                3142,
                9739,
                5629,
                5413,
                7232);
        //Expected Output
        //1335, k = 5
        System.out.println(maxMin(5, list));

    }
    public static int maxMin(int k, List<Integer> arr) {

        int min=1000000000;

        Collections.sort(arr);
        for(int i=0;i<arr.size()-k+1;i++){
            min=Math.min(min,arr.get(i+k-1)-arr.get(i));
        }
        return min;
    }
}
