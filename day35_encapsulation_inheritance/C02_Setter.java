package day35_encapsulation_inheritance;

public class C02_Setter {
public static void main(String[] args) {
	
	//ogretmenler ograncinin notunu girebilsin 
	//ama t�m notlar� goremesin
	//sadece ge�ip ge�emedi�ini g�rs�n
	
	
	C01 ogr1=new C01();
	
	
	System.out.println(ogr1.isGecerMi());
	
	ogr1.setNot(50);
	
	System.out.println(ogr1.isGecerMi());
	
}
}
