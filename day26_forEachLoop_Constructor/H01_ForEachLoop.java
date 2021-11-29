package day26_forEachLoop_Constructor;

import java.util.ArrayList;
import java.util.List;

public class H01_ForEachLoop {

	public static void main(String[] args) {
		// Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini 
		//For each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		
		List <Integer> arr = new ArrayList <> ();
		arr.add(3);
		arr.add(5);
		arr.add(7);
		int a=0;
				
		for (Integer each : arr) {
			a+=(each*each);
		}
	System.out.println(a);
	
	}

}
