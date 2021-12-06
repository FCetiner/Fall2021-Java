package day33_stringBuilder;

public class C07_Yarýþma {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//  For loop ile 1000 defa bir islem yapalim. 
		//Oncesinde ve sonrasinda zamani kontrol edip
		//StringBuilder ve String class’larinin performanslarini karsilastiralim.   
		//Ipucu: long TimeSb = System.nanoTime(); kullanalim

		String str= "Merhaba";
		StringBuilder sb = new StringBuilder("Merhaba");
		sb.trimToSize(); // capacity i length boyutuna indirir
		long time1 = System.nanoTime();
				
		for (int i = 0; i < 1000; i++) {
			str+=" ";
		}
	
		long time2 = System.nanoTime();
	
		long strSure=time2-time1;
		
		
		long time3 = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			sb.append(" ");
		}
	
		long time4 = System.nanoTime();
	
		long sbSure=time4-time3;
		
		if( strSure<sbSure) System.out.println("String daha hýzlý");
		else System.out.println("StringBuilder daha hýzlý");
		
		System.out.println(strSure/sbSure);
		System.out.println("String Sure : "+strSure);
		System.out.println("sb Sure : "+sbSure);
	}

}
