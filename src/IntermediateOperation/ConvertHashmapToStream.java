package IntermediateOperation;

import java.util.HashMap;

public class ConvertHashmapToStream {

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
