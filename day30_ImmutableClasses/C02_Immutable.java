package day30_ImmutableClasses;

public class C02_Immutable {

	public static void main(String[] args) {


		@SuppressWarnings("unused")
		String str = "Ali";
		
		for (int i = 0; i < 100; i++) {
			
			str+=" ";
		}

		
		//bu kod �al��t���nda java ka� obje olu�turur
		
		//bir obje ba�ta olu�tur
		//loopta ise 100 obje daha olu�turuldu
		//dolay�s� ile bu kod �al��t���nda biz ekranda bir �ey g�rmeyiz ama
		//str'in son de�eri ise Ali (100 tane bosluk)
		
	}

}
