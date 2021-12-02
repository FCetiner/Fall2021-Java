package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C04_DateTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// bir string ve bir int veriable oluþturalým
		// bir loop içerisinde bu veriablelarý 1000 kere deðiþtirelim
		// ve iþlem sürelerini kýyaslayalým

		// verilen iki dogum tarihlerinin hangisinin daha önce oldugunu bulunuz

		LocalTime saatS = LocalTime.now();

		System.out.println("baslangýc saati " + saatS); // 23:03:10.724682500

		String str= "Celil";

		for (int i = 0; i < 10000; i++) {
			str+=" ";
		}
		LocalTime saatBitisS = LocalTime.now();
		System.out.println("bitiþ saati " + saatBitisS);

		double nanoS = saatS.getNano();
		double nanobitisS = saatBitisS.getNano();
		System.out.println("for loop " + (nanobitisS-nanoS ) + " nano saniyede tamamlandý");

		LocalTime saat = LocalTime.now();
		System.out.println("baslangýc saati " + saat); // 23:03:10.724682500

		int sayý = 10;

		for (int i = 0; i < 10000; i++) {
			sayý++;
		}
		LocalTime saatBitis = LocalTime.now();
		System.out.println("bitiþ saati " + saatBitis);

		double nano1 = saat.getNano();
		double nanobitis = saatBitis.getNano();
		System.out.println("for loop " + (nanobitis-nano1 ) + " nano saniyede tamamlandý");

		
		double strSure = (nanobitisS-nanoS );
		double intSure=(nanobitis-nano1 );
		
		System.out.println("int String'den " + (strSure-intSure) + " nano saniye daha hýzlý bitirdi");
	
		System.out.println(saat.getMinute());//28
		System.out.println(saat.plusMinutes(1000));
		System.out.println(saat.minusHours(30));
		
		LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
	
		System.out.println(yerelSaat);
	
	
	
	
	
	}

}
