package day12;

import java.util.Scanner;

public class C07_Contains {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin. 
		//Cumle �buyuk� kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
		//�kucuk� kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
		//iki kelimeyi de icermiyorsa �Cumle kucuk yada buyuk kelimesi icermiyor� yazdirin.
		// iki kelimeyi de i�eriyorsa "k���k m� b�y�k m� karar ver"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		
		String cumle=scan.nextLine();
		
		if (cumle.contains("b�y�k" ) && cumle.contains("k���k")) {
			System.out.println("k���k m� b�y�k m� karar ver");
		} else if (cumle.contains("k���k")) {
			System.out.println(cumle.toLowerCase());
			
		} else if (cumle.contains("b�y�k") ){
			System.out.println(cumle.toUpperCase());
		} else {
			System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
		}
		
		scan.close();
	}

}
