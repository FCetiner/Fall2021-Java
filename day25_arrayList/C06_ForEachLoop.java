package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hiç ugraþmadan bir array veya listedeki tum elemanlarý
		//gozden geçirmek isteriz
		
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
		
		//Eðer bir list veya array'in tüm elemanlarýný elden geçirmek istiyorsak
		//ve sýralama önemli deðilse
		//for-each loop kullanýrýz.
		
		
	}

}
