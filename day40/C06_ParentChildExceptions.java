package day40;

import java.io.FileInputStream;

import java.io.IOException;

public class C06_ParentChildExceptions {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream("src\\day40\\yaz�.txt");
			 int k=0;
			    while((k=fis.read())!=-1) {
			        System.out.print((char)k);

			    }
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("G�rev tamamland�");
		
		
		
		
		
		
		
	}

}

