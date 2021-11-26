package day08_if_else_statements;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
		//Ask user for quantity
		//Suppose, one unit will cost 100.
		//Judge and print total cost for user.
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Quantity");
	int quantity= scan.nextInt();
	
	if (quantity>1000) {
		System.out.println( "Total Cost:" + (quantity * 90));
	} else {
		System.out.println("Total Cost:" + quantity*100);
	}
	
	scan.close();
	}

}
