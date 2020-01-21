class Recursion
{
int fact(n)
{
int res;
if(n==0)
{
return 1;
}
res=n*fact(n-1);
return res;
}
public static void main(String args[])
{
int n=5;
int fact=fact(n);
System.out.println("Factorial="+fact);
}
}
