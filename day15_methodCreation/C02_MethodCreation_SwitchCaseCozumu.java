package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation_SwitchCaseCozumu {

	public static void main(String[] args) {
		/*
		 * Kullaniciya kac sayi toplamak istedigini sorun.
		 *  Kullanici 2,3 veya 4 degerini girerse,
		 *  kullanicidan bu sayilari girmesini isteyin
		 *   ve sayilarin toplamini yazdirin. 
		 *   Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
		 *    “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen toplamak istediðiniz sayý adedini 2,3 veya 4 olarak seçin");
		int tercih=scan.nextInt();
		
		if (tercih>4) {
			tercih=5;
		}
		
		
		
		switch(tercih) {
		
		case 2:
			ikiSayýTopla();
			break;
		case 3:
			ucSayýTopla();
			break;
		case 4:
			dortSayýTopla();
			break;
		case 5:
			System.out.println("Çok sayý girdin ben toplayamam");
			break;
		default:
			System.out.println("geçersiz tercih");
		}
		scan.close();
	}

	private static void dortSayýTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen toplamak istediðiniz sayýlarý arka arkaya girin");
		int sayý1=scan.nextInt();
		int sayý2 = scan.nextInt();
		int sayý3 = scan.nextInt();
		int sayý4 = scan.nextInt();
		System.out.println("Girdiðiniz sayýlarýn toplamý :" +(sayý1+sayý2+sayý3+sayý4));
		scan.close();
	}

	private static void ucSayýTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen toplamak istediðiniz sayýlarý arka arkaya girin");
		int sayý1=scan.nextInt();
		int sayý2 = scan.nextInt();
		int sayý3 = scan.nextInt();
		System.out.println("Girdiðiniz sayýlarýn toplamý :" + (sayý1+sayý2+sayý3));
		scan.close();
	}

	private static void ikiSayýTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen toplamak istediðiniz sayýlarý arka arkaya girin");
		int sayý1=scan.nextInt();
		int sayý2 = scan.nextInt();
		System.out.println("Girdiðiniz sayýlarýn toplamý : " + (sayý1+sayý2));
		
	scan.close();
	
	}

}
