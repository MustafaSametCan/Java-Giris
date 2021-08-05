import java.util.Scanner;

public class Order3NumbersWithIfElse {
    public static void  main(String[] args){
        // a>b>c || a>c>b
        // b>a>c || b>c>a
        // c>a>b || c>b>a
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("A:");a= scan.nextInt();
        System.out.println("B:");b= scan.nextInt();
        System.out.println("C:");c= scan.nextInt();
        if(a>b&&a>c){if(b>c) {System.out.println("a > b > c");}
        else{System.out.println("a > c > b");}}
        else if(b>a&&b>c){if(a>c){System.out.println("b > a > c");}
        else{System.out.println("b > c > a");}}
        else{if(a>b){System.out.println("c > a > b");}
            else{System.out.println("c > b > a");}}}}
