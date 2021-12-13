package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {

//Kullanýcýdan istediði kadar sayý alýp
// Bu sayýlarý toplayan bir program yazýn
//sayi giriþini bitirmek için q basýn
	
	
	
	int sayý=0;
	int toplam=0;
	int count=0;	
	Scanner scan=new Scanner(System.in);
		

	try {
		while(count<10000) {
		System.out.println("Lütfen toplamak için bir sayý yazýnýz \nBitirmek için sayý dýþýnda bir tuþa basýnýz");
		sayý=scan.nextInt();
		toplam+=sayý;
		count++;
	}
	}catch (InputMismatchException e){
		System.out.println("girdiðiniz " +count +" adet sayýnýn toplamý : "+ toplam);
	}
	


	scan.close();
	}

}
