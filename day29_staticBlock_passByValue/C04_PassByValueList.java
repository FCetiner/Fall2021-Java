package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		
		//bir list olu�tural�m
		//sonra list elemanlar�n� de�i�tir methodu yaz�p orada
		//list elemanlar�ndan baz�lar�n� de�i�tirelim
		//method void olsun
		//main methoda d�nd�kten sonra yeniden listi yazd�ral�m
		
		List <String> harfler = new ArrayList<> ();
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
	
		
		listElemanlarDegistir(harfler);
		System.out.println("Main Method'a d�n�nce : " + harfler); //[D, B, C]

		//Java'da List ve Array gibi objeler i�inde pass By Value ge�erlidir
		//Yani farkl� bir methodda array veya list'e yeni de�er atamas� yaparsan�z
		//orjinal array veya list de�i�mez
		
		
		listDegistir(harfler); // method'da yeni de�er atad���m halde harfler listesi de�i�medi
		System.out.println("Liste yeni list atad�ktan sonra main methoda d�n�nce : " + harfler); //[D, B, C]

		
	}

	private static void listDegistir(List<String> harfler) {
		harfler = new ArrayList <> ();
		System.out.println("Liste yeni de�er atay�nca : " + harfler);
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {

		harfler.set(0, "D");
		System.out.println("Method'da de�i�tirdi�imiz List : " + harfler);
		
		
		
	}

}
