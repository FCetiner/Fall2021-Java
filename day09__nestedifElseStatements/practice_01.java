package day09__nestedifElseStatements;

import java.util.Scanner;

public class practice_01 {

	public static void main(String[] args) {
		// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
		//Ask user for their salary and year of service and print the net bonus amount.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your salary:");
		Double salary=scan.nextDouble();
		
		System.out.print("Enter your yer of service:");
		Double year=scan.nextDouble();
		
		if (year>5) {
			System.out.println("Your bonus amount:" + ((salary*5)/100));
		} else {
			System.out.println("Your bonus amount:"+ 0);
		}
		scan.close();
	}

}
