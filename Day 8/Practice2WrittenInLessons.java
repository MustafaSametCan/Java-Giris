import java.util.Scanner;

public class Practice2WrittenInLessons {
    public static void main(String[] args){
        int i,j,n;
        Scanner input = new Scanner(System.in);
        System.out.print("The size you want to form the stars:");
        n = input.nextInt();
        for (i=1; i<=n; i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

