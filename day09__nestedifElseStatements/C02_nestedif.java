package day09__nestedifElseStatements;

import java.util.Scanner;

public class C02_nestedif {

	public static void main(String[] args) {
		// Soru12)Kullanýcýdan 4 basamakli bir sayi girmesini isteyin.
		//Girdiði sayi 5’e  bölünüyorsa son rakamýný kontrol edin.
		//Son rakamý 0 ise ekrana “5’e bölünen  çift sayý” yazdýrýn. 
		//Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.  
		//Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Dört basamaklý sayý giriniz:");
		int sayý = scan.nextInt();
		
		if (sayý<1000 || sayý>9999) {
			System.out.println("Lütfen 4 basamaklý pozitif sayý girmelisiniz.");
		} else 
			if(sayý%5==0){ //5e tam bölünenler
				if (sayý%10==0) { //son rakam 0
					System.out.println("5'e bölünen çift sayý");
				} else {	//son rakam 5
					System.out.println("5'e bölünen tek sayý");
				}
			
			} else 	//beþe tam bölünemeyenler
			System.out.println("Tekrar deneyin");
		
		
		scan.close();
		
	}

}
