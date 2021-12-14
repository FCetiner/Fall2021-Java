package day40;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	public static void main(String[] args) {

		//Kullanýcýdan yaþ alýn
		//Kodunuzu kullanýcý sifirdan küçük bir sayý girerse exception verecek þekilde yazýn

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yaþýnýzý girin");
		int yas=scan.nextInt();
		
		try {
			if (yas<0) {
				throw new IllegalArgumentException();
			} else {
				System.out.println(yas);
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yaþ sýfýrdan küçük olamaz");
		}
	scan.close();
	}

}
