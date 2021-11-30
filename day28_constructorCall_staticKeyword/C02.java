package day28_constructorCall_staticKeyword;

public class C02 {
	int x = 5; // instance veriable
	static int y = 10;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 3 tane obje oluþturalým ve deðiþimleri gözlemleyelim

		C02 obje1 = new C02();
		System.out.println("Obje1 için x : " + obje1.x + " Obje1 için y : " + obje1.y); //5 10

		// x++; y++; x'e direkt ulaþamayýz obje uzerinden ulaþýrýz

		obje1.x++;
		obje1.y++;

		System.out.println("iþlemden sonra Obje1 için x : " + obje1.x + " Obje1 için y : " + obje1.y); //6 11

		C02 obje2 = new C02();
		System.out.println("Obje2 için x : " + obje2.x + " Obje2 için y : " + obje2.y); //5 11

		obje2.x++;
		y++;
		System.out.println("iþlemden sonra Obje2 için x : " + obje2.x + " Obje2 için y : " + obje2.y); //6  12

		System.out.println(
				" obje 2 oluþturulduktan ve iþlemden sonra obje1'in" + "\n x : " + obje1.x + " y : " + obje1.y); //6 12

		// ayný class içindeyken static verable lara ulaþmak için objeye ihtiyac yoktur
		// kullanýrsak Java CTE vermaz fakat static verable'a static yoldan ulaþ diye
		// bizi uyarýr
		C02 obje3 = new C02();

		obje3.x = 20;
		obje3.y = 40;

		System.out.println("obje3'den sonra obje1'in x :" + obje1.x);// 6
		System.out.println("obje3'den sonra obje2'in x :" + obje2.x);// 6
		System.out.println("obje3'den sonra obje3'in x :" + obje3.x);// 20

		System.out.println("obje3'den sonra obje1'in y :" + obje1.y);// 40
		System.out.println("obje3'den sonra obje2'in y :" + obje2.y);// 40
		System.out.println("obje3'den sonra obje3'in y :" + obje3.y);// 40

	}

}
