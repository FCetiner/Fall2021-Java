package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Verilen iki array'i birleştiren 
		//ve sonucu birleşikArray isminde bir arraye kaydeden
		//bir method oluşturun
		//main method içinde yeni array'i sıralayıp yazdırın

		int arr1[]= {3,5};
		int arr2[]= {2,4,6};
		
		int birleşikArray[]= birleştir(arr1,arr2);
		Arrays.sort(birleşikArray); 		//Sıralama yaptık
		System.out.println(Arrays.toString(birleşikArray));
		
	}

	private static int[] birleştir(int[] arr1, int[] arr2) {
		
		int birleşikArray[]= new int [arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			birleşikArray[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			birleşikArray[i+arr1.length]=arr2[i];
		}
		
		
		return birleşikArray;
	}

	

}
