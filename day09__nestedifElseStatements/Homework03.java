package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tamsay� giriniz:");
		int say� = scan.nextInt();
			System.out.println(say�%2==0 ? "Say� �ift say�d�r" : "Say� tek say�d�r");

			scan.close();
	}

}
