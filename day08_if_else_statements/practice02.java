package day08_if_else_statements;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		// Take two int values from user and print greatest among them.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen 1. say�y� girerek entera bas�n�z ve 2. say�y� giriniz:");
		int a=scan.nextInt();
		int b =scan.nextInt();
		
		if (a>b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

		scan.close();
	}

}
