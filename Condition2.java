package day3;

import java.util.Scanner;

public class Condition2 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr your mark");
		
		int mark = sc.nextInt();
		
		if(mark>=35) 
		{
			System.out.println("pass");
			
			
			if(mark>=90)
			{
				System.out.println("garde A");
					
			}
			else if(mark>=75)
			{
				System.out.println("grade B");
				
			}
			
			else if(mark>=50)
			{
				System.out.println("grade C");
			}
			
			else if(mark>=40)
			{
				System.out.println("grade D");
			}
			
		}
			else 
			{
			System.out.println("fail");
		}
	}

	}

