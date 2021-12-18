package day42_abstractClasses;

public class Ustabasý extends Isci{

	public void statu() {
		System.out.println("Bu classdaki tum personel ustabasýdýr...imza Ustabasý");
	}
	public void maas() {
		System.out.println("Ustabaslarý aylýk 10 bin tl maas alýr...imza Ustabasý");
	}
	public void mesai() {
		System.out.println("Ustabasý arýza durumunda arýza cozulunceye kadar çalýþýr...imza Ustabasý");
	}
	//Obje oluþturdugumuz en alttaki class parent classlardaki methodlarý
	//override edince class'dan oluþturulan objeler en dogru ve specifik ozelliklere kavustu
	
	//Ama klasýk parent child iliþkisinde tum methodlarý override etme mecburiyeti yoktur
	
	//Java parent classlardaki tüm methodlarý override etmek mecbiriyeti kazandýrmak için 
	//abstract class yapýsýný oluþturmustur
	
	//Yani bir classý abstract olarak tanýmlarsanýz child classlar tum methodlarý override etmek zorunda kalýr
	
	//Dolayisi ile abstract yaptýgýmýz parent classlar sadece kalýp görevi yapacaklar
	public static void main(String[] args) {
		
		Ustabasý ust1 = new Ustabasý();
		ust1.statu();
		ust1.maas();
		ust1.mesai();
		
	}

}
