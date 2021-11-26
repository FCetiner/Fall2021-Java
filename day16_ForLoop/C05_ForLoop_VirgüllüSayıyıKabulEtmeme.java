package day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop_VirgüllüSayýyýKabulEtmeme {

	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		//1’den baslayarak girilen sayiya kadar(sayý dahil)
		//3’un kati olan sayilari yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
		double num = scan.nextDouble();
		int sayý = (int) num;
	
	//sayý negatifse veya tam sayý deðilse uyarý verelim
	
		if (num<0) {
			System.out.println("Negatif sayý giremezsiniz");
		} else if(sayý!=num){
			System.out.println("Lütfen tam sayý giriniz");
		} else if(sayý>100){
				System.out.println("100 den küçük sayý girmelisiniz");		
		} else {
			for (int i = 1; i <= num; i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}	
		}
			
		
	scan.close();
		
		
		
	}

}
