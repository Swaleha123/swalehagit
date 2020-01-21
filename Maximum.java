class Maximum
{
public static void main(String args[])
{
int arr[]={10,20,30,40};
int max=0,min=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
max=arr[i];
else
min=arr[i];
}
System.out.println("max=" +max);
System.out.println("min=" +min);
}
}