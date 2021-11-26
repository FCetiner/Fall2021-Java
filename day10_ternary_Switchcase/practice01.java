package day10_ternary_Switchcase;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		//A school has following rules for grading system:
			//a. Below 25 - F
			//b. 25 to 45 - E
			//c. 45 to 50 - D
			//d. 50 to 60 - C
			//e. 60 to 80 - B
			//f. Above 80 - A
			//Ask user to enter marks and print the corresponding grade.

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your mark");
		int mark = scan.nextInt();
		
		if (mark<0) {
			System.out.println("Please enter valid mark");
		} else if (mark<25) {
			System.out.println("F");
		} else if (mark<45) {
			System.out.println("E");
		}else if (mark<50) {
			System.out.println("D");
		} else if (mark<60) {
			System.out.println("C");
		}else if (mark<80) {
			System.out.println("B");
		} else if (mark<100) {
			System.out.println("A");
		} else {
			System.out.println("Please enter valid mark");
		}
		
		scan.close();
		
		
	}

}
