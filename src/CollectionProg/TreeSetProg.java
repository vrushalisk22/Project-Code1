package CollectionProg;

import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String[] args) {
		TreeSet a = new TreeSet();
		TreeSet b = new TreeSet();
		a.add(12);
		a.add(7);
		a.add(39);
		a.add(9);
		a.add(18);
		a.add(71);
		System.out.println(a);
		//a.add(null);  // not accepting ------null pointer exception
		//a.add('B');  // not heterogenous
		a.add(100);
		System.out.println("TreeSet A = " + a);
		
        b.add("Vrushali");
		b.add("Aarush");
		b.add("Raya");
		b.add("Ravikumar");
		b.add("Pooja");
		b.add("Namrata");
		
		System.out.println(b);
		b.add("Komal");
		System.out.println("TreeSet B = " + b);
		
	}

}
