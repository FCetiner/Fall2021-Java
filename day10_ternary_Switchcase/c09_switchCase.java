package day10_ternary_Switchcase;

public class c09_switchCase {
public static void main(String[] args) {
	
		//Harf olarak girilen notu rakama çevirelim
	
	char not='C';
			
			switch(not) {
			case 'A':
				System.out.println("85 -100 arasý");
				break;
			case 'B':
				System.out.println("60 -85 arasý");
				break;
			case 'C':
				System.out.println("50 - 60 arasý");
				break;
			case 'D':
				System.out.println("50'den düþük");
				default:
					System.out.println("Geçersiz not");
				
			
			}
	
	
	}
}
