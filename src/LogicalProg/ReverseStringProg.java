package LogicalProg;

public class ReverseStringProg {

	public static void main(String[] args) {
		// 
		String str1="Vrushali";
		String str2="";
		System.out.println("Original String = " + str1);
		for(int i=str1.length()-1;i>=0;i--)
		{
			char ch = str1.charAt(i);
			str2 = str2 + ch;
		}
		System.out.println("Reverse String = " + str2);		
	}
}
