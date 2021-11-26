package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {


		// verilen bir array'de tekrar eden elementleri sadece birer tane yazarak
		//unique elementlerden oluşan bir array haline getirelim
		
		int arr []= {2,3,4,5,3,4,5,6,3,7,8,4,5,9,5,3,2,4,1,6,0,5};
		
		//2,3,4,5,6,7,8,9,0,1
		
		List <Integer> tekrarsız = new ArrayList <> ();
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsız.contains(arr[i])) {
				tekrarsız.add(arr[i]);
			}
		}

		System.out.println("tekrarsız list : "+tekrarsız);
		
		int tekrarsızArray[] = new int[tekrarsız.size()];	//Listi Arraye çevirdik
	
		for (int i = 0; i < tekrarsızArray.length; i++) {
			tekrarsızArray[i]=tekrarsız.get(i);
		}
		
		System.out.println("tekrarsız array : " +Arrays.toString(tekrarsızArray));
	}

}
