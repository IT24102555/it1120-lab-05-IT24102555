import java.util.Scanner;
public class T2{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
final double Room_charges_per_day = 48000.00;
final double discountfor3or4days = 0.1;
final double discountfor5ormoredays = 0.2;

System.out.print("Enter start date(1-31):");
int startdate = input.nextInt();

System.out.print("Enter end date(1-31):");
int enddate = input.nextInt();

if(startdate<1 || startdate>31){
   System.out.println("Days must be between 1 and 31");
}
if(startdate>enddate){
   System.out.println("start date must be less than end date");
}
int number_of_days = enddate-startdate;

double discountRate = 0;
        if (number_of_days >= 3 && number_of_days <= 4) {
            discountRate = discountfor3or4days;
        } else if (number_of_days >= 5) {
            discountRate = discountfor5ormoredays;
        }
        
        
        double totalAmount = number_of_days*Room_charges_per_day;
        double discountedAmount =totalAmount * discountRate;
        double Totalamounttobepaid = totalAmount-discountedAmount;
        
System.out.println("Room charges per day:"+Room_charges_per_day);
System.out.println("Number of days received:"+ number_of_days);
System.out.print("Total amount to be paid:"+Totalamounttobepaid);
   }
}
