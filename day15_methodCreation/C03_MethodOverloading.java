package day15_methodCreation;

public class C03_MethodOverloading {

	public static void main(String[] args) {
		// Javada ayný isimde birden fazla method olur mu
		//cevap	: EVET
		
		// Ayný isimde birden fazla method olursa Java hangisini çalýþtýracaðýna nasýl karar verir?
		// cevap isim ayný olan methodlarda öncelikle parametre sayýsýna bakar
		//sonrada parametre sayýsý ile argüman sayýsý eþit olanlardan
		//argüman data türleri ile parametre data türleri arasýnda uyuma bakar
		//tamamen uyuþan varsa onu kullanýr
		//tamamen uyuþan yoksa kapsayan varmý bakar onu kullanýr
		//birden fazla secenek varsa java her zaman en optimum olaný tercih eder
		
		int sayý1=4;
		int sayý2=5;			//burasý argüment
		int sayý3=10;
		int sayý4 = 20;
		
		
		topla(sayý1,sayý2,sayý3,sayý4);
		

	}

	private static void topla(int sayý1, int sayý2, int sayý3, int sayý4) {
		System.out.println("dört sayýnýn toplamý  :  " + (sayý1+sayý2+sayý3+sayý4));
		
	}

	@SuppressWarnings("unused")
	private static void topla(int sayý1, int sayý2, int sayý3) {
		System.out.println("dört sayýnýn toplamý  :  " + (sayý1+sayý2+sayý3));
		//burasý parametre
	}

	@SuppressWarnings("unused")
	private static void topla(int sayý1, int sayý2) {
		System.out.println("iki sayýnýn toplamý ii :  " + (sayý1+sayý2));
		
	}

	@SuppressWarnings("unused")
	private static void topla(int sayý1, double sayý2) {
		System.out.println("iki sayýnýn toplamý id :  " + (sayý1+sayý2));
		
	}
	@SuppressWarnings("unused")
	private static void topla(double sayý1, int sayý2) {
		System.out.println("iki sayýnýn toplamý di :  " + (sayý1+sayý2));
		
	}
	@SuppressWarnings("unused")
	private static void topla(double sayý1, double sayý2) {
		System.out.println("iki sayýnýn toplamý dd :  " + (sayý1+sayý2));
		
	}


}
