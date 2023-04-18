import java.util.*;

public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int n = arr.size();
        // Creating temp array of size d
        int temp[] = new int[d];

        // Copying first d element in array temp
        for (int i = 0; i < d; i++)
            temp[i] = arr.get(i);

        // Moving the rest element to index
        // zero to N-d
        for (int i = d; i < n; i++) {
            arr.set((i - d), arr.get(i));
        }

        // Copying the temp array element
        // in original array
        for (int i = 0; i < d; i++) {
            arr.set((i + n - d), temp[i]);
        }
        return arr;
    }

}
