package day10_ternary_Switchcase;

public class c06_nestedTernary {

	public static void main(String[] args) {
		// Soru2 : Verilen karakteri inceleyin
		// kucuk harf ise consola �Kucuk Harf� ,
		// buyuk harfse consola �Buyuk Harf�
		// yoksa �girdiginiz karakter harf degil� yazdirin.
		
		char krk = ',';
		
		String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" :
			((krk>= 'A' && krk<='Z') ? "B�y�k Harf" : "girilen karakter harf de�il"); //�art yanl�� ise sonu�
		
		System.out.println(sonuc);
		
	
	
	}

}
