package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// verilen array'i Arrays class'ýndan yardým alarak
		//liste çevirebiliriz
		
		String arr[]= {"A","b","C","d"};
		
		List<String> arraydenList = Arrays.asList(arr);

		System.out.println("List : "+arraydenList);
		
		//arraydenList.add("F");	//RTE verdi Desteklenmeyen iþlem List gibi ekleme yapamýyoruz
		//CTE olmasý için sytax te problem olmasý lazým ancak bu yazýmda
		//syntax hatasý yok
		
		
		//bu þekilde Arrays calssindan yardým alarak arrayi liste çevirirsek
		//oluþturduðumuz listin boyutu sabit olur
		//dolayýsý ile add() veya clear() gibi methodlarý çalýþtýmak istersek hata verir
		
		arr[1]="Z";
		System.out.println("Arrayi deðitirdikten sonra array = " + Arrays.toString(arr));
		
		System.out.println("Arrayi deðitirdikten sonra List = "+arraydenList);
		
		arraydenList.set(3, "D");
		System.out.println("Listi deðitirdikten sonra List = "+arraydenList);
		System.out.println("Listi deðitirdikten sonra array = " + Arrays.toString(arr));
		
	}

}
