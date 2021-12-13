package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {


		//Verilen bir int array için kullanýcýdan
		//sayý isteyin ve girilen sayý yý index olarak kabul edip o indexteki 
		//elementi yazdýrýn
		int arr[]= {2,3,5,6,2,7,9,1};
		//ArrayIndexOutOfBoundsException
		//InputMismatchException
		
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Lütfen elementi yazdýrmak için index girin");
			int index=scan.nextInt();
			
			System.out.println("girdiðiniz indexteki element : " + arr[index]);
			scan.close();
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Girdiðiniz index array'de yok");
		} catch(InputMismatchException e) {
			System.out.println("Girdiginiz index pozitif tam sayý olmalý");
		}
		
		
		

	}

}
