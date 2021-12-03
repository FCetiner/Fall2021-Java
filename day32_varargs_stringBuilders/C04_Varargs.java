package day32_varargs_stringBuilders;

public class C04_Varargs {

	public static void main(String[] args) {



		kafanaGoreIslem(5,10,13,0);
		
		//Varargs'da hi� eleman olmasa da java itiraz etmez
		//once int olarak tan�mlanan say�lar� e�le�tirir
		//kalan t�m say�lar� varargs ' a doldurur
	}

	private static void kafanaGoreIslem(int say�1,int say�2,int sayi3,int say�4, int... say�lar) {
		
		int toplam=0;
		for (int each : say�lar) {
			toplam+=each;
		}
		System.out.println("ilk say� ile di�erlerinin toplam�n�n �arp�m� " +say�1*toplam);
		

	}

}
