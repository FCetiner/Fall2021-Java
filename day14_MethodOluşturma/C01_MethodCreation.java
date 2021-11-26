package day14_MethodOluþturma;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Verilen iki sayýnýn toplamýný ve çarpýmýný yapýp yazdýran iki ayrý method oluþturun
		
		// method oluþturmak için 3 adým takip edelim
		//1. adým method call yazalým
		//2. adým methoda argüman yazacak mýyýz karar vermeliyýz
		
		int sayi1=4;
		int sayi2=5;
				
		toplama(sayi1,sayi2); // method call
		// 3. adým 1. ve 2. adýmý yaptýktan sonra Java'dan yardým alýp methodu oluþtururuz.
		
		carpma(sayi1,sayi2);
	
		
	
	
	
	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin çarpýmý:" + sayi1*sayi2);
		
	}

	
	
	
	
	
	public static void toplama(int sayi1, int sayi2) {
		// 4. adým eriþim düzenleyici ve return type karar vermeliyiz
		// eriþim düzenleyici axcess modifier	:
		//return type	: bizden sadece yazdýrma istediði için void kalabilir
		
		System.out.println("sayýlarýn toplamý:"  + (sayi1+sayi2));
	}

}
