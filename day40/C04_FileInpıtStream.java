package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInpýtStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Javada bir dosyaya ulasmak istediðimzde FileInputStream classýndan yardým alýrýz
		
		@SuppressWarnings({ "unused", "resource" })
		FileInputStream fis = new FileInputStream("src\\day40\\yazý.txt");

		//java bu kodda olasý bir problem öngörüyor
		//bu probleme karþý ne yapmasý gerektiðini bize soruyor
		//Altý çizilen her kod CTE deðildir
		
		//Bunun için iki durum söz konusu
		//1 try catch kullanarak bu problemi handle edip java nýn yoluna devam etmesini saglayabiliriz
		//' eger dosya okunmuyorsa kod calýsmasýn istiyorsak olayýn farkýnda oldugumuzu
		//ve sorumlulugun bizde oldugunu Javaya soylemeliyiz
		
		System.out.println("Görev tamamlandý");
	}

}
