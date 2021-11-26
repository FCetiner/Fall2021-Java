package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Verilen iki array'i birleþtiren 
		//ve sonucu birleþikArray isminde bir arraye kaydeden
		//bir method oluþturun
		//main method içinde yeni array'i sýralayýp yazdýrýn

		int arr1[]= {3,5};
		int arr2[]= {2,4,6};
		
		int birleþikArray[]= birleþtir(arr1,arr2);
		Arrays.sort(birleþikArray); 		//Sýralama yaptýk
		System.out.println(Arrays.toString(birleþikArray));
		
	}

	private static int[] birleþtir(int[] arr1, int[] arr2) {
		
		int birleþikArray[]= new int [arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			birleþikArray[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			birleþikArray[i+arr1.length]=arr2[i];
		}
		
		
		return birleþikArray;
	}

	

}
