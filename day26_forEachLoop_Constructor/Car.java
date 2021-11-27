package day26_forEachLoop_Constructor;

public class Car {

	//Java biz bir class olu�turdu�umuzda, o classtan obje �reteci�imizi bilir
	//her classa default bir constructor yerle�tirir
	//Java n�n classa koydu�u bu default constructor gorulmez
	// ama obje uretmek uzere kod yazd���m�zda otomatik olarak devreye girer
	
	//bir constructor olu�turmak �ok kolayd�r
	//methoda benzer ama methoddan farkl�d�r.
	//1- Constructor ismi class ismi ile ayn� olmal�d�r
	// class isimleri b�y�k harf ile ba�lad��� i�in Constructor ismide buyuk harfle ba�lar
	// method'dan birinci fark� budur, methodlar kucuk harfle ba�lar
	//2- Contructor'lar�n return Type olmaz
	//method'dan ikinci fark� budur, methodlar�n return type'� olmal�d�r
	public Car() {
		
	}
	
	//Java'n�n her Class'da olu�turdu�u constructor budur.
	
	public int y�l=2000;
	String renk;
	String model;
	int km;
	boolean sat�l�kM�;
	
	//Bug�n itibar�yle class'larda main method olma mecburiyeti kald�r�lm��t�r :)
	//Ancak bildi�imiz gibi main method olmayan bir class direkt �al��t�r�lamaz
	//Main methodu olmayan class'lar ba�ka class'lardan obje olu�turulmak �zere kullan�lmak �zere
	//ihtiya� duyulan veriable ve methodlar� saklad���m�z bir depo gibidir
	
	
}
