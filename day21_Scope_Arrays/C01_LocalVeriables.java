package day21_Scope_Arrays;

public class C01_LocalVeriables {
	
	String okulIsmi;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Java local veriable'lara default de�er atamas� yapmaz
		//Kodlar�m�zda sorun ya�amamak i�in 
		// olu�turdu�umuz local veriable lara uygun bir de�er atamam�zda fayda var
		
		int sayi=0; // int sayi; dersek java CTE veriyor
		System.out.println(sayi);

		//int sayi;	// bir local'de ayn� isimde birden fazla veriable olu�turulamaz
		//String sayi;	//data t�r� farkl� olsa da java buna izin vermez
		String isim="Ali";
		
		
	}

	public static void staticMethod() {
	//sayi; 	//bir local'de olu�turulan veriable (methodlar�n static olup olmamas�na 
				//ba�l� olmaks�z�n) farkl� local'de kullan�lamaz
		@SuppressWarnings("unused")
		String isim="Veli";
		
		
		
	}
	
	
}
