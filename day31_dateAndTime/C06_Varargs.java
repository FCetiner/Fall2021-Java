package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {

		//Verilen sayýlarý toplayan bir method oluþturmak istiyorum
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
	// su ana kadar gordugumuz tekniklerle deðiþken sayýda parametreli tek bir method oluþturamayýz
	
	
	}

	private static void topla(int... a) {
		System.out.println("varargs calýþýr");
		
	}

	private static void topla(int a, int b, int c) {
		System.out.println("iki sayýnýn toplamý : " + (a+b+c));
		
	}

	private static void topla(int a, int b) {
		System.out.println("iki sayýnýn toplamý : " + (a+b));
	}

}
