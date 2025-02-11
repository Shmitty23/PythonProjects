import java.util.Scanner;
import java.util.ArrayList;

public class todolist {
    boolean activeGame = true;
    ArrayList<String> toDoArrayList = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    public String addTask() {
        System.out.println("What would you like to add to your To-do List?");
        String addTask = sc.nextLine();

        toDoArrayList.add(addTask);
        return "Task added!";
    }

    public String viewTask(String view) {
        for (int i = 0; i < toDoArrayList.size(); i++) {
            System.out.println("Here's everything in your To-do List!\n" + i + toDoArrayList.get(i));
        }
    }

    public String exitProgram() {
        activeGame = false;
        return "Have a good day completing your tasks!";
    }

    public static void main(String[] args) {
        todolist todo = new todolist();
        Scanner sc = new Scanner(System.in);
        while (todo.activeGame == true) {
            System.out.println("Welcome to your To-do List!");

            if (todo.toDoArrayList.size() == 0) {
                System.out.println("You need to add your first task to your To-do list!");
                System.out.println("\nWhat would you like your first task to be?");
                String firstTask = sc.nextLine();

                todo.toDoArrayList.add(firstTask);
                System.out.println("Task added to your To-do List!");
            }
            
            System.out.println("Please select an option (number).");
            System.out.println("1. Add task \n2. View task \n3. Remove task \n4. Exit To-do List");

            int userOption = sc.nextInt();
            sc.nextLine();
        }
    }
}
