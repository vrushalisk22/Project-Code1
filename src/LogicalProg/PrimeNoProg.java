package LogicalProg;

public class PrimeNoProg {

	public static void main(String[] args) {
		// 1 2 3 5 7 11 13 
		int num=13,count=0;
		if(num>0)
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
				
			}
			if(count==1)
			{
				System.out.println("Not Prime");
			}
			else
			{
				System.out.println("Prime");
			}
			
		}	
	}
}
