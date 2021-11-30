package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		//Main method'dan di�er methodlara veya di�er methodlardan main methoda
		//bir veriable g�nderirseniz Java orjinal veriable'lar� de�il
		//onlar�n de�erlerini(value) g�t�r�r, orjinal veriable de�eri de�i�mez
		

		int fiyat = 100;

		System.out.println(indirimYap25(fiyat)); //75
		System.out.println("method'dan sonra main method'daki fiyat : " + fiyat); // 100
		
		//indirimi kal�c� yapmak istiyorsan�z main method'da atama yapmam�z gerekir
		fiyat=indirimYap10(fiyat); // 90
		
		
		System.out.println("method'dan sonra main method'daki fiyat : " + fiyat); // 100

	}

	private static int indirimYap10(int fiyat) {
		fiyat *= 0.9;

		return fiyat;

	}

	private static int indirimYap25(int fiyat) {
		fiyat *= 0.75;

		return fiyat;

	}
}