package day15_methodCreation;

import java.util.Scanner;

public class C01_methodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri
		//   ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		// Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
		//   kalan harfler * olacak sekilde birlestirsin
				
		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin
	
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen isim ve soyisim girin\nisimden sonra enter'a bas�n");
		String isim=scan.next();
		String soyisim=scan.next();
		
		System.out.println("�sminizin a��k �ekilde yaz�lmas�n� istiyorsan�z 1 \n"
				+"�lk harf hari� gizli yaz�lmas�n� istiyorsan�z 2'yi se�in");
		int tercih = scan.nextInt();
		//bu sat�ra kadar kullan�c�dan ismini soyad�n� ve tercihini ald�k	
		String birle�mi�Isim=null; //Ferhat �ET�NER , F**** �**** olacak
		
		if (tercih==1) {
			birle�mi�Isim=ac�kIsim(isim, soyisim);
		} else if(tercih==2){
			birle�mi�Isim=isimGizle(isim, soyisim);
		} else {
			System.out.println("Ge�erli bir tercih yap�n�z");
		}
	
		//Bu sat�rdan itibaren kullan�c�n�n isim ve soyismi kullan�c� tercihine ba�l� olarak
		//kaydedildi,
		
		System.out.println("Kullan�c�n�n tercihi : " + birle�mi�Isim);
		
		
		scan.close();
	}

	public static String isimGizle(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim + " " + soyisim;
	}

	public static String ac�kIsim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim= soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim + " " + soyisim;
				
	}

}
