package day42_AbstractClasses;

public class AbstractUstabasý extends AbstractIsci{

	public static void main(String[] args) {

		// concrete bir child class parent'i olan abstract class'lardaki tum abstract method'lari implement etmelidir
		// ama parent'i olan abstract class'lardaki concrete method'lari implement etmek zorunda degildir
		
		AbstractUstabasý ust1=new AbstractUstabasý();
			ust1.statu();
			ust1.maas();
			ust1.mesai();

		}

		@Override
		public void mesai() {
			System.out.println("Bu classdaki tum personel ustabasidir. imza Ustabasi");
			
		}

		@Override
		public void maas() {
			System.out.println("Ustabaslari aylik 10000 tl maas alir. imza Ustabasi");
			
		}

		@Override
		public void statu() {
			
			System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir. imza ustabasi");
		}

		@Override
		public void abstractMethod() {
			// personel class'indan geldi
		
	}

}
