package day10_ternary_Switchcase;

import java.util.Scanner;

public class c04_ternary {

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
