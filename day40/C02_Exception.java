package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {

//Kullan�c�dan istedi�i kadar say� al�p
// Bu say�lar� toplayan bir program yaz�n
//sayi giri�ini bitirmek i�in q bas�n
	
	
	
	int say�=0;
	int toplam=0;
	int count=0;	
	Scanner scan=new Scanner(System.in);
		

	try {
		while(count<10000) {
		System.out.println("L�tfen toplamak i�in bir say� yaz�n�z \nBitirmek i�in say� d���nda bir tu�a bas�n�z");
		say�=scan.nextInt();
		toplam+=say�;
		count++;
	}
	}catch (InputMismatchException e){
		System.out.println("girdi�iniz " +count +" adet say�n�n toplam� : "+ toplam);
	}
	


	scan.close();
	}

}
