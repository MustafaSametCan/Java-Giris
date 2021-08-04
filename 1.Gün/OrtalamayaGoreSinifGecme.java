import java.util.Scanner;

public class OrtalamayaGoreSinifGecme {
    public static void  main(String[] args){
        double edebiyat,matematik,biyoloji,tarih,kimya,fizik;
        Scanner scan=new Scanner(System.in);
        System.out.println("Edebiyat notunuzu giriniz :");edebiyat=scan.nextInt();
        System.out.println("\nMatematik notunuzu giriniz :");matematik=scan.nextInt();
        System.out.println("\nBiyoloji notunuzu giriniz :");biyoloji=scan.nextInt();
        System.out.println("\nTarih notunuzu giriniz :");tarih=scan.nextInt();
        System.out.println("\nKimya notunuzu giriniz :");kimya=scan.nextInt();
        System.out.println("\nFizik notunuzu giriniz :");fizik=scan.nextInt();
        double ortalama= ((edebiyat+matematik+biyoloji+fizik+tarih+kimya)/5);
        System.out.println("Ortalamanız"+ortalama);
        if(ortalama <50){System.out.println("Sınıfta Kaldınız.");}
        else{System.out.println("Tebrikler Sınıfı geçtiniz");}}}
