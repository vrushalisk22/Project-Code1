package LogicalProg;

public class SumOfNosDigitProg {

	public static void main(String[] args) {
		int num=12345,rem,sum=0,num1=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			System.out.println("Iteration = " + num + " & "+ sum );
		}
		System.out.println("Sum of Nos Digit = "+num1 + " = " + sum);
	}

}
