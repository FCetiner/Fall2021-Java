package day28_constructorCall_staticKeyword;

public class C03 {

	public static void main(String[] args) {
		// Java runtime bir programdýr
		// run tuþuna bastýðýmýzda java çalýþmaya baþlar ve iþlemleri yapar
		// Java'nýn iþi bittiðinde (calisma tusu kirmizidan griye dondugunde)
		// her sey basa doner

		// Static veriable ve methodlar bulunduklarý class ile ilintilidir(obje ile
		// deðil class ile)
		// baþka bir class'da iken C02'deki static verable veya method'a ulaþmak
		// istediðimizde
		// C02.staticVeriableIsmi ve C02.staticMethodIsmý yazmamýz yeterli olur

		C02 obje1 = new C02();
		System.out.println("Obje1 için x : " + obje1.x + " Obje1 için y : " + C02.y);

		// x++; y++; x'e direkt ulaþamayýz obje uzerinden ulaþýrýz

		obje1.x++;
		// obje1.y++;
		// static bir veriable a class ismi uzerinden ulaþmak yerine
		// instance veriable'lar gibi obje ile ulaþmaya çalýsýrsanýz
		// Java CTE vermez ama solda ! iþareti ile bizi uyarýr
		// static bir field olan C02'ye static yoldan ulaþ der
		System.out.println("iþlemden sonra Obje1 için x : " + obje1.x + " Obje1 için y : " + C02.y);

		C02 obje2 = new C02();
		System.out.println("Obje2 için x : " + obje2.x + " Obje2 için y : " + C02.y);

		obje2.x++;
		C02.y++;
		System.out.println("iþlemden sonra Obje2 için x : " + obje2.x + " Obje2 için y : " + C02.y);

		System.out
				.println(" obje 2 oluþturulduktan ve iþlemden sonra obje1'in" + "\n x : " + obje1.x + " y : " + C02.y);

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
