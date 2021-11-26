package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// kullanýcýdan iki tam sayý isteyin
		// ilk sayýdan baþlayarak ikinci sayýya kadarücer ücer yazdýrýn
		//(ikinci sayý dahil olmak zorunda deðil)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir rakam giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		
		if (a>b) {
			for (int i = a; i >= b; i-=3) {
			System.out.print(i + " ");
		}
		
		} else if(a<b){
			for (int i = a; i <= b; i+=3) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Girilen sayýlar eþittir");
		}
		
		scan.close();
		

	}

}
