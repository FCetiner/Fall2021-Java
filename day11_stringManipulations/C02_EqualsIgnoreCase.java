package day11_stringManipulations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsignorecase iki Stringi kar��la�t�r�ken case sensitive olmadan kar��la�t�r�r

		
		String str1 = "ali";
		String str2 = "can";
		String str3 = "Ali Can";
		String str4 = str1 + " " + str2;
		
		System.out.println(str4); // ali can
		System.out.println(str3==str4); //false hem de�erler hem referans farkl�
		System.out.println(str3.equals(str4)); // false de�erler farkl�
		
		System.out.println(str3.equalsIgnoreCase(str4)); //True sadece i�eri�i kar��la�t�r�r b�y�k harf k���k harf �nemli de�il Case sensitive de�il
		
		
		
		
		
		
		
	}

}
