package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_Array {

	public static void main(String[] args) {
		//Kullanicidan bir cumle isteyin ve 
		//cumledeki kelime sayisini yazdirin
		
		String cumle = "Her �ey, Java ile kolay";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));
		
		System.out.println("Girilen c�mlede " + kelimeler.length + " adet kelime var");

	}

}
