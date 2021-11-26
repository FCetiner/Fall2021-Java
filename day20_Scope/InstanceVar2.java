package day20_Scope;

public class InstanceVar2 {

	
	String adres="Ankara";
	String dogumYeri;
	double notOrtalamasi;
	double yasOrt=12.3;
	char cinsiyet = 'E';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinliMi;
	
	public static void main(String[] args) {
		//Instance veriable'lara main method'dan direkt ulaþýlabilir mi? HAYIR
		//nasýl ulaþýlabilir? OBJE oluþturarak
		
		InstanceVar2 ali= new InstanceVar2();
		System.out.println(ali.adres);	//Ankara
		System.out.println(ali.dogumYeri);	//null
		System.out.println(ali.notOrtalamasi  );	//0.0
		System.out.println(ali.yasOrt );	//12.3
		System.out.println(ali.cinsiyet  );	//E
		System.out.println(ali.karakter );	// space
		System.out.println(ali.ogrenciMi );	//true
		System.out.println(ali.izinliMi  );	//false
		
		
	}

	
	
	
	
	public static void staticMethod() {
		//Instance veriable'lara static method'dan direkt ulaþýlabilir mi? HAYIR
		//nasýl ulaþýlabilir? OBJE oluþturarak
		
		
		
		
		
		
	}
	
	
	public void staticOlmayanMethod() {
		//Instance veriable'lara static olmayan method'dan direkt ulaþýlabilir mi? EVET
	
		
		
		
	}
	
	
	
}
