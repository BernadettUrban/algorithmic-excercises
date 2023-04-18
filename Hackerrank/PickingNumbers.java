import java.util.*;

public class PickingNumbers {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList(Arrays.asList(
                // 1, 1, 2, 2, 4, 4, 5, 5, 5));
                1, 2, 2, 3, 1, 2));
        System.out.println(pickingNumbers(a));
        Collections.sort(a);
        // System.out.println(a);
    }

    public static int pickingNumbers(List<Integer> a) {
        int max = 0;
        /*
         * Collections.sort(a);
         * 
         * List<List<Integer>> listOfList = new ArrayList<>();
         * List<Integer> list = new ArrayList<>();
         * // list.add(a.get(0));
         * for (int i = 0; i < a.size(); i++) {
         * for (int j = 0; j < a.size(); j++) {
         * if (Math.abs(a.get(j) - a.get(i)) <= 1) {
         * 
         * list.add(a.get(j));
         * // list.add(a.get(i + 1));
         * // listOfList.add(list);
         * // System.out.println(a.get(i + 1));
         * // System.out.println(listOfList);
         * System.out.println(list);
         * 
         * }
         * listOfList.add(list);
         * list.removeAll(list);
         * 
         * }
         * 
         * }
         * 
         * System.out.println(listOfList);
         * for (int i = 0; i < listOfList.size(); i++) {
         * if (listOfList.get(i).size() > max) {
         * max = listOfList.get(i).size();
         * }
         * }
         */

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
