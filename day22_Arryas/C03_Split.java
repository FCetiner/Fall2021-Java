package day22_Arryas;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// Java ��rendim,  #cok para ?kazand�m.,
		//cumlesinin kelimelerini,�zel karakterlerve noktalama i�aretleri olmadan 
		//harf s�ras�na g�re yazd�ral�m
		
		String cumle= "Java ogrendim,  #cok para ?kazand�m.,";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));	//[Java, ��rendim,, , #cok, para, ?kazand�m.,]
		
		
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
