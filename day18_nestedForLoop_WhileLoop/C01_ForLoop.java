package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// kullan�c�dan iki tam say� isteyin
		// ilk say�dan ba�layarak ikinci say�ya kadar�cer �cer yazd�r�n
		//(ikinci say� dahil olmak zorunda de�il)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir rakam giriniz");
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
			System.out.println("Girilen say�lar e�ittir");
		}
		
		scan.close();
		

	}

}
