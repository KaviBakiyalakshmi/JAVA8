package IntermediateOperation;

import java.util.ArrayList;

public class ArraylistToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Object[] ob=al
		.stream()
		.toArray();
		for(Object o : ob)
		{
			System.out.println(o);
		}
	}

}
