package day32_varargs_stringBuilders;

public class C02_Varargs {

	public static void main(String[] args) {

		topla(5, 8,10,13,0);
		
		//varargs list gibi davranýr ama 
		//aray methodlarý ile çalýþýr
	}

	private static void topla(int... sayýlar) {
		
		int toplam=0;
		for (int each : sayýlar) {
			toplam+=each;
		}
		System.out.println(toplam);
	}

}
