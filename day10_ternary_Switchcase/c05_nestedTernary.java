package day10_ternary_Switchcase;

public class c05_nestedTernary {

	public static void main(String[] args) {
		// E�er �al��an kad�nsa 60 ya��ndan b�y�k oldu�unda emekli olabilir,
		// �al��an erkekse 65 ya��ndan b�y�kse emekli olabilir.

		
		//her seferinde scanner olu�turmak yerine
		//test datalar�m�z� veriable olarak da olu�turabiliriz
		//ve kod yaz�m� bitti�inde test datalar�n� de�i�tirerek 
		//kodlar�m�z� test edebiliriz
		
		
		char cinsiyet ='K';
		int yas = 57; 
		
		String sonuc = cinsiyet == 'K' ? ( yas>60 ? "Emekli olabilirsin :" :"Emekli olamazs�n" ) : 
										 (yas>65 ? "Emekli olabilirsin :" :"Emekli olamazs�n") ;
		
		System.out.println(sonuc);
		
		
	}

}
