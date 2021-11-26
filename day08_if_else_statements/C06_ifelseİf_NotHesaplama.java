package day08_if_else_statements;

import java.util.Scanner;

public class C06_ifelse�f_NotHesaplama {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
		//Not�u harf sistemine cevirip yazdirin.
		//50�den kucukse �D�,
		//50 60 arasi �C�, 
		//60 80 arasi �B�, 
		//80�nin uzerinde ise �A�
	
	Scanner scan =new Scanner(System.in);
	System.out.println("L�tfen 100 �zerinden notunuzu girin:");
	double not = scan.nextDouble();
	
	if (not<0 || not>100) {
		System.out.println("L�tfen ge�erli bir not yaz�n�z");
	} else if(not<50){
		System.out.println("Notunuz : D");
	} else if(not<60){					//bu sat�rda notun 50 den b�y�k olmama ihtimali yok
		System.out.println("Notunuz : C");
	}else if(not<80){
		System.out.println("Notunuz : B");
	}else {
		System.out.println("Notunuz : A");
	}
	
	scan.close();
	
	}

}
