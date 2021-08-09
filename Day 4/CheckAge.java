import java.util.Scanner;

public class CheckAge {

    static void checkage(int age) {
        if (age < 18)
            System.out.println("Access Denied");
        else
            System.out.println("Access Granted");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("How old are you?");
        age = scan.nextInt();
        checkage(age);
    }
}
