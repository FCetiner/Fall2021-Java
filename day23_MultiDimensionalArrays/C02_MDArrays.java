package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		//Multi dimensional arraylar i�i�e konulmu� arraylar demektir
		//Array olu�turmak i�in 2 y�ntemimiz vardi
		//1. y�ntem �nce deklare edip sonra de�er atama
		
		
		int arr[][]= new int [3][2]; //outer array'i 3 elemanl� 
									//her bir inner array ise 2 elemanl� olan MDArray olu�turur.
		//Bu y�ntemle olu�turdu�umuzda inner arraylerin hepsi ayn� boyutta olmal�d�r
		
		System.out.println(Arrays.toString(arr)); // direk outer array i yazd�rmak istedi�imizde
												//i�indeki elemanlar non-primitive oldu�undan
												//referanslar� yazd�r�r [[I@5680a178, [I@5fdef03a, [I@3b22cdd0]
	
	System.out.println(Arrays.toString(arr[1]));  //[0, 0]
	
	System.out.println(Arrays.deepToString(arr));	//[[0, 0], [0, 0], [0, 0]]
	
	arr[0][1]=5;
	arr[1][0]=2;
	arr[2][1]=3;
	System.out.println(Arrays.deepToString(arr));	//[[0, 5], [2, 0], [0, 3]]
	
	// array olu�turmak i�in iki y�ntemimiz vardi
	//2. y�ntem hem deklare edip hem de�er atama
	
	int arr2[][]= {{0},{1,2,3},{6,7,8,9}};
	
	System.out.println(Arrays.deepToString(arr2));	//[[0], [1, 2, 3], [6, 7, 8, 9]]
	
	System.out.println(Arrays.toString(arr2[1]));	//[1, 2, 3]
	System.out.println(arr2[2][1]);					//7 Array yazd�rmak i�in arrays kullan�l�r, say� i�in syso yeterli
	
	
	
	
	}

}
