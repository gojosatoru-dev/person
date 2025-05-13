class Employee extends Person {
    String empId;
    double salary;

    public Employee(String name, String dobStr, String empId, double salary) {
        super(name, dobStr);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployee() {
        displayInfo();
        System.out.println("Emp ID: " + empId);
        System.out.println("Salary: " + salary);
    }

public static void main(String[] args) {
    Employee emp = new Employee("Alice Johnson", "1990-06-15", "EMP12345", 75000.00);
    emp.displayEmployee();
}
}
