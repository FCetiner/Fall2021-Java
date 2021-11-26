package day08_if_else_statements;

import java.util.Scanner;

public class C05_ifElseif {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
		//sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
		//isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
		//sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen iki sayız yazınız \n ilk sayıdan sonra entere basınız");
	double sayı1 = scan.nextDouble();
	double sayı2 = scan.nextDouble();
	
	if (sayı1>0 && sayı2>0) {
		System.out.println("sayıların toplamı:" + (sayı1+sayı2));
	} else if (sayı1<0 && sayı2<0){
		System.out.println("sayıların çarpımı:" + sayı1*sayı2);
	} else if (sayı1*sayı2<0){
		System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
	}else {
		System.out.println("sifir carpmaya gore yutan elemandir");
	}
	scan.close();
}
}