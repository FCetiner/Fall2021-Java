package day32_varargs_stringBuilders;

public class C03_Varargs {

	public static void main(String[] args) {


		kafanaGoreTopla(5,10,13,0);
		
	}

	private static void kafanaGoreTopla(int sayý1,int... sayýlar) {
		
		int toplam=0;
		for (int each : sayýlar) {
			toplam+=each;
		}
		System.out.println("ilk sayý ile diðerlerinin toplamýnýn çarpýmý" +sayý1*toplam);

	}

}
