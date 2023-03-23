package LogicalProg;

public class SwapTwoNumProg {

	public static void main(String[] args) {
		int a=11,b=22;
		System.out.println("a = " + a + " b = " + b );
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After exchanging a = " + a +  " b = " + b);
	}
}
