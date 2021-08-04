import java.util.Scanner;

public class KonsoldanVeriAlma {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("A sayısını giriniz :");
        a=input.nextInt();
        System.out.println("B sayisini giriniz :");
        b=input.nextInt();
        System.out.println("A sayısı :"+a);
        System.out.println("B sayısı :"+b);
        int toplam;
        toplam=a+b;
        System.out.println("A ve B sayılarının toplamı =" +toplam);

        double c,d;
        System.out.println("Double türünde iki sayı giriniz :");
        c=input.nextDouble();
        d=input.nextDouble();
        System.out.println("C sayısı :"+c);
        System.out.println("D sayısı :"+d);
        double toplam2=c+d;
        System.out.println("C ve D sayılarının toplamı ="+toplam2);
    }
}
