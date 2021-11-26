package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		// Kullanýcýdan toplanmak üzere sayýlar isteyin
		//sayý adedi 10'u geçerse veya toplam 500'u geçerse
		// "Bu kadar sayý yeter"
		//... adet sayý girdin, toplamý .. " yazdýrýn

		Scanner scan=new Scanner(System.in);
		int sayý=0;
		int sayac=0;
		int toplam=0;
		
		while (sayac<=10 && toplam<=500) {
			System.out.println("Lütfen toplama iþlemi için sayýlarý arka arkaya girin:");
			sayý=scan.nextInt();
			toplam+=sayý;
			sayac++;
		}
			
		System.out.print("Bu kadar sayý yeter.\n" + sayac + " adet sayý girdin,\n" + "toplamý : " + toplam);
	
		scan.close();
	}

}
