import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        /**
         * Given five positive integers, find the minimum and maximum values that can be
         * calculated by summing exactly four of the five integers. Then print the
         * respective minimum and maximum values as a single line of two space-separated
         * long integers.
         * Sample Input
         * 
         * 1 2 3 4 5
         * Sample Output
         * 
         * 10 14
         */
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        int min = sum - arr.get(0);
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (sum - arr.get(i) > max) {
                max = sum - arr.get(i);
            }
            if (sum - arr.get(i) < min) {
                min = sum - arr.get(i);
            }
        }
        System.out.println(min + " " + max);

    }

}
