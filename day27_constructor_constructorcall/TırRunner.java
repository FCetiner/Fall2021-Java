package day27_constructor_constructorcall;

public class TýrRunner {

	public static void main(String[] args) {
		// bir tane tüm özellikleri deðiþtiren constructor oluþturalým
		
		
		Tir týr1 = new Tir(5000, "axor", "beyaz", 2020, false);

		System.out.println(týr1.km + " " + týr1.model + " " + týr1.renk + " " +
							týr1.yýl + " " + týr1.satýlýkMý);
	
	// uc ozelliði deðiþtiren bir constructor oluþturalým
	//int km, String model, String renk
		
	Tir tir2= new Tir(12000, "kar" ,"Kýrmýzý");	
	
	System.out.println(tir2.km + " " + tir2.model + " " + tir2.renk + " " +
			tir2.yýl + " " + tir2.satýlýkMý);
	//12000 kar Kýrmýzý 2000 false
	
	
	
	}

}
