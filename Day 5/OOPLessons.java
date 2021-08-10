public class OOPLessons {
    public static void main(String[] args) {
/*
                "Class" Lesson
        Calculator mach1 = new Calculator();
        mach1.num1 = 10;
        mach1.num2 = 20;
        System.out.println(mach1.num1);
        Calculator mach2 = new Calculator();
        mach2.num1 = 20;
        mach2.num2 = 30;
        System.out.println(mach2.num1);     */

        Calculator m1 = new Calculator(10, 5, "black");
        System.out.println(m1.sum());
        System.out.println(m1.subtraction());
        Calculator m2 = new Calculator(20, 3, "blue");
        System.out.println(m2.multiplication());
    }
}
