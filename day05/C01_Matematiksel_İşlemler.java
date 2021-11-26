package day05;

public class C01_Matematiksel_Ýþlemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2);//14
		
		System.out.println(4*(2+5)/3); //9  28/3=9,3333 java intager olarak alýr
		
		//Sonucu virgüllü yazdýrmak istersek
		
		double sonuç=4*(2+5)/3;
				System.out.println(sonuç);//9,0
				
			 sonuç=(double)(4*(2+5)/3);		
		System.out.println(sonuç); //9,0
		
		sonuç=(double)4*(2+5)/3;
		
		System.out.println(sonuç); ///9,333334
		
		int sayý1=5;
		int sayý2=2;
		double sayý3=2;
		
		System.out.println(sayý1/sayý2); //5/2=2
		System.out.println(sayý1/sayý3); //5/2=2,5
		
		System.out.println(sayý1+sayý3+sayý2); //6.0 sonuç virgüllü olmasý için sayýlardan biri virgüllü olmalý
		
		
		
		
		
		
		
	}

}
