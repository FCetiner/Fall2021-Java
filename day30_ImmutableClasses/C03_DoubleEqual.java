package day30_ImmutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {

		//Java'da string iki t�rl� olu�turulabilir
		// 1 non primitive oldugu i�in new keyword ile
		//Java �nce e�itli�in sa��na bakt���ndan
		// new kelimesi oldu�u i�in �nce obje olu�turur
		//sonra de�eri atar
		//yani bu olu�turma �eklinde her zaman
		//yeni bir obje olu�ur
		
		//2 bu g�ne kadar ��rendi�imiz gibi olu�turursak
		//String str2 ="mustafa";
		// bu durumda e�itli�in sa��nda olan Stringin String Havuzunda olup olmad���n�
		//kontrol eder ve havuzda var ise yeni obje olu�turmaz, �ncekinin referans�na
		//yeninin referans�n� da ekler

		String str1 = "Mustafa";
		String str2 = "Mustafa";
		
		
		String str3 = new String("Mustafa");
		String str4 = new String ("Mustafa");
		
		System.out.println(str1==str3);//false == i�areti hem de�ere hem referansa bakar
		System.out.println(str1.equals(str3));//true
		
		System.out.println(str4==str3);//false == 
		System.out.println(str4.equals(str3));//true
		
		
		System.out.println(str1==str2); // true
		
		
	}

}
