class BoxMain
{
public static void main(String args[])
{
	Box1 b=new Box1();	//creating object for box class
	b.setBox(12,3,5);	//assigning values in set box method
	b.getBox();		//accessing values from grt box method
	b.calculateVolume();	//calculating volume
}
}