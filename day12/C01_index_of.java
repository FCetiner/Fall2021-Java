package day12;

import java.util.Scanner;

public class C01_index_of {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lütfen varlýðýný kontrol etmek için bir harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int index=cumle.indexOf(krk); //Girilen karakterin cümledeki indexini verir
		
		if (index<0) {
			System.out.println("Girdiðiniz harf verilen cümlede yok");
		}
		else {
			System.out.println("Girdiðiniz harf verilen cümlede var");
		}
scan.close();
	}

}
