package day39_overriding_polymorphism;

public class C01 {

	
	
	public static void staticMethod () {
		System.out.println("Parent class static method caliþti");
	}
	
	private void privateMethod () {
		System.out.println("Parent class private method");
		
		
	}
	//final demek bu son hali bir daha deðiþtirilemez demektir
	//dolayýsý ile final olarak tanýmlanan bir method
	//override edilemez
	public final void finalMethod() {
		System.out.println("Parent class final method");
	}
	
	//child class ile parent class ayni package da olduklarýndan
	//methodlarýn acsess modifierlarý public, protected veya default olsaydý hiç bir sorun olmazdý
	
}
