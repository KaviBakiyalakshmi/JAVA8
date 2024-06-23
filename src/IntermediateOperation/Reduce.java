package IntermediateOperation;

import java.util.ArrayList;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		
		Optional<Integer> result=al
		.stream()
		.reduce((no1,no2) -> no1+no2);
		System.out.println(result.get());
	}

}
