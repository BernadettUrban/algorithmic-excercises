import java.util.*;

public class PickingNumbers {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList(Arrays.asList(1, 2, 2, 3, 1, 2));
        System.out.println(pickingNumbers(a));
        
    }

    public static int pickingNumbers(List<Integer> a) {
        int max = 0;
       
        List<Integer> subarray = new ArrayList<Integer>();

        for (int i = 0; i < a.size(); i++) {
            subarray = findValidSubarray(a, a.get(i));
            if ((subarray.size() > max)) {
                max = subarray.size();
            }
        }
        return max;

    }

    private static List<Integer> findValidSubarray(final List<Integer> array, final Integer integer) {
        final List<Integer> subarray = new ArrayList<Integer>();
        for (final int elem : array) {
            if ((elem == integer) || (elem + 1 == integer)) {
                subarray.add(elem);
            }
        }
        return subarray;
    }

}
