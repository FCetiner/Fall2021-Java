package day10_ternary_Switchcase;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		// Take input of age of 3 people by user and determine oldest and youngest among them.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int x =scan.nextInt();
		System.out.println("Please enter your age");
		int y =scan.nextInt();
		System.out.println("Please enter your age");
		int z =scan.nextInt();
		
		if (x>0 || y<0 ||z<0) {
			System.out.println("Please enter a valid age" );
		} else if (x>y && y>z) {
			System.out.println("The oldest one:" + x );
			System.out.println("The youngest one:" + z );
		} else if (y>z && z>x){
			System.out.println("The oldest one:" + y );
			System.out.println("The youngest one:" + x );
		}else if (z>y && y>x){
			System.out.println("The oldest one:" + z );
			System.out.println("The youngest one:" + x);
		}
		
				
scan.close();
	}

}
