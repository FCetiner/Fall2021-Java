package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class Ustabas� extends Isci{
	
	Ustabas�(){
		System.out.println("Ustabas� parametresiz constructor cal��t�");
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Ustabas� ust1=new Ustabas�();
		
		//Java da her class olu�turuldugunda otomatik olarak 
		//default constructor olu�tugu gibi
		//Child class!da olu�turulan her bir constructor'�n
		// ilk sat�r�nda gizli super() olu�turur
		
		

	}

}
