package day47_maps;

import java.util.ArrayList;
import java.util.Collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		//Bir map oluþturmadan önce mape koyacagýmýz key ve value deðerlerini incelemeliyiz
		//Tüm deðerleri koyabilmek için Key ve Value için Object,Object seçebiliriz
		//Ama bu durumda map içerisindaki elemanlara ait bilgilere ulaþmkata zorlanabiliriz
		//Data türünü secerken hem içine koyacagýmýz tüm elemanlarý kaosayacak data türü seçmeliyiz
		//hem de içine koydugumuz tum elemanlarý isleyebilecek sekilde basit data turu secmeliyiz
		
		//2- Mapi oluþtururken mapin türüne de karar vermeliyiz

		Map<Integer,String>sýnýf=new HashMap<>();
		
		sýnýf.put(101, "Ali, Can, J.dev");
		sýnýf.put(102, "Veli, Yan, QA");
		sýnýf.put(103, "Ali, Yan, C#");
		
		int no=104;
		String isim="Ayþe";
		String soyisim="Can";
		String brans="QA";
		sýnýf.put(no, isim+", "+soyisim+", "+brans);
		
		System.out.println(sýnýf); //{101=Ali, Can, J.dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#, 104=Ayþe, Can, QA}
						// map par. Key1=Value1				Key2=Value2
		//nosu 102 olan öðrencinin bilgilerini gorelim
		System.out.println(sýnýf.get(102));//Veli, Yan, QA
		System.out.println(sýnýf.get(104));//Ayþe, Can, QA
		
		//map'deki tüm key'leri gorelim
		System.out.println(sýnýf.keySet());//[101, 102, 103, 104] keyleri Set olarak getirir
		
		System.out.println(sýnýf.values()); //[Ali, Can, J.dev, Veli, Yan, QA, Ali, Yan, C#, Ayþe, Can, QA] mapdeki tüm valueleri gormek istersek 
		//Ancak yazdýrma iþlemi dýþýnda bir þey yapamayýz
		//sýnýftaki ogrencilerin isimlerini bir listeye ekleyip yazdýralým
		
		List<String> valueList=new ArrayList<>((sýnýf.values()));
		System.out.println("Value List : "+valueList);//Value List : [Ali, Can, J.dev, Veli, Yan, QA, Ali, Yan, C#, Ayþe, Can, QA]
		
		System.out.println(valueList.size());
		
		
	}

}
