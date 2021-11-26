package day22_Arryas;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// Java öðrendim,  #cok para ?kazandým.,
		//cumlesinin kelimelerini,özel karakterlerve noktalama iþaretleri olmadan 
		//harf sýrasýna göre yazdýralým
		
		String cumle= "Java ogrendim,  #cok para ?kazandým.,";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));	//[Java, öðrendim,, , #cok, para, ?kazandým.,]
		
		
		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i] = kelimeler[i].replaceAll("\\W", "");
			System.out.println(kelimeler[i]);
		}
	
		System.out.println(Arrays.toString(kelimeler));
		
		Arrays.sort(kelimeler);
		
		System.out.println(Arrays.toString(kelimeler));
		
	
		for (int i = 0; i < kelimeler.length; i++) {	
			
			System.out.print(kelimeler[i] + " ");
		}
		
		
	}

}
