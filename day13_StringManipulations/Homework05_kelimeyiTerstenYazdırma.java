package day13_StringManipulations;

import java.util.Scanner;

public class Homework05_kelimeyiTerstenYazd�rma {

	public static void main(String[] args) {
		// Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen 4 harfli bir kelime girin");
		String str1 = scan.next();
		
		String str2 = str1.substring(3) +str1.substring(2,3)+str1.substring(1,2)+str1.substring(0,1);

		
		System.out.println(str2);
	
	scan.close();
	}

}
