package day12;

import java.util.Scanner;

public class C02_indexOf {

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
		
		char kelime=scan.next().charAt(0);  //Burada neden char aldýk acaba??
		
		int index=cumle.indexOf(kelime);
		if (index<0) {
			System.out.println("Girilen kelime cumlede kullanilmamis");
		} else if (cumle.indexOf(kelime, index+1)<0){
			System.out.println("Girilen kelime 1 kere kullanýlmýþtýr");
		}else {
			System.out.println("Girilen kelime birden fazla kullanýlmýþtýr");
		}
		
		scan.close();
	}

}
