package day34_accessModifierEncapsulation;

public class C02 {

	public static void main(String[] args) {
		C01 obj = new C01();
	//	System.out.println(obj.say�Private); private veriablelara kendi class'� d�s�ndan ula��lamaz
		System.out.println(obj.say�Default);
		System.out.println(obj.say�Protected);
		System.out.println(obj.say�Public);

	}

	
	
	public void staticOlmayanMethod() {
		C01 obj = new C01();
	//	System.out.println(obj.say�Private);
		System.out.println(obj.say�Default);
		System.out.println(obj.say�Protected);
		System.out.println(obj.say�Public);
	}
}
