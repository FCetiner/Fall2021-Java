package day20_Scope;

public class InstanceVar {

	int notMat=50;
	int notFen;
	//Instance veriablelar�n scope'unda main method yoktur
	public static void main(String[] args) {
	
		//System.out.println(notMat); // Main method static oldu�u i�in static olmayan veriable'lar
									//main Method da direkt kullan�lamaz veya g�r�nt�lenemez
		
		
		
		//instance verable'lara main method'dan ula�mak istersek obje olu�turup obje �zerinden eri�im sa�layabiliriz
		//Scanner scan=new Scanner(System.in)
		// i�inde oldu�umuz classtan bir obje olu�tural�m
		
		InstanceVar azra=new InstanceVar();
		System.out.println(azra.notMat  ); //50
		
		InstanceVar ada = new InstanceVar();
		
		ada.notMat=70;
		System.out.println(ada.notMat);
		//Instance veriable larda de�er atamazsak Java instance olarakatanan de�eri al�r
		//bu class i�in notmat 50 gibi
		//ama istersek de�er de atayabiliriz, 
		//bu durumda de�er atad���m�z obje i�in yeni de�er ge�erli olur
		System.out.println(azra.notMat); //50
		
		//Azra n�n notunu de�i�tirmek istiyorsak azra.notmat a de�er atanmal�
	
		azra.notMat=90;	
		System.out.println(azra.notMat);  //90
		
		
		azra.method2(); // method2 static olmad��� i�in main method dan direk �a�r�lamaz
	
	}

	
	public static void staticMethod(){
		
	//	System.out.println(notFen); 	//instance veriable lara static methodlardan direkt ula��lamaz
		
		
		
		
		
	}

	
	public void method2() {
		System.out.println("method2'deki notFen :  " +notFen); //Bu method static olmad��� i�in instance veriablelara ula�abilir
	
	//instance veriable olu�turulurken de�er atanmasada olur
	//Bu durumda java default de�erler atar
	//int i�in default deger 0'd�r
	notFen=100;
	
	System.out.println("method2'deki d�zeltilmi� notFen :  " +notFen);
	
	
	}
	
	
	
}
