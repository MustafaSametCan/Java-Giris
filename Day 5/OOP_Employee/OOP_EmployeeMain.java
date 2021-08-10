public class OOP_EmployeeMain {
    public static void main(String[] args) {

        OOP_Employee emp1 = new OOP_Employee("Samet", 2001, 45, 3451);
        System.out.println("Tax:" + emp1.tax());
        System.out.println("Bonus:" + emp1.bonus());
        System.out.println("Increase Salary:" + emp1.increase());
        double totalSalary = emp1.salary - emp1.tax() + emp1.bonus();
        System.out.println("Total salary with tax and bonus:" + totalSalary);
        System.out.println("Total salary with the raise of salary:" + (emp1.salary + emp1.increase()));


    }
}
