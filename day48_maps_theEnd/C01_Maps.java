package day48_maps_theEnd;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		// Verilen bir String�deki harfleri
		// ve harflerin kacar kez kullanildigini return eden bir method yaziniz
		// Ornek : Input : Hellooo output : H=1, e=1, l=2, o=3

		String input = "Hellooo";
		
		Map<String,Integer>mainMap =  harfSay(input);
		System.out.println(mainMap);
	}

	private static Map<String,Integer> harfSay(String input) {
		Map<String,Integer> harfSay�lar�Map=new HashMap<>();
		String inputArr[]=input.split(""); 
		
		for (String each : inputArr) {
			if (!harfSay�lar�Map.containsKey(each)) {
				harfSay�lar�Map.put(each, 1);
			} else {
				// harfSay�lar�Map.get(each)+1 bu girilen harfin value'sunu bulup 1 art�r�r
				harfSay�lar�Map.put(each, harfSay�lar�Map.get(each)+1);
			}
		}
		
		
		
	return harfSay�lar�Map;
	}

}
