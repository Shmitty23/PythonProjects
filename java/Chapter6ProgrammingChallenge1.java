public class Chapter6ProgrammingChallenge1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");

        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");

        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println("Employee 1: " + employee1.getName() + ", ID: " + employee1.getIdNumber() + ", Department: " + employee1.getdepartment() + ", Position: " + employee1.getposition());

        System.out.println("Employee 2: " + employee2.getName() + ", ID: " + employee2.getIdNumber() + ", Department: " + employee2.getdepartment() + ", Position: " + employee2.getposition());

        System.out.println("Employee 3: " + employee3.getName() + ", ID: " + employee3.getIdNumber() + ", Department: " + employee3.getdepartment() + ", Position: " + employee3.getposition());
    }
}
