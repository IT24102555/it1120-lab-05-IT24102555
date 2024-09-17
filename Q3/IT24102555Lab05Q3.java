import java.util.Scanner;
  public class  IT24102555Lab05Q3 {
     public static void main(String[] args) {
	
         final double Roomchargesperdays= 48000.00;
         final double Three_or_four_days_discount = 10/100;
         final double five_or_more_days_discount = 20/100;

	 Scanner input = new Scanner(System.in);
         System.out.print("Enter the start date(1-31):");
	 int startdate = input.nextInt();

         System.out.print("Enter the end date(1-31):");
	 int enddate = input.nextInt();

if(startdate<1 || startdate>31 ||  enddate<1 ||  enddate>31)
         System.out.print("Error:days must between 1 andd 31");
if(startdate>enddate)
         System.out.print("Error:Start date must be less than end date");

        int NoOfDaysReserved = enddate-startdate;
 
      int discountRate = 0;
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = DISCOUNT_RATE_3_4_DAYS;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_RATE_5_OR_MORE_DAYS;
        }
        
        // Calculate the total amount before and after the discount
        int totalAmount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
        double discountedAmount = totalAmount - (totalAmount * discountRate / 100.0);
        
        // Output the results
        System.out.println("Number of days reserved: " + numberOfDaysReserved);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount applied: " + discountRate + "%");
        System.out.println("Total amount to be paid after discount: Rs " + discountedAmount);
    }
}
