

package assessment2;

import java.util.Scanner;

public class IndianBank 
{
public static void main(String[] args)
{
	BankAccount bank=new BankAccount();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the pin:");
	int pin=sc.nextInt();
	Boolean istrue=true;
	
	if(bank.getPin()==pin)
	{
		while(istrue)
		{
			System.out.println("Enter your choice:");
			System.out.println("1 for withdraw:");
			System.out.println("2 for deposit:");
			System.out.println("3 for showholder:");
			System.out.println("0 for exit");
			 int choice=sc.nextInt();
			 if(choice==1)
			 {
				 System.out.println("Enter the withdraw amount:");
				 float amt=sc.nextInt();
				 bank.setAccountBalance(bank.getAccountBalance()-amt);
			 }
			 
			 else if(choice==2)
			 {
				 System.out.println("Enter the deposit amount:");
				 float amt=sc.nextInt();
				 
				 float num=bank.getAccountBalance()+amt;
				 bank.setAccountBalance(num);
			 }
			 else if(choice==3)
			 {
				 System.out.println("your current balance is:");
				 System.out.println(bank);
			 }
			 else if(choice==0)
			 {
				 istrue=false;
				 System.out.println("Tanks for using Indian Bank");
			 }
			  
		}
			
	}
	

 }
	

}
