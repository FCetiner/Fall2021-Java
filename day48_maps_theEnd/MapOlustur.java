package day48_maps_theEnd;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
	//her seferinde ayn� map ile �al���yorsan bir aten map olu�turan static metot yazarak kolayca ula�abliriz
	public static Map<Integer,String> myMap(){
		Map<Integer,String>ornekMap=new HashMap<>();
		
		ornekMap.put(101,  "Ali, Can, Java");
		ornekMap.put(102,  "Veli, Yan, Java");
		ornekMap.put(103,  "Veli, Yan, C#");
		ornekMap.put(104,  "Mustafa, Kan, JAVA");
		ornekMap.put(105,  "Kutlu, San, C#");
		ornekMap.put(106,  "R�dvan, Tan, Java");
		
		return ornekMap;
	}
}
