package day10_ternary_Switchcase;

public class c08_switchCase {

	public static void main(String[] args) {
		//gün numarasýna göre hafta içi veya hafta sonu yazdýralým
		
		int gunNo=2; 
		
		switch(gunNo) {			
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta içi");
			break;
		case 6:
		case 7:
			System.out.println("Hafta Sonu");
			break;
		default:
			System.out.println("Lütfen geçerli bir gün numarasý girin");
		
			
		}
		
	}

}
