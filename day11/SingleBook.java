package day11;

import java.util.Scanner;

public class SingleBook
{
 public static void main(String[] args)
 {	
	 
	 
	Scanner sc=new Scanner(System.in);
	 
	Book book1=new Book();
	
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
		  isTrue=false;
		  break;
		}
		  
	
	
	case 1:
	{
		System.out.println("Enter your title");
	 String title=sc.nextLine();
	 book1.setTitle(title);
	
	 System.out.println("Enter your author");
	 String author=sc.nextLine();
	 book1.setAuthor(author);
	 
	 System.out.println("Enter your price");
	 double price=sc.nextDouble();
	 book1.setPrice(price);
	 
	 System.out.println("Enter your copies");
	 int copies=sc.nextInt();
	 book1.setNumberofcopies(copies);
	 break;
	}
	
	case 2:{
		System.out.println("Enter your title");
	 String title=sc.nextLine();
	 book1.setTitle(title);
	
	 System.out.println("Enter your author");
	 String author=sc.nextLine();
	 book1.setAuthor(author);
	 
	 System.out.println("Enter your price");
	 double price=sc.nextDouble();
	 book1.setPrice(price);
	 
	 System.out.println("Enter your copies");
	 int copies=sc.nextInt();
	 book1.setNumberofcopies(copies);
	 break;
	 
	}
	
	case 3:{
		System.out.println(book1.toString());
		break;
	}
	default:{
		System.out.println("Enter correct choice: ");
		continue;
		
	}
	 
	
  
  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   }
   }
   }
	
	
	
}
