package day37_Inheritance;

public class Corolla extends Toyota{
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri = "T�rkiye";
	@SuppressWarnings("unused")
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
		System.out.println(arb2.tekerSayisi); //Data t�r�m�z toyota oldugu i�in Toyota'n�n parent class� olan Araba'dan ald�
		
		
		
		Araba arb3 = new Corolla();
		
		System.out.println(arb3.tekerSayisi);//Data t�r�n� araba yapt�k bu y�zden sadece Araba Class�n�n verilerine ula�abiliyoruz
											//G�rd���m�z ve vurgulamak istedi�imiz
		Araba arb4=new Araba();
	
	
		Toyota arb5=new Corolla();//Corolla �retmek ancak Corollan�n �zelliklerini s�n�rlamak istiyorum bunun i�in bu sekilde constractor olu�turulur
		Toyota arb6 =new  Toyota();
	
	}

}
