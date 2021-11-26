package day09__nestedifElseStatements;

import java.util.Scanner;

public class C02_nestedif {

	public static void main(String[] args) {
		// Soru12)Kullan�c�dan 4 basamakli bir sayi girmesini isteyin.
		//Girdi�i sayi 5�e  b�l�n�yorsa son rakam�n� kontrol edin.
		//Son rakam� 0 ise ekrana �5�e b�l�nen  �ift say�� yazd�r�n. 
		//Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.  
		//Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("D�rt basamakl� say� giriniz:");
		int say� = scan.nextInt();
		
		if (say�<1000 || say�>9999) {
			System.out.println("L�tfen 4 basamakl� pozitif say� girmelisiniz.");
		} else 
			if(say�%5==0){ //5e tam b�l�nenler
				if (say�%10==0) { //son rakam 0
					System.out.println("5'e b�l�nen �ift say�");
				} else {	//son rakam 5
					System.out.println("5'e b�l�nen tek say�");
				}
			
			} else 	//be�e tam b�l�nemeyenler
			System.out.println("Tekrar deneyin");
		
		
		scan.close();
		
	}

}
