package IntermediateOperation;

import java.util.ArrayList;

public class ConvertStreamtoParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al
		.stream()
		.parallel()
		.forEachOrdered(System.out::println);
	}

}
