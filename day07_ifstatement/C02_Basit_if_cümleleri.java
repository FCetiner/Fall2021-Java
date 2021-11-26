package day07_ifstatement;

import java.util.Scanner;

public class C02_Basit_if_cümleleri {

	public static void main(String[] args) {
		
		//Kullanýcýdan bir tamsayý isteyin ve sayýnýn tek veya çift olduðunu bildirin
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Lütfen bir tam sayý giriniz:");
	int sayý=(int)scan.nextInt();
	
	
	if (sayý%2==0) {
		System.out.println("Girdiðiniz sayý çift sayý");
	}
	
	if (sayý%2==1) {
		System.out.println("Girdiðiniz sayý tek sayý");
	}
	
	scan.close();
	
	}

}
