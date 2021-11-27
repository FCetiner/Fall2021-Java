package day27_constructor_constructorcall;

import day26_forEachLoop_Constructor.Car;

public class C01_CarRunner {

	public static void main(String[] args) {
		//D�nk� car class'�ndan bir obje olu�tural�m
		//D�nk� Car Class�ndan boje olu�turmak istedi�imizde
		// Java Car class'�n� i�inde bulundu�umuz class'a import etmek ister
		
		Car car=new Car();
		System.out.println(car.y�l);
		//ancak ba�ka package'da oldu�u i�in i�inde oldu�umuz class'dan 
		//Car class'�ndaki veriable'lara ula�abilmem i�in veriable'in acsess modifier'i
		//public olmal�d�r.
	
	Car1 car1=new Car1();
	System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.y�l+ " " + car1.sat�l�kM�);
	//0 null null 2000 false
	
	car1.km=75000;
	car1.model="Corolla";
	car1.renk="K�rm�z�";
	System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.y�l+ " " + car1.sat�l�kM�);
	//75000 Corolla K�rm�z� 2000 false
	
	Car1 car2=new Car1();
	System.out.println(car2.km + " " + car2.model + " " + car2.renk + " " + car2.y�l+ " " + car2.sat�l�kM�);
	
	Car1 car3 = new Car1();
	car3.km=40000;
	car3.sat�l�kM�=true;
	System.out.println(car3.km + " " + car3.model + " " + car3.renk + " " + car3.y�l+ " " + car3.sat�l�kM�);
	// 40000 null null 2000 true
	
	
	}

}
