package day33_stringBuilder;

public class C01_Append_Lenght_Capasity {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.length()); //0 sb'nin kullanýlan kýsmýnýn uzunluðunu verir
		System.out.println(sb.capacity());//16 sb'nin kapasitesini verir.
		
		StringBuilder sb2 = new StringBuilder("Java candýr");
		
		System.out.println(sb2.length()); //11 
		System.out.println(sb2.capacity());//27 
		
		StringBuilder sb3 = new StringBuilder(7);
		sb3.append("Mehlika");
		System.out.println(sb3.length()); //7 
		System.out.println(sb3.capacity());//7 
		
		StringBuilder sb4 = new StringBuilder(7);
		System.out.println(sb4.length()); //0 
		System.out.println(sb4.capacity());//7
		sb4.append("Nilgun");
		System.out.println(sb4.length()); //6 
		System.out.println(sb4.capacity());//7(Kapasite aþarsa 7*2+2 kapasite yapar
		
		sb4.append(" candýr");
		System.out.println(sb4.length()); //13 
		System.out.println(sb4.capacity());//16
		
		sb.append("Java");
		System.out.println(sb);//Java
		
		sb.append(" candýr");
		System.out.println(sb);//Java candýr
		
		sb.append("anlaþýldý mý", 3, 6);
		System.out.println(sb);//Java candýraþý
		
		
	}

}
