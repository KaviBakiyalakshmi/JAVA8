package StreamAPI_with_Array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream_creation_using_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[]{10,20,30,50,0,20};
		//System.out.println(arr.length);
		//IntStream s=Arrays.stream(arr);
		//System.out.println(s.count());
		System.out.println(Arrays.stream(arr).count());
		
		//sorting using stream
		IntStream s2=Arrays.stream(arr);
		s2=s2.sorted();
		//s2.forEach(no -> System.out.println(no));
	    s2.forEach(System.out::println);
	    
	    //stream creation for short format
	    
	    Arrays.stream(arr).sorted().forEach(System.out::println);
	   
	    
	}

}
