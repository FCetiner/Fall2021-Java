package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin 
		//Sayi pozitifse �Sayi pozitif� yazdirin, 
		//negatifse	sayinin karesini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz:");
		int say� = scan.nextInt();
		
		System.out.println(say�>=0 ? "Say� pozitif" : (say�*say�) );
		
		scan.close();
	}

}
