package day48_maps_theEnd;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlarý {

	public static void main(String[] args) {


		Map<Integer,String> ornek=MapOlustur.myMap();
		System.out.println(ornek);

		System.out.println(ornek.containsKey(110)); //false
		System.out.println(ornek.containsValue("JAVA")); //false tek baþýna JAVA diye bir elemanýz yok
		System.out.println(ornek.containsValue("Mustafa, Kan, JAVA"));//True
		
		Set<Entry<Integer, String>>entrySet=ornek.entrySet();// herbir eleman data türü entry 101=Ali, Can, Java gibi...
	
		int sayac=1;
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac+".entry : " + each);
			sayac++;
		}
		System.out.println(ornek.getOrDefault(110, "girilen key map'de yok"));//girilen key map'de yok
		System.out.println(ornek.getOrDefault(103, "girilen key map'de yok"));//Veli, Yan, C#
		
		ornek.putIfAbsent(103, "Veli, Yan, Java");//eklemeyecek key'i (103) kontrol ediyor varsa eklemiyor
		ornek.putIfAbsent(110, "Fikri, Yan, QA");
		sayac=1;
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac+".entry : " + each);
			sayac++;
		}
		
		String maptenString= ornek.toString();
		System.out.println(maptenString);
		
	}

}
