package day28_constructorCall_staticKeyword;

public class C03 {

	public static void main(String[] args) {
		// Java runtime bir programd�r
		// run tu�una bast���m�zda java �al��maya ba�lar ve i�lemleri yapar
		// Java'n�n i�i bitti�inde (calisma tusu kirmizidan griye dondugunde)
		// her sey basa doner

		// Static veriable ve methodlar bulunduklar� class ile ilintilidir(obje ile
		// de�il class ile)
		// ba�ka bir class'da iken C02'deki static verable veya method'a ula�mak
		// istedi�imizde
		// C02.staticVeriableIsmi ve C02.staticMethodIsm� yazmam�z yeterli olur

		C02 obje1 = new C02();
		System.out.println("Obje1 i�in x : " + obje1.x + " Obje1 i�in y : " + C02.y);

		// x++; y++; x'e direkt ula�amay�z obje uzerinden ula��r�z

		obje1.x++;
		// obje1.y++;
		// static bir veriable a class ismi uzerinden ula�mak yerine
		// instance veriable'lar gibi obje ile ula�maya �al�s�rsan�z
		// Java CTE vermez ama solda ! i�areti ile bizi uyar�r
		// static bir field olan C02'ye static yoldan ula� der
		System.out.println("i�lemden sonra Obje1 i�in x : " + obje1.x + " Obje1 i�in y : " + C02.y);

		C02 obje2 = new C02();
		System.out.println("Obje2 i�in x : " + obje2.x + " Obje2 i�in y : " + C02.y);

		obje2.x++;
		C02.y++;
		System.out.println("i�lemden sonra Obje2 i�in x : " + obje2.x + " Obje2 i�in y : " + C02.y);

		System.out
				.println(" obje 2 olu�turulduktan ve i�lemden sonra obje1'in" + "\n x : " + obje1.x + " y : " + C02.y);

		C02 obje3 = new C02();

		obje3.x = 20;
		C02.y = 40;

		System.out.println("obje3'den sonra obje1'in x :" + obje1.x);// 6
		System.out.println("obje3'den sonra obje2'in x :" + obje2.x);// 6
		System.out.println("obje3'den sonra obje3'in x :" + obje3.x);// 20

		System.out.println("obje3'den sonra obje1'in y :" + C02.y);// 40
		System.out.println("obje3'den sonra obje2'in y :" + C02.y);// 40
		System.out.println("obje3'den sonra obje3'in y :" + C02.y);// 40

	}

}
