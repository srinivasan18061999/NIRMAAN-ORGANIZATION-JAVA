package day2;
import java.util.Scanner;
public class SimpleCalculator 
{
public static void main(String[]args) 
 {
Scanner sc = new Scanner(System.in);



System.out.println("Enetr your choice");
System.out.println("Enetr your 0 for add");
System.out.println("Enetr your 1 for sub");
System.out.println("Enetr your 2 for mul");
System.out.println("Enetr your 3 for div");
System.out.println("Enetr your 4 for mod");

int key = sc.nextInt();

System.out.println("enter the firstnum ");
int firstNum = sc.nextInt();
System.out.println("enter the secondnum ");
int secondNum = sc.nextInt();
 
 if (key==0)
	 
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
 }
 
 
 
 
 switch (key)
 {
 case 0:
 {	 
	 int total=firstNum + secondNum;
     System.out.println("add :"+total);
     break;
 }
 
 case 1:
 {	 
	 int total=firstNum - secondNum;
	 System.out.println("sub :"+total);
	 break;
 }
 
 case 2:
 {	
	 int total=firstNum * secondNum;
	 System.out.println("mul :"+total);
	 break;
 }
 case 3:
 {
	 int total=firstNum / secondNum;
	 System.out.println("div :"+total); 
	 break;
 } 
 
 case 4:
 {

	 int total=firstNum % secondNum;
	 System.out.println("mod :"+total);
	 break;
	}  
 default :
 {
	System.out.println("enter the correct value");	
 }
	}
 
 }


}
