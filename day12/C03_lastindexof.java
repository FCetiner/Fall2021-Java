package day12;

import java.util.Scanner;

public class C03_lastindexof {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin

				
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
				
		String cumle=scan.nextLine();
		System.out.println("Lütfen varlýðýný kontrol etmek için bir harf giriniz");
				
		char krk=scan.next().charAt(0);

		int index = cumle.lastIndexOf(krk);
		
		if (index==-1) {
			System.out.println("harf cümlede kullanýlmamýþ");
		} else {
			System.out.println("harf cümlede kullanýlmýþ");
		}
				
scan.close();
	
	}

}
