import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int input,sum=0;
        do{
            System.out.print("Please enter a number:");
            input = scan.nextInt();
            if(input%1==0){
                sum+=input;
            }
        }while(input>0);
        System.out.println("sum of odd numbers: "+sum);
    }
}
