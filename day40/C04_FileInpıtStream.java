package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInp�tStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Javada bir dosyaya ulasmak istedi�imzde FileInputStream class�ndan yard�m al�r�z
		
		@SuppressWarnings({ "unused", "resource" })
		FileInputStream fis = new FileInputStream("src\\day40\\yaz�.txt");

		//java bu kodda olas� bir problem �ng�r�yor
		//bu probleme kar�� ne yapmas� gerekti�ini bize soruyor
		//Alt� �izilen her kod CTE de�ildir
		
		//Bunun i�in iki durum s�z konusu
		//1 try catch kullanarak bu problemi handle edip java n�n yoluna devam etmesini saglayabiliriz
		//' eger dosya okunmuyorsa kod cal�smas�n istiyorsak olay�n fark�nda oldugumuzu
		//ve sorumlulugun bizde oldugunu Javaya soylemeliyiz
		
		System.out.println("G�rev tamamland�");
	}

}
