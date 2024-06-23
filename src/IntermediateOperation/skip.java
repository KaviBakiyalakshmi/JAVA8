package IntermediateOperation;

import java.util.ArrayList;
import java.util.HashSet;

public class skip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet<Integer> al=new HashSet<Integer>();
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al
		.stream()
		.skip(2)
		.forEach(System.out::println);
	}

}
