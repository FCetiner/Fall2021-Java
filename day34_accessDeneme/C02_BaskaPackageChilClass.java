package day34_accessDeneme;

import day34_accessModifierEncapsulation.C01;

public class C02_BaskaPackageChilClass extends C01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		C01 obj = new C01();
		
	//	System.out.println(obj.sayıPrivate);
	//	System.out.println(obj.sayıDefault);
	//	System.out.println(obj.sayıProtected); main method'dan ulaşamamamızın sebebi static kulubü ile ilgili
		System.out.println(obj.sayıPublic);
		
		
	}

	public void staticOlmayanMethod () {
		C01 obj = new C01();
		
		
	//	System.out.println(obj.sayıDefault);
		System.out.println(sayıProtected); //bu class'da sayı protected diye bir veriable
											// olmadığı halde parent class'da var olduğu için
											//Java problem yapmadı
		System.out.println(obj.sayıPublic);
	}
	
	
	
}
