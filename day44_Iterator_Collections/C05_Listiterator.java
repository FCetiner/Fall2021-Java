package day44_Iterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_Listiterator {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {


		List <String> liste=new ArrayList<>();
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Ayþe");
		liste.add("Fatma");
		liste.add("Emrah");
		System.out.println(liste);//[Ali, Veli, Ayþe, Fatma, Emrah]
		
		@SuppressWarnings("rawtypes")
		ListIterator li1 = liste.listIterator(); //interfae dir
		String temp="";
		
		
		while (li1.hasNext()) {		
			temp=(String) li1.next();
			li1.set(temp+"x");
		//	li1.set(li1.next()+"x"); set ile çözümü
			
		}
		System.out.println(liste); //[Alix, Velix, Ayþex, Fatmax, Emrahx]
	}

}
