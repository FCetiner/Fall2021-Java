package day10_ternary_Switchcase;

public class c11_SMConcat {

	public static void main(String[] args) {
		// String olarak verilen bir deðiþken + ile baþka bir deðiþken ile iþleme sokulursa 
		//Java bunlarý yanyana ekler. Buna Concatenation denir.
		
		String isim = "Ali";
		String soyisim ="Can";
		System.out.println(isim + " " + soyisim);
		
		//ayný iþlemi + sembolü yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim));
		
		System.out.println(isim.concat(" ").concat(soyisim));

		
	}

}
