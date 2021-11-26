package day21_Scope_Arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		
		//Arrayin elemanlarýný yazdýrmak istersek loop ile yazdýrabiiliriz
		int arr  []= {2,4,5,6,78,89};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	
	System.out.println();
	
	//ya da arrays Class'ýndan yardým alýp direk array olarak yazdýrabiliriz
	
	System.out.println(Arrays.toString(arr));
	
	
	
	}

}
