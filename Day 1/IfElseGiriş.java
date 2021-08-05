import java.util.Scanner;

public class IfElseGiriş {
    public static void  main(String[] args){
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("A sayısını giriniz:");
        a=input.nextInt();
        System.out.println("B sayısını giriniz:");
        b=input.nextInt();
        System.out.println("C sayısını giriniz:");
        c=input.nextInt();
        if((a==b) && (b==c)){System.out.println("A B ve C sayıları eşittir.");}
        else if((a==b)&&(b!=c)){System.out.println("A ve B sayıları birbirlerine eşittir");}
        else if((a==c)&&(c!=b)){System.out.println("A ve C sayıları birbirlerine eşittir");}
        else if((a!=b)&&(b==c)){System.out.println("B ve C sayıları birbirlerine eşittir");}
        else{System.out.println("A B ve C sayıları eşit değildir.");
        }
    }
}
