package day33_stringBuilder;

public class C02_Delete {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder("Java candýr can");
	
		sb.deleteCharAt(11);	// sadece 11. indexteki karakteri siler
		System.out.println(sb); //Java candýrcan
		
		sb.delete(11, 13);	// ilk index inclusive, ikinci index exclusive olduðundan
		System.out.println(sb);	//Java candýrn
		
		sb.delete(11, sb.length());
		System.out.println(sb); //Java candýr
		
		sb.delete(5, 20);
		System.out.println(sb);
	
	}

}
