package day38_overriding;

public class KumesHayvanları extends Kuslar{

	public static void main(String[] args) {


		KumesHayvanları kms1=new KumesHayvanları ();
		
		kms1.beslenme();//Tüm hayvanlar beslenir
		kms1.hareket();//Kümes Hayvanları yürüyerek hareket ederler
		kms1.solunum();//Kuslar akcigerleri ile nefes alır
		
		Kuslar kms2 = new KumesHayvanları();
		
		kms2.beslenme();//Tüm hayvanlar beslenir
		kms2.hareket();//Kümes Hayvanları yürüyerek hareket ederler
		kms2.solunum();//Kuslar akcigerleri ile nefes alır
		//kendi spesifik özellikleri dışında kuslara tabi oluyor
		//ama spesific bir durumu varsa farkını ortaya loyuyor
		
		
		
		Kuslar kms3 = new Kuslar();
		kms3.beslenme();//Tüm hayvanlar beslenir
		kms3.hareket();//Kuslar ucarak hareket ederler
		kms3.solunum();//Kuslar akcigerleri ile nefes alır
		
		Animals kms4 = new KumesHayvanları();
		
		kms4.beslenme();//Tüm hayvanlar beslenir
		kms4.hareket();//Kümes Hayvanları yürüyerek hareket ederler
		kms4.solunum();//Kuslar akcigerleri ile nefes alır
		
	}

	
	public void hareket () {
		System.out.println("Kümes Hayvanları yürüyerek hareket ederler");
	}
}
