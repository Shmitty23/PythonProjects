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

    public void viewTask() {
        if (toDoArrayList.size() == 0) {
            System.out.println("There is nothing in your to-do list. Please add a task.");
            return;
        }

        System.out.println("Here's everything in your To-do List!");
        for (int i = 0; i < toDoArrayList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoArrayList.get(i));
        }
    }

    public void removeTask() {
        if (toDoArrayList.size() == 0) {
            System.out.println("You have nothing in your To-do list to remove.");
            return;
        }
        System.out.println("What task would you like to remove? (number)");
        viewTask();
        int userChoice = sc.nextInt();
        sc.nextLine();

        if (userChoice < 1 || userChoice > toDoArrayList.size()) {
            System.out.println("Invalid task number. Please try again.");
        } else {
            toDoArrayList.remove( userChoice - 1);
            System.out.println("Your task has been removed!");
            viewTask();
        }
    }

    public String exitProgram() {
        activeGame = false;
        return "Have a good day completing your tasks!";
    }

    public static void main(String[] args) {
        todolist todo = new todolist();
        System.out.println("Welcome to your To-do List!");
        while (todo.activeGame == true) {
            
            System.out.println("\nPlease select an option (number).");
            System.out.println("1. Add task \n2. View task \n3. Remove task \n4. Exit To-do List");

            int userOption = todo.sc.nextInt();
            todo.sc.nextLine();

            if (userOption == 1) {
                todo.addTask();
            } else if ( userOption == 2) {
                todo.viewTask();
            } else if( userOption == 3) {
                todo.removeTask();
            } else {
                System.out.println("Have a good day completing your tasks!");
                todo.activeGame = false;
                todo.sc.close();
            }
        }
    }
}
