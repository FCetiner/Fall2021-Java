package day16_ForLoop;

public class C03_forLoop {

	public static void main(String[] args) {
		
		//10 ile 30 arasindaki 
		//sayilari aralarinda virgule olarak ayni satirda yazdirin
		
		for (int i = 10; i <= 30; i++) {
			if (i==30) {
				System.out.print(i);
			} else {
			    System.out.print(i+", ");
			}
		}

		System.out.println(); // bo� syso sadece alt sat�ra ge�mek i�in kullan�l�r
		for (int i = 10; i <= 29; i++) {
			System.out.print(i+", ");
		}
		System.out.println(30);
		
		
		
		
		
	}

}
