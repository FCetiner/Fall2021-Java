package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {


		List <String> isimler = new ArrayList<>();
		System.out.println("Boþ liste : " + isimler);
		
		isimler.add("Ali");
		System.out.println("Bir eleman : " + isimler);
		
		isimler.add("Veli");
		System.out.println("iki eleman : " + isimler);
		//add methodu listenin sonuna ekleme yapar
		
		isimler.add("Can");
		System.out.println("üç eleman : " + isimler);
		
		isimler.add(1, "Ayþe");
		System.out.println("1. indexe Ayþe ekledik : " + isimler);
		
		// isimler.add(5); declare ederken belirttiðimiz data türü dýþýnda bir data turunden ekleme yapamayýz
		
		List <String> liste2 = new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("liste 2 :" +liste2);
		
		isimler.addAll(4, liste2);
		System.out.println("liste 2 yi ekledik : " + isimler);	//2 listeyi birleþtirdik
		
		isimler.addAll(liste2);
		System.out.println("index olmadan liste2'yi tekrar ekledik : " + isimler); //Sona ekleme yaptý
		
		
		
		
	}

}
