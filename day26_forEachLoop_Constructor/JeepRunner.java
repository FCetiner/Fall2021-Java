package day26_forEachLoop_Constructor;

public class JeepRunner {

	public static void main(String[] args) {
		//Jeep class'�ndan bir obje olu�tural�m ve ozelliklerini yazd�ralim
		
		Jeep jeep1=new Jeep();
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo+ " " + jeep1.marka
				+ " " + jeep1.model+ " " + jeep1.y�l);

		//Jeep class'�ndaki veriable lar instance veriable olduklar�ndan
		//atad���m de�erler sadece benim objem i�in de�erleri de�i�tirir;
		//Jeep class'�ndaki de�erlere hi� bir �ey yapmaz
		jeep1.fiyat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model="Corolla";
		jeep1.y�l=2005;
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo+ " " + jeep1.marka
				+ " " + jeep1.model+ " " + jeep1.y�l);
		
		jeep1.h�z(150);
		jeep1.yakit("benzin");
	
	
	}

}
