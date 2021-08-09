public class OverloadingMethods {

    static int add(int a, int b) {
        System.out.println("1st Method");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("2nd Method");
        return a + b + c;
    }

    static double add(int a, int b, double c) {
        System.out.println("3rd Method");
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 5));
        System.out.println(add(1, 2, 6.0));


    }
}
