package day08_if_else_statements;

import java.util.Scanner;

public class C03_ifElse {

	public static void main(String[] args) {
		// Soru 3) Kullaniciya yasini sorun,
		//eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
		//65 eþit veya buyukse “Emekli olabilirsin” yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yaþýnýzý girin:");
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("Emekli olamazsýn çalýþmalýsýn");
		} else {
			System.out.println("Emekli olabilirsin");
		}
		
		scan.close();
	}

}
