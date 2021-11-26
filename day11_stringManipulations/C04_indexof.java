package day11_stringManipulations;

public class C04_indexof {

	public static void main(String[] args) {
		// parametre olarak girilen bir char veya stringin
		// ilk index'ini verir
		
		String str = "Cal�s�rsan�z, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s')); //4 veriri
		System.out.println(str.indexOf("J")); // 14
		
		int index=str.indexOf("r");  //indexOf methodu her zaman int de�er d�ner
		System.out.println(index);  // 6
		
		System.out.println(str.indexOf('q')); // -1
		
		//e�er bir stringin index de�eri olarak -1 gelirse o Stringin olmad���n� anlar�z
		
		//Bir string i�inde olmayan bir karakter veya kelime ararsak java -1 sonucunu d�nd�r�r
		
		System.out.println(str.indexOf('A')); // -1 case sensitive
		
		System.out.println(str.indexOf("Java")); //14 sat�rdan itibaren 
		
		System.out.println(str.indexOf('a',11)); //a y� 11. indexten sonra ara
		
		//arad���m�z CharSquence anlaml� veya anlams�z kelime olabilir
		//Bu durumda o paketin ba�lang��  indexini verir
		
	
	
	}

}
