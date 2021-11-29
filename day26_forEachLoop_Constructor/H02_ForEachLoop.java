package day26_forEachLoop_Constructor;

public class H02_ForEachLoop {

	public static void main(String[] args) {
		// Bir String olusturunuz, bu String’deki character’leri 
		//foreach loop kullanarak yazdiriniz. ipucu: split()

		
		String str = "Azra Ada";
		String arr [] = str.split("");
		
		for (String each : arr) {
			System.out.print(each);
		}
	}

}
