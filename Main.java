package Lab7;
public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Oeng Sovanpanha", "098765430", 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Oum Stalin", "088244288", 20, 40);

        System.out.println("Full-Time Employee:");
        fullTimeEmployee.displayEmployeeDetails();
        System.out.println("Salary: $" + fullTimeEmployee.calculateSalary());

        System.out.println("\nPart-Time Employee:");
        partTimeEmployee.displayEmployeeDetails();
        System.out.println("Salary: $" + partTimeEmployee.calculateSalary());
    }
}