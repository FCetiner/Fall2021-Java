package day30_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class H02 {

	public static void main(String[] args) {

		List <Integer> values = new ArrayList <>();
		values.add(4);
		values.add(5);
		values.set(1, 6);
		values.remove(0);
		for (Integer s : values) {
			System.out.print(s);
		}
	}

}
