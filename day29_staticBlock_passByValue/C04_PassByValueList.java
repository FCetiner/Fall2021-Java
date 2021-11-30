package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		
		//bir list oluþturalým
		//sonra list elemanlarýný deðiþtir methodu yazýp orada
		//list elemanlarýndan bazýlarýný deðiþtirelim
		//method void olsun
		//main methoda döndükten sonra yeniden listi yazdýralým
		
		List <String> harfler = new ArrayList<> ();
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
	
		
		listElemanlarDegistir(harfler);
		System.out.println("Main Method'a dönünce : " + harfler); //[D, B, C]

		//Java'da List ve Array gibi objeler içinde pass By Value geçerlidir
		//Yani farklý bir methodda array veya list'e yeni deðer atamasý yaparsanýz
		//orjinal array veya list deðiþmez
		
		
		listDegistir(harfler); // method'da yeni deðer atadýðým halde harfler listesi deðiþmedi
		System.out.println("Liste yeni list atadýktan sonra main methoda dönünce : " + harfler); //[D, B, C]

		
	}

	private static void listDegistir(List<String> harfler) {
		harfler = new ArrayList <> ();
		System.out.println("Liste yeni deðer atayýnca : " + harfler);
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {

		harfler.set(0, "D");
		System.out.println("Method'da deðiþtirdiðimiz List : " + harfler);
		
		
		
	}

}
