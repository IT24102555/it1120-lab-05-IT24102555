import java.util.Scanner;

public class IT24102555Lab05Q3{
    
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_RATE_3_4_DAYS = 10;
    public static final int DISCOUNT_RATE_5_OR_MORE_DAYS = 20;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the start date (1 - 31): ");
        int startDate =input.nextInt();

        System.out.print("Enter the end date (1 - 31): ");
        int endDate =input.nextInt();
        
       
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
           
        }
        
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
                   }
        
        
        int numberOfDaysReserved = endDate - startDate;
        
        
        int discountRate = 0;
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = DISCOUNT_RATE_3_4_DAYS;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_RATE_5_OR_MORE_DAYS;
        }
        
        
        int totalAmount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
        double discountedAmount = totalAmount - (totalAmount * discountRate / 100.0);
        
       
        System.out.println("Number of days reserved: " + numberOfDaysReserved);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount applied: " + discountRate + "%");
        System.out.println("Total amount to be paid after discount: Rs " + discountedAmount);
    }
}
