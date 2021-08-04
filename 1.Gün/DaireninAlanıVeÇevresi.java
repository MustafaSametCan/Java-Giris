import java.util.Scanner;

public class DaireninAlanıVeÇevresi {
    public static void main(String[] args){
        double pi=3.14,r,alan,çevre;
        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:");
        r=input.nextDouble();
        alan=pi*r*r;
        çevre=2*pi*r;
        System.out.println("Dairenin Alanı="+alan);
        System.out.println("Dairenin Çevresi="+çevre);
    }
}
