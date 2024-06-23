package IntermediateOperation;

import java.util.ArrayList;
import java.util.HashSet;

public class Limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> al=new HashSet<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al
		.stream()
		.limit(2)
		.forEach(System.out::println);
	}

}
