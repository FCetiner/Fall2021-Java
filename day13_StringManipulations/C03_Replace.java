package day13_StringManipulations;

public class C03_Replace {

	public static void main(String[] args) {
		
		String str= "Java ��renmek �ok zevkli";
		
		System.out.println(str.replace(" ","")); //Java��renmek�okzevkli
		
		System.out.println(str.replace("��renmek","kod yazmak" ));

		System.out.println(str.replace("Java", "Kod"));
		
		
	}

}
