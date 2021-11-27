package day26_forEachLoop_Constructor;

public class Car {

	//Java biz bir class oluþturduðumuzda, o classtan obje üreteciðimizi bilir
	//her classa default bir constructor yerleþtirir
	//Java nýn classa koyduðu bu default constructor gorulmez
	// ama obje uretmek uzere kod yazdýðýmýzda otomatik olarak devreye girer
	
	//bir constructor oluþturmak çok kolaydýr
	//methoda benzer ama methoddan farklýdýr.
	//1- Constructor ismi class ismi ile ayný olmalýdýr
	// class isimleri büyük harf ile baþladýðý için Constructor ismide buyuk harfle baþlar
	// method'dan birinci farký budur, methodlar kucuk harfle baþlar
	//2- Contructor'larýn return Type olmaz
	//method'dan ikinci farký budur, methodlarýn return type'ý olmalýdýr
	public Car() {
		
	}
	
	//Java'nýn her Class'da oluþturduðu constructor budur.
	
	public int yýl=2000;
	String renk;
	String model;
	int km;
	boolean satýlýkMý;
	
	//Bugün itibarýyle class'larda main method olma mecburiyeti kaldýrýlmýþtýr :)
	//Ancak bildiðimiz gibi main method olmayan bir class direkt çalýþtýrýlamaz
	//Main methodu olmayan class'lar baþka class'lardan obje oluþturulmak üzere kullanýlmak üzere
	//ihtiyaç duyulan veriable ve methodlarý sakladýðýmýz bir depo gibidir
	
	
}
