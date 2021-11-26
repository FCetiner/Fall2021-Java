package day19_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		
		//for loop ile yapalým
			
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen sayý giriniz");
		int sayý = scan.nextInt(); //123 data turu int
		
		int rakamlarToplami=0;
		int rakam=0;
		
		String sayýStr= ""+sayý; //123 data turu String
		//int olarak verilen bir sayýnýn basamak sayýsýný bulmak istersek
		//kýsa yoldan o sayýyý Stringe cevirip, str.lenght() methodunu kullanabiliriz
		
		for (int i = 0; i < sayýStr.length() ; i++) {
			rakam=sayý%10;
			rakamlarToplami+=rakam;
			sayý/=10;
		}
		System.out.println("girdiðiniz sayýnýn rakamlar toplamý: " +rakamlarToplami);

		scan.close();

	}

}
