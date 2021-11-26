package day05;

import java.util.Scanner;

public class C03_Modules {

	public static void main(String[] args) {
		
		//kullanýcýdan 3 basamaklý bir sayý alýp rakamlar toplamýný 
		//yazdýran bir program yazalým
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen 3 basamaklý bir sayý giriniz:");
		int sayý=scan.nextInt();
		
			//sayý 573 olsun
		
		int rakamlarToplamý=0;
		
		int rakam=sayý%10; //bana birler basamaðýný verir

		rakamlarToplamý+=rakam; //rakamlar toplamý 3 oldu
		
		//sayýmýz hala 573
		//3ten kurtulalým 3 ile iþimiz bitti
		//sayý 57 haline getirin
		
		sayý/=10;
	
		//sayýmýz artýk 57
		//7 yi nasýl alýrýz
		rakam=sayý%10;
		
	rakamlarToplamý+=rakam;
			
	sayý/=10;
	rakam=sayý%10;
	
	rakamlarToplamý+=rakam;
	System.out.println("Rakamlar Toplamý : "+rakamlarToplamý);
		
	
		
				
		
		
		
		
	
	
	
	}

}
