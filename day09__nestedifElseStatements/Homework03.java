package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tamsayý giriniz:");
		int sayý = scan.nextInt();
			System.out.println(sayý%2==0 ? "Sayý çift sayýdýr" : "Sayý tek sayýdýr");

			scan.close();
	}

}
