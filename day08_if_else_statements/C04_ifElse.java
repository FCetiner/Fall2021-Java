package day08_if_else_statements;

import java.util.Scanner;

public class C04_ifElse {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
		//eger uc kenar uzunlugu
		//birbirine esit ise ekrana �Eskenar ucgen� yazdirin.
		//Diger durumlarda ekrana
		//�Eskenar degil�

		Scanner scan = new Scanner(System.in);
		System.out.println("��genin kenar uzunlu�unu giriniz");
		int kenar1=scan.nextInt();
		
		System.out.println("��genin kenar uzunlu�unu giriniz");
		int kenar2=scan.nextInt();
		
		System.out.println("��genin kenar uzunlu�unu giriniz");
		int kenar3=scan.nextInt();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("E�kenar ��gen");
		} else {
			System.out.println("E�kenar ��gen de�il");
		}
	scan.close();	
	}

}
