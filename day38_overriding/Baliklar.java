package day38_overriding;

public class Baliklar extends Animals{

	public static void main(String[] args) {
		
		Baliklar balik1 = new Baliklar();

		balik1.beslenme(); //T�m hayvanlar beslenir
		balik1.hareket(); //Bal�klar y�zerek hareket ederler
		balik1.solunum(); //
		
		
	}
	public void hareket () {
		System.out.println("Bal�klar y�zerek hareket ederler");
	}
	
	
	
	
	public void solunum() {
		System.out.println("Bal�klar solungaclar� ile nefes al�r");
	}
}
