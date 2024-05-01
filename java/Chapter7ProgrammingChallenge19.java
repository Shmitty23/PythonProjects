import java.util.Scanner;

public class Chapter7ProgrammingChallenge19 {
    private Question[] questions = new Question[10];
    private int[] scores = new int[2]; 

    public Chapter7ProgrammingChallenge19() {
        loadQuestions();
    }

    private void loadQuestions() {
        questions[0] = new Question("What does JVM stand for?",
            new String[]{"Java Virtual Machine", "Java Variable Method", "Just Virtual Machine", "Java Veryfast Machine"}, 0);
        questions[1] = new Question("Which data type is used to create a variable that should store text?",
            new String[]{"String", "Text", "Str", "Txt"}, 0);
        questions[2] = new Question("How do you start writing an if statement in Java?",
            new String[]{"if x > y then", "if x > y", "if (x > y)", "if x > y:"}, 2);
        questions[3] = new Question("Which method can generate random numbers in Java?",
            new String[]{"random()", "Random()", "Math.random()", "Math.generateRandom()"}, 2);
        questions[4] = new Question("Which keyword is used to create a class in Java?",
            new String[]{"class", "Class", "create", "define"}, 0);
        questions[5] = new Question("What is the size of an int data type in Java?",
            new String[]{"32 bits", "64 bits", "16 bits", "8 bits"}, 0);
        questions[6] = new Question("How do you declare an array in Java?",
            new String[]{"int array[]", "int array()", "int []array", "All of the above"}, 3);
        questions[7] = new Question("Which of these is used for detailed error checking at compile time?",
            new String[]{"JVM", "JRE", "JDK", "JDB"}, 2);
        questions[8] = new Question("What does the 'public' keyword denote?",
            new String[]{"An identifier", "A class", "An access modifier", "A type of data"}, 2);
        questions[9] = new Question("Which of these access specifiers allows visibility to all classes everywhere?",
            new String[]{"default", "public", "protected", "private"}, 1);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            int currentPlayer = i % 2;
            System.out.println("Player " + (currentPlayer + 1) + ", here is your question:");
            System.out.println(questions[i].getQuestion());
            for (int j = 0; j < 4; j++) {
                System.out.println((j + 1) + ": " + questions[i].getAnswer(j));
            }
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt() - 1;
            if (questions[i].checkAnswer(answer)) {
                scores[currentPlayer]++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer was " + (questions[i].getCorrectAnswerIndex() + 1));
            }
        }

        System.out.println("Final scores:");
        System.out.println("Player 1: " + scores[0]);
        System.out.println("Player 2: " + scores[1]);
        
        if (scores[0] > scores[1]) {
            System.out.println("Player 1 wins!");
        } else if (scores[0] < scores[1]) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new Chapter7ProgrammingChallenge19().play();
    }
}
