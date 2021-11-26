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
		System.out.println("Lütfen isim ve soyisim girin\nisimden sonra enter'a basýn");
		String isim=scan.next();
		String soyisim=scan.next();
		
		System.out.println("Ýsminizin açýk þekilde yazýlmasýný istiyorsanýz 1 \n"
				+"Ýlk harf hariç gizli yazýlmasýný istiyorsanýz 2'yi seçin");
		int tercih = scan.nextInt();
		//bu satýra kadar kullanýcýdan ismini soyadýný ve tercihini aldýk	
		String birleþmiþIsim=null; //Ferhat ÇETÝNER , F**** Ç**** olacak
		
		if (tercih==1) {
			birleþmiþIsim=acýkIsim(isim, soyisim);
		} else if(tercih==2){
			birleþmiþIsim=isimGizle(isim, soyisim);
		} else {
			System.out.println("Geçerli bir tercih yapýnýz");
		}
	
		//Bu satýrdan itibaren kullanýcýnýn isim ve soyismi kullanýcý tercihine baðlý olarak
		//kaydedildi,
		
		System.out.println("Kullanýcýnýn tercihi : " + birleþmiþIsim);
		
		
		scan.close();
	}

	public static String isimGizle(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim + " " + soyisim;
	}

	public static String acýkIsim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim= soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim + " " + soyisim;
				
	}

}
