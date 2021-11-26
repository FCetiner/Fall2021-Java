package day13_StringManipulations;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Kullanicidan isim isteyin Eger
		//- isim a “ harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
		//-	isim Z“ harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
		//-	ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Ýsminizi giriniz");
	String isim = scan.next();
	
	if (isim.contains("a" ) && isim.contains("Z")) {
		System.out.println("Girdiðiniz isim a ve Z harfi içeriyor");
	} else if (isim.contains("a")) {
		System.out.println("Girdiðiniz isim a harfi içeriyor");
	} else if(isim.contains("Z")){
		System.out.println("Girdiðiniz isim Z harfi içeriyor");
	} else  {
		System.out.println("Girdiðiniz isim a  ve Z harfi içermiyor");
	}
	
	
	scan.close();
	}

}
