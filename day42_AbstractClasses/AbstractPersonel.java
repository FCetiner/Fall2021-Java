package day42_AbstractClasses;

public abstract class AbstractPersonel {
	
	//Class ve methodu abstract olarak tanýmladýgýmda child classlar mecburen
	//Bu methodu override edecekler
	//
public abstract void statu();
	

	public abstract void abstractMethod();
	
	public void concreteMethod() {
		System.out.println("Personel class'indaki concrete method calisti");
	}
	
	
	
	
	
}

