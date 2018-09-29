package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Laptop> lpt = new ArrayList<Laptop>();
		
		lpt.add(new Laptop("hp",1000,2));
		lpt.add(new Laptop("asus",1000,2));
		lpt.add(new Laptop("intel",1000,2));
		lpt.add(new Laptop("gigabyte",1000,2));
		lpt.add(new Laptop("samsung",1000,2));
		
		//System.out.println(lpt);
		
		System.out.println("sorting by model name ...");
		
		//when you have a list you have to make sure that
		//all the values in that list are  Comparable
		
		Collections.sort(lpt);
		
		
		for(Laptop laptop : lpt) {
			System.out.println(laptop);
		}

	}

}
