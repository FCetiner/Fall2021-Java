package day05;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		// Kullanýcýdan 4 basamaklý bir sayý alýp
		//rakamlar toplamýný yazdýrýn
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen 4 basamaklý bir sayý giriniz:");
		int sayý=scan.nextInt();
		
		int rakamlarToplamý=0;
		int rakam=sayý%10; 
		rakamlarToplamý+=rakam; 
		sayý/=10;
		
		rakam=sayý%10; 
		rakamlarToplamý+=rakam; 
		sayý/=10;
		
		rakam=sayý%10; 
		rakamlarToplamý+=rakam; 
		sayý/=10;
		
		rakam=sayý%10; 
		rakamlarToplamý+=rakam; 
		sayý/=10;
	System.out.println("Rakamlar Toplamý : "+rakamlarToplamý);
//bu iþlemi basamak sayýsý kadar tekrar edersek toplamý buuruz		

	}

}
