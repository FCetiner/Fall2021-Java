package day10_ternary_Switchcase;

import java.util.Scanner;

public class c03_ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz:");
		int say� = scan.nextInt();
		
		System.out.println(say�>=0 ? say� : (say�*-(1)));
scan.close();

	}

}
