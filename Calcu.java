import java.util.Scanner;
class Calcu
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("enter values for a and b");
double a=s.nextDouble();
double b=s.nextDouble();
System.out.print("enter an op (+,-,*,/):");
char op=s.next().charAt(0);
double result;
switch(op)
{
case '+':result= a+b;
       break;
case '-':result= a-b;
       break;
case '*':result= a*b;
       break;
case '/':result= a/b;
       break;
default:System.out.println("wrong choice");
       break;
}
System.out.println("result=" + result);
}
}