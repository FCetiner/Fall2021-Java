package day32_varargs_stringBuilders;

public class C06_StringBuilder {

	public static void main(String[] args) {


		String str = "Ali Can";
		//String non primitive dir
		
		String str2 = new String("Veli Can");
		
		StringBuilder sb = new StringBuilder("Yaþasýn Java");
		
		sb.append("!!!");
		
		System.out.println(sb);
		sb.toString().toUpperCase();
		System.out.println(sb);
	}

}
