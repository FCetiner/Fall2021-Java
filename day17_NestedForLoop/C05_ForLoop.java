package day17_NestedForLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin. 
		//Girilen sayilar ve aralarindaki tum tamsayilaritoplayip,
		//sonucu yazdiran bir program yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz...");
		int sayı1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz");
		int sayı2 = scan.nextInt();
										//tam sayı olma durumunu ekle Double
		int kucuk=0;
		int buyuk=0;

		if (sayı1>sayı2) {
			buyuk=sayı1;
			kucuk=sayı2;
		} else {
			buyuk=sayı2;
			kucuk=sayı1;
		}
		
		int toplam=0;
		
		for (int i = kucuk; i <=buyuk; i++) {
			toplam+=i;	
			}
		
		System.out.println("Girilen sayılar ve aralarındaki toplam:" + toplam);
	
	scan.close();
	}

}
