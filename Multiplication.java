class Multiplication
{
public static void main(String args[])
{
int a[][]={{1,2,3},{4,5,6},{1,5,6}};
int b[][]={{4,5,6},{1,2,3},{2,3,4}};

/*int a[][]={{1,1,1},{2,2,2},{3,3,3}};
int b[][]={{1,1,1},{2,2,2},{3,3,3}};*/

int c[][]=new int[3][3];
int i,j,k;
/*for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+"");
}
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(b[i][j]+"");
}
System.out.println();
}*/
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=0;
for(k=0;k<3;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j]+"");
}
System.out.println();
}
}
}
