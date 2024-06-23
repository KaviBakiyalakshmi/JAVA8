package StreamAPI_with_Array;

import java.util.Arrays;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {10,10,4,2,6,7,4};
		Arrays
		.stream(arr)
		.distinct()
		.forEach(System.out::println);
	}

}
