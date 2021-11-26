package day13_StringManipulations;

public class C03_Replace {

	public static void main(String[] args) {
		
		String str= "Java öðrenmek çok zevkli";
		
		System.out.println(str.replace(" ","")); //Javaöðrenmekçokzevkli
		
		System.out.println(str.replace("öðrenmek","kod yazmak" ));

		System.out.println(str.replace("Java", "Kod"));
		
		
	}

}
