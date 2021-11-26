package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hi� ugra�madan bir array veya listedeki tum elemanlar�
		//gozden ge�irmek isteriz
		
		int arr []= {1,2,3,5,2,7};
		
		//bu arrayi esnek bir list yapmak istiyorum
		
		List <Integer> yeniList= new ArrayList <>();
		
		
		
		/*for (int i = 0; i < arr.length; i++) {
		yeniList.add(arr[i]);	
		}
		System.out.println(yeniList);*/

		for (int each : arr) {  //arr'deki herbir(each) int'i bana getir
			yeniList.add(each);
		}
	
		System.out.println(yeniList);
		
		//E�er bir list veya array'in t�m elemanlar�n� elden ge�irmek istiyorsak
		//ve s�ralama �nemli de�ilse
		//for-each loop kullan�r�z.
		
		
	}

}
