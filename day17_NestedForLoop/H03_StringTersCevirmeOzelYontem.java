package day17_NestedForLoop;

import java.util.Scanner;

public class H03_StringTersCevirmeOzelYontem {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime girin: ");
        String yazi = scan.nextLine();


        String cevrilen = cevir(yazi);
        System.out.println("Çevrilen Yazı: " + cevrilen);
        scan.close();
    }
    public static String cevir(String yazi) {
        if (yazi.isEmpty()) {
            return yazi;
        }
        return cevir(yazi.substring(1)) + yazi.charAt(0) ;

	}

}
