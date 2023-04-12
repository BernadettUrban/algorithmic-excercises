import java.util.*;

public class SubarrayDivision2 {
    /**
     * https://www.hackerrank.com/challenges/three-month-preparation-kit-the-birthday-bar/problem
     * 
     */

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 2));
        // expected: 2
        System.out.println(birthday(arr, 3, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int windowSum = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {

            windowSum += s.get(i);
        }
        if (windowSum == d) {
            count++;
        }

        for (int i = m; i < s.size(); i++) {
            windowSum += (s.get(i) - s.get(i - m));
            if (windowSum == d) {
                count++;
            }
        }
        return count;

    }
}
