package CollectionProg;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CursorProg {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0;i<20;i++)
			v.add(i);
		System.out.println(v);
		
		/*System.out.println("--------------------------------------------");
		for(int i=0;i<20;i++)
			v.get(i);
		System.out.println(v);
		
		System.out.println("-----------------------------------------------");
		for(Object value:v)
			System.out.print(" " + value);
		
		System.out.println();
		
		System.out.println("Enumaration Cursor Output ");
		int i=0;
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			i++;
			
			if(i==10)
			break;
			
		}
		
		
		System.out.println("Iterator Cursor Output");
		java.util.Iterator i = v.iterator();
		while(i.hasNext())
		{
			int value = (int) i.next();
			if(value%2==0)
				System.out.print(" " + value);
			else 
		      i.remove();
		}*/
		
		System.out.println();
		System.out.println("Listiterator Cursor Output");
		ListIterator x = v.listIterator();
		while(x.hasNext())
		{
			int value = (int) x.next();
			if(value==3)
				x.remove();
			else if(value==2)
				x.add(2222);
			else if(value==5)
				x.set(5555);
            System.out.println(x.next());			
		}
		
		System.out.println(v);
		
		System.out.println("--------------------");
		ListIterator y = v.listIterator();
		while(y.hasNext())
		{
		System.out.print(" " + y.next());						//0
		}
		// System.out.println(y.previous());		//0
		// System.out.println(y.previous());
		System.out.println();
		System.out.println("--------------------");
		while(y.hasPrevious())
		System.out.print(" " + y.previous());
	}

}

































