package day43_Interface;

public class C03_Concrete implements C02_Interface{

	
	public static void main(String[] args) {
		C03_Concrete concreteObje = new C03_Concrete();
	
		//Interface'de default keyword kullanarak olu�turdugumuz body'si olan method'lara
		//child concrete class'lardan obje vas�tas�yla ula�abilirim
		
		concreteObje.kaporta();
	
	
	
	
	//Interface'de default keyword kullanarak olu�turdugumuz body'si olan method'lara
	//child concrete class'lardan interface ismi vas�tas�yla ula�abilirim
	C02_Interface.sanzuman();
	}
	
	
	//bir interface de static veya default keyword kullanarak body'si olan bit method olu�turursak
	//Bu interface'e implement eden concrate child class'lar bu methodlar�
	//implamant etmek zorunda de�ildir
	
	@Override
	public void motor() {
		
		
	}

	
	
}
