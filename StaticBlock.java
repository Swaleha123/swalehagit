class StaticBlock
{
	static int a;
	static
	{
		a=10;
		System.out.println("Static block called= " +a);
	}
	static void setA(int a)
	{
		a=56;
		System.out.println("Static method is called= " +a);
	}
	public static void main(String args[])
	{
		System.out.println("Main method is calling");
		setA(10);
	}
}