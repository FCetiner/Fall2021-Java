package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		//Multi dimensional arraylar içiçe konulmuþ arraylar demektir
		//Array oluþturmak için 2 yöntemimiz vardi
		//1. yöntem önce deklare edip sonra deðer atama
		
		
		int arr[][]= new int [3][2]; //outer array'i 3 elemanlý 
									//her bir inner array ise 2 elemanlý olan MDArray oluþturur.
		//Bu yöntemle oluþturduðumuzda inner arraylerin hepsi ayný boyutta olmalýdýr
		
		System.out.println(Arrays.toString(arr)); // direk outer array i yazdýrmak istediðimizde
												//içindeki elemanlar non-primitive olduðundan
												//referanslarý yazdýrýr [[I@5680a178, [I@5fdef03a, [I@3b22cdd0]
	
	System.out.println(Arrays.toString(arr[1]));  //[0, 0]
	
	System.out.println(Arrays.deepToString(arr));	//[[0, 0], [0, 0], [0, 0]]
	
	arr[0][1]=5;
	arr[1][0]=2;
	arr[2][1]=3;
	System.out.println(Arrays.deepToString(arr));	//[[0, 5], [2, 0], [0, 3]]
	
	// array oluþturmak için iki yöntemimiz vardi
	//2. yöntem hem deklare edip hem deðer atama
	
	int arr2[][]= {{0},{1,2,3},{6,7,8,9}};
	
	System.out.println(Arrays.deepToString(arr2));	//[[0], [1, 2, 3], [6, 7, 8, 9]]
	
	System.out.println(Arrays.toString(arr2[1]));	//[1, 2, 3]
	System.out.println(arr2[2][1]);					//7 Array yazdýrmak için arrays kullanýlýr, sayý için syso yeterli
	
	
	
	
	}

}
