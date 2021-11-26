package day10_ternary_Switchcase;

import java.util.Scanner;

public class c03_ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz:");
		int sayý = scan.nextInt();
		
		System.out.println(sayý>=0 ? sayý : (sayý*-(1)));
scan.close();

	}

}
