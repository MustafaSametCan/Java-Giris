import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int öğno; double vize1,vize2,fin;
        System.out.println("Notunu Hesaplamak İstediğiniz Öğrencinin Okul Numarasını Giriniz:");
        öğno=input.nextInt();
        System.out.println("Öğrencinin 1. Vize Notunu Giriniz:");
        vize1=input.nextInt();
        System.out.println("Öğrencinin 2. Vize Notunu Giriniz:");
        vize2=input.nextInt();
        System.out.println("Öğrencinin Final Notunu Giriniz:");
        fin=input.nextInt();
        double ortalama=(vize1*20/100)+(vize2*20/100)+(fin*60/100);
        String harf = null;
        if(ortalama<=40) harf="ff"; else if(ortalama<=60) harf="dd"; else if(ortalama<=65) harf="cd";
        else if(ortalama<=70) harf="cc"; else if(ortalama<=75) harf="bc"; else if(ortalama<=80) harf="bb";
        else if(ortalama<=90) harf="ab"; else if(ortalama<=100) harf="aa";
        System.out.println("Öğrencinin Numarası"+öğno);
        System.out.println("Öğrencinin Ortalaması ="+ortalama);
        System.out.println("Öğrencinin Harf Notu ="+harf);

    }
}


