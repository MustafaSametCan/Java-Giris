import java.util.Scanner;

public class FlightTicketPriceCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km, age, tickettype;
// cpm  : 0.10$
// if customer's age < 12 %50 discount
// if costomer's age is between 12-24 %10 discount
// if customer's age > 65 %50 discount
// Round Trip Ticket %20 discount
        System.out.println("Please enter the flight distance(Mile):");
        km = scan.nextInt();
        System.out.println("Please enter the customer's age:");
        age = scan.nextInt();
        System.out.println("Please enter the ticket type (1- One Way, 2- Round Trip)");
        tickettype = scan.nextInt();
        double standartprice, agedc, typedc;
        if (km > 0 && age > 0 && (tickettype == 1 || tickettype == 2)){standartprice = km * 0.10;
            if (age < 12){
                agedc = standartprice * 0.5;
            if (age >= 12 && age <= 24){agedc = standartprice * 0.10;
                }else if(age >= 65){agedc = standartprice * 0.30;
                }else{agedc = 0;}standartprice -= agedc;}
            if(tickettype==2){
                typedc=standartprice*0.20;
                standartprice=(standartprice-typedc)*2;
                System.out.println("Ticket Price:"+standartprice);}else{System.out.println("Try again");}}}}