package day17_NestedForLoop;

import java.util.Scanner;

public class C03_forLoops {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question
		//Kullanicidan bir String isteyin ve Stringi tersine ceviren
		//bir method yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir yazı giriniz...");
		String str = scan.nextLine();
		
		tersineCevir(str);
		
		System.out.println(tersineCevir(str));
		
		scan.close();
	}

	public static String  tersineCevir(String str) {
		String tersStr="";
		
		for (int i = str.length()-1; i >=0; i--) {
		tersStr+=str.substring(i, i+1);	
		
		}
		return tersStr;
		
	
	}

}
