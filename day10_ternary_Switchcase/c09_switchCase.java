package day10_ternary_Switchcase;

public class c09_switchCase {
public static void main(String[] args) {
	
		//Harf olarak girilen notu rakama �evirelim
	
	char not='C';
			
			switch(not) {
			case 'A':
				System.out.println("85 -100 aras�");
				break;
			case 'B':
				System.out.println("60 -85 aras�");
				break;
			case 'C':
				System.out.println("50 - 60 aras�");
				break;
			case 'D':
				System.out.println("50'den d���k");
				default:
					System.out.println("Ge�ersiz not");
				
			
			}
	
	
	}
}
