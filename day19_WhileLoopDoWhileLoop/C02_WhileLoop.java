package day19_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		//  Kullanicidan bir sayi alin 
		//ve bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen sayý giriniz");
		int sayý = scan.nextInt();
		
		//ctrl+shift+f  parantezleri düzenler
		int rakamlarToplami=0;  
		int rakam=0;
		
		while (sayý>0) {
			rakam=sayý%10;
			rakamlarToplami+=rakam;
			sayý/=10;
		}
	System.out.println("girdiðiniz sayýnýn rakamlar toplamý: " +rakamlarToplami);
	
	scan.close();
	}

}
