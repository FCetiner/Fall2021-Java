package day10_ternary_Switchcase;

import java.util.Scanner;

public class c01_Ternary {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

	Scanner scan = new Scanner(System.in);
	System.out.println("L�tfen bir say� giriniz");
	double say�1=scan.nextDouble();
	System.out.println("L�tfen bir say� daha giriniz");
	double say�2=scan.nextDouble();
	
	System.out.println(say�1>say�2 ? say�2 : say�1);
	
	
	scan.close();
	
	}

}
