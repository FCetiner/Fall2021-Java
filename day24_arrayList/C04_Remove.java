package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {
		
		List<String> harfler = new ArrayList <>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");


		System.out.println(harfler);
		
		System.out.println(harfler.remove(1)); //Z
		
		harfler.remove(1); // bu sat�r gidip 1 indexindeki eleman� remove eder
							// ve remove etti�i eleman� bize getirir
		//listenin kalan�n� g�rmek isterseniz listeyi yazd�rabilirsiniz
		
		
		System.out.println(harfler);	//[A, F, D]
		
		System.out.println(harfler.remove(1)); // D
		
		System.out.println(harfler); // A F
		
		
		System.out.println(harfler.remove("F")); // gidip F yi remove eder ve true d�nd�r�
												// e�er harf yoksa false d�nd�r�r
		System.out.println();  //[A]
		
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println(harfler);  //[A, A, Z, F]
		
		System.out.println(harfler.remove("A"));	//True
		
		System.out.println(harfler);	//[A, Z, F]
		
		harfler.add("A");
		
		System.out.println(harfler);	//[A, Z, F, A]
		
		harfler.removeAll(harfler);	//verilen listeyi siler
		
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekharfler = new ArrayList <>();
	
		silinecekharfler.add("A");
		silinecekharfler.add("C");
		silinecekharfler.add("F");
		
		System.out.println(harfler);	//[A, Z, F, D]
		
		System.out.println(silinecekharfler); //[A, C, F]
		
		System.out.println(harfler.removeAll(silinecekharfler)); //true
		
		System.out.println(harfler); 	//[Z, D]
		System.out.println(silinecekharfler); //[A, C, F]
	
	
		//e�er listemiz integer'lardan olu�uyorsa 
		//remove (index) ve remove (object) methodlar� kar��mas�n diye
		//girilen say�y� index olarak kabul eder
		
	
	
	
	
	}

}
