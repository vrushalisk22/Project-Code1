package StarPatternProg;

public class Prog10 {

	public static void main(String[] args) {
//***
// **
//  *
// **	
//***						
				int star=3,space=0;
				for(int row=1;row<=5;row++)
				{
					for(int j=1;j<=space;j++)
					{
						System.out.print(" ");
					}
					for(int i=1;i<=star;i++)
					{
						System.out.print("*");
					}
					
					System.out.println();
					if(row<=2)
					{
						star--;
						space++;
					}
					else
					{
						star++;
						space--;	
					}			
				}
	}	
}