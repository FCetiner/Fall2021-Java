package day05;

import java.util.Scanner;

public class C03_Modules {

	public static void main(String[] args) {
		
		//kullan�c�dan 3 basamakl� bir say� al�p rakamlar toplam�n� 
		//yazd�ran bir program yazal�m
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("L�tfen 3 basamakl� bir say� giriniz:");
		int say�=scan.nextInt();
		
			//say� 573 olsun
		
		int rakamlarToplam�=0;
		
		int rakam=say�%10; //bana birler basama��n� verir

		rakamlarToplam�+=rakam; //rakamlar toplam� 3 oldu
		
		//say�m�z hala 573
		//3ten kurtulal�m 3 ile i�imiz bitti
		//say� 57 haline getirin
		
		say�/=10;
	
		//say�m�z art�k 57
		//7 yi nas�l al�r�z
		rakam=say�%10;
		
	rakamlarToplam�+=rakam;
			
	say�/=10;
	rakam=say�%10;
	
	rakamlarToplam�+=rakam;
	System.out.println("Rakamlar Toplam� : "+rakamlarToplam�);
		
	
		
				
		
		scan.close();
		
		
	
	
	
	}

}
