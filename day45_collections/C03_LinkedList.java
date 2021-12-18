package day45_collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
	

		LinkedList<Integer> ll= new LinkedList<>();

		System.out.println(ll); //[]
		ll.add(5);
		ll.add(7);
		System.out.println(ll);//[5, 7]
			
		System.out.println(ll.peek());//Silmeden ilk elemaný bana getirir
		System.out.println(ll.peekFirst());//5
		
		LinkedList<Integer> ll2= new LinkedList<>();

		System.out.println(ll2.peekFirst());//Boþ listede null getirir
		System.out.println(ll2.peek());//null
		
		System.out.println(ll.element());//5
	//	System.out.println(ll2.element());//NoSuchElementExceptions verir
		
		System.out.println(ll.poll());// birinci elementi siler ve getirir
		System.out.println(ll);//7
		System.out.println(ll.poll());//7
		System.out.println(ll);//[]
		System.out.println(ll.poll());//null
		
		System.out.println(ll.hashCode());//1 Javanýn bu liste için verdii hashCode verir
		
		ll2.add(7);
		System.out.println(ll2.hashCode());//38
		
		ll2.offer(10);
		System.out.println(ll2); //[7, 10]
		
		System.out.println(ll2.offer(10));//10 ekledi ve true fiye bilgi döndürdü
		
		ll2.push(2); //addFirst() ile ayný

		
		
		
	}

}
