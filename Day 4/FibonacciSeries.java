import java.util.Scanner;

public class FibonacciSeries {
    static int fibo(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Which number do you want to find in series? ");
        x = scan.nextInt();
        System.out.println(fibo(x));
    }
}
