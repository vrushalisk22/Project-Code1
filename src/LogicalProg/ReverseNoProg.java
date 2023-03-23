package LogicalProg;

public class ReverseNoProg {

	public static void main(String[] args) {
		int num=12345,rem,sum=0,multiFact=10000,num1=num;
		while(num>0)
		{
			/*rem=num%10;			
			sum=sum+(rem*multiFact);
			num=num/10;
			multiFact=multiFact/10;	*/	
			
			//Generic Formula for reverse number 
			rem=num%10;
			sum=(sum+rem)*10;
			num=num/10;
			
		}
		sum=sum/10;
		System.out.println("Reverse of no " + num1 + " = " + sum);
		//System.out.println("Reverse of no " + num1 + " = " + sum);
	}
}
