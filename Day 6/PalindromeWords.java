import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        String str, tmp = "";
        System.out.println("Enter the word you want to check if it is palindrome: ");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            tmp += str.charAt(i);
        }
        if (tmp.equals(str)) {
            System.out.println(str + " : Is Polindrome");
        } else {
            System.out.println(str + "´: Is Not Polindrome");
        }
    }
}
