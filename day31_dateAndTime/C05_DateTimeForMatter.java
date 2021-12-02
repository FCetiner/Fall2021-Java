package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeForMatter {

	public static void main(String[] args) {

		LocalDateTime tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat);//2021-12-02T23:44:31.577649200
		
		//Eðer tarih veya saati kendi istediðimiz biçimde yazdýrmak istersek
		//gün / ay / yýl saat:dakika
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd/MM/YYYY EEEE HH.mm a");
		
		System.out.println(duzenle.format(tarihSaat)); 
		/*
		 format oluþtrurken 
		 Gün
		 d: baþta 0 varsa onu yazmadan gun numarasý
		 dd: tek haneli gunleri 01 gibi baþýna sýfýr yazarak gün numarasý
		 DDD: yýlýn kacýncý günü
		 E, EE, EEE: gün isminin ilk 3 harfi
		 EEEE: gün isminin tamamýný
		 
		 AY (Ay için M, dakika için m kullanýlýr)
		 M: baþta 0 varsa onu yazmadan ay numarasý
		 MM: tek haneli gunleri 01 gibi baþýna sýfýr yazarak ay numarasý
		 MMM: yazarsak Ay isminin ilk 3 harfi olur 
		 MMMM: Ay isminin tamamýný
		
		YY: Yýlýn son iki rakamýný
		YYYY: Yýlýn tamamýný 
		
		Saat (24 saat uzerinden istiyorsak H, 12 saat üzerinden istiyorsak h)
		
		HH : saatin tamamý, tek rakamlý saat olursa 02 gibi
		H : tek rakamlý saat olursa sadece saati
		
		a yazarsak AM PM
		
		*/
		
		

	}

}
