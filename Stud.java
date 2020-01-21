class Stud
{
int sid;
String sname,sbranch;
public void setStud(int i,String n,String b)
{
sid=i;
sname=n;
sbranch=b;
}
public void getStud()
{
System.out.println("sid="+sid+"sname"+sname+"sbranch"+sbranch);
}
public static void main(String args[])
{
Stud s1=new Stud();
s1.setStud(101,"abc","cse");
s1.getStud();
}
} 