package day10_ternary_Switchcase;

import java.util.Locale;

public class c13_SMtoUpperLowerCase {

	public static void main(String[] args) {
		// verilen stringin tamam�n� b�y�k veya ki�ik harfe �evirir
		
		String isim = "aLI";  // bunu Ali olarak yazd�ral�m
		
		System.out.println(""+isim.toUpperCase().charAt(0)+
				isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));

		
		//t�rk�e local harfler kullanarak tamam�n� k���k harfe �evirelim
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("en")));
	
	
	}

}
