package day17_NestedForLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Interview Question Kullanicidan 10�dan kucuk bir tamsayi isteyin ve 
		 //girilen sayinin faktoryel�ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("lutfen 10'dan k���k bir sayi giriniz...");
		int say� = scan.nextInt();
	
		
		System.out.print(say�+"!=" );
		int faktoriyel=1;
		
		for (int i = say�; i > 0; i--) {
			faktoriyel*=i;
			System.out.print(i + "*");
		}
	System.out.println("1=" + faktoriyel);
scan.close();
	}

}
