
package HashmapStream;

import java.util.HashMap;

public class SortingUsingKeyInAlphabetsOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hm=new HashMap();
		hm.put("kavi",100);
		hm.put("viyan", 200);
		hm.put("iyal", 300);
		hm.put("anu", 400);
		
		hm
		.keySet()
		.stream()
		.sorted()
		.forEach(System.out::println);
		
	}

}
