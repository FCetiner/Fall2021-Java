package day08_if_else_statements;

import java.util.Scanner;

public class C04_ifElse {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
		//eger uc kenar uzunlugu
		//birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
		//Diger durumlarda ekrana
		//“Eskenar degil”

		Scanner scan = new Scanner(System.in);
		System.out.println("Üçgenin kenar uzunluðunu giriniz");
		int kenar1=scan.nextInt();
		
		System.out.println("Üçgenin kenar uzunluðunu giriniz");
		int kenar2=scan.nextInt();
		
		System.out.println("Üçgenin kenar uzunluðunu giriniz");
		int kenar3=scan.nextInt();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eþkenar üçgen");
		} else {
			System.out.println("Eþkenar üçgen deðil");
		}
	scan.close();	
	}

}
