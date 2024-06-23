package StreamAPI_with_collections;

import java.util.ArrayList;
import java.util.List;

public class UniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(45);
		l.add(30);
		l.add(45);
		l.add(20);
		l.stream()
		.distinct()
		.sorted()
		.forEach(System.out::println);
	}

}
