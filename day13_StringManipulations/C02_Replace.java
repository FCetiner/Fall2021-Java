package day13_StringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 say�s�n�n
		// binden b�y�k olup olmad���n� yazd�r�n

		
		String sonuc = "10.000";
		
		sonuc=sonuc.replace(".", ""); //10000 e cevirip assing ettik
										// = oldugu i�in sonu� kal�c� olarak de�i�ti
		
		if (Integer.valueOf(sonuc)>1000) {
			System.out.println("bulunan sonuc say�s� 1000'den �ok");
		} else {
			System.out.println("bulunan sonuc say�s� 1000'den az");
		}
	

	
	}

}
