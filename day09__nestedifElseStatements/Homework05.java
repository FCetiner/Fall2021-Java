package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin 
		//Sayi pozitifse “Sayi pozitif” yazdirin, 
		//negatifse	sayinin karesini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz:");
		int sayý = scan.nextInt();
		
		System.out.println(sayý>=0 ? "Sayý pozitif" : (sayý*sayý) );
		
		scan.close();
	}

}
