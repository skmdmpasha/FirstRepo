package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;

public class Example6 {

	public static void main(String[] args) {
		ArrayList<Customer> array = new ArrayList<Customer>();
		
		array.add(new Customer("test1",10));
		array.add(new Customer("test3",30));
		array.add(new Customer("test4",40));
		array.add(new Customer("test2",20));
		
		System.out.println("sorting by name...");
		
		Collections.sort(array, new NameComparator());
		
		for (Customer customer : array) {
			System.out.println(customer.name);
		}

	}

}
