package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		//Integer.valueOf() returns an Integer object, 
		//while Integer.parseInt() returns an int primitive
		
		String s = "5";
		Object a = Integer.valueOf(s);
		System.out.println(a instanceof String);
		System.out.println(a.toString());

		List<Object> l = new ArrayList<Object>();
		l.add("bhanu");
		l.add(4);
		l.add(false);

		Iterator<Object> i = l.iterator();
		while (i.hasNext()) {
			Object obj = (Object) i.next();
			System.out.println(obj.toString());
		}
	}

}
