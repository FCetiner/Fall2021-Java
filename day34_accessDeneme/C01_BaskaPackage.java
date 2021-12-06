package day34_accessDeneme;

import day34_accessModifierEncapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {


		C01 obj = new C01();
		//System.out.println(obj.sayıPrivate); sadece kendi classından ulaşılır
	//	System.out.println(obj.sayıDefault); sadece aynı package dekile ulaşabilir
	//	System.out.println(obj.sayıProtected); aynı package daki classlar ve child classlar ulaşabilir
		System.out.println(obj.sayıPublic);

		
	}

}
