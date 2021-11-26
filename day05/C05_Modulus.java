package day05;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {
		// Kullanýcýdan 6 basamaklý sayý alýp rakamlar toplamýný bulunuz
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen 6 basamaklý bir sayý giriniz:");
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
		
		rakam=sayý%10; 
		rakamlarToplamý+=rakam; 
		sayý/=10;
		
		rakam=sayý%10; 
		rakamlarToplamý+=rakam; 
		sayý/=10;
	System.out.println("Rakamlar Toplamý : "+rakamlarToplamý);
		
	scan.close();	
	}

}
