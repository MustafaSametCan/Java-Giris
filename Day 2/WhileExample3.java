import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,i=2;
        System.out.println("Enter a number:");
        n=input.nextInt();
        while(i<n){
            System.out.println(i);
            i=i*2;

        }




    }
}
