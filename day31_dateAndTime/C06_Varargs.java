package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {

		//Verilen say�lar� toplayan bir method olu�turmak istiyorum
		//
	
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
	topla(a,b);
	topla(a,b,c);
	topla(a,b,c,d,e);
	topla(a,b,c,d,e,f);
	// su ana kadar gordugumuz tekniklerle de�i�ken say�da parametreli tek bir method olu�turamay�z
	
	
	}

	private static void topla(int... a) {
		System.out.println("varargs cal���r");
		
	}

	private static void topla(int a, int b, int c) {
		System.out.println("iki say�n�n toplam� : " + (a+b+c));
		
	}

	private static void topla(int a, int b) {
		System.out.println("iki say�n�n toplam� : " + (a+b));
	}

}
