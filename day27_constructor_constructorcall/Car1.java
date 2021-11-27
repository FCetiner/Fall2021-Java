package day27_constructor_constructorcall;

public class Car1 {

	public int yıl=2000;
	String renk;
	String model;
	int km;
	boolean satılıkMı;
	
	

	public Car1(int km, String model, String renk, int yıl, boolean satılıkMı) {
		// atama yapacağımız tüm özellikleri parametre olarak yolladık
		
	}

	public Car1() {
		
	}
	
	public Car1(int i) { // bu satırdaki int km ile class leveldeki int km farklı scope'lardadir
		km=i;
	}

	public Car1(int i, int j) {
				//yıl  km
		yıl=i; km=j;
	}

	public void hız(int hız) {
		System.out.println("araba saatte " + hız + " km yapar." ) ;
	}
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanır.");
	}
}
