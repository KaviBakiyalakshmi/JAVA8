package StreamAPI_with_Array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,5,7,20,40,0,30};
	   Arrays
		.stream(arr)
		.sorted()   
		.forEach(System.out::println); //terminal operations
		//System.out.println(od.getAsDouble());
		 
		 
	}

}
