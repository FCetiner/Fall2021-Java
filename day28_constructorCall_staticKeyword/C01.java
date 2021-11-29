package day28_constructorCall_staticKeyword;

public class C01 {

	    int x = 3;
	    int y = 5;
	    C01() {
	        x += 1;
	        System.out.println("-x" + x);
	    }
	    C01(int i) {
	        this();
	        this.y = i;
	        x += y;
	        System.out.println("-x" + x);
	    }
	    C01(int i, int i2) {
	        this(3);
	        this.x -= 4;
	        System.out.println("-x" + x);
	    }
	    public static void main(String[]args) {
	        
	         C01 c01= new C01(4,3);
	        //Constructor cali�maya baslad�ktan sonra x ve y ile ilgili de�i�meler
	         //(x ve y instance veriable oldu�u i�in) sadece c01 objesini ilgilendirir
	         //constructor i�i bitti�inde x ve y instance de�er halini al�r
	         System.out.println("c01 i�in x :"+ c01.x +" c01 i�in y :"+ c01.y);


	         C01 c02=new C01();
	         System.out.println("c02 i�in x :"+ c02.x +" c02 i�in y :"+ c02.y);

	         C01 c03 = new C01(7);
	         
	         System.out.println("c03 i�in x :"+ c03.x +" c03 i�in y :"+ c03.y);

	    }
	}
