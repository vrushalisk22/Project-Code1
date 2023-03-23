package CollectionProg;

import java.util.LinkedList;

public class LinkedListProg {

	public static void main(String[] args) {
		
		LinkedList a = new LinkedList();
		LinkedList b = new LinkedList(a);
		
		System.out.println(a.size());
	      
		a.add('A');
		a.add("Harry");
		a.add("Ron");
		a.add(null);
		a.add('+');
		a.add(20.22);
		a.add(44);
		a.add(44);
		System.out.println("A = " + a);
		
		a.add('B');
		a.add(0,"Vrushali");//then start index 0
		a.addFirst("Ravi");//always first
		a.add("Raya");
		a.add('*');
		a.add(27.22);
		a.add("Aarush");
		a.add(33);
		System.out.println("After growing A = " + a);
		
		a.remove(3);
		a.removeFirstOccurrence("Vrushali");
		System.out.println("A = " + a);
		
	    a.removeFirst();
		System.out.println("A = " + a);
		
		a.removeLast();
		System.out.println("A = " + a);
		
		a.poll();//remove 1st element
		a.pollFirst();
		a.pollLast();
		System.out.println("A = " + a);
		
		
		
		
	}
}
