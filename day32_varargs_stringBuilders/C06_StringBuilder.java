package day32_varargs_stringBuilders;

public class C06_StringBuilder {

	@SuppressWarnings("unused")
	public static void main(String[] args) {


		String str = "Ali Can";
		//String non primitive dir
		
		String str2 = new String("Veli Can");
		
		StringBuilder sb = new StringBuilder("Ya�as�n Java");
		
		sb.append("!!!");
		
		System.out.println(sb);
		
		String sbBuyukHarf=sb.toString().toUpperCase();
		
		System.out.println(sb);
	}

}
