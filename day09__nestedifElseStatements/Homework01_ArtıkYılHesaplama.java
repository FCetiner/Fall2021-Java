package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework01_Art�kY�lHesaplama {

	public static void main(String[] args) {
		// Soru 9 Interview Question
		//Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
		//Kural 1 4 ile bolunemeyen yillar artik yil degildir
		//Kural 2 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		//Kural 3 4 �un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400 �un kati olan yillar artik yildir
	
	Scanner scan = new Scanner(System.in);
	System.out.print("L�tfen y�l� girin:");
	int y�l=scan.nextInt();
	
	if (y�l%4!=0) {
		System.out.println("Art�k y�l de�ildir.");
	} else if(y�l%100!=0){
		System.out.println("Art�k y�l");
	}else if(y�l%400==0){
		System.out.println("Art�k y�l");
	}else {
		System.out.println("Art�k y�l de�ildir.");
	}
	
	scan.close();
	
	}

}
