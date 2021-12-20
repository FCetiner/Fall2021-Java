package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		//Gelen sona gelir, silinen ba�tan silinir
		//F�FO
		Queue <String> kuyruk = new LinkedList<>();
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("R�dvan");
		
		System.out.println(kuyruk);
		kuyruk.remove();//Kuyruk eklerken sona ekler ��kar�rken ba�a ekler
		System.out.println(kuyruk);//[Mustafa, R�dvan]
		
		//index yap�s� yok set gibi
		//set unique olur ama bunda oyle bir �ey yok
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);
		System.out.println(kuyruk);
		

	}

}
