import java.util.Scanner;

public class IT26102230Lab6Q2B{
	
	public static void main(String[] args){
		
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		
		Scanner lookfor = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
		System.out.print("Enter number 1: ");
		num1 = lookfor.nextInt();
		
		System.out.print("Enter number 2: ");
		num2 = lookfor.nextInt();
		
		System.out.print("Enter number 3: ");
		num3 = lookfor.nextInt();
		
		System.out.print("Enter number 4: ");
		num4 = lookfor.nextInt();
		
		System.out.print("Enter number 5: ");
		num5 = lookfor.nextInt();
		
		System.out.print("Enter number 6: ");
		num6 = lookfor.nextInt();
		
		System.out.print("Enter number 7: ");
		num7 = lookfor.nextInt();
		
		System.out.print("Enter number 8: ");
		num8 = lookfor.nextInt();
		
		System.out.print("Enter number 9: ");
		num9 = lookfor.nextInt();
		
		System.out.print("Enter number 10: ");
		num10 = lookfor.nextInt();
		
		System.out.println("\nThe numbers you enetered are:");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10);
	}
}