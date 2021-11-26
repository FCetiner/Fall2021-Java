package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lütfen 1. sayýyý girip entera basýp \n ikinci sayýyý giriniz:");
		int sayý1=scan.nextInt();
		int sayý2=scan.nextInt();
		
		System.out.println(sayý1<sayý2 ? sayý1 : sayý2);
		
		scan.close();
	}

}
