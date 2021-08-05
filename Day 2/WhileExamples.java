import java.util.Scanner;

public class WhileExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Example 1 Factorial calculation
        //Example 2 Harmonic nums
        //Example 3 Make triangles with stars
        //Example 4 Exponential calculation
/* EXAMPLE 1
        int n, i = 1;
        System.out.println("Enter a number to get a factorial:");
        n = scan.nextInt();
        while (n>0) {i *= n;n--;}System.out.println(i); */

/* EXAMPLE 2
        double n;
        System.out.println("Enter a number to get a harmonic nums:");
        n = scan.nextInt();
        double harmonic =0.0;
        while(n>0){harmonic+=(1/n);
            n--;
        }System.out.println(harmonic);  */
/* EXAMPLE 3
        int star =scan.nextInt();
        int i=1;
        while(i<=star){int k=1;while(k<=i){System.out.print("*");k++;}
            System.out.println();i++;   */

/* EXAMPLE 4
        int num1,num2,result=1;
        System.out.print("Enter ur base number:");
        num1=scan.nextInt();
        System.out.print("Enter exponent number:");
        num2=scan.nextInt();
        int i=1;
        while(i<=num2){result=result*num1;i++;}
        System.out.print("Result :"+result);    */


    }
}
