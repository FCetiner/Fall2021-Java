package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		//Gelen sona gelir, silinen baþtan silinir
		//FÝFO
		Queue <String> kuyruk = new LinkedList<>();
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Rýdvan");
		
		System.out.println(kuyruk);
		kuyruk.remove();//Kuyruk eklerken sona ekler çýkarýrken baþa ekler
		System.out.println(kuyruk);//[Mustafa, Rýdvan]
		
		//index yapýsý yok set gibi
		//set unique olur ama bunda oyle bir þey yok
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);
		System.out.println(kuyruk);
		

	}

}
