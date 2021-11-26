package day12;

import java.util.Scanner;

public class C07_Contains {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin. 
		//Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
		//“kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
		//iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
		// iki kelimeyi de içeriyorsa "küçük mü büyük mü karar ver"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		
		String cumle=scan.nextLine();
		
		if (cumle.contains("büyük" ) && cumle.contains("küçük")) {
			System.out.println("küçük mü büyük mü karar ver");
		} else if (cumle.contains("küçük")) {
			System.out.println(cumle.toLowerCase());
			
		} else if (cumle.contains("büyük") ){
			System.out.println(cumle.toUpperCase());
		} else {
			System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
		}
		
		scan.close();
	}

}
