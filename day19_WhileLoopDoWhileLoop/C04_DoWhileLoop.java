package day19_WhileLoopDoWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {

		int i = 0;
		
		while (i<5) {
			System.out.print(i + " ");	//0 1 2 3 4
		i++;
		}
		
		System.out.println();
		
		//While loop once kontrol eder sonra kodu �al��t�r�r
		//loop i�inde art�� yap�lsa da bir sonraki kontrole kadar kod �al��maya devam eder
		//bu da baz� durumlarda hatal� sonu�lara ula�mam�za sebep olabilir
		
		
		
		//do while loop ise �nce i�lemi yapar sonra �art� kontrol eder
		//�zellikle kullan�c�dan de�er almalarda doWhileLoop tercih edilir
		
		int a =0;
		
		do {
			System.out.print(a + " ");
			a++;
		} while (a<5);

	}

}
