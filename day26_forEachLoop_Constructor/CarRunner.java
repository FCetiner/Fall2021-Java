package day26_forEachLoop_Constructor;


public class CarRunner {
public static void main(String[] args) {
	// Car classýndan bir obje oluþturalým
	
		Car 		car1			=		new 			Car();
	//class ismi	obje ismi		atama	keyword			Constructor call
	
	
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yýl); //0	null  null 2000
	
		//Bir obje oluþtururken eðer obje için kendi class'ýnda belirlenen deðerleri kullanmak istiyorsam
		//Hiç bir deðeri kendim atamadan obje oluþturabilirim
		//bu durumda hiç bir parametre kullanýlmadýðý için default contructor yeterli olacaktýr
		
		// Eðer obje oluþturduðum class'daki deðerleri kullanma yerine kendi deðerlerimle
		//bir obje oluþturmak istersem o zaman parametreli constructor oluþturmam gerekir
		
		//Car car2=new Car("Kirmizi" , "Corolla");
		
		//Car class'ýnda iki string parametresi olan bir constructor olmadýðý için 
		//bu obje oluþturmayý þimdilik yapamayýz
		
	}
	
}
