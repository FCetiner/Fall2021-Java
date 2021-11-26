package day08_if_else_statements;

import java.util.Scanner;

public class C05_ifElseif {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
		//sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
		//isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin,
		//sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir� yazdirin.
	
	Scanner scan = new Scanner(System.in);
	System.out.println("L�tfen iki say�z yaz�n�z \n ilk say�dan sonra entere bas�n�z");
	double say�1 = scan.nextDouble();
	double say�2 = scan.nextDouble();
	
	if (say�1>0 && say�2>0) {
		System.out.println("say�lar�n toplam�:" + (say�1+say�2));
	} else if (say�1<0 && say�2<0){
		System.out.println("say�lar�n �arp�m�:" + say�1*say�2);
	} else if (say�1*say�2<0){
		System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
	}else {
		System.out.println("sifir carpmaya gore yutan elemandir");
	}
	scan.close();
}
}