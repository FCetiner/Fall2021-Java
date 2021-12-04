package day33_stringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("Java ne kadar kolay");


		System.out.println(sb.substring(14));//kolay
		
		System.out.println(sb.subSequence(14, 19));//kolay
		
		//sb.substring(14) //Substring String döndürür SManipulations kullanýlýr
		
		sb.subSequence(14, 19); //Bu string deðil subsquence
		
		//ikisi de ayný sonucu döndürür ancak substring methodu String class'ýndan geldiði için 
		//substring() kullandýðýmda arkasýndan String methodlarýný kullanabilirim
		//Ancak, subSequence kullandýðýmda bu mümkün olmaz
		
		
		
	}

}
