package day11_stringManipulations;

public class C04_indexof {

	public static void main(String[] args) {
		// parametre olarak girilen bir char veya stringin
		// ilk index'ini verir
		
		String str = "Calýsýrsanýz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s')); //4 veriri
		System.out.println(str.indexOf("J")); // 14
		
		int index=str.indexOf("r");  //indexOf methodu her zaman int deðer döner
		System.out.println(index);  // 6
		
		System.out.println(str.indexOf('q')); // -1
		
		//eðer bir stringin index deðeri olarak -1 gelirse o Stringin olmadýðýný anlarýz
		
		//Bir string içinde olmayan bir karakter veya kelime ararsak java -1 sonucunu döndürür
		
		System.out.println(str.indexOf('A')); // -1 case sensitive
		
		System.out.println(str.indexOf("Java")); //14 satýrdan itibaren 
		
		System.out.println(str.indexOf('a',11)); //a yý 11. indexten sonra ara
		
		//aradýðýmýz CharSquence anlamlý veya anlamsýz kelime olabilir
		//Bu durumda o paketin baþlangýç  indexini verir
		
	
	
	}

}
