package LogicalProg;

public class DigitCountInNoProg {

	public static void main(String[] args) {
		
		int num=12121,count=0,num1=num;
		while(num>0)
		{
			//num=num%10;
			count++;
			num=num/10;
		}
		System.out.println("This no " + num1 + " having " + count + " Digits");

	}

}
