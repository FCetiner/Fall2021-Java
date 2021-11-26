package day16_ForLoop;

public class C01_ForLoop {

	public static void main(String[] args) {


		for(int i=0;i<10;i++) {
			System.out.println(i+" ");  //ln silersek yanyana yazdýrýr
		}
		//for loop baþlangýç ve bitiþ þartý bir sayýnýn deðerine baðlý olan
		//durunlarda tercih edilir
	/*	
		for (int i = 0; i < 10; i--) {
			System.out.println(i + " ");
		}*/
		
		//Eðer baþlangýç sayýsý artýþ azalýþ ile bitiþ deðerine yaklaþmýyor, uzaklaþýyor ise
		//loop hiçbir zaman durmaz
		//bu duruma sonsuz loop deriz ve bu durumun gerçekleþmesini istemeyiz
		
		for (int i = 0; i > 10; i++) {
			System.out.println(i + "acaba çalýþýr mý"); 
		}
		// eðer ilk deðer için bitiþ þartý ture olmazsa
		//daha ilk loopta loop broken olur
		//dolayýsý ile loop body hiç çalýþmadan, loopun sonrasýna geçilir
		//loop çalýþýr ama hiç bir iþlem yapmaz
		
		
		
		
		
		
}
}