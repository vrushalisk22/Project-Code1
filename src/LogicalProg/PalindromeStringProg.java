package LogicalProg;

public class PalindromeStringProg {

	public static void main(String[] args) {
		String str1="dad";
		String str2="";
		System.out.println("Original String = " + str1);
		for(int i=str1.length()-1;i>=0;i--)
		{
			char ch = str1.charAt(i);
			str2 = str2 + ch;
		}
		System.out.println("After Reverse Operation String = " + str2);
		if(str1.equals(str2))
		{
			System.out.println(str2 + " Is Palindrome Sring");
		}
		else
		{
			System.out.println("It is Not Palindrome Sring");	
		}
	}

}
