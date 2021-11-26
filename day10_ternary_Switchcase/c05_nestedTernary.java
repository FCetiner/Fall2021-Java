package day10_ternary_Switchcase;

public class c05_nestedTernary {

	public static void main(String[] args) {
		// Eðer çalýþan kadýnsa 60 yaþýndan büyük olduðunda emekli olabilir,
		// Çalýþan erkekse 65 yaþýndan büyükse emekli olabilir.

		
		//her seferinde scanner oluþturmak yerine
		//test datalarýmýzý veriable olarak da oluþturabiliriz
		//ve kod yazýmý bittiðinde test datalarýný deðiþtirerek 
		//kodlarýmýzý test edebiliriz
		
		
		char cinsiyet ='K';
		int yas = 57; 
		
		String sonuc = cinsiyet == 'K' ? ( yas>60 ? "Emekli olabilirsin :" :"Emekli olamazsýn" ) : 
										 (yas>65 ? "Emekli olabilirsin :" :"Emekli olamazsýn") ;
		
		System.out.println(sonuc);
		
		
	}

}
