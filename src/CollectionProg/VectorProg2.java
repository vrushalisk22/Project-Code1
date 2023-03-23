package CollectionProg;

import java.util.Vector;

public class VectorProg2 {

	public static void main(String[] args) {
		Vector v1 = new Vector();//capacity 10 default
		Vector v2 = new Vector(500);
		Vector v3 = new Vector(20,5);
		Vector v4 = new Vector(v1);
		
		System.out.println("V1 = " + v1.capacity());
		System.out.println("V2 = " + v2.capacity());		
		System.out.println("V3 = " + v3.capacity());		
		System.out.println("V4 = " + v4.capacity());		
		System.out.println("V3 = " + v3);//null
		
		for(int i=1;i<=20;i++)
			v3.add(i);
		
		System.out.println("V3 Elements = " + v3);		
		v3.add(1,"Pooja");
		System.out.println("V3 Elements = " + v3);
		System.out.println("V3 capacity after growing = " + v3.capacity());
		
		v1.add("Vrushali");
		v1.add("Ravi");
		v1.add("Aarush");
		v1.add("Raya");
		v1.add("Ashwini");
		v1.add(29.66);
		v1.add('B');
		v1.add(44);
		System.out.println("Elements of V1 = " + v1);
		v1.remove(5);
		System.out.println("After removing at index 5 = " + v1);
		v1.removeElement('B');
		System.out.println("After removing element B = " + v1);
		
		v1.removeAllElements();
		System.out.println("After removing all elements = " + v1);
		
		v1.add(0,22);
		System.out.println(v1);
		
		v1.add('A');
		v1.add("Harry");
		v1.add("Ron");
		v1.add("Jenny");
		v1.add(66);
		v1.add(20.11);
		System.out.println(v1);
		
		System.out.println("----------For Each Loop-------------- ");
		for(Object value:v1)
			System.out.print(" " + value);
	}

}
