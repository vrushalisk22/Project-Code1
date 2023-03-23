package LogicalProg;

import java.util.Scanner;

public class SortThreeNumProg {

	public static void main(String[] args) {
		int a = 54,b = 21,c = 11,num,temp;
		//System.out.println("Enter the three nos = ");
		//Scanner s = new Scanner(System.in);
		//num = s.nextInt();
		if(a>b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("First Iteration = " + a + " " + b + " " + c);
		if(b>c) 
		{
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println("Second Iteration = " + a + " " + b + " " + c);
		if(a>b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("Third Iteration = " + a + " " + b + " " + c);
	}

}
