package day10_ternary_Switchcase;

import java.util.Locale;

public class c13_SMtoUpperLowerCase {

	public static void main(String[] args) {
		// verilen stringin tamamýný büyük veya kiçik harfe çevirir
		
		String isim = "aLI";  // bunu Ali olarak yazdýralým
		
		System.out.println(""+isim.toUpperCase().charAt(0)+
				isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));

		
		//türkçe local harfler kullanarak tamamýný küçük harfe çevirelim
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("en")));
	
	
	}

}
