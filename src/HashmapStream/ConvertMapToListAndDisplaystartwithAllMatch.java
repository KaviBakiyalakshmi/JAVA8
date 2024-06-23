package HashmapStream;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertMapToListAndDisplaystartwithAllMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub

		HashMap<String,Integer> hm=new HashMap();
		hm.put("kavi",100);
		hm.put("viyan", 200);
		hm.put("iyal", 300);
		hm.put("anu", 400);
		hm.put("Ankit", 500);
		
		List<String> l=hm
		.keySet()
		.stream()
		.collect(Collectors.toList());
		System.out.println(l);
		
		boolean result=l
		.stream()
		.allMatch(name -> name.startsWith("a"));
		System.out.println(result);
	
	}

}
