package day13_StringManipulations;

import java.util.Scanner;

public class C01_Startswith_Endswith {

	public static void main(String[] args) {
		// Kullanýcýdan bir cümle ve bir kelime alýn 
		//verilen cümlenin verilen kelime ile baþlayýp baþlamadýðýný
		// ve bitip bitmediðibi yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("Lütfen bir kelime giriniz");
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("Girilen cümle " + kelime +" ile baþlýyor");
		} else {
			System.out.println("Girilen cümle " + kelime + " ile baþlamýyor");
		}
		
		if (cumle.endsWith(kelime)) {
			System.out.println("Girilen cümle " + kelime +" ile bitiyor");
		} else {
			System.out.println("Girilen cümle " + kelime + " ile bitmiyor");
		}
	
	scan.close();
	
	}

}
