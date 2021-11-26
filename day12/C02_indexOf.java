package day12;

import java.util.Scanner;

public class C02_indexOf {

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
		
		char kelime=scan.next().charAt(0);  //Burada neden char ald�k acaba??
		
		int index=cumle.indexOf(kelime);
		if (index<0) {
			System.out.println("Girilen kelime cumlede kullanilmamis");
		} else if (cumle.indexOf(kelime, index+1)<0){
			System.out.println("Girilen kelime 1 kere kullan�lm��t�r");
		}else {
			System.out.println("Girilen kelime birden fazla kullan�lm��t�r");
		}
		
		scan.close();
	}

}
