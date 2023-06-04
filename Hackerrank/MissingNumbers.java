import java.util.*;

public class MissingNumbers {
    /**
     * https://www.hackerrank.com/challenges/three-month-preparation-kit-missing-numbers/problem
     * 
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> brr = new ArrayList<>(
                Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204));
        System.out.println(missingNumbers(arr, brr));

    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> integerFreqMap = new TreeMap<>();

        for (int i = 0; i < brr.size(); i++) {
            int freq = integerFreqMap.getOrDefault(brr.get(i), 0);
            freq++;
            integerFreqMap.put(brr.get(i), freq);
        }

        for (int i = 0; i < arr.size(); i++) {
            int freq = integerFreqMap.get(arr.get(i));
            freq--;
            if (freq == 0)
                integerFreqMap.remove(arr.get(i));
            else
                integerFreqMap.put(arr.get(i), freq);
        }

        int i = 0;
        int element = 0;
        List<Integer> c = new ArrayList<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : integerFreqMap.entrySet()) {
            element = integerIntegerEntry.getKey();
            c.add(element);
            i++;
        }
        return c;
    }
}
