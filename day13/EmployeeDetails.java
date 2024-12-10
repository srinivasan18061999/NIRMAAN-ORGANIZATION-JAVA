package day13;

import java.util.Scanner;

import day13.Employee;

public class EmployeeDetails 
{
	public static void main(String[] args)
	 {	
		 
		 
		Scanner sc=new Scanner(System.in);
		 
		Employee emp=new Employee();
		
	   boolean isTrue=true;
	   
	   
	   while(isTrue) 
	   {
		   System.out.println("1 for add");
		   System.out.println("2 for update");
		   System.out.println("3 for view");
		   System.out.println("0 for exit");
		   int value=sc.nextInt();
		   sc.nextLine();
		   switch(value)
		{

		case 0:
		{
			System.out.println("Thank u");
			  isTrue=false;
			  break;
			}
			  
		
		
		case 1:
		{
		 System.out.println("Enter your employee name");
		 String EmpName=sc.nextLine();
		 emp.setEmpName(EmpName);
		
		 System.out.println("Enter your employee Department");
		 String Department=sc.nextLine();
		 emp.setDepartment(Department);
		 
		 System.out.println("Enter your employee id ");
		 int Id=sc.nextInt();
		 emp.setId(Id);
		 
		 System.out.println("Enter your employee phone number");
		 long PhoneNo=sc.nextLong();
		 emp.setPhoneNo(PhoneNo);
		 break;
		}
		
		case 2:
		{
			 System.out.println("Enter your employee name");
			 String EmpName=sc.nextLine();
			 emp.setEmpName(EmpName);
			
			 System.out.println("Enter your employee Department");
			 String Department=sc.nextLine();
			 emp.setDepartment(Department);
			 
			 System.out.println("Enter your employee id ");
			 int Id=sc.nextInt();
			 emp.setId(Id);
			 
			 System.out.println("Enter your employee phone number");
			 long PhoneNo=sc.nextInt();
			 emp.setPhoneNo(PhoneNo);
			 break;
		 
		}
		
		case 3:
		{
			System.out.println(emp.toString());
			break;
		}
		default:
		{
			System.out.println("Enter correct choice: ");
			continue;
			
		 }
		
       }
	  
	  }
		   
	 }
}
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

