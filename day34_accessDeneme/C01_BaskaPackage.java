package day34_accessDeneme;

import day34_accessModifierEncapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {


		C01 obj = new C01();
		//System.out.println(obj.say�Private); sadece kendi class�ndan ula��l�r
	//	System.out.println(obj.say�Default); sadece ayn� package dekile ula�abilir
	//	System.out.println(obj.say�Protected); ayn� package daki classlar ve child classlar ula�abilir
		System.out.println(obj.say�Public);

		
	}

}
