package day08_if_else_statements;

import java.util.Scanner;

public class C01_ifelse {

	public static void main(String[] args) {
		
		//Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin

Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen dikd�rtgenin bir kenar uzunlu�unu girin:");
		
		double kenar1=scan.nextDouble();
		
System.out.print("L�tfen dikd�rtgenin bir kenar uzunlu�unu girin:");
		
		double kenar2=scan.nextDouble();
		
		
		if (kenar1==kenar2) {
			System.out.println("girilen �l��ler karedir");
		} else {
			System.out.println("girilen �l��ler kare de�ildir");
		
		scan.close();
		
		
		}
		
	}

}
