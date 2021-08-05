import java.util.Scanner;

public class EventSuggestion {

    public static void  main(String[] args){
        Scanner scan=new Scanner(System.in);
        int temp;
        System.out.println("What is the temperature?");
        temp=scan.nextInt();

        if(temp>=30){System.out.println("you should go swimming");}
            else if(temp>0&&temp<30){System.out.println("you should go cinema");}
            else{System.out.println("you should go ice skating");}}}
