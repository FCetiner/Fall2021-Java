package day42_abstractClasses;

public abstract class AbstractPersonel {
	
	//Class ve methodu abstract olarak tan�mlad�g�mda child classlar mecburen
	//Bu methodu override edecekler
	//
public abstract void statu();
	

	public abstract void abstractMethod();
	
	public void concreteMethod() {
		System.out.println("Personel class'indaki concrete method calisti");
	}
	
	
	
	
	
}

