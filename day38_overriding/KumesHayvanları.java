package day38_overriding;

public class KumesHayvanlar� extends Kuslar{

	public static void main(String[] args) {


		KumesHayvanlar� kms1=new KumesHayvanlar� ();
		
		kms1.beslenme();//T�m hayvanlar beslenir
		kms1.hareket();//K�mes Hayvanlar� y�r�yerek hareket ederler
		kms1.solunum();//Kuslar akcigerleri ile nefes al�r
		
		Kuslar kms2 = new KumesHayvanlar�();
		
		kms2.beslenme();//T�m hayvanlar beslenir
		kms2.hareket();//K�mes Hayvanlar� y�r�yerek hareket ederler
		kms2.solunum();//Kuslar akcigerleri ile nefes al�r
		//kendi spesifik �zellikleri d���nda kuslara tabi oluyor
		//ama spesific bir durumu varsa fark�n� ortaya loyuyor
		
		
		
		Kuslar kms3 = new Kuslar();
		kms3.beslenme();//T�m hayvanlar beslenir
		kms3.hareket();//Kuslar ucarak hareket ederler
		kms3.solunum();//Kuslar akcigerleri ile nefes al�r
		
		Animals kms4 = new KumesHayvanlar�();
		
		kms4.beslenme();//T�m hayvanlar beslenir
		kms4.hareket();//K�mes Hayvanlar� y�r�yerek hareket ederler
		kms4.solunum();//Kuslar akcigerleri ile nefes al�r
		
	}

	
	public void hareket () {
		System.out.println("K�mes Hayvanlar� y�r�yerek hareket ederler");
	}
}
