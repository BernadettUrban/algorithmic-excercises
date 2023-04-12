
import java.util.*;

public class SalesByMatch {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3));
        // expected: 4
        System.out.println(sockMerchant(10, arr));
    }

    public static int sockMerchant(int n, List<Integer> ar) {

        Integer sum = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < ar.size(); i++) {
            if (map.containsKey(ar.get(i))) {
                map.put(ar.get(i), map.get(ar.get(i)) + 1);
            } else {
                map.put(ar.get(i), 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() % 2 != 0) {
                sum += entry.getValue() - 1;
            } else {
                sum += entry.getValue();
            }
        }

        return sum / 2;

    }

}
