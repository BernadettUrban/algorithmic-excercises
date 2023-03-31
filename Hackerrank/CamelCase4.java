import java.io.*;

import java.util.*;

import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    /**
     * https://www.hackerrank.com/challenges/three-month-preparation-kit-camel-case/problem
     * 
     * @param strings
     * @return
     */
    public static List<String> camelCase(List<String> strings) {
        List<String> list = strings.parallelStream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList()); // making sure no null values in the list
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] splittedStr = list.get(i).split(";");

            if (splittedStr[0].equals("C")) {
                String methodName = splitAndCombine(splittedStr[2].split(" "));

                if (splittedStr[1].equals("M")) {
                    methodName += "()";
                    answer.add(methodName);
                } else if (splittedStr[1].equals("V")) {
                    String variableName = methodName;
                    answer.add(variableName);
                } else if (splittedStr[1].equals("C")) {
                    String className = capitalizeFirstLetters(splittedStr[2].split(" "));
                    answer.add(className);
                }

            }
            if (splittedStr[0].equals("S")) {
                String methodName = splitNameIntoParts(splittedStr[2]);
                if (splittedStr[1].equals("M")) {
                    methodName = methodName.substring(0, methodName.length() - 2);
                }
                answer.add(methodName);
            }

        }
        return answer;
    }

    public static String splitAndCombine(String[] partsOfName) {
        String methodName = partsOfName[0];
        for (int j = 1; j < partsOfName.length; j++) {
            Character ch = Character.toUpperCase(partsOfName[j].charAt(0));
            methodName += ch + partsOfName[j].substring(1, partsOfName[j].length());
        }
        return methodName;

    }

    public static String splitNameIntoParts(String name) {
        StringBuilder sbName = new StringBuilder();
        sbName.append(Character.toLowerCase(name.charAt(0)));
        for (int i = 1; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                sbName.append(" ").append(Character.toLowerCase(name.charAt(i)));
            } else {
                sbName.append(name.charAt(i));
            }

        }
        return sbName.toString();
    }

    public static String capitalizeFirstLetters(String[] partsOfName) {
        StringBuilder sbName = new StringBuilder();
        for (int i = 0; i < partsOfName.length; i++) {
            Character ch = Character.toUpperCase(partsOfName[i].charAt(0));
            sbName.append(ch).append(partsOfName[i].substring(1, partsOfName[i].length()));
        }
        return sbName.toString().trim();

    }
}

public class CamelCaseWithReadingInput {
    public static void main(String[] args) throws IOException {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // no information about the size of the list so 6 was hardcoded based on the example
        List<String> strings = IntStream.range(0, 6).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> res = Result.camelCase(strings);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }

}
