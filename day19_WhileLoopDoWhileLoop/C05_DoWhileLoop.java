package day19_WhileLoopDoWhileLoop;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		// m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.

		
		//*********************for loop lie
		
		for (char i = 'm'; i > 'c'; i--) {    //Baþý sonu belli ise for loop kullanmak mantýklý
			
			System.out.print(i + " ");
		}
		
		//*************************** While loop ile **********
		
		System.out.println();
		char krk='m';
		
		while (krk>'c') {
			System.out.print(krk + " ");
		krk--;
		}
		
		//******************Do While Loop ile*************
		System.out.println();
		
		char harf='m';
		
		do {
			System.out.print(harf + " ");
			harf--;
		} while (harf>'c');
	}

}
