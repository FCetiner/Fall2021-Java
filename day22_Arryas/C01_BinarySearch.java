package day22_Arryas;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {


		String isimler []= { "Hacer" , "ainagul" , "Emine", "Murat","Kutlu"};

		
		
		//isimler array'inde Murat ismi var mý?
		
		//array'de arama yapmadan önce sýralama yapmalýyýz
		
		Arrays.sort(isimler);
		//arrays class'i ile sort yaptýðýmýzda array'imiz kalýcý olarak deðiþir
		
		
		System.out.println(Arrays.toString(isimler)); //[Emine, Hacer, Kutlu, ainagul]
		//sort methodu elementleri natural order'a göre sýralar
		
		isimler[4]="Ainagul";
		
		System.out.println(Arrays.toString(isimler)); //Deðiþiklik sonrasý tekrar sort yapmak gerekebilir
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler)); //[Ainagul, Emine, Hacer, Kutlu, Murat]
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); //4
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); //-5
		
		System.out.println(Arrays.binarySearch(isimler, "Ferhat")); //-3
		
		System.out.println(Arrays.binarySearch(isimler, "Kursat"));//-4 Kutludan önceye sýraladý sýrayla harfleri karþýlaþtýrýr
		
		
		
	}

}
