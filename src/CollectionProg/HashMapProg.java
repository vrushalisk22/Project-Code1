package CollectionProg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class HashMapProg {

	public static <E> void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(3,"Ferrari");
        hm.put(2,"Lamborgini");
		hm.put(4,"Mastang");
		hm.put(1,"Porsh");
		
		System.out.println(hm);
		hm.put(null,"Meta");
		System.out.println(hm);
		
		hm.put(null, "Twitter");
		System.out.println(hm);
		
		hm.put(5,"ABC");
		hm.put(6,"ABC");
		hm.put(10.5,'z');
		System.out.println(hm);
	    
		System.out.println("================================");
	    System.out.println(hm.keySet());
	    System.out.println(hm.values());
	    System.out.println(hm.entrySet());
	    
	    System.out.println("=================================");
	    
	    Set a = hm.entrySet();
	    Iterator itr = a.iterator();
	    
	    System.out.println("=================================");
	    for(;itr.hasNext();)
	    {
	    	System.out.println(itr.next());
	    }
	    
	    List<?> l = (List) hm.entrySet();
	    ListIterator<?> ls = l.listIterator();
	    		
	    System.out.println("=====================================");
	    while(ls.hasPrevious())
	    {
	    	System.out.println(ls.next());
	    }
	}

}
