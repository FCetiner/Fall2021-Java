package day10_ternary_Switchcase;

import java.util.Scanner;

public class practice03 {
public static void main(String[] args) {
	
	//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
	//Take following input from user
	//Number of classes held
	//Number of classes attended.
	//And print
	//percentage of class attended
	//Is student is allowed to sit in exam or not.
	
	//Modify the above question to allow student to sit if he/she has medical cause.
	//Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter number of classes held");
	double heldClass=scan.nextDouble();
	System.out.println("Please enter number of classes you attended");
	Double attendedClass=scan.nextDouble();
	double percentage = (attendedClass/heldClass)*100;
	
	System.out.println("Do you have any medical cause please anter 'Y' or 'N'" );
	char medical = scan.next().toUpperCase().charAt(0);
		
	if (medical== 'Y') {
		System.out.println("You can't sit in the exam");	
	} 
	else if (medical=='N') {

	if (percentage<0) {
		System.out.println("Please enter a valid number");	
	} else if (percentage<75) {
	System.out.println("Your percentage of class attended is:" + " "+ percentage +"  " +"You are not allowed to sit in exam");	
	} else if(percentage<=100){
	System.out.println("Your percentage of class attended is:" + percentage + "  " + "You are allowed to sit in exam");
	} else{ 
		System.out.println("Attendance can't be more than held class");
		}
	}
	
	scan.close();
	
	
	
}
}
