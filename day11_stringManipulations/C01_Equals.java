package day11_stringManipulations;

public class C01_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b= a+0;
		
		System.out.println(a==b); //True
		
		char ch1='K';
		char ch2= 'K' +0;
		
		System.out.println(ch1==ch2);
		
	String str1 = "Ali";
	String str2 = "Can";
	String str3 = "Ali Can";
	String str4 = str1 + " " + str2;
	
	System.out.println(str4); // Ali Can
	System.out.println(str3==str4); //false
	System.out.println(str3.equals(str4)); //true
		
	// String veriablelarda == hem de�ere hem de referans�ma bakar dolay�s� ile objeler farkl� oldu�unda
	//genelde false d�ner 
	// str1.equals(str2) ise referanslara de�il SADECE DE�ERE bakar
	// e�er case sensitive olarak String de�erleri ayn� ise true d�ner
	
	
	}

}
