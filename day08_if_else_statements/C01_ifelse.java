package day08_if_else_statements;

import java.util.Scanner;

public class C01_ifelse {

	public static void main(String[] args) {
		
		//Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin

Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen dikdörtgenin bir kenar uzunluðunu girin:");
		
		double kenar1=scan.nextDouble();
		
System.out.print("Lütfen dikdörtgenin bir kenar uzunluðunu girin:");
		
		double kenar2=scan.nextDouble();
		
		
		if (kenar1==kenar2) {
			System.out.println("girilen ölçüler karedir");
		} else {
			System.out.println("girilen ölçüler kare deðildir");
		
		scan.close();
		
		
		}
		
	}

}
