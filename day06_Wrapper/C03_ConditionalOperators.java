package day06_Wrapper;

public class C03_ConditionalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		 System.out.println(5+3==8 || 6+5==10 || 7-2==3);// true
	        
	       
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c ;
		
		//&& i�areti & de kullan�labilir ancak arada bir nuans var
		// && i�reti ilk false u buldu�unda i�lemin sonucunun false olaca��n� bilir
		// geriye kalan i�lemleri kontrol etmeden sonucu false yazd�r�r
		// & i�areti �nce t�m i�lemleri bitirir ve sonucu false olarak yazd�r�r
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);  // iki tane && oldu�u i�in tek false oldu�u i�in sonu� false
				
		System.out.println(5+3==8 & 6+5==10 & 7-2==3); //b�t�n i�lemleri kontrol etmesini istiyorsak tek &
	
		int ya�=50;
		int boy =180;
		char cinsiyet= 'M';
		
		System.out.println(ya�<30 && boy<170 && cinsiyet=='M'); //
	
	
	}

}
