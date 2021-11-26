package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Kullanýcýdan toplanmak üzere sayý isteyin
		//kullanýcý sýfýra basýncaya kadar sayýlarý alýp
		//toplamaya devam edin
		//kullanýcý sýfýra bastýðýnda
		//o ana kadar kaç sayý girdiðini ve girilen sayýlarýn toplamýný yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		//loop un içinde kullanacaðým obje ve variable larý
		//looptan önce oluþturmak daha güzeldir
		//cunku loop un içinde oluþturursak,
		//loop her döndüðünde yeni bir obje oluþturur ve bu da hafýzayý doldurur
		
		int sayý=100;
		int toplam=0;
		int sayac=0;
		
		while (sayý!=0) {
			
			System.out.println("Lütfen toplama eklemek için bir tam sayý yazýn\n bitirmek için 0 ' a basýn");
			sayý=scan.nextInt();
			toplam+=sayý;
			sayac++;
		}
		
		//kullanýcý 0'a bastýðýnda loop iþlemini son kez yapýp
		//sonra baþa dönecek ve loop bitecek
		//0 toplanmak üzere verilmeyip sadece bitirmek için verildiðinden
		//sýfýrý sayaca eklememek için 38. satýrda sayac-1 yaptýk
		
		System.out.println("girilen sayý adedi : " + (sayac-1) );
		System.out.println("girilen sayýlarýn toplamý : " + toplam);
		

		scan.close();
	}

}
