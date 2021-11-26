package day19_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin 
		//ve bu sayiyi tam bolen sayilari 
		//ve toplam kac tane olduklarini ekranda yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bölenlerini bulmak için pozitif bir tam sayý giriniz");
		int sayý = scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		
		while (bolen<=sayý) {
			if (sayý%bolen==0) {
				System.out.print(bolen + " ");
				sayac++;
			}
		bolen++;
		}
		System.out.println();
		System.out.print(sayý+" sayýsýnýn " + sayac + " adet tam böleni vardýr");
	}

}
