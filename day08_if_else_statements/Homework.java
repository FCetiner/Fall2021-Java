package day08_if_else_statements;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan gun ismini yazmasini isteyin.
		//Girilen isim gecerli bir gun ise
		//gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin,
		//gun ismi	gecerli degilse �Gecerli gun ismi giriniz� yazdirin

		Scanner scan= new Scanner(System.in);
		System.out.println("G�n ismi giriniz:");
		String gun = scan.next().toLowerCase() ;
		
		if (gun.equals("pazartesi") || gun.equals("sal�") ||gun.equals("�ar�amba") ||gun.equals("per�embe") ||
				gun.equals("cuma") ||gun.equals("cumartesi") ||gun.equals("pazar")) {
			System.out.println(gun.toUpperCase().charAt(0)+" " + gun.toLowerCase().charAt(1) +" " + gun.toLowerCase().charAt(2));
		} else {
			System.out.println("L�tfen ge�erli bir g�n ismi giriniz");
		}
		
		scan.close();
		
		
		
	}

}
