package day23_MultiDimensionalArrays;

public class C03_MDArray {

	public static void main(String[] args) {
	//	Asagidaki multi dimensional array’in tum elemanlarinin carpimini
		//ekrana  yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
		
		int arr[][]={ {1,2}, {4,5,6,7} };
		
		carpýmYazdir(arr);
		
		
	}

	private static void carpýmYazdir(int[][] arr) {
		int a=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				a*=arr[i][j];
				
			}
		}System.out.println(a);
		
	}

}
