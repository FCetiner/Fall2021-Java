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
		// Loop içerisinde oluþturulan veriable'lar loop dýþýnda kullanýlamazlar
		// Bunun için loop dýþýnda da ihtiyacýmýz olan bir deðiþken varsa
		//loop'dan once oluþturur ve emniyette kalmak için initalize yaparýz
		
		
		
		for (int i = 0; i < 10; i++) {
			//int sayi=20; sayi veriable i main methodun içinde oluþturulduðundan tüm main method'da
			//geçerlidir, dolayýsý ile yeniden ayný isimde bir veriable oluþturamazsýnýz
			@SuppressWarnings("unused")
			String isim="veli";
			
			
		}
		
		
	}

}
