package day40;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//Kullan�c�dan ya� al�n
		//Kodunuzu kullan�c� sifirdan k���k bir say� girerse exception verecek �ekilde yaz�n

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ya��n�z� girin");
		int yas=scan.nextInt();
		
		try {
			if (yas<0) {
				throw new IllegalArgumentException();
			} else {
				System.out.println(yas);
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Ya� s�f�rdan k���k olamaz");
		}
	scan.close();
	}

}
