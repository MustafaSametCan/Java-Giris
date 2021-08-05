import java.util.Scanner;

public class ContinueBreak {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
  /*   BREAK EXAMPLE
        int num;
        while(true){
            System.out.println("Enter a number:");num= scan.nextInt();
            if(num==0){break;}System.out.println(num);  */

        //  CONTINUE EXAMPLE

        for(int i=1;i<=10;i++){
            if(i==4 || i==9){System.out.println("Skipped =" +i);continue;}
        System.out.println("i ="+i);


        }
    }
}
