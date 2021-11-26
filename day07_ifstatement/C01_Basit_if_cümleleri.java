package day07_ifstatement;

import java.util.Scanner;

public class C01_Basit_if_cümleleri {

	public static void main(String[] args) {
		 /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen gün isimlerinden birinin harfini yazýnýz");
		//kullanýcýnýn girdiði verinin tamamýný küçük harf veya büyük harf yapabiliriz
		//Scan.next ten sonra to upperCase yazarsak kelimeyi büyük harfe
		//to LowerCase yazarsak kelimenin tamamýný küçük harfe çeviririz
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("Pazar, Pazartesi veya Perþembe");
		}
		
		if (ilkHarf=='S') {
			System.out.println("Salý");
		}
		
		if (ilkHarf=='C') {
				System.out.println("Carþamba, Cuma veya Cumartesi");
			}
		
		 if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {
	            System.out.println("Gecersiz harf girdiniz .Lutfen gun isimlerinden birinin basharfini yazin");
	        }
		
		
		scan.close();
		
		}
		
		
		
	}
