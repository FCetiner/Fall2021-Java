package day10_ternary_Switchcase;

public class c07_switchStatement {

	public static void main(String[] args) {
		
		//g�n numaras�na g�re g�n isimlerini yazd�ral�m
		
		int gunNo=2; //test data kullan�c�dan almamak i�in
		
		switch(gunNo) {			//Buraya yaz�lan numara ba�lang�� sat�r�n� belirtiyor
		
		case 1: 
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
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
			System.out.println("L�tfen ge�erli bir g�n numaras� girin");
		
			
		}
	}
}
