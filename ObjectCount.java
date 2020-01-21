class B
{
	static int count=0;
	B()
	{
		count++;
	}
	public static void main(String args[])
	{
		B a=new B();
		B a1=new B();
		System.out.println(count);
		//System.out.println(a1.count);
	}
}