package day34_accessModifierEncapsulation;

public class C01 {

	private int sayıPrivate = 10;
	//private class üyelerine sadece içinde bulunduğu class'tan ulaşabiliriz
	
	int sayıDefault=20;
	//default class üyelerine sadece içinde bulunduğu packagedan ulaşılabilir
	//default access modifier'in diğer ismi de package access modifier'dir
	
	protected int sayıProtected=30;
	//protected class üyelerine içinde bulunduğu package'daki tüm class'lar
	// baska package'lardaki child class'lar ulaşabilir
	
	public int sayıPublic=40;
	//public class üyelerine tüm package'lardaki tüm class'lardan ulaşılabilir
	
	
	
	public static void main(String[] args) {


		C01 obj = new C01();
		System.out.println(obj.sayıPrivate);
		System.out.println(obj.sayıDefault);
		System.out.println(obj.sayıProtected);
		System.out.println(obj.sayıPublic);
	}

	
	public void staticOlmayanMethod() {
		C01 obj = new C01();
		System.out.println(obj.sayıPrivate);
		System.out.println(obj.sayıDefault);
		System.out.println(obj.sayıProtected);
		System.out.println(obj.sayıPublic);
		
	}
	
	
	
	
}
