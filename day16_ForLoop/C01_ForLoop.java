package day16_ForLoop;

public class C01_ForLoop {

	public static void main(String[] args) {


		for(int i=0;i<10;i++) {
			System.out.println(i+" ");  //ln silersek yanyana yazd�r�r
		}
		//for loop ba�lang�� ve biti� �art� bir say�n�n de�erine ba�l� olan
		//durunlarda tercih edilir
	/*	
		for (int i = 0; i < 10; i--) {
			System.out.println(i + " ");
		}*/
		
		//E�er ba�lang�� say�s� art�� azal�� ile biti� de�erine yakla�m�yor, uzakla��yor ise
		//loop hi�bir zaman durmaz
		//bu duruma sonsuz loop deriz ve bu durumun ger�ekle�mesini istemeyiz
		
		for (int i = 0; i > 10; i++) {
			System.out.println(i + "acaba �al���r m�"); 
		}
		// e�er ilk de�er i�in biti� �art� ture olmazsa
		//daha ilk loopta loop broken olur
		//dolay�s� ile loop body hi� �al��madan, loopun sonras�na ge�ilir
		//loop �al���r ama hi� bir i�lem yapmaz
		
		
		
		
		
		
}
}