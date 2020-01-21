class StaticMethod
{
	static int num;		//static variable
	int c;			//instance variable ornon-static variable
	static void setStatic(int a)	//static method
	{
		num=a;
		System.out.println(num);
	}
	void nonStatic()
	{
		System.out.println(num);
	}
	public static void main(String args[])
	{
		setStatic(10);
		StaticMethod s=new StaticMethod();
		s.nonStatic();
		
	}
}