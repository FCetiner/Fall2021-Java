package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// Kullan�c�dan 10'dan k���k pozitif bir tam say� girmesini isteyin
		//Girdi�i say�ya g�re a�a��daki �ekli yazd�r�n
		//�rn 3 girilirse
		//1
		//1 2
		//1 2 3
		
		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen 10'dan k���k pozitif bir tam say� giriniz");
		int a = scan.nextInt();
		
		for (int sat�r = 1; sat�r <= a; sat�r++) {
			for (int i = 1; i <= sat�r; i++) {
				System.out.print(i+" ");
			}
		System.out.println("");
		}
	
	scan.close();
	}

}
