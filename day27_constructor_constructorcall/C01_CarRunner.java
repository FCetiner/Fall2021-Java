package day27_constructor_constructorcall;

import day26_forEachLoop_Constructor.Car;

public class C01_CarRunner {

	public static void main(String[] args) {
		//Dünkü car class'ýndan bir obje oluþturalým
		//Dünkü Car Classýndan obje oluþturmak istediðimizde
		// Java Car class'ýný içinde bulunduðumuz class'a import etmek ister
		
		Car car=new Car();
		System.out.println(car.yýl);
		//ancak baþka package'da olduðu için içinde olduðumuz class'dan 
		//Car class'ýndaki veriable'lara ulaþabilmem için veriable'in acsess modifier'i
		//public olmalýdýr.
	
	Car1 car1=new Car1();
	System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yýl+ " " + car1.satýlýkMý);
	//0 null null 2000 false
	
	car1.km=75000;
	car1.model="Corolla";
	car1.renk="Kýrmýzý";
	System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yýl+ " " + car1.satýlýkMý);
	//75000 Corolla Kýrmýzý 2000 false
	
	Car1 car2=new Car1();
	System.out.println(car2.km + " " + car2.model + " " + car2.renk + " " + car2.yýl+ " " + car2.satýlýkMý);
	
	Car1 car3 = new Car1();
	car3.km=40000;
	car3.satýlýkMý=true;
	System.out.println(car3.km + " " + car3.model + " " + car3.renk + " " + car3.yýl+ " " + car3.satýlýkMý);
	// 40000 null null 2000 true
	
	
	}

}
