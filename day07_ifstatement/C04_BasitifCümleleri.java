package day07_ifstatement;

import java.util.Scanner;

public class C04_BasitifC�mleleri {

	public static void main(String[] args) {

		// Kullan�c�dan dikd�rtgenin kenar uzunluklar�n� isteyin
		//dikd�rtgenin kare olup olmad���n� yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen dikd�rtgenin bir kenar uzunlu�unu girin:");
		
		double kenar1=scan.nextDouble();
		
System.out.print("L�tfen dikd�rtgenin bir kenar uzunlu�unu girin:");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikd�rtgen kare");
		}
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikd�rtgen kare de�il");
		}
		
		scan.close();
		
		
		
		
		
	} //main method sonu

} //class sonu
