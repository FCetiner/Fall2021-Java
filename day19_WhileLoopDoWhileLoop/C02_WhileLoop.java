package day19_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		//  Kullanicidan bir sayi alin 
		//ve bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen say� giriniz");
		int say� = scan.nextInt();
		
		//ctrl+shift+f  parantezleri d�zenler
		int rakamlarToplami=0;  
		int rakam=0;
		
		while (say�>0) {
			rakam=say�%10;
			rakamlarToplami+=rakam;
			say�/=10;
		}
	System.out.println("girdi�iniz say�n�n rakamlar toplam�: " +rakamlarToplami);
	
	scan.close();
	}

}
