public class Calculator {
    public int num1;
    public int num2;
    public String colour;

    Calculator(int num1, int num2, String colour) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public int sum() {
        return this.num1 + this.num2;
    }

    public int subtraction() {
        return this.num1 - this.num2;

    }

    public int multiplication() {
        return this.num1 * this.num2;
    }

    public int division() {
        return this.num1 / this.num2;

    }
}
