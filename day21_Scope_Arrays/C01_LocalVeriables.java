package day21_Scope_Arrays;

public class C01_LocalVeriables {
	
	String okulIsmi;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Java local veriable'lara default deðer atamasý yapmaz
		//Kodlarýmýzda sorun yaþamamak için 
		// oluþturduðumuz local veriable lara uygun bir deðer atamamýzda fayda var
		
		int sayi=0; // int sayi; dersek java CTE veriyor
		System.out.println(sayi);

		//int sayi;	// bir local'de ayný isimde birden fazla veriable oluþturulamaz
		//String sayi;	//data türü farklý olsa da java buna izin vermez
		String isim="Ali";
		
		
	}

	public static void staticMethod() {
	//sayi; 	//bir local'de oluþturulan veriable (methodlarýn static olup olmamasýna 
				//baðlý olmaksýzýn) farklý local'de kullanýlamaz
		@SuppressWarnings("unused")
		String isim="Veli";
		
		
		
	}
	
	
}
