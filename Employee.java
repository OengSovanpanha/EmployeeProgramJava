package Lab7;
public abstract class Employee {
    private int employeeId;
    private String employeeName;
    private String employeePhone;
    public Employee(int employeeId, String employeeName, String employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public String getEmployeePhone() {
        return employeePhone;
    }
    public abstract double calculateSalary();
    public void displayEmployeeDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Phone: " + employeePhone);
    }
}

