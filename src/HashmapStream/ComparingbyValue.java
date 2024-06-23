package HashmapStream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ComparingbyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hm=new HashMap();
		hm.put("kavi",100);
		hm.put("viyan", 200);
		hm.put("iyal", 300);
		hm.put("anu", 400);
		
		hm
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
	}

}
