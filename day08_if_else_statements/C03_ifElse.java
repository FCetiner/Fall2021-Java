package day08_if_else_statements;

import java.util.Scanner;

public class C03_ifElse {

	public static void main(String[] args) {
		// Soru 3) Kullaniciya yasini sorun,
		//eger yas 65�den kucuk ise �emekli olamazsin, calismalisin�,
		//65 e�it veya buyukse �Emekli olabilirsin� yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ya��n�z� girin:");
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("Emekli olamazs�n �al��mal�s�n");
		} else {
			System.out.println("Emekli olabilirsin");
		}
		
		scan.close();
	}

}
