package day05;

public class C01_Matematiksel_��lemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2);//14
		
		System.out.println(4*(2+5)/3); //9  28/3=9,3333 java intager olarak al�r
		
		//Sonucu virg�ll� yazd�rmak istersek
		
		double sonu�=4*(2+5)/3;
				System.out.println(sonu�);//9,0
				
			 sonu�=(double)(4*(2+5)/3);		
		System.out.println(sonu�); //9,0
		
		sonu�=(double)4*(2+5)/3;
		
		System.out.println(sonu�); ///9,333334
		
		int say�1=5;
		int say�2=2;
		double say�3=2;
		
		System.out.println(say�1/say�2); //5/2=2
		System.out.println(say�1/say�3); //5/2=2,5
		
		System.out.println(say�1+say�3+say�2); //6.0 sonu� virg�ll� olmas� i�in say�lardan biri virg�ll� olmal�
		
		
		
		
		
		
		
	}

}
