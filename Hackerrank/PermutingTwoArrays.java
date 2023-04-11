import java.util.*;

/**
 * https://www.hackerrank.com/challenges/three-month-preparation-kit-two-arrays/problem
 */
public class PermutingTwoArrays {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 1));
        List<Integer> B = new ArrayList<Integer>(Arrays.asList(3, 3, 3, 4));
        // expected: NO
        System.out.println(twoArrays(5, A, B));

    }

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        String ans = "YES";

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        for (int i = 0; i < A.size(); i++) {
            int currentFromA = A.get(i);

            if (currentFromA + B.get(i) < k) {
                ans = "NO";
            }

        }
        return ans;

    }

}
