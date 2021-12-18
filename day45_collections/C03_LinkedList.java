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
		System.out.println(ll2.peek());
		
		
	}

}
