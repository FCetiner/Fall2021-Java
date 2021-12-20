package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {
//	Set Methods :
//		.add(eleman);-->Set’e eleman ekler
//		.addAll(collection);-->istenen collection’in tum elemanlarini ekler
//		.contains(eleman);-->istenen eleman sett’te varsa true, yoksa false dondurur.
//		.containsAll(collection);-->istenen collection’in tumu aranan sette var ise true, yoksa false dondurur
//		.remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false dondurur
//		.removeAll(collection);-->istenen collection’in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false dondurur
//		.equlas(set2);-->istenen set2’le tum elemanlar ayni ise true, yoksa false dondurur
//		.retainAll(collection1);-->collection1’nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false dondurur(kesişen ortak elemanları döndürür.)
//		.clear();-->sett'teki Tum elemanlari siler
//		.isEmpty();-->Sette hic eleman yoksa true, varsa false dondurur
//		.size();-->set’in eleman sayisini verir
		  

	public static void main(String[] args) {
		// Verilen bir arraydaki tekrar eden say�lar� silip 
		//unique de�erlerden olusan bir array olu�turun

		int arr[]= {3,4,5,6,4,6,2,5,6,2,6,8,9,9};
		Set<Integer>benzersizSet=new HashSet<>();
		
		for (Integer each : arr) {
			benzersizSet.add(each);
		}
		System.out.println(benzersizSet);
		
		Object[] tekrarsizArr=benzersizSet.toArray();
		System.out.println(Arrays.toString(tekrarsizArr));
		
		int toplam=0;
		for (Integer each : benzersizSet) {
			toplam+=each;
		}
		System.out.println(toplam);
		
		benzersizSet.add(31);
		
		System.out.println(benzersizSet.contains(31));
		System.out.println(benzersizSet.remove(1));
		
		int tekrarsiz[]= new int[benzersizSet.size()];
	    int index=0;
	    for (int each : benzersizSet) {
	        tekrarsiz[index]=each;
	        index++;
	    }System.out.println(Arrays.toString(tekrarsiz));
	}

}
