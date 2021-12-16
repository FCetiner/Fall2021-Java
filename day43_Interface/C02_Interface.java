package day43_Interface;

public interface C02_Interface {

	void motor(); //normal class'larda access modifier yazmazsanýz Java default access mo. kabul eder
					// interface'de ise access modifier yazmazsanýz Java public access mo. kabul eder

	int sayý=10;	//final ve static olarak kabul etti
					 //veriabllar initialize edilmeli
	//interface de body si olan bir method yazmak isterseniz
	//Java size 2 alternatif sunar
	//1 methodun baþýna "default" keyword yazabilirsiniz
	// ancak burada yazýlan default access modifier deðil Java'nýn interface için ozel kabul ettiði bir keyworddur
	public default void kaporta() { 			//normalde bosy oluþturulamýyordu, yeni güncelleme ile baþýna default veya static ekleyerek
			System.out.println("Default keyword sayesinde body oluþturabildim");								//kullanabiliyoruz buradaki default keywordu acces modifier deðil
		
	}
	

	public static void sanzuman() {
		System.out.println("static keyword ile body oluþturabildim");
	}


}
