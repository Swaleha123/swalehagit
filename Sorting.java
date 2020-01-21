class Sorting
{
public static void main(String args[])
{
int a[]={1,23,5,90,2};
int i,j,temp;
for(i=0;i<a.length;i++)
{
for(j=1;j<a.length-i;j++)
{
if(a[j-1]>a[j])
{
temp=a[j-1];
a[j-1]=a[j];
a[j]=temp;
}
}
}
System.out.println("ascending order=");
for(i=0;i<a.length;i++)
System.out.println(a[i]);
System.out.println("descending order=");
for(i=a.length-1;i>=0;i--)
System.out.println(a[i]);
}
}