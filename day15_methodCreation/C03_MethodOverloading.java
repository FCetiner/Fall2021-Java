package day15_methodCreation;

public class C03_MethodOverloading {

	public static void main(String[] args) {
		// Javada ayn� isimde birden fazla method olur mu
		//cevap	: EVET
		
		// Ayn� isimde birden fazla method olursa Java hangisini �al��t�raca��na nas�l karar verir?
		// cevap isim ayn� olan methodlarda �ncelikle parametre say�s�na bakar
		//sonrada parametre say�s� ile arg�man say�s� e�it olanlardan
		//arg�man data t�rleri ile parametre data t�rleri aras�nda uyuma bakar
		//tamamen uyu�an varsa onu kullan�r
		//tamamen uyu�an yoksa kapsayan varm� bakar onu kullan�r
		//birden fazla secenek varsa java her zaman en optimum olan� tercih eder
		
		int say�1=4;
		int say�2=5;			//buras� arg�ment
		int say�3=10;
		int say�4 = 20;
		
		
		topla(say�1,say�2,say�3,say�4);
		

	}

	private static void topla(int say�1, int say�2, int say�3, int say�4) {
		System.out.println("d�rt say�n�n toplam�  :  " + (say�1+say�2+say�3+say�4));
		
	}

	private static void topla(int say�1, int say�2, int say�3) {
		System.out.println("d�rt say�n�n toplam�  :  " + (say�1+say�2+say�3));
		//buras� parametre
	}

	private static void topla(int say�1, int say�2) {
		System.out.println("iki say�n�n toplam� ii :  " + (say�1+say�2));
		
	}

	private static void topla(int say�1, double say�2) {
		System.out.println("iki say�n�n toplam� id :  " + (say�1+say�2));
		
	}
	private static void topla(double say�1, int say�2) {
		System.out.println("iki say�n�n toplam� di :  " + (say�1+say�2));
		
	}
	private static void topla(double say�1, double say�2) {
		System.out.println("iki say�n�n toplam� dd :  " + (say�1+say�2));
		
	}


}
