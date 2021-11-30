package day28_constructorCall_staticKeyword;

public class C02 {
	int x = 5; // instance veriable
	static int y = 10;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 3 tane obje olu�tural�m ve de�i�imleri g�zlemleyelim

		C02 obje1 = new C02();
		System.out.println("Obje1 i�in x : " + obje1.x + " Obje1 i�in y : " + obje1.y); //5 10

		// x++; y++; x'e direkt ula�amay�z obje uzerinden ula��r�z

		obje1.x++;
		obje1.y++;

		System.out.println("i�lemden sonra Obje1 i�in x : " + obje1.x + " Obje1 i�in y : " + obje1.y); //6 11

		C02 obje2 = new C02();
		System.out.println("Obje2 i�in x : " + obje2.x + " Obje2 i�in y : " + obje2.y); //5 11

		obje2.x++;
		y++;
		System.out.println("i�lemden sonra Obje2 i�in x : " + obje2.x + " Obje2 i�in y : " + obje2.y); //6  12

		System.out.println(
				" obje 2 olu�turulduktan ve i�lemden sonra obje1'in" + "\n x : " + obje1.x + " y : " + obje1.y); //6 12

		// ayn� class i�indeyken static verable lara ula�mak i�in objeye ihtiyac yoktur
		// kullan�rsak Java CTE vermaz fakat static verable'a static yoldan ula� diye
		// bizi uyar�r
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
