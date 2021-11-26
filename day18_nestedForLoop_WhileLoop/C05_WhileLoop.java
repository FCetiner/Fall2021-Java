package day18_nestedForLoop_WhileLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		// For loop ve while Loop kullanarak 3 basamakli sayilardan 
		//15, 20 ve 90’na tam bolunebilen sayilari yazdirin

		for (int i = 100; i < 1000; i++) {
			
			if (i%15==0 && i%20==0 && i%90==0) {
				
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		
		int sayý=100; // baþlangýç deðeri
		
		while (sayý<1000) {
			if (sayý%15==0 && sayý%20==0 && sayý%90==0) {
				System.out.print(sayý + " ");
			}
			sayý++;
		}
		
		//Eðer baþlangýç ve bitiþ þartý bir sayýnýn artýþýna baðlý ise veya
		//tekrar edilecek iþlem adedi belli ise for loop tercih edilir
		//iþlem tekrar sayýsý belli deðilse veya
		//bitiþ için bir sýnýr deðerinden olma gibi bir þart varsa while loop tercih edilir
	}

}
