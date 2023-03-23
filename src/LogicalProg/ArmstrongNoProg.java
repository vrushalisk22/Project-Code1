package LogicalProg;

public class ArmstrongNoProg {

	public static void main(String[] args) {
		//371 =(3*3*3)+(7*7*7)+(1*1*1)
		//9474 = (9*9*9*9)+(4*4*4*4)+(7*7*7*7)+(4*4*4*4)
		int num=371,rem=1,sum=0;
		int num1=num;
		while(num>0)
		{
			rem = num%10;
			sum = sum+rem*rem*rem;
			num = num/10;
		}
		if(num1==sum)
		{
			System.out.println(num1 + " Armstrong no");
		}
		else
		{
			System.out.println("Not Armstrong no");
		}
	}
}
