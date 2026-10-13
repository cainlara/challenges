package challenges;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> fixedGrades = grades.stream().mapToInt(grade -> {
            int fixedGrade = grade;

            if (grade >= 38) {
                int nextMultipleOfFive = ((grade / 5) + 1) * 5;

                if (nextMultipleOfFive - grade < 3) {
                    fixedGrade = nextMultipleOfFive;
                }
            }

            return fixedGrade;
        }).boxed().collect(Collectors.toList());

        // List<Integer> fixedGrades = new ArrayList<>();

        // for (int grade : grades) {
        //     int fixedGrade = grade;

        //     if (grade >= 38) {
        //         int nextMultipleOfFive = ((grade / 5) + 1) * 5;

        //         if (nextMultipleOfFive - grade < 3) {
        //             fixedGrade = nextMultipleOfFive;
        //         }
        //     }

        //     fixedGrades.add(fixedGrade);
        // }

        return fixedGrades;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> grades = List.of(73, 67, 38, 33);
        List<Integer> result = gradingStudents(grades);
        System.out.println(result);
    }
}
