package day27_constructor_constructorcall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		// Java'n�n olu�turdu�u default constructor ile obje olu�turabiliyoruz
		//ama her obje i�in yeniden de�er atamas� yapmak uzun oluyor
		//Istersek parametreli constructorlar olu�turup
		//daha obje olu�tururken isted�i�im �zellikleri atayabilirim
		
		
		@SuppressWarnings("unused")
		Car1 car1 = new Car1(50000,    "Vectra" ,     "Beyaz"       , 2015   , true);
							//int km, String model, String renk,   int y�l   
		
		
	Car1 car2 = new Car1(35000);
						//int km
	
	
	System.out.println(car2.km); //35000
	Car1 car3=new Car1();
	System.out.println(car3.km);//0
	
	Car1 car4=new Car1(1000);
	System.out.println(car4.km); //1000
	
	// y�l ve km yi parametre olarak girebilece�im bir constructor daha olu�turabilir miyim?
	
	Car1 car5 = new Car1(2020,5000);
					  //y�l		km
	
	System.out.println(car5.y�l + " " + car5.km + " " + car5.model);
						// 2020			5000			null
	
	
	
	}
	
	

}
