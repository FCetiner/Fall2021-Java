package day09__nestedifElseStatements;

public class C03_Ternary {

	public static void main(String[] args) {
		
		int x=10;
		
		String tekMiÇiftmi=x%2==0 ? "çift sayý" : "tek sayý";
		
		System.out.println(tekMiÇiftmi); //çift
		
		System.out.println(x%2==0 ? "çift sayý" : "tek sayý");
	
	//ternary iki türlü kullanýlabilir
	//ya dönen sonuca göre bir veriable oluþturulup assing ederiz
	//veya direkt syso içine yazdýrýrýz
	
		
		
		//eðer ternary de dönecek sonuçlar ayný data türünden deðilse
		//atama yapamayýz sadece syso ile yazdýrabiliriz
		System.out.println(x>5 ? "Aferin" : 4); //Aferin
		
		
		//String sonuc = x>5 ? "Aferin" : 4;
		
		
		
		
	}

}
