package day21_Scope_Arrays;

public class C02_LoopVeriables {

	public static void main(String[] args) {
		
		int sayi=10;
		
		for (int i = 0; i < 6; i++) {
			String isim="Ali";
			System.out.println(sayi+" " + isim);
		}

		//	System.out.println(isim);
		//	System.out.println(i);
		// Loop i�erisinde olu�turulan veriable'lar loop d���nda kullan�lamazlar
		// Bunun i�in loop d���nda da ihtiyac�m�z olan bir de�i�ken varsa
		//loop'dan once olu�turur ve emniyette kalmak i�in initalize yapar�z
		
		
		
		for (int i = 0; i < 10; i++) {
			//int sayi=20; sayi veriable i main methodun i�inde olu�turuldu�undan t�m main method'da
			//ge�erlidir, dolay�s� ile yeniden ayn� isimde bir veriable olu�turamazs�n�z
			@SuppressWarnings("unused")
			String isim="veli";
			
			
		}
		
		
	}

}
