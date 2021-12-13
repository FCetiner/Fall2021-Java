package day40;

public class C01_exception {

	public static void main(String[] args) {

		int a=20;
		int b=0;

		
		

		
		try {
			System.out.println("sayýlarýn bolumu : " + a/b);
		}catch(ArithmeticException e ) {
			System.out.println("Sýfýra bölüm yapýlamaz");
			//System.out.println(e.getMessage()); /// by zero
		System.out.println();
//		e.printStackTrace(); java.lang.ArithmeticException: / by zero
//		at day40.C01_exception.main(C01_exception.java:15)
		}
		
		
		
		System.out.println("Görev tamamlandý");
		
	}

}
