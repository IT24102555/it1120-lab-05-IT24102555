import java.util.Scanner;
  public class  IT24102555Lab05Q3 {
     public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

         final double Roomchargesperdays= 48000.00;
         final double Three_or_four_days_discount = 10/100;
         final double five_or_more_days_discount = 20/100;
            
	 System.out.print("Enter the start date(1-31):");
	 int startdate = input.nextInt();

         System.out.print("Enter the end date(1-31):");
	 int enddate = input.nextInt();

if(startdate<1 || startdate>31 ||  enddate<1 ||  enddate>31)
         System.out.print("Error:days must between 1 andd 31");
if(startdate>enddate)
         System.out.print("Error:Start date must be less than end date");

        int NoOfDaysReserved = enddate-startdate;
 
   double totalAmount = NoOfDaysReserved * Roomchargesperdays;
 
   double finalAmount =totalAmount-discountAmount;
  
      System.out.print("Number Of Days Reserved:"+NoOfDaysReserved);
      System.out.print("Total amount to be paid:" +finalAmount);
  }
}
