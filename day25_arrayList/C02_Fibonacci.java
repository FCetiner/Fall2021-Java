package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {
		// verilen bir sayýdan küçük fibonacci sayýlarýný bir list olarak kaydedelim
		
		//1,1,2,3,5,6,13,21,34,55....
		
		int sýnýr=100;
		
		List <Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		int sayý=0;
		
		while (sayý<sýnýr) {
			sayý=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			fibonacci.add(sayý);
		}
		System.out.println(fibonacci);
		fibonacci.remove(fibonacci.size()-1); //son element 100 den büyük olduðu için çýkardýk
		System.out.println(fibonacci);
	}

}
