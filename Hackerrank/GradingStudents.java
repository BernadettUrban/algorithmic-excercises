package Hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/three-month-preparation-kit-grading/problem
 */
public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> answer = new ArrayList();
        for (int i = 0; i < grades.size(); i++) {
            int currentGrade = grades.get(i);
            if (currentGrade >= 38) {
                if (currentGrade % 5 >= 3) {
                    currentGrade = currentGrade / 5 * 5 + 5;
                }
            }
            answer.add(currentGrade);
        }
        return answer;
    }
}
