package day10_ternary_Switchcase;

public class c10_switchCase {

	public static void main(String[] args) {
		// Verilen say�y� inceleyin
		// Girilen sayi
		 //10 ise �Iki basamakli en kucuk sayi 
		 //100 ise �uc basamakli en kucuk sayi�
		 //1000 ise �dort basamakli en kucuk sayi�
		 //diger durumlarda �Girdigin sayiyi degistir� yazdirin

		int say�=21 ;
		
		switch(say�) {			
		case 10:
			System.out.println("Iki basamakli en kucuk sayi");
			break;
		case 100:
			System.out.println("uc basamakli en kucuk sayi");
			break;
		case 1000:
			System.out.println("dort basamakli en kucuk sayi");
			default:
			System.out.println("Say�y� de�i�tirin");
		
			
		}
		
		
	}

}
