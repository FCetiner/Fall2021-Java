package day43_Interface;

public class C03_Concrete implements C02_Interface{

	
	public static void main(String[] args) {
		C03_Concrete concreteObje = new C03_Concrete();
	
		//Interface'de default keyword kullanarak oluþturdugumuz body'si olan method'lara
		//child concrete class'lardan obje vasýtasýyla ulaþabilirim
		
		concreteObje.kaporta();
	
	
	
	
	//Interface'de default keyword kullanarak oluþturdugumuz body'si olan method'lara
	//child concrete class'lardan interface ismi vasýtasýyla ulaþabilirim
	C02_Interface.sanzuman();
	}
	
	
	//bir interface de static veya default keyword kullanarak body'si olan bit method oluþturursak
	//Bu interface'e implement eden concrate child class'lar bu methodlarý
	//implamant etmek zorunda deðildir
	
	@Override
	public void motor() {
		
		
	}

	
	
}
