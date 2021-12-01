package day30_ImmutableClasses;

public class C02_Immutable {

	public static void main(String[] args) {


		@SuppressWarnings("unused")
		String str = "Ali";
		
		for (int i = 0; i < 100; i++) {
			
			str+=" ";
		}

		
		//bu kod çalýþtýðýnda java kaç obje oluþturur
		
		//bir obje baþta oluþtur
		//loopta ise 100 obje daha oluþturuldu
		//dolayýsý ile bu kod çalýþtýðýnda biz ekranda bir þey görmeyiz ama
		//str'in son deðeri ise Ali (100 tane bosluk)
		
	}

}
