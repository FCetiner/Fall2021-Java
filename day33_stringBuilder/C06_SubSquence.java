package day33_stringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("Java ne kadar kolay");


		System.out.println(sb.substring(14));//kolay
		
		System.out.println(sb.subSequence(14, 19));//kolay
		
		//sb.substring(14) //Substring String d�nd�r�r SManipulations kullan�l�r
		
		sb.subSequence(14, 19); //Bu string de�il subsquence
		
		//ikisi de ayn� sonucu d�nd�r�r ancak substring methodu String class'�ndan geldi�i i�in 
		//substring() kulland���mda arkas�ndan String methodlar�n� kullanabilirim
		//Ancak, subSequence kulland���mda bu m�mk�n olmaz
		
		
		
	}

}
