import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays {
    /***
     * There is a collection of input strings and a collection of
     * query strings. For each query string, determine how many times it
     * occurs in the list of input strings. Return an array of the
     * results.
     * 
     * Input (stdin)
     * 4
     * aba
     * baba
     * aba
     * xzxb
     * 3
     * aba
     * xzxb
     * ab
     * 
     * Expected Output
     * 2
     * 1
     * 0
     */

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("aba", "baba", "aba", "xzxb"));
        List<String> queries = new ArrayList<>(Arrays.asList("aba", "xzxb", "ab"));
        System.out.println(matchingStrings(strings, queries));
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> matches = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < queries.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                if (queries.get(i).equals(strings.get(j))) {
                    count++;
                }
            }
            matches.add(count);
            count = 0;
        }
        return matches;
    }
}
