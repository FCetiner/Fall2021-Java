package day32_varargs_stringBuilders;

public class C04_Varargs {

	public static void main(String[] args) {



		kafanaGoreIslem(5,10,13,0);
		
		//Varargs'da hiç eleman olmasa da java itiraz etmez
		//once int olarak tanýmlanan sayýlarý eþleþtirir
		//kalan tüm sayýlarý varargs ' a doldurur
	}

	private static void kafanaGoreIslem(int sayý1,int sayý2,int sayi3,int sayý4, int... sayýlar) {
		
		int toplam=0;
		for (int each : sayýlar) {
			toplam+=each;
		}
		System.out.println("ilk sayý ile diðerlerinin toplamýnýn çarpýmý " +sayý1*toplam);
		

	}

}
