package day18_nestedForLoop_WhileLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		// For loop ve while Loop kullanarak 3 basamakli sayilardan 
		//15, 20 ve 90�na tam bolunebilen sayilari yazdirin

		for (int i = 100; i < 1000; i++) {
			
			if (i%15==0 && i%20==0 && i%90==0) {
				
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		
		int say�=100; // ba�lang�� de�eri
		
		while (say�<1000) {
			if (say�%15==0 && say�%20==0 && say�%90==0) {
				System.out.print(say� + " ");
			}
			say�++;
		}
		
		//E�er ba�lang�� ve biti� �art� bir say�n�n art���na ba�l� ise veya
		//tekrar edilecek i�lem adedi belli ise for loop tercih edilir
		//i�lem tekrar say�s� belli de�ilse veya
		//biti� i�in bir s�n�r de�erinden olma gibi bir �art varsa while loop tercih edilir
	}

}
