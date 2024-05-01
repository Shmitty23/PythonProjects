import java.util.Scanner;

public class Chapter7ProgrammingChallenge8 {
    private String[] studentNames = new String[5];
    private char[] letterGrades = new char[5];
    private double[][] testScores = new double[5][4];

    public void setStudentName(int index, String name) {
        studentNames[index] = name;
    }

    public String getStudentName(int index) {
        return studentNames[index];
    }

    public void setTestScores(int studentIndex, double[] scores) {
        testScores[studentIndex] = scores;
        updateLetterGrade(studentIndex);
    }

    private void updateLetterGrade(int studentIndex) {
        double average = getAverageScore(studentIndex);
        if (average >= 90) {
            letterGrades[studentIndex] = 'A';
        } else if (average >= 80) {
            letterGrades[studentIndex] = 'B';
        } else if (average >= 70) {
            letterGrades[studentIndex] = 'C';
        } else if (average >= 60) {
            letterGrades[studentIndex] = 'D';
        } else {
            letterGrades[studentIndex] = 'F';
        }
    }

    public double getAverageScore(int studentIndex) {
        double total = 0;
        for (double score : testScores[studentIndex]) {
            total += score;
        }
        return total / testScores[studentIndex].length;
    }

    public char getLetterGrade(int studentIndex) {
        return letterGrades[studentIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chapter7ProgrammingChallenge8 gradeBook = new Chapter7ProgrammingChallenge8();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name for student " + (i + 1) + ":");
            String name = scanner.nextLine();
            gradeBook.setStudentName(i, name);

            double[] scores = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter score " + (j + 1) + " for " + name + " (0-100):");
                double score = scanner.nextDouble();
                while (score < 0 || score > 100) {
                    System.out.println("Invalid score. It must be between 0 and 100.");
                    score = scanner.nextDouble();
                }
                scores[j] = score;
            }
            scanner.nextLine();
            gradeBook.setTestScores(i, scores);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nResults for " + gradeBook.getStudentName(i) + ":");
            System.out.printf("Average Score: %.2f\n", gradeBook.getAverageScore(i));
            System.out.println("Letter Grade: " + gradeBook.getLetterGrade(i));
        }

        scanner.close();
    }
}
