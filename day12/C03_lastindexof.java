package day12;

import java.util.Scanner;

public class C03_lastindexof {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin

				
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
				
		String cumle=scan.nextLine();
		System.out.println("L�tfen varl���n� kontrol etmek i�in bir harf giriniz");
				
		char krk=scan.next().charAt(0);

		int index = cumle.lastIndexOf(krk);
		
		if (index==-1) {
			System.out.println("harf c�mlede kullan�lmam��");
		} else {
			System.out.println("harf c�mlede kullan�lm��");
		}
				
scan.close();
	
	}

}
