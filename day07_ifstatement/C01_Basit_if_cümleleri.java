package day07_ifstatement;

import java.util.Scanner;

public class C01_Basit_if_c�mleleri {

	public static void main(String[] args) {
		 /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = �Pazar, Pazartesi veya Persembe�             
            ilkHarf=S output = �Sali�
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen g�n isimlerinden birinin harfini yaz�n�z");
		//kullan�c�n�n girdi�i verinin tamam�n� k���k harf veya b�y�k harf yapabiliriz
		//Scan.next ten sonra to upperCase yazarsak kelimeyi b�y�k harfe
		//to LowerCase yazarsak kelimenin tamam�n� k���k harfe �eviririz
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("Pazar, Pazartesi veya Per�embe");
		}
		
		if (ilkHarf=='S') {
			System.out.println("Sal�");
		}
		
		if (ilkHarf=='C') {
				System.out.println("Car�amba, Cuma veya Cumartesi");
			}
		
		 if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {
	            System.out.println("Gecersiz harf girdiniz .Lutfen gun isimlerinden birinin basharfini yazin");
	        }
		
		
		scan.close();
		
		}
		
		
		
	}
