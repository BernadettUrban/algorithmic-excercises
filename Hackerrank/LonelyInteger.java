
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/three-month-preparation-kit-lonely-integer/problem
 */

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(0, 0, 1, 2, 1);
        System.out.println(lonelyinteger(a));

    }

    public static int lonelyinteger(List<Integer> a) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                map.put(a.get(i), map.get(a.get(i)) + 1);
            } else {
                map.put(a.get(i), 1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    ans = entry.getKey();
                }
            }
        }
        return ans;

    }
}
