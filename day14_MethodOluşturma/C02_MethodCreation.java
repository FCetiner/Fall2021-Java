package day14_MethodOluþturma;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// kullanýcýdan iki sayý isteyin
		//sayýlarýn karelerini ve küplerini toplayýp yazdýran iki ayrý method yazýn
		//kullanýcýya us sorun
		//2 yazarsa kareleri toplamýný yapan method
		//3 yazarsa küpler toplamýný yazan method çalýþsýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz:");
		double sayý1 = scan.nextDouble();
		System.out.println("Lütfen bir sayý giriniz:");
		double sayý2 = scan.nextDouble();
	
		System.out.println("Girilen sayýlarýn kareler toplamýný istiyorsanýz 2 \n"
						+"küpler toplamý için 3 seçin");
		int secim=scan.nextInt();
		
		switch(secim) {
		case 2:
			kareTopla(sayý1, sayý2);
			break;
		case 3:
			kupTopla(sayý1, sayý2);
			break;
		default:
			System.out.println("Lütfen istenen tercihlerden birini yapýn.");
		}

	
	scan.close();
	
	
	}

	public static void kupTopla(double sayý1, double sayý2) {
		double küplerToplamý = sayý1*sayý1*sayý1+sayý2*sayý2*sayý2;
		System.out.println("Girilen sayýlarýn küpleri toplamý=" + küplerToplamý);
	}

	public static void kareTopla(double sayý1, double sayý2) {
		double karelerToplamý= sayý1*sayý1+sayý2*sayý2;
		System.out.println("Girilen sayýlarýn kareleri toplamý=" + karelerToplamý);
		
	}

	

}