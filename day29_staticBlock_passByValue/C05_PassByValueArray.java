package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {

		int say�lar[] = { 3, 4, 5, 6 };

		elemanDegistir(say�lar);
		System.out.println("Eleman de�i�tir methodundan sonra : " + Arrays.toString(say�lar));
		
		arrayiDegistir (say�lar);
		System.out.println("arrayi de�i�tir methodundan sonra : " + Arrays.toString(say�lar));
	}

	private static void arrayiDegistir(int[] say�lar) {
		say�lar = new int [6];
		System.out.println("arrayi de�i�tir methodunda : " + Arrays.toString(say�lar));
	}

	private static void elemanDegistir(int[] say�lar) {
		say�lar[0] = 10;
		System.out.println("Eleman de�i�tir methodunda : " + Arrays.toString(say�lar));

	}

}
