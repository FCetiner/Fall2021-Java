package day26_forEachLoop_Constructor;

public class JeepRunner {

	public static void main(String[] args) {
		//Jeep class'ýndan bir obje oluþturalým ve ozelliklerini yazdýralim
		
		Jeep jeep1=new Jeep();
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo+ " " + jeep1.marka
				+ " " + jeep1.model+ " " + jeep1.yýl);

		//Jeep class'ýndaki veriable lar instance veriable olduklarýndan
		//atadýðým deðerler sadece benim objem için deðerleri deðiþtirir;
		//Jeep class'ýndaki deðerlere hiç bir þey yapmaz
		jeep1.fiyat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model="Corolla";
		jeep1.yýl=2005;
		
		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo+ " " + jeep1.marka
				+ " " + jeep1.model+ " " + jeep1.yýl);
		
		jeep1.hýz(150);
		jeep1.yakit("benzin");
	
	
	}

}
