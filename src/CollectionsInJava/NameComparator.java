package CollectionsInJava;

import java.util.Comparator;

public class NameComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Customer s1 = (Customer)o1;
		Customer s2 = (Customer)o2;
		return s1.name.compareTo(s2.name);
	}

}
