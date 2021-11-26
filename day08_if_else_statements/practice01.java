package day08_if_else_statements;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		// Take values of length and breadth of a rectangle from user and check if it is square or not.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length then enter breadth");
		Double x =scan.nextDouble();
		Double y =scan.nextDouble();
		
		if (x==y) {
			System.out.println("it's a square");
		} else {
			System.out.println("it's a rectangle");
		}
		 
		scan.close();
	}

}
