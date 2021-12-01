package day30_ImmutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {

		//Java'da string iki türlü oluþturulabilir
		// 1 non primitive oldugu için new keyword ile
		//Java önce eþitliðin saðýna baktýðýndan
		// new kelimesi olduðu için önce obje oluþturur
		//sonra deðeri atar
		//yani bu oluþturma þeklinde her zaman
		//yeni bir obje oluþur
		
		//2 bu güne kadar öðrendiðimiz gibi oluþturursak
		//String str2 ="mustafa";
		// bu durumda eþitliðin saðýnda olan Stringin String Havuzunda olup olmadýðýný
		//kontrol eder ve havuzda var ise yeni obje oluþturmaz, öncekinin referansýna
		//yeninin referansýný da ekler

		String str1 = "Mustafa";
		String str2 = "Mustafa";
		
		
		String str3 = new String("Mustafa");
		String str4 = new String ("Mustafa");
		
		System.out.println(str1==str3);//false == iþareti hem deðere hem referansa bakar
		System.out.println(str1.equals(str3));//true
		
		System.out.println(str4==str3);//false == 
		System.out.println(str4.equals(str3));//true
		
		
		System.out.println(str1==str2); // true
		
		
	}

}
