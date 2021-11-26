package day10_ternary_Switchcase;

import java.util.Scanner;

public class c02_ternary {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tamsayý giriniz:");
		int sayý = scan.nextInt();
		System.out.println(sayý%2==0 ? "Sayý çift sayýdýr" : "Sayý tek sayýdýr");

		scan.close();

	}

}
