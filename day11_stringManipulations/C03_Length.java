package day11_stringManipulations;

public class C03_Length {
@SuppressWarnings("unused")
public static void main(String[] args) {
	
	String str1 = "Ali Kahyao�lu";
	
	System.out.println(str1.length());//13
	
	//verilen str1 son harfini yazd�r�n
	
	System.out.println(str1.charAt(str1.length()-1)); //Ka� harf olursa olsun son harfi verir
	
	
	String str2 = "";
	System.out.println(str2.length()); //0
	
	String str3 = null ;
	// System.out.println(str3.length());  hata verir
	
	String str4;
	System.out.println(str3); // null de�eri bizim bu veriable bilerek olu�turdu�umuzu ve de�er atamad���m�z� belirtir
	//System.out.println(str4); // hata verir); //E�er Stringi olu�turur de�er atamazsak yazd�rd���m�zda hata al�r�z
	
	
	
	
	//null pointer olu�turdu�umuz fakat sonra kullanaca��m�z bir Stringi i�aretlemek i�in kullan�l�r
	// bir Stringi yazd�rd���m�zda null ��k�yorsa t�rk�e olarak 
	//"Ben bu de�i�keni olu�turdum ama hen�z de�er atamad�m demek istiyor
	
	


}
}
