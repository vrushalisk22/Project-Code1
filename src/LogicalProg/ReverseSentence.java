package LogicalProg;

public class ReverseSentence {

	public static void main(String[] args) {
		String sent = "My name is Vrushali";
		System.out.println("Original Sentence = " + sent);
		
		String splitSent[]=sent.split(" ");
		String revSent=(String) "";
		System.out.print("Reverse Sentence = ");
		for(int i=splitSent.length-1;i>=0;i--)
			System.out.print(" " + splitSent[i]);
		
		System.out.println();
		
		for(int i=sent.length()-1;i>=0;i--)
		{
		char ch=sent.charAt(i);
	    revSent = revSent + ch;
		}
		System.out.println("Reverse words with sentence = " + revSent);
	}
}
