import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 1000, input, amount;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Your current balance is :" + balance + "$");
        while (balance > 0) {
            System.out.println();
            System.out.println("1-) Deposit");
            System.out.println("2-) Withdraw");
            System.out.println("3-) Balance inquiry");
            System.out.println("4-) Check out");
            System.out.println("Please select the action you want to do:");
            input = scan.nextInt();

            if (input == 1) {
                System.out.println("Amount you want to deposit:");
                amount = scan.nextInt();
                balance += amount;
            } else if (input == 2) {
                System.out.println("Amount you want to withdraw:");
                amount = scan.nextInt();
                if (amount > balance) {
                    System.out.println("insufficient balance");
                } else {
                    balance -= amount;
                }
            } else if (input == 3) {
                System.out.println("Current balance:" + balance + "$");
            } else if (input == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("You have selected an invalid action");
            }
        }
        System.out.println("We hope you come again...");
    }


}

