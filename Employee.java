class Employee
{
	int empId;
	String empName;
	int empSal;
	//default constructor
	public Employee()
	{
		empId=1;
		empName="0";
		empSal=1;
	}
	//parameterised constructor
	public Employee(int empId,String empName,int empSal)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	void setEmp(int empId,String empName,int empSal)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	void getEmp()
	{
		System.out.println("id= "+ empId + "\nname= " + empName + "\nsal= " + empSal);
	}
	int calculateSal()
	{
		System.out.println("empsal= "+ (empSal+500));
		return empSal;
		//return empSal+500;
	}
}