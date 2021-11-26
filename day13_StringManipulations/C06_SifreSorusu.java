package day13_StringManipulations;

import java.util.Scanner;

public class C06_SifreSorusu {

	public static void main(String[] args) {
		// Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin 
		//ve asagidaki gibi yazdirin
		//isim soyisim M***** B*******
		//kart no 1234 **** **** ****

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ýsminizi girin:");
		String isim = scan.next();
		
		System.out.println("Soyisminizi girin:");
		String soyIsim = scan.next();
		
		System.out.println("Kart no giriniz:");
		String kart = scan.next();
		
		String isimFormatlý=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		String soyIsimFormatlý=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w", "*");
		String kartFromatlý = "**** **** ****" + kart.substring(12);
		
		System.out.println("isim-soyisim  :  " + isimFormatlý + " " + soyIsimFormatlý);
		System.out.println("Kart no : " +  kartFromatlý);
	
	scan.close();
	}

}
