package LogicalProg;

public class FiboSeriesProg {

	public static void main(String[] args) {
	 // 0 1 2 3 5 8
		int sum=0,num1=0,num2=1;
		System.out.println(num1+ " "+num2);
		for(int i=0;i<15;i++)
		{
		sum = num1 + num2;
		System.out.println(+sum);
		num1 = num2;
		num2 = sum;
		}
	}

}
