package day12;

import java.util.Scanner;

public class C04_LastindexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime isteyin, 
		//kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		//- Girilen kelime cumlede kullanilmamis.
	    //- Girilen kelime cumlede 1 kere kullanilmis.
		//- Girilen kelime cumlede 1�den fazla kullanilmis.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
				
		String cumle=scan.nextLine();
		System.out.println("L�tfen varl���n� kontrol etmek i�in bir kelime giriniz");
				
		String kelime=scan.next();
		
		int ilkIndex=cumle.indexOf(kelime);
		int sonIndex = cumle.lastIndexOf(kelime);
		
		if (ilkIndex==(-1)) {
			System.out.println("Girilen kelime c�mlede kullan�lmam��t�r");
		} else if (ilkIndex==sonIndex){
			System.out.println("Girilen kelime 1 kere kullan�lm��t�r");
		} else {
			System.out.println("Girilen kelime c�mlede 1 den fazla kullan�lm��t�r." );
		}

	
scan.close();	
	}

}
