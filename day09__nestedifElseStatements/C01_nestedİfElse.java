package day09__nestedifElseStatements;

import java.util.Scanner;

public class C01_nested�fElse {

	public static void main(String[] args) {
		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		// Kullanicidan bir sifre girmesini isteyin
		 //Eger ilk harf buyuk harf ise �A� olup olmadigini kontrol edin. 
		 //Ilk harf A ise  �Gecerli Sifre�  degilse �Gecersiz Sifre� yazdirin.
		 //Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. 
		//Ilk harf z ise  �Gecerli Sifre�  degilse �Gecersiz Sifre� yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir �ifre giriniz:");
		char ilkKarakter =scan.next().charAt(0);
		
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') { //B�y�k harfleri se�mi� olacak
			if (ilkKarakter=='A') {
				System.out.println("Ge�erli �ifre");
			} else {
				System.out.println("Ge�ersiz �ifre");
			};
		} else if(ilkKarakter>='a' && ilkKarakter<='z'){ //k���k harfleri se�er
			if (ilkKarakter=='z') {
				System.out.println("Ge�erli �ifre");
			} else {
				System.out.println("Ge�ersiz �ifre");
			};
			
		}else {  //harfler d���nda geriye kalan t�m karakterler
			
		System.out.println("Ge�erli �ifre olmas� i�in harf ile ba�lay�n�z");	

		scan.close();
		}
		
	}

}
