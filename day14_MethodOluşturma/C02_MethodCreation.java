package day14_MethodOlu�turma;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// kullan�c�dan iki say� isteyin
		//say�lar�n karelerini ve k�plerini toplay�p yazd�ran iki ayr� method yaz�n
		//kullan�c�ya us sorun
		//2 yazarsa kareleri toplam�n� yapan method
		//3 yazarsa k�pler toplam�n� yazan method �al��s�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz:");
		double say�1 = scan.nextDouble();
		System.out.println("L�tfen bir say� giriniz:");
		double say�2 = scan.nextDouble();
	
		System.out.println("Girilen say�lar�n kareler toplam�n� istiyorsan�z 2 \n"
						+"k�pler toplam� i�in 3 se�in");
		int secim=scan.nextInt();
		
		switch(secim) {
		case 2:
			kareTopla(say�1, say�2);
			break;
		case 3:
			kupTopla(say�1, say�2);
			break;
		default:
			System.out.println("L�tfen istenen tercihlerden birini yap�n.");
		}

	
	scan.close();
	
	
	}

	public static void kupTopla(double say�1, double say�2) {
		double k�plerToplam� = say�1*say�1*say�1+say�2*say�2*say�2;
		System.out.println("Girilen say�lar�n k�pleri toplam�=" + k�plerToplam�);
	}

	public static void kareTopla(double say�1, double say�2) {
		double karelerToplam�= say�1*say�1+say�2*say�2;
		System.out.println("Girilen say�lar�n kareleri toplam�=" + karelerToplam�);
		
	}

	

}