public class MarsExploration {
    /**
     * https://www.hackerrank.com/challenges/three-month-preparation-kit-mars-exploration
     * 
     * @param args
     */
    public static void main(String[] args) {

        String s = "SOSSPSSQSSOR"; // and signal length . Sami sent SOS messages (i.e.: ).

        /*
         * Expected signal: SOSSOSSOSSOS
         * Recieved signal: SOSSPSSQSSOR
         * 
         * We print the number of changed letters, which is 3.
         */
        System.out.println(marsExploration(s));
    }

    public static int marsExploration(String s) {
        int numOfLettersChanged = 0;
        int numOfMessages = s.length() / 3;
        String string = "SOS";
        String expectedSignal = string.repeat(numOfMessages);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != expectedSignal.charAt(i)) {
                numOfLettersChanged++;
            }
        }

        return numOfLettersChanged;
    }

}
