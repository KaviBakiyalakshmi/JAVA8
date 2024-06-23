package HashmapStream;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertMapToListAndDisplaystartwithNoneMatch {

	public static void main(String[] args) {
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
		.noneMatch(name -> name.endsWith("i"));
		System.out.println(result);

	}

}
