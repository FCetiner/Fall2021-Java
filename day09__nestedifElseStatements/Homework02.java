package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.print("L�tfen 1. say�y� girip entera bas�p \n ikinci say�y� giriniz:");
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		
		System.out.println(say�1<say�2 ? say�1 : say�2);
		
		scan.close();
	}

}
