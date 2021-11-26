package day17_NestedForLoop;

import java.util.Scanner;

public class H02_NestedForLoop {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
		//tablosu olusturun. Ornek,kullanici 3 girerse,
		//1 2 3
		//2 4 6
		//3 6 9

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir rakam giriniz");
		int sayý = scan.nextInt();
		
		for (int i = 1; i <=sayý; i++) {
			for (int j = 1; j <=sayý; j++) {
				System.out.print(j*i+" ");
			}
		System.out.println("");
		}
		
		scan.close();
	}

}
