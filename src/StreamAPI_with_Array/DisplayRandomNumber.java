package StreamAPI_with_Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class DisplayRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,30,50,4};
		OptionalInt obj=Arrays
				.stream(arr)
				.findAny();
		System.out.println(obj.getAsInt());
	}

}
