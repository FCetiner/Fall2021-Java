package day26_forEachLoop_Constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		// Bir int array olu�turun
		//bu arraydaki t�m say�lar�n carp�m�n� for each loop kullanarak bulun
		//sonucu ekrana yazd�r�n
		
		int arr[]= {3,4,2,5};
		int carp�m=1;
		
		for (int each : arr) {
			carp�m *=each;
		}
		System.out.println("Arrayin elemanlar� carp�m� : " + carp�m);
	}

}
