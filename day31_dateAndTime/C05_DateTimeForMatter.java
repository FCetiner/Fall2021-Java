package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeForMatter {

	public static void main(String[] args) {

		LocalDateTime tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat);//2021-12-02T23:44:31.577649200
		
		//E�er tarih veya saati kendi istedi�imiz bi�imde yazd�rmak istersek
		//g�n / ay / y�l saat:dakika
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd/MM/YYYY EEEE HH.mm a");
		
		System.out.println(duzenle.format(tarihSaat)); 
		/*
		 format olu�trurken 
		 G�n
		 d: ba�ta 0 varsa onu yazmadan gun numaras�
		 dd: tek haneli gunleri 01 gibi ba��na s�f�r yazarak g�n numaras�
		 DDD: y�l�n kac�nc� g�n�
		 E, EE, EEE: g�n isminin ilk 3 harfi
		 EEEE: g�n isminin tamam�n�
		 
		 AY (Ay i�in M, dakika i�in m kullan�l�r)
		 M: ba�ta 0 varsa onu yazmadan ay numaras�
		 MM: tek haneli gunleri 01 gibi ba��na s�f�r yazarak ay numaras�
		 MMM: yazarsak Ay isminin ilk 3 harfi olur 
		 MMMM: Ay isminin tamam�n�
		
		YY: Y�l�n son iki rakam�n�
		YYYY: Y�l�n tamam�n� 
		
		Saat (24 saat uzerinden istiyorsak H, 12 saat �zerinden istiyorsak h)
		
		HH : saatin tamam�, tek rakaml� saat olursa 02 gibi
		H : tek rakaml� saat olursa sadece saati
		
		a yazarsak AM PM
		
		*/
		
		

	}

}
