package StreamAPIWithMapFunction;

import java.util.ArrayList;

public class MapFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		//System.out.println(al);
		al
		.stream()
		.map(no -> no/2)
		.forEach(System.out::println);
	}

}
