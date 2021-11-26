package day13_StringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 sayýsýnýn
		// binden büyük olup olmadýðýný yazdýrýn

		
		String sonuc = "10.000";
		
		sonuc=sonuc.replace(".", ""); //10000 e cevirip assing ettik
										// = oldugu için sonuç kalýcý olarak deðiþti
		
		if (Integer.valueOf(sonuc)>1000) {
			System.out.println("bulunan sonuc sayýsý 1000'den çok");
		} else {
			System.out.println("bulunan sonuc sayýsý 1000'den az");
		}
	

	
	}

}
