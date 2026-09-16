import java.util.Scanner;

public class IT26102230Lab6Q3{
	
	public static void main(String[] args){
		
		int counter = 0;
		double meanSquare = 0;
		int userInput = 0 ;
		double rootMeanSquare;
		
		Scanner lookfor = new Scanner(System.in);
		
		System.out.println("Enter positive integers (terminate input with -99):");
		
		while(true){
			
			System.out.print("Enter a number: ");
			userInput = lookfor.nextInt();
			
			if (userInput == -99){
				break;
			}
			
			if (userInput < 0){
				System.out.println("Invalid input. Please enter a positive number or -99 to terminate");
				continue;
			}
			
			meanSquare += Math.pow(userInput, 2);
			counter++;
			
		}
		
		rootMeanSquare = Math.sqrt(meanSquare/counter);
		
		System.out.println("\nThe root Mean Square (RMS) is: " + rootMeanSquare);
		
	}
	
}