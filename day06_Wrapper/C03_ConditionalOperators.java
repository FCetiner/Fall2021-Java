package day06_Wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {

		 System.out.println(5+3==8 || 6+5==10 || 7-2==3);// true
	        
	       
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c ;
		
		//&& iþareti & de kullanýlabilir ancak arada bir nuans var
		// && iþreti ilk false u bulduðunda iþlemin sonucunun false olacaðýný bilir
		// geriye kalan iþlemleri kontrol etmeden sonucu false yazdýrýr
		// & iþareti önce tüm iþlemleri bitirir ve sonucu false olarak yazdýrýr
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);  // iki tane && olduðu için tek false olduðu için sonuç false
				
		System.out.println(5+3==8 & 6+5==10 & 7-2==3); //bütün iþlemleri kontrol etmesini istiyorsak tek &
	
		int yaþ=50;
		int boy =180;
		char cinsiyet= 'M';
		
		System.out.println(yaþ<30 && boy<170 && cinsiyet=='M'); //
	
	
	}

}
