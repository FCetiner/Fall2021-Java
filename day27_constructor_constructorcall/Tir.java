package day27_constructor_constructorcall;

public class Tir {
		
	
	int yýl=2000;
	String renk;
	String model;
	int km;
	boolean satýlýkMý;
	
	public Tir(int i, String string, String string2, int j, boolean b) {
				km=i; model=string;  renk=string2;   yýl=j; satýlýkMý=b;
		
		// TODO TýrRunner classindan yolladýðýmýz deðerlerin instance veriable'lar ile eþleþmesi için
		//atamalarý yapmam lazým
		
	}

	public Tir(int km, String model, String renk) {
		// i, string ve string2 isim olarak güzel isimler deðil
		//kodumuzu sonradan incelerken anlaþýlýr deðil
		// daha anlaþýlý olmasý için variable isimlerini anlamlý yapalým
		//int km, String model, String renk
		this.km=km;
		this.model=model;
		this.renk=renk;
		
		//baþýna this yazdýðýmýzda Java bu veriable in class leveldeki verable olduðunu anlar
	}

}
