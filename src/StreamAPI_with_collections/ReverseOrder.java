package StreamAPI_with_collections;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList();
		l.add("debcazqp");
		l.add("certghbac");
		l.add("defg");
		l.add("njughkdkk");
		l.add("ooiuytr");
		l.add("abcde");
		l.add("bcdef");
		l.stream()
		.sorted((elem1,elem2)-> -123)
		.distinct()
		.forEach(System.out::println);

	}

}