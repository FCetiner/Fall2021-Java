package day27_constructor_constructorcall;

public class Tir {
		
	
	int y�l=2000;
	String renk;
	String model;
	int km;
	boolean sat�l�kM�;
	
	public Tir(int i, String string, String string2, int j, boolean b) {
				km=i; model=string;  renk=string2;   y�l=j; sat�l�kM�=b;
		
		//  T�rRunner classindan yollad���m�z de�erlerin instance veriable'lar ile e�le�mesi i�in
		//atamalar� yapmam laz�m
		
	}

	public Tir(int km, String model, String renk) {
		// i, string ve string2 isim olarak g�zel isimler de�il
		//kodumuzu sonradan incelerken anla��l�r de�il
		// daha anla��l� olmas� i�in variable isimlerini anlaml� yapal�m
		//int km, String model, String renk
		this.km=km;
		this.model=model;
		this.renk=renk;
		
		//ba��na this yazd���m�zda Java bu veriable in class leveldeki verable oldu�unu anlar
	}

}
