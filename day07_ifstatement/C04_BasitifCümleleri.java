package day07_ifstatement;

import java.util.Scanner;

public class C04_BasitifCümleleri {

	public static void main(String[] args) {

		// Kullanýcýdan dikdörtgenin kenar uzunluklarýný isteyin
		//dikdörtgenin kare olup olmadýðýný yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen dikdörtgenin bir kenar uzunluðunu girin:");
		
		double kenar1=scan.nextDouble();
		
System.out.print("Lütfen dikdörtgenin bir kenar uzunluðunu girin:");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikdörtgen kare");
		}
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdörtgen kare deðil");
		}
		
		scan.close();
		
		
		
		
		
	} //main method sonu

} //class sonu
