package day10_ternary_Switchcase;

public class c08_switchCase {

	public static void main(String[] args) {
		//g�n numaras�na g�re hafta i�i veya hafta sonu yazd�ral�m
		
		int gunNo=2; 
		
		switch(gunNo) {			
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta i�i");
			break;
		case 6:
		case 7:
			System.out.println("Hafta Sonu");
			break;
		default:
			System.out.println("L�tfen ge�erli bir g�n numaras� girin");
		
			
		}
		
	}

}
