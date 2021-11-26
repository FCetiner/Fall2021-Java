package day10_ternary_Switchcase;

public class c11_SMConcat {

	public static void main(String[] args) {
		// String olarak verilen bir de�i�ken + ile ba�ka bir de�i�ken ile i�leme sokulursa 
		//Java bunlar� yanyana ekler. Buna Concatenation denir.
		
		String isim = "Ali";
		String soyisim ="Can";
		System.out.println(isim + " " + soyisim);
		
		//ayn� i�lemi + sembol� yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim));
		
		System.out.println(isim.concat(" ").concat(soyisim));

		
	}

}
