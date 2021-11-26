package day19_WhileLoopDoWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {

		int i = 0;
		
		while (i<5) {
			System.out.print(i + " ");	//0 1 2 3 4
		i++;
		}
		
		System.out.println();
		
		//While loop once kontrol eder sonra kodu çalýþtýrýr
		//loop içinde artýþ yapýlsa da bir sonraki kontrole kadar kod çalýþmaya devam eder
		//bu da bazý durumlarda hatalý sonuçlara ulaþmamýza sebep olabilir
		
		
		
		//do while loop ise önce iþlemi yapar sonra þartý kontrol eder
		//özellikle kullanýcýdan deðer almalarda doWhileLoop tercih edilir
		
		int a =0;
		
		do {
			System.out.print(a + " ");
			a++;
		} while (a<5);

	}

}
