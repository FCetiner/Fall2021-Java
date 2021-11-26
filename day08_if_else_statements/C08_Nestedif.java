package day08_if_else_statements;

import java.util.Scanner;

public class C08_Nestedif {

	public static void main(String[] args) {
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
		//olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen cinsiyetinizi giriniz \n Erkek için E, kadýn için K");
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen yaþýnýzý giriniz");
		double yaþ=scan.nextDouble();
		
		if (cinsiyet=='E') {
			
			if (yaþ>=65) {
				System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olamazsýn");
			}
			
		} else if(cinsiyet=='K'){

			if (yaþ>=60) {
				System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olamazsýn");	
		}
		}else {
		System.out.println("Lütfen geçerli bir harf seçiniz");	
		}
scan.close();		
	}


}