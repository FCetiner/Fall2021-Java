package day11_stringManipulations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsignorecase iki Stringi karþýlaþtýrýken case sensitive olmadan karþýlaþtýrýr

		
		String str1 = "ali";
		String str2 = "can";
		String str3 = "Ali Can";
		String str4 = str1 + " " + str2;
		
		System.out.println(str4); // ali can
		System.out.println(str3==str4); //false hem deðerler hem referans farklý
		System.out.println(str3.equals(str4)); // false deðerler farklý
		
		System.out.println(str3.equalsIgnoreCase(str4)); //True sadece içeriði karþýlaþtýrýr büyük harf küçük harf önemli deðil Case sensitive deðil
		
		
		
		
		
		
		
	}

}
