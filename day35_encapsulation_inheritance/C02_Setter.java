package day35_encapsulation_inheritance;

public class C02_Setter {
public static void main(String[] args) {
	
	//ogretmenler ograncinin notunu girebilsin 
	//ama tüm notlarý goremesin
	//sadece geçip geçemediðini görsün
	
	
	C01 ogr1=new C01();
	
	
	System.out.println(ogr1.isGecerMi());
	
	ogr1.setNot(50);
	
	System.out.println(ogr1.isGecerMi());
	
}
}
