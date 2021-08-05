import java.util.Scanner;

public class WhileExample2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int sum=0,n;
        while(sum>=0){
            System.out.println("Enter a number:");n= scan.nextInt();
            if(n%2==1){sum+=n;}else if(n<0)break;}System.out.println(sum);}}
