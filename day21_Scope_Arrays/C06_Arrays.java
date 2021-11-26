package day21_Scope_Arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int arr[] = {3,5,8,65,32,34};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		
		
		System.out.println(toplam);
		
		//array'in tüm elemanlarýný önce küçükten büyüðe, sonra büyükten küçüðe yazdýrýn
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//büyükten küçüðe
		//ya for loop ile elemanlarý yazdýrabiliriz
		
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		
		// array yapmak isterseniz ayný uzunlukta bir array oluþturup
		//elemanlarý ters sýrada yeni arraya taþýyabilirsiniz
		
		int tersArray[]=new int[arr.length];
		System.out.println(Arrays.toString(tersArray));
		
		
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(tersArray));
		
		
		
		
	}

}
