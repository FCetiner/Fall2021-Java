package day31_dateAndTime;

import java.time.LocalTime;

public class C02_LocalTime {

	public static void main(String[] args) {


		LocalTime saat = LocalTime.now();
		
		System.out.println("baslang�c saati " +saat); //23:03:10.724682500
		
		@SuppressWarnings("unused")
		int say�=10;
		
		for (int i = 0; i < 10000; i++) {
			say�++;
		}
		LocalTime saat2 = LocalTime.now();
		System.out.println("biti� saati " +saat2);
		
		//E�er bir i�lemin ba�lang�� ve biti� zaman�n� kaydetmek istiyorsak
		//Hem ba��nda hem de sonunda Localtime objesi olu�turmal�y�z
				
		double nano1=saat.getNano();
		double nanobitis=saat2.getNano();
		System.out.println("for loop " + (nano1+nanobitis) + " nano saniyede tamamland�");
		
		
		
		
		
	}

}
