package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {

		int sayýlar[] = { 3, 4, 5, 6 };

		elemanDegistir(sayýlar);
		System.out.println("Eleman deðiþtir methodundan sonra : " + Arrays.toString(sayýlar));
		
		arrayiDegistir (sayýlar);
		System.out.println("arrayi deðiþtir methodundan sonra : " + Arrays.toString(sayýlar));
	}

	private static void arrayiDegistir(int[] sayýlar) {
		sayýlar = new int [6];
		System.out.println("arrayi deðiþtir methodunda : " + Arrays.toString(sayýlar));
	}

	private static void elemanDegistir(int[] sayýlar) {
		sayýlar[0] = 10;
		System.out.println("Eleman deðiþtir methodunda : " + Arrays.toString(sayýlar));

	}

}
