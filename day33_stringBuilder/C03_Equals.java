package day33_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {


		 StringBuilder sb1 = new StringBuilder("Java");
	        StringBuilder sb2 = new StringBuilder("Java");
	        
	        System.out.println(sb1==sb2); // false
	        System.out.println(sb1.equals(sb2)); // false
	        //sb'da equals methodu String'deki mantýkla çalýþmaz, == mantýðý ile çalýþýr
	        
	        
	        
	        //  System.out.println(sb1.compareTo(sb2)); // 0
	        // Ilk harflerden baslayarak bire bire sb'lari karsilastirir
	        // eger tum karakterler ayni ise sonuc olarak 0 oner
	        // farkli karakter bulursa ilk yazýlan sb, ikinci yazýlandan kac char onde onu döner
	        
	        
	        //eðer iki sb'nin eþit olup olmadýðýný anlamak istersek
	        // if (sb1.compareTo(sb2)==0);
	        
	       String str = "Java";
	       
	      // System.out.println(sb1==str); == sb ile String'i karþýlaþtýramaz
	       System.out.println(sb1.equals(str));//false
	     //  System.out.println(sb1.compareTo(str)); bu method String için kullanýlamaz
	       
	    //   System.out.println(sb1=="Java"); direkt yazýlýrsa String olarak alýyor
	       
	       System.out.println(sb1.equals("Java")); //false
	     //  System.out.println(sb1.compareTo(sb2));
	}

}
