package day13;

public class Employee  // this full page template
{
	private String EmpName;     //varible
	private String Department;
	private int Id;
	private long PhoneNo;

	public Employee()  //empty constructor
	{
		
		
	}
	public Employee (String EmpName,String Department,int Id,long PhoneNo) ///methods
	{
		this.EmpName=EmpName;
		this.Department=Department;
		this.Id=Id;
		this.PhoneNo=PhoneNo;	
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", Department=" + Department + ", Id=" + Id + ", PhoneNo=" + PhoneNo
				+ "]";
	}
}
