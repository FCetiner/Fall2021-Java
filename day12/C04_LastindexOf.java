package day12;

import java.util.Scanner;

public class C04_LastindexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime isteyin, 
		//kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		//- Girilen kelime cumlede kullanilmamis.
	    //- Girilen kelime cumlede 1 kere kullanilmis.
		//- Girilen kelime cumlede 1’den fazla kullanilmis.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
				
		String cumle=scan.nextLine();
		System.out.println("Lütfen varlýðýný kontrol etmek için bir kelime giriniz");
				
		String kelime=scan.next();
		
		int ilkIndex=cumle.indexOf(kelime);
		int sonIndex = cumle.lastIndexOf(kelime);
		
		if (ilkIndex==(-1)) {
			System.out.println("Girilen kelime cümlede kullanýlmamýþtýr");
		} else if (ilkIndex==sonIndex){
			System.out.println("Girilen kelime 1 kere kullanýlmýþtýr");
		} else {
			System.out.println("Girilen kelime cümlede 1 den fazla kullanýlmýþtýr." );
		}

	
scan.close();	
	}

}
