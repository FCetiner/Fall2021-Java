package day09__nestedifElseStatements;

import java.util.Scanner;

public class C01_nestedİfElse {

	public static void main(String[] args) {
		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		// Kullanicidan bir sifre girmesini isteyin
		 //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. 
		 //Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
		 //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. 
		//Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir şifre giriniz:");
		char ilkKarakter =scan.next().charAt(0);
		
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') { //Büyük harfleri seçmiş olacak
			if (ilkKarakter=='A') {
				System.out.println("Geçerli şifre");
			} else {
				System.out.println("Geçersiz şifre");
			};
		} else if(ilkKarakter>='a' && ilkKarakter<='z'){ //küşük harfleri seçer
			if (ilkKarakter=='z') {
				System.out.println("Geçerli şifre");
			} else {
				System.out.println("Geçersiz şifre");
			};
			
		}else {  //harfler dışında geriye kalan tüm karakterler
			
		System.out.println("Geçerli şifre olması için harf ile başlayınız");	

		scan.close();
		}
		
	}

}
