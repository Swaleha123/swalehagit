import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
int n,sum=0;
float avg;
Scanner s=new Scanner(System.in);
System.out.println("enter no. of elements");
n=s.nextInt();
int arr[]=new int[n];
System.out.println("enter all the elements");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
sum=sum+arr[i];
}
System.out.println("sum=" +sum);
avg=(float)sum/n;
System.out.println("avg=" +avg);
}
}