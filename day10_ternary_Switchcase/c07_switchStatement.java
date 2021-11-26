package day10_ternary_Switchcase;

public class c07_switchStatement {

	public static void main(String[] args) {
		
		//gün numarasýna göre gün isimlerini yazdýralým
		
		int gunNo=2; //test data kullanýcýdan almamak için
		
		switch(gunNo) {			//Buraya yazýlan numara baþlangýç satýrýný belirtiyor
		
		case 1: 
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Lütfen geçerli bir gün numarasý girin");
		
			
		}
	}
}
