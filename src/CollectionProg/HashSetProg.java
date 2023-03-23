package CollectionProg;

import java.util.HashSet;

public class HashSetProg {

	public static void main(String[] args) {
       
		HashSet a = new HashSet();
		HashSet b = new HashSet(1000);
		HashSet c = new HashSet(100,90);
		HashSet d = new HashSet(a);
		
		a.add(10);
		a.add(12);
		a.add(20);
		a.add(9);
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(33);
		
		System.out.println(a);
		
		a.add("Harry");
		a.add("Json");
        a.add("Army");
        System.out.println(a);

	    a.add(20);
	    System.out.println(a);
	    
	    a.add(null);
	    System.out.println(a);
	    
	    a.add(null);
	    System.out.println(a);
	    
	    
	}

}
