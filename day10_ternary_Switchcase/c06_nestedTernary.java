package day10_ternary_Switchcase;

public class c06_nestedTernary {

	public static void main(String[] args) {
		// Soru2 : Verilen karakteri inceleyin
		// kucuk harf ise consola “Kucuk Harf” ,
		// buyuk harfse consola “Buyuk Harf”
		// yoksa “girdiginiz karakter harf degil” yazdirin.
		
		char krk = ',';
		
		String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" :
			((krk>= 'A' && krk<='Z') ? "Büyük Harf" : "girilen karakter harf deðil"); //þart yanlýþ ise sonuç
		
		System.out.println(sonuc);
		
	
	
	}

}
