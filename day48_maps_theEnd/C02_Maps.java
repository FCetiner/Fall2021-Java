package day48_maps_theEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// Verilen map’te istenen programlama dilini bilen kisileri 
		// list olarak donduren bir method yaziniz.
		// map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil  java
		// Sonuc  [Ali, Veli]
		
		Map<Integer,String> soruMap=MapOlustur.myMap();
		String istenenDil="Java";
		
		System.out.println(dilBilenListesiOlustur(soruMap,istenenDil));
		
		

	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		List<String> dilBilenListesi=new ArrayList<>();
		soruMap.values();	//Bize collection dondurur
		List<String>valueList=new ArrayList<>(soruMap.values());
	//	valueList==> //eleman sayýsý 3 [Ali, Can, Java, Veli, Yan, Java, Veli, Yan, C#]
		//Bu üç elemaný tek tek ele alip split ile bolup
		//dil deðeri verilen inputa eþit olanlarýn
		//isim deðerlerini liste ekleyeceðiz
		String parcaliArr[]=new String[3];
		for (String each : valueList) {
			parcaliArr=each.split(", ");//[Ali, Can, Java] seklinde üç elemanlý bir arr getirecek
			
			if (parcaliArr[2].equalsIgnoreCase(istenenDil)) {
				dilBilenListesi.add(parcaliArr[0]);
			}
		}
		return dilBilenListesi;
	}

}
