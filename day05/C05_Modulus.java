package day05;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {
		// Kullan�c�dan 6 basamakl� say� al�p rakamlar toplam�n� bulunuz
		
		Scanner scan =new Scanner(System.in);
		System.out.println("L�tfen 6 basamakl� bir say� giriniz:");
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
		
		rakam=say�%10; 
		rakamlarToplam�+=rakam; 
		say�/=10;
		
		rakam=say�%10; 
		rakamlarToplam�+=rakam; 
		say�/=10;
	System.out.println("Rakamlar Toplam� : "+rakamlarToplam�);
		
	scan.close();	
	}

}
