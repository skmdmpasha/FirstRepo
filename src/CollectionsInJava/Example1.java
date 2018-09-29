package CollectionsInJava;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "value1");
		m.put(2, "value2");
		m.put(3, "value3");
		m.put(4, "value4");
		m.put(5, "value5");
		m.put(6, "value6");

		System.out.println(m);
		

		// Map.Entry<Integer, String> map
		for (Map.Entry<Integer, String> map : m.entrySet()) {
			//System.out.println(map instanceof Map.Entry);
			System.out.println(map.getKey() + " " + map.getValue());
		}

	}

}