package StreamAPI_with_Array;

import java.util.Arrays;
import java.util.OptionalLong;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,5,7,20,40,0,30};
		long od=Arrays
				.stream(arr)
				.count();
		System.out.println(od);
	}

}
