package day09__nestedifElseStatements;

public class C03_Ternary {

	public static void main(String[] args) {
		
		int x=10;
		
		String tekMi�iftmi=x%2==0 ? "�ift say�" : "tek say�";
		
		System.out.println(tekMi�iftmi); //�ift
		
		System.out.println(x%2==0 ? "�ift say�" : "tek say�");
	
	//ternary iki t�rl� kullan�labilir
	//ya d�nen sonuca g�re bir veriable olu�turulup assing ederiz
	//veya direkt syso i�ine yazd�r�r�z
	
		
		
		//e�er ternary de d�necek sonu�lar ayn� data t�r�nden de�ilse
		//atama yapamay�z sadece syso ile yazd�rabiliriz
		System.out.println(x>5 ? "Aferin" : 4); //Aferin
		
		
		//String sonuc = x>5 ? "Aferin" : 4;
		
		
		
		
	}

}
