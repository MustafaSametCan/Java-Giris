import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String k_adi,parola;
        System.out.println("Kullanıcı Adınızı Giriniz :");
        k_adi= input.nextLine();
        System.out.println("Şifrenizi Giriniz : ");
        parola= input.nextLine();
        if(k_adi.equals("SaMeT")&& parola.equals(12344321)){
            System.out.println("Başarılı bir şekilde giriş yaptınız.");}
        else{System.out.println("Kullanıcı adınız veya parolanız yanlış.");}}}
