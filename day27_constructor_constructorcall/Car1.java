package day27_constructor_constructorcall;

public class Car1 {

	public int y�l=2000;
	String renk;
	String model;
	int km;
	boolean sat�l�kM�;
	
	

	public Car1(int km, String model, String renk, int y�l, boolean sat�l�kM�) {
		// atama yapaca��m�z t�m �zellikleri parametre olarak yollad�k
		
	}

	public Car1() {
		
	}
	
	public Car1(int i) { // bu sat�rdaki int km ile class leveldeki int km farkl� scope'lardadir
		km=i;
	}

	public Car1(int i, int j) {
				//y�l  km
		y�l=i; km=j;
	}

	public void h�z(int h�z) {
		System.out.println("araba saatte " + h�z + " km yapar." ) ;
	}
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullan�r.");
	}
}
