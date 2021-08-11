import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        int[] marks = new int[8];
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome ! Please enter your marks.");
        System.out.println("Maths :");
        marks[0] = scan.nextInt();
        System.out.println("Turkish :");
        marks[1] = scan.nextInt();
        System.out.println("History :");
        marks[2] = scan.nextInt();
        System.out.println("Chemistry :");
        marks[3] = scan.nextInt();
        System.out.println("Physics :");
        marks[4] = scan.nextInt();
        System.out.println("Biology :");
        marks[5] = scan.nextInt();
        System.out.println("P.E :");
        marks[6] = scan.nextInt();
        System.out.println("Art :");
        marks[7] = scan.nextInt();

        for (int mark : marks) {
            sum += mark;
        }
        System.out.println("Your grade point norm:" + sum / marks.length);
    }
}
