package day37_Inheritance;

public class Corolla extends Toyota{
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri = "Türkiye";
	@SuppressWarnings("unused")
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
		System.out.println(arb2.tekerSayisi); //Data türümüz toyota oldugu için Toyota'nýn parent classý olan Araba'dan aldý
		
		
		
		Araba arb3 = new Corolla();
		
		System.out.println(arb3.tekerSayisi);//Data türünü araba yaptýk bu yüzden sadece Araba Classýnýn verilerine ulaþabiliyoruz
											//Gördüðümüz ve vurgulamak istediðimiz
		Araba arb4=new Araba();
	
	
		Toyota arb5=new Corolla();//Corolla üretmek ancak Corollanýn özelliklerini sýnýrlamak istiyorum bunun için bu sekilde constractor oluþturulur
		Toyota arb6 =new  Toyota();
	
	}

}
