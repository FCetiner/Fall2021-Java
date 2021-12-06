package day34_accessModifierEncapsulation;

public class C04_PublicVeriPaylaþýmý {

	public static void main(String[] args) {


		C03 obj=new C03();
		System.out.println(obj.isim);//ali
		System.out.println(obj.maas);//10000
		
		obj.isim="Veli Cem";
		obj.maas=15000;
		
		System.out.println(obj.isim);//veli cem
		System.out.println(obj.maas);//15000
		
		
		
	}

}
