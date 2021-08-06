import java.util.Scanner;

public class ForExample1PrimeNums {
    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input;
        boolean prime=true;
        do{
            System.out.println("Please enter a positive num:");
            input = scan.nextInt();
        }while(input <1);
        for(int i=2;i<input;i++){
            if(input%i==0){
                prime=false;
                break;
            }
        }
        if (prime){
            System.out.println(+input+" is a prime number");
        }else{
            System.out.println(+input+" is not a prime number");
        }

    }
}
