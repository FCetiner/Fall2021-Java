package day27_constructor_constructorcall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		// Java'nýn oluþturduðu default constructor ile obje oluþturabiliyoruz
		//ama her obje için yeniden deðer atamasý yapmak uzun oluyor
		//Istersek parametreli constructorlar oluþturup
		//daha obje oluþtururken istedðiðim özellikleri atayabilirim
		
		
		@SuppressWarnings("unused")
		Car1 car1 = new Car1(50000,    "Vectra" ,     "Beyaz"       , 2015   , true);
							//int km, String model, String renk,   int yýl   
		
		
	Car1 car2 = new Car1(35000);
						//int km
	
	
	System.out.println(car2.km); //35000
	Car1 car3=new Car1();
	System.out.println(car3.km);//0
	
	Car1 car4=new Car1(1000);
	System.out.println(car4.km); //1000
	
	// yýl ve km yi parametre olarak girebileceðim bir constructor daha oluþturabilir miyim?
	
	Car1 car5 = new Car1(2020,5000);
					  //yýl		km
	
	System.out.println(car5.yýl + " " + car5.km + " " + car5.model);
						// 2020			5000			null
	
	
	
	}
	
	

}
