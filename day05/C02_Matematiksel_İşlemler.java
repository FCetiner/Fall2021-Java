package day05;

public class C02_Matematiksel_İşlemler {

	public static void main(String[] args) {
		int sayı1=10;
		int sayı2=20;
		
		String str1="Ali";
		String str2="Can";
		
		System.out.println(sayı1+sayı2+str1); //30Ali

		System.out.println(str1+sayı1+sayı2); //Ali1020
		
		
		System.out.println(str2+(sayı1+sayı2)); //Ali30 yapmak için parantaze alıyoruz
	
		System.out.println(sayı1*sayı2+str1); //200Ali

		System.out.println(str1+sayı1*sayı2); //Ali200
		
		//sarı ünlem gereksiz ya da eksik işlem uyarısı
		
		
	}

}
