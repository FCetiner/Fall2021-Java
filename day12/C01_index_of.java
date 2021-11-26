package day12;

import java.util.Scanner;

public class C01_index_of {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin

		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("L�tfen varl���n� kontrol etmek i�in bir harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int index=cumle.indexOf(krk); //Girilen karakterin c�mledeki indexini verir
		
		if (index<0) {
			System.out.println("Girdi�iniz harf verilen c�mlede yok");
		}
		else {
			System.out.println("Girdi�iniz harf verilen c�mlede var");
		}
scan.close();
	}

}
