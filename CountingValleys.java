public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    public static int countingValleys(int steps, String path) {
        int count = 0;
        int currentSeaLevel = 0;
        boolean valleyStatus = false;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                currentSeaLevel++;
            } else {
                currentSeaLevel--;
            }

            if (currentSeaLevel < 0 && !valleyStatus) {
                count++;
                valleyStatus = true;
            } else if (currentSeaLevel >= 0 && valleyStatus) {
                valleyStatus = false;
            }
        }
        return count;
    }
}
