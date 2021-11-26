package day22_Arryas;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {


		String isimler []= { "Hacer" , "ainagul" , "Emine", "Murat","Kutlu"};

		
		
		//isimler array'inde Murat ismi var m�?
		
		//array'de arama yapmadan �nce s�ralama yapmal�y�z
		
		Arrays.sort(isimler);
		//arrays class'i ile sort yapt���m�zda array'imiz kal�c� olarak de�i�ir
		
		
		System.out.println(Arrays.toString(isimler)); //[Emine, Hacer, Kutlu, ainagul]
		//sort methodu elementleri natural order'a g�re s�ralar
		
		isimler[4]="Ainagul";
		
		System.out.println(Arrays.toString(isimler)); //De�i�iklik sonras� tekrar sort yapmak gerekebilir
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler)); //[Ainagul, Emine, Hacer, Kutlu, Murat]
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); //4
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); //-5
		
		System.out.println(Arrays.binarySearch(isimler, "Ferhat")); //-3
		
		System.out.println(Arrays.binarySearch(isimler, "Kursat"));//-4 Kutludan �nceye s�ralad� s�rayla harfleri kar��la�t�r�r
		
		
		
	}

}
