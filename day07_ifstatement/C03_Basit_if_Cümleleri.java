package day07_ifstatement;

import java.util.Scanner;

public class C03_Basit_if_Cümleleri {

	public static void main(String[] args) {
		 /*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = “Hafta sonu”
                        gun=Sali output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen gün ismini giriniz:");
		
		String gun =scan.next().toLowerCase();
				
		if (gun.equals("pazar") || gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
		}
		
		if (gun.equals("pazartesi") || gun.equals("salý") ||
				gun.equals("çarþamba") || gun.equals("perþembe") ||
				gun.equals("cuma")) 
		{
			System.out.println("Hafta içi");
		}
		
		//String non-primitive olduðu için == kullanýlamaz bunun yerine .equals() methodu kullanýlýr
		
		scan.close();
	}

}
