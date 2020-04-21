package moneyMaster;

import java.util.Scanner;

public class mainInterface {
	
	static String profileInput;
	static Double incomeInput;
	
	
	static profiles userProfile = new profiles();
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("Please choose which profile you want to save under. You may choose from Saver, Spender, or Trip");
		Scanner input = new Scanner(System.in);
		String profileInput = input.nextLine();
		System.out.println("You have chosen " + profileInput);
		
		
		System.out.println("Please enter your monthly income");
		Double incomeInput = input.nextDouble();
		System.out.println("Your income is " + incomeInput);
		System.out.println("");
		System.out.println("Here's how much you can spend per month:");
		System.out.println("");
		
		userProfile.canSpend(profileInput, incomeInput);
		
		
		
		
	}

}
