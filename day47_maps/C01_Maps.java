package day47_maps;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		//Bir map olu�turmadan �nce mape koyacag�m�z key ve value de�erlerini incelemeliyiz
		//T�m de�erleri koyabilmek i�in Key ve Value i�in Object,Object se�ebiliriz
		//Ama bu durumda map i�erisindaki elemanlara ait bilgilere ula�mkata zorlanabiliriz
		//Data t�r�n� secerken hem i�ine koyacag�m�z t�m elemanlar� kaosayacak data t�r� se�meliyiz
		//hem de i�ine koydugumuz tum elemanlar� isleyebilecek sekilde basit data turu secmeliyiz
		
		//2- Mapi olu�tururken mapin t�r�ne de karar vermeliyiz

		Map<Integer,String>s�n�f=new HashMap<>();
		
		s�n�f.put(101, "Ali, Can, J.dev");
		s�n�f.put(102, "Veli, Yan, QA");
		s�n�f.put(103, "Ali, Yan, C#");
		
		int no=104;
		String isim="Ay�e";
		String soyisim="Can";
		String brans="QA";
		s�n�f.put(no, isim+", "+soyisim+", "+brans);
		
		System.out.println(s�n�f); //{101=Ali, Can, J.dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#, 104=Ay�e, Can, QA}
						// map par. Key1=Value1				Key2=Value2
		//nosu 102 olan ��rencinin bilgilerini gorelim
		System.out.println(s�n�f.get(102));//Veli, Yan, QA
		System.out.println(s�n�f.get(104));//Ay�e, Can, QA
		
		//map'deki t�m key'leri gorelim
		System.out.println(s�n�f.keySet());//[101, 102, 103, 104] keyleri Set olarak getirir
		
		System.out.println(s�n�f.values()); //[Ali, Can, J.dev, Veli, Yan, QA, Ali, Yan, C#, Ay�e, Can, QA] mapdeki t�m valueleri gormek istersek 
		//Ancak yazd�rma i�lemi d���nda bir �ey yapamay�z
		//s�n�ftaki ogrencilerin isimlerini bir listeye ekleyip yazd�ral�m
		
		List<String> valueList=new ArrayList<>((s�n�f.values()));
		System.out.println("Value List : "+valueList);//Value List : [Ali, Can, J.dev, Veli, Yan, QA, Ali, Yan, C#, Ay�e, Can, QA]
		
		System.out.println(valueList.size());//4
		
		List<String>isimListesi=new ArrayList<>();
		String bilgiler[]=new String[3];
		for (int i = 0; i < valueList.size(); i++) {
			bilgiler=valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]); //her seferinde s�f�r�nc� eleman� alacag�m�z i�in 0 yapt�k
		}
		System.out.println(isimListesi);
		
	}

}
