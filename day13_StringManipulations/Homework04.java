package day13_StringManipulations;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�sminizi girin");
		String isim = scan.next();
		
		System.out.println("Soyisminizi girin");
		String soyisim = scan.next();
	
		if (isim.length()==soyisim.length()) {
			System.out.println("�sminiz ve soyisminiz e�it");
		} else if(isim.length()>soyisim.length()) {
			 System.out.println("�sminiz daha uzun");	
		} else {
			System.out.println("Soyisminiz daha uzun");
		}
	scan.close();
	}

}
