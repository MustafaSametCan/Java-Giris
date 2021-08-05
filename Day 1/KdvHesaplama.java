import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double tutar,kdvlifiyat,kdv; //=0.18;

        System.out.println("Ürünün tutarını giriniz:");
        tutar= input.nextDouble();
        System.out.println("KDV Oranını Giriniz");
        kdv=input.nextDouble();
        kdvlifiyat=tutar+(tutar*kdv);
        System.out.println("Ürünün KDV uygulanmış fiyatı:"+kdvlifiyat);


    }

}
