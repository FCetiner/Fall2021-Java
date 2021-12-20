package day46_collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class C02_RetainAll {

	public static void main(String[] args) {
		Set<String> lhs1=new LinkedHashSet<>();

		lhs1.add("Ferhat");
		lhs1.add("Azra");
		lhs1.add("Ada");
		lhs1.add("Ümran");
		
		Set<String> lhs2=new LinkedHashSet<>();
		lhs2.add("Ferhat");
		lhs2.add("Azra");
		lhs2.add("Filiz");
		
		/*System.out.println(lhs1.retainAll(lhs2));
		
		System.out.println(lhs1);
		System.out.println(lhs2);*/
		
		System.out.println(lhs2.retainAll(lhs1));//true
		System.out.println(lhs2);//[Ferhat, Azra]
		
		
	}

}
