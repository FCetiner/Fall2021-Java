package day38_overriding;

public class Baliklar extends Animals{

	public static void main(String[] args) {
		
		Baliklar balik1 = new Baliklar();

		balik1.beslenme(); //Tüm hayvanlar beslenir
		balik1.hareket(); //Balýklar yüzerek hareket ederler
		balik1.solunum(); //Balýklar solungaclarý ile nefes alýr
		//Overriding de bu classda oldugu için parente gitmeden bu classdakini kullandý
		
		
	}
	//Child Class'daki bir method parent classdan bir methodu override ediyorse
	//bunu istersek @Override notasyonu ile deklare edebiliriz
	//deklare etmesekte kodlarýmýz çalýþýr 
	//ancak deklare ettiðimizde Java overriden method'u surekli kontrol eder
	//ve o methodda overridinge uymayan bir deðiþiklik olursa CTE verir
	
	@Override
	public void hareket () {
		System.out.println("Balýklar yüzerek hareket ederler");
	}
	
	
	
	
	public void solunum() {
		System.out.println("Balýklar solungaclarý ile nefes alýr");
	}
}
