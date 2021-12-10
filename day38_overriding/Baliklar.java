package day38_overriding;

public class Baliklar extends Animals{

	public static void main(String[] args) {
		
		Baliklar balik1 = new Baliklar();

		balik1.beslenme(); //T�m hayvanlar beslenir
		balik1.hareket(); //Bal�klar y�zerek hareket ederler
		balik1.solunum(); //Bal�klar solungaclar� ile nefes al�r
		//Overriding de bu classda oldugu i�in parente gitmeden bu classdakini kulland�
		
		
	}
	//Child Class'daki bir method parent classdan bir methodu override ediyorse
	//bunu istersek @Override notasyonu ile deklare edebiliriz
	//deklare etmesekte kodlar�m�z �al���r 
	//ancak deklare etti�imizde Java overriden method'u surekli kontrol eder
	//ve o methodda overridinge uymayan bir de�i�iklik olursa CTE verir
	
	@Override
	public void hareket () {
		System.out.println("Bal�klar y�zerek hareket ederler");
	}
	
	
	
	
	public void solunum() {
		System.out.println("Bal�klar solungaclar� ile nefes al�r");
	}
}
