package day34_accessModifierEncapsulation;

public class C02 {

	public static void main(String[] args) {
		C01 obj = new C01();
	//	System.out.println(obj.sayıPrivate); private veriablelara kendi class'ı dısından ulaşılamaz
		System.out.println(obj.sayıDefault);
		System.out.println(obj.sayıProtected);
		System.out.println(obj.sayıPublic);

	}

	
	
	public void staticOlmayanMethod() {
		C01 obj = new C01();
	//	System.out.println(obj.sayıPrivate);
		System.out.println(obj.sayıDefault);
		System.out.println(obj.sayıProtected);
		System.out.println(obj.sayıPublic);
	}
}
