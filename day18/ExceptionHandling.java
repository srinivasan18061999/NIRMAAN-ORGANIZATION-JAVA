package day18;
import java.util.Scanner;
public class ExceptionHandling
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int c=0;
		try
		{
		System.out.println("enter the first value");
			a=sc.nextInt();
		System.out.println("enter the second value");
		   b=sc.nextInt();
		   
		   c=a+b;
		System.out.println("total value ="+c);
	
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
	
}
	}
