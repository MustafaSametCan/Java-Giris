import java.util.Scanner;

public class ForExample3FibonacciSerie {
    public static void  main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a num");

        int input=scan.nextInt();

        int n1=0;
        int n2=1;
        int total=0;
        System.out.print("Fibonacci series of the number " +input+": ");
        for(int i=1;i<=input;i++){
            System.out.print(+n1+",");
            total=n1+n2;
            n1=n2;
            n2=total;
        }







    }
}
