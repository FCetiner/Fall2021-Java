package day13_StringManipulations;

import java.util.Scanner;

public class C01_Startswith_Endswith {

	public static void main(String[] args) {
		// Kullan�c�dan bir c�mle ve bir kelime al�n 
		//verilen c�mlenin verilen kelime ile ba�lay�p ba�lamad���n�
		// ve bitip bitmedi�ibi yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("L�tfen bir kelime giriniz");
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("Girilen c�mle " + kelime +" ile ba�l�yor");
		} else {
			System.out.println("Girilen c�mle " + kelime + " ile ba�lam�yor");
		}
		
		if (cumle.endsWith(kelime)) {
			System.out.println("Girilen c�mle " + kelime +" ile bitiyor");
		} else {
			System.out.println("Girilen c�mle " + kelime + " ile bitmiyor");
		}
	
	scan.close();
	
	}

}
