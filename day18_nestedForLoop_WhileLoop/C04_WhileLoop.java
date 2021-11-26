package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Kullan�c�dan toplanmak �zere say� isteyin
		//kullan�c� s�f�ra bas�ncaya kadar say�lar� al�p
		//toplamaya devam edin
		//kullan�c� s�f�ra bast���nda
		//o ana kadar ka� say� girdi�ini ve girilen say�lar�n toplam�n� yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		//loop un i�inde kullanaca��m obje ve variable lar�
		//looptan �nce olu�turmak daha g�zeldir
		//cunku loop un i�inde olu�turursak,
		//loop her d�nd���nde yeni bir obje olu�turur ve bu da haf�zay� doldurur
		
		int say�=100;
		int toplam=0;
		int sayac=0;
		
		while (say�!=0) {
			
			System.out.println("L�tfen toplama eklemek i�in bir tam say� yaz�n\n bitirmek i�in 0 ' a bas�n");
			say�=scan.nextInt();
			toplam+=say�;
			sayac++;
		}
		
		//kullan�c� 0'a bast���nda loop i�lemini son kez yap�p
		//sonra ba�a d�necek ve loop bitecek
		//0 toplanmak �zere verilmeyip sadece bitirmek i�in verildi�inden
		//s�f�r� sayaca eklememek i�in 38. sat�rda sayac-1 yapt�k
		
		System.out.println("girilen say� adedi : " + (sayac-1) );
		System.out.println("girilen say�lar�n toplam� : " + toplam);
		

		scan.close();
	}

}
