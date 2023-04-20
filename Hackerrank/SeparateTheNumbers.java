import java.util.*;

public class SeparateTheNumbers {
    public static void main(String[] args) {

        String s1 = "605704597605704598605704599";
        String s2 = "605704597605704598605704598";
        String s3 = "314865217314865218314865219";
        String s4 = "314865217314865218314865209";
        String s5 = "719059156719059157719059158";
        String s6 = "719059156719059157719059058";
        String s7 = "985134995985134996985134997";
        String s8 = "985134995985134996985133997";
        String s9 = "160099024160099025160099026";
        String s10 = "160099024160099025160089026";

        try {

            separateNumbers(s1);
            separateNumbers(s2);
            separateNumbers(s3);
            separateNumbers(s4);
            separateNumbers(s5);
            separateNumbers(s6);
            separateNumbers(s7);
            separateNumbers(s8);
            separateNumbers(s9);
            separateNumbers(s10);
        } catch (NumberFormatException ex) { // handle your exception
            System.out.println(ex);

        }

        /*
         * Expected Output
         * YES 605704597
         * NO
         * YES 314865217
         * NO
         * YES 719059156
         * NO
         * YES 985134995
         * NO
         * YES 160099024
         * NO
         */
    }

    public static void separateNumbers(String s) {
        long a = checkDigit(s);
        if (a == -1) {
            System.out.println("NO");
        } else {
            System.out.println("YES " + a);

        }

    }

    public static long checkDigit(String s) {
        for (int j = 1; j < s.length() + 1 && j < 17; j++) {
            long a = Long.parseLong(s.substring(0, j));
            long initialDigit = a;
            String temp = "" + a;
            int count = 1;
            while (temp.length() < s.length()) {
                a++;
                count++;
                temp += a;
            }
            if (temp.equals(s) && count >= 2) {
                return initialDigit;
            }
        }
        return -1;
    }

}
