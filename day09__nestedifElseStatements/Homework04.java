package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz:");
		int say� = scan.nextInt();
		
		System.out.println(say�>=0 ? say� : (say�*-1));
scan.close();
	}

}
