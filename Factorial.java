class Factorial
{
int i,j,sum=1;
void Factorial(int fact)
{
i=fact;
for(j=i;j>=1;j--)
sum=sum*j;
System.out.println(sum);
}
public static void main(String args[])
{
Factorial f=new Factorial();
f.Factorial(5);
}
}