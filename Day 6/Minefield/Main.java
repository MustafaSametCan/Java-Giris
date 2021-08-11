import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, column;
        System.out.println("Please enter the board dimensions:");
        System.out.print("Number of rows:");
        row = scan.nextInt();
        System.out.print("Number of columns:");
        column = scan.nextInt();

        BasicMinefield minefield = new BasicMinefield(row, column);
        minefield.run();
    }
}
