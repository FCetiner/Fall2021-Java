package day33_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {


		 StringBuilder sb1 = new StringBuilder("Java");
	        StringBuilder sb2 = new StringBuilder("Java");
	        
	        System.out.println(sb1==sb2); // false
	        System.out.println(sb1.equals(sb2)); // false
	        //sb'da equals methodu String'deki mant�kla �al��maz, == mant��� ile �al���r
	        
	        
	        
	        //  System.out.println(sb1.compareTo(sb2)); // 0
	        // Ilk harflerden baslayarak bire bire sb'lari karsilastirir
	        // eger tum karakterler ayni ise sonuc olarak 0 oner
	        // farkli karakter bulursa ilk yaz�lan sb, ikinci yaz�landan kac char onde onu d�ner
	        
	        
	        //e�er iki sb'nin e�it olup olmad���n� anlamak istersek
	        // if (sb1.compareTo(sb2)==0);
	        
	       String str = "Java";
	       
	      // System.out.println(sb1==str); == sb ile String'i kar��la�t�ramaz
	       System.out.println(sb1.equals(str));//false
	     //  System.out.println(sb1.compareTo(str)); bu method String i�in kullan�lamaz
	       
	    //   System.out.println(sb1=="Java"); direkt yaz�l�rsa String olarak al�yor
	       
	       System.out.println(sb1.equals("Java")); //false
	     //  System.out.println(sb1.compareTo(sb2));
	}

}
