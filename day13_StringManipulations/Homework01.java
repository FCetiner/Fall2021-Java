package day13_StringManipulations;

public class Homework01 {

	public static void main(String[] args) {
		// String methodlarini kullanarak 
		//" Java ogrenmek 123 Cok guzel@ " String’ini 
		//“Java	ogrenmek cok guzel" sekline getirin

		String str = " Java ogrenmek 123 Cok guzel@ ";
		
		str = str.replaceAll("\\d", ""); // Java ogrenmek  Cok guzel@ 
		str = str.replace(" C","c");		//  Java ogrenmek cok guzel@ 
		str = str.trim();					//Java ogrenmek  Cok guzel@
		str = str.replaceAll(" ", "x");		// Javaxogrenmekxcokxguzel@
		str = str.replaceAll("\\W", ""); 	// Javaxogrenmekxcokxguzel
		str = str.replaceAll("x", " ");		// Javaxogrenmekxcokxguzel@
	
		//str = str.replace(str, str)
		System.out.println(str);
		
	}

}
