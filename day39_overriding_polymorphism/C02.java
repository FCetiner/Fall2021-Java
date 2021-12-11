package day39_overriding_polymorphism;

public class C02 extends C01{
public static void main(String[] args) {
	
	C02 obj1 = new C02();
	obj1.privateMethod();
	obj1.staticMethod();
	
	C01 obj2 = new C02();
	//obj2.privateMethod();
	//Data t�r� C01 oldugundan oncelikle C01 class'�ndaki 
	//methoda bakmam�z gerekir ancak private oldugundan ula�amay�z
	//ula�amad�g�m�z bir methodu override yapamay�z
	//Dolay�s� ile signature ayn� olmas�na RAGMEN bu ikisi farkl� iki method olarak �al���r
	obj2.staticMethod();
	
	
	
}



public static void staticMethod () {
	System.out.println("Child class static method cali�ti");
}

private void privateMethod () {
	System.out.println("Child class private method");
	
	
}

//public final void finalMethod() {
//	System.out.println("Child class final method");
//}
}
