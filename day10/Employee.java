package day10;

public class Employee 

{

	private String employeeName;//variable
	private int employeeId;
	private int employeeAge;
	private String employeeDepartment;
	
	
	public Employee()//empty constructor
	{
		
	}
	
	public Employee (String employeeName, int employeeId, int employeeAge, String employeeDepartment) //methods
	{
		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.employeeAge=employeeAge;
		this.employeeDepartment=employeeDepartment;	
		
	}
	
	
	
	
	public String getEmployeeName()     //getter method
	{
		return employeeName;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	public int getEmployeeAge()
	{
		return employeeAge;
	}
	
	public String getEmployeeDepartment()
	{
		return employeeDepartment;
	}
	
	
	
	
	
	public void setEmployeeName(String employeeName)  ///setter method
	{
	this.employeeName=employeeName;
	
	}
	public void setEmployeeId(int employeeId)  
	{
	this.employeeId=employeeId;
	
	}
	public void setEmployeeAge(int employeeAge)  
	{
	this.employeeAge=employeeAge;
	
	}
	public void setEmployeeDepartment(String employeeDepartment)  
	{
	this.employeeDepartment=employeeDepartment;
	
	}
	
		public String toString()
		{
			return "your employeeName:" +employeeName+ "your employeeId:" + employeeId+"your employeeAge:"+employeeAge+"your employeeDepartment:"+employeeDepartment;
		}
		
		
		}

