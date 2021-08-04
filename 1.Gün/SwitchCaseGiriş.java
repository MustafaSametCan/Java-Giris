import java.util.Scanner;

public class SwitchCaseGiriş {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi=input.nextInt();
        switch(sayi){
            case 1: System.out.println("Sayı 1'e Eşittir.");break;
            case 2: System.out.println("Sayı 2'e Eşittir.");break;
            case 3: System.out.println("Sayı 3'e Eşittir.");break;
            default:System.out.println("Geçersiz bir sayı girdiniz!");
        }
    }
}
