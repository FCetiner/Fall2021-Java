package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {
		// verilen bir say�dan k���k fibonacci say�lar�n� bir list olarak kaydedelim
		
		//1,1,2,3,5,6,13,21,34,55....
		
		int s�n�r=100;
		
		List <Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		int say�=0;
		
		while (say�<s�n�r) {
			say�=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			fibonacci.add(say�);
		}
		System.out.println(fibonacci);
		fibonacci.remove(fibonacci.size()-1); //son element 100 den b�y�k oldu�u i�in ��kard�k
		System.out.println(fibonacci);
	}

}
