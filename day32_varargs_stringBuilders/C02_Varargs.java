package day32_varargs_stringBuilders;

public class C02_Varargs {

	public static void main(String[] args) {

		topla(5, 8,10,13,0);
		
		//varargs list gibi davran�r ama 
		//aray methodlar� ile �al���r
	}

	private static void topla(int... say�lar) {
		
		int toplam=0;
		for (int each : say�lar) {
			toplam+=each;
		}
		System.out.println(toplam);
	}

}
