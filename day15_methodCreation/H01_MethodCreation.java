package day15_methodCreation;

import java.util.Scanner;

public class H01_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin. 
		//Bu sayinin tek mi cift mi oldugunu, 
		//sifirdan buyuk mu kucuk mu oldugunu, 
		//ayrica ve 100�den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		//100�den kucukse sadece 1�ler basamagini yazdiran 3 method olusturun.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz\t:");
		int say� = scan.nextInt();
			
		tekmiCiftmi(say�);
		buyukmuKucukmu(say�);
		rakamtoplama(say�);
	scan.close();
	}

	public static void rakamtoplama(int say�) {
		if(say�>=100){
			System.out.println("Rakamlar� toplam�\t:"+((say�%10)+((say�/10)%10)+ ((say�/100)%10)));
		} else {
			System.out.println("Birler basama��\t:"+(say�%10));
		}
	}

	public static void buyukmuKucukmu(int say�) {
		if (say�==0) {
			System.out.println("s�f�ra e�ittir");
		} else if(say�>0){
			System.out.println("0'dan b�y�kt�r");
		} else {
			System.out.println("0'dan k���kt�r");
		}
		
	}

	private static void tekmiCiftmi(int say�) {
		if (say�%2==0) {
			System.out.println("Girdi�iniz say�\t: " +say� + "\n�ift say�d�r.");
		} else {
			System.out.println("Girdi�iniz say�\t: " +say� + "\nTek say�d�r.");
		}
		
	}

}
