import java.util.Arrays;

public class ZigZagSequence {
    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/three-month-preparation-kit-zig-zag-sequence/problem
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        // expected: 1 2 3 7 6 5 4
        // first k elements: asc order.last k:desc order, k = (n+1)/2
        findZigZagSequence(a, a.length);
    }

    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
        int mid = n / 2;
        // put biggest number in the middle

        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        // desc order for the second half of array
        int start = mid + 1;
        int end = n - 2;
        while (start < end) {
            int t = a[start];
            a[start] = a[end];
            a[end] = t;
            start++;
            end--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
