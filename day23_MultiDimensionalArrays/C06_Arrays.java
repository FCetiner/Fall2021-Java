package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Verilen iki array'i birle�tiren 
		//ve sonucu birle�ikArray isminde bir arraye kaydeden
		//bir method olu�turun
		//main method i�inde yeni array'i s�ralay�p yazd�r�n

		int arr1[]= {3,5};
		int arr2[]= {2,4,6};
		
		int birle�ikArray[]= birle�tir(arr1,arr2);
		Arrays.sort(birle�ikArray); 		//S�ralama yapt�k
		System.out.println(Arrays.toString(birle�ikArray));
		
	}

	private static int[] birle�tir(int[] arr1, int[] arr2) {
		
		int birle�ikArray[]= new int [arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			birle�ikArray[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			birle�ikArray[i+arr1.length]=arr2[i];
		}
		
		
		return birle�ikArray;
	}

	

}
