package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {


		// verilen bir array'de tekrar eden elementleri sadece birer tane yazarak
		//unique elementlerden olu�an bir array haline getirelim
		
		int arr []= {2,3,4,5,3,4,5,6,3,7,8,4,5,9,5,3,2,4,1,6,0,5};
		
		//2,3,4,5,6,7,8,9,0,1
		
		List <Integer> tekrars�z = new ArrayList <> ();
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrars�z.contains(arr[i])) {
				tekrars�z.add(arr[i]);
			}
		}

		System.out.println("tekrars�z list : "+tekrars�z);
		
		int tekrars�zArray[] = new int[tekrars�z.size()];	//Listi Arraye �evirdik
	
		for (int i = 0; i < tekrars�zArray.length; i++) {
			tekrars�zArray[i]=tekrars�z.get(i);
		}
		
		System.out.println("tekrars�z array : " +Arrays.toString(tekrars�zArray));
	}

}
