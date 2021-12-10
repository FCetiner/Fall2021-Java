package day38_overriding;

public class Baliklar extends Animals{

	public static void main(String[] args) {
		
		Baliklar balik1 = new Baliklar();

		balik1.beslenme(); //Tüm hayvanlar beslenir
		balik1.hareket(); //Balýklar yüzerek hareket ederler
		balik1.solunum(); //
		
		
	}
	public void hareket () {
		System.out.println("Balýklar yüzerek hareket ederler");
	}
	
	
	
	
	public void solunum() {
		System.out.println("Balýklar solungaclarý ile nefes alýr");
	}
}
