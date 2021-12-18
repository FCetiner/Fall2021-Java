package day42_abstractClasses;

public class Ustabas� extends Isci{

	public void statu() {
		System.out.println("Bu classdaki tum personel ustabas�d�r...imza Ustabas�");
	}
	public void maas() {
		System.out.println("Ustabaslar� ayl�k 10 bin tl maas al�r...imza Ustabas�");
	}
	public void mesai() {
		System.out.println("Ustabas� ar�za durumunda ar�za cozulunceye kadar �al���r...imza Ustabas�");
	}
	//Obje olu�turdugumuz en alttaki class parent classlardaki methodlar�
	//override edince class'dan olu�turulan objeler en dogru ve specifik ozelliklere kavustu
	
	//Ama klas�k parent child ili�kisinde tum methodlar� override etme mecburiyeti yoktur
	
	//Java parent classlardaki t�m methodlar� override etmek mecbiriyeti kazand�rmak i�in 
	//abstract class yap�s�n� olu�turmustur
	
	//Yani bir class� abstract olarak tan�mlarsan�z child classlar tum methodlar� override etmek zorunda kal�r
	
	//Dolayisi ile abstract yapt�g�m�z parent classlar sadece kal�p g�revi yapacaklar
	public static void main(String[] args) {
		
		Ustabas� ust1 = new Ustabas�();
		ust1.statu();
		ust1.maas();
		ust1.mesai();
		
	}

}
