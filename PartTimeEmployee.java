package Lab7;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(int employeeId, String employeeName, String employeePhone, double hourlyRate, int hoursWorked) {
        super(employeeId, employeeName, employeePhone);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
