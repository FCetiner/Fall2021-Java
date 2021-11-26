package day20_Scope;

public class StaticVeriables {

	
	static int no=20;
	static int sayý;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi = true;
	static boolean tatildeMi;
	
	
	
	public static void main(String[] args) {
		//static veriable'lara main method'dan direkt ulaþýlabilir mi? EVET
		
		System.out.println(no); //20
		no++;
		System.out.println(no); //21
		staticMethod();

		
		
		StaticVeriables obje= new StaticVeriables();
		obje.staticOlmayanMethod();
		System.out.println(no); 	//23
		
	}

	public static void staticMethod() {
		//static veriable'lara main method'dan direkt ulaþýlabilir mi? EVET
		no++;
		System.out.println("static method'da no : " + no);
		
	}
	
	
	public void staticOlmayanMethod() {
		//static veriable'lara main method'dan direkt ulaþýlabilir mi? EVET
		//static veriable lara static olan veya olmayan yüm methodlardan ulaþýlabilir
		//bu yüzden static veriable lara CLASS VERIABLE denir
		
		no++;
	
	
	
	}
	


	
}
