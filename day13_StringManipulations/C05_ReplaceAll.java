package day13_StringManipulations;

public class C05_ReplaceAll {

	public static void main(String[] args) {

		String cumle= "Java    cok    zevkli";
		
		cumle=cumle.replaceAll("\s+", " ");
		System.out.println(cumle);

		System.out.println(cumle.replaceAll("[a-k]", ""));
	
		System.out.println(cumle.replaceAll("\\S", "*")); //s space, S space olmayanlar
		System.out.println(cumle.replaceAll("\\s", "*"));
	
		System.out.println(cumle.replaceFirst("a", "*"));
	}

}
