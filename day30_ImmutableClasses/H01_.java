package day30_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class H01_ {

	public static void main(String[] args) {

		List <String> list = new ArrayList <>();
		list.add("one");
		list.add("two");
		//list.add(7);
		for (String s : list) {
			System.out.print(s);
		}
		
		//cevap CTE on line 9(13)
	}

}
