package day40;

public class C01_exception {

	public static void main(String[] args) {

		int a=20;
		int b=0;

		
		

		
		try {
			System.out.println("say�lar�n bolumu : " + a/b);
		}catch(ArithmeticException e ) {
			System.out.println("S�f�ra b�l�m yap�lamaz");
		}
		
		
		
		System.out.println("G�rev tamamland�");
		
	}

}
