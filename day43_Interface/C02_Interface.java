package day43_Interface;

public interface C02_Interface {

	void motor(); //normal class'larda access modifier yazmazsan�z Java default access mo. kabul eder
					// interface'de ise access modifier yazmazsan�z Java public access mo. kabul eder

	int say�=10;	//final ve static olarak kabul etti
					 //veriabllar initialize edilmeli
	//interface de body si olan bir method yazmak isterseniz
	//Java size 2 alternatif sunar
	//1 methodun ba��na "default" keyword yazabilirsiniz
	// ancak burada yaz�lan default access modifier de�il Java'n�n interface i�in ozel kabul etti�i bir keyworddur
	public default void kaporta() { 			//normalde bosy olu�turulam�yordu, yeni g�ncelleme ile ba��na default veya static ekleyerek
			System.out.println("Default keyword sayesinde body olu�turabildim");								//kullanabiliyoruz buradaki default keywordu acces modifier de�il
		
	}
	

	public static void sanzuman() {
		System.out.println("static keyword ile body olu�turabildim");
	}


}
