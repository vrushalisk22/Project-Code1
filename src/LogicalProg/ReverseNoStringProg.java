package LogicalProg;

public class ReverseNoStringProg {
	public static void main(String[] args) {
		
	//Generic formula for Reverse Number String using string methods
	int num=12345,num1=num;
	String strNum=Integer.toString(num);
	String revNum="";
	for(int i=strNum.length()-1;i>=0;i--)
	{   
		char ch = strNum.charAt(i);
		revNum = revNum + ch;
	}
	System.out.println("Reverse of no " + num1 + " = " + revNum);
  }
}
