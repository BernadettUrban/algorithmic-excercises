
import java.util.*;

public class MigratoryBirds {
    /**
     * https://www.hackerrank.com/challenges/three-month-preparation-kit-migratory-birds/problem
     * 
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));
        // expected: 3
        System.out.println(migratoryBirds(arr));
    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap();
        int firstMax = 0;
        int secondMax = 0;
        int firstMaxKey = 0;
        int secondMaxKey = 0;
        int answer = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (map.containsKey(arr.get(i))) {
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            } else {
                map.put(arr.get(i), 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > firstMax) {
                secondMax = firstMax;
                firstMax = entry.getValue();
                firstMaxKey = entry.getKey();

                //
            } else if (entry.getValue() > secondMax) {
                secondMax = entry.getValue();
                secondMaxKey = entry.getKey();
            }

            if (firstMax == secondMax) {
                if (firstMaxKey < secondMaxKey) {
                    answer = firstMaxKey;
                } else if (firstMaxKey > secondMaxKey) {
                    answer = secondMaxKey;
                }
            } else {
                answer = firstMaxKey;
            }
        }

        return answer;

    }

}
