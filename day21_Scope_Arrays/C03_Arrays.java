package day21_Scope_Arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		//Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun
		
		String arr[]=new String[4];
		arr[0] ="Ali";
		arr[1] = "Veli";
		arr[2] = "Ayþe";
		arr[3] = "Fatma";
		
		String arr2[] = {"Ali","Veli","Ayþe","Fatma"};		
		
		
		// Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin
		
		arr2[0]="Can";
		arr2[2]="Gül";
		
		
		System.out.println(arr2[1]);
		//son elementi yazdýrýn
		System.out.println(arr[arr.length-1]); //String'deki lenght() idi burada sadece lenght
		
		//System.out.println(arr[arr.length]);

	}

}
