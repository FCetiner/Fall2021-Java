package day39_overriding_polymorphism;

public class C01 {

	
	
	public static void staticMethod () {
		System.out.println("Parent class static method cali�ti");
	}
	
	@SuppressWarnings("unused")
	private void privateMethod () {
		System.out.println("Parent class private method");
		
		
	}
	//final demek bu son hali bir daha de�i�tirilemez demektir
	//dolay�s� ile final olarak tan�mlanan bir method
	//override edilemez
	public final void finalMethod() {
		System.out.println("Parent class final method");
	}
	
	//child class ile parent class ayni package da olduklar�ndan
	//methodlar�n acsess modifierlar� public, protected veya default olsayd� hi� bir sorun olmazd�
	
}
