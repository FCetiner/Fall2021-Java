package day08_if_else_statements;

import java.util.Scanner;

public class C02_ifElse {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir karakter girmesini 
		//isteyin ve girilen karakterin harf olup olmadigini yazdirin

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir karekter giriniz");
        
        char karakter=scan.next().charAt(0);
        
        if ((karakter>='A' && karakter<='Z')  || (karakter>='a' && karakter<='z')) {
			System.out.println("girdišiniz :" + karakter + " bir harftir");
		} else {
		System.out.println("girdišiniz :" + karakter + " bir harf dešildir");
		}
        
        
        scan.close();
	}

}
