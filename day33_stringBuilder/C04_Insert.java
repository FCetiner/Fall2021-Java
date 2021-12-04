package day33_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder("Java ogrendik");
		//araya cok iyi ekleyelim
		
		sb.insert(4, "yý cok iyi");
		System.out.println(sb);
		
		//
		@SuppressWarnings("unused")
		String str2="cok iyiyim";
		sb.insert(7, "cok iyiyim", 0, 4);
		System.out.println(sb);
		
		
		
	}

}
