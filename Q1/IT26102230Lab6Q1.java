import java.util.Scanner;

public class IT26102230Lab6Q1{
	
	public static void main(String[] args){
		
		double userInput, sqRoot, square;
		
		Scanner lookfor = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		userInput = lookfor.nextDouble();
		
		if (userInput < 0){
			
			System.out.println("Error: Number must be greater than Zero.");
			return;
			
		}
		else{
			square = Math.pow(userInput, 2);
			sqRoot = Math.sqrt(userInput);
		}
		
		System.out.println("\nSquare of " + userInput + " is : " + square);
		System.out.println("Square root of " + userInput + " is : " + sqRoot);
		
	}
}