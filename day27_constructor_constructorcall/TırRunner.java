package day27_constructor_constructorcall;

public class T�rRunner {

	public static void main(String[] args) {
		// bir tane t�m �zellikleri de�i�tiren constructor olu�tural�m
		
		
		Tir t�r1 = new Tir(5000, "axor", "beyaz", 2020, false);

		System.out.println(t�r1.km + " " + t�r1.model + " " + t�r1.renk + " " +
							t�r1.y�l + " " + t�r1.sat�l�kM�);
	
	// uc ozelli�i de�i�tiren bir constructor olu�tural�m
	//int km, String model, String renk
		
	Tir tir2= new Tir(12000, "kar" ,"K�rm�z�");	
	
	System.out.println(tir2.km + " " + tir2.model + " " + tir2.renk + " " +
			tir2.y�l + " " + tir2.sat�l�kM�);
	//12000 kar K�rm�z� 2000 false
	
	
	
	}

}
