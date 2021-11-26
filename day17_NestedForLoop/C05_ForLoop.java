package day17_NestedForLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin. 
		//Girilen sayilar ve aralarindaki tum tamsayilaritoplayip,
		//sonucu yazdiran bir program yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz...");
		int say�1 = scan.nextInt();
		System.out.println("�kinci say�y� giriniz");
		int say�2 = scan.nextInt();
										//tam say� olma durumunu ekle Double
		int kucuk=0;
		int buyuk=0;

		if (say�1>say�2) {
			buyuk=say�1;
			kucuk=say�2;
		} else {
			buyuk=say�2;
			kucuk=say�1;
		}
		
		int toplam=0;
		
		for (int i = kucuk; i <=buyuk; i++) {
			toplam+=i;	
			}
		
		System.out.println("Girilen say�lar ve aralar�ndaki toplam:" + toplam);
	
	scan.close();
	}

}
