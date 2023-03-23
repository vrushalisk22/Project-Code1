package CollectionProg;

import java.util.Vector;

public class VectorProg {

	public static void main(String[] args) {
     
		Vector v = new Vector();
		Vector v1 = new Vector(100);
        System.out.println("Capacity of V = " + v.capacity());	//default capacity 10	

        	
        for(int i=1;i<=10;i++)
        	v.add(i);
        
        System.out.println(v);
        v.add(100);
        System.out.println("New Capacity of V = " + v.capacity());// capacity is 10=>20 double
        
        for(int i=1;i<=100;i++)
        	v1.add(i);
        
        System.out.println("Capacity of V1 = " + v1.capacity());//Capacity 100
        System.out.println(v1);
        v1.add(101);
        System.out.println("New Capacity of v1 = " + v1.capacity());//capacity 100=>200 double
	
	}

}
