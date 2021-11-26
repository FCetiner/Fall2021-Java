package day15_methodCreation;

import java.util.Scanner;

public class H01_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin. 
		//Bu sayinin tek mi cift mi oldugunu, 
		//sifirdan buyuk mu kucuk mu oldugunu, 
		//ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		//100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz\t:");
		int sayý = scan.nextInt();
			
		tekmiCiftmi(sayý);
		buyukmuKucukmu(sayý);
		rakamtoplama(sayý);
	scan.close();
	}

	public static void rakamtoplama(int sayý) {
		if(sayý>=100){
			System.out.println("Rakamlarý toplamý\t:"+((sayý%10)+((sayý/10)%10)+ ((sayý/100)%10)));
		} else {
			System.out.println("Birler basamaðý\t:"+(sayý%10));
		}
	}

	public static void buyukmuKucukmu(int sayý) {
		if (sayý==0) {
			System.out.println("sýfýra eþittir");
		} else if(sayý>0){
			System.out.println("0'dan büyüktür");
		} else {
			System.out.println("0'dan küçüktür");
		}
		
	}

	private static void tekmiCiftmi(int sayý) {
		if (sayý%2==0) {
			System.out.println("Girdiðiniz sayý\t: " +sayý + "\nÇift sayýdýr.");
		} else {
			System.out.println("Girdiðiniz sayý\t: " +sayý + "\nTek sayýdýr.");
		}
		
	}

}
