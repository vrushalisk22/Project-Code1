package CollectionProg;

import java.util.LinkedHashSet;

public class LinkedHashSetProg {

	public static void main(String[] args) {
		
	LinkedHashSet a = new LinkedHashSet();
	LinkedHashSet b = new LinkedHashSet(900);
	LinkedHashSet c = new LinkedHashSet(900,99);
	LinkedHashSet d = new LinkedHashSet(a);
	
	a.add(10);
	a.add(20);
	a.add(2);
	a.add(5);
	a.add(11);
	a.add(3);
	System.out.println(a);
	
	a.add("AAAA");
	a.add("BBB");
	a.add("ZZ");
	a.add('D');
	System.out.println(a);

	a.add(10);
	a.add(null);
	

	System.out.println(a);
	System.out.println(a.size());
	
	
	
	}
}
