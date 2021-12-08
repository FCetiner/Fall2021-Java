package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class Ustabasý extends Isci{
	
	Ustabasý(){
		System.out.println("Ustabasý parametresiz constructor calýþtý");
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Ustabasý ust1=new Ustabasý();
		
		//Java da her class oluþturuldugunda otomatik olarak 
		//default constructor oluþtugu gibi
		//Child class!da oluþturulan her bir constructor'ýn
		// ilk satýrýnda gizli super() oluþturur
		
		

	}

}
