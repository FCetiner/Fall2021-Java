package day05;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		// Kullan�c�dan 4 basamakl� bir say� al�p
		//rakamlar toplam�n� yazd�r�n
		
		Scanner scan =new Scanner(System.in);
		System.out.println("L�tfen 4 basamakl� bir say� giriniz:");
		int say�=scan.nextInt();
		
		int rakamlarToplam�=0;
		int rakam=say�%10; 
		rakamlarToplam�+=rakam; 
		say�/=10;
		
		rakam=say�%10; 
		rakamlarToplam�+=rakam; 
		say�/=10;
		
		rakam=say�%10; 
		rakamlarToplam�+=rakam; 
		say�/=10;
		
		rakam=say�%10; 
		rakamlarToplam�+=rakam; 
		say�/=10;
	System.out.println("Rakamlar Toplam� : "+rakamlarToplam�);
//bu i�lemi basamak say�s� kadar tekrar edersek toplam� buuruz		

	}

}
