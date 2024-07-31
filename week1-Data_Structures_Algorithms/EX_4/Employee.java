package EX_4;

public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private double salary;

    public Employee(String employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: $" + salary;
    }
    
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee("001", "Alice", "Developer", 70000));
        ems.addEmployee(new Employee("002", "Bob", "Manager", 80000));
        ems.addEmployee(new Employee("003", "Charlie", "Designer", 60000));
        ems.addEmployee(new Employee("004", "Diana", "QA Engineer", 50000));
        ems.addEmployee(new Employee("005", "Eve", "Data Analyst", 65000));

        System.out.println("All Employees:");
        ems.traverseEmployees();

        String searchId = "003";
        Employee employee = ems.searchEmployee(searchId);
        if (employee != null) {
            System.out.println("\nEmployee found: " + employee);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }

        // Deleting an employee
        String deleteId = "002";
        boolean deleted = ems.deleteEmployee(deleteId);
        if (deleted) {
            System.out.println("\nEmployee with ID " + deleteId + " deleted.");
        } else {
            System.out.println("\nEmployee with ID " + deleteId + " not found.");
        }

        // Traversing employees after deletion
        System.out.println("\nEmployees after deletion:");
        ems.traverseEmployees();
    }
}
