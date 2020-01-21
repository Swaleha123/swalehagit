class Box1
{
	int boxLength;
	int boxWidth;
	int boxHeight;
//default constructor
	Box1()
	{
		int boxLength=0;
		int boxWidth=1;
		int boxHeight=0;
	}
//parameterised constructor
	Box1(int length,int width,int height)
	{
		this.boxLength=length;
		this.boxWidth=width;
		this.boxHeight=height;
	}
//setter method
	void setBox(int length,int width,int height)
	{
		this.boxLength=length;
		this.boxWidth=width;
		this.boxHeight=height;
	}
//getter method
	void getBox()
	{
		System.out.println("length= " +boxLength +"\nwidth= " + boxWidth + "\nheight= "+boxHeight);
	}
//calculate volume method
	int calculateVolume()
	{
		int Volume;
		Volume=boxLength*boxWidth*boxHeight;
		System.out.println("volume= " + Volume);
		return Volume;
	}
}

