public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee (String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public Employee (String name, int idNumber) {
        this(name, idNumber, "", "");
    }

    public Employee () {
        this("", 0, "", "");
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getdepartment() {
        return department;
    }

    public String getposition() {
        return position;
    }

}
