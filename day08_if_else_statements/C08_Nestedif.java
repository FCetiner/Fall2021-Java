package day08_if_else_statements;

import java.util.Scanner;

public class C08_Nestedif {

	public static void main(String[] args) {
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
		//olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen cinsiyetinizi giriniz \n Erkek i�in E, kad�n i�in K");
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("L�tfen ya��n�z� giriniz");
		double ya�=scan.nextDouble();
		
		if (cinsiyet=='E') {
			
			if (ya�>=65) {
				System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olamazs�n");
			}
			
		} else if(cinsiyet=='K'){

			if (ya�>=60) {
				System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olamazs�n");	
		}
		}else {
		System.out.println("L�tfen ge�erli bir harf se�iniz");	
		}
scan.close();		
	}


}