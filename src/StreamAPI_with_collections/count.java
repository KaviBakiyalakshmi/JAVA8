package StreamAPI_with_collections;

import java.util.ArrayList;
import java.util.List;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(45);
		l.add(30);
		System.out.println(l
				.stream()
				.count());
	}

}
