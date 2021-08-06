import java.util.Scanner;

public class ForExample4GCDyLCF {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1,n2,i,gcd=1,lcf;
        System.out.print("Enter the nums:");
        n1= scan.nextInt();
        n2= scan.nextInt();
        int min=(n1<n2)? n1:n2;
        for(i=min;i>0;i++){
            if((n1%i==0)&&(n2%i==0)){
                gcd=i;break;
            }
        }
        lcf=(n1*n2)/gcd;
        System.out.println(n1+" and "+n2+" GCD "+gcd);
        System.out.println(n1+" and "+n2+" LCF "+lcf);
    }
}
