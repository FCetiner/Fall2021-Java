package day15_methodCreation;

import java.util.Scanner;

public class H02_EmailKontrolu {

	public static void main(String[] args) {
		/*Email kontrolu yapan bir program yazin.Kullanicinin girdigi mail
		
		-@ isareti icermiyorsa gecersiz email yazdirin
-
		-@gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
-
		-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen mail adresinizi giriniz\t:");
		String mail=scan.next();
		
		email(mail);

		scan.close();
	}

	public static void email(String mail) {
		int uzunluk=mail.length();							 //ferhat@gmail.com uzunluk 16
		int index=mail.lastIndexOf("@gmail.com");			//index 6
		
		if (!(mail.contains("@"))) {
			System.out.println("Gecersiz email");
		} else if(!(mail.contains("@gmail.com"))){			
			System.out.println("Lütfen gmail adresinizi giriniz");
		} else if(!(index==(uzunluk-10))){
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");	//(!sifre.endsWith("@gmail.com"))
		} else {
			System.out.println("Girdiðiniz mail adresi geçerli");
		}
		
	}

}
