package day26_forEachLoop_Constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		// Bir int array oluþturun
		//bu arraydaki tüm sayýlarýn carpýmýný for each loop kullanarak bulun
		//sonucu ekrana yazdýrýn
		
		int arr[]= {3,4,2,5};
		int carpým=1;
		
		for (int each : arr) {
			carpým *=each;
		}
		System.out.println("Arrayin elemanlarý carpýmý : " + carpým);
	}

}
