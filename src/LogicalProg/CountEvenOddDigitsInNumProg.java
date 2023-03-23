package LogicalProg;

public class CountEvenOddDigitsInNumProg {

	public static void main(String[] args) {
		int countEven=0,countOdd=0,num=12347655,rem, num1=num;
		
		while(num>0)
		{
			rem = num%10;
			if(rem%2==0)
				countEven++;
			else
				countOdd++;
				num=num/10;			
		}
		System.out.println("Even Digits in " + num1 + " = " + countEven);
		System.out.println("Odd Digits " + num1 + " = " + countOdd);
		
	}

}
