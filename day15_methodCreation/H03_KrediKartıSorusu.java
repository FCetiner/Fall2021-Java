package day15_methodCreation;

import java.util.Scanner;

public class H03_KrediKart�Sorusu {

	public static void main(String[] args) {
		/*Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin. 
		 * Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde, 
		 * KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yazin, 
		 * ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("�sminizi giriniz:");
		String isim = scan.next();
		
		System.out.println("Soyisminizi giriniz:");
		String soyisim = scan.next();
		
		System.out.println("16 haneli Kredi kart� numaran�z� bo�luk b�rakmadan giriniz:");
		String kart = scan.next();

		System.out.println("�sim ve Soyisim : " + isimbirle�tirme(isim, soyisim) + "\nKredi kart� numaras� : " +
							kkart(kart));
		
		scan.close();
	}

	public static String kkart(String kart) {
		kart = kart.substring(0, 4) + " " + kart.substring(4, 8) + " " + kart.substring(8, 12) + " " +
			   kart.substring(12, 16);
		return kart;
	}

	public static String isimbirle�tirme(String isim, String soyisim) {
		
		isim=  isim.substring(0,1).toUpperCase()+isim.substring(1, isim.length()).toLowerCase();
		soyisim= soyisim.substring(0,1).toUpperCase()+soyisim.substring(1, soyisim.length()).toLowerCase();
		
		return isim+ " " + soyisim;
	}

}
