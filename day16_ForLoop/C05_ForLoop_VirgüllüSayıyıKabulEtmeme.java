package day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop_Virg�ll�Say�y�KabulEtmeme {

	public static void main(String[] args) {
		// Kullanicidan 100�den kucuk bir tamsayi isteyin. 
		//1�den baslayarak girilen sayiya kadar(say� dahil)
		//3�un kati olan sayilari yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
		double num = scan.nextDouble();
		int say� = (int) num;
	
	//say� negatifse veya tam say� de�ilse uyar� verelim
	
		if (num<0) {
			System.out.println("Negatif say� giremezsiniz");
		} else if(say�!=num){
			System.out.println("L�tfen tam say� giriniz");
		} else if(say�>100){
				System.out.println("100 den k���k say� girmelisiniz");		
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
