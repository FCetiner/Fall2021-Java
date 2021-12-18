package day45_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {

		List<Integer> ll = new LinkedList<>(); // Data türü olarak List kullandýk

		ll.add(5);
		ll.add(7);
		System.out.println(ll);// [5, 7]

		ll.add(9); // Data türünü list seçtiðimiz için sadece List interface'indeki methodlarý
					// kullanabiliriz
					// LinkedList Classýnda Override ettiðimiz için
					// List Interface olmasýna ragmen List methodlarýný kullanabildik

		Queue<Integer> ll2 = new LinkedList<>();

		ll2.add(5);
		ll2.add(7);
		ll2.clear();// Data türü Qeue seçilince Queue interface'nden gelen methodlarý kullanabildik
		System.out.println(ll);

		Deque<Integer> ll3 = new LinkedList<>(); //Kullanacagýmýz projede hangi class özellikleri lazýmsa onu secebiliriz

		ll3.add(5);
		ll3.add(7);
		ll3.addLast(20);
		
		
		
		
		
		
		
	}

}
