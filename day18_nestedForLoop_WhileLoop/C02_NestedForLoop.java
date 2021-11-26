package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// Kullanýcýdan 10'dan küçük pozitif bir tam sayý girmesini isteyin
		//Girdiði sayýya göre aþaðýdaki þekli yazdýrýn
		//örn 3 girilirse
		//1
		//1 2
		//1 2 3
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen 10'dan küçük pozitif bir tam sayý giriniz");
		int a = scan.nextInt();
		
		for (int satýr = 1; satýr <= a; satýr++) {
			for (int i = 1; i <= satýr; i++) {
				System.out.print(i+" ");
			}
		System.out.println("");
		}
	
	scan.close();
	}

}
