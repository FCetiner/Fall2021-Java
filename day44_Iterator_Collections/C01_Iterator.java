package day44_Iterator_Collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {


		List <Integer> liste = new ArrayList<>();
		
		liste.add(5);
		liste.add(8);
		liste.add(7);
		liste.add(6);
		liste.add(3);
		liste.add(2);
		liste.add(1);
		
		System.out.println(liste);
		// index kullanmadan tum elemanlar� 3 eklenmi� olarak yazd�r�n
		
		for (Integer each : liste) {
			System.out.print(each+3 + " ");
		}
		
		System.out.println();
		
		System.out.print(liste);
		
		
		for (Integer each : liste) {
			each+=3;
		}

		//foreach loop ile index kullanmadan tum elementlere ulasabiliyoruz ama kal�c� de�i�iklik yapam�yoruz
		
		
		
		
		
		
		
		
		
	}

}
