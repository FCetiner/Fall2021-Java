package day33_stringBuilder;

public class C02_Delete {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder("Java cand�r can");
	
		sb.deleteCharAt(11);	// sadece 11. indexteki karakteri siler
		System.out.println(sb); //Java cand�rcan
		
		sb.delete(11, 13);	// ilk index inclusive, ikinci index exclusive oldu�undan
		System.out.println(sb);	//Java cand�rn
		
		sb.delete(11, sb.length());
		System.out.println(sb); //Java cand�r
		
		sb.delete(5, 20);
		System.out.println(sb);
	
	}

}
