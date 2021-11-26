package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// verilen array'i Arrays class'�ndan yard�m alarak
		//liste �evirebiliriz
		
		String arr[]= {"A","b","C","d"};
		
		List<String> arraydenList = Arrays.asList(arr);

		System.out.println("List : "+arraydenList);
		
		//arraydenList.add("F");	//RTE verdi Desteklenmeyen i�lem List gibi ekleme yapam�yoruz
		//CTE olmas� i�in sytax te problem olmas� laz�m ancak bu yaz�mda
		//syntax hatas� yok
		
		
		//bu �ekilde Arrays calssindan yard�m alarak arrayi liste �evirirsek
		//olu�turdu�umuz listin boyutu sabit olur
		//dolay�s� ile add() veya clear() gibi methodlar� �al��t�mak istersek hata verir
		
		arr[1]="Z";
		System.out.println("Arrayi de�itirdikten sonra array = " + Arrays.toString(arr));
		
		System.out.println("Arrayi de�itirdikten sonra List = "+arraydenList);
		
		arraydenList.set(3, "D");
		System.out.println("Listi de�itirdikten sonra List = "+arraydenList);
		System.out.println("Listi de�itirdikten sonra array = " + Arrays.toString(arr));
		
	}

}
