
public class StrongPassword {
    public static void main(String[] args) {
        /**
         * https://www.hackerrank.com/challenges/three-month-preparation-kit-strong-password/problem
         */
        String s = "4700"; // expected 3
        // "#HackerRank"; // expected 1
        System.out.println(minimumNumber(s.length(), s));

    }

    public static boolean hasSpecialChar(String toCheck) {
        boolean ans = false;
        String specialCharacters = "!@#$%^&*()-+";
        for (int i = 0; i < specialCharacters.length(); i++) {
            if (toCheck.contains(specialCharacters.charAt(i) + "")) {
                ans = true;
            }
        }
        return ans;

    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int ans = 0;

        boolean hasNumber = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
            } else if (Character.isLowerCase(password.charAt(i))) {
                hasLowercase = true;

            } else if (Character.isUpperCase(password.charAt(i))) {
                hasUppercase = true;
            } else if (hasSpecialChar(password)) {
                hasSpecialChar = true;
            }
        }

        if (hasNumber == false) {
            ans++;

        }
        if (hasLowercase == false) {
            ans++;

        }
        if (hasUppercase == false) {
            ans++;

        }
        if (hasSpecialChar == false) {
            ans++;
        }

        ans = Math.max(ans, 6 - password.length());

        return ans;

    }

}
