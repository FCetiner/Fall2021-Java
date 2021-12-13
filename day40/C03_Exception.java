package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {


		//Verilen bir int array i�in kullan�c�dan
		//say� isteyin ve girilen say� y� index olarak kabul edip o indexteki 
		//elementi yazd�r�n
		int arr[]= {2,3,5,6,2,7,9,1};
		//ArrayIndexOutOfBoundsException
		//InputMismatchException
		
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("L�tfen elementi yazd�rmak i�in index girin");
			int index=scan.nextInt();
			
			System.out.println("girdi�iniz indexteki element : " + arr[index]);
			scan.close();
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Girdi�iniz index array'de yok");
		} catch(InputMismatchException e) {
			System.out.println("Girdiginiz index pozitif tam say� olmal�");
		}
		
		
		

	}

}
