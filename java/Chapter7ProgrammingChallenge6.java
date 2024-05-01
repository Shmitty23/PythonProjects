import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter7ProgrammingChallenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] answers = new char[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Answer for question " + (i + 1) + ":");
            char input = scanner.next().toUpperCase().charAt(0);
            while (input != 'A' && input != 'B' && input != 'C' && input != 'D') {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
                input = scanner.next().toUpperCase().charAt(0);
            }
            answers[i] = input;
        }

        DriverExam exam = new DriverExam(answers);
        System.out.println("Total Correct: " + exam.totalCorrect());
        System.out.println("Total Incorrect: " + exam.totalIncorrect());
        System.out.println("Passed: " + exam.passed());

        List<Integer> missed = exam.questionsMissed();
        if (missed.isEmpty()) {
            System.out.println("No questions missed.");
        } else {
            System.out.println("Questions missed: " + missed);
        }

        scanner.close();
    }

    private static class DriverExam {
        private static final char[] correctAnswers = {
            'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
            'B', 'C', 'D', 'A', 'D', 'C', 'C', 'D', 'D', 'A'
        };
        private char[] studentAnswers = new char[20];

        public DriverExam(char[] answers) {
            this.studentAnswers = answers;
        }

        public boolean passed() {
            return totalCorrect() >= 15;
        }

        public int totalCorrect() {
            int correctCount = 0;
            for (int i = 0; i < correctAnswers.length; i++) {
                if (studentAnswers[i] == correctAnswers[i]) {
                    correctCount++;
                }
            }
            return correctCount;
        }

        public int totalIncorrect() {
            return 20 - totalCorrect();
        }

        public List<Integer> questionsMissed() {
            List<Integer> missedQuestions = new ArrayList<>();
            for (int i = 0; i < correctAnswers.length; i++) {
                if (studentAnswers[i] != correctAnswers[i]) {
                    missedQuestions.add(i + 1);
                }
            }
            return missedQuestions;
        }
    }
}
