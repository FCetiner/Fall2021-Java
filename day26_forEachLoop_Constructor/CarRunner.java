package day26_forEachLoop_Constructor;


public class CarRunner {
public static void main(String[] args) {
	// Car class�ndan bir obje olu�tural�m
	
		Car 		car1			=		new 			Car();
	//class ismi	obje ismi		atama	keyword			Constructor call
	
	
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.y�l); //0	null  null 2000
	
		//Bir obje olu�tururken e�er obje i�in kendi class'�nda belirlenen de�erleri kullanmak istiyorsam
		//Hi� bir de�eri kendim atamadan obje olu�turabilirim
		//bu durumda hi� bir parametre kullan�lmad��� i�in default contructor yeterli olacakt�r
		
		// E�er obje olu�turdu�um class'daki de�erleri kullanma yerine kendi de�erlerimle
		//bir obje olu�turmak istersem o zaman parametreli constructor olu�turmam gerekir
		
		//Car car2=new Car("Kirmizi" , "Corolla");
		
		//Car class'�nda iki string parametresi olan bir constructor olmad��� i�in 
		//bu obje olu�turmay� �imdilik yapamay�z
		
	}
	
}
