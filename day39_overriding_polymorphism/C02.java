package day39_overriding_polymorphism;

public class C02 extends C01{
public static void main(String[] args) {
	
	C02 obj1 = new C02();
	obj1.privateMethod();
	obj1.staticMethod();
	
	C01 obj2 = new C02();
	//obj2.privateMethod();
	//Data türü C01 oldugundan oncelikle C01 class'ýndaki 
	//methoda bakmamýz gerekir ancak private oldugundan ulaþamayýz
	//ulaþamadýgýmýz bir methodu override yapamayýz
	//Dolayýsý ile signature ayný olmasýna RAGMEN bu ikisi farklý iki method olarak çalýþýr
	obj2.staticMethod();
	
	
	
}



public static void staticMethod () {
	System.out.println("Child class static method caliþti");
}

private void privateMethod () {
	System.out.println("Child class private method");
	
	
}

//public final void finalMethod() {
//	System.out.println("Child class final method");
//}
}
