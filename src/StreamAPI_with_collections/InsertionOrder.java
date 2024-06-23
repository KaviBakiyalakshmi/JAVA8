package StreamAPI_with_collections;

import java.util.ArrayList;
import java.util.List;

public class InsertionOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=new ArrayList();
		l.add("debcazqp");
		l.add("certghbac");
		l.add("wdefg");
		l.add("abcde");
		l.add("njughkdkk");
		l.add("eooiuytr");
		l.add("bcdef");
		l.stream()
		.sorted((elem1,elem2)-> 5)
		.distinct()
		.forEach(System.out::println);
	}

}
