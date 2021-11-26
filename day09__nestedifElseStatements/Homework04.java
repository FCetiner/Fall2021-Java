package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz:");
		int sayý = scan.nextInt();
		
		System.out.println(sayý>=0 ? sayý : (sayý*-1));
scan.close();
	}

}
