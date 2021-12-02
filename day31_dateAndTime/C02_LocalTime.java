package day31_dateAndTime;

import java.time.LocalTime;

public class C02_LocalTime {

	public static void main(String[] args) {


		LocalTime saat = LocalTime.now();
		
		System.out.println("baslangýc saati " +saat); //23:03:10.724682500
		
		@SuppressWarnings("unused")
		int sayý=10;
		
		for (int i = 0; i < 10000; i++) {
			sayý++;
		}
		LocalTime saat2 = LocalTime.now();
		System.out.println("bitiþ saati " +saat2);
		
		//Eðer bir iþlemin baþlangýç ve bitiþ zamanýný kaydetmek istiyorsak
		//Hem baþýnda hem de sonunda Localtime objesi oluþturmalýyýz
				
		double nano1=saat.getNano();
		double nanobitis=saat2.getNano();
		System.out.println("for loop " + (nano1+nanobitis) + " nano saniyede tamamlandý");
		
		
		
		
		
	}

}
