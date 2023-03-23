package CollectionProg;

public class ReturnMethod {
	public static void m1()
	{
		System.out.println("I Am in m1");
	}
	public static void m2()
	{
		System.out.println("I Am in m2");
	}
	public static int m3()
	{
		return 28;
	}
	public static int m4(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		//ReturnMethod rm = new ReturnMethod();
		m1();
		m2();
		System.out.println("m3 = " + m3());
		System.out.println("m4 = " + m4(3,4));
		
		int mf=100;
		int out=m3();
		int foutput=mf*out;
		System.out.println("m3() = " + out);
		System.out.println("mf * out = " + foutput);
		System.out.println("m3 returns = " + m3());
		}

}
