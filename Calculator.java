package day4;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[]args) 
	 {
	Scanner sc = new Scanner(System.in);

boolean isTrue=true;







while(isTrue)
{

	System.out.println("Enter your choice");
	System.out.println("Enter your 0 for add");
	System.out.println("Enter your 1 for sub");
	System.out.println("Enter your 2 for mul");
	System.out.println("Enter your 3 for div");
	System.out.println("Enter your 4 for mod");
	System.out.println("Enter 5 for exit");

	int key = sc.nextInt();

	
	 
	 /*if (key==0)
		 
	 {
	      int total=firstNum + secondNum;
	      System.out.println("add :"+total);
	 }
	 else if (key==1)
	 {
		 int total=firstNum - secondNum;
		 System.out.println("sub :"+total); 
	 }
	 
	 else if (key==2)
	 {
		 int total=firstNum * secondNum;
		 System.out.println("mul :"+total); 
	 }
	 
	 else if (key==3)
	 {
		 int total=firstNum / secondNum;
		 System.out.println("div :"+total); 
	 }
	 else if (key==4)
	 {
		 int total=firstNum % secondNum;
		 System.out.println("mod :"+total); 
	 }*/
	 
	 
	 
	 
	 switch (key)
	 {
	 case 0:
	 {	 System.out.println("enter the firstnum ");
		int firstNum = sc.nextInt();
		System.out.println("enter the secondnum ");
		int secondNum = sc.nextInt();
		 int total=firstNum + secondNum;
	     System.out.println("add :"+total);
	     break;
	 }
	 
	 case 1:
	 {	 
		 System.out.println("enter the firstnum ");
			int firstNum = sc.nextInt();
			System.out.println("enter the secondnum ");
			int secondNum = sc.nextInt();
		 int total=firstNum - secondNum;
		 System.out.println("sub :"+total);
		 break;
	 }
	 
	 case 2:
	 {	
		 System.out.println("enter the firstnum ");
			int firstNum = sc.nextInt();
			System.out.println("enter the secondnum ");
			int secondNum = sc.nextInt();
		 int total=firstNum * secondNum;
		 System.out.println("mul :"+total);
		 break;
	 }
	 case 3:
	 {
		 System.out.println("enter the firstnum ");
			int firstNum = sc.nextInt();
			System.out.println("enter the secondnum ");
			int secondNum = sc.nextInt();
		 int total=firstNum / secondNum;
		 System.out.println("div :"+total); 
		 break;
	 } 
	 
	 case 4:
	 {
		 System.out.println("enter the firstnum ");
			int firstNum = sc.nextInt();
			System.out.println("enter the secondnum ");
			int secondNum = sc.nextInt();
		 int total=firstNum % secondNum;
		 System.out.println("mod :"+total);
		 break;
		}  
	 case 5:
	 {

		 isTrue=false; 
		 System.out.println("Thank u for using calculator");
		 break;
		}  
	 default :
	 {
		System.out.println("enter the correct value");	
		
	 }
		}
	 
}
	 }
}


	 



