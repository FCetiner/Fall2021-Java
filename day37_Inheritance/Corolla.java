package day37_Inheritance;

public class Corolla extends Toyota{
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri = "Türkiye";
	public static void main(String[] args) {
		
				Corolla 						arb1 			= 			new 	Corolla();
		//Calass ismi ve Data Türüdür		obje ismi		assignment	 keyword	Constructor
		//Java da obje oluþturdugumuz her class ismi ayný zamanda bir data türüdür
		//Bu örenegimiz için corolla hem class adý hem de oluþturdugumuz arb1 objesinin data type dýr
		//Java'da obje üretilen her bir class ayný zamanda non primitive data türü olur
		System.out.println(arb1.calisiyoruMu);
		System.out.println(arb1.tekerSayisi);
		System.out.println(arb1.uretimYeri);
				
		
		Toyota arb2 = new Corolla();
		System.out.println(arb2.calisiyoruMu);
		System.out.println(arb2.tekerSayisi);
		
		//Data türünü araba yaptýk;
		
		Araba arb3 = new Corolla();
		

	}

}
