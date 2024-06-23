package StreamAPI_with_Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr= {10,20,30,50,4};
		OptionalInt od=Arrays
		.stream(arr)
		.min();
		System.out.println(od.getAsInt());
		
	}

}
