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
		Iterator ite1=liste.iterator(); //Bu liste için iterator oluşturuldu
		
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(ite1.hasNext() + " === " + ite1.next());
		}
		
		//senin yanıbasında eleman var mı? hasNext? cevap liste için true 
		//next in yaptıgı iş imleci bir sonraki elemana taşır ve atladığı elemanı getirir 
		//Döngü tekrar başlar yanında eleman var mı? true next imleci taşır ve 2. elemanı getiri
		//iterator yineleyici demektir
		
		System.out.println(ite1.hasNext()); //iterator listenin sonunda kaldıgı için false
		System.out.println(ite1.next()); //NoSuchElementException runtime exception verir
		
		
		
		
	}

}
