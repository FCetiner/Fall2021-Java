package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin
		
		int arr [] = {3,4,5,6,6,7,5,3,5};
		int silinecekEleman=3;
		
		// array'de yeni eleman ekleyemeyiz veya var olan elemanlar� silemeyiz
		//cunku arry'in declare edilen uzunlu�u de�i�mez
		//Bu saoruda istenen elementi sildi�imizde geriye ka� element kal�yor bulmam�z laz�m
		// silinecek say� adedini bulal�m
		
		int sayac=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
			}
		}
		
		int yeniArrayUzunluk = arr.length-sayac;
		
		// art�k yeni array'i olu�turabiliriz
		int yeniArr[]=new int[yeniArrayUzunluk];
		
		// �imdi eski array deki elemanlar� birer birer al�p
		//silinecek elemana e�it olmayanlar� yeni array'e atamal�y�z
		
		int index=0;
				
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekEleman) {
				
				yeniArr[index]=arr[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(yeniArr));
		
	}

}
