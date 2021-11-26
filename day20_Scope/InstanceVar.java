package day20_Scope;

public class InstanceVar {

	int notMat=50;
	int notFen;
	//Instance veriablelarýn scope'unda main method yoktur
	public static void main(String[] args) {
	
		//System.out.println(notMat); // Main method static olduðu için static olmayan veriable'lar
									//main Method da direkt kullanýlamaz veya görüntülenemez
		
		
		
		//instance verable'lara main method'dan ulaþmak istersek obje oluþturup obje üzerinden eriþim saðlayabiliriz
		//Scanner scan=new Scanner(System.in)
		// içinde olduðumuz classtan bir obje oluþturalým
		
		InstanceVar azra=new InstanceVar();
		System.out.println(azra.notMat  ); //50
		
		InstanceVar ada = new InstanceVar();
		
		ada.notMat=70;
		System.out.println(ada.notMat);
		//Instance veriable larda deðer atamazsak Java instance olarakatanan deðeri alýr
		//bu class için notmat 50 gibi
		//ama istersek deðer de atayabiliriz, 
		//bu durumda deðer atadýðýmýz obje için yeni deðer geçerli olur
		System.out.println(azra.notMat); //50
		
		//Azra nýn notunu deðiþtirmek istiyorsak azra.notmat a deðer atanmalý
	
		azra.notMat=90;	
		System.out.println(azra.notMat);  //90
		
		
		azra.method2(); // method2 static olmadýðý için main method dan direk çaðrýlamaz
	
	}

	
	public static void staticMethod(){
		
	//	System.out.println(notFen); 	//instance veriable lara static methodlardan direkt ulaþýlamaz
		
		
		
		
		
	}

	
	public void method2() {
		System.out.println("method2'deki notFen :  " +notFen); //Bu method static olmadýðý için instance veriablelara ulaþabilir
	
	//instance veriable oluþturulurken deðer atanmasada olur
	//Bu durumda java default deðerler atar
	//int için default deger 0'dýr
	notFen=100;
	
	System.out.println("method2'deki düzeltilmiþ notFen :  " +notFen);
	
	
	}
	
	
	
}
