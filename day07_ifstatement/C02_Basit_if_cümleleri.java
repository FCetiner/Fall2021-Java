package day07_ifstatement;

import java.util.Scanner;

public class C02_Basit_if_c�mleleri {

	public static void main(String[] args) {
		
		//Kullan�c�dan bir tamsay� isteyin ve say�n�n tek veya �ift oldu�unu bildirin
		
	Scanner scan = new Scanner(System.in);
	System.out.print("L�tfen bir tam say� giriniz:");
	int say�=(int)scan.nextInt();
	
	
	if (say�%2==0) {
		System.out.println("Girdi�iniz say� �ift say�");
	}
	
	if (say�%2==1) {
		System.out.println("Girdi�iniz say� tek say�");
	}
	
	scan.close();
	
	}

}
