package day09__nestedifElseStatements;

import java.util.Scanner;

public class Homework01_ArtýkYýlHesaplama {

	public static void main(String[] args) {
		// Soru 9 Interview Question
		//Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
		//Kural 1 4 ile bolunemeyen yillar artik yil degildir
		//Kural 2 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		//Kural 3 4 ’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400 ’un kati olan yillar artik yildir
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Lütfen yýlý girin:");
	int yýl=scan.nextInt();
	
	if (yýl%4!=0) {
		System.out.println("Artýk yýl deðildir.");
	} else if(yýl%100!=0){
		System.out.println("Artýk yýl");
	}else if(yýl%400==0){
		System.out.println("Artýk yýl");
	}else {
		System.out.println("Artýk yýl deðildir.");
	}
	
	scan.close();
	
	}

}
