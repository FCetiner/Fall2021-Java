package day37_Inheritance;

public class Corolla extends Toyota{
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri = "T�rkiye";
	public static void main(String[] args) {
		
				Corolla 						arb1 			= 			new 	Corolla();
		//Calass ismi ve Data T�r�d�r		obje ismi		assignment	 keyword	Constructor
		//Java da obje olu�turdugumuz her class ismi ayn� zamanda bir data t�r�d�r
		//Bu �renegimiz i�in corolla hem class ad� hem de olu�turdugumuz arb1 objesinin data type d�r
		//Java'da obje �retilen her bir class ayn� zamanda non primitive data t�r� olur
		System.out.println(arb1.calisiyoruMu);
		System.out.println(arb1.tekerSayisi);
		System.out.println(arb1.uretimYeri);
				
		
		Toyota arb2 = new Corolla();
		System.out.println(arb2.calisiyoruMu);
		System.out.println(arb2.tekerSayisi);
		
		//Data t�r�n� araba yapt�k;
		
		Araba arb3 = new Corolla();
		

	}

}
