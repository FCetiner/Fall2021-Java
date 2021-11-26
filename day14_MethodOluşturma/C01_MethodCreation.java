package day14_MethodOlu�turma;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Verilen iki say�n�n toplam�n� ve �arp�m�n� yap�p yazd�ran iki ayr� method olu�turun
		
		// method olu�turmak i�in 3 ad�m takip edelim
		//1. ad�m method call yazal�m
		//2. ad�m methoda arg�man yazacak m�y�z karar vermeliy�z
		
		int sayi1=4;
		int sayi2=5;
				
		toplama(sayi1,sayi2); // method call
		// 3. ad�m 1. ve 2. ad�m� yapt�ktan sonra Java'dan yard�m al�p methodu olu�tururuz.
		
		carpma(sayi1,sayi2);
	
		
	
	
	
	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin �arp�m�:" + sayi1*sayi2);
		
	}

	
	
	
	
	
	public static void toplama(int sayi1, int sayi2) {
		// 4. ad�m eri�im d�zenleyici ve return type karar vermeliyiz
		// eri�im d�zenleyici axcess modifier	:
		//return type	: bizden sadece yazd�rma istedi�i i�in void kalabilir
		
		System.out.println("say�lar�n toplam�:"  + (sayi1+sayi2));
	}

}
