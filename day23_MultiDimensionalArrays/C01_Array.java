package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin
		
		int arr [] = {3,4,5,6,6,7,5,3,5};
		int silinecekEleman=3;
		
		// array'de yeni eleman ekleyemeyiz veya var olan elemanlarý silemeyiz
		//cunku arry'in declare edilen uzunluðu deðiþmez
		//Bu saoruda istenen elementi sildiðimizde geriye kaç element kalýyor bulmamýz lazým
		// silinecek sayý adedini bulalým
		
		int sayac=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
			}
		}
		
		int yeniArrayUzunluk = arr.length-sayac;
		
		// artýk yeni array'i oluþturabiliriz
		int yeniArr[]=new int[yeniArrayUzunluk];
		
		// þimdi eski array deki elemanlarý birer birer alýp
		//silinecek elemana eþit olmayanlarý yeni array'e atamalýyýz
		
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
