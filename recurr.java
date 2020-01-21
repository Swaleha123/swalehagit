class Recurr
{
int fact(n)
{
if(n==0)
return 1;
else
return n*fact(n-1);
}
public static void main(String args[])
{
int num=5;
int fact=fact(n);
System.out.println("Factorial="+fact);
}
}
