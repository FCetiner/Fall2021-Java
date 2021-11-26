package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation_SwitchCaseCozumu {

	public static void main(String[] args) {
		/*
		 * Kullaniciya kac sayi toplamak istedigini sorun.
		 *  Kullanici 2,3 veya 4 degerini girerse,
		 *  kullanicidan bu sayilari girmesini isteyin
		 *   ve sayilarin toplamini yazdirin. 
		 *   Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse
		 *    �Cok sayi girdiniz, ben toplayamam� yazdirin.
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen toplamak istedi�iniz say� adedini 2,3 veya 4 olarak se�in");
		int tercih=scan.nextInt();
		
		if (tercih>4) {
			tercih=5;
		}
		
		
		
		switch(tercih) {
		
		case 2:
			ikiSay�Topla();
			break;
		case 3:
			ucSay�Topla();
			break;
		case 4:
			dortSay�Topla();
			break;
		case 5:
			System.out.println("�ok say� girdin ben toplayamam");
			break;
		default:
			System.out.println("ge�ersiz tercih");
		}
		scan.close();
	}

	private static void dortSay�Topla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen toplamak istedi�iniz say�lar� arka arkaya girin");
		int say�1=scan.nextInt();
		int say�2 = scan.nextInt();
		int say�3 = scan.nextInt();
		int say�4 = scan.nextInt();
		System.out.println("Girdi�iniz say�lar�n toplam� :" +(say�1+say�2+say�3+say�4));
		scan.close();
	}

	private static void ucSay�Topla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen toplamak istedi�iniz say�lar� arka arkaya girin");
		int say�1=scan.nextInt();
		int say�2 = scan.nextInt();
		int say�3 = scan.nextInt();
		System.out.println("Girdi�iniz say�lar�n toplam� :" + (say�1+say�2+say�3));
		scan.close();
	}

	private static void ikiSay�Topla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen toplamak istedi�iniz say�lar� arka arkaya girin");
		int say�1=scan.nextInt();
		int say�2 = scan.nextInt();
		System.out.println("Girdi�iniz say�lar�n toplam� : " + (say�1+say�2));
		
	scan.close();
	
	}

}
