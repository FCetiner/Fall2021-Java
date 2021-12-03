package day32_varargs_stringBuilders;

public class C05_Varargs {

	public static void main(String[] args) {
	
		topla(5, 8,10,13,0);
		
		//varargs'dan �nce farkl� parametreler kullan�labilir
		//ama varargs'dan sonra parametre yaz�lamaz
		//yazarsan�z Java varargs son parametre olmal�d�r diye sizi uyar�r
		// ve CTE verir
	}

	private static void topla(int... say�lar ) {
		
		int toplam=0;
		for (int each : say�lar) {
			toplam+=each;
		}
		System.out.println(toplam);

	}

}
