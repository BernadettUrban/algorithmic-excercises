public class CaesarCipher {
    
    /**
    https://www.hackerrank.com/challenges/three-month-preparation-kit-caesar-cipher-1/problem
    **/

    public static void main(String[] args) {
        String s = "Always-Look-on-the-Bright-Side-of-Life";
        int k = 5;

        String expected = "Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj";

        /*
         * 12
         * Hello_World!
         * 4
         * Expected Output
         * Lipps_Asvph!
         */

        String s2 = "Hello_World!";
        k = 4;
        String expected2 = "Lipps_Asvph!";

        String s3 = "www.abc.xy";
        k = 87;

        String expected3 = "fff.jkl.gh";
        System.out.println(caesarCipher(s3, k));
        System.out.println(caesarCipher(s3, k).equals(expected3));
    }

    public static String caesarCipher(String s, int k) {
        String ans = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean isUppercase = false;
        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if (Character.isUpperCase(current)) {
                isUppercase = true;
                current = Character.toLowerCase(current);
                // System.out.println(current);
            }
            if (alphabet.indexOf(current) == -1) {
                ans += current;
                // break;
            } else {
                int indexInAlphabet = alphabet.indexOf(current);
                int indexOfShifted = 0;

                if (indexInAlphabet + k >= alphabet.length()) {
                    indexOfShifted = (indexInAlphabet + k) % alphabet.length();
                } else {
                    indexOfShifted = indexInAlphabet + k;
                }

                Character toAppend = alphabet.charAt(indexOfShifted);
                if (isUppercase == true) {
                    toAppend = Character.toUpperCase(toAppend);
                    isUppercase = false;
                }
                ans += toAppend;
            }

        }

        return ans;

    }

}
