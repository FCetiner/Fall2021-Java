package day16_ForLoop;

import java.util.Scanner;

public class C06_forLoop {

	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir pozitif tamsayi isteyin. 
		//1’den baslayarak girilen sayiya kadar
		//3’un veya 5”in kati olan sayilari yazdirin.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
		int num = scan.nextInt();
	
		
		
		for (int i = 1; i < num; i++) {
			if (i%3==0 || i%5==0) {
				System.out.println(i);
			}
		}
	
	scan.close();
	}

}
