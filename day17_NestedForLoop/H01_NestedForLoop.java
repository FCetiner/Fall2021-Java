package day17_NestedForLoop;

import java.util.Scanner;

public class H01_NestedForLoop {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
	//	asagidaki sekli cizdirin
	//	*
	//	* *
	//	* * *
	//	*

	Scanner scan = new Scanner(System.in);
	System.out.println("L�tfen bir rakam giriniz");
	int say� = scan.nextInt();
	
	for (int i = 1; i <= say�; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
		
	scan.close();
		
	}

}
