package day40;

public class C01_Exception {

	public static void main(String[] args) {

		int a=20;
		int b=0;

		
		

		
		try {
			System.out.println("say�lar�n bolumu : " + a/b);
		}catch(ArithmeticException e ) {
			System.out.println("S�f�ra b�l�m yap�lamaz");
			//System.out.println(e.getMessage()); /// by zero
		System.out.println();
//		e.printStackTrace(); java.lang.ArithmeticException: / by zero
//		at day40.C01_exception.main(C01_exception.java:15)
		}
		
		
		
		System.out.println("G�rev tamamland�");
		
	}

}
