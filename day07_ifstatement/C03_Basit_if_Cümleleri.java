package day07_ifstatement;

import java.util.Scanner;

public class C03_Basit_if_C�mleleri {

	public static void main(String[] args) {
		 /*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = �Hafta sonu�
                        gun=Sali output = �Hafta ici�
         *** String icin equals method�unu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen g�n ismini giriniz:");
		
		String gun =scan.next().toLowerCase();
				
		if (gun.equals("pazar") || gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
		}
		
		if (gun.equals("pazartesi") || gun.equals("sal�") ||
				gun.equals("�ar�amba") || gun.equals("per�embe") ||
				gun.equals("cuma")) 
		{
			System.out.println("Hafta i�i");
		}
		
		//String non-primitive oldu�u i�in == kullan�lamaz bunun yerine .equals() methodu kullan�l�r
		
		scan.close();
	}

}
