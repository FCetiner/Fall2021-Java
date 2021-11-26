package day11_stringManipulations;

public class C03_Length {
public static void main(String[] args) {
	
	String str1 = "Ali Kahyaoðlu";
	
	System.out.println(str1.length());//13
	
	//verilen str1 son harfini yazdýrýn
	
	System.out.println(str1.charAt(str1.length()-1)); //Kaç harf olursa olsun son harfi verir
	
	
	String str2 = "";
	System.out.println(str2.length()); //0
	
	String str3 = null ;
	// System.out.println(str3.length());  hata verir
	
	String str4;
	System.out.println(str3); // null deðeri bizim bu veriable bilerek oluþturduðumuzu ve deðer atamadýðýmýzý belirtir
	//System.out.println(str4); // hata verir); //Eðer Stringi oluþturur deðer atamazsak yazdýrdýðýmýzda hata alýrýz
	
	
	
	
	//null pointer oluþturduðumuz fakat sonra kullanacaðýmýz bir Stringi iþaretlemek için kullanýlýr
	// bir Stringi yazdýrdýðýmýzda null çýkýyorsa türkçe olarak 
	//"Ben bu deðiþkeni oluþturdum ama henüz deðer atamadým demek istiyor
	
	


}
}
