package day45_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {

		List<Integer> ll = new LinkedList<>(); // Data t�r� olarak List kulland�k

		ll.add(5);
		ll.add(7);
		System.out.println(ll);// [5, 7]

		ll.add(9); // Data t�r�n� list se�ti�imiz i�in sadece List interface'indeki methodlar�
					// kullanabiliriz
					// LinkedList Class�nda Override etti�imiz i�in
					// List Interface olmas�na ragmen List methodlar�n� kullanabildik

		Queue<Integer> ll2 = new LinkedList<>();

		ll2.add(5);
		ll2.add(7);
		ll2.clear();// Data t�r� Qeue se�ilince Queue interface'nden gelen methodlar� kullanabildik
		System.out.println(ll);

		Deque<Integer> ll3 = new LinkedList<>(); //Kullanacag�m�z projede hangi class �zellikleri laz�msa onu secebiliriz

		ll3.add(5);
		ll3.add(7);
		ll3.addLast(20);
		
		
		
		
		
		
		
	}

}
