package day10_ternary_Switchcase;

import java.util.Scanner;

public class c01_Ternary {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen bir sayý giriniz");
	double sayý1=scan.nextDouble();
	System.out.println("Lütfen bir sayý daha giriniz");
	double sayý2=scan.nextDouble();
	
	System.out.println(sayý1>sayý2 ? sayý2 : sayý1);
	
	
	scan.close();
	
	}

}
