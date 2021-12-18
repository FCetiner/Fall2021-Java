package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

	public static void main(String[] args) {

		List<Integer> liste = new ArrayList<>();

		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
	
		System.out.println(liste); //[5, 3, 7, 1, 9, 8, 2]
		
		@SuppressWarnings("rawtypes")
		Iterator ite1=liste.iterator(); //Bu liste i�in iterator olu�turuldu
		
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(ite1.hasNext() + " === " + ite1.next());
		}
		
		//senin yan�bas�nda eleman var m�? hasNext? cevap liste i�in true 
		//next in yapt�g� i� imleci bir sonraki elemana ta��r ve atlad��� eleman� getirir 
		//D�ng� tekrar ba�lar yan�nda eleman var m�? true next imleci ta��r ve 2. eleman� getiri
		//iterator yineleyici demektir
		
		System.out.println(ite1.hasNext()); //iterator listenin sonunda kald�g� i�in false
		System.out.println(ite1.next()); //NoSuchElementException runtime exception verir
		
		
		
		
	}

}
