package ParallelStream;

import java.util.ArrayList;

public class StreamParallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al
		.parallelStream()
		.forEachOrdered(System.out::println);
	}

}
