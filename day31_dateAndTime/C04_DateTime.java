package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C04_DateTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// bir string ve bir int veriable olu�tural�m
		// bir loop i�erisinde bu veriablelar� 1000 kere de�i�tirelim
		// ve i�lem s�relerini k�yaslayal�m

		// verilen iki dogum tarihlerinin hangisinin daha �nce oldugunu bulunuz

		LocalTime saatS = LocalTime.now();

		System.out.println("baslang�c saati " + saatS); // 23:03:10.724682500

		String str= "Celil";

		for (int i = 0; i < 10000; i++) {
			str+=" ";
		}
		LocalTime saatBitisS = LocalTime.now();
		System.out.println("biti� saati " + saatBitisS);

		double nanoS = saatS.getNano();
		double nanobitisS = saatBitisS.getNano();
		System.out.println("for loop " + (nanobitisS-nanoS ) + " nano saniyede tamamland�");

		LocalTime saat = LocalTime.now();
		System.out.println("baslang�c saati " + saat); // 23:03:10.724682500

		int say� = 10;

		for (int i = 0; i < 10000; i++) {
			say�++;
		}
		LocalTime saatBitis = LocalTime.now();
		System.out.println("biti� saati " + saatBitis);

		double nano1 = saat.getNano();
		double nanobitis = saatBitis.getNano();
		System.out.println("for loop " + (nanobitis-nano1 ) + " nano saniyede tamamland�");

		
		double strSure = (nanobitisS-nanoS );
		double intSure=(nanobitis-nano1 );
		
		System.out.println("int String'den " + (strSure-intSure) + " nano saniye daha h�zl� bitirdi");
	
		System.out.println(saat.getMinute());//28
		System.out.println(saat.plusMinutes(1000));
		System.out.println(saat.minusHours(30));
		
		LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
	
		System.out.println(yerelSaat);
	
	
	
	
	
	}

}
