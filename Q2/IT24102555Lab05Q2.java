import java.util.Scanner;
  public class  IT24102555Lab05Q2 {
     public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the number of customer introduced:");
	 int NewMembers = input.nextInt();
if (NewMembers<0)
         System.out.print("Invalid input");
else {
   String prize;
  switch(NewMembers){
        case 0:prize="No prize";
               break;
        case 1:prize="pen";
               break;
        case 2:prize="Umbrella";
               break;
        case 3:prize="Bag";
               break;
        case 4:prize="Travelling Chair";
               break;
        default:prize="headphone";
     }
       System.out.print("Prize is a:"+ prize);
     }
   }
}

