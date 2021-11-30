package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		//Main method'dan diðer methodlara veya diðer methodlardan main methoda
		//bir veriable gönderirseniz Java orjinal veriable'larý deðil
		//onlarýn deðerlerini(value) götürür, orjinal veriable deðeri deðiþmez
		

		int fiyat = 100;

		System.out.println(indirimYap25(fiyat)); //75
		System.out.println("method'dan sonra main method'daki fiyat : " + fiyat); // 100
		
		//indirimi kalýcý yapmak istiyorsanýz main method'da atama yapmamýz gerekir
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