package CollectionProg;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProg {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList(1000);
		ArrayList al3 = new ArrayList(al2);
		
		System.out.println(" Is AL1 is Empty = " + al1.isEmpty());
		System.out.println("Size Of AL1 = " + al1.size());
		
		al1.add(11);
		al1.add("Harry");
		al1.add("Ron");
		al1.add(12.222);
		al1.add('A');
		al1.add(null);
		al1.add(11);
		al1.add(null);
		
		System.out.println("Is AL1 is Empty = " + al1.isEmpty());
		System.out.println("Size Of al1 = " + al1.size());
		System.out.println("Elements Of al1 = " + al1);
		
		for(int i=1;i<=10;i++) {
			al1.add(i);
		}
		System.out.println("Elements Of al1 = " + al1);
		
		al1.add(2,"Raya");
		//al1.set(index, element);
		
		System.out.println("Elements Of al1 = " + al1);
		
		System.out.println("Is al1 contains A = " + al1.contains('A'));
		System.out.println("Value of Index 2 = " + al1.get(2));
		System.out.println("Last Index of 11 = " + al1.lastIndexOf(11));
		System.out.println("First Index of 11 = " + al1.indexOf(11));
		
		//al1.remove('A');
		al1.remove(6);
		al1.set(2, "Aarush");
		System.out.println("Elements of al1 = " + al1);
		
		for(int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		System.out.println("--------------------------------------");
		
		for(int i=al1.size()-1;i>=0;i--)
		{
			System.out.println(al1.get(i));
		}
		System.out.println("----------------------------------------");
		System.out.println("Elements of al1 = " +al1);
		Collections.reverse(al1);
	    
		al2.add(100);
		al2.add(10);
		al2.add(20);
		al2.add(22);
		al2.add(32);
		al2.add(5);
		al2.add(8);
		System.out.println("Elements of al2 = " + al2);
	    Collections.sort(al2);//aplicable for only one type of data 
		
		/*ArrayList al = new ArrayList();
		al.add(1,"Vrushali");
		al.set(1,"Rohit");

	System.out.println("Elements of al = " + al);*/

	}
	

}
