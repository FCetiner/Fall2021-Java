package day19_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin 
		//ve bu sayiyi tam bolen sayilari 
		//ve toplam kac tane olduklarini ekranda yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen b�lenlerini bulmak i�in pozitif bir tam say� giriniz");
		int say� = scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		
		while (bolen<=say�) {
			if (say�%bolen==0) {
				System.out.print(bolen + " ");
				sayac++;
			}
		bolen++;
		}
		System.out.println();
		System.out.print(say�+" say�s�n�n " + sayac + " adet tam b�leni vard�r");
	
	scan.close();
	}

}
