package day19_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		
		//for loop ile yapal�m
			
		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen say� giriniz");
		int say� = scan.nextInt(); //123 data turu int
		
		int rakamlarToplami=0;
		int rakam=0;
		
		String say�Str= ""+say�; //123 data turu String
		//int olarak verilen bir say�n�n basamak say�s�n� bulmak istersek
		//k�sa yoldan o say�y� Stringe cevirip, str.lenght() methodunu kullanabiliriz
		
		for (int i = 0; i < say�Str.length() ; i++) {
			rakam=say�%10;
			rakamlarToplami+=rakam;
			say�/=10;
		}
		System.out.println("girdi�iniz say�n�n rakamlar toplam�: " +rakamlarToplami);

		scan.close();

	}

}
