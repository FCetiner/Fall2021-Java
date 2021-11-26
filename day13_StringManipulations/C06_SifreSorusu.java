package day13_StringManipulations;

import java.util.Scanner;

public class C06_SifreSorusu {

	public static void main(String[] args) {
		// Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin 
		//ve asagidaki gibi yazdirin
		//isim soyisim M***** B*******
		//kart no 1234 **** **** ****

		Scanner scan = new Scanner(System.in);
		
		System.out.println("�sminizi girin:");
		String isim = scan.next();
		
		System.out.println("Soyisminizi girin:");
		String soyIsim = scan.next();
		
		System.out.println("Kart no giriniz:");
		String kart = scan.next();
		
		String isimFormatl�=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		String soyIsimFormatl�=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w", "*");
		String kartFromatl� = "**** **** ****" + kart.substring(12);
		
		System.out.println("isim-soyisim  :  " + isimFormatl� + " " + soyIsimFormatl�);
		System.out.println("Kart no : " +  kartFromatl�);
	
	scan.close();
	}

}
