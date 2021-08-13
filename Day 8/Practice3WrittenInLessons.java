import java.util.Scanner;

public class Practice3WrittenInLessons {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Please enter a number: ");
        num=scan.nextInt();
        int divisor=2;
        int dividend=num;
        System.out.println("Prime factors:");
        while(divisor<num){
            if(dividend%divisor==0){
                System.out.print(divisor+" ");
                dividend/=divisor;
            }
            else{
                divisor++;
            }
        }
        System.out.print(num == dividend ? "You enter a prime number":"" );


    }
}
