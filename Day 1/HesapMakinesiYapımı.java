import java.util.Scanner;

public class HesapMakinesiYapımı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2;
        int seçim;
        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = input.nextDouble();
        System.out.println("\nİkinci sayıyı giriniz");
        sayi2 = input.nextDouble();
        System.out.println("\nLütfen Yapmak İstediğiniz İşlemi Seçiniz");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Lütfen seçiniz:");
        seçim = input.nextInt();
        if (seçim == 1) {
            System.out.println("Toplama : " + (sayi1 + sayi2));}
        else if (seçim == 2) {System.out.println("Çıkarma :" + (sayi1 - sayi2));}
        else if (seçim == 3) {System.out.println("Çarpma :" + (sayi1 * sayi2));}
        else if (seçim == 4) {
            if ((sayi2 == 0)||(sayi1==0)) {
                System.out.println("Sayılardan en az birisi 0'a eşittir ve sonuç belirsizdir.");}
        else {System.out.println("Bölme :" + (sayi1 / sayi2));}}
        else {System.out.println("Geçersiz bir islem girdiniz tekrar deneyiniz!");}}}