class Employee2
{
int empId;
String empName;
int empSal;
//default constructor
public void Employee2()
{
empId=1;
empName="0";
empSal=1;
}
//parameterised constructor
public void Employee2(int id,String name,int sal)
{
empId=id;
empName=name;
empSal=sal;
}
void setEmp(int id,String name,int sal)
{
empId=id;
empName=name;
empSal=sal;
}
void getEmp()
{
System.out.println("id= "+ empId + "\nname= " + empName + "\nsal= " + empSal);
}
int calculateSal()
{
System.out.println("empsal= "+ (empSal+500));
return empSal;
/*return empSal+500;*/
}
}