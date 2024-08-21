import java.util.Scanner;
  public class Lab05Q1 {
     public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the first number:");
	 int num1 = input.nextInt();
	 System.out.print("Enter the Second number:");
	 int num2 = input.nextInt();
	 System.out.print("Enter the Third number:");
	 int num3 = input.nextInt();
	 int largest = num1;
if(num2>largest)
	    largest = num2;
if(num3>largest)
        largest = num3;
     int smallest = num1;
if(num2>smallest)
	    smallest = num2;
if(num3>smallest)
        smallest = num3;
	System.out.print("The largest number is:"+largest);
	System.out.print("The smallest number is:"+smallest);
	}
}	