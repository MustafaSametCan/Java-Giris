public class OOP_Employee {
    private String name;
    public double salary;
    private int workHours, hireYear;

    OOP_Employee(String name, int hireYear, int workHours, double salary) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        }
        return 0.0;
    }

    public double bonus() {
        int extraHours = this.workHours - 45;
        if ((extraHours > 0)) {
            return 30 * extraHours;
        }
        return 0;
    }

    public double increase() {
        int year = 2021 - this.hireYear;
        if (year < 10) {
            return this.salary * 0.5;
        } else if (year >= 10 && year < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }
}
