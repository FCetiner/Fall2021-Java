package day44_Iterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_Listiterator {

	public static void main(String[] args) {


		List <String> liste=new ArrayList<>();
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Ay�e");
		liste.add("Fatma");
		liste.add("Emrah");
		System.out.println(liste);//[Ali, Veli, Ay�e, Fatma, Emrah]
		
		ListIterator li1 = liste.listIterator(); //interfae dir
		String temp="";
		
		
		while (li1.hasNext()) {		
			temp=(String) li1.next();
			li1.set(temp+"x");
		//	li1.set(li1.next()+"x");
			
		}
		System.out.println(liste);
	}

}
