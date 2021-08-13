import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scan.nextInt();
        for (int i = 0; i <= num - 1; i++) {
            int pow = 1;
            for (int j = 1; j <= num * 2 - 1; j++) {
                if (j >= num - i && j <= num + i) {
                    System.out.printf("%6d", pow);
                    if (j <= num - 1) {
                        pow *= 4;
                    } else {
                        pow /= 4;
                    }
                } else {
                    System.out.printf("%6s", "");
                }
            }
            System.out.println();
        }
    }
}
