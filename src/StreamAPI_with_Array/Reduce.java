package StreamAPI_with_Array;

import java.util.Arrays;

public class Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,5,7,20,40,0,30};
		Arrays
		.stream(arr)
		.filter(no->no%2==0)
	.forEach(System.out::println);
		
		
	}

}
