package day34_accessModifierEncapsulation;

public class C01 {

	private int say�Private = 10;
	//private class �yelerine sadece i�inde bulundu�u class'tan ula�abiliriz
	
	int say�Default=20;
	//default class �yelerine sadece i�inde bulundu�u packagedan ula��labilir
	//default access modifier'in di�er ismi de package access modifier'dir
	
	protected int say�Protected=30;
	//protected class �yelerine i�inde bulundu�u package'daki t�m class'lar
	// baska package'lardaki child class'lar ula�abilir
	
	public int say�Public=40;
	//public class �yelerine t�m package'lardaki t�m class'lardan ula��labilir
	
	
	
	public static void main(String[] args) {


		C01 obj = new C01();
		System.out.println(obj.say�Private);
		System.out.println(obj.say�Default);
		System.out.println(obj.say�Protected);
		System.out.println(obj.say�Public);
	}

	
	public void staticOlmayanMethod() {
		C01 obj = new C01();
		System.out.println(obj.say�Private);
		System.out.println(obj.say�Default);
		System.out.println(obj.say�Protected);
		System.out.println(obj.say�Public);
		
	}
	
	
	
	
}
