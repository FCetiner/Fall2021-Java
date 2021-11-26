package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// Verilen bir listede, i�inde belirli bir harf olan elemanlar�
		//silen bir method yaz�n
		
		List <String> str = new ArrayList<>();
		
		str.add("Jeyhun");
		str.add("Y�ld�z");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");
		
		System.out.println(str);   //[Jeyhun, Y�ld�z, Mustafa, Tugba, Turgut]
		
		String silinecekharf="a";
		
		str=killThemAll(str,silinecekharf);
		

	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {
		
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
			i--;
			}
		}
		
		System.out.println(str);
		return str;
		
		
	}

}
