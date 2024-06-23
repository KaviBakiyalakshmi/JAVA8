package HashmapStream;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertMapIntoListorSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hm=new HashMap();
		hm.put("kavi",100);
		hm.put("viyan", 200);
		hm.put("iyal", 300);
		hm.put("anu", 400);
		
		Set<String> l= hm
		.keySet()
		.stream()
		.collect(Collectors.toSet());
		System.out.println(l);
	}

}
