package day34_accessDeneme;

import day34_accessModifierEncapsulation.C01;

public class C02_BaskaPackageChilClass extends C01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		C01 obj = new C01();
		
	//	System.out.println(obj.say�Private);
	//	System.out.println(obj.say�Default);
	//	System.out.println(obj.say�Protected); main method'dan ula�amamam�z�n sebebi static kulub� ile ilgili
		System.out.println(obj.say�Public);
		
		
	}

	public void staticOlmayanMethod () {
		C01 obj = new C01();
		
		
	//	System.out.println(obj.say�Default);
		System.out.println(say�Protected); //bu class'da say� protected diye bir veriable
											// olmad��� halde parent class'da var oldu�u i�in
											//Java problem yapmad�
		System.out.println(obj.say�Public);
	}
	
	
	
}
