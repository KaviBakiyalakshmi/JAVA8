package StreamAPI_with_Array;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,30,50,4};
		OptionalDouble obj=Arrays
				.stream(arr)
				.average();
		System.out.println(obj.getAsDouble());
	}

}
