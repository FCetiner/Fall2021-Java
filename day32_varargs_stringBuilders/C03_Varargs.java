package day32_varargs_stringBuilders;

public class C03_Varargs {

	public static void main(String[] args) {


		kafanaGoreTopla(5,10,13,0);
		
	}

	private static void kafanaGoreTopla(int say�1,int... say�lar) {
		
		int toplam=0;
		for (int each : say�lar) {
			toplam+=each;
		}
		System.out.println("ilk say� ile di�erlerinin toplam�n�n �arp�m�" +say�1*toplam);

	}

}
