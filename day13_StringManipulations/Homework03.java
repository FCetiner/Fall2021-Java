package day13_StringManipulations;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Kullanicidan isim isteyin Eger
		//- isim a � harfi iceriyorsa �Girdiginiz isim a harfi iceriyor�
		//-	isim Z� harfi iceriyorsa �Girdiginiz isim Z harfi iceriyor�
		//-	ikisi de yoksa �Girdiginiz isim a veya Z harfi icermiyor� yazdirin
	
	Scanner scan = new Scanner(System.in);
	System.out.println("�sminizi giriniz");
	String isim = scan.next();
	
	if (isim.contains("a" ) && isim.contains("Z")) {
		System.out.println("Girdi�iniz isim a ve Z harfi i�eriyor");
	} else if (isim.contains("a")) {
		System.out.println("Girdi�iniz isim a harfi i�eriyor");
	} else if(isim.contains("Z")){
		System.out.println("Girdi�iniz isim Z harfi i�eriyor");
	} else  {
		System.out.println("Girdi�iniz isim a  ve Z harfi i�ermiyor");
	}
	
	
	scan.close();
	}

}
