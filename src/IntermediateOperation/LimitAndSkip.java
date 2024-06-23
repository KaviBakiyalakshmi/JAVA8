package IntermediateOperation;

import java.util.ArrayList;

public class LimitAndSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//I want two data from that i ned to skip one data
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al
		.stream()
		.limit(4)
		.skip(2)
		.forEach(System.out::println);
	}

}
